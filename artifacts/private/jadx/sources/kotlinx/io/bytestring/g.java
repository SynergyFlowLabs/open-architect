package kotlinx.io.bytestring;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.r1;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class g {
    static /* synthetic */ boolean A(c cVar, int i10, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length - i11;
        }
        return y(cVar, i10, bArr, i11, i12);
    }

    public static final boolean B(@NotNull c cVar, @NotNull c byteString) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (byteString.r() > cVar.r()) {
            return false;
        }
        return byteString.r() == cVar.r() ? cVar.equals(byteString) : z(cVar, 0, byteString, 0, 0, 12, null);
    }

    public static final boolean C(@NotNull c cVar, @NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (byteArray.length > cVar.r()) {
            return false;
        }
        return A(cVar, 0, byteArray, 0, 0, 12, null);
    }

    @NotNull
    public static final c a() {
        return c.f315746c.a();
    }

    @NotNull
    public static final c b(@NotNull byte... bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return bytes.length == 0 ? c.f315746c.a() : c.f315746c.b(bytes);
    }

    @NotNull
    public static final c c(@NotNull byte... bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return r1.B(bytes) ? c.f315746c.a() : c.f315746c.b(bytes);
    }

    public static final boolean d(@NotNull c cVar, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        return Arrays.equals(cVar.q(), array);
    }

    @NotNull
    public static final String e(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return StringsKt.F1(cVar.q());
    }

    @NotNull
    public static final c f(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return c.f315746c.b(StringsKt.I1(str));
    }

    public static final boolean g(@NotNull c cVar, @NotNull c byteString) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (byteString.r() > cVar.r()) {
            return false;
        }
        return byteString.r() == cVar.r() ? cVar.equals(byteString) : z(cVar, cVar.r() - byteString.r(), byteString, 0, 0, 12, null);
    }

    public static final boolean h(@NotNull c cVar, @NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (byteArray.length > cVar.r()) {
            return false;
        }
        return A(cVar, cVar.r() - byteArray.length, byteArray, 0, 0, 12, null);
    }

    @NotNull
    public static final IntRange i(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return r.W1(0, cVar.r());
    }

    public static final int j(@NotNull c cVar, byte b10, int i10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        byte[] bArrQ = cVar.q();
        int iR = cVar.r();
        for (int iMax = Math.max(i10, 0); iMax < iR; iMax++) {
            if (bArrQ[iMax] == b10) {
                return iMax;
            }
        }
        return -1;
    }

    public static final int k(@NotNull c cVar, @NotNull c byteString, int i10) {
        c cVar2;
        c cVar3;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (p(byteString)) {
            return Math.max(Math.min(i10, cVar.r()), 0);
        }
        byte[] bArrQ = cVar.q();
        byte bP = byteString.p(0);
        int iMax = Math.max(i10, 0);
        int iR = cVar.r() - byteString.r();
        if (iMax <= iR) {
            int i11 = iMax;
            while (true) {
                if (bArrQ[i11] == bP) {
                    cVar2 = cVar;
                    cVar3 = byteString;
                    if (z(cVar2, i11, cVar3, 0, 0, 12, null)) {
                        return i11;
                    }
                } else {
                    cVar2 = cVar;
                    cVar3 = byteString;
                }
                if (i11 == iR) {
                    break;
                }
                i11++;
                cVar = cVar2;
                byteString = cVar3;
            }
        }
        return -1;
    }

    public static final int l(@NotNull c cVar, @NotNull byte[] byteArray, int i10) {
        c cVar2;
        byte[] bArr;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (byteArray.length == 0) {
            return Math.max(Math.min(i10, cVar.r()), 0);
        }
        byte[] bArrQ = cVar.q();
        byte b10 = byteArray[0];
        int iMax = Math.max(0, i10);
        int iR = cVar.r() - byteArray.length;
        if (iMax <= iR) {
            int i11 = iMax;
            while (true) {
                if (bArrQ[i11] == b10) {
                    cVar2 = cVar;
                    bArr = byteArray;
                    if (A(cVar2, i11, bArr, 0, 0, 12, null)) {
                        return i11;
                    }
                } else {
                    cVar2 = cVar;
                    bArr = byteArray;
                }
                if (i11 == iR) {
                    break;
                }
                i11++;
                cVar = cVar2;
                byteArray = bArr;
            }
        }
        return -1;
    }

    public static /* synthetic */ int m(c cVar, byte b10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
            int i12 = 0 << 0;
        }
        return j(cVar, b10, i10);
    }

    public static /* synthetic */ int n(c cVar, c cVar2, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return k(cVar, cVar2, i10);
    }

    public static /* synthetic */ int o(c cVar, byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return l(cVar, bArr, i10);
    }

    public static final boolean p(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.r() == 0;
    }

    public static final boolean q(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return !p(cVar);
    }

    public static final int r(@NotNull c cVar, byte b10, int i10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        byte[] bArrQ = cVar.q();
        int iR = cVar.r() - 1;
        int iMax = Math.max(0, i10);
        if (iMax > iR) {
            return -1;
        }
        while (bArrQ[iR] != b10) {
            if (iR == iMax) {
                return -1;
            }
            iR--;
        }
        return iR;
    }

    public static final int s(@NotNull c cVar, @NotNull c byteString, int i10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (p(byteString)) {
            return cVar.r();
        }
        int iR = cVar.r() - byteString.r();
        int iMax = Math.max(0, i10);
        if (iMax > iR) {
            return -1;
        }
        int i11 = iR;
        while (true) {
            c cVar2 = cVar;
            c cVar3 = byteString;
            if (z(cVar2, i11, cVar3, 0, 0, 8, null)) {
                return i11;
            }
            if (i11 == iMax) {
                return -1;
            }
            i11--;
            cVar = cVar2;
            byteString = cVar3;
        }
    }

    public static final int t(@NotNull c cVar, @NotNull byte[] byteArray, int i10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (byteArray.length == 0) {
            return cVar.r();
        }
        int iR = cVar.r() - byteArray.length;
        int iMax = Math.max(0, i10);
        if (iMax > iR) {
            return -1;
        }
        int i11 = iR;
        while (true) {
            c cVar2 = cVar;
            byte[] bArr = byteArray;
            if (A(cVar2, i11, bArr, 0, 0, 8, null)) {
                return i11;
            }
            if (i11 == iMax) {
                return -1;
            }
            i11--;
            cVar = cVar2;
            byteArray = bArr;
        }
    }

    public static /* synthetic */ int u(c cVar, byte b10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return r(cVar, b10, i10);
    }

    public static /* synthetic */ int v(c cVar, c cVar2, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return s(cVar, cVar2, i10);
    }

    public static /* synthetic */ int w(c cVar, byte[] bArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return t(cVar, bArr, i10);
    }

    private static final boolean x(c cVar, int i10, c cVar2, int i11, int i12) {
        byte[] bArrQ = cVar.q();
        byte[] bArrQ2 = cVar2.q();
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArrQ[i10 + i13] != bArrQ2[i11 + i13]) {
                return false;
            }
        }
        return true;
    }

    private static final boolean y(c cVar, int i10, byte[] bArr, int i11, int i12) {
        byte[] bArrQ = cVar.q();
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArrQ[i10 + i13] != bArr[i11 + i13]) {
                return false;
            }
        }
        return true;
    }

    static /* synthetic */ boolean z(c cVar, int i10, c cVar2, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = cVar2.r() - i11;
        }
        return x(cVar, i10, cVar2, i11, i12);
    }
}
