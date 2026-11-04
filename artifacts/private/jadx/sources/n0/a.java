package n0;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@o2
@SourceDebugExtension({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,188:1\n48#1:193\n53#1:196\n48#1:231\n53#1:234\n48#1:236\n48#1:239\n53#1:242\n60#2:189\n70#2:191\n60#2:194\n70#2:197\n53#2,3:199\n60#2:202\n70#2:204\n60#2:205\n70#2:207\n53#2,3:209\n60#2:212\n70#2:214\n53#2,3:216\n60#2:219\n70#2:221\n53#2,3:222\n60#2:225\n70#2:227\n53#2,3:228\n60#2:232\n70#2:235\n60#2:237\n60#2:240\n70#2:243\n22#3:190\n22#3:192\n22#3:195\n22#3:198\n22#3:203\n22#3:206\n22#3:208\n22#3:213\n22#3:215\n22#3:220\n22#3:226\n22#3:233\n22#3:238\n22#3:241\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n55#1:193\n57#1:196\n158#1:231\n158#1:234\n159#1:236\n161#1:239\n161#1:242\n48#1:189\n53#1:191\n55#1:194\n57#1:197\n64#1:199,3\n63#1:202\n63#1:204\n111#1:205\n112#1:207\n110#1:209,3\n127#1:212\n128#1:214\n126#1:216,3\n142#1:219\n142#1:221\n142#1:222,3\n154#1:225\n154#1:227\n154#1:228,3\n158#1:232\n158#1:235\n159#1:237\n161#1:240\n161#1:243\n48#1:190\n53#1:192\n55#1:195\n57#1:198\n63#1:203\n111#1:206\n112#1:208\n127#1:213\n128#1:215\n142#1:220\n154#1:226\n158#1:233\n159#1:238\n161#1:241\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2337a f332683b = new C2337a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f332684c = e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f332685a;

    /* JADX INFO: renamed from: n0.a$a, reason: collision with other inner class name */
    public static final class C2337a {
        public /* synthetic */ C2337a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void b() {
        }

        public final long a() {
            return a.f332684c;
        }

        private C2337a() {
        }
    }

    private /* synthetic */ a(long j10) {
        this.f332685a = j10;
    }

    public static final /* synthetic */ a b(long j10) {
        return new a(j10);
    }

    @k7
    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @k7
    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 & k0.f265952a));
    }

    public static long e(long j10) {
        return j10;
    }

    public static final long f(long j10, float f10, float f11) {
        return e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    public static /* synthetic */ long g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (k0.f265952a & j10));
        }
        return f(j10, f10, f11);
    }

    @k7
    public static final long h(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) / f10;
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).x();
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    @k7
    public static /* synthetic */ void l() {
    }

    public static final float m(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @k7
    public static /* synthetic */ void n() {
    }

    public static final float o(long j10) {
        return Float.intBitsToFloat((int) (j10 & k0.f265952a));
    }

    public static int p(long j10) {
        return Long.hashCode(j10);
    }

    @k7
    public static final boolean q(long j10) {
        return (j10 >>> 32) == (j10 & k0.f265952a);
    }

    @k7
    public static final boolean r(long j10) {
        long j11 = j10 & 9223372034707292159L;
        return (((~j11) & (j11 - d.f332692g)) & (-9223372034707292160L)) != 0;
    }

    @k7
    public static final long s(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) - Float.intBitsToFloat((int) (j11 & k0.f265952a));
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    @k7
    public static final long t(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) + Float.intBitsToFloat((int) (j11 & k0.f265952a));
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    @k7
    public static final long u(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) * f10;
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    @NotNull
    public static String v(long j10) {
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & k0.f265952a);
        if (fIntBitsToFloat == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + c.a(Float.intBitsToFloat(i10), 1) + ')';
        }
        return "CornerRadius.elliptical(" + c.a(Float.intBitsToFloat(i10), 1) + ", " + c.a(Float.intBitsToFloat(i11), 1) + ')';
    }

    @k7
    public static final long w(long j10) {
        return e(j10 ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return i(this.f332685a, obj);
    }

    public int hashCode() {
        return p(this.f332685a);
    }

    public final long k() {
        return this.f332685a;
    }

    @NotNull
    public String toString() {
        return v(this.f332685a);
    }

    public final /* synthetic */ long x() {
        return this.f332685a;
    }
}
