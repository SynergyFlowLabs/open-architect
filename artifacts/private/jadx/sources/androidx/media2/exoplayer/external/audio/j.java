package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f53430a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a extends Exception {
        public a(int sampleRateHz, int channelCount, int encoding) {
            StringBuilder sb2 = new StringBuilder(78);
            sb2.append("Unhandled format: ");
            sb2.append(sampleRateHz);
            sb2.append(" Hz, ");
            sb2.append(channelCount);
            sb2.append(" channels in encoding ");
            sb2.append(encoding);
            super(sb2.toString());
        }
    }

    boolean a();

    void b(ByteBuffer buffer);

    void c();

    ByteBuffer d();

    int e();

    int f();

    void flush();

    int g();

    boolean h(int sampleRateHz, int channelCount, int encoding) throws a;

    boolean isActive();

    void reset();
}
