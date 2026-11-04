package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.ni;
import io.intercom.android.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$MessageComposerKt {

    @NotNull
    public static final ComposableSingletons$MessageComposerKt INSTANCE = new ComposableSingletons$MessageComposerKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f127lambda1 = androidx.compose.runtime.internal.w.c(-1322271876, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-1$1
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
                ni.o(u0.e.c(R.drawable.intercom_ic_up_arrow, c0Var, 0), null, i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), 0L, c0Var, 440, 8);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f128lambda2 = androidx.compose.runtime.internal.w.c(824847344, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-2$1
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
            ni.o(u0.e.c(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close, c0Var, 0), null, i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), 0L, c0Var, 440, 8);
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f129lambda3 = androidx.compose.runtime.internal.w.c(-482413583, false, ComposableSingletons$MessageComposerKt$lambda3$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f130lambda4 = androidx.compose.runtime.internal.w.c(-397379838, false, ComposableSingletons$MessageComposerKt$lambda4$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f131lambda5 = androidx.compose.runtime.internal.w.c(-1642511470, false, ComposableSingletons$MessageComposerKt$lambda5$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-6, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f132lambda6 = androidx.compose.runtime.internal.w.c(-295862925, false, ComposableSingletons$MessageComposerKt$lambda6$1.INSTANCE);

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m247getLambda1$intercom_sdk_base_release() {
        return f127lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m248getLambda2$intercom_sdk_base_release() {
        return f128lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m249getLambda3$intercom_sdk_base_release() {
        return f129lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m250getLambda4$intercom_sdk_base_release() {
        return f130lambda4;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m251getLambda5$intercom_sdk_base_release() {
        return f131lambda5;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-6$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m252getLambda6$intercom_sdk_base_release() {
        return f132lambda6;
    }
}
