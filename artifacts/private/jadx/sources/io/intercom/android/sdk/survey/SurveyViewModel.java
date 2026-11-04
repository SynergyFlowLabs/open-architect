package io.intercom.android.sdk.survey;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import com.google.android.vending.licensing.k;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.StatsCtaRequestModel;
import io.intercom.android.sdk.survey.model.SubmitSurveyRequestItem;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.model.SurveySenderAvatar;
import io.intercom.android.sdk.survey.model.SurveySenderData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSurveyViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyViewModel.kt\nio/intercom/android/sdk/survey/SurveyViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,796:1\n1557#2:797\n1628#2,3:798\n1557#2:801\n1628#2,3:802\n1782#2,4:805\n1#3:809\n*S KotlinDebug\n*F\n+ 1 SurveyViewModel.kt\nio/intercom/android/sdk/survey/SurveyViewModel\n*L\n219#1:797\n219#1:798,3\n256#1:801\n256#1:802,3\n430#1:805,4\n*E\n"})
public final class SurveyViewModel extends f2 {
    public static final int ENTITY_TYPE = 85;

    @NotNull
    private final AppConfig appConfig;

    @NotNull
    private final List<SubmitSurveyRequestItem> completedResponses;

    @NotNull
    private final List<SurveyData.Step> completedSteps;
    private SurveyData.Step currentStep;

    @NotNull
    private final n0 dispatcher;

    @NotNull
    private final j0<SurveyEffects> effects;

    @NotNull
    private final IntercomDataLayer intercomDataLayer;

    @NotNull
    private final SurveyLaunchMode launchMode;

    @NotNull
    private final MetricTracker metricTracker;

    @NotNull
    private final k0<SurveyState> state;

    @NotNull
    private SurveyData surveyData;

