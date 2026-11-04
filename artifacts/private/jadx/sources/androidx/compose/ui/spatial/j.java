package androidx.compose.ui.spatial;

import androidx.compose.ui.node.k;
import androidx.compose.ui.node.k1;
import androidx.compose.ui.node.l0;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.r;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nThrottledCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacksKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,529:1\n82#2:530\n159#3:531\n32#3:540\n30#4:532\n53#5,3:533\n85#5:537\n90#5:539\n80#5:541\n54#6:536\n59#6:538\n*S KotlinDebug\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacksKt\n*L\n493#1:530\n503#1:531\n511#1:540\n503#1:532\n503#1:533,3\n511#1:537\n511#1:539\n511#1:541\n511#1:536\n511#1:538\n*E\n"})
public final class j {
    @Nullable
    public static final h a(@NotNull androidx.compose.ui.node.j jVar, long j10, long j11, long j12, long j13, long j14, @Nullable float[] fArr) {
        k1 k1VarP = k.p(jVar, m1.b(2));
        l0 l0VarU = k.u(jVar);
        if (!l0VarU.J()) {
            return null;
        }
        if (l0VarU.F0() == k1VarP) {
            return new h(j10, j11, j12, j13, j14, fArr, jVar, null);
        }
        long jF = q.f(j10);
        long jG = n0.g.g((((long) Float.floatToRawIntBits(q.n(jF))) << 32) | (((long) Float.floatToRawIntBits(q.p(jF))) & k0.f265952a));
        long jA = k1VarP.n().a();
        long jG2 = r.g(l0VarU.F0().n().r0(k1VarP, jG));
        return new h(jG2, q.f((((long) (q.n(jG2) + ((int) (jA >> 32)))) << 32) | (((long) (q.p(jG2) + ((int) (jA & k0.f265952a)))) & k0.f265952a)), j12, j13, j14, fArr, jVar, null);
    }
}
