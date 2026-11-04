package kotlin;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g2 {
    @e1(version = "1.3")
    @kotlin.internal.f
    @u
    private static final short[] a(int i10, Function1<? super Integer, e2> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        short[] sArr = new short[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            sArr[i11] = init.invoke(Integer.valueOf(i11)).x0();
        }
        return f2.k(sArr);
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    @u
    private static final short[] b(short... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements;
    }
}
