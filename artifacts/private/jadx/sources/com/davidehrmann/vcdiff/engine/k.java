package com.davidehrmann.vcdiff.engine;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes3.dex */
class k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final org.slf4j.c f97889o = org.slf4j.e.k(k.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f97890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f97891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer f97892c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f97894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f97895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f97896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f97897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f97898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f97899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f97900k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f97893d = new AtomicInteger(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicInteger f97901l = new AtomicInteger(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Adler32 f97902m = new com.davidehrmann.vcdiff.util.c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i f97903n = new i();

    public k(o oVar) {
        this.f97890a = (o) com.davidehrmann.vcdiff.util.a.b(oVar, "parent was null");
        c();
    }

    private void d(ByteBuffer byteBuffer, int i10) throws IOException {
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return;
            }
            this.f97890a.r().write(byteBuffer.get());
            i10 = i11;
        }
    }

    private int e(int i10) throws IOException {
        if (i10 > this.f97895f.remaining()) {
            return -2;
        }
        d(this.f97895f, i10);
        return 0;
    }

    private int f(ByteBuffer byteBuffer) throws IOException {
        int iE;
        i();
        while (o() < this.f97898i.intValue()) {
            AtomicInteger atomicInteger = new AtomicInteger(0);
            AtomicInteger atomicInteger2 = new AtomicInteger(0);
            byte bA = this.f97903n.a(atomicInteger, atomicInteger2);
            if (bA == 5) {
                r(byteBuffer);
                return -2;
            }
            int i10 = atomicInteger.get();
            if (i10 > this.f97898i.intValue() || o() + i10 > this.f97898i.intValue()) {
                throw new IOException(String.format("%s with size %d plus existing %d bytes of target data exceeds length of target window (%d bytes)", h.a(bA), Integer.valueOf(i10), Integer.valueOf(o()), this.f97898i));
            }
            if (bA == 1) {
                iE = e(i10);
            } else if (bA != 2) {
                int i11 = 7 >> 3;
                if (bA != 3) {
                    throw new IOException("Unexpected instruction type " + ((int) bA) + " in opcode stream");
                }
                iE = g(i10, (short) atomicInteger2.get());
            } else {
                iE = h(i10);
            }
            if (iE == -2) {
                this.f97903n.c();
                r(byteBuffer);
                return -2;
            }
        }
        if (o() != this.f97898i.intValue()) {
            throw new IOException(String.format("Decoded target window size (%d bytes) does not match expected size (%d bytes)", Integer.valueOf(o()), this.f97898i));
        }
        if (this.f97900k) {
            this.f97902m.update(this.f97890a.r().a(), this.f97899j, this.f97898i.intValue());
            int value = (int) this.f97902m.getValue();
            this.f97902m.reset();
            if (value != this.f97901l.get()) {
                throw new IOException("Target data does not match checksum; this could mean that the wrong dictionary was used");
            }
        }
        if (this.f97894e.hasRemaining()) {
            throw new IOException("Excess instructions and sizes left over after decoding target window");
        }
        if (i()) {
            r(byteBuffer);
        } else {
            if (this.f97895f.hasRemaining()) {
                throw new IOException("Excess ADD/RUN data left over after decoding target window");
            }
            if (this.f97896g.hasRemaining()) {
                throw new IOException("Excess COPY addresses left over after decoding target window");
            }
            byteBuffer.position(byteBuffer.position() + this.f97894e.limit() + this.f97895f.limit() + this.f97896g.limit());
        }
        return 0;
    }

    private int g(int i10, short s10) throws IOException {
        int iO = o();
        int i11 = this.f97893d.get() + iO;
        try {
            int iA = this.f97890a.m().a(i11, s10, this.f97896g);
            if (iA == -2) {
                return -2;
            }
            if (iA < 0 || iA > i11) {
                throw new IllegalStateException(String.format("Internal error: unexpected address %d returned from DecodeAddress, with here_address = %d", Integer.valueOf(iA), Integer.valueOf(i11)));
            }
            if (iA + i10 <= this.f97893d.get()) {
                d((ByteBuffer) this.f97892c.slice().position(iA), i10);
                return 0;
            }
            if (iA < this.f97893d.get()) {
                int i12 = this.f97893d.get() - iA;
                d((ByteBuffer) this.f97892c.slice().position(iA), i12);
                iO += i12;
                iA += i12;
                i10 -= i12;
            }
            int i13 = iA - this.f97893d.get();
            ByteBuffer byteBufferB = this.f97890a.r().b();
            byteBufferB.position(this.f97899j);
            while (true) {
                int i14 = iO - i13;
                if (i10 <= i14) {
                    d((ByteBuffer) byteBufferB.slice().position(i13), i10);
                    return 0;
                }
                d((ByteBuffer) byteBufferB.slice().position(i13), i14);
                iO += i14;
                i13 += i14;
                i10 -= i14;
                byteBufferB = this.f97890a.r().b();
                byteBufferB.position(this.f97899j);
            }
        } catch (IOException e10) {
            new IOException("Unable to decode address for COPY").initCause(e10);
            throw e10;
        }
    }

    private int h(int i10) throws IOException {
        if (!this.f97895f.hasRemaining()) {
            return -2;
        }
        l(this.f97895f.get(), i10);
        return 0;
    }

    private boolean i() {
        ByteBuffer byteBuffer = this.f97896g;
        ByteBuffer byteBuffer2 = this.f97894e;
        return byteBuffer == byteBuffer2 && this.f97895f == byteBuffer2;
    }

    private int k(ByteBuffer byteBuffer) throws IOException {
        o.a aVarR = this.f97890a.r();
        m mVar = new m(byteBuffer.slice());
        m.a aVarL = mVar.l(this.f97890a.s().limit(), aVarR.size(), this.f97890a.p());
        if (aVarL == null) {
            return mVar.c();
        }
        this.f97893d.set(aVarL.f97921b);
        this.f97900k = this.f97890a.n() && (aVarL.f97920a & 4) != 0;
        Integer numA = mVar.a();
        this.f97898i = numA;
        if (numA == null) {
            return mVar.c();
        }
        this.f97890a.C(numA.intValue());
        mVar.f();
        int iN = n(mVar);
        if (iN != 0) {
            return iN;
        }
        byte b10 = aVarL.f97920a;
        if ((b10 & 1) != 0) {
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f97890a.s().duplicate().rewind();
            this.f97892c = byteBuffer2;
            byteBuffer2.position(aVarL.f97922c);
        } else if ((b10 & 2) != 0) {
            ByteBuffer byteBufferB = aVarR.b();
            this.f97892c = byteBufferB;
            byteBufferB.position(aVarL.f97922c);
        }
        this.f97891b = true;
        byteBuffer.position(byteBuffer.position() + mVar.m().position());
        this.f97890a.l(this.f97898i.intValue());
        return 0;
    }

    private void l(byte b10, int i10) throws IOException {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f97890a.r().write(b10);
        }
    }

    private int n(m mVar) throws IOException {
        m.b bVarH = mVar.h(this.f97900k);
        if (bVarH == null) {
            return mVar.c();
        }
        int iA = com.davidehrmann.vcdiff.util.b.a(this.f97898i.intValue()) + 1 + com.davidehrmann.vcdiff.util.b.a(bVarH.f97923a) + com.davidehrmann.vcdiff.util.b.a(bVarH.f97925c) + com.davidehrmann.vcdiff.util.b.a(bVarH.f97924b) + bVarH.f97923a + bVarH.f97925c + bVarH.f97924b;
        if (this.f97900k) {
            this.f97901l.set(bVarH.f97926d);
            iA += com.davidehrmann.vcdiff.util.b.a(bVarH.f97926d);
        }
        if (this.f97890a.o() && bVarH.f97923a == 0 && bVarH.f97925c == 0) {
            this.f97897h = bVarH.f97924b;
            s(mVar.m());
        } else {
            if (mVar.m().remaining() < bVarH.f97923a + bVarH.f97924b + bVarH.f97925c) {
                return -2;
            }
            ByteBuffer byteBufferSlice = mVar.m().slice();
            this.f97895f = byteBufferSlice;
            byteBufferSlice.position(bVarH.f97923a);
            ByteBuffer byteBufferSlice2 = this.f97895f.slice();
            this.f97894e = byteBufferSlice2;
            byteBufferSlice2.position(bVarH.f97924b);
            ByteBuffer byteBufferSlice3 = this.f97894e.slice();
            this.f97896g = byteBufferSlice3;
            byteBufferSlice3.position(bVarH.f97925c);
            this.f97895f.flip();
            this.f97894e.flip();
            this.f97896g.flip();
            if (mVar.f97917c.intValue() != iA) {
                throw new IOException("The end of the instructions section does not match the end of the delta window");
            }
        }
        this.f97903n.b(this.f97894e);
        return 0;
    }

    private int o() {
        return this.f97890a.r().size() - this.f97899j;
    }

    private void r(ByteBuffer byteBuffer) {
        if (i()) {
            int iPosition = this.f97894e.position();
            this.f97897h -= iPosition;
            byteBuffer.position(byteBuffer.position() + iPosition);
        }
    }

    private void s(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f97894e = byteBufferSlice;
        int iRemaining = byteBufferSlice.remaining();
        int i10 = this.f97897h;
        if (iRemaining > i10) {
            this.f97894e.limit(i10);
        }
        ByteBuffer byteBuffer2 = this.f97894e;
        this.f97895f = byteBuffer2;
        this.f97896g = byteBuffer2;
    }

    public int a(ByteBuffer byteBuffer) throws IOException {
        if (this.f97891b) {
            if (!i()) {
                throw new IOException("Internal error: Resumed decoding of a delta file window when interleaved format is not being used");
            }
            s(byteBuffer);
            this.f97903n.d(this.f97894e);
        } else {
            if (k(byteBuffer) == -2) {
                return -2;
            }
            this.f97890a.m().i();
        }
        if (f(byteBuffer) != -2) {
            c();
            return 0;
        }
        if (j()) {
            return -2;
        }
        throw new IOException("End of data reached while decoding VCDIFF delta file");
    }

    public boolean b() {
        return this.f97891b;
    }

    public void c() {
        this.f97891b = false;
        o oVar = this.f97890a;
        this.f97899j = oVar != null ? oVar.r().size() : 0;
        this.f97898i = 0;
        this.f97892c = null;
        this.f97893d.set(0);
        this.f97894e = null;
        this.f97895f = null;
        this.f97896g = null;
        this.f97897h = 0;
        this.f97900k = false;
        this.f97901l.set(0);
    }

    public boolean j() {
        return i() && this.f97897h > 0;
    }

    public void m(int i10) {
        this.f97899j = i10;
    }

    public int p() {
        if (this.f97898i.intValue() == 0) {
            return 0;
        }
        return this.f97898i.intValue() - o();
    }

    public int q() {
        return this.f97899j;
    }

    public void t(h hVar, short s10) {
        this.f97903n = new i(hVar, s10);
    }
}
