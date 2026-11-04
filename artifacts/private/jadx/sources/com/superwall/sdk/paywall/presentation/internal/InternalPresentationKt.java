package com.superwall.sdk.paywall.presentation.internal;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.paywall.presentation.PaywallCloseReason;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallResult;
import com.superwall.sdk.paywall.view.PaywallView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class InternalPresentationKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.InternalPresentationKt$dismiss$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.InternalPresentationKt$dismiss$2", f = "InternalPresentation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ PaywallCloseReason $closeReason;
        final /* synthetic */ Function0<Unit> $completion;
        final /* synthetic */ PaywallView $paywallView;
        final /* synthetic */ PaywallResult $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallView paywallView, PaywallResult paywallResult, PaywallCloseReason paywallCloseReason, Function0<Unit> function0, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$paywallView = paywallView;
            this.$result = paywallResult;
            this.$closeReason = paywallCloseReason;
            this.$completion = function0;
            int i10 = 2 | 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$paywallView, this.$result, this.$closeReason, this.$completion, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.$paywallView.dismiss$superwall_release(this.$result, this.$closeReason, this.$completion);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.InternalPresentationKt$internallyPresent$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.InternalPresentationKt", f = "InternalPresentation.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {29, 32, 45, 54}, m = "internallyPresent", n = {"$this$internallyPresent", "request", "publisher", "$this$internallyPresent", "request", "publisher", "$this$internallyPresent", "request"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return InternalPresentationKt.internallyPresent(null, null, null, this);
        }
    }

    @Nullable
    public static final Object dismiss(@NotNull Superwall superwall, @NotNull PaywallView paywallView, @NotNull PaywallResult paywallResult, @NotNull PaywallCloseReason paywallCloseReason, @Nullable Function0<Unit> function0, @NotNull d<? super Unit> dVar) {
        Object objH = i.h(l1.e(), new AnonymousClass2(paywallView, paywallResult, paywallCloseReason, function0, null), dVar);
        return objH == b.l() ? objH : Unit.f312394a;
    }

    public static /* synthetic */ Object dismiss$default(Superwall superwall, PaywallView paywallView, PaywallResult paywallResult, PaywallCloseReason paywallCloseReason, Function0 function0, d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            paywallCloseReason = PaywallCloseReason.SystemLogic.INSTANCE;
        }
        PaywallCloseReason paywallCloseReason2 = paywallCloseReason;
        if ((i10 & 8) != 0) {
            function0 = null;
        }
        return dismiss(superwall, paywallView, paywallResult, paywallCloseReason2, function0, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bd A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:38:0x00b2, B:40:0x00bd, B:45:0x00e2, B:46:0x00eb), top: B:54:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:38:0x00b2, B:40:0x00bd, B:45:0x00e2, B:46:0x00eb), top: B:54:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fd, code lost:
    
        if (com.superwall.sdk.paywall.presentation.internal.operators.LogErrorsKt.logErrors(r5, r10, r0, r12) == r4) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object internallyPresent(@org.jetbrains.annotations.NotNull com.superwall.sdk.Superwall r16, @org.jetbrains.annotations.NotNull com.superwall.sdk.paywall.presentation.internal.PresentationRequest r17, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState> r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.internal.InternalPresentationKt.internallyPresent(com.superwall.sdk.Superwall, com.superwall.sdk.paywall.presentation.internal.PresentationRequest, kotlinx.coroutines.flow.j0, kotlin.coroutines.d):java.lang.Object");
    }
}
