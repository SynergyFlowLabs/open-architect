package com.superwall.sdk.paywall.presentation.get_presentation_result;

import androidx.core.app.w;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingLogic;
import com.superwall.sdk.analytics.internal.TrackingParameters;
import com.superwall.sdk.analytics.internal.trackable.Trackable;
import com.superwall.sdk.analytics.internal.trackable.UserInitiatedEvent;
import com.superwall.sdk.dependencies.RequestFactory;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequestType;
import com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo;
import com.superwall.sdk.paywall.presentation.result.PresentationResult;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.util.Date;
import java.util.HashMap;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPublicGetPresentationResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicGetPresentationResult.kt\ncom/superwall/sdk/paywall/presentation/get_presentation_result/PublicGetPresentationResultKt\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n+ 3 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,108:1\n136#2,10:109\n122#3,4:119\n*S KotlinDebug\n*F\n+ 1 PublicGetPresentationResult.kt\ncom/superwall/sdk/paywall/presentation/get_presentation_result/PublicGetPresentationResultKt\n*L\n34#1:109,10\n47#1:119,4\n*E\n"})
public final class PublicGetPresentationResultKt {

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_presentation_result.PublicGetPresentationResultKt$getPresentationResult$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.get_presentation_result.PublicGetPresentationResultKt", f = "PublicGetPresentationResult.kt", i = {}, l = {43}, m = "getPresentationResult", n = {}, s = {})
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
            Object presentationResult = PublicGetPresentationResultKt.getPresentationResult(null, null, null, this);
            return presentationResult == b.l() ? presentationResult : Result.a(presentationResult);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_presentation_result.PublicGetPresentationResultKt$getPresentationResultSync$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.get_presentation_result.PublicGetPresentationResultKt$getPresentationResultSync$1", f = "PublicGetPresentationResult.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
    static final class C26851 extends o implements Function2<s0, kotlin.coroutines.d<? super Result<? extends PresentationResult>>, Object> {
        final /* synthetic */ Map<String, Object> $params;
        final /* synthetic */ String $placement;
        final /* synthetic */ Superwall $this_getPresentationResultSync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26851(Superwall superwall, String str, Map<String, ? extends Object> map, kotlin.coroutines.d<? super C26851> dVar) {
            super(2, dVar);
            this.$this_getPresentationResultSync = superwall;
            this.$placement = str;
            this.$params = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C26851(this.$this_getPresentationResultSync, this.$placement, this.$params, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object presentationResult;
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall superwall = this.$this_getPresentationResultSync;
                String str = this.$placement;
                Map<String, Object> map = this.$params;
                this.label = 1;
                presentationResult = PublicGetPresentationResultKt.getPresentationResult(superwall, str, map, this);
                if (presentationResult == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                presentationResult = ((Result) obj).j();
            }
            return Result.a(presentationResult);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Result<? extends PresentationResult>> dVar) {
            return ((C26851) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_presentation_result.PublicGetPresentationResultKt$internallyGetPresentationResult$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.presentation.get_presentation_result.PublicGetPresentationResultKt", f = "PublicGetPresentationResult.kt", i = {0, 0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.f160732u0, com.planner5d.library.engine.input.f.b.f160742x1}, m = "internallyGetPresentationResult", n = {"$this$internallyGetPresentationResult", w.I0, "eventCreatedAt", "isImplicit"}, s = {"L$0", "L$1", "L$2", "Z$0"})
    static final class C26861 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C26861(kotlin.coroutines.d<? super C26861> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PublicGetPresentationResultKt.internallyGetPresentationResult(null, null, false, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public static final Object getPresentationResult(@NotNull Superwall superwall, @NotNull String str, @Nullable Map<String, ? extends Object> map, @NotNull kotlin.coroutines.d<? super Result<? extends PresentationResult>> dVar) {
        AnonymousClass1 anonymousClass1;
        Either failure;
        Object objM785constructorimpl;
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
        Object objInternallyGetPresentationResult = anonymousClass1.result;
        Object objL = b.l();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                ResultKt.m(objInternallyGetPresentationResult);
                if (map == null) {
                    map = MapsKt.emptyMap();
                }
                UserInitiatedEvent.Track track = new UserInitiatedEvent.Track(str, false, false, new HashMap(map));
                anonymousClass1.label = 1;
                objInternallyGetPresentationResult = internallyGetPresentationResult(superwall, track, false, anonymousClass1);
                if (objInternallyGetPresentationResult == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objInternallyGetPresentationResult);
            }
            failure = new Either.Success((PresentationResult) objInternallyGetPresentationResult);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            failure = new Either.Failure(th2);
        }
        if (failure instanceof Either.Success) {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(((Either.Success) failure).getValue());
        } else {
            if (!(failure instanceof Either.Failure)) {
                throw new k0();
            }
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
        }
        return objM785constructorimpl;
    }

    public static /* synthetic */ Object getPresentationResult$default(Superwall superwall, String str, Map map, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        return getPresentationResult(superwall, str, map, dVar);
    }

    @NotNull
    public static final Object getPresentationResultSync(@NotNull Superwall superwall, @NotNull String placement, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(placement, "placement");
        return ((Result) j.b(null, new C26851(superwall, placement, map, null), 1, null)).j();
    }

    public static /* synthetic */ Object getPresentationResultSync$default(Superwall superwall, String str, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        return getPresentationResultSync(superwall, str, map);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final Object internallyGetPresentationResult(@NotNull Superwall superwall, @NotNull Trackable trackable, boolean z10, @NotNull kotlin.coroutines.d<? super PresentationResult> dVar) {
        C26861 c26861;
        Date date;
        boolean z11;
        Superwall superwall2;
        Trackable trackable2 = trackable;
        if (dVar instanceof C26861) {
            c26861 = (C26861) dVar;
            int i10 = c26861.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26861.label = i10 - Integer.MIN_VALUE;
            } else {
                c26861 = new C26861(dVar);
            }
        } else {
            c26861 = new C26861(dVar);
        }
        Object objProcessParameters = c26861.result;
        Object objL = b.l();
        int i11 = c26861.label;
        if (i11 == 0) {
            ResultKt.m(objProcessParameters);
            date = new Date();
            TrackingLogic.Companion companion = TrackingLogic.Companion;
            String id2 = superwall.getDependencyContainer$superwall_release().getAppSessionManager().getAppSession().getId();
            c26861.L$0 = superwall;
            c26861.L$1 = trackable2;
            c26861.L$2 = date;
            z11 = z10;
            c26861.Z$0 = z11;
            c26861.label = 1;
            objProcessParameters = companion.processParameters(trackable2, id2, c26861);
            if (objProcessParameters != objL) {
                superwall2 = superwall;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objProcessParameters);
            return objProcessParameters;
        }
        boolean z12 = c26861.Z$0;
        date = (Date) c26861.L$2;
        Trackable trackable3 = (Trackable) c26861.L$1;
        superwall2 = (Superwall) c26861.L$0;
        ResultKt.m(objProcessParameters);
        z11 = z12;
        trackable2 = trackable3;
        PresentationRequest presentationRequestMakePresentationRequest$default = RequestFactory.DefaultImpls.makePresentationRequest$default(superwall2.getDependencyContainer$superwall_release(), new PresentationInfo.ExplicitTrigger(new EventData((String) null, trackable2.getRawName(), ((TrackingParameters) objProcessParameters).getAudienceFilterParams(), date, 1, (DefaultConstructorMarker) null)), null, null, kotlin.coroutines.jvm.internal.b.a(false), null, false, z11 ? PresentationRequestType.GetImplicitPresentationResult.INSTANCE : PresentationRequestType.GetPresentationResult.INSTANCE, 22, null);
        c26861.L$0 = null;
        c26861.L$1 = null;
        c26861.L$2 = null;
        c26861.label = 2;
        Object presentationResult = InternalGetPresentationResultKt.getPresentationResult(superwall2, presentationRequestMakePresentationRequest$default, c26861);
        return presentationResult == objL ? objL : presentationResult;
    }
}
