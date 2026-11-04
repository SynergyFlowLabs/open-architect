package com.superwall.sdk.paywall.presentation.get_paywall;

import com.devtodev.core.data.metrics.MetricConsts;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.paywall.presentation.internal.GetPaywallComponentsKt;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.operators.LogErrorsKt;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallState;
import com.superwall.sdk.paywall.view.PaywallView;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class InternalGetPaywallKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_paywall.InternalGetPaywallKt$getPaywall$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.get_paywall.InternalGetPaywallKt", f = "InternalGetPaywall.kt", i = {0, 0, 0, 1}, l = {37, 45}, m = "getPaywall", n = {"$this$getPaywall", "request", "publisher", MetricConsts.Install}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return InternalGetPaywallKt.getPaywall(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_paywall.InternalGetPaywallKt$getPaywallSync$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.get_paywall.InternalGetPaywallKt$getPaywallSync$2", f = "InternalGetPaywall.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Function1<PaywallState, Unit> $onStateChanged;
        final /* synthetic */ j0<PaywallState> $publisher;
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_paywall.InternalGetPaywallKt$getPaywallSync$2$1, reason: invalid class name */
        @f(c = "com.superwall.sdk.paywall.presentation.get_paywall.InternalGetPaywallKt$getPaywallSync$2$1", f = "InternalGetPaywall.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends o implements Function2<PaywallState, kotlin.coroutines.d<? super Unit>, Object> {
            final /* synthetic */ Function1<PaywallState, Unit> $onStateChanged;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function1<? super PaywallState, Unit> function1, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$onStateChanged = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onStateChanged, dVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PaywallState paywallState, kotlin.coroutines.d<? super Unit> dVar) {
                return ((AnonymousClass1) create(paywallState, dVar)).invokeSuspend(Unit.f312394a);
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
        AnonymousClass2(j0<PaywallState> j0Var, Function1<? super PaywallState, Unit> function1, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$publisher = j0Var;
            this.$onStateChanged = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(this.$publisher, this.$onStateChanged, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j0<PaywallState> j0Var = this.$publisher;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onStateChanged, null);
                this.label = 1;
                if (k.C(j0Var, anonymousClass1, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_paywall.InternalGetPaywallKt$getPaywallSync$3, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.get_paywall.InternalGetPaywallKt$getPaywallSync$3", f = "InternalGetPaywall.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends o implements Function2<s0, kotlin.coroutines.d<? super Either<? extends PaywallView, Throwable>>, Object> {
        final /* synthetic */ j0<PaywallState> $publisher;
        final /* synthetic */ PresentationRequest $request;
        final /* synthetic */ Superwall $this_getPaywallSync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Superwall superwall, PresentationRequest presentationRequest, j0<PaywallState> j0Var, kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$this_getPaywallSync = superwall;
            this.$request = presentationRequest;
            this.$publisher = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass3(this.$this_getPaywallSync, this.$request, this.$publisher, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super Either<? extends PaywallView, Throwable>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super Either<PaywallView, Throwable>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objL = b.l();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            Superwall superwall = this.$this_getPaywallSync;
            PresentationRequest presentationRequest = this.$request;
            j0<PaywallState> j0Var = this.$publisher;
            this.label = 1;
            Object paywall = InternalGetPaywallKt.getPaywall(superwall, presentationRequest, j0Var, this);
            return paywall == objL ? objL : paywall;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super Either<PaywallView, Throwable>> dVar) {
            return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public static final Object getPaywall(@NotNull Superwall superwall, @NotNull PresentationRequest presentationRequest, @NotNull j0<PaywallState> j0Var, @NotNull kotlin.coroutines.d<? super Either<PaywallView, Throwable>> dVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object paywallComponents;
        Throwable th2;
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
            anonymousClass1.L$0 = superwall;
            anonymousClass1.L$1 = presentationRequest;
            anonymousClass1.L$2 = j0Var;
            anonymousClass1.label = 1;
            paywallComponents = GetPaywallComponentsKt.getPaywallComponents(superwall, presentationRequest, j0Var, anonymousClass1);
            if (paywallComponents == objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            j0Var = (j0) anonymousClass1.L$2;
            presentationRequest = (PresentationRequest) anonymousClass1.L$1;
            superwall = (Superwall) anonymousClass1.L$0;
            ResultKt.m(obj);
            paywallComponents = ((Result) obj).j();
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th2 = (Throwable) anonymousClass1.L$0;
            ResultKt.m(obj);
        }
        return new Either.Failure(th2);
        Throwable thD = Result.d(paywallComponents);
        if (thD == null) {
            PaywallComponents paywallComponents2 = (PaywallComponents) paywallComponents;
            paywallComponents2.getView().set$superwall_release(presentationRequest, j0Var, paywallComponents2.getRulesOutcome().getUnsavedOccurrence());
            return new Either.Success(paywallComponents2.getView());
        }
        anonymousClass1.L$0 = thD;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.label = 2;
        if (LogErrorsKt.logErrors(superwall, presentationRequest, thD, anonymousClass1) != objL) {
            th2 = thD;
            return new Either.Failure(th2);
        }
        return objL;
    }

    public static /* synthetic */ Object getPaywall$default(Superwall superwall, PresentationRequest presentationRequest, j0 j0Var, kotlin.coroutines.d dVar, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            j0Var = q0.b(0, 0, null, 7, null);
        }
        return getPaywall(superwall, presentationRequest, j0Var, dVar);
    }

    @NotNull
    public static final Either<PaywallView, Throwable> getPaywallSync(@NotNull Superwall superwall, @NotNull PresentationRequest request, @NotNull Function1<? super PaywallState, Unit> onStateChanged) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
        IOScope ioScope$superwall_release = Superwall.Companion.getInstance().getIoScope$superwall_release();
        j0 j0VarB = q0.b(0, 0, null, 7, null);
        kotlinx.coroutines.k.f(ioScope$superwall_release, null, null, new AnonymousClass2(j0VarB, onStateChanged, null), 3, null);
        return (Either) j.b(null, new AnonymousClass3(superwall, request, j0VarB, null), 1, null);
    }

    public static /* synthetic */ Either getPaywallSync$default(Superwall superwall, PresentationRequest presentationRequest, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: com.superwall.sdk.paywall.presentation.get_paywall.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InternalGetPaywallKt.getPaywallSync$lambda$2((PaywallState) obj2);
                }
            };
        }
        return getPaywallSync(superwall, presentationRequest, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPaywallSync$lambda$2(PaywallState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }
}
