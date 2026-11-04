package androidx.media2.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
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
import com.google.common.util.concurrent.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class k implements MediaController.g {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final boolean f58924l3 = true;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final SessionResult f58925m3 = new SessionResult(1);

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    static final String f58926n3 = "MC2ImplBase";

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    static final boolean f58927o3 = Log.isLoggable(f58926n3, 3);

    @androidx.annotation.b0("mLock")
    private MediaController.PlaybackInfo H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final MediaController f58928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f58929b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final SessionToken f58931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IBinder.DeathRecipient f58932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.media2.session.e0 f58933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final androidx.media2.session.n f58934g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private SessionCommandGroup f58935g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private SessionToken f58936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private a1 f58938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private boolean f58940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private List<MediaItem> f58942k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private volatile androidx.media2.session.c f58943k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private MediaMetadata f58944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private int f58945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private int f58946n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private int f58947o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private int f58948p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private long f58949p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private PendingIntent f58950p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private long f58951s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private long f58952t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private float f58953v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private MediaItem f58954w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f58930c = new Object();

    @androidx.annotation.b0("mLock")
    private int X = -1;

    @androidx.annotation.b0("mLock")
    private int Y = -1;

    @androidx.annotation.b0("mLock")
    private int Z = -1;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private VideoSize f58937h3 = new VideoSize(0, 0);

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private List<SessionPlayer.TrackInfo> f58939i3 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private SparseArray<SessionPlayer.TrackInfo> f58941j3 = new SparseArray<>();

    class a implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f58955a;

        a(long j10) {
            this.f58955a = j10;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.ne(k.this.f58934g, i10, this.f58955a);
        }
    }

    class a0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f58957a;

        a0(float f10) {
            this.f58957a = f10;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.i(k.this.f58928a, this.f58957a);
            }
        }
    }

    private class a1 implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f58959a;

        a1(Bundle bundle) {
            this.f58959a = bundle;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            k.this.f58928a.close();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                try {
                    if (k.f58927o3) {
                        Objects.toString(componentName);
                        toString();
                    }
                    if (k.this.f58931d.getPackageName().equals(componentName.getPackageName())) {
                        androidx.media2.session.d dVarYf = androidx.media2.session.d.b.yf(iBinder);
                        if (dVarYf != null) {
                            dVarYf.D3(k.this.f58934g, MediaParcelUtils.c(new ConnectionRequest(k.this.getContext().getPackageName(), Process.myPid(), this.f58959a)));
                            return;
                        }
                        Log.wtf(k.f58926n3, "Service interface is missing.");
                    } else {
                        Log.wtf(k.f58926n3, "Expected connection to " + k.this.f58931d.getPackageName() + " but is connected to " + componentName);
                    }
                } catch (RemoteException unused) {
                    Objects.toString(componentName);
                }
                k.this.f58928a.close();
            } catch (Throwable th2) {
                k.this.f58928a.close();
                throw th2;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (k.f58927o3) {
                Objects.toString(componentName);
            }
            k.this.f58928a.close();
        }
    }

    class b implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f58961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58962b;

        b(int i10, int i11) {
            this.f58961a = i10;
            this.f58962b = i11;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.d7(k.this.f58934g, i10, this.f58961a, this.f58962b);
        }
    }

    class b0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaItem f58964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58965b;

        b0(MediaItem mediaItem, int i10) {
            this.f58964a = mediaItem;
            this.f58965b = i10;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.b(k.this.f58928a, this.f58964a, this.f58965b);
            }
        }
    }

    class c implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f58967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58968b;

        c(int i10, int i11) {
            this.f58967a = i10;
            this.f58968b = i11;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.Vd(k.this.f58934g, i10, this.f58967a, this.f58968b);
        }
    }

    class c0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f58970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaMetadata f58971b;

        c0(List list, MediaMetadata mediaMetadata) {
            this.f58970a = list;
            this.f58971b = mediaMetadata;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.k(k.this.f58928a, this.f58970a, this.f58971b);
            }
        }
    }

    class d implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f58973a;

        d(float f10) {
            this.f58973a = f10;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.kd(k.this.f58934g, i10, this.f58973a);
        }
    }

    class d0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaMetadata f58975a;

        d0(MediaMetadata mediaMetadata) {
            this.f58975a = mediaMetadata;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.l(k.this.f58928a, this.f58975a);
            }
        }
    }

    class e implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Rating f58978b;

        e(String str, Rating rating) {
            this.f58977a = str;
            this.f58978b = rating;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.Bc(k.this.f58934g, i10, this.f58977a, MediaParcelUtils.c(this.f58978b));
        }
    }

    class e0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaController.PlaybackInfo f58980a;

        e0(MediaController.PlaybackInfo playbackInfo) {
            this.f58980a = playbackInfo;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.h(k.this.f58928a, this.f58980a);
            }
        }
    }

    class f implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionCommand f58982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f58983b;

        f(SessionCommand sessionCommand, Bundle bundle) {
            this.f58982a = sessionCommand;
            this.f58983b = bundle;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.Fb(k.this.f58934g, i10, MediaParcelUtils.c(this.f58982a), this.f58983b);
        }
    }

    class f0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f58985a;

        f0(int i10) {
            this.f58985a = i10;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.m(k.this.f58928a, this.f58985a);
            }
        }
    }

    class g implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f58987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaMetadata f58988b;

        g(List list, MediaMetadata mediaMetadata) {
            this.f58987a = list;
            this.f58988b = mediaMetadata;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.z9(k.this.f58934g, i10, this.f58987a, MediaParcelUtils.c(this.f58988b));
        }
    }

    class g0 implements z0 {
        g0() {
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.T6(k.this.f58934g, i10);
        }
    }

    class h implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58991a;

        h(String str) {
            this.f58991a = str;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.Dc(k.this.f58934g, i10, this.f58991a);
        }
    }

    class h0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f58993a;

        h0(int i10) {
            this.f58993a = i10;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.p(k.this.f58928a, this.f58993a);
            }
        }
    }

    class i implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f58995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f58996b;

        i(Uri uri, Bundle bundle) {
            this.f58995a = uri;
            this.f58996b = bundle;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.Va(k.this.f58934g, i10, this.f58995a, this.f58996b);
        }
    }

    class i0 implements MediaController.f {
        i0() {
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.g(k.this.f58928a);
            }
        }
    }

    class j implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaMetadata f58999a;

        j(MediaMetadata mediaMetadata) {
            this.f58999a = mediaMetadata;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.Oc(k.this.f58934g, i10, MediaParcelUtils.c(this.f58999a));
        }
    }

    class j0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f59001a;

        j0(long j10) {
            this.f59001a = j10;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.n(k.this.f58928a, this.f59001a);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media2.session.k$k, reason: collision with other inner class name */
    class C0551k implements IBinder.DeathRecipient {
        C0551k() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            k.this.f58928a.close();
        }
    }

    class k0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaItem f59004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoSize f59005b;

        k0(MediaItem mediaItem, VideoSize videoSize) {
            this.f59004a = mediaItem;
            this.f59005b = videoSize;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                MediaItem mediaItem = this.f59004a;
                if (mediaItem != null) {
                    eVar.u(k.this.f58928a, mediaItem, this.f59005b);
                }
                eVar.v(k.this.f58928a, this.f59005b);
            }
        }
    }

    class l implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f59008b;

        l(int i10, String str) {
            this.f59007a = i10;
            this.f59008b = str;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.I3(k.this.f58934g, i10, this.f59007a, this.f59008b);
        }
    }

    class l0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f59010a;

        l0(List list) {
            this.f59010a = list;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.t(k.this.f58928a, this.f59010a);
            }
        }
    }

    class m implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59012a;

        m(int i10) {
            this.f59012a = i10;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.Y4(k.this.f58934g, i10, this.f59012a);
        }
    }

    class m0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionPlayer.TrackInfo f59014a;

        m0(SessionPlayer.TrackInfo trackInfo) {
            this.f59014a = trackInfo;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.s(k.this.f58928a, this.f59014a);
            }
        }
    }

    class n implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f59017b;

        n(int i10, String str) {
            this.f59016a = i10;
            this.f59017b = str;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.U9(k.this.f58934g, i10, this.f59016a, this.f59017b);
        }
    }

    class n0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionPlayer.TrackInfo f59019a;

        n0(SessionPlayer.TrackInfo trackInfo) {
            this.f59019a = trackInfo;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.r(k.this.f58928a, this.f59019a);
            }
        }
    }

    class o implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59022b;

        o(int i10, int i11) {
            this.f59021a = i10;
            this.f59022b = i11;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.A5(k.this.f58934g, i10, this.f59021a, this.f59022b);
        }
    }

    class o0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaItem f59024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SessionPlayer.TrackInfo f59025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SubtitleData f59026c;

        o0(MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
            this.f59024a = mediaItem;
            this.f59025b = trackInfo;
            this.f59026c = subtitleData;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.q(k.this.f58928a, this.f59024a, this.f59025b, this.f59026c);
            }
        }
    }

    class p implements z0 {
        p() {
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.Na(k.this.f58934g, i10);
        }
    }

    class p0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionCommandGroup f59029a;

        p0(SessionCommandGroup sessionCommandGroup) {
            this.f59029a = sessionCommandGroup;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            eVar.c(k.this.f58928a, this.f59029a);
        }
    }

    class q implements z0 {
        q() {
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.T9(k.this.f58934g, i10);
        }
    }

    class q0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionCommand f59032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f59033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59034c;

        q0(SessionCommand sessionCommand, Bundle bundle, int i10) {
            this.f59032a = sessionCommand;
            this.f59033b = bundle;
            this.f59034c = i10;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            SessionResult sessionResultE = eVar.e(k.this.f58928a, this.f59032a, this.f59033b);
            if (sessionResultE != null) {
                k.this.g0(this.f59034c, sessionResultE);
                return;
            }
            throw new RuntimeException("ControllerCallback#onCustomCommand() has returned null, command=" + this.f59032a.f());
        }
    }

    class r implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59036a;

        r(int i10) {
            this.f59036a = i10;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.md(k.this.f58934g, i10, this.f59036a);
        }
    }

    class r0 implements z0 {
        r0() {
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.n9(k.this.f58934g, i10);
        }
    }

    class s implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59039a;

        s(int i10) {
            this.f59039a = i10;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.mf(k.this.f58934g, i10, this.f59039a);
        }
    }

    class s0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionCommandGroup f59041a;

        s0(SessionCommandGroup sessionCommandGroup) {
            this.f59041a = sessionCommandGroup;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            eVar.a(k.this.f58928a, this.f59041a);
        }
    }

    class t implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59043a;

        t(int i10) {
            this.f59043a = i10;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.Ta(k.this.f58934g, i10, this.f59043a);
        }
    }

    class t0 implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f59045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59046b;

        t0(List list, int i10) {
            this.f59045a = list;
            this.f59046b = i10;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            k.this.g0(this.f59046b, new SessionResult(eVar.o(k.this.f58928a, this.f59045a)));
        }
    }

    class u implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionPlayer.TrackInfo f59048a;

        u(SessionPlayer.TrackInfo trackInfo) {
            this.f59048a = trackInfo;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.o2(k.this.f58934g, i10, MediaParcelUtils.c(this.f59048a));
        }
    }

    class u0 implements z0 {
        u0() {
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.Kd(k.this.f58934g, i10);
        }
    }

    class v implements MediaController.f {
        v() {
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            eVar.f(k.this.f58928a);
        }
    }

    class v0 implements z0 {
        v0() {
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.wf(k.this.f58934g, i10);
        }
    }

    class w implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionPlayer.TrackInfo f59053a;

        w(SessionPlayer.TrackInfo trackInfo) {
            this.f59053a = trackInfo;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.w7(k.this.f58934g, i10, MediaParcelUtils.c(this.f59053a));
        }
    }

    class w0 implements z0 {
        w0() {
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.Bd(k.this.f58934g, i10);
        }
    }

    class x implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Surface f59056a;

        x(Surface surface) {
            this.f59056a = surface;
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.X2(k.this.f58934g, i10, this.f59056a);
        }
    }

    class x0 implements z0 {
        x0() {
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.x6(k.this.f58934g, i10);
        }
    }

    class y implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaItem f59059a;

        y(MediaItem mediaItem) {
            this.f59059a = mediaItem;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.d(k.this.f58928a, this.f59059a);
            }
        }
    }

    class y0 implements z0 {
        y0() {
        }

        @Override // androidx.media2.session.k.z0
        public void a(androidx.media2.session.c cVar, int i10) throws RemoteException {
            cVar.Z8(k.this.f58934g, i10);
        }
    }

    class z implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59062a;

        z(int i10) {
            this.f59062a = i10;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            if (k.this.f58928a.isConnected()) {
                eVar.j(k.this.f58928a, this.f59062a);
            }
        }
    }

    @FunctionalInterface
    private interface z0 {
        void a(androidx.media2.session.c cVar, int i10) throws RemoteException;
    }

    k(Context context, MediaController mediaController, SessionToken sessionToken, @androidx.annotation.p0 Bundle bundle) {
        boolean zD0;
        this.f58928a = mediaController;
        if (context == null) {
            throw new NullPointerException("context shouldn't be null");
        }
        if (sessionToken == null) {
            throw new NullPointerException("token shouldn't be null");
        }
        this.f58929b = context;
        this.f58933f = new androidx.media2.session.e0();
        this.f58934g = new androidx.media2.session.n(this);
        this.f58931d = sessionToken;
        this.f58932e = new C0551k();
        if (sessionToken.c() == 0) {
            int i10 = 5 | 0;
            this.f58938i = null;
            zD0 = f0(bundle);
        } else {
            this.f58938i = new a1(bundle);
            zD0 = d0();
        }
        if (zD0) {
            return;
        }
        mediaController.close();
    }

    private t1<SessionResult> a(int i10, z0 z0Var) {
        return c(i10, null, z0Var);
    }

    private t1<SessionResult> b(SessionCommand sessionCommand, z0 z0Var) {
        return c(0, sessionCommand, z0Var);
    }

    private t1<SessionResult> c(int i10, SessionCommand sessionCommand, z0 z0Var) {
        androidx.media2.session.c cVarE = sessionCommand != null ? e(sessionCommand) : d(i10);
        if (cVarE == null) {
            return SessionResult.j(-4);
        }
        androidx.media2.session.e0.a aVarA = this.f58933f.a(f58925m3);
        try {
            z0Var.a(cVarE, aVarA.R());
            return aVarA;
        } catch (RemoteException unused) {
            aVarA.E(new SessionResult(-100));
            return aVarA;
        }
    }

    private boolean d0() {
        Intent intent = new Intent(androidx.media2.session.w.f59438b);
        intent.setClassName(this.f58931d.getPackageName(), this.f58931d.d5());
        synchronized (this.f58930c) {
            try {
                if (!this.f58929b.bindService(intent, this.f58938i, androidx.fragment.app.t0.I)) {
                    Objects.toString(this.f58931d);
                    return false;
                }
                if (f58927o3) {
                    Objects.toString(this.f58931d);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean f0(@androidx.annotation.p0 Bundle bundle) {
        try {
            androidx.media2.session.c.b.i((IBinder) this.f58931d.e5()).Ca(this.f58934g, this.f58933f.b(), MediaParcelUtils.c(new ConnectionRequest(this.f58929b.getPackageName(), Process.myPid(), bundle)));
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> A() {
        return a(SessionCommand.B, new u0());
    }

    @Override // androidx.media2.session.MediaController.g
    @NonNull
    public t1<SessionResult> A0(@NonNull SessionPlayer.TrackInfo trackInfo) {
        return a(SessionCommand.U, new u(trackInfo));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> A1(int i10, int i11) {
        return a(SessionCommand.Y, new c(i10, i11));
    }

    @Override // androidx.media2.session.MediaController.g
    public SessionToken A3() {
        SessionToken sessionToken;
        synchronized (this.f58930c) {
            try {
                sessionToken = isConnected() ? this.f58936h : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sessionToken;
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> B() {
        return a(10000, new g0());
    }

    @Override // androidx.media2.session.MediaController.g
    public int C() {
        int i10;
        synchronized (this.f58930c) {
            try {
                i10 = this.f58945m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> D(int i10) {
        return a(SessionCommand.K, new s(i10));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> D1() {
        return a(40000, new v0());
    }

    void E(int i10, SessionPlayer.TrackInfo trackInfo) {
        synchronized (this.f58930c) {
            try {
                this.f58941j3.remove(trackInfo.m());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f58928a.g(new n0(trackInfo));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> F(long j10) {
        if (j10 >= 0) {
            return a(SessionCommand.C, new a(j10));
        }
        throw new IllegalArgumentException("position shouldn't be negative");
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> G(float f10) {
        return a(SessionCommand.D, new d(f10));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> G0(int i10) {
        return a(SessionCommand.N, new m(i10));
    }

    @Override // androidx.media2.session.MediaController.g
    @NonNull
    public List<SessionPlayer.TrackInfo> G1() {
        List<SessionPlayer.TrackInfo> list;
        synchronized (this.f58930c) {
            try {
                list = this.f58939i3;
            } finally {
            }
        }
        return list;
    }

    void H(int i10, SessionPlayer.TrackInfo trackInfo) {
        synchronized (this.f58930c) {
            this.f58941j3.put(trackInfo.m(), trackInfo);
        }
        this.f58928a.g(new m0(trackInfo));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> H1(int i10) {
        return a(SessionCommand.G, new r(i10));
    }

    void I(int i10, List<SessionPlayer.TrackInfo> list, SessionPlayer.TrackInfo trackInfo, SessionPlayer.TrackInfo trackInfo2, SessionPlayer.TrackInfo trackInfo3, SessionPlayer.TrackInfo trackInfo4) {
        synchronized (this.f58930c) {
            try {
                this.f58939i3 = list;
                this.f58941j3.put(1, trackInfo);
                this.f58941j3.put(2, trackInfo2);
                this.f58941j3.put(4, trackInfo3);
                this.f58941j3.put(5, trackInfo4);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f58928a.g(new l0(list));
    }

    @Override // androidx.media2.session.MediaController.g
    @androidx.annotation.p0
    public SessionPlayer.TrackInfo I1(int i10) {
        SessionPlayer.TrackInfo trackInfo;
        synchronized (this.f58930c) {
            try {
                trackInfo = this.f58941j3.get(i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return trackInfo;
    }

    @Override // androidx.media2.session.MediaController.g
    public int J() {
        int i10;
        synchronized (this.f58930c) {
            i10 = this.f58946n;
        }
        return i10;
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> K(int i10) {
        return a(SessionCommand.J, new t(i10));
    }

    @Override // androidx.media2.session.MediaController.g
    @NonNull
    public t1<SessionResult> K0(@NonNull SessionPlayer.TrackInfo trackInfo) {
        return a(SessionCommand.V, new w(trackInfo));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> K6(int i10, @NonNull String str) {
        return a(SessionCommand.O, new n(i10, str));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> Kc() {
        return a(SessionCommand.f58654c0, new x0());
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> L0(int i10, int i11) {
        return a(SessionCommand.X, new b(i10, i11));
    }

    @Override // androidx.media2.session.MediaController.g
    public PendingIntent M() {
        PendingIntent pendingIntent;
        synchronized (this.f58930c) {
            pendingIntent = this.f58950p2;
        }
        return pendingIntent;
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> M8(@NonNull SessionCommand sessionCommand, @androidx.annotation.p0 Bundle bundle) {
        return b(sessionCommand, new f(sessionCommand, bundle));
    }

    void N(VideoSize videoSize) {
        MediaItem mediaItem;
        synchronized (this.f58930c) {
            try {
                this.f58937h3 = videoSize;
                mediaItem = this.f58954w;
            } finally {
            }
        }
        this.f58928a.g(new k0(mediaItem, videoSize));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> N0() {
        return a(SessionCommand.H, new p());
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> P() {
        return a(SessionCommand.f58653b0, new w0());
    }

    void R(SessionCommandGroup sessionCommandGroup) {
        synchronized (this.f58930c) {
            try {
                this.f58935g3 = sessionCommandGroup;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f58928a.g(new s0(sessionCommandGroup));
    }

    void T(int i10, androidx.media2.session.c cVar, SessionCommandGroup sessionCommandGroup, int i11, MediaItem mediaItem, long j10, long j11, float f10, long j12, MediaController.PlaybackInfo playbackInfo, int i12, int i13, List<MediaItem> list, PendingIntent pendingIntent, int i14, int i15, int i16, Bundle bundle, VideoSize videoSize, List<SessionPlayer.TrackInfo> list2, SessionPlayer.TrackInfo trackInfo, SessionPlayer.TrackInfo trackInfo2, SessionPlayer.TrackInfo trackInfo3, SessionPlayer.TrackInfo trackInfo4, MediaMetadata mediaMetadata, int i17) {
        Throwable th2;
        if (f58927o3) {
            Objects.toString(cVar);
            Objects.toString(sessionCommandGroup);
        }
        if (cVar != null && sessionCommandGroup != null) {
            try {
                synchronized (this.f58930c) {
                    try {
                        if (this.f58940j) {
                            return;
                        }
                        try {
                            if (this.f58943k3 == null) {
                                this.f58935g3 = sessionCommandGroup;
                                this.f58947o = i11;
                                this.f58954w = mediaItem;
                                this.f58951s = j10;
                                this.f58952t = j11;
                                this.f58953v = f10;
                                this.f58949p1 = j12;
                                this.H1 = playbackInfo;
                                this.f58945m = i12;
                                this.f58946n = i13;
                                this.f58942k = list;
                                this.f58950p2 = pendingIntent;
                                this.f58943k3 = cVar;
                                this.X = i14;
                                this.Y = i15;
                                this.Z = i16;
                                this.f58937h3 = videoSize;
                                this.f58939i3 = list2;
                                this.f58941j3.put(1, trackInfo);
                                this.f58941j3.put(2, trackInfo2);
                                this.f58941j3.put(4, trackInfo3);
                                this.f58941j3.put(5, trackInfo4);
                                this.f58944l = mediaMetadata;
                                this.f58948p0 = i17;
                                try {
                                    this.f58943k3.asBinder().linkToDeath(this.f58932e, 0);
                                    this.f58936h = new SessionToken(new SessionTokenImplBase(this.f58931d.a(), 0, this.f58931d.getPackageName(), cVar, bundle));
                                    this.f58928a.g(new p0(sessionCommandGroup));
                                    return;
                                } catch (RemoteException unused) {
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
            } catch (Throwable th5) {
                if (0 == 0) {
                    throw th5;
                }
                this.f58928a.close();
                throw th5;
            }
        }
        this.f58928a.close();
    }

    @Override // androidx.media2.session.MediaController.g
    public MediaMetadata V() {
        MediaMetadata mediaMetadata;
        synchronized (this.f58930c) {
            try {
                mediaMetadata = this.f58944l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaMetadata;
    }

    @Override // androidx.media2.session.MediaController.g
    public List<MediaItem> V0() {
        ArrayList arrayList;
        synchronized (this.f58930c) {
            try {
                arrayList = this.f58942k == null ? null : new ArrayList(this.f58942k);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    void X(int i10, SessionCommand sessionCommand, Bundle bundle) {
        if (f58927o3) {
            sessionCommand.f();
        }
        this.f58928a.h(new q0(sessionCommand, bundle, i10));
    }

    void Y(int i10, List<MediaSession.CommandButton> list) {
        this.f58928a.h(new t0(list, i10));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> Y0(@NonNull List<String> list, @androidx.annotation.p0 MediaMetadata mediaMetadata) {
        return a(SessionCommand.F, new g(list, mediaMetadata));
    }

    @Override // androidx.media2.session.MediaController.g
    public MediaItem Z() {
        MediaItem mediaItem;
        synchronized (this.f58930c) {
            mediaItem = this.f58954w;
        }
        return mediaItem;
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> Z0(int i10, int i11) {
        return a(SessionCommand.S, new o(i10, i11));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> Zb(@NonNull String str) {
        return a(SessionCommand.R, new h(str));
    }

    @Override // androidx.media2.session.MediaController.g
    public int a0() {
        int i10;
        synchronized (this.f58930c) {
            i10 = this.Y;
        }
        return i10;
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> a1(@androidx.annotation.p0 MediaMetadata mediaMetadata) {
        return a(SessionCommand.Q, new j(mediaMetadata));
    }

    @Override // androidx.media2.session.MediaController.g
    public MediaController.PlaybackInfo b0() {
        MediaController.PlaybackInfo playbackInfo;
        synchronized (this.f58930c) {
            try {
                playbackInfo = this.H1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return playbackInfo;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f58927o3) {
            Objects.toString(this.f58931d);
        }
        synchronized (this.f58930c) {
            try {
                androidx.media2.session.c cVar = this.f58943k3;
                if (this.f58940j) {
                    return;
                }
                this.f58940j = true;
                a1 a1Var = this.f58938i;
                if (a1Var != null) {
                    this.f58929b.unbindService(a1Var);
                    this.f58938i = null;
                }
                this.f58943k3 = null;
                this.f58934g.u();
                if (cVar != null) {
                    int iB = this.f58933f.b();
                    try {
                        cVar.asBinder().unlinkToDeath(this.f58932e, 0);
                        cVar.i5(this.f58934g, iB);
                    } catch (RemoteException unused) {
                    }
                }
                this.f58933f.close();
                this.f58928a.g(new v());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    androidx.media2.session.c d(int i10) {
        synchronized (this.f58930c) {
            try {
                if (!this.f58935g3.f(i10)) {
                    return null;
                }
                return this.f58943k3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    androidx.media2.session.c e(SessionCommand sessionCommand) {
        synchronized (this.f58930c) {
            try {
                if (this.f58935g3.g(sessionCommand)) {
                    return this.f58943k3;
                }
                Objects.toString(sessionCommand);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public int e0() {
        int i10;
        synchronized (this.f58930c) {
            i10 = this.Z;
        }
        return i10;
    }

    void f(MediaItem mediaItem, int i10, long j10, long j11, long j12) {
        synchronized (this.f58930c) {
            try {
                this.f58948p0 = i10;
                this.f58949p1 = j10;
                this.f58951s = j11;
                this.f58952t = j12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f58928a.g(new b0(mediaItem, i10));
    }

    void g(MediaItem mediaItem, int i10, int i11, int i12) {
        synchronized (this.f58930c) {
            try {
                this.f58954w = mediaItem;
                this.X = i10;
                this.Y = i11;
                this.Z = i12;
                List<MediaItem> list = this.f58942k;
                if (list != null && i10 >= 0 && i10 < list.size()) {
                    this.f58942k.set(i10, mediaItem);
                }
                this.f58951s = SystemClock.elapsedRealtime();
                this.f58952t = 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f58928a.g(new y(mediaItem));
    }

    void g0(int i10, @NonNull SessionResult sessionResult) {
        androidx.media2.session.c cVar;
        synchronized (this.f58930c) {
            try {
                cVar = this.f58943k3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar == null) {
            return;
        }
        try {
            cVar.se(this.f58934g, i10, MediaParcelUtils.c(sessionResult));
        } catch (RemoteException unused) {
        }
    }

    @Override // androidx.media2.session.MediaController.g
    @NonNull
    public Context getContext() {
        return this.f58929b;
    }

    @Override // androidx.media2.session.MediaController.g
    public long getCurrentPosition() {
        synchronized (this.f58930c) {
            try {
                if (this.f58943k3 == null) {
                    new IllegalStateException();
                    return Long.MIN_VALUE;
                }
                if (this.f58947o != 2 || this.f58948p0 == 2) {
                    return this.f58952t;
                }
                Long l10 = this.f58928a.f58511g;
                return Math.max(0L, this.f58952t + ((long) (this.f58953v * (l10 != null ? l10.longValue() : SystemClock.elapsedRealtime() - this.f58951s))));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public long getDuration() {
        synchronized (this.f58930c) {
            try {
                MediaItem mediaItem = this.f58954w;
                MediaMetadata mediaMetadataM = mediaItem == null ? null : mediaItem.m();
                if (mediaMetadataM == null || !mediaMetadataM.j("android.media.metadata.DURATION")) {
                    return Long.MIN_VALUE;
                }
                return mediaMetadataM.m("android.media.metadata.DURATION");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void h() {
        this.f58928a.g(new i0());
    }

    @Override // androidx.media2.session.MediaController.g
    @NonNull
    public VideoSize h0() {
        VideoSize videoSize;
        synchronized (this.f58930c) {
            try {
                videoSize = this.f58937h3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return videoSize;
    }

    @Override // androidx.media2.session.MediaController.g
    public int i1() {
        synchronized (this.f58930c) {
            try {
                if (this.f58943k3 == null) {
                    new IllegalStateException();
                    return 0;
                }
                return this.f58948p0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public boolean isConnected() {
        boolean z10;
        synchronized (this.f58930c) {
            try {
                z10 = this.f58943k3 != null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    void j(MediaController.PlaybackInfo playbackInfo) {
        synchronized (this.f58930c) {
            try {
                this.H1 = playbackInfo;
            } finally {
            }
        }
        this.f58928a.g(new e0(playbackInfo));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void j0(int i10, T t10) {
        if (t10 == null) {
            return;
        }
        this.f58933f.c(i10, t10);
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> k9(int i10, @NonNull String str) {
        return a(SessionCommand.M, new l(i10, str));
    }

    void l(long j10, long j11, float f10) {
        synchronized (this.f58930c) {
            try {
                this.f58951s = j10;
                this.f58952t = j11;
                this.f58953v = f10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f58928a.g(new a0(f10));
    }

    @Override // androidx.media2.session.MediaController.g
    public int l0() {
        int i10;
        synchronized (this.f58930c) {
            i10 = this.X;
        }
        return i10;
    }

    void m(long j10, long j11, int i10) {
        synchronized (this.f58930c) {
            try {
                this.f58951s = j10;
                this.f58952t = j11;
                this.f58947o = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f58928a.g(new z(i10));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> m3() {
        return a(SessionCommand.f58655d0, new y0());
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> n0() {
        return a(SessionCommand.I, new q());
    }

    @Override // androidx.media2.session.MediaController.g
    @androidx.annotation.p0
    public MediaBrowserCompat nb() {
        return null;
    }

    void o(List<MediaItem> list, MediaMetadata mediaMetadata, int i10, int i11, int i12) {
        synchronized (this.f58930c) {
            try {
                this.f58942k = list;
                this.f58944l = mediaMetadata;
                this.X = i10;
                this.Y = i11;
                this.Z = i12;
                if (i10 >= 0 && list != null && i10 < list.size()) {
                    this.f58954w = list.get(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f58928a.g(new c0(list, mediaMetadata));
    }

    @Override // androidx.media2.session.MediaController.g
    public SessionCommandGroup p6() {
        synchronized (this.f58930c) {
            try {
                if (this.f58943k3 == null) {
                    new IllegalStateException();
                    return null;
                }
                return this.f58935g3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> pause() {
        return a(SessionCommand.A, new r0());
    }

    void q(MediaMetadata mediaMetadata) {
        synchronized (this.f58930c) {
            this.f58944l = mediaMetadata;
        }
        this.f58928a.g(new d0(mediaMetadata));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> q5(@NonNull Uri uri, @androidx.annotation.p0 Bundle bundle) {
        return a(SessionCommand.f58657f0, new i(uri, bundle));
    }

    void r(int i10, int i11, int i12, int i13) {
        synchronized (this.f58930c) {
            try {
                this.f58945m = i10;
                this.X = i11;
                this.Y = i12;
                this.Z = i13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f58928a.g(new f0(i10));
    }

    @Override // androidx.media2.session.MediaController.g
    public int s0() {
        int i10;
        synchronized (this.f58930c) {
            i10 = this.f58947o;
        }
        return i10;
    }

    void t(long j10, long j11, long j12) {
        synchronized (this.f58930c) {
            this.f58951s = j10;
            this.f58952t = j11;
        }
        this.f58928a.g(new j0(j12));
    }

    @Override // androidx.media2.session.MediaController.g
    public float t0() {
        synchronized (this.f58930c) {
            try {
                if (this.f58943k3 != null) {
                    return this.f58953v;
                }
                new IllegalStateException();
                boolean z10 = true;
                return 0.0f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public long v() {
        synchronized (this.f58930c) {
            try {
                if (this.f58943k3 == null) {
                    new IllegalStateException();
                    return Long.MIN_VALUE;
                }
                return this.f58949p1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void x(int i10, int i11, int i12, int i13) {
        synchronized (this.f58930c) {
            this.f58946n = i10;
            this.X = i11;
            this.Y = i12;
            this.Z = i13;
        }
        this.f58928a.g(new h0(i10));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> xc(@NonNull String str, @NonNull Rating rating) {
        return a(SessionCommand.f58656e0, new e(str, rating));
    }

    void y(MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
        this.f58928a.g(new o0(mediaItem, trackInfo, subtitleData));
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> z0(@androidx.annotation.p0 Surface surface) {
        return a(SessionCommand.T, new x(surface));
    }
}
