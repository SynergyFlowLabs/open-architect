package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.UsersResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRefreshUnreadConversationsCountUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefreshUnreadConversationsCountUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/RefreshUnreadConversationsCountUseCase\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,32:1\n226#2,5:33\n*S KotlinDebug\n*F\n+ 1 RefreshUnreadConversationsCountUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/RefreshUnreadConversationsCountUseCase\n*L\n23#1:33,5\n*E\n"})
public final class RefreshUnreadConversationsCountUseCase {
    public static final int $stable = 8;

    @NotNull
    private final CommonRepository commonRepository;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase$invoke$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase", f = "RefreshUnreadConversationsCountUseCase.kt", i = {0, 0}, l = {21}, m = "invoke", n = {"this", "clientStateFlow"}, s = {"L$0", "L$1"})
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
            return RefreshUnreadConversationsCountUseCase.this.invoke(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RefreshUnreadConversationsCountUseCase() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public final Object invoke(@NotNull k0<ConversationClientState> k0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        AnonymousClass1 anonymousClass1;
        k0<ConversationClientState> k0Var2;
        ConversationClientState value;
        RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase = this;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = refreshUnreadConversationsCountUseCase.new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = refreshUnreadConversationsCountUseCase.new AnonymousClass1(dVar);
        }
        Object objFetchUnreadCounts = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(objFetchUnreadCounts);
            if (k0Var.getValue().getLaunchMode() == LaunchMode.PROGRAMMATIC) {
                CommonRepository commonRepository = refreshUnreadConversationsCountUseCase.commonRepository;
                anonymousClass1.L$0 = refreshUnreadConversationsCountUseCase;
                k0Var2 = k0Var;
                anonymousClass1.L$1 = k0Var2;
                anonymousClass1.label = 1;
                objFetchUnreadCounts = commonRepository.fetchUnreadCounts(anonymousClass1);
                if (objFetchUnreadCounts == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k0<ConversationClientState> k0Var3 = (k0) anonymousClass1.L$1;
        RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase2 = (RefreshUnreadConversationsCountUseCase) anonymousClass1.L$0;
        ResultKt.m(objFetchUnreadCounts);
        k0Var2 = k0Var3;
        refreshUnreadConversationsCountUseCase = refreshUnreadConversationsCountUseCase2;
        UsersResponse usersResponse = (UsersResponse) objFetchUnreadCounts;
        if (usersResponse == null) {
            return Unit.f312394a;
        }
        IntercomDataLayer intercomDataLayer = refreshUnreadConversationsCountUseCase.intercomDataLayer;
        Config config = usersResponse.getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "getConfig(...)");
        intercomDataLayer.updateConfig(config);
        do {
            value = k0Var2.getValue();
        } while (!k0Var2.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, usersResponse.getUnreadConversations().getUnreadConversationsCount(), usersResponse.getUnreadTickets().getTotalCount(), null, null, false, false, null, null, 4145151, null)));
        return Unit.f312394a;
    }

    public RefreshUnreadConversationsCountUseCase(@NotNull CommonRepository commonRepository, @NotNull IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.commonRepository = commonRepository;
        this.intercomDataLayer = intercomDataLayer;
    }

    public /* synthetic */ RefreshUnreadConversationsCountUseCase(CommonRepository commonRepository, IntercomDataLayer intercomDataLayer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            MessengerApi messengerApi = Injector.get().getMessengerApi();
            Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
            IntercomDataLayer dataLayer = Injector.get().getDataLayer();
            Intrinsics.checkNotNullExpressionValue(dataLayer, "getDataLayer(...)");
            commonRepository = new CommonRepository(messengerApi, dataLayer);
        }
        this(commonRepository, (i10 & 2) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }
}
