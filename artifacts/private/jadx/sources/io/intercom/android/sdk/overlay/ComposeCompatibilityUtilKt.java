package io.intercom.android.sdk.overlay;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.o;
import androidx.compose.runtime.t;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.n2;
import androidx.lifecycle.o0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposeCompatibilityUtilKt {
    public static final void addAvatarIconToCompose(@Nullable ComposeView composeView, @NotNull final Participant lastAdmin, @NotNull final AppConfig appConfig) {
        Intrinsics.checkNotNullParameter(lastAdmin, "lastAdmin");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        if (composeView != null && !isLegacyActivity(composeView)) {
            composeView.setContent(w.c(421691537, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt$addAvatarIconToCompose$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                    invoke(c0Var, num.intValue());
                    return Unit.f312394a;
                }

                @o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(c0 c0Var, int i10) {
                    if ((i10 & 11) == 2 && c0Var.d()) {
                        c0Var.u();
                        return;
                    }
                    AppConfig appConfig2 = appConfig;
                    final Participant participant = lastAdmin;
                    ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig2, w.e(2111948784, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt$addAvatarIconToCompose$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                            invoke(c0Var2, num.intValue());
                            return Unit.f312394a;
                        }

                        @o
                        @t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(c0 c0Var2, int i11) {
                            if ((i11 & 11) == 2 && c0Var2.d()) {
                                c0Var2.u();
                                return;
                            }
                            Avatar avatar = participant.getAvatar();
                            Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                            Boolean boolIsBot = participant.isBot();
                            Intrinsics.checkNotNullExpressionValue(boolIsBot, "isBot(...)");
                            AvatarIconKt.m173AvatarIconRd90Nhg(null, new AvatarWrapper(avatar, boolIsBot.booleanValue()), null, false, 0L, null, c0Var2, 64, 61);
                        }
                    }, c0Var, 54), c0Var, 56);
                }
            }));
        }
    }

    public static final boolean hideForLegacyActivity(@Nullable ComposeView composeView) {
        if (!isLegacyActivity(composeView)) {
            return false;
        }
        if (composeView == null) {
            return true;
        }
        composeView.setVisibility(8);
        return true;
    }

    public static final boolean isLegacyActivity(@Nullable ComposeView composeView) {
        if (composeView == null) {
            return true;
        }
        try {
            o0 o0VarA = n2.a(composeView);
            boolean z10 = (o0VarA != null ? o0VarA.getLifecycle() : null) == null;
            if (z10) {
                Injector.get().getMetricTracker().receivedInAppOnLegacyActivity();
            }
            return z10;
        } catch (Exception unused) {
            Injector.get().getMetricTracker().receivedInAppOnLegacyActivity();
            return true;
        }
    }
}
