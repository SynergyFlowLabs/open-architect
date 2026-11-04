package androidx.media2.widget;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import androidx.media2.session.MediaController;
import androidx.media2.session.SessionCommand;
import androidx.media2.session.SessionCommandGroup;
import com.google.common.util.concurrent.t1;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final MediaController f60004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final SessionPlayer f60005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f60006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f60007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f60008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f60009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f60010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f60011h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    SessionCommandGroup f60012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    MediaMetadata f60013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SessionCommandGroup f60014k;

    private class a extends MediaController.e {
        a() {
        }

        @Override // androidx.media2.session.MediaController.e
        public void a(@NonNull MediaController mediaController, @NonNull SessionCommandGroup sessionCommandGroup) {
            if (androidx.core.util.o.a(m.this.f60012i, sessionCommandGroup)) {
                return;
            }
            m mVar = m.this;
            mVar.f60012i = sessionCommandGroup;
            mVar.f60007d.a(mVar, sessionCommandGroup);
        }

        @Override // androidx.media2.session.MediaController.e
        public void c(@NonNull MediaController mediaController, @NonNull SessionCommandGroup sessionCommandGroup) {
            m mVar = m.this;
            mVar.f60007d.b(mVar);
            m.this.K();
        }

        @Override // androidx.media2.session.MediaController.e
        public void d(@NonNull MediaController mediaController, @p0 MediaItem mediaItem) {
            m.this.f60013j = mediaItem == null ? null : mediaItem.m();
            m mVar = m.this;
            mVar.f60007d.c(mVar, mediaItem);
        }

        @Override // androidx.media2.session.MediaController.e
        public void g(@NonNull MediaController mediaController) {
            m mVar = m.this;
            mVar.f60007d.d(mVar);
        }

        @Override // androidx.media2.session.MediaController.e
        public void i(@NonNull MediaController mediaController, float f10) {
            m mVar = m.this;
            mVar.f60007d.e(mVar, f10);
        }

        @Override // androidx.media2.session.MediaController.e
        public void j(@NonNull MediaController mediaController, int i10) {
            m mVar = m.this;
            if (mVar.f60011h == i10) {
                return;
            }
            mVar.f60011h = i10;
            mVar.f60007d.f(mVar, i10);
        }

        @Override // androidx.media2.session.MediaController.e
        public void k(@NonNull MediaController mediaController, @p0 List<MediaItem> list, @p0 MediaMetadata mediaMetadata) {
            m mVar = m.this;
            mVar.f60007d.g(mVar, list, mediaMetadata);
        }

        @Override // androidx.media2.session.MediaController.e
        public void n(@NonNull MediaController mediaController, long j10) {
            m mVar = m.this;
            mVar.f60007d.h(mVar, j10);
        }

        @Override // androidx.media2.session.MediaController.e
        public void q(@NonNull MediaController mediaController, @NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) {
            m mVar = m.this;
            mVar.f60007d.i(mVar, mediaItem, trackInfo, subtitleData);
        }

        @Override // androidx.media2.session.MediaController.e
        public void r(@NonNull MediaController mediaController, @NonNull SessionPlayer.TrackInfo trackInfo) {
            m mVar = m.this;
            mVar.f60007d.j(mVar, trackInfo);
        }

        @Override // androidx.media2.session.MediaController.e
        public void s(@NonNull MediaController mediaController, @NonNull SessionPlayer.TrackInfo trackInfo) {
            m mVar = m.this;
            mVar.f60007d.k(mVar, trackInfo);
        }

        @Override // androidx.media2.session.MediaController.e
        public void t(@NonNull MediaController mediaController, @NonNull List<SessionPlayer.TrackInfo> list) {
            m mVar = m.this;
            mVar.f60007d.l(mVar, list);
        }

        @Override // androidx.media2.session.MediaController.e
        public void v(@NonNull MediaController mediaController, @NonNull VideoSize videoSize) {
            m mVar = m.this;
            mVar.f60007d.m(mVar, videoSize);
        }
    }

    static abstract class b {
        b() {
        }

        void a(@NonNull m mVar, @NonNull SessionCommandGroup sessionCommandGroup) {
        }

        void b(@NonNull m mVar) {
        }

        void c(@NonNull m mVar, @p0 MediaItem mediaItem) {
        }

        void d(@NonNull m mVar) {
        }

        void e(@NonNull m mVar, float f10) {
        }

        void f(@NonNull m mVar, int i10) {
        }

        void g(@NonNull m mVar, @p0 List<MediaItem> list, @p0 MediaMetadata mediaMetadata) {
        }

        void h(@NonNull m mVar, long j10) {
        }

        void i(@NonNull m mVar, @NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) {
        }

        void j(@NonNull m mVar, @NonNull SessionPlayer.TrackInfo trackInfo) {
        }

        void k(@NonNull m mVar, @NonNull SessionPlayer.TrackInfo trackInfo) {
        }

        void l(@NonNull m mVar, @NonNull List<SessionPlayer.TrackInfo> list) {
        }

        void m(@NonNull m mVar, @NonNull VideoSize videoSize) {
        }
    }

    private class c extends SessionPlayer.b {
        c() {
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void d(@NonNull SessionPlayer sessionPlayer, @NonNull MediaItem mediaItem) {
            m.this.f60013j = mediaItem == null ? null : mediaItem.m();
            m mVar = m.this;
            mVar.f60007d.c(mVar, mediaItem);
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void e(@NonNull SessionPlayer sessionPlayer) {
            m mVar = m.this;
            mVar.f60007d.d(mVar);
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void f(@NonNull SessionPlayer sessionPlayer, float f10) {
            m mVar = m.this;
            mVar.f60007d.e(mVar, f10);
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void g(@NonNull SessionPlayer sessionPlayer, int i10) {
            m mVar = m.this;
            if (mVar.f60011h == i10) {
                return;
            }
            mVar.f60011h = i10;
            mVar.f60007d.f(mVar, i10);
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void h(@NonNull SessionPlayer sessionPlayer, @p0 List<MediaItem> list, @p0 MediaMetadata mediaMetadata) {
            m mVar = m.this;
            mVar.f60007d.g(mVar, list, mediaMetadata);
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void k(@NonNull SessionPlayer sessionPlayer, long j10) {
            m mVar = m.this;
            mVar.f60007d.h(mVar, j10);
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void m(@NonNull SessionPlayer sessionPlayer, @NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) {
            m mVar = m.this;
            mVar.f60007d.i(mVar, mediaItem, trackInfo, subtitleData);
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void n(@NonNull SessionPlayer sessionPlayer, @NonNull SessionPlayer.TrackInfo trackInfo) {
            m mVar = m.this;
            mVar.f60007d.j(mVar, trackInfo);
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void o(@NonNull SessionPlayer sessionPlayer, @NonNull SessionPlayer.TrackInfo trackInfo) {
            m mVar = m.this;
            mVar.f60007d.k(mVar, trackInfo);
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void p(@NonNull SessionPlayer sessionPlayer, @NonNull List<SessionPlayer.TrackInfo> list) {
            m mVar = m.this;
            mVar.f60007d.l(mVar, list);
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void q(@NonNull SessionPlayer sessionPlayer, @NonNull VideoSize videoSize) {
            m mVar = m.this;
            mVar.f60007d.m(mVar, videoSize);
        }
    }

    m(@NonNull MediaController mediaController, @NonNull Executor executor, @NonNull b bVar) {
        if (mediaController == null) {
            throw new NullPointerException("controller must not be null");
        }
        if (executor == null) {
            throw new NullPointerException("executor must not be null");
        }
        if (bVar == null) {
            throw new NullPointerException("callback must not be null");
        }
        this.f60004a = mediaController;
        this.f60006c = executor;
        this.f60007d = bVar;
        this.f60008e = new a();
        this.f60005b = null;
        this.f60009f = null;
        this.f60014k = null;
    }

    private void B() {
        this.f60007d.e(this, s());
        List<SessionPlayer.TrackInfo> listX = x();
        if (listX != null) {
            this.f60007d.l(this, listX);
        }
        if (n() != null) {
            this.f60007d.m(this, y());
        }
    }

    @p0
    private SessionCommandGroup k() {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            return mediaController.p6();
        }
        if (this.f60005b != null) {
            return this.f60014k;
        }
        return null;
    }

    private float s() {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            return mediaController.t0();
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            return sessionPlayer.t0();
        }
        return 1.0f;
    }

    boolean A() {
        return this.f60011h == 2;
    }

    void C() {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            mediaController.pause();
            return;
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            sessionPlayer.pause();
        }
    }

    void D() {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            mediaController.B();
            return;
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            sessionPlayer.B();
        }
    }

    void E(long j10) {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            mediaController.F(j10);
            return;
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            sessionPlayer.F(j10);
        }
    }

    void F(SessionPlayer.TrackInfo trackInfo) {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            mediaController.A0(trackInfo);
            return;
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            sessionPlayer.A0(trackInfo);
        }
    }

    void G(float f10) {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            mediaController.G(f10);
            return;
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            sessionPlayer.G(f10);
        }
    }

    t1<? extends androidx.media2.common.a> H(Surface surface) {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            return mediaController.z0(surface);
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            return sessionPlayer.z0(surface);
        }
        return null;
    }

    void I() {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            mediaController.m();
            return;
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            sessionPlayer.h();
        }
    }

    void J() {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            mediaController.o();
            return;
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            sessionPlayer.j();
        }
    }

    void K() {
        boolean z10;
        int iT = t();
        boolean z11 = true;
        if (this.f60011h != iT) {
            this.f60011h = iT;
            z10 = true;
        } else {
            z10 = false;
        }
        SessionCommandGroup sessionCommandGroupK = k();
        if (androidx.core.util.o.a(this.f60012i, sessionCommandGroupK)) {
            z11 = false;
        } else {
            this.f60012i = sessionCommandGroupK;
        }
        MediaItem mediaItemN = n();
        this.f60013j = mediaItemN == null ? null : mediaItemN.m();
        if (z10) {
            this.f60007d.f(this, iT);
        }
        if (sessionCommandGroupK != null && z11) {
            this.f60007d.a(this, sessionCommandGroupK);
        }
        this.f60007d.c(this, mediaItemN);
        B();
    }

    void a() {
        if (this.f60010g) {
            return;
        }
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            mediaController.j(this.f60006c, this.f60008e);
        } else {
            SessionPlayer sessionPlayer = this.f60005b;
            if (sessionPlayer != null) {
                sessionPlayer.d(this.f60006c, this.f60009f);
            }
        }
        K();
        this.f60010g = true;
    }

    boolean b() {
        SessionCommandGroup sessionCommandGroup = this.f60012i;
        return sessionCommandGroup != null && sessionCommandGroup.f(SessionCommand.A);
    }

    boolean c() {
        SessionCommandGroup sessionCommandGroup = this.f60012i;
        return sessionCommandGroup != null && sessionCommandGroup.f(SessionCommand.f58653b0);
    }

    boolean d() {
        SessionCommandGroup sessionCommandGroup = this.f60012i;
        return sessionCommandGroup != null && sessionCommandGroup.f(40000);
    }

    boolean e() {
        SessionCommandGroup sessionCommandGroup = this.f60012i;
        return sessionCommandGroup != null && sessionCommandGroup.f(SessionCommand.C);
    }

    boolean f() {
        SessionCommandGroup sessionCommandGroup = this.f60012i;
        return sessionCommandGroup != null && sessionCommandGroup.f(SessionCommand.U) && this.f60012i.f(SessionCommand.V);
    }

    boolean g() {
        SessionCommandGroup sessionCommandGroup = this.f60012i;
        return sessionCommandGroup != null && sessionCommandGroup.f(SessionCommand.I);
    }

    boolean h() {
        SessionCommandGroup sessionCommandGroup = this.f60012i;
        return sessionCommandGroup != null && sessionCommandGroup.f(SessionCommand.H);
    }

    void i(SessionPlayer.TrackInfo trackInfo) {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            mediaController.K0(trackInfo);
            return;
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            sessionPlayer.K0(trackInfo);
        }
    }

    void j() {
        if (this.f60010g) {
            MediaController mediaController = this.f60004a;
            if (mediaController != null) {
                mediaController.q(this.f60008e);
            } else {
                SessionPlayer sessionPlayer = this.f60005b;
                if (sessionPlayer != null) {
                    sessionPlayer.l(this.f60009f);
                }
            }
            this.f60010g = false;
        }
    }

    CharSequence l() {
        MediaMetadata mediaMetadata = this.f60013j;
        if (mediaMetadata == null || !mediaMetadata.j("android.media.metadata.ARTIST")) {
            return null;
        }
        return this.f60013j.r("android.media.metadata.ARTIST");
    }

    long m() {
        long jV;
        if (this.f60011h == 0) {
            return 0L;
        }
        long jQ = q();
        if (jQ == 0) {
            return 0L;
        }
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            jV = mediaController.v();
        } else {
            SessionPlayer sessionPlayer = this.f60005b;
            jV = sessionPlayer != null ? sessionPlayer.v() : 0L;
        }
        if (jV < 0) {
            return 0L;
        }
        return (jV * 100) / jQ;
    }

    @p0
    MediaItem n() {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            return mediaController.Z();
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            return sessionPlayer.Z();
        }
        return null;
    }

    int o() {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            return mediaController.l0();
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            return sessionPlayer.l0();
        }
        return -1;
    }

    long p() {
        long currentPosition;
        if (this.f60011h == 0) {
            return 0L;
        }
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            currentPosition = mediaController.getCurrentPosition();
        } else {
            SessionPlayer sessionPlayer = this.f60005b;
            currentPosition = sessionPlayer != null ? sessionPlayer.getCurrentPosition() : 0L;
        }
        if (currentPosition < 0) {
            return 0L;
        }
        return currentPosition;
    }

    long q() {
        long duration;
        if (this.f60011h == 0) {
            return 0L;
        }
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            duration = mediaController.getDuration();
        } else {
            SessionPlayer sessionPlayer = this.f60005b;
            duration = sessionPlayer != null ? sessionPlayer.getDuration() : 0L;
        }
        if (duration < 0) {
            return 0L;
        }
        return duration;
    }

    int r() {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            return mediaController.e0();
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            return sessionPlayer.e0();
        }
        return -1;
    }

    int t() {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            return mediaController.s0();
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            return sessionPlayer.s0();
        }
        return 0;
    }

    int u() {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            return mediaController.a0();
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            return sessionPlayer.a0();
        }
        return -1;
    }

    @p0
    SessionPlayer.TrackInfo v(int i10) {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            return mediaController.I1(i10);
        }
        SessionPlayer sessionPlayer = this.f60005b;
        if (sessionPlayer != null) {
            return sessionPlayer.I1(i10);
        }
        return null;
    }

    CharSequence w() {
        MediaMetadata mediaMetadata = this.f60013j;
        if (mediaMetadata == null || !mediaMetadata.j("android.media.metadata.TITLE")) {
            return null;
        }
        return this.f60013j.r("android.media.metadata.TITLE");
    }

    @NonNull
    List<SessionPlayer.TrackInfo> x() {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            return mediaController.G1();
        }
        SessionPlayer sessionPlayer = this.f60005b;
        return sessionPlayer != null ? sessionPlayer.G1() : Collections.EMPTY_LIST;
    }

    @NonNull
    VideoSize y() {
        MediaController mediaController = this.f60004a;
        if (mediaController != null) {
            return mediaController.h0();
        }
        SessionPlayer sessionPlayer = this.f60005b;
        return sessionPlayer != null ? sessionPlayer.h0() : new VideoSize(0, 0);
    }

    boolean z() {
        MediaController mediaController = this.f60004a;
        return (mediaController == null || mediaController.isConnected()) ? false : true;
    }

    m(@NonNull SessionPlayer sessionPlayer, @NonNull Executor executor, @NonNull b bVar) {
        if (sessionPlayer == null) {
            throw new NullPointerException("player must not be null");
        }
        if (executor == null) {
            throw new NullPointerException("executor must not be null");
        }
        if (bVar != null) {
            this.f60005b = sessionPlayer;
            this.f60006c = executor;
            this.f60007d = bVar;
            this.f60009f = new c();
            this.f60004a = null;
            this.f60008e = null;
            this.f60014k = new SessionCommandGroup.a().e(1).j();
            return;
        }
        throw new NullPointerException("callback must not be null");
    }
}
