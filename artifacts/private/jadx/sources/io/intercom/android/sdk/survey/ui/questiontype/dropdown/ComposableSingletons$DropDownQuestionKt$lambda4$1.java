package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.t;
import androidx.compose.ui.graphics.q0;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.dropdown.ComposableSingletons$DropDownQuestionKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$DropDownQuestionKt$lambda4$1 implements Function2<c0, Integer, Unit> {
    public static final ComposableSingletons$DropDownQuestionKt$lambda4$1 INSTANCE = new ComposableSingletons$DropDownQuestionKt$lambda4$1();

    ComposableSingletons$DropDownQuestionKt$lambda4$1() {
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

    @o
    @t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(c0 c0Var, int i10) {
        if ((i10 & 11) == 2 && c0Var.d()) {
            c0Var.u();
        } else {
            DropDownQuestionKt.DropDownQuestion(null, DropDownQuestionKt.dropDownQuestionModel, new Answer.SingleAnswer("Option A"), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$DropDownQuestionKt$lambda4$1.invoke$lambda$0((Answer) obj);
                }
            }, SurveyUiColors.m415copyqa9m3tE$default(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), 0L, 0L, q0.f38131b.c(), 0L, null, 27, null), null, c0Var, 3136, 33);
        }
    }
}
