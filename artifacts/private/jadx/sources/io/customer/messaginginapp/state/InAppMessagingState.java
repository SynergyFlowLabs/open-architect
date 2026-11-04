package io.customer.messaginginapp.state;

import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.facebook.AuthenticationTokenClaims;
import com.rabbitmq.client.r;
import io.customer.messaginginapp.gist.GistEnvironment;
import io.customer.messaginginapp.gist.data.model.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nInAppMessagingState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessagingState.kt\nio/customer/messaginginapp/state/InAppMessagingState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1563#2:123\n1634#2,3:124\n*S KotlinDebug\n*F\n+ 1 InAppMessagingState.kt\nio/customer/messaginginapp/state/InAppMessagingState\n*L\n30#1:123\n30#1:124,3\n*E\n"})
public final class InAppMessagingState {

    @Nullable
    private final String currentRoute;

    @NotNull
    private final String dataCenter;

    @NotNull
    private final GistEnvironment environment;

    @NotNull
    private final Set<Message> messagesInQueue;

    @NotNull
    private final ModalMessageState modalMessageState;
    private final long pollInterval;

    @NotNull
    private final QueuedInlineMessagesState queuedInlineMessagesState;

    @NotNull
    private final String sessionId;

    @NotNull
    private final Set<String> shownMessageQueueIds;

    @NotNull
    private final String siteId;

    @Nullable
    private final String userId;

