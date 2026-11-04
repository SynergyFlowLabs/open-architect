package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@o2
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,435:1\n60#2:436\n70#2:439\n53#2,3:442\n53#2,3:446\n53#2,3:450\n22#3:437\n22#3:440\n123#4:438\n123#4:441\n254#4:453\n52#5:445\n49#5:449\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n210#1:436\n215#1:439\n218#1:442,3\n223#1:446,3\n228#1:450,3\n210#1:437\n215#1:440\n210#1:438\n215#1:441\n232#1:453\n223#1:445\n228#1:449\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42694b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f42695c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f42696d = d(n0.d.f332689d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42697a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return j.f42696d;
        }

        public final long b() {
            return j.f42695c;
        }

        private a() {
        }
    }

    private /* synthetic */ j(long j10) {
        this.f42697a = j10;
    }

    public static final /* synthetic */ j c(long j10) {
        return new j(j10);
    }

    public static long d(long j10) {
        return j10;
    }

    public static final long e(long j10, float f10, float f11) {
        return d((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    public static /* synthetic */ long f(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = j(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = l(j10);
        }
        return e(j10, f10, f11);
    }

    public static boolean g(long j10, Object obj) {
        return (obj instanceof j) && j10 == ((j) obj).r();
    }

    public static final boolean h(long j10, long j11) {
        return j10 == j11;
    }

    public static final float j(long j10) {
        return h.r(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    @k7
    public static /* synthetic */ void k() {
    }

    public static final float l(long j10) {
        return h.r(Float.intBitsToFloat((int) (j10 & k0.f265952a)));
    }

    @k7
    public static /* synthetic */ void m() {
    }

    public static int n(long j10) {
        return Long.hashCode(j10);
    }

    @k7
    public static final long o(long j10, long j11) {
        float fR = h.r(j(j10) - j(j11));
        float fR2 = h.r(l(j10) - l(j11));
        return d((((long) Float.floatToRawIntBits(fR)) << 32) | (k0.f265952a & ((long) Float.floatToRawIntBits(fR2))));
    }

    @k7
    public static final long p(long j10, long j11) {
        float fR = h.r(j(j10) + j(j11));
        float fR2 = h.r(l(j10) + l(j11));
        return d((((long) Float.floatToRawIntBits(fR)) << 32) | (k0.f265952a & ((long) Float.floatToRawIntBits(fR2))));
    }

    @k7
    @NotNull
    public static String q(long j10) {
        if (j10 == n0.d.f332689d) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) h.M(j(j10))) + ", " + ((Object) h.M(l(j10))) + ')';
    }

    public boolean equals(Object obj) {
        return g(this.f42697a, obj);
    }

    public int hashCode() {
        return n(this.f42697a);
    }

    public final long i() {
        return this.f42697a;
    }

    public final /* synthetic */ long r() {
        return this.f42697a;
    }

    @k7
    @NotNull
    public String toString() {
        return q(this.f42697a);
    }
}
