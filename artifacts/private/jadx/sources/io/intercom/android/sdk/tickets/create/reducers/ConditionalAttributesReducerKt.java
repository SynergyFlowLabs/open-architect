package io.intercom.android.sdk.tickets.create.reducers;

import io.intercom.android.sdk.blocks.lib.models.FormField;
import io.intercom.android.sdk.blocks.lib.models.ListOption;
import io.intercom.android.sdk.blocks.lib.models.Options;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConditionalAttributesReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConditionalAttributesReducer.kt\nio/intercom/android/sdk/tickets/create/reducers/ConditionalAttributesReducerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1#2:60\n1863#3,2:61\n*S KotlinDebug\n*F\n+ 1 ConditionalAttributesReducer.kt\nio/intercom/android/sdk/tickets/create/reducers/ConditionalAttributesReducerKt\n*L\n26#1:61,2\n*E\n"})
public final class ConditionalAttributesReducerKt {
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    @NotNull
    public static final List<TicketAttributeRequest> reduceAttributeList(@NotNull String updatedQuestionId, @Nullable TicketTypeV2 ticketTypeV2, @NotNull CreateTicketViewModel.CreateTicketFormUiState currentUiState) {
        Object next;
        Answer answer;
        QuestionState questionState;
        String answer2;
        List<ListOption> listOptions;
        Object next2;
        Object next3;
        Intrinsics.checkNotNullParameter(updatedQuestionId, "updatedQuestionId");
        Intrinsics.checkNotNullParameter(currentUiState, "currentUiState");
        if (ticketTypeV2 != null) {
            Iterator<T> it = ticketTypeV2.getFormFields().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((FormField) next).getId(), updatedQuestionId));
            FormField formField = (FormField) next;
            if (formField == null) {
                return CollectionsKt.emptyList();
            }
            if (formField.isControllingAttribute()) {
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                for (FormField formField2 : ticketTypeV2.getFormFields()) {
                    String id2 = formField2.getId();
                    if (currentUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Content) {
                        Iterator<T> it2 = ((CreateTicketViewModel.CreateTicketFormUiState.Content) currentUiState).getQuestions().iterator();
                        do {
                            if (!it2.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it2.next();
                        } while (!Intrinsics.areEqual(((QuestionState) next3).getQuestionModel().getId(), id2));
                        questionState = (QuestionState) next3;
                        answer = questionState != null ? questionState.getAnswer() : null;
                    } else {
                        answer = null;
                        questionState = null;
                    }
                    if (answer != null) {
                        if ((answer instanceof Answer.DateTimeAnswer) || (answer instanceof Answer.MediaAnswer) || (answer instanceof Answer.MultipleAnswer) || Intrinsics.areEqual(answer, Answer.NoAnswer.InitialNoAnswer.INSTANCE) || Intrinsics.areEqual(answer, Answer.NoAnswer.ResetNoAnswer.INSTANCE)) {
                            answer2 = null;
                        } else {
                            if (!(answer instanceof Answer.SingleAnswer)) {
                                throw new k0();
                            }
                            if ((questionState != null ? questionState.getQuestionModel() : null) instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                                Options options = formField2.getOptions();
                                if (options == null || (listOptions = options.getListOptions()) == null) {
                                    answer2 = null;
                                } else {
                                    Iterator<T> it3 = listOptions.iterator();
                                    do {
                                        if (!it3.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it3.next();
                                    } while (!Intrinsics.areEqual(((ListOption) next2).getLabel(), ((Answer.SingleAnswer) answer).getAnswer()));
                                    ListOption listOption = (ListOption) next2;
                                    if (listOption != null) {
                                        answer2 = listOption.getId();
                                    } else {
                                        answer2 = null;
                                    }
                                }
                            } else {
                                answer2 = ((Answer.SingleAnswer) answer).getAnswer();
                            }
                        }
                        if (answer2 != null) {
                            listCreateListBuilder.add(new TicketAttributeRequest(id2, answer2));
                        }
                    }
                }
                return CollectionsKt.build(listCreateListBuilder);
            }
        }
        return CollectionsKt.emptyList();
    }
}