    public InAppMessagingState() {
        this(null, null, null, 0L, null, null, null, null, null, null, null, r.f265987x3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InAppMessagingState copy$default(InAppMessagingState inAppMessagingState, String str, String str2, GistEnvironment gistEnvironment, long j10, String str3, String str4, String str5, ModalMessageState modalMessageState, QueuedInlineMessagesState queuedInlineMessagesState, Set set, Set set2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inAppMessagingState.siteId;
        }
        if ((i10 & 2) != 0) {
            str2 = inAppMessagingState.dataCenter;
        }
        if ((i10 & 4) != 0) {
            gistEnvironment = inAppMessagingState.environment;
        }
        if ((i10 & 8) != 0) {
            j10 = inAppMessagingState.pollInterval;
        }
        if ((i10 & 16) != 0) {
            str3 = inAppMessagingState.userId;
        }
        if ((i10 & 32) != 0) {
            str4 = inAppMessagingState.currentRoute;
        }
        if ((i10 & 64) != 0) {
            str5 = inAppMessagingState.sessionId;
        }
        if ((i10 & 128) != 0) {
            modalMessageState = inAppMessagingState.modalMessageState;
        }
        if ((i10 & 256) != 0) {
            queuedInlineMessagesState = inAppMessagingState.queuedInlineMessagesState;
        }
        if ((i10 & 512) != 0) {
            set = inAppMessagingState.messagesInQueue;
        }
        if ((i10 & 1024) != 0) {
            set2 = inAppMessagingState.shownMessageQueueIds;
        }
        Set set3 = set;
        Set set4 = set2;
        QueuedInlineMessagesState queuedInlineMessagesState2 = queuedInlineMessagesState;
        String str6 = str5;
        String str7 = str3;
        long j11 = j10;
        GistEnvironment gistEnvironment2 = gistEnvironment;
        return inAppMessagingState.copy(str, str2, gistEnvironment2, j11, str7, str4, str6, modalMessageState, queuedInlineMessagesState2, set3, set4);
    }

    @NotNull
    public final String component1() {
        return this.siteId;
    }

    @NotNull
    public final Set<Message> component10() {
        return this.messagesInQueue;
    }

    @NotNull
    public final Set<String> component11() {
        return this.shownMessageQueueIds;
    }

    @NotNull
    public final String component2() {
        return this.dataCenter;
    }

    @NotNull
    public final GistEnvironment component3() {
        return this.environment;
    }

    public final long component4() {
        return this.pollInterval;
    }

    @Nullable
    public final String component5() {
        return this.userId;
    }

    @Nullable
    public final String component6() {
        return this.currentRoute;
    }

    @NotNull
    public final String component7() {
        return this.sessionId;
    }

    @NotNull
    public final ModalMessageState component8() {
        return this.modalMessageState;
    }

    @NotNull
    public final QueuedInlineMessagesState component9() {
        return this.queuedInlineMessagesState;
    }

    @NotNull
    public final InAppMessagingState copy(@NotNull String siteId, @NotNull String dataCenter, @NotNull GistEnvironment environment, long j10, @Nullable String str, @Nullable String str2, @NotNull String sessionId, @NotNull ModalMessageState modalMessageState, @NotNull QueuedInlineMessagesState queuedInlineMessagesState, @NotNull Set<Message> messagesInQueue, @NotNull Set<String> shownMessageQueueIds) {
        Intrinsics.checkNotNullParameter(siteId, "siteId");
        Intrinsics.checkNotNullParameter(dataCenter, "dataCenter");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(modalMessageState, "modalMessageState");
        Intrinsics.checkNotNullParameter(queuedInlineMessagesState, "queuedInlineMessagesState");
        Intrinsics.checkNotNullParameter(messagesInQueue, "messagesInQueue");
        Intrinsics.checkNotNullParameter(shownMessageQueueIds, "shownMessageQueueIds");
        return new InAppMessagingState(siteId, dataCenter, environment, j10, str, str2, sessionId, modalMessageState, queuedInlineMessagesState, messagesInQueue, shownMessageQueueIds);
    }

    @NotNull
    public final Map<String, Pair<Object, Object>> diff(@NotNull InAppMessagingState other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        if (!Intrinsics.areEqual(this.siteId, other.siteId)) {
            mapCreateMapBuilder.put("siteId", TuplesKt.to(this.siteId, other.siteId));
        }
        if (!Intrinsics.areEqual(this.dataCenter, other.dataCenter)) {
            mapCreateMapBuilder.put("dataCenter", TuplesKt.to(this.dataCenter, other.dataCenter));
        }
        GistEnvironment gistEnvironment = this.environment;
        GistEnvironment gistEnvironment2 = other.environment;
        if (gistEnvironment != gistEnvironment2) {
            mapCreateMapBuilder.put("environment", TuplesKt.to(gistEnvironment, gistEnvironment2));
        }
        long j10 = this.pollInterval;
        if (j10 != other.pollInterval) {
            mapCreateMapBuilder.put("pollInterval", TuplesKt.to(Long.valueOf(j10), Long.valueOf(other.pollInterval)));
        }
        if (!Intrinsics.areEqual(this.userId, other.userId)) {
            mapCreateMapBuilder.put("userId", TuplesKt.to(this.userId, other.userId));
        }
        if (!Intrinsics.areEqual(this.currentRoute, other.currentRoute)) {
            mapCreateMapBuilder.put("currentRoute", TuplesKt.to(this.currentRoute, other.currentRoute));
        }
        if (!Intrinsics.areEqual(this.sessionId, other.sessionId)) {
            mapCreateMapBuilder.put(UserEntry.sessionId, TuplesKt.to(this.sessionId, other.sessionId));
        }
        if (!Intrinsics.areEqual(this.modalMessageState, other.modalMessageState)) {
            mapCreateMapBuilder.put("modalMessageState", TuplesKt.to(this.modalMessageState, other.modalMessageState));
        }
        if (!Intrinsics.areEqual(this.queuedInlineMessagesState, other.queuedInlineMessagesState)) {
            mapCreateMapBuilder.put("embeddedMessagesState", TuplesKt.to(this.queuedInlineMessagesState, other.queuedInlineMessagesState));
        }
        if (!Intrinsics.areEqual(this.messagesInQueue, other.messagesInQueue)) {
            mapCreateMapBuilder.put("messagesInQueue", TuplesKt.to(this.messagesInQueue, other.messagesInQueue));
        }
        if (!Intrinsics.areEqual(this.shownMessageQueueIds, other.shownMessageQueueIds)) {
            mapCreateMapBuilder.put("shownMessageQueueIds", TuplesKt.to(this.shownMessageQueueIds, other.shownMessageQueueIds));
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppMessagingState)) {
            return false;
        }
        InAppMessagingState inAppMessagingState = (InAppMessagingState) obj;
        return Intrinsics.areEqual(this.siteId, inAppMessagingState.siteId) && Intrinsics.areEqual(this.dataCenter, inAppMessagingState.dataCenter) && this.environment == inAppMessagingState.environment && this.pollInterval == inAppMessagingState.pollInterval && Intrinsics.areEqual(this.userId, inAppMessagingState.userId) && Intrinsics.areEqual(this.currentRoute, inAppMessagingState.currentRoute) && Intrinsics.areEqual(this.sessionId, inAppMessagingState.sessionId) && Intrinsics.areEqual(this.modalMessageState, inAppMessagingState.modalMessageState) && Intrinsics.areEqual(this.queuedInlineMessagesState, inAppMessagingState.queuedInlineMessagesState) && Intrinsics.areEqual(this.messagesInQueue, inAppMessagingState.messagesInQueue) && Intrinsics.areEqual(this.shownMessageQueueIds, inAppMessagingState.shownMessageQueueIds);
    }

    @Nullable
    public final String getCurrentRoute() {
        return this.currentRoute;
    }

    @NotNull
    public final String getDataCenter() {
        return this.dataCenter;
    }

    @NotNull
    public final GistEnvironment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final Set<Message> getMessagesInQueue() {
        return this.messagesInQueue;
    }

    @NotNull
    public final ModalMessageState getModalMessageState() {
        return this.modalMessageState;
    }

    public final long getPollInterval() {
        return this.pollInterval;
    }

