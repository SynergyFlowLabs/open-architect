package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.utils.SoundPlayer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class SoundEffectsUseCase {
    public static final int $stable = 8;

    @NotNull
    private final AppConfig appConfig;

    @NotNull
    private final SoundPlayer soundPlayer;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Action.values().length];
            try {
                iArr[Action.MESSAGE_SENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Action.ADMIN_MESSAGE_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Action.OPERATOR_MESSAGE_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Action.MESSAGE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SoundEffectsUseCase(@NotNull AppConfig appConfig, @NotNull SoundPlayer soundPlayer) {
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(soundPlayer, "soundPlayer");
        this.appConfig = appConfig;
        this.soundPlayer = soundPlayer;
    }

    @NotNull
    public final AppConfig getAppConfig() {
        return this.appConfig;
    }

    @NotNull
    public final SoundPlayer getSoundPlayer() {
        return this.soundPlayer;
    }

    public final void invoke$intercom_sdk_base_release(@NotNull Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.appConfig.isAudioEnabled()) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
            if (i10 == 1) {
                this.soundPlayer.playMessageSentSound();
                return;
            }
            if (i10 == 2) {
                this.soundPlayer.playAdminMessageReceivedSound();
            } else if (i10 == 3) {
                this.soundPlayer.playOperatorMessageReceivedSound();
            } else {
                if (i10 != 4) {
                    throw new k0();
                }
                this.soundPlayer.playMessageFailedSound();
            }
        }
    }

    public /* synthetic */ SoundEffectsUseCase(AppConfig appConfig, SoundPlayer soundPlayer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getAppConfigProvider().get() : appConfig, soundPlayer);
    }
}
