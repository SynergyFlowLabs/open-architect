package com.davidehrmann.vcdiff.engine;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f97904c = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final byte[] f97905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final a f97906b;

    public l(byte[] bArr) {
        this.f97905a = bArr;
        this.f97906b = a.h(bArr);
    }

    protected static boolean d(int i10) {
        return i10 >= 32;
    }

    protected void a(ByteBuffer byteBuffer, com.davidehrmann.vcdiff.a<?> aVar) {
        if (byteBuffer.hasRemaining()) {
            aVar.P0(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
        }
    }

    public <OUT> void b(ByteBuffer byteBuffer, boolean z10, OUT out, com.davidehrmann.vcdiff.a<OUT> aVar) throws IOException {
        int iD;
        if (byteBuffer.hasRemaining()) {
            if (byteBuffer.remaining() < 16) {
                byteBuffer.remaining();
                a(byteBuffer, aVar);
                aVar.V0(out);
                return;
            }
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            e eVar = new e(16);
            a aVarI = z10 ? a.i(byteBufferSlice.slice(), e()) : null;
            ByteBuffer byteBufferSlice2 = byteBufferSlice.slice();
            int iB = (int) eVar.b(byteBufferSlice2.array(), byteBufferSlice2.arrayOffset() + byteBufferSlice2.position(), byteBufferSlice2.remaining());
            while (true) {
                boolean zC = c(z10, iB, byteBufferSlice2, byteBufferSlice, aVarI, aVar);
                int i10 = iB;
                if (zC) {
                    byteBufferSlice2.position(byteBufferSlice.position());
                    if (byteBufferSlice2.remaining() < 16) {
                        break;
                    }
                    iD = (int) eVar.b(byteBufferSlice2.array(), byteBufferSlice2.arrayOffset() + byteBufferSlice2.position(), byteBufferSlice2.remaining());
                    if (z10) {
                        aVarI.b(byteBufferSlice2.position());
                    }
                    iB = iD;
                } else {
                    if (byteBufferSlice2.remaining() - 1 < 16) {
                        break;
                    }
                    if (z10) {
                        aVarI.d(byteBufferSlice2.position(), i10);
                    }
                    iD = (int) eVar.d(i10, byteBufferSlice2.get(), byteBufferSlice2.get(byteBufferSlice2.position() + 16));
                    iB = iD;
                }
            }
            a(byteBufferSlice, aVar);
            aVar.V0(out);
            byteBuffer.position(byteBuffer.position() + byteBufferSlice.position());
        }
    }

    protected boolean c(boolean z10, int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, a aVar, com.davidehrmann.vcdiff.a<?> aVar2) {
        a.C0881a c0881a = new a.C0881a();
        ByteBuffer byteBufferSlice = byteBuffer2.slice();
        byteBufferSlice.position((byteBuffer.arrayOffset() + byteBuffer.position()) - (byteBuffer2.arrayOffset() + byteBuffer2.position()));
        this.f97906b.k(i10, byteBufferSlice, c0881a);
        if (z10) {
            aVar.k(i10, byteBufferSlice, c0881a);
        }
        if (!d(c0881a.b())) {
            return false;
        }
        if (c0881a.d() > 0) {
            aVar2.P0(byteBuffer2.array(), byteBuffer2.arrayOffset() + byteBuffer2.position(), c0881a.d());
        }
        aVar2.R0(c0881a.c(), c0881a.b());
        byteBuffer2.position(byteBuffer2.position() + c0881a.d() + c0881a.b());
        return c0881a.d() + c0881a.b() > 0;
    }

    public int e() {
        return this.f97905a.length;
    }
}
