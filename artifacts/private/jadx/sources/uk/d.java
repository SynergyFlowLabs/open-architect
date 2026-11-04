package uk;

/* JADX INFO: loaded from: classes14.dex */
public class d<L, M, R> extends f<L, M, R> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f381275e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L f381276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public M f381277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public R f381278d;

    public d() {
    }

    public static <L, M, R> d<L, M, R> q(L l10, M m10, R r10) {
        return new d<>(l10, m10, r10);
    }

    @Override // uk.f
    public L k() {
        return this.f381276b;
    }

    @Override // uk.f
    public M l() {
        return this.f381277c;
    }

    @Override // uk.f
    public R n() {
        return this.f381278d;
    }

    public void r(L l10) {
        this.f381276b = l10;
    }

    public void s(M m10) {
        this.f381277c = m10;
    }

    public void t(R r10) {
        this.f381278d = r10;
    }

    public d(L l10, M m10, R r10) {
        this.f381276b = l10;
        this.f381277c = m10;
        this.f381278d = r10;
    }
}
