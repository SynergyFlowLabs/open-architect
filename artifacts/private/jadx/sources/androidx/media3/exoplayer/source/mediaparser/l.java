package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.collection.g3;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.c0;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z;
import androidx.media3.common.w;
import androidx.media3.exoplayer.source.k0;
import androidx.media3.extractor.l0;
import androidx.media3.extractor.q0;
import androidx.media3.extractor.t;
import androidx.media3.extractor.u0;
import com.google.common.collect.l6;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@b1
@w0(30)
public final class l implements MediaParser$OutputConsumer {
    private static final String A = "chunk-index-long-us-times";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f65225u = "OConsumerAdapterV30";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f65227w = "track-type-string";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f65228x = "chunk-index-int-sizes";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f65229y = "chunk-index-long-offsets";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f65230z = "chunk-index-long-us-durations";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<u0> f65231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<w> f65232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<MediaCodec.CryptoInfo> f65233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<u0.a> f65234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f65235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f65236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f65237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private final w f65238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t f65239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private MediaParser.SeekMap f65240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private MediaParser.SeekMap f65241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private String f65242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private androidx.media3.extractor.g f65243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private androidx.media3.common.util.w0 f65244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<w> f65245o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f65246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f65247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f65248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f65249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f65250t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> f65226v = Pair.create(MediaParser.SeekPoint.START, MediaParser.SeekPoint.START);
    private static final Pattern B = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");

    private static final class b implements androidx.media3.common.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public MediaParser$InputReader f65251b;

        private b() {
        }

