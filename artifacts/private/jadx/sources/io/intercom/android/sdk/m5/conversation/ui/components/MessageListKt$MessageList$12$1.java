package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.b5;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$12$1", f = "MessageList.kt", i = {}, l = {164, 166, 172}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMessageList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageList.kt\nio/intercom/android/sdk/m5/conversation/ui/components/MessageListKt$MessageList$12$1\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,620:1\n61#2:621\n70#3:622\n22#4:623\n*S KotlinDebug\n*F\n+ 1 MessageList.kt\nio/intercom/android/sdk/m5/conversation/ui/components/MessageListKt$MessageList$12$1\n*L\n170#1:621\n170#1:622\n170#1:623\n*E\n"})
final class MessageListKt$MessageList$12$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ n3<Boolean> $autoScrollEnabled$delegate;
    final /* synthetic */ n3<MessageListCoordinates> $currentBounds$delegate;
    final /* synthetic */ n3<Boolean> $hasUserScrolled$delegate;
    final /* synthetic */ n7<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ n3<MessageListCoordinates> $oldBounds$delegate;
    final /* synthetic */ b5 $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageListKt$MessageList$12$1(b5 b5Var, n3<MessageListCoordinates> n3Var, n3<MessageListCoordinates> n3Var2, n7<KeyboardState> n7Var, n3<Boolean> n3Var3, n3<Boolean> n3Var4, kotlin.coroutines.d<? super MessageListKt$MessageList$12$1> dVar) {
        super(2, dVar);
        this.$scrollState = b5Var;
        this.$oldBounds$delegate = n3Var;
        this.$currentBounds$delegate = n3Var2;
        this.$keyboardAsState$delegate = n7Var;
        this.$hasUserScrolled$delegate = n3Var3;
        this.$autoScrollEnabled$delegate = n3Var4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new MessageListKt$MessageList$12$1(this.$scrollState, this.$oldBounds$delegate, this.$currentBounds$delegate, this.$keyboardAsState$delegate, this.$hasUserScrolled$delegate, this.$autoScrollEnabled$delegate, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
    
        if (androidx.compose.foundation.gestures.v3.e(r1, r9, r8) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
    
        if (androidx.compose.foundation.gestures.v3.e(r1, r9, r8) == r0) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$12$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((MessageListKt$MessageList$12$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
