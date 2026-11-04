package androidx.media2.exoplayer.external.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.source.TrackGroup;
import androidx.media2.exoplayer.external.upstream.q0;
import androidx.media2.exoplayer.external.util.m0;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
class d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f55958s = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f55959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.l f55960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.l f55961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f55962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri[] f55963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Format[] f55964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.source.hls.playlist.j f55965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TrackGroup f55966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<Format> f55967i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f55969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f55970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IOException f55971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Uri f55972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f55973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private androidx.media2.exoplayer.external.trackselection.m f55974p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f55976r;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f55968j = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f55975q = -9223372036854775807L;

    private static final class a extends androidx.media2.exoplayer.external.source.chunk.j {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private byte[] f55977l;

        public a(androidx.media2.exoplayer.external.upstream.l dataSource, androidx.media2.exoplayer.external.upstream.o dataSpec, Format trackFormat, int trackSelectionReason, Object trackSelectionData, byte[] scratchSpace) {
            super(dataSource, dataSpec, 3, trackFormat, trackSelectionReason, trackSelectionData, scratchSpace);
        }

        @Override // androidx.media2.exoplayer.external.source.chunk.j
        protected void g(byte[] data, int limit) {
            this.f55977l = Arrays.copyOf(data, limit);
        }

        public byte[] j() {
            return this.f55977l;
        }
    }

    private static final class b extends LinkedHashMap<Uri, byte[]> {
        public b() {
            super(8, 1.0f, false);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public byte[] get(Object keyUri) {
            if (keyUri == null) {
                return null;
            }
            return (byte[]) super.get(keyUri);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public byte[] put(Uri keyUri, byte[] key) {
            return (byte[]) super.put(keyUri, (byte[]) androidx.media2.exoplayer.external.util.a.g(key));
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > 4;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public androidx.media2.exoplayer.external.source.chunk.d f55978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f55979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public Uri f55980c;

        public c() {
            a();
        }

        public void a() {
            this.f55978a = null;
            this.f55979b = false;
            this.f55980c = null;
        }
    }

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.source.hls.d$d, reason: collision with other inner class name */
    private static final class C0518d extends androidx.media2.exoplayer.external.source.chunk.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.source.hls.playlist.f f55981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f55982f;

        public C0518d(androidx.media2.exoplayer.external.source.hls.playlist.f playlist, long startOfPlaylistInPeriodUs, int chunkIndex) {
            super(chunkIndex, playlist.f56146o.size() - 1);
            this.f55981e = playlist;
            this.f55982f = startOfPlaylistInPeriodUs;
        }

        @Override // androidx.media2.exoplayer.external.source.chunk.m
        public long b() {
            e();
            androidx.media2.exoplayer.external.source.hls.playlist.f.b bVar = this.f55981e.f56146o.get((int) f());
            return this.f55982f + bVar.f56153f + bVar.f56150c;
        }

        @Override // androidx.media2.exoplayer.external.source.chunk.m
        public long c() {
            e();
            return this.f55982f + this.f55981e.f56146o.get((int) f()).f56153f;
        }

        @Override // androidx.media2.exoplayer.external.source.chunk.m
        public androidx.media2.exoplayer.external.upstream.o d() {
            e();
            androidx.media2.exoplayer.external.source.hls.playlist.f.b bVar = this.f55981e.f56146o.get((int) f());
            return new androidx.media2.exoplayer.external.upstream.o(m0.e(this.f55981e.f56160a, bVar.f56148a), bVar.f56157j, bVar.f56158k, null);
        }
    }

    private static final class e extends androidx.media2.exoplayer.external.trackselection.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f55983g;

        public e(TrackGroup group, int[] tracks) {
            super(group, tracks);
            this.f55983g = r(group.a(0));
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m
        public int a() {
            return this.f55983g;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m
        public Object n() {
            return null;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.m
        public int o() {
            return 0;
        }

        @Override // androidx.media2.exoplayer.external.trackselection.b, androidx.media2.exoplayer.external.trackselection.m
        public void p(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends androidx.media2.exoplayer.external.source.chunk.l> queue, androidx.media2.exoplayer.external.source.chunk.m[] mediaChunkIterators) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c(this.f55983g, jElapsedRealtime)) {
                for (int i10 = this.f57151b - 1; i10 >= 0; i10--) {
                    if (!c(i10, jElapsedRealtime)) {
                        this.f55983g = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    public d(f extractorFactory, androidx.media2.exoplayer.external.source.hls.playlist.j playlistTracker, Uri[] playlistUrls, Format[] playlistFormats, androidx.media2.exoplayer.external.source.hls.e dataSourceFactory, @p0 q0 mediaTransferListener, p timestampAdjusterProvider, @p0 List<Format> muxedCaptionFormats) {
        this.f55959a = extractorFactory;
        this.f55965g = playlistTracker;
        this.f55963e = playlistUrls;
        this.f55964f = playlistFormats;
        this.f55962d = timestampAdjusterProvider;
        this.f55967i = muxedCaptionFormats;
        androidx.media2.exoplayer.external.upstream.l lVarA = dataSourceFactory.a(1);
        this.f55960b = lVarA;
        if (mediaTransferListener != null) {
            lVarA.c(mediaTransferListener);
        }
        this.f55961c = dataSourceFactory.a(3);
        this.f55966h = new TrackGroup(playlistFormats);
        int[] iArr = new int[playlistUrls.length];
        int i10 = 6 | 0;
        for (int i11 = 0; i11 < playlistUrls.length; i11++) {
            iArr[i11] = i11;
        }
        this.f55974p = new e(this.f55966h, iArr);
    }

    private long b(@p0 h previous, boolean switchingTrack, androidx.media2.exoplayer.external.source.hls.playlist.f mediaPlaylist, long startOfPlaylistInPeriodUs, long loadPositionUs) {
        long jF;
        long size;
        if (previous != null && !switchingTrack) {
            return previous.g();
        }
        long j10 = mediaPlaylist.f56147p + startOfPlaylistInPeriodUs;
        if (previous != null && !this.f55973o) {
            loadPositionUs = previous.f55779f;
        }
        if (mediaPlaylist.f56143l || loadPositionUs < j10) {
            jF = androidx.media2.exoplayer.external.util.q0.f(mediaPlaylist.f56146o, Long.valueOf(loadPositionUs - startOfPlaylistInPeriodUs), true, !this.f55965g.j() || previous == null);
            size = mediaPlaylist.f56140i;
        } else {
            jF = mediaPlaylist.f56140i;
            size = mediaPlaylist.f56146o.size();
        }
        return jF + size;
    }

    @p0
    private static Uri c(androidx.media2.exoplayer.external.source.hls.playlist.f playlist, @p0 androidx.media2.exoplayer.external.source.hls.playlist.f.b segment) {
        String str;
        if (segment == null || (str = segment.f56155h) == null) {
            return null;
        }
        return m0.e(playlist.f56160a, str);
    }

    @p0
    private androidx.media2.exoplayer.external.source.chunk.d h(@p0 Uri keyUri, int selectedTrackIndex) {
        if (keyUri == null) {
            return null;
        }
        if (!this.f55968j.containsKey(keyUri)) {
            return new a(this.f55961c, new androidx.media2.exoplayer.external.upstream.o(keyUri, 0L, -1L, null, 1), this.f55964f[selectedTrackIndex], this.f55974p.o(), this.f55974p.n(), this.f55970l);
        }
        b bVar = this.f55968j;
        bVar.put(keyUri, bVar.remove(keyUri));
        return null;
    }

    private long m(long playbackPositionUs) {
        long j10 = this.f55975q;
        if (j10 != -9223372036854775807L) {
            return j10 - playbackPositionUs;
        }
        return -9223372036854775807L;
    }

    private void p(androidx.media2.exoplayer.external.source.hls.playlist.f mediaPlaylist) {
        this.f55975q = mediaPlaylist.f56143l ? -9223372036854775807L : mediaPlaylist.e() - this.f55965g.b();
    }

    public androidx.media2.exoplayer.external.source.chunk.m[] a(@p0 h previous, long loadPositionUs) {
        h hVar = previous;
        int iB = hVar == null ? -1 : this.f55966h.b(hVar.f55776c);
        int length = this.f55974p.length();
        androidx.media2.exoplayer.external.source.chunk.m[] mVarArr = new androidx.media2.exoplayer.external.source.chunk.m[length];
        int i10 = 0;
        while (i10 < length) {
            int iB2 = this.f55974p.b(i10);
            Uri uri = this.f55963e[iB2];
            if (this.f55965g.i(uri)) {
                androidx.media2.exoplayer.external.source.hls.playlist.f fVarL = this.f55965g.l(uri, false);
                long jB = fVarL.f56137f - this.f55965g.b();
                long jB2 = b(hVar, iB2 != iB, fVarL, jB, loadPositionUs);
                long j10 = fVarL.f56140i;
                if (jB2 < j10) {
                    mVarArr[i10] = androidx.media2.exoplayer.external.source.chunk.m.f55841a;
                } else {
                    mVarArr[i10] = new C0518d(fVarL, jB, (int) (jB2 - j10));
                }
            } else {
                mVarArr[i10] = androidx.media2.exoplayer.external.source.chunk.m.f55841a;
            }
            i10++;
            hVar = previous;
        }
        return mVarArr;
    }

    public void d(long playbackPositionUs, long loadPositionUs, List<h> queue, boolean allowEndOfStream, c out) {
        List<h> list;
        h hVar;
        long j10;
        androidx.media2.exoplayer.external.source.hls.playlist.f fVarL;
        int i10;
        if (queue.isEmpty()) {
            list = queue;
            hVar = null;
        } else {
            list = queue;
            hVar = list.get(queue.size() - 1);
        }
        int iB = hVar == null ? -1 : this.f55966h.b(hVar.f55776c);
        long jMax = loadPositionUs - playbackPositionUs;
        long jM = m(playbackPositionUs);
        if (hVar != null && !this.f55973o) {
            long jD = hVar.d();
            jMax = Math.max(0L, jMax - jD);
            if (jM != -9223372036854775807L) {
                jM = Math.max(0L, jM - jD);
            }
        }
        this.f55974p.p(playbackPositionUs, jMax, jM, list, a(hVar, loadPositionUs));
        int iJ = this.f55974p.j();
        boolean z10 = iB != iJ;
        Uri uri = this.f55963e[iJ];
        if (!this.f55965g.i(uri)) {
            out.f55980c = uri;
            this.f55976r &= uri.equals(this.f55972n);
            this.f55972n = uri;
            return;
        }
        androidx.media2.exoplayer.external.source.hls.playlist.f fVarL2 = this.f55965g.l(uri, true);
        this.f55973o = fVarL2.f56162c;
        p(fVarL2);
        long jB = fVarL2.f56137f - this.f55965g.b();
        int i11 = iB;
        long jB2 = b(hVar, z10, fVarL2, jB, loadPositionUs);
        h hVar2 = hVar;
        if (jB2 >= fVarL2.f56140i || hVar2 == null || !z10) {
            j10 = jB;
            fVarL = fVarL2;
            i10 = iJ;
        } else {
            uri = this.f55963e[i11];
            fVarL = this.f55965g.l(uri, true);
            long jB3 = fVarL.f56137f - this.f55965g.b();
            jB2 = hVar2.g();
            j10 = jB3;
            i10 = i11;
        }
        long j11 = fVarL.f56140i;
        if (jB2 < j11) {
            this.f55971m = new androidx.media2.exoplayer.external.source.d();
            return;
        }
        int i12 = (int) (jB2 - j11);
        int size = fVarL.f56146o.size();
        if (i12 >= size) {
            if (!fVarL.f56143l) {
                out.f55980c = uri;
                this.f55976r &= uri.equals(this.f55972n);
                this.f55972n = uri;
                return;
            } else {
                if (allowEndOfStream || size == 0) {
                    out.f55979b = true;
                    return;
                }
                i12 = size - 1;
            }
        }
        this.f55976r = false;
        this.f55972n = null;
        androidx.media2.exoplayer.external.source.hls.playlist.f.b bVar = fVarL.f56146o.get(i12);
        Uri uriC = c(fVarL, bVar.f56149b);
        androidx.media2.exoplayer.external.source.chunk.d dVarH = h(uriC, i10);
        out.f55978a = dVarH;
        if (dVarH != null) {
            return;
        }
        Uri uriC2 = c(fVarL, bVar);
        androidx.media2.exoplayer.external.source.chunk.d dVarH2 = h(uriC2, i10);
        out.f55978a = dVarH2;
        if (dVarH2 != null) {
            return;
        }
        out.f55978a = h.j(this.f55959a, this.f55960b, this.f55964f[i10], j10, fVarL, i12, uri, this.f55967i, this.f55974p.o(), this.f55974p.n(), this.f55969k, this.f55962d, hVar2, this.f55968j.get(uriC2), this.f55968j.get(uriC));
    }

    public TrackGroup e() {
        return this.f55966h;
    }

    public androidx.media2.exoplayer.external.trackselection.m f() {
        return this.f55974p;
    }

    public boolean g(androidx.media2.exoplayer.external.source.chunk.d chunk, long blacklistDurationMs) {
        androidx.media2.exoplayer.external.trackselection.m mVar = this.f55974p;
        return mVar.q(mVar.f(this.f55966h.b(chunk.f55776c)), blacklistDurationMs);
    }

    public void i() throws IOException {
        IOException iOException = this.f55971m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f55972n;
        if (uri == null || !this.f55976r) {
            return;
        }
        this.f55965g.e(uri);
    }

    public void j(androidx.media2.exoplayer.external.source.chunk.d chunk) {
        if (chunk instanceof a) {
            a aVar = (a) chunk;
            this.f55970l = aVar.h();
            this.f55968j.put(aVar.f55774a.f57370a, aVar.j());
        }
    }

    public boolean k(Uri playlistUrl, long blacklistDurationMs) {
        int iF;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f55963e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(playlistUrl)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (iF = this.f55974p.f(i10)) == -1) {
            return true;
        }
        this.f55976r = playlistUrl.equals(this.f55972n) | this.f55976r;
        if (blacklistDurationMs != -9223372036854775807L && !this.f55974p.q(iF, blacklistDurationMs)) {
            return false;
        }
        return true;
    }

    public void l() {
        this.f55971m = null;
    }

    public void n(boolean isTimestampMaster) {
        this.f55969k = isTimestampMaster;
    }

    public void o(androidx.media2.exoplayer.external.trackselection.m trackSelection) {
        this.f55974p = trackSelection;
    }
}
