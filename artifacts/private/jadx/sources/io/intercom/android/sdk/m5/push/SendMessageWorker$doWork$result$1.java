package io.intercom.android.sdk.m5.push;

import androidx.work.u;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "io.intercom.android.sdk.m5.push.SendMessageWorker$doWork$result$1", f = "SendMessageWorker.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
final class SendMessageWorker$doWork$result$1 extends o implements Function2<s0, kotlin.coroutines.d<? super u.a>, Object> {
    final /* synthetic */ String $clientUUID;
    final /* synthetic */ String $conversationId;
    final /* synthetic */ String $messageText;
    int label;
    final /* synthetic */ SendMessageWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendMessageWorker$doWork$result$1(String str, SendMessageWorker sendMessageWorker, String str2, String str3, kotlin.coroutines.d<? super SendMessageWorker$doWork$result$1> dVar) {
        super(2, dVar);
        this.$messageText = str;
        this.this$0 = sendMessageWorker;
        this.$conversationId = str2;
        this.$clientUUID = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new SendMessageWorker$doWork$result$1(this.$messageText, this.this$0, this.$conversationId, this.$clientUUID, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            List<Block.Builder> blocksForText = new BlockFactory(new TextSplittingStrategy()).getBlocksForText(this.$messageText);
            ConversationRepository conversationRepository = this.this$0.conversationRepository;
            String str = this.$conversationId;
            String str2 = this.$clientUUID;
            Intrinsics.checkNotNull(blocksForText);
            this.label = 1;
            int i11 = 4 ^ 0;
            obj = conversationRepository.replyToConversation(str, str2, blocksForText, null, this);
            if (obj == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if (networkResponse instanceof NetworkResponse.ClientError) {
            return u.a.a();
        }
        if (!(networkResponse instanceof NetworkResponse.NetworkError) && !(networkResponse instanceof NetworkResponse.ServerError)) {
            if (networkResponse instanceof NetworkResponse.Success) {
                return u.a.e();
            }
            throw new k0();
        }
        return u.a.d();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super u.a> dVar) {
        return ((SendMessageWorker$doWork$result$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
