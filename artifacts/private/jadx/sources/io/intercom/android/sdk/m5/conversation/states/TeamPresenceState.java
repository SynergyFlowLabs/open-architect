package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class TeamPresenceState {
    public static final int $stable = 8;

    @NotNull
    private final ExpandedTeamPresenceState expandedTeamPresenceState;

    @NotNull
    private final String specialNotice;

    @NotNull
    private final String teamIntro;

    public TeamPresenceState(@NotNull ExpandedTeamPresenceState expandedTeamPresenceState, @NotNull String teamIntro, @NotNull String specialNotice) {
        Intrinsics.checkNotNullParameter(expandedTeamPresenceState, "expandedTeamPresenceState");
        Intrinsics.checkNotNullParameter(teamIntro, "teamIntro");
        Intrinsics.checkNotNullParameter(specialNotice, "specialNotice");
        this.expandedTeamPresenceState = expandedTeamPresenceState;
        this.teamIntro = teamIntro;
        this.specialNotice = specialNotice;
    }

    @NotNull
    public final ExpandedTeamPresenceState getExpandedTeamPresenceState() {
        return this.expandedTeamPresenceState;
    }

    @NotNull
    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    @NotNull
    public final String getTeamIntro() {
        return this.teamIntro;
    }
}
