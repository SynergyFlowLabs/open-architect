package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class h0 extends w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f53406h;

    public interface a {
        void a(ByteBuffer buffer);

        void b(int sampleRateHz, int channelCount, int encoding);
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f53407j = "WaveFileAudioBufferSink";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f53408k = 4;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f53409l = 40;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f53410m = 44;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f53411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f53412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteBuffer f53413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f53414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f53415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f53416f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private RandomAccessFile f53417g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f53418h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f53419i;

        public b(String outputFileNamePrefix) {
            this.f53411a = outputFileNamePrefix;
            byte[] bArr = new byte[1024];
            this.f53412b = bArr;
            this.f53413c = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        }

        private String c() {
            String str = this.f53411a;
            int i10 = this.f53418h;
            this.f53418h = i10 + 1;
            return q0.B("%s-%04d.wav", str, Integer.valueOf(i10));
        }

        private void d() throws IOException {
            if (this.f53417g != null) {
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
            g(randomAccessFile);
            this.f53417g = randomAccessFile;
            this.f53419i = 44;
        }

        private void e() throws IOException {
            RandomAccessFile randomAccessFile = this.f53417g;
            if (randomAccessFile == null) {
                return;
            }
            try {
                this.f53413c.clear();
                this.f53413c.putInt(this.f53419i - 8);
                randomAccessFile.seek(4L);
                randomAccessFile.write(this.f53412b, 0, 4);
                this.f53413c.clear();
                this.f53413c.putInt(this.f53419i - 44);
                randomAccessFile.seek(40L);
                randomAccessFile.write(this.f53412b, 0, 4);
            } catch (IOException e10) {
                androidx.media2.exoplayer.external.util.p.m(f53407j, "Error updating file size", e10);
            }
            try {
                randomAccessFile.close();
                this.f53417g = null;
            } catch (Throwable th2) {
                this.f53417g = null;
                throw th2;
            }
        }

        private void f(ByteBuffer buffer) throws IOException {
            RandomAccessFile randomAccessFile = (RandomAccessFile) androidx.media2.exoplayer.external.util.a.g(this.f53417g);
            while (buffer.hasRemaining()) {
                int iMin = Math.min(buffer.remaining(), this.f53412b.length);
                buffer.get(this.f53412b, 0, iMin);
                randomAccessFile.write(this.f53412b, 0, iMin);
                this.f53419i += iMin;
            }
        }

        private void g(RandomAccessFile randomAccessFile) throws IOException {
            randomAccessFile.writeInt(1380533830);
            randomAccessFile.writeInt(-1);
            randomAccessFile.writeInt(1463899717);
            randomAccessFile.writeInt(1718449184);
            this.f53413c.clear();
            this.f53413c.putInt(16);
            this.f53413c.putShort((short) j0.b(this.f53416f));
            this.f53413c.putShort((short) this.f53415e);
            this.f53413c.putInt(this.f53414d);
            int iV = q0.V(this.f53416f, this.f53415e);
            this.f53413c.putInt(this.f53414d * iV);
            this.f53413c.putShort((short) iV);
            this.f53413c.putShort((short) ((iV * 8) / this.f53415e));
            randomAccessFile.write(this.f53412b, 0, this.f53413c.position());
            randomAccessFile.writeInt(1684108385);
            randomAccessFile.writeInt(-1);
        }

        @Override // androidx.media2.exoplayer.external.audio.h0.a
        public void a(ByteBuffer buffer) {
            try {
                d();
                f(buffer);
            } catch (IOException e10) {
                androidx.media2.exoplayer.external.util.p.e(f53407j, "Error writing data", e10);
            }
        }

        @Override // androidx.media2.exoplayer.external.audio.h0.a
        public void b(int sampleRateHz, int channelCount, int encoding) {
            try {
                e();
            } catch (IOException e10) {
                androidx.media2.exoplayer.external.util.p.e(f53407j, "Error resetting", e10);
            }
            this.f53414d = sampleRateHz;
            this.f53415e = channelCount;
            this.f53416f = encoding;
        }
    }

    public h0(a audioBufferSink) {
        this.f53406h = (a) androidx.media2.exoplayer.external.util.a.g(audioBufferSink);
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public void b(ByteBuffer inputBuffer) {
        int iRemaining = inputBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        this.f53406h.a(inputBuffer.asReadOnlyBuffer());
        m(iRemaining).put(inputBuffer).flip();
    }

    @Override // androidx.media2.exoplayer.external.audio.j
    public boolean h(int sampleRateHz, int channelCount, int encoding) {
        return n(sampleRateHz, channelCount, encoding);
    }

    @Override // androidx.media2.exoplayer.external.audio.w
    protected void j() {
        if (isActive()) {
            this.f53406h.b(this.f53510b, this.f53511c, this.f53512d);
        }
    }
}
