package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.extractor.y0;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class t0 extends androidx.media3.common.audio.i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f63389i;

    public interface a {
        void a(ByteBuffer byteBuffer);

        void b(int i10, int i11, int i12);
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f63390j = "WaveFileAudioBufferSink";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f63391k = 4;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f63392l = 40;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f63393m = 44;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f63394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f63395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteBuffer f63396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f63397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f63398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f63399f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private RandomAccessFile f63400g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f63401h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f63402i;

        public b(String str) {
            this.f63394a = str;
            byte[] bArr = new byte[1024];
            this.f63395b = bArr;
            this.f63396c = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        }

        private String c() {
            String str = this.f63394a;
            int i10 = this.f63401h;
            this.f63401h = i10 + 1;
            return k1.S("%s-%04d.wav", str, Integer.valueOf(i10));
        }

        private void d() throws IOException {
            if (this.f63400g != null) {
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
            g(randomAccessFile);
            this.f63400g = randomAccessFile;
            this.f63402i = 44;
        }

        private void e() throws IOException {
            RandomAccessFile randomAccessFile = this.f63400g;
            if (randomAccessFile == null) {
                return;
            }
            try {
                this.f63396c.clear();
                this.f63396c.putInt(this.f63402i - 8);
                randomAccessFile.seek(4L);
                randomAccessFile.write(this.f63395b, 0, 4);
                this.f63396c.clear();
                this.f63396c.putInt(this.f63402i - 44);
                randomAccessFile.seek(40L);
                randomAccessFile.write(this.f63395b, 0, 4);
            } catch (IOException e10) {
                androidx.media3.common.util.z.o(f63390j, "Error updating file size", e10);
            }
            try {
                randomAccessFile.close();
            } finally {
                this.f63400g = null;
            }
        }

        private void f(ByteBuffer byteBuffer) throws IOException {
            RandomAccessFile randomAccessFile = (RandomAccessFile) androidx.media3.common.util.a.g(this.f63400g);
            while (byteBuffer.hasRemaining()) {
                int iMin = Math.min(byteBuffer.remaining(), this.f63395b.length);
                byteBuffer.get(this.f63395b, 0, iMin);
                randomAccessFile.write(this.f63395b, 0, iMin);
                this.f63402i += iMin;
            }
        }

        private void g(RandomAccessFile randomAccessFile) throws IOException {
            randomAccessFile.writeInt(1380533830);
            randomAccessFile.writeInt(-1);
            randomAccessFile.writeInt(1463899717);
            randomAccessFile.writeInt(1718449184);
            this.f63396c.clear();
            this.f63396c.putInt(16);
            this.f63396c.putShort((short) y0.b(this.f63399f));
            this.f63396c.putShort((short) this.f63398e);
            this.f63396c.putInt(this.f63397d);
            int iE0 = k1.E0(this.f63399f, this.f63398e);
            this.f63396c.putInt(this.f63397d * iE0);
            this.f63396c.putShort((short) iE0);
            this.f63396c.putShort((short) ((iE0 * 8) / this.f63398e));
            randomAccessFile.write(this.f63395b, 0, this.f63396c.position());
            randomAccessFile.writeInt(1684108385);
            randomAccessFile.writeInt(-1);
        }

        @Override // androidx.media3.exoplayer.audio.t0.a
        public void a(ByteBuffer byteBuffer) {
            try {
                d();
                f(byteBuffer);
            } catch (IOException e10) {
                androidx.media3.common.util.z.e(f63390j, "Error writing data", e10);
            }
        }

        @Override // androidx.media3.exoplayer.audio.t0.a
        public void b(int i10, int i11, int i12) {
            try {
                e();
            } catch (IOException e10) {
                androidx.media3.common.util.z.e(f63390j, "Error resetting", e10);
            }
            this.f63397d = i10;
            this.f63398e = i11;
            this.f63399f = i12;
        }
    }

    public t0(a aVar) {
        this.f63389i = (a) androidx.media3.common.util.a.g(aVar);
    }

    private void m() {
        if (isActive()) {
            a aVar = this.f63389i;
            androidx.media3.common.audio.g.a aVar2 = this.f60338b;
            aVar.b(aVar2.f60333a, aVar2.f60334b, aVar2.f60335c);
        }
    }

    @Override // androidx.media3.common.audio.g
    public void b(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        this.f63389i.a(k1.M(byteBuffer));
        l(iRemaining).put(byteBuffer).flip();
    }

    @Override // androidx.media3.common.audio.i
    public androidx.media3.common.audio.g.a h(androidx.media3.common.audio.g.a aVar) {
        return aVar;
    }

    @Override // androidx.media3.common.audio.i
    protected void i() {
        m();
    }

    @Override // androidx.media3.common.audio.i
    protected void j() {
        m();
    }

    @Override // androidx.media3.common.audio.i
    protected void k() {
        m();
    }
}
