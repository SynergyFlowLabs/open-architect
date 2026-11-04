package io.intercom.android.sdk.survey;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.AttributeValidatorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSurveyViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyViewModel.kt\nio/intercom/android/sdk/survey/QuestionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,796:1\n85#2:797\n117#2,2:798\n85#2:800\n117#2,2:801\n85#2:803\n1557#3:804\n1628#3,3:805\n808#3,11:808\n*S KotlinDebug\n*F\n+ 1 SurveyViewModel.kt\nio/intercom/android/sdk/survey/QuestionState\n*L\n621#1:797\n621#1:798,2\n622#1:800\n622#1:801,2\n623#1:803\n743#1:804\n743#1:805,3\n744#1:808,11\n*E\n"})
public final class QuestionState {
    public static final int $stable = 8;

    @NotNull
    private final n3 _answer$delegate;

    @NotNull
    private final n7 answer$delegate;

    @NotNull
    private final androidx.compose.foundation.relocation.a bringIntoViewRequester;

    @NotNull
    private final SurveyData.Step.Question.QuestionModel questionModel;

    @NotNull
    private final SurveyUiColors surveyUiColors;

    @NotNull
    private final n3 validationError$delegate;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionValidation.ValidationType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.QuestionState$bringIntoView$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.survey.QuestionState$bringIntoView$1", f = "SurveyViewModel.kt", i = {}, l = {761}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            int i10 = 4 ^ 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return QuestionState.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.relocation.a bringIntoViewRequester = QuestionState.this.getBringIntoViewRequester();
                this.label = 1;
                if (androidx.compose.foundation.relocation.a.b(bringIntoViewRequester, null, this, 1, null) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public QuestionState(@NotNull SurveyData.Step.Question.QuestionModel questionModel, @NotNull SurveyUiColors surveyUiColors) {
        Intrinsics.checkNotNullParameter(questionModel, "questionModel");
        Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
        this.questionModel = questionModel;
        this.surveyUiColors = surveyUiColors;
        this.validationError$delegate = d7.g(ValidationError.Unchecked.INSTANCE, null, 2, null);
        this._answer$delegate = d7.g(Answer.NoAnswer.InitialNoAnswer.INSTANCE, null, 2, null);
        this.answer$delegate = w6.e(new Function0() { // from class: io.intercom.android.sdk.survey.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionState.answer_delegate$lambda$0(this.f293167a);
            }
        });
        this.bringIntoViewRequester = androidx.compose.foundation.relocation.d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Answer answer_delegate$lambda$0(QuestionState this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.get_answer();
    }

    public static /* synthetic */ QuestionState copy$default(QuestionState questionState, SurveyData.Step.Question.QuestionModel questionModel, SurveyUiColors surveyUiColors, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            questionModel = questionState.questionModel;
        }
        if ((i10 & 2) != 0) {
            surveyUiColors = questionState.surveyUiColors;
        }
        return questionState.copy(questionModel, surveyUiColors);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Answer get_answer() {
        return (Answer) this._answer$delegate.getValue();
    }

    private final void set_answer(Answer answer) {
        this._answer$delegate.setValue(answer);
    }

    @NotNull
    public final p2 bringIntoView(@NotNull s0 compositionAwareScope) {
        Intrinsics.checkNotNullParameter(compositionAwareScope, "compositionAwareScope");
        return k.f(compositionAwareScope, null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final SurveyData.Step.Question.QuestionModel component1() {
        return this.questionModel;
    }

    @NotNull
    public final SurveyUiColors component2() {
        return this.surveyUiColors;
    }

    @NotNull
    public final QuestionState copy(@NotNull SurveyData.Step.Question.QuestionModel questionModel, @NotNull SurveyUiColors surveyUiColors) {
        Intrinsics.checkNotNullParameter(questionModel, "questionModel");
        Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
        return new QuestionState(questionModel, surveyUiColors);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionState)) {
            return false;
        }
        QuestionState questionState = (QuestionState) obj;
        return Intrinsics.areEqual(this.questionModel, questionState.questionModel) && Intrinsics.areEqual(this.surveyUiColors, questionState.surveyUiColors);
    }

    @NotNull
    public final Answer getAnswer() {
        return (Answer) this.answer$delegate.getValue();
    }

    @NotNull
    public final androidx.compose.foundation.relocation.a getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    @NotNull
    public final SurveyData.Step.Question.QuestionModel getQuestionModel() {
        return this.questionModel;
    }

    @NotNull
    public final SurveyUiColors getSurveyUiColors() {
        return this.surveyUiColors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ValidationError getValidationError() {
        return (ValidationError) this.validationError$delegate.getValue();
    }

    public int hashCode() {
        return (this.questionModel.hashCode() * 31) + this.surveyUiColors.hashCode();
    }

    public final void setAnswer(@NotNull Answer answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        set_answer(answer);
        if (answer instanceof Answer.NoAnswer.ResetNoAnswer) {
            setValidationError(ValidationError.Unchecked.INSTANCE);
        }
    }

    public final void setValidationError(@NotNull ValidationError validationError) {
        Intrinsics.checkNotNullParameter(validationError, "<set-?>");
        this.validationError$delegate.setValue(validationError);
    }

    @NotNull
    public String toString() {
        return "QuestionState(questionModel=" + this.questionModel + ", surveyUiColors=" + this.surveyUiColors + ')';
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02b3  */
    public final void validate() {
        ValidationError validationStringError;
        List<Answer.MediaAnswer.MediaItem> mediaItems;
        String str;
        ValidationError validationStringError2;
        if ((getAnswer() instanceof Answer.NoAnswer) && this.questionModel.isRequired()) {
            setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_required_response, null, 2, null));
            return;
        }
        if (getAnswer() instanceof Answer.NoAnswer) {
            setValidationError(ValidationError.NoValidationError.INSTANCE);
            return;
        }
        SurveyData.Step.Question.QuestionModel questionModel = this.questionModel;
        if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
            if (getAnswer() instanceof Answer.MultipleAnswer) {
                Answer answer = getAnswer();
                Intrinsics.checkNotNull(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer");
                int size = ((Answer.MultipleAnswer) answer).getAnswers().size();
                if (size < ((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMinSelection()) {
                    setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_multi_select_too_few_responses, CollectionsKt.listOf(TuplesKt.to("response_count", String.valueOf(((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMinSelection())))));
                    return;
                } else if (size > ((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMaxSelection()) {
                    setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_multi_select_too_many_responses, CollectionsKt.listOf(TuplesKt.to("response_count", String.valueOf(((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMaxSelection())))));
                    return;
                } else {
                    setValidationError(ValidationError.NoValidationError.INSTANCE);
                    return;
                }
            }
            return;
        }
        if (!(questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel)) {
            if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                setValidationError((((SurveyData.Step.Question.LongTextQuestionModel) questionModel).getCharacterLimit() == null || getAnswer().getLength() <= ((SurveyData.Step.Question.LongTextQuestionModel) this.questionModel).getCharacterLimit().intValue()) ? ValidationError.NoValidationError.INSTANCE : new ValidationError.ValidationStringError(R.string.intercom_surveys_response_too_long, CollectionsKt.listOf(TuplesKt.to("character_count", String.valueOf(((SurveyData.Step.Question.LongTextQuestionModel) this.questionModel).getCharacterLimit())))));
                return;
            }
            if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                if (getAnswer() instanceof Answer.DateTimeAnswer) {
                    Answer answer2 = getAnswer();
                    Intrinsics.checkNotNull(answer2, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.DateTimeAnswer");
                    setValidationError(StringsKt.w3(((Answer.DateTimeAnswer) answer2).getDateAsString()) ? new ValidationError.ValidationStringError(R.string.intercom_choose_the_date, null, 2, null) : ValidationError.NoValidationError.INSTANCE);
                    return;
                }
                return;
            }
            if (!(questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel)) {
                setValidationError(ValidationError.NoValidationError.INSTANCE);
                return;
            }
            Answer answer3 = getAnswer();
            Answer.MediaAnswer mediaAnswer = answer3 instanceof Answer.MediaAnswer ? (Answer.MediaAnswer) answer3 : null;
            if (mediaAnswer == null || (mediaItems = mediaAnswer.getMediaItems()) == null) {
                validationStringError = ValidationError.NoValidationError.INSTANCE;
            } else {
                List<Answer.MediaAnswer.MediaItem> list = mediaItems;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Answer.MediaAnswer.MediaItem) it.next()).getUploadStatus());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                        arrayList2.add(obj);
                    }
                }
                Answer.MediaAnswer.FileUploadStatus.Error error = (Answer.MediaAnswer.FileUploadStatus.Error) CollectionsKt.firstOrNull((List) arrayList2);
                if (error != null) {
                    StringProvider.StringRes stringRes = (StringProvider.StringRes) CollectionsKt.first((List) error.getError().getErrorMessages());
                    validationStringError = new ValidationError.ValidationStringError(stringRes.getStringRes(), stringRes.getParams());
                } else {
                    validationStringError = ValidationError.NoValidationError.INSTANCE;
                }
            }
            setValidationError(validationStringError);
            return;
        }
        if (!((SurveyData.Step.Question.ShortTextQuestionModel) questionModel).getEnabled()) {
            validationStringError2 = ValidationError.NoValidationError.INSTANCE;
        } else if (((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getCharacterLimit() == null || getAnswer().getLength() <= ((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getCharacterLimit().intValue()) {
            switch (WhenMappings.$EnumSwitchMapping$0[((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getValidationType().ordinal()]) {
                case 1:
                case 2:
                    str = "text";
                    break;
                case 3:
                    str = AttributeType.NUMBER;
                    break;
                case 4:
                    str = "email";
                    break;
                case 5:
                    str = "phone";
                    break;
                case 6:
                    str = "float";
                    break;
                case 7:
                    str = "integer";
                    break;
                default:
                    throw new k0();
            }
            Answer answer4 = getAnswer();
            switch (AttributeValidatorUtils.validateAttribute(answer4 instanceof Answer.SingleAnswer ? ((Answer.SingleAnswer) answer4).getAnswer() : "", str)) {
                case 1:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_string_is_incorrect, null, 2, null);
                    break;
                case 2:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_surveys_email_error, null, 2, null);
                    break;
                case 3:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_number_is_incorrect, null, 2, null);
                    break;
                case 4:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_that_number_needs_a_prefix, null, 2, null);
                    break;
                case 5:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_that_number_has_too_many_digits, null, 2, null);
                    break;
                case 6:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_that_country_code_doesnt_look_quite_right, null, 2, null);
                    break;
                case 7:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_that_number_is_missing_a_few_digits, null, 2, null);
                    break;
                default:
                    validationStringError2 = ValidationError.NoValidationError.INSTANCE;
                    break;
            }
        } else {
            validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_surveys_response_too_long, CollectionsKt.listOf(TuplesKt.to("character_count", String.valueOf(((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getCharacterLimit()))));
        }
        setValidationError(validationStringError2);
    }
}
