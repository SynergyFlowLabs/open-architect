package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.foundation.layout.i6;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$CreateTicketCardKt {

    @NotNull
    public static final ComposableSingletons$CreateTicketCardKt INSTANCE = new ComposableSingletons$CreateTicketCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f315lambda1 = androidx.compose.runtime.internal.w.c(-1627499370, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketCardKt$lambda-1$1
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
            androidx.compose.ui.a0 a0VarH = i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null);
            Block block = CreateTicketCardKt.sampleBlock;
            Intrinsics.checkNotNullExpressionValue(block, "access$getSampleBlock$p(...)");
            CreateTicketCardKt.CreateTicketCard(a0VarH, new BlockRenderData(block, null, null, null, null, 30, null), true, null, c0Var, 454, 8);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f316lambda2 = androidx.compose.runtime.internal.w.c(-1398017791, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketCardKt$lambda-2$1
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
            androidx.compose.ui.a0 a0VarH = i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null);
            Block block = CreateTicketCardKt.sampleBlock;
            Intrinsics.checkNotNullExpressionValue(block, "access$getSampleBlock$p(...)");
            CreateTicketCardKt.CreateTicketCard(a0VarH, new BlockRenderData(block, null, null, null, null, 30, null), false, null, c0Var, 454, 8);
        }
    });

    static {
        int i10 = 4 | 0;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m548getLambda1$intercom_sdk_base_release() {
        return f315lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m549getLambda2$intercom_sdk_base_release() {
        return f316lambda2;
    }
}
