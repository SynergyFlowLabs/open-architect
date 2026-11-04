package com.superwall.sdk.analytics;

import com.superwall.sdk.analytics.session.AppSession;
import com.superwall.sdk.config.ConfigManager;
import com.superwall.sdk.network.Network;
import com.superwall.sdk.storage.LocalStorage;
import com.superwall.sdk.store.abstractions.transactions.StoreTransactionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class SessionEventsManager implements s0, SessionEventsDelegate {

    @NotNull
    private List<p2> cancellables;

    @NotNull
    private final ConfigManager configManager;

    @NotNull
    private final Network network;

    @NotNull
    private final LocalStorage storage;

    /* JADX INFO: renamed from: com.superwall.sdk.analytics.SessionEventsManager$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.analytics.SessionEventsManager$1", f = "SessionEventsManager.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return SessionEventsManager.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            boolean z10 = !false;
            if (i10 == 0) {
                ResultKt.m(obj);
                SessionEventsManager sessionEventsManager = SessionEventsManager.this;
                this.label = 1;
                if (sessionEventsManager.postCachedSessionEvents(this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public SessionEventsManager(@NotNull LocalStorage storage, @NotNull Network network, @NotNull ConfigManager configManager) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        this.storage = storage;
        this.network = network;
        this.configManager = configManager;
        this.cancellables = new ArrayList();
        k.f(this, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object postCachedSessionEvents(d<? super Unit> dVar) {
        return Unit.f312394a;
    }

    @Override // com.superwall.sdk.analytics.SessionEventsDelegate
    @Nullable
    public Object enqueue(@NotNull StoreTransactionType storeTransactionType, @NotNull d<? super Unit> dVar) {
        return Unit.f312394a;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return q3.c(null, 1, null).plus(l1.a());
    }

    @Nullable
    public final Object updateAppSession(@NotNull AppSession appSession, @NotNull d<? super Unit> dVar) {
        return Unit.f312394a;
    }
}
