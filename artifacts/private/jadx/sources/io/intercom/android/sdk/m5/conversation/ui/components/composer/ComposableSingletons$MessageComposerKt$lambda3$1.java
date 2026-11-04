package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$MessageComposerKt$lambda3$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$MessageComposerKt$lambda3$1 INSTANCE = new ComposableSingletons$MessageComposerKt$lambda3$1();

    ComposableSingletons$MessageComposerKt$lambda3$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(String it) {
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
            MessageComposerKt.MessageComposer(null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$MessageComposerKt$lambda3$1.invoke$lambda$0((String) obj);
                }
            }, new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, null, null, 28, null), null, null, null, null, null, null, null, null, null, null, null, c0Var, 560, 0, 16377);
        }
    }
}
