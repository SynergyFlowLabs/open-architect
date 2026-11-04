package io.intercom.android.sdk.tickets;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTicketDetailReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketDetailReducer.kt\nio/intercom/android/sdk/tickets/TicketDetailReducerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1557#2:93\n1628#2,3:94\n774#2:97\n865#2,2:98\n*S KotlinDebug\n*F\n+ 1 TicketDetailReducer.kt\nio/intercom/android/sdk/tickets/TicketDetailReducerKt\n*L\n32#1:93\n32#1:94,3\n42#1:97\n42#1:98,2\n*E\n"})
public final class TicketDetailReducerKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Ticket.ConversationButton.IconType.values().length];
            try {
                iArr[Ticket.ConversationButton.IconType.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ticket.ConversationButton.IconType.CONVERSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final TicketDetailState.TicketDetailContentState computeTicketViewState(@NotNull Ticket ticket, @NotNull UserIdentity user, @NotNull List<AvatarWrapper> activeAdminsAvatars, @NotNull TicketLaunchedFrom launchedFrom) {
        List listListOf;
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(activeAdminsAvatars, "activeAdminsAvatars");
        Intrinsics.checkNotNullParameter(launchedFrom, "launchedFrom");
        String title = ticket.getTitle();
        Participant participantBuild = ticket.getAssignee().build();
        Intrinsics.checkNotNullExpressionValue(participantBuild, "build(...)");
        if (!isUnassignedOrBot(participantBuild) || activeAdminsAvatars.isEmpty()) {
            Avatar avatar = ticket.getAssignee().build().getAvatar();
            Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
            listListOf = CollectionsKt.listOf(new AvatarWrapper(avatar, false, 2, null));
        } else {
            listListOf = CollectionsKt.take(activeAdminsAvatars, 3);
        }
        List list = listListOf;
        String statusDetail = ticket.getCurrentStatus().getStatusDetail();
        long jM543getColor0d7_KjU = toTicketStatus(ticket.getCurrentStatus()).m543getColor0d7_KjU();
        List<Ticket.Status> statusList = ticket.getStatusList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(statusList, 10));
        for (Ticket.Status status : statusList) {
            arrayList.add(new TicketTimelineCardState.ProgressSection(isDone(toTicketStatus(status), toTicketStatus(ticket.getCurrentStatus())), isLoading(toTicketStatus(status), toTicketStatus(ticket.getCurrentStatus()))));
        }
        TicketTimelineCardState ticketTimelineCardState = new TicketTimelineCardState(list, statusDetail, "", jM543getColor0d7_KjU, arrayList, ticket.getCurrentStatus().getTitle(), Long.valueOf(ticket.getLatestStatusUpdatedAt()), null);
        List<Ticket.TicketAttribute> attributes = ticket.getAttributes();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : attributes) {
            if (((Ticket.TicketAttribute) obj).hasValue()) {
                arrayList2.add(obj);
            }
        }
        String email = user.getEmail();
        Intrinsics.checkNotNullExpressionValue(email, "getEmail(...)");
        return new TicketDetailState.TicketDetailContentState(title, ticketTimelineCardState, arrayList2, email, ticket.getConversationId(), conversationButtonState(ticket.getConversationButton(), launchedFrom));
    }

    public static /* synthetic */ TicketDetailState.TicketDetailContentState computeTicketViewState$default(Ticket ticket, UserIdentity userIdentity, List list, TicketLaunchedFrom ticketLaunchedFrom, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return computeTicketViewState(ticket, userIdentity, list, ticketLaunchedFrom);
    }

    private static final ConversationButtonState conversationButtonState(Ticket.ConversationButton conversationButton, TicketLaunchedFrom ticketLaunchedFrom) {
        String text;
        boolean z10 = ((ticketLaunchedFrom instanceof TicketLaunchedFrom.Conversation) || conversationButton == null) ? false : true;
        Integer numValueOf = null;
        Ticket.ConversationButton.IconType icon = conversationButton != null ? conversationButton.getIcon() : null;
        int i10 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
        if (i10 == 1) {
            numValueOf = Integer.valueOf(R.drawable.intercom_send_message_icon);
        } else if (i10 == 2) {
            numValueOf = Integer.valueOf(R.drawable.intercom_messages_icon);
        }
        if (conversationButton == null || (text = conversationButton.getText()) == null) {
            text = "";
        }
        return new ConversationButtonState(z10, numValueOf, new StringProvider.ActualString(text));
    }

    public static final boolean isDone(@NotNull TicketStatus ticketStatus, @NotNull TicketStatus currentTicketStatus) {
        Intrinsics.checkNotNullParameter(ticketStatus, "<this>");
        Intrinsics.checkNotNullParameter(currentTicketStatus, "currentTicketStatus");
        return currentTicketStatus.ordinal() >= ticketStatus.ordinal();
    }

    public static final boolean isLoading(@NotNull TicketStatus ticketStatus, @NotNull TicketStatus currentTicketStatus) {
        Intrinsics.checkNotNullParameter(ticketStatus, "<this>");
        Intrinsics.checkNotNullParameter(currentTicketStatus, "currentTicketStatus");
        return currentTicketStatus.ordinal() == ticketStatus.ordinal() && currentTicketStatus.ordinal() < ArraysKt.getLastIndex(TicketStatus.values());
    }

    private static final boolean isUnassignedOrBot(Participant participant) {
        return Intrinsics.areEqual(participant, Participant.create("", "", "user", "", Avatar.create("", ""), Boolean.FALSE)) || participant.isBot().booleanValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final TicketStatus toTicketStatus(@NotNull Ticket.Status status) {
        Intrinsics.checkNotNullParameter(status, "<this>");
        String type = status.getType();
        switch (type.hashCode()) {
            case -882067636:
                if (type.equals("waiting_on_customer")) {
                    return TicketStatus.WaitingOnCustomer;
                }
                break;
            case -753541113:
                if (type.equals("in_progress")) {
                    return TicketStatus.InProgress;
                }
                break;
            case -341328904:
                if (type.equals("resolved")) {
                    return TicketStatus.Resolved;
                }
                break;
            case 348678395:
                if (type.equals(MetricTracker.Action.SUBMITTED)) {
                    return TicketStatus.Submitted;
                }
                break;
        }
        return TicketStatus.Submitted;
    }
}
