package io.intercom.android.sdk.survey.ui.questiontype;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.t;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.ComposableSingletons$DatePickerQuestionKt$lambda-6$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$DatePickerQuestionKt$lambda6$1 implements Function2<c0, Integer, Unit> {
    public static final ComposableSingletons$DatePickerQuestionKt$lambda6$1 INSTANCE = new ComposableSingletons$DatePickerQuestionKt$lambda6$1();

    ComposableSingletons$DatePickerQuestionKt$lambda6$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Answer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
        invoke(c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(c0 c0Var, int i10) {
        if ((i10 & 11) == 2 && c0Var.d()) {
            c0Var.u();
            return;
        }
        int i11 = 4 ^ 0;
        DatePickerQuestionKt.DatePickerQuestion(null, new SurveyData.Step.Question.DatePickerQuestionModel("123", CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Choose date")), true), null, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$DatePickerQuestionKt$lambda6$1.invoke$lambda$0((Answer) obj);
            }
        }, null, c0Var, 3072, 21);
    }
}
