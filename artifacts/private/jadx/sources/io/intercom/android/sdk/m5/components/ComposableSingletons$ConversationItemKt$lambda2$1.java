package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationItemKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationItem.kt\nio/intercom/android/sdk/m5/components/ComposableSingletons$ConversationItemKt$lambda-2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,256:1\n113#2:257\n*S KotlinDebug\n*F\n+ 1 ConversationItem.kt\nio/intercom/android/sdk/m5/components/ComposableSingletons$ConversationItemKt$lambda-2$1\n*L\n196#1:257\n*E\n"})
final class ComposableSingletons$ConversationItemKt$lambda2$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$ConversationItemKt$lambda2$1 INSTANCE = new ComposableSingletons$ConversationItemKt$lambda2$1();

    ComposableSingletons$ConversationItemKt$lambda2$1() {
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
        float f10 = 16;
        ConversationItemKt.ConversationItem(ConversationItemKt.sampleConversation$default(new Ticket(null, null, "Feature request", null, null, null, new Ticket.Status("Resolved", "resolved", null, false, 0L, 28, null), null, null, 0, null, null, null, null, 0L, 32699, null), false, 2, null), androidx.compose.foundation.v.d(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), d5.g(androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10)), false, new Function0() { // from class: io.intercom.android.sdk.m5.components.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, c0Var, 24584, 8);
    }
}
