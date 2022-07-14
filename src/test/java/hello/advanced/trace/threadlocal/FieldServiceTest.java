package hello.advanced.trace.threadlocal;

import hello.advanced.trace.threadlocal.code.FieldService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * packageName : hello.advanced.trace.threadlocal
 * fileName : FieldServiceTest
 * author : psjw
 * date : 2022-07-14
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-14        psjw         최초 생성
 */
@Slf4j
public class FieldServiceTest {

    private FieldService fieldService = new FieldService();

    @Test
    void field(){
        log.info("main start");
        Runnable userA = () -> {
            fieldService.logic("userA");
        };

        Runnable userB = () -> {
            fieldService.logic("userB");
        };

        Thread threadA = new Thread(userA);
        threadA.setName("thread-A");
        Thread threadB = new Thread(userB);
        threadB.setName("thread-B");

        threadA.start();
//        sleep(2000); //동시성 문제 발생 X
        sleep(100); //동시성 문제 발생 O 
        //동시성 문제 -> 지역변수에서는 발생하지 않음(쓰레드마다 별도 생성) -> 같은 인스턴스 필드(싱글톤객체), static 필드에 접근시 발생 -> 값을 변경하기 때문에 발생
        threadB.start();
        //Main Thread가 종료 되어 조회 1번 안나옴
        //CountDownLatch로 가능

        sleep(3000); //메인 스레드 종료  대기
        log.info("main exit");
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
