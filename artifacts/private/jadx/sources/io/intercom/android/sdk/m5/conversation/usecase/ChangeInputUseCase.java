package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nChangeInputUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeInputUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/ChangeInputUseCase\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,27:1\n226#2,5:28\n*S KotlinDebug\n*F\n+ 1 ChangeInputUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/ChangeInputUseCase\n*L\n16#1:28,5\n*E\n"})
public final class ChangeInputUseCase {
    public static final int $stable = 0;

    public final void invoke(@NotNull k0<ConversationClientState> clientState, @NotNull ComposerInputType composerInputType) {
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        ComposerInputType inputType = composerInputType;
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        while (true) {
            ConversationClientState value = clientState.getValue();
            if (clientState.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, null, inputType, 12, null), null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194287, null))) {
                return;
            } else {
                inputType = composerInputType;
            }
        }
    }
}
