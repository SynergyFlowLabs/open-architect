package androidx.compose.ui.node;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,227:1\n159#2:228\n30#3:229\n53#4,3:230\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n*L\n225#1:228\n225#1:229\n225#1:230,3\n*E\n"})
public final class t0 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f40001k = 8;

    public t0(@NotNull b bVar) {
        super(bVar, null);
    }

    @Override // androidx.compose.ui.node.a
    protected long d(@NotNull k1 k1Var, long j10) {
        v0 v0VarN4 = k1Var.N4();
        Intrinsics.checkNotNull(v0VarN4);
        long jU2 = v0VarN4.u2();
        float fN = androidx.compose.ui.unit.q.n(jU2);
        return n0.g.w(n0.g.g((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.q.p(jU2))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fN) << 32)), j10);
    }

    @Override // androidx.compose.ui.node.a
    @NotNull
    protected Map<androidx.compose.ui.layout.a, Integer> e(@NotNull k1 k1Var) {
        v0 v0VarN4 = k1Var.N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.l2().x();
    }

    @Override // androidx.compose.ui.node.a
    protected int i(@NotNull k1 k1Var, @NotNull androidx.compose.ui.layout.a aVar) {
        v0 v0VarN4 = k1Var.N4();
        Intrinsics.checkNotNull(v0VarN4);
        return v0VarN4.M(aVar);
    }
}
