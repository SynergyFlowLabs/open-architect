package androidx.media2.session;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.Rating;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import com.google.common.util.concurrent.t1;
import java.io.Closeable;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class MediaSession implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f58622b = "MediaSession";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f58623c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("STATIC_LOCK")
    private static final HashMap<String, MediaSession> f58624d = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f58625a;

    public static final class CommandButton implements androidx.versionedparcelable.h {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        SessionCommand f58626q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f58627r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence f58628s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Bundle f58629t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f58630u;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private SessionCommand f58631a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f58632b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private CharSequence f58633c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Bundle f58634d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f58635e;

            @NonNull
            public CommandButton a() {
                return new CommandButton(this.f58631a, this.f58632b, this.f58633c, this.f58634d, this.f58635e);
            }

            @NonNull
            public a b(@p0 SessionCommand sessionCommand) {
                this.f58631a = sessionCommand;
                return this;
            }

            @NonNull
            public a c(@p0 CharSequence charSequence) {
                this.f58633c = charSequence;
                return this;
            }

            @NonNull
            public a d(boolean z10) {
                this.f58635e = z10;
                return this;
            }

            @NonNull
            public a e(@p0 Bundle bundle) {
                this.f58634d = bundle;
                return this;
            }

            @NonNull
            public a f(int i10) {
                this.f58632b = i10;
                return this;
            }
        }

        CommandButton() {
        }

        @p0
        public SessionCommand d() {
            return this.f58626q;
        }

        @p0
        public CharSequence f() {
            return this.f58628s;
        }

        public int g() {
            return this.f58627r;
        }

        @p0
        public Bundle getExtras() {
            return this.f58629t;
        }

        public boolean h() {
            return this.f58630u;
        }

        CommandButton(@p0 SessionCommand sessionCommand, int i10, @p0 CharSequence charSequence, Bundle bundle, boolean z10) {
            this.f58626q = sessionCommand;
            this.f58627r = i10;
            this.f58628s = charSequence;
            this.f58629t = bundle;
            this.f58630u = z10;
        }
    }

    public static final class a extends b<MediaSession, a, f> {

        /* JADX INFO: renamed from: androidx.media2.session.MediaSession$a$a, reason: collision with other inner class name */
        class C0544a extends f {
            C0544a() {
            }
        }

        public a(@NonNull Context context, @NonNull SessionPlayer sessionPlayer) {
            super(context, sessionPlayer);
        }

        @Override // androidx.media2.session.MediaSession.b
        @NonNull
        public MediaSession a() {
            if (this.f58640d == null) {
                this.f58640d = androidx.core.content.d.o(this.f58637a);
            }
            if (this.f58641e == 0) {
                this.f58641e = new C0544a();
            }
            return new MediaSession(this.f58637a, this.f58639c, this.f58638b, this.f58642f, this.f58640d, this.f58641e, this.f58643g);
        }

        @Override // androidx.media2.session.MediaSession.b
        @NonNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(@NonNull Bundle bundle) {
            return (a) super.b(bundle);
        }

        @Override // androidx.media2.session.MediaSession.b
        @NonNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(@NonNull String str) {
            return (a) super.c(str);
        }

        @Override // androidx.media2.session.MediaSession.b
        @NonNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(@p0 PendingIntent pendingIntent) {
            return (a) super.d(pendingIntent);
        }

        @Override // androidx.media2.session.MediaSession.b
        @NonNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a e(@NonNull Executor executor, @NonNull f fVar) {
            return (a) super.e(executor, fVar);
        }
    }

    @b1({b1.a.LIBRARY})
    static abstract class b<T extends MediaSession, U extends b<T, U, C>, C extends f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f58637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        SessionPlayer f58638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f58639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Executor f58640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C f58641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        PendingIntent f58642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Bundle f58643g;

        b(@NonNull Context context, @NonNull SessionPlayer sessionPlayer) {
            if (context == null) {
                throw new NullPointerException("context shouldn't be null");
            }
            if (sessionPlayer == null) {
                throw new NullPointerException("player shouldn't be null");
            }
            this.f58637a = context;
            this.f58638b = sessionPlayer;
            this.f58639c = "";
        }

        @NonNull
        abstract T a();

        @NonNull
        U b(@NonNull Bundle bundle) {
            if (bundle == null) {
                throw new NullPointerException("extras shouldn't be null");
            }
            if (a0.z(bundle)) {
                throw new IllegalArgumentException("extras shouldn't contain any custom parcelables");
            }
            this.f58643g = new Bundle(bundle);
            return this;
        }

        @NonNull
        U c(@NonNull String str) {
            if (str == null) {
                throw new NullPointerException("id shouldn't be null");
            }
            this.f58639c = str;
            return this;
        }

        @NonNull
        U d(@p0 PendingIntent pendingIntent) {
            this.f58642f = pendingIntent;
            return this;
        }

        @NonNull
        U e(@NonNull Executor executor, @NonNull C c10) {
            if (executor == null) {
                throw new NullPointerException("executor shouldn't be null");
            }
            if (c10 == null) {
                throw new NullPointerException("callback shouldn't be null");
            }
            this.f58640d = executor;
            this.f58641e = c10;
            return this;
        }
    }

    static abstract class c {
        c() {
        }

        abstract void a(int i10, @NonNull SessionCommandGroup sessionCommandGroup) throws RemoteException;

        abstract void b(int i10, @NonNull MediaItem mediaItem, int i11, long j10, long j11, long j12) throws RemoteException;

        abstract void c(int i10, @NonNull String str, int i11, @p0 MediaLibraryService.LibraryParams libraryParams) throws RemoteException;

        abstract void d(int i10, @p0 MediaItem mediaItem, int i11, int i12, int i13) throws RemoteException;

        abstract void e(int i10) throws RemoteException;

        abstract void f(int i10, LibraryResult libraryResult) throws RemoteException;

        abstract void g(int i10) throws RemoteException;

        abstract void h(int i10, @NonNull MediaController.PlaybackInfo playbackInfo) throws RemoteException;

        abstract void i(int i10, long j10, long j11, float f10) throws RemoteException;

        abstract void j(int i10, @p0 SessionPlayer sessionPlayer, @p0 MediaController.PlaybackInfo playbackInfo, @NonNull SessionPlayer sessionPlayer2, @NonNull MediaController.PlaybackInfo playbackInfo2) throws RemoteException;

        abstract void k(int i10, SessionPlayer.c cVar) throws RemoteException;

        abstract void l(int i10, long j10, long j11, int i11) throws RemoteException;

        abstract void m(int i10, @NonNull List<MediaItem> list, @p0 MediaMetadata mediaMetadata, int i11, int i12, int i13) throws RemoteException;

        abstract void n(int i10, @p0 MediaMetadata mediaMetadata) throws RemoteException;

        abstract void o(int i10, int i11, int i12, int i13, int i14) throws RemoteException;

        abstract void p(int i10, @NonNull String str, int i11, @p0 MediaLibraryService.LibraryParams libraryParams) throws RemoteException;

        abstract void q(int i10, long j10, long j11, long j12) throws RemoteException;

        abstract void r(int i10, SessionResult sessionResult) throws RemoteException;

        abstract void s(int i10, int i11, int i12, int i13, int i14) throws RemoteException;

        abstract void t(int i10, @NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) throws RemoteException;

        abstract void u(int i10, SessionPlayer.TrackInfo trackInfo) throws RemoteException;

        abstract void v(int i10, SessionPlayer.TrackInfo trackInfo) throws RemoteException;

        abstract void w(int i10, List<SessionPlayer.TrackInfo> list, SessionPlayer.TrackInfo trackInfo, SessionPlayer.TrackInfo trackInfo2, SessionPlayer.TrackInfo trackInfo3, SessionPlayer.TrackInfo trackInfo4) throws RemoteException;

        abstract void x(int i10, @NonNull VideoSize videoSize) throws RemoteException;

        abstract void y(int i10, @NonNull SessionCommand sessionCommand, @p0 Bundle bundle) throws RemoteException;

        abstract void z(int i10, @NonNull List<CommandButton> list) throws RemoteException;
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f58644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media.f.b f58645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f58646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f58647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f58648e;

        d(@NonNull androidx.media.f.b bVar, int i10, boolean z10, @p0 c cVar, @p0 Bundle bundle) {
            this.f58645b = bVar;
            this.f58644a = i10;
            this.f58646c = z10;
            this.f58647d = cVar;
            if (bundle == null || a0.z(bundle)) {
                this.f58648e = null;
            } else {
                this.f58648e = bundle;
            }
        }

        @NonNull
        static d a() {
            return new d(new androidx.media.f.b(androidx.media.f.b.f52906b, -1, -1), -1, false, null, null);
        }

        @NonNull
        public Bundle b() {
            return this.f58648e == null ? Bundle.EMPTY : new Bundle(this.f58648e);
        }

        @p0
        c c() {
            return this.f58647d;
        }

        @NonNull
        public String d() {
            return this.f58645b.a();
        }

        androidx.media.f.b e() {
            return this.f58645b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            d dVar = (d) obj;
            c cVar = this.f58647d;
            return (cVar == null && dVar.f58647d == null) ? this.f58645b.equals(dVar.f58645b) : androidx.core.util.o.a(cVar, dVar.f58647d);
        }

        public int f() {
            return this.f58645b.c();
        }

        @b1({b1.a.LIBRARY})
        public boolean g() {
            return this.f58646c;
        }

        public int hashCode() {
            return androidx.core.util.o.b(this.f58647d, this.f58645b);
        }

        public String toString() {
            return "ControllerInfo {pkg=" + this.f58645b.a() + ", uid=" + this.f58645b.c() + "})";
        }
    }

    interface e extends o.b, Closeable {
        void F2(@NonNull SessionPlayer sessionPlayer);

        void G7(@NonNull SessionCommand sessionCommand, @p0 Bundle bundle);

        @NonNull
        SessionToken I0();

        @NonNull
        SessionPlayer J5();

        PendingIntent M();

        t1<SessionResult> O5(@NonNull d dVar, @NonNull SessionCommand sessionCommand, @p0 Bundle bundle);

        boolean P7(@NonNull d dVar);

        void Q9(androidx.media2.session.b bVar, int i10, String str, int i11, int i12, @p0 Bundle bundle);

        void R7(@NonNull d dVar, @NonNull SessionCommandGroup sessionCommandGroup);

        @NonNull
        List<d> Sc();

        IBinder Ya();

        MediaController.PlaybackInfo b0();

        @NonNull
        MediaSessionCompat cb();

        t1<SessionResult> ce(@NonNull d dVar, @NonNull List<CommandButton> list);

        Context getContext();

        @NonNull
        String getId();

        @NonNull
        Uri getUri();

        boolean isClosed();

        MediaSession k();

        Executor r2();

        PlaybackStateCompat ta();

        f u();

        void v4(long j10);
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f58649a;

        static abstract class a {
            a() {
            }

            public void a(MediaSession mediaSession) {
            }

            public void b(MediaSession mediaSession, int i10) {
            }

            public void c(MediaSession mediaSession) {
            }
        }

        public int a(@NonNull MediaSession mediaSession, @NonNull d dVar, @NonNull SessionCommand sessionCommand) {
            return 0;
        }

        @p0
        public SessionCommandGroup b(@NonNull MediaSession mediaSession, @NonNull d dVar) {
            return new SessionCommandGroup.a().e(2).j();
        }

        @p0
        public MediaItem c(@NonNull MediaSession mediaSession, @NonNull d dVar, @NonNull String str) {
            return null;
        }

        final void d(MediaSession mediaSession) {
            a aVar = this.f58649a;
            if (aVar != null) {
                aVar.a(mediaSession);
            }
        }

        @NonNull
        public SessionResult e(@NonNull MediaSession mediaSession, @NonNull d dVar, @NonNull SessionCommand sessionCommand, @p0 Bundle bundle) {
            return new SessionResult(-6, null);
        }

        public void f(@NonNull MediaSession mediaSession, @NonNull d dVar) {
        }

        public int g(@NonNull MediaSession mediaSession, @NonNull d dVar) {
            return -6;
        }

        final void h(MediaSession mediaSession, int i10) {
            a aVar = this.f58649a;
            if (aVar != null) {
                aVar.b(mediaSession, i10);
            }
        }

        public void i(@NonNull MediaSession mediaSession, @NonNull d dVar) {
        }

        public int j(@NonNull MediaSession mediaSession, @NonNull d dVar) {
            return -6;
        }

        final void k(MediaSession mediaSession) {
            a aVar = this.f58649a;
            if (aVar != null) {
                aVar.c(mediaSession);
            }
        }

        public int l(@NonNull MediaSession mediaSession, @NonNull d dVar, @NonNull Uri uri, @p0 Bundle bundle) {
            return -6;
        }

        public int m(@NonNull MediaSession mediaSession, @NonNull d dVar, @NonNull String str, @NonNull Rating rating) {
            return -6;
        }

        public int n(@NonNull MediaSession mediaSession, @NonNull d dVar) {
            return -6;
        }

        public int o(@NonNull MediaSession mediaSession, @NonNull d dVar) {
            return -6;
        }

        void p(a aVar) {
            this.f58649a = aVar;
        }
    }

    MediaSession(Context context, String str, SessionPlayer sessionPlayer, PendingIntent pendingIntent, Executor executor, f fVar, Bundle bundle) {
        synchronized (f58623c) {
            try {
                HashMap<String, MediaSession> map = f58624d;
                if (map.containsKey(str)) {
                    throw new IllegalStateException("Session ID must be unique. ID=" + str);
                }
                map.put(str, this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f58625a = a(context, str, sessionPlayer, pendingIntent, executor, fVar, bundle);
    }

    static MediaSession d(Uri uri) {
        synchronized (f58623c) {
            try {
                for (MediaSession mediaSession : f58624d.values()) {
                    if (androidx.core.util.o.a(mediaSession.getUri(), uri)) {
                        return mediaSession;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    private Uri getUri() {
        return this.f58625a.getUri();
    }

    public void F2(@NonNull SessionPlayer sessionPlayer) {
        if (sessionPlayer == null) {
            throw new NullPointerException("player shouldn't be null");
        }
        this.f58625a.F2(sessionPlayer);
    }

    public void G7(@NonNull SessionCommand sessionCommand, @p0 Bundle bundle) {
        if (sessionCommand == null) {
            throw new NullPointerException("command shouldn't be null");
        }
        if (sessionCommand.d() != 0) {
            throw new IllegalArgumentException("command should be a custom command");
        }
        this.f58625a.G7(sessionCommand, bundle);
    }

    @NonNull
    public SessionToken I0() {
        return this.f58625a.I0();
    }

    @NonNull
    public SessionPlayer J5() {
        return this.f58625a.J5();
    }

    @NonNull
    public t1<SessionResult> O5(@NonNull d dVar, @NonNull SessionCommand sessionCommand, @p0 Bundle bundle) {
        if (dVar == null) {
            throw new NullPointerException("controller shouldn't be null");
        }
        if (sessionCommand == null) {
            throw new NullPointerException("command shouldn't be null");
        }
        if (sessionCommand.d() == 0) {
            return this.f58625a.O5(dVar, sessionCommand, bundle);
        }
        throw new IllegalArgumentException("command should be a custom command");
    }

    public void R7(@NonNull d dVar, @NonNull SessionCommandGroup sessionCommandGroup) {
        if (dVar == null) {
            throw new NullPointerException("controller shouldn't be null");
        }
        if (sessionCommandGroup == null) {
            throw new NullPointerException("commands shouldn't be null");
        }
        this.f58625a.R7(dVar, sessionCommandGroup);
    }

    @NonNull
    public List<d> Sc() {
        return this.f58625a.Sc();
    }

    e a(Context context, String str, SessionPlayer sessionPlayer, PendingIntent pendingIntent, Executor executor, f fVar, Bundle bundle) {
        return new t(this, context, str, sessionPlayer, pendingIntent, executor, fVar, bundle);
    }

    e b() {
        return this.f58625a;
    }

    IBinder c() {
        return this.f58625a.Ya();
    }

    @b1({b1.a.LIBRARY})
    public MediaSessionCompat cb() {
        return this.f58625a.cb();
    }

    @NonNull
    public t1<SessionResult> ce(@NonNull d dVar, @NonNull List<CommandButton> list) {
        if (dVar == null) {
            throw new NullPointerException("controller shouldn't be null");
        }
        if (list != null) {
            return this.f58625a.ce(dVar, list);
        }
        throw new NullPointerException("layout shouldn't be null");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            synchronized (f58623c) {
                f58624d.remove(this.f58625a.getId());
            }
            this.f58625a.close();
        } catch (Exception unused) {
        }
    }

    @NonNull
    public MediaSessionCompat.Token e() {
        return this.f58625a.cb().i();
    }

    void f(androidx.media2.session.b bVar, int i10, String str, int i11, int i12, @p0 Bundle bundle) {
        this.f58625a.Q9(bVar, i10, str, i11, i12, bundle);
    }

    @NonNull
    Context getContext() {
        return this.f58625a.getContext();
    }

    @NonNull
    public String getId() {
        return this.f58625a.getId();
    }

    @b1({b1.a.LIBRARY})
    public boolean isClosed() {
        return this.f58625a.isClosed();
    }

    @NonNull
    Executor r2() {
        return this.f58625a.r2();
    }

    @NonNull
    f u() {
        return this.f58625a.u();
    }

    @b1({b1.a.LIBRARY})
    public void v4(long j10) {
        this.f58625a.v4(j10);
    }
}
