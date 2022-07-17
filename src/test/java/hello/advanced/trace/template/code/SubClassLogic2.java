package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName : hello.advanced.trace.template.code
 * fileName : SubClassLogic1
 * author : psjw
 * date : 2022-07-15
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-15        psjw         최초 생성
 */
@Slf4j
public class SubClassLogic2 extends AbstractTemplate{
    @Override
    protected void call() {
        log.info("비즈니스 로직2 실행");
    }
}
