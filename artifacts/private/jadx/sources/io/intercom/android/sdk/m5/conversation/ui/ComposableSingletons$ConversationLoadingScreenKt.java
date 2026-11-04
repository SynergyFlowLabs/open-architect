package io.intercom.android.sdk.m5.conversation.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$ConversationLoadingScreenKt {

    @NotNull
    public static final ComposableSingletons$ConversationLoadingScreenKt INSTANCE = new ComposableSingletons$ConversationLoadingScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f83lambda1 = androidx.compose.runtime.internal.w.c(550147345, false, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.ComposableSingletons$ConversationLoadingScreenKt$lambda-1$1
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
                ConversationLoadingScreenKt.ConversationLoadingScreen(null, c0Var, 0, 1);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> m196getLambda1$intercom_sdk_base_release() {
        return f83lambda1;
    }
}
