package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTeamPresence.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TeamPresence.kt\nio/intercom/android/sdk/models/TeamPresence\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1557#2:24\n1628#2,3:25\n*S KotlinDebug\n*F\n+ 1 TeamPresence.kt\nio/intercom/android/sdk/models/TeamPresence\n*L\n21#1:24\n21#1:25,3\n*E\n"})
public final class TeamPresence {

    @c("active_admins")
    @Nullable
    private final List<Participant.Builder> activeAdmins;

    @c("active_bot")
    @Nullable
    private final ActiveBot activeBot;

    @c("expected_response_delay_long_text")
    @Nullable
    private final String expectedResponseDelayLongText;

    @c("expected_response_delay_short_text")
    @Nullable
    private final String expectedResponseDelayShortText;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @f
    @NotNull
    public static final TeamPresence NULL = new TeamPresence(null, null, null, null, 15, null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TeamPresence() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamPresence copy$default(TeamPresence teamPresence, List list, ActiveBot activeBot, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = teamPresence.activeAdmins;
        }
        if ((i10 & 2) != 0) {
            activeBot = teamPresence.activeBot;
        }
        if ((i10 & 4) != 0) {
            str = teamPresence.expectedResponseDelayShortText;
        }
        if ((i10 & 8) != 0) {
            str2 = teamPresence.expectedResponseDelayLongText;
        }
        return teamPresence.copy(list, activeBot, str, str2);
    }

    @Nullable
    public final List<Participant.Builder> component1() {
        return this.activeAdmins;
    }

    @Nullable
    public final ActiveBot component2() {
        return this.activeBot;
    }

    @Nullable
    public final String component3() {
        return this.expectedResponseDelayShortText;
    }

    @Nullable
    public final String component4() {
        return this.expectedResponseDelayLongText;
    }

    @NotNull
    public final TeamPresence copy(@Nullable List<Participant.Builder> list, @Nullable ActiveBot activeBot, @Nullable String str, @Nullable String str2) {
        return new TeamPresence(list, activeBot, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamPresence)) {
            return false;
        }
        TeamPresence teamPresence = (TeamPresence) obj;
        return Intrinsics.areEqual(this.activeAdmins, teamPresence.activeAdmins) && Intrinsics.areEqual(this.activeBot, teamPresence.activeBot) && Intrinsics.areEqual(this.expectedResponseDelayShortText, teamPresence.expectedResponseDelayShortText) && Intrinsics.areEqual(this.expectedResponseDelayLongText, teamPresence.expectedResponseDelayLongText);
    }

    @Nullable
    public final List<Participant.Builder> getActiveAdmins() {
        return this.activeAdmins;
    }

    @Nullable
    public final ActiveBot getActiveBot() {
        return this.activeBot;
    }

    @NotNull
    public final List<Participant> getBuiltActiveAdmins() {
        List<Participant.Builder> listEmptyList = this.activeAdmins;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<Participant.Builder> list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Participant.Builder) it.next()).build());
        }
        return arrayList;
    }

    @Nullable
    public final String getExpectedResponseDelayLongText() {
        return this.expectedResponseDelayLongText;
    }

    @Nullable
    public final String getExpectedResponseDelayShortText() {
        return this.expectedResponseDelayShortText;
    }

    public int hashCode() {
        List<Participant.Builder> list = this.activeAdmins;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ActiveBot activeBot = this.activeBot;
        int iHashCode2 = (iHashCode + (activeBot == null ? 0 : activeBot.hashCode())) * 31;
        String str = this.expectedResponseDelayShortText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expectedResponseDelayLongText;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TeamPresence(activeAdmins=" + this.activeAdmins + ", activeBot=" + this.activeBot + ", expectedResponseDelayShortText=" + this.expectedResponseDelayShortText + ", expectedResponseDelayLongText=" + this.expectedResponseDelayLongText + ')';
    }

    public TeamPresence(@Nullable List<Participant.Builder> list, @Nullable ActiveBot activeBot, @Nullable String str, @Nullable String str2) {
        this.activeAdmins = list;
        this.activeBot = activeBot;
        this.expectedResponseDelayShortText = str;
        this.expectedResponseDelayLongText = str2;
    }

    public /* synthetic */ TeamPresence(List list, ActiveBot activeBot, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : activeBot, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
    }
}
