package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class FooterNoticeState {
    public static final int $stable = 8;

    @NotNull
    private final List<AvatarWrapper> avatars;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    public FooterNoticeState(@NotNull String title, @NotNull String subtitle, @NotNull List<AvatarWrapper> avatars) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.title = title;
        this.subtitle = subtitle;
        this.avatars = avatars;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FooterNoticeState copy$default(FooterNoticeState footerNoticeState, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = footerNoticeState.title;
        }
        if ((i10 & 2) != 0) {
            str2 = footerNoticeState.subtitle;
        }
        if ((i10 & 4) != 0) {
            list = footerNoticeState.avatars;
        }
        return footerNoticeState.copy(str, str2, list);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.subtitle;
    }

    @NotNull
    public final List<AvatarWrapper> component3() {
        return this.avatars;
    }

    @NotNull
    public final FooterNoticeState copy(@NotNull String title, @NotNull String subtitle, @NotNull List<AvatarWrapper> avatars) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        return new FooterNoticeState(title, subtitle, avatars);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterNoticeState)) {
            return false;
        }
        FooterNoticeState footerNoticeState = (FooterNoticeState) obj;
        return Intrinsics.areEqual(this.title, footerNoticeState.title) && Intrinsics.areEqual(this.subtitle, footerNoticeState.subtitle) && Intrinsics.areEqual(this.avatars, footerNoticeState.avatars);
    }

    @NotNull
    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.avatars.hashCode();
    }

    @NotNull
    public String toString() {
        return "FooterNoticeState(title=" + this.title + ", subtitle=" + this.subtitle + ", avatars=" + this.avatars + ')';
    }
}
