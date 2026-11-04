package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.b5;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$36$4$1$4$2", f = "ConversationScreen.kt", i = {}, l = {818, 823}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nConversationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreen.kt\nio/intercom/android/sdk/m5/conversation/ui/ConversationScreenKt$ConversationScreenContent$36$4$1$4$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1059:1\n52#2:1060\n1#3:1061\n*S KotlinDebug\n*F\n+ 1 ConversationScreen.kt\nio/intercom/android/sdk/m5/conversation/ui/ConversationScreenKt$ConversationScreenContent$36$4$1$4$2\n*L\n821#1:1060\n*E\n"})
final class ConversationScreenKt$ConversationScreenContent$36$4$1$4$2 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ androidx.compose.ui.unit.d $density;
    final /* synthetic */ b5 $scrollState;
    final /* synthetic */ androidx.compose.foundation.layout.h0 $this_BoxWithConstraints;
    final /* synthetic */ ConversationUiState $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreenContent$36$4$1$4$2(ConversationUiState conversationUiState, b5 b5Var, androidx.compose.foundation.layout.h0 h0Var, androidx.compose.ui.unit.d dVar, kotlin.coroutines.d<? super ConversationScreenKt$ConversationScreenContent$36$4$1$4$2> dVar2) {
        super(2, dVar2);
        this.$uiState = conversationUiState;
        this.$scrollState = b5Var;
        this.$this_BoxWithConstraints = h0Var;
        this.$density = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$36$4$1$4$2(this.$uiState, this.$scrollState, this.$this_BoxWithConstraints, this.$density, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r9 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (r9 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r8.label
            r7 = 0
            r2 = 2
            r3 = 1
            r7 = 4
            if (r1 == 0) goto L24
            r7 = 7
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L16
            kotlin.ResultKt.m(r9)
            goto L83
        L16:
            r7 = 2
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1f:
            kotlin.ResultKt.m(r9)
            r7 = 3
            goto L54
        L24:
            kotlin.ResultKt.m(r9)
            io.intercom.android.sdk.m5.conversation.states.ConversationUiState r9 = r8.$uiState
            io.intercom.android.sdk.m5.conversation.states.ConversationUiState$Content r9 = (io.intercom.android.sdk.m5.conversation.states.ConversationUiState.Content) r9
            r7 = 3
            io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState r9 = r9.getFloatingIndicatorState()
            io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState$JumpToBottomIndicator r9 = (io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState.JumpToBottomIndicator) r9
            io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState r9 = r9.getJumpToBottomButtonState()
            int r9 = r9.getScrollToPosition()
            androidx.compose.foundation.b5 r1 = r8.$scrollState
            androidx.compose.foundation.layout.h0 r4 = r8.$this_BoxWithConstraints
            r7 = 4
            androidx.compose.ui.unit.d r5 = r8.$density
            r6 = -1
            r7 = 7
            if (r9 != r6) goto L5c
            r7 = 3
            int r9 = r1.A()
            r7 = 6
            r8.label = r3
            java.lang.Object r9 = r1.D(r9, r8)
            if (r9 != r0) goto L54
            goto L82
        L54:
            java.lang.Number r9 = (java.lang.Number) r9
            r7 = 6
            r9.floatValue()
            r7 = 4
            goto L89
        L5c:
            float r3 = r4.g()
            float r4 = io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.getComposerHalfSize()
            float r3 = r3 - r4
            float r3 = androidx.compose.ui.unit.h.r(r3)
            r7 = 6
            float r4 = io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt.access$getJumpToBottomNewMessagesTopOffset$p()
            float r3 = r3 - r4
            float r3 = androidx.compose.ui.unit.h.r(r3)
            r7 = 5
            int r3 = r5.g6(r3)
            r7 = 2
            int r9 = r9 + r3
            r8.label = r2
            java.lang.Object r9 = r1.D(r9, r8)
            if (r9 != r0) goto L83
        L82:
            return r0
        L83:
            java.lang.Number r9 = (java.lang.Number) r9
            r7 = 7
            r9.floatValue()
        L89:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$36$4$1$4$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((ConversationScreenKt$ConversationScreenContent$36$4$1$4$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
