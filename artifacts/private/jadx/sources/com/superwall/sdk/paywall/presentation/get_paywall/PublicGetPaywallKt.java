package com.superwall.sdk.paywall.presentation.get_paywall;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.TrackingResult;
import com.superwall.sdk.analytics.internal.trackable.UserInitiatedEvent;
import com.superwall.sdk.dependencies.DependencyContainer;
import com.superwall.sdk.dependencies.RequestFactory;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequestType;
import com.superwall.sdk.paywall.presentation.internal.request.PaywallOverrides;
import com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.paywall.view.delegate.PaywallViewCallback;
import com.superwall.sdk.paywall.view.delegate.PaywallViewDelegateAdapter;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.l;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.i;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PublicGetPaywallKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_paywall.PublicGetPaywallKt$getPaywall$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.get_paywall.PublicGetPaywallKt", f = "PublicGetPaywall.kt", i = {}, l = {52}, m = "getPaywall", n = {}, s = {})
    static final class AnonymousClass1 extends d {
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
            int i10 = 4 >> 0;
            Object paywall = PublicGetPaywallKt.getPaywall(null, null, null, null, null, this);
            return paywall == b.l() ? paywall : Result.a(paywall);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_paywall.PublicGetPaywallKt$getPaywall$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.get_paywall.PublicGetPaywallKt$getPaywall$2", f = "PublicGetPaywall.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPublicGetPaywall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicGetPaywall.kt\ncom/superwall/sdk/paywall/presentation/get_paywall/PublicGetPaywallKt$getPaywall$2\n+ 2 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,111:1\n122#2,4:112\n122#2,4:116\n*S KotlinDebug\n*F\n+ 1 PublicGetPaywall.kt\ncom/superwall/sdk/paywall/presentation/get_paywall/PublicGetPaywallKt$getPaywall$2\n*L\n70#1:112,4\n74#1:116,4\n*E\n"})
    static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super Result<? extends PaywallView>>, Object> {
        final /* synthetic */ PaywallViewCallback $delegate;
        final /* synthetic */ Map<String, Object> $params;
        final /* synthetic */ PaywallOverrides $paywallOverrides;
        final /* synthetic */ String $placement;
        final /* synthetic */ Superwall $this_getPaywall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Superwall superwall, String str, Map<String, ? extends Object> map, PaywallOverrides paywallOverrides, PaywallViewCallback paywallViewCallback, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$this_getPaywall = superwall;
            this.$placement = str;
            this.$params = map;
            this.$paywallOverrides = paywallOverrides;
            this.$delegate = paywallViewCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(this.$this_getPaywall, this.$placement, this.$params, this.$paywallOverrides, this.$delegate, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super Result<? extends PaywallView>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super Result<PaywallView>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM785constructorimpl;
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall superwall = this.$this_getPaywall;
                String str = this.$placement;
                Map<String, Object> map = this.$params;
                PaywallOverrides paywallOverrides = this.$paywallOverrides;
                PaywallViewDelegateAdapter paywallViewDelegateAdapter = new PaywallViewDelegateAdapter(this.$delegate);
                this.label = 1;
                obj = PublicGetPaywallKt.internallyGetPaywall(superwall, str, map, paywallOverrides, paywallViewDelegateAdapter, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Either either = (Either) obj;
            if (either instanceof Either.Success) {
                Either.Success success = (Either.Success) either;
                ((PaywallView) success.getValue()).prepareToDisplay();
                if (either != null) {
                    Result.a aVar = Result.Companion;
                    objM785constructorimpl = Result.m785constructorimpl(success.getValue());
                } else {
                    if (!(either instanceof Either.Failure)) {
                        throw new k0();
                    }
                    Result.a aVar2 = Result.Companion;
                    objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) either).getError()));
                }
            } else {
                if (!(either instanceof Either.Failure)) {
                    throw new k0();
                }
                if (either instanceof Either.Success) {
                    Result.a aVar3 = Result.Companion;
                    objM785constructorimpl = Result.m785constructorimpl(((Either.Success) either).getValue());
                } else {
                    if (either == null) {
                        throw new k0();
                    }
                    Result.a aVar4 = Result.Companion;
                    objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) either).getError()));
                }
            }
            return Result.a(objM785constructorimpl);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super Result<PaywallView>> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_paywall.PublicGetPaywallKt$getPaywallOrThrow$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.get_paywall.PublicGetPaywallKt$getPaywallOrThrow$2", f = "PublicGetPaywall.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPublicGetPaywall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicGetPaywall.kt\ncom/superwall/sdk/paywall/presentation/get_paywall/PublicGetPaywallKt$getPaywallOrThrow$2\n+ 2 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,111:1\n122#2,4:112\n*S KotlinDebug\n*F\n+ 1 PublicGetPaywall.kt\ncom/superwall/sdk/paywall/presentation/get_paywall/PublicGetPaywallKt$getPaywallOrThrow$2\n*L\n32#1:112,4\n*E\n"})
    static final class C26832 extends o implements Function2<s0, kotlin.coroutines.d<? super PaywallView>, Object> {
        final /* synthetic */ PaywallViewCallback $delegate;
        final /* synthetic */ Map<String, Object> $params;
        final /* synthetic */ PaywallOverrides $paywallOverrides;
        final /* synthetic */ String $placement;
        final /* synthetic */ Superwall $this_getPaywallOrThrow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26832(Superwall superwall, String str, Map<String, ? extends Object> map, PaywallOverrides paywallOverrides, PaywallViewCallback paywallViewCallback, kotlin.coroutines.d<? super C26832> dVar) {
            super(2, dVar);
            this.$this_getPaywallOrThrow = superwall;
            this.$placement = str;
            this.$params = map;
            this.$paywallOverrides = paywallOverrides;
            this.$delegate = paywallViewCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C26832(this.$this_getPaywallOrThrow, this.$placement, this.$params, this.$paywallOverrides, this.$delegate, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM785constructorimpl;
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall superwall = this.$this_getPaywallOrThrow;
                String str = this.$placement;
                Map<String, Object> map = this.$params;
                PaywallOverrides paywallOverrides = this.$paywallOverrides;
                PaywallViewDelegateAdapter paywallViewDelegateAdapter = new PaywallViewDelegateAdapter(this.$delegate);
                this.label = 1;
                obj = PublicGetPaywallKt.internallyGetPaywall(superwall, str, map, paywallOverrides, paywallViewDelegateAdapter, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Either either = (Either) obj;
            if (either instanceof Either.Success) {
                Result.a aVar = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(((Either.Success) either).getValue());
            } else {
                if (!(either instanceof Either.Failure)) {
                    throw new k0();
                }
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) either).getError()));
            }
            ResultKt.m(objM785constructorimpl);
            PaywallView paywallView = (PaywallView) objM785constructorimpl;
            paywallView.prepareToDisplay();
            return paywallView;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super PaywallView> dVar) {
            return ((C26832) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_paywall.PublicGetPaywallKt$internallyGetPaywall$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.get_paywall.PublicGetPaywallKt$internallyGetPaywall$2", f = "PublicGetPaywall.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160703k1, 109}, m = "invokeSuspend", n = {}, s = {})
    static final class C26842 extends o implements Function2<s0, kotlin.coroutines.d<? super Either<? extends PaywallView, Throwable>>, Object> {
        final /* synthetic */ PaywallViewDelegateAdapter $delegate;
        final /* synthetic */ Map<String, Object> $params;
        final /* synthetic */ PaywallOverrides $paywallOverrides;
        final /* synthetic */ String $placement;
        final /* synthetic */ Superwall $this_internallyGetPaywall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26842(Map<String, ? extends Object> map, String str, Superwall superwall, PaywallOverrides paywallOverrides, PaywallViewDelegateAdapter paywallViewDelegateAdapter, kotlin.coroutines.d<? super C26842> dVar) {
            super(2, dVar);
            this.$params = map;
            this.$placement = str;
            this.$this_internallyGetPaywall = superwall;
            this.$paywallOverrides = paywallOverrides;
            this.$delegate = paywallViewDelegateAdapter;
            int i10 = 3 >> 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C26842(this.$params, this.$placement, this.$this_internallyGetPaywall, this.$paywallOverrides, this.$delegate, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super Either<? extends PaywallView, Throwable>> dVar) {
            return invoke2(s0Var, (kotlin.coroutines.d<? super Either<PaywallView, Throwable>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objTrack;
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Map<String, Object> mapEmptyMap = this.$params;
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                UserInitiatedEvent.Track track = new UserInitiatedEvent.Track(this.$placement, false, false, mapEmptyMap);
                Superwall superwall = this.$this_internallyGetPaywall;
                this.label = 1;
                objTrack = TrackingKt.track(superwall, track, this);
                if (objTrack != objL) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            objTrack = ((Result) obj).j();
            if (Result.m786isFailureimpl(objTrack)) {
                Throwable thD = Result.d(objTrack);
                if (thD == null) {
                    thD = new IllegalStateException("Error in tracking event");
                }
                return new Either.Failure(thD);
            }
            DependencyContainer dependencyContainer$superwall_release = this.$this_internallyGetPaywall.getDependencyContainer$superwall_release();
            ResultKt.m(objTrack);
            PresentationRequest presentationRequestMakePresentationRequest$default = RequestFactory.DefaultImpls.makePresentationRequest$default(dependencyContainer$superwall_release, new PresentationInfo.ExplicitTrigger(((TrackingResult) objTrack).getData()), this.$paywallOverrides, null, null, null, false, new PresentationRequestType.GetPaywall(this.$delegate), 28, null);
            Superwall superwall2 = this.$this_internallyGetPaywall;
            this.label = 2;
            Object paywall$default = InternalGetPaywallKt.getPaywall$default(superwall2, presentationRequestMakePresentationRequest$default, null, this, 2, null);
            return paywall$default == objL ? objL : paywall$default;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super Either<PaywallView, Throwable>> dVar) {
            return ((C26842) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @l(message = "Will be removed in the upcoming versions, use `PaywallBuilder` instead")
    @Nullable
    public static final Object getPaywall(@NotNull Superwall superwall, @NotNull String str, @Nullable Map<String, ? extends Object> map, @Nullable PaywallOverrides paywallOverrides, @NotNull PaywallViewCallback paywallViewCallback, @NotNull kotlin.coroutines.d<? super Result<PaywallView>> dVar) throws Throwable {
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
        Object objH = anonymousClass1.result;
        Object objL = b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(objH);
            a3 a3VarE = l1.e();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(superwall, str, map, paywallOverrides, paywallViewCallback, null);
            anonymousClass1.label = 1;
            objH = i.h(a3VarE, anonymousClass2, anonymousClass1);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        return ((Result) objH).j();
    }

    public static /* synthetic */ Object getPaywall$default(Superwall superwall, String str, Map map, PaywallOverrides paywallOverrides, PaywallViewCallback paywallViewCallback, kotlin.coroutines.d dVar, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            paywallOverrides = null;
        }
        return getPaywall(superwall, str, map, paywallOverrides, paywallViewCallback, dVar);
    }

    @l(message = "Will be removed in the upcoming versions, use Superwall.getPaywall instead")
    @Nullable
    public static final Object getPaywallOrThrow(@NotNull Superwall superwall, @NotNull String str, @Nullable Map<String, ? extends Object> map, @Nullable PaywallOverrides paywallOverrides, @NotNull PaywallViewCallback paywallViewCallback, @NotNull kotlin.coroutines.d<? super PaywallView> dVar) throws Throwable {
        return i.h(l1.e(), new C26832(superwall, str, map, paywallOverrides, paywallViewCallback, null), dVar);
    }

    public static /* synthetic */ Object getPaywallOrThrow$default(Superwall superwall, String str, Map map, PaywallOverrides paywallOverrides, PaywallViewCallback paywallViewCallback, kotlin.coroutines.d dVar, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            paywallOverrides = null;
        }
        return getPaywallOrThrow(superwall, str, map, paywallOverrides, paywallViewCallback, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object internallyGetPaywall(Superwall superwall, String str, Map<String, ? extends Object> map, PaywallOverrides paywallOverrides, PaywallViewDelegateAdapter paywallViewDelegateAdapter, kotlin.coroutines.d<? super Either<PaywallView, Throwable>> dVar) throws Throwable {
        return i.h(l1.e(), new C26842(map, str, superwall, paywallOverrides, paywallViewDelegateAdapter, null), dVar);
    }

    static /* synthetic */ Object internallyGetPaywall$default(Superwall superwall, String str, Map map, PaywallOverrides paywallOverrides, PaywallViewDelegateAdapter paywallViewDelegateAdapter, kotlin.coroutines.d dVar, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            paywallOverrides = null;
        }
        return internallyGetPaywall(superwall, str, map, paywallOverrides, paywallViewDelegateAdapter, dVar);
    }
}
