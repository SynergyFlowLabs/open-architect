package io.intercom.android.sdk.survey.block;

import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$AttachmentBlockKt {

    @NotNull
    public static final ComposableSingletons$AttachmentBlockKt INSTANCE = new ComposableSingletons$AttachmentBlockKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f245lambda1 = androidx.compose.runtime.internal.w.c(-27709551, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$AttachmentBlockKt$lambda-1$1
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
            Block blockBuild = new Block.Builder().withAttachments(CollectionsKt.listOf(new BlockAttachment.Builder().withName("Attachment Name.type").build())).build();
            Intrinsics.checkNotNullExpressionValue(blockBuild, "build(...)");
            AttachmentBlockKt.AttachmentBlock(null, new BlockRenderData(blockBuild, null, null, null, null, 30, null), false, c0Var, 448, 1);
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m446getLambda1$intercom_sdk_base_release() {
        return f245lambda1;
    }
}
