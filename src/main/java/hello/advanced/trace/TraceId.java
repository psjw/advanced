package hello.advanced.trace;

import java.util.UUID;

/**
 * packageName : hello.advanced.trace
 * fileName : TraceId
 * author : psjw
 */
public class TraceId {
    private String id;
    private int level;


    public TraceId() {
        this.id = createId();
        this.level = 0;
    }

    private TraceId(String id, int level){
        this.id = id;
        this.level = level;
    }

    private String createId() {
        //2f48f241-9d64-4d16-bf56-70b9d4e0e79a //생성된 UUID
        //2f48f241 //앞 8자리만 사용
        return UUID.randomUUID().toString().substring(0, 8);
    }

    public TraceId createNextId(){
        return new TraceId(id, level + 1);
    }

    public TraceId createPreviousId(){
        return new TraceId(id, level - 1);
    }

    public boolean isFirstLevel(){
        return level == 0;
    }

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }
}
