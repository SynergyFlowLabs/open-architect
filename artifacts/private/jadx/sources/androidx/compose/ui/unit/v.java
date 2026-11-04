package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,122:1\n80#2:123\n85#2:125\n90#2:127\n53#2,3:129\n60#2:133\n70#2,11:136\n60#2:148\n70#2,11:155\n54#3:124\n59#3:126\n33#4:128\n57#5:132\n61#5:135\n57#5:147\n61#5:154\n22#6:134\n22#6,5:149\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n30#1:123\n107#1:125\n107#1:127\n107#1:129,3\n113#1:133\n113#1:136,11\n121#1:148\n121#1:155,11\n107#1:124\n107#1:126\n107#1:128\n113#1:132\n113#1:135\n121#1:147\n121#1:154\n113#1:134\n121#1:149,5\n*E\n"})
public final class v {
    @k7
    public static final long a(int i10, int i11) {
        return u.e((((long) i11) & k0.f265952a) | (((long) i10) << 32));
    }

    public static final long b(long j10) {
        return q.f((((j10 << 32) >> 33) & k0.f265952a) | ((j10 >> 33) << 32));
    }

    @k7
    public static /* synthetic */ void c(long j10) {
    }

    @k7
    public static final long d(long j10) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j10 >> 32)));
        return u.e((((long) Math.round(Float.intBitsToFloat((int) (j10 & k0.f265952a)))) & k0.f265952a) | (((long) iRound) << 32));
    }

    @k7
    public static final long e(int i10, long j10) {
        return u.o(j10, i10);
    }

    @k7
    @NotNull
    public static final s f(long j10) {
        return t.b(q.f42709b.b(), j10);
    }

    @k7
    public static final long g(long j10) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j10 >> 32));
        return u.e((((long) ((int) Float.intBitsToFloat((int) (j10 & k0.f265952a)))) & k0.f265952a) | (((long) iIntBitsToFloat) << 32));
    }

    @k7
    public static final long h(long j10) {
        float f10 = (int) (j10 >> 32);
        return n0.n.f((((long) Float.floatToRawIntBits((int) (j10 & k0.f265952a))) & k0.f265952a) | (Float.floatToRawIntBits(f10) << 32));
    }
}
