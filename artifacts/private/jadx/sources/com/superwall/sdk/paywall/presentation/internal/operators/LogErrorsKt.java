package com.superwall.sdk.paywall.presentation.internal.operators;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatus;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.p;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class LogErrorsKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.LogErrorsKt$logErrors$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.LogErrorsKt", f = "LogErrors.kt", i = {0}, l = {21}, m = "logErrors", n = {"error"}, s = {"L$0"})
    static final class AnonymousClass1 extends d {
        Object L$0;
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
            return LogErrorsKt.logErrors(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.LogErrorsKt$logErrors$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.LogErrorsKt$logErrors$2", f = "LogErrors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super p2>, Object> {
        final /* synthetic */ Throwable $error;
        final /* synthetic */ PresentationRequest $request;
        final /* synthetic */ Superwall $this_logErrors;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.internal.operators.LogErrorsKt$logErrors$2$1, reason: invalid class name */
        @f(c = "com.superwall.sdk.paywall.presentation.internal.operators.LogErrorsKt$logErrors$2$1", f = "LogErrors.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
            final /* synthetic */ Throwable $error;
            final /* synthetic */ PresentationRequest $request;
            final /* synthetic */ Superwall $this_logErrors;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PresentationRequest presentationRequest, Throwable th2, Superwall superwall, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$request = presentationRequest;
                this.$error = th2;
                this.$this_logErrors = superwall;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass1(this.$request, this.$error, this.$this_logErrors, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    int i11 = 3 ^ 0;
                    InternalSuperwallEvent.PresentationRequest presentationRequest = new InternalSuperwallEvent.PresentationRequest(this.$request.getPresentationInfo().getEventData(), this.$request.getFlags().getType(), PaywallPresentationRequestStatus.NoPresentation.INSTANCE, (PaywallPresentationRequestStatusReason) this.$error, this.$this_logErrors.getDependencyContainer$superwall_release(), null, 32, null);
                    Superwall superwall = this.$this_logErrors;
                    this.label = 1;
                    if (TrackingKt.track(superwall, presentationRequest, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    ((Result) obj).j();
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PresentationRequest presentationRequest, Throwable th2, Superwall superwall, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$request = presentationRequest;
            this.$error = th2;
            this.$this_logErrors = superwall;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$error, this.$this_logErrors, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            int i10 = 6 >> 0;
            return k.f((s0) this.L$0, null, null, new AnonymousClass1(this.$request, this.$error, this.$this_logErrors, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super p2> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object logErrors(@NotNull Superwall superwall, @NotNull PresentationRequest presentationRequest, @NotNull Throwable th2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
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
            if (th2 instanceof PaywallPresentationRequestStatusReason) {
                n0 n0VarC = l1.c();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(presentationRequest, th2, superwall, null);
                anonymousClass1.L$0 = th2;
                anonymousClass1.label = 1;
                if (i.h(n0VarC, anonymousClass2, anonymousClass1) == objL) {
                    return objL;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th2 = (Throwable) anonymousClass1.L$0;
            ResultKt.m(obj);
        }
        Logger.debug$default(Logger.INSTANCE, LogLevel.info, LogScope.paywallPresentation, "Skipped paywall presentation: " + th2.getMessage() + ", " + p.i(th2), null, null, 24, null);
        return Unit.f312394a;
    }
}
