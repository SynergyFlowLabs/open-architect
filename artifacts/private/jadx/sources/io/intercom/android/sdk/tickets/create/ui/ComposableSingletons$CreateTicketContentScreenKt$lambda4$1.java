package io.intercom.android.sdk.tickets.create.ui;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$CreateTicketContentScreenKt$lambda4$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda4$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda4$1();

    ComposableSingletons$CreateTicketContentScreenKt$lambda4$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5(AnswerClickData it) {
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
            CreateTicketContentScreenKt.CreateTicketScreen(new CreateTicketViewModel.CreateTicketFormUiState.Error(new ErrorState.WithCTA(0, 0, null, R.string.intercom_reload, new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, 7, null)), new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$CreateTicketContentScreenKt$lambda4$1.invoke$lambda$4((String) obj);
                }
            }, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$CreateTicketContentScreenKt$lambda4$1.invoke$lambda$5((AnswerClickData) obj);
                }
            }, c0Var, 224688);
        }
    }
}
