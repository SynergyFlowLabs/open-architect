package androidx.media2.exoplayer.external.extractor.ogg;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.util.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class h extends i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f54634s = 3840;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f54635t = 48000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f54636u = 1332770163;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f54637v = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f54638r;

    h() {
    }

    private long l(byte[] packet) {
        int i10;
        int i11;
        byte b10 = packet[0];
        int i12 = b10 & 255;
        int i13 = b10 & 3;
        if (i13 != 0) {
            i10 = 2;
            if (i13 != 1 && i13 != 2) {
                i10 = packet[1] & 63;
            }
        } else {
            i10 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = 2500 << i15;
        } else if (i14 >= 12) {
            i11 = 10000 << (i14 & 1);
        } else {
            i11 = i15 == 3 ? 60000 : 10000 << i15;
        }
        return ((long) i10) * ((long) i11);
    }

    private void m(List<byte[]> initializationData, int samples) {
        initializationData.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) samples) * 1000000000) / 48000).array());
    }

    public static boolean n(x data) {
        int iA = data.a();
        byte[] bArr = f54637v;
        if (iA < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        data.i(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // androidx.media2.exoplayer.external.extractor.ogg.i
    protected long e(x packet) {
        return b(l(packet.f57720a));
    }

    @Override // androidx.media2.exoplayer.external.extractor.ogg.i
    protected boolean h(x packet, long position, i.b setupData) {
        if (this.f54638r) {
            boolean z10 = packet.l() == 1332770163;
            packet.Q(0);
            return z10;
        }
        byte[] bArrCopyOf = Arrays.copyOf(packet.f57720a, packet.d());
        int i10 = bArrCopyOf[9] & 255;
        int i11 = ((bArrCopyOf[11] & 255) << 8) | (bArrCopyOf[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArrCopyOf);
        m(arrayList, i11);
        m(arrayList, f54634s);
        setupData.f54656a = Format.s(null, "audio/opus", null, -1, -1, i10, 48000, arrayList, null, 0, null);
        this.f54638r = true;
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ogg.i
    protected void j(boolean headerData) {
        super.j(headerData);
        if (headerData) {
            this.f54638r = false;
        }
    }
}
