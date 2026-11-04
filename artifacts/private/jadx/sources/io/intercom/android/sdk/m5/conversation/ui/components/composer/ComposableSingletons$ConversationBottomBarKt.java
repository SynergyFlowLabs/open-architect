package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.u10;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$ConversationBottomBarKt {

    @NotNull
    public static final ComposableSingletons$ConversationBottomBarKt INSTANCE = new ComposableSingletons$ConversationBottomBarKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f120lambda1 = androidx.compose.runtime.internal.w.c(-2128348862, false, ComposableSingletons$ConversationBottomBarKt$lambda1$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f121lambda2 = androidx.compose.runtime.internal.w.c(-1450542915, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$ConversationBottomBarKt$lambda-2$1
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
                u10.c(androidx.compose.ui.a0.E, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ConversationBottomBarKt.INSTANCE.m240getLambda1$intercom_sdk_base_release(), c0Var, 12582918, okhttp3.internal.ws.g.f334652s);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f122lambda3 = androidx.compose.runtime.internal.w.c(1085707115, false, ComposableSingletons$ConversationBottomBarKt$lambda3$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f123lambda4 = androidx.compose.runtime.internal.w.c(-753965082, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$ConversationBottomBarKt$lambda-4$1
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
                u10.c(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(500)), null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ConversationBottomBarKt.INSTANCE.m242getLambda3$intercom_sdk_base_release(), c0Var, 12582918, okhttp3.internal.ws.g.f334652s);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m240getLambda1$intercom_sdk_base_release() {
        return f120lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m241getLambda2$intercom_sdk_base_release() {
        return f121lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m242getLambda3$intercom_sdk_base_release() {
        return f122lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m243getLambda4$intercom_sdk_base_release() {
        return f123lambda4;
    }
}
