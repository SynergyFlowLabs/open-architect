package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$onAnswerUpdated$1$2", f = "CreateTicketViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCreateTicketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateTicketViewModel.kt\nio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$onAnswerUpdated$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,499:1\n774#2:500\n865#2,2:501\n1863#2:503\n1872#2,3:504\n1864#2:507\n*S KotlinDebug\n*F\n+ 1 CreateTicketViewModel.kt\nio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$onAnswerUpdated$1$2\n*L\n197#1:500\n197#1:501,2\n198#1:503\n204#1:504,3\n198#1:507\n*E\n"})
final class CreateTicketViewModel$onAnswerUpdated$1$2 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ CreateTicketViewModel.CreateTicketFormUiState.Content $content;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTicketViewModel$onAnswerUpdated$1$2(CreateTicketViewModel.CreateTicketFormUiState.Content content, CreateTicketViewModel createTicketViewModel, kotlin.coroutines.d<? super CreateTicketViewModel$onAnswerUpdated$1$2> dVar) {
        super(2, dVar);
        this.$content = content;
        this.this$0 = createTicketViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new CreateTicketViewModel$onAnswerUpdated$1$2(this.$content, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        List<QuestionState> questions = this.$content.getQuestions();
        ArrayList<QuestionState> arrayList = new ArrayList();
        for (Object obj2 : questions) {
            if (((QuestionState) obj2).getQuestionModel() instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                arrayList.add(obj2);
            }
        }
        CreateTicketViewModel createTicketViewModel = this.this$0;
        for (QuestionState questionState : arrayList) {
            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
            Intrinsics.checkNotNull(questionModel, "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.UploadFileQuestionModel");
            SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel = (SurveyData.Step.Question.UploadFileQuestionModel) questionModel;
            Answer answer = questionState.getAnswer();
            if (answer instanceof Answer.MediaAnswer) {
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                int i10 = 0;
                for (Object obj3 : mediaAnswer.getMediaItems()) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Answer.MediaAnswer.MediaItem mediaItem = (Answer.MediaAnswer.MediaItem) obj3;
                    if (i10 >= uploadFileQuestionModel.getMaxSelection()) {
                        mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(CollectionsKt.listOf((Object[]) new StringProvider.StringRes[]{new StringProvider.StringRes(R.string.intercom_upload_failed, null, 2, null), new StringProvider.StringRes(R.string.intercom_upload_max_files_allowed, CollectionsKt.listOf(TuplesKt.to("limit", String.valueOf(uploadFileQuestionModel.getMaxSelection()))))}))));
                    } else if (createTicketViewModel.isUnsupportedFileType(mediaItem.getData(), uploadFileQuestionModel.getSupportedFileType())) {
                        mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.UnsupportedFileType(CollectionsKt.listOf(new StringProvider.StringRes(R.string.intercom_upload_failed, null, 2, null)))));
                    } else if (Intrinsics.areEqual(mediaItem.getUploadStatus(), Answer.MediaAnswer.FileUploadStatus.None.INSTANCE)) {
                        mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE);
                    } else if (createTicketViewModel.canRetryFileLimitExceededError(mediaItem, i10, uploadFileQuestionModel.getMaxSelection())) {
                        mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE);
                    }
                    i10 = i11;
                }
                createTicketViewModel.compressAndUploadFileAttachments(mediaAnswer.getMediaItems());
                questionState.validate();
            }
        }
        this.this$0.updateCtaState();
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((CreateTicketViewModel$onAnswerUpdated$1$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
