package kotlin.sequences;

import java.util.Enumeration;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
class q extends p {
    @kotlin.internal.f
    private static final <T> Sequence<T> c(Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        return r.e(CollectionsKt.iterator(enumeration));
    }
}
