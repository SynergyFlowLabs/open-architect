package androidx.media3.exoplayer;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaDataSource;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.PersistableBundle;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import com.google.common.collect.l6;
import com.google.common.collect.x7;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class y3 {
    private static final String A = "MediaExtractorCompat";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f66756w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f66757x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f66758y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f66759z = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.extractor.w f66760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.p.a f66761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.extractor.n0 f66762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f66763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList<d> f66764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray<c> f66765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f66766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p3 f66767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media3.decoder.g f66768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.decoder.g f66769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set<Integer> f66770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f66771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f66772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.extractor.r f66773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.extractor.s f66774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.datasource.p f66775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.extractor.q0 f66776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.extractor.p0 f66777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f66778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f66779t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.p0
    private Map<String, String> f66780u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.p0
    private LogSessionId f66781v;

    private final class b implements androidx.media3.extractor.t {
        private b() {
        }

        @Override // androidx.media3.extractor.t
        public androidx.media3.extractor.u0 a(int i10, int i11) {
            c cVar = (c) y3.this.f66765f.get(i10);
            if (cVar != null) {
                return cVar;
            }
            if (y3.this.f66778s) {
                return new androidx.media3.extractor.m();
            }
            y3 y3Var = y3.this;
            c cVar2 = y3Var.new c(y3Var.f66763d, i10);
            y3.this.f66765f.put(i10, cVar2);
            return cVar2;
        }

        @Override // androidx.media3.extractor.t
        public void l() {
            y3.this.f66778s = true;
        }

        @Override // androidx.media3.extractor.t
        public void u(androidx.media3.extractor.p0 p0Var) {
            y3.this.f66777r = p0Var;
        }
    }

    private final class c extends androidx.media3.exoplayer.source.r1 {
        public final int M;
        public long N;
        private int O;
        private int P;

        public c(androidx.media3.exoplayer.upstream.b bVar, int i10) {
            super(bVar, null, null);
            this.M = i10;
            this.N = -9223372036854775807L;
            this.O = -1;
            this.P = -1;
        }

        private void k0(long j10, int i10) {
            int i11 = ((1073741824 & i10) != 0 ? 2 : 0) | ((i10 & 1) != 0 ? 1 : 0);
            if (this.P != -1) {
                y3.this.f66766g.a(j10, i11, this.P);
            }
            y3.this.f66766g.a(j10, i11, this.O);
        }

        @Override // androidx.media3.exoplayer.source.r1
        public androidx.media3.common.w A(androidx.media3.common.w wVar) {
            if (J() == null) {
                y3.this.A(this, wVar);
            }
            return super.A(wVar);
        }

        @Override // androidx.media3.extractor.u0
        public void c(long j10) {
            this.N = j10;
            super.c(j10);
        }

        @Override // androidx.media3.exoplayer.source.r1, androidx.media3.extractor.u0
        public void g(long j10, int i10, int i11, int i12, @androidx.annotation.p0 androidx.media3.extractor.u0.a aVar) {
            int i13 = i10 & (-536870913);
            androidx.media3.common.util.a.i(this.O != -1);
            int iK = K();
            super.g(j10, i13, i11, i12, aVar);
            if (K() == iK + 1) {
                k0(j10, i13);
            }
        }

        public void l0(int i10) {
            this.P = i10;
        }

        public void m0(int i10) {
            this.O = i10;
        }

        public String toString() {
            return String.format("trackId: %s, mainTrackIndex: %s, compatibilityTrackIndex: %s", Integer.valueOf(this.M), Integer.valueOf(this.O), Integer.valueOf(this.P));
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f66783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f66784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f66785c;

        /* JADX INFO: Access modifiers changed from: private */
        public androidx.media3.common.w d(p3 p3Var, androidx.media3.decoder.g gVar) {
            p3Var.a();
            this.f66783a.V(p3Var, gVar, 2, false);
            androidx.media3.common.w wVar = (androidx.media3.common.w) androidx.media3.common.util.a.g(p3Var.f64600b);
            p3Var.a();
            return wVar;
        }

        public MediaFormat b(p3 p3Var, androidx.media3.decoder.g gVar) {
            MediaFormat mediaFormatB = androidx.media3.common.util.c0.b(d(p3Var, gVar));
            mediaFormatB.setInteger("track-id", e());
            if (this.f66785c != null) {
                if (androidx.media3.common.util.k1.f61540a >= 29) {
                    mediaFormatB.removeKey("codecs-string");
                }
                mediaFormatB.setString("mime", this.f66785c);
            }
            return mediaFormatB;
        }

        public void c() {
            this.f66783a.h0(1);
            this.f66783a.u();
        }

        public int e() {
            return this.f66783a.M;
        }

        public String toString() {
            return String.format("MediaExtractorSampleQueue: %s, isCompatibilityTrack: %s, compatibilityTrackMimeType: %s", this.f66783a, Boolean.valueOf(this.f66784b), this.f66785c);
        }

        private d(c cVar, boolean z10, @androidx.annotation.p0 String str) {
            this.f66783a = cVar;
            this.f66784b = z10;
            this.f66785c = str;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque<a> f66786a = new ArrayDeque<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayDeque<a> f66787b = new ArrayDeque<>();

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f66788a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f66789b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f66790c;

            public a(long j10, int i10, int i11) {
                a(j10, i10, i11);
            }

            public void a(long j10, int i10, int i11) {
                this.f66789b = j10;
                this.f66788a = i10;
                this.f66790c = i11;
            }
        }

        private a d(long j10, int i10, int i11) {
            a aVar = this.f66786a.isEmpty() ? new a(j10, i10, i11) : this.f66786a.pop();
            aVar.a(j10, i10, i11);
            return aVar;
        }

        public void a(long j10, int i10, int i11) {
            this.f66787b.addLast(d(j10, i10, i11));
        }

        public void b() {
            Iterator<a> it = this.f66787b.iterator();
            while (it.hasNext()) {
                this.f66786a.push(it.next());
            }
            this.f66787b.clear();
        }

        public boolean c() {
            return this.f66787b.isEmpty();
        }

        @androidx.annotation.p0
        public a e() {
            return this.f66787b.peekFirst();
        }

        public a f() {
            a aVarRemoveFirst = this.f66787b.removeFirst();
            this.f66786a.push(aVarRemoveFirst);
            return aVarRemoveFirst;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    public y3(Context context) {
        this(new androidx.media3.extractor.l(), new androidx.media3.datasource.y.a(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void A(c cVar, androidx.media3.common.w wVar) {
        boolean z10 = true;
        this.f66779t++;
        cVar.m0(this.f66764e.size());
        Object[] objArr = 0;
        this.f66764e.add(new d(cVar, false, null));
        String strI = androidx.media3.exoplayer.mediacodec.f0.i(wVar);
        if (strI != null) {
            cVar.l0(this.f66764e.size());
            this.f66764e.add(new d(cVar, z10, strI));
        }
    }

    private void B(androidx.media3.decoder.g gVar) {
        c cVar = this.f66764e.get(((e.a) androidx.media3.common.util.a.g(this.f66766g.e())).f66790c).f66783a;
        boolean z10 = true;
        int iV = cVar.V(this.f66767h, gVar, 1, false);
        if (iV == -5) {
            iV = cVar.V(this.f66767h, gVar, 1, false);
        }
        this.f66767h.a();
        if (iV != -4) {
            z10 = false;
        }
        androidx.media3.common.util.a.i(z10);
    }

    private void C(MediaCodec.CryptoInfo cryptoInfo) {
        MediaCodec.CryptoInfo cryptoInfoA = ((androidx.media3.decoder.d) androidx.media3.common.util.a.g(this.f66769j.f62699c)).a();
        cryptoInfo.numSubSamples = cryptoInfoA.numSubSamples;
        cryptoInfo.numBytesOfClearData = cryptoInfoA.numBytesOfClearData;
        cryptoInfo.numBytesOfEncryptedData = cryptoInfoA.numBytesOfEncryptedData;
        cryptoInfo.key = cryptoInfoA.key;
        cryptoInfo.iv = cryptoInfoA.iv;
        cryptoInfo.mode = cryptoInfoA.mode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void D(androidx.media3.datasource.p pVar, androidx.media3.datasource.x xVar) throws IOException {
        int iF;
        androidx.media3.common.util.a.i(!this.f66771l);
        this.f66771l = true;
        this.f66772m = xVar.f62600g;
        this.f66775p = pVar;
        androidx.media3.extractor.s iVar = new androidx.media3.extractor.i(this.f66775p, 0L, pVar.c(xVar));
        androidx.media3.extractor.r rVarI = I(iVar);
        Throwable e10 = null;
        rVarI.h(new b());
        boolean z10 = true;
        while (z10) {
            try {
                iF = rVarI.f(iVar, this.f66762c);
            } catch (Exception | OutOfMemoryError e11) {
                e10 = e11;
                iF = -1;
            }
            boolean z11 = !this.f66778s || this.f66779t < this.f66765f.size() || this.f66777r == null;
            if (e10 == null && (!z11 || iF != -1)) {
                if (iF == 1) {
                    iVar = G(this.f66762c.f68159a);
                }
                z10 = z11;
            }
            F();
            throw androidx.media3.common.v0.a(e10 != null ? "Exception encountered while parsing input media." : "Reached end of input before preparation completed.", e10);
        }
        this.f66774o = iVar;
        this.f66773n = rVarI;
    }

    private androidx.media3.extractor.s G(long j10) throws IOException {
        androidx.media3.datasource.p pVar = (androidx.media3.datasource.p) androidx.media3.common.util.a.g(this.f66775p);
        Uri uri = (Uri) androidx.media3.common.util.a.g(pVar.getUri());
        androidx.media3.datasource.w.a(pVar);
        long jC = pVar.c(k(uri, this.f66772m + j10));
        if (jC != -1) {
            jC += j10;
        }
        return new androidx.media3.extractor.i(pVar, j10, jC);
    }

    private androidx.media3.extractor.r I(androidx.media3.extractor.s sVar) throws IOException {
        androidx.media3.extractor.r rVar;
        androidx.media3.extractor.r[] rVarArrC = this.f66760a.c();
        int length = rVarArrC.length;
        int i10 = 0;
        int i11 = 3 << 0;
        while (true) {
            if (i10 >= length) {
                rVar = null;
                break;
            }
            rVar = rVarArrC[i10];
            try {
                if (rVar.g(sVar)) {
                    sVar.l();
                    break;
                }
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                sVar.l();
                throw th2;
            }
            sVar.l();
            i10++;
        }
        if (rVar != null) {
            return rVar;
        }
        throw new androidx.media3.exoplayer.source.i2("None of the available extractors (" + com.google.common.base.a0.p(", ").k(x7.D(l6.B(rVarArrC), new com.google.common.base.t() { // from class: androidx.media3.exoplayer.x3
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return ((androidx.media3.extractor.r) obj).b().getClass().getSimpleName();
            }
        })) + ") could read the stream.", (Uri) androidx.media3.common.util.a.g(((androidx.media3.datasource.p) androidx.media3.common.util.a.g(this.f66775p)).getUri()), l6.F());
    }

    private void T() {
        d dVar = this.f66764e.get(this.f66766g.f().f66790c);
        if (dVar.f66784b) {
            return;
        }
        dVar.c();
    }

    @il.e(expression = {"sampleMetadataQueue.peekFirst()"}, result = true)
    private boolean j() {
        try {
            z();
            boolean z10 = false;
            while (true) {
                if (this.f66766g.c()) {
                    if (z10) {
                        return false;
                    }
                    try {
                        int iF = ((androidx.media3.extractor.r) androidx.media3.common.util.a.g(this.f66773n)).f((androidx.media3.extractor.s) androidx.media3.common.util.a.g(this.f66774o), this.f66762c);
                        if (iF == -1) {
                            z10 = true;
                        } else if (iF == 1) {
                            this.f66774o = G(this.f66762c.f68159a);
                        }
                    } catch (Exception | OutOfMemoryError e10) {
                        androidx.media3.common.util.z.o(A, "Treating exception as the end of input.", e10);
                    }
                } else {
                    if (this.f66770k.contains(Integer.valueOf(((e.a) androidx.media3.common.util.a.g(this.f66766g.e())).f66790c))) {
                        return true;
                    }
                    T();
                }
            }
        } catch (IOException e11) {
            androidx.media3.common.util.z.o(A, "Treating exception as the end of input.", e11);
            return false;
        }
    }

    private androidx.media3.datasource.x k(Uri uri, long j10) {
        androidx.media3.datasource.x.b bVarC = new androidx.media3.datasource.x.b().j(uri).i(j10).c(6);
        Map<String, String> map = this.f66780u;
        if (map != null) {
            bVarC.f(map);
        }
        return bVarC.a();
    }

    private void z() throws IOException {
        androidx.media3.extractor.q0 q0Var = this.f66776q;
        if (q0Var == null) {
            return;
        }
        androidx.media3.extractor.q0 q0Var2 = (androidx.media3.extractor.q0) androidx.media3.common.util.a.g(q0Var);
        ((androidx.media3.extractor.r) androidx.media3.common.util.a.g(this.f66773n)).a(q0Var2.f68290b, q0Var2.f68289a);
        this.f66774o = G(q0Var2.f68290b);
        this.f66776q = null;
    }

    public int E(ByteBuffer byteBuffer, int i10) {
        if (!j()) {
            return -1;
        }
        byteBuffer.position(i10);
        byteBuffer.limit(byteBuffer.capacity());
        androidx.media3.decoder.g gVar = this.f66768i;
        gVar.f62700d = byteBuffer;
        B(gVar);
        byteBuffer.flip();
        byteBuffer.position(i10);
        this.f66768i.f62700d = null;
        return byteBuffer.remaining();
    }

    public void F() {
        for (int i10 = 0; i10 < this.f66765f.size(); i10++) {
            this.f66765f.valueAt(i10).W();
        }
        this.f66765f.clear();
        androidx.media3.extractor.r rVar = this.f66773n;
        if (rVar != null) {
            rVar.release();
            this.f66773n = null;
        }
        this.f66774o = null;
        this.f66776q = null;
        androidx.media3.datasource.w.a(this.f66775p);
        this.f66775p = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    public void H(long j10, int i10) {
        androidx.media3.extractor.p0.a aVarR1;
        androidx.media3.extractor.q0 q0Var;
        if (this.f66777r == null) {
            return;
        }
        if (this.f66770k.size() == 1) {
            androidx.media3.extractor.r rVar = this.f66773n;
            if (rVar instanceof androidx.media3.extractor.mp4.p) {
                aVarR1 = ((androidx.media3.extractor.mp4.p) rVar).t(j10, this.f66764e.get(this.f66770k.iterator().next().intValue()).e());
            } else {
                aVarR1 = this.f66777r.R1(j10);
            }
        } else {
            aVarR1 = this.f66777r.R1(j10);
        }
        if (i10 == 0) {
            q0Var = aVarR1.f68280a;
        } else if (i10 == 1) {
            q0Var = aVarR1.f68281b;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            q0Var = Math.abs(j10 - aVarR1.f68281b.f68289a) < Math.abs(j10 - aVarR1.f68280a.f68289a) ? aVarR1.f68281b : aVarR1.f68280a;
        }
        this.f66766g.b();
        for (int i11 = 0; i11 < this.f66765f.size(); i11++) {
            this.f66765f.valueAt(i11).Y();
        }
        this.f66776q = q0Var;
    }

    public void J(int i10) {
        this.f66770k.add(Integer.valueOf(i10));
    }

    public void K(Context context, Uri uri, @androidx.annotation.p0 Map<String, String> map) throws IOException {
        String scheme = uri.getScheme();
        String path = uri.getPath();
        if ((scheme == null || scheme.equals(com.facebook.share.internal.k.f101891c)) && path != null) {
            Q(path);
            return;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                }
                R(uri.toString(), map);
                return;
            }
            try {
                L(assetFileDescriptorOpenAssetFileDescriptor);
                assetFileDescriptorOpenAssetFileDescriptor.close();
            } catch (Throwable th2) {
                try {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException | SecurityException unused) {
        }
    }

    public void L(AssetFileDescriptor assetFileDescriptor) throws IOException {
        if (assetFileDescriptor.getDeclaredLength() == -1) {
            O(assetFileDescriptor.getFileDescriptor());
        } else {
            P(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
        }
    }

    @androidx.annotation.w0(23)
    public void M(MediaDataSource mediaDataSource) throws IOException {
        D(new androidx.media3.datasource.h1(mediaDataSource, false), k(Uri.EMPTY, 0L));
    }

    public void N(Uri uri, long j10) throws IOException {
        D(this.f66761b.a(), k(uri, j10));
    }

    public void O(FileDescriptor fileDescriptor) throws IOException {
        P(fileDescriptor, 0L, -1L);
    }

    public void P(FileDescriptor fileDescriptor, long j10, long j11) throws IOException {
        D(new androidx.media3.datasource.e0(fileDescriptor, j10, j11), k(Uri.EMPTY, 0L));
    }

    public void Q(String str) throws IOException {
        R(str, null);
    }

    public void R(String str, @androidx.annotation.p0 Map<String, String> map) throws IOException {
        this.f66780u = map;
        D(this.f66761b.a(), k(Uri.parse(str), 0L));
    }

    @androidx.annotation.w0(31)
    public void S(LogSessionId logSessionId) {
        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            this.f66781v = logSessionId;
        }
    }

    public void U(int i10) {
        this.f66770k.remove(Integer.valueOf(i10));
    }

    public boolean i() {
        if (j()) {
            T();
            return j();
        }
        int i10 = 3 | 0;
        return false;
    }

    @androidx.annotation.l1(otherwise = 5)
    public androidx.media3.exoplayer.upstream.b l() {
        return this.f66763d;
    }

    public long m() {
        if (!j()) {
            return 0L;
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f66764e.size(); i10++) {
            c cVar = this.f66764e.get(i10).f66783a;
            jMax2 = Math.max(jMax2, cVar.E());
            jMax = Math.max(jMax, cVar.D());
        }
        androidx.media3.common.util.a.i(jMax != Long.MIN_VALUE);
        if (jMax2 == jMax) {
            return 0L;
        }
        return (jMax - (jMax2 != Long.MIN_VALUE ? jMax2 : 0L)) + 10000;
    }

    @androidx.annotation.p0
    public DrmInitData n() {
        for (int i10 = 0; i10 < this.f66764e.size(); i10++) {
            DrmInitData drmInitData = this.f66764e.get(i10).d(this.f66767h, this.f66768i).f61765s;
            if (drmInitData != null) {
                return drmInitData;
            }
        }
        return null;
    }

    @androidx.annotation.w0(31)
    public LogSessionId o() {
        LogSessionId logSessionId = this.f66781v;
        return logSessionId != null ? logSessionId : LogSessionId.LOG_SESSION_ID_NONE;
    }

    @androidx.annotation.w0(26)
    public PersistableBundle p() {
        String str;
        PersistableBundle persistableBundle = new PersistableBundle();
        androidx.media3.extractor.r rVar = this.f66773n;
        if (rVar != null) {
            persistableBundle.putString("android.media.mediaextractor.fmt", rVar.b().getClass().getSimpleName());
        }
        if (!this.f66764e.isEmpty() && (str = this.f66764e.get(0).d(this.f66767h, this.f66768i).f61760n) != null) {
            persistableBundle.putString("android.media.mediaextractor.mime", str);
        }
        persistableBundle.putInt("android.media.mediaextractor.ntrk", this.f66764e.size());
        return persistableBundle;
    }

    @androidx.annotation.p0
    public Map<UUID, byte[]> q() {
        androidx.media3.extractor.mp4.r.a aVarD;
        DrmInitData drmInitDataN = n();
        if (drmInitDataN == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < drmInitDataN.f60268d; i10++) {
            byte[] bArr = drmInitDataN.f(i10).f60273e;
            if (bArr != null && (aVarD = androidx.media3.extractor.mp4.r.d(bArr)) != null) {
                map.put(aVarD.f68069a, aVarD.f68071c);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public boolean r(MediaCodec.CryptoInfo cryptoInfo) {
        if (!j() || (this.f66766g.e().f66788a & 2) == 0) {
            return false;
        }
        B(this.f66769j);
        C(cryptoInfo);
        return true;
    }

    public int s() {
        if (j()) {
            return this.f66766g.e().f66788a;
        }
        return -1;
    }

    public long t() {
        if (!j()) {
            return -1L;
        }
        B(this.f66769j);
        ByteBuffer byteBuffer = (ByteBuffer) androidx.media3.common.util.a.g(this.f66769j.f62700d);
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    public long u() {
        if (j()) {
            return this.f66766g.e().f66789b;
        }
        return -1L;
    }

    public int v() {
        if (j()) {
            return this.f66766g.e().f66790c;
        }
        return -1;
    }

    public int w() {
        return this.f66764e.size();
    }

    public MediaFormat x(int i10) {
        d dVar = this.f66764e.get(i10);
        MediaFormat mediaFormatB = dVar.b(this.f66767h, this.f66768i);
        long j10 = dVar.f66783a.N;
        if (j10 != -9223372036854775807L) {
            mediaFormatB.setLong("durationUs", j10);
            return mediaFormatB;
        }
        androidx.media3.extractor.p0 p0Var = this.f66777r;
        if (p0Var != null && p0Var.Q1() != -9223372036854775807L) {
            mediaFormatB.setLong("durationUs", this.f66777r.Q1());
        }
        return mediaFormatB;
    }

    public boolean y() {
        return m() == 0;
    }

    public y3(androidx.media3.extractor.w wVar, androidx.media3.datasource.p.a aVar) {
        this.f66760a = wVar;
        this.f66761b = aVar;
        this.f66762c = new androidx.media3.extractor.n0();
        this.f66763d = new androidx.media3.exoplayer.upstream.i(true, 65536);
        this.f66764e = new ArrayList<>();
        this.f66765f = new SparseArray<>();
        this.f66766g = new e();
        this.f66767h = new p3();
        this.f66768i = androidx.media3.decoder.g.L();
        this.f66769j = new androidx.media3.decoder.g(2);
        this.f66770k = new HashSet();
    }
}
