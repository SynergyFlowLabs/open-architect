package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$ConversationBottomBarKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$ConversationBottomBarKt$lambda1$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$ConversationBottomBarKt$lambda1$1 INSTANCE = new ComposableSingletons$ConversationBottomBarKt$lambda1$1();

    ComposableSingletons$ConversationBottomBarKt$lambda1$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(ComposerInputType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5(String it) {
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
            return;
        }
        ComposerState.TextInput textInput = new ComposerState.TextInput("Wubba Lubba Dub Dub!", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, null, null, 28, null);
        Avatar avatarCreate = Avatar.create("", "PR");
        Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
        ConversationBottomBarKt.m258ConversationBottomBarn745XfY(null, new BottomBarUiState(textInput, new CurrentlyTypingState(new AvatarWrapper(avatarCreate, false, 2, null), false, null, TypingIndicatorType.ADMIN, 6, null), InputTypeState.Companion.getDEFAULT(), null, 8, null), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$ConversationBottomBarKt$lambda1$1.invoke$lambda$0((String) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$ConversationBottomBarKt$lambda1$1.invoke$lambda$1((ComposerInputType) obj);
            }
        }, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, null, 0.0f, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$ConversationBottomBarKt$lambda1$1.invoke$lambda$5((String) obj);
            }
        }, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, null, null, null, null, null, null, null, c0Var, 807103936, 6, 260481);
    }
}
