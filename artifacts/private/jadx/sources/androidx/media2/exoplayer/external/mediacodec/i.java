package androidx.media2.exoplayer.external.mediacodec;

import android.media.MediaFormat;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class i {
    private i() {
    }

    public static void a(MediaFormat format, String key, @p0 byte[] value) {
        if (value != null) {
            format.setByteBuffer(key, ByteBuffer.wrap(value));
        }
    }

    public static void b(MediaFormat format, @p0 ColorInfo colorInfo) {
        if (colorInfo != null) {
            d(format, "color-transfer", colorInfo.f57732c);
            d(format, "color-standard", colorInfo.f57730a);
            d(format, "color-range", colorInfo.f57731b);
            a(format, "hdr-static-info", colorInfo.f57733d);
        }
    }

    public static void c(MediaFormat format, String key, float value) {
        if (value != -1.0f) {
            format.setFloat(key, value);
        }
    }

    public static void d(MediaFormat format, String key, int value) {
        if (value != -1) {
            format.setInteger(key, value);
        }
    }

    public static void e(MediaFormat format, List<byte[]> csdBuffers) {
        for (int i10 = 0; i10 < csdBuffers.size(); i10++) {
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i10);
            format.setByteBuffer(sb2.toString(), ByteBuffer.wrap(csdBuffers.get(i10)));
        }
    }

    public static void f(MediaFormat format, String key, String value) {
        format.setString(key, value);
    }
}
