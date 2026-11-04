package io.intercom.android.sdk.survey.model;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import io.sentry.protocol.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class SubmitSurveyRequestItem {
    public static final int $stable = 8;

    @c("question_id")
    @NotNull
    private final String questionId;

    @c(n.f306405g)
    @NotNull
    private final List<String> response;

    public SubmitSurveyRequestItem(@NotNull String questionId, @NotNull List<String> response) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(response, "response");
        this.questionId = questionId;
        this.response = response;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitSurveyRequestItem copy$default(SubmitSurveyRequestItem submitSurveyRequestItem, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = submitSurveyRequestItem.questionId;
        }
        if ((i10 & 2) != 0) {
            list = submitSurveyRequestItem.response;
        }
        return submitSurveyRequestItem.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.questionId;
    }

    @NotNull
    public final List<String> component2() {
        return this.response;
    }

    @NotNull
    public final SubmitSurveyRequestItem copy(@NotNull String questionId, @NotNull List<String> response) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(response, "response");
        return new SubmitSurveyRequestItem(questionId, response);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitSurveyRequestItem)) {
            return false;
        }
        SubmitSurveyRequestItem submitSurveyRequestItem = (SubmitSurveyRequestItem) obj;
        return Intrinsics.areEqual(this.questionId, submitSurveyRequestItem.questionId) && Intrinsics.areEqual(this.response, submitSurveyRequestItem.response);
    }

    @NotNull
    public final String getQuestionId() {
        return this.questionId;
    }

    @NotNull
    public final List<String> getResponse() {
        return this.response;
    }

    public int hashCode() {
        return (this.questionId.hashCode() * 31) + this.response.hashCode();
    }

    @NotNull
    public String toString() {
        return "SubmitSurveyRequestItem(questionId=" + this.questionId + ", response=" + this.response + ')';
    }
}
