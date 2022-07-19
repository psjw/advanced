package hello.advanced.trace.callback;

/**
 * packageName : hello.advanced.trace.callback
 * fileName : TraceCallback
 * author : psjw
 * date : 2022-07-19
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-19        psjw         최초 생성
 */
public interface TraceCallback<T> {
    T call();
}
