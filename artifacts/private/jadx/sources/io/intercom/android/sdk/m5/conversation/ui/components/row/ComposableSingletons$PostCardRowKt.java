package io.intercom.android.sdk.m5.conversation.ui.components.row;

import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$PostCardRowKt {

    @NotNull
    public static final ComposableSingletons$PostCardRowKt INSTANCE = new ComposableSingletons$PostCardRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f159lambda1 = androidx.compose.runtime.internal.w.c(-1591302201, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$PostCardRowKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            Part partBuild = new Part.Builder().withParticipantIsAdmin(false).withBlocks(CollectionsKt.listOf((Object[]) new Block.Builder[]{BubbleMessageRowKt.getParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock()})).withStyle(io.intercom.android.sdk.models.MessageStyle.POST).build();
            partBuild.setParticipant(Participant.create("", "Paul", "user", "", Avatar.create("", "PK"), Boolean.FALSE));
            Intrinsics.checkNotNullExpressionValue(partBuild, "apply(...)");
            PostCardRowKt.PostCardRow(null, partBuild, "SDK Test App", c0Var, 448, 1);
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m297getLambda1$intercom_sdk_base_release() {
        return f159lambda1;
    }
}
