package io.intercom.android.sdk.survey.ui.questiontype;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AnswerClickData {
    public static final int $stable = 8;

    @NotNull
    private final Answer.MediaAnswer.MediaItem clickedItem;

    @NotNull
    private final String questionId;

    public AnswerClickData(@NotNull Answer.MediaAnswer.MediaItem clickedItem, @NotNull String questionId) {
        Intrinsics.checkNotNullParameter(clickedItem, "clickedItem");
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        this.clickedItem = clickedItem;
        this.questionId = questionId;
    }

    public static /* synthetic */ AnswerClickData copy$default(AnswerClickData answerClickData, Answer.MediaAnswer.MediaItem mediaItem, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mediaItem = answerClickData.clickedItem;
        }
        if ((i10 & 2) != 0) {
            str = answerClickData.questionId;
        }
        return answerClickData.copy(mediaItem, str);
    }

    @NotNull
    public final Answer.MediaAnswer.MediaItem component1() {
        return this.clickedItem;
    }

    @NotNull
    public final String component2() {
        return this.questionId;
    }

    @NotNull
    public final AnswerClickData copy(@NotNull Answer.MediaAnswer.MediaItem clickedItem, @NotNull String questionId) {
        Intrinsics.checkNotNullParameter(clickedItem, "clickedItem");
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        return new AnswerClickData(clickedItem, questionId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnswerClickData)) {
            return false;
        }
        AnswerClickData answerClickData = (AnswerClickData) obj;
        return Intrinsics.areEqual(this.clickedItem, answerClickData.clickedItem) && Intrinsics.areEqual(this.questionId, answerClickData.questionId);
    }

    @NotNull
    public final Answer.MediaAnswer.MediaItem getClickedItem() {
        return this.clickedItem;
    }

    @NotNull
    public final String getQuestionId() {
        return this.questionId;
    }

    public int hashCode() {
        return (this.clickedItem.hashCode() * 31) + this.questionId.hashCode();
    }

    @NotNull
    public String toString() {
        return "AnswerClickData(clickedItem=" + this.clickedItem + ", questionId=" + this.questionId + ')';
    }
}
