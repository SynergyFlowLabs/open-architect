package io.intercom.android.sdk.survey.ui.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.text.y3;
import androidx.compose.material3.d4;
import androidx.compose.material3.e4;
import androidx.compose.material3.f4;
import androidx.compose.material3.m4;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.platform.z3;
import androidx.compose.ui.text.font.v0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nQuestionComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuestionComponent.kt\nio/intercom/android/sdk/survey/ui/components/QuestionComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,204:1\n113#2:205\n113#2:206\n75#3:207\n75#3:208\n*S KotlinDebug\n*F\n+ 1 QuestionComponent.kt\nio/intercom/android/sdk/survey/ui/components/QuestionComponentKt\n*L\n49#1:205\n54#1:206\n68#1:207\n69#1:208\n*E\n"})
public final class QuestionComponentKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: QuestionComponent-lzVJ5Jw, reason: not valid java name */
    public static final void m469QuestionComponentlzVJ5Jw(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.a0 a0Var2, @NotNull final QuestionState questionState, @Nullable SurveyUiColors surveyUiColors, @NotNull final Function1<? super String, Unit> onAnswerUpdated, long j10, float f10, @Nullable v0 v0Var, long j11, @Nullable Function1<? super AnswerClickData, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final SurveyUiColors surveyUiColors2;
        int i12;
        long jM690getBackground0d7_KjU;
        Intrinsics.checkNotNullParameter(questionState, "questionState");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "onAnswerUpdated");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(435304450);
        androidx.compose.ui.a0 a0Var3 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        androidx.compose.ui.a0 a0VarR = (i11 & 2) != 0 ? d5.r(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)) : a0Var2;
        if ((i11 & 8) != 0) {
            surveyUiColors2 = questionState.getSurveyUiColors();
            i12 = i10 & (-7169);
        } else {
            surveyUiColors2 = surveyUiColors;
            i12 = i10;
        }
        if ((i11 & 32) != 0) {
            i12 &= -458753;
            jM690getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU();
        } else {
            jM690getBackground0d7_KjU = j10;
        }
        float fR = (i11 & 64) != 0 ? androidx.compose.ui.unit.h.r(1) : f10;
        final v0 v0VarM = (i11 & 128) != 0 ? v0.f41742b.m() : v0Var;
        long jM = (i11 & 256) != 0 ? androidx.compose.ui.unit.a0.m(16) : j11;
        Function1<? super AnswerClickData, Unit> function2 = (i11 & 512) != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$0((AnswerClickData) obj);
            }
        } : function1;
        int i13 = i12;
        final Function1 function3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$1(questionState, onAnswerUpdated, (Answer) obj);
            }
        };
        final z3 z3Var = (z3) c0VarR.W(q1.y());
        final androidx.compose.ui.focus.q qVar = (androidx.compose.ui.focus.q) c0VarR.W(q1.n());
        final Function1 function4 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$2(questionState, onAnswerUpdated, z3Var, qVar, (y3) obj);
            }
        };
        final Function1<? super AnswerClickData, Unit> function5 = function2;
        final long j12 = jM;
        final androidx.compose.ui.a0 a0Var4 = a0VarR;
        final androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(1322549775, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.runtime.c0 c0Var2, int i14) {
                if ((i14 & 11) == 2 && c0Var2.d()) {
                    c0Var2.u();
                    return;
                }
                List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                StringProvider description = questionState.getQuestionModel().getDescription();
                boolean zIsRequired = questionState.getQuestionModel().isRequired();
                ValidationError validationError = questionState.getValidationError();
                v0 v0Var2 = v0VarM;
                long j13 = j12;
                SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                QuestionHeaderComponentKt.m470QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, v0Var2, j13, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, c0Var2, (StringProvider.$stable << 3) | 8, 64);
            }
        }, c0VarR, 54);
        androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.relocation.d.b(a0Var3, questionState.getBringIntoViewRequester());
        e4 e4Var = e4.f27241a;
        int i14 = e4.f27242b;
        d4 d4VarB = e4Var.b(jM690getBackground0d7_KjU, 0L, 0L, 0L, c0VarR, ((i13 >> 15) & 14) | (i14 << 12), 14);
        final long j13 = jM690getBackground0d7_KjU;
        final float f11 = fR;
        f4 f4VarC = e4Var.c(f11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, ((i13 >> 18) & 14) | (i14 << 18), 62);
        androidx.compose.foundation.shape.e eVarM = IntercomTheme.INSTANCE.getShapes(c0VarR, IntercomTheme.$stable).m();
        final v0 v0Var2 = v0VarM;
        final androidx.compose.ui.a0 a0Var5 = a0Var3;
        pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = new pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(m0Var, c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.foundation.layout.m0 Card, androidx.compose.runtime.c0 c0Var2, int i15) {
                androidx.compose.runtime.c0 c0Var3 = c0Var2;
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                if ((i15 & 81) == 16 && c0Var3.d()) {
                    c0Var3.u();
                    return;
                }
                final QuestionState questionState2 = questionState;
                androidx.compose.ui.a0 a0Var6 = a0Var4;
                Function1<Answer, Unit> function6 = function3;
                SurveyUiColors surveyUiColors3 = surveyUiColors2;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function7 = cVarE;
                Function1<y3, Unit> function8 = function4;
                Function1<AnswerClickData, Unit> function9 = function5;
                final v0 v0Var3 = v0Var2;
                final long j14 = j12;
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var3, 0);
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                b1 b1VarK = c0Var3.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var3, aVar);
                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                if (c0Var3.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var3.q();
                if (c0Var3.P()) {
                    c0Var3.q0(function0A);
                } else {
                    c0Var3.l();
                }
                androidx.compose.runtime.c0 c0VarD = y7.d(c0Var3);
                y7.n(c0VarD, a1VarB, aVar2.e());
                y7.n(c0VarD, b1VarK, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar2.f());
                androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                    c0Var3.E(1477570659);
                    DropDownQuestionKt.DropDownQuestion(a0Var6, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), function6, surveyUiColors3, function7, c0Var3, 196672, 0);
                    c0Var3.A();
                } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                    c0Var3.E(1478010146);
                    ShortTextQuestionKt.ShortTextQuestion(a0Var6, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), function6, surveyUiColors3, questionState2.getValidationError(), function8, function7, c0Var3, 12582912, 0);
                    c0Var3 = c0Var3;
                    c0Var3.A();
                } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                    c0Var3.E(1478572579);
                    LongTextQuestionKt.LongTextQuestion(a0Var6, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), function6, surveyUiColors3, questionState2.getValidationError(), function8, function7, c0Var2, 12582912, 0);
                    c0Var3 = c0Var2;
                    c0Var3.A();
                } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                    c0Var3.E(1479135353);
                    NumericRatingQuestionKt.NumericRatingQuestion(a0Var6, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), function6, surveyUiColors3, function7, c0Var3, 196672, 0);
                    c0Var3.A();
                } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                    c0Var3.E(1479583675);
                    SingleChoiceQuestionKt.SingleChoiceQuestion(a0Var6, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), function6, surveyUiColors3, function7, c0Var3, 196672, 0);
                    c0Var3.A();
                } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                    c0Var3.E(1480032183);
                    MultipleChoiceQuestionKt.MultipleChoiceQuestion(a0Var6, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), function6, surveyUiColors3, function7, c0Var3, 196672, 0);
                    c0Var3.A();
                } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                    c0Var3.E(1480478490);
                    DatePickerQuestionKt.DatePickerQuestion(a0Var6, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), function6, function7, c0Var2, 24576, 0);
                    c0Var3 = c0Var2;
                    c0Var3.A();
                } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                    c0Var3.E(1480867695);
                    UploadFileQuestionKt.UploadFileQuestion(a0Var6, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), function6, function9, androidx.compose.runtime.internal.w.e(-1590070470, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var4, Integer num) {
                            invoke(c0Var4, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var4, int i16) {
                            if ((i16 & 11) == 2 && c0Var4.d()) {
                                c0Var4.u();
                                return;
                            }
                            UploadFileQuestionHeaderKt.m508UploadFileQuestionHeaderINMd_9Y(questionState2, v0Var3, j14, c0Var4, 8);
                        }
                    }, c0Var3, 54), c0Var3, 196672, 0);
                    c0Var3.A();
                } else if (Intrinsics.areEqual(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                    c0Var3.E(1481459516);
                    c0Var3.A();
                } else {
                    c0Var3.E(1481518571);
                    c0Var3.A();
                }
                c0Var3.o();
            }
        };
        final SurveyUiColors surveyUiColors3 = surveyUiColors2;
        m4.g(a0VarB, eVarM, d4VarB, f4VarC, null, androidx.compose.runtime.internal.w.e(2001737844, true, nVar, c0VarR, 54), c0VarR, androidx.profileinstaller.n.c.f73814m, 16);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3(a0Var5, a0Var4, questionState, surveyUiColors3, onAnswerUpdated, j13, f11, v0Var2, j12, function5, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionComponent_lzVJ5Jw$lambda$0(AnswerClickData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionComponent_lzVJ5Jw$lambda$1(QuestionState questionState, Function1 onAnswerUpdated, Answer it) {
        Intrinsics.checkNotNullParameter(questionState, "$questionState");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "$onAnswerUpdated");
        Intrinsics.checkNotNullParameter(it, "it");
        questionState.setAnswer(it);
        if (!(questionState.getQuestionModel() instanceof SurveyData.Step.Question.ShortTextQuestionModel) && !(questionState.getQuestionModel() instanceof SurveyData.Step.Question.LongTextQuestionModel)) {
            questionState.validate();
        }
        onAnswerUpdated.invoke(questionState.getQuestionModel().getId());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionComponent_lzVJ5Jw$lambda$2(QuestionState questionState, Function1 onAnswerUpdated, z3 z3Var, androidx.compose.ui.focus.q focusManager, y3 y3Var) {
        Intrinsics.checkNotNullParameter(questionState, "$questionState");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "$onAnswerUpdated");
        Intrinsics.checkNotNullParameter(focusManager, "$focusManager");
        Intrinsics.checkNotNullParameter(y3Var, "<this>");
        questionState.validate();
        onAnswerUpdated.invoke(questionState.getQuestionModel().getId());
        if (questionState.getValidationError() instanceof ValidationError.NoValidationError) {
            if (z3Var != null) {
                z3Var.b();
            }
            androidx.compose.ui.focus.q.o(focusManager, false, 1, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionComponent_lzVJ5Jw$lambda$3(androidx.compose.ui.a0 a0Var, androidx.compose.ui.a0 a0Var2, QuestionState questionState, SurveyUiColors surveyUiColors, Function1 onAnswerUpdated, long j10, float f10, v0 v0Var, long j11, Function1 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(questionState, "$questionState");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "$onAnswerUpdated");
        m469QuestionComponentlzVJ5Jw(a0Var, a0Var2, questionState, surveyUiColors, onAnswerUpdated, j10, f10, v0Var, j11, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
