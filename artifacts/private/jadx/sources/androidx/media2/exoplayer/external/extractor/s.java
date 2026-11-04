package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface s {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f54704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f54706d;

        public a(int cryptoMode, byte[] encryptionKey, int encryptedBlocks, int clearBlocks) {
            this.f54703a = cryptoMode;
            this.f54704b = encryptionKey;
            this.f54705c = encryptedBlocks;
            this.f54706d = clearBlocks;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f54703a == aVar.f54703a && this.f54705c == aVar.f54705c && this.f54706d == aVar.f54706d && Arrays.equals(this.f54704b, aVar.f54704b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f54703a * 31) + Arrays.hashCode(this.f54704b)) * 31) + this.f54705c) * 31) + this.f54706d;
        }
    }

    int a(j input, int length, boolean allowEndOfInput) throws InterruptedException, IOException;

    void b(long timeUs, int flags, int size, int offset, @p0 a encryptionData);

    void c(Format format);

    void d(x data, int length);
}
