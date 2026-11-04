package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends AtomicBoolean implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f303440a = -8127758972444290902L;

    public boolean a() {
        return get();
    }

    @Override // org.reactivestreams.w
    public void cancel() {
        lazySet(true);
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        j.p(j10);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
