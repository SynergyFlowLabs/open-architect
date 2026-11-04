package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nNoteCardRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoteCardRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/NoteCardRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,70:1\n113#2:71\n*S KotlinDebug\n*F\n+ 1 NoteCardRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/NoteCardRowKt\n*L\n25#1:71\n*E\n"})
public final class NoteCardRowKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void NoteCardRow(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final Part part, @NotNull final String companyName, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(part, "part");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-746207954);
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        IntercomCardKt.IntercomCard(d5.s(a0Var2, androidx.compose.ui.unit.h.r(14), androidx.compose.ui.unit.h.r(12)), IntercomCardStyle.INSTANCE.m596conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c0VarR, IntercomCardStyle.$stable << 15, 31), androidx.compose.runtime.internal.w.e(2124316578, true, new pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt.NoteCardRow.1
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
                List<Block> blocks = part.getBlocks();
                Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
                String forename = part.getParticipant().getForename();
                Intrinsics.checkNotNullExpressionValue(forename, "getForename(...)");
                String str = companyName;
                Avatar avatar = part.getParticipant().getAvatar();
                Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                Boolean boolIsBot = part.getParticipant().isBot();
                Intrinsics.checkNotNullExpressionValue(boolIsBot, "isBot(...)");
                PostCardRowKt.m320PostContentFHprtrg(blocks, forename, str, new AvatarWrapper(avatar, boolIsBot.booleanValue()), ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m684getAction0d7_KjU()), d5.r(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(16)), c0Var2, 200712, 0);
            }
        }, c0VarR, 54), c0VarR, (IntercomCardStyle.Style.$stable << 3) | a5.S0, 0);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.e1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NoteCardRowKt.NoteCardRow$lambda$0(a0Var2, part, companyName, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoteCardRow$lambda$0(androidx.compose.ui.a0 a0Var, Part part, String companyName, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(part, "$part");
        Intrinsics.checkNotNullParameter(companyName, "$companyName");
        NoteCardRow(a0Var, part, companyName, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void NoteCardRowPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1220886807);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NoteCardRowKt.INSTANCE.m296getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.f1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NoteCardRowKt.NoteCardRowPreview$lambda$1(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoteCardRowPreview$lambda$1(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        NoteCardRowPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
