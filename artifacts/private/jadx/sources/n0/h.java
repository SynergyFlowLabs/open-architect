package n0;

import androidx.compose.runtime.k7;
import com.rabbitmq.client.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,285:1\n273#1:296\n53#2,3:286\n60#2:289\n70#2:291\n53#2,3:293\n22#3:290\n22#3:292\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n284#1:296\n30#1:286,3\n253#1:289\n254#1:291\n252#1:293,3\n253#1:290\n254#1:292\n*E\n"})
public final class h {
    @k7
    public static final long a(float f10, float f11) {
        return g.g((((long) Float.floatToRawIntBits(f11)) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final boolean b(long j10) {
        return ((((j10 & d.f332688c) ^ d.f332688c) - d.f332692g) & (-9223372034707292160L)) == 0;
    }

    @k7
    public static /* synthetic */ void c(long j10) {
    }

    public static final boolean d(long j10) {
        return (j10 & 9223372034707292159L) != d.f332689d;
    }

    @k7
    public static /* synthetic */ void e(long j10) {
    }

    public static final boolean f(long j10) {
        return (j10 & 9223372034707292159L) == d.f332689d;
    }

    @k7
    public static /* synthetic */ void g(long j10) {
    }

    @k7
    public static final long h(long j10, long j11, float f10) {
        float fR = androidx.compose.ui.util.e.r(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fR2 = androidx.compose.ui.util.e.r(Float.intBitsToFloat((int) (j10 & k0.f265952a)), Float.intBitsToFloat((int) (j11 & k0.f265952a)), f10);
        return g.g((((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(fR2)) & k0.f265952a));
    }

    public static final long i(long j10, @NotNull Function0<g> function0) {
        return (9223372034707292159L & j10) != d.f332689d ? j10 : function0.invoke().B();
    }
}
