package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.i6;
import androidx.compose.material3.ni;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$PushNotificationsBannerKt {

    @NotNull
    public static final ComposableSingletons$PushNotificationsBannerKt INSTANCE = new ComposableSingletons$PushNotificationsBannerKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f108lambda1 = androidx.compose.runtime.internal.w.c(772935366, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$PushNotificationsBannerKt$lambda-1$1
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
                ni.o(u0.e.c(R.drawable.intercom_ic_close, c0Var, 0), u0.i.d(io.intercom.android.sdk.R.string.intercom_close, c0Var, 0), i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m716getReminderTextColor0d7_KjU(), c0Var, 392, 0);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f109lambda2 = androidx.compose.runtime.internal.w.c(-353143684, false, ComposableSingletons$PushNotificationsBannerKt$lambda2$1.INSTANCE);

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m221getLambda1$intercom_sdk_base_release() {
        return f108lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m222getLambda2$intercom_sdk_base_release() {
        return f109lambda2;
    }
}
