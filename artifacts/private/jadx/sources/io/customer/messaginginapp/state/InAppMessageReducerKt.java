package io.customer.messaginginapp.state;

import io.customer.messaginginapp.gist.GistEnvironment;
import io.customer.messaginginapp.gist.data.model.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nInAppMessageReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageReducer.kt\nio/customer/messaginginapp/state/InAppMessageReducerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1803#2,3:124\n827#2:127\n855#2,2:128\n*S KotlinDebug\n*F\n+ 1 InAppMessageReducer.kt\nio/customer/messaginginapp/state/InAppMessageReducerKt\n*L\n52#1:124,3\n70#1:127\n70#1:128,2\n*E\n"})
public final class InAppMessageReducerKt {

    @NotNull
    private static final Function2<InAppMessagingState, Object, InAppMessagingState> inAppMessagingReducer = new Function2() { // from class: io.customer.messaginginapp.state.a
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return InAppMessageReducerKt.inAppMessagingReducer$lambda$4((InAppMessagingState) obj, obj2);
        }
    };

    @NotNull
    public static final Function2<InAppMessagingState, Object, InAppMessagingState> getInAppMessagingReducer() {
        return inAppMessagingReducer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:80:0x0291  */
    /* JADX WARN: Code duplicated, block: B:83:0x02aa A[LOOP:0: B:81:0x02a4->B:83:0x02aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x02f1  */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x02aa, please report this as an issue */
    public static final InAppMessagingState inAppMessagingReducer$lambda$4(InAppMessagingState state, Object action) {
        String str;
        InAppMessagingState inAppMessagingState;
        int i10;
        InAppMessagingState inAppMessagingStateWithMessageDismissed;
        QueuedInlineMessagesState queuedInlineMessagesState;
        Map<String, Pair<Object, Object>> mapDiff;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof InAppMessagingAction.Initialize)) {
            str = null;
            if (action instanceof InAppMessagingAction.SetPageRoute) {
                inAppMessagingState = state;
                inAppMessagingStateWithMessageDismissed = InAppMessagingState.copy$default(inAppMessagingState, null, null, null, 0L, null, ((InAppMessagingAction.SetPageRoute) action).getRoute(), null, null, null, null, null, 2015, null);
            } else if (action instanceof InAppMessagingAction.SetUserIdentifier) {
                inAppMessagingState = state;
                inAppMessagingStateWithMessageDismissed = InAppMessagingState.copy$default(inAppMessagingState, null, null, null, 0L, ((InAppMessagingAction.SetUserIdentifier) action).getUser(), null, null, null, null, null, null, 2031, null);
            } else if (action instanceof InAppMessagingAction.ClearMessageQueue) {
                inAppMessagingState = state;
                inAppMessagingStateWithMessageDismissed = InAppMessagingState.copy$default(inAppMessagingState, null, null, null, 0L, null, null, null, null, null, SetsKt.emptySet(), null, 1535, null);
            } else if (action instanceof InAppMessagingAction.ProcessMessageQueue) {
                inAppMessagingState = state;
                inAppMessagingStateWithMessageDismissed = InAppMessagingState.copy$default(inAppMessagingState, null, null, null, 0L, null, null, null, null, null, CollectionsKt.toSet(((InAppMessagingAction.ProcessMessageQueue) action).getMessages()), null, 1535, null);
            } else if (action instanceof InAppMessagingAction.SetPollingInterval) {
                inAppMessagingState = state;
                inAppMessagingStateWithMessageDismissed = InAppMessagingState.copy$default(inAppMessagingState, null, null, null, ((InAppMessagingAction.SetPollingInterval) action).getInterval(), null, null, null, null, null, null, null, 2039, null);
            } else {
                inAppMessagingState = state;
                if (!(action instanceof InAppMessagingAction.EngineAction.MessageLoadingFailed)) {
                    if (action instanceof InAppMessagingAction.LoadMessage) {
                        inAppMessagingStateWithMessageDismissed = InAppMessagingState.copy$default(inAppMessagingState, null, null, null, 0L, null, null, null, new ModalMessageState.Loading(((InAppMessagingAction.LoadMessage) action).getMessage()), null, null, null, 1919, null);
                    } else if (action instanceof InAppMessagingAction.Reset) {
                        String string = UUID.randomUUID().toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        inAppMessagingState = state;
                        inAppMessagingStateWithMessageDismissed = InAppMessagingState.copy$default(inAppMessagingState, null, null, null, 0L, null, null, string, ModalMessageState.Initial.INSTANCE, new QueuedInlineMessagesState(null, 1, null), SetsKt.emptySet(), SetsKt.emptySet(), 15, null);
                    } else if (action instanceof InAppMessagingAction.EmbedMessages) {
                        List<Message> messages = ((InAppMessagingAction.EmbedMessages) action).getMessages();
                        QueuedInlineMessagesState queuedInlineMessagesState2 = state.getQueuedInlineMessagesState();
                        Iterator<T> it = messages.iterator();
                        loop1: while (true) {
                            queuedInlineMessagesState = queuedInlineMessagesState2;
                            while (true) {
                                if (!it.hasNext()) {
                                    break loop1;
                                }
                                Message message = (Message) it.next();
                                String embeddedElementId = message.getEmbeddedElementId();
                                if (embeddedElementId == null || (queuedInlineMessagesState2 = queuedInlineMessagesState.addMessage(message, embeddedElementId)) == null) {
                                }
                            }
                        }
                        inAppMessagingState = state;
                        inAppMessagingStateWithMessageDismissed = InAppMessagingState.copy$default(inAppMessagingState, null, null, null, 0L, null, null, null, null, queuedInlineMessagesState, null, null, 1791, null);
                    } else {
                        inAppMessagingState = state;
                        if (action instanceof InAppMessagingAction.DisplayMessage) {
                            InAppMessagingAction.DisplayMessage displayMessage = (InAppMessagingAction.DisplayMessage) action;
                            String queueId = displayMessage.getMessage().getQueueId();
                            if (queueId != null) {
                                Set<String> setPlus = InAppMessagingActionKt.shouldMarkMessageAsShown((InAppMessagingAction) action) ? SetsKt.plus(inAppMessagingState.getShownMessageQueueIds(), queueId) : inAppMessagingState.getShownMessageQueueIds();
                                Set<Message> messagesInQueue = inAppMessagingState.getMessagesInQueue();
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : messagesInQueue) {
                                    if (!Intrinsics.areEqual(((Message) obj).getQueueId(), queueId)) {
                                        arrayList.add(obj);
                                    }
                                }
                                Set set = CollectionsKt.toSet(arrayList);
                                if (displayMessage.getMessage().isEmbedded()) {
                                    String embeddedElementId2 = displayMessage.getMessage().getEmbeddedElementId();
                                    if (embeddedElementId2 == null) {
                                        embeddedElementId2 = "";
                                    }
                                    inAppMessagingStateWithMessageDismissed = InAppMessagingStateExtensionsKt.withUpdatedEmbeddedMessage(inAppMessagingState, queueId, new InlineMessageState.Embedded(displayMessage.getMessage(), embeddedElementId2), setPlus, set);
                                } else {
                                    inAppMessagingStateWithMessageDismissed = InAppMessagingState.copy$default(inAppMessagingState, null, null, null, 0L, null, null, null, new ModalMessageState.Displayed(displayMessage.getMessage()), null, set, setPlus, 383, null);
                                }
                                if (inAppMessagingStateWithMessageDismissed == null) {
                                }
                            }
                            i10 = 2;
                            inAppMessagingStateWithMessageDismissed = inAppMessagingState;
                        } else if (action instanceof InAppMessagingAction.DismissMessage) {
                            inAppMessagingStateWithMessageDismissed = InAppMessagingStateExtensionsKt.withMessageDismissed(inAppMessagingState, ((InAppMessagingAction.DismissMessage) action).getMessage(), InAppMessagingActionKt.shouldMarkMessageAsShown((InAppMessagingAction) action));
                        } else {
                            if ((action instanceof InAppMessagingAction.EngineAction.Tap) || (action instanceof InAppMessagingAction.ReportError)) {
                                i10 = 2;
                            } else {
                                i10 = 2;
                                ih.e.a.a(eh.d.f274883c.w(), "Unhandled action received: " + action, null, 2, null);
                            }
                            inAppMessagingStateWithMessageDismissed = inAppMessagingState;
                        }
                    }
                    mapDiff = inAppMessagingState.diff(inAppMessagingStateWithMessageDismissed);
                    if (mapDiff.isEmpty()) {
                        ih.e.a.a(eh.d.f274883c.w(), "Store: no state changes after action", str, i10, str);
                        return inAppMessagingStateWithMessageDismissed;
                    }
                    ih.e.a.a(eh.d.f274883c.w(), "Store: state changes after action:", str, i10, str);
                    for (Map.Entry<String, Pair<Object, Object>> entry : mapDiff.entrySet()) {
                        String key = entry.getKey();
                        Pair<Object, Object> value = entry.getValue();
                        ih.e.a.a(eh.d.f274883c.w(), "  " + key + ": " + value.getFirst() + " -> " + value.getSecond(), str, 2, str);
                    }
                    return inAppMessagingStateWithMessageDismissed;
                }
                inAppMessagingStateWithMessageDismissed = InAppMessagingStateExtensionsKt.withMessageDismissed(inAppMessagingState, ((InAppMessagingAction.EngineAction.MessageLoadingFailed) action).getMessage(), false);
            }
            i10 = 2;
            mapDiff = inAppMessagingState.diff(inAppMessagingStateWithMessageDismissed);
            if (mapDiff.isEmpty()) {
                ih.e.a.a(eh.d.f274883c.w(), "Store: no state changes after action", str, i10, str);
                return inAppMessagingStateWithMessageDismissed;
            }
            ih.e.a.a(eh.d.f274883c.w(), "Store: state changes after action:", str, i10, str);
            while (r0.hasNext()) {
                String key2 = entry.getKey();
                Pair<Object, Object> value2 = entry.getValue();
                ih.e.a.a(eh.d.f274883c.w(), "  " + key2 + ": " + value2.getFirst() + " -> " + value2.getSecond(), str, 2, str);
            }
            return inAppMessagingStateWithMessageDismissed;
        }
        InAppMessagingAction.Initialize initialize = (InAppMessagingAction.Initialize) action;
        String siteId = initialize.getSiteId();
        String dataCenter = initialize.getDataCenter();
        GistEnvironment environment = initialize.getEnvironment();
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        str = null;
        inAppMessagingStateWithMessageDismissed = InAppMessagingState.copy$default(state, siteId, dataCenter, environment, 0L, null, null, string2, null, null, null, null, 1976, null);
        inAppMessagingState = state;
        i10 = 2;
        mapDiff = inAppMessagingState.diff(inAppMessagingStateWithMessageDismissed);
        if (mapDiff.isEmpty()) {
            ih.e.a.a(eh.d.f274883c.w(), "Store: no state changes after action", str, i10, str);
            return inAppMessagingStateWithMessageDismissed;
        }
        ih.e.a.a(eh.d.f274883c.w(), "Store: state changes after action:", str, i10, str);
        while (r0.hasNext()) {
            String key3 = entry.getKey();
            Pair<Object, Object> value3 = entry.getValue();
            ih.e.a.a(eh.d.f274883c.w(), "  " + key3 + ": " + value3.getFirst() + " -> " + value3.getSecond(), str, 2, str);
        }
        return inAppMessagingStateWithMessageDismissed;
    }
}
