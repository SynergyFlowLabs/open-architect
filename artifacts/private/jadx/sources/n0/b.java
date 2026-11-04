package n0;

import androidx.compose.runtime.k7;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,188:1\n53#2,3:189\n60#2:192\n70#2:194\n53#2,3:196\n22#3:193\n22#3:195\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n33#1:189,3\n183#1:192\n184#1:194\n182#1:196,3\n183#1:193\n184#1:195\n*E\n"})
public final class b {
    @k7
    public static final long a(float f10, float f11) {
        return a.e((((long) Float.floatToRawIntBits(f11)) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static /* synthetic */ long b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        return a.e((((long) Float.floatToRawIntBits(f11)) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }

    @k7
    public static final long c(long j10, long j11, float f10) {
        float fR = androidx.compose.ui.util.e.r(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fR2 = androidx.compose.ui.util.e.r(Float.intBitsToFloat((int) (j10 & k0.f265952a)), Float.intBitsToFloat((int) (j11 & k0.f265952a)), f10);
        return a.e((((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(fR2)) & k0.f265952a));
    }
}
