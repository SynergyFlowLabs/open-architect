package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.c0;
import io.intercom.android.sdk.models.Conversation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
final class InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1 implements Function2<c0, Integer, Unit> {
    final /* synthetic */ androidx.paging.compose.b<Conversation> $lazyPagingItems;

    InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1(androidx.paging.compose.b<Conversation> bVar) {
        this.$lazyPagingItems = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(androidx.paging.compose.b lazyPagingItems, w0 LazyColumn) {
        Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        InboxContentScreenItemsKt.inboxContentScreenItems(LazyColumn, lazyPagingItems, new Function1() { // from class: io.intercom.android.sdk.m5.inbox.ui.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1.invoke$lambda$1$lambda$0((Conversation) obj);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Conversation it) {
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
        } else {
            final androidx.paging.compose.b<Conversation> bVar = this.$lazyPagingItems;
            androidx.compose.foundation.lazy.h.h(null, null, null, false, null, null, null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.inbox.ui.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1.invoke$lambda$1(bVar, (w0) obj);
                }
            }, c0Var, 0, 511);
        }
    }
}
