package io.intercom.android.sdk.survey.ui.questiontype.choice;

import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.text.font.v0;
import com.facebook.internal.z0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSingleChoiceQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleChoiceQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/choice/SingleChoiceQuestionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,145:1\n75#2:146\n70#3:147\n67#3,9:148\n77#3:253\n80#4,6:157\n87#4,3:172\n90#4,2:181\n80#4,6:201\n87#4,3:216\n90#4,2:225\n94#4:248\n94#4:252\n391#5,9:163\n400#5:183\n391#5,9:207\n400#5:227\n401#5,2:246\n401#5,2:250\n4360#6,6:175\n4360#6,6:219\n1282#7,6:184\n1282#7,6:234\n1282#7,6:240\n87#8:190\n83#8,10:191\n94#8:249\n1863#9:228\n1864#9:231\n113#10:229\n113#10:230\n113#10:232\n113#10:233\n*S KotlinDebug\n*F\n+ 1 SingleChoiceQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/choice/SingleChoiceQuestionKt\n*L\n42#1:146\n43#1:147\n43#1:148,9\n43#1:253\n43#1:157,6\n43#1:172,3\n43#1:181,2\n45#1:201,6\n45#1:216,3\n45#1:225,2\n45#1:248\n43#1:252\n43#1:163,9\n43#1:183\n45#1:207,9\n45#1:227\n45#1:246,2\n43#1:250,2\n43#1:175,6\n45#1:219,6\n44#1:184,6\n88#1:234,6\n92#1:240,6\n45#1:190\n45#1:191,10\n45#1:249\n47#1:228\n47#1:231\n48#1:229\n54#1:230\n75#1:232\n81#1:233\n*E\n"})
public final class SingleChoiceQuestionKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt$SingleChoiceQuestionPreview$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ SurveyUiColors $surveyUiColors;

        AnonymousClass1(SurveyUiColors surveyUiColors) {
            this.$surveyUiColors = surveyUiColors;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$0(Answer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            SingleChoiceQuestionKt.SingleChoiceQuestion(null, new SurveyData.Step.Question.SingleChoiceQuestionModel(string, CollectionsKt.listOf(new Block.Builder().withText("Question title")), true, CollectionsKt.listOf((Object[]) new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}), false), new Answer.SingleAnswer("Option 2"), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SingleChoiceQuestionKt.AnonymousClass1.invoke$lambda$0((Answer) obj);
                }
            }, this.$surveyUiColors, null, c0Var, 3136, 33);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SingleChoiceQuestion(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final SurveyData.Step.Question.SingleChoiceQuestionModel singleChoiceQuestionModel, @Nullable Answer answer, @NotNull final Function1<? super Answer, Unit> onAnswer, @NotNull final SurveyUiColors colors, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0Var2;
        Intrinsics.checkNotNullParameter(singleChoiceQuestionModel, "singleChoiceQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Intrinsics.checkNotNullParameter(colors, "colors");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-538592394);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        final Answer answer2 = (i11 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2M488getLambda1$intercom_sdk_base_release = (i11 & 32) != 0 ? ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m488getLambda1$intercom_sdk_base_release() : function2;
        final androidx.compose.ui.focus.q qVar = (androidx.compose.ui.focus.q) c0VarR.W(q1.n());
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var2);
        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        y7.n(c0VarD, a1VarK, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        d0 d0Var = d0.f15956a;
        c0VarR.E(924114601);
        Object objI0 = c0VarR.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = d7.g(Boolean.FALSE, null, 2, null);
            c0VarR.Y(objI0);
        }
        final n3 n3Var = (n3) objI0;
        c0VarR.A();
        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
        a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK2 = c0VarR.k();
        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar3);
        Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A2);
        } else {
            c0VarR.l();
        }
        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0VarR);
        y7.n(c0VarD2, a1VarB, aVar2.e());
        y7.n(c0VarD2, b1VarK2, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar2.f());
        n0 n0Var = n0.f16227a;
        function2M488getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i10 >> 15) & 14));
        c0VarR.E(891864023);
        for (final String str : singleChoiceQuestionModel.getOptions()) {
            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            boolean z10 = (answer2 instanceof Answer.SingleAnswer) && Intrinsics.areEqual(((Answer.SingleAnswer) answer2).getAnswer(), str);
            c0VarR.E(891870284);
            long jM732getAccessibleColorOnWhiteBackground8_81llA = z10 ? ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU();
            c0VarR.A();
            long jW = q0.w(IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            float fR = androidx.compose.ui.unit.h.r(1);
            v0.a aVar4 = v0.f41742b;
            androidx.compose.runtime.c0 c0Var3 = c0VarR;
            ChoicePillKt.m481ChoicePillUdaoDFU(z10, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1(qVar, n3Var, onAnswer, str, (String) obj);
                }
            }, getTranslatedOption(str, c0VarR, 0), jW, fR, jM732getAccessibleColorOnWhiteBackground8_81llA, z10 ? aVar4.c() : aVar4.m(), q0.w(ColorExtensionsKt.m729generateTextColor8_81llA(jM732getAccessibleColorOnWhiteBackground8_81llA), DatePickerQuestionKt.contentAlpha(z10, c0VarR, 0), 0.0f, 0.0f, 0.0f, 14, null), c0Var3, 24576, 0);
            c0VarR = c0Var3;
        }
        androidx.compose.runtime.c0 c0Var4 = c0VarR;
        c0Var4.A();
        c0Var4.E(891905968);
        if (singleChoiceQuestionModel.getIncludeOther()) {
            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0Var4, 6);
            boolean zBooleanValue = ((Boolean) n3Var.getValue()).booleanValue();
            c0Var4.E(891911980);
            long jM732getAccessibleColorOnWhiteBackground8_81llA2 = zBooleanValue ? ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(c0Var4, IntercomTheme.$stable).m690getBackground0d7_KjU();
            c0Var4.A();
            long jM730getAccessibleBorderColor8_81llA = ColorExtensionsKt.m730getAccessibleBorderColor8_81llA(jM732getAccessibleColorOnWhiteBackground8_81llA2);
            float fR2 = androidx.compose.ui.unit.h.r(zBooleanValue ? 2 : 1);
            v0.a aVar5 = v0.f41742b;
            v0 v0VarC = zBooleanValue ? aVar5.c() : aVar5.m();
            String answer3 = answer2 instanceof Answer.SingleAnswer ? ((Answer.SingleAnswer) answer2).getAnswer() : "";
            c0Var4.E(891929809);
            int i12 = (i10 & 7168) ^ 3072;
            boolean z11 = (i12 > 2048 && c0Var4.D(onAnswer)) || (i10 & 3072) == 2048;
            Object objI1 = c0Var4.i0();
            if (z11 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(onAnswer, n3Var);
                    }
                };
                c0Var4.Y(objI1);
            }
            Function0 function0 = (Function0) objI1;
            c0Var4.A();
            c0Var4.E(891936400);
            boolean z12 = (i12 > 2048 && c0Var4.D(onAnswer)) || (i10 & 3072) == 2048;
            Object objI2 = c0Var4.i0();
            if (z12 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(onAnswer, (String) obj);
                    }
                };
                c0Var4.Y(objI2);
            }
            c0Var4.A();
            c0Var2 = c0Var4;
            OtherOptionKt.m489OtherOptionYCJL08c(zBooleanValue, colors, answer3, function0, (Function1) objI2, jM730getAccessibleBorderColor8_81llA, fR2, jM732getAccessibleColorOnWhiteBackground8_81llA2, v0VarC, 0L, c0Var2, (i10 >> 9) & com.planner5d.library.engine.input.f.b.B, 512);
        } else {
            c0Var2 = c0Var4;
        }
        c0Var2.A();
        c0Var2.o();
        c0Var2.o();
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9(a0Var3, singleChoiceQuestionModel, answer2, onAnswer, colors, function2M488getLambda1$intercom_sdk_base_release, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1(androidx.compose.ui.focus.q focusManager, n3 otherOptionSelectionState, Function1 onAnswer, String unparsedOption, String it) {
        Intrinsics.checkNotNullParameter(focusManager, "$focusManager");
        Intrinsics.checkNotNullParameter(otherOptionSelectionState, "$otherOptionSelectionState");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(unparsedOption, "$unparsedOption");
        Intrinsics.checkNotNullParameter(it, "it");
        androidx.compose.ui.focus.q.o(focusManager, false, 1, null);
        otherOptionSelectionState.setValue(Boolean.FALSE);
        onAnswer.invoke(new Answer.SingleAnswer(unparsedOption));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(Function1 onAnswer, n3 otherOptionSelectionState) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(otherOptionSelectionState, "$otherOptionSelectionState");
        onAnswer.invoke(Answer.NoAnswer.ResetNoAnswer.INSTANCE);
        otherOptionSelectionState.setValue(Boolean.valueOf(!((Boolean) otherOptionSelectionState.getValue()).booleanValue()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(Function1 onAnswer, String it) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(it, "it");
        onAnswer.invoke(new Answer.SingleAnswer(it));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestion$lambda$9(androidx.compose.ui.a0 a0Var, SurveyData.Step.Question.SingleChoiceQuestionModel singleChoiceQuestionModel, Answer answer, Function1 onAnswer, SurveyUiColors colors, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(singleChoiceQuestionModel, "$singleChoiceQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(colors, "$colors");
        SingleChoiceQuestion(a0Var, singleChoiceQuestionModel, answer, onAnswer, colors, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SingleChoiceQuestionPreview(@NotNull final SurveyUiColors surveyUiColors, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1547860655);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(surveyUiColors) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(1452787289, true, new AnonymousClass1(surveyUiColors), c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SingleChoiceQuestionKt.SingleChoiceQuestionPreview$lambda$12(surveyUiColors, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestionPreview$lambda$12(SurveyUiColors surveyUiColors, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(surveyUiColors, "$surveyUiColors");
        SingleChoiceQuestionPreview(surveyUiColors, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(name = "Dark button color", showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SingleChoiceQuestionPreviewDark(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(567326043);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            SingleChoiceQuestionPreview(SurveyUiColors.m415copyqa9m3tE$default(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), 0L, 0L, q0.f38131b.c(), 0L, null, 27, null), c0VarR, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SingleChoiceQuestionKt.SingleChoiceQuestionPreviewDark$lambda$11(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestionPreviewDark$lambda$11(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SingleChoiceQuestionPreviewDark(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(name = "Light button color", showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SingleChoiceQuestionPreviewLight(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1626655857);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            SingleChoiceQuestionPreview(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), c0VarR, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SingleChoiceQuestionKt.SingleChoiceQuestionPreviewLight$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestionPreviewLight$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SingleChoiceQuestionPreviewLight(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    private static final String getTranslatedOption(String str, androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.E(-1189227411);
        if (Intrinsics.areEqual(str, z0.P)) {
            c0Var.E(-1210053749);
            str = u0.i.d(R.string.intercom_attribute_collector_positive, c0Var, 0);
            c0Var.A();
        } else if (Intrinsics.areEqual(str, "false")) {
            c0Var.E(-1210051093);
            str = u0.i.d(R.string.intercom_attribute_collector_negative, c0Var, 0);
            c0Var.A();
        } else {
            c0Var.E(-1210048586);
            c0Var.A();
        }
        c0Var.A();
        return str;
    }
}
