package hello.advanced.app;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName : hello.advanced.app
 * fileName : OrderControllerV0
 * author : psjw
 */
@RestController
@RequiredArgsConstructor
public class OrderControllerV0 {
    private final OrderServiceV0 orderServiceV0;

    @GetMapping("/v0/request")
    public String request(String itemId){
        orderServiceV0.orderItem(itemId);
        return "ok";
    }
}
