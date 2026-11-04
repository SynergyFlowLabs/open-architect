package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.foundation.layout.b8;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.t7;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.v6;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.q4;
import androidx.compose.material3.a4;
import androidx.compose.material3.ni;
import androidx.compose.material3.os;
import androidx.compose.material3.pt;
import androidx.compose.material3.q50;
import androidx.compose.material3.s3;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.focus.p0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.font.v0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.components.QuestionComponentKt;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCreateTicketContentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateTicketContentScreen.kt\nio/intercom/android/sdk/tickets/create/ui/CreateTicketContentScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,372:1\n113#2:373\n113#2:411\n113#2:413\n113#2:414\n113#2:416\n113#2:417\n113#2:418\n113#2:419\n113#2:424\n87#3:374\n84#3,9:375\n94#3:423\n80#4,6:384\n87#4,3:399\n90#4,2:408\n94#4:422\n391#5,9:390\n400#5:410\n401#5,2:420\n4360#6,6:402\n1863#7:412\n1864#7:415\n*S KotlinDebug\n*F\n+ 1 CreateTicketContentScreen.kt\nio/intercom/android/sdk/tickets/create/ui/CreateTicketContentScreenKt\n*L\n118#1:373\n121#1:411\n159#1:413\n160#1:414\n170#1:416\n199#1:417\n200#1:418\n214#1:419\n323#1:424\n113#1:374\n113#1:375,9\n113#1:423\n113#1:384,6\n113#1:399,3\n113#1:408,2\n113#1:422\n113#1:390,9\n113#1:410\n113#1:420,2\n113#1:402,6\n122#1:412\n122#1:415\n*E\n"})
public final class CreateTicketContentScreenKt {

    @NotNull
    private static final List<QuestionState> questions;

    @NotNull
    private static final SurveyUiColors surveyUiColors;

