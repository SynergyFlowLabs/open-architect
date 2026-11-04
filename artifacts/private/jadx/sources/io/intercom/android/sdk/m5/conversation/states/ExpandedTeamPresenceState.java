package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class ExpandedTeamPresenceState {

    @NotNull
    private final AvatarType avatarType;

    @NotNull
    private final List<AvatarWrapper> avatars;

    @NotNull
    private final List<Header.Expanded.Body> body;
    private final boolean displayActiveIndicator;

    @NotNull
    private final List<Header.Expanded.Footer> footers;

    @NotNull
    private final List<Header.Expanded.SocialAccount> socialAccounts;

    @NotNull
    private final String title;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @NotNull
    private static final ExpandedTeamPresenceState f80default = new ExpandedTeamPresenceState("", CollectionsKt.emptyList(), AvatarType.UNKNOWN, CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), false);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ExpandedTeamPresenceState getDefault() {
            return ExpandedTeamPresenceState.f80default;
        }

        private Companion() {
        }
    }

    public ExpandedTeamPresenceState(@NotNull String title, @NotNull List<Header.Expanded.Body> body, @NotNull AvatarType avatarType, @NotNull List<AvatarWrapper> avatars, @NotNull List<Header.Expanded.Footer> footers, @NotNull List<Header.Expanded.SocialAccount> socialAccounts, boolean z10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(avatarType, "avatarType");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(footers, "footers");
        Intrinsics.checkNotNullParameter(socialAccounts, "socialAccounts");
        this.title = title;
        this.body = body;
        this.avatarType = avatarType;
        this.avatars = avatars;
        this.footers = footers;
        this.socialAccounts = socialAccounts;
        this.displayActiveIndicator = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpandedTeamPresenceState copy$default(ExpandedTeamPresenceState expandedTeamPresenceState, String str, List list, AvatarType avatarType, List list2, List list3, List list4, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = expandedTeamPresenceState.title;
        }
        if ((i10 & 2) != 0) {
            list = expandedTeamPresenceState.body;
        }
        if ((i10 & 4) != 0) {
            avatarType = expandedTeamPresenceState.avatarType;
        }
        if ((i10 & 8) != 0) {
            list2 = expandedTeamPresenceState.avatars;
        }
        if ((i10 & 16) != 0) {
            list3 = expandedTeamPresenceState.footers;
        }
        if ((i10 & 32) != 0) {
            list4 = expandedTeamPresenceState.socialAccounts;
        }
        if ((i10 & 64) != 0) {
            z10 = expandedTeamPresenceState.displayActiveIndicator;
        }
        List list5 = list4;
        boolean z11 = z10;
        List list6 = list3;
        AvatarType avatarType2 = avatarType;
        return expandedTeamPresenceState.copy(str, list, avatarType2, list2, list6, list5, z11);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final List<Header.Expanded.Body> component2() {
        return this.body;
    }

    @NotNull
    public final AvatarType component3() {
        return this.avatarType;
    }

    @NotNull
    public final List<AvatarWrapper> component4() {
        return this.avatars;
    }

    @NotNull
    public final List<Header.Expanded.Footer> component5() {
        return this.footers;
    }

    @NotNull
    public final List<Header.Expanded.SocialAccount> component6() {
        return this.socialAccounts;
    }

    public final boolean component7() {
        return this.displayActiveIndicator;
    }

    @NotNull
    public final ExpandedTeamPresenceState copy(@NotNull String title, @NotNull List<Header.Expanded.Body> body, @NotNull AvatarType avatarType, @NotNull List<AvatarWrapper> avatars, @NotNull List<Header.Expanded.Footer> footers, @NotNull List<Header.Expanded.SocialAccount> socialAccounts, boolean z10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(avatarType, "avatarType");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(footers, "footers");
        Intrinsics.checkNotNullParameter(socialAccounts, "socialAccounts");
        return new ExpandedTeamPresenceState(title, body, avatarType, avatars, footers, socialAccounts, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandedTeamPresenceState)) {
            return false;
        }
        ExpandedTeamPresenceState expandedTeamPresenceState = (ExpandedTeamPresenceState) obj;
        return Intrinsics.areEqual(this.title, expandedTeamPresenceState.title) && Intrinsics.areEqual(this.body, expandedTeamPresenceState.body) && this.avatarType == expandedTeamPresenceState.avatarType && Intrinsics.areEqual(this.avatars, expandedTeamPresenceState.avatars) && Intrinsics.areEqual(this.footers, expandedTeamPresenceState.footers) && Intrinsics.areEqual(this.socialAccounts, expandedTeamPresenceState.socialAccounts) && this.displayActiveIndicator == expandedTeamPresenceState.displayActiveIndicator;
    }

    @NotNull
    public final AvatarType getAvatarType() {
        return this.avatarType;
    }

    @NotNull
    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    @NotNull
    public final List<Header.Expanded.Body> getBody() {
        return this.body;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    @NotNull
    public final List<Header.Expanded.Footer> getFooters() {
        return this.footers;
    }

    @NotNull
    public final List<Header.Expanded.SocialAccount> getSocialAccounts() {
        return this.socialAccounts;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.avatarType.hashCode()) * 31) + this.avatars.hashCode()) * 31) + this.footers.hashCode()) * 31) + this.socialAccounts.hashCode()) * 31) + Boolean.hashCode(this.displayActiveIndicator);
    }

    @NotNull
    public String toString() {
        return "ExpandedTeamPresenceState(title=" + this.title + ", body=" + this.body + ", avatarType=" + this.avatarType + ", avatars=" + this.avatars + ", footers=" + this.footers + ", socialAccounts=" + this.socialAccounts + ", displayActiveIndicator=" + this.displayActiveIndicator + ')';
    }
}
