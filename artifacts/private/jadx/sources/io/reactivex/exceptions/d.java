package io.reactivex.exceptions;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f298676a = -6298857009889503852L;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(String str, @cj.f Throwable th2) {
        if (th2 == null) {
            th2 = new NullPointerException();
        }
        super(str, th2);
    }

    public d(@cj.f Throwable th2) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th2, th2);
    }
}
