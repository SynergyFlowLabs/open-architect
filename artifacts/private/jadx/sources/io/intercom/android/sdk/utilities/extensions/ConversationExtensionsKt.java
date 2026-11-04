package io.intercom.android.sdk.utilities.extensions;

import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationExtensions.kt\nio/intercom/android/sdk/utilities/extensions/ConversationExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,14:1\n1971#2,14:15\n1755#2,3:29\n*S KotlinDebug\n*F\n+ 1 ConversationExtensions.kt\nio/intercom/android/sdk/utilities/extensions/ConversationExtensionsKt\n*L\n9#1:15,14\n13#1:29,3\n*E\n"})
public final class ConversationExtensionsKt {
    public static final boolean hasNonTicketParts(@NotNull Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        List<Part> listParts = conversation.parts();
        if ((listParts instanceof Collection) && listParts.isEmpty()) {
            return false;
        }
        Iterator<T> it = listParts.iterator();
        while (it.hasNext()) {
            if (((Part) it.next()).getMessageStyle() != MessageStyle.TICKET_STATE_UPDATED) {
                return true;
            }
        }
        return false;
    }

    public static final long lastActionCreatedAt(@NotNull Conversation conversation) {
        List<Ticket.Status> statusList;
        Object obj;
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        if (!Intrinsics.areEqual(conversation.lastPart(), Part.NULL)) {
            return conversation.lastPart().getCreatedAt();
        }
        Ticket ticket = conversation.getTicket();
        if (ticket == null || (statusList = ticket.getStatusList()) == null) {
            return 0L;
        }
        Iterator<T> it = statusList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long createdDate = ((Ticket.Status) next).getCreatedDate();
                do {
                    Object next2 = it.next();
                    long createdDate2 = ((Ticket.Status) next2).getCreatedDate();
                    if (createdDate < createdDate2) {
                        next = next2;
                        createdDate = createdDate2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Ticket.Status status = (Ticket.Status) obj;
        if (status != null) {
            return status.getCreatedDate();
        }
        return 0L;
    }
}