    @NotNull
    private final SurveyRepository surveyRepository;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [io.intercom.android.sdk.survey.SurveyViewModel$Companion$factory$1] */
        private final SurveyViewModel$Companion$factory$1 factory(final SurveyLaunchMode surveyLaunchMode) {
            return new j2.c() { // from class: io.intercom.android.sdk.survey.SurveyViewModel$Companion$factory$1
                @Override // androidx.lifecycle.j2.c
                public <T extends f2> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    int i10 = 7 ^ 0;
                    return new SurveyViewModel(null, surveyLaunchMode, null, null, null, null, 61, null);
                }
            };
        }

        @NotNull
        public final SurveyViewModel create(@NotNull m2 owner, @NotNull SurveyLaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            return (SurveyViewModel) new j2(owner, factory(launchMode)).c(SurveyViewModel.class);
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SurveyData.StepType.values().length];
            try {
                iArr[SurveyData.StepType.QUESTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.StepType.INTRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.StepType.CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.StepType.THANK_YOU.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CloseEventTrigger.values().length];
            try {
                iArr2[CloseEventTrigger.CTA.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CloseEventTrigger.CLOSE_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CloseEventTrigger.SECONDARY_CTA_EXTERNAL_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CloseEventTrigger.SECONDARY_CTA_DEEP_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$fetchAndShowSurvey$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.survey.SurveyViewModel$fetchAndShowSurvey$1", f = "SurveyViewModel.kt", i = {}, l = {androidx.media2.widget.f.i.f59777h0}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ String $surveyId;
        final /* synthetic */ SurveyUiColors $uiColors;
        int label;
        final /* synthetic */ SurveyViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, SurveyViewModel surveyViewModel, SurveyUiColors surveyUiColors, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$surveyId = str;
            this.this$0 = surveyViewModel;
            this.$uiColors = surveyUiColors;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(SurveyViewModel surveyViewModel, String str) {
            surveyViewModel.fetchAndShowSurvey(str);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$surveyId, this.this$0, this.$uiColors, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (StringsKt.w3(this.$surveyId)) {
                    int i11 = 7 << 0;
                    this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null), 1, null));
                    return Unit.f312394a;
                }
                this.this$0.emitLoading();
                SurveyRepository surveyRepository = this.this$0.surveyRepository;
                String str = this.$surveyId;
                this.label = 1;
                obj = surveyRepository.fetchSurvey(str, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            NetworkResponse networkResponse = (NetworkResponse) obj;
            if (networkResponse instanceof NetworkResponse.Success) {
                this.this$0.surveyData = ((FetchSurveyRequest) ((NetworkResponse.Success) networkResponse).getBody()).getSurvey();
                if (this.this$0.surveyData.getSteps().isEmpty()) {
                    this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null), 1, null));
                } else {
                    this.this$0.metricTracker.surveyOpened("opened", "survey", MetricTracker.Context.FROM_PROGRAMMATIC, this.this$0.surveyData.getId(), this.this$0.surveyData.getFormatMetric());
                    SurveyViewModel surveyViewModel = this.this$0;
                    surveyViewModel.currentStep = (SurveyData.Step) CollectionsKt.first((List) surveyViewModel.surveyData.getSteps());
                    k0<SurveyState> state = this.this$0.getState();
                    SurveyViewModel surveyViewModel2 = this.this$0;
                    state.setValue(surveyViewModel2.buildContentState(surveyViewModel2.surveyData));
                }
            } else if (networkResponse instanceof NetworkResponse.ClientError) {
                int i12 = 6 << 1;
                this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null), 1, null));
            } else if (networkResponse instanceof NetworkResponse.NetworkError) {
                k0<SurveyState> state2 = this.this$0.getState();
                TopBarState.NoTopBarState noTopBarState = new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null);
                SurveyUiColors surveyUiColors = this.$uiColors;
                final SurveyViewModel surveyViewModel3 = this.this$0;
                final String str2 = this.$surveyId;
                state2.setValue(new SurveyState.Error.WithCTA(0, surveyUiColors, noTopBarState, new Function0() { // from class: io.intercom.android.sdk.survey.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SurveyViewModel.AnonymousClass1.invokeSuspend$lambda$0(surveyViewModel3, str2);
                    }
                }, 1, null));
            } else {
                if (!(networkResponse instanceof NetworkResponse.ServerError)) {
                    throw new kotlin.k0();
                }
                this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(R.string.intercom_page_not_found, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null)));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1", f = "SurveyViewModel.kt", i = {}, l = {k.f115074c}, m = "invokeSuspend", n = {}, s = {})
    static final class C28231 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ CloseEventTrigger $triggerType;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1$1", f = "SurveyViewModel.kt", i = {}, l = {275, 280}, m = "invokeSuspend", n = {}, s = {})
        static final class C20331 extends o implements Function2<s0, d<? super Unit>, Object> {
            int label;
            final /* synthetic */ SurveyViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C20331(SurveyViewModel surveyViewModel, d<? super C20331> dVar) {
                super(2, dVar);
                this.this$0 = surveyViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C20331(this.this$0, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x007d  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
            
                if (r7.reportFailure(r1, r3, r6) == r0) goto L25;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r5 = 3
                    int r1 = r6.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L21
                    if (r1 == r3) goto L1d
                    r5 = 3
                    if (r1 != r2) goto L15
                    kotlin.ResultKt.m(r7)
                    goto L9d
                L15:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L1d:
                    kotlin.ResultKt.m(r7)
                    goto L75
                L21:
                    r5 = 5
                    kotlin.ResultKt.m(r7)
                    io.intercom.android.sdk.survey.SurveyViewModel r7 = r6.this$0
                    io.intercom.android.sdk.survey.model.SurveyData r7 = io.intercom.android.sdk.survey.SurveyViewModel.access$getSurveyData$p(r7)
                    java.util.List r7 = r7.getSteps()
                    java.util.Collection r7 = (java.util.Collection) r7
                    boolean r7 = r7.isEmpty()
                    if (r7 != 0) goto L9d
                    io.intercom.android.sdk.survey.SurveyViewModel r7 = r6.this$0
                    io.intercom.android.sdk.survey.model.SurveyData$Step r7 = io.intercom.android.sdk.survey.SurveyViewModel.access$getCurrentStep$p(r7)
                    if (r7 != 0) goto L46
                    java.lang.String r7 = "currentStep"
                    r5 = 2
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
                    r7 = 0
                L46:
                    io.intercom.android.sdk.survey.model.SurveyData$StepType r7 = r7.getType()
                    io.intercom.android.sdk.survey.model.SurveyData$StepType r1 = io.intercom.android.sdk.survey.model.SurveyData.StepType.THANK_YOU
                    if (r7 == r1) goto L9d
                    io.intercom.android.sdk.survey.SurveyViewModel r7 = r6.this$0
                    io.intercom.android.sdk.survey.SurveyRepository r7 = io.intercom.android.sdk.survey.SurveyViewModel.access$getSurveyRepository$p(r7)
                    r5 = 0
                    io.intercom.android.sdk.survey.SurveyViewModel r1 = r6.this$0
                    r5 = 0
                    io.intercom.android.sdk.survey.model.SurveyData r1 = io.intercom.android.sdk.survey.SurveyViewModel.access$getSurveyData$p(r1)
                    java.lang.String r1 = r1.getId()
                    io.intercom.android.sdk.survey.SurveyViewModel r4 = r6.this$0
                    r5 = 4
                    io.intercom.android.sdk.survey.model.SurveyData r4 = io.intercom.android.sdk.survey.SurveyViewModel.access$getSurveyData$p(r4)
                    java.lang.String r4 = r4.getSurveyProgressId()
                    r6.label = r3
                    java.lang.Object r7 = r7.dismissSurvey(r1, r4, r6)
                    r5 = 6
                    if (r7 != r0) goto L75
                    goto L9b
                L75:
                    r5 = 1
                    io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r7 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r7
                    boolean r7 = r7 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
                    r5 = 5
                    if (r7 == 0) goto L9d
                    io.intercom.android.sdk.survey.SurveyViewModel r7 = r6.this$0
                    io.intercom.android.sdk.survey.model.SurveyData r1 = io.intercom.android.sdk.survey.SurveyViewModel.access$getSurveyData$p(r7)
                    r5 = 1
                    java.lang.String r1 = r1.getId()
                    io.intercom.android.sdk.survey.SurveyViewModel r3 = r6.this$0
                    io.intercom.android.sdk.survey.model.SurveyData r3 = io.intercom.android.sdk.survey.SurveyViewModel.access$getSurveyData$p(r3)
                    java.lang.String r3 = r3.getSurveyProgressId()
                    r6.label = r2
                    java.lang.Object r6 = io.intercom.android.sdk.survey.SurveyViewModel.access$reportFailure(r7, r1, r3, r6)
                    r5 = 4
                    if (r6 != r0) goto L9d
                L9b:
                    r5 = 5
                    return r0
                L9d:
                    r5 = 0
                    kotlin.Unit r6 = kotlin.Unit.f312394a
                    r5 = 3
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.SurveyViewModel.C28231.C20331.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
                return ((C20331) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28231(CloseEventTrigger closeEventTrigger, d<? super C28231> dVar) {
            super(2, dVar);
            this.$triggerType = closeEventTrigger;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return SurveyViewModel.this.new C28231(this.$triggerType, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                SurveyViewModel.this.sendDismissedEvent(this.$triggerType);
                kotlinx.coroutines.k.f(kotlinx.coroutines.f2.f314023a, null, null, new C20331(SurveyViewModel.this, null), 3, null);
                SurveyViewModel.this.intercomDataLayer.clearSurveyData();
                j0<SurveyEffects> effects = SurveyViewModel.this.getEffects();
                SurveyEffects.ExitSurvey exitSurvey = SurveyEffects.ExitSurvey.INSTANCE;
                this.label = 1;
                if (effects.emit(exitSurvey, this) == objL) {
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
            return ((C28231) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onSecondaryCtaClicked$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.survey.SurveyViewModel$onSecondaryCtaClicked$1", f = "SurveyViewModel.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
    static final class C28241 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C28241(d<? super C28241> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return SurveyViewModel.this.new C28241(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                SurveyRepository surveyRepository = SurveyViewModel.this.surveyRepository;
                String id2 = SurveyViewModel.this.surveyData.getId();
                String surveyProgressId = SurveyViewModel.this.surveyData.getSurveyProgressId();
                SurveyData.Step step = SurveyViewModel.this.currentStep;
                if (step == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                    step = null;
                }
                StatsCtaRequestModel statsCtaRequestModel = new StatsCtaRequestModel(surveyProgressId, step.getId());
                this.label = 1;
                if (surveyRepository.submitCtaStat(id2, statsCtaRequestModel, this) == objL) {
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
            return ((C28241) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onUiLoaded$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.survey.SurveyViewModel$onUiLoaded$1", f = "SurveyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C28251 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C28251(d<? super C28251> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return SurveyViewModel.this.new C28251(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            SurveyLaunchMode surveyLaunchMode = SurveyViewModel.this.launchMode;
            if (surveyLaunchMode instanceof SurveyLaunchMode.Automatic) {
                SurveyViewModel surveyViewModel = SurveyViewModel.this;
                surveyViewModel.surveyData = ((SurveyLaunchMode.Automatic) surveyViewModel.launchMode).getSurveyData();
                if (SurveyViewModel.this.surveyData.getSteps().isEmpty()) {
                    SurveyUiColors surveyUiColors = SurveyViewModelKt.toSurveyUiColors(SurveyViewModel.this.surveyData.getCustomization());
                    SurveyViewModel.this.getState().setValue(new SurveyState.Error.WithoutCTA(0, surveyUiColors, new TopBarState.NoTopBarState(true, surveyUiColors, null, 4, null), 1, null));
                } else {
                    SurveyViewModel.this.metricTracker.surveyOpened("opened", "survey", MetricTracker.Context.FROM_AUTOMATIC, SurveyViewModel.this.surveyData.getId(), SurveyViewModel.this.surveyData.getFormatMetric());
                    SurveyViewModel surveyViewModel2 = SurveyViewModel.this;
                    surveyViewModel2.currentStep = (SurveyData.Step) CollectionsKt.first((List) surveyViewModel2.surveyData.getSteps());
                    k0<SurveyState> state = SurveyViewModel.this.getState();
                    SurveyViewModel surveyViewModel3 = SurveyViewModel.this;
                    state.setValue(surveyViewModel3.buildContentState(surveyViewModel3.surveyData));
                }
            } else {
                if (!(surveyLaunchMode instanceof SurveyLaunchMode.Programmatic)) {
                    throw new kotlin.k0();
                }
                SurveyViewModel surveyViewModel4 = SurveyViewModel.this;
                surveyViewModel4.fetchAndShowSurvey(((SurveyLaunchMode.Programmatic) surveyViewModel4.launchMode).getSurveyId());
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28251) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$reportFailure$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.survey.SurveyViewModel", f = "SurveyViewModel.kt", i = {}, l = {459}, m = "reportFailure", n = {}, s = {})
    static final class C28261 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C28261(d<? super C28261> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SurveyViewModel.this.reportFailure(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$submitSurvey$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.survey.SurveyViewModel$submitSurvey$1", f = "SurveyViewModel.kt", i = {}, l = {325, 365, 411}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSurveyViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyViewModel.kt\nio/intercom/android/sdk/survey/SurveyViewModel$submitSurvey$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,796:1\n1863#2,2:797\n1734#2,3:799\n230#2,2:802\n1557#2:805\n1628#2,3:806\n1#3:804\n*S KotlinDebug\n*F\n+ 1 SurveyViewModel.kt\nio/intercom/android/sdk/survey/SurveyViewModel$submitSurvey$1\n*L\n330#1:797,2\n334#1:799,3\n336#1:802,2\n346#1:805\n346#1:806,3\n*E\n"})
    static final class C28271 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ s0 $compositionAwareScope;
        final /* synthetic */ SurveyState.Content $surveyContent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28271(SurveyState.Content content, s0 s0Var, d<? super C28271> dVar) {
            super(2, dVar);
            this.$surveyContent = content;
            this.$compositionAwareScope = s0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$7(SurveyViewModel surveyViewModel, SurveyState.Content content, s0 s0Var) {
            surveyViewModel.submitSurvey(content, s0Var);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return SurveyViewModel.this.new C28271(this.$surveyContent, this.$compositionAwareScope, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:102:0x026d  */
        /* JADX WARN: Code duplicated, block: B:104:0x0272  */
        /* JADX WARN: Code duplicated, block: B:105:0x02b1  */
        /* JADX WARN: Code duplicated, block: B:114:0x02f7  */
        /* JADX WARN: Code duplicated, block: B:79:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:81:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:84:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:86:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:89:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:91:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:96:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:99:0x0206 A[LOOP:0: B:97:0x0200->B:99:0x0206, LOOP_END] */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x0311, code lost:
        
            if (r15.reportFailure(r1, r3, r14) == r0) goto L116;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (r15.emit(r1, r14) == r0) goto L116;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 791
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.SurveyViewModel.C28271.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C28271) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ SurveyViewModel(n0 n0Var, SurveyLaunchMode surveyLaunchMode, SurveyRepository surveyRepository, AppConfig appConfig, MetricTracker metricTracker, IntercomDataLayer intercomDataLayer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? l1.c() : n0Var, surveyLaunchMode, (i10 & 4) != 0 ? new SurveyRepository(null, 1, null) : surveyRepository, (i10 & 8) != 0 ? Injector.get().getAppConfigProvider().get() : appConfig, (i10 & 16) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i10 & 32) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    public final SurveyState.Content buildContentState(SurveyData surveyData) {
        boolean z10;
        TopBarState senderTopBarState;
        SurveyState.Content.PrimaryCta fallback;
        SurveyUiColors surveyUiColors = SurveyViewModelKt.toSurveyUiColors(surveyData.getCustomization());
        float stepCount = surveyData.getStepCount();
        int size = this.completedSteps.size();
        SurveyData.Step step = null;
        if (surveyData.getShowProgressBar()) {
            SurveyData.Step step2 = this.currentStep;
            if (step2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                step2 = null;
            }
            if (step2.getType() != SurveyData.StepType.CONTENT) {
                SurveyData.Step step3 = this.currentStep;
                if (step3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                    step3 = null;
                }
                if (step3.getType() != SurveyData.StepType.QUESTION) {
                    z10 = false;
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        ProgressBarState progressBarState = new ProgressBarState(z10, size / stepCount);
        SurveySenderData sender = surveyData.getSender();
        if ((sender != null ? sender.getName() : null) == null) {
            senderTopBarState = new TopBarState.NoTopBarState(surveyData.isDismissible(), surveyUiColors, progressBarState);
        } else {
            Avatar.Builder builder = new Avatar.Builder();
            SurveySenderAvatar avatar = surveyData.getSender().getAvatar();
            Avatar avatarBuild = builder.withImageUrl(avatar != null ? avatar.getSquareImg128() : null).withInitials(surveyData.getSender().getInitials()).build();
            Intrinsics.checkNotNullExpressionValue(avatarBuild, "build(...)");
            String firstName = surveyData.getSender().getFirstName();
            if (firstName == null) {
                firstName = surveyData.getSender().getName();
            }
            senderTopBarState = new TopBarState.SenderTopBarState(avatarBuild, firstName, this.appConfig, surveyData.isDismissible(), surveyUiColors, progressBarState);
        }
        SurveyData.Step step4 = this.currentStep;
        if (step4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentStep");
            step4 = null;
        }
        String customButtonText = step4.getCustomButtonText();
        SurveyData.Step step5 = this.currentStep;
        if (step5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentStep");
            step5 = null;
        }
        List<Block.Builder> blocks = step5.getBlocks();
        SurveyData.Step step6 = this.currentStep;
        if (step6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentStep");
            step6 = null;
        }
        List<SurveyData.Step.Question> questions = step6.getQuestions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(questions, 10));
        Iterator<T> it = questions.iterator();
        while (it.hasNext()) {
            arrayList.add(new QuestionState(((SurveyData.Step.Question) it.next()).getQuestionModel(), surveyUiColors));
        }
        SurveyData.Step step7 = this.currentStep;
        if (step7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentStep");
            step7 = null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[step7.getType().ordinal()];
        if (i10 == 1) {
            fallback = (customButtonText == null || customButtonText.length() == 0) ? new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_submit) : new SurveyState.Content.PrimaryCta.Custom(customButtonText);
        } else if (i10 == 2 || i10 == 3) {
            fallback = (customButtonText == null || customButtonText.length() == 0) ? new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_next_button) : new SurveyState.Content.PrimaryCta.Custom(customButtonText);
        } else if (i10 != 4) {
            fallback = (customButtonText == null || customButtonText.length() == 0) ? new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_next_button) : new SurveyState.Content.PrimaryCta.Custom(customButtonText);
        } else {
            fallback = (customButtonText == null || customButtonText.length() == 0) ? new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_done_button) : new SurveyState.Content.PrimaryCta.Custom(customButtonText);
        }
        SurveyState.Content.PrimaryCta primaryCta = fallback;
        SurveyData.Step step8 = this.currentStep;
        if (step8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentStep");
        } else {
            step = step8;
        }
        List<SurveyData.SurveyActions> actions = step.getActions();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(actions, 10));
        for (SurveyData.SurveyActions surveyActions : actions) {
            boolean z11 = surveyActions.getAndroidUri() == null;
            String webUrl = z11 ? surveyActions.getWebUrl() : surveyActions.getAndroidUri();
            String actionTitle = surveyActions.getActionTitle();
            if (webUrl == null) {
                webUrl = "";
            }
            arrayList2.add(new SurveyState.Content.SecondaryCta(actionTitle, webUrl, z11));
        }
        return new SurveyState.Content(blocks, arrayList, arrayList2, primaryCta, surveyUiColors, senderTopBarState);
    }

    public static /* synthetic */ void continueClicked$default(SurveyViewModel surveyViewModel, s0 s0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s0Var = null;
        }
        surveyViewModel.continueClicked(s0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitLoading() {
        k0<SurveyState> k0Var = this.state;
        k0Var.setValue(new SurveyState.Loading(this.state.getValue().getSurveyUiColors(), k0Var.getValue().getTopBarState()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchAndShowSurvey(String str) {
        kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new AnonymousClass1(str, this, SurveyViewModelKt.toSurveyUiColors(this.surveyData.getCustomization()), null), 2, null);
    }

    private final SurveyState.Content getCurrentContentState() {
        SurveyState value = this.state.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type io.intercom.android.sdk.survey.SurveyState.Content");
        return (SurveyState.Content) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object reportFailure(String str, String str2, d<? super Unit> dVar) {
        C28261 c28261;
        if (dVar instanceof C28261) {
            c28261 = (C28261) dVar;
            int i10 = c28261.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c28261.label = i10 - Integer.MIN_VALUE;
            } else {
                c28261 = new C28261(dVar);
            }
        } else {
            c28261 = new C28261(dVar);
        }
        Object objReportFailure = c28261.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c28261.label;
        if (i11 == 0) {
            ResultKt.m(objReportFailure);
            SurveyRepository surveyRepository = this.surveyRepository;
            c28261.label = 1;
            objReportFailure = surveyRepository.reportFailure(str, str2, c28261);
            if (objReportFailure == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objReportFailure);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDismissedEvent(CloseEventTrigger closeEventTrigger) {
        String str;
        String str2;
        SurveyState value = this.state.getValue();
        if (value instanceof SurveyState.Loading) {
            str = MetricTracker.Object.SURVEY_STEP_LOADING;
        } else {
            str = value instanceof SurveyState.Error ? MetricTracker.Object.SURVEY_STEP_ERROR : "survey";
        }
        String str3 = str;
        int i10 = WhenMappings.$EnumSwitchMapping$1[closeEventTrigger.ordinal()];
        if (i10 == 1) {
            str2 = MetricTracker.Context.FROM_CTA;
        } else if (i10 == 2) {
            str2 = MetricTracker.Context.FROM_CLOSE_BUTTON;
        } else if (i10 == 3) {
            str2 = MetricTracker.Context.FROM_ONWARD_EXTERNAL_LINK;
        } else {
            if (i10 != 4) {
                throw new kotlin.k0();
            }
            str2 = MetricTracker.Context.FROM_ONWARD_DEEP_LINK;
        }
        String str4 = str2;
        if (!this.surveyData.getSteps().isEmpty()) {
            SurveyData.Step step = this.currentStep;
            SurveyData.Step step2 = null;
            if (step == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentStep");
                step = null;
            }
            String str5 = step.getType() == SurveyData.StepType.THANK_YOU ? MetricTracker.Action.CLOSED : MetricTracker.Action.DISMISSED;
            Iterator<T> it = this.completedSteps.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((SurveyData.Step) it.next()).getQuestions().size();
            }
            SurveyData.Step step3 = this.currentStep;
            if (step3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentStep");
            } else {
                step2 = step3;
            }
            this.metricTracker.surveyDismissed(str5, str3, str4, this.surveyData.getId(), this.surveyData.getFormatMetric(), this.completedSteps.size(), this.surveyData.getStepCount(), size + step2.getQuestions().size());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitSurvey(SurveyState.Content content, s0 s0Var) {
        kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new C28271(content, s0Var, null), 2, null);
    }

    static /* synthetic */ void submitSurvey$default(SurveyViewModel surveyViewModel, SurveyState.Content content, s0 s0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            s0Var = null;
        }
        surveyViewModel.submitSurvey(content, s0Var);
    }

    public final void continueClicked(@Nullable s0 s0Var) {
        submitSurvey(getCurrentContentState(), s0Var);
    }

    @NotNull
    public final n0 getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final j0<SurveyEffects> getEffects() {
        return this.effects;
    }

    @NotNull
    public final k0<SurveyState> getState() {
        return this.state;
    }

    public final void onAnswerUpdated() {
        int i10;
        SurveyState.Content currentContentState = getCurrentContentState();
        float stepCount = this.surveyData.getStepCount();
        int size = this.completedSteps.size();
        List<QuestionState> questions = currentContentState.getQuestions();
        if ((questions instanceof Collection) && questions.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = questions.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if ((((QuestionState) it.next()).getValidationError() instanceof ValidationError.NoValidationError) && (i10 = i10 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        float f10 = size / stepCount;
        float f11 = i10;
        SurveyData.Step step = this.currentStep;
        if (step == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentStep");
            step = null;
        }
        this.state.setValue(SurveyState.Content.copy$default(currentContentState, null, null, null, null, null, currentContentState.getTopBarState().withProgressBarState(ProgressBarState.copy$default(currentContentState.getTopBarState().getProgressBarState(), false, f10 + (f11 / (stepCount * step.getQuestions().size())), 1, null)), 31, null));
    }

    public final void onCloseClicked(@NotNull CloseEventTrigger triggerType) {
        Intrinsics.checkNotNullParameter(triggerType, "triggerType");
        if (this.surveyData.isDismissible() || (this.state.getValue() instanceof SurveyState.Error)) {
            int i10 = 3 >> 0;
            kotlinx.coroutines.k.f(g2.a(this), null, null, new C28231(triggerType, null), 3, null);
        }
    }

    public final void onSecondaryCtaClicked(@NotNull SurveyState.Content.SecondaryCta secondaryCta) {
        Intrinsics.checkNotNullParameter(secondaryCta, "secondaryCta");
        CloseEventTrigger closeEventTrigger = secondaryCta.isExternalUrl() ? CloseEventTrigger.SECONDARY_CTA_EXTERNAL_LINK : CloseEventTrigger.SECONDARY_CTA_DEEP_LINK;
        if (closeEventTrigger == CloseEventTrigger.SECONDARY_CTA_DEEP_LINK) {
            kotlinx.coroutines.k.f(kotlinx.coroutines.f2.f314023a, null, null, new C28241(null), 3, null);
        }
        onCloseClicked(closeEventTrigger);
    }

    public final void onUiLoaded() {
        if (Intrinsics.areEqual(this.state.getValue(), SurveyState.Initial.INSTANCE)) {
            kotlinx.coroutines.k.f(g2.a(this), this.dispatcher, null, new C28251(null), 2, null);
        }
    }

    public SurveyViewModel(@NotNull n0 dispatcher, @NotNull SurveyLaunchMode launchMode, @NotNull SurveyRepository surveyRepository, @NotNull AppConfig appConfig, @NotNull MetricTracker metricTracker, @NotNull IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(surveyRepository, "surveyRepository");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.dispatcher = dispatcher;
        this.launchMode = launchMode;
        this.surveyRepository = surveyRepository;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.intercomDataLayer = intercomDataLayer;
        this.surveyData = SurveyData.Companion.getNULL();
        this.state = b1.a(SurveyState.Initial.INSTANCE);
        this.effects = q0.b(0, 0, null, 7, null);
        this.completedResponses = new ArrayList();
        this.completedSteps = new ArrayList();
    }
}
