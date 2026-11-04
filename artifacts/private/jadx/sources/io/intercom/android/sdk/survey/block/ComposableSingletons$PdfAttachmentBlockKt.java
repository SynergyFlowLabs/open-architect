package io.intercom.android.sdk.survey.block;

import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.ni;
import androidx.compose.material3.os;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import coil.compose.AsyncImagePainter;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$PdfAttachmentBlockKt {

    @NotNull
    public static final ComposableSingletons$PdfAttachmentBlockKt INSTANCE = new ComposableSingletons$PdfAttachmentBlockKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static pj.o<coil.compose.c0, AsyncImagePainter.State.Loading, androidx.compose.runtime.c0, Integer, Unit> f248lambda1 = androidx.compose.runtime.internal.w.c(-1974725621, false, new pj.o<coil.compose.c0, AsyncImagePainter.State.Loading, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$PdfAttachmentBlockKt$lambda-1$1
        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(coil.compose.c0 c0Var, AsyncImagePainter.State.Loading loading, androidx.compose.runtime.c0 c0Var2, Integer num) {
            invoke(c0Var, loading, c0Var2, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(coil.compose.c0 SubcomposeAsyncImage, AsyncImagePainter.State.Loading it, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i10 & 641) == 128 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.graphics.q0.a aVar2 = androidx.compose.ui.graphics.q0.f38131b;
            androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(aVar, androidx.compose.ui.graphics.q0.w(aVar2.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarD);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
            y7.n(c0VarD, a1VarK, aVar3.e());
            y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            os.F(i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.w(), 0.0f, 0L, 0, 0.0f, c0Var, 54, 60);
            c0Var.o();
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static pj.o<coil.compose.c0, AsyncImagePainter.State.Error, androidx.compose.runtime.c0, Integer, Unit> f249lambda2 = androidx.compose.runtime.internal.w.c(-323165503, false, new pj.o<coil.compose.c0, AsyncImagePainter.State.Error, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$PdfAttachmentBlockKt$lambda-2$1
        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(coil.compose.c0 c0Var, AsyncImagePainter.State.Error error, androidx.compose.runtime.c0 c0Var2, Integer num) {
            invoke(c0Var, error, c0Var2, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(coil.compose.c0 SubcomposeAsyncImage, AsyncImagePainter.State.Error it, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i10 & 641) == 128 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.graphics.q0.a aVar2 = androidx.compose.ui.graphics.q0.f38131b;
            androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(aVar, androidx.compose.ui.graphics.q0.w(aVar2.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarD);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
            y7.n(c0VarD, a1VarK, aVar3.e());
            y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            ni.o(u0.e.c(R.drawable.intercom_ic_reload, c0Var, 0), "Reload", i6.w(aVar, androidx.compose.ui.unit.h.r(24)), aVar2.w(), c0Var, 3512, 0);
            c0Var.o();
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f250lambda3 = androidx.compose.runtime.internal.w.c(-2127457534, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$PdfAttachmentBlockKt$lambda-3$1
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
            Block blockBuild = new Block.Builder().withAttachments(CollectionsKt.listOf(new BlockAttachment.Builder().withContentType("application/pdf").withName("Attachment Name name name name     .pdf").withHumanFileSize("100 KB").build())).build();
            Intrinsics.checkNotNullExpressionValue(blockBuild, "build(...)");
            AttachmentBlockKt.AttachmentBlock(null, new BlockRenderData(blockBuild, null, null, null, null, 30, null), false, c0Var, 448, 1);
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f251lambda4 = androidx.compose.runtime.internal.w.c(-1397819843, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$PdfAttachmentBlockKt$lambda-4$1
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
                u10.c(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$PdfAttachmentBlockKt.INSTANCE.m451getLambda3$intercom_sdk_base_release(), c0Var, 12582912, 127);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final pj.o<coil.compose.c0, AsyncImagePainter.State.Loading, androidx.compose.runtime.c0, Integer, Unit> m449getLambda1$intercom_sdk_base_release() {
        return f248lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final pj.o<coil.compose.c0, AsyncImagePainter.State.Error, androidx.compose.runtime.c0, Integer, Unit> m450getLambda2$intercom_sdk_base_release() {
        return f249lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m451getLambda3$intercom_sdk_base_release() {
        return f250lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m452getLambda4$intercom_sdk_base_release() {
        return f251lambda4;
    }
}
