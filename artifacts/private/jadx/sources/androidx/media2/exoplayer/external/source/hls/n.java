package androidx.media2.exoplayer.external.source.hls;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.d0;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.metadata.id3.PrivFrame;
import androidx.media2.exoplayer.external.source.TrackGroup;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import androidx.media2.exoplayer.external.source.k0;
import androidx.media2.exoplayer.external.source.u0;
import androidx.media2.exoplayer.external.source.v0;
import androidx.media2.exoplayer.external.source.w0;
import androidx.media2.exoplayer.external.upstream.f0;
import androidx.media2.exoplayer.external.upstream.g0;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class n implements g0.b<androidx.media2.exoplayer.external.source.chunk.d>, g0.f, w0, androidx.media2.exoplayer.external.extractor.k, u0.c {
    private static final String B3 = "HlsSampleStreamWrapper";
    public static final int C3 = -1;
    public static final int D3 = -2;
    public static final int E3 = -3;
    private int A3;
    private int H1;
    private boolean Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f56032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f56033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f56034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.b f56035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Format f56036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.drm.r<?> f56037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f0 f56038g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f56039g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f56041h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k0.a f56042i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private int f56043i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private Format f56045j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<h> f56046k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private Format f56047k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<h> f56048l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f56049l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f56050m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private TrackGroupArray f56051m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f56052n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private Set<TrackGroup> f56053n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Handler f56054o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private int[] f56055o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f56056p0;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f56058p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private int f56059p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f56060q3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList<j> f56062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map<String, DrmInitData> f56064t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private long f56065t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private long f56066u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f56068v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private boolean f56070w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private boolean f56071x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private boolean f56072y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private long f56073z3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g0 f56040h = new g0("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d.c f56044j = new d.c();
    private int[] X = new int[0];
    private int Z = -1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f56057p1 = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private u0[] f56067v = new u0[0];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private androidx.media2.exoplayer.external.source.m[] f56069w = new androidx.media2.exoplayer.external.source.m[0];

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private boolean[] f56063s3 = new boolean[0];

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private boolean[] f56061r3 = new boolean[0];

    public interface a extends w0.a<n> {
        void a();

        void q(Uri playlistUrl);
    }

    private static final class b extends u0 {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final Map<String, DrmInitData> f56074v;

        public b(androidx.media2.exoplayer.external.upstream.b allocator, Map<String, DrmInitData> overridingDrmInitData) {
            super(allocator);
            this.f56074v = overridingDrmInitData;
        }

        @p0
        private Metadata N(@p0 Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int iE = metadata.e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= iE) {
                    i11 = -1;
                    break;
                }
                Metadata.Entry entryC = metadata.c(i11);
                if ((entryC instanceof PrivFrame) && h.H.equals(((PrivFrame) entryC).f55520b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return metadata;
            }
            if (iE == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[iE - 1];
            while (i10 < iE) {
                if (i10 != i11) {
                    entryArr[i10 < i11 ? i10 : i10 - 1] = metadata.c(i10);
                }
                i10++;
            }
            return new Metadata(entryArr);
        }

        @Override // androidx.media2.exoplayer.external.source.u0, androidx.media2.exoplayer.external.extractor.s
        public void c(Format format) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = format.f53108l;
            if (drmInitData2 != null && (drmInitData = this.f56074v.get(drmInitData2.f53813c)) != null) {
                drmInitData2 = drmInitData;
            }
            super.c(format.a(drmInitData2, N(format.f53099g)));
        }
    }

    public n(int trackType, a callback, d chunkSource, Map<String, DrmInitData> overridingDrmInitData, androidx.media2.exoplayer.external.upstream.b allocator, long positionUs, Format muxedAudioFormat, androidx.media2.exoplayer.external.drm.r<?> drmSessionManager, f0 loadErrorHandlingPolicy, k0.a eventDispatcher) {
        this.f56032a = trackType;
        this.f56033b = callback;
        this.f56034c = chunkSource;
        this.f56064t = overridingDrmInitData;
        this.f56035d = allocator;
        this.f56036e = muxedAudioFormat;
        this.f56037f = drmSessionManager;
        this.f56038g = loadErrorHandlingPolicy;
        this.f56042i = eventDispatcher;
        ArrayList<h> arrayList = new ArrayList<>();
        this.f56046k = arrayList;
        this.f56048l = Collections.unmodifiableList(arrayList);
        this.f56062s = new ArrayList<>();
        this.f56050m = new Runnable(this) { // from class: androidx.media2.exoplayer.external.source.hls.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final n f56029a;

            {
                this.f56029a = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f56029a.w();
            }
        };
        this.f56052n = new Runnable(this) { // from class: androidx.media2.exoplayer.external.source.hls.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final n f56030a;

            {
                this.f56030a = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f56030a.x();
            }
        };
        this.f56054o = new Handler();
        this.f56065t3 = positionUs;
        this.f56066u3 = positionUs;
    }

    private static androidx.media2.exoplayer.external.extractor.h A(int id2, int type) {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unmapped track with id ");
        sb2.append(id2);
        sb2.append(" of type ");
        sb2.append(type);
        androidx.media2.exoplayer.external.util.p.l(B3, sb2.toString());
        return new androidx.media2.exoplayer.external.extractor.h();
    }

    private TrackGroupArray B(TrackGroup[] trackGroups) {
        for (int i10 = 0; i10 < trackGroups.length; i10++) {
            TrackGroup trackGroup = trackGroups[i10];
            Format[] formatArr = new Format[trackGroup.f55653a];
            for (int i11 = 0; i11 < trackGroup.f55653a; i11++) {
                Format formatA = trackGroup.a(i11);
                DrmInitData drmInitData = formatA.f53108l;
                if (drmInitData != null) {
                    formatA = formatA.f(this.f56037f.f(drmInitData));
                }
                formatArr[i11] = formatA;
            }
            trackGroups[i10] = new TrackGroup(formatArr);
        }
        return new TrackGroupArray(trackGroups);
    }

    private static Format C(Format playlistFormat, Format sampleFormat, boolean propagateBitrate) {
        if (playlistFormat == null) {
            return sampleFormat;
        }
        int i10 = propagateBitrate ? playlistFormat.f53097e : -1;
        int i11 = playlistFormat.Z;
        if (i11 == -1) {
            i11 = sampleFormat.Z;
        }
        int i12 = i11;
        String strI = q0.I(playlistFormat.f53098f, s.g(sampleFormat.f53103i));
        String strD = s.d(strI);
        if (strD == null) {
            strD = sampleFormat.f53103i;
        }
        return sampleFormat.c(playlistFormat.f53093a, playlistFormat.f53094b, strD, strI, playlistFormat.f53099g, i10, playlistFormat.f53110n, playlistFormat.f53111o, i12, playlistFormat.f53095c, playlistFormat.f53100g3);
    }

    private boolean D(h chunk) {
        int i10 = chunk.f55990j;
        int length = this.f56067v.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f56061r3[i11] && this.f56067v[i11].x() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean E(Format manifestFormat, Format sampleFormat) {
        String str = manifestFormat.f53103i;
        String str2 = sampleFormat.f53103i;
        int iG = s.g(str);
        if (iG != 3) {
            return iG == s.g(str2);
        }
        if (!q0.b(str, str2)) {
            return false;
        }
        if (("application/cea-608".equals(str) || "application/cea-708".equals(str)) && manifestFormat.f53102h3 != sampleFormat.f53102h3) {
            return false;
        }
        return true;
    }

    private h F() {
        ArrayList<h> arrayList = this.f56046k;
        return arrayList.get(arrayList.size() - 1);
    }

    private static int H(int trackType) {
        if (trackType == 1) {
            return 2;
        }
        if (trackType != 2) {
            return trackType != 3 ? 0 : 1;
        }
        return 3;
    }

    private static boolean J(androidx.media2.exoplayer.external.source.chunk.d chunk) {
        return chunk instanceof h;
    }

    private boolean K() {
        return this.f56066u3 != -9223372036854775807L;
    }

    private void M() {
        int i10 = this.f56051m3.f55657a;
        int[] iArr = new int[i10];
        this.f56055o3 = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                u0[] u0VarArr = this.f56067v;
                if (i12 >= u0VarArr.length) {
                    break;
                }
                if (E(u0VarArr[i12].s(), this.f56051m3.a(i11).a(0))) {
                    this.f56055o3[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator<j> it = this.f56062s.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void w() {
        if (!this.f56049l3 && this.f56055o3 == null && this.f56039g3) {
            for (u0 u0Var : this.f56067v) {
                if (u0Var.s() == null) {
                    return;
                }
            }
            if (this.f56051m3 != null) {
                M();
                return;
            }
            y();
            this.f56041h3 = true;
            this.f56033b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void x() {
        this.f56039g3 = true;
        w();
    }

    private void Y() {
        for (u0 u0Var : this.f56067v) {
            u0Var.G(this.f56068v3);
        }
        this.f56068v3 = false;
    }

    private boolean Z(long positionUs) {
        int length = this.f56067v.length;
        for (int i10 = 0; i10 < length; i10++) {
            u0 u0Var = this.f56067v[i10];
            u0Var.H();
            if (u0Var.f(positionUs, true, false) == -1 && (this.f56063s3[i10] || !this.f56060q3)) {
                return false;
            }
        }
        return true;
    }

    private void g0(v0[] streams) {
        this.f56062s.clear();
        for (v0 v0Var : streams) {
            if (v0Var != null) {
                this.f56062s.add((j) v0Var);
            }
        }
    }

    private void y() {
        int length = this.f56067v.length;
        int i10 = 6;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int i13 = 2;
            if (i12 >= length) {
                break;
            }
            String str = this.f56067v[i12].s().f53103i;
            if (!s.n(str)) {
                i13 = s.l(str) ? 1 : s.m(str) ? 3 : 6;
            }
            if (H(i13) > H(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        TrackGroup trackGroupE = this.f56034c.e();
        int i14 = trackGroupE.f55653a;
        this.f56059p3 = -1;
        this.f56055o3 = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.f56055o3[i15] = i15;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        for (int i16 = 0; i16 < length; i16++) {
            Format formatS = this.f56067v[i16].s();
            if (i16 == i11) {
                Format[] formatArr = new Format[i14];
                if (i14 == 1) {
                    formatArr[0] = formatS.i(trackGroupE.a(0));
                } else {
                    for (int i17 = 0; i17 < i14; i17++) {
                        formatArr[i17] = C(trackGroupE.a(i17), formatS, true);
                    }
                }
                trackGroupArr[i16] = new TrackGroup(formatArr);
                this.f56059p3 = i16;
            } else {
                trackGroupArr[i16] = new TrackGroup(C((i10 == 2 && s.l(formatS.f53103i)) ? this.f56036e : null, formatS, false));
            }
        }
        this.f56051m3 = B(trackGroupArr);
        androidx.media2.exoplayer.external.util.a.i(this.f56053n3 == null);
        this.f56053n3 = Collections.EMPTY_SET;
    }

    public int G() {
        return this.f56059p3;
    }

    public void I(int chunkUid, boolean shouldSpliceIn, boolean reusingExtractor) {
        if (!reusingExtractor) {
            this.Y = false;
            this.f56056p0 = false;
        }
        this.A3 = chunkUid;
        for (u0 u0Var : this.f56067v) {
            u0Var.L(chunkUid);
        }
        if (shouldSpliceIn) {
            for (u0 u0Var2 : this.f56067v) {
                u0Var2.M();
            }
        }
    }

    public boolean L(int sampleQueueIndex) {
        return !K() && this.f56069w[sampleQueueIndex].a(this.f56071x3);
    }

    public void O() throws IOException {
        this.f56040h.a();
        this.f56034c.i();
    }

    public void P(int sampleQueueIndex) throws IOException {
        O();
        this.f56069w[sampleQueueIndex].b();
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void u(androidx.media2.exoplayer.external.source.chunk.d loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        this.f56042i.o(loadable.f55774a, loadable.f(), loadable.e(), loadable.f55775b, this.f56032a, loadable.f55776c, loadable.f55777d, loadable.f55778e, loadable.f55779f, loadable.f55780g, elapsedRealtimeMs, loadDurationMs, loadable.c());
        if (released) {
            return;
        }
        Y();
        if (this.f56043i3 > 0) {
            this.f56033b.j(this);
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void t(androidx.media2.exoplayer.external.source.chunk.d loadable, long elapsedRealtimeMs, long loadDurationMs) {
        this.f56034c.j(loadable);
        this.f56042i.r(loadable.f55774a, loadable.f(), loadable.e(), loadable.f55775b, this.f56032a, loadable.f55776c, loadable.f55777d, loadable.f55778e, loadable.f55779f, loadable.f55780g, elapsedRealtimeMs, loadDurationMs, loadable.c());
        if (this.f56041h3) {
            this.f56033b.j(this);
        } else {
            k(this.f56065t3);
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public g0.c d(androidx.media2.exoplayer.external.source.chunk.d loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        g0.c cVarH;
        long jC = loadable.c();
        boolean zJ = J(loadable);
        long jB = this.f56038g.b(loadable.f55775b, loadDurationMs, error, errorCount);
        boolean zG = jB != -9223372036854775807L ? this.f56034c.g(loadable, jB) : false;
        if (zG) {
            if (zJ && jC == 0) {
                ArrayList<h> arrayList = this.f56046k;
                androidx.media2.exoplayer.external.util.a.i(arrayList.remove(arrayList.size() - 1) == loadable);
                if (this.f56046k.isEmpty()) {
                    this.f56066u3 = this.f56065t3;
                }
            }
            cVarH = g0.f57297j;
        } else {
            long jC2 = this.f56038g.c(loadable.f55775b, loadDurationMs, error, errorCount);
            cVarH = jC2 != -9223372036854775807L ? g0.h(false, jC2) : g0.f57298k;
        }
        g0.c cVar = cVarH;
        this.f56042i.u(loadable.f55774a, loadable.f(), loadable.e(), loadable.f55775b, this.f56032a, loadable.f55776c, loadable.f55777d, loadable.f55778e, loadable.f55779f, loadable.f55780g, elapsedRealtimeMs, loadDurationMs, jC, error, !cVar.c());
        if (zG) {
            if (!this.f56041h3) {
                k(this.f56065t3);
                return cVar;
            }
            this.f56033b.j(this);
        }
        return cVar;
    }

    public boolean T(Uri playlistUrl, long blacklistDurationMs) {
        return this.f56034c.k(playlistUrl, blacklistDurationMs);
    }

    public void V(TrackGroup[] trackGroups, int primaryTrackGroupIndex, int... optionalTrackGroupsIndices) {
        this.f56041h3 = true;
        this.f56051m3 = B(trackGroups);
        this.f56053n3 = new HashSet();
        for (int i10 : optionalTrackGroupsIndices) {
            this.f56053n3.add(this.f56051m3.a(i10));
        }
        this.f56059p3 = primaryTrackGroupIndex;
        Handler handler = this.f56054o;
        a aVar = this.f56033b;
        aVar.getClass();
        handler.post(m.a(aVar));
    }

    public int W(int sampleQueueIndex, d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean requireFormat) {
        if (K()) {
            return -3;
        }
        int i10 = 0;
        if (!this.f56046k.isEmpty()) {
            int i11 = 0;
            while (i11 < this.f56046k.size() - 1 && D(this.f56046k.get(i11))) {
                i11++;
            }
            q0.G0(this.f56046k, 0, i11);
            h hVar = this.f56046k.get(0);
            Format format = hVar.f55776c;
            if (!format.equals(this.f56047k3)) {
                this.f56042i.c(this.f56032a, format, hVar.f55777d, hVar.f55778e, hVar.f55779f);
            }
            this.f56047k3 = format;
        }
        int iD = this.f56069w[sampleQueueIndex].d(formatHolder, buffer, requireFormat, this.f56071x3, this.f56065t3);
        if (iD == -5) {
            Format formatI = formatHolder.f53762c;
            if (sampleQueueIndex == this.f56058p2) {
                int iX = this.f56067v[sampleQueueIndex].x();
                while (i10 < this.f56046k.size() && this.f56046k.get(i10).f55990j != iX) {
                    i10++;
                }
                formatI = formatI.i(i10 < this.f56046k.size() ? this.f56046k.get(i10).f55776c : this.f56045j3);
            }
            formatHolder.f53762c = formatI;
        }
        return iD;
    }

    public void X() {
        if (this.f56041h3) {
            for (u0 u0Var : this.f56067v) {
                u0Var.k();
            }
            for (androidx.media2.exoplayer.external.source.m mVar : this.f56069w) {
                mVar.e();
            }
        }
        this.f56040h.k(this);
        this.f56054o.removeCallbacksAndMessages(null);
        this.f56049l3 = true;
        this.f56062s.clear();
    }

    @Override // androidx.media2.exoplayer.external.extractor.k
    public androidx.media2.exoplayer.external.extractor.s a(int id2, int type) {
        u0[] u0VarArr = this.f56067v;
        int length = u0VarArr.length;
        if (type == 1) {
            int i10 = this.Z;
            if (i10 != -1) {
                if (this.Y) {
                    return this.X[i10] == id2 ? u0VarArr[i10] : A(id2, type);
                }
                this.Y = true;
                this.X[i10] = id2;
                return u0VarArr[i10];
            }
            if (this.f56072y3) {
                return A(id2, type);
            }
        } else if (type == 2) {
            int i11 = this.f56057p1;
            if (i11 != -1) {
                if (this.f56056p0) {
                    return this.X[i11] == id2 ? u0VarArr[i11] : A(id2, type);
                }
                this.f56056p0 = true;
                this.X[i11] = id2;
                return u0VarArr[i11];
            }
            if (this.f56072y3) {
                return A(id2, type);
            }
        } else {
            for (int i12 = 0; i12 < length; i12++) {
                if (this.X[i12] == id2) {
                    return this.f56067v[i12];
                }
            }
            if (this.f56072y3) {
                return A(id2, type);
            }
        }
        b bVar = new b(this.f56035d, this.f56064t);
        bVar.J(this.f56073z3);
        bVar.L(this.A3);
        bVar.K(this);
        int i13 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.X, i13);
        this.X = iArrCopyOf;
        iArrCopyOf[length] = id2;
        u0[] u0VarArr2 = (u0[]) Arrays.copyOf(this.f56067v, i13);
        this.f56067v = u0VarArr2;
        u0VarArr2[length] = bVar;
        androidx.media2.exoplayer.external.source.m[] mVarArr = (androidx.media2.exoplayer.external.source.m[]) Arrays.copyOf(this.f56069w, i13);
        this.f56069w = mVarArr;
        mVarArr[length] = new androidx.media2.exoplayer.external.source.m(this.f56067v[length], this.f56037f);
        boolean[] zArrCopyOf = Arrays.copyOf(this.f56063s3, i13);
        this.f56063s3 = zArrCopyOf;
        boolean z10 = type == 1 || type == 2;
        zArrCopyOf[length] = z10;
        this.f56060q3 |= z10;
        if (type == 1) {
            this.Y = true;
            this.Z = length;
        } else if (type == 2) {
            this.f56056p0 = true;
            this.f56057p1 = length;
        }
        if (H(type) > H(this.H1)) {
            this.f56058p2 = length;
            this.H1 = type;
        }
        this.f56061r3 = Arrays.copyOf(this.f56061r3, i13);
        return bVar;
    }

    public boolean a0(long positionUs, boolean forceReset) {
        this.f56065t3 = positionUs;
        if (K()) {
            this.f56066u3 = positionUs;
            return true;
        }
        if (this.f56039g3 && !forceReset && Z(positionUs)) {
            return false;
        }
        this.f56066u3 = positionUs;
        this.f56071x3 = false;
        this.f56046k.clear();
        if (this.f56040h.i()) {
            this.f56040h.g();
        } else {
            Y();
        }
        return true;
    }

    @Override // androidx.media2.exoplayer.external.source.w0
    public long b() {
        if (this.f56071x3) {
            return Long.MIN_VALUE;
        }
        if (K()) {
            return this.f56066u3;
        }
        long jMax = this.f56065t3;
        h hVarF = F();
        if (!hVarF.h()) {
            if (this.f56046k.size() > 1) {
                ArrayList<h> arrayList = this.f56046k;
                hVarF = arrayList.get(arrayList.size() - 2);
            } else {
                hVarF = null;
            }
        }
        if (hVarF != null) {
            jMax = Math.max(jMax, hVarF.f55780g);
        }
        if (this.f56039g3) {
            for (u0 u0Var : this.f56067v) {
                jMax = Math.max(jMax, u0Var.q());
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    public boolean b0(androidx.media2.exoplayer.external.trackselection.m[] selections, boolean[] mayRetainStreamFlags, v0[] streams, boolean[] streamResetFlags, long positionUs, boolean forceReset) {
        boolean z10;
        androidx.media2.exoplayer.external.util.a.i(this.f56041h3);
        int i10 = this.f56043i3;
        int i11 = 0;
        for (int i12 = 0; i12 < selections.length; i12++) {
            v0 v0Var = streams[i12];
            if (v0Var != null && (selections[i12] == null || !mayRetainStreamFlags[i12])) {
                this.f56043i3--;
                ((j) v0Var).d();
                streams[i12] = null;
            }
        }
        boolean z11 = forceReset || (!this.f56070w3 ? positionUs == this.f56065t3 : i10 != 0);
        androidx.media2.exoplayer.external.trackselection.m mVarF = this.f56034c.f();
        boolean z12 = z11;
        androidx.media2.exoplayer.external.trackselection.m mVar = mVarF;
        for (int i13 = 0; i13 < selections.length; i13++) {
            androidx.media2.exoplayer.external.trackselection.m mVar2 = selections[i13];
            if (mVar2 != null) {
                int iB = this.f56051m3.b(mVar2.g());
                if (iB == this.f56059p3) {
                    this.f56034c.o(mVar2);
                    mVar = mVar2;
                }
                if (streams[i13] == null) {
                    this.f56043i3++;
                    j jVar = new j(this, iB);
                    streams[i13] = jVar;
                    streamResetFlags[i13] = true;
                    if (this.f56055o3 != null) {
                        jVar.b();
                    }
                    if (this.f56039g3 && !z12) {
                        u0 u0Var = this.f56067v[this.f56055o3[iB]];
                        u0Var.H();
                        z12 = u0Var.f(positionUs, true, true) == -1 && u0Var.r() != 0;
                    }
                }
            }
        }
        if (this.f56043i3 == 0) {
            this.f56034c.l();
            this.f56047k3 = null;
            this.f56068v3 = true;
            this.f56046k.clear();
            if (this.f56040h.i()) {
                if (this.f56039g3) {
                    u0[] u0VarArr = this.f56067v;
                    int length = u0VarArr.length;
                    while (i11 < length) {
                        u0VarArr[i11].k();
                        i11++;
                    }
                }
                this.f56040h.g();
            } else {
                Y();
            }
        } else {
            if (this.f56046k.isEmpty() || q0.b(mVar, mVarF)) {
                z10 = forceReset;
            } else {
                if (!this.f56070w3) {
                    long j10 = positionUs < 0 ? -positionUs : 0L;
                    h hVarF = F();
                    androidx.media2.exoplayer.external.trackselection.m mVar3 = mVar;
                    mVar3.p(positionUs, j10, -9223372036854775807L, this.f56048l, this.f56034c.a(hVarF, positionUs));
                    if (mVar3.j() == this.f56034c.e().b(hVarF.f55776c)) {
                        z10 = forceReset;
                    }
                }
                this.f56068v3 = true;
                z10 = true;
                z12 = true;
            }
            if (z12) {
                a0(positionUs, z10);
                while (i11 < streams.length) {
                    if (streams[i11] != null) {
                        streamResetFlags[i11] = true;
                    }
                    i11++;
                }
            }
        }
        g0(streams);
        this.f56070w3 = true;
        return z12;
    }

    @Override // androidx.media2.exoplayer.external.source.w0
    public void c(long positionUs) {
    }

    public void c0(boolean isTimestampMaster) {
        this.f56034c.n(isTimestampMaster);
    }

    public void d0(long sampleOffsetUs) {
        this.f56073z3 = sampleOffsetUs;
        for (u0 u0Var : this.f56067v) {
            u0Var.J(sampleOffsetUs);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.w0
    public long e() {
        if (K()) {
            return this.f56066u3;
        }
        if (this.f56071x3) {
            return Long.MIN_VALUE;
        }
        return F().f55780g;
    }

    public int e0(int sampleQueueIndex, long positionUs) {
        if (K()) {
            return 0;
        }
        u0 u0Var = this.f56067v[sampleQueueIndex];
        if (this.f56071x3 && positionUs > u0Var.q()) {
            return u0Var.g();
        }
        int iF = u0Var.f(positionUs, true, true);
        if (iF == -1) {
            return 0;
        }
        return iF;
    }

    public void f0(int trackGroupIndex) {
        int i10 = this.f56055o3[trackGroupIndex];
        androidx.media2.exoplayer.external.util.a.i(this.f56061r3[i10]);
        this.f56061r3[i10] = false;
    }

    @Override // androidx.media2.exoplayer.external.source.u0.c
    public void g(Format format) {
        this.f56054o.post(this.f56050m);
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.f
    public void j() {
        Y();
        for (androidx.media2.exoplayer.external.source.m mVar : this.f56069w) {
            mVar.e();
        }
    }

    @Override // androidx.media2.exoplayer.external.source.w0
    public boolean k(long positionUs) {
        List<h> list;
        long jMax;
        if (this.f56071x3 || this.f56040h.i()) {
            return false;
        }
        if (K()) {
            list = Collections.EMPTY_LIST;
            jMax = this.f56066u3;
        } else {
            list = this.f56048l;
            h hVarF = F();
            jMax = hVarF.h() ? hVarF.f55780g : Math.max(this.f56065t3, hVarF.f55779f);
        }
        List<h> list2 = list;
        this.f56034c.d(positionUs, jMax, list2, this.f56041h3 || !list2.isEmpty(), this.f56044j);
        d.c cVar = this.f56044j;
        boolean z10 = cVar.f55979b;
        androidx.media2.exoplayer.external.source.chunk.d dVar = cVar.f55978a;
        Uri uri = cVar.f55980c;
        cVar.a();
        if (z10) {
            this.f56066u3 = -9223372036854775807L;
            this.f56071x3 = true;
            return true;
        }
        if (dVar == null) {
            if (uri != null) {
                this.f56033b.q(uri);
            }
            return false;
        }
        if (J(dVar)) {
            this.f56066u3 = -9223372036854775807L;
            h hVar = (h) dVar;
            hVar.m(this);
            this.f56046k.add(hVar);
            this.f56045j3 = hVar.f55776c;
        }
        this.f56042i.x(dVar.f55774a, dVar.f55775b, this.f56032a, dVar.f55776c, dVar.f55777d, dVar.f55778e, dVar.f55779f, dVar.f55780g, this.f56040h.l(dVar, this, this.f56038g.a(dVar.f55775b)));
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.k
    public void l() {
        this.f56072y3 = true;
        this.f56054o.post(this.f56052n);
    }

    public TrackGroupArray m() {
        return this.f56051m3;
    }

    public void o() throws IOException {
        O();
        if (this.f56071x3 && !this.f56041h3) {
            throw new androidx.media2.exoplayer.external.k0("Loading finished before preparation is complete.");
        }
    }

    public void p(long positionUs, boolean toKeyframe) {
        if (this.f56039g3 && !K()) {
            int length = this.f56067v.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f56067v[i10].j(positionUs, toKeyframe, this.f56061r3[i10]);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.k
    public void q(androidx.media2.exoplayer.external.extractor.q seekMap) {
    }

    public int v(int trackGroupIndex) {
        int i10 = this.f56055o3[trackGroupIndex];
        if (i10 == -1) {
            return this.f56053n3.contains(this.f56051m3.a(trackGroupIndex)) ? -3 : -2;
        }
        boolean[] zArr = this.f56061r3;
        if (zArr[i10]) {
            return -2;
        }
        zArr[i10] = true;
        return i10;
    }

    public void z() {
        if (this.f56041h3) {
            return;
        }
        k(this.f56065t3);
    }
}
