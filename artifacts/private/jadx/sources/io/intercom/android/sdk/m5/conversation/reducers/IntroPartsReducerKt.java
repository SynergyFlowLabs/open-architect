package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.BotIntro;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntroPartsReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntroPartsReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/IntroPartsReducerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1557#2:82\n1628#2,3:83\n1557#2:86\n1628#2,2:87\n295#2,2:89\n1630#2:91\n1567#2:93\n1598#2,4:94\n1#3:92\n*S KotlinDebug\n*F\n+ 1 IntroPartsReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/IntroPartsReducerKt\n*L\n15#1:82\n15#1:83,3\n28#1:86\n28#1:87,2\n31#1:89,2\n28#1:91\n62#1:93\n62#1:94,4\n*E\n"})
public final class IntroPartsReducerKt {
    private static final List<ContentRow> reduceBotIntroParts(ConversationClientState conversationClientState, List<? extends Part> list) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        boolean zIsEmpty = conversationClientState.getPendingMessages().isEmpty();
        List<? extends Part> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper((Part) obj, i10 == CollectionsKt.getLastIndex(list) && zIsEmpty, true, null, null, 24, null), ConversationPartsReducerKt.getGroupingPosition(list, i10), null, false, false, 16, null));
            i10 = i11;
        }
        listCreateListBuilder.addAll(arrayList);
        return CollectionsKt.build(listCreateListBuilder);
    }

    @NotNull
    public static final List<ContentRow> reduceIntroParts(@NotNull ConversationClientState clientState, @NotNull BotIntro botIntro, @NotNull TimeProvider timeProvider) {
        Collection collectionEmptyList;
        List<Part.Builder> parts;
        Object next;
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        Intrinsics.checkNotNullParameter(botIntro, "botIntro");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        List<List<Block.Builder>> blocks = botIntro.getBlocks();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(blocks, 10));
        Iterator<T> it = blocks.iterator();
        while (it.hasNext()) {
            Part partBuild = new Part.Builder().withBlocks((List) it.next()).withParticipantIsAdmin(true).withCreatedAt(timeProvider.currentTimeMillis()).build();
            partBuild.setParticipant(botIntro.getBuiltParticipant());
            arrayList.add(partBuild);
        }
        OpenMessengerResponse openMessengerResponse = clientState.getOpenMessengerResponse();
        OpenMessengerResponse.NewConversationData newConversationData = openMessengerResponse != null ? openMessengerResponse.getNewConversationData() : null;
        if (newConversationData == null || (parts = newConversationData.getParts()) == null) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            List<Part.Builder> list = parts;
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                Part partBuild2 = ((Part.Builder) it2.next()).build();
                Iterator<T> it3 = newConversationData.getParticipants().iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!Intrinsics.areEqual(((Participant.Builder) next).build().getId(), partBuild2.getParticipantId()));
                Participant.Builder builder = (Participant.Builder) next;
                Participant participantBuild = builder != null ? builder.build() : null;
                if (participantBuild != null) {
                    partBuild2.setParticipant(participantBuild);
                }
                collectionEmptyList.add(partBuild2);
            }
        }
        Collection collection = collectionEmptyList;
        if (!collection.isEmpty()) {
            arrayList = collection;
        }
        List list2 = (List) arrayList;
        return !list2.isEmpty() ? reduceBotIntroParts(clientState, list2) : CollectionsKt.emptyList();
    }
}
