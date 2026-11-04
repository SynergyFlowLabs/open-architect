package androidx.compose.ui.layout;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n1#1,150:1\n41#1:155\n46#1:158\n41#1:165\n46#1:168\n41#1:170\n46#1:173\n41#1:179\n46#1:182\n41#1:188\n46#1:191\n60#2:151\n70#2:153\n60#2:156\n70#2:159\n53#2,3:162\n60#2:166\n70#2:169\n60#2:171\n70#2:174\n53#2,3:176\n60#2:180\n70#2:183\n53#2,3:185\n60#2:189\n70#2:192\n53#2,3:194\n22#3:152\n22#3:154\n22#3:157\n22#3:160\n22#3:167\n22#3:172\n22#3:181\n22#3:190\n31#4:161\n31#4:175\n31#4:184\n31#4:193\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n48#1:155\n50#1:158\n56#1:165\n56#1:168\n63#1:170\n63#1:173\n70#1:179\n70#1:182\n72#1:188\n72#1:191\n41#1:151\n46#1:153\n48#1:156\n50#1:159\n56#1:162,3\n56#1:166\n56#1:169\n63#1:171\n63#1:174\n63#1:176,3\n70#1:180\n70#1:183\n70#1:185,3\n72#1:189\n72#1:192\n80#1:194,3\n41#1:152\n46#1:154\n48#1:157\n50#1:160\n56#1:167\n63#1:172\n70#1:181\n72#1:190\n56#1:161\n63#1:175\n70#1:184\n80#1:193\n*E\n"})
public final class w2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f39572b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f39573c = e((((long) Float.floatToRawIntBits(Float.NaN)) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & com.rabbitmq.client.k0.f265952a));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f39574a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void b() {
        }

        public final long a() {
            return w2.f39573c;
        }

        private a() {
        }
    }

    private /* synthetic */ w2(long j10) {
        this.f39574a = j10;
    }

    public static final /* synthetic */ w2 b(long j10) {
        return new w2(j10);
    }

    @k7
    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @k7
    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
    }

    public static long e(long j10) {
        return j10;
    }

    public static final long f(long j10, float f10, float f11) {
        return e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a));
    }

    public static /* synthetic */ long g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j10));
        }
        return f(j10, f10, f11);
    }

    @k7
    public static final long h(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) / f10;
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a));
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof w2) && j10 == ((w2) obj).s();
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
        return Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
    }

    public static int p(long j10) {
        return Long.hashCode(j10);
    }

    @k7
    public static final long q(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) * f10;
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a));
    }

    @NotNull
    public static String r(long j10) {
        return "ScaleFactor(" + Float.intBitsToFloat((int) (j10 >> 32)) + ", " + Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) + ')';
    }

    public boolean equals(Object obj) {
        return i(this.f39574a, obj);
    }

    public int hashCode() {
        return p(this.f39574a);
    }

    public final long k() {
        return this.f39574a;
    }

    public final /* synthetic */ long s() {
        return this.f39574a;
    }

    @NotNull
    public String toString() {
        return r(this.f39574a);
    }
}
