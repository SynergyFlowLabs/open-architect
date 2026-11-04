package androidx.compose.ui.util;

import androidx.collection.g3;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nInlineClassHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,92:1\n22#2:93\n22#2:94\n22#2:95\n22#2:96\n*S KotlinDebug\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n60#1:93\n65#1:94\n70#1:95\n75#1:96\n*E\n"})
public final class b {
    public static final long a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final long b(int i10, int i11) {
        return (((long) i11) & k0.f265952a) | (((long) i10) << 32);
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) ((j10 >> 32) & g3.f12256c));
    }

    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 & g3.f12256c));
    }

    public static final float e(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 & k0.f265952a));
    }

    public static final int g(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int h(long j10) {
        return (int) (j10 & k0.f265952a);
    }
}
