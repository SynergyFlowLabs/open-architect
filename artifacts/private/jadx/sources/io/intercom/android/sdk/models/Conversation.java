package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nConversation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Conversation.kt\nio/intercom/android/sdk/models/Conversation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1187#2,2:63\n1261#2,4:65\n1557#2:69\n1628#2,2:70\n1630#2:73\n1611#2,9:74\n1863#2:83\n1864#2:85\n1620#2:86\n543#2,6:87\n528#2,7:93\n1#3:72\n1#3:84\n*S KotlinDebug\n*F\n+ 1 Conversation.kt\nio/intercom/android/sdk/models/Conversation\n*L\n43#1:63,2\n43#1:65,4\n46#1:69\n46#1:70,2\n46#1:73\n52#1:74,9\n52#1:83\n52#1:85\n52#1:86\n58#1:87,6\n60#1:93,7\n52#1:84\n*E\n"})
public final class Conversation {
    public static final int $stable = 8;

    @c("composer_state")
    @NotNull
    private final ComposerState composerState;

    @c("conversation_ended_button")
    @Nullable
    private final ConversationEndedButton conversationEndedButton;

    @c("footer_notice")
    @Nullable
    private final FooterNotice footerNotice;

    @c("group_conversation_participant_ids")
    @NotNull
    private final List<String> groupConversationParticipantIds;

    @Nullable
    private final Header header;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f293114id;

    @c("inbound_conversations_disabled")
    private final boolean inboundConversationsDisabled;

    @c("is_inbound")
    private final boolean isInbound;

    @c("read")
    private final boolean isRead;

    @c("last_participating_admin")
    @NotNull
    private final LastParticipatingAdmin.Builder lastParticipatingAdminBuilder;

    @c("notification_status")
    @NotNull
    private final String notificationStatus;

    @c("conversation_parts")
    @NotNull
    private final List<Part.Builder> partBuilderList;

    @c("participants")
    @NotNull
    private final List<Participant.Builder> participantBuilderList;

    @c("powered_by")
    @Nullable
    private final PoweredBy poweredBy;

    @c("prevent_end_user_replies")
    private final boolean preventEndUserReplies;

    @c("special_notice")
    @Nullable
    private final String specialNotice;

    @NotNull
    private final String state;

    @c("team_intro")
    @Nullable
    private final String teamIntro;

    @Nullable
    private final Ticket ticket;

    @c("ui_flags")
    @NotNull
    private final ConversationUiFlags uiFlags;

