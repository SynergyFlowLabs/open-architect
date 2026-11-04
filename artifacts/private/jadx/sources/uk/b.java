package uk;

/* JADX INFO: loaded from: classes14.dex */
public final class b<L, M, R> extends f<L, M, R> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f381267e = r(null, null, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f381268f = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f381269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f381270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R f381271d;

    public b(L l10, M m10, R r10) {
        this.f381269b = l10;
        this.f381270c = m10;
        this.f381271d = r10;
    }

    public static <L, M, R> b<L, M, R> q() {
        return f381267e;
    }

    public static <L, M, R> b<L, M, R> r(L l10, M m10, R r10) {
        return new b<>(l10, m10, r10);
    }

    @Override // uk.f
    public L k() {
        return this.f381269b;
    }

    @Override // uk.f
    public M l() {
        return this.f381270c;
    }

    @Override // uk.f
    public R n() {
        return this.f381271d;
    }
}
