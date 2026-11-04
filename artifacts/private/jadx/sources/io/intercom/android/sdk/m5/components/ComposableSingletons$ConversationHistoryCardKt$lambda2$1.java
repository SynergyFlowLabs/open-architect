package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.i6;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationHistoryCardKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$ConversationHistoryCardKt$lambda2$1 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
    public static final ComposableSingletons$ConversationHistoryCardKt$lambda2$1 INSTANCE = new ComposableSingletons$ConversationHistoryCardKt$lambda2$1();

    ComposableSingletons$ConversationHistoryCardKt$lambda2$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(Conversation it) {
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
        androidx.compose.ui.a0 a0VarH = i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int i11 = 0;
        while (i11 < 2) {
            boolean z10 = i11 == 0;
            Ticket ticket = new Ticket(null, null, "Export button not working", null, null, null, null, null, null, 0, null, null, null, null, 0L, 32763, null);
            LastParticipatingAdmin.Builder builderWithAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
            Intrinsics.checkNotNullExpressionValue(builderWithAvatar, "withAvatar(...)");
            listCreateListBuilder.add(new Conversation("123", z10, null, CollectionsKt.listOf(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, builderWithAvatar, null, false, false, null, null, false, ticket, null, null, null, null, null, null, null, 1044436, null));
            i11++;
        }
        int i12 = 0;
        while (i12 < 2) {
            boolean z11 = i12 == 0;
            LastParticipatingAdmin.Builder builderWithAvatar2 = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
            Intrinsics.checkNotNullExpressionValue(builderWithAvatar2, "withAvatar(...)");
            listCreateListBuilder.add(new Conversation("123", z11, null, CollectionsKt.listOf(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, builderWithAvatar2, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048532, null));
            i12++;
        }
        Unit unit = Unit.f312394a;
        ConversationHistoryCardKt.ConversationHistoryCard(a0VarH, "Your recent conversations", CollectionsKt.build(listCreateListBuilder), new Function1() { // from class: io.intercom.android.sdk.m5.components.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$ConversationHistoryCardKt$lambda2$1.invoke$lambda$3((Conversation) obj);
            }
        }, c0Var, 3638, 0);
    }
}
