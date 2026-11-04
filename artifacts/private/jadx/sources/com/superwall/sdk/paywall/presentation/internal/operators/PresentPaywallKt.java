package com.superwall.sdk.paywall.presentation.internal.operators;

import android.app.Activity;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.models.paywall.PaywallPresentationStyle;
import com.superwall.sdk.models.triggers.TriggerRuleOccurrence;
import com.superwall.sdk.paywall.presentation.internal.InternalPresentationLogic;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatus;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.request.PaywallOverrides;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallState;
import com.superwall.sdk.paywall.view.PaywallView;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PresentPaywallKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.PresentPaywallKt$presentPaywallView$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.PresentPaywallKt$presentPaywallView$2", f = "PresentPaywall.kt", i = {1}, l = {52, com.planner5d.library.engine.input.f.b.f160696i0}, m = "invokeSuspend", n = {"error"}, s = {"L$0"})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Map<String, Object> $debugInfo;
        final /* synthetic */ j0<PaywallState> $paywallStatePublisher;
        final /* synthetic */ PaywallView $paywallView;
        final /* synthetic */ Activity $presenter;
        final /* synthetic */ PresentationRequest $request;
        final /* synthetic */ Superwall $this_presentPaywallView;
        final /* synthetic */ TriggerRuleOccurrence $unsavedOccurrence;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PresentationRequest presentationRequest, Superwall superwall, PaywallView paywallView, Activity activity, TriggerRuleOccurrence triggerRuleOccurrence, j0<PaywallState> j0Var, Map<String, ? extends Object> map, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$request = presentationRequest;
            this.$this_presentPaywallView = superwall;
            this.$paywallView = paywallView;
            this.$presenter = activity;
            this.$unsavedOccurrence = triggerRuleOccurrence;
            this.$paywallStatePublisher = j0Var;
            this.$debugInfo = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(PaywallView paywallView, Superwall superwall, Map map, j0 j0Var, boolean z10) throws PaywallPresentationRequestStatusReason.PaywallAlreadyPresented {
            if (z10) {
                k.f(superwall.getIoScope$superwall_release(), null, null, new PresentPaywallKt$presentPaywallView$2$1$1(j0Var, new PaywallState.Presented(paywallView.getInfo()), null), 3, null);
                return Unit.f312394a;
            }
            Logger.debug$default(Logger.INSTANCE, LogLevel.info, LogScope.paywallPresentation, "Paywall Already Presented", map, null, 16, null);
            int i10 = 1 >> 0;
            k.f(superwall.getIoScope$superwall_release(), null, null, new PresentPaywallKt$presentPaywallView$2$1$2(j0Var, InternalPresentationLogic.INSTANCE.presentationError("SWKPresentationError", 102, "Paywall Already Presented", "Trying to present paywall while another paywall is presented."), null), 3, null);
            throw new PaywallPresentationRequestStatusReason.PaywallAlreadyPresented();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$request, this.$this_presentPaywallView, this.$paywallView, this.$presenter, this.$unsavedOccurrence, this.$paywallStatePublisher, this.$debugInfo, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                InternalSuperwallEvent.PresentationRequest presentationRequest = new InternalSuperwallEvent.PresentationRequest(this.$request.getPresentationInfo().getEventData(), this.$request.getFlags().getType(), PaywallPresentationRequestStatus.Presentation.INSTANCE, null, this.$this_presentPaywallView.getDependencyContainer$superwall_release(), null, 32, null);
                Superwall superwall = this.$this_presentPaywallView;
                this.label = 1;
                if (TrackingKt.track(superwall, presentationRequest, this) == objL) {
                }
                return objL;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.L$0;
                ResultKt.m(obj);
                throw th2;
            }
            ResultKt.m(obj);
            ((Result) obj).j();
            try {
                PaywallView paywallView = this.$paywallView;
                Activity activity = this.$presenter;
                PresentationRequest presentationRequest2 = this.$request;
                TriggerRuleOccurrence triggerRuleOccurrence = this.$unsavedOccurrence;
                PaywallOverrides paywallOverrides = presentationRequest2.getPaywallOverrides();
                PaywallPresentationStyle presentationStyle = paywallOverrides != null ? paywallOverrides.getPresentationStyle() : null;
                final j0<PaywallState> j0Var = this.$paywallStatePublisher;
                final PaywallView paywallView2 = this.$paywallView;
                final Superwall superwall2 = this.$this_presentPaywallView;
                final Map<String, Object> map = this.$debugInfo;
                paywallView.present(activity, presentationRequest2, triggerRuleOccurrence, presentationStyle, j0Var, new Function1() { // from class: com.superwall.sdk.paywall.presentation.internal.operators.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PresentPaywallKt.AnonymousClass2.invokeSuspend$lambda$0(paywallView2, superwall2, map, j0Var, ((Boolean) obj2).booleanValue());
                    }
                });
                return Unit.f312394a;
            } catch (Throwable th3) {
                Superwall superwall3 = this.$this_presentPaywallView;
                PresentationRequest presentationRequest3 = this.$request;
                this.L$0 = th3;
                this.label = 2;
                if (LogErrorsKt.logErrors(superwall3, presentationRequest3, th3, this) != objL) {
                    throw th3;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.PresentPaywallKt$presentPaywallViewSync$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.PresentPaywallKt$presentPaywallViewSync$1", f = "PresentPaywall.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Map<String, Object> $debugInfo;
        final /* synthetic */ Function1<PaywallState, Unit> $onStateChanged;
        final /* synthetic */ PaywallView $paywallView;
        final /* synthetic */ Activity $presenter;
        final /* synthetic */ PresentationRequest $request;
        final /* synthetic */ Superwall $this_presentPaywallViewSync;
        final /* synthetic */ TriggerRuleOccurrence $unsavedOccurrence;
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.PresentPaywallKt$presentPaywallViewSync$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.PresentPaywallKt$presentPaywallViewSync$1$1", f = "PresentPaywall.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
        static final class C18781 extends o implements Function2<s0, d<? super Unit>, Object> {
            final /* synthetic */ Function1<PaywallState, Unit> $onStateChanged;
            final /* synthetic */ j0<PaywallState> $publisher;
            int label;

            /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.PresentPaywallKt$presentPaywallViewSync$1$1$1, reason: invalid class name and collision with other inner class name */
            @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.PresentPaywallKt$presentPaywallViewSync$1$1$1", f = "PresentPaywall.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C18791 extends o implements Function2<PaywallState, d<? super Unit>, Object> {
                final /* synthetic */ Function1<PaywallState, Unit> $onStateChanged;
                /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C18791(Function1<? super PaywallState, Unit> function1, d<? super C18791> dVar) {
                    super(2, dVar);
                    this.$onStateChanged = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d<Unit> create(Object obj, d<?> dVar) {
                    C18791 c18791 = new C18791(this.$onStateChanged, dVar);
                    c18791.L$0 = obj;
                    return c18791;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PaywallState paywallState, d<? super Unit> dVar) {
                    return ((C18791) create(paywallState, dVar)).invokeSuspend(Unit.f312394a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    b.l();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this.$onStateChanged.invoke((PaywallState) this.L$0);
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C18781(j0<PaywallState> j0Var, Function1<? super PaywallState, Unit> function1, d<? super C18781> dVar) {
                super(2, dVar);
                this.$publisher = j0Var;
                this.$onStateChanged = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C18781(this.$publisher, this.$onStateChanged, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j0<PaywallState> j0Var = this.$publisher;
                    C18791 c18791 = new C18791(this.$onStateChanged, null);
                    this.label = 1;
                    if (kotlinx.coroutines.flow.k.C(j0Var, c18791, this) == objL) {
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
                return ((C18781) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Superwall superwall, PaywallView paywallView, Activity activity, TriggerRuleOccurrence triggerRuleOccurrence, Map<String, ? extends Object> map, PresentationRequest presentationRequest, Function1<? super PaywallState, Unit> function1, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_presentPaywallViewSync = superwall;
            this.$paywallView = paywallView;
            this.$presenter = activity;
            this.$unsavedOccurrence = triggerRuleOccurrence;
            this.$debugInfo = map;
            this.$request = presentationRequest;
            this.$onStateChanged = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$this_presentPaywallViewSync, this.$paywallView, this.$presenter, this.$unsavedOccurrence, this.$debugInfo, this.$request, this.$onStateChanged, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j0 j0VarB = q0.b(0, 0, null, 7, null);
                int i11 = 6 >> 3;
                k.f(this.$this_presentPaywallViewSync.getIoScope$superwall_release(), null, null, new C18781(j0VarB, this.$onStateChanged, null), 3, null);
                Superwall superwall = this.$this_presentPaywallViewSync;
                PaywallView paywallView = this.$paywallView;
                Activity activity = this.$presenter;
                TriggerRuleOccurrence triggerRuleOccurrence = this.$unsavedOccurrence;
                Map<String, Object> map = this.$debugInfo;
                PresentationRequest presentationRequest = this.$request;
                this.label = 1;
                if (PresentPaywallKt.presentPaywallView(superwall, paywallView, activity, triggerRuleOccurrence, map, presentationRequest, j0VarB, this) == objL) {
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

    @Nullable
    public static final Object presentPaywallView(@NotNull Superwall superwall, @NotNull PaywallView paywallView, @NotNull Activity activity, @Nullable TriggerRuleOccurrence triggerRuleOccurrence, @NotNull Map<String, ? extends Object> map, @NotNull PresentationRequest presentationRequest, @NotNull j0<PaywallState> j0Var, @NotNull d<? super Unit> dVar) {
        Object objH = i.h(l1.e(), new AnonymousClass2(presentationRequest, superwall, paywallView, activity, triggerRuleOccurrence, j0Var, map, null), dVar);
        return objH == b.l() ? objH : Unit.f312394a;
    }

    public static final void presentPaywallViewSync(@NotNull Superwall superwall, @NotNull PaywallView paywallView, @NotNull Activity presenter, @Nullable TriggerRuleOccurrence triggerRuleOccurrence, @NotNull Map<String, ? extends Object> debugInfo, @NotNull PresentationRequest request, @NotNull Function1<? super PaywallState, Unit> onStateChanged) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(paywallView, "paywallView");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(debugInfo, "debugInfo");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
        k.f(superwall.getMainScope$superwall_release(), null, null, new AnonymousClass1(superwall, paywallView, presenter, triggerRuleOccurrence, debugInfo, request, onStateChanged, null), 3, null);
    }
}
