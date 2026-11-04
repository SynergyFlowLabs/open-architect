package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class ActiveBot {
    public static final int $stable = 8;

    @c("has_ai")
    private final boolean isAi;

    @c("has_customized_identity")
    private final boolean isIdentityCustomized;

    @c("participant")
    @NotNull
    private final Participant.Builder participant;

    @c("streaming_part")
    @Nullable
    private final StreamingPart streamingPart;

    @c("use_bot_ux")
    private final boolean useBotUx;

    public ActiveBot() {
        this(null, false, false, false, null, 31, null);
    }

    public static /* synthetic */ ActiveBot copy$default(ActiveBot activeBot, Participant.Builder builder, boolean z10, boolean z11, boolean z12, StreamingPart streamingPart, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            builder = activeBot.participant;
        }
        if ((i10 & 2) != 0) {
            z10 = activeBot.isAi;
        }
        if ((i10 & 4) != 0) {
            z11 = activeBot.useBotUx;
        }
        if ((i10 & 8) != 0) {
            z12 = activeBot.isIdentityCustomized;
        }
        if ((i10 & 16) != 0) {
            streamingPart = activeBot.streamingPart;
        }
        StreamingPart streamingPart2 = streamingPart;
        boolean z13 = z11;
        return activeBot.copy(builder, z10, z13, z12, streamingPart2);
    }

    @NotNull
    public final Participant.Builder component1() {
        return this.participant;
    }

    public final boolean component2() {
        return this.isAi;
    }

    public final boolean component3() {
        return this.useBotUx;
    }

    public final boolean component4() {
        return this.isIdentityCustomized;
    }

    @Nullable
    public final StreamingPart component5() {
        return this.streamingPart;
    }

    @NotNull
    public final ActiveBot copy(@NotNull Participant.Builder participant, boolean z10, boolean z11, boolean z12, @Nullable StreamingPart streamingPart) {
        Intrinsics.checkNotNullParameter(participant, "participant");
        return new ActiveBot(participant, z10, z11, z12, streamingPart);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveBot)) {
            return false;
        }
        ActiveBot activeBot = (ActiveBot) obj;
        return Intrinsics.areEqual(this.participant, activeBot.participant) && this.isAi == activeBot.isAi && this.useBotUx == activeBot.useBotUx && this.isIdentityCustomized == activeBot.isIdentityCustomized && Intrinsics.areEqual(this.streamingPart, activeBot.streamingPart);
    }

    @NotNull
    public final Participant.Builder getParticipant() {
        return this.participant;
    }

    @Nullable
    public final StreamingPart getStreamingPart() {
        return this.streamingPart;
    }

    public final boolean getUseBotUx() {
        return this.useBotUx;
    }

    public int hashCode() {
        int iHashCode = ((((((this.participant.hashCode() * 31) + Boolean.hashCode(this.isAi)) * 31) + Boolean.hashCode(this.useBotUx)) * 31) + Boolean.hashCode(this.isIdentityCustomized)) * 31;
        StreamingPart streamingPart = this.streamingPart;
        return iHashCode + (streamingPart == null ? 0 : streamingPart.hashCode());
    }

    public final boolean isAi() {
        return this.isAi;
    }

    public final boolean isIdentityCustomized() {
        return this.isIdentityCustomized;
    }

    @NotNull
    public String toString() {
        return "ActiveBot(participant=" + this.participant + ", isAi=" + this.isAi + ", useBotUx=" + this.useBotUx + ", isIdentityCustomized=" + this.isIdentityCustomized + ", streamingPart=" + this.streamingPart + ')';
    }

    public ActiveBot(@NotNull Participant.Builder participant, boolean z10, boolean z11, boolean z12, @Nullable StreamingPart streamingPart) {
        Intrinsics.checkNotNullParameter(participant, "participant");
        this.participant = participant;
        this.isAi = z10;
        this.useBotUx = z11;
        this.isIdentityCustomized = z12;
        this.streamingPart = streamingPart;
    }

    public /* synthetic */ ActiveBot(Participant.Builder builder, boolean z10, boolean z11, boolean z12, StreamingPart streamingPart, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Participant.Builder() : builder, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? null : streamingPart);
    }
}
