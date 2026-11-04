package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,171:1\n80#2:172\n80#2:173\n53#2,3:175\n60#2:179\n70#2:182\n53#2,3:184\n60#2:188\n70#2:191\n53#2,3:193\n60#2:197\n70#2:200\n53#2,3:202\n60#2:206\n70#2:209\n53#2,3:211\n60#2:215\n70#2,11:222\n30#3:174\n30#3:183\n30#3:192\n30#3:201\n30#3:210\n65#4:178\n69#4:181\n65#4:187\n69#4:190\n65#4:196\n69#4:199\n65#4:205\n69#4:208\n65#4:214\n69#4:221\n22#5:180\n22#5:189\n22#5:198\n22#5:207\n22#5,5:216\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n32#1:172\n156#1:173\n159#1:175,3\n161#1:179\n161#1:182\n161#1:184,3\n163#1:188\n163#1:191\n163#1:193,3\n165#1:197\n165#1:200\n165#1:202,3\n167#1:206\n167#1:209\n167#1:211,3\n170#1:215\n170#1:222,11\n159#1:174\n161#1:183\n163#1:192\n165#1:201\n167#1:210\n161#1:178\n161#1:181\n163#1:187\n163#1:190\n165#1:196\n165#1:199\n167#1:205\n167#1:208\n170#1:214\n170#1:221\n161#1:180\n163#1:189\n165#1:198\n167#1:207\n170#1:216,5\n*E\n"})
public final class r {
    @k7
    public static final long a(int i10, int i11) {
        return q.f((((long) i11) & k0.f265952a) | (((long) i10) << 32));
    }

    @k7
    public static final long b(long j10, long j11, float f10) {
        return q.f((((long) androidx.compose.ui.util.e.s(q.n(j10), q.n(j11), f10)) << 32) | (((long) androidx.compose.ui.util.e.s(q.p(j10), q.p(j11), f10)) & k0.f265952a));
    }

    @k7
    public static final long c(long j10, long j11) {
        return n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) - q.n(j11))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & k0.f265952a)) - q.p(j11))) & k0.f265952a));
    }

    @k7
    public static final long d(long j10, long j11) {
        return n0.g.g((((long) Float.floatToRawIntBits(q.n(j10) - Float.intBitsToFloat((int) (j11 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(q.p(j10) - Float.intBitsToFloat((int) (j11 & k0.f265952a)))) & k0.f265952a));
    }

    @k7
    public static final long e(long j10, long j11) {
        return n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) + q.n(j11))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & k0.f265952a)) + q.p(j11))) & k0.f265952a));
    }

    @k7
    public static final long f(long j10, long j11) {
        return n0.g.g((((long) Float.floatToRawIntBits(q.n(j10) + Float.intBitsToFloat((int) (j11 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(q.p(j10) + Float.intBitsToFloat((int) (j11 & k0.f265952a)))) & k0.f265952a));
    }

    @k7
    public static final long g(long j10) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j10 >> 32)));
        return q.f((((long) Math.round(Float.intBitsToFloat((int) (j10 & k0.f265952a)))) & k0.f265952a) | (((long) iRound) << 32));
    }

    @k7
    public static final long h(long j10) {
        float fN = q.n(j10);
        return n0.g.g((((long) Float.floatToRawIntBits(q.p(j10))) & k0.f265952a) | (Float.floatToRawIntBits(fN) << 32));
    }
}
