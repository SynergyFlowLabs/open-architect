package io.intercom.android.sdk.survey.ui.questiontype.text;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.text.y3;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.focus.p0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.CountryAreaCode;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import io.intercom.android.sdk.utilities.UtilsKt;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nShortTextQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortTextQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/text/ShortTextQuestionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,265:1\n1282#2,6:266\n1282#2,3:279\n1285#2,3:283\n1282#2,6:363\n607#3:272\n604#3,6:273\n605#4:282\n70#5:286\n67#5,9:287\n77#5:378\n80#6,6:296\n87#6,3:311\n90#6,2:320\n80#6,6:334\n87#6,3:349\n90#6,2:358\n94#6:373\n94#6:377\n391#7,9:302\n400#7:322\n391#7,9:340\n400#7:360\n401#7,2:371\n401#7,2:375\n4360#8,6:314\n4360#8,6:352\n87#9:323\n83#9,10:324\n94#9:374\n113#10:361\n113#10:369\n113#10:370\n75#11:362\n*S KotlinDebug\n*F\n+ 1 ShortTextQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/text/ShortTextQuestionKt\n*L\n64#1:266,6\n65#1:279,3\n65#1:283,3\n122#1:363,6\n65#1:272\n65#1:273,6\n65#1:282\n66#1:286\n66#1:287,9\n66#1:378\n66#1:296,6\n66#1:311,3\n66#1:320,2\n77#1:334,6\n77#1:349,3\n77#1:358,2\n77#1:373\n66#1:377\n66#1:302,9\n66#1:322\n77#1:340,9\n77#1:360\n77#1:371,2\n66#1:375,2\n66#1:314,6\n77#1:352,6\n77#1:323\n77#1:324,10\n77#1:374\n79#1:361\n154#1:369\n164#1:370\n97#1:362\n*E\n"})
public final class ShortTextQuestionKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionValidation.ValidationType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ShortTextAnsweredPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1590545552);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m515getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShortTextQuestionKt.ShortTextAnsweredPreview$lambda$10(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextAnsweredPreview$lambda$10(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ShortTextAnsweredPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ShortTextDisabledPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1539795729);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m517getLambda5$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShortTextQuestionKt.ShortTextDisabledPreview$lambda$12(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextDisabledPreview$lambda$12(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ShortTextDisabledPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ShortTextPhoneNumberPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-38271892);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m516getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShortTextQuestionKt.ShortTextPhoneNumberPreview$lambda$11(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextPhoneNumberPreview$lambda$11(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ShortTextPhoneNumberPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ShortTextPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2147193389);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m514getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShortTextQuestionKt.ShortTextPreview$lambda$9(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextPreview$lambda$9(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ShortTextPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0150  */
    /* JADX WARN: Code duplicated, block: B:103:0x0164  */
    /* JADX WARN: Code duplicated, block: B:106:0x017a  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:121:0x0238  */
    /* JADX WARN: Code duplicated, block: B:124:0x0244  */
    /* JADX WARN: Code duplicated, block: B:125:0x0248  */
    /* JADX WARN: Code duplicated, block: B:128:0x0269  */
    /* JADX WARN: Code duplicated, block: B:130:0x0277  */
    /* JADX WARN: Code duplicated, block: B:133:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:135:0x02bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:140:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:141:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:143:0x02de  */
    /* JADX WARN: Code duplicated, block: B:146:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:150:0x0300  */
    /* JADX WARN: Code duplicated, block: B:151:0x030e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0328  */
    /* JADX WARN: Code duplicated, block: B:156:0x033d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0346  */
    /* JADX WARN: Code duplicated, block: B:160:0x0352  */
    /* JADX WARN: Code duplicated, block: B:163:0x037b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0385  */
    /* JADX WARN: Code duplicated, block: B:173:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:178:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:181:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:182:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:185:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:187:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:190:0x0429  */
    /* JADX WARN: Code duplicated, block: B:192:0x042d  */
    /* JADX WARN: Code duplicated, block: B:198:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:202:0x0521  */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00df  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:79:0x0101  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x011c  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0130  */
    /* JADX WARN: Code duplicated, block: B:93:0x0135  */
    /* JADX WARN: Code duplicated, block: B:94:0x0138  */
    /* JADX WARN: Code duplicated, block: B:96:0x013b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0143  */
    /* JADX WARN: Code duplicated, block: B:99:0x0149  */
    /* JADX WARN: Instruction removed from duplicated block: B:160:0x0352, please report this as an issue */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ShortTextQuestion(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final SurveyData.Step.Question.ShortTextQuestionModel textQuestionModel, @Nullable Answer answer, @NotNull final Function1<? super Answer, Unit> onAnswer, @NotNull final SurveyUiColors colors, @NotNull final ValidationError validationError, @Nullable Function1<? super y3, Unit> function1, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
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
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2M513getLambda1$intercom_sdk_base_release;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        Object objI1;
        androidx.compose.ui.e.a aVar2;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.ui.a0.a aVar3;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        n0 n0Var;
        int i20;
        int iG;
        String answer4;
        String placeholder;
        q0 q0VarN;
        androidx.compose.runtime.internal.c cVarE;
        boolean z10;
        Answer answer5;
        boolean z11;
        Object objI2;
        final Function1<? super y3, Unit> function6;
        SurveyData.Step.Question.QuestionValidation.ValidationType validationType;
        Integer characterLimit;
        final androidx.compose.ui.a0 a0Var3;
        final Answer answer6;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        Locale localeCompat;
        final CountryAreaCode countryAreaCodeFromLocale;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(textQuestionModel, "textQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(validationError, "validationError");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(13974558);
        int i21 = i11 & 1;
        if (i21 != 0) {
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
        int i22 = i11 & 4;
        if (i22 == 0) {
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
                    i12 |= 1572864;
                    function3 = function1;
                } else {
                    function3 = function1;
                    if ((i10 & 3670016) == 0) {
                        if (c0VarR.k0(function3)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
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
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i22 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i16 != 0) {
                        function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.p
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$0((y3) obj);
                            }
                        };
                    } else {
                        function5 = function3;
                    }
                    if (i18 != 0) {
                        function2M513getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m513getLambda1$intercom_sdk_base_release();
                    } else {
                        function2M513getLambda1$intercom_sdk_base_release = function4;
                    }
                    c0VarR.E(-1483108825);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.foundation.relocation.d.a();
                        c0VarR.Y(objI0);
                    }
                    final androidx.compose.foundation.relocation.a aVar4 = (androidx.compose.foundation.relocation.a) objI0;
                    c0VarR.A();
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    final s0 s0Var = (s0) objI1;
                    androidx.compose.ui.a0 a0VarA = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(a0Var2, aVar4), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$2(s0Var, aVar4, (p0) obj);
                        }
                    });
                    aVar2 = androidx.compose.ui.e.f37317a;
                    a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarA);
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
                    y7.n(c0VarD, a1VarK, aVar5.e());
                    y7.n(c0VarD, b1VarK, aVar5.g());
                    function2B = aVar5.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar5.f());
                    androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    aVar3 = androidx.compose.ui.a0.E;
                    a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar2.u(), c0VarR, 0);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK2 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar3);
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
                    y7.n(c0VarD2, a1VarB, aVar5.e());
                    y7.n(c0VarD2, b1VarK2, aVar5.g());
                    function2B2 = aVar5.b();
                    if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN2, aVar5.f());
                    n0Var = n0.f16227a;
                    function2M513getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                    l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                    i20 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i20 == 1) {
                        iG = androidx.compose.ui.text.input.b0.f41811b.g();
                    } else if (i20 == 2) {
                        iG = androidx.compose.ui.text.input.b0.f41811b.e();
                    } else if (i20 == 3) {
                        iG = androidx.compose.ui.text.input.b0.f41811b.m();
                    } else if (i20 != 4) {
                        iG = androidx.compose.ui.text.input.b0.f41811b.o();
                    } else {
                        iG = androidx.compose.ui.text.input.b0.f41811b.g();
                    }
                    int i23 = iG;
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = "";
                    }
                    c0VarR.E(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c0VarR.A();
                    c0VarR.E(1720978057);
                    q0VarN = null;
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                        PhoneNumberValidator.loadCountryAreaCodes(context);
                        localeCompat = UtilsKt.getLocaleCompat(context);
                        if (answer3 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer4));
                        }
                        if (answer3 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer4 = '+' + countryAreaCodeFromLocale.getDialCode();
                        }
                        placeholder = "+1 123 456 7890";
                        cVarE = androidx.compose.runtime.internal.w.e(854302399, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                                invoke(c0Var2, num.intValue());
                                return Unit.f312394a;
                            }

                            @androidx.compose.runtime.o
                            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(androidx.compose.runtime.c0 c0Var2, int i24) {
                                if ((i24 & 11) == 2 && c0Var2.d()) {
                                    c0Var2.u();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                Intrinsics.checkNotNullExpressionValue(emoji, "getEmoji(...)");
                                q50.t(emoji, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, 0, 0, 262142);
                            }
                        }, c0VarR, 54);
                    } else {
                        cVarE = null;
                    }
                    String str = placeholder;
                    c0VarR.A();
                    if ((validationError instanceof ValidationError.ValidationStringError) && !(answer3 instanceof Answer.NoAnswer.InitialNoAnswer) && ((ValidationError.ValidationStringError) validationError).getStringRes() != R.string.intercom_surveys_required_response) {
                        q0VarN = q0.n(q0.f38131b.q());
                    }
                    q0 q0Var = q0VarN;
                    long jM732getAccessibleColorOnWhiteBackground8_81llA = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                    if (textQuestionModel.getEnabled() || !(validationError instanceof ValidationError.NoValidationError) || (answer3 instanceof Answer.NoAnswer)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int iG2 = androidx.compose.ui.text.input.t.f41944b.g();
                    boolean enabled = textQuestionModel.getEnabled();
                    c0VarR.E(1721011229);
                    answer5 = answer3;
                    if ((i12 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z11 || objI2 == aVar.a()) {
                        objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.r
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(onAnswer, (String) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    c0VarR.A();
                    TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str, (Function1) objI2, q0Var, jM732getAccessibleColorOnWhiteBackground8_81llA, 0, true, function5, i23, iG2, z10, cVarE, enabled, 0.0f, c0VarR, ((i12 << 3) & 29360128) | 806879232, 0, 8224);
                    function6 = function5;
                    validationType = textQuestionModel.getValidationType();
                    c0VarR.E(1721048023);
                    if ((validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION || validationType == SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT) && (characterLimit = textQuestionModel.getCharacterLimit()) != null) {
                        int iIntValue = characterLimit.intValue();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(answer5.getLength());
                        sb2.append('/');
                        sb2.append(iIntValue);
                        q50.t(sb2.toString(), d5.v(n0Var.p(aVar3, aVar2.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24576, 0, 262120);
                        Unit unit = Unit.f312394a;
                    }
                    c0VarR.A();
                    c0VarR.E(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strD = u0.i.d(R.string.intercom_tickets_email_copy, c0VarR, 0);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i24 = IntercomTheme.$stable;
                        q50.t(strD, d5.v(aVar3, 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), intercomTheme.getColors(c0VarR, i24).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i24).getType04(), c0VarR, 48, 0, 131064);
                    }
                    c0VarR.A();
                    c0VarR.o();
                    c0VarR.o();
                    a0Var3 = a0Var2;
                    answer6 = answer5;
                    function7 = function2M513getLambda1$intercom_sdk_base_release;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    function6 = function3;
                    function7 = function4;
                    answer6 = answer2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.s
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$8(a0Var3, textQuestionModel, answer6, onAnswer, colors, validationError, function6, function7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 = androidx.profileinstaller.n.c.f73814m;
            i12 |= i15;
            i16 = i11 & 64;
            if (i16 != 0) {
                i12 |= 1572864;
                function3 = function1;
            } else {
                function3 = function1;
                if ((i10 & 3670016) == 0) {
                    if (c0VarR.k0(function3)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
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
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i22 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i18 != 0) {
                    function2M513getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m513getLambda1$intercom_sdk_base_release();
                } else {
                    function2M513getLambda1$intercom_sdk_base_release = function4;
                }
                c0VarR.E(-1483108825);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.relocation.d.a();
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.relocation.a aVar6 = (androidx.compose.foundation.relocation.a) objI0;
                c0VarR.A();
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                final s0 s0Var2 = (s0) objI1;
                androidx.compose.ui.a0 a0VarA2 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(a0Var2, aVar6), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$2(s0Var2, aVar6, (p0) obj);
                    }
                });
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarA2);
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
                y7.n(c0VarD, a1VarK2, aVar7.e());
                y7.n(c0VarD, b1VarK3, aVar7.g());
                function2B = aVar7.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN3, aVar7.f());
                androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                aVar3 = androidx.compose.ui.a0.E;
                a1 a1VarB2 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar2.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK4 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, aVar3);
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
                y7.n(c0VarD2, a1VarB2, aVar7.e());
                y7.n(c0VarD2, b1VarK4, aVar7.g());
                function2B2 = aVar7.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN4, aVar7.f());
                n0Var = n0.f16227a;
                function2M513getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                i20 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                if (i20 == 1) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.g();
                } else if (i20 == 2) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.e();
                } else if (i20 == 3) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.m();
                } else if (i20 != 4) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.o();
                } else {
                    iG = androidx.compose.ui.text.input.b0.f41811b.g();
                }
                int i25 = iG;
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                c0VarR.E(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c0VarR.A();
                c0VarR.E(1720978057);
                q0VarN = null;
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context2 = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    PhoneNumberValidator.loadCountryAreaCodes(context2);
                    localeCompat = UtilsKt.getLocaleCompat(context2);
                    if (answer3 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer4));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer3 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer4 = '+' + countryAreaCodeFromLocale.getDialCode();
                    }
                    placeholder = "+1 123 456 7890";
                    cVarE = androidx.compose.runtime.internal.w.e(854302399, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                            invoke(c0Var2, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var2, int i26) {
                            if ((i26 & 11) == 2 && c0Var2.d()) {
                                c0Var2.u();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            Intrinsics.checkNotNullExpressionValue(emoji, "getEmoji(...)");
                            q50.t(emoji, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, 0, 0, 262142);
                        }
                    }, c0VarR, 54);
                } else {
                    cVarE = null;
                }
                String str2 = placeholder;
                c0VarR.A();
                if (validationError instanceof ValidationError.ValidationStringError) {
                    q0VarN = q0.n(q0.f38131b.q());
                }
                q0 q0Var2 = q0VarN;
                long jM732getAccessibleColorOnWhiteBackground8_81llA2 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                int iG3 = androidx.compose.ui.text.input.t.f41944b.g();
                boolean enabled2 = textQuestionModel.getEnabled();
                c0VarR.E(1721011229);
                answer5 = answer3;
                if ((i12 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI2 = c0VarR.i0();
                if (z11) {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str2, (Function1) objI2, q0Var2, jM732getAccessibleColorOnWhiteBackground8_81llA2, 0, true, function5, i25, iG3, z10, cVarE, enabled2, 0.0f, c0VarR, ((i12 << 3) & 29360128) | 806879232, 0, 8224);
                function6 = function5;
                validationType = textQuestionModel.getValidationType();
                c0VarR.E(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue2 = characterLimit.intValue();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(answer5.getLength());
                    sb3.append('/');
                    sb3.append(iIntValue2);
                    q50.t(sb3.toString(), d5.v(n0Var.p(aVar3, aVar2.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24576, 0, 262120);
                    Unit unit2 = Unit.f312394a;
                } else {
                    int iIntValue3 = characterLimit.intValue();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(answer5.getLength());
                    sb4.append('/');
                    sb4.append(iIntValue3);
                    q50.t(sb4.toString(), d5.v(n0Var.p(aVar3, aVar2.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24576, 0, 262120);
                    Unit unit3 = Unit.f312394a;
                }
                c0VarR.A();
                c0VarR.E(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strD2 = u0.i.d(R.string.intercom_tickets_email_copy, c0VarR, 0);
                    IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                    int i26 = IntercomTheme.$stable;
                    q50.t(strD2, d5.v(aVar3, 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), intercomTheme2.getColors(c0VarR, i26).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c0VarR, i26).getType04(), c0VarR, 48, 0, 131064);
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.o();
                a0Var3 = a0Var2;
                answer6 = answer5;
                function7 = function2M513getLambda1$intercom_sdk_base_release;
            } else {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i22 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i18 != 0) {
                    function2M513getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m513getLambda1$intercom_sdk_base_release();
                } else {
                    function2M513getLambda1$intercom_sdk_base_release = function4;
                }
                c0VarR.E(-1483108825);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.relocation.d.a();
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.relocation.a aVar8 = (androidx.compose.foundation.relocation.a) objI0;
                c0VarR.A();
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                final s0 s0Var3 = (s0) objI1;
                androidx.compose.ui.a0 a0VarA3 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(a0Var2, aVar8), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$2(s0Var3, aVar8, (p0) obj);
                    }
                });
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK5 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarA3);
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
                y7.n(c0VarD, a1VarK3, aVar9.e());
                y7.n(c0VarD, b1VarK5, aVar9.g());
                function2B = aVar9.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN5, aVar9.f());
                androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                aVar3 = androidx.compose.ui.a0.E;
                a1 a1VarB3 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar2.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK6 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, aVar3);
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
                y7.n(c0VarD2, a1VarB3, aVar9.e());
                y7.n(c0VarD2, b1VarK6, aVar9.g());
                function2B2 = aVar9.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN6, aVar9.f());
                n0Var = n0.f16227a;
                function2M513getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                i20 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                if (i20 == 1) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.g();
                } else if (i20 == 2) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.e();
                } else if (i20 == 3) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.m();
                } else if (i20 != 4) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.o();
                } else {
                    iG = androidx.compose.ui.text.input.b0.f41811b.g();
                }
                int i27 = iG;
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                c0VarR.E(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c0VarR.A();
                c0VarR.E(1720978057);
                q0VarN = null;
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context3 = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    PhoneNumberValidator.loadCountryAreaCodes(context3);
                    localeCompat = UtilsKt.getLocaleCompat(context3);
                    if (answer3 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer4));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer3 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer4 = '+' + countryAreaCodeFromLocale.getDialCode();
                    }
                    placeholder = "+1 123 456 7890";
                    cVarE = androidx.compose.runtime.internal.w.e(854302399, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                            invoke(c0Var2, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var2, int i28) {
                            if ((i28 & 11) == 2 && c0Var2.d()) {
                                c0Var2.u();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            Intrinsics.checkNotNullExpressionValue(emoji, "getEmoji(...)");
                            q50.t(emoji, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, 0, 0, 262142);
                        }
                    }, c0VarR, 54);
                } else {
                    cVarE = null;
                }
                String str3 = placeholder;
                c0VarR.A();
                if (validationError instanceof ValidationError.ValidationStringError) {
                    q0VarN = q0.n(q0.f38131b.q());
                }
                q0 q0Var3 = q0VarN;
                long jM732getAccessibleColorOnWhiteBackground8_81llA3 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                int iG4 = androidx.compose.ui.text.input.t.f41944b.g();
                boolean enabled3 = textQuestionModel.getEnabled();
                c0VarR.E(1721011229);
                answer5 = answer3;
                if ((i12 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI2 = c0VarR.i0();
                if (z11) {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str3, (Function1) objI2, q0Var3, jM732getAccessibleColorOnWhiteBackground8_81llA3, 0, true, function5, i27, iG4, z10, cVarE, enabled3, 0.0f, c0VarR, ((i12 << 3) & 29360128) | 806879232, 0, 8224);
                function6 = function5;
                validationType = textQuestionModel.getValidationType();
                c0VarR.E(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue4 = characterLimit.intValue();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(answer5.getLength());
                    sb5.append('/');
                    sb5.append(iIntValue4);
                    q50.t(sb5.toString(), d5.v(n0Var.p(aVar3, aVar2.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24576, 0, 262120);
                    Unit unit4 = Unit.f312394a;
                } else {
                    int iIntValue5 = characterLimit.intValue();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(answer5.getLength());
                    sb6.append('/');
                    sb6.append(iIntValue5);
                    q50.t(sb6.toString(), d5.v(n0Var.p(aVar3, aVar2.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24576, 0, 262120);
                    Unit unit5 = Unit.f312394a;
                }
                c0VarR.A();
                c0VarR.E(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strD3 = u0.i.d(R.string.intercom_tickets_email_copy, c0VarR, 0);
                    IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                    int i28 = IntercomTheme.$stable;
                    q50.t(strD3, d5.v(aVar3, 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), intercomTheme3.getColors(c0VarR, i28).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c0VarR, i28).getType04(), c0VarR, 48, 0, 131064);
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.o();
                a0Var3 = a0Var2;
                answer6 = answer5;
                function7 = function2M513getLambda1$intercom_sdk_base_release;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.s
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$8(a0Var3, textQuestionModel, answer6, onAnswer, colors, validationError, function6, function7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                i12 |= 1572864;
                function3 = function1;
            } else {
                function3 = function1;
                if ((i10 & 3670016) == 0) {
                    if (c0VarR.k0(function3)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
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
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i22 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i18 != 0) {
                    function2M513getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m513getLambda1$intercom_sdk_base_release();
                } else {
                    function2M513getLambda1$intercom_sdk_base_release = function4;
                }
                c0VarR.E(-1483108825);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.relocation.d.a();
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.relocation.a aVar10 = (androidx.compose.foundation.relocation.a) objI0;
                c0VarR.A();
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                final s0 s0Var4 = (s0) objI1;
                androidx.compose.ui.a0 a0VarA4 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(a0Var2, aVar10), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$2(s0Var4, aVar10, (p0) obj);
                    }
                });
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarK4 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK7 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarA4);
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
                y7.n(c0VarD, a1VarK4, aVar11.e());
                y7.n(c0VarD, b1VarK7, aVar11.g());
                function2B = aVar11.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN7, aVar11.f());
                androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                aVar3 = androidx.compose.ui.a0.E;
                a1 a1VarB4 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar2.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK8 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, aVar3);
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
                y7.n(c0VarD2, a1VarB4, aVar11.e());
                y7.n(c0VarD2, b1VarK8, aVar11.g());
                function2B2 = aVar11.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN8, aVar11.f());
                n0Var = n0.f16227a;
                function2M513getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                i20 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                if (i20 == 1) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.g();
                } else if (i20 == 2) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.e();
                } else if (i20 == 3) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.m();
                } else if (i20 != 4) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.o();
                } else {
                    iG = androidx.compose.ui.text.input.b0.f41811b.g();
                }
                int i29 = iG;
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                c0VarR.E(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c0VarR.A();
                c0VarR.E(1720978057);
                q0VarN = null;
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context4 = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    PhoneNumberValidator.loadCountryAreaCodes(context4);
                    localeCompat = UtilsKt.getLocaleCompat(context4);
                    if (answer3 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer4));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer3 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer4 = '+' + countryAreaCodeFromLocale.getDialCode();
                    }
                    placeholder = "+1 123 456 7890";
                    cVarE = androidx.compose.runtime.internal.w.e(854302399, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                            invoke(c0Var2, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var2, int i210) {
                            if ((i210 & 11) == 2 && c0Var2.d()) {
                                c0Var2.u();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            Intrinsics.checkNotNullExpressionValue(emoji, "getEmoji(...)");
                            q50.t(emoji, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, 0, 0, 262142);
                        }
                    }, c0VarR, 54);
                } else {
                    cVarE = null;
                }
                String str4 = placeholder;
                c0VarR.A();
                if (validationError instanceof ValidationError.ValidationStringError) {
                    q0VarN = q0.n(q0.f38131b.q());
                }
                q0 q0Var4 = q0VarN;
                long jM732getAccessibleColorOnWhiteBackground8_81llA4 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                int iG5 = androidx.compose.ui.text.input.t.f41944b.g();
                boolean enabled4 = textQuestionModel.getEnabled();
                c0VarR.E(1721011229);
                answer5 = answer3;
                if ((i12 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI2 = c0VarR.i0();
                if (z11) {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str4, (Function1) objI2, q0Var4, jM732getAccessibleColorOnWhiteBackground8_81llA4, 0, true, function5, i29, iG5, z10, cVarE, enabled4, 0.0f, c0VarR, ((i12 << 3) & 29360128) | 806879232, 0, 8224);
                function6 = function5;
                validationType = textQuestionModel.getValidationType();
                c0VarR.E(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue6 = characterLimit.intValue();
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(answer5.getLength());
                    sb7.append('/');
                    sb7.append(iIntValue6);
                    q50.t(sb7.toString(), d5.v(n0Var.p(aVar3, aVar2.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24576, 0, 262120);
                    Unit unit6 = Unit.f312394a;
                } else {
                    int iIntValue7 = characterLimit.intValue();
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(answer5.getLength());
                    sb8.append('/');
                    sb8.append(iIntValue7);
                    q50.t(sb8.toString(), d5.v(n0Var.p(aVar3, aVar2.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24576, 0, 262120);
                    Unit unit7 = Unit.f312394a;
                }
                c0VarR.A();
                c0VarR.E(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strD4 = u0.i.d(R.string.intercom_tickets_email_copy, c0VarR, 0);
                    IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                    int i210 = IntercomTheme.$stable;
                    q50.t(strD4, d5.v(aVar3, 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), intercomTheme4.getColors(c0VarR, i210).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme4.getTypography(c0VarR, i210).getType04(), c0VarR, 48, 0, 131064);
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.o();
                a0Var3 = a0Var2;
                answer6 = answer5;
                function7 = function2M513getLambda1$intercom_sdk_base_release;
            } else {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i22 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$0((y3) obj);
                        }
                    };
                } else {
                    function5 = function3;
                }
                if (i18 != 0) {
                    function2M513getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m513getLambda1$intercom_sdk_base_release();
                } else {
                    function2M513getLambda1$intercom_sdk_base_release = function4;
                }
                c0VarR.E(-1483108825);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.foundation.relocation.d.a();
                    c0VarR.Y(objI0);
                }
                final androidx.compose.foundation.relocation.a aVar12 = (androidx.compose.foundation.relocation.a) objI0;
                c0VarR.A();
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                final s0 s0Var5 = (s0) objI1;
                androidx.compose.ui.a0 a0VarA5 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(a0Var2, aVar12), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$2(s0Var5, aVar12, (p0) obj);
                    }
                });
                aVar2 = androidx.compose.ui.e.f37317a;
                a1 a1VarK5 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK9 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarA5);
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
                y7.n(c0VarD, a1VarK5, aVar13.e());
                y7.n(c0VarD, b1VarK9, aVar13.g());
                function2B = aVar13.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN9, aVar13.f());
                androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                aVar3 = androidx.compose.ui.a0.E;
                a1 a1VarB5 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar2.u(), c0VarR, 0);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK10 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, aVar3);
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
                y7.n(c0VarD2, a1VarB5, aVar13.e());
                y7.n(c0VarD2, b1VarK10, aVar13.g());
                function2B2 = aVar13.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN10, aVar13.f());
                n0Var = n0.f16227a;
                function2M513getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
                l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
                i20 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                if (i20 == 1) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.g();
                } else if (i20 == 2) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.e();
                } else if (i20 == 3) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.m();
                } else if (i20 != 4) {
                    iG = androidx.compose.ui.text.input.b0.f41811b.o();
                } else {
                    iG = androidx.compose.ui.text.input.b0.f41811b.g();
                }
                int i211 = iG;
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                c0VarR.E(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c0VarR.A();
                c0VarR.E(1720978057);
                q0VarN = null;
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context5 = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                    PhoneNumberValidator.loadCountryAreaCodes(context5);
                    localeCompat = UtilsKt.getLocaleCompat(context5);
                    if (answer3 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer4));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer3 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer4 = '+' + countryAreaCodeFromLocale.getDialCode();
                    }
                    placeholder = "+1 123 456 7890";
                    cVarE = androidx.compose.runtime.internal.w.e(854302399, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                            invoke(c0Var2, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.runtime.c0 c0Var2, int i212) {
                            if ((i212 & 11) == 2 && c0Var2.d()) {
                                c0Var2.u();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            Intrinsics.checkNotNullExpressionValue(emoji, "getEmoji(...)");
                            q50.t(emoji, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, 0, 0, 262142);
                        }
                    }, c0VarR, 54);
                } else {
                    cVarE = null;
                }
                String str5 = placeholder;
                c0VarR.A();
                if (validationError instanceof ValidationError.ValidationStringError) {
                    q0VarN = q0.n(q0.f38131b.q());
                }
                q0 q0Var5 = q0VarN;
                long jM732getAccessibleColorOnWhiteBackground8_81llA5 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                int iG6 = androidx.compose.ui.text.input.t.f41944b.g();
                boolean enabled5 = textQuestionModel.getEnabled();
                c0VarR.E(1721011229);
                answer5 = answer3;
                if ((i12 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI2 = c0VarR.i0();
                if (z11) {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(onAnswer, (String) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                c0VarR.A();
                TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str5, (Function1) objI2, q0Var5, jM732getAccessibleColorOnWhiteBackground8_81llA5, 0, true, function5, i211, iG6, z10, cVarE, enabled5, 0.0f, c0VarR, ((i12 << 3) & 29360128) | 806879232, 0, 8224);
                function6 = function5;
                validationType = textQuestionModel.getValidationType();
                c0VarR.E(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue8 = characterLimit.intValue();
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(answer5.getLength());
                    sb9.append('/');
                    sb9.append(iIntValue8);
                    q50.t(sb9.toString(), d5.v(n0Var.p(aVar3, aVar2.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24576, 0, 262120);
                    Unit unit8 = Unit.f312394a;
                } else {
                    int iIntValue9 = characterLimit.intValue();
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(answer5.getLength());
                    sb10.append('/');
                    sb10.append(iIntValue9);
                    q50.t(sb10.toString(), d5.v(n0Var.p(aVar3, aVar2.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24576, 0, 262120);
                    Unit unit9 = Unit.f312394a;
                }
                c0VarR.A();
                c0VarR.E(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strD5 = u0.i.d(R.string.intercom_tickets_email_copy, c0VarR, 0);
                    IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                    int i212 = IntercomTheme.$stable;
                    q50.t(strD5, d5.v(aVar3, 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), intercomTheme5.getColors(c0VarR, i212).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme5.getTypography(c0VarR, i212).getType04(), c0VarR, 48, 0, 131064);
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.o();
                a0Var3 = a0Var2;
                answer6 = answer5;
                function7 = function2M513getLambda1$intercom_sdk_base_release;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.s
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$8(a0Var3, textQuestionModel, answer6, onAnswer, colors, validationError, function6, function7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 = androidx.profileinstaller.n.c.f73814m;
        i12 |= i15;
        i16 = i11 & 64;
        if (i16 != 0) {
            i12 |= 1572864;
            function3 = function1;
        } else {
            function3 = function1;
            if ((i10 & 3670016) == 0) {
                if (c0VarR.k0(function3)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
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
            if (i21 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (i22 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i16 != 0) {
                function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$0((y3) obj);
                    }
                };
            } else {
                function5 = function3;
            }
            if (i18 != 0) {
                function2M513getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m513getLambda1$intercom_sdk_base_release();
            } else {
                function2M513getLambda1$intercom_sdk_base_release = function4;
            }
            c0VarR.E(-1483108825);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.foundation.relocation.d.a();
                c0VarR.Y(objI0);
            }
            final androidx.compose.foundation.relocation.a aVar14 = (androidx.compose.foundation.relocation.a) objI0;
            c0VarR.A();
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI1);
            }
            final s0 s0Var6 = (s0) objI1;
            androidx.compose.ui.a0 a0VarA6 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(a0Var2, aVar14), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTextQuestionKt.ShortTextQuestion$lambda$2(s0Var6, aVar14, (p0) obj);
                }
            });
            aVar2 = androidx.compose.ui.e.f37317a;
            a1 a1VarK6 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK11 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarA6);
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
            y7.n(c0VarD, a1VarK6, aVar15.e());
            y7.n(c0VarD, b1VarK11, aVar15.g());
            function2B = aVar15.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN11, aVar15.f());
            androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
            aVar3 = androidx.compose.ui.a0.E;
            a1 a1VarB6 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar2.u(), c0VarR, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK12 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, aVar3);
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
            y7.n(c0VarD2, a1VarB6, aVar15.e());
            y7.n(c0VarD2, b1VarK12, aVar15.g());
            function2B2 = aVar15.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN12, aVar15.f());
            n0Var = n0.f16227a;
            function2M513getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
            l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            i20 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
            if (i20 == 1) {
                iG = androidx.compose.ui.text.input.b0.f41811b.g();
            } else if (i20 == 2) {
                iG = androidx.compose.ui.text.input.b0.f41811b.e();
            } else if (i20 == 3) {
                iG = androidx.compose.ui.text.input.b0.f41811b.m();
            } else if (i20 != 4) {
                iG = androidx.compose.ui.text.input.b0.f41811b.o();
            } else {
                iG = androidx.compose.ui.text.input.b0.f41811b.g();
            }
            int i213 = iG;
            if (answer3 instanceof Answer.SingleAnswer) {
                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
            } else {
                answer4 = "";
            }
            c0VarR.E(1720968786);
            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
            } else {
                placeholder = textQuestionModel.getPlaceholder();
            }
            c0VarR.A();
            c0VarR.E(1720978057);
            q0VarN = null;
            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                Context context6 = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                PhoneNumberValidator.loadCountryAreaCodes(context6);
                localeCompat = UtilsKt.getLocaleCompat(context6);
                if (answer3 instanceof Answer.NoAnswer) {
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer4));
                } else {
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                }
                if (answer3 instanceof Answer.NoAnswer.InitialNoAnswer) {
                    answer4 = '+' + countryAreaCodeFromLocale.getDialCode();
                }
                placeholder = "+1 123 456 7890";
                cVarE = androidx.compose.runtime.internal.w.e(854302399, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var2, int i214) {
                        if ((i214 & 11) == 2 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        String emoji = countryAreaCodeFromLocale.getEmoji();
                        Intrinsics.checkNotNullExpressionValue(emoji, "getEmoji(...)");
                        q50.t(emoji, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, 0, 0, 262142);
                    }
                }, c0VarR, 54);
            } else {
                cVarE = null;
            }
            String str6 = placeholder;
            c0VarR.A();
            if (validationError instanceof ValidationError.ValidationStringError) {
                q0VarN = q0.n(q0.f38131b.q());
            }
            q0 q0Var6 = q0VarN;
            long jM732getAccessibleColorOnWhiteBackground8_81llA6 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
            if (textQuestionModel.getEnabled()) {
                z10 = false;
            } else {
                z10 = false;
            }
            int iG7 = androidx.compose.ui.text.input.t.f41944b.g();
            boolean enabled6 = textQuestionModel.getEnabled();
            c0VarR.E(1721011229);
            answer5 = answer3;
            if ((i12 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI2 = c0VarR.i0();
            if (z11) {
                objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(onAnswer, (String) obj);
                    }
                };
                c0VarR.Y(objI2);
            } else {
                objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(onAnswer, (String) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            c0VarR.A();
            TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str6, (Function1) objI2, q0Var6, jM732getAccessibleColorOnWhiteBackground8_81llA6, 0, true, function5, i213, iG7, z10, cVarE, enabled6, 0.0f, c0VarR, ((i12 << 3) & 29360128) | 806879232, 0, 8224);
            function6 = function5;
            validationType = textQuestionModel.getValidationType();
            c0VarR.E(1721048023);
            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                int iIntValue10 = characterLimit.intValue();
                StringBuilder sb11 = new StringBuilder();
                sb11.append(answer5.getLength());
                sb11.append('/');
                sb11.append(iIntValue10);
                q50.t(sb11.toString(), d5.v(n0Var.p(aVar3, aVar2.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24576, 0, 262120);
                Unit unit10 = Unit.f312394a;
            } else {
                int iIntValue11 = characterLimit.intValue();
                StringBuilder sb12 = new StringBuilder();
                sb12.append(answer5.getLength());
                sb12.append('/');
                sb12.append(iIntValue11);
                q50.t(sb12.toString(), d5.v(n0Var.p(aVar3, aVar2.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24576, 0, 262120);
                Unit unit11 = Unit.f312394a;
            }
            c0VarR.A();
            c0VarR.E(1721067384);
            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                String strD6 = u0.i.d(R.string.intercom_tickets_email_copy, c0VarR, 0);
                IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                int i214 = IntercomTheme.$stable;
                q50.t(strD6, d5.v(aVar3, 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), intercomTheme6.getColors(c0VarR, i214).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme6.getTypography(c0VarR, i214).getType04(), c0VarR, 48, 0, 131064);
            }
            c0VarR.A();
            c0VarR.o();
            c0VarR.o();
            a0Var3 = a0Var2;
            answer6 = answer5;
            function7 = function2M513getLambda1$intercom_sdk_base_release;
        } else {
            if (i21 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (i22 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i16 != 0) {
                function5 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$0((y3) obj);
                    }
                };
            } else {
                function5 = function3;
            }
            if (i18 != 0) {
                function2M513getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m513getLambda1$intercom_sdk_base_release();
            } else {
                function2M513getLambda1$intercom_sdk_base_release = function4;
            }
            c0VarR.E(-1483108825);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.foundation.relocation.d.a();
                c0VarR.Y(objI0);
            }
            final androidx.compose.foundation.relocation.a aVar16 = (androidx.compose.foundation.relocation.a) objI0;
            c0VarR.A();
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI1);
            }
            final s0 s0Var7 = (s0) objI1;
            androidx.compose.ui.a0 a0VarA7 = androidx.compose.ui.focus.i.a(androidx.compose.foundation.relocation.d.b(a0Var2, aVar16), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTextQuestionKt.ShortTextQuestion$lambda$2(s0Var7, aVar16, (p0) obj);
                }
            });
            aVar2 = androidx.compose.ui.e.f37317a;
            a1 a1VarK7 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK13 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarA7);
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
            y7.n(c0VarD, a1VarK7, aVar17.e());
            y7.n(c0VarD, b1VarK13, aVar17.g());
            function2B = aVar17.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN13, aVar17.f());
            androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
            aVar3 = androidx.compose.ui.a0.E;
            a1 a1VarB7 = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar2.u(), c0VarR, 0);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK14 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, aVar3);
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
            y7.n(c0VarD2, a1VarB7, aVar17.e());
            y7.n(c0VarD2, b1VarK14, aVar17.g());
            function2B2 = aVar17.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN14, aVar17.f());
            n0Var = n0.f16227a;
            function2M513getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i12 >> 21) & 14));
            l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(8)), c0VarR, 6);
            i20 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
            if (i20 == 1) {
                iG = androidx.compose.ui.text.input.b0.f41811b.g();
            } else if (i20 == 2) {
                iG = androidx.compose.ui.text.input.b0.f41811b.e();
            } else if (i20 == 3) {
                iG = androidx.compose.ui.text.input.b0.f41811b.m();
            } else if (i20 != 4) {
                iG = androidx.compose.ui.text.input.b0.f41811b.o();
            } else {
                iG = androidx.compose.ui.text.input.b0.f41811b.g();
            }
            int i215 = iG;
            if (answer3 instanceof Answer.SingleAnswer) {
                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
            } else {
                answer4 = "";
            }
            c0VarR.E(1720968786);
            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                placeholder = u0.i.d(textQuestionModel.getPlaceHolderStringRes().intValue(), c0VarR, 0);
            } else {
                placeholder = textQuestionModel.getPlaceholder();
            }
            c0VarR.A();
            c0VarR.E(1720978057);
            q0VarN = null;
            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                Context context7 = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
                PhoneNumberValidator.loadCountryAreaCodes(context7);
                localeCompat = UtilsKt.getLocaleCompat(context7);
                if (answer3 instanceof Answer.NoAnswer) {
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer4));
                } else {
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                }
                if (answer3 instanceof Answer.NoAnswer.InitialNoAnswer) {
                    answer4 = '+' + countryAreaCodeFromLocale.getDialCode();
                }
                placeholder = "+1 123 456 7890";
                cVarE = androidx.compose.runtime.internal.w.e(854302399, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                        invoke(c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.runtime.c0 c0Var2, int i216) {
                        if ((i216 & 11) == 2 && c0Var2.d()) {
                            c0Var2.u();
                            return;
                        }
                        String emoji = countryAreaCodeFromLocale.getEmoji();
                        Intrinsics.checkNotNullExpressionValue(emoji, "getEmoji(...)");
                        q50.t(emoji, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0Var2, 0, 0, 262142);
                    }
                }, c0VarR, 54);
            } else {
                cVarE = null;
            }
            String str7 = placeholder;
            c0VarR.A();
            if (validationError instanceof ValidationError.ValidationStringError) {
                q0VarN = q0.n(q0.f38131b.q());
            }
            q0 q0Var7 = q0VarN;
            long jM732getAccessibleColorOnWhiteBackground8_81llA7 = ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(colors.m423getButton0d7_KjU());
            if (textQuestionModel.getEnabled()) {
                z10 = false;
            } else {
                z10 = false;
            }
            int iG8 = androidx.compose.ui.text.input.t.f41944b.g();
            boolean enabled7 = textQuestionModel.getEnabled();
            c0VarR.E(1721011229);
            answer5 = answer3;
            if ((i12 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI2 = c0VarR.i0();
            if (z11) {
                objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(onAnswer, (String) obj);
                    }
                };
                c0VarR.Y(objI2);
            } else {
                objI2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(onAnswer, (String) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            c0VarR.A();
            TextInputPillKt.m523TextInputPillg5ZjG94(answer4, str7, (Function1) objI2, q0Var7, jM732getAccessibleColorOnWhiteBackground8_81llA7, 0, true, function5, i215, iG8, z10, cVarE, enabled7, 0.0f, c0VarR, ((i12 << 3) & 29360128) | 806879232, 0, 8224);
            function6 = function5;
            validationType = textQuestionModel.getValidationType();
            c0VarR.E(1721048023);
            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                int iIntValue12 = characterLimit.intValue();
                StringBuilder sb13 = new StringBuilder();
                sb13.append(answer5.getLength());
                sb13.append('/');
                sb13.append(iIntValue12);
                q50.t(sb13.toString(), d5.v(n0Var.p(aVar3, aVar2.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24576, 0, 262120);
                Unit unit12 = Unit.f312394a;
            } else {
                int iIntValue13 = characterLimit.intValue();
                StringBuilder sb14 = new StringBuilder();
                sb14.append(answer5.getLength());
                sb14.append('/');
                sb14.append(iIntValue13);
                q50.t(sb14.toString(), d5.v(n0Var.p(aVar3, aVar2.s()), 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m699getDescriptionText0d7_KjU(), null, androidx.compose.ui.unit.a0.m(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 24576, 0, 262120);
                Unit unit13 = Unit.f312394a;
            }
            c0VarR.A();
            c0VarR.E(1721067384);
            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                String strD7 = u0.i.d(R.string.intercom_tickets_email_copy, c0VarR, 0);
                IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                int i216 = IntercomTheme.$stable;
                q50.t(strD7, d5.v(aVar3, 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), intercomTheme7.getColors(c0VarR, i216).m699getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme7.getTypography(c0VarR, i216).getType04(), c0VarR, 48, 0, 131064);
            }
            c0VarR.A();
            c0VarR.o();
            c0VarR.o();
            a0Var3 = a0Var2;
            answer6 = answer5;
            function7 = function2M513getLambda1$intercom_sdk_base_release;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShortTextQuestionKt.ShortTextQuestion$lambda$8(a0Var3, textQuestionModel, answer6, onAnswer, colors, validationError, function6, function7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextQuestion$lambda$0(y3 y3Var) {
        Intrinsics.checkNotNullParameter(y3Var, "<this>");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextQuestion$lambda$2(s0 coroutineScope, androidx.compose.foundation.relocation.a bringIntoViewRequester, p0 it) {
        Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
        Intrinsics.checkNotNullParameter(bringIntoViewRequester, "$bringIntoViewRequester");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.k()) {
            kotlinx.coroutines.k.f(coroutineScope, null, null, new ShortTextQuestionKt$ShortTextQuestion$2$1(bringIntoViewRequester, null), 3, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(Function1 onAnswer, String it) {
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
    public static final Unit ShortTextQuestion$lambda$8(androidx.compose.ui.a0 a0Var, SurveyData.Step.Question.ShortTextQuestionModel textQuestionModel, Answer answer, Function1 onAnswer, SurveyUiColors colors, ValidationError validationError, Function1 function1, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(textQuestionModel, "$textQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(colors, "$colors");
        Intrinsics.checkNotNullParameter(validationError, "$validationError");
        ShortTextQuestion(a0Var, textQuestionModel, answer, onAnswer, colors, validationError, function1, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
