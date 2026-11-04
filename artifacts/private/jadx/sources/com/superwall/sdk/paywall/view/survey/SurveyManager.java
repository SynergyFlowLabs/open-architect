package com.superwall.sdk.paywall.view.survey;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.app.w;
import com.superwall.sdk.R;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.TrackingLogic;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.analytics.internal.trackable.Trackable;
import com.superwall.sdk.config.models.Survey;
import com.superwall.sdk.config.models.SurveyOption;
import com.superwall.sdk.config.models.SurveyShowCondition;
import com.superwall.sdk.dependencies.TriggerFactory;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.paywall.presentation.PaywallCloseReason;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallResult;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.paywall.view.delegate.PaywallLoadingState;
import com.superwall.sdk.storage.LocalStorage;
import com.superwall.sdk.storage.SurveyAssignmentKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSurveyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyManager.kt\ncom/superwall/sdk/paywall/view/survey/SurveyManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1#2:291\n1557#3:292\n1628#3,3:293\n*S KotlinDebug\n*F\n+ 1 SurveyManager.kt\ncom/superwall/sdk/paywall/view/survey/SurveyManager\n*L\n98#1:292\n98#1:293,3\n*E\n"})
public final class SurveyManager {

    @NotNull
    public static final SurveyManager INSTANCE = new SurveyManager();

