package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PushNotificationsBannerState;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPushNotificationsBannerUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushNotificationsBannerUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/PushNotificationsBannerUseCase\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,32:1\n226#2,5:33\n*S KotlinDebug\n*F\n+ 1 PushNotificationsBannerUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/PushNotificationsBannerUseCase\n*L\n19#1:33,5\n*E\n"})
public final class PushNotificationsBannerUseCase {
    public static final int $stable = 8;

    @NotNull
    private final Function0<AppConfig> config;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    /* JADX WARN: Multi-variable type inference failed */
    public PushNotificationsBannerUseCase() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return Injector.get().getAppConfigProvider().get();
    }

    public final void invoke(@NotNull k0<ConversationClientState> clientState, boolean z10) {
        ConversationClientState value;
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        do {
            value = clientState.getValue();
        } while (!clientState.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, (z10 || this.intercomDataLayer.getPushNotificationsBannerDismissed().getValue().booleanValue()) ? null : new PushNotificationsBannerState(this.config.invoke().getAskUsersToAllowNotifications()), null, 3145727, null)));
    }

    public PushNotificationsBannerUseCase(@NotNull IntercomDataLayer intercomDataLayer, @NotNull Function0<AppConfig> config) {
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(config, "config");
        this.intercomDataLayer = intercomDataLayer;
        this.config = config;
    }

    public /* synthetic */ PushNotificationsBannerUseCase(IntercomDataLayer intercomDataLayer, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getDataLayer() : intercomDataLayer, (i10 & 2) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.usecase.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PushNotificationsBannerUseCase._init_$lambda$0();
            }
        } : function0);
    }
}
