package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ConversationUiState {

    @w0(parameters = 0)
    public static final class Error implements ConversationUiState {
        public static final int $stable = 8;
        private final boolean showCta;

        @NotNull
        private final TopAppBarUiState topAppBarUiState;

        public Error(boolean z10, @NotNull TopAppBarUiState topAppBarUiState) {
            Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
            this.showCta = z10;
            this.topAppBarUiState = topAppBarUiState;
        }

        public static /* synthetic */ Error copy$default(Error error, boolean z10, TopAppBarUiState topAppBarUiState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = error.showCta;
            }
            if ((i10 & 2) != 0) {
                topAppBarUiState = error.topAppBarUiState;
            }
            return error.copy(z10, topAppBarUiState);
        }

        public final boolean component1() {
            return this.showCta;
        }

        @NotNull
        public final TopAppBarUiState component2() {
            return this.topAppBarUiState;
        }

        @NotNull
        public final Error copy(boolean z10, @NotNull TopAppBarUiState topAppBarUiState) {
            Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
            return new Error(z10, topAppBarUiState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.showCta == error.showCta && Intrinsics.areEqual(this.topAppBarUiState, error.topAppBarUiState);
        }

        public final boolean getShowCta() {
            return this.showCta;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ConversationUiState
        @NotNull
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.showCta) * 31) + this.topAppBarUiState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(showCta=" + this.showCta + ", topAppBarUiState=" + this.topAppBarUiState + ')';
        }
    }

    @w0(parameters = 0)
    public static final class Loading implements ConversationUiState {
        public static final int $stable = 8;

        @NotNull
        private final TopAppBarUiState topAppBarUiState;

        public Loading(@NotNull TopAppBarUiState topAppBarUiState) {
            Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
            this.topAppBarUiState = topAppBarUiState;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, TopAppBarUiState topAppBarUiState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                topAppBarUiState = loading.topAppBarUiState;
            }
            return loading.copy(topAppBarUiState);
        }

        @NotNull
        public final TopAppBarUiState component1() {
            return this.topAppBarUiState;
        }

        @NotNull
        public final Loading copy(@NotNull TopAppBarUiState topAppBarUiState) {
            Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
            return new Loading(topAppBarUiState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.topAppBarUiState, ((Loading) obj).topAppBarUiState);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ConversationUiState
        @NotNull
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public int hashCode() {
            return this.topAppBarUiState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Loading(topAppBarUiState=" + this.topAppBarUiState + ')';
        }
    }

    @NotNull
    TopAppBarUiState getTopAppBarUiState();

    @w0(parameters = 0)
    public static final class Content implements ConversationUiState {
        public static final int $stable = 8;

        @NotNull
        private final BottomBarUiState bottomBarUiState;

        @NotNull
        private final BottomSheetState bottomSheetState;

        @NotNull
        private final List<ContentRow> contentRows;

        @NotNull
        private final FloatingIndicatorState floatingIndicatorState;

        @NotNull
        private final NetworkState networkState;

        @NotNull
        private final TeamPresenceState teamPresenceState;

        @NotNull
        private final TopAppBarUiState topAppBarUiState;

        @NotNull
        private final VoiceTranscriptionState voiceTranscriptionState;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(@NotNull TopAppBarUiState topAppBarUiState, @NotNull List<? extends ContentRow> contentRows, @NotNull BottomBarUiState bottomBarUiState, @NotNull NetworkState networkState, @NotNull BottomSheetState bottomSheetState, @NotNull FloatingIndicatorState floatingIndicatorState, @NotNull TeamPresenceState teamPresenceState, @NotNull VoiceTranscriptionState voiceTranscriptionState) {
            Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
            Intrinsics.checkNotNullParameter(contentRows, "contentRows");
            Intrinsics.checkNotNullParameter(bottomBarUiState, "bottomBarUiState");
            Intrinsics.checkNotNullParameter(networkState, "networkState");
            Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
            Intrinsics.checkNotNullParameter(floatingIndicatorState, "floatingIndicatorState");
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            Intrinsics.checkNotNullParameter(voiceTranscriptionState, "voiceTranscriptionState");
            this.topAppBarUiState = topAppBarUiState;
            this.contentRows = contentRows;
            this.bottomBarUiState = bottomBarUiState;
            this.networkState = networkState;
            this.bottomSheetState = bottomSheetState;
            this.floatingIndicatorState = floatingIndicatorState;
            this.teamPresenceState = teamPresenceState;
            this.voiceTranscriptionState = voiceTranscriptionState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, TopAppBarUiState topAppBarUiState, List list, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, VoiceTranscriptionState voiceTranscriptionState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                topAppBarUiState = content.topAppBarUiState;
            }
            if ((i10 & 2) != 0) {
                list = content.contentRows;
            }
            if ((i10 & 4) != 0) {
                bottomBarUiState = content.bottomBarUiState;
            }
            if ((i10 & 8) != 0) {
                networkState = content.networkState;
            }
            if ((i10 & 16) != 0) {
                bottomSheetState = content.bottomSheetState;
            }
            if ((i10 & 32) != 0) {
                floatingIndicatorState = content.floatingIndicatorState;
            }
            if ((i10 & 64) != 0) {
                teamPresenceState = content.teamPresenceState;
            }
            if ((i10 & 128) != 0) {
                voiceTranscriptionState = content.voiceTranscriptionState;
            }
            TeamPresenceState teamPresenceState2 = teamPresenceState;
            VoiceTranscriptionState voiceTranscriptionState2 = voiceTranscriptionState;
            BottomSheetState bottomSheetState2 = bottomSheetState;
            FloatingIndicatorState floatingIndicatorState2 = floatingIndicatorState;
            return content.copy(topAppBarUiState, list, bottomBarUiState, networkState, bottomSheetState2, floatingIndicatorState2, teamPresenceState2, voiceTranscriptionState2);
        }

        @NotNull
        public final TopAppBarUiState component1() {
            return this.topAppBarUiState;
        }

        @NotNull
        public final List<ContentRow> component2() {
            return this.contentRows;
        }

        @NotNull
        public final BottomBarUiState component3() {
            return this.bottomBarUiState;
        }

        @NotNull
        public final NetworkState component4() {
            return this.networkState;
        }

        @NotNull
        public final BottomSheetState component5() {
            return this.bottomSheetState;
        }

        @NotNull
        public final FloatingIndicatorState component6() {
            return this.floatingIndicatorState;
        }

        @NotNull
        public final TeamPresenceState component7() {
            return this.teamPresenceState;
        }

        @NotNull
        public final VoiceTranscriptionState component8() {
            return this.voiceTranscriptionState;
        }

        @NotNull
        public final Content copy(@NotNull TopAppBarUiState topAppBarUiState, @NotNull List<? extends ContentRow> contentRows, @NotNull BottomBarUiState bottomBarUiState, @NotNull NetworkState networkState, @NotNull BottomSheetState bottomSheetState, @NotNull FloatingIndicatorState floatingIndicatorState, @NotNull TeamPresenceState teamPresenceState, @NotNull VoiceTranscriptionState voiceTranscriptionState) {
            Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
            Intrinsics.checkNotNullParameter(contentRows, "contentRows");
            Intrinsics.checkNotNullParameter(bottomBarUiState, "bottomBarUiState");
            Intrinsics.checkNotNullParameter(networkState, "networkState");
            Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
            Intrinsics.checkNotNullParameter(floatingIndicatorState, "floatingIndicatorState");
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            Intrinsics.checkNotNullParameter(voiceTranscriptionState, "voiceTranscriptionState");
            return new Content(topAppBarUiState, contentRows, bottomBarUiState, networkState, bottomSheetState, floatingIndicatorState, teamPresenceState, voiceTranscriptionState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            if (Intrinsics.areEqual(this.topAppBarUiState, content.topAppBarUiState) && Intrinsics.areEqual(this.contentRows, content.contentRows) && Intrinsics.areEqual(this.bottomBarUiState, content.bottomBarUiState) && Intrinsics.areEqual(this.networkState, content.networkState) && Intrinsics.areEqual(this.bottomSheetState, content.bottomSheetState) && Intrinsics.areEqual(this.floatingIndicatorState, content.floatingIndicatorState) && Intrinsics.areEqual(this.teamPresenceState, content.teamPresenceState) && Intrinsics.areEqual(this.voiceTranscriptionState, content.voiceTranscriptionState)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final BottomBarUiState getBottomBarUiState() {
            return this.bottomBarUiState;
        }

        @NotNull
        public final BottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        @NotNull
        public final List<ContentRow> getContentRows() {
            return this.contentRows;
        }

        @NotNull
        public final FloatingIndicatorState getFloatingIndicatorState() {
            return this.floatingIndicatorState;
        }

        @NotNull
        public final NetworkState getNetworkState() {
            return this.networkState;
        }

        @NotNull
        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ConversationUiState
        @NotNull
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        @NotNull
        public final VoiceTranscriptionState getVoiceTranscriptionState() {
            return this.voiceTranscriptionState;
        }

        public int hashCode() {
            return (((((((((((((this.topAppBarUiState.hashCode() * 31) + this.contentRows.hashCode()) * 31) + this.bottomBarUiState.hashCode()) * 31) + this.networkState.hashCode()) * 31) + this.bottomSheetState.hashCode()) * 31) + this.floatingIndicatorState.hashCode()) * 31) + this.teamPresenceState.hashCode()) * 31) + this.voiceTranscriptionState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Content(topAppBarUiState=" + this.topAppBarUiState + ", contentRows=" + this.contentRows + ", bottomBarUiState=" + this.bottomBarUiState + ", networkState=" + this.networkState + ", bottomSheetState=" + this.bottomSheetState + ", floatingIndicatorState=" + this.floatingIndicatorState + ", teamPresenceState=" + this.teamPresenceState + ", voiceTranscriptionState=" + this.voiceTranscriptionState + ')';
        }

        public /* synthetic */ Content(TopAppBarUiState topAppBarUiState, List list, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, VoiceTranscriptionState voiceTranscriptionState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(topAppBarUiState, list, bottomBarUiState, (i10 & 8) != 0 ? NetworkState.Connected.INSTANCE : networkState, (i10 & 16) != 0 ? BottomSheetState.Empty.INSTANCE : bottomSheetState, floatingIndicatorState, teamPresenceState, (i10 & 128) != 0 ? VoiceTranscriptionState.Idle.INSTANCE : voiceTranscriptionState);
        }
    }
}
