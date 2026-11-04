package io.intercom.android.sdk.m5.conversation.ui.components;

import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageListKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$MessageListKt$lambda3$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$MessageListKt$lambda3$1 INSTANCE = new ComposableSingletons$MessageListKt$lambda3$1();

    ComposableSingletons$MessageListKt$lambda3$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(ReplyOption it) {
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
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(new ContentRow.SpecialNoticeRow("Our response times are slower than usual. We’re working hard to get to your message"));
        MessageListKt.MessageList(null, CollectionsKt.build(listCreateListBuilder), null, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$MessageListKt$lambda3$1.invoke$lambda$1((ReplyOption) obj);
            }
        }, null, null, null, null, null, false, null, null, false, null, c0Var, 24640, 0, 32749);
    }
}
