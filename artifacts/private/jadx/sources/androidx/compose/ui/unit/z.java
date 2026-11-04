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
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,371:1\n22#2:372\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n241#1:372\n*E\n"})
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42728b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final b0[] f42729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f42730d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42731a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void c() {
        }

        @NotNull
        public final b0[] a() {
            return z.f42729c;
        }

        public final long b() {
            return z.f42730d;
        }

        private a() {
        }
    }

    static {
        b0.a aVar = b0.f42661b;
        f42729c = new b0[]{b0.d(aVar.c()), b0.d(aVar.b()), b0.d(aVar.a())};
        f42730d = a0.v(0L, Float.NaN);
    }

    private /* synthetic */ z(long j10) {
        this.f42731a = j10;
    }

    public static final /* synthetic */ z c(long j10) {
        return new z(j10);
    }

    public static final int d(long j10, long j11) {
        a0.c(j10, j11);
        return Float.compare(n(j10), n(j11));
    }

    public static long e(long j10) {
        return j10;
    }

    public static final long f(long j10, double d10) {
        a0.b(j10);
        return a0.v(l(j10), (float) (((double) n(j10)) / d10));
    }

    public static final long g(long j10, float f10) {
        a0.b(j10);
        return a0.v(l(j10), n(j10) / f10);
    }

    public static final long h(long j10, int i10) {
        a0.b(j10);
        return a0.v(l(j10), n(j10) / i10);
    }

    public static boolean i(long j10, Object obj) {
        if ((obj instanceof z) && j10 == ((z) obj).w()) {
            return true;
        }
        return false;
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    @a1
    public static /* synthetic */ void k() {
    }

    public static final long l(long j10) {
        return j10 & 1095216660480L;
    }

    public static final long m(long j10) {
        return f42729c[(int) (l(j10) >>> 32)].j();
    }

    public static final float n(long j10) {
        return Float.intBitsToFloat((int) (j10 & k0.f265952a));
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean p(long j10) {
        return l(j10) == 8589934592L;
    }

    public static final boolean q(long j10) {
        return l(j10) == 4294967296L;
    }

    public static final long r(long j10, double d10) {
        a0.b(j10);
        return a0.v(l(j10), (float) (((double) n(j10)) * d10));
    }

    public static final long s(long j10, float f10) {
        a0.b(j10);
        return a0.v(l(j10), n(j10) * f10);
    }

    public static final long t(long j10, int i10) {
        a0.b(j10);
        return a0.v(l(j10), n(j10) * i10);
    }

    @NotNull
    public static String u(long j10) {
        long jM = m(j10);
        b0.a aVar = b0.f42661b;
        if (b0.g(jM, aVar.c())) {
            return "Unspecified";
        }
        if (b0.g(jM, aVar.b())) {
            return n(j10) + ".sp";
        }
        if (!b0.g(jM, aVar.a())) {
            return "Invalid";
        }
        return n(j10) + ".em";
    }

    public static final long v(long j10) {
        a0.b(j10);
        return a0.v(l(j10), -n(j10));
    }

    public boolean equals(Object obj) {
        return i(this.f42731a, obj);
    }

    public int hashCode() {
        return o(this.f42731a);
    }

    @NotNull
    public String toString() {
        return u(this.f42731a);
    }

    public final /* synthetic */ long w() {
        return this.f42731a;
    }
}
