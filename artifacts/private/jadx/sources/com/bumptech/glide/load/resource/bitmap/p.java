package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f97046a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f97047b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f97048c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f97049d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f97050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f97051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f97052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.i<p> f97053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f97054i;

    private static class a extends p {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i10, int i11, int i12, int i13) {
            int iMin = Math.min(i11 / i13, i10 / i12);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    private static class b extends p {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    private static class c extends p {
        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : p.f97048c.a(i10, i11, i12, i13);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, p.f97048c.b(i10, i11, i12, i13));
        }
    }

    private static class d extends p {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    private static class e extends p {
        e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i10, int i11, int i12, int i13) {
            return p.f97054i ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i10, int i11, int i12, int i13) {
            if (p.f97054i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            int iMax = Math.max(i11 / i13, i10 / i12);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    private static class f extends p {
        f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.p
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f97050e = dVar;
        f97051f = new f();
        f97052g = dVar;
        f97053h = com.bumptech.glide.load.i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f97054i = true;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
