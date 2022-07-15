package hello.advanced;

import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * packageName : hello.advanced
 * fileName : LogTraceConfig
 * author : psjw
 * date : 2022-07-14
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-14        psjw         최초 생성
 */
@Configuration
public class LogTraceConfig {
    @Bean
    public LogTrace logTrace(){
//        return new FieldLogTrace(); //Singleton 등록
        return new ThreadLocalLogTrace(); //Singleton 등록
    }
}
