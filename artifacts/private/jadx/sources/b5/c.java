package b5;

import com.davidehrmann.vcdiff.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class c extends InputStream {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f77557j = 67108864;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f77558k = 67108864;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f77559l = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f77560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteBuffer f77561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InputStream f77562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f77563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f77564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile ByteBuffer f77565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ByteArrayOutputStream f77566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f77567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f77568i;

    public c(InputStream inputStream, byte[] bArr) {
        this(inputStream, bArr, 67108864L, 67108864, false);
    }

    private void a() throws IOException {
        if (this.f77568i) {
            throw new IOException("InputStream is closed");
        }
        while (!this.f77565f.hasRemaining()) {
            int i10 = this.f77562c.read(this.f77563d);
            if (i10 < 0) {
                this.f77560a.e();
                return;
            }
            long j10 = i10;
            this.f77564e += j10;
            if (!this.f77567h) {
                this.f77560a.d(this.f77561b);
                this.f77567h = true;
            }
            try {
                this.f77560a.f(this.f77563d, 0, i10, this.f77566g);
                if (this.f77566g.size() > 0) {
                    this.f77565f = ByteBuffer.wrap(this.f77566g.toByteArray());
                    this.f77566g.reset();
                }
            } catch (IOException e10) {
                throw new IOException(String.format("Error trying to decode data chunk starting at offset %d: %s", Long.valueOf(this.f77564e - j10), e10.getMessage()), e10);
            }
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f77565f.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f77562c.close();
            this.f77568i = true;
        } catch (Throwable th2) {
            this.f77568i = true;
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        a();
        if (this.f77565f.hasRemaining()) {
            return this.f77565f.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("Mark not supported");
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        long jRemaining = 0;
        while (jRemaining < j10) {
            a();
            if (!this.f77565f.hasRemaining()) {
                break;
            }
            if (((long) this.f77565f.remaining()) + jRemaining >= j10) {
                this.f77565f.position(this.f77565f.position() + ((int) (j10 - jRemaining)));
                return j10;
            }
            jRemaining += (long) this.f77565f.remaining();
            this.f77565f.position(this.f77565f.position() + this.f77565f.remaining());
        }
        return jRemaining;
    }

    public c(InputStream inputStream, byte[] bArr, long j10, int i10, boolean z10) {
        this((InputStream) com.davidehrmann.vcdiff.util.a.b(inputStream, "in was null"), ByteBuffer.wrap((byte[]) ((byte[]) com.davidehrmann.vcdiff.util.a.b(bArr, "dictionary was null")).clone()), com.davidehrmann.vcdiff.c.g().i(j10).j(i10).h(z10).e());
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        a();
        if (!this.f77565f.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i11, this.f77565f.remaining());
        this.f77565f.get(bArr, i10, iMin);
        return iMin;
    }

    public c(InputStream inputStream, byte[] bArr, g gVar) {
        this(inputStream, ByteBuffer.wrap((byte[]) ((byte[]) com.davidehrmann.vcdiff.util.a.b(bArr, "dictionary was null")).clone()), gVar);
    }

    public c(InputStream inputStream, ByteBuffer byteBuffer, g gVar) {
        this.f77563d = new byte[4096];
        this.f77564e = 0L;
        this.f77565f = ByteBuffer.allocate(0);
        this.f77566g = new ByteArrayOutputStream();
        this.f77567h = false;
        this.f77568i = false;
        this.f77562c = (InputStream) com.davidehrmann.vcdiff.util.a.b(inputStream, "in was null");
        this.f77560a = (g) com.davidehrmann.vcdiff.util.a.b(gVar, "decoder was null");
        this.f77561b = (ByteBuffer) com.davidehrmann.vcdiff.util.a.b(byteBuffer, "dictionary was null");
    }
}
