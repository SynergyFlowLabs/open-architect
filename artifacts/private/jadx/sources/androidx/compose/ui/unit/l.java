package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import com.rabbitmq.client.k0;
import kotlin.a1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@o2
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,435:1\n60#2:436\n70#2:439\n53#2,3:442\n53#2,3:446\n53#2,3:450\n53#2,3:454\n53#2,3:458\n53#2,3:462\n53#2,3:466\n22#3:437\n22#3:440\n123#4:438\n123#4:441\n363#4:469\n52#5:445\n49#5:449\n68#5:453\n66#5:457\n60#5:461\n58#5:465\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n296#1:436\n301#1:439\n307#1:442,3\n312#1:446,3\n317#1:450,3\n325#1:454,3\n329#1:458,3\n333#1:462,3\n337#1:466,3\n296#1:437\n301#1:440\n296#1:438\n301#1:441\n341#1:469\n312#1:445\n317#1:449\n325#1:453\n329#1:457\n333#1:461\n337#1:465\n*E\n"})
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42704b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f42705c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f42706d = f(n0.d.f332689d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42707a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return l.f42706d;
        }

        public final long b() {
            return l.f42705c;
        }

        private a() {
        }
    }

    private /* synthetic */ l(long j10) {
        this.f42707a = j10;
    }

    public static final /* synthetic */ l c(long j10) {
        return new l(j10);
    }

    @k7
    public static final float d(long j10) {
        return p(j10);
    }

    @k7
    public static final float e(long j10) {
        return m(j10);
    }

    public static long f(long j10) {
        return j10;
    }

    public static final long g(long j10, float f10, float f11) {
        return f((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    public static /* synthetic */ long h(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = p(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m(j10);
        }
        return g(j10, f10, f11);
    }

    @k7
    public static final long i(long j10, float f10) {
        float fR = h.r(p(j10) / f10);
        float fR2 = h.r(m(j10) / f10);
        return f((((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(fR2)) & k0.f265952a));
    }

    @k7
    public static final long j(long j10, int i10) {
        float f10 = i10;
        return f((((long) Float.floatToRawIntBits(h.r(p(j10) / f10))) << 32) | (((long) Float.floatToRawIntBits(h.r(m(j10) / f10))) & k0.f265952a));
    }

    public static boolean k(long j10, Object obj) {
        return (obj instanceof l) && j10 == ((l) obj).x();
    }

    public static final boolean l(long j10, long j11) {
        return j10 == j11;
    }

    public static final float m(long j10) {
        return h.r(Float.intBitsToFloat((int) (j10 & k0.f265952a)));
    }

    @k7
    public static /* synthetic */ void n() {
    }

    @a1
    public static /* synthetic */ void o() {
    }

    public static final float p(long j10) {
        return h.r(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    @k7
    public static /* synthetic */ void q() {
    }

    public static int r(long j10) {
        return Long.hashCode(j10);
    }

    @k7
    public static final long s(long j10, long j11) {
        float fR = h.r(p(j10) - p(j11));
        float fR2 = h.r(m(j10) - m(j11));
        return f((((long) Float.floatToRawIntBits(fR)) << 32) | (k0.f265952a & ((long) Float.floatToRawIntBits(fR2))));
    }

    @k7
    public static final long t(long j10, long j11) {
        float fR = h.r(p(j10) + p(j11));
        float fR2 = h.r(m(j10) + m(j11));
        return f((((long) Float.floatToRawIntBits(fR)) << 32) | (k0.f265952a & ((long) Float.floatToRawIntBits(fR2))));
    }

    @k7
    public static final long u(long j10, float f10) {
        float fR = h.r(p(j10) * f10);
        float fR2 = h.r(m(j10) * f10);
        return f((((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(fR2)) & k0.f265952a));
    }

    @k7
    public static final long v(long j10, int i10) {
        float f10 = i10;
        return f((((long) Float.floatToRawIntBits(h.r(p(j10) * f10))) << 32) | (((long) Float.floatToRawIntBits(h.r(m(j10) * f10))) & k0.f265952a));
    }

    @k7
    @NotNull
    public static String w(long j10) {
        if (j10 == n0.d.f332689d) {
            return "DpSize.Unspecified";
        }
        return ((Object) h.M(p(j10))) + " x " + ((Object) h.M(m(j10)));
    }

    public boolean equals(Object obj) {
        return k(this.f42707a, obj);
    }

    public int hashCode() {
        return r(this.f42707a);
    }

    @k7
    @NotNull
    public String toString() {
        return w(this.f42707a);
    }

    public final /* synthetic */ long x() {
        return this.f42707a;
    }
}
