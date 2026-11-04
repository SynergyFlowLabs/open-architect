package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class SendGifUseCase {
    public static final int $stable = 8;

    @NotNull
    private final ChangeInputUseCase changeInputUseCase;

    @NotNull
    private final SendMessageUseCase sendMessageUseCase;

    public SendGifUseCase(@NotNull SendMessageUseCase sendMessageUseCase, @NotNull ChangeInputUseCase changeInputUseCase) {
        Intrinsics.checkNotNullParameter(sendMessageUseCase, "sendMessageUseCase");
        Intrinsics.checkNotNullParameter(changeInputUseCase, "changeInputUseCase");
        this.sendMessageUseCase = sendMessageUseCase;
        this.changeInputUseCase = changeInputUseCase;
    }

    @Nullable
    public final Object invoke(@NotNull k0<ConversationClientState> k0Var, @NotNull MediaData.Gif gif, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.changeInputUseCase.invoke(k0Var, ComposerInputType.Text.INSTANCE);
        Object objInvoke$default = SendMessageUseCase.invoke$default(this.sendMessageUseCase, k0Var, CollectionsKt.listOf(new Block.Builder().withType("image").withUrl(gif.getUrl()).withAttribution(gif.getAttribution()).withHeight(gif.getHeight()).withWidth(gif.getWidth())), null, dVar, 4, null);
        return objInvoke$default == kotlin.coroutines.intrinsics.b.l() ? objInvoke$default : Unit.f312394a;
    }
}
