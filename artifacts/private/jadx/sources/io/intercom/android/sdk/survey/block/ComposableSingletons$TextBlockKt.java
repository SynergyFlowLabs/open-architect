package io.intercom.android.sdk.survey.block;

import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$TextBlockKt {

    @NotNull
    public static final ComposableSingletons$TextBlockKt INSTANCE = new ComposableSingletons$TextBlockKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f252lambda1 = androidx.compose.runtime.internal.w.c(-222161121, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$TextBlockKt$lambda-1$1
        private static final Block invoke$lambda$0$buildBlock(String str, String str2) {
            return new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withAlign(str).withText(str2).build();
        }

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
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarH = i6.h(aVar, 0.0f, 1, null);
            a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarH);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            Block blockInvoke$lambda$0$buildBlock = invoke$lambda$0$buildBlock("left", "Left");
            Intrinsics.checkNotNullExpressionValue(blockInvoke$lambda$0$buildBlock, "invoke$lambda$0$buildBlock(...)");
            BlockRenderTextStyle blockRenderTextStyle = null;
            BlockRenderTextStyle blockRenderTextStyle2 = null;
            TextBlockKt.TextBlock(i6.h(aVar, 0.0f, 1, null), new BlockRenderData(blockInvoke$lambda$0$buildBlock, null, null, null, null, 30, null), null, null, false, null, c0Var, 70, 60);
            Block blockInvoke$lambda$0$buildBlock2 = invoke$lambda$0$buildBlock("center", "Center");
            Intrinsics.checkNotNullExpressionValue(blockInvoke$lambda$0$buildBlock2, "invoke$lambda$0$buildBlock(...)");
            TextBlockKt.TextBlock(i6.h(aVar, 0.0f, 1, null), new BlockRenderData(blockInvoke$lambda$0$buildBlock2, null, blockRenderTextStyle, null, blockRenderTextStyle2, 30, null), null, null, false, null, c0Var, 70, 60);
            Block blockInvoke$lambda$0$buildBlock3 = invoke$lambda$0$buildBlock("right", "Right");
            Intrinsics.checkNotNullExpressionValue(blockInvoke$lambda$0$buildBlock3, "invoke$lambda$0$buildBlock(...)");
            TextBlockKt.TextBlock(i6.h(aVar, 0.0f, 1, null), new BlockRenderData(blockInvoke$lambda$0$buildBlock3, null, blockRenderTextStyle, null, blockRenderTextStyle2, 30, null), null, null, false, null, c0Var, 70, 60);
            c0Var.o();
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f253lambda2 = androidx.compose.runtime.internal.w.c(-895740540, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$TextBlockKt$lambda-2$1
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
            } else {
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TextBlockKt.INSTANCE.m453getLambda1$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m453getLambda1$intercom_sdk_base_release() {
        return f252lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m454getLambda2$intercom_sdk_base_release() {
        return f253lambda2;
    }
}
