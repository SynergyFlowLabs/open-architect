package androidx.media2.session;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.media.AudioAttributesCompat;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.Rating;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import com.google.common.util.concurrent.t1;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class MediaController implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f58504h = "MediaController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f58505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    g f58506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    boolean f58507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final e f58508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Executor f58509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private final List<androidx.core.util.p<e, Executor>> f58510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Long f58511g;

    public static final class PlaybackInfo implements androidx.versionedparcelable.h {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f58512v = 1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f58513w = 2;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f58514q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58515r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f58516s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f58517t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        AudioAttributesCompat f58518u;

        PlaybackInfo() {
        }

        static PlaybackInfo d(int i10, AudioAttributesCompat audioAttributesCompat, int i11, int i12, int i13) {
            return new PlaybackInfo(i10, audioAttributesCompat, i11, i12, i13);
        }

        public boolean equals(@p0 Object obj) {
            if (!(obj instanceof PlaybackInfo)) {
                return false;
            }
            PlaybackInfo playbackInfo = (PlaybackInfo) obj;
            return this.f58514q == playbackInfo.f58514q && this.f58515r == playbackInfo.f58515r && this.f58516s == playbackInfo.f58516s && this.f58517t == playbackInfo.f58517t && androidx.core.util.o.a(this.f58518u, playbackInfo.f58518u);
        }

        @p0
        public AudioAttributesCompat f() {
            return this.f58518u;
        }

        public int g() {
            return this.f58515r;
        }

        public int h() {
            return this.f58517t;
        }

        public int hashCode() {
            return androidx.core.util.o.b(Integer.valueOf(this.f58514q), Integer.valueOf(this.f58515r), Integer.valueOf(this.f58516s), Integer.valueOf(this.f58517t), this.f58518u);
        }

        public int i() {
            return this.f58516s;
        }

        public int j() {
            return this.f58514q;
        }

        PlaybackInfo(int i10, AudioAttributesCompat audioAttributesCompat, int i11, int i12, int i13) {
            this.f58514q = i10;
            this.f58518u = audioAttributesCompat;
            this.f58515r = i11;
            this.f58516s = i12;
            this.f58517t = i13;
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f58519a;

        a(f fVar) {
            this.f58519a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58519a.a(MediaController.this.f58508d);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f58521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f58522b;

        b(f fVar, e eVar) {
            this.f58521a = fVar;
            this.f58522b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58521a.a(this.f58522b);
        }
    }

    public static final class c extends d<MediaController, c, e> {
        public c(@NonNull Context context) {
            super(context);
        }

        @Override // androidx.media2.session.MediaController.d
        @NonNull
        public MediaController a() {
            SessionToken sessionToken = this.f58525b;
            if (sessionToken == null && this.f58526c == null) {
                throw new IllegalArgumentException("token and compat token shouldn't be both null");
            }
            return sessionToken != null ? new MediaController(this.f58524a, sessionToken, this.f58527d, this.f58528e, this.f58529f) : new MediaController(this.f58524a, this.f58526c, this.f58527d, this.f58528e, this.f58529f);
        }

        @Override // androidx.media2.session.MediaController.d
        @NonNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public c b(@NonNull Bundle bundle) {
            return (c) super.b(bundle);
        }

        @Override // androidx.media2.session.MediaController.d
        @NonNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public c c(@NonNull Executor executor, @NonNull e eVar) {
            return (c) super.c(executor, eVar);
        }

        @Override // androidx.media2.session.MediaController.d
        @NonNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public c d(@NonNull MediaSessionCompat.Token token) {
            return (c) super.d(token);
        }

        @Override // androidx.media2.session.MediaController.d
        @NonNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c e(@NonNull SessionToken sessionToken) {
            return (c) super.e(sessionToken);
        }
    }

    @b1({b1.a.LIBRARY})
    static abstract class d<T extends MediaController, U extends d<T, U, C>, C extends e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f58524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        SessionToken f58525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        MediaSessionCompat.Token f58526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Bundle f58527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Executor f58528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        e f58529f;

        d(@NonNull Context context) {
            if (context == null) {
                throw new NullPointerException("context shouldn't be null");
            }
            this.f58524a = context;
        }

        @NonNull
        abstract T a();

        @NonNull
        public U b(@NonNull Bundle bundle) {
            if (bundle == null) {
                throw new NullPointerException("connectionHints shouldn't be null");
            }
            if (a0.z(bundle)) {
                throw new IllegalArgumentException("connectionHints shouldn't contain any custom parcelables");
            }
            this.f58527d = new Bundle(bundle);
            return this;
        }

        @NonNull
        U c(@NonNull Executor executor, @NonNull C c10) {
            if (executor == null) {
                throw new NullPointerException("executor shouldn't be null");
            }
            if (c10 == null) {
                throw new NullPointerException("callback shouldn't be null");
            }
            this.f58528e = executor;
            this.f58529f = c10;
            return this;
        }

        @NonNull
        U d(@NonNull MediaSessionCompat.Token token) {
            if (token == null) {
                throw new NullPointerException("compatToken shouldn't be null");
            }
            this.f58526c = token;
            this.f58525b = null;
            return this;
        }

        @NonNull
        U e(@NonNull SessionToken sessionToken) {
            if (sessionToken == null) {
                throw new NullPointerException("token shouldn't be null");
            }
            this.f58525b = sessionToken;
            this.f58526c = null;
            return this;
        }
    }

    public static abstract class e {
        public void a(@NonNull MediaController mediaController, @NonNull SessionCommandGroup sessionCommandGroup) {
        }

        public void b(@NonNull MediaController mediaController, @NonNull MediaItem mediaItem, int i10) {
        }

        public void c(@NonNull MediaController mediaController, @NonNull SessionCommandGroup sessionCommandGroup) {
        }

        public void d(@NonNull MediaController mediaController, @p0 MediaItem mediaItem) {
        }

        @NonNull
        public SessionResult e(@NonNull MediaController mediaController, @NonNull SessionCommand sessionCommand, @p0 Bundle bundle) {
            return new SessionResult(-6);
        }

        public void f(@NonNull MediaController mediaController) {
        }

        public void g(@NonNull MediaController mediaController) {
        }

        public void h(@NonNull MediaController mediaController, @NonNull PlaybackInfo playbackInfo) {
        }

        public void i(@NonNull MediaController mediaController, float f10) {
        }

        public void j(@NonNull MediaController mediaController, int i10) {
        }

        public void k(@NonNull MediaController mediaController, @p0 List<MediaItem> list, @p0 MediaMetadata mediaMetadata) {
        }

        public void l(@NonNull MediaController mediaController, @p0 MediaMetadata mediaMetadata) {
        }

        public void m(@NonNull MediaController mediaController, int i10) {
        }

        public void n(@NonNull MediaController mediaController, long j10) {
        }

        public int o(@NonNull MediaController mediaController, @NonNull List<MediaSession.CommandButton> list) {
            return -6;
        }

        public void p(@NonNull MediaController mediaController, int i10) {
        }

        public void q(@NonNull MediaController mediaController, @NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) {
        }

        public void r(@NonNull MediaController mediaController, @NonNull SessionPlayer.TrackInfo trackInfo) {
        }

        public void s(@NonNull MediaController mediaController, @NonNull SessionPlayer.TrackInfo trackInfo) {
        }

        public void t(@NonNull MediaController mediaController, @NonNull List<SessionPlayer.TrackInfo> list) {
        }

        @b1({b1.a.LIBRARY})
        @Deprecated
        public void u(@NonNull MediaController mediaController, @NonNull MediaItem mediaItem, @NonNull VideoSize videoSize) {
        }

        public void v(@NonNull MediaController mediaController, @NonNull VideoSize videoSize) {
        }
    }

    @b1({b1.a.LIBRARY})
    public interface f {
        void a(@NonNull e eVar);
    }

    interface g extends Closeable {
        t1<SessionResult> A();

        t1<SessionResult> A0(SessionPlayer.TrackInfo trackInfo);

        t1<SessionResult> A1(int i10, int i11);

        @p0
        SessionToken A3();

        t1<SessionResult> B();

        int C();

        t1<SessionResult> D(int i10);

        t1<SessionResult> D1();

        t1<SessionResult> F(long j10);

        t1<SessionResult> G(float f10);

        t1<SessionResult> G0(int i10);

        @NonNull
        List<SessionPlayer.TrackInfo> G1();

        t1<SessionResult> H1(int i10);

        @p0
        SessionPlayer.TrackInfo I1(int i10);

        int J();

        t1<SessionResult> K(int i10);

        t1<SessionResult> K0(SessionPlayer.TrackInfo trackInfo);

        t1<SessionResult> K6(int i10, @NonNull String str);

        t1<SessionResult> Kc();

        t1<SessionResult> L0(int i10, int i11);

        @p0
        PendingIntent M();

        t1<SessionResult> M8(@NonNull SessionCommand sessionCommand, @p0 Bundle bundle);

        t1<SessionResult> N0();

        t1<SessionResult> P();

        @p0
        MediaMetadata V();

        @p0
        List<MediaItem> V0();

        t1<SessionResult> Y0(@NonNull List<String> list, @p0 MediaMetadata mediaMetadata);

        MediaItem Z();

        t1<SessionResult> Z0(int i10, int i11);

        t1<SessionResult> Zb(@NonNull String str);

        int a0();

        t1<SessionResult> a1(@p0 MediaMetadata mediaMetadata);

        @p0
        PlaybackInfo b0();

        int e0();

        @NonNull
        Context getContext();

        long getCurrentPosition();

        long getDuration();

        @NonNull
        VideoSize h0();

        int i1();

        boolean isConnected();

        t1<SessionResult> k9(int i10, @NonNull String str);

        int l0();

        t1<SessionResult> m3();

        t1<SessionResult> n0();

        @p0
        MediaBrowserCompat nb();

        @p0
        SessionCommandGroup p6();

        t1<SessionResult> pause();

        t1<SessionResult> q5(@NonNull Uri uri, @p0 Bundle bundle);

        int s0();

        float t0();

        long v();

        t1<SessionResult> xc(@NonNull String str, @NonNull Rating rating);

        t1<SessionResult> z0(@p0 Surface surface);
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface h {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface i {
    }

    MediaController(@NonNull Context context, @NonNull SessionToken sessionToken, @p0 Bundle bundle, @p0 Executor executor, @p0 e eVar) {
        Object obj = new Object();
        this.f58505a = obj;
        this.f58510f = new ArrayList();
        if (context == null) {
            throw new NullPointerException("context shouldn't be null");
        }
        if (sessionToken == null) {
            throw new NullPointerException("token shouldn't be null");
        }
        this.f58508d = eVar;
        this.f58509e = executor;
        synchronized (obj) {
            this.f58506b = d(context, sessionToken, bundle);
        }
    }

    public static /* synthetic */ void a(MediaController mediaController, e eVar) {
        mediaController.getClass();
        eVar.f(mediaController);
    }

    public static /* synthetic */ void b(final MediaController mediaController, Context context, Bundle bundle, MediaSessionCompat.Token token, SessionToken sessionToken) {
        boolean z10;
        synchronized (mediaController.f58505a) {
            try {
                z10 = mediaController.f58507c;
                if (!z10) {
                    mediaController.f58506b = mediaController.d(context, sessionToken, bundle);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            mediaController.g(new f() { // from class: androidx.media2.session.j
                @Override // androidx.media2.session.MediaController.f
                public final void a(MediaController.e eVar) {
                    MediaController.a(this.f58923a, eVar);
                }
            });
        }
    }

    private static t1<SessionResult> c() {
        return SessionResult.j(-100);
    }

    @NonNull
    public t1<SessionResult> A() {
        return isConnected() ? f().A() : c();
    }

    @NonNull
    public t1<SessionResult> A0(@NonNull SessionPlayer.TrackInfo trackInfo) {
        if (trackInfo != null) {
            return isConnected() ? f().A0(trackInfo) : c();
        }
        throw new NullPointerException("TrackInfo shouldn't be null");
    }

    @NonNull
    public t1<SessionResult> A1(int i10, int i11) {
        return isConnected() ? f().A1(i10, i11) : c();
    }

    @p0
    public SessionToken A3() {
        if (isConnected()) {
            return f().A3();
        }
        return null;
    }

    @NonNull
    public t1<SessionResult> B() {
        return isConnected() ? f().B() : c();
    }

    public int C() {
        if (isConnected()) {
            return f().C();
        }
        return 0;
    }

    @NonNull
    public t1<SessionResult> D(int i10) {
        return isConnected() ? f().D(i10) : c();
    }

    @NonNull
    public t1<SessionResult> D1() {
        return isConnected() ? f().D1() : c();
    }

    @NonNull
    public t1<SessionResult> F(long j10) {
        return isConnected() ? f().F(j10) : c();
    }

    @NonNull
    public t1<SessionResult> G(float f10) {
        if (f10 != 0.0f) {
            return isConnected() ? f().G(f10) : c();
        }
        throw new IllegalArgumentException("speed must not be zero");
    }

    @NonNull
    public t1<SessionResult> G0(@g0(from = 0) int i10) {
        if (i10 >= 0) {
            return isConnected() ? f().G0(i10) : c();
        }
        throw new IllegalArgumentException("index shouldn't be negative");
    }

    @NonNull
    public List<SessionPlayer.TrackInfo> G1() {
        return isConnected() ? f().G1() : Collections.EMPTY_LIST;
    }

    @NonNull
    public t1<SessionResult> H1(@g0(from = 0) int i10) {
        if (i10 >= 0) {
            return isConnected() ? f().H1(i10) : c();
        }
        throw new IllegalArgumentException("index shouldn't be negative");
    }

    @p0
    public SessionPlayer.TrackInfo I1(int i10) {
        if (isConnected()) {
            return f().I1(i10);
        }
        return null;
    }

    public int J() {
        if (isConnected()) {
            return f().J();
        }
        return 0;
    }

    @NonNull
    public t1<SessionResult> K(int i10) {
        return isConnected() ? f().K(i10) : c();
    }

    @NonNull
    public t1<SessionResult> K0(@NonNull SessionPlayer.TrackInfo trackInfo) {
        if (trackInfo != null) {
            return isConnected() ? f().K0(trackInfo) : c();
        }
        throw new NullPointerException("TrackInfo shouldn't be null");
    }

    @NonNull
    public t1<SessionResult> K6(@g0(from = 0) int i10, @NonNull String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("mediaId shouldn't be empty");
        }
        return isConnected() ? f().K6(i10, str) : c();
    }

    @NonNull
    public t1<SessionResult> Kc() {
        return isConnected() ? f().Kc() : c();
    }

    @NonNull
    public t1<SessionResult> L0(int i10, int i11) {
        return isConnected() ? f().L0(i10, i11) : c();
    }

    @p0
    public PendingIntent M() {
        if (isConnected()) {
            return f().M();
        }
        return null;
    }

    @NonNull
    public t1<SessionResult> M8(@NonNull SessionCommand sessionCommand, @p0 Bundle bundle) {
        if (sessionCommand == null) {
            throw new NullPointerException("command shouldn't be null");
        }
        if (sessionCommand.d() == 0) {
            return isConnected() ? f().M8(sessionCommand, bundle) : c();
        }
        throw new IllegalArgumentException("command should be a custom command");
    }

    @NonNull
    public t1<SessionResult> P() {
        return isConnected() ? f().P() : c();
    }

    @p0
    public MediaMetadata V() {
        if (isConnected()) {
            return f().V();
        }
        return null;
    }

    @p0
    public List<MediaItem> V0() {
        if (isConnected()) {
            return f().V0();
        }
        return null;
    }

    @NonNull
    public t1<SessionResult> Y0(@NonNull List<String> list, @p0 MediaMetadata mediaMetadata) {
        if (list == null) {
            throw new NullPointerException("list shouldn't be null");
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (TextUtils.isEmpty(list.get(i10))) {
                throw new IllegalArgumentException("list shouldn't contain empty id, index=" + i10);
            }
        }
        return isConnected() ? f().Y0(list, mediaMetadata) : c();
    }

    @p0
    public MediaItem Z() {
        if (isConnected()) {
            return f().Z();
        }
        return null;
    }

    @NonNull
    public t1<SessionResult> Z0(@g0(from = 0) int i10, @g0(from = 0) int i11) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("indexes shouldn't be negative");
        }
        return isConnected() ? f().Z0(i10, i11) : c();
    }

    @NonNull
    public t1<SessionResult> Zb(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("mediaId shouldn't be empty");
        }
        return isConnected() ? f().Zb(str) : c();
    }

    public int a0() {
        if (isConnected()) {
            return f().a0();
        }
        return -1;
    }

    @NonNull
    public t1<SessionResult> a1(@p0 MediaMetadata mediaMetadata) {
        return isConnected() ? f().a1(mediaMetadata) : c();
    }

    @p0
    public PlaybackInfo b0() {
        if (isConnected()) {
            return f().b0();
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            synchronized (this.f58505a) {
                try {
                    if (this.f58507c) {
                        return;
                    }
                    this.f58507c = true;
                    g gVar = this.f58506b;
                    if (gVar != null) {
                        gVar.close();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception unused) {
        }
    }

    g d(@NonNull Context context, @NonNull SessionToken sessionToken, @p0 Bundle bundle) {
        return sessionToken.g5() ? new MediaControllerImplLegacy(context, this, sessionToken) : new k(context, this, sessionToken, bundle);
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    public List<androidx.core.util.p<e, Executor>> e() {
        ArrayList arrayList;
        synchronized (this.f58505a) {
            try {
                arrayList = new ArrayList(this.f58510f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public int e0() {
        if (isConnected()) {
            return f().e0();
        }
        return -1;
    }

    g f() {
        g gVar;
        synchronized (this.f58505a) {
            try {
                gVar = this.f58506b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @b1({b1.a.LIBRARY})
    public void g(@NonNull f fVar) {
        h(fVar);
        for (androidx.core.util.p<e, Executor> pVar : e()) {
            e eVar = pVar.f48411a;
            Executor executor = pVar.f48412b;
            if (eVar != null && executor != null) {
                executor.execute(new b(fVar, eVar));
            }
        }
    }

    public long getCurrentPosition() {
        if (isConnected()) {
            return f().getCurrentPosition();
        }
        return Long.MIN_VALUE;
    }

    public long getDuration() {
        if (isConnected()) {
            return f().getDuration();
        }
        return Long.MIN_VALUE;
    }

    void h(@NonNull f fVar) {
        Executor executor;
        if (this.f58508d == null || (executor = this.f58509e) == null) {
            return;
        }
        executor.execute(new a(fVar));
    }

    @NonNull
    public VideoSize h0() {
        return isConnected() ? f().h0() : new VideoSize(0, 0);
    }

    public int i1() {
        if (isConnected()) {
            return f().i1();
        }
        return 0;
    }

    public boolean isConnected() {
        g gVarF = f();
        return gVarF != null && gVarF.isConnected();
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void j(@NonNull Executor executor, @NonNull e eVar) {
        if (executor == null) {
            throw new NullPointerException("executor shouldn't be null");
        }
        if (eVar == null) {
            throw new NullPointerException("callback shouldn't be null");
        }
        synchronized (this.f58505a) {
            try {
                Iterator<androidx.core.util.p<e, Executor>> it = this.f58510f.iterator();
                while (it.hasNext()) {
                    if (it.next().f48411a == eVar) {
                    }
                }
                this.f58510f.add(new androidx.core.util.p<>(eVar, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public t1<SessionResult> k9(@g0(from = 0) int i10, @NonNull String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("mediaId shouldn't be empty");
        }
        return isConnected() ? f().k9(i10, str) : c();
    }

    @b1({b1.a.LIBRARY})
    public void l(Long l10) {
        this.f58511g = l10;
    }

    public int l0() {
        if (isConnected()) {
            return f().l0();
        }
        return -1;
    }

    @NonNull
    public t1<SessionResult> m() {
        return isConnected() ? f().n0() : c();
    }

    @NonNull
    public t1<SessionResult> m3() {
        return isConnected() ? f().m3() : c();
    }

    @NonNull
    public t1<SessionResult> o() {
        return isConnected() ? f().N0() : c();
    }

    @p0
    public SessionCommandGroup p6() {
        if (isConnected()) {
            return f().p6();
        }
        return null;
    }

    @NonNull
    public t1<SessionResult> pause() {
        return isConnected() ? f().pause() : c();
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void q(@NonNull e eVar) {
        if (eVar == null) {
            throw new NullPointerException("callback shouldn't be null");
        }
        synchronized (this.f58505a) {
            try {
                for (int size = this.f58510f.size() - 1; size >= 0; size--) {
                    if (this.f58510f.get(size).f48411a == eVar) {
                        this.f58510f.remove(size);
                        break;
                    }
                }
            } finally {
            }
        }
    }

    @NonNull
    public t1<SessionResult> q5(@NonNull Uri uri, @p0 Bundle bundle) {
        if (uri != null) {
            return isConnected() ? f().q5(uri, bundle) : c();
        }
        throw new NullPointerException("mediaUri shouldn't be null");
    }

    public int s0() {
        if (isConnected()) {
            return f().s0();
        }
        return 0;
    }

    public float t0() {
        if (isConnected()) {
            return f().t0();
        }
        return 0.0f;
    }

    public long v() {
        if (isConnected()) {
            return f().v();
        }
        return Long.MIN_VALUE;
    }

    @NonNull
    public t1<SessionResult> xc(@NonNull String str, @NonNull Rating rating) {
        if (str == null) {
            throw new NullPointerException("mediaId shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("mediaId shouldn't be empty");
        }
        if (rating != null) {
            return isConnected() ? f().xc(str, rating) : c();
        }
        throw new NullPointerException("rating shouldn't be null");
    }

    @NonNull
    public t1<SessionResult> z0(@p0 Surface surface) {
        return isConnected() ? f().z0(surface) : c();
    }

    MediaController(@NonNull final Context context, @NonNull MediaSessionCompat.Token token, @p0 final Bundle bundle, @p0 Executor executor, @p0 e eVar) {
        this.f58505a = new Object();
        this.f58510f = new ArrayList();
        if (context == null) {
            throw new NullPointerException("context shouldn't be null");
        }
        if (token == null) {
            throw new NullPointerException("token shouldn't be null");
        }
        this.f58508d = eVar;
        this.f58509e = executor;
        SessionToken.f(context, token, new SessionToken.c() { // from class: androidx.media2.session.i
            @Override // androidx.media2.session.SessionToken.c
            public final void a(MediaSessionCompat.Token token2, SessionToken sessionToken) {
                MediaController.b(this.f58920a, context, bundle, token2, sessionToken);
            }
        });
    }
}
