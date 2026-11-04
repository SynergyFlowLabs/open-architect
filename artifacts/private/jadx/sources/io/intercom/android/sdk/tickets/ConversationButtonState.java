package io.intercom.android.sdk.tickets;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class ConversationButtonState {
    public static final int $stable = StringProvider.$stable;

    @Nullable
    private final Integer iconRes;
    private final boolean showButton;

    @NotNull
    private final StringProvider text;

    public ConversationButtonState(boolean z10, @androidx.annotation.v @Nullable Integer num, @NotNull StringProvider text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.showButton = z10;
        this.iconRes = num;
        this.text = text;
    }

    public static /* synthetic */ ConversationButtonState copy$default(ConversationButtonState conversationButtonState, boolean z10, Integer num, StringProvider stringProvider, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = conversationButtonState.showButton;
        }
        if ((i10 & 2) != 0) {
            num = conversationButtonState.iconRes;
        }
        if ((i10 & 4) != 0) {
            stringProvider = conversationButtonState.text;
        }
        return conversationButtonState.copy(z10, num, stringProvider);
    }

    public final boolean component1() {
        return this.showButton;
    }

    @Nullable
    public final Integer component2() {
        return this.iconRes;
    }

    @NotNull
    public final StringProvider component3() {
        return this.text;
    }

    @NotNull
    public final ConversationButtonState copy(boolean z10, @androidx.annotation.v @Nullable Integer num, @NotNull StringProvider text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new ConversationButtonState(z10, num, text);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationButtonState)) {
            return false;
        }
        ConversationButtonState conversationButtonState = (ConversationButtonState) obj;
        return this.showButton == conversationButtonState.showButton && Intrinsics.areEqual(this.iconRes, conversationButtonState.iconRes) && Intrinsics.areEqual(this.text, conversationButtonState.text);
    }

    @Nullable
    public final Integer getIconRes() {
        return this.iconRes;
    }

    public final boolean getShowButton() {
        return this.showButton;
    }

    @NotNull
    public final StringProvider getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showButton) * 31;
        Integer num = this.iconRes;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.text.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConversationButtonState(showButton=" + this.showButton + ", iconRes=" + this.iconRes + ", text=" + this.text + ')';
    }
}
