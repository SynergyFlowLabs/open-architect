package com.superwall.sdk.paywall.presentation.internal.operators;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.paywall.presentation.internal.InternalPresentationLogic;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallState;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlinx.coroutines.flow.j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class CheckNoPaywallAlreadyPresentedKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.CheckNoPaywallAlreadyPresentedKt$checkNoPaywallAlreadyPresented$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.CheckNoPaywallAlreadyPresentedKt", f = "CheckNoPaywallAlreadyPresented.kt", i = {}, l = {32}, m = "checkNoPaywallAlreadyPresented", n = {}, s = {})
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
            return CheckNoPaywallAlreadyPresentedKt.checkNoPaywallAlreadyPresented(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object checkNoPaywallAlreadyPresented(@NotNull Superwall superwall, @NotNull PresentationRequest presentationRequest, @NotNull j0<PaywallState> j0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws PaywallPresentationRequestStatusReason.PaywallAlreadyPresented {
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
        Object obj = anonymousClass1.result;
        Object objL = b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (!presentationRequest.getFlags().isPaywallPresented()) {
                return Unit.f312394a;
            }
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.paywallPresentation, "Paywall Already Presented", MapsKt.mapOf(TuplesKt.to("message", "Superwall.instance.isPaywallPresented is true")), null, 16, null);
            PaywallState presentationError = new PaywallState.PresentationError(InternalPresentationLogic.INSTANCE.presentationError("SWPresentationError", 102, "Paywall Already Presented", "You can only present one paywall at a time."));
            anonymousClass1.label = 1;
            if (j0Var.emit(presentationError, anonymousClass1) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        throw new PaywallPresentationRequestStatusReason.PaywallAlreadyPresented();
    }
}
