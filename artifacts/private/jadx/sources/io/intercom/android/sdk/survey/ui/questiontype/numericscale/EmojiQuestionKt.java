package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import androidx.compose.foundation.i1;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.v;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
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
@SourceDebugExtension({"SMAP\nEmojiQuestion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/numericscale/EmojiQuestionKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,43:1\n113#2:44\n113#2:79\n99#3,6:45\n106#3:90\n80#4,6:51\n87#4,3:66\n90#4,2:75\n94#4:89\n391#5,9:57\n400#5:77\n401#5,2:87\n4360#6,6:69\n1863#7:78\n1864#7:86\n1282#8,6:80\n*S KotlinDebug\n*F\n+ 1 EmojiQuestion.kt\nio/intercom/android/sdk/survey/ui/questiontype/numericscale/EmojiQuestionKt\n*L\n23#1:44\n35#1:79\n21#1:45,6\n21#1:90\n21#1:51,6\n21#1:66,3\n21#1:75,2\n21#1:89\n21#1:57,9\n21#1:77\n21#1:87,2\n21#1:69,6\n26#1:78\n26#1:86\n36#1:80,6\n*E\n"})
public final class EmojiQuestionKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void EmojiQuestion(@NotNull final List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption> options, @NotNull final Answer answer, @NotNull final Function1<? super Answer, Unit> onAnswer, @Nullable c0 c0Var, final int i10) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        c0 c0VarR = c0Var.R(1738433356);
        a0 a0VarH = i6.h(a0.E, 0.0f, 1, null);
        androidx.compose.foundation.layout.q.a aVar = androidx.compose.foundation.layout.q.a.f16340a;
        float fR = androidx.compose.ui.unit.h.r(12);
        androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
        a1 a1VarE = u5.e(aVar.s(fR, aVar2.m()), aVar2.q(), c0VarR, 54);
        int iHashCode = Long.hashCode(v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarH);
        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
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
        y7.n(c0VarD, a1VarE, aVar3.e());
        y7.n(c0VarD, b1VarK, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar3.f());
        y5 y5Var = y5.f16577a;
        c0VarR.E(-1487440982);
        for (final SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption emojiRatingOption : options) {
            boolean z10 = (answer instanceof Answer.SingleAnswer) && Intrinsics.areEqual(((Answer.SingleAnswer) answer).getAnswer(), String.valueOf(emojiRatingOption.getValue()));
            String emojiUrl = emojiRatingOption.getEmojiUrl();
            boolean z11 = z10;
            String unicode = emojiRatingOption.getUnicode();
            boolean z12 = (answer instanceof Answer.NoAnswer) || z11;
            a0 a0VarW = i6.w(a0.E, androidx.compose.ui.unit.h.r(z11 ? 34 : 32));
            c0VarR.E(1945180755);
            boolean zD = ((((i10 & 896) ^ a5.S0) > 256 && c0VarR.D(onAnswer)) || (i10 & a5.S0) == 256) | c0VarR.D(emojiRatingOption);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == c0.f35327a.a()) {
                objI0 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EmojiQuestionKt.EmojiQuestion$lambda$3$lambda$2$lambda$1$lambda$0(onAnswer, emojiRatingOption);
                    }
                };
                c0VarR.Y(objI0);
            }
            c0VarR.A();
            EmojiRatingKt.EmojiRating(emojiUrl, unicode, z12, i1.j(a0VarW, false, null, null, null, (Function0) objI0, 15, null), c0VarR, 0, 0);
        }
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmojiQuestionKt.EmojiQuestion$lambda$4(options, answer, onAnswer, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmojiQuestion$lambda$3$lambda$2$lambda$1$lambda$0(Function1 onAnswer, SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption option) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(option, "$option");
        onAnswer.invoke(new Answer.SingleAnswer(String.valueOf(option.getValue())));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmojiQuestion$lambda$4(List options, Answer answer, Function1 onAnswer, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(answer, "$answer");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        EmojiQuestion(options, answer, onAnswer, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
