package hello.advanced.app.V5;

import hello.advanced.trace.callback.TraceTemplate;
import hello.advanced.trace.logtrace.LogTrace;
import org.springframework.stereotype.Repository;

/**
 * packageName : hello.advanced.app
 * fileName : OrderRepository
 * author : psjw
 */

@Repository
public class OrderRepositoryV5 {
    private final TraceTemplate traceTemplate;

    public OrderRepositoryV5(LogTrace logTrace) {
        this.traceTemplate = new TraceTemplate(logTrace);
    }

    public void save(String itemId){
        traceTemplate.execute("OrderRepository.save()", () -> {
            if(itemId.equals("ex")){
                throw new IllegalStateException("예외 발생!");
            }
            sleep(1000);

            return null;
        });
        //저장로직

    }

    private void sleep(int millis) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