    public Conversation() {
        this(null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048575, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, boolean z10, List list, List list2, List list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z11, boolean z12, String str2, String str3, boolean z13, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str4, String str5, int i10, Object obj) {
        String str6;
        String str7;
        String str8 = (i10 & 1) != 0 ? conversation.f293114id : str;
        boolean z14 = (i10 & 2) != 0 ? conversation.isRead : z10;
        List list4 = (i10 & 4) != 0 ? conversation.participantBuilderList : list;
        List list5 = (i10 & 8) != 0 ? conversation.partBuilderList : list2;
        List list6 = (i10 & 16) != 0 ? conversation.groupConversationParticipantIds : list3;
        LastParticipatingAdmin.Builder builder2 = (i10 & 32) != 0 ? conversation.lastParticipatingAdminBuilder : builder;
        ComposerState composerState2 = (i10 & 64) != 0 ? conversation.composerState : composerState;
        boolean z15 = (i10 & 128) != 0 ? conversation.preventEndUserReplies : z11;
        boolean z16 = (i10 & 256) != 0 ? conversation.inboundConversationsDisabled : z12;
        String str9 = (i10 & 512) != 0 ? conversation.notificationStatus : str2;
        String str10 = (i10 & 1024) != 0 ? conversation.state : str3;
        boolean z17 = (i10 & 2048) != 0 ? conversation.isInbound : z13;
        Ticket ticket2 = (i10 & 4096) != 0 ? conversation.ticket : ticket;
        ConversationUiFlags conversationUiFlags2 = (i10 & 8192) != 0 ? conversation.uiFlags : conversationUiFlags;
        String str11 = str8;
        Header header2 = (i10 & 16384) != 0 ? conversation.header : header;
        ConversationEndedButton conversationEndedButton2 = (i10 & 32768) != 0 ? conversation.conversationEndedButton : conversationEndedButton;
        FooterNotice footerNotice2 = (i10 & 65536) != 0 ? conversation.footerNotice : footerNotice;
        PoweredBy poweredBy2 = (i10 & 131072) != 0 ? conversation.poweredBy : poweredBy;
        String str12 = (i10 & 262144) != 0 ? conversation.teamIntro : str4;
        if ((i10 & 524288) != 0) {
            str7 = str12;
            str6 = conversation.specialNotice;
        } else {
            str6 = str5;
            str7 = str12;
        }
        return conversation.copy(str11, z14, list4, list5, list6, builder2, composerState2, z15, z16, str9, str10, z17, ticket2, conversationUiFlags2, header2, conversationEndedButton2, footerNotice2, poweredBy2, str7, str6);
    }

    @NotNull
    public final String component1() {
        return this.f293114id;
    }

    @NotNull
    public final String component10() {
        return this.notificationStatus;
    }

    @NotNull
    public final String component11() {
        return this.state;
    }

    public final boolean component12() {
        return this.isInbound;
    }

    @Nullable
    public final Ticket component13() {
        return this.ticket;
    }

    @NotNull
    public final ConversationUiFlags component14() {
        return this.uiFlags;
    }

    @Nullable
    public final Header component15() {
        return this.header;
    }

    @Nullable
    public final ConversationEndedButton component16() {
        return this.conversationEndedButton;
    }

    @Nullable
    public final FooterNotice component17() {
        return this.footerNotice;
    }

    @Nullable
    public final PoweredBy component18() {
        return this.poweredBy;
    }

    @Nullable
    public final String component19() {
        return this.teamIntro;
    }

    public final boolean component2() {
        return this.isRead;
    }

    @Nullable
    public final String component20() {
        return this.specialNotice;
    }

    @NotNull
    public final List<Participant.Builder> component3() {
        return this.participantBuilderList;
    }

    @NotNull
    public final List<Part.Builder> component4() {
        return this.partBuilderList;
    }

    @NotNull
    public final List<String> component5() {
        return this.groupConversationParticipantIds;
    }

    @NotNull
    public final LastParticipatingAdmin.Builder component6() {
        return this.lastParticipatingAdminBuilder;
    }

    @NotNull
    public final ComposerState component7() {
        return this.composerState;
    }

    public final boolean component8() {
        return this.preventEndUserReplies;
    }

    public final boolean component9() {
        return this.inboundConversationsDisabled;
    }

    @NotNull
    public final Conversation copy(@NotNull String id2, boolean z10, @NotNull List<Participant.Builder> participantBuilderList, @NotNull List<Part.Builder> partBuilderList, @NotNull List<String> groupConversationParticipantIds, @NotNull LastParticipatingAdmin.Builder lastParticipatingAdminBuilder, @NotNull ComposerState composerState, boolean z11, boolean z12, @NotNull String notificationStatus, @NotNull String state, boolean z13, @Nullable Ticket ticket, @NotNull ConversationUiFlags uiFlags, @Nullable Header header, @Nullable ConversationEndedButton conversationEndedButton, @Nullable FooterNotice footerNotice, @Nullable PoweredBy poweredBy, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(participantBuilderList, "participantBuilderList");
        Intrinsics.checkNotNullParameter(partBuilderList, "partBuilderList");
        Intrinsics.checkNotNullParameter(groupConversationParticipantIds, "groupConversationParticipantIds");
        Intrinsics.checkNotNullParameter(lastParticipatingAdminBuilder, "lastParticipatingAdminBuilder");
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(notificationStatus, "notificationStatus");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(uiFlags, "uiFlags");
        return new Conversation(id2, z10, participantBuilderList, partBuilderList, groupConversationParticipantIds, lastParticipatingAdminBuilder, composerState, z11, z12, notificationStatus, state, z13, ticket, uiFlags, header, conversationEndedButton, footerNotice, poweredBy, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) obj;
        return Intrinsics.areEqual(this.f293114id, conversation.f293114id) && this.isRead == conversation.isRead && Intrinsics.areEqual(this.participantBuilderList, conversation.participantBuilderList) && Intrinsics.areEqual(this.partBuilderList, conversation.partBuilderList) && Intrinsics.areEqual(this.groupConversationParticipantIds, conversation.groupConversationParticipantIds) && Intrinsics.areEqual(this.lastParticipatingAdminBuilder, conversation.lastParticipatingAdminBuilder) && Intrinsics.areEqual(this.composerState, conversation.composerState) && this.preventEndUserReplies == conversation.preventEndUserReplies && this.inboundConversationsDisabled == conversation.inboundConversationsDisabled && Intrinsics.areEqual(this.notificationStatus, conversation.notificationStatus) && Intrinsics.areEqual(this.state, conversation.state) && this.isInbound == conversation.isInbound && Intrinsics.areEqual(this.ticket, conversation.ticket) && Intrinsics.areEqual(this.uiFlags, conversation.uiFlags) && Intrinsics.areEqual(this.header, conversation.header) && Intrinsics.areEqual(this.conversationEndedButton, conversation.conversationEndedButton) && Intrinsics.areEqual(this.footerNotice, conversation.footerNotice) && Intrinsics.areEqual(this.poweredBy, conversation.poweredBy) && Intrinsics.areEqual(this.teamIntro, conversation.teamIntro) && Intrinsics.areEqual(this.specialNotice, conversation.specialNotice);
    }

    @NotNull
    public final ComposerState getComposerState() {
        return this.composerState;
    }

    @Nullable
    public final ConversationEndedButton getConversationEndedButton() {
        return this.conversationEndedButton;
    }

    @Nullable
    public final FooterNotice getFooterNotice() {
        return this.footerNotice;
    }

    @NotNull
    public final List<String> getGroupConversationParticipantIds() {
        return this.groupConversationParticipantIds;
    }

    @Nullable
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final String getId() {
        return this.f293114id;
    }

    public final boolean getInboundConversationsDisabled() {
        return this.inboundConversationsDisabled;
    }

    @NotNull
    public final Part getLastAdminPart() {
        Part partPrevious;
        List<Part> listParts = parts();
        ListIterator<Part> listIterator = listParts.listIterator(listParts.size());
        do {
            if (!listIterator.hasPrevious()) {
                partPrevious = null;
                break;
            }
            partPrevious = listIterator.previous();
        } while (!partPrevious.isAdmin());
        Part part = partPrevious;
        if (part != null) {
            return part;
        }
        Part NULL = Part.NULL;
        Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
        return NULL;
    }

    @NotNull
    public final LastParticipatingAdmin.Builder getLastParticipatingAdminBuilder() {
        return this.lastParticipatingAdminBuilder;
    }

    @NotNull
    public final String getNotificationStatus() {
        return this.notificationStatus;
    }

    @NotNull
    public final List<Part.Builder> getPartBuilderList() {
        return this.partBuilderList;
    }

    @NotNull
    public final List<Participant.Builder> getParticipantBuilderList() {
        return this.participantBuilderList;
    }

    @NotNull
    public final Map<String, Participant> getParticipants() {
        List<Participant.Builder> list = this.participantBuilderList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Participant.Builder builder : list) {
            Pair pair = TuplesKt.to(builder.build().getId(), builder.build());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @Nullable
    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    public final boolean getPreventEndUserReplies() {
        return this.preventEndUserReplies;
    }

    @Nullable
    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getTeamIntro() {
        return this.teamIntro;
    }

    @Nullable
    public final Ticket getTicket() {
        return this.ticket;
    }

    @NotNull
    public final ConversationUiFlags getUiFlags() {
        return this.uiFlags;
    }

    @NotNull
    public final List<Participant> groupConversationParticipants() {
        List<String> list = this.groupConversationParticipantIds;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Participant participant = getParticipants().get((String) it.next());
            if (participant != null) {
                arrayList.add(participant);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.f293114id.hashCode() * 31) + Boolean.hashCode(this.isRead)) * 31) + this.participantBuilderList.hashCode()) * 31) + this.partBuilderList.hashCode()) * 31) + this.groupConversationParticipantIds.hashCode()) * 31) + this.lastParticipatingAdminBuilder.hashCode()) * 31) + this.composerState.hashCode()) * 31) + Boolean.hashCode(this.preventEndUserReplies)) * 31) + Boolean.hashCode(this.inboundConversationsDisabled)) * 31) + this.notificationStatus.hashCode()) * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.isInbound)) * 31;
        Ticket ticket = this.ticket;
        int iHashCode2 = (((iHashCode + (ticket == null ? 0 : ticket.hashCode())) * 31) + this.uiFlags.hashCode()) * 31;
        Header header = this.header;
        int iHashCode3 = (iHashCode2 + (header == null ? 0 : header.hashCode())) * 31;
        ConversationEndedButton conversationEndedButton = this.conversationEndedButton;
        int iHashCode4 = (iHashCode3 + (conversationEndedButton == null ? 0 : conversationEndedButton.hashCode())) * 31;
        FooterNotice footerNotice = this.footerNotice;
        int iHashCode5 = (iHashCode4 + (footerNotice == null ? 0 : footerNotice.hashCode())) * 31;
        PoweredBy poweredBy = this.poweredBy;
        int iHashCode6 = (iHashCode5 + (poweredBy == null ? 0 : poweredBy.hashCode())) * 31;
        String str = this.teamIntro;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.specialNotice;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isInbound() {
        return this.isInbound;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    @NotNull
    public final Participant lastAdmin() {
        Object obj = null;
        for (Object obj2 : getParticipants().values()) {
            if (((Participant) obj2).isAdmin()) {
                obj = obj2;
            }
        }
        Participant participant = (Participant) obj;
        if (participant != null) {
            return participant;
        }
        Participant NULL = Participant.NULL;
        Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
        return NULL;
    }

    @NotNull
    public final Part lastPart() {
        Part part = (Part) CollectionsKt.lastOrNull((List) parts());
        if (part != null) {
            return part;
        }
        Part NULL = Part.NULL;
        Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
        return NULL;
    }

    @NotNull
    public final LastParticipatingAdmin lastParticipatingAdmin() {
        LastParticipatingAdmin lastParticipatingAdminBuild = this.lastParticipatingAdminBuilder.build();
        Intrinsics.checkNotNullExpressionValue(lastParticipatingAdminBuild, "build(...)");
        return lastParticipatingAdminBuild;
    }

    @NotNull
    public final List<Part> parts() {
        List<Part.Builder> list = this.partBuilderList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Part partBuild = ((Part.Builder) it.next()).build();
            Participant participant = getParticipants().get(partBuild.getParticipantId());
            if (participant != null) {
                partBuild.setParticipant(participant);
            }
            arrayList.add(partBuild);
        }
        return arrayList;
    }

    @NotNull
    public String toString() {
        return "Conversation(id=" + this.f293114id + ", isRead=" + this.isRead + ", participantBuilderList=" + this.participantBuilderList + ", partBuilderList=" + this.partBuilderList + ", groupConversationParticipantIds=" + this.groupConversationParticipantIds + ", lastParticipatingAdminBuilder=" + this.lastParticipatingAdminBuilder + ", composerState=" + this.composerState + ", preventEndUserReplies=" + this.preventEndUserReplies + ", inboundConversationsDisabled=" + this.inboundConversationsDisabled + ", notificationStatus=" + this.notificationStatus + ", state=" + this.state + ", isInbound=" + this.isInbound + ", ticket=" + this.ticket + ", uiFlags=" + this.uiFlags + ", header=" + this.header + ", conversationEndedButton=" + this.conversationEndedButton + ", footerNotice=" + this.footerNotice + ", poweredBy=" + this.poweredBy + ", teamIntro=" + this.teamIntro + ", specialNotice=" + this.specialNotice + ')';
    }

    public Conversation(@NotNull String id2, boolean z10, @NotNull List<Participant.Builder> participantBuilderList, @NotNull List<Part.Builder> partBuilderList, @NotNull List<String> groupConversationParticipantIds, @NotNull LastParticipatingAdmin.Builder lastParticipatingAdminBuilder, @NotNull ComposerState composerState, boolean z11, boolean z12, @NotNull String notificationStatus, @NotNull String state, boolean z13, @Nullable Ticket ticket, @NotNull ConversationUiFlags uiFlags, @Nullable Header header, @Nullable ConversationEndedButton conversationEndedButton, @Nullable FooterNotice footerNotice, @Nullable PoweredBy poweredBy, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(participantBuilderList, "participantBuilderList");
        Intrinsics.checkNotNullParameter(partBuilderList, "partBuilderList");
        Intrinsics.checkNotNullParameter(groupConversationParticipantIds, "groupConversationParticipantIds");
        Intrinsics.checkNotNullParameter(lastParticipatingAdminBuilder, "lastParticipatingAdminBuilder");
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(notificationStatus, "notificationStatus");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(uiFlags, "uiFlags");
        this.f293114id = id2;
        this.isRead = z10;
        this.participantBuilderList = participantBuilderList;
        this.partBuilderList = partBuilderList;
        this.groupConversationParticipantIds = groupConversationParticipantIds;
        this.lastParticipatingAdminBuilder = lastParticipatingAdminBuilder;
        this.composerState = composerState;
        this.preventEndUserReplies = z11;
        this.inboundConversationsDisabled = z12;
        this.notificationStatus = notificationStatus;
        this.state = state;
        this.isInbound = z13;
        this.ticket = ticket;
        this.uiFlags = uiFlags;
        this.header = header;
        this.conversationEndedButton = conversationEndedButton;
        this.footerNotice = footerNotice;
        this.poweredBy = poweredBy;
        this.teamIntro = str;
        this.specialNotice = str2;
    }

    public /* synthetic */ Conversation(String str, boolean z10, List list, List list2, List list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z11, boolean z12, String str2, String str3, boolean z13, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 16) != 0 ? CollectionsKt.emptyList() : list3, (i10 & 32) != 0 ? new LastParticipatingAdmin.Builder() : builder, (i10 & 64) != 0 ? ComposerState.Companion.getNULL() : composerState, (i10 & 128) != 0 ? false : z11, (i10 & 256) != 0 ? false : z12, (i10 & 512) != 0 ? "" : str2, (i10 & 1024) == 0 ? str3 : "", (i10 & 2048) == 0 ? z13 : false, (i10 & 4096) != 0 ? null : ticket, (i10 & 8192) != 0 ? ConversationUiFlags.Companion.getDEFAULT() : conversationUiFlags, (i10 & 16384) != 0 ? null : header, (i10 & 32768) != 0 ? null : conversationEndedButton, (i10 & 65536) != 0 ? null : footerNotice, (i10 & 131072) != 0 ? null : poweredBy, (i10 & 262144) != 0 ? null : str4, (i10 & 524288) != 0 ? null : str5);
    }
}
