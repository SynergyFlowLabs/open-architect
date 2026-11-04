package io.intercom.android.sdk.m5.helpcenter.ui;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$HelpCenterCollectionsScreenKt {

    @NotNull
    public static final ComposableSingletons$HelpCenterCollectionsScreenKt INSTANCE = new ComposableSingletons$HelpCenterCollectionsScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit> f177lambda1 = androidx.compose.runtime.internal.w.c(-1194363873, false, new pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionsScreenKt$lambda-1$1
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(iVar, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.lazy.i item, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
            } else {
                HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(null, c0Var, 0, 1);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit> f178lambda2 = androidx.compose.runtime.internal.w.c(493330652, false, new pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionsScreenKt$lambda-2$1
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(iVar, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.foundation.lazy.i item, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i10 & 14) == 0) {
                i10 |= c0Var.D(item) ? 4 : 2;
            }
            if ((i10 & 91) == 18 && c0Var.d()) {
                c0Var.u();
                return;
            }
            HelpCenterEmptyScreenKt.HelpCenterEmptyScreen(androidx.compose.foundation.lazy.i.c(item, androidx.compose.ui.a0.E, 0.0f, 1, null), c0Var, 0, 0);
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit> m331getLambda1$intercom_sdk_base_release() {
        return f177lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit> m332getLambda2$intercom_sdk_base_release() {
        return f178lambda2;
    }
}
