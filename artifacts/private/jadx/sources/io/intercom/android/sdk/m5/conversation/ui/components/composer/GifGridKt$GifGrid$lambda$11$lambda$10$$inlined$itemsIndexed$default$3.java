package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public final class GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$3 implements Function1<Integer, androidx.compose.foundation.lazy.staggeredgrid.f1> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function2 $span;

    public GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$3(Function2 function2, List list) {
        this.$span = function2;
        this.$items = list;
    }

    public final androidx.compose.foundation.lazy.staggeredgrid.f1 invoke(int i10) {
        return (androidx.compose.foundation.lazy.staggeredgrid.f1) this.$span.invoke(Integer.valueOf(i10), this.$items.get(i10));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.staggeredgrid.f1 invoke(Integer num) {
        return invoke(num.intValue());
    }
}
