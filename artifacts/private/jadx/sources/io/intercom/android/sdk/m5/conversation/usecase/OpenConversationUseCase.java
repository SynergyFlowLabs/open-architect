package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nOpenConversationUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenConversationUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/OpenConversationUseCase\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,47:1\n226#2,5:48\n*S KotlinDebug\n*F\n+ 1 OpenConversationUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/OpenConversationUseCase\n*L\n32#1:48,5\n*E\n"})
public final class OpenConversationUseCase {
    public static final int $stable = 8;

    @NotNull
    private final CommonRepository commonRepository;

    @NotNull
    private final RefreshConversationUseCase refreshConversationUseCase;

    @NotNull
    private final RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase$invoke$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase", f = "OpenConversationUseCase.kt", i = {0, 0, 0, 1, 1}, l = {24, 40, 44}, m = "invoke", n = {"this", "clientStateFlow", "getConversationReason", "this", "clientStateFlow"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return OpenConversationUseCase.this.invoke(null, null, this);
        }
    }

    public OpenConversationUseCase(@NotNull RefreshConversationUseCase refreshConversationUseCase, @NotNull RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, @NotNull CommonRepository commonRepository) {
        Intrinsics.checkNotNullParameter(refreshConversationUseCase, "refreshConversationUseCase");
        Intrinsics.checkNotNullParameter(refreshUnreadConversationsCountUseCase, "refreshUnreadConversationsCountUseCase");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.refreshUnreadConversationsCountUseCase = refreshUnreadConversationsCountUseCase;
        this.commonRepository = commonRepository;
    }

    public static /* synthetic */ Object invoke$default(OpenConversationUseCase openConversationUseCase, k0 k0Var, GetConversationReason getConversationReason, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            getConversationReason = GetConversationReason.OPEN_CONVERSATION;
        }
        return openConversationUseCase.invoke(k0Var, getConversationReason, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fc, code lost:
    
        if (r1.invoke(r0, r2) == r3) goto L35;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.k0<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r37, @org.jetbrains.annotations.NotNull io.intercom.android.sdk.m5.conversation.data.GetConversationReason r38, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r39) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase.invoke(kotlinx.coroutines.flow.k0, io.intercom.android.sdk.m5.conversation.data.GetConversationReason, kotlin.coroutines.d):java.lang.Object");
    }

    public /* synthetic */ OpenConversationUseCase(RefreshConversationUseCase refreshConversationUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, CommonRepository commonRepository, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 4) != 0) {
            MessengerApi messengerApi = Injector.get().getMessengerApi();
            Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
            IntercomDataLayer dataLayer = Injector.get().getDataLayer();
            Intrinsics.checkNotNullExpressionValue(dataLayer, "getDataLayer(...)");
            commonRepository = new CommonRepository(messengerApi, dataLayer);
        }
        this(refreshConversationUseCase, refreshUnreadConversationsCountUseCase, commonRepository);
    }
}
