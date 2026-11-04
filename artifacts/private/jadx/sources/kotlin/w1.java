package kotlin;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w1 {
    @e1(version = "1.3")
    @kotlin.internal.f
    @u
    private static final int[] a(int i10, Function1<? super Integer, u1> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = init.invoke(Integer.valueOf(i11)).z0();
        }
        return v1.k(iArr);
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    @u
    private static final int[] b(int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements;
    }
}
