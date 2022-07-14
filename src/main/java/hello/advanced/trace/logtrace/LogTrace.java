package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceStatus;

/**
 * packageName : hello.advanced.trace.logtrace
 * fileName : HelloTraceV2
 * author : psjw
 * date : 2022-07-14
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-07-14        psjw         최초 생성
 */
public interface LogTrace {
    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);
}
