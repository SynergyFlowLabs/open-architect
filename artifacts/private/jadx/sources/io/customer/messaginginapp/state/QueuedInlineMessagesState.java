package io.customer.messaginginapp.state;

import io.customer.messaginginapp.gist.data.model.Message;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class QueuedInlineMessagesState {

    @NotNull
    private final Map<String, InlineMessageState> messagesByElementId;

    /* JADX WARN: Multi-variable type inference failed */
    public QueuedInlineMessagesState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueuedInlineMessagesState copy$default(QueuedInlineMessagesState queuedInlineMessagesState, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = queuedInlineMessagesState.messagesByElementId;
        }
        return queuedInlineMessagesState.copy(map);
    }

    @NotNull
    public final QueuedInlineMessagesState addMessage(@NotNull Message message, @NotNull String elementId) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        InlineMessageState.ReadyToEmbed readyToEmbed = new InlineMessageState.ReadyToEmbed(message, elementId);
        Map mapCreateMapBuilder = MapsKt.createMapBuilder(this.messagesByElementId.size() + 1);
        mapCreateMapBuilder.putAll(this.messagesByElementId);
        mapCreateMapBuilder.put(elementId, readyToEmbed);
        return copy(MapsKt.build(mapCreateMapBuilder));
    }

    @NotNull
    public final List<InlineMessageState> allMessages() {
        return CollectionsKt.toList(this.messagesByElementId.values());
    }

    @NotNull
    public final Map<String, InlineMessageState> component1$messaginginapp_release() {
        return this.messagesByElementId;
    }

    @NotNull
    public final QueuedInlineMessagesState copy(@NotNull Map<String, ? extends InlineMessageState> messagesByElementId) {
        Intrinsics.checkNotNullParameter(messagesByElementId, "messagesByElementId");
        return new QueuedInlineMessagesState(messagesByElementId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QueuedInlineMessagesState) && Intrinsics.areEqual(this.messagesByElementId, ((QueuedInlineMessagesState) obj).messagesByElementId);
    }

    @Nullable
    public final InlineMessageState getMessage(@NotNull String elementId) {
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        return this.messagesByElementId.get(elementId);
    }

    @NotNull
    public final Map<String, InlineMessageState> getMessagesByElementId$messaginginapp_release() {
        return this.messagesByElementId;
    }

    public int hashCode() {
        return this.messagesByElementId.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("EmbeddedMessagesState(");
        sb2.append("messages=" + this.messagesByElementId.size() + ", ");
        sb2.append("ids=" + this.messagesByElementId.keySet() + ", ");
        sb2.append("states=" + this.messagesByElementId.values());
        sb2.append(")");
        return sb2.toString();
    }

    @NotNull
    public final QueuedInlineMessagesState updateMessageState(@NotNull String queueId, @NotNull InlineMessageState newState) {
        Object next;
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        Intrinsics.checkNotNullParameter(newState, "newState");
        Iterator<T> it = this.messagesByElementId.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((InlineMessageState) ((Map.Entry) next).getValue()).getMessage().getQueueId(), queueId));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return this;
        }
        Map mapCreateMapBuilder = MapsKt.createMapBuilder(this.messagesByElementId.size());
        mapCreateMapBuilder.putAll(this.messagesByElementId);
        mapCreateMapBuilder.put(entry.getKey(), newState);
        return copy(MapsKt.build(mapCreateMapBuilder));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QueuedInlineMessagesState(@NotNull Map<String, ? extends InlineMessageState> messagesByElementId) {
        Intrinsics.checkNotNullParameter(messagesByElementId, "messagesByElementId");
        this.messagesByElementId = messagesByElementId;
    }

    public /* synthetic */ QueuedInlineMessagesState(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? MapsKt.emptyMap() : map);
    }
}
