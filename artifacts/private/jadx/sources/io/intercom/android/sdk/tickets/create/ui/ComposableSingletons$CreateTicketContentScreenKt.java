package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.foundation.layout.x5;
import androidx.compose.material3.q50;
import androidx.compose.ui.text.font.v0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$CreateTicketContentScreenKt {

    @NotNull
    public static final ComposableSingletons$CreateTicketContentScreenKt INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> f317lambda1 = androidx.compose.runtime.internal.w.c(-1125060472, false, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-1$1
        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(x5Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(x5 TextButton, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            q50.t(u0.i.d(R.string.intercom_cancel, c0Var, 0), null, 0L, null, 0L, null, v0.f41742b.o(), null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var, IntercomTheme.$stable).getType04Point5(), c0Var, 1572864, 0, 131006);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f318lambda2 = androidx.compose.runtime.internal.w.c(458285887, false, ComposableSingletons$CreateTicketContentScreenKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f319lambda3 = androidx.compose.runtime.internal.w.c(-426521688, false, ComposableSingletons$CreateTicketContentScreenKt$lambda3$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f320lambda4 = androidx.compose.runtime.internal.w.c(125945436, false, ComposableSingletons$CreateTicketContentScreenKt$lambda4$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f321lambda5 = androidx.compose.runtime.internal.w.c(-259524439, false, ComposableSingletons$CreateTicketContentScreenKt$lambda5$1.INSTANCE);

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final pj.n<x5, androidx.compose.runtime.c0, Integer, Unit> m550getLambda1$intercom_sdk_base_release() {
        return f317lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m551getLambda2$intercom_sdk_base_release() {
        return f318lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m552getLambda3$intercom_sdk_base_release() {
        return f319lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m553getLambda4$intercom_sdk_base_release() {
        return f320lambda4;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m554getLambda5$intercom_sdk_base_release() {
        return f321lambda5;
    }
}
