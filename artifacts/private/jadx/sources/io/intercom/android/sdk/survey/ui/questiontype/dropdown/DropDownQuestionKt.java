package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

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
import androidx.compose.foundation.t0;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.r;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.v;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.focus.q;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.m;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.R;
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
@SourceDebugExtension({"SMAP\nDropDownQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropDownQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/dropdown/DropDownQuestionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,187:1\n1282#2,6:188\n1282#2,6:309\n1282#2,6:355\n113#3:194\n113#3:271\n113#3:348\n113#3:349\n113#3:354\n75#4:195\n70#5:196\n67#5,9:197\n77#5:372\n80#6,6:206\n87#6,3:221\n90#6,2:230\n80#6,6:244\n87#6,3:259\n90#6,2:268\n80#6,6:282\n87#6,3:297\n90#6,2:306\n80#6,6:321\n87#6,3:336\n90#6,2:345\n94#6:352\n94#6:363\n94#6:367\n94#6:371\n391#7,9:212\n400#7:232\n391#7,9:250\n400#7:270\n391#7,9:288\n400#7:308\n391#7,9:327\n400#7:347\n401#7,2:350\n401#7,2:361\n401#7,2:365\n401#7,2:369\n4360#8,6:224\n4360#8,6:262\n4360#8,6:300\n4360#8,6:339\n87#9:233\n83#9,10:234\n87#9:272\n84#9,9:273\n94#9:364\n94#9:368\n99#10,6:315\n106#10:353\n85#11:373\n117#11,2:374\n*S KotlinDebug\n*F\n+ 1 DropDownQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/dropdown/DropDownQuestionKt\n*L\n58#1:188,6\n85#1:309,6\n110#1:355,6\n63#1:194\n70#1:271\n97#1:348\n104#1:349\n114#1:354\n65#1:195\n67#1:196\n67#1:197,9\n67#1:372\n67#1:206,6\n67#1:221,3\n67#1:230,2\n68#1:244,6\n68#1:259,3\n68#1:268,2\n71#1:282,6\n71#1:297,3\n71#1:306,2\n81#1:321,6\n81#1:336,3\n81#1:345,2\n81#1:352\n71#1:363\n68#1:367\n67#1:371\n67#1:212,9\n67#1:232\n68#1:250,9\n68#1:270\n71#1:288,9\n71#1:308\n81#1:327,9\n81#1:347\n81#1:350,2\n71#1:361,2\n68#1:365,2\n67#1:369,2\n67#1:224,6\n68#1:262,6\n71#1:300,6\n81#1:339,6\n68#1:233\n68#1:234,10\n71#1:272\n71#1:273,9\n71#1:364\n68#1:368\n81#1:315,6\n81#1:353\n58#1:373\n58#1:374,2\n*E\n"})
public final class DropDownQuestionKt {

    @NotNull
    private static final SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel;

