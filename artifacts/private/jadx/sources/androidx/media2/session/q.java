package androidx.media2.session;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class q extends y {
    private static final String H1 = "MLS2LegacyStub";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final boolean f59151p2 = false;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final MediaSession.c f59152p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    final MediaLibraryService.a.c f59153p1;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaSession.d f59154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f59155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f59156c;

        a(MediaSession.d dVar, Bundle bundle, String str) {
            this.f59154a = dVar;
            this.f59155b = bundle;
            this.f59156c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (q.this.z().f(this.f59154a, SessionCommand.f58660i0)) {
                q.this.f59153p1.u().v(q.this.f59153p1.k(), this.f59154a, this.f59156c, a0.g(q.this.f59153p1.getContext(), this.f59155b));
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaSession.d f59158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f59159b;

        b(MediaSession.d dVar, String str) {
            this.f59158a = dVar;
            this.f59159b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (q.this.z().f(this.f59158a, SessionCommand.f58661j0)) {
                q.this.f59153p1.u().w(q.this.f59153p1.k(), this.f59158a, this.f59159b);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaSession.d f59161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.media.e.m f59162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f59163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f59164d;

        c(MediaSession.d dVar, androidx.media.e.m mVar, Bundle bundle, String str) {
            this.f59161a = dVar;
            this.f59162b = mVar;
            this.f59163c = bundle;
            this.f59164d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!q.this.z().f(this.f59161a, SessionCommand.f58662k0)) {
                this.f59162b.h(null);
                return;
            }
            Bundle bundle = this.f59163c;
            if (bundle != null) {
                bundle.setClassLoader(q.this.f59153p1.getContext().getClassLoader());
                try {
                    int i10 = this.f59163c.getInt(MediaBrowserCompat.f9287d);
                    int i11 = this.f59163c.getInt(MediaBrowserCompat.f9288e);
                    if (i10 > 0 && i11 > 0) {
                        LibraryResult libraryResultQ = q.this.f59153p1.u().q(q.this.f59153p1.k(), this.f59161a, this.f59164d, i10, i11, a0.g(q.this.f59153p1.getContext(), this.f59163c));
                        if (libraryResultQ != null && libraryResultQ.i() == 0) {
                            this.f59162b.j(a0.H(a0.m(libraryResultQ.l()), 262144));
                            return;
                        }
                        this.f59162b.j(null);
                        return;
                    }
                } catch (BadParcelableException unused) {
                }
            }
            LibraryResult libraryResultQ2 = q.this.f59153p1.u().q(q.this.f59153p1.k(), this.f59161a, this.f59164d, 0, Integer.MAX_VALUE, null);
            if (libraryResultQ2 == null || libraryResultQ2.i() != 0) {
                this.f59162b.j(null);
            } else {
                this.f59162b.j(a0.H(a0.m(libraryResultQ2.l()), 262144));
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaSession.d f59166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.media.e.m f59167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f59168c;

        d(MediaSession.d dVar, androidx.media.e.m mVar, String str) {
            this.f59166a = dVar;
            this.f59167b = mVar;
            this.f59168c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!q.this.z().f(this.f59166a, SessionCommand.f58663l0)) {
                this.f59167b.h(null);
                return;
            }
            LibraryResult libraryResultR = q.this.f59153p1.u().r(q.this.f59153p1.k(), this.f59166a, this.f59168c);
            if (libraryResultR != null && libraryResultR.i() == 0) {
                this.f59167b.j(a0.h(libraryResultR.g()));
                return;
            }
            this.f59167b.j(null);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaSession.d f59170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.media.e.m f59171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f59172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bundle f59173d;

        e(MediaSession.d dVar, androidx.media.e.m mVar, String str, Bundle bundle) {
            this.f59170a = dVar;
            this.f59171b = mVar;
            this.f59172c = str;
            this.f59173d = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!q.this.z().f(this.f59170a, SessionCommand.f58664m0)) {
                this.f59171b.h(null);
                return;
            }
            ((h) this.f59170a.c()).A(this.f59170a, this.f59172c, this.f59173d, this.f59171b);
            q.this.f59153p1.u().u(q.this.f59153p1.k(), this.f59170a, this.f59172c, a0.g(q.this.f59153p1.getContext(), this.f59173d));
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaSession.d f59176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.media.e.m f59177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bundle f59178d;

        f(String str, MediaSession.d dVar, androidx.media.e.m mVar, Bundle bundle) {
            this.f59175a = str;
            this.f59176b = dVar;
            this.f59177c = mVar;
            this.f59178d = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            SessionCommand sessionCommand = new SessionCommand(this.f59175a, null);
            if (q.this.z().g(this.f59176b, sessionCommand)) {
                SessionResult sessionResultE = q.this.f59153p1.u().e(q.this.f59153p1.k(), this.f59176b, sessionCommand, this.f59178d);
                if (sessionResultE != null) {
                    this.f59177c.j(sessionResultE.l());
                    return;
                }
                return;
            }
            androidx.media.e.m mVar = this.f59177c;
            if (mVar != null) {
                mVar.h(null);
            }
        }
    }

    private static abstract class g extends MediaSession.c {
        private g() {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void a(int i10, @NonNull SessionCommandGroup sessionCommandGroup) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void b(int i10, @NonNull MediaItem mediaItem, int i11, long j10, long j11, long j12) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void d(int i10, MediaItem mediaItem, int i11, int i12, int i13) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void e(int i10) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void f(int i10, LibraryResult libraryResult) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void g(int i10) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void h(int i10, @NonNull MediaController.PlaybackInfo playbackInfo) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void i(int i10, long j10, long j11, float f10) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void j(int i10, @p0 SessionPlayer sessionPlayer, @p0 MediaController.PlaybackInfo playbackInfo, @NonNull SessionPlayer sessionPlayer2, @NonNull MediaController.PlaybackInfo playbackInfo2) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void k(int i10, SessionPlayer.c cVar) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void l(int i10, long j10, long j11, int i11) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void m(int i10, @NonNull List<MediaItem> list, MediaMetadata mediaMetadata, int i11, int i12, int i13) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void n(int i10, MediaMetadata mediaMetadata) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void o(int i10, int i11, int i12, int i13, int i14) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void q(int i10, long j10, long j11, long j12) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void r(int i10, SessionResult sessionResult) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void s(int i10, int i11, int i12, int i13, int i14) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void t(int i10, @NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void u(int i10, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void v(int i10, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void w(int i10, List<SessionPlayer.TrackInfo> list, SessionPlayer.TrackInfo trackInfo, SessionPlayer.TrackInfo trackInfo2, SessionPlayer.TrackInfo trackInfo3, SessionPlayer.TrackInfo trackInfo4) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        void x(int i10, @NonNull VideoSize videoSize) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void y(int i10, @NonNull SessionCommand sessionCommand, Bundle bundle) throws RemoteException {
        }

        @Override // androidx.media2.session.MediaSession.c
        final void z(int i10, @NonNull List<MediaSession.CommandButton> list) throws RemoteException {
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private final class h extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f59180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media.f.b f59181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.b0("mLock")
        private final List<j> f59182c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f59184a;

            a(List list) {
                this.f59184a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i10;
                int i11;
                int i12;
                int i13;
                for (int i14 = 0; i14 < this.f59184a.size(); i14++) {
                    j jVar = (j) this.f59184a.get(i14);
                    Bundle bundle = jVar.f59190d;
                    if (bundle != null) {
                        try {
                            bundle.setClassLoader(q.this.f59153p1.getContext().getClassLoader());
                            i10 = jVar.f59190d.getInt(MediaBrowserCompat.f9287d, -1);
                            i11 = jVar.f59190d.getInt(MediaBrowserCompat.f9288e, -1);
                        } catch (BadParcelableException unused) {
                            jVar.f59191e.j(null);
                            return;
                        }
                    } else {
                        i10 = 0;
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i10 < 0 || i11 < 1) {
                        i12 = 0;
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i12 = i10;
                        i13 = i11;
                    }
                    LibraryResult libraryResultT = q.this.f59153p1.u().t(q.this.f59153p1.k(), jVar.f59187a, jVar.f59189c, i12, i13, a0.g(q.this.f59153p1.getContext(), jVar.f59190d));
                    if (libraryResultT == null || libraryResultT.i() != 0) {
                        jVar.f59191e.j(null);
                    } else {
                        jVar.f59191e.j(a0.H(a0.m(libraryResultT.l()), 262144));
                    }
                }
            }
        }

        h(androidx.media.f.b bVar) {
            super(null);
            this.f59180a = new Object();
            this.f59182c = new ArrayList();
            this.f59181b = bVar;
        }

        void A(MediaSession.d dVar, String str, Bundle bundle, androidx.media.e.m<List<MediaBrowserCompat.MediaItem>> mVar) {
            synchronized (this.f59180a) {
                this.f59182c.add(new j(dVar, dVar.e(), str, bundle, mVar));
            }
        }

        @Override // androidx.media2.session.MediaSession.c
        void c(int i10, @NonNull String str, int i11, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
            q.this.h(this.f59181b, str, libraryParams != null ? libraryParams.getExtras() : null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                return androidx.core.util.o.a(this.f59181b, ((h) obj).f59181b);
            }
            return false;
        }

        public int hashCode() {
            return androidx.core.util.o.b(this.f59181b);
        }

        @Override // androidx.media2.session.MediaSession.c
        void p(int i10, @NonNull String str, int i11, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
            ArrayList arrayList = new ArrayList();
            synchronized (this.f59180a) {
                try {
                    for (int size = this.f59182c.size() - 1; size >= 0; size--) {
                        j jVar = this.f59182c.get(size);
                        if (androidx.core.util.o.a(this.f59181b, jVar.f59188b) && jVar.f59189c.equals(str)) {
                            arrayList.add(jVar);
                            this.f59182c.remove(size);
                        }
                    }
                    if (arrayList.size() == 0) {
                        return;
                    }
                    q.this.f59153p1.r2().execute(new a(arrayList));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static class i extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media.e f59186a;

        i(androidx.media.e eVar) {
            super(null);
            this.f59186a = eVar;
        }

        @Override // androidx.media2.session.MediaSession.c
        void c(int i10, @NonNull String str, int i11, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
            if (libraryParams == null || libraryParams.getExtras() == null) {
                this.f59186a.i(str);
            } else {
                this.f59186a.j(str, libraryParams.getExtras());
            }
        }

        @Override // androidx.media2.session.MediaSession.c
        void p(int i10, @NonNull String str, int i11, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSession.d f59187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media.f.b f59188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f59189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f59190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final androidx.media.e.m<List<MediaBrowserCompat.MediaItem>> f59191e;

        j(MediaSession.d dVar, androidx.media.f.b bVar, String str, Bundle bundle, androidx.media.e.m<List<MediaBrowserCompat.MediaItem>> mVar) {
            this.f59187a = dVar;
            this.f59188b = bVar;
            this.f59189c = str;
            this.f59190d = bundle;
            this.f59191e = mVar;
        }
    }

    q(Context context, MediaLibraryService.a.c cVar, MediaSessionCompat.Token token) {
        super(context, cVar, token);
        this.f59153p1 = cVar;
        this.f59152p0 = new i(this);
    }

    private MediaSession.d B() {
        return z().c(e());
    }

    MediaSession.c A() {
        return this.f59152p0;
    }

    @Override // androidx.media.e
    public void k(String str, Bundle bundle, androidx.media.e.m<Bundle> mVar) {
        if (mVar != null) {
            mVar.b();
        }
        this.f59153p1.r2().execute(new f(str, B(), mVar, bundle));
    }

    @Override // androidx.media2.session.y, androidx.media.e
    public androidx.media.e.C0493e l(String str, int i10, Bundle bundle) {
        MediaSession.d dVarB;
        if (super.l(str, i10, bundle) == null || (dVarB = B()) == null) {
            return null;
        }
        if (z().f(dVarB, 50000)) {
            LibraryResult libraryResultS = this.f59153p1.u().s(this.f59153p1.k(), dVarB, a0.g(this.f59153p1.getContext(), bundle));
            if (libraryResultS != null && libraryResultS.i() == 0 && libraryResultS.g() != null) {
                MediaMetadata mediaMetadataM = libraryResultS.g().m();
                return new androidx.media.e.C0493e(mediaMetadataM != null ? mediaMetadataM.q("android.media.metadata.MEDIA_ID") : "", a0.w(libraryResultS.k()));
            }
        }
        return a0.f58740c;
    }

    @Override // androidx.media2.session.y, androidx.media.e
    public void m(String str, androidx.media.e.m<List<MediaBrowserCompat.MediaItem>> mVar) {
        n(str, mVar, null);
    }

    @Override // androidx.media.e
    public void n(String str, androidx.media.e.m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
        MediaSession.d dVarB = B();
        if (TextUtils.isEmpty(str)) {
            Objects.toString(dVarB);
            mVar.h(null);
        } else {
            mVar.b();
            this.f59153p1.r2().execute(new c(dVarB, mVar, bundle, str));
        }
    }

    @Override // androidx.media.e
    public void o(String str, androidx.media.e.m<MediaBrowserCompat.MediaItem> mVar) {
        MediaSession.d dVarB = B();
        if (TextUtils.isEmpty(str)) {
            Objects.toString(dVarB);
            mVar.h(null);
        } else {
            mVar.b();
            this.f59153p1.r2().execute(new d(dVarB, mVar, str));
        }
    }

    @Override // androidx.media.e
    public void p(String str, Bundle bundle, androidx.media.e.m<List<MediaBrowserCompat.MediaItem>> mVar) {
        MediaSession.d dVarB = B();
        if (TextUtils.isEmpty(str)) {
            Objects.toString(dVarB);
            mVar.h(null);
        } else if (dVarB.c() instanceof h) {
            mVar.b();
            this.f59153p1.r2().execute(new e(dVarB, mVar, str, bundle));
        }
    }

    @Override // androidx.media.e
    public void q(String str, Bundle bundle) {
        MediaSession.d dVarB = B();
        if (TextUtils.isEmpty(str)) {
            Objects.toString(dVarB);
        } else {
            this.f59153p1.r2().execute(new a(dVarB, bundle, str));
        }
    }

    @Override // androidx.media.e
    public void r(String str) {
        MediaSession.d dVarB = B();
        if (TextUtils.isEmpty(str)) {
            Objects.toString(dVarB);
        } else {
            this.f59153p1.r2().execute(new b(dVarB, str));
        }
    }

    @Override // androidx.media2.session.y
    MediaSession.d y(androidx.media.f.b bVar) {
        return new MediaSession.d(bVar, -1, this.Z.c(bVar), new h(bVar), null);
    }
}
