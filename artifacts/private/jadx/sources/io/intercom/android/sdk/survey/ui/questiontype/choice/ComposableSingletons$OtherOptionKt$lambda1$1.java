package io.intercom.android.sdk.survey.ui.questiontype.choice;

import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$OtherOptionKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$OtherOptionKt$lambda1$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$OtherOptionKt$lambda1$1 INSTANCE = new ComposableSingletons$OtherOptionKt$lambda1$1();

    ComposableSingletons$OtherOptionKt$lambda1$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(String it) {
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
            OtherOptionKt.m489OtherOptionYCJL08c(true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), "none", new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$OtherOptionKt$lambda1$1.invoke$lambda$1((String) obj);
                }
            }, 0L, 0.0f, 0L, null, 0L, c0Var, 28038, 992);
        }
    }
}
