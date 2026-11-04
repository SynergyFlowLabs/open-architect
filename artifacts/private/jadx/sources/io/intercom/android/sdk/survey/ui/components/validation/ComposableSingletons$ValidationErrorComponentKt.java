package io.intercom.android.sdk.survey.ui.components.validation;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.o;
import androidx.compose.runtime.t;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$ValidationErrorComponentKt {

    @NotNull
    public static final ComposableSingletons$ValidationErrorComponentKt INSTANCE = new ComposableSingletons$ValidationErrorComponentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f254lambda1 = w.c(39859331, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.validation.ComposableSingletons$ValidationErrorComponentKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
            } else {
                ValidationErrorComponentKt.m472ValidationErrorComponentFNF3uiM(null, new ValidationError.ValidationStringError(R.string.intercom_inbox_error_state_title, null, 2, null), IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m702getError0d7_KjU(), c0Var, 64, 1);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m471getLambda1$intercom_sdk_base_release() {
        return f254lambda1;
    }
}
