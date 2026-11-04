package io.reactivex.exceptions;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f298678a = 1644750035281290266L;

    public f(Throwable th2) {
        super("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th2, th2);
    }
}
