package okio.internal;

import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.w0;
import okio.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
@oj.i(name = "-SegmentedByteString")
public final class h {
    public static final int a(@NotNull int[] iArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final void b(@NotNull y0 y0Var, int i10, @NotNull byte[] target, int i11, int i12) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        long j10 = i12;
        okio.i.e(y0Var.v0(), i10, j10);
        okio.i.e(target.length, i11, j10);
        int i13 = i12 + i10;
        int iN = n(y0Var, i10);
        while (i10 < i13) {
            int i14 = iN == 0 ? 0 : y0Var.J0()[iN - 1];
            int i15 = y0Var.J0()[iN] - i14;
            int i16 = y0Var.J0()[y0Var.K0().length + iN];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = i16 + (i10 - i14);
            ArraysKt.copyInto(y0Var.K0()[iN], target, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iN++;
        }
    }

    public static final boolean c(@NotNull y0 y0Var, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        if (obj == y0Var) {
            return true;
        }
        if (obj instanceof okio.o) {
            okio.o oVar = (okio.o) obj;
            if (oVar.v0() == y0Var.v0() && y0Var.n0(0, oVar, 0, y0Var.v0())) {
                return true;
            }
        }
        return false;
    }

    public static final int d(@NotNull y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return y0Var.J0()[y0Var.K0().length - 1];
    }

    public static final int e(@NotNull y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        int I = y0Var.I();
        if (I != 0) {
            return I;
        }
        int length = y0Var.K0().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = y0Var.J0()[length + i10];
            int i14 = y0Var.J0()[i10];
            byte[] bArr = y0Var.K0()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        y0Var.q0(i11);
        return i11;
    }

    public static final byte f(@NotNull y0 y0Var, int i10) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        okio.i.e(y0Var.J0()[y0Var.K0().length - 1], i10, 1L);
        int iN = n(y0Var, i10);
        return y0Var.K0()[iN][(i10 - (iN == 0 ? 0 : y0Var.J0()[iN - 1])) + y0Var.J0()[y0Var.K0().length + iN]];
    }

    public static final boolean g(@NotNull y0 y0Var, int i10, @NotNull okio.o other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > y0Var.v0() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iN = n(y0Var, i10);
        while (i10 < i13) {
            int i14 = iN == 0 ? 0 : y0Var.J0()[iN - 1];
            int i15 = y0Var.J0()[iN] - i14;
            int i16 = y0Var.J0()[y0Var.K0().length + iN];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.o0(i11, y0Var.K0()[iN], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iN++;
        }
        return true;
    }

    public static final boolean h(@NotNull y0 y0Var, int i10, @NotNull byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > y0Var.v0() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iN = n(y0Var, i10);
        while (i10 < i13) {
            int i14 = iN == 0 ? 0 : y0Var.J0()[iN - 1];
            int i15 = y0Var.J0()[iN] - i14;
            int i16 = y0Var.J0()[y0Var.K0().length + iN];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!okio.i.d(y0Var.K0()[iN], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iN++;
        }
        return true;
    }

    @NotNull
    public static final okio.o i(@NotNull y0 y0Var, int i10, int i11) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        int iL = okio.i.l(y0Var, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (iL > y0Var.v0()) {
            throw new IllegalArgumentException(("endIndex=" + iL + " > length(" + y0Var.v0() + ')').toString());
        }
        int i12 = iL - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iL + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iL == y0Var.v0()) {
            return y0Var;
        }
        if (i10 == iL) {
            return okio.o.f335048f;
        }
        int iN = n(y0Var, i10);
        int iN2 = n(y0Var, iL - 1);
        byte[][] bArr = (byte[][]) ArraysKt.copyOfRange(y0Var.K0(), iN, iN2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iN <= iN2) {
            int i13 = iN;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(y0Var.J0()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = y0Var.J0()[y0Var.K0().length + i13];
                if (i13 == iN2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iN != 0 ? y0Var.J0()[iN - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new y0(bArr, iArr);
    }

    @NotNull
    public static final byte[] j(@NotNull y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        byte[] bArr = new byte[y0Var.v0()];
        int length = y0Var.K0().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = y0Var.J0()[length + i10];
            int i14 = y0Var.J0()[i10];
            int i15 = i14 - i11;
            ArraysKt.copyInto(y0Var.K0()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public static final void k(@NotNull y0 y0Var, @NotNull okio.l buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int iN = n(y0Var, i10);
        while (i10 < i12) {
            int i13 = iN == 0 ? 0 : y0Var.J0()[iN - 1];
            int i14 = y0Var.J0()[iN] - i13;
            int i15 = y0Var.J0()[y0Var.K0().length + iN];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            w0 w0Var = new w0(y0Var.K0()[iN], i16, i16 + iMin, true, false);
            w0 w0Var2 = buffer.f335034a;
            if (w0Var2 == null) {
                w0Var.f335134g = w0Var;
                w0Var.f335133f = w0Var;
                buffer.f335034a = w0Var;
            } else {
                Intrinsics.checkNotNull(w0Var2);
                w0 w0Var3 = w0Var2.f335134g;
                Intrinsics.checkNotNull(w0Var3);
                w0Var3.c(w0Var);
            }
            i10 += iMin;
            iN++;
        }
        buffer.B0(buffer.size() + ((long) i11));
    }

    private static final void l(y0 y0Var, int i10, int i11, pj.n<? super byte[], ? super Integer, ? super Integer, Unit> nVar) {
        int iN = n(y0Var, i10);
        while (i10 < i11) {
            int i12 = iN == 0 ? 0 : y0Var.J0()[iN - 1];
            int i13 = y0Var.J0()[iN] - i12;
            int i14 = y0Var.J0()[y0Var.K0().length + iN];
            int iMin = Math.min(i11, i13 + i12) - i10;
            nVar.invoke(y0Var.K0()[iN], Integer.valueOf(i14 + (i10 - i12)), Integer.valueOf(iMin));
            i10 += iMin;
            iN++;
        }
    }

    public static final void m(@NotNull y0 y0Var, @NotNull pj.n<? super byte[], ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = y0Var.K0().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = y0Var.J0()[length + i10];
            int i13 = y0Var.J0()[i10];
            action.invoke(y0Var.K0()[i10], Integer.valueOf(i12), Integer.valueOf(i13 - i11));
            i10++;
            i11 = i13;
        }
    }

    public static final int n(@NotNull y0 y0Var, int i10) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        int iA = a(y0Var.J0(), i10 + 1, 0, y0Var.K0().length);
        return iA >= 0 ? iA : ~iA;
    }
}
