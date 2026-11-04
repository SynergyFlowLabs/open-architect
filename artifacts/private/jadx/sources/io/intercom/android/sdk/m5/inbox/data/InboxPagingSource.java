package io.intercom.android.sdk.m5.inbox.data;

import androidx.compose.runtime.internal.w0;
import androidx.paging.h2;
import androidx.paging.j2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationList;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class InboxPagingSource extends h2<Long, Conversation> {
    public static final int PAGE_SIZE = 20;

    @NotNull
    private final InboxRepository inboxRepository;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    @NotNull
    private final Function2<EmptyState, d<? super Unit>, Object> onEmptyState;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.data.InboxPagingSource$load$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.inbox.data.InboxPagingSource", f = "InboxPagingSource.kt", i = {0, 0, 1, 1, 1}, l = {18, 32}, m = "load", n = {"this", "params", "this", "conversationPage", "isFirstLoad"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InboxPagingSource.this.load(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InboxPagingSource(@NotNull InboxRepository inboxRepository, @NotNull IntercomDataLayer intercomDataLayer, @NotNull Function2<? super EmptyState, ? super d<? super Unit>, ? extends Object> onEmptyState) {
        Intrinsics.checkNotNullParameter(inboxRepository, "inboxRepository");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(onEmptyState, "onEmptyState");
        this.inboxRepository = inboxRepository;
        this.intercomDataLayer = intercomDataLayer;
        this.onEmptyState = onEmptyState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.h2
    @Nullable
    public Long getRefreshKey(@NotNull j2<Long, Conversation> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:39:0x0115  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.paging.h2
    @Nullable
    public Object load(@NotNull h2.a<Long> aVar, @NotNull d<? super h2.b<Long, Conversation>> dVar) {
        AnonymousClass1 anonymousClass1;
        InboxPagingSource inboxPagingSource;
        ConversationList conversationList;
        int i10;
        List<Conversation> conversations;
        Long lG;
        Conversation conversation;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object conversations2 = anonymousClass1.result;
        Object objL = b.l();
        int i12 = anonymousClass1.label;
        int i13 = 1;
        if (i12 == 0) {
            ResultKt.m(conversations2);
            InboxRepository inboxRepository = this.inboxRepository;
            Long lA = aVar.a();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = aVar;
            anonymousClass1.label = 1;
            conversations2 = inboxRepository.getConversations(lA, 20, anonymousClass1);
            if (conversations2 != objL) {
            }
            return objL;
        }
        if (i12 == 1) {
            aVar = (h2.a) anonymousClass1.L$1;
            this = (InboxPagingSource) anonymousClass1.L$0;
            ResultKt.m(conversations2);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = anonymousClass1.I$0;
            conversationList = (ConversationList) anonymousClass1.L$1;
            inboxPagingSource = (InboxPagingSource) anonymousClass1.L$0;
            ResultKt.m(conversations2);
        }
        if (i10 != 0) {
            conversations = CollectionsKt.toList(inboxPagingSource.intercomDataLayer.getConversations().getValue());
        } else {
            conversations = conversationList.getConversations();
        }
        Intrinsics.checkNotNull(conversations);
        if (conversationList.hasMorePages() || (conversation = (Conversation) CollectionsKt.lastOrNull((List) conversations)) == null) {
            lG = null;
        } else {
            lG = kotlin.coroutines.jvm.internal.b.g(ConversationExtensionsKt.lastActionCreatedAt(conversation));
        }
        return new h2.b.c(conversations, null, lG);
        NetworkResponse networkResponse = (NetworkResponse) conversations2;
        if (!(networkResponse instanceof NetworkResponse.Success)) {
            if (networkResponse instanceof NetworkResponse.NetworkError) {
                return new h2.b.a(((NetworkResponse.NetworkError) networkResponse).getError());
            }
            if (networkResponse instanceof NetworkResponse.ClientError) {
                return new h2.b.a(((NetworkResponse.ClientError) networkResponse).getError());
            }
            if (!(networkResponse instanceof NetworkResponse.ServerError)) {
                throw new k0();
            }
            return new h2.b.a(new Error("Server error : code " + ((NetworkResponse.ServerError) networkResponse).getCode()));
        }
        if (aVar.a() != null) {
            i13 = 0;
        }
        ConversationsResponse conversationsResponseBuild = ((ConversationsResponse.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
        ConversationList conversationPage = conversationsResponseBuild.getConversationPage();
        IntercomDataLayer intercomDataLayer = this.intercomDataLayer;
        Config config = conversationsResponseBuild.getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "getConfig(...)");
        intercomDataLayer.updateConfig(config);
        IntercomDataLayer intercomDataLayer2 = this.intercomDataLayer;
        List<Conversation> conversations3 = conversationPage.getConversations();
        Intrinsics.checkNotNullExpressionValue(conversations3, "getConversations(...)");
        intercomDataLayer2.addConversations(conversations3);
        Function2<EmptyState, d<? super Unit>, Object> function2 = this.onEmptyState;
        EmptyState emptyState = conversationPage.getEmptyState();
        Intrinsics.checkNotNullExpressionValue(emptyState, "getEmptyState(...)");
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = conversationPage;
        anonymousClass1.I$0 = i13;
        anonymousClass1.label = 2;
        if (function2.invoke(emptyState, anonymousClass1) != objL) {
            inboxPagingSource = this;
            conversationList = conversationPage;
            i10 = i13;
            if (i10 != 0) {
                conversations = CollectionsKt.toList(inboxPagingSource.intercomDataLayer.getConversations().getValue());
            } else {
                conversations = conversationList.getConversations();
            }
            Intrinsics.checkNotNull(conversations);
            if (conversationList.hasMorePages()) {
                lG = null;
            } else {
                lG = null;
            }
            return new h2.b.c(conversations, null, lG);
        }
        return objL;
    }
}
