package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import android.content.res.Configuration;
import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.v;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.v0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nNumericRatingQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NumericRatingQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/numericscale/NumericRatingQuestionKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,237:1\n70#2:238\n67#2,9:239\n77#2:471\n80#3,6:248\n87#3,3:263\n90#3,2:272\n80#3,6:286\n87#3,3:301\n90#3,2:310\n80#3,6:325\n87#3,3:340\n90#3,2:349\n94#3:364\n80#3,6:376\n87#3,3:391\n90#3,2:400\n94#3:417\n80#3,6:433\n87#3,3:448\n90#3,2:457\n94#3:462\n94#3:466\n94#3:470\n391#4,9:254\n400#4:274\n391#4,9:292\n400#4:312\n391#4,9:331\n400#4:351\n401#4,2:362\n391#4,9:382\n400#4:402\n401#4,2:415\n391#4,9:439\n400#4,3:459\n401#4,2:464\n401#4,2:468\n4360#5,6:266\n4360#5,6:304\n4360#5,6:343\n4360#5,6:394\n4360#5,6:451\n87#6:275\n83#6,10:276\n94#6:467\n113#7:313\n113#7:353\n113#7:354\n113#7:404\n113#7:405\n113#7:406\n113#7:407\n113#7:423\n75#8:314\n1863#9:315\n1863#9:352\n1864#9:361\n1864#9:366\n1863#9:403\n1864#9:414\n1557#9:419\n1628#9,3:420\n99#10:316\n97#10,8:317\n106#10:365\n99#10:367\n97#10,8:368\n106#10:418\n99#10:424\n97#10,8:425\n106#10:463\n1282#11,6:355\n1282#11,6:408\n*S KotlinDebug\n*F\n+ 1 NumericRatingQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/numericscale/NumericRatingQuestionKt\n*L\n53#1:238\n53#1:239,9\n53#1:471\n53#1:248,6\n53#1:263,3\n53#1:272,2\n54#1:286,6\n54#1:301,3\n54#1:310,2\n69#1:325,6\n69#1:340,3\n69#1:349,2\n69#1:364\n101#1:376,6\n101#1:391,3\n101#1:400,2\n101#1:417\n142#1:433,6\n142#1:448,3\n142#1:457,2\n142#1:462\n54#1:466\n53#1:470\n53#1:254,9\n53#1:274\n54#1:292,9\n54#1:312\n69#1:331,9\n69#1:351\n69#1:362,2\n101#1:382,9\n101#1:402\n101#1:415,2\n142#1:439,9\n142#1:459,3\n54#1:464,2\n53#1:468,2\n53#1:266,6\n54#1:304,6\n69#1:343,6\n101#1:394,6\n142#1:451,6\n54#1:275\n54#1:276,10\n54#1:467\n57#1:313\n80#1:353\n86#1:354\n113#1:404\n120#1:405\n121#1:406\n122#1:407\n145#1:423\n63#1:314\n68#1:315\n73#1:352\n73#1:361\n68#1:366\n106#1:403\n106#1:414\n133#1:419\n133#1:420,3\n69#1:316\n69#1:317,8\n69#1:365\n101#1:367\n101#1:368,8\n101#1:418\n142#1:424\n142#1:425,8\n142#1:463\n87#1:355,6\n123#1:408,6\n*E\n"})
public final class NumericRatingQuestionKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$GeneratePreview$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nNumericRatingQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NumericRatingQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/numericscale/NumericRatingQuestionKt$GeneratePreview$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n1557#2:238\n1628#2,3:239\n*S KotlinDebug\n*F\n+ 1 NumericRatingQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/numericscale/NumericRatingQuestionKt$GeneratePreview$1\n*L\n228#1:238\n228#1:239,3\n*E\n"})
    static final class AnonymousClass1 implements Function2<c0, Integer, Unit> {
        final /* synthetic */ Answer $answer;
        final /* synthetic */ int $end;
        final /* synthetic */ SurveyData.Step.Question.QuestionData.QuestionSubType $questionSubType;
        final /* synthetic */ int $start;

        /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$GeneratePreview$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SurveyData.Step.Question.QuestionData.QuestionSubType.values().length];
                try {
                    iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        AnonymousClass1(SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, int i10, int i11, Answer answer) {
            this.$questionSubType = questionSubType;
            this.$start = i10;
            this.$end = i11;
            this.$answer = answer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1(Answer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            List listListOf;
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            List listListOf2 = CollectionsKt.listOf(new Block.Builder().withText("How cool is this preview?"));
            if (WhenMappings.$EnumSwitchMapping$0[this.$questionSubType.ordinal()] == 1) {
                listListOf = CollectionsKt.listOf((Object[]) new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption[]{new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(1, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😖"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(2, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😕"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(3, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😐"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(4, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😃"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(5, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩")});
            } else {
                IntRange intRange = new IntRange(this.$start, this.$end);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
                Iterator<Integer> it = intRange.iterator();
                while (it.hasNext()) {
                    arrayList.add(new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption(((IntIterator) it).nextInt()));
                }
                listListOf = arrayList;
            }
            NumericRatingQuestionKt.NumericRatingQuestion(null, new SurveyData.Step.Question.NumericRatingQuestionModel(string, listListOf2, true, listListOf, "Not likely", "Very likely", this.$start, this.$end, this.$questionSubType), this.$answer, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NumericRatingQuestionKt.AnonymousClass1.invoke$lambda$1((Answer) obj);
                }
            }, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), null, c0Var, 3136, 33);
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionData.QuestionSubType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.NPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.UNSUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.STARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @androidx.compose.runtime.o
    @d1.c(name = "Emoji Rating", showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void EmojiRatingQuestionPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1678291132);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            GeneratePreview(1, 5, SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI, new Answer.SingleAnswer("4"), c0VarR, 438);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NumericRatingQuestionKt.EmojiRatingQuestionPreview$lambda$16(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmojiRatingQuestionPreview$lambda$16(int i10, c0 c0Var, int i11) {
        EmojiRatingQuestionPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void GeneratePreview(final int i10, final int i11, final SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, final Answer answer, c0 c0Var, final int i12) {
        int i13;
        c0 c0VarR = c0Var.R(-1397971036);
        if ((i12 & 14) == 0) {
            i13 = (c0VarR.K(i10) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i13 |= c0VarR.K(i11) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= c0VarR.D(questionSubType) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= c0VarR.D(answer) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, w.e(-2103292486, true, new AnonymousClass1(questionSubType, i10, i11, answer), c0VarR, 54), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NumericRatingQuestionKt.GeneratePreview$lambda$17(i10, i11, questionSubType, answer, i12, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GeneratePreview$lambda$17(int i10, int i11, SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, Answer answer, int i12, c0 c0Var, int i13) {
        Intrinsics.checkNotNullParameter(questionSubType, "$questionSubType");
        Intrinsics.checkNotNullParameter(answer, "$answer");
        GeneratePreview(i10, i11, questionSubType, answer, c0Var, t4.a(i12 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(name = "NPS Rating", showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void NPSQuestionPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-752808306);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            GeneratePreview(0, 10, SurveyData.Step.Question.QuestionData.QuestionSubType.NPS, new Answer.SingleAnswer("4"), c0VarR, 438);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NumericRatingQuestionKt.NPSQuestionPreview$lambda$14(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NPSQuestionPreview$lambda$14(int i10, c0 c0Var, int i11) {
        NPSQuestionPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

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
    public static final void NumericRatingQuestion(@Nullable a0 a0Var, @NotNull final SurveyData.Step.Question.NumericRatingQuestionModel numericRatingQuestionModel, @Nullable Answer answer, @NotNull final Function1<? super Answer, Unit> onAnswer, @NotNull final SurveyUiColors colors, @Nullable Function2<? super c0, ? super Integer, Unit> function2, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        Object obj;
        c0 c0Var2;
        Intrinsics.checkNotNullParameter(numericRatingQuestionModel, "numericRatingQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Intrinsics.checkNotNullParameter(colors, "colors");
        c0 c0VarR = c0Var.R(-1325570147);
        a0 a0Var2 = (i11 & 1) != 0 ? a0.E : a0Var;
        final Answer answer2 = (i11 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        final Function2<? super c0, ? super Integer, Unit> function2M509getLambda1$intercom_sdk_base_release = (i11 & 32) != 0 ? ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m509getLambda1$intercom_sdk_base_release() : function2;
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        a1 a1VarK = x.k(aVar.C(), false);
        int iHashCode = Long.hashCode(v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var2);
        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
        if (c0VarR.S() == null) {
            v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A);
        } else {
            c0VarR.l();
        }
        c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarK, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        d0 d0Var = d0.f15956a;
        a0.a aVar3 = a0.E;
        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
        a1 a1VarB = j0.b(qVar.y(), aVar.u(), c0VarR, 0);
        int iHashCode2 = Long.hashCode(v.l(c0VarR, 0));
        b1 b1VarK2 = c0VarR.k();
        a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar3);
        Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
        if (c0VarR.S() == null) {
            v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A2);
        } else {
            c0VarR.l();
        }
        c0 c0VarD2 = y7.d(c0VarR);
        final a0 a0Var3 = a0Var2;
        y7.n(c0VarD2, a1VarB, aVar2.e());
        y7.n(c0VarD2, b1VarK2, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar2.f());
        n0 n0Var = n0.f16227a;
        function2M509getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i10 >> 15) & 14));
        l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(16)), c0VarR, 6);
        int i13 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
        String str = "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption";
        int i14 = 8;
        int i15 = 1;
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            char c10 = 4;
            int i16 = 1;
            float f10 = 0.0f;
            Object obj2 = null;
            c0VarR.E(122317043);
            double size = numericRatingQuestionModel.getOptions().size();
            for (List list : CollectionsKt.chunked(numericRatingQuestionModel.getOptions(), (int) Math.ceil(size / ((double) ((int) Math.ceil(size / ((double) ((((Configuration) c0VarR.W(AndroidCompositionLocals_androidKt.f())).screenWidthDp - 60) / 60)))))))) {
                a0 a0VarH = i6.h(a0.E, f10, i16, obj2);
                a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.a.f16340a.f(), androidx.compose.ui.e.f37317a.w(), c0VarR, 6);
                int iHashCode3 = Long.hashCode(v.l(c0VarR, 0));
                b1 b1VarK3 = c0VarR.k();
                a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarH);
                androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A3 = aVar4.a();
                if (c0VarR.S() == null) {
                    v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A3);
                } else {
                    c0VarR.l();
                }
                c0 c0VarD3 = y7.d(c0VarR);
                y7.n(c0VarD3, a1VarE, aVar4.e());
                y7.n(c0VarD3, b1VarK3, aVar4.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar4.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN3, aVar4.f());
                y5 y5Var = y5.f16577a;
                c0VarR.E(268602155);
                Iterator it = list.iterator();
                char c11 = c10;
                while (it.hasNext()) {
                    SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption ratingOption = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption) it.next();
                    Intrinsics.checkNotNull(ratingOption, "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption");
                    final SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption numericRatingOption = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption) ratingOption;
                    int i17 = ((answer2 instanceof Answer.SingleAnswer) && Intrinsics.areEqual(((Answer.SingleAnswer) answer2).getAnswer(), String.valueOf(numericRatingOption.getValue()))) ? i16 : 0;
                    c0VarR.E(268611605);
                    long jM732getAccessibleColorOnWhiteBackground8_81llA = i17 != 0 ? ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU();
                    c0VarR.A();
                    long j10 = jM732getAccessibleColorOnWhiteBackground8_81llA;
                    int i18 = i17;
                    long jM730getAccessibleBorderColor8_81llA = ColorExtensionsKt.m730getAccessibleBorderColor8_81llA(j10);
                    float fR = androidx.compose.ui.unit.h.r(i18 != 0 ? 2 : i16);
                    v0 v0VarC = i18 != 0 ? v0.f41742b.c() : v0.f41742b.m();
                    String strValueOf = String.valueOf(numericRatingOption.getValue());
                    int i19 = i16;
                    Iterator it2 = it;
                    a0 a0VarR = d5.r(a0.E, androidx.compose.ui.unit.h.r(4));
                    c0VarR.E(-1805377699);
                    int i20 = (((((i10 & 7168) ^ 3072) <= 2048 || !c0VarR.D(onAnswer)) && (i10 & 3072) != 2048) ? 0 : i19) | (c0VarR.D(numericRatingOption) ? 1 : 0);
                    Object objI0 = c0VarR.i0();
                    if (i20 != 0 || objI0 == c0.f35327a.a()) {
                        objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NumericRatingQuestionKt.NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(onAnswer, numericRatingOption);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    c0 c0Var3 = c0VarR;
                    NumericRatingCellKt.m510NumericRatingCelljWvj134(strValueOf, i1.j(a0VarR, false, null, null, null, (Function0) objI0, 15, null), jM730getAccessibleBorderColor8_81llA, fR, j10, v0VarC, 0L, 0L, c0Var3, 0, 192);
                    c11 = 4;
                    c0VarR = c0Var3;
                    i16 = i19;
                    it = it2;
                }
                c0VarR.A();
                c0VarR.o();
                obj2 = null;
                i16 = i16;
                f10 = 0.0f;
                c10 = c11;
            }
            i12 = i16;
            obj = obj2;
            c0VarR.A();
            Unit unit = Unit.f312394a;
        } else {
            if (i13 == 4) {
                c0VarR.E(124701005);
                a0 a0VarH2 = i6.h(aVar3, 0.0f, 1, null);
                a1 a1VarE2 = u5.e(qVar.m(), aVar.w(), c0VarR, 6);
                int iHashCode4 = Long.hashCode(v.l(c0VarR, 0));
                b1 b1VarK4 = c0VarR.k();
                a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarH2);
                Function0<androidx.compose.ui.node.g> function0A4 = aVar2.a();
                if (c0VarR.S() == null) {
                    v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A4);
                } else {
                    c0VarR.l();
                }
                c0 c0VarD4 = y7.d(c0VarR);
                y7.n(c0VarD4, a1VarE2, aVar2.e());
                y7.n(c0VarD4, b1VarK4, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4 = aVar2.b();
                if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iHashCode4))) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN4, aVar2.f());
                y5 y5Var2 = y5.f16577a;
                c0VarR.E(-1421319679);
                Iterator it3 = numericRatingQuestionModel.getOptions().iterator();
                while (it3.hasNext()) {
                    SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption ratingOption2 = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption) it3.next();
                    Intrinsics.checkNotNull(ratingOption2, str);
                    final SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption numericRatingOption2 = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption) ratingOption2;
                    int i21 = (!(answer2 instanceof Answer.SingleAnswer) || numericRatingOption2.getValue() > Integer.parseInt(((Answer.SingleAnswer) answer2).getAnswer())) ? 0 : i15;
                    c0VarR.E(-1421310346);
                    long jM732getAccessibleColorOnWhiteBackground8_81llA2 = i21 != 0 ? ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU();
                    c0VarR.A();
                    int i22 = i21;
                    long jM730getAccessibleBorderColor8_81llA2 = ColorExtensionsKt.m730getAccessibleBorderColor8_81llA(jM732getAccessibleColorOnWhiteBackground8_81llA2);
                    float fR2 = i22 != 0 ? androidx.compose.ui.unit.h.r(2) : androidx.compose.ui.unit.h.r(i15);
                    Iterator it4 = it3;
                    float f11 = 44;
                    a0 a0VarR2 = d5.r(i6.i(i6.B(a0.E, androidx.compose.ui.unit.h.r(f11)), androidx.compose.ui.unit.h.r(f11)), androidx.compose.ui.unit.h.r(i14));
                    c0VarR.E(268698463);
                    boolean zD = c0VarR.D(numericRatingOption2) | ((((i10 & 7168) ^ 3072) > 2048 && c0VarR.D(onAnswer)) || (i10 & 3072) == 2048);
                    Object objI1 = c0VarR.i0();
                    if (zD || objI1 == c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return NumericRatingQuestionKt.NumericRatingQuestion$lambda$12$lambda$11$lambda$8$lambda$7$lambda$6$lambda$5(numericRatingOption2, onAnswer);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    c0VarR.A();
                    StarRatingKt.m511StarRatingtAjK0ZQ(i1.j(a0VarR2, false, null, null, null, (Function0) objI1, 15, null), jM732getAccessibleColorOnWhiteBackground8_81llA2, fR2, jM730getAccessibleBorderColor8_81llA2, c0VarR, 0, 0);
                    i15 = 1;
                    str = str;
                    it3 = it4;
                    i14 = 8;
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.A();
                Unit unit2 = Unit.f312394a;
                i12 = i15;
            } else {
                if (i13 != 5) {
                    c0VarR.E(3944735);
                    c0VarR.A();
                    throw new k0();
                }
                c0VarR.E(126368681);
                List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options = numericRatingQuestionModel.getOptions();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
                for (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption ratingOption3 : options) {
                    Intrinsics.checkNotNull(ratingOption3, "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption");
                    arrayList.add((SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption) ratingOption3);
                }
                int i23 = i10 >> 3;
                EmojiQuestionKt.EmojiQuestion(arrayList, answer2, onAnswer, c0VarR, (i23 & 896) | (i23 & com.planner5d.library.engine.input.f.b.B) | 8);
                c0VarR.A();
                Unit unit3 = Unit.f312394a;
                i12 = 1;
            }
            obj = null;
        }
        c0VarR.E(4087291);
        if ((!StringsKt.w3(numericRatingQuestionModel.getLowerLabel())) && (!StringsKt.w3(numericRatingQuestionModel.getUpperLabel()))) {
            a0 a0VarR3 = d5.r(i6.h(a0.E, 0.0f, i12, obj), androidx.compose.ui.unit.h.r(8));
            a1 a1VarE3 = u5.e(androidx.compose.foundation.layout.q.f16330a.s(), androidx.compose.ui.e.f37317a.w(), c0VarR, 6);
            int iHashCode5 = Long.hashCode(v.l(c0VarR, 0));
            b1 b1VarK5 = c0VarR.k();
            a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarR3);
            androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A5 = aVar5.a();
            if (c0VarR.S() == null) {
                v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A5);
            } else {
                c0VarR.l();
            }
            c0 c0VarD5 = y7.d(c0VarR);
            y7.n(c0VarD5, a1VarE3, aVar5.e());
            y7.n(c0VarD5, b1VarK5, aVar5.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B5 = aVar5.b();
            if (c0VarD5.P() || !Intrinsics.areEqual(c0VarD5.i0(), Integer.valueOf(iHashCode5))) {
                c0VarD5.Y(Integer.valueOf(iHashCode5));
                c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
            }
            y7.n(c0VarD5, a0VarN5, aVar5.f());
            y5 y5Var3 = y5.f16577a;
            List listListOf = numericRatingQuestionModel.getQuestionSubType() == SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI ? CollectionsKt.listOf((Object[]) new String[]{numericRatingQuestionModel.getLowerLabel(), numericRatingQuestionModel.getUpperLabel()}) : CollectionsKt.listOf((Object[]) new String[]{numericRatingQuestionModel.getScaleStart() + " - " + numericRatingQuestionModel.getLowerLabel(), numericRatingQuestionModel.getScaleEnd() + " - " + numericRatingQuestionModel.getUpperLabel()});
            String str2 = (String) listListOf.get(0);
            String str3 = (String) listListOf.get(1);
            c0Var2 = c0VarR;
            q50.t(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, 0, 0, 262142);
            q50.t(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, 0, 0, 262142);
            c0Var2.o();
        } else {
            c0Var2 = c0VarR;
        }
        c0Var2.A();
        c0Var2.o();
        c0Var2.o();
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(a0Var3, numericRatingQuestionModel, answer2, onAnswer, colors, function2M509getLambda1$intercom_sdk_base_release, i10, i11, (c0) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(Function1 onAnswer, SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption option) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(option, "$option");
        onAnswer.invoke(new Answer.SingleAnswer(String.valueOf(option.getValue())));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NumericRatingQuestion$lambda$12$lambda$11$lambda$8$lambda$7$lambda$6$lambda$5(SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption currentRating, Function1 onAnswer) {
        Intrinsics.checkNotNullParameter(currentRating, "$currentRating");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        onAnswer.invoke(new Answer.SingleAnswer(String.valueOf(currentRating.getValue())));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NumericRatingQuestion$lambda$13(a0 a0Var, SurveyData.Step.Question.NumericRatingQuestionModel numericRatingQuestionModel, Answer answer, Function1 onAnswer, SurveyUiColors colors, Function2 function2, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(numericRatingQuestionModel, "$numericRatingQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(colors, "$colors");
        NumericRatingQuestion(a0Var, numericRatingQuestionModel, answer, onAnswer, colors, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(name = "Star Rating", showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void StarQuestionPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1791167217);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            GeneratePreview(1, 5, SurveyData.Step.Question.QuestionData.QuestionSubType.STARS, new Answer.MultipleAnswer(SetsKt.setOf((Object[]) new String[]{"1", "2"}), null, 2, null), c0VarR, 4534);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NumericRatingQuestionKt.StarQuestionPreview$lambda$15(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StarQuestionPreview$lambda$15(int i10, c0 c0Var, int i11) {
        StarQuestionPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
