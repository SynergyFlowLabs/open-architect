package androidx.media2.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media.AudioAttributesCompat;
import androidx.media2.common.CallbackMediaItem;
import androidx.media2.common.FileMediaItem;
import androidx.media2.common.MediaItem;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.UriMediaItem;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.audio.v;
import androidx.media2.exoplayer.external.audio.y;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.o0;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import androidx.media2.exoplayer.external.source.z;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.y0;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"RestrictedApi"})
final class f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f58282w = "ExoPlayerWrapper";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f58283x = "MediaPlayer2";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f58284y = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f58285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f58286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Looper f58287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f58288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.r f58289e = new androidx.media2.exoplayer.external.upstream.r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f58290f = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private y0 f58291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f58292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y f58293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u f58294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C0539f f58295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f58296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f58297m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f58298n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f58299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f58300p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f58301q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f58302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f58303s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f58304t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f58305u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p f58306v;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f58307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58308b;

        a(y yVar, int i10) {
            this.f58307a = yVar;
            this.f58308b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58307a.g(this.f58308b);
        }
    }

    final class b extends o0.b implements androidx.media2.exoplayer.external.video.u, androidx.media2.exoplayer.external.audio.i, s.c, androidx.media2.exoplayer.external.metadata.e {
        b() {
        }

        @Override // androidx.media2.exoplayer.external.o0.b, androidx.media2.exoplayer.external.o0.d
        public void A(int i10) {
            f.this.y(i10);
        }

        @Override // androidx.media2.exoplayer.external.audio.i
        public void B(float f10) {
        }

        @Override // androidx.media2.exoplayer.external.o0.b, androidx.media2.exoplayer.external.o0.d
        public void C(boolean z10, int i10) {
            f.this.w(z10, i10);
        }

        @Override // androidx.media2.exoplayer.external.audio.i
        public void E(androidx.media2.exoplayer.external.audio.c cVar) {
        }

        @Override // androidx.media2.exoplayer.external.o0.b, androidx.media2.exoplayer.external.o0.d
        public void F() {
            f.this.A();
        }

        @Override // androidx.media2.exoplayer.external.o0.b, androidx.media2.exoplayer.external.o0.d
        public void H(TrackGroupArray trackGroupArray, androidx.media2.exoplayer.external.trackselection.p pVar) {
            f.this.x(pVar);
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void J(androidx.media2.exoplayer.external.decoder.d dVar) {
            f.this.D(0, 0, 1.0f);
        }

        @Override // androidx.media2.exoplayer.external.o0.b, androidx.media2.exoplayer.external.o0.d
        public void K(androidx.media2.exoplayer.external.i iVar) {
            f.this.v(iVar);
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void L(androidx.media2.exoplayer.external.decoder.d dVar) {
        }

        @Override // androidx.media2.exoplayer.external.metadata.e
        public void P(Metadata metadata) {
            f.this.u(metadata);
        }

        @Override // androidx.media2.exoplayer.external.audio.i
        public void a(int i10) {
            f.this.t(i10);
        }

        @Override // androidx.media2.player.s.c
        public void b(byte[] bArr, long j10) {
            f.this.B(bArr, j10);
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void c(int i10, long j10) {
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void d(String str, long j10, long j11) {
        }

        @Override // androidx.media2.exoplayer.external.video.u, androidx.media2.exoplayer.external.video.l
        public void e(int i10, int i11, int i12, float f10) {
            f.this.D(i10, i11, f10);
        }

        @Override // androidx.media2.player.s.c
        public void g(int i10, int i11) {
            f.this.C(i10, i11);
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void m(Format format) {
            if (androidx.media2.exoplayer.external.util.s.n(format.f53103i)) {
                f.this.D(format.f53110n, format.f53111o, format.f53117v);
            }
        }

        @Override // androidx.media2.exoplayer.external.video.u
        public void w(@p0 Surface surface) {
            f.this.z();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<FileDescriptor, a> f58310a = new HashMap();

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f58311a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f58312b;

            a() {
            }
        }

        c() {
        }

        public Object a(FileDescriptor fileDescriptor) {
            if (!this.f58310a.containsKey(fileDescriptor)) {
                this.f58310a.put(fileDescriptor, new a());
            }
            a aVar = (a) androidx.core.util.t.l(this.f58310a.get(fileDescriptor));
            aVar.f58312b++;
            return aVar.f58311a;
        }

        public void b(FileDescriptor fileDescriptor) {
            a aVar = (a) androidx.core.util.t.l(this.f58310a.get(fileDescriptor));
            int i10 = aVar.f58312b - 1;
            aVar.f58312b = i10;
            if (i10 == 0) {
                this.f58310a.remove(fileDescriptor);
            }
        }
    }

    public interface d {
        void a(MediaItem mediaItem);

        void b(MediaItem mediaItem, int i10);

        void c(MediaItem mediaItem);

        void d(MediaItem mediaItem, t tVar);

        void e(@NonNull List<SessionPlayer.TrackInfo> list);

        void f(MediaItem mediaItem);

        void g(MediaItem mediaItem, int i10);

        void h(MediaItem mediaItem);

        void i(MediaItem mediaItem);

        void j(MediaItem mediaItem);

        void k(MediaItem mediaItem, int i10);

        void l(MediaItem mediaItem);

        void m();

        void n(MediaItem mediaItem, int i10, int i11);

        void o(@NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData);

        void p(MediaItem mediaItem);

        void q(MediaItem mediaItem, n nVar);
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MediaItem f58313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f58314b;

        e(MediaItem mediaItem, boolean z10) {
            this.f58313a = mediaItem;
            this.f58314b = z10;
        }
    }

    /* JADX INFO: renamed from: androidx.media2.player.f$f, reason: collision with other inner class name */
    private static final class C0539f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f58315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f58316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y0 f58317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.upstream.l.a f58318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.media2.exoplayer.external.source.l f58319e = new androidx.media2.exoplayer.external.source.l(new z[0]);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ArrayDeque<e> f58320f = new ArrayDeque<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final c f58321g = new c();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f58322h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f58323i;

        C0539f(Context context, y0 y0Var, d dVar) {
            this.f58315a = context;
            this.f58317c = y0Var;
            this.f58316b = dVar;
            this.f58318d = new androidx.media2.exoplayer.external.upstream.u(context, q0.h0(context, f.f58283x));
        }

        private void a(MediaItem mediaItem, Collection<e> collection, Collection<z> collection2) {
            androidx.media2.exoplayer.external.upstream.l.a aVarK = this.f58318d;
            if (mediaItem instanceof FileMediaItem) {
                FileMediaItem fileMediaItem = (FileMediaItem) mediaItem;
                fileMediaItem.v();
                FileDescriptor fileDescriptor = fileMediaItem.u().getFileDescriptor();
                aVarK = androidx.media2.player.g.k(fileDescriptor, fileMediaItem.t(), fileMediaItem.s(), this.f58321g.a(fileDescriptor));
            }
            z zVarA = androidx.media2.player.e.a(this.f58315a, aVarK, mediaItem);
            long jN = mediaItem.n();
            long jK = mediaItem.k();
            if (jN != 0 || jK != 576460752303423487L) {
                if (jK == 576460752303423487L) {
                    jK = Long.MIN_VALUE;
                }
                zVarA = new androidx.media2.exoplayer.external.source.f(zVarA, androidx.media2.exoplayer.external.c.b(jN), androidx.media2.exoplayer.external.c.b(jK), false, false, true);
            }
            boolean z10 = (mediaItem instanceof UriMediaItem) && !q0.q0(((UriMediaItem) mediaItem).q());
            collection2.add(zVarA);
            collection.add(new e(mediaItem, z10));
        }

        private void l(e eVar) {
            MediaItem mediaItem = eVar.f58313a;
            try {
                if (!(mediaItem instanceof FileMediaItem)) {
                    if (mediaItem instanceof CallbackMediaItem) {
                        ((CallbackMediaItem) mediaItem).q().close();
                    }
                } else {
                    this.f58321g.b(((FileMediaItem) mediaItem).u().getFileDescriptor());
                    ((FileMediaItem) mediaItem).r();
                }
            } catch (IOException unused) {
                Objects.toString(mediaItem);
            }
        }

        public void b() {
            while (!this.f58320f.isEmpty()) {
                l(this.f58320f.remove());
            }
        }

        @p0
        public MediaItem c() {
            if (this.f58320f.isEmpty()) {
                return null;
            }
            return this.f58320f.peekFirst().f58313a;
        }

        public boolean d() {
            return !this.f58320f.isEmpty() && this.f58320f.peekFirst().f58314b;
        }

        public long e() {
            return androidx.media2.exoplayer.external.c.c(this.f58323i);
        }

        public boolean f() {
            return this.f58319e.e0() == 0;
        }

        public void g() {
            MediaItem mediaItemC = c();
            this.f58316b.i(mediaItemC);
            this.f58316b.l(mediaItemC);
        }

        public void h() {
            if (this.f58322h != -1) {
                return;
            }
            this.f58322h = System.nanoTime();
        }

        public void i(boolean z10) {
            MediaItem mediaItemC = c();
            if (z10 && this.f58317c.C() != 0) {
                this.f58316b.j(mediaItemC);
            }
            int iY = this.f58317c.Y();
            if (iY > 0) {
                if (z10) {
                    this.f58316b.i(c());
                }
                for (int i10 = 0; i10 < iY; i10++) {
                    l(this.f58320f.removeFirst());
                }
                if (z10) {
                    this.f58316b.f(c());
                }
                this.f58319e.q0(0, iY);
                this.f58323i = 0L;
                this.f58322h = -1L;
                if (this.f58317c.H() == 3) {
                    h();
                }
            }
        }

        public void j() {
            if (this.f58322h == -1) {
                return;
            }
            this.f58323i += ((System.nanoTime() - this.f58322h) + 500) / 1000;
            this.f58322h = -1L;
        }

        public void k() {
            this.f58317c.M0(this.f58319e);
        }

        public void m(MediaItem mediaItem) {
            b();
            this.f58319e.R();
            n(Collections.singletonList(mediaItem));
        }

        public void n(List<MediaItem> list) {
            int iE0 = this.f58319e.e0();
            ArrayList arrayList = new ArrayList(iE0 > 1 ? iE0 - 1 : 0);
            if (iE0 > 1) {
                this.f58319e.q0(1, iE0);
                while (this.f58320f.size() > 1) {
                    arrayList.add(this.f58320f.removeLast());
                }
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            for (MediaItem mediaItem : list) {
                if (mediaItem == null) {
                    this.f58316b.k(null, 1);
                    return;
                }
                a(mediaItem, this.f58320f, arrayList2);
            }
            this.f58319e.M(arrayList2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                l((e) it.next());
            }
        }

        public void o() {
            l(this.f58320f.removeFirst());
            this.f58319e.n0(0);
        }
    }

    final class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.b0();
        }
    }

    f(Context context, d dVar, Looper looper) {
        this.f58285a = context.getApplicationContext();
        this.f58286b = dVar;
        this.f58287c = looper;
        this.f58288d = new Handler(looper);
    }

    private void G() {
        if (this.f58300p && !this.f58302r) {
            this.f58302r = true;
            if (this.f58295k.d()) {
                this.f58286b.g(g(), (int) (this.f58289e.b() / 1000));
            }
            this.f58286b.h(g());
        }
    }

    private void H() {
        if (this.f58303s) {
            this.f58303s = false;
            this.f58286b.m();
        }
        if (this.f58291g.J()) {
            this.f58295k.g();
            this.f58291g.b0(false);
        }
    }

    private void I() {
        MediaItem mediaItemC = this.f58295k.c();
        boolean z10 = this.f58300p;
        boolean z11 = this.f58303s;
        if (!z10) {
            this.f58300p = true;
            this.f58301q = true;
            this.f58295k.i(false);
            this.f58286b.p(mediaItemC);
        } else if (z11) {
            this.f58303s = false;
            this.f58286b.m();
        }
        if (this.f58302r) {
            this.f58302r = false;
            if (this.f58295k.d()) {
                this.f58286b.g(g(), (int) (this.f58289e.b() / 1000));
            }
            this.f58286b.c(g());
        }
    }

    private void J() {
        this.f58295k.h();
    }

    private void K() {
        this.f58295k.j();
    }

    private static void c0(Handler handler, y yVar, int i10) {
        handler.post(new a(yVar, i10));
    }

    void A() {
        if (g() == null) {
            this.f58286b.m();
            return;
        }
        this.f58303s = true;
        if (this.f58291g.H() == 3) {
            I();
        }
    }

    void B(byte[] bArr, long j10) {
        SessionPlayer.TrackInfo trackInfoC = this.f58294j.c(4);
        this.f58286b.o(g(), trackInfoC, new SubtitleData(j10, 0L, bArr));
    }

    void C(int i10, int i11) {
        this.f58294j.g(i10, i11);
        if (this.f58294j.h()) {
            this.f58286b.e(p());
        }
    }

    void D(int i10, int i11, float f10) {
        if (f10 != 1.0f) {
            i10 = (int) (f10 * i10);
        }
        if (this.f58304t == i10 && this.f58305u == i11) {
            return;
        }
        this.f58304t = i10;
        this.f58305u = i11;
        this.f58286b.n(this.f58295k.c(), i10, i11);
    }

    public boolean E() {
        return this.f58291g.E0() != null;
    }

    public void F(boolean z10) {
        this.f58291g.D(z10 ? 1 : 0);
    }

    public void L() {
        this.f58301q = false;
        this.f58291g.b0(false);
    }

    public void M() {
        this.f58301q = false;
        int i10 = 3 ^ 4;
        if (this.f58291g.H() == 4) {
            this.f58291g.F(0L);
        }
        this.f58291g.b0(true);
    }

    public void N() {
        androidx.core.util.t.n(!this.f58300p);
        this.f58295k.k();
    }

    public void O() {
        y0 y0Var = this.f58291g;
        if (y0Var != null) {
            y0Var.b0(false);
            if (n() != 1001) {
                this.f58286b.q(g(), o());
            }
            this.f58291g.release();
            this.f58295k.b();
        }
        b bVar = new b();
        this.f58293i = new y(androidx.media2.exoplayer.external.audio.d.b(this.f58285a), new androidx.media2.exoplayer.external.audio.j[0]);
        s sVar = new s(bVar);
        r rVar = new r(this.f58285a, this.f58293i, sVar);
        this.f58294j = new u(sVar);
        this.f58291g = new y0.b(this.f58285a, rVar).g(this.f58294j.b()).c(this.f58289e).f(this.f58287c).a();
        this.f58292h = new Handler(this.f58291g.p0());
        this.f58295k = new C0539f(this.f58285a, this.f58291g, this.f58286b);
        this.f58291g.w0(bVar);
        this.f58291g.z1(bVar);
        this.f58291g.q(bVar);
        this.f58304t = 0;
        this.f58305u = 0;
        this.f58300p = false;
        this.f58301q = false;
        this.f58302r = false;
        this.f58303s = false;
        this.f58296l = false;
        this.f58297m = 0;
        this.f58298n = 0;
        this.f58299o = 0.0f;
        this.f58306v = new p.c().d(1.0f).c(1.0f).b(0).a();
    }

    public void P(long j10, int i10) {
        this.f58291g.J0(androidx.media2.player.e.h(i10));
        this.f58291g.F(j10);
    }

    public void Q(int i10) {
        this.f58294j.i(i10);
    }

    public void R(AudioAttributesCompat audioAttributesCompat) {
        this.f58296l = true;
        this.f58291g.o(androidx.media2.player.e.b(audioAttributesCompat));
        int i10 = this.f58297m;
        if (i10 != 0) {
            c0(this.f58292h, this.f58293i, i10);
        }
    }

    public void S(int i10) {
        this.f58297m = i10;
        if (this.f58291g != null) {
            c0(this.f58292h, this.f58293i, i10);
        }
    }

    public void T(float f10) {
        this.f58299o = f10;
        this.f58291g.h(new v(this.f58298n, f10));
    }

    public void U(MediaItem mediaItem) {
        this.f58295k.m((MediaItem) androidx.core.util.t.l(mediaItem));
    }

    public void V(MediaItem mediaItem) {
        if (!this.f58295k.f()) {
            this.f58295k.n(Collections.singletonList(mediaItem));
            return;
        }
        if (mediaItem instanceof FileMediaItem) {
            FileMediaItem fileMediaItem = (FileMediaItem) mediaItem;
            fileMediaItem.v();
            fileMediaItem.r();
        }
        throw new IllegalStateException();
    }

    public void W(List<MediaItem> list) {
        if (!this.f58295k.f()) {
            this.f58295k.n((List) androidx.core.util.t.l(list));
            return;
        }
        Iterator<MediaItem> it = list.iterator();
        while (it.hasNext()) {
            FileMediaItem fileMediaItem = (FileMediaItem) it.next();
            fileMediaItem.v();
            fileMediaItem.r();
        }
        throw new IllegalStateException();
    }

    public void X(p pVar) {
        this.f58306v = pVar;
        this.f58291g.w(androidx.media2.player.e.g(pVar));
        if (n() == 1004) {
            this.f58286b.q(g(), o());
        }
    }

    public void Y(Surface surface) {
        this.f58291g.i(surface);
    }

    public void Z(float f10) {
        this.f58291g.f(f10);
    }

    public void a(int i10) {
        this.f58298n = i10;
        this.f58291g.h(new v(i10, this.f58299o));
    }

    public void a0() {
        this.f58295k.o();
    }

    public void b() {
        if (this.f58291g != null) {
            this.f58288d.removeCallbacks(this.f58290f);
            this.f58291g.release();
            this.f58291g = null;
            this.f58295k.b();
            this.f58296l = false;
        }
    }

    void b0() {
        if (this.f58295k.d()) {
            this.f58286b.b(g(), this.f58291g.S());
        }
        this.f58288d.removeCallbacks(this.f58290f);
        this.f58288d.postDelayed(this.f58290f, 1000L);
    }

    public void c(int i10) {
        this.f58294j.a(i10);
    }

    public AudioAttributesCompat d() {
        if (this.f58296l) {
            return androidx.media2.player.e.c(this.f58291g.e());
        }
        return null;
    }

    public int e() {
        if (this.f58297m == 0) {
            S(androidx.media2.exoplayer.external.c.a(this.f58285a));
        }
        int i10 = this.f58297m;
        if (i10 == 0) {
            return 0;
        }
        return i10;
    }

    public long f() {
        androidx.core.util.t.n(n() != 1001);
        return this.f58291g.v();
    }

    public MediaItem g() {
        return this.f58295k.c();
    }

    public long h() {
        androidx.core.util.t.n(n() != 1001);
        return Math.max(0L, this.f58291g.getCurrentPosition());
    }

    public long i() {
        androidx.core.util.t.n(n() != 1001);
        long duration = this.f58291g.getDuration();
        if (duration == -9223372036854775807L) {
            return -1L;
        }
        return duration;
    }

    public Looper j() {
        return this.f58287c;
    }

    @w0(21)
    public PersistableBundle k() {
        TrackGroupArray trackGroupArrayI = this.f58291g.I();
        long duration = this.f58291g.getDuration();
        long jE = this.f58295k.e();
        String str = null;
        String str2 = null;
        for (int i10 = 0; i10 < trackGroupArrayI.f55657a; i10++) {
            String str3 = trackGroupArrayI.a(i10).a(0).f53103i;
            if (str == null && androidx.media2.exoplayer.external.util.s.n(str3)) {
                str = str3;
            } else if (str2 == null && androidx.media2.exoplayer.external.util.s.l(str3)) {
                str2 = str3;
            }
        }
        PersistableBundle persistableBundleA = o.a.a();
        if (str != null) {
            o.a.c(persistableBundleA, "android.media.mediaplayer.video.mime", str);
        }
        if (str2 != null) {
            o.a.c(persistableBundleA, "android.media.mediaplayer.audio.mime", str2);
        }
        if (duration == -9223372036854775807L) {
            duration = -1;
        }
        o.a.b(persistableBundleA, "android.media.mediaplayer.durationMs", Long.valueOf(duration));
        o.a.b(persistableBundleA, "android.media.mediaplayer.playingMs", Long.valueOf(jE));
        return persistableBundleA;
    }

    public p l() {
        return this.f58306v;
    }

    public SessionPlayer.TrackInfo m(int i10) {
        return this.f58294j.c(i10);
    }

    public int n() {
        if (E()) {
            return 1005;
        }
        if (this.f58301q) {
            return 1002;
        }
        int iH = this.f58291g.H();
        boolean zJ = this.f58291g.J();
        if (iH == 1) {
            return 1001;
        }
        if (iH != 2) {
            if (iH != 3) {
                if (iH != 4) {
                    throw new IllegalStateException();
                }
            } else if (zJ) {
                return 1004;
            }
        }
        return 1003;
    }

    public n o() {
        return new n(this.f58291g.H() == 1 ? 0L : androidx.media2.exoplayer.external.c.b(h()), System.nanoTime(), (this.f58291g.H() == 3 && this.f58291g.J()) ? this.f58306v.d().floatValue() : 0.0f);
    }

    public List<SessionPlayer.TrackInfo> p() {
        return this.f58294j.e();
    }

    public int q() {
        return this.f58305u;
    }

    public int r() {
        return this.f58304t;
    }

    public float s() {
        return this.f58291g.k0();
    }

    void t(int i10) {
        this.f58297m = i10;
    }

    void u(Metadata metadata) {
        int iE = metadata.e();
        for (int i10 = 0; i10 < iE; i10++) {
            ByteArrayFrame byteArrayFrame = (ByteArrayFrame) metadata.c(i10);
            this.f58286b.d(g(), new t(byteArrayFrame.f57970a, byteArrayFrame.f57971b));
        }
    }

    void v(androidx.media2.exoplayer.external.i iVar) {
        this.f58286b.q(g(), o());
        this.f58286b.k(g(), androidx.media2.player.e.d(iVar));
    }

    void w(boolean z10, int i10) {
        this.f58286b.q(g(), o());
        if (i10 == 3 && z10) {
            J();
        } else {
            K();
        }
        if (i10 == 3 || i10 == 2) {
            this.f58288d.post(this.f58290f);
        } else {
            this.f58288d.removeCallbacks(this.f58290f);
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    I();
                    return;
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    H();
                    return;
                }
            }
            G();
        }
    }

    void x(androidx.media2.exoplayer.external.trackselection.p pVar) {
        this.f58294j.f(g(), pVar);
        if (this.f58294j.h()) {
            this.f58286b.e(p());
        }
    }

    void y(int i10) {
        this.f58286b.q(g(), o());
        this.f58295k.i(i10 == 0);
    }

    void z() {
        this.f58286b.a(this.f58295k.c());
    }
}
