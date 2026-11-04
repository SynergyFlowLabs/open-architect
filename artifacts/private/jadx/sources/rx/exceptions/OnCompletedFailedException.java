package rx.exceptions;

/* JADX INFO: loaded from: classes14.dex */
public final class OnCompletedFailedException extends RuntimeException {
    private static final long serialVersionUID = 8622579378868820554L;

    public OnCompletedFailedException(Throwable th2) {
        super(th2 == null ? new NullPointerException() : th2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OnCompletedFailedException(String str, Throwable th2) {
        if (th2 == null) {
            th2 = new NullPointerException();
        }
        super(str, th2);
    }
}
