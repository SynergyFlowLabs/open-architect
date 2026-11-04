package rm;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f366679a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f366680b = 2;

    public static double a(byte[] bArr, int i10) {
        return Double.longBitsToDouble(c(bArr, i10));
    }

    public static int b(byte[] bArr, int i10) {
        int i11;
        byte b10;
        if (i10 == 1) {
            i11 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
            b10 = bArr[3];
        } else {
            i11 = ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
            b10 = bArr[0];
        }
        return (b10 & 255) | i11;
    }

    public static long c(byte[] bArr, int i10) {
        long j10;
        byte b10;
        if (i10 == 1) {
            j10 = (((long) (bArr[0] & 255)) << 56) | (((long) (bArr[1] & 255)) << 48) | (((long) (bArr[2] & 255)) << 40) | (((long) (bArr[3] & 255)) << 32) | (((long) (bArr[4] & 255)) << 24) | (((long) (bArr[5] & 255)) << 16) | (((long) (bArr[6] & 255)) << 8);
            b10 = bArr[7];
        } else {
            j10 = (((long) (bArr[7] & 255)) << 56) | (((long) (bArr[6] & 255)) << 48) | (((long) (bArr[5] & 255)) << 40) | (((long) (bArr[4] & 255)) << 32) | (((long) (bArr[3] & 255)) << 24) | (((long) (bArr[2] & 255)) << 16) | (((long) (bArr[1] & 255)) << 8);
            b10 = bArr[0];
        }
        return j10 | ((long) (b10 & 255));
    }

    public static void d(double d10, byte[] bArr, int i10) {
        f(Double.doubleToLongBits(d10), bArr, i10);
    }

    public static void e(int i10, byte[] bArr, int i11) {
        if (i11 == 1) {
            bArr[0] = (byte) (i10 >> 24);
            bArr[1] = (byte) (i10 >> 16);
            bArr[2] = (byte) (i10 >> 8);
            bArr[3] = (byte) i10;
            return;
        }
        bArr[0] = (byte) i10;
        bArr[1] = (byte) (i10 >> 8);
        bArr[2] = (byte) (i10 >> 16);
        bArr[3] = (byte) (i10 >> 24);
    }

    public static void f(long j10, byte[] bArr, int i10) {
        if (i10 == 1) {
            bArr[0] = (byte) (j10 >> 56);
            bArr[1] = (byte) (j10 >> 48);
            bArr[2] = (byte) (j10 >> 40);
            bArr[3] = (byte) (j10 >> 32);
            bArr[4] = (byte) (j10 >> 24);
            bArr[5] = (byte) (j10 >> 16);
            bArr[6] = (byte) (j10 >> 8);
            bArr[7] = (byte) j10;
            return;
        }
        bArr[0] = (byte) j10;
        bArr[1] = (byte) (j10 >> 8);
        bArr[2] = (byte) (j10 >> 16);
        bArr[3] = (byte) (j10 >> 24);
        bArr[4] = (byte) (j10 >> 32);
        bArr[5] = (byte) (j10 >> 40);
        bArr[6] = (byte) (j10 >> 48);
        bArr[7] = (byte) (j10 >> 56);
    }
}
