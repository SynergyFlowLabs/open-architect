package com.superwall.sdk.paywall.presentation.internal.operators;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.dependencies.DependencyContainer;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallState;
import com.superwall.sdk.paywall.presentation.rule_logic.RuleEvaluationOutcome;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGetPaywallVC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetPaywallVC.kt\ncom/superwall/sdk/paywall/presentation/internal/operators/GetPaywallVCKt\n+ 2 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,105:1\n122#2,4:106\n*S KotlinDebug\n*F\n+ 1 GetPaywallVC.kt\ncom/superwall/sdk/paywall/presentation/internal/operators/GetPaywallVCKt\n*L\n69#1:106,4\n*E\n"})
public final class GetPaywallVCKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.GetPaywallVCKt$getPaywallView$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.GetPaywallVCKt", f = "GetPaywallVC.kt", i = {0, 0, 0, 0, 1, 1}, l = {28, 64, com.planner5d.library.engine.input.f.b.f160702k0}, m = "getPaywallView", n = {"request", "debugInfo", "paywallStatePublisher", "dependencyContainer", "debugInfo", "paywallStatePublisher"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object paywallView = GetPaywallVCKt.getPaywallView(null, null, null, null, null, null, this);
            return paywallView == b.l() ? paywallView : Result.a(paywallView);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.GetPaywallVCKt$presentationFailure$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.GetPaywallVCKt", f = "GetPaywallVC.kt", i = {}, l = {102}, m = "presentationFailure", n = {}, s = {})
    static final class C26891 extends d {
        int label;
        /* synthetic */ Object result;

        C26891(kotlin.coroutines.d<? super C26891> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetPaywallVCKt.presentationFailure(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0157 A[Catch: all -> 0x004b, TryCatch #1 {all -> 0x004b, blocks: (B:18:0x0046, B:48:0x0151, B:50:0x0157, B:54:0x0178, B:57:0x017f, B:58:0x0186, B:51:0x0164, B:53:0x0168, B:59:0x0187, B:60:0x018c), top: B:71:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0164 A[Catch: all -> 0x004b, TryCatch #1 {all -> 0x004b, blocks: (B:18:0x0046, B:48:0x0151, B:50:0x0157, B:54:0x0178, B:57:0x017f, B:58:0x0186, B:51:0x0164, B:53:0x0168, B:59:0x0187, B:60:0x018c), top: B:71:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0168 A[Catch: all -> 0x004b, TryCatch #1 {all -> 0x004b, blocks: (B:18:0x0046, B:48:0x0151, B:50:0x0157, B:54:0x0178, B:57:0x017f, B:58:0x0186, B:51:0x0164, B:53:0x0168, B:59:0x0187, B:60:0x018c), top: B:71:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x017e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x017f A[Catch: all -> 0x004b, TryCatch #1 {all -> 0x004b, blocks: (B:18:0x0046, B:48:0x0151, B:50:0x0157, B:54:0x0178, B:57:0x017f, B:58:0x0186, B:51:0x0164, B:53:0x0168, B:59:0x0187, B:60:0x018c), top: B:71:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0187 A[Catch: all -> 0x004b, TryCatch #1 {all -> 0x004b, blocks: (B:18:0x0046, B:48:0x0151, B:50:0x0157, B:54:0x0178, B:57:0x017f, B:58:0x0186, B:51:0x0164, B:53:0x0168, B:59:0x0187, B:60:0x018c), top: B:71:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c7, code lost:
    
        if (r0 == r1) goto L67;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getPaywallView(@org.jetbrains.annotations.NotNull com.superwall.sdk.Superwall r22, @org.jetbrains.annotations.NotNull com.superwall.sdk.paywall.presentation.internal.PresentationRequest r23, @org.jetbrains.annotations.NotNull com.superwall.sdk.paywall.presentation.rule_logic.RuleEvaluationOutcome r24, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r25, @org.jetbrains.annotations.Nullable kotlinx.coroutines.flow.j0<com.superwall.sdk.paywall.presentation.internal.state.PaywallState> r26, @org.jetbrains.annotations.NotNull com.superwall.sdk.dependencies.DependencyContainer r27, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Result<com.superwall.sdk.paywall.view.PaywallView>> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.presentation.internal.operators.GetPaywallVCKt.getPaywallView(com.superwall.sdk.Superwall, com.superwall.sdk.paywall.presentation.internal.PresentationRequest, com.superwall.sdk.paywall.presentation.rule_logic.RuleEvaluationOutcome, java.util.Map, kotlinx.coroutines.flow.j0, com.superwall.sdk.dependencies.DependencyContainer, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object getPaywallView$default(Superwall superwall, PresentationRequest presentationRequest, RuleEvaluationOutcome ruleEvaluationOutcome, Map map, j0 j0Var, DependencyContainer dependencyContainer, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            j0Var = null;
        }
        return getPaywallView(superwall, presentationRequest, ruleEvaluationOutcome, map, j0Var, dependencyContainer, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object presentationFailure(Throwable th2, Map<String, ? extends Object> map, j0<PaywallState> j0Var, kotlin.coroutines.d<? super Throwable> dVar) {
        C26891 c26891;
        if (dVar instanceof C26891) {
            c26891 = (C26891) dVar;
            int i10 = c26891.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26891.label = i10 - Integer.MIN_VALUE;
            } else {
                c26891 = new C26891(dVar);
            }
        } else {
            c26891 = new C26891(dVar);
        }
        Object obj = c26891.result;
        Object objL = b.l();
        int i11 = c26891.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            Logger.INSTANCE.debug(LogLevel.error, LogScope.paywallPresentation, "Error Getting Paywall View", map, th2);
            if (j0Var != null) {
                PaywallState presentationError = new PaywallState.PresentationError(th2);
                c26891.label = 1;
                if (j0Var.emit(presentationError, c26891) == objL) {
                    return objL;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return new PaywallPresentationRequestStatusReason.NoPaywallView();
    }
}
