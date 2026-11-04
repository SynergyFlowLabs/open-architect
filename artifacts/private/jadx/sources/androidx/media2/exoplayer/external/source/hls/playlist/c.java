package androidx.media2.exoplayer.external.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.source.k0;
import androidx.media2.exoplayer.external.upstream.f0;
import androidx.media2.exoplayer.external.upstream.g0;
import androidx.media2.exoplayer.external.upstream.i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c implements j, g0.b<i0<g>> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j.a f56077t = b.f56076a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final double f56078v = 3.5d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.source.hls.e f56079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f56080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f56081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<Uri, a> f56082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<j.b> f56083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f56084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private i0.a<g> f56085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private k0.a f56086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private g0 f56087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private Handler f56088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private j.e f56089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private e f56090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private Uri f56091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private f f56092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f56093o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f56094s;

    private final class a implements g0.b<i0<g>>, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f56095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g0 f56096b = new g0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i0<g> f56097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private f f56098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f56099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f56100f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f56101g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f56102h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f56103i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private IOException f56104j;

        public a(Uri playlistUrl) {
            this.f56095a = playlistUrl;
            this.f56097c = new i0<>(c.this.f56079a.a(4), playlistUrl, 4, c.this.f56085g);
        }

        private boolean e(long blacklistDurationMs) {
            this.f56102h = SystemClock.elapsedRealtime() + blacklistDurationMs;
            return this.f56095a.equals(c.this.f56091m) && !c.this.F();
        }

        private void i() {
            long jL = this.f56096b.l(this.f56097c, this, c.this.f56081c.a(this.f56097c.f57333b));
            k0.a aVar = c.this.f56086h;
            i0<g> i0Var = this.f56097c;
            aVar.y(i0Var.f57332a, i0Var.f57333b, jL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(f loadedPlaylist, long loadDurationMs) {
            f fVar = this.f56098d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f56099e = jElapsedRealtime;
            f fVarB = c.this.B(fVar, loadedPlaylist);
            this.f56098d = fVarB;
            if (fVarB != fVar) {
                this.f56104j = null;
                this.f56100f = jElapsedRealtime;
                c.this.L(this.f56095a, fVarB);
            } else if (!fVarB.f56143l) {
                long size = loadedPlaylist.f56140i + ((long) loadedPlaylist.f56146o.size());
                f fVar2 = this.f56098d;
                if (size < fVar2.f56140i) {
                    this.f56104j = new j.c(this.f56095a);
                    c.this.H(this.f56095a, -9223372036854775807L);
                } else if (jElapsedRealtime - this.f56100f > androidx.media2.exoplayer.external.c.c(fVar2.f56142k) * c.this.f56084f) {
                    this.f56104j = new j.d(this.f56095a);
                    long jB = c.this.f56081c.b(4, loadDurationMs, this.f56104j, 1);
                    c.this.H(this.f56095a, jB);
                    if (jB != -9223372036854775807L) {
                        e(jB);
                    }
                }
            }
            f fVar3 = this.f56098d;
            this.f56101g = jElapsedRealtime + androidx.media2.exoplayer.external.c.c(fVar3 != fVar ? fVar3.f56142k : fVar3.f56142k / 2);
            if (!this.f56095a.equals(c.this.f56091m) || this.f56098d.f56143l) {
                return;
            }
            h();
        }

        @p0
        public f f() {
            return this.f56098d;
        }

        public boolean g() {
            int i10;
            if (this.f56098d == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, androidx.media2.exoplayer.external.c.c(this.f56098d.f56147p));
            f fVar = this.f56098d;
            return fVar.f56143l || (i10 = fVar.f56135d) == 2 || i10 == 1 || this.f56099e + jMax > jElapsedRealtime;
        }

        public void h() {
            this.f56102h = 0L;
            if (!this.f56103i && !this.f56096b.i()) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime >= this.f56101g) {
                    i();
                } else {
                    this.f56103i = true;
                    c.this.f56088j.postDelayed(this, this.f56101g - jElapsedRealtime);
                }
            }
        }

        public void j() throws IOException {
            this.f56096b.a();
            IOException iOException = this.f56104j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // androidx.media2.exoplayer.external.upstream.g0.b
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void u(i0<g> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
            c.this.f56086h.p(loadable.f57332a, loadable.f(), loadable.d(), 4, elapsedRealtimeMs, loadDurationMs, loadable.c());
        }

        @Override // androidx.media2.exoplayer.external.upstream.g0.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void t(i0<g> loadable, long elapsedRealtimeMs, long loadDurationMs) {
            g gVarE = loadable.e();
            if (!(gVarE instanceof f)) {
                this.f56104j = new androidx.media2.exoplayer.external.k0("Loaded playlist has unexpected type.");
            } else {
                n((f) gVarE, loadDurationMs);
                c.this.f56086h.s(loadable.f57332a, loadable.f(), loadable.d(), 4, elapsedRealtimeMs, loadDurationMs, loadable.c());
            }
        }

        @Override // androidx.media2.exoplayer.external.upstream.g0.b
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public g0.c d(i0<g> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
            g0.c cVarH;
            long jB = c.this.f56081c.b(loadable.f57333b, loadDurationMs, error, errorCount);
            boolean z10 = jB != -9223372036854775807L;
            boolean zE = c.this.H(this.f56095a, jB) || !z10;
            if (z10) {
                zE |= e(jB);
            }
            if (zE) {
                long jC = c.this.f56081c.c(loadable.f57333b, loadDurationMs, error, errorCount);
                cVarH = jC != -9223372036854775807L ? g0.h(false, jC) : g0.f57298k;
            } else {
                cVarH = g0.f57297j;
            }
            c.this.f56086h.v(loadable.f57332a, loadable.f(), loadable.d(), 4, elapsedRealtimeMs, loadDurationMs, loadable.c(), error, !cVarH.c());
            return cVarH;
        }

        public void o() {
            this.f56096b.j();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56103i = false;
            i();
        }
    }

    public c(androidx.media2.exoplayer.external.source.hls.e dataSourceFactory, f0 loadErrorHandlingPolicy, i playlistParserFactory) {
        this(dataSourceFactory, loadErrorHandlingPolicy, playlistParserFactory, 3.5d);
    }

    private static f.b A(f oldPlaylist, f loadedPlaylist) {
        int i10 = (int) (loadedPlaylist.f56140i - oldPlaylist.f56140i);
        List<f.b> list = oldPlaylist.f56146o;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f B(f oldPlaylist, f loadedPlaylist) {
        if (loadedPlaylist.f(oldPlaylist)) {
            return loadedPlaylist.c(D(oldPlaylist, loadedPlaylist), C(oldPlaylist, loadedPlaylist));
        }
        return loadedPlaylist.f56143l ? oldPlaylist.d() : oldPlaylist;
    }

    private int C(f oldPlaylist, f loadedPlaylist) {
        f.b bVarA;
        if (loadedPlaylist.f56138g) {
            return loadedPlaylist.f56139h;
        }
        f fVar = this.f56092n;
        int i10 = fVar != null ? fVar.f56139h : 0;
        return (oldPlaylist == null || (bVarA = A(oldPlaylist, loadedPlaylist)) == null) ? i10 : (oldPlaylist.f56139h + bVarA.f56152e) - loadedPlaylist.f56146o.get(0).f56152e;
    }

    private long D(f oldPlaylist, f loadedPlaylist) {
        if (loadedPlaylist.f56144m) {
            return loadedPlaylist.f56137f;
        }
        f fVar = this.f56092n;
        long j10 = fVar != null ? fVar.f56137f : 0L;
        if (oldPlaylist != null) {
            int size = oldPlaylist.f56146o.size();
            f.b bVarA = A(oldPlaylist, loadedPlaylist);
            if (bVarA != null) {
                return oldPlaylist.f56137f + bVarA.f56153f;
            }
            if (size == loadedPlaylist.f56140i - oldPlaylist.f56140i) {
                return oldPlaylist.e();
            }
        }
        return j10;
    }

    private boolean E(Uri playlistUrl) {
        List<e.b> list = this.f56090l.f56113e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (playlistUrl.equals(list.get(i10).f56126a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F() {
        List<e.b> list = this.f56090l.f56113e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = this.f56082d.get(list.get(i10).f56126a);
            if (jElapsedRealtime > aVar.f56102h) {
                this.f56091m = aVar.f56095a;
                aVar.h();
                int i11 = 3 << 1;
                return true;
            }
        }
        return false;
    }

    private void G(Uri url) {
        f fVar;
        if (!url.equals(this.f56091m) && E(url) && ((fVar = this.f56092n) == null || !fVar.f56143l)) {
            this.f56091m = url;
            this.f56082d.get(url).h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H(Uri playlistUrl, long blacklistDurationMs) {
        int size = this.f56083e.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z10 |= !this.f56083e.get(i10).l(playlistUrl, blacklistDurationMs);
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(Uri url, f newSnapshot) {
        if (url.equals(this.f56091m)) {
            if (this.f56092n == null) {
                this.f56093o = !newSnapshot.f56143l;
                this.f56094s = newSnapshot.f56137f;
            }
            this.f56092n = newSnapshot;
            this.f56089k.h(newSnapshot);
        }
        int size = this.f56083e.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f56083e.get(i10).d();
        }
    }

    private void z(List<Uri> urls) {
        int size = urls.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = urls.get(i10);
            this.f56082d.put(uri, new a(uri));
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void u(i0<g> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        this.f56086h.p(loadable.f57332a, loadable.f(), loadable.d(), 4, elapsedRealtimeMs, loadDurationMs, loadable.c());
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(i0<g> loadable, long elapsedRealtimeMs, long loadDurationMs) {
        long j10;
        g gVarE = loadable.e();
        boolean z10 = gVarE instanceof f;
        e eVarE = z10 ? e.e(gVarE.f56160a) : (e) gVarE;
        this.f56090l = eVarE;
        this.f56085g = this.f56080b.a(eVarE);
        this.f56091m = eVarE.f56113e.get(0).f56126a;
        z(eVarE.f56112d);
        a aVar = this.f56082d.get(this.f56091m);
        if (z10) {
            j10 = loadDurationMs;
            aVar.n((f) gVarE, j10);
        } else {
            j10 = loadDurationMs;
            aVar.h();
        }
        this.f56086h.s(loadable.f57332a, loadable.f(), loadable.d(), 4, elapsedRealtimeMs, j10, loadable.c());
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public g0.c d(i0<g> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        long jC = this.f56081c.c(loadable.f57333b, loadDurationMs, error, errorCount);
        boolean z10 = jC == -9223372036854775807L;
        this.f56086h.v(loadable.f57332a, loadable.f(), loadable.d(), 4, elapsedRealtimeMs, loadDurationMs, loadable.c(), error, z10);
        return z10 ? g0.f57298k : g0.h(false, jC);
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j
    public void a(j.b listener) {
        this.f56083e.add(listener);
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j
    public long b() {
        return this.f56094s;
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j
    @p0
    public e c() {
        return this.f56090l;
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j
    public void e(Uri url) throws IOException {
        this.f56082d.get(url).j();
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j
    public void f(j.b listener) {
        this.f56083e.remove(listener);
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j
    public void g(Uri url) {
        this.f56082d.get(url).h();
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j
    public void h(Uri initialPlaylistUri, k0.a eventDispatcher, j.e primaryPlaylistListener) {
        this.f56088j = new Handler();
        this.f56086h = eventDispatcher;
        this.f56089k = primaryPlaylistListener;
        i0 i0Var = new i0(this.f56079a.a(4), initialPlaylistUri, 4, this.f56080b.b());
        androidx.media2.exoplayer.external.util.a.i(this.f56087i == null);
        g0 g0Var = new g0("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f56087i = g0Var;
        eventDispatcher.y(i0Var.f57332a, i0Var.f57333b, g0Var.l(i0Var, this, this.f56081c.a(i0Var.f57333b)));
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j
    public boolean i(Uri url) {
        return this.f56082d.get(url).g();
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j
    public boolean j() {
        return this.f56093o;
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j
    public void k() throws IOException {
        g0 g0Var = this.f56087i;
        if (g0Var != null) {
            g0Var.a();
        }
        Uri uri = this.f56091m;
        if (uri != null) {
            e(uri);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j
    @p0
    public f l(Uri url, boolean isForPlayback) {
        f fVarF = this.f56082d.get(url).f();
        if (fVarF != null && isForPlayback) {
            G(url);
        }
        return fVarF;
    }

    @Override // androidx.media2.exoplayer.external.source.hls.playlist.j
    public void stop() {
        this.f56091m = null;
        this.f56092n = null;
        this.f56090l = null;
        this.f56094s = -9223372036854775807L;
        this.f56087i.j();
        this.f56087i = null;
        Iterator<a> it = this.f56082d.values().iterator();
        while (it.hasNext()) {
            it.next().o();
        }
        this.f56088j.removeCallbacksAndMessages(null);
        this.f56088j = null;
        this.f56082d.clear();
    }

    public c(androidx.media2.exoplayer.external.source.hls.e dataSourceFactory, f0 loadErrorHandlingPolicy, i playlistParserFactory, double playlistStuckTargetDurationCoefficient) {
        this.f56079a = dataSourceFactory;
        this.f56080b = playlistParserFactory;
        this.f56081c = loadErrorHandlingPolicy;
        this.f56084f = playlistStuckTargetDurationCoefficient;
        this.f56083e = new ArrayList();
        this.f56082d = new HashMap<>();
        this.f56094s = -9223372036854775807L;
    }
}
