package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class a4<U, T extends U> extends kotlinx.coroutines.internal.v0<T> implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    public final long f313524e;

    public a4(long j10, @NotNull kotlin.coroutines.d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.f313524e = j10;
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.w2
    @NotNull
    public String B1() {
        return super.B1() + "(timeMillis=" + this.f313524e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m0(b4.a(this.f313524e, d1.d(getContext()), this));
    }
}
