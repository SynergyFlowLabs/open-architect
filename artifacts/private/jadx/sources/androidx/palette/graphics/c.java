package androidx.palette.graphics;

import androidx.annotation.NonNull;
import androidx.annotation.x;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f72888e = 0.26f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f72889f = 0.45f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f72890g = 0.55f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f72891h = 0.74f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f72892i = 0.3f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f72893j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f72894k = 0.7f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f72895l = 0.3f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f72896m = 0.4f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f72897n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f72898o = 0.35f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f72899p = 0.24f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f72900q = 0.52f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f72901r = 0.24f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f72902s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f72903t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final int f72904u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final int f72905v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final int f72906w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final int f72907x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f72908y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f72909z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final float[] f72910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float[] f72911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float[] f72912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f72913d;

    static {
        c cVar = new c();
        f72908y = cVar;
        m(cVar);
        p(cVar);
        c cVar2 = new c();
        f72909z = cVar2;
        o(cVar2);
        p(cVar2);
        c cVar3 = new c();
        A = cVar3;
        l(cVar3);
        p(cVar3);
        c cVar4 = new c();
        B = cVar4;
        m(cVar4);
        n(cVar4);
        c cVar5 = new c();
        C = cVar5;
        o(cVar5);
        n(cVar5);
        c cVar6 = new c();
        D = cVar6;
        l(cVar6);
        n(cVar6);
    }

    c() {
        float[] fArr = new float[3];
        this.f72910a = fArr;
        float[] fArr2 = new float[3];
        this.f72911b = fArr2;
        this.f72912c = new float[3];
        this.f72913d = true;
        r(fArr);
        r(fArr2);
        q();
    }

    private static void l(c cVar) {
        float[] fArr = cVar.f72911b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void m(c cVar) {
        float[] fArr = cVar.f72911b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void n(c cVar) {
        float[] fArr = cVar.f72910a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void o(c cVar) {
        float[] fArr = cVar.f72911b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void p(c cVar) {
        float[] fArr = cVar.f72910a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private void q() {
        float[] fArr = this.f72912c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    private static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.f72912c[1];
    }

    @x(from = 0.0d, to = 1.0d)
    public float b() {
        return this.f72911b[2];
    }

    @x(from = 0.0d, to = 1.0d)
    public float c() {
        return this.f72910a[2];
    }

    @x(from = 0.0d, to = 1.0d)
    public float d() {
        return this.f72911b[0];
    }

    @x(from = 0.0d, to = 1.0d)
    public float e() {
        return this.f72910a[0];
    }

    public float f() {
        return this.f72912c[2];
    }

    public float g() {
        boolean z10 = false | false;
        return this.f72912c[0];
    }

    @x(from = 0.0d, to = 1.0d)
    public float h() {
        return this.f72911b[1];
    }

    @x(from = 0.0d, to = 1.0d)
    public float i() {
        return this.f72910a[1];
    }

    public boolean j() {
        return this.f72913d;
    }

    void k() {
        int length = this.f72912c.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = this.f72912c[i10];
            if (f11 > 0.0f) {
                f10 += f11;
            }
        }
        if (f10 != 0.0f) {
            int length2 = this.f72912c.length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] fArr = this.f72912c;
                float f12 = fArr[i11];
                if (f12 > 0.0f) {
                    fArr[i11] = f12 / f10;
                }
            }
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f72914a;

        public a() {
            this.f72914a = new c();
        }

        @NonNull
        public c a() {
            return this.f72914a;
        }

        @NonNull
        public a b(boolean z10) {
            this.f72914a.f72913d = z10;
            return this;
        }

        @NonNull
        public a c(@x(from = 0.0d) float f10) {
            this.f72914a.f72912c[1] = f10;
            return this;
        }

        @NonNull
        public a d(@x(from = 0.0d, to = 1.0d) float f10) {
            this.f72914a.f72911b[2] = f10;
            return this;
        }

        @NonNull
        public a e(@x(from = 0.0d, to = 1.0d) float f10) {
            this.f72914a.f72910a[2] = f10;
            return this;
        }

        @NonNull
        public a f(@x(from = 0.0d, to = 1.0d) float f10) {
            this.f72914a.f72911b[0] = f10;
            return this;
        }

        @NonNull
        public a g(@x(from = 0.0d, to = 1.0d) float f10) {
            this.f72914a.f72910a[0] = f10;
            return this;
        }

        @NonNull
        public a h(@x(from = 0.0d) float f10) {
            this.f72914a.f72912c[2] = f10;
            return this;
        }

        @NonNull
        public a i(@x(from = 0.0d) float f10) {
            int i10 = 6 >> 0;
            this.f72914a.f72912c[0] = f10;
            return this;
        }

        @NonNull
        public a j(@x(from = 0.0d, to = 1.0d) float f10) {
            this.f72914a.f72911b[1] = f10;
            return this;
        }

        @NonNull
        public a k(@x(from = 0.0d, to = 1.0d) float f10) {
            this.f72914a.f72910a[1] = f10;
            return this;
        }

        public a(@NonNull c cVar) {
            this.f72914a = new c(cVar);
        }
    }

    c(@NonNull c cVar) {
        float[] fArr = new float[3];
        this.f72910a = fArr;
        float[] fArr2 = new float[3];
        this.f72911b = fArr2;
        float[] fArr3 = new float[3];
        this.f72912c = fArr3;
        int i10 = 5 >> 1;
        this.f72913d = true;
        System.arraycopy(cVar.f72910a, 0, fArr, 0, fArr.length);
        System.arraycopy(cVar.f72911b, 0, fArr2, 0, fArr2.length);
        System.arraycopy(cVar.f72912c, 0, fArr3, 0, fArr3.length);
    }
}
