package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class ConversationScrolledState {
    public static final int $stable = 0;
    private final boolean isLandscape;
    private final boolean isLargeFont;
    private final int lastSeenItemIndex;
    private final int scrollToPosition;
    private final boolean scrolled;

    public ConversationScrolledState(boolean z10, int i10, boolean z11, boolean z12, int i11) {
        this.scrolled = z10;
        this.scrollToPosition = i10;
        this.isLandscape = z11;
        this.isLargeFont = z12;
        this.lastSeenItemIndex = i11;
    }

    public static /* synthetic */ ConversationScrolledState copy$default(ConversationScrolledState conversationScrolledState, boolean z10, int i10, boolean z11, boolean z12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = conversationScrolledState.scrolled;
        }
        if ((i12 & 2) != 0) {
            i10 = conversationScrolledState.scrollToPosition;
        }
        if ((i12 & 4) != 0) {
            z11 = conversationScrolledState.isLandscape;
        }
        if ((i12 & 8) != 0) {
            z12 = conversationScrolledState.isLargeFont;
        }
        if ((i12 & 16) != 0) {
            i11 = conversationScrolledState.lastSeenItemIndex;
        }
        int i13 = i11;
        boolean z13 = z11;
        return conversationScrolledState.copy(z10, i10, z13, z12, i13);
    }

    public final boolean component1() {
        return this.scrolled;
    }

    public final int component2() {
        return this.scrollToPosition;
    }

    public final boolean component3() {
        return this.isLandscape;
    }

    public final boolean component4() {
        return this.isLargeFont;
    }

    public final int component5() {
        return this.lastSeenItemIndex;
    }

    @NotNull
    public final ConversationScrolledState copy(boolean z10, int i10, boolean z11, boolean z12, int i11) {
        return new ConversationScrolledState(z10, i10, z11, z12, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationScrolledState)) {
            return false;
        }
        ConversationScrolledState conversationScrolledState = (ConversationScrolledState) obj;
        return this.scrolled == conversationScrolledState.scrolled && this.scrollToPosition == conversationScrolledState.scrollToPosition && this.isLandscape == conversationScrolledState.isLandscape && this.isLargeFont == conversationScrolledState.isLargeFont && this.lastSeenItemIndex == conversationScrolledState.lastSeenItemIndex;
    }

    public final int getLastSeenItemIndex() {
        return this.lastSeenItemIndex;
    }

    public final int getScrollToPosition() {
        return this.scrollToPosition;
    }

    public final boolean getScrolled() {
        return this.scrolled;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.scrolled) * 31) + Integer.hashCode(this.scrollToPosition)) * 31) + Boolean.hashCode(this.isLandscape)) * 31) + Boolean.hashCode(this.isLargeFont)) * 31) + Integer.hashCode(this.lastSeenItemIndex);
    }

    public final boolean isLandscape() {
        return this.isLandscape;
    }

    public final boolean isLargeFont() {
        return this.isLargeFont;
    }

    @NotNull
    public String toString() {
        return "ConversationScrolledState(scrolled=" + this.scrolled + ", scrollToPosition=" + this.scrollToPosition + ", isLandscape=" + this.isLandscape + ", isLargeFont=" + this.isLargeFont + ", lastSeenItemIndex=" + this.lastSeenItemIndex + ')';
    }

    public /* synthetic */ ConversationScrolledState(boolean z10, int i10, boolean z11, boolean z12, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, z11, z12, (i12 & 16) != 0 ? 0 : i11);
    }
}
