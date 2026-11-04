package com.superwall.sdk.paywall.view.delegate;

import com.superwall.sdk.paywall.presentation.internal.state.PaywallResult;
import com.superwall.sdk.paywall.view.PaywallView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PaywallViewDelegateAdapter {

    @Nullable
    private final PaywallViewCallback kotlinDelegate;

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.delegate.PaywallViewDelegateAdapter$onFinished$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.view.delegate.PaywallViewDelegateAdapter$onFinished$2", f = "PaywallViewDelegateAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ PaywallView $paywall;
        final /* synthetic */ PaywallResult $result;
        final /* synthetic */ boolean $shouldDismiss;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallView paywallView, PaywallResult paywallResult, boolean z10, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$paywall = paywallView;
            this.$result = paywallResult;
            this.$shouldDismiss = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PaywallViewDelegateAdapter.this.new AnonymousClass2(this.$paywall, this.$result, this.$shouldDismiss, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            PaywallViewCallback kotlinDelegate = PaywallViewDelegateAdapter.this.getKotlinDelegate();
            if (kotlinDelegate == null) {
                return null;
            }
            kotlinDelegate.onFinished(this.$paywall, this.$result, this.$shouldDismiss);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public PaywallViewDelegateAdapter(@Nullable PaywallViewCallback paywallViewCallback) {
        this.kotlinDelegate = paywallViewCallback;
    }

    public final boolean getHasJavaDelegate() {
        return false;
    }

    @Nullable
    public final PaywallViewCallback getKotlinDelegate() {
        return this.kotlinDelegate;
    }

    @Nullable
    public final Object onFinished(@NotNull PaywallView paywallView, @NotNull PaywallResult paywallResult, boolean z10, @NotNull d<? super Unit> dVar) {
        return i.h(l1.e(), new AnonymousClass2(paywallView, paywallResult, z10, null), dVar);
    }
}
