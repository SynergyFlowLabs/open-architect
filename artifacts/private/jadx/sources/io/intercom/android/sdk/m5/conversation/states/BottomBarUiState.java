package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.models.PoweredBy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class BottomBarUiState {
    public static final int $stable = 8;

    @NotNull
    private final BottomBadgeState bottomBadge;

    @NotNull
    private final ComposerState composerState;

    @NotNull
    private final CurrentlyTypingState currentlyTypingState;

    @NotNull
    private final InputTypeState inputTypeState;

    public interface BottomBadgeState {

        @w0(parameters = 1)
        public static final class None implements BottomBadgeState {
            public static final int $stable = 0;

            @NotNull
            public static final None INSTANCE = new None();

            private None() {
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof None);
            }

            public int hashCode() {
                return -495368601;
            }

            @NotNull
            public String toString() {
                return "None";
            }
        }

        @w0(parameters = 1)
        public static final class PoweredByBadgeState implements BottomBadgeState {
            public static final int $stable = 0;

            @NotNull
            private final PoweredBy poweredBy;

            public PoweredByBadgeState(@NotNull PoweredBy poweredBy) {
                Intrinsics.checkNotNullParameter(poweredBy, "poweredBy");
                this.poweredBy = poweredBy;
            }

            public static /* synthetic */ PoweredByBadgeState copy$default(PoweredByBadgeState poweredByBadgeState, PoweredBy poweredBy, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    poweredBy = poweredByBadgeState.poweredBy;
                }
                return poweredByBadgeState.copy(poweredBy);
            }

            @NotNull
            public final PoweredBy component1() {
                return this.poweredBy;
            }

            @NotNull
            public final PoweredByBadgeState copy(@NotNull PoweredBy poweredBy) {
                Intrinsics.checkNotNullParameter(poweredBy, "poweredBy");
                return new PoweredByBadgeState(poweredBy);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PoweredByBadgeState) && Intrinsics.areEqual(this.poweredBy, ((PoweredByBadgeState) obj).poweredBy);
            }

            @NotNull
            public final PoweredBy getPoweredBy() {
                return this.poweredBy;
            }

            public int hashCode() {
                return this.poweredBy.hashCode();
            }

            @NotNull
            public String toString() {
                return "PoweredByBadgeState(poweredBy=" + this.poweredBy + ')';
            }
        }

        @w0(parameters = 1)
        public static final class PrivacyNoticeBadgeState implements BottomBadgeState {
            public static final int $stable = 0;

            @NotNull
            private final String text;

            public PrivacyNoticeBadgeState(@NotNull String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public static /* synthetic */ PrivacyNoticeBadgeState copy$default(PrivacyNoticeBadgeState privacyNoticeBadgeState, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = privacyNoticeBadgeState.text;
                }
                return privacyNoticeBadgeState.copy(str);
            }

            @NotNull
            public final String component1() {
                return this.text;
            }

            @NotNull
            public final PrivacyNoticeBadgeState copy(@NotNull String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new PrivacyNoticeBadgeState(text);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PrivacyNoticeBadgeState) && Intrinsics.areEqual(this.text, ((PrivacyNoticeBadgeState) obj).text);
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            @NotNull
            public String toString() {
                return "PrivacyNoticeBadgeState(text=" + this.text + ')';
            }
        }
    }

    @w0(parameters = 1)
    public static abstract class BottomBarButton {
        public static final int $stable = 0;

        @w0(parameters = 1)
        public static final class GifInsert extends BottomBarButton {
            public static final int $stable = 0;

            @NotNull
            public static final GifInsert INSTANCE = new GifInsert();

            private GifInsert() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                if (this != obj && !(obj instanceof GifInsert)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 806342211;
            }

            @NotNull
            public String toString() {
                return "GifInsert";
            }
        }

        @w0(parameters = 1)
        public static final class MediaInsert extends BottomBarButton {
            public static final int $stable = 0;

            @NotNull
            public static final MediaInsert INSTANCE = new MediaInsert();

            private MediaInsert() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof MediaInsert);
            }

            public int hashCode() {
                return -196410141;
            }

            @NotNull
            public String toString() {
                return "MediaInsert";
            }
        }

        @w0(parameters = 1)
        public static final class VoiceNotesInsert extends BottomBarButton {
            public static final int $stable = 0;

            @NotNull
            public static final VoiceNotesInsert INSTANCE = new VoiceNotesInsert();

            private VoiceNotesInsert() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof VoiceNotesInsert);
            }

            public int hashCode() {
                return 501154530;
            }

            @NotNull
            public String toString() {
                return "VoiceNotesInsert";
            }
        }

        public /* synthetic */ BottomBarButton(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private BottomBarButton() {
        }
    }

    public BottomBarUiState(@NotNull ComposerState composerState, @NotNull CurrentlyTypingState currentlyTypingState, @NotNull InputTypeState inputTypeState, @NotNull BottomBadgeState bottomBadge) {
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(currentlyTypingState, "currentlyTypingState");
        Intrinsics.checkNotNullParameter(inputTypeState, "inputTypeState");
        Intrinsics.checkNotNullParameter(bottomBadge, "bottomBadge");
        this.composerState = composerState;
        this.currentlyTypingState = currentlyTypingState;
        this.inputTypeState = inputTypeState;
        this.bottomBadge = bottomBadge;
    }

    public static /* synthetic */ BottomBarUiState copy$default(BottomBarUiState bottomBarUiState, ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, BottomBadgeState bottomBadgeState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            composerState = bottomBarUiState.composerState;
        }
        if ((i10 & 2) != 0) {
            currentlyTypingState = bottomBarUiState.currentlyTypingState;
        }
        if ((i10 & 4) != 0) {
            inputTypeState = bottomBarUiState.inputTypeState;
        }
        if ((i10 & 8) != 0) {
            bottomBadgeState = bottomBarUiState.bottomBadge;
        }
        return bottomBarUiState.copy(composerState, currentlyTypingState, inputTypeState, bottomBadgeState);
    }

    @NotNull
    public final ComposerState component1() {
        return this.composerState;
    }

    @NotNull
    public final CurrentlyTypingState component2() {
        return this.currentlyTypingState;
    }

    @NotNull
    public final InputTypeState component3() {
        return this.inputTypeState;
    }

    @NotNull
    public final BottomBadgeState component4() {
        return this.bottomBadge;
    }

    @NotNull
    public final BottomBarUiState copy(@NotNull ComposerState composerState, @NotNull CurrentlyTypingState currentlyTypingState, @NotNull InputTypeState inputTypeState, @NotNull BottomBadgeState bottomBadge) {
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(currentlyTypingState, "currentlyTypingState");
        Intrinsics.checkNotNullParameter(inputTypeState, "inputTypeState");
        Intrinsics.checkNotNullParameter(bottomBadge, "bottomBadge");
        return new BottomBarUiState(composerState, currentlyTypingState, inputTypeState, bottomBadge);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBarUiState)) {
            return false;
        }
        BottomBarUiState bottomBarUiState = (BottomBarUiState) obj;
        return Intrinsics.areEqual(this.composerState, bottomBarUiState.composerState) && Intrinsics.areEqual(this.currentlyTypingState, bottomBarUiState.currentlyTypingState) && Intrinsics.areEqual(this.inputTypeState, bottomBarUiState.inputTypeState) && Intrinsics.areEqual(this.bottomBadge, bottomBarUiState.bottomBadge);
    }

    @NotNull
    public final BottomBadgeState getBottomBadge() {
        return this.bottomBadge;
    }

    @NotNull
    public final ComposerState getComposerState() {
        return this.composerState;
    }

    @NotNull
    public final CurrentlyTypingState getCurrentlyTypingState() {
        return this.currentlyTypingState;
    }

    @NotNull
    public final InputTypeState getInputTypeState() {
        return this.inputTypeState;
    }

    public int hashCode() {
        return (((((this.composerState.hashCode() * 31) + this.currentlyTypingState.hashCode()) * 31) + this.inputTypeState.hashCode()) * 31) + this.bottomBadge.hashCode();
    }

    @NotNull
    public String toString() {
        return "BottomBarUiState(composerState=" + this.composerState + ", currentlyTypingState=" + this.currentlyTypingState + ", inputTypeState=" + this.inputTypeState + ", bottomBadge=" + this.bottomBadge + ')';
    }

    public /* synthetic */ BottomBarUiState(ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, BottomBadgeState bottomBadgeState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerState, currentlyTypingState, inputTypeState, (i10 & 8) != 0 ? BottomBadgeState.None.INSTANCE : bottomBadgeState);
    }
}
