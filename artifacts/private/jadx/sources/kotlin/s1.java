package kotlin;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s1 {
    @e1(version = "1.3")
    @kotlin.internal.f
    @u
    private static final byte[] a(int i10, Function1<? super Integer, q1> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = init.invoke(Integer.valueOf(i11)).x0();
        }
        return r1.k(bArr);
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    @u
    private static final byte[] b(byte... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements;
    }
}
