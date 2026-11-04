package wd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes10.dex */
public final class a<T> extends Subscriber<T> implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Subscriber<T> f390569a;

    public a(@NotNull Subscriber<T> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        this.f390569a = subscriber;
    }

    @Override // wd.c
    public void b() throws b {
        if (this.f390569a.isUnsubscribed()) {
            throw new b();
        }
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.f390569a.onCompleted();
    }

    @Override // rx.Observer
    public void onError(@Nullable Throwable th2) {
        this.f390569a.onError(th2);
    }

    @Override // rx.Observer
    public void onNext(T t10) {
        this.f390569a.onNext(t10);
    }
}
