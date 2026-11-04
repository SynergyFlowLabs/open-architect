package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface FloatingIndicatorState {

    @w0(parameters = 0)
    public static final class FooterNoticeIndicator implements FloatingIndicatorState {
        public static final int $stable = 8;

        @NotNull
        private final FooterNoticeState footerNoticeState;

        public FooterNoticeIndicator(@NotNull FooterNoticeState footerNoticeState) {
            Intrinsics.checkNotNullParameter(footerNoticeState, "footerNoticeState");
            this.footerNoticeState = footerNoticeState;
        }

        public static /* synthetic */ FooterNoticeIndicator copy$default(FooterNoticeIndicator footerNoticeIndicator, FooterNoticeState footerNoticeState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                footerNoticeState = footerNoticeIndicator.footerNoticeState;
            }
            return footerNoticeIndicator.copy(footerNoticeState);
        }

        @NotNull
        public final FooterNoticeState component1() {
            return this.footerNoticeState;
        }

        @NotNull
        public final FooterNoticeIndicator copy(@NotNull FooterNoticeState footerNoticeState) {
            Intrinsics.checkNotNullParameter(footerNoticeState, "footerNoticeState");
            return new FooterNoticeIndicator(footerNoticeState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterNoticeIndicator) && Intrinsics.areEqual(this.footerNoticeState, ((FooterNoticeIndicator) obj).footerNoticeState);
        }

        @NotNull
        public final FooterNoticeState getFooterNoticeState() {
            return this.footerNoticeState;
        }

        public int hashCode() {
            return this.footerNoticeState.hashCode();
        }

        @NotNull
        public String toString() {
            return "FooterNoticeIndicator(footerNoticeState=" + this.footerNoticeState + ')';
        }
    }

    @w0(parameters = 1)
    public static final class JumpToBottomIndicator implements FloatingIndicatorState {
        public static final int $stable = 0;

        @NotNull
        private final JumpToBottomButtonState jumpToBottomButtonState;

        public JumpToBottomIndicator(@NotNull JumpToBottomButtonState jumpToBottomButtonState) {
            Intrinsics.checkNotNullParameter(jumpToBottomButtonState, "jumpToBottomButtonState");
            this.jumpToBottomButtonState = jumpToBottomButtonState;
        }

        public static /* synthetic */ JumpToBottomIndicator copy$default(JumpToBottomIndicator jumpToBottomIndicator, JumpToBottomButtonState jumpToBottomButtonState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jumpToBottomButtonState = jumpToBottomIndicator.jumpToBottomButtonState;
            }
            return jumpToBottomIndicator.copy(jumpToBottomButtonState);
        }

        @NotNull
        public final JumpToBottomButtonState component1() {
            return this.jumpToBottomButtonState;
        }

        @NotNull
        public final JumpToBottomIndicator copy(@NotNull JumpToBottomButtonState jumpToBottomButtonState) {
            Intrinsics.checkNotNullParameter(jumpToBottomButtonState, "jumpToBottomButtonState");
            return new JumpToBottomIndicator(jumpToBottomButtonState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JumpToBottomIndicator) && Intrinsics.areEqual(this.jumpToBottomButtonState, ((JumpToBottomIndicator) obj).jumpToBottomButtonState);
        }

        @NotNull
        public final JumpToBottomButtonState getJumpToBottomButtonState() {
            return this.jumpToBottomButtonState;
        }

        public int hashCode() {
            return this.jumpToBottomButtonState.hashCode();
        }

        @NotNull
        public String toString() {
            return "JumpToBottomIndicator(jumpToBottomButtonState=" + this.jumpToBottomButtonState + ')';
        }
    }

    @w0(parameters = 1)
    public static final class None implements FloatingIndicatorState {
        public static final int $stable = 0;

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof None);
        }

        public int hashCode() {
            return 1010280075;
        }

        @NotNull
        public String toString() {
            return "None";
        }
    }
}
