package io.intercom.android.sdk.survey.ui.questiontype.text;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.text.y3;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
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
@SourceDebugExtension({"SMAP\nLongTextQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTextQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/text/LongTextQuestionKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,103:1\n70#2:104\n67#2,9:105\n77#2:194\n80#3,6:114\n87#3,3:129\n90#3,2:138\n80#3,6:152\n87#3,3:167\n90#3,2:176\n94#3:189\n94#3:193\n391#4,9:120\n400#4:140\n391#4,9:158\n400#4:178\n401#4,2:187\n401#4,2:191\n4360#5,6:132\n4360#5,6:170\n87#6:141\n83#6,10:142\n94#6:190\n113#7:179\n113#7:186\n1282#8,6:180\n*S KotlinDebug\n*F\n+ 1 LongTextQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/text/LongTextQuestionKt\n*L\n43#1:104\n43#1:105,9\n43#1:194\n43#1:114,6\n43#1:129,3\n43#1:138,2\n44#1:152,6\n44#1:167,3\n44#1:176,2\n44#1:189\n43#1:193\n43#1:120,9\n43#1:140\n44#1:158,9\n44#1:178\n44#1:187,2\n43#1:191,2\n43#1:132,6\n44#1:170,6\n44#1:141\n44#1:142,10\n44#1:190\n46#1:179\n77#1:186\n55#1:180,6\n*E\n"})
public final class LongTextQuestionKt {
    @androidx.compose.runtime.o
    @d1.c(name = "LongTextQuestion", showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void LongTextPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-479343201);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            LongTextQuestion(null, new SurveyData.Step.Question.LongTextQuestionModel(string, CollectionsKt.listOf(new Block.Builder().withText("Is this a preview?")), true, "Placeholder text", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, 2000, 0.0f, 0, null, 448, null), null, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LongTextQuestionKt.LongTextPreview$lambda$6((Answer) obj);
                }
            }, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), ValidationError.NoValidationError.INSTANCE, null, null, c0VarR, 199680, 197);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LongTextQuestionKt.LongTextPreview$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LongTextPreview$lambda$6(Answer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LongTextPreview$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        LongTextPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0140  */
    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:104:0x016f  */
    /* JADX WARN: Code duplicated, block: B:107:0x017b  */
    /* JADX WARN: Code duplicated, block: B:108:0x017f  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:120:0x0200  */
    /* JADX WARN: Code duplicated, block: B:123:0x021f  */
    /* JADX WARN: Code duplicated, block: B:125:0x022d  */
    /* JADX WARN: Code duplicated, block: B:128:0x026c  */
    /* JADX WARN: Code duplicated, block: B:130:0x027b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0288  */
    /* JADX WARN: Code duplicated, block: B:134:0x0290  */
    /* JADX WARN: Code duplicated, block: B:137:0x0296  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:144:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:149:0x02df  */
    /* JADX WARN: Code duplicated, block: B:152:0x031f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0392  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x009a  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00df  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x0111  */
    /* JADX WARN: Code duplicated, block: B:91:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0127  */
    /* JADX WARN: Code duplicated, block: B:94:0x012d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0130  */
    /* JADX WARN: Code duplicated, block: B:97:0x0134  */
    /* JADX WARN: Code duplicated, block: B:98:0x013c  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void LongTextQuestion(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final SurveyData.Step.Question.LongTextQuestionModel textQuestionModel, @Nullable Answer answer, @NotNull final Function1<? super Answer, Unit> onAnswer, @NotNull final SurveyUiColors colors, @NotNull final ValidationError validationError, @Nullable Function1<? super y3, Unit> function1, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        Answer answer2;
        int i13;
        int i14;
        int i15;
        int i16;
        Function1<? super y3, Unit> function3;
        int i17;
        int i18;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i19;
        Answer answer3;
        Function1<? super y3, Unit> function5;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2M512getLambda1$intercom_sdk_base_release;
        androidx.compose.ui.e.a aVar;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.ui.a0.a aVar2;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        n0 n0Var;
        String placeholder;
        String answer4;
        q0 q0VarN;
        Answer answer5;
        boolean z10;
        Object objI0;
        androidx.compose.runtime.c0 c0Var2;
        final Function1<? super y3, Unit> function6;
        final androidx.compose.ui.a0 a0Var3;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        final Answer answer6;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(textQuestionModel, "textQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(validationError, "validationError");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(977241530);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(textQuestionModel) ? 32 : 16;
        }
        int i21 = i11 & 4;
        if (i21 == 0) {
            if ((i10 & 896) == 0) {
                answer2 = answer;
                i12 |= c0VarR.D(answer2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c0VarR.k0(onAnswer)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (c0VarR.D(colors)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c0VarR.D(validationError)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                i16 = i11 & 64;
                if (i16 != 0) {
                    if ((3670016 & i10) == 0) {
                        function3 = function1;
                        if (c0VarR.k0(function3)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 128;
                    if (i18 != 0) {
                        i12 |= 12582912;
                        function4 = function2;
                    } else {
                        function4 = function2;
                        if ((i10 & 29360128) == 0) {
                            if (c0VarR.k0(function4)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((i12 & 23967451) == 4793490 || !c0VarR.d()) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i21 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i16 != 0) {
                            function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                                }
                            };
                        } else {
                            function5 = function3;
                        }
                        if (i18 != 0) {
                            function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
                        } else {
                            function2M512getLambda1$intercom_sdk_base_release = function4;
                        }
                        aVar = androidx.compose.ui.e.f37317a;
                        a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var2);
                        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                        function0A = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK, aVar3.e());
                        y7.n(c0VarD, b1VarK, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar3.f());
                        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        aVar2 = androidx.compose.ui.a0.E;
                        a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK2 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar2);
                        function0A2 = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarB, aVar3.e());
                        y7.n(c0VarD2, b1VarK2, aVar3.g());
                        function2B2 = aVar3.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN2, aVar3.f());
                        n0Var = n0.f16227a;
                        function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                        l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                        c0VarR.E(-497967796);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        String str = placeholder;
                        c0VarR.A();
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = "";
                        }
                        if ((validationError instanceof ValidationError.ValidationStringError) || (answer3 instanceof Answer.NoAnswer.InitialNoAnswer)) {
                            q0VarN = null;
                        } else {
                            q0VarN = q0.n(q0.f38131b.q());
                        }
                        long jM732getAccessibleColorOnWhiteBackground8_81llA = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                        int iA = androidx.compose.ui.text.input.t.f41944b.a();
                        int maxLine = textQuestionModel.getMaxLine();
                        float fM466getMinHeightD9Ej5fM = textQuestionModel.m466getMinHeightD9Ej5fM();
                        c0VarR.E(-497955273);
                        answer5 = answer3;
                        if ((i12 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA, maxLine, false, function5, 0, iA, false, null, false, fM466getMinHeightD9Ej5fM, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                        Function1<? super y3, Unit> function8 = function5;
                        c0VarR.E(-497931568);
                        if (textQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(answer5.getLength());
                            sb2.append('/');
                            sb2.append(textQuestionModel.getCharacterLimit());
                            q50.t(sb2.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                            c0Var2 = c0VarR;
                        } else {
                            c0Var2 = c0VarR;
                        }
                        c0Var2.A();
                        c0Var2.o();
                        c0Var2.o();
                        androidx.compose.ui.a0 a0Var4 = a0Var2;
                        function6 = function8;
                        a0Var3 = a0Var4;
                        function7 = function2M512getLambda1$intercom_sdk_base_release;
                        answer6 = answer5;
                    } else {
                        c0VarR.u();
                        c0Var2 = c0VarR;
                        a0Var3 = a0Var2;
                        answer6 = answer2;
                        function7 = function4;
                        function6 = function3;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$5(a0Var3, textQuestionModel, answer6, onAnswer, colors, validationError, function6, function7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                function3 = function1;
                i18 = i11 & 128;
                if (i18 != 0) {
                    i12 |= 12582912;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i10 & 29360128) == 0) {
                        if (c0VarR.k0(function4)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    }
                }
                if ((i12 & 23967451) == 4793490) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i21 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i16 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i18 != 0) {
                        function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
                    } else {
                        function2M512getLambda1$intercom_sdk_base_release = function4;
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK3 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                    androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                    function0A = aVar4.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK2, aVar4.e());
                    y7.n(c0VarD, b1VarK3, aVar4.g());
                    function2B = aVar4.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN3, aVar4.f());
                    androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                    aVar2 = androidx.compose.ui.a0.E;
                    a1 a1VarB2 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK4 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    function0A2 = aVar4.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarB2, aVar4.e());
                    y7.n(c0VarD2, b1VarK4, aVar4.g());
                    function2B2 = aVar4.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN4, aVar4.f());
                    n0Var = n0.f16227a;
                    function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                    l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    c0VarR.E(-497967796);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    String str2 = placeholder;
                    c0VarR.A();
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = "";
                    }
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        q0VarN = null;
                    } else {
                        q0VarN = null;
                    }
                    long jM732getAccessibleColorOnWhiteBackground8_81llA2 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                    int iA2 = androidx.compose.ui.text.input.t.f41944b.a();
                    int maxLine2 = textQuestionModel.getMaxLine();
                    float fM466getMinHeightD9Ej5fM2 = textQuestionModel.m466getMinHeightD9Ej5fM();
                    c0VarR.E(-497955273);
                    answer5 = answer3;
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str2, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA2, maxLine2, false, function5, 0, iA2, false, null, false, fM466getMinHeightD9Ej5fM2, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                    Function1<? super y3, Unit> function9 = function5;
                    c0VarR.E(-497931568);
                    if (textQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(answer5.getLength());
                        sb3.append('/');
                        sb3.append(textQuestionModel.getCharacterLimit());
                        q50.t(sb3.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.o();
                    androidx.compose.ui.a0 a0Var5 = a0Var2;
                    function6 = function9;
                    a0Var3 = a0Var5;
                    function7 = function2M512getLambda1$intercom_sdk_base_release;
                    answer6 = answer5;
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i21 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i16 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i18 != 0) {
                        function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
                    } else {
                        function2M512getLambda1$intercom_sdk_base_release = function4;
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK5 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                    androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                    function0A = aVar5.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK3, aVar5.e());
                    y7.n(c0VarD, b1VarK5, aVar5.g());
                    function2B = aVar5.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN5, aVar5.f());
                    androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                    aVar2 = androidx.compose.ui.a0.E;
                    a1 a1VarB3 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK6 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    function0A2 = aVar5.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarB3, aVar5.e());
                    y7.n(c0VarD2, b1VarK6, aVar5.g());
                    function2B2 = aVar5.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN6, aVar5.f());
                    n0Var = n0.f16227a;
                    function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                    l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    c0VarR.E(-497967796);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    String str3 = placeholder;
                    c0VarR.A();
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = "";
                    }
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        q0VarN = null;
                    } else {
                        q0VarN = null;
                    }
                    long jM732getAccessibleColorOnWhiteBackground8_81llA3 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                    int iA3 = androidx.compose.ui.text.input.t.f41944b.a();
                    int maxLine3 = textQuestionModel.getMaxLine();
                    float fM466getMinHeightD9Ej5fM3 = textQuestionModel.m466getMinHeightD9Ej5fM();
                    c0VarR.E(-497955273);
                    answer5 = answer3;
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str3, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA3, maxLine3, false, function5, 0, iA3, false, null, false, fM466getMinHeightD9Ej5fM3, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                    Function1<? super y3, Unit> function10 = function5;
                    c0VarR.E(-497931568);
                    if (textQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(answer5.getLength());
                        sb4.append('/');
                        sb4.append(textQuestionModel.getCharacterLimit());
                        q50.t(sb4.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.o();
                    androidx.compose.ui.a0 a0Var6 = a0Var2;
                    function6 = function10;
                    a0Var3 = a0Var6;
                    function7 = function2M512getLambda1$intercom_sdk_base_release;
                    answer6 = answer5;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$5(a0Var3, textQuestionModel, answer6, onAnswer, colors, validationError, function6, function7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 = androidx.profileinstaller.n.c.f73814m;
            i12 |= i15;
            i16 = i11 & 64;
            if (i16 != 0) {
                if ((3670016 & i10) == 0) {
                    function3 = function1;
                    if (c0VarR.k0(function3)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 128;
                if (i18 != 0) {
                    i12 |= 12582912;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i10 & 29360128) == 0) {
                        if (c0VarR.k0(function4)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    }
                }
                if ((i12 & 23967451) == 4793490) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i21 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i16 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i18 != 0) {
                        function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
                    } else {
                        function2M512getLambda1$intercom_sdk_base_release = function4;
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    a1 a1VarK4 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                    androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                    function0A = aVar6.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK4, aVar6.e());
                    y7.n(c0VarD, b1VarK7, aVar6.g());
                    function2B = aVar6.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN7, aVar6.f());
                    androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                    aVar2 = androidx.compose.ui.a0.E;
                    a1 a1VarB4 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK8 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    function0A2 = aVar6.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarB4, aVar6.e());
                    y7.n(c0VarD2, b1VarK8, aVar6.g());
                    function2B2 = aVar6.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN8, aVar6.f());
                    n0Var = n0.f16227a;
                    function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                    l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    c0VarR.E(-497967796);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    String str4 = placeholder;
                    c0VarR.A();
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = "";
                    }
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        q0VarN = null;
                    } else {
                        q0VarN = null;
                    }
                    long jM732getAccessibleColorOnWhiteBackground8_81llA4 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                    int iA4 = androidx.compose.ui.text.input.t.f41944b.a();
                    int maxLine4 = textQuestionModel.getMaxLine();
                    float fM466getMinHeightD9Ej5fM4 = textQuestionModel.m466getMinHeightD9Ej5fM();
                    c0VarR.E(-497955273);
                    answer5 = answer3;
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str4, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA4, maxLine4, false, function5, 0, iA4, false, null, false, fM466getMinHeightD9Ej5fM4, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                    Function1<? super y3, Unit> function11 = function5;
                    c0VarR.E(-497931568);
                    if (textQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(answer5.getLength());
                        sb5.append('/');
                        sb5.append(textQuestionModel.getCharacterLimit());
                        q50.t(sb5.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.o();
                    androidx.compose.ui.a0 a0Var7 = a0Var2;
                    function6 = function11;
                    a0Var3 = a0Var7;
                    function7 = function2M512getLambda1$intercom_sdk_base_release;
                    answer6 = answer5;
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i21 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i16 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i18 != 0) {
                        function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
                    } else {
                        function2M512getLambda1$intercom_sdk_base_release = function4;
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    a1 a1VarK5 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK9 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                    androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                    function0A = aVar7.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK5, aVar7.e());
                    y7.n(c0VarD, b1VarK9, aVar7.g());
                    function2B = aVar7.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN9, aVar7.f());
                    androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                    aVar2 = androidx.compose.ui.a0.E;
                    a1 a1VarB5 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK10 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    function0A2 = aVar7.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarB5, aVar7.e());
                    y7.n(c0VarD2, b1VarK10, aVar7.g());
                    function2B2 = aVar7.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN10, aVar7.f());
                    n0Var = n0.f16227a;
                    function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                    l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    c0VarR.E(-497967796);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    String str5 = placeholder;
                    c0VarR.A();
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = "";
                    }
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        q0VarN = null;
                    } else {
                        q0VarN = null;
                    }
                    long jM732getAccessibleColorOnWhiteBackground8_81llA5 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                    int iA5 = androidx.compose.ui.text.input.t.f41944b.a();
                    int maxLine5 = textQuestionModel.getMaxLine();
                    float fM466getMinHeightD9Ej5fM5 = textQuestionModel.m466getMinHeightD9Ej5fM();
                    c0VarR.E(-497955273);
                    answer5 = answer3;
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str5, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA5, maxLine5, false, function5, 0, iA5, false, null, false, fM466getMinHeightD9Ej5fM5, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                    Function1<? super y3, Unit> function12 = function5;
                    c0VarR.E(-497931568);
                    if (textQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(answer5.getLength());
                        sb6.append('/');
                        sb6.append(textQuestionModel.getCharacterLimit());
                        q50.t(sb6.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.o();
                    androidx.compose.ui.a0 a0Var8 = a0Var2;
                    function6 = function12;
                    a0Var3 = a0Var8;
                    function7 = function2M512getLambda1$intercom_sdk_base_release;
                    answer6 = answer5;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$5(a0Var3, textQuestionModel, answer6, onAnswer, colors, validationError, function6, function7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            function3 = function1;
            i18 = i11 & 128;
            if (i18 != 0) {
                i12 |= 12582912;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i10 & 29360128) == 0) {
                    if (c0VarR.k0(function4)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
            }
            if ((i12 & 23967451) == 4793490) {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i21 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i18 != 0) {
                    function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
                } else {
                    function2M512getLambda1$intercom_sdk_base_release = function4;
                }
                aVar = androidx.compose.ui.e.f37317a;
                a1 a1VarK6 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                function0A = aVar8.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK6, aVar8.e());
                y7.n(c0VarD, b1VarK11, aVar8.g());
                function2B = aVar8.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11, aVar8.f());
                androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                aVar2 = androidx.compose.ui.a0.E;
                a1 a1VarB6 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK12 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, aVar2);
                function0A2 = aVar8.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarB6, aVar8.e());
                y7.n(c0VarD2, b1VarK12, aVar8.g());
                function2B2 = aVar8.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN12, aVar8.f());
                n0Var = n0.f16227a;
                function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                c0VarR.E(-497967796);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                String str6 = placeholder;
                c0VarR.A();
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                if (validationError instanceof ValidationError.ValidationStringError) {
                    q0VarN = null;
                } else {
                    q0VarN = null;
                }
                long jM732getAccessibleColorOnWhiteBackground8_81llA6 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                int iA6 = androidx.compose.ui.text.input.t.f41944b.a();
                int maxLine6 = textQuestionModel.getMaxLine();
                float fM466getMinHeightD9Ej5fM6 = textQuestionModel.m466getMinHeightD9Ej5fM();
                c0VarR.E(-497955273);
                answer5 = answer3;
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str6, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA6, maxLine6, false, function5, 0, iA6, false, null, false, fM466getMinHeightD9Ej5fM6, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                Function1<? super y3, Unit> function13 = function5;
                c0VarR.E(-497931568);
                if (textQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(answer5.getLength());
                    sb7.append('/');
                    sb7.append(textQuestionModel.getCharacterLimit());
                    q50.t(sb7.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.o();
                androidx.compose.ui.a0 a0Var9 = a0Var2;
                function6 = function13;
                a0Var3 = a0Var9;
                function7 = function2M512getLambda1$intercom_sdk_base_release;
                answer6 = answer5;
            } else {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i21 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i18 != 0) {
                    function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
                } else {
                    function2M512getLambda1$intercom_sdk_base_release = function4;
                }
                aVar = androidx.compose.ui.e.f37317a;
                a1 a1VarK7 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK13 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                function0A = aVar9.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK7, aVar9.e());
                y7.n(c0VarD, b1VarK13, aVar9.g());
                function2B = aVar9.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN13, aVar9.f());
                androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                aVar2 = androidx.compose.ui.a0.E;
                a1 a1VarB7 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK14 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, aVar2);
                function0A2 = aVar9.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarB7, aVar9.e());
                y7.n(c0VarD2, b1VarK14, aVar9.g());
                function2B2 = aVar9.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN14, aVar9.f());
                n0Var = n0.f16227a;
                function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                c0VarR.E(-497967796);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                String str7 = placeholder;
                c0VarR.A();
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                if (validationError instanceof ValidationError.ValidationStringError) {
                    q0VarN = null;
                } else {
                    q0VarN = null;
                }
                long jM732getAccessibleColorOnWhiteBackground8_81llA7 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                int iA7 = androidx.compose.ui.text.input.t.f41944b.a();
                int maxLine7 = textQuestionModel.getMaxLine();
                float fM466getMinHeightD9Ej5fM7 = textQuestionModel.m466getMinHeightD9Ej5fM();
                c0VarR.E(-497955273);
                answer5 = answer3;
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str7, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA7, maxLine7, false, function5, 0, iA7, false, null, false, fM466getMinHeightD9Ej5fM7, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                Function1<? super y3, Unit> function14 = function5;
                c0VarR.E(-497931568);
                if (textQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(answer5.getLength());
                    sb8.append('/');
                    sb8.append(textQuestionModel.getCharacterLimit());
                    q50.t(sb8.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.o();
                androidx.compose.ui.a0 a0Var10 = a0Var2;
                function6 = function14;
                a0Var3 = a0Var10;
                function7 = function2M512getLambda1$intercom_sdk_base_release;
                answer6 = answer5;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LongTextQuestionKt.LongTextQuestion$lambda$5(a0Var3, textQuestionModel, answer6, onAnswer, colors, validationError, function6, function7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        answer2 = answer;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c0VarR.k0(onAnswer)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (c0VarR.D(colors)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i12 |= i14;
        }
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (c0VarR.D(validationError)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
            }
            i16 = i11 & 64;
            if (i16 != 0) {
                if ((3670016 & i10) == 0) {
                    function3 = function1;
                    if (c0VarR.k0(function3)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 128;
                if (i18 != 0) {
                    i12 |= 12582912;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i10 & 29360128) == 0) {
                        if (c0VarR.k0(function4)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    }
                }
                if ((i12 & 23967451) == 4793490) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i21 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i16 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i18 != 0) {
                        function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
                    } else {
                        function2M512getLambda1$intercom_sdk_base_release = function4;
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    a1 a1VarK8 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK15 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                    androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                    function0A = aVar10.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK8, aVar10.e());
                    y7.n(c0VarD, b1VarK15, aVar10.g());
                    function2B = aVar10.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN15, aVar10.f());
                    androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
                    aVar2 = androidx.compose.ui.a0.E;
                    a1 a1VarB8 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK16 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    function0A2 = aVar10.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarB8, aVar10.e());
                    y7.n(c0VarD2, b1VarK16, aVar10.g());
                    function2B2 = aVar10.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN16, aVar10.f());
                    n0Var = n0.f16227a;
                    function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                    l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    c0VarR.E(-497967796);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    String str8 = placeholder;
                    c0VarR.A();
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = "";
                    }
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        q0VarN = null;
                    } else {
                        q0VarN = null;
                    }
                    long jM732getAccessibleColorOnWhiteBackground8_81llA8 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                    int iA8 = androidx.compose.ui.text.input.t.f41944b.a();
                    int maxLine8 = textQuestionModel.getMaxLine();
                    float fM466getMinHeightD9Ej5fM8 = textQuestionModel.m466getMinHeightD9Ej5fM();
                    c0VarR.E(-497955273);
                    answer5 = answer3;
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str8, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA8, maxLine8, false, function5, 0, iA8, false, null, false, fM466getMinHeightD9Ej5fM8, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                    Function1<? super y3, Unit> function15 = function5;
                    c0VarR.E(-497931568);
                    if (textQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(answer5.getLength());
                        sb9.append('/');
                        sb9.append(textQuestionModel.getCharacterLimit());
                        q50.t(sb9.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.o();
                    androidx.compose.ui.a0 a0Var11 = a0Var2;
                    function6 = function15;
                    a0Var3 = a0Var11;
                    function7 = function2M512getLambda1$intercom_sdk_base_release;
                    answer6 = answer5;
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i21 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i16 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i18 != 0) {
                        function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
                    } else {
                        function2M512getLambda1$intercom_sdk_base_release = function4;
                    }
                    aVar = androidx.compose.ui.e.f37317a;
                    a1 a1VarK9 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK17 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                    androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                    function0A = aVar11.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK9, aVar11.e());
                    y7.n(c0VarD, b1VarK17, aVar11.g());
                    function2B = aVar11.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN17, aVar11.f());
                    androidx.compose.foundation.layout.d0 d0Var9 = androidx.compose.foundation.layout.d0.f15956a;
                    aVar2 = androidx.compose.ui.a0.E;
                    a1 a1VarB9 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK18 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, aVar2);
                    function0A2 = aVar11.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarB9, aVar11.e());
                    y7.n(c0VarD2, b1VarK18, aVar11.g());
                    function2B2 = aVar11.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN18, aVar11.f());
                    n0Var = n0.f16227a;
                    function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                    l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    c0VarR.E(-497967796);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    String str9 = placeholder;
                    c0VarR.A();
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = "";
                    }
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        q0VarN = null;
                    } else {
                        q0VarN = null;
                    }
                    long jM732getAccessibleColorOnWhiteBackground8_81llA9 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                    int iA9 = androidx.compose.ui.text.input.t.f41944b.a();
                    int maxLine9 = textQuestionModel.getMaxLine();
                    float fM466getMinHeightD9Ej5fM9 = textQuestionModel.m466getMinHeightD9Ej5fM();
                    c0VarR.E(-497955273);
                    answer5 = answer3;
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z10) {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str9, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA9, maxLine9, false, function5, 0, iA9, false, null, false, fM466getMinHeightD9Ej5fM9, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                    Function1<? super y3, Unit> function16 = function5;
                    c0VarR.E(-497931568);
                    if (textQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(answer5.getLength());
                        sb10.append('/');
                        sb10.append(textQuestionModel.getCharacterLimit());
                        q50.t(sb10.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                        c0Var2 = c0VarR;
                    } else {
                        c0Var2 = c0VarR;
                    }
                    c0Var2.A();
                    c0Var2.o();
                    c0Var2.o();
                    androidx.compose.ui.a0 a0Var12 = a0Var2;
                    function6 = function16;
                    a0Var3 = a0Var12;
                    function7 = function2M512getLambda1$intercom_sdk_base_release;
                    answer6 = answer5;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$5(a0Var3, textQuestionModel, answer6, onAnswer, colors, validationError, function6, function7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            function3 = function1;
            i18 = i11 & 128;
            if (i18 != 0) {
                i12 |= 12582912;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i10 & 29360128) == 0) {
                    if (c0VarR.k0(function4)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
            }
            if ((i12 & 23967451) == 4793490) {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i21 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i18 != 0) {
                    function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
                } else {
                    function2M512getLambda1$intercom_sdk_base_release = function4;
                }
                aVar = androidx.compose.ui.e.f37317a;
                a1 a1VarK10 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK19 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                function0A = aVar12.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK10, aVar12.e());
                y7.n(c0VarD, b1VarK19, aVar12.g());
                function2B = aVar12.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN19, aVar12.f());
                androidx.compose.foundation.layout.d0 d0Var10 = androidx.compose.foundation.layout.d0.f15956a;
                aVar2 = androidx.compose.ui.a0.E;
                a1 a1VarB10 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, aVar2);
                function0A2 = aVar12.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarB10, aVar12.e());
                y7.n(c0VarD2, b1VarK110, aVar12.g());
                function2B2 = aVar12.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN110, aVar12.f());
                n0Var = n0.f16227a;
                function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                c0VarR.E(-497967796);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                String str10 = placeholder;
                c0VarR.A();
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                if (validationError instanceof ValidationError.ValidationStringError) {
                    q0VarN = null;
                } else {
                    q0VarN = null;
                }
                long jM732getAccessibleColorOnWhiteBackground8_81llA10 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                int iA10 = androidx.compose.ui.text.input.t.f41944b.a();
                int maxLine10 = textQuestionModel.getMaxLine();
                float fM466getMinHeightD9Ej5fM10 = textQuestionModel.m466getMinHeightD9Ej5fM();
                c0VarR.E(-497955273);
                answer5 = answer3;
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str10, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA10, maxLine10, false, function5, 0, iA10, false, null, false, fM466getMinHeightD9Ej5fM10, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                Function1<? super y3, Unit> function17 = function5;
                c0VarR.E(-497931568);
                if (textQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(answer5.getLength());
                    sb11.append('/');
                    sb11.append(textQuestionModel.getCharacterLimit());
                    q50.t(sb11.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.o();
                androidx.compose.ui.a0 a0Var13 = a0Var2;
                function6 = function17;
                a0Var3 = a0Var13;
                function7 = function2M512getLambda1$intercom_sdk_base_release;
                answer6 = answer5;
            } else {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i21 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i18 != 0) {
                    function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
                } else {
                    function2M512getLambda1$intercom_sdk_base_release = function4;
                }
                aVar = androidx.compose.ui.e.f37317a;
                a1 a1VarK11 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                function0A = aVar13.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK11, aVar13.e());
                y7.n(c0VarD, b1VarK111, aVar13.g());
                function2B = aVar13.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111, aVar13.f());
                androidx.compose.foundation.layout.d0 d0Var11 = androidx.compose.foundation.layout.d0.f15956a;
                aVar2 = androidx.compose.ui.a0.E;
                a1 a1VarB11 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK112 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, aVar2);
                function0A2 = aVar13.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarB11, aVar13.e());
                y7.n(c0VarD2, b1VarK112, aVar13.g());
                function2B2 = aVar13.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN112, aVar13.f());
                n0Var = n0.f16227a;
                function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                c0VarR.E(-497967796);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                String str11 = placeholder;
                c0VarR.A();
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                if (validationError instanceof ValidationError.ValidationStringError) {
                    q0VarN = null;
                } else {
                    q0VarN = null;
                }
                long jM732getAccessibleColorOnWhiteBackground8_81llA11 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                int iA11 = androidx.compose.ui.text.input.t.f41944b.a();
                int maxLine11 = textQuestionModel.getMaxLine();
                float fM466getMinHeightD9Ej5fM11 = textQuestionModel.m466getMinHeightD9Ej5fM();
                c0VarR.E(-497955273);
                answer5 = answer3;
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str11, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA11, maxLine11, false, function5, 0, iA11, false, null, false, fM466getMinHeightD9Ej5fM11, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                Function1<? super y3, Unit> function18 = function5;
                c0VarR.E(-497931568);
                if (textQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(answer5.getLength());
                    sb12.append('/');
                    sb12.append(textQuestionModel.getCharacterLimit());
                    q50.t(sb12.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.o();
                androidx.compose.ui.a0 a0Var14 = a0Var2;
                function6 = function18;
                a0Var3 = a0Var14;
                function7 = function2M512getLambda1$intercom_sdk_base_release;
                answer6 = answer5;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LongTextQuestionKt.LongTextQuestion$lambda$5(a0Var3, textQuestionModel, answer6, onAnswer, colors, validationError, function6, function7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 = androidx.profileinstaller.n.c.f73814m;
        i12 |= i15;
        i16 = i11 & 64;
        if (i16 != 0) {
            if ((3670016 & i10) == 0) {
                function3 = function1;
                if (c0VarR.k0(function3)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            i18 = i11 & 128;
            if (i18 != 0) {
                i12 |= 12582912;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i10 & 29360128) == 0) {
                    if (c0VarR.k0(function4)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
            }
            if ((i12 & 23967451) == 4793490) {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i21 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i18 != 0) {
                    function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
                } else {
                    function2M512getLambda1$intercom_sdk_base_release = function4;
                }
                aVar = androidx.compose.ui.e.f37317a;
                a1 a1VarK12 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                function0A = aVar14.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK12, aVar14.e());
                y7.n(c0VarD, b1VarK113, aVar14.g());
                function2B = aVar14.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN113, aVar14.f());
                androidx.compose.foundation.layout.d0 d0Var12 = androidx.compose.foundation.layout.d0.f15956a;
                aVar2 = androidx.compose.ui.a0.E;
                a1 a1VarB12 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK114 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, aVar2);
                function0A2 = aVar14.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarB12, aVar14.e());
                y7.n(c0VarD2, b1VarK114, aVar14.g());
                function2B2 = aVar14.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN114, aVar14.f());
                n0Var = n0.f16227a;
                function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                c0VarR.E(-497967796);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                String str12 = placeholder;
                c0VarR.A();
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                if (validationError instanceof ValidationError.ValidationStringError) {
                    q0VarN = null;
                } else {
                    q0VarN = null;
                }
                long jM732getAccessibleColorOnWhiteBackground8_81llA12 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                int iA12 = androidx.compose.ui.text.input.t.f41944b.a();
                int maxLine12 = textQuestionModel.getMaxLine();
                float fM466getMinHeightD9Ej5fM12 = textQuestionModel.m466getMinHeightD9Ej5fM();
                c0VarR.E(-497955273);
                answer5 = answer3;
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str12, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA12, maxLine12, false, function5, 0, iA12, false, null, false, fM466getMinHeightD9Ej5fM12, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                Function1<? super y3, Unit> function19 = function5;
                c0VarR.E(-497931568);
                if (textQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(answer5.getLength());
                    sb13.append('/');
                    sb13.append(textQuestionModel.getCharacterLimit());
                    q50.t(sb13.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.o();
                androidx.compose.ui.a0 a0Var15 = a0Var2;
                function6 = function19;
                a0Var3 = a0Var15;
                function7 = function2M512getLambda1$intercom_sdk_base_release;
                answer6 = answer5;
            } else {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i21 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i18 != 0) {
                    function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
                } else {
                    function2M512getLambda1$intercom_sdk_base_release = function4;
                }
                aVar = androidx.compose.ui.e.f37317a;
                a1 a1VarK13 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK115 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, a0Var2);
                androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                function0A = aVar15.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK13, aVar15.e());
                y7.n(c0VarD, b1VarK115, aVar15.g());
                function2B = aVar15.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN115, aVar15.f());
                androidx.compose.foundation.layout.d0 d0Var13 = androidx.compose.foundation.layout.d0.f15956a;
                aVar2 = androidx.compose.ui.a0.E;
                a1 a1VarB13 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK116 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, aVar2);
                function0A2 = aVar15.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarB13, aVar15.e());
                y7.n(c0VarD2, b1VarK116, aVar15.g());
                function2B2 = aVar15.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN116, aVar15.f());
                n0Var = n0.f16227a;
                function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                c0VarR.E(-497967796);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                String str13 = placeholder;
                c0VarR.A();
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                if (validationError instanceof ValidationError.ValidationStringError) {
                    q0VarN = null;
                } else {
                    q0VarN = null;
                }
                long jM732getAccessibleColorOnWhiteBackground8_81llA13 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                int iA13 = androidx.compose.ui.text.input.t.f41944b.a();
                int maxLine13 = textQuestionModel.getMaxLine();
                float fM466getMinHeightD9Ej5fM13 = textQuestionModel.m466getMinHeightD9Ej5fM();
                c0VarR.E(-497955273);
                answer5 = answer3;
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objI0 = c0VarR.i0();
                if (z10) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str13, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA13, maxLine13, false, function5, 0, iA13, false, null, false, fM466getMinHeightD9Ej5fM13, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                Function1<? super y3, Unit> function110 = function5;
                c0VarR.E(-497931568);
                if (textQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append(answer5.getLength());
                    sb14.append('/');
                    sb14.append(textQuestionModel.getCharacterLimit());
                    q50.t(sb14.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                    c0Var2 = c0VarR;
                } else {
                    c0Var2 = c0VarR;
                }
                c0Var2.A();
                c0Var2.o();
                c0Var2.o();
                androidx.compose.ui.a0 a0Var16 = a0Var2;
                function6 = function110;
                a0Var3 = a0Var16;
                function7 = function2M512getLambda1$intercom_sdk_base_release;
                answer6 = answer5;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LongTextQuestionKt.LongTextQuestion$lambda$5(a0Var3, textQuestionModel, answer6, onAnswer, colors, validationError, function6, function7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        function3 = function1;
        i18 = i11 & 128;
        if (i18 != 0) {
            i12 |= 12582912;
            function4 = function2;
        } else {
            function4 = function2;
            if ((i10 & 29360128) == 0) {
                if (c0VarR.k0(function4)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
        }
        if ((i12 & 23967451) == 4793490) {
            if (i20 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (i21 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i16 != 0) {
                function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                    }
                };
            } else {
                function5 = function3;
            }
            if (i18 != 0) {
                function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
            } else {
                function2M512getLambda1$intercom_sdk_base_release = function4;
            }
            aVar = androidx.compose.ui.e.f37317a;
            a1 a1VarK14 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK117 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0Var2);
            androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
            function0A = aVar16.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK14, aVar16.e());
            y7.n(c0VarD, b1VarK117, aVar16.g());
            function2B = aVar16.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN117, aVar16.f());
            androidx.compose.foundation.layout.d0 d0Var14 = androidx.compose.foundation.layout.d0.f15956a;
            aVar2 = androidx.compose.ui.a0.E;
            a1 a1VarB14 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK118 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, aVar2);
            function0A2 = aVar16.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarB14, aVar16.e());
            y7.n(c0VarD2, b1VarK118, aVar16.g());
            function2B2 = aVar16.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN118, aVar16.f());
            n0Var = n0.f16227a;
            function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
            l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            c0VarR.E(-497967796);
            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
            } else {
                placeholder = textQuestionModel.getPlaceholder();
            }
            String str14 = placeholder;
            c0VarR.A();
            if (answer3 instanceof Answer.SingleAnswer) {
                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
            } else {
                answer4 = "";
            }
            if (validationError instanceof ValidationError.ValidationStringError) {
                q0VarN = null;
            } else {
                q0VarN = null;
            }
            long jM732getAccessibleColorOnWhiteBackground8_81llA14 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
            int iA14 = androidx.compose.ui.text.input.t.f41944b.a();
            int maxLine14 = textQuestionModel.getMaxLine();
            float fM466getMinHeightD9Ej5fM14 = textQuestionModel.m466getMinHeightD9Ej5fM();
            c0VarR.E(-497955273);
            answer5 = answer3;
            if ((i12 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            objI0 = c0VarR.i0();
            if (z10) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str14, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA14, maxLine14, false, function5, 0, iA14, false, null, false, fM466getMinHeightD9Ej5fM14, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
            Function1<? super y3, Unit> function111 = function5;
            c0VarR.E(-497931568);
            if (textQuestionModel.getCharacterLimit() != null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(answer5.getLength());
                sb15.append('/');
                sb15.append(textQuestionModel.getCharacterLimit());
                q50.t(sb15.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                c0Var2 = c0VarR;
            } else {
                c0Var2 = c0VarR;
            }
            c0Var2.A();
            c0Var2.o();
            c0Var2.o();
            androidx.compose.ui.a0 a0Var17 = a0Var2;
            function6 = function111;
            a0Var3 = a0Var17;
            function7 = function2M512getLambda1$intercom_sdk_base_release;
            answer6 = answer5;
        } else {
            if (i20 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (i21 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i16 != 0) {
                function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LongTextQuestionKt.LongTextQuestion$lambda$0((y3) obj);
                    }
                };
            } else {
                function5 = function3;
            }
            if (i18 != 0) {
                function2M512getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m512getLambda1$intercom_sdk_base_release();
            } else {
                function2M512getLambda1$intercom_sdk_base_release = function4;
            }
            aVar = androidx.compose.ui.e.f37317a;
            a1 a1VarK15 = androidx.compose.foundation.layout.x.k(aVar.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK119 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, a0Var2);
            androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
            function0A = aVar17.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK15, aVar17.e());
            y7.n(c0VarD, b1VarK119, aVar17.g());
            function2B = aVar17.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN119, aVar17.f());
            androidx.compose.foundation.layout.d0 d0Var15 = androidx.compose.foundation.layout.d0.f15956a;
            aVar2 = androidx.compose.ui.a0.E;
            a1 a1VarB15 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar.u(), c0VarR, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1110 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, aVar2);
            function0A2 = aVar17.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarB15, aVar17.e());
            y7.n(c0VarD2, b1VarK1110, aVar17.g());
            function2B2 = aVar17.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN1110, aVar17.f());
            n0Var = n0.f16227a;
            function2M512getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
            l6.a(i6.i(aVar2, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            c0VarR.E(-497967796);
            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
            } else {
                placeholder = textQuestionModel.getPlaceholder();
            }
            String str15 = placeholder;
            c0VarR.A();
            if (answer3 instanceof Answer.SingleAnswer) {
                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
            } else {
                answer4 = "";
            }
            if (validationError instanceof ValidationError.ValidationStringError) {
                q0VarN = null;
            } else {
                q0VarN = null;
            }
            long jM732getAccessibleColorOnWhiteBackground8_81llA15 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
            int iA15 = androidx.compose.ui.text.input.t.f41944b.a();
            int maxLine15 = textQuestionModel.getMaxLine();
            float fM466getMinHeightD9Ej5fM15 = textQuestionModel.m466getMinHeightD9Ej5fM();
            c0VarR.E(-497955273);
            answer5 = answer3;
            if ((i12 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            objI0 = c0VarR.i0();
            if (z10) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LongTextQuestionKt.LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(onAnswer, (String) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str15, (Function1) objI0, q0VarN, jM732getAccessibleColorOnWhiteBackground8_81llA15, maxLine15, false, function5, 0, iA15, false, null, false, fM466getMinHeightD9Ej5fM15, c0VarR, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
            Function1<? super y3, Unit> function112 = function5;
            c0VarR.E(-497931568);
            if (textQuestionModel.getCharacterLimit() != null) {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(answer5.getLength());
                sb16.append('/');
                sb16.append(textQuestionModel.getCharacterLimit());
                q50.t(sb16.toString(), d5.v(n0Var.p(aVar2, aVar.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), s0.d(4285756278L), null, androidx.compose.ui.unit.a0.m(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24960, 0, 262120);
                c0Var2 = c0VarR;
            } else {
                c0Var2 = c0VarR;
            }
            c0Var2.A();
            c0Var2.o();
            c0Var2.o();
            androidx.compose.ui.a0 a0Var18 = a0Var2;
            function6 = function112;
            a0Var3 = a0Var18;
            function7 = function2M512getLambda1$intercom_sdk_base_release;
            answer6 = answer5;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LongTextQuestionKt.LongTextQuestion$lambda$5(a0Var3, textQuestionModel, answer6, onAnswer, colors, validationError, function6, function7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LongTextQuestion$lambda$0(y3 y3Var) {
        Intrinsics.checkNotNullParameter(y3Var, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(Function1 onAnswer, String it) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() > 0) {
            onAnswer.invoke(new Answer.SingleAnswer(it));
        } else {
            onAnswer.invoke(Answer.NoAnswer.ResetNoAnswer.INSTANCE);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LongTextQuestion$lambda$5(androidx.compose.ui.a0 a0Var, SurveyData.Step.Question.LongTextQuestionModel textQuestionModel, Answer answer, Function1 onAnswer, SurveyUiColors colors, ValidationError validationError, Function1 function1, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(textQuestionModel, "$textQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(colors, "$colors");
        Intrinsics.checkNotNullParameter(validationError, "$validationError");
        LongTextQuestion(a0Var, textQuestionModel, answer, onAnswer, colors, validationError, function1, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
