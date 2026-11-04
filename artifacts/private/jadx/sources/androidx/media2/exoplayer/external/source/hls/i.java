package androidx.media2.exoplayer.external.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.offline.StreamKey;
import androidx.media2.exoplayer.external.source.TrackGroup;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import androidx.media2.exoplayer.external.source.k0;
import androidx.media2.exoplayer.external.source.v0;
import androidx.media2.exoplayer.external.source.w0;
import androidx.media2.exoplayer.external.source.x;
import androidx.media2.exoplayer.external.upstream.f0;
import androidx.media2.exoplayer.external.upstream.q0;
import androidx.media2.exoplayer.external.util.s;
import androidx.media2.exoplayer.external.x0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class i implements x, n.a, androidx.media2.exoplayer.external.source.hls.playlist.j.b {
    private w0 X;
    private boolean Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f56007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.source.hls.playlist.j f56008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f56009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final q0 f56010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.drm.r<?> f56011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f0 f56012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k0.a f56013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.b f56014h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.source.j f56017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f56018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f56019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private x.a f56020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f56021o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TrackGroupArray f56022s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final IdentityHashMap<v0, Integer> f56015i = new IdentityHashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p f56016j = new p();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private n[] f56023t = new n[0];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private n[] f56024v = new n[0];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[][] f56025w = new int[0][];

    public i(f extractorFactory, androidx.media2.exoplayer.external.source.hls.playlist.j playlistTracker, e dataSourceFactory, @p0 q0 mediaTransferListener, androidx.media2.exoplayer.external.drm.r<?> drmSessionManager, f0 loadErrorHandlingPolicy, k0.a eventDispatcher, androidx.media2.exoplayer.external.upstream.b allocator, androidx.media2.exoplayer.external.source.j compositeSequenceableLoaderFactory, boolean allowChunklessPreparation, boolean useSessionKeys) {
        this.f56007a = extractorFactory;
        this.f56008b = playlistTracker;
        this.f56009c = dataSourceFactory;
        this.f56010d = mediaTransferListener;
        this.f56011e = drmSessionManager;
        this.f56012f = loadErrorHandlingPolicy;
        this.f56013g = eventDispatcher;
        this.f56014h = allocator;
        this.f56017k = compositeSequenceableLoaderFactory;
        this.f56018l = allowChunklessPreparation;
        this.f56019m = useSessionKeys;
        this.X = compositeSequenceableLoaderFactory.a(new w0[0]);
        eventDispatcher.z();
    }

    private void t(long positionUs, List<androidx.media2.exoplayer.external.source.hls.playlist.e.a> audioRenditions, List<n> sampleStreamWrappers, List<int[]> manifestUrlsIndicesPerWrapper, Map<String, DrmInitData> overridingDrmInitData) {
        ArrayList arrayList = new ArrayList(audioRenditions.size());
        ArrayList arrayList2 = new ArrayList(audioRenditions.size());
        ArrayList arrayList3 = new ArrayList(audioRenditions.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < audioRenditions.size(); i10++) {
            String str = audioRenditions.get(i10).f56125d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < audioRenditions.size(); i11++) {
                    if (androidx.media2.exoplayer.external.util.q0.b(str, audioRenditions.get(i11).f56125d)) {
                        androidx.media2.exoplayer.external.source.hls.playlist.e.a aVar = audioRenditions.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f56122a);
                        arrayList2.add(aVar.f56123b);
                        z10 &= aVar.f56123b.f53098f != null;
                    }
                }
                n nVarW = w(1, (Uri[]) arrayList.toArray(new Uri[0]), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.EMPTY_LIST, overridingDrmInitData, positionUs);
                manifestUrlsIndicesPerWrapper.add(androidx.media2.exoplayer.external.util.q0.T0(arrayList3));
                sampleStreamWrappers.add(nVarW);
                if (this.f56018l && z10) {
                    nVarW.V(new TrackGroup[]{new TrackGroup((Format[]) arrayList2.toArray(new Format[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void u(androidx.media2.exoplayer.external.source.hls.playlist.e masterPlaylist, long positionUs, List<n> sampleStreamWrappers, List<int[]> manifestUrlIndicesPerWrapper, Map<String, DrmInitData> overridingDrmInitData) {
        boolean z10;
        boolean z11;
        int size = masterPlaylist.f56113e.size();
        int[] iArr = new int[size];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < masterPlaylist.f56113e.size(); i12++) {
            Format format = masterPlaylist.f56113e.get(i12).f56127b;
            if (format.f53111o > 0 || androidx.media2.exoplayer.external.util.q0.I(format.f53098f, 2) != null) {
                iArr[i12] = 2;
                i10++;
            } else if (androidx.media2.exoplayer.external.util.q0.I(format.f53098f, 1) != null) {
                iArr[i12] = 1;
                i11++;
            } else {
                iArr[i12] = -1;
            }
        }
        if (i10 > 0) {
            size = i10;
            z10 = true;
            z11 = false;
        } else if (i11 < size) {
            size -= i11;
            z10 = false;
            z11 = true;
        } else {
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[size];
        Format[] formatArr = new Format[size];
        int[] iArr2 = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < masterPlaylist.f56113e.size(); i14++) {
            if ((!z10 || iArr[i14] == 2) && (!z11 || iArr[i14] != 1)) {
                androidx.media2.exoplayer.external.source.hls.playlist.e.b bVar = masterPlaylist.f56113e.get(i14);
                uriArr[i13] = bVar.f56126a;
                formatArr[i13] = bVar.f56127b;
                iArr2[i13] = i14;
                i13++;
            }
        }
        String str = formatArr[0].f53098f;
        n nVarW = w(0, uriArr, formatArr, masterPlaylist.f56118j, masterPlaylist.f56119k, overridingDrmInitData, positionUs);
        sampleStreamWrappers.add(nVarW);
        manifestUrlIndicesPerWrapper.add(iArr2);
        if (!this.f56018l || str == null) {
            return;
        }
        boolean z12 = androidx.media2.exoplayer.external.util.q0.I(str, 2) != null;
        boolean z13 = androidx.media2.exoplayer.external.util.q0.I(str, 1) != null;
        ArrayList arrayList = new ArrayList();
        if (z12) {
            Format[] formatArr2 = new Format[size];
            for (int i15 = 0; i15 < size; i15++) {
                formatArr2[i15] = z(formatArr[i15]);
            }
            arrayList.add(new TrackGroup(formatArr2));
            if (z13 && (masterPlaylist.f56118j != null || masterPlaylist.f56115g.isEmpty())) {
                arrayList.add(new TrackGroup(x(formatArr[0], masterPlaylist.f56118j, false)));
            }
            List<Format> list = masterPlaylist.f56119k;
            if (list != null) {
                for (int i16 = 0; i16 < list.size(); i16++) {
                    arrayList.add(new TrackGroup(list.get(i16)));
                }
            }
        } else {
            if (!z13) {
                throw new IllegalArgumentException(str.length() != 0 ? "Unexpected codecs attribute: ".concat(str) : new String("Unexpected codecs attribute: "));
            }
            Format[] formatArr3 = new Format[size];
            for (int i17 = 0; i17 < size; i17++) {
                formatArr3[i17] = x(formatArr[i17], masterPlaylist.f56118j, true);
            }
            arrayList.add(new TrackGroup(formatArr3));
        }
        TrackGroup trackGroup = new TrackGroup(Format.x("ID3", "application/id3", null, -1, null));
        arrayList.add(trackGroup);
        nVarW.V((TrackGroup[]) arrayList.toArray(new TrackGroup[0]), 0, arrayList.indexOf(trackGroup));
    }

    private void v(long positionUs) {
        androidx.media2.exoplayer.external.source.hls.playlist.e eVar = (androidx.media2.exoplayer.external.source.hls.playlist.e) androidx.media2.exoplayer.external.util.a.g(this.f56008b.c());
        Map<String, DrmInitData> mapY = this.f56019m ? y(eVar.f56121m) : Collections.EMPTY_MAP;
        boolean zIsEmpty = eVar.f56113e.isEmpty();
        List<androidx.media2.exoplayer.external.source.hls.playlist.e.a> list = eVar.f56115g;
        List<androidx.media2.exoplayer.external.source.hls.playlist.e.a> list2 = eVar.f56116h;
        this.f56021o = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!zIsEmpty) {
            u(eVar, positionUs, arrayList, arrayList2, mapY);
        }
        t(positionUs, list, arrayList, arrayList2, mapY);
        for (int i10 = 0; i10 < list2.size(); i10++) {
            androidx.media2.exoplayer.external.source.hls.playlist.e.a aVar = list2.get(i10);
            n nVarW = w(3, new Uri[]{aVar.f56122a}, new Format[]{aVar.f56123b}, null, Collections.EMPTY_LIST, mapY, positionUs);
            arrayList2.add(new int[]{i10});
            arrayList.add(nVarW);
            nVarW.V(new TrackGroup[]{new TrackGroup(aVar.f56123b)}, 0, new int[0]);
        }
        this.f56023t = (n[]) arrayList.toArray(new n[0]);
        this.f56025w = (int[][]) arrayList2.toArray(new int[0][]);
        n[] nVarArr = this.f56023t;
        this.f56021o = nVarArr.length;
        nVarArr[0].c0(true);
        for (n nVar : this.f56023t) {
            nVar.z();
        }
        this.f56024v = this.f56023t;
    }

    private n w(int trackType, Uri[] playlistUrls, Format[] playlistFormats, Format muxedAudioFormat, List<Format> muxedCaptionFormats, Map<String, DrmInitData> overridingDrmInitData, long positionUs) {
        return new n(trackType, this, new d(this.f56007a, this.f56008b, playlistUrls, playlistFormats, this.f56009c, this.f56010d, this.f56016j, muxedCaptionFormats), overridingDrmInitData, this.f56014h, positionUs, muxedAudioFormat, this.f56011e, this.f56012f, this.f56013g);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004f  */
    private static Format x(Format variantFormat, Format mediaTagFormat, boolean isPrimaryTrackInVariant) {
        String strI;
        Metadata metadata;
        int i10;
        String str;
        Metadata metadata2;
        int i11;
        int i12;
        String str2;
        String str3;
        int i13;
        int i14;
        int i15;
        String str4;
        String str5;
        if (mediaTagFormat == null) {
            strI = androidx.media2.exoplayer.external.util.q0.I(variantFormat.f53098f, 1);
            metadata = variantFormat.f53099g;
            if (isPrimaryTrackInVariant) {
                i13 = variantFormat.Z;
                i14 = variantFormat.f53095c;
                i15 = variantFormat.f53096d;
                str4 = variantFormat.f53100g3;
                str5 = variantFormat.f53094b;
            } else {
                i10 = -1;
                str = strI;
                metadata2 = metadata;
                i11 = 0;
                i12 = 0;
                str2 = null;
                str3 = null;
            }
            return Format.p(variantFormat.f53093a, str2, variantFormat.f53101h, s.d(str), str, metadata2, isPrimaryTrackInVariant ? variantFormat.f53097e : -1, i10, -1, null, i11, i12, str3);
        }
        strI = mediaTagFormat.f53098f;
        metadata = mediaTagFormat.f53099g;
        i13 = mediaTagFormat.Z;
        i14 = mediaTagFormat.f53095c;
        i15 = mediaTagFormat.f53096d;
        str4 = mediaTagFormat.f53100g3;
        str5 = mediaTagFormat.f53094b;
        str2 = str5;
        str = strI;
        metadata2 = metadata;
        i10 = i13;
        i11 = i14;
        i12 = i15;
        str3 = str4;
        if (isPrimaryTrackInVariant) {
        }
        return Format.p(variantFormat.f53093a, str2, variantFormat.f53101h, s.d(str), str, metadata2, isPrimaryTrackInVariant ? variantFormat.f53097e : -1, i10, -1, null, i11, i12, str3);
    }

    private static Map<String, DrmInitData> y(List<DrmInitData> sessionKeyDrmInitData) {
        ArrayList arrayList = new ArrayList(sessionKeyDrmInitData);
        HashMap map = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            DrmInitData drmInitDataH = sessionKeyDrmInitData.get(i10);
            String str = drmInitDataH.f53813c;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i11);
                if (TextUtils.equals(drmInitData.f53813c, str)) {
                    drmInitDataH = drmInitDataH.h(drmInitData);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            map.put(str, drmInitDataH);
        }
        return map;
    }

    private static Format z(Format variantFormat) {
        String strI = androidx.media2.exoplayer.external.util.q0.I(variantFormat.f53098f, 2);
        return Format.G(variantFormat.f53093a, variantFormat.f53094b, variantFormat.f53101h, s.d(strI), strI, variantFormat.f53099g, variantFormat.f53097e, variantFormat.f53110n, variantFormat.f53111o, variantFormat.f53115s, null, variantFormat.f53095c, variantFormat.f53096d);
    }

    @Override // androidx.media2.exoplayer.external.source.w0.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void j(n sampleStreamWrapper) {
        this.f56020n.j(this);
    }

    public void B() {
        this.f56008b.f(this);
        for (n nVar : this.f56023t) {
            nVar.X();
        }
        this.f56020n = null;
        this.f56013g.A();
    }

    @Override // androidx.media2.exoplayer.external.source.hls.n.a
    public void a() {
        int i10 = this.f56021o - 1;
        this.f56021o = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (n nVar : this.f56023t) {
            i11 += nVar.m().f55657a;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i11];
        int i12 = 0;
        for (n nVar2 : this.f56023t) {
            int i13 = nVar2.m().f55657a;
            int i14 = 0;
            while (i14 < i13) {
                trackGroupArr[i12] = nVar2.m().a(i14);
                i14++;
                i12++;
            }
        }
        this.f56022s = new TrackGroupArray(trackGroupArr);
        this.f56020n.g(this);
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public long b() {
        return this.X.b();
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public void c(long positionUs) {
        this.X.c(positionUs);
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j.b
    public void d() {
        this.f56020n.j(this);
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public long e() {
        return this.X.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // androidx.media2.exoplayer.external.source.x
    public List<StreamKey> f(List<androidx.media2.exoplayer.external.trackselection.m> list) {
        int[] iArr;
        TrackGroupArray trackGroupArrayM;
        int iG;
        int i10;
        i iVar = this;
        androidx.media2.exoplayer.external.source.hls.playlist.e eVar = (androidx.media2.exoplayer.external.source.hls.playlist.e) androidx.media2.exoplayer.external.util.a.g(iVar.f56008b.c());
        boolean zIsEmpty = eVar.f56113e.isEmpty();
        boolean z10 = !zIsEmpty;
        int length = iVar.f56023t.length - eVar.f56116h.size();
        int i11 = 0;
        if (zIsEmpty) {
            iArr = new int[0];
            trackGroupArrayM = TrackGroupArray.f55656d;
            iG = 0;
        } else {
            n nVar = iVar.f56023t[0];
            iArr = iVar.f56025w[0];
            trackGroupArrayM = nVar.m();
            iG = nVar.G();
        }
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        for (androidx.media2.exoplayer.external.trackselection.m mVar : list) {
            TrackGroup trackGroupG = mVar.g();
            int iB = trackGroupArrayM.b(trackGroupG);
            if (iB == -1) {
                ?? r15 = z10;
                i10 = i11;
                while (true) {
                    n[] nVarArr = iVar.f56023t;
                    if (r15 >= nVarArr.length) {
                        break;
                    }
                    if (nVarArr[r15].m().b(trackGroupG) != -1) {
                        int i12 = r15 < length ? 1 : 2;
                        int[] iArr2 = iVar.f56025w[r15];
                        for (int i13 = i10; i13 < mVar.length(); i13++) {
                            arrayList.add(new StreamKey(i12, iArr2[mVar.b(i13)]));
                        }
                        break;
                    }
                    iVar = this;
                    r15++;
                }
            } else if (iB == iG) {
                for (int i14 = i11; i14 < mVar.length(); i14++) {
                    arrayList.add(new StreamKey(i11, iArr[mVar.b(i14)]));
                }
                i10 = i11;
                z12 = true;
            } else {
                i10 = i11;
                z11 = true;
            }
            iVar = this;
            i11 = i10;
        }
        int i15 = i11;
        if (z11 && !z12) {
            int i16 = iArr[i15];
            int i17 = eVar.f56113e.get(i16).f56127b.f53097e;
            for (int i18 = 1; i18 < iArr.length; i18++) {
                int i19 = eVar.f56113e.get(iArr[i18]).f56127b.f53097e;
                if (i19 < i17) {
                    i16 = iArr[i18];
                    i17 = i19;
                }
            }
            arrayList.add(new StreamKey(i15, i16));
        }
        return arrayList;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long h(long positionUs) {
        n[] nVarArr = this.f56024v;
        if (nVarArr.length > 0) {
            boolean zA0 = nVarArr[0].a0(positionUs, false);
            int i10 = 1;
            while (true) {
                n[] nVarArr2 = this.f56024v;
                if (i10 >= nVarArr2.length) {
                    break;
                }
                nVarArr2[i10].a0(positionUs, zA0);
                i10++;
            }
            if (zA0) {
                this.f56016j.b();
            }
        }
        return positionUs;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long i() {
        if (!this.Y) {
            this.f56013g.C();
            this.Y = true;
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public boolean k(long positionUs) {
        if (this.f56022s != null) {
            return this.X.k(positionUs);
        }
        for (n nVar : this.f56023t) {
            nVar.z();
        }
        return false;
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j.b
    public boolean l(Uri url, long blacklistDurationMs) {
        boolean zT = true;
        for (n nVar : this.f56023t) {
            zT &= nVar.T(url, blacklistDurationMs);
        }
        this.f56020n.j(this);
        return zT;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public TrackGroupArray m() {
        return this.f56022s;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long n(long positionUs, x0 seekParameters) {
        return positionUs;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void o() throws IOException {
        for (n nVar : this.f56023t) {
            nVar.o();
        }
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void p(long positionUs, boolean toKeyframe) {
        for (n nVar : this.f56024v) {
            nVar.p(positionUs, toKeyframe);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.hls.n.a
    public void q(Uri url) {
        this.f56008b.g(url);
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void r(x.a callback, long positionUs) {
        this.f56020n = callback;
        this.f56008b.a(this);
        v(positionUs);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    @Override // androidx.media2.exoplayer.external.source.x
    public long s(androidx.media2.exoplayer.external.trackselection.m[] selections, boolean[] mayRetainStreamFlags, v0[] streams, boolean[] streamResetFlags, long positionUs) {
        int[] iArr = new int[selections.length];
        int[] iArr2 = new int[selections.length];
        for (int i10 = 0; i10 < selections.length; i10++) {
            v0 v0Var = streams[i10];
            iArr[i10] = v0Var == null ? -1 : this.f56015i.get(v0Var).intValue();
            iArr2[i10] = -1;
            androidx.media2.exoplayer.external.trackselection.m mVar = selections[i10];
            if (mVar != null) {
                TrackGroup trackGroupG = mVar.g();
                int i11 = 0;
                while (true) {
                    n[] nVarArr = this.f56023t;
                    if (i11 >= nVarArr.length) {
                        break;
                    }
                    if (nVarArr[i11].m().b(trackGroupG) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f56015i.clear();
        int length = selections.length;
        v0[] v0VarArr = new v0[length];
        v0[] v0VarArr2 = new v0[selections.length];
        androidx.media2.exoplayer.external.trackselection.m[] mVarArr = new androidx.media2.exoplayer.external.trackselection.m[selections.length];
        n[] nVarArr2 = new n[this.f56023t.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i12 < this.f56023t.length) {
            for (int i14 = 0; i14 < selections.length; i14++) {
                androidx.media2.exoplayer.external.trackselection.m mVar2 = null;
                v0VarArr2[i14] = iArr[i14] == i12 ? streams[i14] : null;
                if (iArr2[i14] == i12) {
                    mVar2 = selections[i14];
                }
                mVarArr[i14] = mVar2;
            }
            n nVar = this.f56023t[i12];
            int[] iArr3 = iArr;
            int i15 = i12;
            int i16 = i13;
            boolean zB0 = nVar.b0(mVarArr, mayRetainStreamFlags, v0VarArr2, streamResetFlags, positionUs, z10);
            boolean z11 = false;
            for (int i17 = 0; i17 < selections.length; i17++) {
                if (iArr2[i17] == i15) {
                    androidx.media2.exoplayer.external.util.a.i(v0VarArr2[i17] != null);
                    v0VarArr[i17] = v0VarArr2[i17];
                    this.f56015i.put(v0VarArr2[i17], Integer.valueOf(i15));
                    z11 = true;
                } else if (iArr3[i17] == i15) {
                    androidx.media2.exoplayer.external.util.a.i(v0VarArr2[i17] == null);
                }
            }
            if (z11) {
                nVarArr2[i16] = nVar;
                i13 = i16 + 1;
                if (i16 == 0) {
                    nVar.c0(true);
                    if (zB0) {
                        this.f56016j.b();
                        z10 = true;
                    } else {
                        n[] nVarArr3 = this.f56024v;
                        if (nVarArr3.length == 0 || nVar != nVarArr3[0]) {
                            this.f56016j.b();
                            z10 = true;
                        }
                    }
                } else {
                    nVar.c0(false);
                }
            } else {
                i13 = i16;
            }
            i12 = i15 + 1;
            iArr = iArr3;
        }
        System.arraycopy(v0VarArr, 0, streams, 0, length);
        n[] nVarArr4 = (n[]) Arrays.copyOf(nVarArr2, i13);
        this.f56024v = nVarArr4;
        this.X = this.f56017k.a(nVarArr4);
        return positionUs;
    }
}