    static {
        q0.a aVar = q0.f38131b;
        SurveyUiColors surveyUiColors2 = new SurveyUiColors(aVar.a(), aVar.w(), aVar.y(), aVar.c(), null, 16, null);
        surveyUiColors = surveyUiColors2;
        List listListOf = CollectionsKt.listOf(new Block.Builder().withText("Email").withType("paragraph"));
        SurveyData.Step.Question.QuestionValidation.ValidationType validationType = SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL;
        questions = CollectionsKt.listOf((Object[]) new QuestionState[]{new QuestionState(new SurveyData.Step.Question.ShortTextQuestionModel("1", listListOf, false, "abc@example.com", validationType, null, false, null, null, 448, null), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.LongTextQuestionModel("2", CollectionsKt.listOf(new Block.Builder().withText("Multiline text").withType("paragraph")), true, "Enter text here...", validationType, null, androidx.compose.ui.unit.h.r(120), 0, null, a5.S0, null), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DropDownQuestionModel(androidx.exifinterface.media.a.f51345a5, CollectionsKt.listOf(new Block.Builder().withText("List attribute").withType("paragraph")), true, CollectionsKt.listOf((Object[]) new String[]{"Option A", "Option B", "Option C"}), "Please select...", null, 32, null), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.SingleChoiceQuestionModel("4", CollectionsKt.listOf(new Block.Builder().withText("Boolean").withType("paragraph")), false, CollectionsKt.listOf((Object[]) new String[]{"True", "False"}), false), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DatePickerQuestionModel("5", CollectionsKt.listOf(new Block.Builder().withText("Date and Time").withType("paragraph")), true), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DatePickerQuestionModel("5", CollectionsKt.listOf(new Block.Builder().withText("Date and Time").withType("paragraph")), true), surveyUiColors2)});
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void CreateTicketContentErrorScreenPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1908579859);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 6 & 7;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m554getLambda5$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTicketContentScreenKt.CreateTicketContentErrorScreenPreview$lambda$8(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketContentErrorScreenPreview$lambda$8(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        CreateTicketContentErrorScreenPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void CreateTicketContentScreen(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final CreateTicketViewModel.CreateTicketFormUiState.Content state, @NotNull final Function0<Unit> onCreateTicket, @NotNull final Function0<Unit> onCancel, @NotNull final Function1<? super String, Unit> function1, @NotNull final Function1<? super AnswerClickData, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        SurveyUiColors surveyUiColors2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onCreateTicket, "onCreateTicket");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Function1<? super String, Unit> onAnswerUpdated = function1;
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "onAnswerUpdated");
        Function1<? super AnswerClickData, Unit> onAnswerClick = function2;
        Intrinsics.checkNotNullParameter(onAnswerClick, "onAnswerClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-296750187);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        int i12 = 0;
        int i13 = 16;
        float f10 = 16;
        androidx.compose.ui.a0 a0VarT = d5.t(androidx.compose.foundation.v.d(q4.m(i6.f(a0Var2, 0.0f, 1, null), q4.f(0, c0VarR, 0, 1), true, null, false, 12, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), androidx.compose.ui.unit.h.r(f10), 0.0f, 2, null);
        a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarT);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A);
        } else {
            c0VarR.l();
        }
        androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarB, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        n0 n0Var = n0.f16227a;
        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f10)), c0VarR, 6);
        c0VarR.E(-210345224);
        for (final QuestionState questionState : state.getQuestions()) {
            if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                c0VarR.E(-267718574);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i14 = IntercomTheme.$stable;
                surveyUiColors2 = new SurveyUiColors(intercomTheme.getColors(c0VarR, i14).m690getBackground0d7_KjU(), intercomTheme.getColors(c0VarR, i14).m714getPrimaryText0d7_KjU(), intercomTheme.getColors(c0VarR, i14).m684getAction0d7_KjU(), intercomTheme.getColors(c0VarR, i14).m708getOnAction0d7_KjU(), null, 16, null);
                c0VarR.A();
            } else {
                c0VarR.E(-267313094);
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i15 = IntercomTheme.$stable;
                surveyUiColors2 = new SurveyUiColors(intercomTheme2.getColors(c0VarR, i15).m690getBackground0d7_KjU(), intercomTheme2.getColors(c0VarR, i15).m714getPrimaryText0d7_KjU(), intercomTheme2.getColors(c0VarR, i15).m690getBackground0d7_KjU(), intercomTheme2.getColors(c0VarR, i15).m714getPrimaryText0d7_KjU(), q0.n(intercomTheme2.getColors(c0VarR, i15).m684getAction0d7_KjU()), null);
                c0VarR.A();
            }
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            androidx.compose.runtime.c0 c0Var2 = c0VarR;
            QuestionComponentKt.m469QuestionComponentlzVJ5Jw(androidx.compose.ui.focus.d.a(aVar2, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$3$lambda$2$lambda$1(questionState, (p0) obj);
                }
            }), d5.v(aVar2, 0.0f, androidx.compose.ui.unit.h.r(24), 0.0f, 0.0f, 13, null), questionState, surveyUiColors2, onAnswerUpdated, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), androidx.compose.ui.unit.h.r(i12), v0.f41742b.o(), androidx.compose.ui.unit.a0.m(i13), onAnswerClick, c0Var2, (i10 & 57344) | 114819632 | ((i10 << 12) & 1879048192), 0);
            onAnswerUpdated = function1;
            onAnswerClick = function2;
            i12 = i12;
            c0VarR = c0Var2;
            i13 = i13;
            f10 = f10;
            a0Var2 = a0Var2;
        }
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        int i16 = i12;
        float f11 = f10;
        c0VarR.A();
        l6.a(m0.o(n0Var, a0Var3, 1.0f, false, 2, null), c0VarR, i16);
        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
        IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(onCreateTicket, d5.v(i6.h(aVar3, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(24), 0.0f, 0.0f, 13, null), (!state.getEnableCta() || state.getShowCreatingTicketProgress()) ? i16 : 1, androidx.compose.runtime.internal.w.e(-964987781, true, new pj.n<x5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                invoke(x5Var, c0Var3, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(x5 LegacyIntercomPrimaryButton, androidx.compose.runtime.c0 c0Var3, int i17) {
                Intrinsics.checkNotNullParameter(LegacyIntercomPrimaryButton, "$this$LegacyIntercomPrimaryButton");
                if ((i17 & 81) == 16 && c0Var3.d()) {
                    c0Var3.u();
                    return;
                }
                if (state.getShowCreatingTicketProgress()) {
                    c0Var3.E(-265539615);
                    os.F(i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(24)), 0L, androidx.compose.ui.unit.h.r(2), 0L, 0, 0.0f, c0Var3, 390, 58);
                    c0Var3.A();
                    return;
                }
                c0Var3.E(-265348128);
                androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var3, 48);
                int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                b1 b1VarK2 = c0Var3.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var3, aVar4);
                androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A2 = aVar5.a();
                if (c0Var3.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var3.q();
                if (c0Var3.P()) {
                    c0Var3.q0(function0A2);
                } else {
                    c0Var3.l();
                }
                androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var3);
                y7.n(c0VarD2, a1VarE, aVar5.e());
                y7.n(c0VarD2, b1VarK2, aVar5.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar5.b();
                if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN2, aVar5.f());
                y5 y5Var = y5.f16577a;
                String strD = u0.i.d(R.string.intercom_tickets_create_ticket, c0Var3, 0);
                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                int i18 = IntercomTheme.$stable;
                q50.t(strD, null, intercomTheme3.getColors(c0Var3, i18).m708getOnAction0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c0Var3, i18).getType04(), c0Var3, 0, 0, 131066);
                l6.a(i6.B(aVar4, androidx.compose.ui.unit.h.r(6)), c0Var3, 6);
                ni.o(u0.e.c(R.drawable.intercom_ticket_detail_icon, c0Var3, 0), null, i6.w(aVar4, androidx.compose.ui.unit.h.r(16)), intercomTheme3.getColors(c0Var3, i18).m708getOnAction0d7_KjU(), c0Var3, 440, 0);
                c0Var3.o();
                c0Var3.A();
            }
        }, c0VarR, 54), c0VarR, ((i10 >> 6) & 14) | 3120, 0);
        androidx.compose.ui.a0 a0VarI = i6.i(d5.v(i6.h(aVar3, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(8), 0.0f, androidx.compose.ui.unit.h.r(f11), 5, null), androidx.compose.ui.unit.h.r(48));
        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
        int i17 = IntercomTheme.$stable;
        androidx.compose.runtime.c0 c0Var3 = c0VarR;
        a4.p(onCancel, a0VarI, false, intercomTheme3.getShapes(c0VarR, i17).m(), s3.f32666a.G(0L, intercomTheme3.getColors(c0VarR, i17).m714getPrimaryText0d7_KjU(), 0L, 0L, c0Var3, s3.f32683r << 12, 13), null, null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m550getLambda1$intercom_sdk_base_release(), c0Var3, ((i10 >> 9) & 14) | 805306416, 484);
        l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f11)), c0Var3, 6);
        c0Var3.o();
        s5 s5VarT = c0Var3.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$4(a0Var3, state, onCreateTicket, onCancel, function1, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketContentScreen$lambda$3$lambda$2$lambda$1(QuestionState questionState, p0 it) {
        Intrinsics.checkNotNullParameter(questionState, "$questionState");
        Intrinsics.checkNotNullParameter(it, "it");
        if ((questionState.getQuestionModel() instanceof SurveyData.Step.Question.ShortTextQuestionModel) && !(questionState.getAnswer() instanceof Answer.NoAnswer.InitialNoAnswer) && !it.n()) {
            questionState.validate();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketContentScreen$lambda$4(androidx.compose.ui.a0 a0Var, CreateTicketViewModel.CreateTicketFormUiState.Content state, Function0 onCreateTicket, Function0 onCancel, Function1 onAnswerUpdated, Function1 onAnswerClick, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onCreateTicket, "$onCreateTicket");
        Intrinsics.checkNotNullParameter(onCancel, "$onCancel");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "$onAnswerUpdated");
        Intrinsics.checkNotNullParameter(onAnswerClick, "$onAnswerClick");
        CreateTicketContentScreen(a0Var, state, onCreateTicket, onCancel, onAnswerUpdated, onAnswerClick, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void CreateTicketContentScreenPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1070922859);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 5 & 7;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m551getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTicketContentScreenKt.CreateTicketContentScreenPreview$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketContentScreenPreview$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        CreateTicketContentScreenPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void CreateTicketErrorPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-627794766);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m553getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTicketContentScreenKt.CreateTicketErrorPreview$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketErrorPreview$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        CreateTicketErrorPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void CreateTicketLoadingPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1078617214);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m552getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTicketContentScreenKt.CreateTicketLoadingPreview$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketLoadingPreview$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        CreateTicketLoadingPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void CreateTicketScreen(@NotNull final CreateTicketViewModel.CreateTicketFormUiState uiState, @NotNull final Function0<Unit> onBackClick, @NotNull final Function0<Unit> onCreateTicket, @NotNull final Function0<Unit> onCancel, @NotNull final Function1<? super String, Unit> onAnswerUpdated, @NotNull final Function1<? super AnswerClickData, Unit> onAnswerClick, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0Var2;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onCreateTicket, "onCreateTicket");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "onAnswerUpdated");
        Intrinsics.checkNotNullParameter(onAnswerClick, "onAnswerClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2129527205);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(uiState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i11 |= c0VarR.k0(onBackClick) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c0VarR.k0(onCreateTicket) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c0VarR.k0(onCancel) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= c0VarR.k0(onAnswerUpdated) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= c0VarR.k0(onAnswerClick) ? 131072 : 65536;
        }
        if ((i11 & 374491) == 74898 && c0VarR.d()) {
            c0VarR.u();
            c0Var2 = c0VarR;
        } else {
            c0Var2 = c0VarR;
            pt.f(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), androidx.compose.runtime.internal.w.e(-2106967777, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt.CreateTicketScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var3, int i12) {
                    if ((i12 & 11) == 2 && c0Var3.d()) {
                        c0Var3.u();
                    } else {
                        CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState = uiState;
                        TopActionBarKt.m172TopActionBarNpQZenA(null, createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Content ? ((CreateTicketViewModel.CreateTicketFormUiState.Content) createTicketFormUiState).getTitle() : "", null, null, null, onBackClick, null, false, 0L, 0L, 0L, null, null, c0Var3, 0, 0, 8157);
                    }
                }
            }, c0VarR, 54), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(426563690, true, new pj.n<g5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt.CreateTicketScreen.2
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                    invoke(g5Var, c0Var3, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(g5 contentPadding, androidx.compose.runtime.c0 c0Var3, int i12) {
                    Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                    if ((i12 & 14) == 0) {
                        i12 |= c0Var3.D(contentPadding) ? 4 : 2;
                    }
                    if ((i12 & 91) == 18 && c0Var3.d()) {
                        c0Var3.u();
                        return;
                    }
                    CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState = uiState;
                    if (Intrinsics.areEqual(createTicketFormUiState, CreateTicketViewModel.CreateTicketFormUiState.Initial.INSTANCE)) {
                        c0Var3.E(-1277613046);
                        c0Var3.A();
                        return;
                    }
                    if (createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Content) {
                        c0Var3.E(-1277572622);
                        CreateTicketContentScreenKt.CreateTicketContentScreen(d5.p(androidx.compose.ui.a0.E, contentPadding), (CreateTicketViewModel.CreateTicketFormUiState.Content) uiState, onCreateTicket, onCancel, onAnswerUpdated, onAnswerClick, c0Var3, 64, 0);
                        c0Var3.A();
                    } else if (createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Error) {
                        c0Var3.E(-1277133631);
                        IntercomErrorScreenKt.IntercomErrorScreen(((CreateTicketViewModel.CreateTicketFormUiState.Error) uiState).getErrorState(), d5.p(androidx.compose.ui.a0.E, contentPadding), c0Var3, 0, 0);
                        c0Var3.A();
                    } else {
                        if (!Intrinsics.areEqual(createTicketFormUiState, CreateTicketViewModel.CreateTicketFormUiState.Loading.INSTANCE)) {
                            c0Var3.E(97332199);
                            c0Var3.A();
                            throw new k0();
                        }
                        c0Var3.E(97356214);
                        LoadingScreenKt.LoadingScreen(d5.p(androidx.compose.ui.a0.E, contentPadding), R.drawable.intercom_content_loading, c0Var3, 0, 0);
                        c0Var3.A();
                    }
                }
            }, c0VarR, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateTicketContentScreenKt.CreateTicketScreen$lambda$0(uiState, onBackClick, onCreateTicket, onCancel, onAnswerUpdated, onAnswerClick, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketScreen$lambda$0(CreateTicketViewModel.CreateTicketFormUiState uiState, Function0 onBackClick, Function0 onCreateTicket, Function0 onCancel, Function1 onAnswerUpdated, Function1 onAnswerClick, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        Intrinsics.checkNotNullParameter(onBackClick, "$onBackClick");
        Intrinsics.checkNotNullParameter(onCreateTicket, "$onCreateTicket");
        Intrinsics.checkNotNullParameter(onCancel, "$onCancel");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "$onAnswerUpdated");
        Intrinsics.checkNotNullParameter(onAnswerClick, "$onAnswerClick");
        CreateTicketScreen(uiState, onBackClick, onCreateTicket, onCancel, onAnswerUpdated, onAnswerClick, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
