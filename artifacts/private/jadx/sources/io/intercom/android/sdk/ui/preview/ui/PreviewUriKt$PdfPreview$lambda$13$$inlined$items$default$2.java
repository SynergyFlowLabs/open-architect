package io.intercom.android.sdk.ui.preview.ui;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$2 implements Function1<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $key;

    public PreviewUriKt$PdfPreview$lambda$13$$inlined$items$default$2(Function1 function1, List list) {
        this.$key = function1;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i10) {
        return this.$key.invoke(this.$items.get(i10));
    }
}
