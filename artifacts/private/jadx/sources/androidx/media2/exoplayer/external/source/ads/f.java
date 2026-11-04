package androidx.media2.exoplayer.external.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.source.m0;
import androidx.media2.exoplayer.external.source.s0;
import androidx.media2.exoplayer.external.source.u;
import androidx.media2.exoplayer.external.source.x;
import androidx.media2.exoplayer.external.source.z;
import androidx.media2.exoplayer.external.upstream.l;
import androidx.media2.exoplayer.external.upstream.o;
import androidx.media2.exoplayer.external.upstream.q0;
import androidx.media2.exoplayer.external.z0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class f extends androidx.media2.exoplayer.external.source.h<z.a> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final z.a f55706u = new z.a(new Object());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z f55707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m0 f55708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.source.ads.b f55709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.source.ads.b.a f55710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Handler f55711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<z, List<u>> f55712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final z0.b f55713o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private c f55714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private z0 f55715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private androidx.media2.exoplayer.external.source.ads.a f55716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private z[][] f55717s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private z0[][] f55718t;

    public static final class a extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f55719b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f55720c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f55721d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f55722e = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f55723a;

        /* JADX INFO: renamed from: androidx.media2.exoplayer.external.source.ads.f$a$a, reason: collision with other inner class name */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0517a {
        }

        private a(int type, Exception cause) {
            super(cause);
            this.f55723a = type;
        }

        public static a a(Exception error) {
            return new a(0, error);
        }

        public static a b(Exception error, int adGroupIndex) {
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Failed to load ad group ");
            sb2.append(adGroupIndex);
            return new a(1, new IOException(sb2.toString(), error));
        }

        public static a c(Exception error) {
            return new a(2, error);
        }

        public static a d(RuntimeException error) {
            return new a(3, error);
        }

        public RuntimeException e() {
            androidx.media2.exoplayer.external.util.a.i(this.f55723a == 3);
            return (RuntimeException) androidx.media2.exoplayer.external.util.a.g(getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f55724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f55725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f55726c;

        public b(Uri adUri, int adGroupIndex, int adIndexInAdGroup) {
            this.f55724a = adUri;
            this.f55725b = adGroupIndex;
            this.f55726c = adIndexInAdGroup;
        }

        @Override // androidx.media2.exoplayer.external.source.u.a
        public void a(z.a mediaPeriodId, final IOException exception) {
            f.this.m(mediaPeriodId).v(new o(this.f55724a), this.f55724a, Collections.EMPTY_MAP, 6, -1L, 0L, 0L, a.a(exception), true);
            f.this.f55711m.post(new Runnable(this, exception) { // from class: androidx.media2.exoplayer.external.source.ads.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final f.b f55731a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final IOException f55732b;

                {
                    this.f55731a = this;
                    this.f55732b = exception;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f55731a.b(this.f55732b);
                }
            });
        }

        final /* synthetic */ void b(IOException iOException) {
            f.this.f55709k.b(this.f55725b, this.f55726c, iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements androidx.media2.exoplayer.external.source.ads.b.InterfaceC0516b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f55728a = new Handler();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f55729b;

        public c() {
        }

        @Override // androidx.media2.exoplayer.external.source.ads.b.InterfaceC0516b
        public void a() {
            androidx.media2.exoplayer.external.source.ads.c.a(this);
        }

        @Override // androidx.media2.exoplayer.external.source.ads.b.InterfaceC0516b
        public void b() {
            androidx.media2.exoplayer.external.source.ads.c.d(this);
        }

        @Override // androidx.media2.exoplayer.external.source.ads.b.InterfaceC0516b
        public void c(final a error, o dataSpec) {
            if (this.f55729b) {
                return;
            }
            f.this.m(null).v(dataSpec, dataSpec.f57370a, Collections.EMPTY_MAP, 6, -1L, 0L, 0L, error, true);
        }

        @Override // androidx.media2.exoplayer.external.source.ads.b.InterfaceC0516b
        public void d(final androidx.media2.exoplayer.external.source.ads.a adPlaybackState) {
            if (this.f55729b) {
                return;
            }
            this.f55728a.post(new Runnable(this, adPlaybackState) { // from class: androidx.media2.exoplayer.external.source.ads.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final f.c f55733a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f55734b;

                {
                    this.f55733a = this;
                    this.f55734b = adPlaybackState;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f55733a.e(this.f55734b);
                }
            });
        }

        final /* synthetic */ void e(androidx.media2.exoplayer.external.source.ads.a aVar) {
            if (this.f55729b) {
                return;
            }
            f.this.O(aVar);
        }

        public void f() {
            this.f55729b = true;
            this.f55728a.removeCallbacksAndMessages(null);
        }
    }

    public f(z contentMediaSource, l.a dataSourceFactory, androidx.media2.exoplayer.external.source.ads.b adsLoader, androidx.media2.exoplayer.external.source.ads.b.a adViewProvider) {
        this(contentMediaSource, new s0.a(dataSourceFactory), adsLoader, adViewProvider);
    }

    private static long[][] K(z0[][] adTimelines, z0.b period) {
        long[][] jArr = new long[adTimelines.length][];
        for (int i10 = 0; i10 < adTimelines.length; i10++) {
            jArr[i10] = new long[adTimelines[i10].length];
            int i11 = 0;
            while (true) {
                z0[] z0VarArr = adTimelines[i10];
                if (i11 < z0VarArr.length) {
                    long[] jArr2 = jArr[i10];
                    z0 z0Var = z0VarArr[i11];
                    jArr2[i11] = z0Var == null ? -9223372036854775807L : z0Var.f(0, period).i();
                    i11++;
                }
            }
        }
        return jArr;
    }

    private void N() {
        z0 iVar = this.f55715q;
        androidx.media2.exoplayer.external.source.ads.a aVar = this.f55716r;
        if (aVar != null && iVar != null) {
            androidx.media2.exoplayer.external.source.ads.a aVarE = aVar.e(K(this.f55718t, this.f55713o));
            this.f55716r = aVarE;
            if (aVarE.f55694a != 0) {
                iVar = new i(iVar, this.f55716r);
            }
            s(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(androidx.media2.exoplayer.external.source.ads.a adPlaybackState) {
        if (this.f55716r == null) {
            z[][] zVarArr = new z[adPlaybackState.f55694a][];
            this.f55717s = zVarArr;
            Arrays.fill(zVarArr, new z[0]);
            z0[][] z0VarArr = new z0[adPlaybackState.f55694a][];
            this.f55718t = z0VarArr;
            Arrays.fill(z0VarArr, new z0[0]);
        }
        this.f55716r = adPlaybackState;
        N();
    }

    private void P(z mediaSource, int adGroupIndex, int adIndexInAdGroup, z0 timeline) {
        boolean z10 = true;
        if (timeline.i() != 1) {
            z10 = false;
        }
        androidx.media2.exoplayer.external.util.a.a(z10);
        this.f55718t[adGroupIndex][adIndexInAdGroup] = timeline;
        List<u> listRemove = this.f55712n.remove(mediaSource);
        if (listRemove != null) {
            Object objM = timeline.m(0);
            for (int i10 = 0; i10 < listRemove.size(); i10++) {
                u uVar = listRemove.get(i10);
                uVar.d(new z.a(objM, uVar.f56445b.f56510d));
            }
        }
        N();
    }

    private void R(z0 timeline) {
        boolean z10 = true;
        if (timeline.i() != 1) {
            z10 = false;
        }
        androidx.media2.exoplayer.external.util.a.a(z10);
        this.f55715q = timeline;
        N();
    }

    @Override // androidx.media2.exoplayer.external.source.c, androidx.media2.exoplayer.external.source.z
    @p0
    public Object E() {
        return this.f55707i.E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.source.h
    @p0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public z.a w(z.a childId, z.a mediaPeriodId) {
        return childId.b() ? childId : mediaPeriodId;
    }

    final /* synthetic */ void M(c cVar) {
        this.f55709k.d(cVar, this.f55710l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.source.h
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void z(z.a mediaPeriodId, z mediaSource, z0 timeline) {
        if (mediaPeriodId.b()) {
            P(mediaSource, mediaPeriodId.f56508b, mediaPeriodId.f56509c, timeline);
        } else {
            R(timeline);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public void c(x mediaPeriod) {
        u uVar = (u) mediaPeriod;
        List<u> list = this.f55712n.get(uVar.f56444a);
        if (list != null) {
            list.remove(uVar);
        }
        uVar.w();
    }

    @Override // androidx.media2.exoplayer.external.source.z
    public x e(z.a id2, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs) {
        androidx.media2.exoplayer.external.source.ads.a aVar = (androidx.media2.exoplayer.external.source.ads.a) androidx.media2.exoplayer.external.util.a.g(this.f55716r);
        if (aVar.f55694a <= 0 || !id2.b()) {
            u uVar = new u(this.f55707i, id2, allocator, startPositionUs);
            uVar.d(id2);
            return uVar;
        }
        int i10 = id2.f56508b;
        int i11 = id2.f56509c;
        Uri uri = (Uri) androidx.media2.exoplayer.external.util.a.g(aVar.f55696c[i10].f55700b[i11]);
        z[][] zVarArr = this.f55717s;
        z[] zVarArr2 = zVarArr[i10];
        if (zVarArr2.length <= i11) {
            int i12 = i11 + 1;
            zVarArr[i10] = (z[]) Arrays.copyOf(zVarArr2, i12);
            z0[][] z0VarArr = this.f55718t;
            z0VarArr[i10] = (z0[]) Arrays.copyOf(z0VarArr[i10], i12);
        }
        z zVarD = this.f55717s[i10][i11];
        if (zVarD == null) {
            zVarD = this.f55708j.d(uri);
            this.f55717s[i10][i11] = zVarD;
            this.f55712n.put(zVarD, new ArrayList());
            B(id2, zVarD);
        }
        z zVar = zVarD;
        u uVar2 = new u(zVar, id2, allocator, startPositionUs);
        uVar2.x(new b(uri, i10, i11));
        List<u> list = this.f55712n.get(zVar);
        if (list == null) {
            uVar2.d(new z.a(((z0) androidx.media2.exoplayer.external.util.a.g(this.f55718t[i10][i11])).m(0), id2.f56510d));
            return uVar2;
        }
        list.add(uVar2);
        return uVar2;
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    protected void r(@p0 q0 mediaTransferListener) {
        super.r(mediaTransferListener);
        final c cVar = new c();
        this.f55714p = cVar;
        B(f55706u, this.f55707i);
        this.f55711m.post(new Runnable(this, cVar) { // from class: androidx.media2.exoplayer.external.source.ads.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final f f55703a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final f.c f55704b;

            {
                this.f55703a = this;
                this.f55704b = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f55703a.M(this.f55704b);
            }
        });
    }

    @Override // androidx.media2.exoplayer.external.source.h, androidx.media2.exoplayer.external.source.c
    protected void t() {
        super.t();
        ((c) androidx.media2.exoplayer.external.util.a.g(this.f55714p)).f();
        this.f55714p = null;
        this.f55712n.clear();
        this.f55715q = null;
        this.f55716r = null;
        this.f55717s = new z[0][];
        this.f55718t = new z0[0][];
        Handler handler = this.f55711m;
        androidx.media2.exoplayer.external.source.ads.b bVar = this.f55709k;
        bVar.getClass();
        handler.post(e.a(bVar));
    }

    public f(z contentMediaSource, m0 adMediaSourceFactory, androidx.media2.exoplayer.external.source.ads.b adsLoader, androidx.media2.exoplayer.external.source.ads.b.a adViewProvider) {
        this.f55707i = contentMediaSource;
        this.f55708j = adMediaSourceFactory;
        this.f55709k = adsLoader;
        this.f55710l = adViewProvider;
        this.f55711m = new Handler(Looper.getMainLooper());
        this.f55712n = new HashMap();
        this.f55713o = new z0.b();
        this.f55717s = new z[0][];
        this.f55718t = new z0[0][];
        adsLoader.a(adMediaSourceFactory.c());
    }
}
