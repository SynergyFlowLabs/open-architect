package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTrackLastReceivedPartsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackLastReceivedPartsUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/TrackLastReceivedPartsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n774#2:61\n865#2,2:62\n2642#2:64\n1863#2,2:66\n1#3:65\n*S KotlinDebug\n*F\n+ 1 TrackLastReceivedPartsUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/TrackLastReceivedPartsUseCase\n*L\n35#1:61\n35#1:62,2\n38#1:64\n47#1:66,2\n38#1:65\n*E\n"})
public final class TrackLastReceivedPartsUseCase {
    public static final int $stable = 8;

    @NotNull
    private Conversation currentConversation;

    @NotNull
    private final MetricTracker metricTracker;

    @NotNull
    private final Function0<UserIdentity> userIdentity;

    /* JADX WARN: Multi-variable type inference failed */
    public TrackLastReceivedPartsUseCase() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserIdentity _init_$lambda$0() {
        return Injector.get().getUserIdentity();
    }

    public final synchronized void invoke(@NotNull Conversation newConversation) {
        try {
            Intrinsics.checkNotNullParameter(newConversation, "newConversation");
            int size = this.currentConversation.parts().size();
            int size2 = newConversation.parts().size();
            List<Part> listEmptyList = (size == 0 && this.currentConversation.getTicket() == null) ? (newConversation.isRead() || !newConversation.lastPart().isReply()) ? CollectionsKt.emptyList() : CollectionsKt.listOf(newConversation.lastPart()) : size2 > size ? newConversation.parts().subList(size, size2) : CollectionsKt.emptyList();
            ArrayList<Part> arrayList = new ArrayList();
            for (Object obj : listEmptyList) {
                Part part = (Part) obj;
                if (part.isAdmin() || (!part.getParticipant().isUserWithId(this.userIdentity.invoke().getIntercomId()) && !Intrinsics.areEqual(part, Part.NULL))) {
                    arrayList.add(obj);
                }
            }
            for (Part part2 : arrayList) {
                this.metricTracker.receivedReply(part2.hasAttachments(), PartExtensionsKt.isLinkCard(part2), part2.getId(), newConversation.getId());
                if (Intrinsics.areEqual(part2.getId(), ((Part) CollectionsKt.last((List) listEmptyList)).getId())) {
                    List<ReplyOption> replyOptions = part2.getReplyOptions();
                    Intrinsics.checkNotNullExpressionValue(replyOptions, "getReplyOptions(...)");
                    Iterator<T> it = replyOptions.iterator();
                    while (it.hasNext()) {
                        this.metricTracker.receivedQuickReply(((ReplyOption) it.next()).getUuid(), newConversation.getId(), part2.getId());
                    }
                }
            }
            this.currentConversation = newConversation;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackLastReceivedPartsUseCase(@NotNull MetricTracker metricTracker, @NotNull Function0<? extends UserIdentity> userIdentity) {
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        this.metricTracker = metricTracker;
        this.userIdentity = userIdentity;
        this.currentConversation = new Conversation(null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public /* synthetic */ TrackLastReceivedPartsUseCase(MetricTracker metricTracker, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i10 & 2) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.usecase.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrackLastReceivedPartsUseCase._init_$lambda$0();
            }
        } : function0);
    }
}
