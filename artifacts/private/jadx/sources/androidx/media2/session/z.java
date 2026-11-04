package androidx.media2.session;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.MediaParcelUtils;
import androidx.media2.common.Rating;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import androidx.versionedparcelable.ParcelImpl;
import com.google.common.util.concurrent.t1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class z extends androidx.media2.session.c.b {

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private static final boolean f59462z3 = true;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    final androidx.media2.session.a<IBinder> f59463u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    final Object f59464v3 = new Object();

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    final WeakReference<MediaSession.e> f59465w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private final androidx.media.f f59466x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private static final String f59461y3 = "MediaSessionStub";
    static final boolean A3 = Log.isLoggable(f59461y3, 3);
    static final SparseArray<SessionCommand> B3 = new SparseArray<>();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaSession.d f59467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SessionCommand f59468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f59470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MediaSession.e f59471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q0 f59472f;

        /* JADX INFO: renamed from: androidx.media2.session.z$a$a, reason: collision with other inner class name */
        class RunnableC0556a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t1 f59474a;

            RunnableC0556a(t1 t1Var) {
                this.f59474a = t1Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    a aVar = a.this;
                    z.Q(aVar.f59467a, aVar.f59469c, (SessionPlayer.c) this.f59474a.get(0L, TimeUnit.MILLISECONDS));
                } catch (Exception unused) {
                    a aVar2 = a.this;
                    z.S(aVar2.f59467a, aVar2.f59469c, -2);
                }
            }
        }

        a(MediaSession.d dVar, SessionCommand sessionCommand, int i10, int i11, MediaSession.e eVar, q0 q0Var) {
            this.f59467a = dVar;
            this.f59468b = sessionCommand;
            this.f59469c = i10;
            this.f59470d = i11;
            this.f59471e = eVar;
            this.f59472f = q0Var;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            SessionCommand sessionCommand;
            if (z.this.f59463u3.h(this.f59467a)) {
                SessionCommand sessionCommand2 = this.f59468b;
                if (sessionCommand2 != null) {
                    if (!z.this.f59463u3.g(this.f59467a, sessionCommand2)) {
                        if (z.A3) {
                            Objects.toString(this.f59468b);
                            Objects.toString(this.f59467a);
                        }
                        z.S(this.f59467a, this.f59469c, -4);
                        return;
                    }
                    sessionCommand = z.B3.get(this.f59468b.d());
                } else {
                    if (!z.this.f59463u3.f(this.f59467a, this.f59470d)) {
                        if (z.A3) {
                            Objects.toString(this.f59467a);
                        }
                        z.S(this.f59467a, this.f59469c, -4);
                        return;
                    }
                    sessionCommand = z.B3.get(this.f59470d);
                }
                if (sessionCommand != null) {
                    try {
                        int iA = this.f59471e.u().a(this.f59471e.k(), this.f59467a, sessionCommand);
                        if (iA != 0) {
                            if (z.A3) {
                                Objects.toString(this.f59467a);
                                Objects.toString(z.this.f59465w3);
                            }
                            z.S(this.f59467a, this.f59469c, iA);
                            return;
                        }
                    } catch (RemoteException unused) {
                        this.f59467a.toString();
                        return;
                    } catch (Exception e10) {
                        throw e10;
                    }
                }
                q0 q0Var = this.f59472f;
                if (q0Var instanceof p0) {
                    t1<SessionPlayer.c> t1VarA = ((p0) q0Var).a(this.f59471e, this.f59467a);
                    if (t1VarA != null) {
                        t1VarA.m0(new RunnableC0556a(t1VarA), androidx.media2.session.a0.f58741d);
                        return;
                    }
                    throw new RuntimeException("SessionPlayer has returned null, commandCode=" + this.f59470d);
                }
                if (q0Var instanceof o0) {
                    Object objA = ((o0) q0Var).a(this.f59471e, this.f59467a);
                    if (objA == null) {
                        throw new RuntimeException("SessionCallback has returned null, commandCode=" + this.f59470d);
                    }
                    if (objA instanceof Integer) {
                        z.S(this.f59467a, this.f59469c, ((Integer) objA).intValue());
                        return;
                    }
                    if (objA instanceof SessionResult) {
                        z.U(this.f59467a, this.f59469c, (SessionResult) objA);
                    } else if (z.A3) {
                        throw new RuntimeException("Unexpected return type " + objA + ". Fix bug");
                    }
                } else if (q0Var instanceof n0) {
                    Object objB = ((n0) q0Var).b((MediaLibraryService.a.c) this.f59471e, this.f59467a);
                    if (objB == null) {
                        throw new RuntimeException("LibrarySessionCallback has returned null, commandCode=" + this.f59470d);
                    }
                    if (objB instanceof Integer) {
                        z.M(this.f59467a, this.f59469c, ((Integer) objB).intValue());
                        return;
                    }
                    if (objB instanceof LibraryResult) {
                        z.O(this.f59467a, this.f59469c, (LibraryResult) objB);
                    } else if (z.A3) {
                        throw new RuntimeException("Unexpected return type " + objB + ". Fix bug");
                    }
                } else if (z.A3) {
                    throw new RuntimeException("Unknown task " + this.f59472f + ". Fix bug");
                }
            }
        }
    }

    class a0 implements n0<LibraryResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59479d;

        a0(String str, int i10, int i11, ParcelImpl parcelImpl) {
            this.f59476a = str;
            this.f59477b = i10;
            this.f59478c = i11;
            this.f59479d = parcelImpl;
        }

        @Override // androidx.media2.session.z.n0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public LibraryResult b(MediaLibraryService.a.c cVar, MediaSession.d dVar) {
            if (TextUtils.isEmpty(this.f59476a)) {
                Objects.toString(dVar);
                return new LibraryResult(-3);
            }
            int i10 = this.f59477b;
            if (i10 < 0) {
                Objects.toString(dVar);
                return new LibraryResult(-3);
            }
            int i11 = this.f59478c;
            if (i11 >= 1) {
                return cVar.b5(dVar, this.f59476a, i10, i11, (MediaLibraryService.LibraryParams) MediaParcelUtils.a(this.f59479d));
            }
            Objects.toString(dVar);
            return new LibraryResult(-3);
        }
    }

    class b implements o0<Integer> {
        b() {
        }

        @Override // androidx.media2.session.z.o0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer a(MediaSession.e eVar, MediaSession.d dVar) {
            return Integer.valueOf(eVar.u().o(eVar.k(), dVar));
        }
    }

    class b0 implements n0<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59483b;

        b0(String str, ParcelImpl parcelImpl) {
            this.f59482a = str;
            this.f59483b = parcelImpl;
        }

        @Override // androidx.media2.session.z.n0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer b(MediaLibraryService.a.c cVar, MediaSession.d dVar) {
            if (!TextUtils.isEmpty(this.f59482a)) {
                return Integer.valueOf(cVar.Qb(dVar, this.f59482a, (MediaLibraryService.LibraryParams) MediaParcelUtils.a(this.f59483b)));
            }
            Objects.toString(dVar);
            return -3;
        }
    }

    class c implements o0<Integer> {
        c() {
        }

        @Override // androidx.media2.session.z.o0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer a(MediaSession.e eVar, MediaSession.d dVar) {
            return Integer.valueOf(eVar.u().n(eVar.k(), dVar));
        }
    }

    class c0 implements n0<LibraryResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59489d;

        c0(String str, int i10, int i11, ParcelImpl parcelImpl) {
            this.f59486a = str;
            this.f59487b = i10;
            this.f59488c = i11;
            this.f59489d = parcelImpl;
        }

        @Override // androidx.media2.session.z.n0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public LibraryResult b(MediaLibraryService.a.c cVar, MediaSession.d dVar) {
            if (TextUtils.isEmpty(this.f59486a)) {
                Objects.toString(dVar);
                return new LibraryResult(-3);
            }
            int i10 = this.f59487b;
            if (i10 < 0) {
                Objects.toString(dVar);
                return new LibraryResult(-3);
            }
            int i11 = this.f59488c;
            if (i11 >= 1) {
                return cVar.g7(dVar, this.f59486a, i10, i11, (MediaLibraryService.LibraryParams) MediaParcelUtils.a(this.f59489d));
            }
            Objects.toString(dVar);
            return new LibraryResult(-3);
        }
    }

    class d implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f59491a;

        d(long j10) {
            this.f59491a = j10;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            return eVar.F(this.f59491a);
        }
    }

    class d0 implements n0<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59494b;

        d0(String str, ParcelImpl parcelImpl) {
            this.f59493a = str;
            this.f59494b = parcelImpl;
        }

        @Override // androidx.media2.session.z.n0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer b(MediaLibraryService.a.c cVar, MediaSession.d dVar) {
            if (!TextUtils.isEmpty(this.f59493a)) {
                return Integer.valueOf(cVar.W8(dVar, this.f59493a, (MediaLibraryService.LibraryParams) MediaParcelUtils.a(this.f59494b)));
            }
            Objects.toString(dVar);
            return -3;
        }
    }

    class e implements o0<SessionResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionCommand f59496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f59497b;

        e(SessionCommand sessionCommand, Bundle bundle) {
            this.f59496a = sessionCommand;
            this.f59497b = bundle;
        }

        @Override // androidx.media2.session.z.o0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SessionResult a(MediaSession.e eVar, MediaSession.d dVar) {
            SessionResult sessionResultE = eVar.u().e(eVar.k(), dVar, this.f59496a, this.f59497b);
            if (sessionResultE != null) {
                return sessionResultE;
            }
            throw new RuntimeException("SessionCallback#onCustomCommand has returned null, command=" + this.f59496a);
        }
    }

    class e0 implements n0<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59499a;

        e0(String str) {
            this.f59499a = str;
        }

        @Override // androidx.media2.session.z.n0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer b(MediaLibraryService.a.c cVar, MediaSession.d dVar) {
            if (!TextUtils.isEmpty(this.f59499a)) {
                return Integer.valueOf(cVar.G9(dVar, this.f59499a));
            }
            Objects.toString(dVar);
            return -3;
        }
    }

    class f implements o0<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Rating f59502b;

        f(String str, Rating rating) {
            this.f59501a = str;
            this.f59502b = rating;
        }

        @Override // androidx.media2.session.z.o0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer a(MediaSession.e eVar, MediaSession.d dVar) {
            if (TextUtils.isEmpty(this.f59501a)) {
                Objects.toString(dVar);
                return -3;
            }
            if (this.f59502b != null) {
                return Integer.valueOf(eVar.u().m(eVar.k(), dVar, this.f59501a, this.f59502b));
            }
            Objects.toString(dVar);
            return -3;
        }
    }

    class f0 implements o0<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59505b;

        f0(int i10, int i11) {
            this.f59504a = i10;
            this.f59505b = i11;
        }

        @Override // androidx.media2.session.z.o0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer a(MediaSession.e eVar, MediaSession.d dVar) {
            eVar.cb().e().E(this.f59504a, this.f59505b);
            return 0;
        }
    }

    class g implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f59507a;

        g(float f10) {
            this.f59507a = f10;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            return eVar.G(this.f59507a);
        }
    }

    class g0 implements o0<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59510b;

        g0(int i10, int i11) {
            this.f59509a = i10;
            this.f59510b = i11;
        }

        @Override // androidx.media2.session.z.o0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer a(MediaSession.e eVar, MediaSession.d dVar) {
            eVar.cb().e().c(this.f59509a, this.f59510b);
            return 0;
        }
    }

    class h implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f59512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59513b;

        h(List list, ParcelImpl parcelImpl) {
            this.f59512a = list;
            this.f59513b = parcelImpl;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            if (this.f59512a == null) {
                Objects.toString(dVar);
                return SessionPlayer.c.a(-3);
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f59512a.size(); i10++) {
                MediaItem mediaItemS = z.this.s(eVar, dVar, (String) this.f59512a.get(i10));
                if (mediaItemS != null) {
                    arrayList.add(mediaItemS);
                }
            }
            return eVar.Y0(arrayList, (MediaMetadata) MediaParcelUtils.a(this.f59513b));
        }
    }

    class h0 implements p0 {
        h0() {
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            return eVar.B();
        }
    }

    class i implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59516a;

        i(String str) {
            this.f59516a = str;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            if (TextUtils.isEmpty(this.f59516a)) {
                Objects.toString(dVar);
                return SessionPlayer.c.a(-3);
            }
            MediaItem mediaItemS = z.this.s(eVar, dVar, this.f59516a);
            return mediaItemS == null ? SessionPlayer.c.a(-3) : eVar.c(mediaItemS);
        }
    }

    class i0 implements p0 {
        i0() {
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            return eVar.pause();
        }
    }

    class j implements o0<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f59519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f59520b;

        j(Uri uri, Bundle bundle) {
            this.f59519a = uri;
            this.f59520b = bundle;
        }

        @Override // androidx.media2.session.z.o0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer a(MediaSession.e eVar, MediaSession.d dVar) {
            if (this.f59519a != null) {
                return Integer.valueOf(eVar.u().l(eVar.k(), dVar, this.f59519a, this.f59520b));
            }
            Objects.toString(dVar);
            return -3;
        }
    }

    class j0 implements p0 {
        j0() {
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            return eVar.A();
        }
    }

    class k implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59523a;

        k(ParcelImpl parcelImpl) {
            this.f59523a = parcelImpl;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            return eVar.a1((MediaMetadata) MediaParcelUtils.a(this.f59523a));
        }
    }

    class k0 implements o0<Integer> {
        k0() {
        }

        @Override // androidx.media2.session.z.o0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer a(MediaSession.e eVar, MediaSession.d dVar) {
            return Integer.valueOf(eVar.u().g(eVar.k(), dVar));
        }
    }

    class l implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59527b;

        l(String str, int i10) {
            this.f59526a = str;
            this.f59527b = i10;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            if (TextUtils.isEmpty(this.f59526a)) {
                Objects.toString(dVar);
                return SessionPlayer.c.a(-3);
            }
            MediaItem mediaItemS = z.this.s(eVar, dVar, this.f59526a);
            return mediaItemS == null ? SessionPlayer.c.a(-3) : eVar.a(this.f59527b, mediaItemS);
        }
    }

    class l0 implements o0<Integer> {
        l0() {
        }

        @Override // androidx.media2.session.z.o0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer a(MediaSession.e eVar, MediaSession.d dVar) {
            return Integer.valueOf(eVar.u().j(eVar.k(), dVar));
        }
    }

    class m implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59530a;

        m(int i10) {
            this.f59530a = i10;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            return eVar.G0(this.f59530a);
        }
    }

    final class m0 extends MediaSession.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media2.session.b f59532a;

        m0(androidx.media2.session.b bVar) {
            this.f59532a = bVar;
        }

        @NonNull
        IBinder A() {
            return this.f59532a.asBinder();
        }

        @Override // androidx.media2.session.MediaSession.c
        void a(int i10, @NonNull SessionCommandGroup sessionCommandGroup) throws RemoteException {
            this.f59532a.c7(i10, MediaParcelUtils.c(sessionCommandGroup));
        }

        @Override // androidx.media2.session.MediaSession.c
        void b(int i10, @NonNull MediaItem mediaItem, int i11, long j10, long j11, long j12) throws RemoteException {
            this.f59532a.f8(i10, MediaParcelUtils.c(mediaItem), i11, j10, j11, j12);
        }

        @Override // androidx.media2.session.MediaSession.c
        void c(int i10, @NonNull String str, int i11, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
            this.f59532a.ld(i10, str, i11, MediaParcelUtils.c(libraryParams));
        }

        @Override // androidx.media2.session.MediaSession.c
        void d(int i10, MediaItem mediaItem, int i11, int i12, int i13) throws RemoteException {
            this.f59532a.d2(i10, MediaParcelUtils.c(mediaItem), i11, i12, i13);
        }

        @Override // androidx.media2.session.MediaSession.c
        void e(int i10) throws RemoteException {
            this.f59532a.O8(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == m0.class) {
                return androidx.core.util.o.a(A(), ((m0) obj).A());
            }
            return false;
        }

        @Override // androidx.media2.session.MediaSession.c
        void f(int i10, LibraryResult libraryResult) throws RemoteException {
            if (libraryResult == null) {
                libraryResult = new LibraryResult(-1);
            }
            this.f59532a.xb(i10, MediaParcelUtils.c(libraryResult));
        }

        @Override // androidx.media2.session.MediaSession.c
        void g(int i10) throws RemoteException {
            this.f59532a.r3(i10);
        }

        @Override // androidx.media2.session.MediaSession.c
        void h(int i10, @NonNull MediaController.PlaybackInfo playbackInfo) throws RemoteException {
            this.f59532a.n3(i10, MediaParcelUtils.c(playbackInfo));
        }

        public int hashCode() {
            return androidx.core.util.o.b(A());
        }

        @Override // androidx.media2.session.MediaSession.c
        void i(int i10, long j10, long j11, float f10) throws RemoteException {
            this.f59532a.w9(i10, j10, j11, f10);
        }

        @Override // androidx.media2.session.MediaSession.c
        void j(int i10, @androidx.annotation.p0 SessionPlayer sessionPlayer, @androidx.annotation.p0 MediaController.PlaybackInfo playbackInfo, @NonNull SessionPlayer sessionPlayer2, @NonNull MediaController.PlaybackInfo playbackInfo2) throws RemoteException {
            int i11;
            int i12;
            if (sessionPlayer == null || z.this.f59465w3.get() == null) {
                return;
            }
            List<MediaItem> listV0 = sessionPlayer.V0();
            List<MediaItem> listV1 = sessionPlayer2.V0();
            if (androidx.core.util.o.a(listV0, listV1)) {
                i11 = i10;
                MediaMetadata mediaMetadataV = sessionPlayer.V();
                MediaMetadata mediaMetadataV2 = sessionPlayer2.V();
                if (!androidx.core.util.o.a(mediaMetadataV, mediaMetadataV2)) {
                    n(i11, mediaMetadataV2);
                }
            } else {
                i11 = i10;
                m(i11, listV1, sessionPlayer2.V(), sessionPlayer2.l0(), sessionPlayer2.a0(), sessionPlayer2.e0());
            }
            MediaItem mediaItemZ = sessionPlayer.Z();
            MediaItem mediaItemZ2 = sessionPlayer2.Z();
            if (!androidx.core.util.o.a(mediaItemZ, mediaItemZ2)) {
                d(i11, mediaItemZ2, sessionPlayer2.l0(), sessionPlayer2.a0(), sessionPlayer2.e0());
            }
            int iC = sessionPlayer2.C();
            if (sessionPlayer.C() != iC) {
                o(i10, iC, sessionPlayer2.l0(), sessionPlayer2.a0(), sessionPlayer2.e0());
            }
            int iJ = sessionPlayer2.J();
            if (sessionPlayer.J() != iJ) {
                s(i10, iJ, sessionPlayer2.l0(), sessionPlayer2.a0(), sessionPlayer2.e0());
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long currentPosition = sessionPlayer2.getCurrentPosition();
            l(i10, jElapsedRealtime, currentPosition, sessionPlayer2.s0());
            MediaItem mediaItemZ3 = sessionPlayer2.Z();
            if (mediaItemZ3 != null) {
                b(i10, mediaItemZ3, sessionPlayer2.i1(), sessionPlayer2.v(), SystemClock.elapsedRealtime(), sessionPlayer2.getCurrentPosition());
            }
            float fT0 = sessionPlayer2.t0();
            if (fT0 != sessionPlayer.t0()) {
                i12 = i10;
                i(i12, jElapsedRealtime, currentPosition, fT0);
            } else {
                i12 = i10;
            }
            if (androidx.core.util.o.a(playbackInfo, playbackInfo2)) {
                return;
            }
            h(i12, playbackInfo2);
        }

        @Override // androidx.media2.session.MediaSession.c
        void k(int i10, @androidx.annotation.p0 SessionPlayer.c cVar) throws RemoteException {
            r(i10, SessionResult.k(cVar));
        }

        @Override // androidx.media2.session.MediaSession.c
        void l(int i10, long j10, long j11, int i11) throws RemoteException {
            this.f59532a.Td(i10, j10, j11, i11);
        }

        @Override // androidx.media2.session.MediaSession.c
        void m(int i10, @NonNull List<MediaItem> list, MediaMetadata mediaMetadata, int i11, int i12, int i13) throws RemoteException {
            MediaSession.d dVarC = z.this.f59463u3.c(A());
            if (z.this.f59463u3.f(dVarC, SessionCommand.E)) {
                this.f59532a.td(i10, androidx.media2.session.a0.c(list), MediaParcelUtils.c(mediaMetadata), i11, i12, i13);
            } else if (z.this.f59463u3.f(dVarC, SessionCommand.L)) {
                this.f59532a.M6(i10, MediaParcelUtils.c(mediaMetadata));
            }
        }

        @Override // androidx.media2.session.MediaSession.c
        void n(int i10, MediaMetadata mediaMetadata) throws RemoteException {
            if (z.this.f59463u3.f(z.this.f59463u3.c(A()), SessionCommand.L)) {
                this.f59532a.M6(i10, MediaParcelUtils.c(mediaMetadata));
            }
        }

        @Override // androidx.media2.session.MediaSession.c
        void o(int i10, int i11, int i12, int i13, int i14) throws RemoteException {
            this.f59532a.Mb(i10, i11, i12, i13, i14);
        }

        @Override // androidx.media2.session.MediaSession.c
        void p(int i10, @NonNull String str, int i11, MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
            this.f59532a.s4(i10, str, i11, MediaParcelUtils.c(libraryParams));
        }

        @Override // androidx.media2.session.MediaSession.c
        void q(int i10, long j10, long j11, long j12) throws RemoteException {
            this.f59532a.t4(i10, j10, j11, j12);
        }

        @Override // androidx.media2.session.MediaSession.c
        void r(int i10, @androidx.annotation.p0 SessionResult sessionResult) throws RemoteException {
            if (sessionResult == null) {
                int i11 = 5 >> 0;
                sessionResult = new SessionResult(-1, null);
            }
            this.f59532a.Cd(i10, MediaParcelUtils.c(sessionResult));
        }

        @Override // androidx.media2.session.MediaSession.c
        void s(int i10, int i11, int i12, int i13, int i14) throws RemoteException {
            this.f59532a.jf(i10, i11, i12, i13, i14);
        }

        @Override // androidx.media2.session.MediaSession.c
        void t(int i10, @NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) throws RemoteException {
            this.f59532a.u2(i10, MediaParcelUtils.c(mediaItem), MediaParcelUtils.c(trackInfo), MediaParcelUtils.c(subtitleData));
        }

        @Override // androidx.media2.session.MediaSession.c
        void u(int i10, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
            this.f59532a.l3(i10, MediaParcelUtils.c(trackInfo));
        }

        @Override // androidx.media2.session.MediaSession.c
        void v(int i10, SessionPlayer.TrackInfo trackInfo) throws RemoteException {
            this.f59532a.Ja(i10, MediaParcelUtils.c(trackInfo));
        }

        @Override // androidx.media2.session.MediaSession.c
        void w(int i10, List<SessionPlayer.TrackInfo> list, SessionPlayer.TrackInfo trackInfo, SessionPlayer.TrackInfo trackInfo2, SessionPlayer.TrackInfo trackInfo3, SessionPlayer.TrackInfo trackInfo4) throws RemoteException {
            this.f59532a.Q2(i10, MediaParcelUtils.d(list), MediaParcelUtils.c(trackInfo), MediaParcelUtils.c(trackInfo2), MediaParcelUtils.c(trackInfo3), MediaParcelUtils.c(trackInfo4));
        }

        @Override // androidx.media2.session.MediaSession.c
        void x(int i10, @NonNull VideoSize videoSize) throws RemoteException {
            this.f59532a.w4(i10, MediaParcelUtils.c(new MediaItem.b().a()), MediaParcelUtils.c(videoSize));
        }

        @Override // androidx.media2.session.MediaSession.c
        void y(int i10, @NonNull SessionCommand sessionCommand, Bundle bundle) throws RemoteException {
            this.f59532a.o9(i10, MediaParcelUtils.c(sessionCommand), bundle);
        }

        @Override // androidx.media2.session.MediaSession.c
        void z(int i10, @NonNull List<MediaSession.CommandButton> list) throws RemoteException {
            this.f59532a.L8(i10, androidx.media2.session.a0.a(list));
        }
    }

    class n implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59535b;

        n(String str, int i10) {
            this.f59534a = str;
            this.f59535b = i10;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            if (TextUtils.isEmpty(this.f59534a)) {
                Objects.toString(dVar);
                return SessionPlayer.c.a(-3);
            }
            MediaItem mediaItemS = z.this.s(eVar, dVar, this.f59534a);
            return mediaItemS == null ? SessionPlayer.c.a(-3) : eVar.b(this.f59535b, mediaItemS);
        }
    }

    private interface n0<T> extends q0 {
        T b(MediaLibraryService.a.c cVar, MediaSession.d dVar) throws RemoteException;
    }

    class o implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59538b;

        o(int i10, int i11) {
            this.f59537a = i10;
            this.f59538b = i11;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            return eVar.Z0(this.f59537a, this.f59538b);
        }
    }

    private interface o0<T> extends q0 {
        T a(MediaSession.e eVar, MediaSession.d dVar) throws RemoteException;
    }

    class p implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59540a;

        p(int i10) {
            this.f59540a = i10;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            int i10 = this.f59540a;
            if (i10 >= 0) {
                return eVar.H1(i10);
            }
            Objects.toString(dVar);
            return SessionPlayer.c.a(-3);
        }
    }

    private interface p0 extends q0 {
        t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) throws RemoteException;
    }

    class q implements p0 {
        q() {
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            return eVar.N0();
        }
    }

    private interface q0 {
    }

    class r implements p0 {
        r() {
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            return eVar.n0();
        }
    }

    class s implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59544a;

        s(int i10) {
            this.f59544a = i10;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            return eVar.D(this.f59544a);
        }
    }

    class t implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59546a;

        t(int i10) {
            this.f59546a = i10;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            return eVar.K(this.f59546a);
        }
    }

    class u implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Surface f59548a;

        u(Surface surface) {
            this.f59548a = surface;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            return eVar.z0(this.f59548a);
        }
    }

    class v implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaSession.e f59550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaSession.d f59551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.media2.session.b f59552c;

        v(MediaSession.e eVar, MediaSession.d dVar, androidx.media2.session.b bVar) {
            this.f59550a = eVar;
            this.f59551b = dVar;
            this.f59552c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.media2.session.e0 e0VarD;
            if (!this.f59550a.isClosed()) {
                IBinder iBinderA = ((m0) this.f59551b.c()).A();
                SessionCommandGroup sessionCommandGroupB = this.f59550a.u().b(this.f59550a.k(), this.f59551b);
                if (sessionCommandGroupB != null || this.f59551b.g()) {
                    if (z.A3) {
                        Objects.toString(this.f59551b);
                        Objects.toString(sessionCommandGroupB);
                    }
                    if (sessionCommandGroupB == null) {
                        sessionCommandGroupB = new SessionCommandGroup();
                    }
                    synchronized (z.this.f59464v3) {
                        try {
                            if (z.this.f59463u3.h(this.f59551b)) {
                                Objects.toString(this.f59551b);
                            }
                            z.this.f59463u3.a(iBinderA, this.f59551b, sessionCommandGroupB);
                            e0VarD = z.this.f59463u3.d(this.f59551b);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    ConnectionResult connectionResult = new ConnectionResult(z.this, this.f59550a, sessionCommandGroupB);
                    if (!this.f59550a.isClosed()) {
                        try {
                            this.f59552c.Ze(e0VarD.b(), MediaParcelUtils.c(connectionResult));
                        } catch (RemoteException unused) {
                        }
                        this.f59550a.u().i(this.f59550a.k(), this.f59551b);
                    }
                } else {
                    if (z.A3) {
                        Objects.toString(this.f59551b);
                    }
                    try {
                        this.f59552c.O8(0);
                    } catch (RemoteException unused2) {
                    }
                }
            }
        }
    }

    class w implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59554a;

        w(ParcelImpl parcelImpl) {
            this.f59554a = parcelImpl;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            SessionPlayer.TrackInfo trackInfo = (SessionPlayer.TrackInfo) MediaParcelUtils.a(this.f59554a);
            return trackInfo == null ? SessionPlayer.c.a(-3) : eVar.A0(trackInfo);
        }
    }

    class x implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59556a;

        x(ParcelImpl parcelImpl) {
            this.f59556a = parcelImpl;
        }

        @Override // androidx.media2.session.z.p0
        public t1<SessionPlayer.c> a(MediaSession.e eVar, MediaSession.d dVar) {
            SessionPlayer.TrackInfo trackInfo = (SessionPlayer.TrackInfo) MediaParcelUtils.a(this.f59556a);
            return trackInfo == null ? SessionPlayer.c.a(-3) : eVar.K0(trackInfo);
        }
    }

    class y implements n0<LibraryResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59558a;

        y(ParcelImpl parcelImpl) {
            this.f59558a = parcelImpl;
        }

        @Override // androidx.media2.session.z.n0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public LibraryResult b(MediaLibraryService.a.c cVar, MediaSession.d dVar) {
            return cVar.ff(dVar, (MediaLibraryService.LibraryParams) MediaParcelUtils.a(this.f59558a));
        }
    }

    /* JADX INFO: renamed from: androidx.media2.session.z$z, reason: collision with other inner class name */
    class C0557z implements n0<LibraryResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59560a;

        C0557z(String str) {
            this.f59560a = str;
        }

        @Override // androidx.media2.session.z.n0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public LibraryResult b(MediaLibraryService.a.c cVar, MediaSession.d dVar) {
            if (!TextUtils.isEmpty(this.f59560a)) {
                return cVar.m4(dVar, this.f59560a);
            }
            Objects.toString(dVar);
            return new LibraryResult(-3);
        }
    }

    static {
        for (SessionCommand sessionCommand : new SessionCommandGroup.a().c(2).g(2).j().d()) {
            B3.append(sessionCommand.d(), sessionCommand);
        }
    }

    z(MediaSession.e eVar) {
        this.f59465w3 = new WeakReference<>(eVar);
        this.f59466x3 = androidx.media.f.b(eVar.getContext());
        this.f59463u3 = new androidx.media2.session.a<>(eVar);
    }

    static void M(@NonNull MediaSession.d dVar, int i10, int i11) {
        O(dVar, i10, new LibraryResult(i11));
    }

    static void O(@NonNull MediaSession.d dVar, int i10, @NonNull LibraryResult libraryResult) {
        try {
            dVar.c().f(i10, libraryResult);
        } catch (RemoteException unused) {
            dVar.toString();
        }
    }

    static void Q(@NonNull MediaSession.d dVar, int i10, @NonNull SessionPlayer.c cVar) {
        try {
            dVar.c().k(i10, cVar);
        } catch (RemoteException unused) {
            dVar.toString();
        }
    }

    static void S(@NonNull MediaSession.d dVar, int i10, int i11) {
        U(dVar, i10, new SessionResult(i11));
    }

    static void U(@NonNull MediaSession.d dVar, int i10, @NonNull SessionResult sessionResult) {
        try {
            dVar.c().r(i10, sessionResult);
        } catch (RemoteException unused) {
            dVar.toString();
        }
    }

    private void u(@NonNull androidx.media2.session.b bVar, int i10, int i11, @NonNull q0 q0Var) {
        w(bVar, i10, null, i11, q0Var);
    }

    private void v(@NonNull androidx.media2.session.b bVar, int i10, @NonNull SessionCommand sessionCommand, @NonNull q0 q0Var) {
        w(bVar, i10, sessionCommand, 0, q0Var);
    }

    private void w(@NonNull androidx.media2.session.b bVar, int i10, @androidx.annotation.p0 SessionCommand sessionCommand, int i11, @NonNull q0 q0Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            MediaSession.e eVar = this.f59465w3.get();
            if (eVar != null && !eVar.isClosed()) {
                MediaSession.d dVarC = this.f59463u3.c(bVar.asBinder());
                if (dVarC == null) {
                    return;
                }
                eVar.r2().execute(new a(dVarC, sessionCommand, i10, i11, eVar, q0Var));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media2.session.c
    public void A5(androidx.media2.session.b bVar, int i10, int i11, int i12) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.S, new o(i11, i12));
    }

    @Override // androidx.media2.session.c
    public void Bc(androidx.media2.session.b bVar, int i10, String str, ParcelImpl parcelImpl) {
        if (bVar == null || parcelImpl == null) {
            return;
        }
        u(bVar, i10, SessionCommand.f58656e0, new f(str, (Rating) MediaParcelUtils.a(parcelImpl)));
    }

    @Override // androidx.media2.session.c
    public void Bd(androidx.media2.session.b bVar, int i10) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.f58653b0, new l0());
    }

    @Override // androidx.media2.session.c
    public void Ca(androidx.media2.session.b bVar, int i10, ParcelImpl parcelImpl) throws RuntimeException {
        if (bVar == null || parcelImpl == null) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        int callingPid = Binder.getCallingPid();
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        ConnectionRequest connectionRequest = (ConnectionRequest) MediaParcelUtils.a(parcelImpl);
        if (callingPid == 0) {
            callingPid = connectionRequest.f();
        }
        try {
            p(bVar, connectionRequest.g(), connectionRequest.getPackageName(), callingPid, callingUid, connectionRequest.d());
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        } catch (Throwable th2) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th2;
        }
    }

    @Override // androidx.media2.session.c
    public void D4(androidx.media2.session.b bVar, int i10, String str) throws RuntimeException {
        u(bVar, i10, SessionCommand.f58663l0, new C0557z(str));
    }

    @Override // androidx.media2.session.c
    public void Dc(androidx.media2.session.b bVar, int i10, String str) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.R, new i(str));
    }

    @Override // androidx.media2.session.c
    public void Fb(androidx.media2.session.b bVar, int i10, ParcelImpl parcelImpl, Bundle bundle) {
        if (bVar != null && parcelImpl != null) {
            SessionCommand sessionCommand = (SessionCommand) MediaParcelUtils.a(parcelImpl);
            v(bVar, i10, sessionCommand, new e(sessionCommand, bundle));
        }
    }

    @Override // androidx.media2.session.c
    public void I3(androidx.media2.session.b bVar, int i10, int i11, String str) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.M, new l(str, i11));
    }

    @Override // androidx.media2.session.c
    public void K9(androidx.media2.session.b bVar, int i10, String str, ParcelImpl parcelImpl) {
        if (bVar == null || parcelImpl == null) {
            return;
        }
        u(bVar, i10, SessionCommand.f58664m0, new b0(str, parcelImpl));
    }

    @Override // androidx.media2.session.c
    public void Kd(androidx.media2.session.b bVar, int i10) throws RuntimeException {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.B, new j0());
    }

    androidx.media2.session.a<IBinder> L() {
        return this.f59463u3;
    }

    @Override // androidx.media2.session.c
    public void Na(androidx.media2.session.b bVar, int i10) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.H, new q());
    }

    @Override // androidx.media2.session.c
    public void Oc(androidx.media2.session.b bVar, int i10, ParcelImpl parcelImpl) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.Q, new k(parcelImpl));
    }

    @Override // androidx.media2.session.c
    public void T6(androidx.media2.session.b bVar, int i10) throws RuntimeException {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, 10000, new h0());
    }

    @Override // androidx.media2.session.c
    public void T9(androidx.media2.session.b bVar, int i10) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.I, new r());
    }

    @Override // androidx.media2.session.c
    public void Ta(androidx.media2.session.b bVar, int i10, int i11) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.J, new t(i11));
    }

    @Override // androidx.media2.session.c
    public void U9(androidx.media2.session.b bVar, int i10, int i11, String str) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.O, new n(str, i11));
    }

    @Override // androidx.media2.session.c
    public void Va(androidx.media2.session.b bVar, int i10, Uri uri, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.f58657f0, new j(uri, bundle));
    }

    @Override // androidx.media2.session.c
    public void Vd(androidx.media2.session.b bVar, int i10, int i11, int i12) throws RuntimeException {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.Y, new g0(i11, i12));
    }

    @Override // androidx.media2.session.c
    public void X2(androidx.media2.session.b bVar, int i10, Surface surface) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.T, new u(surface));
    }

    @Override // androidx.media2.session.c
    public void X6(androidx.media2.session.b bVar, int i10, ParcelImpl parcelImpl) throws RuntimeException {
        if (bVar == null || parcelImpl == null) {
            return;
        }
        u(bVar, i10, 50000, new y(parcelImpl));
    }

    @Override // androidx.media2.session.c
    public void Y4(androidx.media2.session.b bVar, int i10, int i11) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.N, new m(i11));
    }

    @Override // androidx.media2.session.c
    public void Yc(androidx.media2.session.b bVar, int i10, String str, ParcelImpl parcelImpl) {
        if (bVar == null || parcelImpl == null) {
            return;
        }
        u(bVar, i10, SessionCommand.f58660i0, new d0(str, parcelImpl));
    }

    @Override // androidx.media2.session.c
    public void Z8(androidx.media2.session.b bVar, int i10) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.f58655d0, new c());
    }

    @Override // androidx.media2.session.c
    public void d7(androidx.media2.session.b bVar, int i10, int i11, int i12) throws RuntimeException {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.X, new f0(i11, i12));
    }

    @Override // androidx.media2.session.c
    public void i5(androidx.media2.session.b bVar, int i10) throws RemoteException {
        if (bVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.f59463u3.j(bVar.asBinder());
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media2.session.c
    public void kd(androidx.media2.session.b bVar, int i10, float f10) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.D, new g(f10));
    }

    @Override // androidx.media2.session.c
    public void md(androidx.media2.session.b bVar, int i10, int i11) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.G, new p(i11));
    }

    @Override // androidx.media2.session.c
    public void mf(androidx.media2.session.b bVar, int i10, int i11) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.K, new s(i11));
    }

    @Override // androidx.media2.session.c
    public void n5(androidx.media2.session.b bVar, int i10, String str) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.f58661j0, new e0(str));
    }

    @Override // androidx.media2.session.c
    public void n9(androidx.media2.session.b bVar, int i10) throws RuntimeException {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.A, new i0());
    }

    @Override // androidx.media2.session.c
    public void ne(androidx.media2.session.b bVar, int i10, long j10) throws RuntimeException {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.C, new d(j10));
    }

    @Override // androidx.media2.session.c
    public void o2(androidx.media2.session.b bVar, int i10, ParcelImpl parcelImpl) {
        if (bVar == null || parcelImpl == null) {
            return;
        }
        u(bVar, i10, SessionCommand.U, new w(parcelImpl));
    }

    void p(androidx.media2.session.b bVar, int i10, String str, int i11, int i12, @androidx.annotation.p0 Bundle bundle) {
        androidx.media.f.b bVar2 = new androidx.media.f.b(str, i11, i12);
        MediaSession.d dVar = new MediaSession.d(bVar2, i10, this.f59466x3.c(bVar2), new m0(bVar), bundle);
        MediaSession.e eVar = this.f59465w3.get();
        if (eVar != null && !eVar.isClosed()) {
            eVar.r2().execute(new v(eVar, dVar, bVar));
        }
    }

    @Override // androidx.media2.session.c
    public void r6(androidx.media2.session.b bVar, int i10, String str, int i11, int i12, ParcelImpl parcelImpl) {
        if (bVar == null || parcelImpl == null) {
            return;
        }
        u(bVar, i10, SessionCommand.f58665n0, new c0(str, i11, i12, parcelImpl));
    }

    @androidx.annotation.p0
    MediaItem s(MediaSession.e eVar, MediaSession.d dVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        MediaItem mediaItemC = eVar.u().c(eVar.k(), dVar, str);
        if (mediaItemC == null) {
            return mediaItemC;
        }
        if (mediaItemC.m() != null && TextUtils.equals(str, mediaItemC.m().q("android.media.metadata.MEDIA_ID"))) {
            return mediaItemC;
        }
        throw new RuntimeException("onCreateMediaItem(mediaId=" + str + "): media ID in the returned media item should match");
    }

    @Override // androidx.media2.session.c
    public void se(androidx.media2.session.b bVar, int i10, ParcelImpl parcelImpl) {
        if (bVar == null || parcelImpl == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            androidx.media2.session.e0 e0VarE = this.f59463u3.e(bVar.asBinder());
            if (e0VarE == null) {
                return;
            }
            e0VarE.c(i10, (SessionResult) MediaParcelUtils.a(parcelImpl));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media2.session.c
    public void ue(androidx.media2.session.b bVar, int i10, String str, int i11, int i12, ParcelImpl parcelImpl) throws RuntimeException {
        if (bVar == null || parcelImpl == null) {
            return;
        }
        u(bVar, i10, SessionCommand.f58662k0, new a0(str, i11, i12, parcelImpl));
    }

    @Override // androidx.media2.session.c
    public void w7(androidx.media2.session.b bVar, int i10, ParcelImpl parcelImpl) {
        if (bVar != null && parcelImpl != null) {
            u(bVar, i10, SessionCommand.V, new x(parcelImpl));
        }
    }

    @Override // androidx.media2.session.c
    public void wf(androidx.media2.session.b bVar, int i10) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, 40000, new k0());
    }

    @Override // androidx.media2.session.c
    public void x6(androidx.media2.session.b bVar, int i10) {
        if (bVar == null) {
            return;
        }
        u(bVar, i10, SessionCommand.f58654c0, new b());
    }

    @Override // androidx.media2.session.c
    public void z9(androidx.media2.session.b bVar, int i10, List<String> list, ParcelImpl parcelImpl) {
        if (bVar != null && parcelImpl != null) {
            u(bVar, i10, SessionCommand.F, new h(list, parcelImpl));
        }
    }
}
