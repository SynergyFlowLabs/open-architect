package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.c0;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.TicketLink;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$TicketLinksCardKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
final class ComposableSingletons$TicketLinksCardKt$lambda1$1 implements Function2<c0, Integer, Unit> {
    public static final ComposableSingletons$TicketLinksCardKt$lambda1$1 INSTANCE = new ComposableSingletons$TicketLinksCardKt$lambda1$1();

    ComposableSingletons$TicketLinksCardKt$lambda1$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(TicketType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
        invoke(c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(c0 c0Var, int i10) {
        if ((i10 & 11) == 2 && c0Var.d()) {
            c0Var.u();
            return;
        }
        TicketType.Companion companion = TicketType.Companion;
        TicketLinksCardKt.TicketLinksCard(new HomeCards.HomeTicketLinksData("Create a ticket", HomeCardType.TICKET_LINKS, CollectionsKt.listOf((Object[]) new TicketLink[]{new TicketLink(1, "Billing issue", "", 0, companion.getNULL()), new TicketLink(2, "Bug", "", 1, companion.getNULL())})), new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableSingletons$TicketLinksCardKt$lambda1$1.invoke$lambda$0((TicketType) obj);
            }
        }, c0Var, 56);
    }
}
