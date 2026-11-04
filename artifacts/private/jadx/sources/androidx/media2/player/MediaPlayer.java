package androidx.media2.player;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.media.AudioAttributesCompat;
import androidx.media2.common.FileMediaItem;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import com.google.common.util.concurrent.t1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaPlayer extends SessionPlayer {
    public static final int A3 = 3;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final int B3 = 5;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final int C3 = 6;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final int D3 = 7;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final int E3 = 100;
    public static final int F3 = 700;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final int G3 = 701;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final int H3 = 702;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final int I3 = 703;
    public static final int J3 = 704;
    public static final int K3 = 800;
    public static final int L3 = 801;
    public static final int M3 = 802;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final int N3 = 803;
    public static final int O3 = 804;
    public static final int P3 = 805;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final int Q3 = 901;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final int R3 = 902;
    public static final int S3 = 0;
    public static final int T3 = 1;
    public static final int U3 = 2;
    public static final int V3 = 3;

    @Deprecated
    public static final int W3 = Integer.MIN_VALUE;
    static final androidx.media2.player.p X3 = new androidx.media2.player.p.c().d(1.0f).c(1.0f).b(0).a();
    private static final int Y3 = -1;
    private static final int Z3 = -2;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    static androidx.collection.a<Integer, Integer> f57972a4 = null;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    static androidx.collection.a<Integer, Integer> f57973b4 = null;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    static androidx.collection.a<Integer, Integer> f57974c4 = null;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    static androidx.collection.a<Integer, Integer> f57975d4 = null;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    static androidx.collection.a<Integer, Integer> f57976e4 = null;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final String f57977t3 = "MediaPlayer";

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final int f57978u3 = 1;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final int f57979v3 = -1004;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final int f57980w3 = -1007;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final int f57981x3 = -1010;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final int f57982y3 = -110;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final int f57983z3 = 2;
    androidx.media2.player.m Y;
    ExecutorService Z;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @androidx.annotation.b0("mStateLock")
    private boolean f57985h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    final androidx.media2.player.a f57986i3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @androidx.annotation.b0("mPlaylistLock")
    MediaMetadata f57990m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @androidx.annotation.b0("mPlaylistLock")
    int f57991n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @androidx.annotation.b0("mPlaylistLock")
    int f57992o3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @androidx.annotation.b0("mStateLock")
    private int f57995p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @androidx.annotation.b0("mPlaylistLock")
    int f57996p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @androidx.annotation.b0("mPlaylistLock")
    MediaItem f57997q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @androidx.annotation.b0("mPlaylistLock")
    MediaItem f57998r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @androidx.annotation.b0("mPlaylistLock")
    private boolean f57999s3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @androidx.annotation.b0("mPendingCommands")
    final ArrayDeque<z0> f57993p0 = new ArrayDeque<>();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @androidx.annotation.b0("mPendingFutures")
    final ArrayDeque<a1<? extends SessionPlayer.c>> f57994p1 = new ArrayDeque<>();
    private final Object H1 = new Object();

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @androidx.annotation.b0("mStateLock")
    private Map<MediaItem, Integer> f57984g3 = new HashMap();

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    final Object f57987j3 = new Object();

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @androidx.annotation.b0("mPlaylistLock")
    s0 f57988k3 = new s0();

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @androidx.annotation.b0("mPlaylistLock")
    ArrayList<MediaItem> f57989l3 = new ArrayList<>();

    public static final class TrackInfo extends SessionPlayer.TrackInfo {
        TrackInfo(SessionPlayer.TrackInfo trackInfo) {
            super(trackInfo.k(), trackInfo.m(), trackInfo.j(), trackInfo.m() != 1);
        }

        @Override // androidx.media2.common.SessionPlayer.TrackInfo
        @androidx.annotation.p0
        public MediaFormat j() {
            if (m() == 4) {
                return super.j();
            }
            return null;
        }
    }

    class a extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ MediaItem f58000l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f58001m;

        /* JADX INFO: renamed from: androidx.media2.player.MediaPlayer$a$a, reason: collision with other inner class name */
        class C0532a implements d1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f58003a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MediaMetadata f58004b;

            C0532a(List list, MediaMetadata mediaMetadata) {
                this.f58003a = list;
                this.f58004b = mediaMetadata;
            }

            @Override // androidx.media2.player.MediaPlayer.d1
            public void a(SessionPlayer.b bVar) {
                bVar.h(MediaPlayer.this, this.f58003a, this.f58004b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Executor executor, MediaItem mediaItem, int i10) {
            super(executor);
            this.f58000l = mediaItem;
            this.f58001m = i10;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            synchronized (MediaPlayer.this.f57987j3) {
                try {
                    if (MediaPlayer.this.f57988k3.c(this.f58000l)) {
                        return MediaPlayer.this.R(-3, this.f58000l);
                    }
                    int iY = MediaPlayer.y(this.f58001m, MediaPlayer.this.f57988k3.k());
                    MediaPlayer.this.f57988k3.a(iY, this.f58000l);
                    MediaPlayer mediaPlayer = MediaPlayer.this;
                    if (mediaPlayer.f57992o3 == 0) {
                        mediaPlayer.f57989l3.add(iY, this.f58000l);
                    } else {
                        iY = (int) (Math.random() * ((double) (MediaPlayer.this.f57989l3.size() + 1)));
                        MediaPlayer.this.f57989l3.add(iY, this.f58000l);
                    }
                    MediaPlayer mediaPlayer2 = MediaPlayer.this;
                    int i10 = mediaPlayer2.f57996p3;
                    if (iY <= i10) {
                        mediaPlayer2.f57996p3 = i10 + 1;
                    }
                    androidx.core.util.p<MediaItem, MediaItem> pVarB2 = mediaPlayer2.b2();
                    MediaPlayer.this.M0(new C0532a(MediaPlayer.this.V0(), MediaPlayer.this.V()));
                    if (pVarB2 == null || pVarB2.f48412b == null) {
                        return MediaPlayer.this.N(0);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MediaPlayer.this.s1(pVarB2.f48412b));
                    return arrayList;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class a0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f58006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b1 f58007b;

        a0(t0 t0Var, b1 b1Var) {
            this.f58006a = t0Var;
            this.f58007b = b1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58006a.a(this.f58007b);
        }
    }

    static abstract class a1<V extends SessionPlayer.c> extends androidx.concurrent.futures.a<V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final boolean f58009i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f58010j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        List<androidx.concurrent.futures.e<V>> f58011k;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a1.this.isCancelled()) {
                    a1 a1Var = a1.this;
                    if (a1Var.f58010j) {
                        a1Var.N();
                    }
                }
            }
        }

        a1(Executor executor) {
            this(executor, false);
        }

        private void T() {
            V v10 = null;
            for (int i10 = 0; i10 < this.f58011k.size(); i10++) {
                androidx.concurrent.futures.e<V> eVar = this.f58011k.get(i10);
                if (!eVar.isDone() && !eVar.isCancelled()) {
                    return;
                }
                try {
                    v10 = eVar.get();
                    int i11 = v10.i();
                    if (i11 != 0 && i11 != 1) {
                        N();
                        E(v10);
                        return;
                    }
                } catch (Exception e10) {
                    N();
                    H(e10);
                    return;
                }
            }
            try {
                E(v10);
            } catch (Exception e11) {
                H(e11);
            }
        }

        @Override // androidx.concurrent.futures.a
        public boolean H(Throwable th2) {
            return super.H(th2);
        }

        void N() {
            List<androidx.concurrent.futures.e<V>> list = this.f58011k;
            if (list != null) {
                for (androidx.concurrent.futures.e<V> eVar : list) {
                    if (!eVar.isCancelled() && !eVar.isDone()) {
                        int i10 = 2 ^ 1;
                        eVar.cancel(true);
                    }
                }
            }
        }

        public boolean O() {
            if (!this.f58010j && !isCancelled()) {
                this.f58010j = true;
                this.f58011k = R();
            }
            if (!isCancelled() && !isDone()) {
                T();
            }
            return isCancelled() || isDone();
        }

        abstract List<androidx.concurrent.futures.e<V>> R();

        @Override // androidx.concurrent.futures.a
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public boolean E(@androidx.annotation.p0 V v10) {
            return super.E(v10);
        }

        a1(Executor executor, boolean z10) {
            this.f58010j = false;
            this.f58009i = z10;
            m0(new a(), executor);
        }
    }

    class b extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f58013l;

        class a implements d1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f58015a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MediaMetadata f58016b;

            a(List list, MediaMetadata mediaMetadata) {
                this.f58015a = list;
                this.f58016b = mediaMetadata;
            }

            @Override // androidx.media2.player.MediaPlayer.d1
            public void a(SessionPlayer.b bVar) {
                bVar.h(MediaPlayer.this, this.f58015a, this.f58016b);
            }
        }

        /* JADX INFO: renamed from: androidx.media2.player.MediaPlayer$b$b, reason: collision with other inner class name */
        class C0533b implements d1 {
            C0533b() {
            }

            @Override // androidx.media2.player.MediaPlayer.d1
            public void a(SessionPlayer.b bVar) {
                bVar.g(MediaPlayer.this, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Executor executor, int i10) {
            super(executor);
            this.f58013l = i10;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            synchronized (MediaPlayer.this.f57987j3) {
                try {
                    if (this.f58013l >= MediaPlayer.this.f57988k3.k()) {
                        return MediaPlayer.this.N(-3);
                    }
                    int iIndexOf = MediaPlayer.this.f57989l3.indexOf(MediaPlayer.this.f57988k3.h(this.f58013l));
                    MediaPlayer.this.f57989l3.remove(iIndexOf);
                    MediaPlayer mediaPlayer = MediaPlayer.this;
                    int i10 = mediaPlayer.f57996p3;
                    if (iIndexOf < i10) {
                        mediaPlayer.f57996p3 = i10 - 1;
                    }
                    androidx.core.util.p<MediaItem, MediaItem> pVarB2 = mediaPlayer.b2();
                    MediaPlayer mediaPlayer2 = MediaPlayer.this;
                    MediaItem mediaItem = mediaPlayer2.f57997q3;
                    MediaItem mediaItem2 = mediaPlayer2.f57998r3;
                    MediaPlayer.this.M0(new a(mediaPlayer2.V0(), MediaPlayer.this.V()));
                    ArrayList arrayList = new ArrayList();
                    if (mediaItem == null) {
                        MediaPlayer.this.U0();
                        MediaPlayer.this.M0(new C0533b());
                        arrayList.add(MediaPlayer.this.H(0));
                        return arrayList;
                    }
                    if (pVarB2 == null) {
                        arrayList.add(MediaPlayer.this.H(0));
                        return arrayList;
                    }
                    if (pVarB2.f48411a != null) {
                        arrayList.addAll(MediaPlayer.this.p1(mediaItem, mediaItem2));
                        return arrayList;
                    }
                    if (pVarB2.f48412b != null) {
                        arrayList.add(MediaPlayer.this.s1(mediaItem2));
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class b0 implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f58019a;

        b0(long j10) {
            this.f58019a = j10;
        }

        @Override // androidx.media2.player.MediaPlayer.d1
        public void a(SessionPlayer.b bVar) {
            bVar.k(MediaPlayer.this, this.f58019a);
        }
    }

    public static abstract class b1 extends SessionPlayer.b {
        @Override // androidx.media2.common.SessionPlayer.b
        public void q(@NonNull SessionPlayer sessionPlayer, @NonNull androidx.media2.common.VideoSize videoSize) {
            if (!(sessionPlayer instanceof MediaPlayer)) {
                throw new IllegalArgumentException("player must be MediaPlayer");
            }
            w((MediaPlayer) sessionPlayer, sessionPlayer.Z(), new VideoSize(videoSize));
        }

        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
        public void r(@NonNull MediaPlayer mediaPlayer, @NonNull MediaItem mediaItem, @NonNull o0 o0Var) {
        }

        public void s(@NonNull MediaPlayer mediaPlayer, @NonNull MediaItem mediaItem, int i10, int i11) {
        }

        public void t(@NonNull MediaPlayer mediaPlayer, @NonNull MediaItem mediaItem, int i10, int i11) {
        }

        public void u(@NonNull MediaPlayer mediaPlayer, @NonNull MediaItem mediaItem, @NonNull androidx.media2.player.n nVar) {
        }

        public void v(@NonNull MediaPlayer mediaPlayer, @NonNull MediaItem mediaItem, @NonNull androidx.media2.player.t tVar) {
        }

        @Deprecated
        public void w(@NonNull MediaPlayer mediaPlayer, @NonNull MediaItem mediaItem, @NonNull VideoSize videoSize) {
        }
    }

    class c extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f58021l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ MediaItem f58022m;

        class a implements d1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f58024a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MediaMetadata f58025b;

            a(List list, MediaMetadata mediaMetadata) {
                this.f58024a = list;
                this.f58025b = mediaMetadata;
            }

            @Override // androidx.media2.player.MediaPlayer.d1
            public void a(SessionPlayer.b bVar) {
                bVar.h(MediaPlayer.this, this.f58024a, this.f58025b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Executor executor, int i10, MediaItem mediaItem) {
            super(executor);
            this.f58021l = i10;
            this.f58022m = mediaItem;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            synchronized (MediaPlayer.this.f57987j3) {
                try {
                    if (this.f58021l < MediaPlayer.this.f57988k3.k() && !MediaPlayer.this.f57988k3.c(this.f58022m)) {
                        MediaPlayer mediaPlayer = MediaPlayer.this;
                        MediaPlayer.this.f57989l3.set(mediaPlayer.f57989l3.indexOf(mediaPlayer.f57988k3.d(this.f58021l)), this.f58022m);
                        MediaPlayer.this.f57988k3.j(this.f58021l, this.f58022m);
                        androidx.core.util.p<MediaItem, MediaItem> pVarB2 = MediaPlayer.this.b2();
                        MediaPlayer mediaPlayer2 = MediaPlayer.this;
                        MediaItem mediaItem = mediaPlayer2.f57997q3;
                        MediaItem mediaItem2 = mediaPlayer2.f57998r3;
                        MediaPlayer.this.M0(new a(mediaPlayer2.V0(), MediaPlayer.this.V()));
                        ArrayList arrayList = new ArrayList();
                        if (pVarB2 == null) {
                            arrayList.add(MediaPlayer.this.H(0));
                            return arrayList;
                        }
                        if (pVarB2.f48411a != null) {
                            arrayList.addAll(MediaPlayer.this.p1(mediaItem, mediaItem2));
                            return arrayList;
                        }
                        if (pVarB2.f48412b != null) {
                            arrayList.add(MediaPlayer.this.s1(mediaItem2));
                        }
                        return arrayList;
                    }
                    return MediaPlayer.this.R(-3, this.f58022m);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class c0 implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaItem f58027a;

        c0(MediaItem mediaItem) {
            this.f58027a = mediaItem;
        }

        @Override // androidx.media2.player.MediaPlayer.d1
        public void a(SessionPlayer.b bVar) {
            bVar.d(MediaPlayer.this, this.f58027a);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public @interface c1 {
    }

    class d extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f58029l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f58030m;

        class a implements d1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f58032a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MediaMetadata f58033b;

            a(List list, MediaMetadata mediaMetadata) {
                this.f58032a = list;
                this.f58033b = mediaMetadata;
            }

            @Override // androidx.media2.player.MediaPlayer.d1
            public void a(SessionPlayer.b bVar) {
                bVar.h(MediaPlayer.this, this.f58032a, this.f58033b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Executor executor, int i10, int i11) {
            super(executor);
            this.f58029l = i10;
            this.f58030m = i11;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            synchronized (MediaPlayer.this.f57987j3) {
                try {
                    if (this.f58029l < MediaPlayer.this.f57988k3.k() && this.f58030m < MediaPlayer.this.f57988k3.k()) {
                        MediaItem mediaItemH = MediaPlayer.this.f57988k3.h(this.f58029l);
                        MediaPlayer.this.f57988k3.a(this.f58030m, mediaItemH);
                        MediaPlayer mediaPlayer = MediaPlayer.this;
                        if (mediaPlayer.f57992o3 == 0) {
                            mediaPlayer.f57989l3.remove(this.f58029l);
                            MediaPlayer.this.f57989l3.add(this.f58030m, mediaItemH);
                            MediaPlayer mediaPlayer2 = MediaPlayer.this;
                            if (mediaItemH == mediaPlayer2.f57997q3) {
                                mediaPlayer2.f57996p3 = this.f58030m;
                            }
                        }
                        androidx.core.util.p<MediaItem, MediaItem> pVarB2 = MediaPlayer.this.b2();
                        MediaPlayer mediaPlayer3 = MediaPlayer.this;
                        MediaItem mediaItem = mediaPlayer3.f57997q3;
                        MediaItem mediaItem2 = mediaPlayer3.f57998r3;
                        MediaPlayer.this.M0(new a(mediaPlayer3.V0(), MediaPlayer.this.V()));
                        ArrayList arrayList = new ArrayList();
                        if (pVarB2 == null) {
                            arrayList.add(MediaPlayer.this.H(0));
                            return arrayList;
                        }
                        if (pVarB2.f48411a != null) {
                            arrayList.addAll(MediaPlayer.this.p1(mediaItem, mediaItem2));
                            return arrayList;
                        }
                        if (pVarB2.f48412b != null) {
                            arrayList.add(MediaPlayer.this.s1(mediaItem2));
                        }
                        return arrayList;
                    }
                    return MediaPlayer.this.N(-3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class d0 implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f58035a;

        d0(float f10) {
            this.f58035a = f10;
        }

        @Override // androidx.media2.player.MediaPlayer.d1
        public void a(SessionPlayer.b bVar) {
            bVar.f(MediaPlayer.this, this.f58035a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface d1 {
        void a(SessionPlayer.b bVar);
    }

    class e extends a1<SessionPlayer.c> {
        e(Executor executor) {
            super(executor);
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            synchronized (MediaPlayer.this.f57987j3) {
                try {
                    MediaPlayer mediaPlayer = MediaPlayer.this;
                    int i10 = mediaPlayer.f57996p3;
                    if (i10 < 0) {
                        return mediaPlayer.N(-2);
                    }
                    int size = i10 - 1;
                    if (size < 0) {
                        int i11 = mediaPlayer.f57991n3;
                        if (i11 != 2 && i11 != 3) {
                            return mediaPlayer.N(-2);
                        }
                        size = mediaPlayer.f57989l3.size() - 1;
                    }
                    MediaPlayer mediaPlayer2 = MediaPlayer.this;
                    mediaPlayer2.f57996p3 = size;
                    mediaPlayer2.b2();
                    MediaPlayer mediaPlayer3 = MediaPlayer.this;
                    return mediaPlayer3.p1(mediaPlayer3.f57997q3, mediaPlayer3.f57998r3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class e0 implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioAttributesCompat f58038a;

        e0(AudioAttributesCompat audioAttributesCompat) {
            this.f58038a = audioAttributesCompat;
        }

        @Override // androidx.media2.player.MediaPlayer.d1
        public void a(SessionPlayer.b bVar) {
            bVar.b(MediaPlayer.this, this.f58038a);
        }
    }

    class f extends a1<SessionPlayer.c> {
        f(Executor executor) {
            super(executor);
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            synchronized (MediaPlayer.this.f57987j3) {
                try {
                    MediaPlayer mediaPlayer = MediaPlayer.this;
                    int i10 = mediaPlayer.f57996p3;
                    if (i10 < 0) {
                        return mediaPlayer.N(-2);
                    }
                    int i11 = i10 + 1;
                    if (i11 >= mediaPlayer.f57989l3.size()) {
                        MediaPlayer mediaPlayer2 = MediaPlayer.this;
                        int i12 = mediaPlayer2.f57991n3;
                        if (i12 != 2 && i12 != 3) {
                            return mediaPlayer2.N(-2);
                        }
                        i11 = 0;
                    }
                    MediaPlayer mediaPlayer3 = MediaPlayer.this;
                    mediaPlayer3.f57996p3 = i11;
                    mediaPlayer3.b2();
                    MediaPlayer mediaPlayer4 = MediaPlayer.this;
                    MediaItem mediaItem = mediaPlayer4.f57997q3;
                    MediaItem mediaItem2 = mediaPlayer4.f57998r3;
                    if (mediaItem != null) {
                        return mediaPlayer4.p1(mediaItem, mediaItem2);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MediaPlayer.this.O1());
                    return arrayList;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class f0 implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z0 f58041a;

        f0(z0 z0Var) {
            this.f58041a = z0Var;
        }

        @Override // androidx.media2.player.MediaPlayer.d1
        public void a(SessionPlayer.b bVar) {
            bVar.o(MediaPlayer.this, this.f58041a.f58156c);
        }
    }

    class g extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f58043l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Executor executor, int i10) {
            super(executor);
            this.f58043l = i10;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            synchronized (MediaPlayer.this.f57987j3) {
                try {
                    if (this.f58043l >= MediaPlayer.this.f57988k3.k()) {
                        return MediaPlayer.this.N(-3);
                    }
                    MediaPlayer mediaPlayer = MediaPlayer.this;
                    mediaPlayer.f57996p3 = mediaPlayer.f57989l3.indexOf(mediaPlayer.f57988k3.d(this.f58043l));
                    MediaPlayer.this.b2();
                    MediaPlayer mediaPlayer2 = MediaPlayer.this;
                    return mediaPlayer2.p1(mediaPlayer2.f57997q3, mediaPlayer2.f57998r3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class g0 extends a1<SessionPlayer.c> {
        g0(Executor executor) {
            super(executor);
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            MediaPlayer.this.f57986i3.b();
            synchronized (MediaPlayer.this.f57993p0) {
                try {
                    int i10 = 0 ^ 4;
                    MediaPlayer.this.o(4, eVarN, MediaPlayer.this.Y.U());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    class h extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ MediaMetadata f58046l;

        class a implements d1 {
            a() {
            }

            @Override // androidx.media2.player.MediaPlayer.d1
            public void a(SessionPlayer.b bVar) {
                h hVar = h.this;
                bVar.i(MediaPlayer.this, hVar.f58046l);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Executor executor, MediaMetadata mediaMetadata) {
            super(executor);
            this.f58046l = mediaMetadata;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            MediaPlayer mediaPlayer;
            synchronized (MediaPlayer.this.f57987j3) {
                mediaPlayer = MediaPlayer.this;
                mediaPlayer.f57990m3 = this.f58046l;
            }
            mediaPlayer.M0(new a());
            return MediaPlayer.this.N(0);
        }
    }

    class h0 implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z0 f58049a;

        h0(z0 z0Var) {
            this.f58049a = z0Var;
        }

        @Override // androidx.media2.player.MediaPlayer.d1
        public void a(SessionPlayer.b bVar) {
            bVar.n(MediaPlayer.this, this.f58049a.f58156c);
        }
    }

    class i extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f58051l;

        class a implements d1 {
            a() {
            }

            @Override // androidx.media2.player.MediaPlayer.d1
            public void a(SessionPlayer.b bVar) {
                i iVar = i.this;
                bVar.j(MediaPlayer.this, iVar.f58051l);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Executor executor, int i10) {
            super(executor);
            this.f58051l = i10;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            MediaPlayer mediaPlayer;
            boolean z10;
            int i10 = this.f58051l;
            if (i10 < 0 || i10 > 3) {
                return MediaPlayer.this.N(-3);
            }
            synchronized (MediaPlayer.this.f57987j3) {
                try {
                    mediaPlayer = MediaPlayer.this;
                    int i11 = mediaPlayer.f57991n3;
                    int i12 = this.f58051l;
                    z10 = i11 != i12;
                    mediaPlayer.f57991n3 = i12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                mediaPlayer.M0(new a());
            }
            return MediaPlayer.this.N(0);
        }
    }

    class i0 extends a1<SessionPlayer.c> {
        i0(Executor executor) {
            super(executor);
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            synchronized (MediaPlayer.this.f57993p0) {
                try {
                    MediaPlayer.this.o(6, eVarN, MediaPlayer.this.Y.W());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            MediaPlayer mediaPlayer = MediaPlayer.this;
            mediaPlayer.j1(mediaPlayer.Y.C(), 2);
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    class j extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f58055l;

        class a implements d1 {
            a() {
            }

            @Override // androidx.media2.player.MediaPlayer.d1
            public void a(SessionPlayer.b bVar) {
                j jVar = j.this;
                bVar.l(MediaPlayer.this, jVar.f58055l);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Executor executor, int i10) {
            super(executor);
            this.f58055l = i10;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            boolean z10;
            int i10 = this.f58055l;
            if (i10 < 0 || i10 > 2) {
                return MediaPlayer.this.N(-3);
            }
            synchronized (MediaPlayer.this.f57987j3) {
                MediaPlayer mediaPlayer = MediaPlayer.this;
                int i11 = mediaPlayer.f57992o3;
                int i12 = this.f58055l;
                z10 = i11 != i12;
                mediaPlayer.f57992o3 = i12;
                mediaPlayer.t();
            }
            if (z10) {
                MediaPlayer.this.M0(new a());
            }
            return MediaPlayer.this.N(0);
        }
    }

    class j0 extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f58058l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(Executor executor, boolean z10, long j10) {
            super(executor, z10);
            this.f58058l = j10;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            synchronized (MediaPlayer.this.f57993p0) {
                try {
                    MediaPlayer.this.o(14, eVarN, MediaPlayer.this.Y.c0(this.f58058l));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.e f58060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f58061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z0 f58062c;

        k(androidx.concurrent.futures.e eVar, Object obj, z0 z0Var) {
            this.f58060a = eVar;
            this.f58061b = obj;
            this.f58062c = z0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f58060a.isCancelled()) {
                synchronized (MediaPlayer.this.f57993p0) {
                    try {
                        if (MediaPlayer.this.Y.s(this.f58061b)) {
                            MediaPlayer.this.f57993p0.remove(this.f58062c);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    class k0 extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f58064l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(Executor executor, float f10) {
            super(executor);
            this.f58064l = f10;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            if (this.f58064l <= 0.0f) {
                return MediaPlayer.this.N(-3);
            }
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            synchronized (MediaPlayer.this.f57993p0) {
                try {
                    androidx.media2.player.m mVar = MediaPlayer.this.Y;
                    MediaPlayer.this.o(24, eVarN, mVar.p0(new androidx.media2.player.p.c(mVar.K()).d(this.f58064l).a()));
                } finally {
                }
            }
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    class l extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Surface f58066l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Executor executor, Surface surface) {
            super(executor);
            this.f58066l = surface;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            synchronized (MediaPlayer.this.f57993p0) {
                try {
                    MediaPlayer.this.o(27, eVarN, MediaPlayer.this.Y.r0(this.f58066l));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    class l0 extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ AudioAttributesCompat f58068l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(Executor executor, AudioAttributesCompat audioAttributesCompat) {
            super(executor);
            this.f58068l = audioAttributesCompat;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            synchronized (MediaPlayer.this.f57993p0) {
                try {
                    MediaPlayer.this.o(16, eVarN, MediaPlayer.this.Y.f0(this.f58068l));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    class m extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f58070l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Executor executor, float f10) {
            super(executor);
            this.f58070l = f10;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(MediaPlayer.this.E1(this.f58070l));
            return arrayList;
        }
    }

    class m0 extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ MediaItem f58072l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(Executor executor, MediaItem mediaItem) {
            super(executor);
            this.f58072l = mediaItem;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            MediaPlayer mediaPlayer;
            ArrayList arrayList = new ArrayList();
            synchronized (MediaPlayer.this.f57987j3) {
                MediaPlayer.this.f57988k3.b();
                MediaPlayer mediaPlayer2 = MediaPlayer.this;
                mediaPlayer2.f57990m3 = null;
                mediaPlayer2.f57989l3.clear();
                mediaPlayer = MediaPlayer.this;
                mediaPlayer.f57997q3 = this.f58072l;
                mediaPlayer.f57998r3 = null;
                mediaPlayer.f57996p3 = -1;
            }
            mediaPlayer.M0(new d1() { // from class: androidx.media2.player.j
                @Override // androidx.media2.player.MediaPlayer.d1
                public final void a(SessionPlayer.b bVar) {
                    bVar.h(MediaPlayer.this, null, null);
                }
            });
            arrayList.addAll(MediaPlayer.this.p1(this.f58072l, null));
            return arrayList;
        }
    }

    class n extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.media2.player.p f58074l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Executor executor, androidx.media2.player.p pVar) {
            super(executor);
            this.f58074l = pVar;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            synchronized (MediaPlayer.this.f57993p0) {
                try {
                    MediaPlayer.this.o(24, eVarN, MediaPlayer.this.Y.p0(this.f58074l));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    class n0 extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ MediaMetadata f58076l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ List f58077m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(Executor executor, MediaMetadata mediaMetadata, List list) {
            super(executor);
            this.f58076l = mediaMetadata;
            this.f58077m = list;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            MediaPlayer mediaPlayer;
            MediaItem mediaItem;
            MediaItem mediaItem2;
            synchronized (MediaPlayer.this.f57987j3) {
                try {
                    MediaPlayer mediaPlayer2 = MediaPlayer.this;
                    mediaPlayer2.f57990m3 = this.f58076l;
                    mediaPlayer2.f57988k3.i(this.f58077m);
                    MediaPlayer.this.t();
                    MediaPlayer mediaPlayer3 = MediaPlayer.this;
                    mediaPlayer3.f57996p3 = 0;
                    mediaPlayer3.b2();
                    mediaPlayer = MediaPlayer.this;
                    mediaItem = mediaPlayer.f57997q3;
                    mediaItem2 = mediaPlayer.f57998r3;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            final List list = this.f58077m;
            final MediaMetadata mediaMetadata = this.f58076l;
            mediaPlayer.M0(new d1() { // from class: androidx.media2.player.k
                @Override // androidx.media2.player.MediaPlayer.d1
                public final void a(SessionPlayer.b bVar) {
                    bVar.h(MediaPlayer.this, list, mediaMetadata);
                }
            });
            return mediaItem != null ? MediaPlayer.this.p1(mediaItem, mediaItem2) : MediaPlayer.this.N(0);
        }
    }

    class o extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f58079l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f58080m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Executor executor, boolean z10, int i10, long j10) {
            super(executor, z10);
            this.f58079l = i10;
            this.f58080m = j10;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            int iIntValue = MediaPlayer.f57975d4.containsKey(Integer.valueOf(this.f58079l)) ? MediaPlayer.f57975d4.get(Integer.valueOf(this.f58079l)).intValue() : 1;
            synchronized (MediaPlayer.this.f57993p0) {
                try {
                    MediaPlayer.this.o(14, eVarN, MediaPlayer.this.Y.d0(this.f58080m, iIntValue));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final class o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media2.player.m.d f58082a;

        o0(androidx.media2.player.m.d dVar) {
            this.f58082a = dVar;
        }

        @NonNull
        public Map<UUID, byte[]> a() {
            return this.f58082a.a();
        }

        @NonNull
        public List<UUID> b() {
            return this.f58082a.b();
        }
    }

    class p extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f58083l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Executor executor, int i10) {
            super(executor);
            this.f58083l = i10;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            synchronized (MediaPlayer.this.f57993p0) {
                try {
                    MediaPlayer.this.o(17, eVarN, MediaPlayer.this.Y.g0(this.f58083l));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static class p0 extends SessionPlayer.c {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f58085t = -1001;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f58086u = -1002;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f58087v = -1003;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f58088w = -1004;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f58089x = -1005;

        @Retention(RetentionPolicy.SOURCE)
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
        public @interface a {
        }

        public p0(int i10, @NonNull MediaItem mediaItem) {
            super(i10, mediaItem);
        }

        @Override // androidx.media2.common.SessionPlayer.c, androidx.media2.common.a
        public int i() {
            return super.i();
        }
    }

    class q extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f58090l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Executor executor, int i10) {
            super(executor);
            this.f58090l = i10;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            synchronized (MediaPlayer.this.f57993p0) {
                try {
                    MediaPlayer.this.o(1, eVarN, MediaPlayer.this.Y.r(this.f58090l));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public @interface q0 {
    }

    class r extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f58092l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(Executor executor, float f10) {
            super(executor);
            this.f58092l = f10;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            synchronized (MediaPlayer.this.f57993p0) {
                try {
                    MediaPlayer.this.o(18, eVarN, MediaPlayer.this.Y.h0(this.f58092l));
                } finally {
                }
            }
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public @interface r0 {
    }

    class s extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ SessionPlayer.TrackInfo f58094l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(Executor executor, SessionPlayer.TrackInfo trackInfo) {
            super(executor);
            this.f58094l = trackInfo;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            synchronized (MediaPlayer.this.f57993p0) {
                MediaPlayer.this.q(15, eVarN, this.f58094l, MediaPlayer.this.Y.e0(this.f58094l.k()));
            }
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    static class s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList<MediaItem> f58096a = new ArrayList<>();

        s0() {
        }

        void a(int i10, MediaItem mediaItem) {
            if (mediaItem instanceof FileMediaItem) {
                ((FileMediaItem) mediaItem).v();
            }
            this.f58096a.add(i10, mediaItem);
        }

        void b() {
            for (MediaItem mediaItem : this.f58096a) {
                if (mediaItem instanceof FileMediaItem) {
                    ((FileMediaItem) mediaItem).r();
                }
            }
            this.f58096a.clear();
        }

        boolean c(Object obj) {
            return this.f58096a.contains(obj);
        }

        MediaItem d(int i10) {
            return this.f58096a.get(i10);
        }

        Collection<MediaItem> e() {
            return this.f58096a;
        }

        int f(Object obj) {
            return this.f58096a.indexOf(obj);
        }

        boolean g() {
            return this.f58096a.isEmpty();
        }

        MediaItem h(int i10) {
            MediaItem mediaItemRemove = this.f58096a.remove(i10);
            if (mediaItemRemove instanceof FileMediaItem) {
                ((FileMediaItem) mediaItemRemove).r();
            }
            return mediaItemRemove;
        }

        boolean i(Collection<MediaItem> collection) {
            for (MediaItem mediaItem : collection) {
                if (mediaItem instanceof FileMediaItem) {
                    ((FileMediaItem) mediaItem).v();
                }
            }
            b();
            return this.f58096a.addAll(collection);
        }

        MediaItem j(int i10, MediaItem mediaItem) {
            if (mediaItem instanceof FileMediaItem) {
                ((FileMediaItem) mediaItem).v();
            }
            MediaItem mediaItem2 = this.f58096a.set(i10, mediaItem);
            if (mediaItem2 instanceof FileMediaItem) {
                ((FileMediaItem) mediaItem2).r();
            }
            return mediaItem2;
        }

        int k() {
            return this.f58096a.size();
        }
    }

    class t extends a1<SessionPlayer.c> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ SessionPlayer.TrackInfo f58097l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Executor executor, SessionPlayer.TrackInfo trackInfo) {
            super(executor);
            this.f58097l = trackInfo;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            synchronized (MediaPlayer.this.f57993p0) {
                try {
                    MediaPlayer.this.q(2, eVarN, this.f58097l, MediaPlayer.this.Y.y(this.f58097l.k()));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    private interface t0 {
        void a(b1 b1Var);
    }

    class u extends a1<p0> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ UUID f58099l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(Executor executor, UUID uuid) {
            super(executor);
            this.f58099l = uuid;
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<p0>> R() {
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.e<? extends SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
            synchronized (MediaPlayer.this.f57993p0) {
                MediaPlayer.this.o(1001, eVarN, MediaPlayer.this.Y.X(this.f58099l));
            }
            arrayList.add(eVarN);
            return arrayList;
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final class u0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f58101a = "android.media.mediaplayer.video.mime";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f58102b = "android.media.mediaplayer.video.codec";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f58103c = "android.media.mediaplayer.width";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f58104d = "android.media.mediaplayer.height";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f58105e = "android.media.mediaplayer.frames";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f58106f = "android.media.mediaplayer.dropped";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f58107g = "android.media.mediaplayer.audio.mime";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f58108h = "android.media.mediaplayer.audio.codec";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f58109i = "android.media.mediaplayer.durationMs";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f58110j = "android.media.mediaplayer.playingMs";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f58111k = "android.media.mediaplayer.err";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f58112l = "android.media.mediaplayer.errcode";

        private u0() {
        }
    }

    class v extends a1<SessionPlayer.c> {
        v(Executor executor) {
            super(executor);
        }

        @Override // androidx.media2.player.MediaPlayer.a1
        List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
            androidx.concurrent.futures.e<SessionPlayer.c> eVarH;
            ArrayList arrayList = new ArrayList();
            if (MediaPlayer.this.f57986i3.c()) {
                if (MediaPlayer.this.Y.z() == null) {
                    arrayList.add(MediaPlayer.this.E1(0.0f));
                }
                eVarH = androidx.concurrent.futures.e.N();
                synchronized (MediaPlayer.this.f57993p0) {
                    try {
                        MediaPlayer.this.o(5, eVarH, MediaPlayer.this.Y.V());
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                eVarH = MediaPlayer.this.H(-1);
            }
            arrayList.add(eVarH);
            return arrayList;
        }
    }

    class v0 extends androidx.media2.player.m.e {

        class a implements d1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.media2.common.VideoSize f58115a;

            a(androidx.media2.common.VideoSize videoSize) {
                this.f58115a = videoSize;
            }

            @Override // androidx.media2.player.MediaPlayer.d1
            public void a(SessionPlayer.b bVar) {
                bVar.q(MediaPlayer.this, this.f58115a);
            }
        }

        class b implements t0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaItem f58117a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.media2.player.t f58118b;

            b(MediaItem mediaItem, androidx.media2.player.t tVar) {
                this.f58117a = mediaItem;
                this.f58118b = tVar;
            }

            @Override // androidx.media2.player.MediaPlayer.t0
            public void a(b1 b1Var) {
                b1Var.v(MediaPlayer.this, this.f58117a, this.f58118b);
            }
        }

        class c implements t0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaItem f58120a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f58121b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f58122c;

            c(MediaItem mediaItem, int i10, int i11) {
                this.f58120a = mediaItem;
                this.f58121b = i10;
                this.f58122c = i11;
            }

            @Override // androidx.media2.player.MediaPlayer.t0
            public void a(b1 b1Var) {
                b1Var.s(MediaPlayer.this, this.f58120a, this.f58121b, this.f58122c);
            }
        }

        class d implements d1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaItem f58124a;

            d(MediaItem mediaItem) {
                this.f58124a = mediaItem;
            }

            @Override // androidx.media2.player.MediaPlayer.d1
            public void a(SessionPlayer.b bVar) {
                bVar.d(MediaPlayer.this, this.f58124a);
            }
        }

        class e extends a1<SessionPlayer.c> {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ MediaItem f58126l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Executor executor, MediaItem mediaItem) {
                super(executor);
                this.f58126l = mediaItem;
            }

            @Override // androidx.media2.player.MediaPlayer.a1
            List<androidx.concurrent.futures.e<SessionPlayer.c>> R() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(MediaPlayer.this.s1(this.f58126l));
                return arrayList;
            }
        }

        class f implements d1 {
            f() {
            }

            @Override // androidx.media2.player.MediaPlayer.d1
            public void a(SessionPlayer.b bVar) {
                bVar.e(MediaPlayer.this);
            }
        }

        class g implements t0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaItem f58129a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f58130b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f58131c;

            g(MediaItem mediaItem, int i10, int i11) {
                this.f58129a = mediaItem;
                this.f58130b = i10;
                this.f58131c = i11;
            }

            @Override // androidx.media2.player.MediaPlayer.t0
            public void a(b1 b1Var) {
                b1Var.t(MediaPlayer.this, this.f58129a, this.f58130b, this.f58131c);
            }
        }

        class h implements t0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaItem f58133a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.media2.player.n f58134b;

            h(MediaItem mediaItem, androidx.media2.player.n nVar) {
                this.f58133a = mediaItem;
                this.f58134b = nVar;
            }

            @Override // androidx.media2.player.MediaPlayer.t0
            public void a(b1 b1Var) {
                b1Var.u(MediaPlayer.this, this.f58133a, this.f58134b);
            }
        }

        class i implements d1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaItem f58136a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SessionPlayer.TrackInfo f58137b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SubtitleData f58138c;

            i(MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
                this.f58136a = mediaItem;
                this.f58137b = trackInfo;
                this.f58138c = subtitleData;
            }

            @Override // androidx.media2.player.MediaPlayer.d1
            public void a(SessionPlayer.b bVar) {
                bVar.m(MediaPlayer.this, this.f58136a, this.f58137b, this.f58138c);
            }
        }

        v0() {
        }

        @Override // androidx.media2.player.m.e
        public void a(androidx.media2.player.m mVar, MediaItem mediaItem, int i10, int i11) {
            MediaPlayer.this.B0(mVar, mediaItem, i10, i11);
        }

        @Override // androidx.media2.player.m.e
        public void b(androidx.media2.player.m mVar, Object obj) {
        }

        @Override // androidx.media2.player.m.e
        public void c(androidx.media2.player.m mVar, MediaItem mediaItem, int i10, int i11) {
            MediaPlayer.this.J1(3);
            MediaPlayer.this.j1(mediaItem, 0);
            MediaPlayer.this.H0(new c(mediaItem, i10, i11));
        }

        /* JADX WARN: Code duplicated, block: B:18:0x002e  */
        @Override // androidx.media2.player.m.e
        public void d(androidx.media2.player.m mVar, MediaItem mediaItem, int i10, int i11) {
            MediaItem mediaItem2;
            MediaPlayer mediaPlayer;
            MediaItem mediaItem3;
            boolean z10 = true;
            if (i10 == 2) {
                synchronized (MediaPlayer.this.f57987j3) {
                    try {
                        MediaPlayer mediaPlayer2 = MediaPlayer.this;
                        if (mediaPlayer2.f57997q3 == mediaItem) {
                            z10 = false;
                            mediaItem2 = null;
                        } else {
                            mediaPlayer2.f57996p3 = mediaPlayer2.f57989l3.indexOf(mediaItem);
                            MediaPlayer.this.b2();
                            mediaItem2 = MediaPlayer.this.f57998r3;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    MediaPlayer.this.M0(new d(mediaItem));
                    if (mediaItem2 != null) {
                        MediaPlayer.this.r(new e(MediaPlayer.this.Z, mediaItem2));
                    }
                }
            } else if (i10 == 6) {
                synchronized (MediaPlayer.this.f57987j3) {
                    try {
                        MediaPlayer mediaPlayer3 = MediaPlayer.this;
                        mediaPlayer3.f57996p3 = mediaPlayer3.f57989l3.indexOf(mediaItem);
                        mediaPlayer = MediaPlayer.this;
                        mediaItem3 = mediaPlayer.f57998r3;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (mediaItem3 == null) {
                    mediaPlayer.J1(1);
                    MediaPlayer.this.M0(new f());
                } else if (mediaPlayer.h() == null) {
                    new IllegalStateException();
                    MediaPlayer.this.J1(3);
                }
            } else if (i10 == 100) {
                MediaPlayer.this.j1(mediaItem, 1);
            } else if (i10 != 704) {
                if (i10 == 701) {
                    MediaPlayer.this.j1(mediaItem, 2);
                } else if (i10 == 702) {
                    MediaPlayer.this.j1(mediaItem, 1);
                }
            } else if (i11 >= 100) {
                MediaPlayer.this.j1(mediaItem, 3);
            }
            if (MediaPlayer.f57974c4.containsKey(Integer.valueOf(i10))) {
                MediaPlayer.this.H0(new g(mediaItem, MediaPlayer.f57974c4.get(Integer.valueOf(i10)).intValue(), i11));
            }
        }

        @Override // androidx.media2.player.m.e
        public void e(androidx.media2.player.m mVar, MediaItem mediaItem, androidx.media2.player.n nVar) {
            MediaPlayer.this.H0(new h(mediaItem, nVar));
        }

        @Override // androidx.media2.player.m.e
        public void f(@NonNull androidx.media2.player.m mVar, @NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) {
            MediaPlayer.this.M0(new i(mediaItem, trackInfo, subtitleData));
        }

        @Override // androidx.media2.player.m.e
        public void g(androidx.media2.player.m mVar, MediaItem mediaItem, androidx.media2.player.t tVar) {
            MediaPlayer.this.H0(new b(mediaItem, tVar));
        }

        @Override // androidx.media2.player.m.e
        public void h(@NonNull androidx.media2.player.m mVar, @NonNull final List<SessionPlayer.TrackInfo> list) {
            MediaPlayer.this.M0(new d1() { // from class: androidx.media2.player.l
                @Override // androidx.media2.player.MediaPlayer.d1
                public final void a(SessionPlayer.b bVar) {
                    bVar.p(MediaPlayer.this, list);
                }
            });
        }

        @Override // androidx.media2.player.m.e
        public void i(androidx.media2.player.m mVar, MediaItem mediaItem, int i10, int i11) {
            MediaItem mediaItemZ = MediaPlayer.this.Z();
            if (mediaItemZ != null && mediaItemZ == mediaItem) {
                MediaPlayer.this.M0(new a(new androidx.media2.common.VideoSize(i10, i11)));
            }
        }
    }

    class w implements androidx.media2.player.m.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0 f58140a;

        w(y0 y0Var) {
            this.f58140a = y0Var;
        }

        @Override // androidx.media2.player.m.k
        public void a(androidx.media2.player.m mVar, MediaItem mediaItem) {
            this.f58140a.a(MediaPlayer.this, mediaItem);
        }
    }

    class w0 extends androidx.media2.player.m.c {

        class a implements t0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaItem f58143a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.media2.player.m.d f58144b;

            a(MediaItem mediaItem, androidx.media2.player.m.d dVar) {
                this.f58143a = mediaItem;
                this.f58144b = dVar;
            }

            @Override // androidx.media2.player.MediaPlayer.t0
            public void a(b1 b1Var) {
                MediaPlayer mediaPlayer = MediaPlayer.this;
                MediaItem mediaItem = this.f58143a;
                androidx.media2.player.m.d dVar = this.f58144b;
                b1Var.r(mediaPlayer, mediaItem, dVar == null ? null : new o0(dVar));
            }
        }

        w0() {
        }

        @Override // androidx.media2.player.m.c
        public void a(androidx.media2.player.m mVar, MediaItem mediaItem, androidx.media2.player.m.d dVar) {
            MediaPlayer.this.H0(new a(mediaItem, dVar));
        }

        @Override // androidx.media2.player.m.c
        public void b(androidx.media2.player.m mVar, MediaItem mediaItem, int i10) {
            MediaPlayer.this.B0(mVar, mediaItem, 1001, i10);
        }
    }

    class x implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f58146a;

        x(int i10) {
            this.f58146a = i10;
        }

        @Override // androidx.media2.player.MediaPlayer.d1
        public void a(SessionPlayer.b bVar) {
            bVar.g(MediaPlayer.this, this.f58146a);
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static class x0 extends Exception {
        public x0(@androidx.annotation.p0 String str) {
            super(str);
        }
    }

    class y implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaItem f58148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58149b;

        y(MediaItem mediaItem, int i10) {
            this.f58148a = mediaItem;
            this.f58149b = i10;
        }

        @Override // androidx.media2.player.MediaPlayer.d1
        public void a(SessionPlayer.b bVar) {
            bVar.c(MediaPlayer.this, this.f58148a, this.f58149b);
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public interface y0 {
        void a(@NonNull MediaPlayer mediaPlayer, @NonNull MediaItem mediaItem);
    }

    class z implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d1 f58151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SessionPlayer.b f58152b;

        z(d1 d1Var, SessionPlayer.b bVar) {
            this.f58151a = d1Var;
            this.f58152b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58151a.a(this.f58152b);
        }
    }

    static final class z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f58154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final androidx.concurrent.futures.e<? extends SessionPlayer.c> f58155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final SessionPlayer.TrackInfo f58156c;

        z0(int i10, androidx.concurrent.futures.e<? extends SessionPlayer.c> eVar) {
            this(i10, eVar, null);
        }

        <V extends SessionPlayer.c> void a(V v10) {
            this.f58155b.E(v10);
        }

        z0(int i10, androidx.concurrent.futures.e<? extends SessionPlayer.c> eVar, SessionPlayer.TrackInfo trackInfo) {
            this.f58154a = i10;
            this.f58155b = eVar;
            this.f58156c = trackInfo;
        }
    }

    static {
        androidx.collection.a<Integer, Integer> aVar = new androidx.collection.a<>();
        f57972a4 = aVar;
        aVar.put(0, 0);
        f57972a4.put(Integer.MIN_VALUE, -1);
        f57972a4.put(1, -2);
        f57972a4.put(2, -3);
        f57972a4.put(3, -4);
        f57972a4.put(4, -5);
        f57972a4.put(5, 1);
        androidx.collection.a<Integer, Integer> aVar2 = new androidx.collection.a<>();
        f57973b4 = aVar2;
        aVar2.put(1, 1);
        f57973b4.put(-1004, -1004);
        f57973b4.put(-1007, -1007);
        f57973b4.put(-1010, -1010);
        f57973b4.put(-110, -110);
        androidx.collection.a<Integer, Integer> aVar3 = new androidx.collection.a<>();
        f57974c4 = aVar3;
        aVar3.put(3, 3);
        f57974c4.put(700, 700);
        f57974c4.put(704, 704);
        f57974c4.put(800, 800);
        f57974c4.put(801, 801);
        f57974c4.put(802, 802);
        f57974c4.put(804, 804);
        f57974c4.put(805, 805);
        androidx.collection.a<Integer, Integer> aVar4 = new androidx.collection.a<>();
        f57975d4 = aVar4;
        aVar4.put(0, 0);
        f57975d4.put(1, 1);
        f57975d4.put(2, 2);
        f57975d4.put(3, 3);
        androidx.collection.a<Integer, Integer> aVar5 = new androidx.collection.a<>();
        f57976e4 = aVar5;
        aVar5.put(0, 0);
        f57976e4.put(1, Integer.valueOf(p0.f58085t));
        f57976e4.put(2, Integer.valueOf(p0.f58087v));
        f57976e4.put(3, Integer.valueOf(p0.f58087v));
        f57976e4.put(4, -1004);
        f57976e4.put(5, Integer.valueOf(p0.f58089x));
    }

    public MediaPlayer(@NonNull Context context) {
        if (context == null) {
            throw new NullPointerException("context shouldn't be null");
        }
        this.f57995p2 = 0;
        this.Y = androidx.media2.player.m.x(context);
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
        this.Z = executorServiceNewFixedThreadPool;
        this.Y.k0(executorServiceNewFixedThreadPool, new v0());
        this.Y.i0(this.Z, new w0());
        this.f57996p3 = -2;
        this.f57986i3 = new androidx.media2.player.a(context, this);
    }

    private void T() {
        synchronized (this.f57994p1) {
            try {
                Iterator<a1<? extends SessionPlayer.c>> it = this.f57994p1.iterator();
                while (it.hasNext()) {
                    a1<? extends SessionPlayer.c> next = it.next();
                    if (!next.isCancelled() && !next.O()) {
                        break;
                    }
                    this.f57994p1.removeFirst();
                }
                while (it.hasNext()) {
                    a1<? extends SessionPlayer.c> next2 = it.next();
                    if (!next2.f58009i) {
                        break;
                    } else {
                        next2.O();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private androidx.concurrent.futures.e<SessionPlayer.c> o1(MediaItem mediaItem) {
        androidx.concurrent.futures.e<SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
        synchronized (this.f57993p0) {
            o(19, eVarN, this.Y.l0(mediaItem));
        }
        synchronized (this.f57987j3) {
            this.f57999s3 = true;
        }
        return eVarN;
    }

    static int y(int i10, int i11) {
        if (i10 < 0) {
            return 0;
        }
        return i10 > i11 ? i11 : i10;
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> A() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                i0 i0Var = new i0(this.Z);
                r(i0Var);
                return i0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> A0(@NonNull SessionPlayer.TrackInfo trackInfo) {
        if (trackInfo == null) {
            throw new NullPointerException("trackInfo shouldn't be null");
        }
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                s sVar = new s(this.Z, trackInfo);
                r(sVar);
                return sVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> B() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                v vVar = new v(this.Z);
                r(vVar);
                return vVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    void B0(androidx.media2.player.m mVar, MediaItem mediaItem, int i10, int i11) {
        z0 z0VarPollFirst;
        synchronized (this.f57993p0) {
            z0VarPollFirst = this.f57993p0.pollFirst();
        }
        if (z0VarPollFirst == null) {
            return;
        }
        if (i10 != z0VarPollFirst.f58154a) {
            i11 = Integer.MIN_VALUE;
        }
        if (i11 == 0) {
            if (i10 == 2) {
                M0(new h0(z0VarPollFirst));
            } else if (i10 == 19) {
                M0(new c0(mediaItem));
            } else if (i10 == 24) {
                M0(new d0(this.Y.K().d().floatValue()));
            } else if (i10 == 29) {
                M0(new c0(mediaItem));
            } else if (i10 == 4) {
                J1(1);
            } else if (i10 == 5) {
                J1(2);
            } else if (i10 != 6) {
                switch (i10) {
                    case 14:
                        M0(new b0(getCurrentPosition()));
                        break;
                    case 15:
                        M0(new f0(z0VarPollFirst));
                        break;
                    case 16:
                        M0(new e0(this.Y.z()));
                        break;
                }
            } else {
                J1(1);
            }
        }
        if (i10 != 1001) {
            z0VarPollFirst.a(new SessionPlayer.c(f57972a4.containsKey(Integer.valueOf(i11)) ? f57972a4.get(Integer.valueOf(i11)).intValue() : -1, mediaItem));
        } else {
            z0VarPollFirst.a(new p0(f57976e4.containsKey(Integer.valueOf(i11)) ? f57976e4.get(Integer.valueOf(i11)).intValue() : p0.f58087v, mediaItem));
        }
        T();
    }

    @NonNull
    public t1<SessionPlayer.c> B1(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("volume should be between 0.0 and 1.0");
        }
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                m mVar = new m(this.Z, f10);
                r(mVar);
                return mVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    public int C() {
        int i10;
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return 0;
                }
                synchronized (this.f57987j3) {
                    i10 = this.f57991n3;
                }
                return i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> D(int i10) {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                i iVar = new i(this.Z, i10);
                r(iVar);
                return iVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    androidx.concurrent.futures.e<SessionPlayer.c> E() {
        androidx.concurrent.futures.e<SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
        eVarN.E(new SessionPlayer.c(-2, null));
        return eVarN;
    }

    androidx.concurrent.futures.e<SessionPlayer.c> E1(float f10) {
        androidx.concurrent.futures.e<SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
        synchronized (this.f57993p0) {
            try {
                o(26, eVarN, this.Y.q0(f10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVarN;
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> F(long j10) {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                int i10 = 5 ^ 1;
                j0 j0Var = new j0(this.Z, true, j10);
                r(j0Var);
                return j0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> G(@androidx.annotation.x(from = 0.0d, fromInclusive = false, to = 3.4028234663852886E38d) float f10) {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                k0 k0Var = new k0(this.Z, f10);
                r(k0Var);
                return k0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> G0(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                b bVar = new b(this.Z, i10);
                r(bVar);
                return bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public List<SessionPlayer.TrackInfo> G1() {
        synchronized (this.H1) {
            try {
                if (!this.f57985h3) {
                    return this.Y.P();
                }
                return Collections.EMPTY_LIST;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    androidx.concurrent.futures.e<SessionPlayer.c> H(int i10) {
        return I(i10, null);
    }

    void H0(t0 t0Var) {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return;
                }
                for (androidx.core.util.p<SessionPlayer.b, Executor> pVar : c()) {
                    SessionPlayer.b bVar = pVar.f48411a;
                    if (bVar instanceof b1) {
                        pVar.f48412b.execute(new a0(t0Var, (b1) bVar));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> H1(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                g gVar = new g(this.Z, i10);
                r(gVar);
                return gVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    androidx.concurrent.futures.e<SessionPlayer.c> I(int i10, MediaItem mediaItem) {
        androidx.concurrent.futures.e<SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
        if (mediaItem == null) {
            mediaItem = this.Y.C();
        }
        eVarN.E(new SessionPlayer.c(i10, mediaItem));
        return eVarN;
    }

    @Override // androidx.media2.common.SessionPlayer
    public int J() {
        int i10;
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return 0;
                }
                synchronized (this.f57987j3) {
                    try {
                        i10 = this.f57992o3;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return i10;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    void J1(int i10) {
        boolean z10;
        synchronized (this.H1) {
            try {
                if (this.f57995p2 != i10) {
                    this.f57995p2 = i10;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            M0(new x(i10));
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> K(int i10) {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                j jVar = new j(this.Z, i10);
                r(jVar);
                return jVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> K0(@NonNull SessionPlayer.TrackInfo trackInfo) {
        if (trackInfo == null) {
            throw new NullPointerException("trackInfo shouldn't be null");
        }
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                t tVar = new t(this.Z, trackInfo);
                r(tVar);
                return tVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void M0(d1 d1Var) {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return;
                }
                for (androidx.core.util.p<SessionPlayer.b, Executor> pVar : c()) {
                    pVar.f48412b.execute(new z(d1Var, pVar.f48411a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    List<androidx.concurrent.futures.e<SessionPlayer.c>> N(int i10) {
        return R(i10, null);
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public t1<p0> O0(@NonNull UUID uuid) {
        if (uuid == null) {
            throw new NullPointerException("uuid shouldn't be null");
        }
        u uVar = new u(this.Z, uuid);
        r(uVar);
        return uVar;
    }

    androidx.concurrent.futures.e<SessionPlayer.c> O1() {
        androidx.concurrent.futures.e<SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
        synchronized (this.f57993p0) {
            try {
                o(29, eVarN, this.Y.s0());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVarN;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.p0
    public byte[] Q0(@androidx.annotation.p0 byte[] bArr, @NonNull byte[] bArr2) throws DeniedByServerException, x0 {
        try {
            return this.Y.Y(bArr, bArr2);
        } catch (androidx.media2.player.m.j e10) {
            throw new x0(e10.getMessage());
        }
    }

    List<androidx.concurrent.futures.e<SessionPlayer.c>> R(int i10, MediaItem mediaItem) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(I(i10, mediaItem));
        return arrayList;
    }

    public void R0(@NonNull Executor executor, @NonNull b1 b1Var) {
        super.d(executor, b1Var);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public void T0() throws x0 {
        try {
            this.Y.Z();
        } catch (androidx.media2.player.m.j e10) {
            throw new x0(e10.getMessage());
        }
    }

    public void T1(@NonNull b1 b1Var) {
        super.l(b1Var);
    }

    void U0() {
        synchronized (this.H1) {
            try {
                this.f57995p2 = 0;
                this.f57984g3.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f57987j3) {
            try {
                this.f57988k3.b();
                this.f57989l3.clear();
                this.f57997q3 = null;
                this.f57998r3 = null;
                this.f57996p3 = -1;
                this.f57999s3 = false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f57986i3.d();
        this.Y.a0();
    }

    @Override // androidx.media2.common.SessionPlayer
    @androidx.annotation.p0
    public MediaMetadata V() {
        MediaMetadata mediaMetadata;
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return null;
                }
                synchronized (this.f57987j3) {
                    try {
                        mediaMetadata = this.f57990m3;
                    } finally {
                    }
                }
                return mediaMetadata;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @androidx.annotation.p0
    public List<MediaItem> V0() {
        synchronized (this.H1) {
            try {
                ArrayList arrayList = null;
                if (this.f57985h3) {
                    return null;
                }
                synchronized (this.f57987j3) {
                    try {
                        if (!this.f57988k3.g()) {
                            arrayList = new ArrayList(this.f57988k3.e());
                        }
                    } finally {
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int X() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return 0;
                }
                return this.Y.A();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.p0
    public o0 Y() {
        androidx.media2.player.m.d dVarE = this.Y.E();
        if (dVarE == null) {
            return null;
        }
        return new o0(dVarE);
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> Y0(@NonNull List<MediaItem> list, @androidx.annotation.p0 MediaMetadata mediaMetadata) {
        String str;
        if (list == null) {
            throw new NullPointerException("list shouldn't be null");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("list shouldn't be empty");
        }
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                Iterator<MediaItem> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    MediaItem next = it.next();
                    if (next == null) {
                        str = "list shouldn't contain null item";
                        break;
                    }
                    if ((next instanceof FileMediaItem) && ((FileMediaItem) next).w()) {
                        str = "File descriptor is closed. " + next;
                        break;
                    }
                }
                if (str == null) {
                    n0 n0Var = new n0(this.Z, mediaMetadata, list);
                    r(n0Var);
                    return n0Var;
                }
                for (MediaItem mediaItem : list) {
                    if (mediaItem instanceof FileMediaItem) {
                        FileMediaItem fileMediaItem = (FileMediaItem) mediaItem;
                        fileMediaItem.v();
                        fileMediaItem.r();
                    }
                }
                throw new IllegalArgumentException(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @androidx.annotation.p0
    public MediaItem Z() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return null;
                }
                return this.Y.C();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> Z0(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("indices shouldn't be negative");
        }
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                d dVar = new d(this.Z, i10, i11);
                r(dVar);
                return dVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> a(int i10, @NonNull MediaItem mediaItem) {
        if (mediaItem == null) {
            throw new NullPointerException("item shouldn't be null");
        }
        if ((mediaItem instanceof FileMediaItem) && ((FileMediaItem) mediaItem).w()) {
            throw new IllegalArgumentException("File descriptor is closed. " + mediaItem);
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                a aVar = new a(this.Z, mediaItem, i10);
                r(aVar);
                return aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    public int a0() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return -1;
                }
                synchronized (this.f57987j3) {
                    try {
                        int i10 = this.f57996p3;
                        if (i10 < 0) {
                            return -1;
                        }
                        int i11 = i10 - 1;
                        if (i11 >= 0) {
                            return this.f57988k3.f(this.f57989l3.get(i11));
                        }
                        int i12 = this.f57991n3;
                        if (i12 != 2 && i12 != 3) {
                            return -1;
                        }
                        s0 s0Var = this.f57988k3;
                        ArrayList<MediaItem> arrayList = this.f57989l3;
                        return s0Var.f(arrayList.get(arrayList.size() - 1));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> a1(@androidx.annotation.p0 MediaMetadata mediaMetadata) {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                h hVar = new h(this.Z, mediaMetadata);
                r(hVar);
                return hVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @androidx.annotation.p0
    public AudioAttributesCompat b() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return null;
                }
                try {
                    return this.Y.z();
                } catch (IllegalStateException unused) {
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public void b1(@NonNull byte[] bArr) throws x0 {
        if (bArr == null) {
            throw new NullPointerException("keySetId shouldn't be null");
        }
        try {
            this.Y.b0(bArr);
        } catch (androidx.media2.player.m.j e10) {
            throw new x0(e10.getMessage());
        }
    }

    androidx.core.util.p<MediaItem, MediaItem> b2() {
        MediaItem mediaItem;
        MediaItem mediaItem2;
        if (this.f57996p3 >= 0 && !this.f57988k3.g()) {
            if (androidx.core.util.o.a(this.f57997q3, this.f57989l3.get(this.f57996p3))) {
                mediaItem = null;
            } else {
                mediaItem = this.f57989l3.get(this.f57996p3);
                this.f57997q3 = mediaItem;
            }
            int i10 = this.f57996p3 + 1;
            if (i10 >= this.f57989l3.size()) {
                int i11 = this.f57991n3;
                i10 = (i11 == 2 || i11 == 3) ? 0 : -1;
            }
            if (i10 != -1) {
                if (!androidx.core.util.o.a(this.f57998r3, this.f57989l3.get(i10))) {
                    mediaItem2 = this.f57989l3.get(i10);
                    this.f57998r3 = mediaItem2;
                }
                if (mediaItem == null || mediaItem2 != null) {
                    return new androidx.core.util.p<>(mediaItem, mediaItem2);
                }
                return null;
            }
            this.f57998r3 = null;
            mediaItem2 = null;
            if (mediaItem == null) {
            }
            return new androidx.core.util.p<>(mediaItem, mediaItem2);
        }
        if (this.f57997q3 == null && this.f57998r3 == null) {
            return null;
        }
        this.f57997q3 = null;
        this.f57998r3 = null;
        return new androidx.core.util.p<>(null, null);
    }

    @Override // androidx.media2.common.SessionPlayer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this.H1) {
            try {
                if (!this.f57985h3) {
                    this.f57985h3 = true;
                    reset();
                    this.f57986i3.a();
                    this.Y.w();
                    this.Z.shutdown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public MediaDrm.KeyRequest d0(@androidx.annotation.p0 byte[] bArr, @androidx.annotation.p0 byte[] bArr2, @androidx.annotation.p0 String str, int i10, @androidx.annotation.p0 Map<String, String> map) throws x0 {
        try {
            return this.Y.F(bArr, bArr2, str, i10, map);
        } catch (androidx.media2.player.m.j e10) {
            throw new x0(e10.getMessage());
        }
    }

    @NonNull
    public t1<SessionPlayer.c> d1(long j10, int i10) {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                o oVar = new o(this.Z, true, i10, j10);
                r(oVar);
                return oVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> e(int i10, @NonNull MediaItem mediaItem) {
        if (mediaItem == null) {
            throw new NullPointerException("item shouldn't be null");
        }
        if ((mediaItem instanceof FileMediaItem) && ((FileMediaItem) mediaItem).w()) {
            throw new IllegalArgumentException("File descriptor is closed. " + mediaItem);
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                c cVar = new c(this.Z, i10, mediaItem);
                r(cVar);
                return cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    public int e0() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return -1;
                }
                synchronized (this.f57987j3) {
                    try {
                        int i10 = this.f57996p3;
                        if (i10 < 0) {
                            return -1;
                        }
                        int i11 = i10 + 1;
                        if (i11 < this.f57989l3.size()) {
                            return this.f57988k3.f(this.f57989l3.get(i11));
                        }
                        int i12 = this.f57991n3;
                        if (i12 != 2 && i12 != 3) {
                            return -1;
                        }
                        return this.f57988k3.f(this.f57989l3.get(0));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @NonNull
    @Deprecated
    public t1<SessionPlayer.c> e1(@NonNull TrackInfo trackInfo) {
        return A0(trackInfo);
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> f(@NonNull AudioAttributesCompat audioAttributesCompat) {
        if (audioAttributesCompat == null) {
            throw new NullPointerException("attr shouldn't be null");
        }
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                l0 l0Var = new l0(this.Z, audioAttributesCompat);
                r(l0Var);
                return l0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public String f0(@NonNull String str) throws x0 {
        if (str == null) {
            throw new NullPointerException("propertyName shouldn't be null");
        }
        try {
            return this.Y.G(str);
        } catch (androidx.media2.player.m.j e10) {
            throw new x0(e10.getMessage());
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> g(@NonNull MediaItem mediaItem) {
        if (mediaItem == null) {
            throw new NullPointerException("item shouldn't be null");
        }
        if ((mediaItem instanceof FileMediaItem) && ((FileMediaItem) mediaItem).w()) {
            throw new IllegalArgumentException("File descriptor is closed. " + mediaItem);
        }
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                m0 m0Var = new m0(this.Z, mediaItem);
                r(m0Var);
                return m0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public float g0() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return 1.0f;
                }
                return this.Y.I();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public t1<SessionPlayer.c> g1(int i10) {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                p pVar = new p(this.Z, i10);
                r(pVar);
                return pVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    public long getCurrentPosition() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return Long.MIN_VALUE;
                }
                try {
                    long jD = this.Y.D();
                    if (jD >= 0) {
                        return jD;
                    }
                    return Long.MIN_VALUE;
                } catch (IllegalStateException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    public long getDuration() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return Long.MIN_VALUE;
                }
                try {
                    long jH = this.Y.H();
                    if (jH >= 0) {
                        return jH;
                    }
                    return Long.MIN_VALUE;
                } catch (IllegalStateException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> h() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                f fVar = new f(this.Z);
                r(fVar);
                return fVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public t1<SessionPlayer.c> h1(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            return H(-3);
        }
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                r rVar = new r(this.Z, f10);
                r(rVar);
                return rVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    public int i1() {
        Integer num;
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return 0;
                }
                synchronized (this.H1) {
                    try {
                        num = this.f57984g3.get(this.Y.C());
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> j() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                e eVar = new e(this.Z);
                r(eVar);
                return eVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.w0(21)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public PersistableBundle j0() {
        return this.Y.J();
    }

    void j1(MediaItem mediaItem, int i10) {
        Integer numPut;
        synchronized (this.H1) {
            try {
                numPut = this.f57984g3.put(mediaItem, Integer.valueOf(i10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (numPut == null || numPut.intValue() != i10) {
            M0(new y(mediaItem, i10));
        }
    }

    @NonNull
    public androidx.media2.player.p k0() {
        synchronized (this.H1) {
            try {
                if (!this.f57985h3) {
                    return this.Y.K();
                }
                return X3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    public int l0() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return -1;
                }
                synchronized (this.f57987j3) {
                    try {
                        int i10 = this.f57996p3;
                        if (i10 < 0) {
                            return -1;
                        }
                        return this.f57988k3.f(this.f57989l3.get(i10));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public void l1(@NonNull String str, @NonNull String str2) throws x0 {
        if (str == null) {
            throw new NullPointerException("propertyName shouldn't be null");
        }
        if (str2 == null) {
            throw new NullPointerException("value shouldn't be null");
        }
        try {
            this.Y.j0(str, str2);
        } catch (androidx.media2.player.m.j e10) {
            throw new x0(e10.getMessage());
        }
    }

    void m(z0 z0Var, androidx.concurrent.futures.e<? extends SessionPlayer.c> eVar, Object obj) {
        eVar.m0(new k(eVar, obj, z0Var), this.Z);
    }

    @androidx.annotation.b0("mPendingCommands")
    void o(int i10, androidx.concurrent.futures.e<? extends SessionPlayer.c> eVar, Object obj) {
        z0 z0Var = new z0(i10, eVar);
        this.f57993p0.add(z0Var);
        m(z0Var, eVar, obj);
    }

    public float o0() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return 1.0f;
                }
                return this.Y.L();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    List<androidx.concurrent.futures.e<SessionPlayer.c>> p1(@NonNull MediaItem mediaItem, @androidx.annotation.p0 MediaItem mediaItem2) {
        boolean z10;
        if (mediaItem == null) {
            throw new NullPointerException("curItem shouldn't be null");
        }
        synchronized (this.f57987j3) {
            try {
                z10 = this.f57999s3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(s1(mediaItem));
            arrayList.add(O1());
        } else {
            arrayList.add(o1(mediaItem));
        }
        if (mediaItem2 != null) {
            arrayList.add(s1(mediaItem2));
        }
        return arrayList;
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> pause() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                g0 g0Var = new g0(this.Z);
                r(g0Var);
                return g0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.b0("mPendingCommands")
    void q(int i10, androidx.concurrent.futures.e<? extends SessionPlayer.c> eVar, SessionPlayer.TrackInfo trackInfo, Object obj) {
        z0 z0Var = new z0(i10, eVar, trackInfo);
        this.f57993p0.add(z0Var);
        m(z0Var, eVar, obj);
    }

    void r(a1<? extends SessionPlayer.c> a1Var) {
        synchronized (this.f57994p1) {
            this.f57994p1.add(a1Var);
            T();
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @androidx.annotation.p0
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public TrackInfo I1(int i10) {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return null;
                }
                SessionPlayer.TrackInfo trackInfoM = this.Y.M(i10);
                if (trackInfoM == null) {
                    return null;
                }
                return new TrackInfo(trackInfoM);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void reset() {
        synchronized (this.f57993p0) {
            try {
                Iterator<z0> it = this.f57993p0.iterator();
                while (it.hasNext()) {
                    it.next().f58155b.cancel(true);
                }
                this.f57993p0.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f57994p1) {
            try {
                for (a1<? extends SessionPlayer.c> a1Var : this.f57994p1) {
                    if (a1Var.f58010j && !a1Var.isDone() && !a1Var.isCancelled()) {
                        a1Var.cancel(true);
                    }
                }
                this.f57994p1.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        U0();
    }

    @Override // androidx.media2.common.SessionPlayer
    public int s0() {
        int i10;
        synchronized (this.H1) {
            try {
                i10 = this.f57995p2;
            } finally {
            }
        }
        return i10;
    }

    androidx.concurrent.futures.e<SessionPlayer.c> s1(MediaItem mediaItem) {
        androidx.concurrent.futures.e<SessionPlayer.c> eVarN = androidx.concurrent.futures.e.N();
        synchronized (this.f57993p0) {
            o(22, eVarN, this.Y.m0(mediaItem));
        }
        return eVarN;
    }

    void t() {
        this.f57989l3.clear();
        this.f57989l3.addAll(this.f57988k3.e());
        int i10 = this.f57992o3;
        if (i10 != 1 && i10 != 2) {
            return;
        }
        Collections.shuffle(this.f57989l3);
    }

    @Override // androidx.media2.common.SessionPlayer
    @androidx.annotation.x(from = 0.0d, fromInclusive = false, to = 3.4028234663852886E38d)
    public float t0() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return 1.0f;
                }
                try {
                    return this.Y.K().d().floatValue();
                } catch (IllegalStateException unused) {
                    return 1.0f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public void u1(@androidx.annotation.p0 y0 y0Var) {
        this.Y.o0(y0Var == null ? null : new w(y0Var));
    }

    @Override // androidx.media2.common.SessionPlayer
    public long v() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return Long.MIN_VALUE;
                }
                try {
                    long jB = this.Y.B();
                    if (jB >= 0) {
                        return jB;
                    }
                } catch (IllegalStateException unused) {
                }
                return Long.MIN_VALUE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.p0
    public androidx.media2.player.n w0() {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return null;
                }
                return this.Y.O();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public t1<SessionPlayer.c> w1(@NonNull androidx.media2.player.p pVar) {
        if (pVar == null) {
            throw new NullPointerException("params shouldn't be null");
        }
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                n nVar = new n(this.Z, pVar);
                r(nVar);
                return nVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public t1<SessionPlayer.c> x(int i10) {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                q qVar = new q(this.Z, i10);
                r(qVar);
                return qVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @Deprecated
    public List<TrackInfo> x0() {
        List<SessionPlayer.TrackInfo> listG1 = G1();
        ArrayList arrayList = new ArrayList();
        Iterator<SessionPlayer.TrackInfo> it = listG1.iterator();
        while (it.hasNext()) {
            arrayList.add(new TrackInfo(it.next()));
        }
        return arrayList;
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public VideoSize h0() {
        synchronized (this.H1) {
            try {
                if (!this.f57985h3) {
                    return new VideoSize(this.Y.R(), this.Y.Q());
                }
                return new VideoSize(0, 0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.common.SessionPlayer
    @NonNull
    public t1<SessionPlayer.c> z0(@androidx.annotation.p0 Surface surface) {
        synchronized (this.H1) {
            try {
                if (this.f57985h3) {
                    return E();
                }
                l lVar = new l(this.Z, surface);
                r(lVar);
                return lVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
