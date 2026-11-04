package io.intercom.android.sdk.tickets.create.ui;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-5$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$CreateTicketContentScreenKt$lambda5$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda5$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda5$1();

    ComposableSingletons$CreateTicketContentScreenKt$lambda5$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4(AnswerClickData it) {
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
        List listTake = CollectionsKt.take(CreateTicketContentScreenKt.questions, 4);
        ((QuestionState) CollectionsKt.first(listTake)).setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_email_error, null, 2, null));
        Unit unit = Unit.f312394a;
        CreateTicketContentScreenKt.CreateTicketContentScreen(null, new CreateTicketViewModel.CreateTicketFormUiState.Content("All form attribute types", listTake, false, false), new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$CreateTicketContentScreenKt$lambda5$1.invoke$lambda$3((String) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$CreateTicketContentScreenKt$lambda5$1.invoke$lambda$4((AnswerClickData) obj);
            }
        }, c0Var, 224704, 1);
    }
}
