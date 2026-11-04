package kotlinx.io;

import kotlin.a1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class v {
    public static final int a(@NotNull t tVar, byte b10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        if (i10 < 0 || i10 >= tVar.n()) {
            throw new IllegalArgumentException(String.valueOf(i10).toString());
        }
        if (i10 > i11 || i11 > tVar.n()) {
            throw new IllegalArgumentException(String.valueOf(i11).toString());
        }
        int iH = tVar.h();
        byte[] bArrB = tVar.b(true);
        while (i10 < i11) {
            if (bArrB[iH + i10] == b10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int b(@NotNull t tVar, @NotNull byte[] bytes, int i10) {
        int iA;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int iN = (tVar.n() - bytes.length) + 1;
        byte b10 = bytes[0];
        byte[] bArrB = tVar.b(true);
        while (i10 < iN && (iA = a(tVar, b10, i10, iN)) >= 0) {
            int length = bytes.length;
            for (int i11 = 1; i11 < length; i11++) {
                if (bArrB[tVar.h() + iA + i11] != bytes[i11]) {
                    i10++;
                }
            }
            return iA;
        }
        return -1;
    }

    public static final int c(@NotNull t tVar, @NotNull byte[] bytes, int i10) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        byte b10 = bytes[0];
        while (i10 >= 0 && i10 < tVar.n() && a(tVar, b10, i10, tVar.n()) >= 0) {
            byte[] bArrB = tVar.b(true);
            t tVarF = tVar;
            int i11 = i10;
            for (byte b11 : bytes) {
                if (i11 == tVarF.n()) {
                    tVarF = tVarF.f();
                    if (tVarF == null) {
                        return -1;
                    }
                    bArrB = tVarF.b(true);
                    i11 = 0;
                }
                if (b11 != bArrB[tVarF.h() + i11]) {
                    i10++;
                } else {
                    i11++;
                }
            }
            return i10;
        }
        return -1;
    }

    @a1
    public static final boolean d(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        return tVar.n() == 0;
    }
}