    static {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        dropDownQuestionModel = new SurveyData.Step.Question.DropDownQuestionModel(string, CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Is this a preview?")), true, CollectionsKt.listOf((Object[]) new String[]{"Option A", "Option B", "Option C"}), "Please Select", null, 32, null);
    }

    @o
    @d1.c(name = "Colored Selected Mode", showBackground = true)
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void ColoredDropDownSelectedQuestionPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-2103500414);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m493getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DropDownQuestionKt.ColoredDropDownSelectedQuestionPreview$lambda$14(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ColoredDropDownSelectedQuestionPreview$lambda$14(int i10, c0 c0Var, int i11) {
        ColoredDropDownSelectedQuestionPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @o
    @p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DropDownQuestion(@Nullable a0 a0Var, @NotNull final SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel2, @Nullable Answer answer, @NotNull final Function1<? super Answer, Unit> onAnswer, @NotNull final SurveyUiColors colors, @Nullable Function2<? super c0, ? super Integer, Unit> function2, @Nullable c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(dropDownQuestionModel2, "dropDownQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Intrinsics.checkNotNullParameter(colors, "colors");
        c0 c0VarR = c0Var.R(1475245134);
        a0 a0Var2 = (i11 & 1) != 0 ? a0.E : a0Var;
        Answer answer2 = (i11 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        Function2<? super c0, ? super Integer, Unit> function2M490getLambda1$intercom_sdk_base_release = (i11 & 32) != 0 ? ComposableSingletons$DropDownQuestionKt.INSTANCE.m490getLambda1$intercom_sdk_base_release() : function2;
        c0VarR.E(1842846242);
        Object objI0 = c0VarR.i0();
        c0.a aVar = c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = d7.g(Boolean.FALSE, null, 2, null);
            c0VarR.Y(objI0);
        }
        final n3 n3Var = (n3) objI0;
        c0VarR.A();
        boolean z10 = DropDownQuestion$lambda$1(n3Var) || !(answer2 instanceof Answer.NoAnswer);
        c0VarR.E(1842850021);
        long jM423getButton0d7_KjU = z10 ? colors.m423getButton0d7_KjU() : IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU();
        c0VarR.A();
        long jM729generateTextColor8_81llA = z10 ? ColorExtensionsKt.m729generateTextColor8_81llA(colors.m423getButton0d7_KjU()) : s0.d(4285756278L);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        long jW = q0.w(intercomTheme.getColors(c0VarR, i12).m714getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
        float fR = androidx.compose.ui.unit.h.r(1);
        q0 q0VarM425getDropDownSelectedColorQN2ZGVo = colors.m425getDropDownSelectedColorQN2ZGVo();
        long jM = q0VarM425getDropDownSelectedColorQN2ZGVo != null ? q0VarM425getDropDownSelectedColorQN2ZGVo.M() : jM729generateTextColor8_81llA;
        q qVar = (q) c0VarR.W(q1.n());
        androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
        a1 a1VarK = x.k(aVar2.C(), false);
        int iHashCode = Long.hashCode(v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        a0 a0VarN = m.n(c0VarR, a0Var2);
        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
        final a0 a0Var3 = a0Var2;
        Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
        y7.n(c0VarD, a1VarK, aVar3.e());
        y7.n(c0VarD, b1VarK, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar3.f());
        d0 d0Var = d0.f15956a;
        a0.a aVar4 = a0.E;
        androidx.compose.foundation.layout.q qVar2 = androidx.compose.foundation.layout.q.f16330a;
        a1 a1VarB = j0.b(qVar2.y(), aVar2.u(), c0VarR, 0);
        int iHashCode2 = Long.hashCode(v.l(c0VarR, 0));
        b1 b1VarK2 = c0VarR.k();
        a0 a0VarN2 = m.n(c0VarR, aVar4);
        Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
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
        y7.n(c0VarD2, a1VarB, aVar3.e());
        y7.n(c0VarD2, b1VarK2, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar3.f());
        n0 n0Var = n0.f16227a;
        function2M490getLambda1$intercom_sdk_base_release.invoke(c0VarR, Integer.valueOf((i10 >> 15) & 14));
        float f10 = 8;
        l6.a(i6.i(aVar4, androidx.compose.ui.unit.h.r(f10)), c0VarR, 6);
        a0 a0VarA = androidx.compose.ui.draw.j.a(t0.i(i6.h(aVar4, 0.0f, 1, null), fR, jW, intercomTheme.getShapes(c0VarR, i12).m()), intercomTheme.getShapes(c0VarR, i12).m());
        a1 a1VarB2 = j0.b(qVar2.y(), aVar2.u(), c0VarR, 0);
        int iHashCode3 = Long.hashCode(v.l(c0VarR, 0));
        b1 b1VarK3 = c0VarR.k();
        a0 a0VarN3 = m.n(c0VarR, a0VarA);
        Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
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
        y7.n(c0VarD3, a1VarB2, aVar3.e());
        y7.n(c0VarD3, b1VarK3, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
        if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
            c0VarD3.Y(Integer.valueOf(iHashCode3));
            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
        }
        y7.n(c0VarD3, a0VarN3, aVar3.f());
        a0 a0VarD = androidx.compose.foundation.v.d(i6.h(aVar4, 0.0f, 1, null), jM423getButton0d7_KjU, null, 2, null);
        c0VarR.E(-585752368);
        Object objI1 = c0VarR.i0();
        if (objI1 == aVar.a()) {
            objI1 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$4$lambda$3(n3Var);
                }
            };
            c0VarR.Y(objI1);
        }
        c0VarR.A();
        a0 a0VarJ = i1.j(a0VarD, false, null, null, null, (Function0) objI1, 15, null);
        a1 a1VarE = u5.e(qVar2.s(), aVar2.q(), c0VarR, 54);
        int iHashCode4 = Long.hashCode(v.l(c0VarR, 0));
        b1 b1VarK4 = c0VarR.k();
        a0 a0VarN4 = m.n(c0VarR, a0VarJ);
        Function0<androidx.compose.ui.node.g> function0A4 = aVar3.a();
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
        y7.n(c0VarD4, a1VarE, aVar3.e());
        y7.n(c0VarD4, b1VarK4, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4 = aVar3.b();
        if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iHashCode4))) {
            c0VarD4.Y(Integer.valueOf(iHashCode4));
            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
        }
        y7.n(c0VarD4, a0VarN4, aVar3.f());
        y5 y5Var = y5.f16577a;
        c0VarR.E(602811226);
        String strD = dropDownQuestionModel2.getPlaceHolderStringRes() != null ? u0.i.d(dropDownQuestionModel2.getPlaceHolderStringRes().intValue(), c0VarR, 0) : dropDownQuestionModel2.getPlaceholder();
        c0VarR.A();
        if (answer2 instanceof Answer.SingleAnswer) {
            strD = ((Answer.SingleAnswer) answer2).getAnswer();
        }
        float f11 = 16;
        final Function2<? super c0, ? super Integer, Unit> function3 = function2M490getLambda1$intercom_sdk_base_release;
        final Answer answer3 = answer2;
        q50.t(strD, i6.H(d5.r(aVar4, androidx.compose.ui.unit.h.r(f11)), null, false, 3, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3.m(intercomTheme.getTypography(c0VarR, i12).getType04(), jM729generateTextColor8_81llA, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0VarR, 48, 0, 131068);
        ni.o(u0.e.c(R.drawable.intercom_ic_down_arrow, c0VarR, 0), u0.i.d(io.intercom.android.sdk.R.string.intercom_choose_one, c0VarR, 0), d5.r(aVar4, androidx.compose.ui.unit.h.r(f11)), jM, c0VarR, 392, 0);
        c0VarR.o();
        boolean zDropDownQuestion$lambda$1 = DropDownQuestion$lambda$1(n3Var);
        a0 a0VarG = i6.g(aVar4, 0.8f);
        long jM690getBackground0d7_KjU = intercomTheme.getColors(c0VarR, i12).m690getBackground0d7_KjU();
        androidx.compose.foundation.shape.e eVarM = intercomTheme.getShapes(c0VarR, i12).m();
        float fR2 = androidx.compose.ui.unit.h.r(f10);
        c0VarR.E(-585710671);
        Object objI2 = c0VarR.i0();
        if (objI2 == aVar.a()) {
            objI2 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(n3Var);
                }
            };
            c0VarR.Y(objI2);
        }
        c0VarR.A();
        r.h(zDropDownQuestion$lambda$1, (Function0) objI2, a0VarG, 0L, null, null, eVarM, jM690getBackground0d7_KjU, 0.0f, fR2, null, w.e(17506981, true, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(dropDownQuestionModel2, qVar, onAnswer, n3Var), c0VarR, 54), c0VarR, 805306800, 48, 1336);
        c0VarR.o();
        c0VarR.o();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DropDownQuestionKt.DropDownQuestion$lambda$11(a0Var3, dropDownQuestionModel2, answer3, onAnswer, colors, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean DropDownQuestion$lambda$1(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$4$lambda$3(n3 expanded$delegate) {
        Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
        DropDownQuestion$lambda$2(expanded$delegate, true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(n3 expanded$delegate) {
        Intrinsics.checkNotNullParameter(expanded$delegate, "$expanded$delegate");
        DropDownQuestion$lambda$2(expanded$delegate, false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropDownQuestion$lambda$11(a0 a0Var, SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel2, Answer answer, Function1 onAnswer, SurveyUiColors colors, Function2 function2, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(dropDownQuestionModel2, "$dropDownQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(colors, "$colors");
        DropDownQuestion(a0Var, dropDownQuestionModel2, answer, onAnswer, colors, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DropDownQuestion$lambda$2(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    @o
    @d1.c(name = "Default Mode", showBackground = true)
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void DropDownQuestionPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(281876673);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m491getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DropDownQuestionKt.DropDownQuestionPreview$lambda$12(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropDownQuestionPreview$lambda$12(int i10, c0 c0Var, int i11) {
        DropDownQuestionPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @o
    @d1.c(name = "Selected Mode", showBackground = true)
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void DropDownSelectedQuestionPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-891294020);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m492getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DropDownQuestionKt.DropDownSelectedQuestionPreview$lambda$13(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropDownSelectedQuestionPreview$lambda$13(int i10, c0 c0Var, int i11) {
        DropDownSelectedQuestionPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
