package rx.exceptions;

/* JADX INFO: loaded from: classes14.dex */
public final class UnsubscribeFailedException extends RuntimeException {
    private static final long serialVersionUID = 4594672310593167598L;

    /* JADX WARN: Illegal instructions before constructor call */
    public UnsubscribeFailedException(Throwable th2) {
        if (th2 == null) {
            th2 = new NullPointerException();
        }
        super(th2);
    }

    public UnsubscribeFailedException(String str, Throwable th2) {
        super(str, th2 == null ? new NullPointerException() : th2);
    }
}
