package androidx.media2.exoplayer.external.extractor.ts;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class i0 {
    private i0() {
    }

    public static int a(byte[] data, int startPosition, int limitPosition) {
        while (startPosition < limitPosition && data[startPosition] != 71) {
            startPosition++;
        }
        return startPosition;
    }

    public static long b(androidx.media2.exoplayer.external.util.x packetBuffer, int startOfPacket, int pcrPid) {
        packetBuffer.Q(startOfPacket);
        if (packetBuffer.a() < 5) {
            return -9223372036854775807L;
        }
        int iL = packetBuffer.l();
        if ((8388608 & iL) != 0 || ((2096896 & iL) >> 8) != pcrPid || (iL & 32) == 0 || packetBuffer.D() < 7 || packetBuffer.a() < 7 || (packetBuffer.D() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        packetBuffer.i(bArr, 0, 6);
        return c(bArr);
    }

    private static long c(byte[] pcrBytes) {
        return ((((long) pcrBytes[0]) & 255) << 25) | ((((long) pcrBytes[1]) & 255) << 17) | ((((long) pcrBytes[2]) & 255) << 9) | ((((long) pcrBytes[3]) & 255) << 1) | ((255 & ((long) pcrBytes[4])) >> 7);
    }
}
