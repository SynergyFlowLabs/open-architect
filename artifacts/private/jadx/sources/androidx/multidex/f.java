package androidx.multidex;

import com.rabbitmq.client.k0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f70604a = 22;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f70605b = 101010256;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f70606c = 16384;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f70607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f70608b;

        a() {
        }
    }

    f() {
    }

    static long a(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j10 = aVar.f70608b;
        randomAccessFile.seek(aVar.f70607a);
        byte[] bArr = new byte[16384];
        int i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
        while (i10 != -1) {
            crc32.update(bArr, 0, i10);
            j10 -= (long) i10;
            if (j10 == 0) {
                break;
            }
            i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
        }
        return crc32.getValue();
    }

    static a b(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j10 = length - 22;
        if (j10 < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j11 = length - 65558;
        long j12 = j11 >= 0 ? j11 : 0L;
        int iReverseBytes = Integer.reverseBytes(f70605b);
        do {
            randomAccessFile.seek(j10);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f70608b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & k0.f265952a;
                aVar.f70607a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & k0.f265952a;
                return aVar;
            }
            j10--;
        } while (j10 >= j12);
        throw new ZipException("End Of Central Directory signature not found");
    }

    static long c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return a(randomAccessFile, b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
