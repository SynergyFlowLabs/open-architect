package androidx.media2.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.Rating;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import java.io.Closeable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class u extends MediaSessionCompat.b implements Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f59371s = "androidx.media2.session.id";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f59372t = ".";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f59374w = 300000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.media2.session.a<androidx.media.f.b> f59375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final MediaSession.e f59376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final androidx.media.f f59377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Context f59378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final MediaSession.c f59379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final w f59380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final MediaSessionCompat f59381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    volatile long f59382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f59383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f59370o = "MediaSessionLegacyStub";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final boolean f59373v = Log.isLoggable(f59370o, 3);
    static final SparseArray<SessionCommand> X = new SparseArray<>();

    class a implements z {
        a() {
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            u.this.f59376g.N0();
        }
    }

    class b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f59385a;

        b(float f10) {
            this.f59385a = f10;
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            u.this.f59376g.G(this.f59385a);
        }
    }

    class c implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f59387a;

        c(long j10) {
            this.f59387a = j10;
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            if (u.this.f59376g.J5().V0() == null) {
                return;
            }
            u.this.f59376g.H1((int) this.f59387a);
        }
    }

    class d implements z {
        d() {
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            u.this.f59376g.u().g(u.this.f59376g.k(), dVar);
        }
    }

    class e implements z {
        e() {
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            u.this.f59376g.u().j(u.this.f59376g.k(), dVar);
        }
    }

    class f implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RatingCompat f59391a;

        f(RatingCompat ratingCompat) {
            this.f59391a = ratingCompat;
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            MediaItem mediaItemZ = u.this.f59376g.Z();
            if (mediaItemZ == null) {
                return;
            }
            u.this.f59376g.u().m(u.this.f59376g.k(), dVar, mediaItemZ.l(), a0.u(this.f59391a));
        }
    }

    class g implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59393a;

        g(int i10) {
            this.f59393a = i10;
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            u.this.f59376g.D(this.f59393a);
        }
    }

    class h implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59395a;

        h(int i10) {
            this.f59395a = i10;
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            u.this.f59376g.K(this.f59395a);
        }
    }

    class i implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaDescriptionCompat f59397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59398b;

        i(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            this.f59397a = mediaDescriptionCompat;
            this.f59398b = i10;
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            String strH = this.f59397a.h();
            if (TextUtils.isEmpty(strH)) {
                return;
            }
            u.this.f59376g.a(this.f59398b, u.this.f59376g.u().c(u.this.f59376g.k(), dVar, strH));
        }
    }

    class j implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaDescriptionCompat f59400a;

        j(MediaDescriptionCompat mediaDescriptionCompat) {
            this.f59400a = mediaDescriptionCompat;
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            String strH = this.f59400a.h();
            if (TextUtils.isEmpty(strH)) {
                return;
            }
            List<MediaItem> listV0 = u.this.f59376g.V0();
            for (int i10 = 0; i10 < listV0.size(); i10++) {
                if (TextUtils.equals(listV0.get(i10).l(), strH)) {
                    u.this.f59376g.G0(i10);
                    return;
                }
            }
        }
    }

    class k implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionCommand f59402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f59403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f59404c;

        k(SessionCommand sessionCommand, Bundle bundle, ResultReceiver resultReceiver) {
            this.f59402a = sessionCommand;
            this.f59403b = bundle;
            this.f59404c = resultReceiver;
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            SessionResult sessionResultE = u.this.f59376g.u().e(u.this.f59376g.k(), dVar, this.f59402a, this.f59403b);
            ResultReceiver resultReceiver = this.f59404c;
            if (resultReceiver != null) {
                resultReceiver.send(sessionResultE.i(), sessionResultE.l());
            }
        }
    }

    class l implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59406a;

        l(int i10) {
            this.f59406a = i10;
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            int i10 = this.f59406a;
            if (i10 < 0) {
                return;
            }
            u.this.f59376g.G0(i10);
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.media.f.b f59408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SessionCommand f59409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z f59411d;

        m(androidx.media.f.b bVar, SessionCommand sessionCommand, int i10, z zVar) {
            this.f59408a = bVar;
            this.f59409b = sessionCommand;
            this.f59410c = i10;
            this.f59411d = zVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (u.this.f59376g.isClosed()) {
                return;
            }
            MediaSession.d dVarC = u.this.f59375f.c(this.f59408a);
            if (dVarC == null) {
                androidx.media.f.b bVar = this.f59408a;
                MediaSession.d dVar = new MediaSession.d(bVar, -1, u.this.f59377h.c(bVar), u.this.new x(this.f59408a), null);
                SessionCommandGroup sessionCommandGroupB = u.this.f59376g.u().b(u.this.f59376g.k(), dVar);
                if (sessionCommandGroupB == null) {
                    try {
                        dVar.c().e(0);
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                } else {
                    u.this.f59375f.a(dVar.e(), dVar, sessionCommandGroupB);
                    dVarC = dVar;
                }
            }
            u uVar = u.this;
            uVar.f59380k.a(dVarC, uVar.f59382m);
            u.this.O0(dVarC, this.f59409b, this.f59410c, this.f59411d);
        }
    }

    class n extends androidx.media.k {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ d0 f59413j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i10, int i11, int i12, d0 d0Var) {
            super(i10, i11, i12);
            this.f59413j = d0Var;
        }

        @Override // androidx.media.k
        public void f(int i10) {
            this.f59413j.m(i10);
        }

        @Override // androidx.media.k
        public void g(int i10) {
            this.f59413j.t(i10);
        }
    }

    class o implements z {
        o() {
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            u.this.f59376g.A();
        }
    }

    class p implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f59415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f59416b;

        p(Uri uri, Bundle bundle) {
            this.f59415a = uri;
            this.f59416b = bundle;
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            if (u.this.f59376g.u().l(u.this.f59376g.k(), dVar, this.f59415a, this.f59416b) == 0) {
                u.this.f59376g.A();
            }
        }
    }

    class q implements z {
        q() {
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            u.this.f59376g.B();
        }
    }

    class r implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f59419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f59420b;

        r(Uri uri, Bundle bundle) {
            this.f59419a = uri;
            this.f59420b = bundle;
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            if (u.this.f59376g.u().l(u.this.f59376g.k(), dVar, this.f59419a, this.f59420b) == 0) {
                u.this.f59376g.B();
            }
        }
    }

    class s implements z {
        s() {
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            u.this.f59376g.pause();
        }
    }

    class t implements z {

        class a implements z {
            a() {
            }

            @Override // androidx.media2.session.u.z
            public void a(MediaSession.d dVar) throws RemoteException {
                u.this.f59376g.pause();
                u.this.f59376g.F(0L);
            }
        }

        t() {
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            u.this.O0(dVar, null, SessionCommand.C, new a());
        }
    }

    /* JADX INFO: renamed from: androidx.media2.session.u$u, reason: collision with other inner class name */
    class C0554u implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f59425a;

        C0554u(long j10) {
            this.f59425a = j10;
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            u.this.f59376g.F(this.f59425a);
        }
    }

    class v implements z {
        v() {
        }

        @Override // androidx.media2.session.u.z
        public void a(MediaSession.d dVar) throws RemoteException {
            u.this.f59376g.n0();
        }
    }

    private class w extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f59428b = 1001;

        w(Looper looper) {
            super(looper);
        }

        public void a(@NonNull MediaSession.d dVar, long j10) {
            removeMessages(1001, dVar);
            sendMessageDelayed(obtainMessage(1001, dVar), j10);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MediaSession.d dVar = (MediaSession.d) message.obj;
            if (u.this.f59375f.h(dVar)) {
                try {
                    dVar.c().e(0);
                } catch (RemoteException unused) {
                }
                u.this.f59375f.i(dVar);
            }
        }
    }

    final class x extends MediaSession.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media.f.b f59430a;

        x(androidx.media.f.b bVar) {
            this.f59430a = bVar;
        }

        @Override // androidx.media2.session.MediaSession.c
        void a(int i10, @NonNull SessionCommandGroup sessionCommandGroup) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void b(int i10, @NonNull MediaItem mediaItem, int i11, long j10, long j11, long j12) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.c
        void c(int i10, @NonNull String str, int i11, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void d(int i10, MediaItem mediaItem, int i11, int i12, int i13) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.c
        void e(int i10) throws RemoteException {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != x.class) {
                return false;
            }
            return androidx.core.util.o.a(this.f59430a, ((x) obj).f59430a);
        }

        @Override // androidx.media2.session.MediaSession.c
        void f(int i10, LibraryResult libraryResult) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void g(int i10) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.c
        void h(int i10, @NonNull MediaController.PlaybackInfo playbackInfo) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        public int hashCode() {
            return androidx.core.util.o.b(this.f59430a);
        }

        @Override // androidx.media2.session.MediaSession.c
        void i(int i10, long j10, long j11, float f10) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.c
        void j(int i10, @p0 SessionPlayer sessionPlayer, @p0 MediaController.PlaybackInfo playbackInfo, @NonNull SessionPlayer sessionPlayer2, @NonNull MediaController.PlaybackInfo playbackInfo2) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void k(int i10, SessionPlayer.c cVar) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void l(int i10, long j10, long j11, int i11) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.c
        void m(int i10, @NonNull List<MediaItem> list, MediaMetadata mediaMetadata, int i11, int i12, int i13) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.c
        void n(int i10, MediaMetadata mediaMetadata) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.c
        void o(int i10, int i11, int i12, int i13, int i14) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.c
        void p(int i10, @NonNull String str, int i11, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void q(int i10, long j10, long j11, long j12) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.c
        void r(int i10, SessionResult sessionResult) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void s(int i10, int i11, int i12, int i13, int i14) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.c
        void t(int i10, @NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) {
        }

        @Override // androidx.media2.session.MediaSession.c
        void u(int i10, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void v(int i10, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void w(int i10, List<SessionPlayer.TrackInfo> list, SessionPlayer.TrackInfo trackInfo, SessionPlayer.TrackInfo trackInfo2, SessionPlayer.TrackInfo trackInfo3, SessionPlayer.TrackInfo trackInfo4) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void x(int i10, @NonNull VideoSize videoSize) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void y(int i10, @NonNull SessionCommand sessionCommand, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void z(int i10, @NonNull List<MediaSession.CommandButton> list) throws RemoteException {
        }
    }

    final class y extends MediaSession.c {
        y() {
        }

        @Override // androidx.media2.session.MediaSession.c
        void a(int i10, @NonNull SessionCommandGroup sessionCommandGroup) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }

        @Override // androidx.media2.session.MediaSession.c
        void b(int i10, @NonNull MediaItem mediaItem, int i11, long j10, long j11, long j12) throws RemoteException {
            u uVar = u.this;
            uVar.f59381l.w(uVar.f59376g.ta());
        }

        @Override // androidx.media2.session.MediaSession.c
        void c(int i10, @NonNull String str, int i11, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void d(int i10, MediaItem mediaItem, int i11, int i12, int i13) throws RemoteException {
            Rating ratingP = null;
            MediaMetadata mediaMetadataM = mediaItem == null ? null : mediaItem.m();
            u.this.f59381l.v(a0.p(mediaMetadataM));
            if (mediaMetadataM != null) {
                ratingP = mediaMetadataM.p("android.media.metadata.USER_RATING");
            }
            u.this.f59381l.B(u.M0(ratingP));
            u uVar = u.this;
            uVar.f59381l.w(uVar.f59376g.ta());
        }

        @Override // androidx.media2.session.MediaSession.c
        void e(int i10) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void f(int i10, LibraryResult libraryResult) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void g(int i10) throws RemoteException {
            PlaybackStateCompat playbackStateCompatTa = u.this.f59376g.ta();
            if (playbackStateCompatTa.o() != 2) {
                playbackStateCompatTa = new PlaybackStateCompat.e(playbackStateCompatTa).j(2, playbackStateCompatTa.n(), playbackStateCompatTa.l()).c();
            }
            u.this.f59381l.w(playbackStateCompatTa);
        }

        @Override // androidx.media2.session.MediaSession.c
        void h(int i10, @NonNull MediaController.PlaybackInfo playbackInfo) throws RemoteException {
            if (playbackInfo.j() == 2) {
                u.this.f59381l.y(u.r0((d0) u.this.f59376g.J5()));
            } else {
                u.this.f59381l.x(a0.A(playbackInfo.f()));
            }
        }

        @Override // androidx.media2.session.MediaSession.c
        void i(int i10, long j10, long j11, float f10) throws RemoteException {
            u uVar = u.this;
            uVar.f59381l.w(uVar.f59376g.ta());
        }

        @Override // androidx.media2.session.MediaSession.c
        void j(int i10, @p0 SessionPlayer sessionPlayer, @p0 MediaController.PlaybackInfo playbackInfo, @NonNull SessionPlayer sessionPlayer2, @NonNull MediaController.PlaybackInfo playbackInfo2) throws RemoteException {
            if (sessionPlayer == null || !androidx.core.util.o.a(sessionPlayer.V0(), sessionPlayer2.V0())) {
                m(i10, sessionPlayer2.V0(), sessionPlayer2.V(), sessionPlayer2.l0(), sessionPlayer2.a0(), sessionPlayer2.e0());
            } else if (!androidx.core.util.o.a(sessionPlayer.V(), sessionPlayer2.V())) {
                n(i10, sessionPlayer2.V());
            }
            if (sessionPlayer == null || sessionPlayer.J() != sessionPlayer2.J()) {
                s(i10, sessionPlayer2.J(), sessionPlayer2.l0(), sessionPlayer2.a0(), sessionPlayer2.e0());
            }
            if (sessionPlayer == null || sessionPlayer.C() != sessionPlayer2.C()) {
                o(i10, sessionPlayer2.C(), sessionPlayer2.l0(), sessionPlayer2.a0(), sessionPlayer2.e0());
            }
            if (sessionPlayer == null || !androidx.core.util.o.a(sessionPlayer.Z(), sessionPlayer2.Z())) {
                d(i10, sessionPlayer2.Z(), sessionPlayer2.l0(), sessionPlayer2.a0(), sessionPlayer2.e0());
            } else {
                u uVar = u.this;
                uVar.f59381l.w(uVar.f59376g.ta());
            }
            h(i10, playbackInfo2);
        }

        @Override // androidx.media2.session.MediaSession.c
        void k(int i10, SessionPlayer.c cVar) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void l(int i10, long j10, long j11, int i11) throws RemoteException {
            u uVar = u.this;
            uVar.f59381l.w(uVar.f59376g.ta());
        }

        @Override // androidx.media2.session.MediaSession.c
        void m(int i10, @NonNull List<MediaItem> list, MediaMetadata mediaMetadata, int i11, int i12, int i13) throws RemoteException {
            u.this.f59381l.z(a0.t(list));
            n(i10, mediaMetadata);
        }

        @Override // androidx.media2.session.MediaSession.c
        void n(int i10, MediaMetadata mediaMetadata) throws RemoteException {
            CharSequence charSequenceR;
            CharSequence charSequenceN = u.this.f59381l.e().n();
            if (mediaMetadata != null) {
                charSequenceR = mediaMetadata.r("android.media.metadata.DISPLAY_TITLE");
                if (charSequenceR == null) {
                    charSequenceR = mediaMetadata.r("android.media.metadata.TITLE");
                }
            } else {
                charSequenceR = null;
            }
            if (!TextUtils.equals(charSequenceN, charSequenceR)) {
                u.this.f59381l.A(charSequenceR);
            }
        }

        @Override // androidx.media2.session.MediaSession.c
        void o(int i10, int i11, int i12, int i13, int i14) throws RemoteException {
            u.this.f59381l.C(i11);
        }

        @Override // androidx.media2.session.MediaSession.c
        void p(int i10, @NonNull String str, int i11, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void q(int i10, long j10, long j11, long j12) throws RemoteException {
            u uVar = u.this;
            uVar.f59381l.w(uVar.f59376g.ta());
        }

        @Override // androidx.media2.session.MediaSession.c
        void r(int i10, SessionResult sessionResult) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void s(int i10, int i11, int i12, int i13, int i14) throws RemoteException {
            u.this.f59381l.E(i11);
        }

        @Override // androidx.media2.session.MediaSession.c
        void t(int i10, @NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) {
        }

        @Override // androidx.media2.session.MediaSession.c
        void u(int i10, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void v(int i10, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void w(int i10, List<SessionPlayer.TrackInfo> list, SessionPlayer.TrackInfo trackInfo, SessionPlayer.TrackInfo trackInfo2, SessionPlayer.TrackInfo trackInfo3, SessionPlayer.TrackInfo trackInfo4) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void x(int i10, @NonNull VideoSize videoSize) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void y(int i10, @NonNull SessionCommand sessionCommand, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void z(int i10, @NonNull List<MediaSession.CommandButton> list) throws RemoteException {
            throw new AssertionError("This shouldn't be called");
        }
    }

    @FunctionalInterface
    private interface z {
        void a(MediaSession.d dVar) throws RemoteException;
    }

    static {
        for (SessionCommand sessionCommand : new SessionCommandGroup.a().c(2).g(2).j().d()) {
            X.append(sessionCommand.d(), sessionCommand);
        }
    }

    u(MediaSession.e eVar, ComponentName componentName, PendingIntent pendingIntent, Handler handler) {
        this.f59376g = eVar;
        Context context = eVar.getContext();
        this.f59378i = context;
        this.f59377h = androidx.media.f.b(context);
        this.f59379j = new y();
        this.f59380k = new w(handler.getLooper());
        this.f59375f = new androidx.media2.session.a<>(eVar);
        this.f59382m = 300000L;
        this.f59383n = handler;
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, TextUtils.join(f59372t, new String[]{f59371s, eVar.getId()}), componentName, pendingIntent, eVar.I0().getExtras(), eVar.I0());
        this.f59381l = mediaSessionCompat;
        mediaSessionCompat.D(eVar.M());
        mediaSessionCompat.t(4);
    }

    static int M0(@p0 Rating rating) {
        if (rating instanceof HeartRating) {
            return 1;
        }
        if (rating instanceof ThumbRating) {
            return 2;
        }
        if (!(rating instanceof StarRating)) {
            return rating instanceof PercentageRating ? 6 : 0;
        }
        int iD = ((StarRating) rating).d();
        int i10 = 3;
        if (iD != 3) {
            i10 = 4;
            if (iD != 4) {
                i10 = 5;
                if (iD != 5) {
                    return 0;
                }
            }
        }
        return i10;
    }

    static androidx.media.k r0(@NonNull d0 d0Var) {
        return new n(d0Var.r(), d0Var.o(), d0Var.q(), d0Var);
    }

    private void w0(int i10, @NonNull z zVar) {
        y0(null, i10, zVar);
    }

    private void x0(@NonNull SessionCommand sessionCommand, @NonNull z zVar) {
        y0(sessionCommand, 0, zVar);
    }

    private void y0(@p0 SessionCommand sessionCommand, int i10, @NonNull z zVar) {
        if (this.f59376g.isClosed()) {
            return;
        }
        androidx.media.f.b bVarF = this.f59381l.f();
        if (bVarF == null) {
            Objects.toString(sessionCommand);
        } else {
            this.f59376g.r2().execute(new m(bVarF, sessionCommand, i10, zVar));
        }
    }

    androidx.media2.session.a<androidx.media.f.b> B0() {
        return this.f59375f;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void E(int i10) {
        w0(SessionCommand.N, new l(i10));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void H() {
        w0(SessionCommand.f58653b0, new e());
    }

    MediaSession.c H0() {
        return this.f59379j;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void I(long j10) {
        w0(SessionCommand.C, new C0554u(j10));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void N(boolean z10) {
    }

    void O0(@NonNull MediaSession.d dVar, @p0 SessionCommand sessionCommand, int i10, @NonNull z zVar) {
        SessionCommand sessionCommand2;
        if (sessionCommand != null) {
            if (!this.f59375f.g(dVar, sessionCommand)) {
                return;
            } else {
                sessionCommand2 = X.get(sessionCommand.d());
            }
        } else if (!this.f59375f.f(dVar, i10)) {
            return;
        } else {
            sessionCommand2 = X.get(i10);
        }
        if (sessionCommand2 == null || this.f59376g.u().a(this.f59376g.k(), dVar, sessionCommand2) == 0) {
            try {
                zVar.a(dVar);
            } catch (RemoteException unused) {
                Objects.toString(dVar);
            }
        } else if (f59373v) {
            Objects.toString(dVar);
            Objects.toString(this.f59376g);
        }
    }

    public void Q0(long j10) {
        this.f59382m = j10;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void R(float f10) {
        w0(SessionCommand.D, new b(f10));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void T(RatingCompat ratingCompat) {
        X(ratingCompat, null);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void X(RatingCompat ratingCompat, Bundle bundle) {
        if (ratingCompat == null) {
            return;
        }
        w0(SessionCommand.f58656e0, new f(ratingCompat));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void Y(int i10) {
        w0(SessionCommand.K, new g(i10));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        c(mediaDescriptionCompat, Integer.MAX_VALUE);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void c(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        w0(SessionCommand.M, new i(mediaDescriptionCompat, i10));
    }

    public MediaSessionCompat cb() {
        return this.f59381l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f59381l.l();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str == null) {
            return;
        }
        SessionCommand sessionCommand = new SessionCommand(str, null);
        x0(sessionCommand, new k(sessionCommand, bundle, resultReceiver));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void d0(int i10) {
        w0(SessionCommand.J, new h(i10));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void e(@NonNull String str, @p0 Bundle bundle) {
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void f() {
        w0(40000, new d());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void f0() {
        w0(SessionCommand.I, new v());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void g0() {
        w0(SessionCommand.H, new a());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void h() {
        w0(SessionCommand.A, new s());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void j() {
        w0(10000, new q());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void j0(long j10) {
        w0(SessionCommand.G, new c(j10));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void k0() {
        w0(SessionCommand.A, new t());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void l(String str, Bundle bundle) {
        o(new Uri.Builder().scheme(androidx.media2.session.h.f58908a).authority(androidx.media2.session.h.f58909b).path(androidx.media2.session.h.f58910c).appendQueryParameter("id", str).build(), bundle);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void m(String str, Bundle bundle) {
        o(new Uri.Builder().scheme(androidx.media2.session.h.f58908a).authority(androidx.media2.session.h.f58909b).path(androidx.media2.session.h.f58911d).appendQueryParameter("query", str).build(), bundle);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void o(Uri uri, Bundle bundle) {
        w0(SessionCommand.f58657f0, new r(uri, bundle));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void q() {
        w0(SessionCommand.B, new o());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void r(String str, Bundle bundle) {
        x(new Uri.Builder().scheme(androidx.media2.session.h.f58908a).authority(androidx.media2.session.h.f58909b).path(androidx.media2.session.h.f58912e).appendQueryParameter("id", str).build(), bundle);
    }

    public void start() {
        this.f59381l.q(this, this.f59383n);
        this.f59381l.o(true);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void t(String str, Bundle bundle) {
        x(new Uri.Builder().scheme(androidx.media2.session.h.f58908a).authority(androidx.media2.session.h.f58909b).path(androidx.media2.session.h.f58913f).appendQueryParameter("query", str).build(), bundle);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void x(Uri uri, Bundle bundle) {
        w0(SessionCommand.f58657f0, new p(uri, bundle));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public void y(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        w0(SessionCommand.N, new j(mediaDescriptionCompat));
    }
}