        @Override // androidx.media3.common.l, androidx.media3.datasource.g0
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            return m.a(k1.o(this.f65251b)).read(bArr, i10, i11);
        }
    }

    private static final class c implements androidx.media3.extractor.p0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final MediaParser.SeekMap f65252d;

        public c(MediaParser.SeekMap seekMap) {
            this.f65252d = seekMap;
        }

        private static q0 a(MediaParser.SeekPoint seekPoint) {
            return new q0(seekPoint.timeMicros, seekPoint.position);
        }

        @Override // androidx.media3.extractor.p0
        public long Q1() {
            long durationMicros = this.f65252d.getDurationMicros();
            if (durationMicros != g3.f12261h) {
                return durationMicros;
            }
            return -9223372036854775807L;
        }

        @Override // androidx.media3.extractor.p0
        public androidx.media3.extractor.p0.a R1(long j10) {
            Pair seekPoints = this.f65252d.getSeekPoints(j10);
            Object obj = seekPoints.first;
            return obj == seekPoints.second ? new androidx.media3.extractor.p0.a(a(k0.a(obj))) : new androidx.media3.extractor.p0.a(a(k0.a(obj)), a(k0.a(seekPoints.second)));
        }

        @Override // androidx.media3.extractor.p0
        public boolean S1() {
            return this.f65252d.isSeekable();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l() {
        this(null, -2, false);
        int i10 = 3 ^ 0;
    }

    private void b(int i10) {
        for (int size = this.f65231a.size(); size <= i10; size++) {
            this.f65231a.add(null);
            this.f65232b.add(null);
            this.f65233c.add(null);
            this.f65234d.add(null);
        }
    }

    private static int e(MediaFormat mediaFormat, String str, int i10) {
        if (mediaFormat.getInteger(str, 0) != 0) {
            return i10;
        }
        return 0;
    }

    private static List<byte[]> f(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("csd-");
            int i11 = i10 + 1;
            sb2.append(i10);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb2.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(c0.c(byteBuffer));
            i10 = i11;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static String g(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2063506020:
                if (str.equals("android.media.mediaparser.Mp4Parser")) {
                    b10 = 0;
                }
                break;
            case -1870824006:
                if (str.equals("android.media.mediaparser.OggParser")) {
                    b10 = 1;
                }
                break;
            case -1566427438:
                if (str.equals("android.media.mediaparser.TsParser")) {
                    b10 = 2;
                }
                break;
            case -900207883:
                if (str.equals("android.media.mediaparser.AdtsParser")) {
                    b10 = 3;
                }
                break;
            case -589864617:
                if (str.equals("android.media.mediaparser.WavParser")) {
                    b10 = 4;
                }
                break;
            case 52265814:
                if (str.equals("android.media.mediaparser.PsParser")) {
                    b10 = 5;
                }
                break;
            case 116768877:
                if (str.equals("android.media.mediaparser.FragmentedMp4Parser")) {
                    b10 = 6;
                }
                break;
            case 376876796:
                if (str.equals("android.media.mediaparser.Ac3Parser")) {
                    b10 = 7;
                }
                break;
            case 703268017:
                if (str.equals("android.media.mediaparser.AmrParser")) {
                    b10 = 8;
                }
                break;
            case 768643067:
                if (str.equals("android.media.mediaparser.FlacParser")) {
                    b10 = 9;
                }
                break;
            case 965962719:
                if (str.equals("android.media.mediaparser.MatroskaParser")) {
                    b10 = 10;
                }
                break;
            case 1264380477:
                if (str.equals("android.media.mediaparser.Ac4Parser")) {
                    b10 = 11;
                }
                break;
            case 1343957595:
                if (str.equals("android.media.mediaparser.Mp3Parser")) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 2063134683:
                if (str.equals("android.media.mediaparser.FlvParser")) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 6:
                return "video/mp4";
            case 1:
                return s0.f61318j0;
            case 2:
                return s0.f61329p;
            case 3:
                return "audio/mp4a-latm";
            case 4:
                return "audio/raw";
            case 5:
                return s0.f61335s;
            case 7:
                return "audio/ac3";
            case 8:
                return s0.f61302d0;
            case 9:
                return "audio/flac";
            case 10:
                return "video/webm";
            case 11:
                return "audio/ac4";
            case 12:
                return "audio/mpeg";
            case 13:
                return s0.f61343w;
            default:
                throw new IllegalArgumentException("Illegal parser name: " + str);
        }
    }

    private static int j(MediaFormat mediaFormat) {
        return e(mediaFormat, "is-forced-subtitle", 2) | e(mediaFormat, "is-autoselect", 4) | e(mediaFormat, "is-default", 1);
    }

    private void k() {
        if (!this.f65248r || this.f65249s) {
            return;
        }
        int size = this.f65231a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f65231a.get(i10) == null) {
                return;
            }
        }
        this.f65239i.l();
        this.f65249s = true;
    }

    private boolean l(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(f65228x);
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        LongBuffer longBufferAsLongBuffer = ((ByteBuffer) androidx.media3.common.util.a.g(mediaFormat.getByteBuffer(f65229y))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer2 = ((ByteBuffer) androidx.media3.common.util.a.g(mediaFormat.getByteBuffer(f65230z))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer3 = ((ByteBuffer) androidx.media3.common.util.a.g(mediaFormat.getByteBuffer(A))).asLongBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        long[] jArr = new long[longBufferAsLongBuffer.remaining()];
        long[] jArr2 = new long[longBufferAsLongBuffer2.remaining()];
        long[] jArr3 = new long[longBufferAsLongBuffer3.remaining()];
        intBufferAsIntBuffer.get(iArr);
        longBufferAsLongBuffer.get(jArr);
        longBufferAsLongBuffer2.get(jArr2);
        longBufferAsLongBuffer3.get(jArr3);
        androidx.media3.extractor.g gVar = new androidx.media3.extractor.g(iArr, jArr, jArr2, jArr3);
        this.f65243m = gVar;
        this.f65239i.u(gVar);
        return true;
    }

    @p0
    private u0.a r(int i10, @p0 MediaCodec.CryptoInfo cryptoInfo) {
        int i11;
        int i12;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.f65233c.get(i10) == cryptoInfo) {
            return (u0.a) androidx.media3.common.util.a.g(this.f65234d.get(i10));
        }
        try {
            Matcher matcher = B.matcher(cryptoInfo.toString());
            matcher.find();
            i11 = Integer.parseInt((String) k1.o(matcher.group(1)));
            i12 = Integer.parseInt((String) k1.o(matcher.group(2)));
        } catch (RuntimeException e10) {
            z.e(f65225u, "Unexpected error while parsing CryptoInfo: " + cryptoInfo, e10);
            i11 = 0;
            i12 = 0;
        }
        u0.a aVar = new u0.a(cryptoInfo.mode, cryptoInfo.key, i11, i12);
        this.f65233c.set(i10, cryptoInfo);
        this.f65234d.set(i10, aVar);
        return aVar;
    }

    @p0
    private static DrmInitData s(@p0 String str, @p0 android.media.DrmInitData drmInitData) {
        if (drmInitData == null) {
            return null;
        }
        int schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[schemeInitDataCount];
        for (int i10 = 0; i10 < schemeInitDataCount; i10++) {
            android.media.DrmInitData.SchemeInitData schemeInitDataAt = drmInitData.getSchemeInitDataAt(i10);
            schemeDataArr[i10] = new DrmInitData.SchemeData(schemeInitDataAt.uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new DrmInitData(str, schemeDataArr);
    }

    private w t(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        w.b bVarO = new w.b().Y(s(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData)).U(this.f65242l).p0(mediaFormat.getInteger("bitrate", -1)).R(mediaFormat.getInteger("channel-count", -1)).T(c0.e(mediaFormat)).u0(string).S(mediaFormat.getString("codecs-string")).b0(mediaFormat.getFloat("frame-rate", -1.0f)).B0(mediaFormat.getInteger("width", -1)).d0(mediaFormat.getInteger("height", -1)).g0(f(mediaFormat)).j0(mediaFormat.getString("language")).k0(mediaFormat.getInteger("max-input-size", -1)).o0(mediaFormat.getInteger("exo-pcm-encoding", -1)).t0(mediaFormat.getInteger("rotation-degrees", 0)).v0(mediaFormat.getInteger("sample-rate", -1)).w0(j(mediaFormat)).Z(mediaFormat.getInteger("encoder-delay", 0)).a0(mediaFormat.getInteger("encoder-padding", 0)).q0(mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f)).y0(mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE)).O(integer);
        for (int i10 = 0; i10 < this.f65245o.size(); i10++) {
            w wVar = this.f65245o.get(i10);
            if (Objects.equals(wVar.f61761o, string) && wVar.J == integer) {
                bVarO.j0(wVar.f61750d).s0(wVar.f61752f).w0(wVar.f61751e).h0(wVar.f61748b).i0(wVar.f61749c).n0(wVar.f61758l);
                break;
            }
        }
        return bVarO.N();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    private static int u(@p0 String str) {
        if (str == null) {
            return -1;
        }
        switch (str) {
            case "metadata":
                return 5;
            case "unknown":
                return -1;
            case "text":
                return 3;
            case "audio":
                return 1;
            case "video":
                return 2;
            default:
                return s0.m(str);
        }
    }

    public void a() {
        this.f65250t = true;
    }

    @p0
    public androidx.media3.extractor.g c() {
        return this.f65243m;
    }

    @p0
    public MediaParser.SeekMap d() {
        return this.f65240j;
    }

    @p0
    public w[] h() {
        if (!this.f65248r) {
            return null;
        }
        w[] wVarArr = new w[this.f65232b.size()];
        for (int i10 = 0; i10 < this.f65232b.size(); i10++) {
            wVarArr[i10] = (w) androidx.media3.common.util.a.g(this.f65232b.get(i10));
        }
        return wVarArr;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> i(long j10) {
        MediaParser.SeekMap seekMap = this.f65241k;
        return seekMap != null ? seekMap.getSeekPoints(j10) : f65226v;
    }

    public void m(t tVar) {
        this.f65239i = tVar;
    }

    public void n(List<w> list) {
        this.f65245o = list;
    }

    public void o(long j10) {
        this.f65247q = j10;
    }

    public void onSampleCompleted(int i10, long j10, int i11, int i12, int i13, @p0 MediaCodec.CryptoInfo cryptoInfo) {
        long j11 = this.f65247q;
        if (j11 == -9223372036854775807L || j10 < j11) {
            androidx.media3.common.util.w0 w0Var = this.f65244n;
            if (w0Var != null) {
                j10 = w0Var.a(j10);
            }
            ((u0) androidx.media3.common.util.a.g(this.f65231a.get(i10))).g(j10, i11, i12, i13, r(i10, cryptoInfo));
        }
    }

    public void onSampleDataFound(int i10, MediaParser$InputReader mediaParser$InputReader) throws IOException {
        b(i10);
        this.f65235e.f65251b = mediaParser$InputReader;
        u0 u0VarA = this.f65231a.get(i10);
        if (u0VarA == null) {
            u0VarA = this.f65239i.a(i10, -1);
            this.f65231a.set(i10, u0VarA);
        }
        u0VarA.f(this.f65235e, (int) mediaParser$InputReader.getLength(), true);
    }

    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        androidx.media3.extractor.p0 cVar;
        if (this.f65236f && this.f65240j == null) {
            this.f65240j = seekMap;
            return;
        }
        this.f65241k = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        t tVar = this.f65239i;
        if (this.f65250t) {
            if (durationMicros == g3.f12261h) {
                durationMicros = -9223372036854775807L;
            }
            cVar = new androidx.media3.extractor.p0.b(durationMicros);
        } else {
            cVar = new c(seekMap);
        }
        tVar.u(cVar);
    }

    public void onTrackCountFound(int i10) {
        this.f65248r = true;
        k();
    }

    public void onTrackDataFound(int i10, MediaParser.TrackData trackData) {
        if (!l(trackData.mediaFormat)) {
            b(i10);
            u0 u0Var = this.f65231a.get(i10);
            if (u0Var == null) {
                String string = trackData.mediaFormat.getString(f65227w);
                int iU = u(string != null ? string : trackData.mediaFormat.getString("mime"));
                if (iU == this.f65237g) {
                    this.f65246p = i10;
                }
                u0 u0VarA = this.f65239i.a(i10, iU);
                this.f65231a.set(i10, u0VarA);
                if (string == null) {
                    u0Var = u0VarA;
                }
            }
            w wVarT = t(trackData);
            w wVar = this.f65238h;
            u0Var.e((wVar == null || i10 != this.f65246p) ? wVarT : wVarT.m(wVar));
            this.f65232b.set(i10, wVarT);
            k();
        }
    }

    public void p(String str) {
        this.f65242l = g(str);
    }

    public void q(androidx.media3.common.util.w0 w0Var) {
        this.f65244n = w0Var;
    }

    public l(@p0 w wVar, int i10, boolean z10) {
        this.f65236f = z10;
        this.f65238h = wVar;
        this.f65237g = i10;
        this.f65231a = new ArrayList<>();
        this.f65232b = new ArrayList<>();
        this.f65233c = new ArrayList<>();
        this.f65234d = new ArrayList<>();
        this.f65235e = new b();
        this.f65239i = new l0();
        this.f65247q = -9223372036854775807L;
        this.f65245o = l6.F();
    }
}
