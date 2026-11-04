package androidx.media2.exoplayer.external.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.metadata.icy.IcyHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
final class r0 implements x, androidx.media2.exoplayer.external.extractor.k, androidx.media2.exoplayer.external.upstream.g0.b<a>, androidx.media2.exoplayer.external.upstream.g0.f, u0.c {

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final long f56326s3 = 10000;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final Format f56327t3 = Format.w("icy", "application/x-icy", Long.MAX_VALUE);
    private boolean H1;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f56328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.l f56329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.drm.r<?> f56330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.f0 f56331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k0.a f56332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f56333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.b f56334g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f56335g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f56336h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f56337h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f56338i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private boolean f56339i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private int f56341j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b f56342k;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private long f56347m3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private boolean f56351o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f56352p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @androidx.annotation.p0
    private d f56353p1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private int f56355p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f56356q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private boolean f56357r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.p0
    private x.a f56358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.extractor.q f56359t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.p0
    private IcyHeaders f56360v;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.g0 f56340j = new androidx.media2.exoplayer.external.upstream.g0("Loader:ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.f f56344l = new androidx.media2.exoplayer.external.util.f();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f56346m = new Runnable(this) { // from class: androidx.media2.exoplayer.external.source.p0

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r0 f56313a;

        {
            this.f56313a = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56313a.D();
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f56348n = new Runnable(this) { // from class: androidx.media2.exoplayer.external.source.q0

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r0 f56324a;

        {
            this.f56324a = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56324a.M();
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Handler f56350o = new Handler();
    private f[] Y = new f[0];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private u0[] f56361w = new u0[0];
    private m[] X = new m[0];

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private long f56349n3 = -9223372036854775807L;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private long f56345l3 = -1;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private long f56343k3 = -9223372036854775807L;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f56354p2 = 1;

    final class a implements androidx.media2.exoplayer.external.upstream.g0.e, s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f56362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.upstream.o0 f56363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f56364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.extractor.k f56365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.util.f f56366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.extractor.p f56367f = new androidx.media2.exoplayer.external.extractor.p();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private volatile boolean f56368g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f56369h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f56370i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private androidx.media2.exoplayer.external.upstream.o f56371j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f56372k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media2.exoplayer.external.extractor.s f56373l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f56374m;

        public a(Uri uri, androidx.media2.exoplayer.external.upstream.l dataSource, b extractorHolder, androidx.media2.exoplayer.external.extractor.k extractorOutput, androidx.media2.exoplayer.external.util.f loadCondition) {
            this.f56362a = uri;
            this.f56363b = new androidx.media2.exoplayer.external.upstream.o0(dataSource);
            this.f56364c = extractorHolder;
            this.f56365d = extractorOutput;
            this.f56366e = loadCondition;
            boolean z10 = !false;
            this.f56369h = true;
            this.f56372k = -1L;
            this.f56371j = i(0L);
        }

        private androidx.media2.exoplayer.external.upstream.o i(long position) {
            return new androidx.media2.exoplayer.external.upstream.o(this.f56362a, position, -1L, r0.this.f56336h, 22);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long position, long timeUs) {
            this.f56367f.f54695a = position;
            this.f56370i = timeUs;
            this.f56369h = true;
            this.f56374m = false;
        }

        @Override // androidx.media2.exoplayer.external.upstream.g0.e
        public void a() throws Throwable {
            int iF = 0;
            while (iF == 0 && !this.f56368g) {
                androidx.media2.exoplayer.external.extractor.e eVar = null;
                try {
                    long position = this.f56367f.f54695a;
                    androidx.media2.exoplayer.external.upstream.o oVarI = i(position);
                    this.f56371j = oVarI;
                    long jB = this.f56363b.b(oVarI);
                    this.f56372k = jB;
                    if (jB != -1) {
                        this.f56372k = jB + position;
                    }
                    Uri uri = (Uri) androidx.media2.exoplayer.external.util.a.g(this.f56363b.getUri());
                    r0.this.f56360v = IcyHeaders.a(this.f56363b.a());
                    androidx.media2.exoplayer.external.upstream.l sVar = this.f56363b;
                    if (r0.this.f56360v != null && r0.this.f56360v.f55473f != -1) {
                        sVar = new s(this.f56363b, r0.this.f56360v.f55473f, this);
                        androidx.media2.exoplayer.external.extractor.s sVarJ = r0.this.J();
                        this.f56373l = sVarJ;
                        sVarJ.c(r0.f56327t3);
                    }
                    androidx.media2.exoplayer.external.extractor.e eVar2 = new androidx.media2.exoplayer.external.extractor.e(sVar, position, this.f56372k);
                    try {
                        androidx.media2.exoplayer.external.extractor.i iVarB = this.f56364c.b(eVar2, this.f56365d, uri);
                        if (this.f56369h) {
                            iVarB.a(position, this.f56370i);
                            this.f56369h = false;
                        }
                        while (iF == 0 && !this.f56368g) {
                            this.f56366e.a();
                            iF = iVarB.f(eVar2, this.f56367f);
                            if (eVar2.getPosition() > r0.this.f56338i + position) {
                                position = eVar2.getPosition();
                                this.f56366e.c();
                                r0.this.f56350o.post(r0.this.f56348n);
                            }
                        }
                        if (iF == 1) {
                            iF = 0;
                        } else {
                            this.f56367f.f54695a = eVar2.getPosition();
                        }
                        androidx.media2.exoplayer.external.util.q0.n(this.f56363b);
                    } catch (Throwable th2) {
                        th = th2;
                        eVar = eVar2;
                        if (iF != 1 && eVar != null) {
                            this.f56367f.f54695a = eVar.getPosition();
                        }
                        androidx.media2.exoplayer.external.util.q0.n(this.f56363b);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }

        @Override // androidx.media2.exoplayer.external.upstream.g0.e
        public void b() {
            this.f56368g = true;
        }

        @Override // androidx.media2.exoplayer.external.source.s.a
        public void c(androidx.media2.exoplayer.external.util.x metadata) {
            long jMax = !this.f56374m ? this.f56370i : Math.max(r0.this.H(), this.f56370i);
            int iA = metadata.a();
            androidx.media2.exoplayer.external.extractor.s sVar = (androidx.media2.exoplayer.external.extractor.s) androidx.media2.exoplayer.external.util.a.g(this.f56373l);
            sVar.d(metadata, iA);
            sVar.b(jMax, 1, iA, 0, null);
            this.f56374m = true;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.extractor.i[] f56376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media2.exoplayer.external.extractor.i f56377b;

        public b(androidx.media2.exoplayer.external.extractor.i[] extractors) {
            this.f56376a = extractors;
        }

        public void a() {
            androidx.media2.exoplayer.external.extractor.i iVar = this.f56377b;
            if (iVar != null) {
                iVar.release();
                this.f56377b = null;
            }
        }

        public androidx.media2.exoplayer.external.extractor.i b(androidx.media2.exoplayer.external.extractor.j input, androidx.media2.exoplayer.external.extractor.k output, Uri uri) throws InterruptedException, IOException {
            androidx.media2.exoplayer.external.extractor.i iVar = this.f56377b;
            if (iVar != null) {
                return iVar;
            }
            androidx.media2.exoplayer.external.extractor.i[] iVarArr = this.f56376a;
            if (iVarArr.length == 1) {
                this.f56377b = iVarArr[0];
            } else {
                for (androidx.media2.exoplayer.external.extractor.i iVar2 : iVarArr) {
                    try {
                        if (iVar2.b(input)) {
                            this.f56377b = iVar2;
                            input.l();
                            break;
                        }
                    } catch (EOFException unused) {
                    } catch (Throwable th2) {
                        input.l();
                        throw th2;
                    }
                    input.l();
                }
                if (this.f56377b == null) {
                    String strJ = androidx.media2.exoplayer.external.util.q0.J(this.f56376a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strJ).length() + 58);
                    sb2.append("None of the available extractors (");
                    sb2.append(strJ);
                    sb2.append(") could read the stream.");
                    throw new c1(sb2.toString(), uri);
                }
            }
            this.f56377b.c(output);
            return this.f56377b;
        }
    }

    interface c {
        void k(long durationUs, boolean isSeekable);
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media2.exoplayer.external.extractor.q f56378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TrackGroupArray f56379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f56380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f56381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean[] f56382e;

        public d(androidx.media2.exoplayer.external.extractor.q seekMap, TrackGroupArray tracks, boolean[] trackIsAudioVideoFlags) {
            this.f56378a = seekMap;
            this.f56379b = tracks;
            this.f56380c = trackIsAudioVideoFlags;
            int i10 = tracks.f55657a;
            this.f56381d = new boolean[i10];
            this.f56382e = new boolean[i10];
        }
    }

    private final class e implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f56383a;

        public e(int track) {
            this.f56383a = track;
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public void a() throws IOException {
            r0.this.R(this.f56383a);
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public boolean isReady() {
            return r0.this.L(this.f56383a);
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public int l(long positionUs) {
            return r0.this.Z(this.f56383a, positionUs);
        }

        @Override // androidx.media2.exoplayer.external.source.v0
        public int q(androidx.media2.exoplayer.external.d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean formatRequired) {
            return r0.this.W(this.f56383a, formatHolder, buffer, formatRequired);
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f56386b;

        public f(int id2, boolean isIcyTrack) {
            this.f56385a = id2;
            this.f56386b = isIcyTrack;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f56385a == fVar.f56385a && this.f56386b == fVar.f56386b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f56385a * 31) + (this.f56386b ? 1 : 0);
        }
    }

    public r0(Uri uri, androidx.media2.exoplayer.external.upstream.l dataSource, androidx.media2.exoplayer.external.extractor.i[] extractors, androidx.media2.exoplayer.external.drm.r<?> drmSessionManager, androidx.media2.exoplayer.external.upstream.f0 loadErrorHandlingPolicy, k0.a eventDispatcher, c listener, androidx.media2.exoplayer.external.upstream.b allocator, @androidx.annotation.p0 String customCacheKey, int continueLoadingCheckIntervalBytes) {
        this.f56328a = uri;
        this.f56329b = dataSource;
        this.f56330c = drmSessionManager;
        this.f56331d = loadErrorHandlingPolicy;
        this.f56332e = eventDispatcher;
        this.f56333f = listener;
        this.f56334g = allocator;
        this.f56336h = customCacheKey;
        this.f56338i = continueLoadingCheckIntervalBytes;
        this.f56342k = new b(extractors);
        eventDispatcher.z();
    }

    private boolean E(a loadable, int currentExtractedSampleCount) {
        androidx.media2.exoplayer.external.extractor.q qVar;
        if (this.f56345l3 == -1 && ((qVar = this.f56359t) == null || qVar.Q1() == -9223372036854775807L)) {
            if (this.f56352p0 && !b0()) {
                this.f56351o3 = true;
                return false;
            }
            this.f56337h3 = this.f56352p0;
            this.f56347m3 = 0L;
            this.f56355p3 = 0;
            for (u0 u0Var : this.f56361w) {
                u0Var.F();
            }
            loadable.j(0L, 0L);
            return true;
        }
        this.f56355p3 = currentExtractedSampleCount;
        return true;
    }

    private void F(a loadable) {
        if (this.f56345l3 == -1) {
            this.f56345l3 = loadable.f56372k;
        }
    }

    private int G() {
        int iT = 0;
        for (u0 u0Var : this.f56361w) {
            iT += u0Var.t();
        }
        return iT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long H() {
        long jMax = Long.MIN_VALUE;
        for (u0 u0Var : this.f56361w) {
            jMax = Math.max(jMax, u0Var.q());
        }
        return jMax;
    }

    private d I() {
        return (d) androidx.media2.exoplayer.external.util.a.g(this.f56353p1);
    }

    private boolean K() {
        return this.f56349n3 != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void D() {
        int i10;
        androidx.media2.exoplayer.external.extractor.q qVar = this.f56359t;
        if (!this.f56357r3 && !this.f56352p0 && this.Z && qVar != null) {
            for (u0 u0Var : this.f56361w) {
                if (u0Var.s() == null) {
                    return;
                }
            }
            this.f56344l.c();
            int length = this.f56361w.length;
            TrackGroup[] trackGroupArr = new TrackGroup[length];
            boolean[] zArr = new boolean[length];
            this.f56343k3 = qVar.Q1();
            for (int i11 = 0; i11 < length; i11++) {
                Format formatS = this.f56361w[i11].s();
                String str = formatS.f53103i;
                boolean zL = androidx.media2.exoplayer.external.util.s.l(str);
                boolean z10 = zL || androidx.media2.exoplayer.external.util.s.n(str);
                zArr[i11] = z10;
                this.H1 = z10 | this.H1;
                IcyHeaders icyHeaders = this.f56360v;
                if (icyHeaders != null) {
                    if (zL || this.Y[i11].f56386b) {
                        Metadata metadata = formatS.f53099g;
                        formatS = formatS.k(metadata == null ? new Metadata(icyHeaders) : metadata.a(icyHeaders));
                    }
                    if (zL && formatS.f53097e == -1 && (i10 = icyHeaders.f55468a) != -1) {
                        formatS = formatS.b(i10);
                    }
                }
                trackGroupArr[i11] = new TrackGroup(formatS);
            }
            this.f56354p2 = (this.f56345l3 == -1 && qVar.Q1() == -9223372036854775807L) ? 7 : 1;
            this.f56353p1 = new d(qVar, new TrackGroupArray(trackGroupArr), zArr);
            this.f56352p0 = true;
            this.f56333f.k(this.f56343k3, qVar.S1());
            ((x.a) androidx.media2.exoplayer.external.util.a.g(this.f56358s)).g(this);
        }
    }

    private void O(int track) {
        d dVarI = I();
        boolean[] zArr = dVarI.f56382e;
        if (zArr[track]) {
            return;
        }
        Format formatA = dVarI.f56379b.a(track).a(0);
        this.f56332e.c(androidx.media2.exoplayer.external.util.s.g(formatA.f53103i), formatA, 0, null, this.f56347m3);
        zArr[track] = true;
    }

    private void P(int track) {
        boolean[] zArr = I().f56380c;
        if (this.f56351o3 && zArr[track] && !this.f56361w[track].u()) {
            this.f56349n3 = 0L;
            this.f56351o3 = false;
            this.f56337h3 = true;
            this.f56347m3 = 0L;
            this.f56355p3 = 0;
            for (u0 u0Var : this.f56361w) {
                u0Var.F();
            }
            ((x.a) androidx.media2.exoplayer.external.util.a.g(this.f56358s)).j(this);
        }
    }

    private androidx.media2.exoplayer.external.extractor.s V(f id2) {
        int length = this.f56361w.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (id2.equals(this.Y[i10])) {
                return this.f56361w[i10];
            }
        }
        u0 u0Var = new u0(this.f56334g);
        u0Var.K(this);
        int i11 = length + 1;
        f[] fVarArr = (f[]) Arrays.copyOf(this.Y, i11);
        fVarArr[length] = id2;
        this.Y = (f[]) androidx.media2.exoplayer.external.util.q0.j(fVarArr);
        u0[] u0VarArr = (u0[]) Arrays.copyOf(this.f56361w, i11);
        u0VarArr[length] = u0Var;
        this.f56361w = (u0[]) androidx.media2.exoplayer.external.util.q0.j(u0VarArr);
        m[] mVarArr = (m[]) Arrays.copyOf(this.X, i11);
        mVarArr[length] = new m(this.f56361w[length], this.f56330c);
        this.X = (m[]) androidx.media2.exoplayer.external.util.q0.j(mVarArr);
        return u0Var;
    }

    private boolean Y(boolean[] trackIsAudioVideoFlags, long positionUs) {
        int length = this.f56361w.length;
        for (int i10 = 0; i10 < length; i10++) {
            u0 u0Var = this.f56361w[i10];
            u0Var.H();
            if (u0Var.f(positionUs, true, false) == -1 && (trackIsAudioVideoFlags[i10] || !this.H1)) {
                return false;
            }
        }
        return true;
    }

    private void a0() {
        a aVar = new a(this.f56328a, this.f56329b, this.f56342k, this, this.f56344l);
        if (this.f56352p0) {
            androidx.media2.exoplayer.external.extractor.q qVar = I().f56378a;
            androidx.media2.exoplayer.external.util.a.i(K());
            long j10 = this.f56343k3;
            if (j10 != -9223372036854775807L && this.f56349n3 > j10) {
                this.f56356q3 = true;
                this.f56349n3 = -9223372036854775807L;
                return;
            } else {
                aVar.j(qVar.R1(this.f56349n3).f54696a.f54702b, this.f56349n3);
                this.f56349n3 = -9223372036854775807L;
            }
        }
        this.f56355p3 = G();
        this.f56332e.x(aVar.f56371j, 1, -1, null, 0, null, aVar.f56370i, this.f56343k3, this.f56340j.l(aVar, this, this.f56331d.a(this.f56354p2)));
    }

    private boolean b0() {
        return this.f56337h3 || K();
    }

    androidx.media2.exoplayer.external.extractor.s J() {
        return V(new f(0, true));
    }

    boolean L(int track) {
        return !b0() && this.X[track].a(this.f56356q3);
    }

    final /* synthetic */ void M() {
        if (this.f56357r3) {
            return;
        }
        ((x.a) androidx.media2.exoplayer.external.util.a.g(this.f56358s)).j(this);
    }

    void Q() throws IOException {
        this.f56340j.b(this.f56331d.a(this.f56354p2));
    }

    void R(int sampleQueueIndex) throws IOException {
        this.X[sampleQueueIndex].b();
        Q();
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void u(a loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        this.f56332e.o(loadable.f56371j, loadable.f56363b.e(), loadable.f56363b.g(), 1, -1, null, 0, null, loadable.f56370i, this.f56343k3, elapsedRealtimeMs, loadDurationMs, loadable.f56363b.d());
        if (released) {
            return;
        }
        F(loadable);
        for (u0 u0Var : this.f56361w) {
            u0Var.F();
        }
        if (this.f56341j3 > 0) {
            ((x.a) androidx.media2.exoplayer.external.util.a.g(this.f56358s)).j(this);
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void t(a loadable, long elapsedRealtimeMs, long loadDurationMs) {
        androidx.media2.exoplayer.external.extractor.q qVar;
        if (this.f56343k3 == -9223372036854775807L && (qVar = this.f56359t) != null) {
            boolean zS1 = qVar.S1();
            long jH = H();
            long j10 = jH == Long.MIN_VALUE ? 0L : jH + 10000;
            this.f56343k3 = j10;
            this.f56333f.k(j10, zS1);
        }
        this.f56332e.r(loadable.f56371j, loadable.f56363b.e(), loadable.f56363b.g(), 1, -1, null, 0, null, loadable.f56370i, this.f56343k3, elapsedRealtimeMs, loadDurationMs, loadable.f56363b.d());
        F(loadable);
        this.f56356q3 = true;
        ((x.a) androidx.media2.exoplayer.external.util.a.g(this.f56358s)).j(this);
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public androidx.media2.exoplayer.external.upstream.g0.c d(a loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        a aVar;
        androidx.media2.exoplayer.external.upstream.g0.c cVarH;
        F(loadable);
        long jC = this.f56331d.c(this.f56354p2, loadDurationMs, error, errorCount);
        if (jC == -9223372036854775807L) {
            cVarH = androidx.media2.exoplayer.external.upstream.g0.f57298k;
            aVar = loadable;
        } else {
            int iG = G();
            aVar = loadable;
            cVarH = E(aVar, iG) ? androidx.media2.exoplayer.external.upstream.g0.h(iG > this.f56355p3, jC) : androidx.media2.exoplayer.external.upstream.g0.f57297j;
        }
        this.f56332e.u(aVar.f56371j, aVar.f56363b.e(), aVar.f56363b.g(), 1, -1, null, 0, null, aVar.f56370i, this.f56343k3, elapsedRealtimeMs, loadDurationMs, aVar.f56363b.d(), error, !cVarH.c());
        return cVarH;
    }

    int W(int sampleQueueIndex, androidx.media2.exoplayer.external.d0 formatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean formatRequired) {
        if (b0()) {
            return -3;
        }
        O(sampleQueueIndex);
        int iD = this.X[sampleQueueIndex].d(formatHolder, buffer, formatRequired, this.f56356q3, this.f56347m3);
        if (iD == -3) {
            P(sampleQueueIndex);
        }
        return iD;
    }

    public void X() {
        if (this.f56352p0) {
            for (u0 u0Var : this.f56361w) {
                u0Var.k();
            }
            for (m mVar : this.X) {
                mVar.e();
            }
        }
        this.f56340j.k(this);
        this.f56350o.removeCallbacksAndMessages(null);
        this.f56358s = null;
        this.f56357r3 = true;
        this.f56332e.A();
    }

    int Z(int track, long positionUs) {
        int iG = 0;
        if (b0()) {
            return 0;
        }
        O(track);
        u0 u0Var = this.f56361w[track];
        if (!this.f56356q3 || positionUs <= u0Var.q()) {
            int iF = u0Var.f(positionUs, true, true);
            if (iF != -1) {
                iG = iF;
            }
        } else {
            iG = u0Var.g();
        }
        if (iG == 0) {
            P(track);
        }
        return iG;
    }

    @Override // androidx.media2.exoplayer.external.extractor.k
    public androidx.media2.exoplayer.external.extractor.s a(int id2, int type) {
        return V(new f(id2, false));
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public long b() {
        long jH;
        boolean[] zArr = I().f56380c;
        if (this.f56356q3) {
            return Long.MIN_VALUE;
        }
        if (K()) {
            return this.f56349n3;
        }
        if (this.H1) {
            int length = this.f56361w.length;
            jH = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.f56361w[i10].v()) {
                    jH = Math.min(jH, this.f56361w[i10].q());
                }
            }
        } else {
            jH = Long.MAX_VALUE;
        }
        if (jH == Long.MAX_VALUE) {
            jH = H();
        }
        return jH == Long.MIN_VALUE ? this.f56347m3 : jH;
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public void c(long positionUs) {
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public long e() {
        if (this.f56341j3 == 0) {
            return Long.MIN_VALUE;
        }
        return b();
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public List f(List list) {
        return w.a(this, list);
    }

    @Override // androidx.media2.exoplayer.external.source.u0.c
    public void g(Format format) {
        this.f56350o.post(this.f56346m);
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long h(long positionUs) {
        d dVarI = I();
        androidx.media2.exoplayer.external.extractor.q qVar = dVarI.f56378a;
        boolean[] zArr = dVarI.f56380c;
        if (!qVar.S1()) {
            positionUs = 0;
        }
        this.f56337h3 = false;
        this.f56347m3 = positionUs;
        if (K()) {
            this.f56349n3 = positionUs;
            return positionUs;
        }
        if (this.f56354p2 == 7 || !Y(zArr, positionUs)) {
            this.f56351o3 = false;
            this.f56349n3 = positionUs;
            this.f56356q3 = false;
            if (this.f56340j.i()) {
                this.f56340j.g();
                return positionUs;
            }
            for (u0 u0Var : this.f56361w) {
                u0Var.F();
            }
        }
        return positionUs;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long i() {
        if (!this.f56339i3) {
            this.f56332e.C();
            this.f56339i3 = true;
        }
        if (!this.f56337h3 || (!this.f56356q3 && G() <= this.f56355p3)) {
            return -9223372036854775807L;
        }
        this.f56337h3 = false;
        return this.f56347m3;
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.f
    public void j() {
        for (u0 u0Var : this.f56361w) {
            u0Var.F();
        }
        for (m mVar : this.X) {
            mVar.e();
        }
        this.f56342k.a();
    }

    @Override // androidx.media2.exoplayer.external.source.x, androidx.media2.exoplayer.external.source.w0
    public boolean k(long playbackPositionUs) {
        if (!this.f56356q3 && !this.f56351o3 && (!this.f56352p0 || this.f56341j3 != 0)) {
            boolean zD = this.f56344l.d();
            if (this.f56340j.i()) {
                return zD;
            }
            a0();
            return true;
        }
        return false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.k
    public void l() {
        this.Z = true;
        this.f56350o.post(this.f56346m);
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public TrackGroupArray m() {
        return I().f56379b;
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long n(long positionUs, androidx.media2.exoplayer.external.x0 seekParameters) {
        androidx.media2.exoplayer.external.extractor.q qVar = I().f56378a;
        if (!qVar.S1()) {
            return 0L;
        }
        androidx.media2.exoplayer.external.extractor.q.a aVarR1 = qVar.R1(positionUs);
        return androidx.media2.exoplayer.external.util.q0.H0(positionUs, seekParameters, aVarR1.f54696a.f54701a, aVarR1.f54697b.f54701a);
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void o() throws IOException {
        Q();
        if (this.f56356q3 && !this.f56352p0) {
            throw new androidx.media2.exoplayer.external.k0("Loading finished before preparation is complete.");
        }
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void p(long positionUs, boolean toKeyframe) {
        if (K()) {
            return;
        }
        boolean[] zArr = I().f56381d;
        int length = this.f56361w.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f56361w[i10].j(positionUs, toKeyframe, zArr[i10]);
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.k
    public void q(androidx.media2.exoplayer.external.extractor.q seekMap) {
        if (this.f56360v != null) {
            seekMap = new androidx.media2.exoplayer.external.extractor.q.b(-9223372036854775807L);
        }
        this.f56359t = seekMap;
        this.f56350o.post(this.f56346m);
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public void r(x.a callback, long positionUs) {
        this.f56358s = callback;
        this.f56344l.d();
        a0();
    }

    @Override // androidx.media2.exoplayer.external.source.x
    public long s(androidx.media2.exoplayer.external.trackselection.m[] selections, boolean[] mayRetainStreamFlags, v0[] streams, boolean[] streamResetFlags, long positionUs) {
        androidx.media2.exoplayer.external.trackselection.m mVar;
        d dVarI = I();
        TrackGroupArray trackGroupArray = dVarI.f56379b;
        boolean[] zArr = dVarI.f56381d;
        int i10 = this.f56341j3;
        int i11 = 0;
        for (int i12 = 0; i12 < selections.length; i12++) {
            v0 v0Var = streams[i12];
            if (v0Var != null && (selections[i12] == null || !mayRetainStreamFlags[i12])) {
                int i13 = ((e) v0Var).f56383a;
                androidx.media2.exoplayer.external.util.a.i(zArr[i13]);
                this.f56341j3--;
                zArr[i13] = false;
                streams[i12] = null;
            }
        }
        boolean z10 = !this.f56335g3 ? positionUs == 0 : i10 != 0;
        for (int i14 = 0; i14 < selections.length; i14++) {
            if (streams[i14] == null && (mVar = selections[i14]) != null) {
                androidx.media2.exoplayer.external.util.a.i(mVar.length() == 1);
                androidx.media2.exoplayer.external.util.a.i(mVar.b(0) == 0);
                int iB = trackGroupArray.b(mVar.g());
                androidx.media2.exoplayer.external.util.a.i(!zArr[iB]);
                this.f56341j3++;
                zArr[iB] = true;
                streams[i14] = new e(iB);
                streamResetFlags[i14] = true;
                if (!z10) {
                    u0 u0Var = this.f56361w[iB];
                    u0Var.H();
                    z10 = u0Var.f(positionUs, true, true) == -1 && u0Var.r() != 0;
                }
            }
        }
        if (this.f56341j3 == 0) {
            this.f56351o3 = false;
            this.f56337h3 = false;
            if (this.f56340j.i()) {
                u0[] u0VarArr = this.f56361w;
                int length = u0VarArr.length;
                while (i11 < length) {
                    u0VarArr[i11].k();
                    i11++;
                }
                this.f56340j.g();
            } else {
                u0[] u0VarArr2 = this.f56361w;
                int length2 = u0VarArr2.length;
                while (i11 < length2) {
                    u0VarArr2[i11].F();
                    i11++;
                }
            }
        } else if (z10) {
            positionUs = h(positionUs);
            while (i11 < streams.length) {
                if (streams[i11] != null) {
                    streamResetFlags[i11] = true;
                }
                i11++;
            }
        }
        this.f56335g3 = true;
        return positionUs;
    }
}
