package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$NumericRatingQuestionKt {

    @NotNull
    public static final ComposableSingletons$NumericRatingQuestionKt INSTANCE = new ComposableSingletons$NumericRatingQuestionKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f286lambda1 = w.c(-382011236, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.ComposableSingletons$NumericRatingQuestionKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m509getLambda1$intercom_sdk_base_release() {
        return f286lambda1;
    }
}
