package kotlinx.coroutines.scheduling;

/* JADX INFO: loaded from: classes12.dex */
public abstract class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public long f315484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public boolean f315485b;

    public i(long j10, boolean z10) {
        this.f315484a = j10;
        this.f315485b = z10;
    }

    public i() {
        this(0L, false);
    }
}
