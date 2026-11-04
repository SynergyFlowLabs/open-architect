package n0;

import androidx.compose.runtime.k7;
import com.rabbitmq.client.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,187:1\n136#1:191\n53#2,3:188\n60#2:192\n70#2:194\n53#2,3:196\n60#2:199\n70#2:201\n53#2,3:203\n22#3:193\n22#3:195\n22#3:200\n30#4:202\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n147#1:191\n33#1:188,3\n166#1:192\n167#1:194\n165#1:196,3\n186#1:199\n186#1:201\n186#1:203,3\n166#1:193\n167#1:195\n186#1:200\n186#1:202\n*E\n"})
public final class o {
    @k7
    public static final long a(float f10, float f11) {
        return n.f((((long) Float.floatToRawIntBits(f11)) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final long b(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f;
        return g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & k0.f265952a)) / 2.0f)) & k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @k7
    public static /* synthetic */ void c(long j10) {
    }

    public static final boolean d(long j10) {
        return j10 != d.f332689d;
    }

    @k7
    public static /* synthetic */ void e(long j10) {
    }

    public static final boolean f(long j10) {
        return j10 == d.f332689d;
    }

    @k7
    public static /* synthetic */ void g(long j10) {
    }

    @k7
    public static final long h(long j10, long j11, float f10) {
        float fR = androidx.compose.ui.util.e.r(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fR2 = androidx.compose.ui.util.e.r(Float.intBitsToFloat((int) (j10 & k0.f265952a)), Float.intBitsToFloat((int) (j11 & k0.f265952a)), f10);
        return n.f((((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(fR2)) & k0.f265952a));
    }

    public static final long i(long j10, @NotNull Function0<n> function0) {
        return j10 != d.f332689d ? j10 : function0.invoke().y();
    }

    @k7
    public static final long j(double d10, long j10) {
        return n.w(j10, (float) d10);
    }

    @k7
    public static final long k(float f10, long j10) {
        return n.w(j10, f10);
    }

    @k7
    public static final long l(int i10, long j10) {
        return n.w(j10, i10);
    }

    @k7
    @NotNull
    public static final j m(long j10) {
        return k.c(g.f332700b.e(), j10);
    }
}
