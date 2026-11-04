package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationEndedCardKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$ConversationEndedCardKt$lambda4$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$ConversationEndedCardKt$lambda4$1 INSTANCE = new ComposableSingletons$ConversationEndedCardKt$lambda4$1();

    ComposableSingletons$ConversationEndedCardKt$lambda4$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
        invoke(c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
        int i11 = 2 >> 2;
        if ((i10 & 11) == 2 && c0Var.d()) {
            c0Var.u();
            return;
        }
        ConversationEndedCardKt.ConversationEndedCard(null, new Function0() { // from class: io.intercom.android.sdk.m5.components.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, new ComposerState.ConversationEnded(new StringProvider.ActualString("You have another conversation about this issue"), new ComposerState.ConversationEnded.ConversationEndedCta(new StringProvider.ActualString("Continue the conversation"), R.drawable.intercom_send_message_icon, "123")), c0Var, (StringProvider.$stable << 6) | 48, 1);
    }
}
