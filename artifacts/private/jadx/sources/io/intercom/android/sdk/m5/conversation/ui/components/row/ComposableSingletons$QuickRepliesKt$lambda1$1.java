package io.intercom.android.sdk.m5.conversation.ui.components.row;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$QuickRepliesKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$QuickRepliesKt$lambda1$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$QuickRepliesKt$lambda1$1 INSTANCE = new ComposableSingletons$QuickRepliesKt$lambda1$1();

    ComposableSingletons$QuickRepliesKt$lambda1$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(QuickReply it) {
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
        } else {
            QuickRepliesKt.QuickReplies(CollectionsKt.listOf((Object[]) new QuickReply[]{new QuickReply("1", "Option 1"), new QuickReply("2", "Option 2"), new QuickReply(androidx.exifinterface.media.a.f51345a5, "Option 3"), new QuickReply("4", "Option 4"), new QuickReply("5", "Option 5")}), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$QuickRepliesKt$lambda1$1.invoke$lambda$0((QuickReply) obj);
                }
            }, null, c0Var, 48, 4);
        }
    }
}
