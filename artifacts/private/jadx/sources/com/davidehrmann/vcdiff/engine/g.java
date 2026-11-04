package com.davidehrmann.vcdiff.engine;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
class g extends f {
    public g() {
    }

    private static void q(int i10, int i11) throws IOException {
        if (i10 >= 0) {
            if (i10 >= i11) {
                throw new IOException(String.format("Decoded address (%d) is beyond location in target file (%d)", Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        } else {
            throw new IOException("Decoded address " + i10 + " is invalid");
        }
    }

    @Override // com.davidehrmann.vcdiff.engine.f
    public int a(int i10, short s10, ByteBuffer byteBuffer) throws IOException {
        int iC;
        if (i10 < 0) {
            throw new IllegalStateException("DecodeAddress was passed a negative value for here_address: " + i10);
        }
        if (byteBuffer.remaining() == 0) {
            return -2;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        if (l(s10)) {
            iC = d(s10, (short) (byteBufferDuplicate.get() & 255));
        } else {
            try {
                int iC2 = com.davidehrmann.vcdiff.util.b.c(byteBufferDuplicate);
                if (f.m(s10)) {
                    iC = f.e(iC2);
                } else if (f.j(s10)) {
                    iC = f.b(iC2, i10);
                } else {
                    if (!k(s10)) {
                        throw new IllegalArgumentException("Invalid mode value (" + ((int) s10) + ") passed to DecodeAddress; maximum mode value = " + ((int) n()));
                    }
                    iC = c(s10, iC2);
                }
            } catch (com.davidehrmann.vcdiff.util.b.a unused) {
                return -2;
            } catch (com.davidehrmann.vcdiff.util.b.C0884b unused2) {
                throw new IOException("Found invalid variable-length integer as encoded address value");
            }
        }
        q(iC, i10);
        o(iC);
        byteBuffer.position(byteBufferDuplicate.position());
        return iC;
    }

    @Override // com.davidehrmann.vcdiff.engine.f
    public short g(int i10, int i11, AtomicInteger atomicInteger) {
        short s10;
        int i12 = 0;
        if (i10 < 0) {
            atomicInteger.set(0);
            throw new IllegalArgumentException("EncodeAddress was passed a negative address: " + i10);
        }
        if (i10 >= i11) {
            atomicInteger.set(0);
            throw new IllegalArgumentException(String.format("EncodeAddress was called with address (%d) < here_address (%d)", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int[] iArr = this.f97843c;
        if (iArr.length > 0) {
            int length = i10 % iArr.length;
            if (iArr[length] == i10) {
                o(i10);
                atomicInteger.set(length % 256);
                return (short) (h() + (length / 256));
            }
        }
        int i13 = i11 - i10;
        if (i13 < i10) {
            s10 = 1;
        } else {
            i13 = i10;
            s10 = 0;
        }
        while (true) {
            int[] iArr2 = this.f97842b;
            if (i12 >= iArr2.length) {
                o(i10);
                atomicInteger.set(i13);
                return s10;
            }
            int i14 = i10 - iArr2[i12];
            if (i14 >= 0 && i14 < i13) {
                s10 = (short) (i12 + 2);
                i13 = i14;
            }
            i12++;
        }
    }

    @Override // com.davidehrmann.vcdiff.engine.f
    public void i() {
        Arrays.fill(this.f97842b, 0);
        Arrays.fill(this.f97843c, 0);
        this.f97841a = 0;
    }

    @Override // com.davidehrmann.vcdiff.engine.f
    public void o(int i10) {
        int[] iArr = this.f97842b;
        if (iArr.length > 0) {
            int i11 = this.f97841a;
            iArr[i11] = i10;
            this.f97841a = (i11 + 1) % iArr.length;
        }
        int[] iArr2 = this.f97843c;
        if (iArr2.length > 0) {
            iArr2[i10 % iArr2.length] = i10;
        }
    }

    public g(short s10, short s11) {
        super(s10, s11);
    }
}
