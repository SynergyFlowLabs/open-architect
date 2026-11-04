package io.intercom.android.sdk.m5.conversation.reducers;

import android.text.format.DateUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.EventLabelSegment;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EventContent;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.tickets.TicketDetailReducerKt;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationPartsReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationPartsReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/ConversationPartsReducerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n827#2:271\n855#2,2:272\n785#2:274\n796#2:275\n1872#2,2:276\n797#2,2:278\n1874#2:280\n799#2:281\n1485#2:282\n1510#2,3:283\n1513#2,3:293\n1863#2:296\n1557#2:297\n1628#2,3:298\n1567#2:301\n1598#2,4:302\n1864#2:306\n1557#2:307\n1628#2,3:308\n381#3,7:286\n1#4:311\n*S KotlinDebug\n*F\n+ 1 ConversationPartsReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/ConversationPartsReducerKt\n*L\n51#1:271\n51#1:272,2\n55#1:274\n55#1:275\n55#1:276,2\n55#1:278,2\n55#1:280\n55#1:281\n68#1:282\n68#1:283,3\n68#1:293,3\n74#1:296\n82#1:297\n82#1:298,3\n87#1:301\n87#1:302,4\n74#1:306\n225#1:307\n225#1:308,3\n68#1:286,7\n*E\n"})
public final class ConversationPartsReducerKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageStyle.values().length];
            try {
                iArr[MessageStyle.TICKET_STATE_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageStyle.MERGED_PRIMARY_CONVERSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final GroupingPosition getGroupingPosition(@NotNull List<? extends Part> allParts, int i10) {
        Intrinsics.checkNotNullParameter(allParts, "allParts");
        if (PartExtensionsKt.hasPreviousConcatPartNewStyle(allParts, i10) && PartExtensionsKt.hasNextConcatPartNewStyle(allParts, i10)) {
            return GroupingPosition.MIDDLE;
        }
        if (PartExtensionsKt.hasPreviousConcatPartNewStyle(allParts, i10)) {
            return GroupingPosition.BOTTOM;
        }
        return PartExtensionsKt.hasNextConcatPartNewStyle(allParts, i10) ? GroupingPosition.TOP : GroupingPosition.STANDALONE;
    }

    private static final boolean hasPendingMessageAfter(Part part, Map<String, PendingMessage> map) {
        Long l10;
        long createdAt = part.getCreatedAt();
        Iterator<T> it = map.values().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((PendingMessage) it.next()).getPart().getCreatedAt());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((PendingMessage) it.next()).getPart().getCreatedAt());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l10 = lValueOf;
        } else {
            l10 = null;
        }
        return l10 != null && createdAt < l10.longValue();
    }

    public static final boolean isAdminOrAltParticipant(@NotNull Part part, @NotNull UserIdentity userIdentity) {
        Intrinsics.checkNotNullParameter(part, "part");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        return part.isAdmin() || !part.getParticipant().isUserWithId(userIdentity.getIntercomId());
    }

    private static final ContentRow reduceEvent(Part part) {
        List listListOf;
        MessageStyle messageStyle = part.getMessageStyle();
        int i10 = messageStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageStyle.ordinal()];
        if (i10 == 1) {
            String status = part.getEventData().getStatus();
            String eventAsPlainText = part.getEventData().getEventAsPlainText();
            long createdAt = part.getCreatedAt();
            String customStateLabel = part.getEventData().getCustomStateLabel();
            String customStatePrefix = part.getEventData().getCustomStatePrefix();
            String id2 = part.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            return new ContentRow.TicketStatusRow(status, eventAsPlainText, createdAt, customStateLabel, customStatePrefix, id2);
        }
        int i11 = 1 & 2;
        if (i10 == 2) {
            String mergedConversationId = part.getEventData().getMergedConversationId();
            String description = part.getEventData().getDescription();
            String id3 = part.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
            return new ContentRow.MergedConversationRow(description, mergedConversationId, id3);
        }
        if (part.getEventData().getEventContent().isEmpty()) {
            listListOf = CollectionsKt.listOf(new EventLabelSegment(part.getEventData().getEventAsPlainText(), null));
        } else {
            List<EventContent> eventContent = part.getEventData().getEventContent();
            listListOf = new ArrayList(CollectionsKt.collectionSizeOrDefault(eventContent, 10));
            for (EventContent eventContent2 : eventContent) {
                listListOf.add(new EventLabelSegment(eventContent2.getText(), eventContent2.getWeight()));
            }
        }
        Avatar avatarCreate = Avatar.create(part.getEventData().getParticipant().getAvatar().getImageUrl(), part.getEventData().getParticipant().getInitial());
        Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
        String id4 = part.getId();
        Intrinsics.checkNotNullExpressionValue(id4, "getId(...)");
        return new ContentRow.EventRow(listListOf, avatarCreate, id4);
    }

    @NotNull
    public static final List<ContentRow> reduceMessages(@NotNull ConversationClientState conversationClientState, @NotNull UserIdentity userIdentity, @NotNull AppConfig config) {
        int i10;
        boolean zAdd;
        ConversationClientState clientState = conversationClientState;
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(config, "config");
        Conversation conversation = clientState.getConversation();
        if (conversation == null) {
            return CollectionsKt.emptyList();
        }
        if (conversation.getTicket() != null && !ConversationExtensionsKt.hasNonTicketParts(conversation) && clientState.getPendingMessages().isEmpty()) {
            return CollectionsKt.listOf(new ContentRow.BigTicketRow(TicketDetailReducerKt.computeTicketViewState$default(conversation.getTicket(), userIdentity, null, new TicketLaunchedFrom.Conversation(conversation.getTicket()), 4, null), conversation.getTicket().getId()));
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        List<Part> listParts = conversation.parts();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listParts) {
            List<ReplyOption> replyOptions = ((Part) obj).getReplyOptions();
            Intrinsics.checkNotNullExpressionValue(replyOptions, "getReplyOptions(...)");
            if (replyOptions.isEmpty() || !conversation.getPreventEndUserReplies()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (Object obj2 : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Part part = (Part) obj2;
            if (part.getMessageStyle() != MessageStyle.QUICK_REPLY || (i11 == CollectionsKt.getLastIndex(conversation.parts()) && !hasPendingMessageAfter(part, clientState.getPendingMessages()))) {
                arrayList2.add(obj2);
            }
            i11 = i12;
        }
        Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) arrayList2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            i10 = 1000;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Calendar calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
            calendar.setTime(new Date(((long) 1000) * ((Part) next).getCreatedAt()));
            Integer numValueOf = Integer.valueOf(calendar.get(6));
            Object arrayList3 = linkedHashMap.get(numValueOf);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList3);
            }
            ((List) arrayList3).add(next);
        }
        for (List list : linkedHashMap.values()) {
            boolean zIsToday = DateUtils.isToday(((Part) CollectionsKt.first(list)).getCreatedAt() * ((long) i10));
            if (!((Part) CollectionsKt.first(list)).isInitialMessage() || (!PartExtensionsKt.isLinkCard((Part) CollectionsKt.first(list)) && !zIsToday)) {
                listCreateListBuilder.add(new ContentRow.DayDividerRow(((Part) CollectionsKt.first(list)).getCreatedAt()));
            }
            List list2 = list;
            Collection<PendingMessage> collectionValues = clientState.getPendingMessages().values();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((PendingMessage) it2.next()).getPart());
            }
            List listPlus = CollectionsKt.plus((Collection) list2, (Iterable) arrayList4);
            List listCreateListBuilder2 = CollectionsKt.createListBuilder();
            List list3 = list;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            int i13 = 0;
            for (Object obj3 : list3) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Part part2 = (Part) obj3;
                if (clientState.getNewMessageId() != null && Intrinsics.areEqual(clientState.getNewMessageId(), part2.getId())) {
                    String id2 = part2.getId();
                    Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                    listCreateListBuilder2.add(new ContentRow.NewMessagesRow(id2));
                }
                if (part2.isInitialMessage() && PartExtensionsKt.isLinkCard(part2)) {
                    zAdd = listCreateListBuilder2.add(new ContentRow.AskedAboutRow(part2));
                } else if (part2.isEvent().booleanValue()) {
                    zAdd = listCreateListBuilder2.add(reduceEvent(part2));
                } else if (part2.getMessageStyle() == MessageStyle.POST) {
                    zAdd = listCreateListBuilder2.add(new ContentRow.PostCardRow(part2, config.getName()));
                } else if (part2.getMessageStyle() == MessageStyle.NOTE) {
                    zAdd = listCreateListBuilder2.add(new ContentRow.NoteCardRow(part2, config.getName()));
                } else if (part2.getMessageStyle() == MessageStyle.FIN_ANSWER) {
                    zAdd = listCreateListBuilder2.add(new ContentRow.FinAnswerRow(part2, getGroupingPosition(listPlus, i13)));
                } else if (PartExtensionsKt.isQuickReplyOnly(part2)) {
                    List<ReplyOption> replyOptions2 = part2.getReplyOptions();
                    Intrinsics.checkNotNullExpressionValue(replyOptions2, "getReplyOptions(...)");
                    String id3 = part2.getId();
                    Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
                    zAdd = listCreateListBuilder2.add(new ContentRow.QuickRepliesRow(replyOptions2, id3));
                } else {
                    boolean zIsAdminOrAltParticipant = isAdminOrAltParticipant(part2, userIdentity);
                    Part part3 = (Part) objLastOrNull;
                    boolean z10 = Intrinsics.areEqual(part2.getId(), part3 != null ? part3.getId() : null) && conversationClientState.getPendingMessages().isEmpty() && !conversationClientState.getFinStreamingData().isFinStreaming() && Intrinsics.areEqual(conversationClientState.getCurrentlyTypingState(), new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null));
                    part2.setParentConversation(conversation);
                    ContentRow.BubbleMessageRow bubbleMessageRow = new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(part2, z10, zIsAdminOrAltParticipant, conversationClientState.getFailedAttributeIdentifiers(), conversationClientState.getLoadingAttributeIdentifiers()), getGroupingPosition(listPlus, i13), null, false, false, 16, null);
                    if (shouldShowQuickReplies(part2, z10, zIsAdminOrAltParticipant)) {
                        listCreateListBuilder2.add(bubbleMessageRow);
                        List<ReplyOption> replyOptions3 = part2.getReplyOptions();
                        Intrinsics.checkNotNullExpressionValue(replyOptions3, "getReplyOptions(...)");
                        String id4 = part2.getId();
                        Intrinsics.checkNotNullExpressionValue(id4, "getId(...)");
                        zAdd = listCreateListBuilder2.add(new ContentRow.QuickRepliesRow(replyOptions3, id4));
                    } else {
                        zAdd = listCreateListBuilder2.add(bubbleMessageRow);
                    }
                }
                arrayList5.add(Boolean.valueOf(zAdd));
                clientState = conversationClientState;
                i13 = i14;
            }
            listCreateListBuilder.addAll(CollectionsKt.build(listCreateListBuilder2));
            i10 = 1000;
            clientState = conversationClientState;
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    private static final boolean shouldShowQuickReplies(Part part, boolean z10, boolean z11) {
        if (!z10) {
            return false;
        }
        List<ReplyOption> replyOptions = part.getReplyOptions();
        Intrinsics.checkNotNullExpressionValue(replyOptions, "getReplyOptions(...)");
        return !replyOptions.isEmpty() && z11;
    }
}
