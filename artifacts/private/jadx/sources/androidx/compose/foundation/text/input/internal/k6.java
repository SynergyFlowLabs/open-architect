package androidx.compose.foundation.text.input.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class k6 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> b(List<? extends T> list, List<? extends T> list2) {
        List<? extends T> list3;
        List<? extends T> list4 = list;
        if ((list4 == null || list4.isEmpty()) && ((list3 = list2) == null || list3.isEmpty())) {
            return null;
        }
        if (list4 == null || list4.isEmpty()) {
            return list2;
        }
        List<? extends T> list5 = list2;
        if (list5 == null || list5.isEmpty()) {
            return list;
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.addAll(list4);
        listCreateListBuilder.addAll(list5);
        return CollectionsKt.build(listCreateListBuilder);
    }
}
