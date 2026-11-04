package io.intercom.android.sdk.survey.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.u;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.t;
import androidx.compose.runtime.w6;
import androidx.core.view.k2;
import androidx.lifecycle.p0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.survey.CloseEventTrigger;
import io.intercom.android.sdk.survey.SurveyEffects;
import io.intercom.android.sdk.survey.SurveyLaunchMode;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyViewModel;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import oj.j;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nIntercomSurveyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomSurveyActivity.kt\nio/intercom/android/sdk/survey/ui/IntercomSurveyActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public final class IntercomSurveyActivity extends IntercomBaseActivity {

    @NotNull
    private static final String PARCEL_SURVEY_ID = "parcel_survey_id";
    private final Injector injector = Injector.get();

    @NotNull
    private final f0 viewModel$delegate = g0.c(new Function0() { // from class: io.intercom.android.sdk.survey.ui.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IntercomSurveyActivity.viewModel_delegate$lambda$0(this.f293322a);
        }
    });

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent buildIntent$default(Companion companion, Context context, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.buildIntent(context, str);
        }

        @j
        @n
        @NotNull
        public final Intent buildIntent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return buildIntent$default(this, context, null, 2, null);
        }

        private Companion() {
        }

        @j
        @n
        @NotNull
        public final Intent buildIntent(@NotNull Context context, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) IntercomSurveyActivity.class);
            intent.putExtra(IntercomSurveyActivity.PARCEL_SURVEY_ID, str);
            intent.setFlags(335544320);
            return intent;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onStart$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onStart$1", f = "IntercomSurveyActivity.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    static final class C28341 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        C28341(kotlin.coroutines.d<? super C28341> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return IntercomSurveyActivity.this.new C28341(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j0<SurveyEffects> effects = IntercomSurveyActivity.this.getViewModel().getEffects();
                final IntercomSurveyActivity intercomSurveyActivity = IntercomSurveyActivity.this;
                kotlinx.coroutines.flow.j<? super SurveyEffects> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity.onStart.1.1
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((SurveyEffects) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(SurveyEffects surveyEffects, kotlin.coroutines.d<? super Unit> dVar) {
                        if (!Intrinsics.areEqual(surveyEffects, SurveyEffects.ExitSurvey.INSTANCE)) {
                            throw new k0();
                        }
                        intercomSurveyActivity.finish();
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (effects.collect(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C28341) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @j
    @n
    @NotNull
    public static final Intent buildIntent(@NotNull Context context) {
        return Companion.buildIntent(context);
    }

    private final SurveyViewModel createVM() {
        String stringExtra = getIntent().getStringExtra(PARCEL_SURVEY_ID);
        return SurveyViewModel.Companion.create(this, stringExtra != null ? new SurveyLaunchMode.Programmatic(stringExtra) : new SurveyLaunchMode.Automatic(this.injector.getDataLayer().getSurveyData().getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SurveyViewModel getViewModel() {
        return (SurveyViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyViewModel viewModel_delegate$lambda$0(IntercomSurveyActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.createVM();
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        u.d(this, null, null, 3, null);
        super.onCreate(bundle);
        PhoneNumberValidator.loadCountryAreaCodes(this);
        boolean z10 = false | true;
        androidx.activity.compose.f.b(this, null, w.c(-179321000, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity.onCreate.1

            /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            static final class C20411 implements Function2<c0, Integer, Unit> {
                final /* synthetic */ IntercomSurveyActivity this$0;

                /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
                /* synthetic */ class C20421 extends kotlin.jvm.internal.g0 implements Function1<s0, Unit> {
                    C20421(Object obj) {
                        super(1, obj, SurveyViewModel.class, "continueClicked", "continueClicked(Lkotlinx/coroutines/CoroutineScope;)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(s0 s0Var) {
                        invoke2(s0Var);
                        return Unit.f312394a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(s0 s0Var) {
                        ((SurveyViewModel) this.receiver).continueClicked(s0Var);
                    }
                }

                C20411(IntercomSurveyActivity intercomSurveyActivity) {
                    this.this$0 = intercomSurveyActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$0(IntercomSurveyActivity this$0) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.getViewModel().onCloseClicked(CloseEventTrigger.CLOSE_BUTTON);
                    return Unit.f312394a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1(IntercomSurveyActivity this$0, String it) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(it, "it");
                    this$0.getViewModel().onAnswerUpdated();
                    return Unit.f312394a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$2(IntercomSurveyActivity this$0, SurveyState.Content.SecondaryCta it) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(it, "it");
                    this$0.getViewModel().onSecondaryCtaClicked(it);
                    LinkOpener.handleUrl(it.getDestination(), this$0, this$0.injector.getApi());
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                    invoke(c0Var, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(c0 c0Var, int i10) {
                    if ((i10 & 11) == 2 && c0Var.d()) {
                        c0Var.u();
                        return;
                    }
                    n7 n7VarB = w6.b(this.this$0.getViewModel().getState(), null, c0Var, 8, 1);
                    k2.a(this.this$0.getWindow(), this.this$0.getWindow().getDecorView()).i(ColorExtensionsKt.m736isLightColor8_81llA(ColorExtensionsKt.m728darken8_81llA(((SurveyState) n7VarB.getValue()).getSurveyUiColors().m422getBackground0d7_KjU())));
                    SurveyState surveyState = (SurveyState) n7VarB.getValue();
                    C20421 c20421 = new C20421(this.this$0.getViewModel());
                    final IntercomSurveyActivity intercomSurveyActivity = this.this$0;
                    Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomSurveyActivity.AnonymousClass1.C20411.invoke$lambda$0(intercomSurveyActivity);
                        }
                    };
                    final IntercomSurveyActivity intercomSurveyActivity2 = this.this$0;
                    Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IntercomSurveyActivity.AnonymousClass1.C20411.invoke$lambda$1(intercomSurveyActivity2, (String) obj);
                        }
                    };
                    final IntercomSurveyActivity intercomSurveyActivity3 = this.this$0;
                    SurveyComponentKt.SurveyComponent(surveyState, c20421, function0, function1, new Function1() { // from class: io.intercom.android.sdk.survey.ui.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IntercomSurveyActivity.AnonymousClass1.C20411.invoke$lambda$2(intercomSurveyActivity3, (SurveyState.Content.SecondaryCta) obj);
                        }
                    }, c0Var, 0, 0);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                invoke(c0Var, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(c0 c0Var, int i10) {
                if ((i10 & 11) == 2 && c0Var.d()) {
                    c0Var.u();
                    return;
                }
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, w.e(-2107771943, true, new C20411(IntercomSurveyActivity.this), c0Var, 54), c0Var, 56);
            }
        }), 1, null);
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onStart() {
        super.onStart();
        k.f(p0.a(this), null, null, new C28341(null), 3, null);
        getViewModel().onUiLoaded();
    }

    @j
    @n
    @NotNull
    public static final Intent buildIntent(@NotNull Context context, @Nullable String str) {
        return Companion.buildIntent(context, str);
    }
}
