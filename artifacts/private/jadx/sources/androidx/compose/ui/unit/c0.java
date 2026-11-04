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
@SourceDebugExtension({"SMAP\nVelocity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,147:1\n60#2:148\n70#2:150\n53#2,3:152\n60#2:155\n70#2:157\n60#2:158\n70#2:160\n53#2,3:162\n60#2:165\n70#2:167\n53#2,3:169\n60#2:172\n70#2:174\n53#2,3:175\n60#2:178\n70#2:180\n53#2,3:181\n60#2:184\n70#2:186\n53#2,3:187\n22#3:149\n22#3:151\n22#3:156\n22#3:159\n22#3:161\n22#3:166\n22#3:168\n22#3:173\n22#3:179\n22#3:185\n*S KotlinDebug\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n*L\n42#1:148\n47#1:150\n57#1:152,3\n56#1:155\n56#1:157\n89#1:158\n90#1:160\n88#1:162,3\n104#1:165\n105#1:167\n103#1:169,3\n118#1:172\n118#1:174\n118#1:175,3\n130#1:178\n130#1:180\n130#1:181,3\n142#1:184\n142#1:186\n142#1:187,3\n42#1:149\n47#1:151\n56#1:156\n89#1:159\n90#1:161\n104#1:166\n105#1:168\n118#1:173\n130#1:179\n142#1:185\n*E\n"})
public final class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42681b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f42682c = e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42683a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void b() {
        }

        public final long a() {
            return c0.f42682c;
        }

        private a() {
        }
    }

    private /* synthetic */ c0(long j10) {
        this.f42683a = j10;
    }

    public static final /* synthetic */ c0 b(long j10) {
        return new c0(j10);
    }

    @k7
    public static final float c(long j10) {
        return l(j10);
    }

    @k7
    public static final float d(long j10) {
        return n(j10);
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
        return (obj instanceof c0) && j10 == ((c0) obj).v();
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    @k7
    public static /* synthetic */ void k() {
    }

    public static final float l(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @k7
    public static /* synthetic */ void m() {
    }

    public static final float n(long j10) {
        return Float.intBitsToFloat((int) (j10 & k0.f265952a));
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    @k7
    public static final long p(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) - Float.intBitsToFloat((int) (j11 & k0.f265952a));
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    @k7
    public static final long q(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) + Float.intBitsToFloat((int) (j11 & k0.f265952a));
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    @k7
    public static final long r(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) % f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) % f10;
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    @k7
    public static final long s(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) * f10;
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & k0.f265952a));
    }

    @NotNull
    public static String t(long j10) {
        return '(' + l(j10) + ", " + n(j10) + ") px/sec";
    }

    @k7
    public static final long u(long j10) {
        return e(j10 ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return i(this.f42683a, obj);
    }

    public int hashCode() {
        return o(this.f42683a);
    }

    @NotNull
    public String toString() {
        return t(this.f42683a);
    }

    public final /* synthetic */ long v() {
        return this.f42683a;
    }
}
