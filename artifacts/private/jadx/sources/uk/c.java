package uk;

/* JADX INFO: loaded from: classes14.dex */
public class c<L, R> extends e<L, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f381272d = 4954918890077093841L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L f381273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public R f381274c;

    public c() {
    }

    public static <L, R> c<L, R> p(L l10, R r10) {
        return new c<>(l10, r10);
    }

    @Override // uk.e
    public L k() {
        return this.f381273b;
    }

    @Override // uk.e
    public R l() {
        return this.f381274c;
    }

    public void q(L l10) {
        this.f381273b = l10;
    }

    public void r(R r10) {
        this.f381274c = r10;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r10) {
        R rL = l();
        r(r10);
        return rL;
    }

    public c(L l10, R r10) {
        this.f381273b = l10;
        this.f381274c = r10;
    }
}
