package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.text.font.v0;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ui.components.QuestionHeaderComponentKt;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.ErrorMessageLayoutKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nUploadFileQuestionHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadFileQuestionHeader.kt\nio/intercom/android/sdk/survey/ui/questiontype/files/UploadFileQuestionHeaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class UploadFileQuestionHeaderKt {
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: UploadFileQuestionHeader-INMd_9Y, reason: not valid java name */
    public static final void m508UploadFileQuestionHeaderINMd_9Y(@NotNull final QuestionState questionState, @NotNull final v0 questionFontWeight, final long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        final List<StringProvider.StringRes> listEmptyList;
        List<Answer.MediaAnswer.MediaItem> mediaItems;
        Intrinsics.checkNotNullParameter(questionState, "questionState");
        Intrinsics.checkNotNullParameter(questionFontWeight, "questionFontWeight");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(43160084);
        Answer answer = questionState.getAnswer();
        Object obj = null;
        Answer.MediaAnswer mediaAnswer = answer instanceof Answer.MediaAnswer ? (Answer.MediaAnswer) answer : null;
        if (mediaAnswer == null || (mediaItems = mediaAnswer.getMediaItems()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            for (Object obj2 : mediaItems) {
                if (((Answer.MediaAnswer.MediaItem) obj2).getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                    obj = obj2;
                    break;
                }
            }
            Answer.MediaAnswer.MediaItem mediaItem = (Answer.MediaAnswer.MediaItem) obj;
            if (mediaItem != null) {
                Answer.MediaAnswer.FileUploadStatus uploadStatus = mediaItem.getUploadStatus();
                Intrinsics.checkNotNull(uploadStatus, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error");
                listEmptyList = ((Answer.MediaAnswer.FileUploadStatus.Error) uploadStatus).getError().getErrorMessages();
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        int i11 = i10 << 9;
        QuestionHeaderComponentKt.m470QuestionHeadern1tc1qA(questionState.getQuestionModel().getTitle(), questionState.getQuestionModel().getDescription(), questionState.getQuestionModel().isRequired(), questionState.getValidationError(), questionFontWeight, j10, androidx.compose.runtime.internal.w.e(1052404026, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt$UploadFileQuestionHeader$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.runtime.c0 c0Var2, int i12) {
                if ((i12 & 11) == 2 && c0Var2.d()) {
                    c0Var2.u();
                } else {
                    ErrorMessageLayoutKt.ErrorMessageLayout(null, listEmptyList, c0Var2, 64, 1);
                }
            }
        }, c0VarR, 54), null, c0VarR, (StringProvider.$stable << 3) | 1572872 | (57344 & i11) | (i11 & 458752), 128);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return UploadFileQuestionHeaderKt.UploadFileQuestionHeader_INMd_9Y$lambda$2(questionState, questionFontWeight, j10, i10, (androidx.compose.runtime.c0) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadFileQuestionHeader_INMd_9Y$lambda$2(QuestionState questionState, v0 questionFontWeight, long j10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(questionState, "$questionState");
        Intrinsics.checkNotNullParameter(questionFontWeight, "$questionFontWeight");
        m508UploadFileQuestionHeaderINMd_9Y(questionState, questionFontWeight, j10, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
