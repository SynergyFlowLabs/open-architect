package com.davidehrmann.vcdiff.engine;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class o implements com.davidehrmann.vcdiff.g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final org.slf4j.c f97936q = org.slf4j.e.k(o.class);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f97937r = 67108864;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f97938s = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f97939t = -3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f97940a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f97943d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f97945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f97946g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o f97948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f97949j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f97952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f97953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f97954o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f97941b = ByteBuffer.allocate(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f97942c = new a(512);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ByteArrayOutputStream f97947h = new ByteArrayOutputStream(1024);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f97950k = 67108864;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f97951l = 67108864;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f97955p = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f97944e = new k(this);

    protected static class a extends ByteArrayOutputStream {
        public a() {
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public synchronized ByteBuffer b() {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            return ByteBuffer.wrap(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count).asReadOnlyBuffer();
        }

        public a(int i10) {
            super(i10);
        }
    }

    public o() {
        A();
    }

    private boolean j() {
        if (this.f97945f == null) {
            return false;
        }
        int i10 = 5 ^ 1;
        return true;
    }

    private int k(byte[] bArr, int i10, int i11) throws IOException {
        m mVar = new m(ByteBuffer.wrap(bArr, i10, i11).slice());
        Integer numG = mVar.g("size of near cache");
        if (numG == null) {
            f97936q.m0("Failed to parse size of near cache");
            return mVar.c();
        }
        Integer numG2 = mVar.g("size of same cache");
        if (numG2 == null) {
            f97936q.m0("Failed to parse size of same cache");
            return mVar.c();
        }
        this.f97946g = new h();
        this.f97947h.reset();
        this.f97945f = new g(numG.shortValue(), numG2.shortValue());
        this.f97948i = new o();
        byte[] bArrF = h.Y.f();
        this.f97948i.b(bArrF);
        this.f97948i.B(bArrF.length);
        return mVar.m().position();
    }

    private void q(OutputStream outputStream) throws IOException {
        ByteBuffer byteBufferB = this.f97942c.b();
        byteBufferB.position(this.f97953n);
        while (byteBufferB.hasRemaining()) {
            outputStream.write(byteBufferB.get());
        }
        this.f97953n = byteBufferB.limit();
    }

    private void t(OutputStream outputStream) throws IOException {
        outputStream.write(this.f97942c.a(), this.f97953n, this.f97942c.size() - this.f97953n);
        this.f97942c.reset();
        this.f97944e.m(0);
        this.f97953n = 0;
    }

    private int u() {
        return this.f97941b.remaining();
    }

    private boolean w() {
        boolean zHasRemaining;
        if (!j()) {
            zHasRemaining = this.f97941b.hasRemaining();
        } else {
            if (this.f97948i != null || this.f97944e.b()) {
                return false;
            }
            if (x()) {
                return true;
            }
            zHasRemaining = this.f97941b.hasRemaining();
        }
        return !zHasRemaining;
    }

    private int y(ByteBuffer byteBuffer) throws IOException {
        o oVar = this.f97948i;
        if (oVar == null) {
            return 0;
        }
        if (this.f97946g == null) {
            throw new IllegalStateException("Internal error: custom_code_table_decoder_ is set, but custom_code_table_ is null");
        }
        try {
            oVar.f(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), this.f97947h);
            int size = this.f97947h.size();
            int i10 = h.Z;
            if (size < i10) {
                byteBuffer.position(byteBuffer.limit());
                return -2;
            }
            this.f97948i.e();
            if (this.f97947h.size() != i10) {
                throw new IOException(String.format("Decoded custom code table size (%d) does not match size of a code table (%d)", Integer.valueOf(this.f97947h.size()), Integer.valueOf(i10)));
            }
            this.f97946g = new h(this.f97947h.toByteArray());
            this.f97947h.reset();
            byteBuffer.position(byteBuffer.limit() - this.f97948i.u());
            this.f97948i = null;
            this.f97944e.t(this.f97946g, this.f97945f.n());
            return 0;
        } catch (IOException e10) {
            IOException iOException = new IOException("Failed to write to custom_code_table_string_");
            iOException.initCause(e10);
            throw iOException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    private int z(ByteBuffer byteBuffer) throws IOException {
        boolean z10;
        boolean z11;
        if (j()) {
            return 0;
        }
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.put((ByteBuffer) byteBuffer.slice().limit(Math.min(5, byteBuffer.remaining())));
        byteBufferAllocate.rewind();
        b bVar = new b(byteBufferAllocate);
        if (iRemaining != 0) {
            z10 = true;
            if (iRemaining != 1) {
                if (iRemaining == 2) {
                    z11 = false;
                } else {
                    if (iRemaining != 3) {
                        byte b10 = bVar.f97824d;
                        this.f97943d = b10;
                        if (b10 != 0 && b10 != 83) {
                            throw new IOException("Unrecognized VCDIFF format version");
                        }
                    }
                    if (bVar.f97823c != -60) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (bVar.f97822b != -61) {
                    z11 = true;
                }
            } else {
                z11 = false;
            }
            if (bVar.f97821a == -42) {
                z10 = z11;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            throw new IOException("Did not find VCDIFF header bytes; input is not a VCDIFF delta file");
        }
        if (iRemaining < 5) {
            return -2;
        }
        byte b11 = bVar.f97825e;
        int i10 = b11 & 252;
        if (i10 != 0) {
            throw new IOException(String.format("Unrecognized hdr_indicator flags: %02x", Integer.valueOf(i10)));
        }
        if ((b11 & 1) != 0) {
            throw new IOException("Secondary compression is not supported");
        }
        if ((b11 & 2) != 0) {
            int iK = k(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position() + 5, byteBuffer.remaining() - 5);
            if (iK == -2) {
                return -2;
            }
            byteBuffer.position(byteBuffer.position() + 5 + iK);
        } else {
            this.f97945f = new g();
            byteBuffer.position(byteBuffer.position() + 5);
        }
        return 0;
    }

    public void A() {
        this.f97954o = false;
        this.f97940a = null;
        this.f97943d = (byte) 0;
        this.f97949j = -3;
        this.f97952m = 0L;
        this.f97945f = null;
        this.f97946g = null;
        this.f97948i = null;
        this.f97944e.c();
        this.f97953n = 0;
    }

    public void B(int i10) {
        this.f97949j = i10;
    }

    public void C(int i10) throws IOException {
        if (i10 > this.f97951l) {
            throw new IOException(String.format("Length of target window (%d) exceeds limit of %d bytes", Integer.valueOf(i10), Integer.valueOf(this.f97951l)));
        }
        if (v() && i10 > ((long) this.f97949j) - this.f97952m) {
            throw new IOException(String.format("Length of target window (%d bytes) plus previous windows (%d bytes) would exceed planned size of %d bytes", Integer.valueOf(i10), Long.valueOf(this.f97952m), Integer.valueOf(this.f97949j)));
        }
        if (i10 > this.f97950k - this.f97952m) {
            throw new IOException(String.format("Length of target window (%d bytes) plus previous windows (%d bytes) would exceed maximum target file size of %d bytes", Integer.valueOf(i10), Long.valueOf(this.f97952m), Long.valueOf(this.f97950k)));
        }
    }

    @Override // com.davidehrmann.vcdiff.g
    public void a(byte[] bArr, OutputStream outputStream) throws IOException {
        c(ByteBuffer.wrap(bArr), outputStream);
    }

    @Override // com.davidehrmann.vcdiff.g
    public void b(byte[] bArr) {
        d(ByteBuffer.wrap(bArr));
    }

    @Override // com.davidehrmann.vcdiff.g
    public void c(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        if (!this.f97954o) {
            A();
            throw new IOException("decodeChunk() called without startDecoding()");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f97941b.remaining() + byteBuffer.remaining());
        byteBufferAllocate.put(this.f97941b);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        this.f97941b = byteBufferAllocate.duplicate();
        try {
            int iZ = z(byteBufferAllocate);
            if (iZ == 0) {
                iZ = y(byteBufferAllocate);
            }
            if (iZ == 0) {
                while (byteBufferAllocate.hasRemaining() && this.f97944e.a(byteBufferAllocate) == 0 && !x()) {
                    if (!p()) {
                        t(outputStream);
                    }
                }
            }
            this.f97941b = byteBufferAllocate;
            q(outputStream);
        } catch (IOException e10) {
            A();
            throw e10;
        }
    }

    @Override // com.davidehrmann.vcdiff.g
    public void d(ByteBuffer byteBuffer) {
        if (this.f97954o) {
            throw new IllegalStateException("startDecoding() called twice without finishDecoding()");
        }
        this.f97941b = ByteBuffer.allocate(0);
        this.f97942c.reset();
        A();
        this.f97940a = byteBuffer;
        this.f97954o = true;
    }

    @Override // com.davidehrmann.vcdiff.g
    public void e() throws IOException {
        try {
            if (!this.f97954o) {
                throw new IOException("finishDecoding() called before startDecoding(), or called after decodeChunk() returned false");
            }
            if (!w()) {
                throw new IOException("finishDecoding() called before parsing entire delta file window");
            }
            A();
        } catch (Throwable th2) {
            A();
            throw th2;
        }
    }

    @Override // com.davidehrmann.vcdiff.g
    public void f(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        c(ByteBuffer.wrap(bArr, i10, i11), outputStream);
    }

    @Override // com.davidehrmann.vcdiff.g
    public void g(boolean z10) {
        if (this.f97954o) {
            throw new IllegalStateException("setAllowVcdTarget() called after startDecoding()");
        }
        this.f97955p = z10;
    }

    @Override // com.davidehrmann.vcdiff.g
    public boolean h(long j10) {
        this.f97950k = j10;
        return true;
    }

    @Override // com.davidehrmann.vcdiff.g
    public boolean i(int i10) {
        this.f97951l = i10;
        return true;
    }

    public void l(int i10) {
        this.f97952m += (long) i10;
    }

    f m() {
        return this.f97945f;
    }

    public boolean n() {
        return this.f97943d == 83;
    }

    public boolean o() {
        return this.f97943d == 83;
    }

    public boolean p() {
        return this.f97955p;
    }

    a r() {
        return this.f97942c;
    }

    public ByteBuffer s() {
        return this.f97940a;
    }

    public boolean v() {
        return this.f97949j != -3;
    }

    public boolean x() {
        if (!v()) {
            return false;
        }
        long j10 = this.f97952m;
        int i10 = this.f97949j;
        if (j10 <= i10) {
            return j10 == ((long) i10);
        }
        throw new IllegalStateException(String.format("Internal error: Decoded data size %d exceeds planned target file size %d", Long.valueOf(this.f97952m), Integer.valueOf(this.f97949j)));
    }
}
