package androidx.media3.extractor.mp3;

import androidx.media3.extractor.k0;

/* JADX INFO: loaded from: classes3.dex */
final class a extends androidx.media3.extractor.h implements g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f67837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f67838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f67839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f67840n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f67841o;

    public a(long j10, long j11, k0.a aVar, boolean z10) {
        this(j10, j11, aVar.f67441f, aVar.f67438c, z10);
    }

    @Override // androidx.media3.extractor.mp3.g
    public long d() {
        return this.f67841o;
    }

    @Override // androidx.media3.extractor.mp3.g
    public long e(long j10) {
        return b(j10);
    }

    public a f(long j10) {
        return new a(j10, this.f67837k, this.f67838l, this.f67839m, this.f67840n);
    }

    @Override // androidx.media3.extractor.mp3.g
    public int i() {
        return this.f67838l;
    }

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        this.f67837k = j11;
        this.f67838l = i10;
        this.f67839m = i11;
        this.f67840n = z10;
        if (j10 == -1) {
            j10 = -1;
        }
        this.f67841o = j10;
    }
}
