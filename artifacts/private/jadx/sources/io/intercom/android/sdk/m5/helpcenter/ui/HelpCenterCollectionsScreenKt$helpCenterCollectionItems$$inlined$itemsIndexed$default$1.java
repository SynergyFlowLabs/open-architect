package io.intercom.android.sdk.m5.helpcenter.ui;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public final class HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$1 implements Function1<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function2 $key;

    public HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        this.$key = function2;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i10) {
        return this.$key.invoke(Integer.valueOf(i10), this.$items.get(i10));
    }
}
