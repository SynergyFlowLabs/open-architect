package io.intercom.android.sdk.m5.conversation;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1", f = "ConversationViewModel.kt", i = {0, 0}, l = {336}, m = "emit", n = {"this", "newNetworkState"}, s = {"L$0", "L$1"})
final class ConversationViewModel$6$1$emit$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationViewModel.AnonymousClass6.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConversationViewModel$6$1$emit$1(ConversationViewModel.AnonymousClass6.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.d<? super ConversationViewModel$6$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1$emit$1 for r2v2 'this'  kotlin.coroutines.d
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.String r1 = "Androeed.ru"
            r2.result = r3
            int r3 = r2.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 | r0
            r1 = 1
            r2.label = r3
            io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1<T> r3 = r2.this$0
            r0 = 0
            java.lang.Object r2 = r3.emit(r0, r2)
            r1 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1$emit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
