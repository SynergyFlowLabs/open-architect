package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.FinStreamingData;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRefreshConversationUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefreshConversationUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,119:1\n560#2:120\n545#2,2:121\n547#2,4:126\n1755#3,3:123\n1755#3,3:130\n827#3:133\n855#3:134\n1755#3,3:135\n856#3:138\n226#4,5:139\n226#4,5:144\n*S KotlinDebug\n*F\n+ 1 RefreshConversationUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase\n*L\n42#1:120\n42#1:121,2\n42#1:126,4\n42#1:123,3\n46#1:130,3\n55#1:133\n55#1:134\n56#1:135,3\n55#1:138\n65#1:139,5\n92#1:144,5\n*E\n"})
public final class RefreshConversationUseCase {
    public static final int $stable = 8;

    @NotNull
    private final ConversationRepository conversationRepository;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    @NotNull
    private final RecordOpenedInteractionUseCase recordOpenedInteractionUseCase;

    @NotNull
    private final TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase$invoke$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase", f = "RefreshConversationUseCase.kt", i = {0, 0, 1, 1}, l = {34, 85}, m = "invoke", n = {"this", "clientStateFlow", "this", "conversation"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RefreshConversationUseCase.this.invoke(null, null, this);
        }
    }

    public RefreshConversationUseCase(@NotNull ConversationRepository conversationRepository, @NotNull IntercomDataLayer intercomDataLayer, @NotNull TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, @NotNull RecordOpenedInteractionUseCase recordOpenedInteractionUseCase) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(trackLastReceivedPartsUseCase, "trackLastReceivedPartsUseCase");
        Intrinsics.checkNotNullParameter(recordOpenedInteractionUseCase, "recordOpenedInteractionUseCase");
        this.conversationRepository = conversationRepository;
        this.intercomDataLayer = intercomDataLayer;
        this.trackLastReceivedPartsUseCase = trackLastReceivedPartsUseCase;
        this.recordOpenedInteractionUseCase = recordOpenedInteractionUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object invoke(@NotNull k0<ConversationClientState> k0Var, @NotNull GetConversationReason getConversationReason, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        AnonymousClass1 anonymousClass1;
        k0<ConversationClientState> k0Var2;
        FinStreamingData finStreamingData;
        RefreshConversationUseCase refreshConversationUseCase;
        Conversation conversation;
        Part part;
        RefreshConversationUseCase refreshConversationUseCase2 = this;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = refreshConversationUseCase2.new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = refreshConversationUseCase2.new AnonymousClass1(dVar);
        }
        Object conversation2 = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(conversation2);
            String conversationId = k0Var.getValue().getConversationId();
            if (conversationId != null) {
                ConversationRepository conversationRepository = refreshConversationUseCase2.conversationRepository;
                anonymousClass1.L$0 = refreshConversationUseCase2;
                k0Var2 = k0Var;
                anonymousClass1.L$1 = k0Var2;
                anonymousClass1.label = 1;
                conversation2 = conversationRepository.getConversation(conversationId, getConversationReason, anonymousClass1);
                if (conversation2 != objL) {
                }
                return objL;
            }
            return Unit.f312394a;
        }
        if (i11 == 1) {
            k0<ConversationClientState> k0Var3 = (k0) anonymousClass1.L$1;
            RefreshConversationUseCase refreshConversationUseCase3 = (RefreshConversationUseCase) anonymousClass1.L$0;
            ResultKt.m(conversation2);
            k0Var2 = k0Var3;
            refreshConversationUseCase2 = refreshConversationUseCase3;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            conversation = (Conversation) anonymousClass1.L$1;
            refreshConversationUseCase = (RefreshConversationUseCase) anonymousClass1.L$0;
            ResultKt.m(conversation2);
        }
        refreshConversationUseCase.conversationRepository.nexusEventsRepository().markAsSeen(conversation.getId());
        refreshConversationUseCase.intercomDataLayer.markConversationAsRead(conversation.getId());
        return Unit.f312394a;
        NetworkResponse networkResponse = (NetworkResponse) conversation2;
        ConversationClientState value = k0Var2.getValue();
        if (networkResponse instanceof NetworkResponse.Success) {
            Conversation conversation3 = (Conversation) ((NetworkResponse.Success) networkResponse).getBody();
            refreshConversationUseCase2.trackLastReceivedPartsUseCase.invoke(conversation3);
            Map<String, PendingMessage> pendingMessages = value.getPendingMessages();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, PendingMessage> entry : pendingMessages.entrySet()) {
                List<Part> listParts = conversation3.parts();
                if (!(listParts instanceof Collection) || !listParts.isEmpty()) {
                    Iterator<T> it = listParts.iterator();
                    do {
                        if (it.hasNext()) {
                            part = (Part) it.next();
                            if (Intrinsics.areEqual(part.getUuid(), entry.getValue().getPart().getUuid())) {
                                break;
                            }
                        }
                    } while (!Intrinsics.areEqual(part.getId(), entry.getValue().getPart().getId()));
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            List<Part> listParts2 = conversation3.parts();
            if (!(listParts2 instanceof Collection) || !listParts2.isEmpty()) {
                Iterator<T> it2 = listParts2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        finStreamingData = value.getFinStreamingData();
                        break;
                    }
                    Part part2 = (Part) it2.next();
                    String uuid = part2.getUuid();
                    Intrinsics.checkNotNullExpressionValue(uuid, "getUuid(...)");
                    if (!StringsKt.w3(uuid) && Intrinsics.areEqual(part2.getUuid(), value.getFinStreamingData().getClientAssignedUUID())) {
                        finStreamingData = new FinStreamingData(false, CollectionsKt.emptyList(), "", 0);
                        break;
                    }
                }
            } else {
                finStreamingData = value.getFinStreamingData();
                break;
            }
            FinStreamingData finStreamingData2 = finStreamingData;
            List<Part> listParts3 = conversation3.parts();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listParts3) {
                Part part3 = (Part) obj;
                if (!part3.isUser()) {
                    Conversation conversation4 = value.getConversation();
                    List<Part> listParts4 = conversation4 != null ? conversation4.parts() : null;
                    if (listParts4 == null) {
                        listParts4 = CollectionsKt.emptyList();
                    }
                    List<Part> list = listParts4;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it3 = list.iterator();
                        do {
                            if (it3.hasNext()) {
                            }
                        } while (!Intrinsics.areEqual(((Part) it3.next()).getId(), part3.getId()));
                    }
                    arrayList.add(obj);
                    break;
                }
            }
            Pair pairCalculateJumpToBottomButtonState = RefreshConversationUseCaseKt.calculateJumpToBottomButtonState(value, conversation3, arrayList);
            while (true) {
                NetworkResponse networkResponse2 = networkResponse;
                if (k0Var2.compareAndSet(k0Var2.getValue(), ConversationClientState.copy$default(value, linkedHashMap, conversation3, null, new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), null, null, null, networkResponse2, null, null, null, null, finStreamingData2, null, 0, 0, (FloatingIndicatorState) pairCalculateJumpToBottomButtonState.component1(), (String) pairCalculateJumpToBottomButtonState.component2(), false, false, null, null, 3993460, null))) {
                    break;
                }
                networkResponse = networkResponse2;
            }
            IntercomDataLayer intercomDataLayer = refreshConversationUseCase2.intercomDataLayer;
            Ticket ticket = conversation3.getTicket();
            if (ticket == null) {
                ticket = Ticket.Companion.getNULL();
            }
            intercomDataLayer.updateTicket(ticket);
            refreshConversationUseCase2.intercomDataLayer.fetchConversationSuccess(conversation3);
            refreshConversationUseCase2.recordOpenedInteractionUseCase.invoke(conversation3);
            if (!conversation3.isRead()) {
                ConversationRepository conversationRepository2 = refreshConversationUseCase2.conversationRepository;
                String id2 = conversation3.getId();
                anonymousClass1.L$0 = refreshConversationUseCase2;
                anonymousClass1.L$1 = conversation3;
                anonymousClass1.label = 2;
                if (conversationRepository2.markAsRead(id2, anonymousClass1) != objL) {
                    refreshConversationUseCase = refreshConversationUseCase2;
                    conversation = conversation3;
                    refreshConversationUseCase.conversationRepository.nexusEventsRepository().markAsSeen(conversation.getId());
                    refreshConversationUseCase.intercomDataLayer.markConversationAsRead(conversation.getId());
                }
                return objL;
            }
        } else {
            while (!k0Var2.compareAndSet(k0Var2.getValue(), ConversationClientState.copy$default(value, null, null, null, null, null, null, null, networkResponse, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194175, null))) {
            }
        }
        return Unit.f312394a;
    }

    public /* synthetic */ RefreshConversationUseCase(ConversationRepository conversationRepository, IntercomDataLayer intercomDataLayer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationRepository, (i10 & 2) != 0 ? Injector.get().getDataLayer() : intercomDataLayer, trackLastReceivedPartsUseCase, recordOpenedInteractionUseCase);
    }
}