    @NotNull
    public final QueuedInlineMessagesState getQueuedInlineMessagesState() {
        return this.queuedInlineMessagesState;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final Set<String> getShownMessageQueueIds() {
        return this.shownMessageQueueIds;
    }

    @NotNull
    public final String getSiteId() {
        return this.siteId;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = ((((((this.siteId.hashCode() * 31) + this.dataCenter.hashCode()) * 31) + this.environment.hashCode()) * 31) + Long.hashCode(this.pollInterval)) * 31;
        String str = this.userId;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currentRoute;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        return ((((((((((iHashCode3 + iHashCode2) * 31) + this.sessionId.hashCode()) * 31) + this.modalMessageState.hashCode()) * 31) + this.queuedInlineMessagesState.hashCode()) * 31) + this.messagesInQueue.hashCode()) * 31) + this.shownMessageQueueIds.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("InAppMessagingState(");
        sb2.append("siteId='" + this.siteId + "',\n");
        sb2.append("dataCenter='" + this.dataCenter + "',\n");
        sb2.append("environment=" + this.environment + ",\n");
        sb2.append("pollInterval=" + this.pollInterval + ",\n");
        sb2.append("userId=" + this.userId + ",\n");
        sb2.append("currentRoute=" + this.currentRoute + ",\n");
        sb2.append("sessionId='" + this.sessionId + "',\n");
        sb2.append("modalMessageState=" + this.modalMessageState + ",\n");
        sb2.append("embeddedMessagesState=" + this.queuedInlineMessagesState + ",\n");
        Set<Message> set = this.messagesInQueue;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((Message) it.next()).getQueueId());
        }
        sb2.append("messagesInQueue=" + arrayList + ",\n");
        sb2.append("shownMessageQueueIds=" + this.shownMessageQueueIds + ")");
        return sb2.toString();
    }

    public InAppMessagingState(@NotNull String siteId, @NotNull String dataCenter, @NotNull GistEnvironment environment, long j10, @Nullable String str, @Nullable String str2, @NotNull String sessionId, @NotNull ModalMessageState modalMessageState, @NotNull QueuedInlineMessagesState queuedInlineMessagesState, @NotNull Set<Message> messagesInQueue, @NotNull Set<String> shownMessageQueueIds) {
        Intrinsics.checkNotNullParameter(siteId, "siteId");
        Intrinsics.checkNotNullParameter(dataCenter, "dataCenter");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(modalMessageState, "modalMessageState");
        Intrinsics.checkNotNullParameter(queuedInlineMessagesState, "queuedInlineMessagesState");
        Intrinsics.checkNotNullParameter(messagesInQueue, "messagesInQueue");
        Intrinsics.checkNotNullParameter(shownMessageQueueIds, "shownMessageQueueIds");
        this.siteId = siteId;
        this.dataCenter = dataCenter;
        this.environment = environment;
        this.pollInterval = j10;
        this.userId = str;
        this.currentRoute = str2;
        this.sessionId = sessionId;
        this.modalMessageState = modalMessageState;
        this.queuedInlineMessagesState = queuedInlineMessagesState;
        this.messagesInQueue = messagesInQueue;
        this.shownMessageQueueIds = shownMessageQueueIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ InAppMessagingState(String str, String str2, GistEnvironment gistEnvironment, long j10, String str3, String str4, String str5, ModalMessageState modalMessageState, QueuedInlineMessagesState queuedInlineMessagesState, Set set, Set set2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        QueuedInlineMessagesState queuedInlineMessagesState2;
        str = (i10 & 1) != 0 ? "" : str;
        str2 = (i10 & 2) != 0 ? "" : str2;
        GistEnvironment gistEnvironment2 = (i10 & 4) != 0 ? GistEnvironment.PROD : gistEnvironment;
        long j11 = (i10 & 8) != 0 ? AuthenticationTokenClaims.Z : j10;
        Map map = null;
        Object[] objArr = 0;
        String str6 = (i10 & 16) != 0 ? null : str3;
        String str7 = (i10 & 32) != 0 ? null : str4;
        String str8 = (i10 & 64) == 0 ? str5 : "";
        ModalMessageState modalMessageState2 = (i10 & 128) != 0 ? ModalMessageState.Initial.INSTANCE : modalMessageState;
        if ((i10 & 256) != 0) {
            queuedInlineMessagesState2 = new QueuedInlineMessagesState(map, 1, objArr == true ? 1 : 0);
        } else {
            queuedInlineMessagesState2 = queuedInlineMessagesState;
        }
        this(str, str2, gistEnvironment2, j11, str6, str7, str8, modalMessageState2, queuedInlineMessagesState2, (i10 & 512) != 0 ? SetsKt.emptySet() : set, (i10 & 1024) != 0 ? SetsKt.emptySet() : set2);
    }
}
