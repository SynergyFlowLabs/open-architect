package androidx.media2.exoplayer.external.source.hls;

import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.metadata.id3.PrivFrame;
import androidx.media2.exoplayer.external.util.k0;
import androidx.media2.exoplayer.external.util.m0;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.x;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class h extends androidx.media2.exoplayer.external.source.chunk.l {
    public static final String H = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger I = new AtomicInteger();
    private androidx.media2.exoplayer.external.extractor.i A;
    private boolean B;
    private n C;
    private int D;
    private boolean E;
    private volatile boolean F;
    private boolean G;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f55990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f55991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Uri f55992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private final androidx.media2.exoplayer.external.upstream.l f55993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private final androidx.media2.exoplayer.external.upstream.o f55994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f55995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f55996p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final k0 f55997q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f55998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final f f55999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private final List<Format> f56000t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private final DrmInitData f56001u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private final androidx.media2.exoplayer.external.extractor.i f56002v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.metadata.id3.b f56003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final x f56004x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final boolean f56005y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final boolean f56006z;

    private h(f extractorFactory, androidx.media2.exoplayer.external.upstream.l mediaDataSource, androidx.media2.exoplayer.external.upstream.o dataSpec, Format format, boolean mediaSegmentEncrypted, androidx.media2.exoplayer.external.upstream.l initDataSource, @p0 androidx.media2.exoplayer.external.upstream.o initDataSpec, boolean initSegmentEncrypted, Uri playlistUrl, @p0 List<Format> muxedCaptionFormats, int trackSelectionReason, Object trackSelectionData, long startTimeUs, long endTimeUs, long chunkMediaSequence, int discontinuitySequenceNumber, boolean hasGapTag, boolean isMasterTimestampSource, k0 timestampAdjuster, @p0 DrmInitData drmInitData, @p0 androidx.media2.exoplayer.external.extractor.i previousExtractor, androidx.media2.exoplayer.external.metadata.id3.b id3Decoder, x scratchId3Data, boolean shouldSpliceIn) {
        super(mediaDataSource, dataSpec, format, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, chunkMediaSequence);
        this.f56005y = mediaSegmentEncrypted;
        this.f55991k = discontinuitySequenceNumber;
        this.f55993m = initDataSource;
        this.f55994n = initDataSpec;
        this.f56006z = initSegmentEncrypted;
        this.f55992l = playlistUrl;
        this.f55995o = isMasterTimestampSource;
        this.f55997q = timestampAdjuster;
        this.f55996p = hasGapTag;
        this.f55999s = extractorFactory;
        this.f56000t = muxedCaptionFormats;
        this.f56001u = drmInitData;
        this.f56002v = previousExtractor;
        this.f56003w = id3Decoder;
        this.f56004x = scratchId3Data;
        this.f55998r = shouldSpliceIn;
        this.E = initDataSpec != null;
        this.f55990j = I.getAndIncrement();
    }

    private static androidx.media2.exoplayer.external.upstream.l i(androidx.media2.exoplayer.external.upstream.l dataSource, byte[] fullSegmentEncryptionKey, byte[] encryptionIv) {
        return fullSegmentEncryptionKey != null ? new a(dataSource, fullSegmentEncryptionKey, encryptionIv) : dataSource;
    }

    public static h j(f extractorFactory, androidx.media2.exoplayer.external.upstream.l dataSource, Format format, long startOfPlaylistInPeriodUs, androidx.media2.exoplayer.external.source.hls.playlist.f mediaPlaylist, int segmentIndexInPlaylist, Uri playlistUrl, @p0 List<Format> muxedCaptionFormats, int trackSelectionReason, @p0 Object trackSelectionData, boolean isMasterTimestampSource, p timestampAdjusterProvider, @p0 h previousChunk, @p0 byte[] mediaSegmentKey, @p0 byte[] initSegmentKey) {
        androidx.media2.exoplayer.external.upstream.l lVar;
        androidx.media2.exoplayer.external.upstream.o oVar;
        boolean z10;
        Uri uri;
        androidx.media2.exoplayer.external.extractor.i iVar;
        boolean z11;
        androidx.media2.exoplayer.external.metadata.id3.b bVar;
        x xVar;
        androidx.media2.exoplayer.external.source.hls.playlist.f.b bVar2 = mediaPlaylist.f56146o.get(segmentIndexInPlaylist);
        androidx.media2.exoplayer.external.upstream.o oVar2 = new androidx.media2.exoplayer.external.upstream.o(m0.e(mediaPlaylist.f56160a, bVar2.f56148a), bVar2.f56157j, bVar2.f56158k, null);
        boolean z12 = mediaSegmentKey != null;
        androidx.media2.exoplayer.external.upstream.l lVarI = i(dataSource, mediaSegmentKey, z12 ? l(bVar2.f56156i) : null);
        androidx.media2.exoplayer.external.source.hls.playlist.f.b bVar3 = bVar2.f56149b;
        if (bVar3 != null) {
            boolean z13 = initSegmentKey != null;
            byte[] bArrL = z13 ? l(bVar3.f56156i) : null;
            androidx.media2.exoplayer.external.upstream.o oVar3 = new androidx.media2.exoplayer.external.upstream.o(m0.e(mediaPlaylist.f56160a, bVar3.f56148a), bVar3.f56157j, bVar3.f56158k, null);
            androidx.media2.exoplayer.external.upstream.l lVarI2 = i(dataSource, initSegmentKey, bArrL);
            z10 = z13;
            oVar = oVar3;
            lVar = lVarI2;
        } else {
            lVar = null;
            oVar = null;
            z10 = false;
        }
        long j10 = startOfPlaylistInPeriodUs + bVar2.f56153f;
        long j11 = j10 + bVar2.f56150c;
        int i10 = mediaPlaylist.f56139h + bVar2.f56152e;
        if (previousChunk != null) {
            androidx.media2.exoplayer.external.metadata.id3.b bVar4 = previousChunk.f56003w;
            x xVar2 = previousChunk.f56004x;
            uri = playlistUrl;
            boolean z14 = (uri.equals(previousChunk.f55992l) && previousChunk.G) ? false : true;
            iVar = (previousChunk.B && previousChunk.f55991k == i10 && !z14) ? previousChunk.A : null;
            z11 = z14;
            bVar = bVar4;
            xVar = xVar2;
        } else {
            uri = playlistUrl;
            iVar = null;
            z11 = false;
            bVar = new androidx.media2.exoplayer.external.metadata.id3.b();
            xVar = new x(10);
        }
        return new h(extractorFactory, lVarI, oVar2, format, z12, lVar, oVar, z10, uri, muxedCaptionFormats, trackSelectionReason, trackSelectionData, j10, j11, mediaPlaylist.f56140i + ((long) segmentIndexInPlaylist), i10, bVar2.f56159l, isMasterTimestampSource, timestampAdjusterProvider.a(i10), bVar2.f56154g, iVar, bVar, xVar, z11);
    }

    private void k(androidx.media2.exoplayer.external.upstream.l dataSource, androidx.media2.exoplayer.external.upstream.o dataSpec, boolean dataIsEncrypted) throws InterruptedException, IOException {
        androidx.media2.exoplayer.external.upstream.o oVarD;
        boolean z10;
        int iF = 0;
        if (dataIsEncrypted) {
            z10 = this.D != 0;
            oVarD = dataSpec;
        } else {
            oVarD = dataSpec.d(this.D);
            z10 = false;
        }
        try {
            androidx.media2.exoplayer.external.extractor.e eVarQ = q(dataSource, oVarD);
            if (z10) {
                eVarQ.o(this.D);
            }
            while (iF == 0) {
                try {
                    if (this.F) {
                        break;
                    }
                    int i10 = 7 & 0;
                    iF = this.A.f(eVarQ, null);
                } catch (Throwable th2) {
                    this.D = (int) (eVarQ.getPosition() - dataSpec.f57374e);
                    throw th2;
                }
            }
            this.D = (int) (eVarQ.getPosition() - dataSpec.f57374e);
            q0.n(dataSource);
        } catch (Throwable th3) {
            q0.n(dataSource);
            throw th3;
        }
    }

    private static byte[] l(String ivString) {
        if (q0.V0(ivString).startsWith("0x")) {
            ivString = ivString.substring(2);
        }
        byte[] byteArray = new BigInteger(ivString, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private void n() throws InterruptedException, IOException {
        if (!this.f55995o) {
            this.f55997q.j();
        } else if (this.f55997q.c() == Long.MAX_VALUE) {
            this.f55997q.h(this.f55779f);
        }
        k(this.f55781h, this.f55774a, this.f56005y);
    }

    private void o() throws InterruptedException, IOException {
        if (this.E) {
            k(this.f55993m, this.f55994n, this.f56006z);
            this.D = 0;
            this.E = false;
        }
    }

    private long p(androidx.media2.exoplayer.external.extractor.j input) throws Throwable {
        input.l();
        try {
            input.i(this.f56004x.f57720a, 0, 10);
            this.f56004x.M(10);
            if (this.f56004x.G() != 4801587) {
                return -9223372036854775807L;
            }
            this.f56004x.R(3);
            int iC = this.f56004x.C();
            int i10 = iC + 10;
            if (i10 > this.f56004x.b()) {
                x xVar = this.f56004x;
                byte[] bArr = xVar.f57720a;
                xVar.M(i10);
                System.arraycopy(bArr, 0, this.f56004x.f57720a, 0, 10);
            }
            input.i(this.f56004x.f57720a, 10, iC);
            Metadata metadataC = this.f56003w.c(this.f56004x.f57720a, iC);
            if (metadataC == null) {
                return -9223372036854775807L;
            }
            int iE = metadataC.e();
            for (int i11 = 0; i11 < iE; i11++) {
                Metadata.Entry entryC = metadataC.c(i11);
                if (entryC instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entryC;
                    if (H.equals(privFrame.f55520b)) {
                        System.arraycopy(privFrame.f55521c, 0, this.f56004x.f57720a, 0, 8);
                        this.f56004x.M(8);
                        return this.f56004x.w() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    private androidx.media2.exoplayer.external.extractor.e q(androidx.media2.exoplayer.external.upstream.l dataSource, androidx.media2.exoplayer.external.upstream.o dataSpec) throws Throwable {
        androidx.media2.exoplayer.external.extractor.e eVar = new androidx.media2.exoplayer.external.extractor.e(dataSource, dataSpec.f57374e, dataSource.b(dataSpec));
        if (this.A == null) {
            long jP = p(eVar);
            eVar.l();
            f.a aVarA = this.f55999s.a(this.f56002v, dataSpec.f57370a, this.f55776c, this.f56000t, this.f56001u, this.f55997q, dataSource.a(), eVar);
            this.A = aVarA.f55985a;
            this.B = aVarA.f55987c;
            if (aVarA.f55986b) {
                this.C.d0(jP != -9223372036854775807L ? this.f55997q.b(jP) : this.f55779f);
            }
            this.C.I(this.f55990j, this.f55998r, false);
            this.A.c(this.C);
        }
        return eVar;
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.e
    public void a() throws InterruptedException, IOException {
        androidx.media2.exoplayer.external.extractor.i iVar;
        if (this.A == null && (iVar = this.f56002v) != null) {
            this.A = iVar;
            this.B = true;
            this.E = false;
            this.C.I(this.f55990j, this.f55998r, true);
        }
        o();
        if (this.F) {
            return;
        }
        if (!this.f55996p) {
            n();
        }
        this.G = true;
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.e
    public void b() {
        this.F = true;
    }

    @Override // androidx.media2.exoplayer.external.source.chunk.l
    public boolean h() {
        return this.G;
    }

    public void m(n output) {
        this.C = output;
    }
}
