package io.intercom.android.sdk.survey.block;

import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class LinkListBlockKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: LinkListBlock-cf5BqRc, reason: not valid java name */
    public static final void m456LinkListBlockcf5BqRc(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final Block block, final long j10, @NotNull final String conversationId, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1519911583);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        IntercomCardKt.IntercomCard(a0Var2, IntercomCardStyle.INSTANCE.m596conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c0VarR, IntercomCardStyle.$stable << 15, 31), androidx.compose.runtime.internal.w.e(-46303019, true, new pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.LinkListBlockKt$LinkListBlock$1
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
                } else {
                    BlockViewKt.m445RenderLegacyBlockssW7UJKQ(block, j10, null, conversationId, c0Var2, 8, 4);
                }
            }
        }, c0VarR, 54), c0VarR, (i10 & 14) | a5.S0 | (IntercomCardStyle.Style.$stable << 3), 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.block.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkListBlockKt.LinkListBlock_cf5BqRc$lambda$0(a0Var2, block, j10, conversationId, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkListBlock_cf5BqRc$lambda$0(androidx.compose.ui.a0 a0Var, Block block, long j10, String conversationId, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(conversationId, "$conversationId");
        m456LinkListBlockcf5BqRc(a0Var, block, j10, conversationId, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
