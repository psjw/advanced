package hello.advanced.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.advanced.trace.stategy.code.strategy
 * fileName : StrategyLogic1
 * author : psjw
 * date : 2022-07-17
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-17        psjw         최초 생성
 */
@Slf4j
public class StrategyLogic2 implements Strategy{

    @Override
    public void call() {
        log.info("비즈니스 로직2 실행");
    }
}
