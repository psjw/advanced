package hello.advanced.trace.strategy.template;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.advanced.trace.strategy.template
 * fileName : TimeLogTemplate
 * author : psjw
 * date : 2022-07-19
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-19        psjw         최초 생성
 */
@Slf4j
public class TimeLogTemplate {
    public void execute(Callback callback){
        long startTime = System.currentTimeMillis();
        //비즈니스 로직 실행
        callback.call(); //위임
        //비즈니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }
}
