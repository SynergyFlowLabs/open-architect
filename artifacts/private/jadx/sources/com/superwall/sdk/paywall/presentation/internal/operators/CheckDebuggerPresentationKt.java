package com.superwall.sdk.paywall.presentation.internal.operators;

import android.app.Activity;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.debug.DebugViewActivity;
import com.superwall.sdk.paywall.presentation.internal.InternalPresentationLogic;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallState;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlinx.coroutines.flow.j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class CheckDebuggerPresentationKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.CheckDebuggerPresentationKt$checkDebuggerPresentation$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.CheckDebuggerPresentationKt", f = "CheckDebuggerPresentation.kt", i = {}, l = {36}, m = "checkDebuggerPresentation", n = {}, s = {})
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
            return CheckDebuggerPresentationKt.checkDebuggerPresentation(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final Object checkDebuggerPresentation(@NotNull Superwall superwall, @NotNull PresentationRequest presentationRequest, @Nullable j0<PaywallState> j0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws PaywallPresentationRequestStatusReason.DebuggerPresented {
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
            if (presentationRequest.getFlags().isDebuggerLaunched()) {
                WeakReference<Activity> presenter = presentationRequest.getPresenter();
                if (!((presenter != null ? presenter.get() : null) instanceof DebugViewActivity)) {
                    PaywallState presentationError = new PaywallState.PresentationError(InternalPresentationLogic.INSTANCE.presentationError("SWPresentationError", 101, "Debugger Is Presented", "Trying to present paywall when debugger is launched."));
                    if (j0Var != null) {
                        anonymousClass1.label = 1;
                        if (j0Var.emit(presentationError, anonymousClass1) == objL) {
                            return objL;
                        }
                    }
                }
            }
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        throw new PaywallPresentationRequestStatusReason.DebuggerPresented();
    }
}
