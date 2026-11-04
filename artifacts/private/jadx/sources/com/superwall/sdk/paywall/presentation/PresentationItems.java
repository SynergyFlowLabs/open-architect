package com.superwall.sdk.paywall.presentation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PresentationItems {

    @Nullable
    private LastPresentationItems _last;

    @Nullable
    private PaywallInfo _paywallInfo;

    @NotNull
    private final z1 queue;

    @NotNull
    private final s0 scope;

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.PresentationItems$reset$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.PresentationItems$reset$1", f = "PresentationItems.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PresentationItems.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            PresentationItems.this._last = null;
            PresentationItems.this._paywallInfo = null;
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public PresentationItems() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        z1 z1VarD = b2.d(executorServiceNewSingleThreadExecutor);
        this.queue = z1VarD;
        this.scope = t0.a(z1VarD);
    }

    @Nullable
    public final LastPresentationItems getLast() {
        return (LastPresentationItems) i.f(this.queue, new PresentationItems$last$1(this, null));
    }

    @Nullable
    public final PaywallInfo getPaywallInfo() {
        return (PaywallInfo) i.f(this.queue, new PresentationItems$paywallInfo$1(this, null));
    }

    public final void reset() {
        k.f(this.scope, null, null, new AnonymousClass1(null), 3, null);
    }

    public final void setLast(@Nullable LastPresentationItems lastPresentationItems) {
        k.f(this.scope, null, null, new PresentationItems$last$2(this, lastPresentationItems, null), 3, null);
    }

    public final void setPaywallInfo(@Nullable PaywallInfo paywallInfo) {
        k.f(this.scope, null, null, new PresentationItems$paywallInfo$2(this, paywallInfo, null), 3, null);
    }
}
