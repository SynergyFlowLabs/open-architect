package androidx.compose.ui.graphics;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 2 ColorSpaces.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaces\n+ 3 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,659:1\n360#2:660\n578#3,12:661\n590#3,17:674\n578#3,12:691\n590#3,17:704\n578#3,12:721\n590#3,17:734\n22#4:673\n22#4:703\n22#4:733\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n123#1:660\n156#1:661,12\n156#1:674,17\n177#1:691,12\n177#1:704,17\n198#1:721,12\n198#1:734,17\n156#1:673\n177#1:703\n198#1:733\n*E\n"})
public final class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38131b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f38132c = s0.d(4278190080L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f38133d = s0.d(4282664004L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f38134e = s0.d(4287137928L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f38135f = s0.d(4291611852L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f38136g = s0.d(com.rabbitmq.client.k0.f265952a);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f38137h = s0.d(4294901760L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f38138i = s0.d(4278255360L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f38139j = s0.d(4278190335L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f38140k = s0.d(4294967040L);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f38141l = s0.d(4278255615L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f38142m = s0.d(4294902015L);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f38143n = s0.b(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f38144o = s0.a(0.0f, 0.0f, 0.0f, 0.0f, androidx.compose.ui.graphics.colorspace.k.f37611a.N());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f38145a;

    @SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,659:1\n34#2,4:660\n34#2,4:664\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n*L\n310#1:660,4\n343#1:664,4\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ long B(a aVar, float f10, float f11, float f12, float f13, androidx.compose.ui.graphics.colorspace.j0 j0Var, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                f13 = 1.0f;
            }
            float f14 = f13;
            if ((i10 & 16) != 0) {
                j0Var = androidx.compose.ui.graphics.colorspace.k.f37611a.K();
            }
            return aVar.A(f10, f11, f12, f14, j0Var);
        }

        private final float C(int i10, float f10, float f11, float f12) {
            float f13 = (i10 + (f10 / 30.0f)) % 12.0f;
            return f12 - ((f11 * Math.min(f12, 1.0f - f12)) * Math.max(-1.0f, Math.min(f13 - 3, Math.min(9 - f13, 1.0f))));
        }

        public static /* synthetic */ long E(a aVar, float f10, float f11, float f12, float f13, androidx.compose.ui.graphics.colorspace.j0 j0Var, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                f13 = 1.0f;
            }
            float f14 = f13;
            if ((i10 & 16) != 0) {
                j0Var = androidx.compose.ui.graphics.colorspace.k.f37611a.K();
            }
            return aVar.D(f10, f11, f12, f14, j0Var);
        }

        private final float F(int i10, float f10, float f11, float f12) {
            float f13 = (i10 + (f10 / 60.0f)) % 6.0f;
            return f12 - ((f11 * f12) * Math.max(0.0f, Math.min(f13, Math.min(4 - f13, 1.0f))));
        }

        @k7
        public static /* synthetic */ void b() {
        }

        @k7
        public static /* synthetic */ void d() {
        }

        @k7
        public static /* synthetic */ void f() {
        }

        @k7
        public static /* synthetic */ void h() {
        }

        @k7
        public static /* synthetic */ void j() {
        }

        @k7
        public static /* synthetic */ void l() {
        }

        @k7
        public static /* synthetic */ void n() {
        }

        @k7
        public static /* synthetic */ void p() {
        }

        @k7
        public static /* synthetic */ void r() {
        }

        @k7
        public static /* synthetic */ void t() {
        }

        @k7
        public static /* synthetic */ void v() {
        }

        @k7
        public static /* synthetic */ void x() {
        }

        @k7
        public static /* synthetic */ void z() {
        }

        public final long A(float f10, float f11, float f12, float f13, @NotNull androidx.compose.ui.graphics.colorspace.j0 j0Var) {
            if (!(0.0f <= f10 && f10 <= 360.0f && 0.0f <= f11 && f11 <= 1.0f && 0.0f <= f12 && f12 <= 1.0f)) {
                w1.b("HSL (" + f10 + ", " + f11 + ", " + f12 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return s0.a(C(0, f10, f11, f12), C(8, f10, f11, f12), C(4, f10, f11, f12), f13, j0Var);
        }

        public final long D(float f10, float f11, float f12, float f13, @NotNull androidx.compose.ui.graphics.colorspace.j0 j0Var) {
            if (!(0.0f <= f10 && f10 <= 360.0f && 0.0f <= f11 && f11 <= 1.0f && 0.0f <= f12 && f12 <= 1.0f)) {
                w1.b("HSV (" + f10 + ", " + f11 + ", " + f12 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return s0.a(F(5, f10, f11, f12), F(3, f10, f11, f12), F(1, f10, f11, f12), f13, j0Var);
        }

        public final long a() {
            return q0.f38132c;
        }

        public final long c() {
            return q0.f38139j;
        }

        public final long e() {
            return q0.f38141l;
        }

        public final long g() {
            return q0.f38133d;
        }

        public final long i() {
            return q0.f38134e;
        }

        public final long k() {
            return q0.f38138i;
        }

        public final long m() {
            return q0.f38135f;
        }

        public final long o() {
            return q0.f38142m;
        }

        public final long q() {
            return q0.f38137h;
        }

        public final long s() {
            return q0.f38143n;
        }

        public final long u() {
            return q0.f38144o;
        }

        public final long w() {
            return q0.f38136g;
        }

        public final long y() {
            return q0.f38140k;
        }

        private a() {
        }
    }

    private /* synthetic */ q0(long j10) {
        this.f38145a = j10;
    }

    public static final float A(long j10) {
        float fQ;
        float f10;
        if (kotlin.y1.n(63 & j10) == 0) {
            fQ = (float) kotlin.l2.q(kotlin.y1.n(kotlin.y1.n(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            fQ = (float) kotlin.l2.q(kotlin.y1.n(kotlin.y1.n(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return fQ / f10;
    }

    @k7
    public static /* synthetic */ void B() {
    }

    public static final float C(long j10) {
        int i10;
        int i11;
        int i12;
        if (kotlin.y1.n(63 & j10) == 0) {
            return ((float) kotlin.l2.q(kotlin.y1.n(kotlin.y1.n(j10 >>> 32) & 255))) / 255.0f;
        }
        short sN = (short) kotlin.y1.n(kotlin.y1.n(j10 >>> 16) & okhttp3.internal.ws.g.f334653t);
        int i13 = Short.MIN_VALUE & sN;
        int i14 = ((65535 & sN) >>> 10) & 31;
        int i15 = sN & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + com.planner5d.library.engine.input.f.b.B;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - n1.f38080r;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    @k7
    public static /* synthetic */ void D() {
    }

    @NotNull
    public static final androidx.compose.ui.graphics.colorspace.c E(long j10) {
        androidx.compose.ui.graphics.colorspace.k kVar = androidx.compose.ui.graphics.colorspace.k.f37611a;
        return kVar.z()[(int) kotlin.y1.n(j10 & 63)];
    }

    @k7
    public static /* synthetic */ void F() {
    }

    public static final float G(long j10) {
        int i10;
        int i11;
        int i12;
        if (kotlin.y1.n(63 & j10) == 0) {
            return ((float) kotlin.l2.q(kotlin.y1.n(kotlin.y1.n(j10 >>> 40) & 255))) / 255.0f;
        }
        short sN = (short) kotlin.y1.n(kotlin.y1.n(j10 >>> 32) & okhttp3.internal.ws.g.f334653t);
        int i13 = Short.MIN_VALUE & sN;
        int i14 = ((65535 & sN) >>> 10) & 31;
        int i15 = sN & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + com.planner5d.library.engine.input.f.b.B;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - n1.f38080r;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    @k7
    public static /* synthetic */ void H() {
    }

    public static final float I(long j10) {
        int i10;
        int i11;
        int i12;
        if (kotlin.y1.n(63 & j10) == 0) {
            return ((float) kotlin.l2.q(kotlin.y1.n(kotlin.y1.n(j10 >>> 48) & 255))) / 255.0f;
        }
        short sN = (short) kotlin.y1.n(kotlin.y1.n(j10 >>> 48) & okhttp3.internal.ws.g.f334653t);
        int i13 = Short.MIN_VALUE & sN;
        int i14 = ((65535 & sN) >>> 10) & 31;
        int i15 = sN & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + com.planner5d.library.engine.input.f.b.B;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - n1.f38080r;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static int K(long j10) {
        return kotlin.y1.H(j10);
    }

    @NotNull
    public static String L(long j10) {
        return "Color(" + I(j10) + ", " + G(j10) + ", " + C(j10) + ", " + A(j10) + ", " + E(j10).h() + ')';
    }

    public static final /* synthetic */ q0 n(long j10) {
        return new q0(j10);
    }

    @k7
    public static final float o(long j10) {
        return I(j10);
    }

    @k7
    public static final float p(long j10) {
        return G(j10);
    }

    @k7
    public static final float q(long j10) {
        return C(j10);
    }

    @k7
    public static final float r(long j10) {
        return A(j10);
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.graphics.colorspace.c s(long j10) {
        return E(j10);
    }

    public static long t(long j10) {
        return j10;
    }

    public static final long u(long j10, @NotNull androidx.compose.ui.graphics.colorspace.c cVar) {
        return androidx.compose.ui.graphics.colorspace.d.k(E(j10), cVar, 0, 2, null).f(j10);
    }

    @k7
    public static final long v(long j10, float f10, float f11, float f12, float f13) {
        return s0.a(f11, f12, f13, f10, E(j10));
    }

    public static /* synthetic */ long w(long j10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = A(j10);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = I(j10);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = G(j10);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = C(j10);
        }
        return v(j10, f14, f15, f16, f13);
    }

    public static boolean x(long j10, Object obj) {
        return (obj instanceof q0) && j10 == ((q0) obj).M();
    }

    public static final boolean y(long j10, long j11) {
        return kotlin.y1.v(j10, j11);
    }

    @k7
    public static /* synthetic */ void z() {
    }

    public final long J() {
        return this.f38145a;
    }

    public final /* synthetic */ long M() {
        return this.f38145a;
    }

    public boolean equals(Object obj) {
        return x(this.f38145a, obj);
    }

    public int hashCode() {
        return K(this.f38145a);
    }

    @NotNull
    public String toString() {
        return L(this.f38145a);
    }
}
