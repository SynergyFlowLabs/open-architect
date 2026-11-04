package uk;

/* JADX INFO: loaded from: classes14.dex */
public final class a<L, R> extends e<L, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f381263d = q(null, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f381264e = 4954918890077093841L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f381265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R f381266c;

    public a(L l10, R r10) {
        this.f381265b = l10;
        this.f381266c = r10;
    }

    public static <L, R> a<L, R> p() {
        return f381263d;
    }

    public static <L, R> a<L, R> q(L l10, R r10) {
        return new a<>(l10, r10);
    }

    @Override // uk.e
    public L k() {
        return this.f381265b;
    }

    @Override // uk.e
    public R l() {
        return this.f381266c;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r10) {
        throw new UnsupportedOperationException();
    }
}
