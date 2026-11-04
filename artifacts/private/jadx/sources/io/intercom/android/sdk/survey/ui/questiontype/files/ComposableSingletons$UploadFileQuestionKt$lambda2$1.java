package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.media3.common.s0;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$UploadFileQuestionKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$UploadFileQuestionKt$lambda2$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$UploadFileQuestionKt$lambda2$1 INSTANCE = new ComposableSingletons$UploadFileQuestionKt$lambda2$1();

    ComposableSingletons$UploadFileQuestionKt$lambda2$1() {
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
        } else {
            UploadFileQuestionKt.UploadFileQuestion(null, new SurveyData.Step.Question.UploadFileQuestionModel("", CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Attachments")), null, false, 1, SetsKt.setOf((Object[]) new String[]{"image/jpeg", s0.X0}), 4, null), null, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$UploadFileQuestionKt$lambda2$1.invoke$lambda$0((Answer) obj);
                }
            }, null, null, c0Var, 3136, 53);
        }
    }
}
