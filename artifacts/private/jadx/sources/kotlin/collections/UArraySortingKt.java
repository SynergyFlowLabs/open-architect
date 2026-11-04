package kotlin.collections;

import kotlin.e2;
import kotlin.f2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.r1;
import kotlin.u;
import kotlin.v1;
import kotlin.z1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class UArraySortingKt {
    @u
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m887partitionnroSd4(long[] jArr, int i10, int i11) {
        long jT = z1.t(jArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (Long.compareUnsigned(z1.t(jArr, i10), jT) < 0) {
                i10++;
            }
            while (Long.compareUnsigned(z1.t(jArr, i11), jT) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                long jT2 = z1.t(jArr, i10);
                z1.D(jArr, i10, z1.t(jArr, i11));
                z1.D(jArr, i11, jT2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @u
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m888partition4UcCI2c(byte[] bArr, int i10, int i11) {
        int i12;
        byte bT = r1.t(bArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                i12 = bT & 255;
                if (Intrinsics.compare(r1.t(bArr, i10) & 255, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(r1.t(bArr, i11) & 255, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                byte bT2 = r1.t(bArr, i10);
                r1.D(bArr, i10, r1.t(bArr, i11));
                r1.D(bArr, i11, bT2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @u
    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m889partitionAa5vz7o(short[] sArr, int i10, int i11) {
        int i12;
        short sT = f2.t(sArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                int iT = f2.t(sArr, i10) & e2.f312492d;
                i12 = sT & e2.f312492d;
                if (Intrinsics.compare(iT, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(f2.t(sArr, i11) & e2.f312492d, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                short sT2 = f2.t(sArr, i10);
                f2.D(sArr, i10, f2.t(sArr, i11));
                f2.D(sArr, i11, sT2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @u
    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m890partitionoBK06Vg(int[] iArr, int i10, int i11) {
        int iT = v1.t(iArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (Integer.compareUnsigned(v1.t(iArr, i10), iT) < 0) {
                i10++;
            }
            while (Integer.compareUnsigned(v1.t(iArr, i11), iT) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                int iT2 = v1.t(iArr, i10);
                v1.D(iArr, i10, v1.t(iArr, i11));
                v1.D(iArr, i11, iT2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @u
    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m891quickSortnroSd4(long[] jArr, int i10, int i11) {
        int iM887partitionnroSd4 = m887partitionnroSd4(jArr, i10, i11);
        int i12 = iM887partitionnroSd4 - 1;
        if (i10 < i12) {
            m891quickSortnroSd4(jArr, i10, i12);
        }
        if (iM887partitionnroSd4 < i11) {
            m891quickSortnroSd4(jArr, iM887partitionnroSd4, i11);
        }
    }

    @u
    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m892quickSort4UcCI2c(byte[] bArr, int i10, int i11) {
        int iM888partition4UcCI2c = m888partition4UcCI2c(bArr, i10, i11);
        int i12 = iM888partition4UcCI2c - 1;
        if (i10 < i12) {
            m892quickSort4UcCI2c(bArr, i10, i12);
        }
        if (iM888partition4UcCI2c < i11) {
            m892quickSort4UcCI2c(bArr, iM888partition4UcCI2c, i11);
        }
    }

    @u
    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m893quickSortAa5vz7o(short[] sArr, int i10, int i11) {
        int iM889partitionAa5vz7o = m889partitionAa5vz7o(sArr, i10, i11);
        int i12 = iM889partitionAa5vz7o - 1;
        if (i10 < i12) {
            m893quickSortAa5vz7o(sArr, i10, i12);
        }
        if (iM889partitionAa5vz7o < i11) {
            m893quickSortAa5vz7o(sArr, iM889partitionAa5vz7o, i11);
        }
    }

    @u
    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m894quickSortoBK06Vg(int[] iArr, int i10, int i11) {
        int iM890partitionoBK06Vg = m890partitionoBK06Vg(iArr, i10, i11);
        int i12 = iM890partitionoBK06Vg - 1;
        if (i10 < i12) {
            m894quickSortoBK06Vg(iArr, i10, i12);
        }
        if (iM890partitionoBK06Vg < i11) {
            m894quickSortoBK06Vg(iArr, iM890partitionoBK06Vg, i11);
        }
    }

    @u
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m895sortArraynroSd4(@NotNull long[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m891quickSortnroSd4(array, i10, i11 - 1);
    }

    @u
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m896sortArray4UcCI2c(@NotNull byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m892quickSort4UcCI2c(array, i10, i11 - 1);
    }

    @u
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m897sortArrayAa5vz7o(@NotNull short[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m893quickSortAa5vz7o(array, i10, i11 - 1);
    }

    @u
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m898sortArrayoBK06Vg(@NotNull int[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m894quickSortoBK06Vg(array, i10, i11 - 1);
    }
}
