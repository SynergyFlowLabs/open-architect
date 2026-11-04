package io.intercom.android.sdk.m5.push;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.w0;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.u;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@Keep
public final class SendMessageWorker extends CoroutineWorker {
    public static final int $stable = 8;

    @NotNull
    private final ConversationRepository conversationRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.push.SendMessageWorker$doWork$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.push.SendMessageWorker", f = "SendMessageWorker.kt", i = {}, l = {31}, m = "doWork", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendMessageWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMessageWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        int i10 = 4 >> 0;
        this.conversationRepository = new ConversationRepository(null, null, null, null, null, null, t0.a(l1.c()), 63, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull kotlin.coroutines.d<? super u.a> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objH = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(objH);
            String strA = getInputData().A(ConversationActionHandlerKt.KEY_TEXT_REPLY);
            if (strA == null) {
                u.a aVarA = u.a.a();
                Intrinsics.checkNotNullExpressionValue(aVarA, "failure(...)");
                return aVarA;
            }
            String strA2 = getInputData().A(ConversationActionHandlerKt.KEY_CONVERSATION_ID);
            if (strA2 == null) {
                u.a aVarA2 = u.a.a();
                Intrinsics.checkNotNullExpressionValue(aVarA2, "failure(...)");
                return aVarA2;
            }
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            n0 n0VarC = l1.c();
            SendMessageWorker$doWork$result$1 sendMessageWorker$doWork$result$1 = new SendMessageWorker$doWork$result$1(strA, this, strA2, string, null);
            anonymousClass1.label = 1;
            objH = i.h(n0VarC, sendMessageWorker$doWork$result$1, anonymousClass1);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objH);
        }
        Intrinsics.checkNotNullExpressionValue(objH, "withContext(...)");
        return (u.a) objH;
    }
}
