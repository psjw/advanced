package hello.advanced.trace.strategy;

import hello.advanced.trace.strategy.template.Callback;
import hello.advanced.trace.strategy.template.TimeLogTemplate;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * packageName : hello.advanced.trace.strategy
 * fileName : TemplateCallbackTest
 * author : psjw
 * date : 2022-07-19
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-19        psjw         최초 생성
 */
@Slf4j
public class TemplateCallbackTest {
    /**
     * 템플릿 콜백 패턴 - 익명 내부 클래스
     */
    @Test
    void callBackV1(){
        TimeLogTemplate template = new TimeLogTemplate();
        template.execute(new Callback() {
            @Override
            public void call() {
                log.info("비즈니스 로직1 실행");
            }
        });

        template.execute(new Callback() {
            @Override
            public void call() {
                log.info("비즈니스 로직2 실행");
            }
        });
        
    }

    /**
     * 템플릿 콜백 패턴 - 람다
     */
    @Test
    void callBackV2(){
        TimeLogTemplate template = new TimeLogTemplate();
        template.execute(() -> log.info("비즈니스 로직1 실행"));
        template.execute(() -> log.info("비즈니스 로직2 실행"));
    }
}
