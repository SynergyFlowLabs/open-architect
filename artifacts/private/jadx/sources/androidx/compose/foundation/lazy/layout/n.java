package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,204:1\n44#2:205\n472#2:206\n472#2:207\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n*L\n180#1:205\n185#1:206\n194#1:207\n*E\n"})
public final class n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int b(androidx.compose.runtime.collection.d<m.a<T>> dVar, int i10) {
        int iR = dVar.R() - 1;
        int i11 = 0;
        while (i11 < iR) {
            int i12 = ((iR - i11) / 2) + i11;
            int iB = dVar.f35552a[i12].b();
            if (iB != i10) {
                if (iB < i10) {
                    i11 = i12 + 1;
                    if (i10 < dVar.f35552a[i11].b()) {
                    }
                } else {
                    iR = i12 - 1;
                }
            }
            return i12;
        }
        return i11;
    }
}