    @Nullable
    private static androidx.appcompat.app.c otherAlertDialog;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyShowCondition.values().length];
            try {
                iArr[SurveyShowCondition.ON_MANUAL_CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyShowCondition.ON_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.survey.SurveyManager$handleDialogDismissal$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.survey.SurveyManager$handleDialogDismissal$1", f = "SurveyManager.kt", i = {0, 1}, l = {com.planner5d.library.engine.input.b.f160571z3, 264}, m = "invokeSuspend", n = {w.I0, "outcome"}, s = {"L$0", "L$0"})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Function1<SurveyPresentationResult, Unit> $completion;
        final /* synthetic */ String $customResponse;
        final /* synthetic */ TriggerFactory $factory;
        final /* synthetic */ SurveyOption $option;
        final /* synthetic */ PaywallInfo $paywallInfo;
        final /* synthetic */ PaywallView $paywallView;
        final /* synthetic */ Survey $survey;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Survey survey, SurveyOption surveyOption, String str, PaywallInfo paywallInfo, TriggerFactory triggerFactory, PaywallView paywallView, Function1<? super SurveyPresentationResult, Unit> function1, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$survey = survey;
            this.$option = surveyOption;
            this.$customResponse = str;
            this.$paywallInfo = paywallInfo;
            this.$factory = triggerFactory;
            this.$paywallView = paywallView;
            this.$completion = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$survey, this.$option, this.$customResponse, this.$paywallInfo, this.$factory, this.$paywallView, this.$completion, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0095  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Trackable surveyResponse;
            TrackingLogic.Companion companion;
            Trackable trackable;
            TrackingLogic.ImplicitTriggerOutcome implicitTriggerOutcome;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    surveyResponse = (Trackable) this.L$2;
                    companion = (TrackingLogic.Companion) this.L$1;
                    trackable = (InternalSuperwallEvent.SurveyResponse) this.L$0;
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    implicitTriggerOutcome = (TrackingLogic.ImplicitTriggerOutcome) this.L$0;
                    ResultKt.m(obj);
                    ((Result) obj).j();
                }
                if (Intrinsics.areEqual(implicitTriggerOutcome, TrackingLogic.ImplicitTriggerOutcome.DontTriggerPaywall.INSTANCE)) {
                    this.$completion.invoke(SurveyPresentationResult.SHOW);
                }
                return Unit.f312394a;
            }
            ResultKt.m(obj);
            surveyResponse = new InternalSuperwallEvent.SurveyResponse(this.$survey, this.$option, this.$customResponse, this.$paywallInfo);
            TrackingLogic.Companion companion2 = TrackingLogic.Companion;
            TriggerFactory triggerFactory = this.$factory;
            this.L$0 = surveyResponse;
            this.L$1 = companion2;
            this.L$2 = surveyResponse;
            this.label = 1;
            Object objMakeTriggers = triggerFactory.makeTriggers(this);
            if (objMakeTriggers != objL) {
                companion = companion2;
                obj = objMakeTriggers;
                trackable = surveyResponse;
            }
            return objL;
            TrackingLogic.ImplicitTriggerOutcome implicitTriggerOutcomeCanTriggerPaywall = companion.canTriggerPaywall(surveyResponse, (Set) obj, this.$paywallView);
            Superwall companion3 = Superwall.Companion.getInstance();
            this.L$0 = implicitTriggerOutcomeCanTriggerPaywall;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (TrackingKt.track(companion3, trackable, this) != objL) {
                implicitTriggerOutcome = implicitTriggerOutcomeCanTriggerPaywall;
                if (Intrinsics.areEqual(implicitTriggerOutcome, TrackingLogic.ImplicitTriggerOutcome.DontTriggerPaywall.INSTANCE)) {
                    this.$completion.invoke(SurveyPresentationResult.SHOW);
                }
                return Unit.f312394a;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private SurveyManager() {
    }

    private final void handleDialogDismissal(boolean z10, Survey survey, SurveyOption surveyOption, String str, PaywallInfo paywallInfo, TriggerFactory triggerFactory, PaywallView paywallView, Function1<? super SurveyPresentationResult, Unit> function1) {
        if (z10) {
            function1.invoke(SurveyPresentationResult.SHOW);
        } else {
            k.f(t0.a(l1.c()), null, null, new AnonymousClass1(survey, surveyOption, str, paywallInfo, triggerFactory, paywallView, function1, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentSurveyIfAvailable$lambda$10(final Survey survey, com.google.android.material.bottomsheet.e eVar, List list, Activity activity, final Function1 function1, final boolean z10, final PaywallInfo paywallInfo, final TriggerFactory triggerFactory, final PaywallView paywallView, AdapterView adapterView, View view, final int i10, long j10) {
        if (i10 < survey.getOptions().size()) {
            eVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.superwall.sdk.paywall.view.survey.c
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    SurveyManager.presentSurveyIfAvailable$lambda$10$lambda$4(z10, survey, i10, paywallInfo, triggerFactory, paywallView, function1, dialogInterface);
                }
            });
            eVar.dismiss();
            return;
        }
        String str = (String) list.get(i10);
        if (!Intrinsics.areEqual(str, "Other")) {
            if (Intrinsics.areEqual(str, "Close")) {
                k.f(t0.a(l1.c()), null, null, new SurveyManager$presentSurveyIfAvailable$2$7(null), 3, null);
                eVar.dismiss();
                function1.invoke(SurveyPresentationResult.SHOW);
                return;
            }
            return;
        }
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.custom_alert_dialog_layout, (ViewGroup) null);
        androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(activity);
        aVar.setCancelable(false);
        aVar.setView(viewInflate);
        final SurveyOption surveyOption = new SurveyOption("000", "Other");
        aVar.setPositiveButton("Submit", new DialogInterface.OnClickListener() { // from class: com.superwall.sdk.paywall.view.survey.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SurveyManager.presentSurveyIfAvailable$lambda$10$lambda$5(dialogInterface, i11);
            }
        });
        final androidx.appcompat.app.c cVarCreate = aVar.create();
        Intrinsics.checkNotNullExpressionValue(cVarCreate, "create(...)");
        TextView textView = (TextView) viewInflate.findViewById(R.id.customDialogTitle);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.customDialogMessage);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.editText);
        textView.setText(survey.getTitle());
        textView2.setText(survey.getMessage());
        editText.addTextChangedListener(new TextWatcher() { // from class: com.superwall.sdk.paywall.view.survey.SurveyManager$presentSurveyIfAvailable$2$3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String string;
                String string2 = (editable == null || (string = editable.toString()) == null) ? null : StringsKt.E5(string).toString();
                cVarCreate.m(-1).setEnabled(!(string2 == null || string2.length() == 0));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }
        });
        cVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.superwall.sdk.paywall.view.survey.e
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SurveyManager.presentSurveyIfAvailable$lambda$10$lambda$6(cVarCreate, dialogInterface);
            }
        });
        eVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.superwall.sdk.paywall.view.survey.f
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SurveyManager.presentSurveyIfAvailable$lambda$10$lambda$7(cVarCreate, editText, dialogInterface);
            }
        });
        cVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.superwall.sdk.paywall.view.survey.g
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SurveyManager.presentSurveyIfAvailable$lambda$10$lambda$9(cVarCreate, z10, survey, surveyOption, editText, paywallInfo, triggerFactory, paywallView, function1, dialogInterface);
            }
        });
        eVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentSurveyIfAvailable$lambda$10$lambda$4(boolean z10, Survey survey, int i10, PaywallInfo paywallInfo, TriggerFactory triggerFactory, PaywallView paywallView, Function1 function1, DialogInterface dialogInterface) {
        INSTANCE.handleDialogDismissal(z10, survey, survey.getOptions().get(i10), null, paywallInfo, triggerFactory, paywallView, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentSurveyIfAvailable$lambda$10$lambda$5(DialogInterface dialogInterface, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentSurveyIfAvailable$lambda$10$lambda$6(androidx.appcompat.app.c cVar, DialogInterface dialogInterface) {
        cVar.m(-1).setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentSurveyIfAvailable$lambda$10$lambda$7(androidx.appcompat.app.c cVar, EditText editText, DialogInterface dialogInterface) {
        cVar.show();
        cVar.m(-1).setEnabled(false);
        editText.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentSurveyIfAvailable$lambda$10$lambda$9(final androidx.appcompat.app.c cVar, final boolean z10, final Survey survey, final SurveyOption surveyOption, final EditText editText, final PaywallInfo paywallInfo, final TriggerFactory triggerFactory, final PaywallView paywallView, final Function1 function1, DialogInterface dialogInterface) {
        cVar.m(-1).setOnClickListener(new View.OnClickListener() { // from class: com.superwall.sdk.paywall.view.survey.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SurveyManager.presentSurveyIfAvailable$lambda$10$lambda$9$lambda$8(z10, survey, surveyOption, editText, paywallInfo, triggerFactory, paywallView, function1, cVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentSurveyIfAvailable$lambda$10$lambda$9$lambda$8(boolean z10, Survey survey, SurveyOption surveyOption, EditText editText, PaywallInfo paywallInfo, TriggerFactory triggerFactory, PaywallView paywallView, Function1 function1, androidx.appcompat.app.c cVar, View view) {
        INSTANCE.handleDialogDismissal(z10, survey, surveyOption, editText.getText().toString(), paywallInfo, triggerFactory, paywallView, function1);
        cVar.dismiss();
    }

    private final Survey selectSurvey(List<Survey> list, PaywallResult paywallResult, PaywallCloseReason paywallCloseReason) {
        boolean z10 = paywallResult instanceof PaywallResult.Purchased;
        boolean z11 = paywallResult instanceof PaywallResult.Declined;
        boolean z12 = paywallCloseReason instanceof PaywallCloseReason.ManualClose;
        for (Survey survey : list) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[survey.getPresentationCondition().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new k0();
                }
                if (z10) {
                    return survey;
                }
            } else if (z11 && z12) {
                return survey;
            }
        }
        return null;
    }

    public final void presentSurveyIfAvailable(@NotNull List<Survey> surveys, @NotNull PaywallResult paywallResult, @NotNull PaywallCloseReason paywallCloseReason, @Nullable final Activity activity, @NotNull final PaywallView paywallView, @NotNull PaywallLoadingState loadingState, final boolean z10, @NotNull final PaywallInfo paywallInfo, @NotNull LocalStorage storage, @NotNull final TriggerFactory factory, @NotNull final Function1<? super SurveyPresentationResult, Unit> completion) {
        Intrinsics.checkNotNullParameter(surveys, "surveys");
        Intrinsics.checkNotNullParameter(paywallResult, "paywallResult");
        Intrinsics.checkNotNullParameter(paywallCloseReason, "paywallCloseReason");
        Intrinsics.checkNotNullParameter(paywallView, "paywallView");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(paywallInfo, "paywallInfo");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (activity == null) {
            completion.invoke(SurveyPresentationResult.NOSHOW);
            return;
        }
        final Survey surveySelectSurvey = selectSurvey(surveys, paywallResult, paywallCloseReason);
        if (surveySelectSurvey == null) {
            completion.invoke(SurveyPresentationResult.NOSHOW);
            return;
        }
        if (!(loadingState instanceof PaywallLoadingState.Ready) && !(loadingState instanceof PaywallLoadingState.LoadingPurchase)) {
            completion.invoke(SurveyPresentationResult.NOSHOW);
            return;
        }
        if (surveySelectSurvey.hasSeenSurvey(storage)) {
            completion.invoke(SurveyPresentationResult.NOSHOW);
            return;
        }
        boolean zShouldAssignHoldout = surveySelectSurvey.shouldAssignHoldout(z10);
        if (!z10) {
            storage.write(SurveyAssignmentKey.INSTANCE, surveySelectSurvey.getAssignmentKey());
        }
        if (zShouldAssignHoldout) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.info, LogScope.paywallView, "The survey will not present.", null, null, 24, null);
            completion.invoke(SurveyPresentationResult.HOLDOUT);
            return;
        }
        final com.google.android.material.bottomsheet.e eVar = new com.google.android.material.bottomsheet.e(activity);
        eVar.setCanceledOnTouchOutside(false);
        eVar.setCancelable(false);
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.survey_bottom_sheet, (ViewGroup) null);
        eVar.setContentView(viewInflate);
        final ArrayList arrayList = new ArrayList();
        List<SurveyOption> options = surveySelectSurvey.getOptions();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SurveyOption) it.next()).getTitle());
        }
        arrayList.addAll(arrayList2);
        if (surveySelectSurvey.getIncludeOtherOption()) {
            arrayList.add("Other");
        }
        if (surveySelectSurvey.getIncludeCloseOption()) {
            arrayList.add("Close");
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.message);
        textView.setText(surveySelectSurvey.getTitle());
        textView2.setText(surveySelectSurvey.getMessage());
        View viewFindViewById = viewInflate.findViewById(R.id.surveyListView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ListView listView = (ListView) viewFindViewById;
        listView.setAdapter((ListAdapter) new ArrayAdapter(activity, R.layout.list_item, arrayList));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.superwall.sdk.paywall.view.survey.b
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                SurveyManager.presentSurveyIfAvailable$lambda$10(surveySelectSurvey, eVar, arrayList, activity, completion, z10, paywallInfo, factory, paywallView, adapterView, view, i10, j10);
            }
        });
        eVar.show();
    }
}
