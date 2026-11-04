package androidx.compose.ui.layout;

import androidx.compose.runtime.k7;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,150:1\n87#1:154\n31#1:183\n53#2,3:151\n60#2:156\n70#2:160\n53#2,3:163\n60#2:167\n70#2:171\n53#2,3:174\n60#2:178\n70#2:181\n53#2,3:184\n57#3:155\n61#3:159\n57#3:166\n61#3:170\n22#4:157\n22#4:168\n22#4:179\n22#4:182\n41#5:158\n46#5:161\n41#5:169\n46#5:172\n41#5:177\n46#5:180\n33#6:162\n33#6:173\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n99#1:154\n145#1:183\n31#1:151,3\n109#1:156\n109#1:160\n109#1:163,3\n128#1:167\n128#1:171\n128#1:174,3\n146#1:178\n147#1:181\n145#1:184,3\n109#1:155\n109#1:159\n128#1:166\n128#1:170\n109#1:157\n128#1:168\n146#1:179\n147#1:182\n109#1:158\n109#1:161\n128#1:169\n128#1:172\n146#1:177\n147#1:180\n109#1:162\n128#1:173\n*E\n"})
public final class x2 {
    @k7
    public static final long a(float f10, float f11) {
        return w2.e((((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    @k7
    public static final long b(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) / Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a));
        return n0.n.f((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a));
    }

    public static final boolean c(long j10) {
        return j10 != w2.f39572b.a();
    }

    @k7
    public static /* synthetic */ void d(long j10) {
    }

    public static final boolean e(long j10) {
        return j10 == w2.f39572b.a();
    }

    @k7
    public static /* synthetic */ void f(long j10) {
    }

    @k7
    public static final long g(long j10, long j11, float f10) {
        float fR = androidx.compose.ui.util.e.r(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fR2 = androidx.compose.ui.util.e.r(Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)), Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)), f10);
        return w2.e((((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(fR2)) & com.rabbitmq.client.k0.f265952a));
    }

    public static final long h(long j10, @NotNull Function0<w2> function0) {
        return j10 != w2.f39572b.a() ? j10 : function0.invoke().s();
    }

    @k7
    public static final long i(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) * Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a));
        return n0.n.f((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & com.rabbitmq.client.k0.f265952a));
    }

    @k7
    public static final long j(long j10, long j11) {
        return i(j11, j10);
    }
}
