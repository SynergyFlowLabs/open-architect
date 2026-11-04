package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.d1;
import androidx.compose.ui.graphics.s0;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1259:1\n638#2:1260\n653#2:1261\n668#2:1265\n638#2:1266\n653#2:1267\n668#2:1268\n53#3,3:1262\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n788#1:1260\n789#1:1261\n799#1:1265\n811#1:1266\n812#1:1267\n813#1:1268\n791#1:1262,3\n*E\n"})
public final class j0 extends androidx.compose.ui.graphics.colorspace.c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final a f37592v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final n f37593w = new n() { // from class: androidx.compose.ui.graphics.colorspace.u
        @Override // androidx.compose.ui.graphics.colorspace.n
        public final double a(double d10) {
            return j0.y(d10);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final m0 f37594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f37595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f37596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final k0 f37597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final float[] f37598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final float[] f37599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final float[] f37600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final n f37601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final Function1<Double, Double> f37602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final n f37603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final n f37604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final Function1<Double, Double> f37605r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final n f37606s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f37607t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f37608u;

    @SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb$Companion\n*L\n1#1,1259:1\n977#1:1260\n977#1:1261\n977#1:1262\n977#1:1263\n977#1:1264\n977#1:1265\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb$Companion\n*L\n1050#1:1260\n1051#1:1261\n1057#1:1262\n1058#1:1263\n1063#1:1264\n1064#1:1265\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double A(k0 k0Var, double d10) {
            return d.w(d10, k0Var.j(), k0Var.k(), k0Var.l(), k0Var.m(), k0Var.n(), k0Var.o(), k0Var.p());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final n B(final k0 k0Var) {
            if (k0Var.q()) {
                return new n() { // from class: androidx.compose.ui.graphics.colorspace.f0
                    @Override // androidx.compose.ui.graphics.colorspace.n
                    public final double a(double d10) {
                        return j0.a.C(k0Var, d10);
                    }
                };
            }
            if (k0Var.r()) {
                return new n() { // from class: androidx.compose.ui.graphics.colorspace.g0
                    @Override // androidx.compose.ui.graphics.colorspace.n
                    public final double a(double d10) {
                        return j0.a.D(k0Var, d10);
                    }
                };
            }
            return (k0Var.n() == 0.0d && k0Var.o() == 0.0d) ? new n() { // from class: androidx.compose.ui.graphics.colorspace.h0
                @Override // androidx.compose.ui.graphics.colorspace.n
                public final double a(double d10) {
                    return j0.a.E(k0Var, d10);
                }
            } : new n() { // from class: androidx.compose.ui.graphics.colorspace.i0
                @Override // androidx.compose.ui.graphics.colorspace.n
                public final double a(double d10) {
                    return j0.a.F(k0Var, d10);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double C(k0 k0Var, double d10) {
            return k.f37611a.Q(k0Var, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double D(k0 k0Var, double d10) {
            return k.f37611a.S(k0Var, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double E(k0 k0Var, double d10) {
            return d.t(d10, k0Var.j(), k0Var.k(), k0Var.l(), k0Var.m(), k0Var.p());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double F(k0 k0Var, double d10) {
            return d.u(d10, k0Var.j(), k0Var.k(), k0Var.l(), k0Var.m(), k0Var.n(), k0Var.o(), k0Var.p());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean G(float[] fArr, m0 m0Var, n nVar, n nVar2, float f10, float f11, int i10) {
            if (i10 == 0) {
                return true;
            }
            k kVar = k.f37611a;
            if (!d.i(fArr, kVar.L()) || !d.h(m0Var, o.f37659a.h()) || f10 != 0.0f || f11 != 1.0f) {
                return false;
            }
            j0 j0VarK = kVar.K();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!q(d10, nVar, j0VarK.S()) || !q(d10, nVar2, j0VarK.M())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean H(float[] fArr, float f10, float f11) {
            float fP = p(fArr);
            k kVar = k.f37611a;
            return (fP / p(kVar.G()) > 0.9f && u(fArr, kVar.L())) || (f10 < 0.0f && f11 > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] I(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                ArraysKt.copyInto$default(fArr, fArr2, 0, 0, 6, 6, (Object) null);
                return fArr2;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = f10 + f11 + fArr[2];
            fArr2[0] = f10 / f12;
            fArr2[1] = f11 / f12;
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = f13 + f14 + fArr[5];
            fArr2[2] = f13 / f15;
            fArr2[3] = f14 / f15;
            float f16 = fArr[6];
            float f17 = fArr[7];
            float f18 = f16 + f17 + fArr[8];
            fArr2[4] = f16 / f18;
            fArr2[5] = f17 / f18;
            return fArr2;
        }

        private final float p(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        private final boolean q(double d10, n nVar, n nVar2) {
            return Math.abs(nVar.a(d10) - nVar2.a(d10)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final m0 s(float[] fArr) {
            float[] fArrP = d.p(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f10 = fArrP[0];
            float f11 = fArrP[1];
            float f12 = f10 + f11 + fArrP[2];
            return new m0(f10 / f12, f11 / f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] t(float[] fArr, m0 m0Var) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float fE = m0Var.e();
            float f16 = m0Var.f();
            float f17 = 1;
            float f18 = (f17 - f10) / f11;
            float f19 = (f17 - f12) / f13;
            float f20 = (f17 - f14) / f15;
            float f21 = (f17 - fE) / f16;
            float f22 = f10 / f11;
            float f23 = (f12 / f13) - f22;
            float f24 = (fE / f16) - f22;
            float f25 = f19 - f18;
            float f26 = (f14 / f15) - f22;
            float f27 = (((f21 - f18) * f23) - (f24 * f25)) / (((f20 - f18) * f23) - (f25 * f26));
            float f28 = (f24 - (f26 * f27)) / f23;
            float f29 = (1.0f - f28) - f27;
            float f30 = f29 / f11;
            float f31 = f28 / f13;
            float f32 = f27 / f15;
            return new float[]{f30 * f10, f29, f30 * ((1.0f - f10) - f11), f31 * f12, f28, f31 * ((1.0f - f12) - f13), f32 * f14, f27, f32 * ((1.0f - f14) - f15)};
        }

        private final boolean u(float[] fArr, float[] fArr2) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[1];
            float f14 = fArr[2];
            float f15 = fArr2[2];
            float f16 = fArr[3];
            float f17 = fArr2[3];
            float f18 = fArr[4];
            float f19 = fArr2[4];
            float f20 = fArr[5];
            float f21 = fArr2[5];
            float[] fArr3 = {f10 - f11, f12 - f13, f14 - f15, f16 - f17, f18 - f19, f20 - f21};
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            if (((f13 - f21) * f22) - ((f11 - f19) * f23) >= 0.0f && ((f11 - f15) * f23) - ((f13 - f17) * f22) >= 0.0f) {
                float f24 = fArr3[2];
                float f25 = fArr3[3];
                if (((f17 - f13) * f24) - ((f15 - f11) * f25) >= 0.0f && ((f15 - f19) * f25) - ((f17 - f21) * f24) >= 0.0f) {
                    float f26 = fArr3[4];
                    float f27 = fArr3[5];
                    if (((f21 - f17) * f26) - ((f19 - f15) * f27) >= 0.0f && ((f19 - f11) * f27) - ((f21 - f13) * f26) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final float v(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final n w(final k0 k0Var) {
            if (k0Var.q()) {
                return new n() { // from class: androidx.compose.ui.graphics.colorspace.b0
                    @Override // androidx.compose.ui.graphics.colorspace.n
                    public final double a(double d10) {
                        return j0.a.x(k0Var, d10);
                    }
                };
            }
            if (k0Var.r()) {
                return new n() { // from class: androidx.compose.ui.graphics.colorspace.c0
                    @Override // androidx.compose.ui.graphics.colorspace.n
                    public final double a(double d10) {
                        return j0.a.y(k0Var, d10);
                    }
                };
            }
            return (k0Var.n() == 0.0d && k0Var.o() == 0.0d) ? new n() { // from class: androidx.compose.ui.graphics.colorspace.d0
                @Override // androidx.compose.ui.graphics.colorspace.n
                public final double a(double d10) {
                    return j0.a.z(k0Var, d10);
                }
            } : new n() { // from class: androidx.compose.ui.graphics.colorspace.e0
                @Override // androidx.compose.ui.graphics.colorspace.n
                public final double a(double d10) {
                    return j0.a.A(k0Var, d10);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double x(k0 k0Var, double d10) {
            return k.f37611a.P(k0Var, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double y(k0 k0Var, double d10) {
            return k.f37611a.R(k0Var, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double z(k0 k0Var, double d10) {
            return d.v(d10, k0Var.j(), k0Var.k(), k0Var.l(), k0Var.m(), k0Var.p());
        }

        @NotNull
        public final float[] r(@NotNull float[] fArr) {
            float[] fArrP = d.p(fArr, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrP2 = d.p(fArr, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrP3 = d.p(fArr, new float[]{0.0f, 0.0f, 1.0f});
            float f10 = fArrP[0];
            float f11 = fArrP[1];
            float f12 = f10 + f11 + fArrP[2];
            float f13 = fArrP2[0];
            float f14 = fArrP2[1];
            float f15 = f13 + f14 + fArrP2[2];
            float f16 = fArrP3[0];
            float f17 = fArrP3[1];
            float f18 = f16 + f17 + fArrP3[2];
            return new float[]{f10 / f12, f11 / f12, f13 / f15, f14 / f15, f16 / f18, f17 / f18};
        }

        private a() {
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<Double, Double> {
        b() {
            super(1);
        }

        public final Double c(double d10) {
            return Double.valueOf(j0.this.M().a(kotlin.ranges.r.G(d10, j0.this.f37595h, j0.this.f37596i)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return c(d10.doubleValue());
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<Double, Double> {
        c() {
            super(1);
        }

        public final Double c(double d10) {
            return Double.valueOf(kotlin.ranges.r.G(j0.this.S().a(d10), j0.this.f37595h, j0.this.f37596i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return c(d10.doubleValue());
        }
    }

    public j0(@NotNull String str, @NotNull float[] fArr, @NotNull m0 m0Var, @Nullable float[] fArr2, @NotNull n nVar, @NotNull n nVar2, float f10, float f11, @Nullable k0 k0Var, int i10) {
        super(str, androidx.compose.ui.graphics.colorspace.b.f37572b.c(), i10, null);
        this.f37594g = m0Var;
        this.f37595h = f10;
        this.f37596i = f11;
        this.f37597j = k0Var;
        this.f37601n = nVar;
        this.f37602o = new c();
        this.f37603p = new n() { // from class: androidx.compose.ui.graphics.colorspace.s
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return j0.b0(this.f37686a, d10);
            }
        };
        this.f37604q = nVar2;
        this.f37605r = new b();
        this.f37606s = new n() { // from class: androidx.compose.ui.graphics.colorspace.t
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return j0.H(this.f37687a, d10);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        a aVar = f37592v;
        float[] fArrI = aVar.I(fArr);
        this.f37598k = fArrI;
        if (fArr2 == null) {
            this.f37599l = aVar.t(fArrI, m0Var);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f37599l = fArr2;
        }
        this.f37600m = d.m(this.f37599l);
        this.f37607t = aVar.H(fArrI, f10, f11);
        this.f37608u = aVar.G(fArrI, m0Var, nVar, nVar2, f10, f11, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double A(Function1 function1, double d10) {
        return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double B(Function1 function1, double d10) {
        return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double C(Function1 function1, double d10) {
        return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double D(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double E(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double H(j0 j0Var, double d10) {
        return j0Var.f37604q.a(kotlin.ranges.r.G(d10, j0Var.f37595h, j0Var.f37596i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double b0(j0 j0Var, double d10) {
        return kotlin.ranges.r.G(j0Var.f37601n.a(d10), j0Var.f37595h, j0Var.f37596i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(double d10) {
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double z(Function1 function1, double d10) {
        return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
    }

    @d1(3)
    @NotNull
    public final float[] I(float f10, float f11, float f12) {
        return J(new float[]{f10, f11, f12});
    }

    @d1(min = 3)
    @NotNull
    public final float[] J(@d1(min = 3) @NotNull float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.f37603p.a(fArr[0]);
        fArr[1] = (float) this.f37603p.a(fArr[1]);
        fArr[2] = (float) this.f37603p.a(fArr[2]);
        return fArr;
    }

    @NotNull
    public final Function1<Double, Double> K() {
        return this.f37605r;
    }

    @NotNull
    public final n L() {
        return this.f37606s;
    }

    @NotNull
    public final n M() {
        return this.f37604q;
    }

    @d1(9)
    @NotNull
    public final float[] N() {
        float[] fArr = this.f37600m;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @d1(min = 9)
    @NotNull
    public final float[] O(@d1(min = 9) @NotNull float[] fArr) {
        return ArraysKt.copyInto$default(this.f37600m, fArr, 0, 0, 0, 14, (Object) null);
    }

    @NotNull
    public final float[] P() {
        return this.f37600m;
    }

    @NotNull
    public final Function1<Double, Double> Q() {
        return this.f37602o;
    }

    @NotNull
    public final n R() {
        return this.f37603p;
    }

    @NotNull
    public final n S() {
        return this.f37601n;
    }

    @d1(6)
    @NotNull
    public final float[] T() {
        float[] fArr = this.f37598k;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @d1(min = 6)
    @NotNull
    public final float[] U(@d1(min = 6) @NotNull float[] fArr) {
        return ArraysKt.copyInto$default(this.f37598k, fArr, 0, 0, 0, 14, (Object) null);
    }

    @NotNull
    public final float[] V() {
        return this.f37598k;
    }

    @Nullable
    public final k0 W() {
        return this.f37597j;
    }

    @d1(9)
    @NotNull
    public final float[] X() {
        float[] fArr = this.f37599l;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @d1(min = 9)
    @NotNull
    public final float[] Y(@d1(min = 9) @NotNull float[] fArr) {
        return ArraysKt.copyInto$default(this.f37599l, fArr, 0, 0, 0, 14, (Object) null);
    }

    @NotNull
    public final float[] Z() {
        return this.f37599l;
    }

    @NotNull
    public final m0 a0() {
        return this.f37594g;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @NotNull
    public float[] b(@NotNull float[] fArr) {
        d.p(this.f37600m, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.f37603p.a(fArr[0]);
        int i10 = 0 >> 1;
        fArr[1] = (float) this.f37603p.a(fArr[1]);
        fArr[2] = (float) this.f37603p.a(fArr[2]);
        return fArr;
    }

    @d1(3)
    @NotNull
    public final float[] c0(float f10, float f11, float f12) {
        return d0(new float[]{f10, f11, f12});
    }

    @d1(min = 3)
    @NotNull
    public final float[] d0(@d1(min = 3) @NotNull float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.f37606s.a(fArr[0]);
        fArr[1] = (float) this.f37606s.a(fArr[1]);
        fArr[2] = (float) this.f37606s.a(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float e(int i10) {
        return this.f37596i;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (Float.compare(j0Var.f37595h, this.f37595h) != 0 || Float.compare(j0Var.f37596i, this.f37596i) != 0 || !Intrinsics.areEqual(this.f37594g, j0Var.f37594g) || !Arrays.equals(this.f37598k, j0Var.f37598k)) {
            return false;
        }
        k0 k0Var = this.f37597j;
        if (k0Var != null) {
            return Intrinsics.areEqual(k0Var, j0Var.f37597j);
        }
        if (j0Var.f37597j == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.f37601n, j0Var.f37601n)) {
            return Intrinsics.areEqual(this.f37604q, j0Var.f37604q);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float f(int i10) {
        return this.f37595h;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.f37594g.hashCode()) * 31) + Arrays.hashCode(this.f37598k)) * 31;
        float f10 = this.f37595h;
        int i10 = 2 | 0;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f37596i;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        k0 k0Var = this.f37597j;
        int iHashCode2 = iFloatToIntBits2 + (k0Var != null ? k0Var.hashCode() : 0);
        return this.f37597j == null ? (((iHashCode2 * 31) + this.f37601n.hashCode()) * 31) + this.f37604q.hashCode() : iHashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public boolean i() {
        return this.f37608u;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public boolean j() {
        return this.f37607t;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long k(float f10, float f11, float f12) {
        float fA = (float) this.f37606s.a(f10);
        float fA2 = (float) this.f37606s.a(f11);
        float fA3 = (float) this.f37606s.a(f12);
        float[] fArr = this.f37599l;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(((fArr[0] * fA) + (fArr[3] * fA2)) + (fArr[6] * fA3))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3))) & com.rabbitmq.client.k0.f265952a);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @NotNull
    public float[] m(@NotNull float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.f37606s.a(fArr[0]);
        fArr[1] = (float) this.f37606s.a(fArr[1]);
        fArr[2] = (float) this.f37606s.a(fArr[2]);
        return d.p(this.f37599l, fArr);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float n(float f10, float f11, float f12) {
        float fA = (float) this.f37606s.a(f10);
        float fA2 = (float) this.f37606s.a(f11);
        float fA3 = (float) this.f37606s.a(f12);
        float[] fArr = this.f37599l;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public long o(float f10, float f11, float f12, float f13, @NotNull androidx.compose.ui.graphics.colorspace.c cVar) {
        float[] fArr = this.f37600m;
        return s0.a((float) this.f37603p.a((fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12)), (float) this.f37603p.a((fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12)), (float) this.f37603p.a((fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12)), f13, cVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(@d1(min = 1) @NotNull String str, @d1(9) @NotNull float[] fArr, @NotNull final Function1<? super Double, Double> function1, @NotNull final Function1<? super Double, Double> function2) {
        a aVar = f37592v;
        this(str, aVar.r(fArr), aVar.s(fArr), null, new n() { // from class: androidx.compose.ui.graphics.colorspace.v
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return j0.z(function1, d10);
            }
        }, new n() { // from class: androidx.compose.ui.graphics.colorspace.w
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return j0.A(function2, d10);
            }
        }, 0.0f, 1.0f, null, -1);
    }

    public j0(@d1(min = 1) @NotNull String str, @d1(max = 9, min = 6) @NotNull float[] fArr, @NotNull m0 m0Var, @NotNull final Function1<? super Double, Double> function1, @NotNull final Function1<? super Double, Double> function2, float f10, float f11) {
        this(str, fArr, m0Var, null, new n() { // from class: androidx.compose.ui.graphics.colorspace.z
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return j0.B(function1, d10);
            }
        }, new n() { // from class: androidx.compose.ui.graphics.colorspace.a0
            @Override // androidx.compose.ui.graphics.colorspace.n
            public final double a(double d10) {
                return j0.C(function2, d10);
            }
        }, f10, f11, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(@d1(min = 1) @NotNull String str, @d1(9) @NotNull float[] fArr, @NotNull k0 k0Var) {
        a aVar = f37592v;
        this(str, aVar.r(fArr), aVar.s(fArr), k0Var, -1);
    }

    public j0(@d1(min = 1) @NotNull String str, @d1(max = 9, min = 6) @NotNull float[] fArr, @NotNull m0 m0Var, @NotNull k0 k0Var) {
        this(str, fArr, m0Var, k0Var, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(@NotNull String str, @NotNull float[] fArr, @NotNull m0 m0Var, @NotNull k0 k0Var, int i10) {
        a aVar = f37592v;
        this(str, fArr, m0Var, null, aVar.B(k0Var), aVar.w(k0Var), 0.0f, 1.0f, k0Var, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(@d1(min = 1) @NotNull String str, @d1(9) @NotNull float[] fArr, double d10) {
        a aVar = f37592v;
        this(str, aVar.r(fArr), aVar.s(fArr), d10, 0.0f, 1.0f, -1);
    }

    public j0(@d1(min = 1) @NotNull String str, @d1(max = 9, min = 6) @NotNull float[] fArr, @NotNull m0 m0Var, double d10) {
        this(str, fArr, m0Var, d10, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(@NotNull String str, @NotNull float[] fArr, @NotNull m0 m0Var, final double d10, float f10, float f11, int i10) {
        n nVar;
        n nVar2;
        if (d10 == 1.0d) {
            nVar = f37593w;
        } else {
            nVar = new n() { // from class: androidx.compose.ui.graphics.colorspace.x
                @Override // androidx.compose.ui.graphics.colorspace.n
                public final double a(double d11) {
                    return j0.D(d10, d11);
                }
            };
        }
        n nVar3 = nVar;
        if (d10 == 1.0d) {
            nVar2 = f37593w;
        } else {
            nVar2 = new n() { // from class: androidx.compose.ui.graphics.colorspace.y
                @Override // androidx.compose.ui.graphics.colorspace.n
                public final double a(double d11) {
                    return j0.E(d10, d11);
                }
            };
        }
        this(str, fArr, m0Var, null, nVar3, nVar2, f10, f11, new k0(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i10);
    }

    public j0(@NotNull j0 j0Var, @NotNull float[] fArr, @NotNull m0 m0Var) {
        this(j0Var.h(), j0Var.f37598k, m0Var, fArr, j0Var.f37601n, j0Var.f37604q, j0Var.f37595h, j0Var.f37596i, j0Var.f37597j, -1);
    }
}
