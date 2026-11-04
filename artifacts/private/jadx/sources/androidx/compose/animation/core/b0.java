package androidx.compose.animation.core;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nArcSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline\n+ 2 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,393:1\n222#2:394\n225#2:395\n273#2:396\n277#2:397\n273#2:398\n277#2:399\n222#2:410\n225#2:411\n65#3,10:400\n*S KotlinDebug\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline\n*L\n115#1:394\n116#1:395\n119#1:396\n120#1:397\n145#1:398\n146#1:399\n174#1:410\n175#1:411\n162#1:400,10\n*E\n"})
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12778c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a[][] f12779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12780b = true;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nArcSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n+ 2 ArcSpline.jvm.kt\nandroidx/compose/animation/core/ArcSpline_jvmKt\n*L\n1#1,393:1\n268#1,2:394\n21#2:396\n26#2:397\n*S KotlinDebug\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n*L\n262#1:394,2\n334#1:396\n353#1:397\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f12781s = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f12782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f12783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f12784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f12785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f12786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f12787f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f12788g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f12789h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f12790i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private final float[] f12791j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final float f12792k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final float f12793l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final float f12794m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @oj.f
        public final float f12795n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @oj.f
        public final float f12796o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @oj.f
        public final boolean f12797p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @oj.f
        public final float f12798q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @oj.f
        public final float f12799r;

        public a(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f12782a = f10;
            this.f12783b = f11;
            this.f12784c = f12;
            this.f12785d = f13;
            this.f12786e = f14;
            this.f12787f = f15;
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            boolean z10 = true;
            boolean z11 = i10 == 1 || (i10 == 4 ? f17 > 0.0f : !(i10 != 5 || f17 >= 0.0f));
            float f18 = z11 ? -1.0f : 1.0f;
            this.f12794m = f18;
            float f19 = 1 / (f11 - f10);
            this.f12792k = f19;
            this.f12791j = new float[101];
            boolean z12 = i10 == 3;
            if (z12 || Math.abs(f16) < 0.001f || Math.abs(f17) < 0.001f) {
                float fHypot = (float) Math.hypot(f17, f16);
                this.f12788g = fHypot;
                this.f12793l = fHypot * f19;
                this.f12798q = f16 * f19;
                this.f12799r = f17 * f19;
                this.f12795n = Float.NaN;
                this.f12796o = Float.NaN;
            } else {
                this.f12795n = f16 * f18;
                this.f12796o = f17 * (-f18);
                this.f12798q = z11 ? f14 : f12;
                this.f12799r = z11 ? f13 : f15;
                c(f12, f13, f14, f15);
                this.f12793l = this.f12788g * f19;
                z10 = z12;
            }
            this.f12797p = z10;
        }

        private final float d(float f10) {
            return o((this.f12794m == -1.0f ? this.f12783b - f10 : f10 - this.f12782a) * this.f12792k) * 1.5707964f;
        }

        private final float o(float f10) {
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            if (f10 >= 1.0f) {
                return 1.0f;
            }
            float f11 = f10 * 100;
            int i10 = (int) f11;
            float f12 = f11 - i10;
            float[] fArr = this.f12791j;
            float f13 = fArr[i10];
            return f13 + (f12 * (fArr[i10 + 1] - f13));
        }

        public final void c(float f10, float f11, float f12, float f13) {
            float f14;
            float f15;
            float fHypot;
            float f16 = f12 - f10;
            float f17 = f11 - f13;
            float[] fArr = c0.f12852o;
            int length = fArr.length - 1;
            float f18 = length;
            float[] fArr2 = this.f12791j;
            if (1 <= length) {
                float f19 = f17;
                int i10 = 1;
                fHypot = 0.0f;
                float f20 = 0.0f;
                while (true) {
                    f15 = 0.0f;
                    double radians = (float) Math.toRadians((((double) i10) * 90.0d) / ((double) length));
                    float fSin = ((float) Math.sin(radians)) * f16;
                    float fCos = ((float) Math.cos(radians)) * f17;
                    f14 = f18;
                    fHypot += (float) Math.hypot(fSin - f20, fCos - f19);
                    fArr[i10] = fHypot;
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    f19 = fCos;
                    f18 = f14;
                    f20 = fSin;
                }
            } else {
                f14 = f18;
                f15 = 0.0f;
                fHypot = 0.0f;
            }
            this.f12788g = fHypot;
            if (1 <= length) {
                int i11 = 1;
                while (true) {
                    fArr[i11] = fArr[i11] / fHypot;
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i12 = 0; i12 < length2; i12++) {
                float f21 = i12 / 100.0f;
                int iBinarySearch$default = ArraysKt.binarySearch$default(fArr, f21, 0, 0, 6, (Object) null);
                if (iBinarySearch$default >= 0) {
                    fArr2[i12] = iBinarySearch$default / f14;
                } else {
                    if (iBinarySearch$default == -1) {
                        fArr2[i12] = f15;
                    } else {
                        int i13 = -iBinarySearch$default;
                        int i14 = i13 - 2;
                        float f22 = i14;
                        float f23 = fArr[i14];
                        fArr2[i12] = (f22 + ((f21 - f23) / (fArr[i13 - 1] - f23))) / f14;
                    }
                }
            }
        }

        public final float e() {
            float f10 = this.f12795n * this.f12790i;
            return f10 * this.f12794m * (this.f12793l / ((float) Math.hypot(f10, (-this.f12796o) * this.f12789h)));
        }

        public final float f() {
            float f10 = this.f12795n * this.f12790i;
            float f11 = (-this.f12796o) * this.f12789h;
            return f11 * this.f12794m * (this.f12793l / ((float) Math.hypot(f10, f11)));
        }

        public final float g() {
            return this.f12798q + (this.f12795n * this.f12789h);
        }

        public final float h() {
            return this.f12799r + (this.f12796o * this.f12790i);
        }

        public final float i() {
            return this.f12798q;
        }

        public final float j() {
            return this.f12799r;
        }

        public final float k(float f10) {
            float f11 = (f10 - this.f12782a) * this.f12792k;
            float f12 = this.f12784c;
            return f12 + (f11 * (this.f12786e - f12));
        }

        public final float l(float f10) {
            float f11 = (f10 - this.f12782a) * this.f12792k;
            float f12 = this.f12785d;
            return f12 + (f11 * (this.f12787f - f12));
        }

        public final float m() {
            return this.f12782a;
        }

        public final float n() {
            return this.f12783b;
        }

        public final void p(float f10) {
            double dO = o((this.f12794m == -1.0f ? this.f12783b - f10 : f10 - this.f12782a) * this.f12792k) * 1.5707964f;
            this.f12789h = (float) Math.sin(dO);
            this.f12790i = (float) Math.cos(dO);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[PHI: r10
      0x002a: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0019, B:10:0x0022, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public b0(@NotNull int[] iArr, @NotNull float[] fArr, @NotNull float[][] fArr2) {
        int i10;
        int i11 = 1;
        int length = fArr.length - 1;
        a[][] aVarArr = new a[length][];
        int i12 = 1;
        int i13 = 1;
        int i14 = 0;
        while (i14 < length) {
            int i15 = iArr[i14];
            int i16 = 3;
            if (i15 == 0) {
                i10 = i16;
            } else if (i15 == i11) {
                i12 = i11;
                i10 = i12;
            } else {
                if (i15 != 2) {
                    if (i15 != 3) {
                        i16 = 4;
                        if (i15 != 4) {
                            i16 = 5;
                            if (i15 != 5) {
                                i10 = i13;
                            } else {
                                i10 = i16;
                            }
                        } else {
                            i10 = i16;
                        }
                    } else {
                        if (i12 != i11) {
                            i12 = i11;
                        }
                        i10 = i12;
                    }
                }
                i12 = 2;
                i10 = i12;
            }
            float[] fArr3 = fArr2[i14];
            int i17 = i14 + 1;
            float[] fArr4 = fArr2[i17];
            float f10 = fArr[i14];
            float f11 = fArr[i17];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            a[] aVarArr2 = new a[length2];
            int i18 = 0;
            while (i18 < length2) {
                int i19 = i18 * 2;
                int i20 = i18;
                int i21 = i19 + 1;
                aVarArr2[i20] = new a(i10, f10, f11, fArr3[i19], fArr3[i21], fArr4[i19], fArr4[i21]);
                i18 = i20 + 1;
            }
            aVarArr[i14] = aVarArr2;
            i14 = i17;
            i13 = i10;
            i11 = 1;
        }
        this.f12779a = aVarArr;
    }

    public final void a(float f10, @NotNull float[] fArr) {
        a[][] aVarArr = this.f12779a;
        int length = aVarArr.length - 1;
        int i10 = 0;
        float fM = aVarArr[0][0].m();
        float fN = aVarArr[length][0].n();
        int length2 = fArr.length;
        if (!this.f12780b) {
            f10 = Math.min(Math.max(f10, fM), fN);
        } else if (f10 < fM || f10 > fN) {
            if (f10 > fN) {
                fM = fN;
            } else {
                length = 0;
            }
            float f11 = f10 - fM;
            int i11 = 0;
            while (i10 < length2 - 1) {
                a aVar = aVarArr[length][i11];
                if (aVar.f12797p) {
                    fArr[i10] = aVar.k(fM) + (aVar.f12798q * f11);
                    fArr[i10 + 1] = aVar.l(fM) + (aVar.f12799r * f11);
                } else {
                    aVar.p(fM);
                    fArr[i10] = aVar.f12798q + (aVar.f12795n * aVar.f12789h) + (aVar.e() * f11);
                    fArr[i10 + 1] = aVar.f12799r + (aVar.f12796o * aVar.f12790i) + (aVar.f() * f11);
                }
                i10 += 2;
                i11++;
            }
            return;
        }
        boolean z10 = false;
        for (a[] aVarArr2 : aVarArr) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < length2 - 1) {
                a aVar2 = aVarArr2[i13];
                if (f10 <= aVar2.n()) {
                    if (aVar2.f12797p) {
                        fArr[i12] = aVar2.k(f10);
                        fArr[i12 + 1] = aVar2.l(f10);
                    } else {
                        aVar2.p(f10);
                        fArr[i12] = aVar2.f12798q + (aVar2.f12795n * aVar2.f12789h);
                        fArr[i12 + 1] = aVar2.f12799r + (aVar2.f12796o * aVar2.f12790i);
                    }
                    z10 = true;
                }
                i12 += 2;
                i13++;
            }
            if (z10) {
                return;
            }
        }
    }

    public final void b(float f10, @NotNull float[] fArr) {
        a[][] aVarArr = this.f12779a;
        float fM = aVarArr[0][0].m();
        float fN = aVarArr[aVarArr.length - 1][0].n();
        if (f10 < fM) {
            f10 = fM;
        }
        if (f10 <= fN) {
            fN = f10;
        }
        int length = fArr.length;
        boolean z10 = false;
        for (a[] aVarArr2 : aVarArr) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < length - 1) {
                a aVar = aVarArr2[i11];
                if (fN <= aVar.n()) {
                    if (aVar.f12797p) {
                        fArr[i10] = aVar.f12798q;
                        fArr[i10 + 1] = aVar.f12799r;
                    } else {
                        aVar.p(fN);
                        fArr[i10] = aVar.e();
                        fArr[i10 + 1] = aVar.f();
                    }
                    z10 = true;
                }
                i10 += 2;
                i11++;
            }
            if (z10) {
                return;
            }
        }
    }
}
