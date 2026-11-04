package io.intercom.android.sdk.m5.data;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.UsersResponse;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class CommonRepository {
    public static final int $stable = 8;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    @NotNull
    private final MessengerApi messengerApi;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.CommonRepository$fetchUnreadCounts$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.data.CommonRepository", f = "CommonRepository.kt", i = {}, l = {34}, m = "fetchUnreadCounts", n = {}, s = {})
    static final class AnonymousClass1 extends d {
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
            return CommonRepository.this.fetchUnreadCounts(this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.CommonRepository$openMessenger$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.data.CommonRepository", f = "CommonRepository.kt", i = {0}, l = {24}, m = "openMessenger", n = {"this"}, s = {"L$0"})
    static final class C28071 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C28071(kotlin.coroutines.d<? super C28071> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonRepository.this.openMessenger(this);
        }
    }

    public CommonRepository(@NotNull MessengerApi messengerApi, @NotNull IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(messengerApi, "messengerApi");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.messengerApi = messengerApi;
        this.intercomDataLayer = intercomDataLayer;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object fetchUnreadCounts(@NotNull kotlin.coroutines.d<? super UsersResponse> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object unreadConversationsSuspended$default = anonymousClass1.result;
        Object objL = b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(unreadConversationsSuspended$default);
            MessengerApi messengerApi = this.messengerApi;
            anonymousClass1.label = 1;
            unreadConversationsSuspended$default = MessengerApi.DefaultImpls.getUnreadConversationsSuspended$default(messengerApi, null, anonymousClass1, 1, null);
            if (unreadConversationsSuspended$default == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(unreadConversationsSuspended$default);
        }
        NetworkResponse networkResponse = (NetworkResponse) unreadConversationsSuspended$default;
        if (networkResponse instanceof NetworkResponse.Success) {
            return ((UsersResponse.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object openMessenger(@NotNull kotlin.coroutines.d<? super OpenMessengerResponse> dVar) {
        C28071 c28071;
        if (dVar instanceof C28071) {
            c28071 = (C28071) dVar;
            int i10 = c28071.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c28071.label = i10 - Integer.MIN_VALUE;
            } else {
                c28071 = new C28071(dVar);
            }
        } else {
            c28071 = new C28071(dVar);
        }
        Object objOpenMessengerSuspended$default = c28071.result;
        Object objL = b.l();
        int i11 = c28071.label;
        if (i11 == 0) {
            ResultKt.m(objOpenMessengerSuspended$default);
            OpenMessengerResponse openResponse = this.intercomDataLayer.getOpenResponse();
            if (openResponse != null) {
                return openResponse;
            }
            if (!Injector.get().getAblyManager().isConnected()) {
                Injector.get().getAblyManager().connect();
            }
            MessengerApi messengerApi = this.messengerApi;
            c28071.L$0 = this;
            c28071.label = 1;
            objOpenMessengerSuspended$default = MessengerApi.DefaultImpls.openMessengerSuspended$default(messengerApi, null, c28071, 1, null);
            if (objOpenMessengerSuspended$default == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (CommonRepository) c28071.L$0;
            ResultKt.m(objOpenMessengerSuspended$default);
        }
        NetworkResponse networkResponse = (NetworkResponse) objOpenMessengerSuspended$default;
        if (!(networkResponse instanceof NetworkResponse.Success)) {
            return null;
        }
        NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
        this.intercomDataLayer.updateOpenResponse((OpenMessengerResponse) success.getBody());
        return (OpenMessengerResponse) success.getBody();
    }
}
