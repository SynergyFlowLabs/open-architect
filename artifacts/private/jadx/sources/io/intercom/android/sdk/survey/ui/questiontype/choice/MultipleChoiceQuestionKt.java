package io.intercom.android.sdk.survey.ui.questiontype.choice;

import android.content.Context;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.v0;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nMultipleChoiceQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipleChoiceQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/choice/MultipleChoiceQuestionKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,189:1\n70#2:190\n67#2,9:191\n77#2:299\n80#3,6:200\n87#3,3:215\n90#3,2:224\n80#3,6:238\n87#3,3:253\n90#3,2:262\n94#3:294\n94#3:298\n391#4,9:206\n400#4:226\n391#4,9:244\n400#4:264\n401#4,2:292\n401#4,2:296\n4360#5,6:218\n4360#5,6:256\n87#6:227\n83#6,10:228\n94#6:295\n1863#7:265\n1864#7:274\n113#8:266\n113#8:267\n113#8:275\n113#8:276\n113#8:290\n113#8:291\n1282#9,6:268\n1282#9,6:277\n1282#9,6:283\n75#10:289\n*S KotlinDebug\n*F\n+ 1 MultipleChoiceQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/choice/MultipleChoiceQuestionKt\n*L\n41#1:190\n41#1:191,9\n41#1:299\n41#1:200,6\n41#1:215,3\n41#1:224,2\n42#1:238,6\n42#1:253,3\n42#1:262,2\n42#1:294\n41#1:298\n41#1:206,9\n41#1:226\n42#1:244,9\n42#1:264\n42#1:292,2\n41#1:296,2\n41#1:218,6\n42#1:256,6\n42#1:227\n42#1:228,10\n42#1:295\n44#1:265\n44#1:274\n50#1:266\n55#1:267\n97#1:275\n101#1:276\n132#1:290\n140#1:291\n65#1:268,6\n108#1:277,6\n115#1:283,6\n127#1:289\n*E\n"})
public final class MultipleChoiceQuestionKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt$PreviewQuestion$1, reason: invalid class name */
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
            MultipleChoiceQuestionKt.MultipleChoiceQuestion(null, new SurveyData.Step.Question.MultipleChoiceQuestionModel(string, CollectionsKt.listOf(new Block.Builder().withText("Question Title")), true, CollectionsKt.listOf((Object[]) new String[]{"Option A", "Option B", "Option C", "Option D", "Option E"}), true, 2, 3), new Answer.MultipleAnswer(SetsKt.setOf((Object[]) new String[]{"Option B", "Option D"}), Answer.MultipleAnswer.OtherAnswer.SelectedNoText.INSTANCE), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MultipleChoiceQuestionKt.AnonymousClass1.invoke$lambda$0((Answer) obj);
                }
            }, this.$surveyUiColors, null, c0Var, 3648, 33);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x031b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0360  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void MultipleChoiceQuestion(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final SurveyData.Step.Question.MultipleChoiceQuestionModel multipleChoiceQuestionModel, @Nullable Answer answer, @NotNull final Function1<? super Answer, Unit> onAnswer, @NotNull final SurveyUiColors colors, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.runtime.c0 c0Var2;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objI0;
        boolean z13;
        Object objI1;
        Intrinsics.checkNotNullParameter(multipleChoiceQuestionModel, "multipleChoiceQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Intrinsics.checkNotNullParameter(colors, "colors");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(928787358);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        final Answer answer2 = (i11 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2M486getLambda1$intercom_sdk_base_release = (i11 & 32) != 0 ? ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m486getLambda1$intercom_sdk_base_release() : function2;
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
        y7.n(c0VarD, a1VarK, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        d0 d0Var = d0.f15956a;
        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
        boolean z14 = false;
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
        function2M486getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i10 >> 15) & 14));
        c0VarR.E(1187769308);
        for (final String str : multipleChoiceQuestionModel.getOptions()) {
            boolean zContains = answer2 instanceof Answer.MultipleAnswer ? ((Answer.MultipleAnswer) answer2).m473getAnswers().contains(str) : false;
            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            c0VarR.E(1187778356);
            long jM732getAccessibleColorOnWhiteBackground8_81llA = zContains ? ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU();
            c0VarR.A();
            long jM730getAccessibleBorderColor8_81llA = ColorExtensionsKt.m730getAccessibleBorderColor8_81llA(jM732getAccessibleColorOnWhiteBackground8_81llA);
            float fR = androidx.compose.ui.unit.h.r(zContains ? 2 : 1);
            v0.a aVar4 = v0.f41742b;
            v0 v0VarC = zContains ? aVar4.c() : aVar4.m();
            c0VarR.E(-1655251098);
            androidx.compose.ui.a0 a0Var3 = a0Var2;
            boolean zD = ((((i10 & 896) ^ a5.S0) > 256 && c0VarR.D(answer2)) || (i10 & a5.S0) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && c0VarR.D(onAnswer)) || (i10 & 3072) == 2048) | c0VarR.D(str);
            Object objI2 = c0VarR.i0();
            if (zD || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer2, onAnswer, str, (String) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            c0VarR.A();
            androidx.compose.runtime.c0 c0Var3 = c0VarR;
            ChoicePillKt.m481ChoicePillUdaoDFU(zContains, (Function1) objI2, str, jM730getAccessibleBorderColor8_81llA, fR, jM732getAccessibleColorOnWhiteBackground8_81llA, v0VarC, 0L, c0Var3, 0, 128);
            a0Var2 = a0Var3;
            z14 = false;
            c0VarR = c0Var3;
        }
        final androidx.compose.ui.a0 a0Var4 = a0Var2;
        androidx.compose.runtime.c0 c0Var4 = c0VarR;
        boolean z15 = z14;
        c0Var4.A();
        c0Var4.E(1187812115);
        if (multipleChoiceQuestionModel.getIncludeOther()) {
            boolean z16 = answer2 instanceof Answer.MultipleAnswer;
            final boolean z17 = (!z16 || Intrinsics.areEqual(((Answer.MultipleAnswer) answer2).getOtherAnswer(), Answer.MultipleAnswer.OtherAnswer.NotSelected.INSTANCE)) ? z15 : true;
            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(8)), c0Var4, 6);
            c0Var4.E(1187840539);
            long jM732getAccessibleColorOnWhiteBackground8_81llA2 = z17 ? ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(c0Var4, IntercomTheme.$stable).m690getBackground0d7_KjU();
            c0Var4.A();
            long jM730getAccessibleBorderColor8_81llA2 = ColorExtensionsKt.m730getAccessibleBorderColor8_81llA(jM732getAccessibleColorOnWhiteBackground8_81llA2);
            float fR2 = z17 ? androidx.compose.ui.unit.h.r(2) : androidx.compose.ui.unit.h.r(1);
            v0.a aVar5 = v0.f41742b;
            v0 v0VarC2 = z17 ? aVar5.c() : aVar5.m();
            String string = z16 ? ((Answer.MultipleAnswer) answer2).getOtherAnswer().toString() : "";
            c0Var4.E(1187859972);
            boolean zG = c0Var4.G(z17);
            int i15 = (i10 & 896) ^ a5.S0;
            boolean z18 = zG | ((i15 > 256 && c0Var4.D(answer2)) || (i10 & a5.S0) == 256);
            int i16 = (i10 & 7168) ^ 3072;
            if (i16 <= 2048 || !c0Var4.D(onAnswer)) {
                z10 = z18;
                if ((i10 & 3072) != 2048) {
                    z11 = false;
                }
                z12 = z10 | z11;
                objI0 = c0Var4.i0();
                if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z17, answer2, onAnswer);
                        }
                    };
                    c0Var4.Y(objI0);
                }
                Function0 function0 = (Function0) objI0;
                c0Var4.A();
                c0Var4.E(1187870912);
                z13 = ((i16 <= 2048 && c0Var4.D(onAnswer)) || (i10 & 3072) == 2048) | ((i15 <= 256 && c0Var4.D(answer2)) || (i10 & a5.S0) == 256);
                objI1 = c0Var4.i0();
                if (z13 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer2, onAnswer, (String) obj);
                        }
                    };
                    c0Var4.Y(objI1);
                }
                c0Var4.A();
                i13 = 8;
                String str2 = string;
                i14 = 1;
                i12 = 6;
                OtherOptionKt.m489OtherOptionYCJL08c(z17, colors, str2, function0, (Function1) objI1, jM730getAccessibleBorderColor8_81llA2, fR2, jM732getAccessibleColorOnWhiteBackground8_81llA2, v0VarC2, 0L, c0Var4, (i10 >> 9) & com.planner5d.library.engine.input.f.b.B, 512);
                c0Var2 = c0Var4;
            } else {
                z10 = z18;
            }
            z11 = true;
            z12 = z10 | z11;
            objI0 = c0Var4.i0();
            if (z12) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z17, answer2, onAnswer);
                    }
                };
                c0Var4.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z17, answer2, onAnswer);
                    }
                };
                c0Var4.Y(objI0);
            }
            Function0 function1 = (Function0) objI0;
            c0Var4.A();
            c0Var4.E(1187870912);
            if (i15 <= 256) {
            }
            z13 = ((i16 <= 2048 && c0Var4.D(onAnswer)) || (i10 & 3072) == 2048) | ((i15 <= 256 && c0Var4.D(answer2)) || (i10 & a5.S0) == 256);
            objI1 = c0Var4.i0();
            if (z13) {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer2, onAnswer, (String) obj);
                    }
                };
                c0Var4.Y(objI1);
            } else {
                objI1 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer2, onAnswer, (String) obj);
                    }
                };
                c0Var4.Y(objI1);
            }
            c0Var4.A();
            i13 = 8;
            String str3 = string;
            i14 = 1;
            i12 = 6;
            OtherOptionKt.m489OtherOptionYCJL08c(z17, colors, str3, function1, (Function1) objI1, jM730getAccessibleBorderColor8_81llA2, fR2, jM732getAccessibleColorOnWhiteBackground8_81llA2, v0VarC2, 0L, c0Var4, (i10 >> 9) & com.planner5d.library.engine.input.f.b.B, 512);
            c0Var2 = c0Var4;
        } else {
            c0Var2 = c0Var4;
            i12 = 6;
            i13 = 8;
            i14 = 1;
        }
        c0Var2.A();
        c0Var2.E(1187882858);
        if (multipleChoiceQuestionModel.getMinSelection() > i14) {
            Phrase phraseFrom = Phrase.from((Context) c0Var2.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_surveys_multi_select_too_few_responses);
            phraseFrom.put("response_count", multipleChoiceQuestionModel.getMinSelection());
            androidx.compose.runtime.c0 c0Var5 = c0Var2;
            q50.t(phraseFrom.format().toString(), d5.v(androidx.compose.ui.a0.E, 0.0f, androidx.compose.ui.unit.h.r(i13), 0.0f, 0.0f, 13, null), q0.f38131b.i(), null, androidx.compose.ui.unit.a0.m(11), null, v0.f41742b.m(), null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType05(), c0Var5, 1597872, 0, 130984);
            c0Var2 = c0Var5;
        }
        c0Var2.A();
        l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(i13)), c0Var2, i12);
        c0Var2.o();
        c0Var2.o();
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(a0Var4, multipleChoiceQuestionModel, answer2, onAnswer, colors, function2M486getLambda1$intercom_sdk_base_release, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(Answer answer, Function1 onAnswer, String option, String it) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(option, "$option");
        Intrinsics.checkNotNullParameter(it, "it");
        if (answer instanceof Answer.MultipleAnswer) {
            onAnswer.invoke(((Answer.MultipleAnswer) answer).copyWithAnswerToggled(option));
        } else {
            onAnswer.invoke(new Answer.MultipleAnswer(SetsKt.setOf(option), null, 2, null));
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(boolean z10, Answer answer, Function1 onAnswer) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        if (z10) {
            MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, onAnswer, Answer.MultipleAnswer.OtherAnswer.NotSelected.INSTANCE);
        } else {
            MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, onAnswer, Answer.MultipleAnswer.OtherAnswer.SelectedNoText.INSTANCE);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(Answer answer, Function1 onAnswer, String it) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(it, "it");
        MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, onAnswer, new Answer.MultipleAnswer.OtherAnswer.SelectedWithText(it));
        return Unit.f312394a;
    }

    private static final void MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(Answer answer, Function1<? super Answer, Unit> function1, Answer.MultipleAnswer.OtherAnswer otherAnswer) {
        if (answer instanceof Answer.MultipleAnswer) {
            function1.invoke(((Answer.MultipleAnswer) answer).copyWithOther(otherAnswer));
        } else {
            function1.invoke(new Answer.MultipleAnswer(SetsKt.emptySet(), otherAnswer));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleChoiceQuestion$lambda$9(androidx.compose.ui.a0 a0Var, SurveyData.Step.Question.MultipleChoiceQuestionModel multipleChoiceQuestionModel, Answer answer, Function1 onAnswer, SurveyUiColors colors, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(multipleChoiceQuestionModel, "$multipleChoiceQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(colors, "$colors");
        MultipleChoiceQuestion(a0Var, multipleChoiceQuestionModel, answer, onAnswer, colors, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(name = "Multiple choice question", showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void MultipleChoiceQuestionPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1537454351);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            PreviewQuestion(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), c0VarR, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultipleChoiceQuestionKt.MultipleChoiceQuestionPreview$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleChoiceQuestionPreview$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        MultipleChoiceQuestionPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(name = "Multiple choice question dark", showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void MultipleChoiceQuestionPreviewDark(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(756027931);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            PreviewQuestion(SurveyUiColors.m415copyqa9m3tE$default(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), 0L, 0L, q0.f38131b.c(), 0L, null, 27, null), c0VarR, 0);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultipleChoiceQuestionKt.MultipleChoiceQuestionPreviewDark$lambda$11(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleChoiceQuestionPreviewDark$lambda$11(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        MultipleChoiceQuestionPreviewDark(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PreviewQuestion(@NotNull final SurveyUiColors surveyUiColors, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1753720526);
        if ((i10 & 14) == 0) {
            if (c0VarR.D(surveyUiColors)) {
                i12 = 4;
                int i13 = 6 | 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i14 = 7 >> 7;
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(-245477028, true, new AnonymousClass1(surveyUiColors), c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultipleChoiceQuestionKt.PreviewQuestion$lambda$12(surveyUiColors, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewQuestion$lambda$12(SurveyUiColors surveyUiColors, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(surveyUiColors, "$surveyUiColors");
        PreviewQuestion(surveyUiColors, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
