package io.intercom.android.sdk.m5.conversation.ui;

import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$36$4$1$4$1", f = "ConversationScreen.kt", i = {}, l = {805, 808}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nConversationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreen.kt\nio/intercom/android/sdk/m5/conversation/ui/ConversationScreenKt$ConversationScreenContent$36$4$1$4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1059:1\n360#2,7:1060\n1#3:1067\n*S KotlinDebug\n*F\n+ 1 ConversationScreen.kt\nio/intercom/android/sdk/m5/conversation/ui/ConversationScreenKt$ConversationScreenContent$36$4$1$4$1\n*L\n799#1:1060,7\n*E\n"})
final class ConversationScreenKt$ConversationScreenContent$36$4$1$4$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ androidx.compose.ui.unit.d $density;
    final /* synthetic */ androidx.compose.foundation.lazy.j1 $lazyListState;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onJumpToBottomButtonClicked;
    final /* synthetic */ ConversationUiState $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConversationScreenKt$ConversationScreenContent$36$4$1$4$1(ConversationUiState conversationUiState, androidx.compose.foundation.lazy.j1 j1Var, androidx.compose.ui.unit.d dVar, Function2<? super Integer, ? super Integer, Unit> function2, kotlin.coroutines.d<? super ConversationScreenKt$ConversationScreenContent$36$4$1$4$1> dVar2) {
        super(2, dVar2);
        this.$uiState = conversationUiState;
        this.$lazyListState = j1Var;
        this.$density = dVar;
        this.$onJumpToBottomButtonClicked = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$36$4$1$4$1(this.$uiState, this.$lazyListState, this.$density, this.$onJumpToBottomButtonClicked, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        if (r9.$lazyListState.w(r1, -r6, r9) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r9.$lazyListState.w(r10 + 1, -r6, r9) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$36$4$1$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((ConversationScreenKt$ConversationScreenContent$36$4$1$4$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
