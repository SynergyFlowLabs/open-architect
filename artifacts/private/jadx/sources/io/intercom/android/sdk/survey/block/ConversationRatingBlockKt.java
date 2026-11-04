package io.intercom.android.sdk.survey.block;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ConversationRatingBlockKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: ConversationRatingBlock-cf5BqRc, reason: not valid java name */
    public static final void m455ConversationRatingBlockcf5BqRc(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final BlockRenderData blockRenderData, final long j10, @NotNull final String conversationId, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(blockRenderData, "blockRenderData");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1714913761);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        IntercomCardKt.IntercomCard(i6.h(a0Var2, 0.0f, 1, null), IntercomCardStyle.INSTANCE.m596conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c0VarR, IntercomCardStyle.$stable << 15, 31), androidx.compose.runtime.internal.w.e(1828616789, true, new pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.ConversationRatingBlockKt$ConversationRatingBlock$1
            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(m0Var, c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.foundation.layout.m0 IntercomCard, androidx.compose.runtime.c0 c0Var2, int i12) {
                Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                if ((i12 & 81) == 16 && c0Var2.d()) {
                    c0Var2.u();
                    return;
                }
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                androidx.compose.ui.a0 a0VarH = i6.h(aVar, 0.0f, 1, null);
                androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
                BlockRenderData blockRenderData2 = blockRenderData;
                long j11 = j10;
                String str = conversationId;
                a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                b1 b1VarK = c0Var2.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, a0VarH);
                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A);
                } else {
                    c0Var2.l();
                }
                androidx.compose.runtime.c0 c0VarD = y7.d(c0Var2);
                y7.n(c0VarD, a1VarK, aVar2.e());
                y7.n(c0VarD, b1VarK, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar2.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                BlockViewKt.m445RenderLegacyBlockssW7UJKQ(blockRenderData2.getBlock(), j11, d5.r(aVar, androidx.compose.ui.unit.h.r(16)), str, c0Var2, 392, 0);
                c0Var2.o();
            }
        }, c0VarR, 54), c0VarR, (IntercomCardStyle.Style.$stable << 3) | a5.S0, 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationRatingBlockKt.ConversationRatingBlock_cf5BqRc$lambda$0(a0Var2, blockRenderData, j10, conversationId, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationRatingBlock_cf5BqRc$lambda$0(androidx.compose.ui.a0 a0Var, BlockRenderData blockRenderData, long j10, String conversationId, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(blockRenderData, "$blockRenderData");
        Intrinsics.checkNotNullParameter(conversationId, "$conversationId");
        m455ConversationRatingBlockcf5BqRc(a0Var, blockRenderData, j10, conversationId, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
