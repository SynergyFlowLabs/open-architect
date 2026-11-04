package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class a3 extends u.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ByteBuffer f125747k;

    a3(ByteBuffer buffer) {
        s1.e(buffer, "buffer");
        this.f125747k = buffer.slice().order(ByteOrder.nativeOrder());
    }

    private ByteBuffer O0(int beginIndex, int endIndex) {
        if (beginIndex < this.f125747k.position() || endIndex > this.f125747k.limit() || beginIndex > endIndex) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(beginIndex), Integer.valueOf(endIndex)));
        }
        ByteBuffer byteBufferSlice = this.f125747k.slice();
        v1.e(byteBufferSlice, beginIndex - this.f125747k.position());
        v1.c(byteBufferSlice, endIndex - this.f125747k.position());
        return byteBufferSlice;
    }

    private void readObject(ObjectInputStream in) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return u.v(this.f125747k.slice());
    }

    @Override // com.google.protobuf.u
    public void D(ByteBuffer target) {
        target.put(this.f125747k.slice());
    }

    @Override // com.google.protobuf.u
    void G0(t output) throws IOException {
        output.W(this.f125747k.slice());
    }

    @Override // com.google.protobuf.u
    public void H0(OutputStream out) throws IOException {
        out.write(q0());
    }

    @Override // com.google.protobuf.u
    protected void J(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        ByteBuffer byteBufferSlice = this.f125747k.slice();
        v1.e(byteBufferSlice, sourceOffset);
        byteBufferSlice.get(target, targetOffset, numberToCopy);
    }

    @Override // com.google.protobuf.u
    void J0(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        if (!this.f125747k.hasArray()) {
            s.h(O0(sourceOffset, numberToWrite + sourceOffset), out);
        } else {
            out.write(this.f125747k.array(), this.f125747k.arrayOffset() + this.f125747k.position() + sourceOffset, numberToWrite);
        }
    }

    @Override // com.google.protobuf.u.i
    boolean L0(u other, int offset, int length) {
        return p0(0, length).equals(other.p0(offset, length + offset));
    }

    @Override // com.google.protobuf.u
    public byte Q(int index) {
        return m(index);
    }

    @Override // com.google.protobuf.u
    public boolean S() {
        return u4.s(this.f125747k);
    }

    @Override // com.google.protobuf.u
    public z V() {
        return z.p(this.f125747k, true);
    }

    @Override // com.google.protobuf.u
    public InputStream W() {
        return new a();
    }

    @Override // com.google.protobuf.u
    protected int a0(int h10, int offset, int length) {
        for (int i10 = offset; i10 < offset + length; i10++) {
            h10 = (h10 * 31) + this.f125747k.get(i10);
        }
        return h10;
    }

    @Override // com.google.protobuf.u
    protected int b0(int state, int offset, int length) {
        return u4.v(state, this.f125747k, offset, length + offset);
    }

    @Override // com.google.protobuf.u
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        if (size() != uVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (other instanceof a3) {
            return this.f125747k.equals(((a3) other).f125747k);
        }
        return other instanceof n3 ? other.equals(this) : this.f125747k.equals(uVar.i());
    }

    @Override // com.google.protobuf.u
    public ByteBuffer i() {
        return this.f125747k.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.u
    public List<ByteBuffer> k() {
        return Collections.singletonList(i());
    }

    @Override // com.google.protobuf.u
    public byte m(int index) {
        try {
            return this.f125747k.get(index);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.u
    public u p0(int beginIndex, int endIndex) {
        try {
            return new a3(O0(beginIndex, endIndex));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.u
    public int size() {
        return this.f125747k.remaining();
    }

    @Override // com.google.protobuf.u
    protected String v0(Charset charset) {
        byte[] bArrQ0;
        int length;
        int iArrayOffset;
        if (this.f125747k.hasArray()) {
            bArrQ0 = this.f125747k.array();
            iArrayOffset = this.f125747k.arrayOffset() + this.f125747k.position();
            length = this.f125747k.remaining();
        } else {
            bArrQ0 = q0();
            length = bArrQ0.length;
            iArrayOffset = 0;
        }
        return new String(bArrQ0, iArrayOffset, length, charset);
    }

    class a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f125748a;

        a() {
            this.f125748a = a3.this.f125747k.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f125748a.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int readlimit) {
            v1.d(this.f125748a);
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f125748a.hasRemaining()) {
                return this.f125748a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                v1.f(this.f125748a);
            } catch (InvalidMarkException e10) {
                throw new IOException(e10);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bytes, int off, int len) throws IOException {
            if (!this.f125748a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(len, this.f125748a.remaining());
            this.f125748a.get(bytes, off, iMin);
            return iMin;
        }
    }
}
