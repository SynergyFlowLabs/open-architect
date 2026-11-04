package io.intercom.android.sdk.survey.ui.questiontype.text;

import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$ShortTextQuestionKt$lambda-5$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$ShortTextQuestionKt$lambda5$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$ShortTextQuestionKt$lambda5$1 INSTANCE = new ComposableSingletons$ShortTextQuestionKt$lambda5$1();

    ComposableSingletons$ShortTextQuestionKt$lambda5$1() {
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
        ShortTextQuestionKt.ShortTextQuestion(null, new SurveyData.Step.Question.ShortTextQuestionModel(string, CollectionsKt.listOf(new Block.Builder().withText("Is this a preview?").withType(BlockType.PARAGRAPH.getSerializedName())), true, "Placeholder text", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, 250, false, null, null, a5.S0, null), new Answer.SingleAnswer("Answer"), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$ShortTextQuestionKt$lambda5$1.invoke$lambda$0((Answer) obj);
            }
        }, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), ValidationError.NoValidationError.INSTANCE, null, null, c0Var, 199680, 193);
    }
}
