package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class q0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f63355d = 22;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f63356e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f63357f = 28;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f63358g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f63359h = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.google.common.base.c.F, org.msgpack.core.h.a.f339290z, org.msgpack.core.h.a.f339274j, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, com.fasterxml.jackson.core.json.a.f102488j, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f63360i = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, com.google.common.base.c.f116465r, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f63361a = androidx.media3.common.audio.g.f60331a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63363c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63362b = 2;

    private ByteBuffer b(ByteBuffer byteBuffer, @androidx.annotation.p0 byte[] bArr) {
        int i10;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int length = i12 + 27 + i11;
        if (this.f63362b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f63359h.length;
            length += f63360i.length + length2;
            i10 = length2;
        } else {
            i10 = 0;
        }
        ByteBuffer byteBufferC = c(length);
        if (this.f63362b == 2) {
            if (bArr != null) {
                e(byteBufferC, bArr);
            } else {
                byteBufferC.put(f63359h);
            }
            byteBufferC.put(f63360i);
        }
        int iJ = this.f63363c + androidx.media3.extractor.m0.j(byteBuffer);
        this.f63363c = iJ;
        f(byteBufferC, iJ, this.f63362b, i12, false);
        for (int i13 = 0; i13 < i12; i13++) {
            if (i11 >= 255) {
                byteBufferC.put((byte) -1);
                i11 -= 255;
            } else {
                byteBufferC.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferC.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferC.flip();
        if (this.f63362b == 2) {
            byte[] bArrArray = byteBufferC.array();
            int iArrayOffset = byteBufferC.arrayOffset() + i10;
            byte[] bArr2 = f63360i;
            byteBufferC.putInt(i10 + bArr2.length + 22, k1.E(bArrArray, iArrayOffset + bArr2.length, byteBufferC.limit() - byteBufferC.position(), 0));
        } else {
            byteBufferC.putInt(22, k1.E(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        }
        this.f63362b++;
        return byteBufferC;
    }

    private ByteBuffer c(int i10) {
        if (this.f63361a.capacity() < i10) {
            this.f63361a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f63361a.clear();
        }
        return this.f63361a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(com.google.common.primitives.u.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, k1.E(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z10 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(com.google.common.primitives.u.a(i11));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    public void a(androidx.media3.decoder.g gVar, List<byte[]> list) {
        byte[] bArr;
        androidx.media3.common.util.a.g(gVar.f62700d);
        if (gVar.f62700d.limit() - gVar.f62700d.position() == 0) {
            return;
        }
        if (this.f63362b != 2) {
            bArr = null;
        } else {
            if (list.size() != 1) {
                int i10 = 7 << 3;
                if (list.size() != 3) {
                    bArr = null;
                }
            }
            bArr = list.get(0);
        }
        this.f63361a = b(gVar.f62700d, bArr);
        gVar.o();
        gVar.E(this.f63361a.remaining());
        gVar.f62700d.put(this.f63361a);
        gVar.H();
    }

    public void d() {
        this.f63361a = androidx.media3.common.audio.g.f60331a;
        this.f63363c = 0;
        this.f63362b = 2;
    }
}
