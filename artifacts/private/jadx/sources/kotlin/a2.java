package kotlin;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a2 {
    @e1(version = "1.3")
    @kotlin.internal.f
    @u
    private static final long[] a(int i10, Function1<? super Integer, y1> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = init.invoke(Integer.valueOf(i11)).z0();
        }
        return z1.k(jArr);
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    @u
    private static final long[] b(long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements;
    }
}
