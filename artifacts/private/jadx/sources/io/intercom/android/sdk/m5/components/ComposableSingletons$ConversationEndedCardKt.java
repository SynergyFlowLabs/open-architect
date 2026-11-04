package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$ConversationEndedCardKt {

    @NotNull
    public static final ComposableSingletons$ConversationEndedCardKt INSTANCE = new ComposableSingletons$ConversationEndedCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f16lambda1 = androidx.compose.runtime.internal.w.c(-867938680, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationEndedCardKt$lambda-1$1
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
                ConversationEndedCardKt.ConversationEndedCard(null, null, new ComposerState.ConversationEnded(new StringProvider.StringRes(R.string.intercom_conversation_has_ended, null, 2, null), null, 2, null), c0Var, StringProvider.$stable << 6, 3);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f17lambda2 = androidx.compose.runtime.internal.w.c(-1449960304, false, ComposableSingletons$ConversationEndedCardKt$lambda2$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f18lambda3 = androidx.compose.runtime.internal.w.c(-156696201, false, ComposableSingletons$ConversationEndedCardKt$lambda3$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f19lambda4 = androidx.compose.runtime.internal.w.c(-324942016, false, ComposableSingletons$ConversationEndedCardKt$lambda4$1.INSTANCE);

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m111getLambda1$intercom_sdk_base_release() {
        return f16lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m112getLambda2$intercom_sdk_base_release() {
        return f17lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m113getLambda3$intercom_sdk_base_release() {
        return f18lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m114getLambda4$intercom_sdk_base_release() {
        return f19lambda4;
    }
}
