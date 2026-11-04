package androidx.media2.exoplayer.external.extractor.ogg;

import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class k extends i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f54662r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f54663s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f54664t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private l.d f54665u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private l.b f54666v;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l.d f54667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.b f54668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f54669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l.c[] f54670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f54671e;

        public a(l.d idHeader, l.b commentHeader, byte[] setupHeaderData, l.c[] modes, int iLogModes) {
            this.f54667a = idHeader;
            this.f54668b = commentHeader;
            this.f54669c = setupHeaderData;
            this.f54670d = modes;
            this.f54671e = iLogModes;
        }
    }

    k() {
    }

    @l1
    static void l(x buffer, long packetSampleCount) {
        buffer.P(buffer.d() + 4);
        buffer.f57720a[buffer.d() - 4] = (byte) (packetSampleCount & 255);
        buffer.f57720a[buffer.d() - 3] = (byte) ((packetSampleCount >>> 8) & 255);
        buffer.f57720a[buffer.d() - 2] = (byte) ((packetSampleCount >>> 16) & 255);
        buffer.f57720a[buffer.d() - 1] = (byte) ((packetSampleCount >>> 24) & 255);
    }

    private static int m(byte firstByteOfAudioPacket, a vorbisSetup) {
        return !vorbisSetup.f54670d[n(firstByteOfAudioPacket, vorbisSetup.f54671e, 1)].f54681a ? vorbisSetup.f54667a.f54691g : vorbisSetup.f54667a.f54692h;
    }

    @l1
    static int n(byte src, int length, int leastSignificantBitIndex) {
        return (src >> leastSignificantBitIndex) & (255 >>> (8 - length));
    }

    public static boolean p(x data) {
        try {
            return l.k(1, data, true);
        } catch (k0 unused) {
            return false;
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ogg.i
    protected void d(long currentGranule) {
        super.d(currentGranule);
        this.f54664t = currentGranule != 0;
        l.d dVar = this.f54665u;
        this.f54663s = dVar != null ? dVar.f54691g : 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ogg.i
    protected long e(x packet) {
        byte b10 = packet.f57720a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        int iM = m(b10, this.f54662r);
        long j10 = this.f54664t ? (this.f54663s + iM) / 4 : 0;
        l(packet, j10);
        this.f54664t = true;
        this.f54663s = iM;
        return j10;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ogg.i
    protected boolean h(x packet, long position, i.b setupData) throws InterruptedException, IOException {
        if (this.f54662r != null) {
            return false;
        }
        a aVarO = o(packet);
        this.f54662r = aVarO;
        if (aVarO == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f54662r.f54667a.f54694j);
        arrayList.add(this.f54662r.f54669c);
        l.d dVar = this.f54662r.f54667a;
        setupData.f54656a = Format.s(null, "audio/vorbis", null, dVar.f54689e, -1, dVar.f54686b, (int) dVar.f54687c, arrayList, null, 0, null);
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ogg.i
    protected void j(boolean headerData) {
        super.j(headerData);
        if (headerData) {
            this.f54662r = null;
            this.f54665u = null;
            this.f54666v = null;
        }
        this.f54663s = 0;
        this.f54664t = false;
    }

    @l1
    a o(x scratch) throws IOException {
        if (this.f54665u == null) {
            this.f54665u = l.i(scratch);
            return null;
        }
        if (this.f54666v == null) {
            this.f54666v = l.h(scratch);
            return null;
        }
        byte[] bArr = new byte[scratch.d()];
        System.arraycopy(scratch.f57720a, 0, bArr, 0, scratch.d());
        l.c[] cVarArrJ = l.j(scratch, this.f54665u.f54686b);
        return new a(this.f54665u, this.f54666v, bArr, cVarArrJ, l.a(cVarArrJ.length - 1));
    }
}
