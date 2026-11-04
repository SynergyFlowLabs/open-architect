package io.intercom.android.sdk.tickets.create.ui;

import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$CreateTicketContentScreenKt$lambda2$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda2$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda2$1();

    ComposableSingletons$CreateTicketContentScreenKt$lambda2$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(AnswerClickData it) {
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
        int i11 = 5 << 0;
        CreateTicketContentScreenKt.CreateTicketContentScreen(null, new CreateTicketViewModel.CreateTicketFormUiState.Content("All form attribute types", CreateTicketContentScreenKt.questions, false, true), new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$CreateTicketContentScreenKt$lambda2$1.invoke$lambda$2((String) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$CreateTicketContentScreenKt$lambda2$1.invoke$lambda$3((AnswerClickData) obj);
            }
        }, c0Var, 224704, 1);
    }
}
