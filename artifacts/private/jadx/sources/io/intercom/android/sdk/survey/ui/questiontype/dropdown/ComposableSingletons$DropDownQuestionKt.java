package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$DropDownQuestionKt {

    @NotNull
    public static final ComposableSingletons$DropDownQuestionKt INSTANCE = new ComposableSingletons$DropDownQuestionKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f269lambda1 = w.c(-1681097297, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.ComposableSingletons$DropDownQuestionKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            invoke(c0Var, num.intValue());
            return Unit.f312394a;
        }

        @o
        public final void invoke(c0 c0Var, int i10) {
            if ((i10 & 11) == 2 && c0Var.d()) {
                c0Var.u();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f270lambda2 = w.c(1247370603, false, ComposableSingletons$DropDownQuestionKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f271lambda3 = w.c(1532619110, false, ComposableSingletons$DropDownQuestionKt$lambda3$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f272lambda4 = w.c(157266840, false, ComposableSingletons$DropDownQuestionKt$lambda4$1.INSTANCE);

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m490getLambda1$intercom_sdk_base_release() {
        return f269lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m491getLambda2$intercom_sdk_base_release() {
        return f270lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m492getLambda3$intercom_sdk_base_release() {
        return f271lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m493getLambda4$intercom_sdk_base_release() {
        return f272lambda4;
    }
}
