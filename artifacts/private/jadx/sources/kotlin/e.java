package kotlin;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.6")
    @kotlin.internal.f
    private static final <T> int a(Comparable<? super T> comparable, T t10) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        return comparable.compareTo(t10);
    }
}
