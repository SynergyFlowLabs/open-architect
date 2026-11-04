package io.customer.messaginginapp.state;

import android.content.Context;
import android.content.Intent;
import io.customer.messaginginapp.di.DIGraphMessagingInAppKt;
import io.customer.messaginginapp.gist.data.model.Message;
import io.customer.messaginginapp.gist.data.model.MessageKt;
import io.customer.messaginginapp.gist.data.model.MessagePosition;
import io.customer.messaginginapp.gist.presentation.GistListener;
import io.customer.messaginginapp.gist.presentation.GistModalActivity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nInAppMessagingMiddlewares.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessagingMiddlewares.kt\nio/customer/messaginginapp/state/InAppMessagingMiddlewaresKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n1#2:234\n774#3:235\n865#3,2:236\n1669#3,8:238\n774#3:246\n865#3,2:247\n774#3:249\n865#3,2:250\n774#3:252\n865#3,2:253\n774#3:255\n865#3,2:256\n295#3,2:258\n*S KotlinDebug\n*F\n+ 1 InAppMessagingMiddlewares.kt\nio/customer/messaginginapp/state/InAppMessagingMiddlewaresKt\n*L\n152#1:235\n152#1:236,2\n156#1:238,8\n159#1:246\n159#1:247,2\n160#1:249\n160#1:250,2\n171#1:252\n171#1:253,2\n172#1:255\n172#1:256,2\n184#1:258,2\n*E\n"})
public final class InAppMessagingMiddlewaresKt {
    @NotNull
    public static final Function1<org.reduxkotlin.j<InAppMessagingState, Object>, Function1<Function1<Object, ? extends Object>, Function1<Object, Object>>> displayModalMessageMiddleware() {
        return org.reduxkotlin.h.c(new n() { // from class: io.customer.messaginginapp.state.g
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return InAppMessagingMiddlewaresKt.displayModalMessageMiddleware$lambda$3((org.reduxkotlin.j) obj, (Function1) obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object displayModalMessageMiddleware$lambda$3(org.reduxkotlin.j store, Function1 next, Object action) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof InAppMessagingAction.LoadMessage)) {
            return next.invoke(action);
        }
        handleModalMessageDisplay(store, (InAppMessagingAction.LoadMessage) action, next);
        return Unit.f312394a;
    }

    @NotNull
    public static final Function1<org.reduxkotlin.j<InAppMessagingState, Object>, Function1<Function1<Object, ? extends Object>, Function1<Object, Object>>> errorLoggerMiddleware() {
        return org.reduxkotlin.h.c(new n() { // from class: io.customer.messaginginapp.state.i
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return InAppMessagingMiddlewaresKt.errorLoggerMiddleware$lambda$1((org.reduxkotlin.j) obj, (Function1) obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object errorLoggerMiddleware$lambda$1(org.reduxkotlin.j jVar, Function1 next, Object action) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof InAppMessagingAction.ReportError) {
            ih.e.a.b(eh.d.f274883c.w(), "Error: " + ((InAppMessagingAction.ReportError) action).getMessage(), null, null, 6, null);
        }
        return next.invoke(action);
    }

    @NotNull
    public static final Function1<org.reduxkotlin.j<InAppMessagingState, Object>, Function1<Function1<Object, ? extends Object>, Function1<Object, Object>>> gistListenerMiddleware(@Nullable final GistListener gistListener) {
        return org.reduxkotlin.h.c(new n() { // from class: io.customer.messaginginapp.state.k
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return InAppMessagingMiddlewaresKt.gistListenerMiddleware$lambda$17(gistListener, (org.reduxkotlin.j) obj, (Function1) obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object gistListenerMiddleware$lambda$17(GistListener gistListener, org.reduxkotlin.j jVar, Function1 next, Object action) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof InAppMessagingAction.EmbedMessages) {
            for (Message message : ((InAppMessagingAction.EmbedMessages) action).getMessages()) {
                String embeddedElementId = message.getEmbeddedElementId();
                if (embeddedElementId != null && gistListener != null) {
                    gistListener.embedMessage(message, embeddedElementId);
                }
            }
        } else if (action instanceof InAppMessagingAction.DisplayMessage) {
            if (gistListener != null) {
                gistListener.onMessageShown(((InAppMessagingAction.DisplayMessage) action).getMessage());
            }
        } else if (action instanceof InAppMessagingAction.DismissMessage) {
            if (gistListener != null) {
                gistListener.onMessageDismissed(((InAppMessagingAction.DismissMessage) action).getMessage());
            }
        } else if (action instanceof InAppMessagingAction.EngineAction.MessageLoadingFailed) {
            if (gistListener != null) {
                gistListener.onError(((InAppMessagingAction.EngineAction.MessageLoadingFailed) action).getMessage());
            }
        } else if ((action instanceof InAppMessagingAction.EngineAction.Tap) && gistListener != null) {
            InAppMessagingAction.EngineAction.Tap tap = (InAppMessagingAction.EngineAction.Tap) action;
            gistListener.onAction(tap.getMessage(), tap.getRoute(), tap.getAction(), tap.getName());
        }
        return next.invoke(action);
    }

    @NotNull
    public static final Function1<org.reduxkotlin.j<InAppMessagingState, Object>, Function1<Function1<Object, ? extends Object>, Function1<Object, Object>>> gistLoggingMessageMiddleware() {
        return org.reduxkotlin.h.c(new n() { // from class: io.customer.messaginginapp.state.l
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return InAppMessagingMiddlewaresKt.gistLoggingMessageMiddleware$lambda$2((org.reduxkotlin.j) obj, (Function1) obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object gistLoggingMessageMiddleware$lambda$2(org.reduxkotlin.j jVar, Function1 next, Object action) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof InAppMessagingAction.DismissMessage) {
            handleMessageDismissal((InAppMessagingAction.DismissMessage) action, next);
            return Unit.f312394a;
        }
        if (!(action instanceof InAppMessagingAction.DisplayMessage)) {
            return next.invoke(action);
        }
        handleMessageDisplay((InAppMessagingAction.DisplayMessage) action, next);
        return Unit.f312394a;
    }

    private static final void handleMessageDismissal(InAppMessagingAction.DismissMessage dismissMessage, Function1<Object, ? extends Object> function1) {
        if (InAppMessagingActionKt.shouldMarkMessageAsShown(dismissMessage)) {
            eh.d dVar = eh.d.f274883c;
            ih.e.a.a(dVar.w(), "Persistent message dismissed, logging view for message: " + dismissMessage.getMessage() + ", shouldLog: " + dismissMessage.getShouldLog() + ", viaCloseAction: " + dismissMessage.getViaCloseAction(), null, 2, null);
            DIGraphMessagingInAppKt.getGistQueue(dVar).logView(dismissMessage.getMessage());
            DIGraphMessagingInAppKt.getGistSdk(dVar).fetchInAppMessages();
        } else {
            ih.e.a.a(eh.d.f274883c.w(), "Message dismissed, not logging view for message: " + dismissMessage.getMessage() + ", shouldLog: " + dismissMessage.getShouldLog() + ", viaCloseAction: " + dismissMessage.getViaCloseAction(), null, 2, null);
        }
        function1.invoke(dismissMessage);
    }

    private static final void handleMessageDisplay(InAppMessagingAction.DisplayMessage displayMessage, Function1<Object, ? extends Object> function1) {
        if (InAppMessagingActionKt.shouldMarkMessageAsShown(displayMessage)) {
            eh.d dVar = eh.d.f274883c;
            ih.e.a.a(dVar.w(), "Message shown, logging view for message: " + displayMessage.getMessage(), null, 2, null);
            DIGraphMessagingInAppKt.getGistQueue(dVar).logView(displayMessage.getMessage());
        } else {
            ih.e.a.a(eh.d.f274883c.w(), "Persistent message shown, not logging view for message: " + displayMessage.getMessage(), null, 2, null);
        }
        function1.invoke(displayMessage);
    }

    private static final void handleModalMessageDisplay(org.reduxkotlin.j<InAppMessagingState, Object> jVar, InAppMessagingAction.LoadMessage loadMessage, Function1<Object, ? extends Object> function1) {
        if (jVar.getState().getModalMessageState() instanceof ModalMessageState.Displayed) {
            function1.invoke(new InAppMessagingAction.ReportError("A message is already being shown or cancelled"));
            return;
        }
        eh.d dVar = eh.d.f274883c;
        Context contextR = dVar.q().r();
        ih.e.a.a(dVar.w(), "Showing message: " + loadMessage.getMessage() + " with position: " + loadMessage.getPosition() + " and context: " + contextR, null, 2, null);
        Intent intentNewIntent = GistModalActivity.Companion.newIntent(contextR);
        intentNewIntent.setFlags(268435456);
        intentNewIntent.putExtra("GIST_MESSAGE", new com.google.gson.f().D(loadMessage.getMessage()));
        MessagePosition position = loadMessage.getPosition();
        intentNewIntent.putExtra("GIST_MODAL_POSITION", position != null ? position.toString() : null);
        contextR.startActivity(intentNewIntent);
        function1.invoke(loadMessage);
    }

    @NotNull
    public static final Function1<org.reduxkotlin.j<InAppMessagingState, Object>, Function1<Function1<Object, ? extends Object>, Function1<Object, Object>>> loggerMiddleware() {
        return org.reduxkotlin.h.c(new n() { // from class: io.customer.messaginginapp.state.f
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return InAppMessagingMiddlewaresKt.loggerMiddleware$lambda$0((org.reduxkotlin.j) obj, (Function1) obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loggerMiddleware$lambda$0(org.reduxkotlin.j store, Function1 next, Object action) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(action, "action");
        eh.d dVar = eh.d.f274883c;
        ih.e.a.a(dVar.w(), "Store: action: " + action, null, 2, null);
        ih.e.a.a(dVar.w(), "Store: state before reducer: " + store.getState(), null, 2, null);
        return next.invoke(action);
    }

    @NotNull
    public static final Function1<org.reduxkotlin.j<InAppMessagingState, Object>, Function1<Function1<Object, ? extends Object>, Function1<Object, Object>>> processMessages() {
        return org.reduxkotlin.h.c(new n() { // from class: io.customer.messaginginapp.state.m
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return InAppMessagingMiddlewaresKt.processMessages$lambda$15((org.reduxkotlin.j) obj, (Function1) obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object processMessages$lambda$15(org.reduxkotlin.j store, Function1 next, Object action) {
        Object next2;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof InAppMessagingAction.ProcessMessageQueue) {
            InAppMessagingAction.ProcessMessageQueue processMessageQueue = (InAppMessagingAction.ProcessMessageQueue) action;
            if (!processMessageQueue.getMessages().isEmpty()) {
                List<Message> messages = processMessageQueue.getMessages();
                ArrayList arrayList = new ArrayList();
                for (Object obj : messages) {
                    Message message = (Message) obj;
                    if (message.getQueueId() != null && !((InAppMessagingState) store.getState()).getShownMessageQueueIds().contains(message.getQueueId())) {
                        arrayList.add(obj);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (hashSet.add(((Message) obj2).getQueueId())) {
                        arrayList2.add(obj2);
                    }
                }
                final Comparator comparatorV = kotlin.comparisons.a.v(kotlin.comparisons.a.q());
                List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: io.customer.messaginginapp.state.InAppMessagingMiddlewaresKt$processMessages$lambda$15$$inlined$compareBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return comparatorV.compare(((Message) t10).getPriority(), ((Message) t11).getPriority());
                    }
                });
                List list = listSortedWith;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list) {
                    if (((Message) obj3).getGistProperties().getElementId() == null) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list) {
                    if (((Message) obj4).getGistProperties().getElementId() != null) {
                        arrayList4.add(obj4);
                    }
                }
                boolean z10 = ((InAppMessagingState) store.getState()).getModalMessageState() instanceof ModalMessageState.Displayed;
                boolean z11 = ((InAppMessagingState) store.getState()).getModalMessageState() instanceof ModalMessageState.Loading;
                next.invoke(new InAppMessagingAction.ProcessMessageQueue(listSortedWith));
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : arrayList4) {
                    if (MessageKt.matchesRoute((Message) obj5, ((InAppMessagingState) store.getState()).getCurrentRoute())) {
                        arrayList5.add(obj5);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : arrayList5) {
                    String elementId = ((Message) obj6).getGistProperties().getElementId();
                    if (elementId == null || !(((InAppMessagingState) store.getState()).getQueuedInlineMessagesState().getMessage(elementId) instanceof InlineMessageState.Embedded)) {
                        arrayList6.add(obj6);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    store.c().invoke(new InAppMessagingAction.EmbedMessages(arrayList6));
                }
                Iterator it = arrayList3.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!MessageKt.matchesRoute((Message) next2, ((InAppMessagingState) store.getState()).getCurrentRoute()));
                Message message2 = (Message) next2;
                if (message2 != null && !z10 && !z11) {
                    return store.c().invoke(new InAppMessagingAction.LoadMessage(message2, null, 2, null));
                }
                ih.e.a.a(eh.d.f274883c.w(), "No message matched the criteria.", null, 2, null);
                return Unit.f312394a;
            }
        }
        return next.invoke(action);
    }

    @NotNull
    public static final Function1<org.reduxkotlin.j<InAppMessagingState, Object>, Function1<Function1<Object, ? extends Object>, Function1<Object, Object>>> routeChangeMiddleware() {
        return org.reduxkotlin.h.c(new n() { // from class: io.customer.messaginginapp.state.j
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return InAppMessagingMiddlewaresKt.routeChangeMiddleware$lambda$7((org.reduxkotlin.j) obj, (Function1) obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00a8, please report this as an issue */
    public static final Object routeChangeMiddleware$lambda$7(org.reduxkotlin.j store, Function1 next, Object action) {
        Message message;
        Message message2;
        String routeRule;
        boolean z10;
        Object objM785constructorimpl;
        Boolean bool;
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof InAppMessagingAction.SetPageRoute) || ((InAppMessagingState) store.getState()).getUserId() == null) {
            return next.invoke(action);
        }
        next.invoke(action);
        ModalMessageState modalMessageState = ((InAppMessagingState) store.getState()).getModalMessageState();
        if (!(modalMessageState instanceof ModalMessageState.Displayed)) {
            if (modalMessageState instanceof ModalMessageState.Loading) {
                message2 = ((ModalMessageState.Loading) modalMessageState).getMessage();
            } else {
                message = null;
            }
            if (message != null) {
                routeRule = message.getGistProperties().getRouteRule();
                z10 = true;
                if (routeRule != null) {
                    try {
                        Result.a aVar = Result.Companion;
                        objM785constructorimpl = Result.m785constructorimpl(Boolean.valueOf(new Regex(routeRule).k(((InAppMessagingAction.SetPageRoute) action).getRoute())));
                    } catch (Throwable th2) {
                        Result.a aVar2 = Result.Companion;
                        objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (Result.m786isFailureimpl(objM785constructorimpl)) {
                        objM785constructorimpl = null;
                    }
                    bool = (Boolean) objM785constructorimpl;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = true;
                    }
                    if (!zBooleanValue) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    ih.e.a.a(eh.d.f274883c.w(), "Dismissing message: " + message.getQueueId() + " because route does not match current route: " + ((InAppMessagingAction.SetPageRoute) action).getRoute(), null, 2, null);
                    store.c().invoke(new InAppMessagingAction.DismissMessage(message, false, false, 4, null));
                }
            }
            return store.c().invoke(new InAppMessagingAction.ProcessMessageQueue(CollectionsKt.toList(((InAppMessagingState) store.getState()).getMessagesInQueue())));
        }
        message2 = ((ModalMessageState.Displayed) modalMessageState).getMessage();
        message = message2;
        if (message != null) {
            routeRule = message.getGistProperties().getRouteRule();
            z10 = true;
            if (routeRule != null) {
                Result.a aVar3 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(Boolean.valueOf(new Regex(routeRule).k(((InAppMessagingAction.SetPageRoute) action).getRoute())));
                if (Result.m786isFailureimpl(objM785constructorimpl)) {
                    objM785constructorimpl = null;
                }
                bool = (Boolean) objM785constructorimpl;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = true;
                }
                if (!zBooleanValue) {
                    z10 = false;
                }
            }
            if (!z10) {
                ih.e.a.a(eh.d.f274883c.w(), "Dismissing message: " + message.getQueueId() + " because route does not match current route: " + ((InAppMessagingAction.SetPageRoute) action).getRoute(), null, 2, null);
                store.c().invoke(new InAppMessagingAction.DismissMessage(message, false, false, 4, null));
            }
        }
        return store.c().invoke(new InAppMessagingAction.ProcessMessageQueue(CollectionsKt.toList(((InAppMessagingState) store.getState()).getMessagesInQueue())));
    }

    @NotNull
    public static final Function1<org.reduxkotlin.j<InAppMessagingState, Object>, Function1<Function1<Object, ? extends Object>, Function1<Object, Object>>> userChangeMiddleware() {
        return org.reduxkotlin.h.c(new n() { // from class: io.customer.messaginginapp.state.h
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return InAppMessagingMiddlewaresKt.userChangeMiddleware$lambda$5((org.reduxkotlin.j) obj, (Function1) obj2, obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object userChangeMiddleware$lambda$5(org.reduxkotlin.j store, Function1 next, Object action) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof InAppMessagingAction.Initialize) && !(action instanceof InAppMessagingAction.SetUserIdentifier) && !(action instanceof InAppMessagingAction.SetPageRoute) && ((InAppMessagingState) store.getState()).getUserId() == null) {
            return next.invoke(new InAppMessagingAction.ReportError("User is not set."));
        }
        return next.invoke(action);
    }
}
