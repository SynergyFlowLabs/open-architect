package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class GetNetworkState {
    public static final int $stable = 8;

    @NotNull
    private final NetworkConnectivityMonitor networkConnectivityMonitor;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState$invoke$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState$invoke$1", f = "GetNetworkState.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<l0<? super NetworkState>, kotlin.coroutines.d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(GetNetworkState getNetworkState) {
            getNetworkState.networkConnectivityMonitor.setListener(null);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = GetNetworkState.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final l0 l0Var = (l0) this.L$0;
                GetNetworkState.this.networkConnectivityMonitor.setListener(new NetworkConnectivityMonitor.ConnectivityEventListener() { // from class: io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState.invoke.1.1
                    @Override // io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor.ConnectivityEventListener
                    public void onDisconnect() {
                        l0Var.p(NetworkState.Disconnected.INSTANCE);
                    }

                    @Override // io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor.ConnectivityEventListener
                    public void onReconnect() {
                        l0Var.p(NetworkState.Reconnected.INSTANCE);
                    }
                });
                final GetNetworkState getNetworkState = GetNetworkState.this;
                Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.usecase.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GetNetworkState.AnonymousClass1.invokeSuspend$lambda$0(getNetworkState);
                    }
                };
                this.label = 1;
                if (j0.b(l0Var, function0, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super NetworkState> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public GetNetworkState(@NotNull NetworkConnectivityMonitor networkConnectivityMonitor) {
        Intrinsics.checkNotNullParameter(networkConnectivityMonitor, "networkConnectivityMonitor");
        this.networkConnectivityMonitor = networkConnectivityMonitor;
    }

    @NotNull
    public final i<NetworkState> invoke() {
        return k.t(new AnonymousClass1(null));
    }
}
