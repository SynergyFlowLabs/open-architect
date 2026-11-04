package androidx.media2.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.media.AudioAttributesCompat;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import com.google.common.util.concurrent.t1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
class t implements MediaSession.e {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @androidx.annotation.b0("STATIC_LOCK")
    private static boolean f59218p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @androidx.annotation.b0("STATIC_LOCK")
    private static ComponentName f59219p1;

    @androidx.annotation.b0("mLock")
    SessionPlayer X;

    @androidx.annotation.b0("mLock")
    private androidx.media.e Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f59221a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Uri f59222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Executor f59223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final MediaSession.f f59224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f59225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HandlerThread f59226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f59227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media2.session.z f59228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media2.session.u f59229i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f59230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SessionToken f59231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AudioManager f59232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final x0 f59233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediaSession f59234n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final PendingIntent f59235o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final PendingIntent f59236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final BroadcastReceiver f59237t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private boolean f59238v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    MediaController.PlaybackInfo f59239w;
    private static final Object Z = new Object();
    static final String H1 = "MSImplBase";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    static final boolean f59220p2 = Log.isLoggable(H1, 3);

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final SessionResult f59217g3 = new SessionResult(1);

    class a implements u0<Integer> {
        a() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return Integer.valueOf(sessionPlayer.s0());
        }
    }

    class a0 implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59241a;

        a0(int i10) {
            this.f59241a = i10;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.D(this.f59241a);
        }
    }

    class b implements u0<Long> {
        b() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            if (t.this.q(sessionPlayer)) {
                return Long.valueOf(sessionPlayer.getCurrentPosition());
            }
            return null;
        }
    }

    class b0 implements u0<Integer> {
        b0() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return Integer.valueOf(sessionPlayer.J());
        }
    }

    class c implements u0<Long> {
        c() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            if (t.this.q(sessionPlayer)) {
                return Long.valueOf(sessionPlayer.getDuration());
            }
            return null;
        }
    }

    class c0 implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59246a;

        c0(int i10) {
            this.f59246a = i10;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.K(this.f59246a);
        }
    }

    class d implements u0<Long> {
        d() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            if (t.this.q(sessionPlayer)) {
                return Long.valueOf(sessionPlayer.v());
            }
            return null;
        }
    }

    class d0 implements u0<VideoSize> {
        d0() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VideoSize a(@NonNull SessionPlayer sessionPlayer) {
            return androidx.media2.session.a0.K(sessionPlayer.h0());
        }
    }

    class e implements u0<Integer> {
        e() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return Integer.valueOf(sessionPlayer.i1());
        }
    }

    class e0 implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Surface f59251a;

        e0(Surface surface) {
            this.f59251a = surface;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) {
            return sessionPlayer.z0(this.f59251a);
        }
    }

    class f implements u0<Float> {
        f() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            if (t.this.q(sessionPlayer)) {
                return Float.valueOf(sessionPlayer.t0());
            }
            return null;
        }
    }

    class f0 implements u0<List<SessionPlayer.TrackInfo>> {
        f0() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<SessionPlayer.TrackInfo> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return androidx.media2.session.a0.L(sessionPlayer.G1());
        }
    }

    class g implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f59255a;

        g(float f10) {
            this.f59255a = f10;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.G(this.f59255a);
        }
    }

    class g0 implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionCommandGroup f59257a;

        g0(SessionCommandGroup sessionCommandGroup) {
            this.f59257a = sessionCommandGroup;
        }

        @Override // androidx.media2.session.t.w0
        public void a(MediaSession.c cVar, int i10) throws RemoteException {
            cVar.a(i10, this.f59257a);
        }
    }

    class h implements u0<List<MediaItem>> {
        h() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<MediaItem> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.V0();
        }
    }

    class h0 implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionPlayer.TrackInfo f59260a;

        h0(SessionPlayer.TrackInfo trackInfo) {
            this.f59260a = trackInfo;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.A0(this.f59260a);
        }
    }

    class i implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f59262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaMetadata f59263b;

        i(List list, MediaMetadata mediaMetadata) {
            this.f59262a = list;
            this.f59263b = mediaMetadata;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.Y0(this.f59262a, this.f59263b);
        }
    }

    class i0 implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionPlayer.TrackInfo f59265a;

        i0(SessionPlayer.TrackInfo trackInfo) {
            this.f59265a = trackInfo;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.K0(this.f59265a);
        }
    }

    class j implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaItem f59267a;

        j(MediaItem mediaItem) {
            this.f59267a = mediaItem;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.g(this.f59267a);
        }
    }

    class j0 implements u0<SessionPlayer.TrackInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59269a;

        j0(int i10) {
            this.f59269a = i10;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SessionPlayer.TrackInfo a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return androidx.media2.session.a0.J(sessionPlayer.I1(this.f59269a));
        }
    }

    class k implements w0 {
        k() {
        }

        @Override // androidx.media2.session.t.w0
        public void a(MediaSession.c cVar, int i10) throws RemoteException {
            cVar.e(i10);
        }
    }

    class k0 implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionPlayer f59272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaController.PlaybackInfo f59273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SessionPlayer f59274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MediaController.PlaybackInfo f59275d;

        k0(SessionPlayer sessionPlayer, MediaController.PlaybackInfo playbackInfo, SessionPlayer sessionPlayer2, MediaController.PlaybackInfo playbackInfo2) {
            this.f59272a = sessionPlayer;
            this.f59273b = playbackInfo;
            this.f59274c = sessionPlayer2;
            this.f59275d = playbackInfo2;
        }

        @Override // androidx.media2.session.t.w0
        public void a(MediaSession.c cVar, int i10) throws RemoteException {
            cVar.j(i10, this.f59272a, this.f59273b, this.f59274c, this.f59275d);
        }
    }

    class l implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59277a;

        l(int i10) {
            this.f59277a = i10;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return this.f59277a >= sessionPlayer.V0().size() ? SessionPlayer.c.a(-3) : sessionPlayer.H1(this.f59277a);
        }
    }

    class l0 implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaController.PlaybackInfo f59279a;

        l0(MediaController.PlaybackInfo playbackInfo) {
            this.f59279a = playbackInfo;
        }

        @Override // androidx.media2.session.t.w0
        public void a(MediaSession.c cVar, int i10) throws RemoteException {
            cVar.h(i10, this.f59279a);
        }
    }

    class m implements u0<t1<SessionPlayer.c>> {
        m() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.j();
        }
    }

    class m0 implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionCommand f59282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f59283b;

        m0(SessionCommand sessionCommand, Bundle bundle) {
            this.f59282a = sessionCommand;
            this.f59283b = bundle;
        }

        @Override // androidx.media2.session.t.w0
        public void a(MediaSession.c cVar, int i10) throws RemoteException {
            cVar.y(i10, this.f59282a, this.f59283b);
        }
    }

    class n implements u0<t1<SessionPlayer.c>> {
        n() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.h();
        }
    }

    class n0 implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionCommand f59286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f59287b;

        n0(SessionCommand sessionCommand, Bundle bundle) {
            this.f59286a = sessionCommand;
            this.f59287b = bundle;
        }

        @Override // androidx.media2.session.t.w0
        public void a(MediaSession.c cVar, int i10) throws RemoteException {
            cVar.y(i10, this.f59286a, this.f59287b);
        }
    }

    class o implements u0<MediaMetadata> {
        o() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadata a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.V();
        }
    }

    class o0 implements u0<t1<SessionPlayer.c>> {
        o0() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            if (sessionPlayer.s0() != 0) {
                return sessionPlayer.B();
            }
            t1<SessionPlayer.c> t1VarA = sessionPlayer.A();
            t1<SessionPlayer.c> t1VarB = sessionPlayer.B();
            if (t1VarA == null || t1VarB == null) {
                return null;
            }
            return s0.S(androidx.media2.session.a0.f58741d, t1VarA, t1VarB);
        }
    }

    class p implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaItem f59292b;

        p(int i10, MediaItem mediaItem) {
            this.f59291a = i10;
            this.f59292b = mediaItem;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.a(this.f59291a, this.f59292b);
        }
    }

    class p0 implements u0<t1<SessionPlayer.c>> {
        p0() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.pause();
        }
    }

    class q implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59295a;

        q(int i10) {
            this.f59295a = i10;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return this.f59295a >= sessionPlayer.V0().size() ? SessionPlayer.c.a(-3) : sessionPlayer.G0(this.f59295a);
        }
    }

    class q0 implements u0<t1<SessionPlayer.c>> {
        q0() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.A();
        }
    }

    class r implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaItem f59299b;

        r(int i10, MediaItem mediaItem) {
            this.f59298a = i10;
            this.f59299b = mediaItem;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.e(this.f59298a, this.f59299b);
        }
    }

    class r0 implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f59301a;

        r0(long j10) {
            this.f59301a = j10;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.F(this.f59301a);
        }
    }

    class s implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59304b;

        s(int i10, int i11) {
            this.f59303a = i10;
            this.f59304b = i11;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.Z0(this.f59303a, this.f59304b);
        }
    }

    static final class s0<T extends androidx.media2.common.a> extends androidx.concurrent.futures.a<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final t1<T>[] f59306i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        AtomicInteger f59307j = new AtomicInteger(0);

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f59308a;

            a(int i10) {
                this.f59308a = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i10 = 0;
                try {
                    T t10 = s0.this.f59306i[this.f59308a].get();
                    int i11 = t10.i();
                    if (i11 == 0 || i11 == 1) {
                        int iIncrementAndGet = s0.this.f59307j.incrementAndGet();
                        s0 s0Var = s0.this;
                        if (iIncrementAndGet == s0Var.f59306i.length) {
                            s0Var.E(t10);
                        }
                        return;
                    }
                    int i12 = 0;
                    while (true) {
                        s0 s0Var2 = s0.this;
                        t1<T>[] t1VarArr = s0Var2.f59306i;
                        if (i12 >= t1VarArr.length) {
                            s0Var2.E(t10);
                            return;
                        }
                        if (!t1VarArr[i12].isCancelled() && !s0.this.f59306i[i12].isDone() && this.f59308a != i12) {
                            s0.this.f59306i[i12].cancel(true);
                        }
                        i12++;
                    }
                } catch (Exception e10) {
                    while (true) {
                        s0 s0Var3 = s0.this;
                        t1<T>[] t1VarArr2 = s0Var3.f59306i;
                        if (i10 >= t1VarArr2.length) {
                            s0Var3.H(e10);
                            return;
                        }
                        if (!t1VarArr2[i10].isCancelled() && !s0.this.f59306i[i10].isDone() && this.f59308a != i10) {
                            s0.this.f59306i[i10].cancel(true);
                        }
                        i10++;
                    }
                }
            }
        }

        private s0(Executor executor, t1<T>[] t1VarArr) {
            int i10 = 0;
            this.f59306i = t1VarArr;
            while (true) {
                t1<T>[] t1VarArr2 = this.f59306i;
                if (i10 >= t1VarArr2.length) {
                    return;
                }
                t1VarArr2[i10].m0(new a(i10), executor);
                i10++;
            }
        }

        @SafeVarargs
        public static <U extends androidx.media2.common.a> s0<U> S(Executor executor, t1<U>... t1VarArr) {
            return new s0<>(executor, t1VarArr);
        }
    }

    /* JADX INFO: renamed from: androidx.media2.session.t$t, reason: collision with other inner class name */
    class C0553t implements u0<MediaItem> {
        C0553t() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaItem a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.Z();
        }
    }

    final class t0 extends BroadcastReceiver {
        t0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            KeyEvent keyEvent;
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && androidx.core.util.o.a(intent.getData(), t.this.f59222b) && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                t.this.cb().e().d(keyEvent);
            }
        }
    }

    class u implements u0<Integer> {
        u() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return Integer.valueOf(sessionPlayer.l0());
        }
    }

    @FunctionalInterface
    interface u0<T> {
        T a(@NonNull SessionPlayer sessionPlayer) throws Exception;
    }

    class v implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f59313a;

        v(List list) {
            this.f59313a = list;
        }

        @Override // androidx.media2.session.t.w0
        public void a(MediaSession.c cVar, int i10) throws RemoteException {
            cVar.z(i10, this.f59313a);
        }
    }

    static class v0 implements MediaItem.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<t> f59315a;

        class a implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f59316a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f59317b;

            a(List list, t tVar) {
                this.f59316a = list;
                this.f59317b = tVar;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.m(i10, this.f59316a, this.f59317b.V(), this.f59317b.l0(), this.f59317b.a0(), this.f59317b.e0());
            }
        }

        v0(t tVar) {
            this.f59315a = new WeakReference<>(tVar);
        }

        @Override // androidx.media2.common.MediaItem.c
        public void a(@NonNull MediaItem mediaItem, MediaMetadata mediaMetadata) {
            List<MediaItem> listV0;
            t tVar = this.f59315a.get();
            if (tVar != null && mediaItem != null && (listV0 = tVar.V0()) != null) {
                for (int i10 = 0; i10 < listV0.size(); i10++) {
                    if (mediaItem.equals(listV0.get(i10))) {
                        tVar.l(new a(listV0, tVar));
                        return;
                    }
                }
            }
        }
    }

    class w implements u0<Integer> {
        w() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return Integer.valueOf(sessionPlayer.a0());
        }
    }

    @FunctionalInterface
    interface w0 {
        void a(MediaSession.c cVar, int i10) throws RemoteException;
    }

    class x implements u0<Integer> {
        x() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return Integer.valueOf(sessionPlayer.e0());
        }
    }

    private static class x0 extends androidx.media2.session.d0.a implements MediaItem.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<t> f59321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaItem f59322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<MediaItem> f59323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final v0 f59324d;

        class a implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ VideoSize f59325a;

            a(VideoSize videoSize) {
                this.f59325a = videoSize;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.x(i10, androidx.media2.session.a0.K(this.f59325a));
            }
        }

        class b implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f59327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f59328b;

            b(List list, t tVar) {
                this.f59327a = list;
                this.f59328b = tVar;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.w(i10, androidx.media2.session.a0.L(this.f59327a), androidx.media2.session.a0.J(this.f59328b.I1(1)), androidx.media2.session.a0.J(this.f59328b.I1(2)), androidx.media2.session.a0.J(this.f59328b.I1(4)), androidx.media2.session.a0.J(this.f59328b.I1(5)));
            }
        }

        class c implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SessionPlayer.TrackInfo f59330a;

            c(SessionPlayer.TrackInfo trackInfo) {
                this.f59330a = trackInfo;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.v(i10, androidx.media2.session.a0.J(this.f59330a));
            }
        }

        class d implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SessionPlayer.TrackInfo f59332a;

            d(SessionPlayer.TrackInfo trackInfo) {
                this.f59332a = trackInfo;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.u(i10, androidx.media2.session.a0.J(this.f59332a));
            }
        }

        class e implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaItem f59334a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SessionPlayer.TrackInfo f59335b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SubtitleData f59336c;

            e(MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
                this.f59334a = mediaItem;
                this.f59335b = trackInfo;
                this.f59336c = subtitleData;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.t(i10, this.f59334a, this.f59335b, this.f59336c);
            }
        }

        class f implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaItem f59338a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f59339b;

            f(MediaItem mediaItem, t tVar) {
                this.f59338a = mediaItem;
                this.f59339b = tVar;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.d(i10, this.f59338a, this.f59339b.l0(), this.f59339b.a0(), this.f59339b.e0());
            }
        }

        class g implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SessionPlayer f59341a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f59342b;

            g(SessionPlayer sessionPlayer, int i10) {
                this.f59341a = sessionPlayer;
                this.f59342b = i10;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.l(i10, SystemClock.elapsedRealtime(), this.f59341a.getCurrentPosition(), this.f59342b);
            }
        }

        class h implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaItem f59344a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f59345b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SessionPlayer f59346c;

            h(MediaItem mediaItem, int i10, SessionPlayer sessionPlayer) {
                this.f59344a = mediaItem;
                this.f59345b = i10;
                this.f59346c = sessionPlayer;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.b(i10, this.f59344a, this.f59345b, this.f59346c.v(), SystemClock.elapsedRealtime(), this.f59346c.getCurrentPosition());
            }
        }

        class i implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SessionPlayer f59348a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f59349b;

            i(SessionPlayer sessionPlayer, float f10) {
                this.f59348a = sessionPlayer;
                this.f59349b = f10;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.i(i10, SystemClock.elapsedRealtime(), this.f59348a.getCurrentPosition(), this.f59349b);
            }
        }

        class j implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SessionPlayer f59351a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f59352b;

            j(SessionPlayer sessionPlayer, long j10) {
                this.f59351a = sessionPlayer;
                this.f59352b = j10;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.q(i10, SystemClock.elapsedRealtime(), this.f59351a.getCurrentPosition(), this.f59352b);
            }
        }

        class k implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f59354a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MediaMetadata f59355b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ t f59356c;

            k(List list, MediaMetadata mediaMetadata, t tVar) {
                this.f59354a = list;
                this.f59355b = mediaMetadata;
                this.f59356c = tVar;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.m(i10, this.f59354a, this.f59355b, this.f59356c.l0(), this.f59356c.a0(), this.f59356c.e0());
            }
        }

        class l implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaMetadata f59358a;

            l(MediaMetadata mediaMetadata) {
                this.f59358a = mediaMetadata;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.n(i10, this.f59358a);
            }
        }

        class m implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f59360a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f59361b;

            m(int i10, t tVar) {
                this.f59360a = i10;
                this.f59361b = tVar;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.o(i10, this.f59360a, this.f59361b.l0(), this.f59361b.a0(), this.f59361b.e0());
            }
        }

        class n implements w0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f59363a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f59364b;

            n(int i10, t tVar) {
                this.f59363a = i10;
                this.f59364b = tVar;
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.s(i10, this.f59363a, this.f59364b.l0(), this.f59364b.a0(), this.f59364b.e0());
            }
        }

        class o implements w0 {
            o() {
            }

            @Override // androidx.media2.session.t.w0
            public void a(MediaSession.c cVar, int i10) throws RemoteException {
                cVar.g(i10);
            }
        }

        x0(t tVar) {
            this.f59321a = new WeakReference<>(tVar);
            this.f59324d = new v0(tVar);
        }

        private void s(@NonNull SessionPlayer sessionPlayer, @NonNull w0 w0Var) {
            t tVarT = t();
            if (tVarT != null && sessionPlayer != null && tVarT.J5() == sessionPlayer) {
                tVarT.l(w0Var);
            }
        }

        private t t() {
            t tVar = this.f59321a.get();
            if (tVar == null && t.f59220p2) {
                new IllegalStateException();
            }
            return tVar;
        }

        private void u(@androidx.annotation.p0 MediaItem mediaItem) {
            t tVarT = t();
            if (tVarT == null) {
                return;
            }
            s(tVarT.J5(), new f(mediaItem, tVarT));
        }

        private boolean v(@NonNull SessionPlayer sessionPlayer) {
            MediaItem mediaItemZ = sessionPlayer.Z();
            if (mediaItemZ == null) {
                return false;
            }
            return w(sessionPlayer, mediaItemZ, mediaItemZ.m());
        }

        private boolean w(@NonNull SessionPlayer sessionPlayer, @NonNull MediaItem mediaItem, @androidx.annotation.p0 MediaMetadata mediaMetadata) {
            MediaMetadata mediaMetadataA;
            long duration = sessionPlayer.getDuration();
            if (mediaItem == sessionPlayer.Z() && sessionPlayer.s0() != 0 && duration > 0 && duration != Long.MIN_VALUE) {
                if (mediaMetadata == null) {
                    mediaMetadataA = new MediaMetadata.b().d("android.media.metadata.DURATION", duration).f("android.media.metadata.MEDIA_ID", mediaItem.l()).d(MediaMetadata.f53003h0, 1L).a();
                } else if (mediaMetadata.j("android.media.metadata.DURATION")) {
                    mediaMetadata.m("android.media.metadata.DURATION");
                    mediaMetadataA = null;
                } else {
                    mediaMetadataA = new MediaMetadata.b(mediaMetadata).d("android.media.metadata.DURATION", duration).d(MediaMetadata.f53003h0, 1L).a();
                }
                if (mediaMetadataA != null) {
                    mediaItem.p(mediaMetadataA);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media2.common.MediaItem.c
        public void a(@NonNull MediaItem mediaItem, @androidx.annotation.p0 MediaMetadata mediaMetadata) {
            t tVarT = t();
            if (tVarT != null && !w(tVarT.J5(), mediaItem, mediaMetadata)) {
                u(mediaItem);
            }
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void b(@NonNull SessionPlayer sessionPlayer, AudioAttributesCompat audioAttributesCompat) {
            MediaController.PlaybackInfo playbackInfo;
            t tVarT = t();
            if (tVarT != null && sessionPlayer != null && tVarT.J5() == sessionPlayer) {
                MediaController.PlaybackInfo playbackInfoE = tVarT.e(sessionPlayer, audioAttributesCompat);
                synchronized (tVarT.f59221a) {
                    playbackInfo = tVarT.f59239w;
                    tVarT.f59239w = playbackInfoE;
                }
                if (androidx.core.util.o.a(playbackInfoE, playbackInfo)) {
                    return;
                }
                tVarT.r(playbackInfoE);
            }
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void c(@NonNull SessionPlayer sessionPlayer, MediaItem mediaItem, int i10) {
            v(sessionPlayer);
            s(sessionPlayer, new h(mediaItem, i10, sessionPlayer));
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void d(@NonNull SessionPlayer sessionPlayer, @NonNull MediaItem mediaItem) {
            t tVarT = t();
            if (tVarT != null && sessionPlayer != null && tVarT.J5() == sessionPlayer) {
                MediaItem mediaItem2 = this.f59322b;
                if (mediaItem2 != null) {
                    mediaItem2.o(this);
                }
                if (mediaItem != null) {
                    mediaItem.j(tVarT.f59223c, this);
                }
                this.f59322b = mediaItem;
                tVarT.u().d(tVarT.k());
                if (!(mediaItem != null ? w(sessionPlayer, mediaItem, mediaItem.m()) : false)) {
                    u(mediaItem);
                }
            }
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void e(@NonNull SessionPlayer sessionPlayer) {
            s(sessionPlayer, new o());
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void f(@NonNull SessionPlayer sessionPlayer, float f10) {
            s(sessionPlayer, new i(sessionPlayer, f10));
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void g(@NonNull SessionPlayer sessionPlayer, int i10) {
            t tVarT = t();
            if (tVarT == null || sessionPlayer == null || tVarT.J5() != sessionPlayer) {
                return;
            }
            tVarT.u().h(tVarT.k(), i10);
            v(sessionPlayer);
            tVarT.l(new g(sessionPlayer, i10));
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void h(@NonNull SessionPlayer sessionPlayer, List<MediaItem> list, MediaMetadata mediaMetadata) {
            t tVarT = t();
            if (tVarT != null && sessionPlayer != null && tVarT.J5() == sessionPlayer) {
                if (this.f59323c != null) {
                    for (int i10 = 0; i10 < this.f59323c.size(); i10++) {
                        this.f59323c.get(i10).o(this.f59324d);
                    }
                }
                if (list != null) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        list.get(i11).j(tVarT.f59223c, this.f59324d);
                    }
                }
                this.f59323c = list;
                s(sessionPlayer, new k(list, mediaMetadata, tVarT));
            }
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void i(@NonNull SessionPlayer sessionPlayer, MediaMetadata mediaMetadata) {
            s(sessionPlayer, new l(mediaMetadata));
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void j(@NonNull SessionPlayer sessionPlayer, int i10) {
            s(sessionPlayer, new m(i10, t()));
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void k(@NonNull SessionPlayer sessionPlayer, long j10) {
            s(sessionPlayer, new j(sessionPlayer, j10));
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void l(@NonNull SessionPlayer sessionPlayer, int i10) {
            s(sessionPlayer, new n(i10, t()));
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void m(@NonNull SessionPlayer sessionPlayer, @NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) {
            s(sessionPlayer, new e(mediaItem, trackInfo, subtitleData));
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void n(@NonNull SessionPlayer sessionPlayer, @NonNull SessionPlayer.TrackInfo trackInfo) {
            s(sessionPlayer, new d(trackInfo));
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void o(@NonNull SessionPlayer sessionPlayer, @NonNull SessionPlayer.TrackInfo trackInfo) {
            s(sessionPlayer, new c(trackInfo));
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void p(@NonNull SessionPlayer sessionPlayer, @NonNull List<SessionPlayer.TrackInfo> list) {
            s(sessionPlayer, new b(list, t()));
        }

        @Override // androidx.media2.common.SessionPlayer.b
        public void q(@NonNull SessionPlayer sessionPlayer, @NonNull VideoSize videoSize) {
            s(sessionPlayer, new a(videoSize));
        }

        @Override // androidx.media2.session.d0.a
        public void r(@NonNull androidx.media2.session.d0 d0Var, int i10) {
            t tVarT = t();
            if (tVarT != null) {
                MediaController.PlaybackInfo playbackInfoE = tVarT.e(d0Var, null);
                synchronized (tVarT.f59221a) {
                    try {
                        if (tVarT.X != d0Var) {
                            return;
                        }
                        MediaController.PlaybackInfo playbackInfo = tVarT.f59239w;
                        tVarT.f59239w = playbackInfoE;
                        if (!androidx.core.util.o.a(playbackInfoE, playbackInfo)) {
                            tVarT.r(playbackInfoE);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    class y implements u0<t1<SessionPlayer.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaMetadata f59367a;

        y(MediaMetadata mediaMetadata) {
            this.f59367a = mediaMetadata;
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1<SessionPlayer.c> a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return sessionPlayer.a1(this.f59367a);
        }
    }

    class z implements u0<Integer> {
        z() {
        }

        @Override // androidx.media2.session.t.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(@NonNull SessionPlayer sessionPlayer) throws Exception {
            return Integer.valueOf(sessionPlayer.C());
        }
    }

    t(MediaSession mediaSession, Context context, String str, SessionPlayer sessionPlayer, PendingIntent pendingIntent, Executor executor, MediaSession.f fVar, Bundle bundle) {
        ComponentName componentName;
        this.f59225e = context;
        this.f59234n = mediaSession;
        HandlerThread handlerThread = new HandlerThread("MediaSession_Thread");
        this.f59226f = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f59227g = handler;
        androidx.media2.session.z zVar = new androidx.media2.session.z(this);
        this.f59228h = zVar;
        this.f59235o = pendingIntent;
        this.f59224d = fVar;
        this.f59223c = executor;
        this.f59232l = (AudioManager) context.getSystemService("audio");
        this.f59233m = new x0(this);
        this.f59230j = str;
        Uri uriBuild = new Uri.Builder().scheme(t.class.getName()).appendPath(str).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f59222b = uriBuild;
        this.f59231k = new SessionToken(new SessionTokenImplBase(Process.myUid(), 0, context.getPackageName(), zVar, bundle));
        synchronized (Z) {
            try {
                if (!f59218p0) {
                    ComponentName componentNameO = o(MediaLibraryService.f58610c);
                    f59219p1 = componentNameO;
                    if (componentNameO == null) {
                        f59219p1 = o(androidx.media2.session.w.f59438b);
                    }
                    f59218p0 = true;
                }
                componentName = f59219p1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i10 = Build.VERSION.SDK_INT >= 31 ? com.google.api.client.googleapis.media.a.f115410j : 0;
        if (componentName == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", uriBuild);
            intent.setPackage(context.getPackageName());
            this.f59236s = PendingIntent.getBroadcast(context, 0, intent, i10);
            componentName = new ComponentName(context, context.getClass());
            t0 t0Var = new t0();
            this.f59237t = t0Var;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            intentFilter.addDataScheme(uriBuild.getScheme());
            context.registerReceiver(t0Var, intentFilter);
        } else {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON", uriBuild);
            intent2.setComponent(componentName);
            this.f59236s = androidx.media2.common.b.c.a.a(context, 0, intent2, i10);
            this.f59237t = null;
        }
        androidx.media2.session.u uVar = new androidx.media2.session.u(this, componentName, this.f59236s, handler);
        this.f59229i = uVar;
        F2(sessionPlayer);
        uVar.start();
    }

    private t1<SessionPlayer.c> f(@NonNull u0<t1<SessionPlayer.c>> u0Var) {
        androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
        eVarN.E(new SessionPlayer.c(-2, null));
        return (t1) g(u0Var, eVarN);
    }

    private <T> T g(@NonNull u0<T> u0Var, T t10) {
        SessionPlayer sessionPlayer;
        synchronized (this.f59221a) {
            try {
                sessionPlayer = this.X;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            if (!isClosed()) {
                T tA = u0Var.a(sessionPlayer);
                if (tA != null) {
                    return tA;
                }
            } else if (f59220p2) {
                new IllegalStateException();
            }
        } catch (Exception unused) {
        }
        return t10;
    }

    private t1<SessionResult> h(@NonNull MediaSession.d dVar, @NonNull w0 w0Var) {
        int iR;
        t1<SessionResult> t1VarJ;
        try {
            androidx.media2.session.e0 e0VarD = this.f59228h.L().d(dVar);
            if (e0VarD != null) {
                androidx.media2.session.e0.a aVarA = e0VarD.a(f59217g3);
                iR = aVarA.R();
                t1VarJ = aVarA;
            } else {
                if (!P7(dVar)) {
                    return SessionResult.j(-100);
                }
                iR = 0;
                t1VarJ = SessionResult.j(0);
            }
            w0Var.a(dVar.c(), iR);
            return t1VarJ;
        } catch (DeadObjectException e10) {
            x(dVar, e10);
            return SessionResult.j(-100);
        } catch (RemoteException unused) {
            dVar.toString();
            return SessionResult.j(-1);
        }
    }

    @androidx.annotation.p0
    private ComponentName o(@NonNull String str) {
        PackageManager packageManager = this.f59225e.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(this.f59225e.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        return null;
    }

    @e.a({"WrongConstant"})
    private void t(@androidx.annotation.p0 SessionPlayer sessionPlayer, @androidx.annotation.p0 MediaController.PlaybackInfo playbackInfo, @NonNull SessionPlayer sessionPlayer2, @NonNull MediaController.PlaybackInfo playbackInfo2) {
        l(new k0(sessionPlayer, playbackInfo, sessionPlayer2, playbackInfo2));
    }

    private void x(MediaSession.d dVar, DeadObjectException deadObjectException) {
        if (f59220p2) {
            dVar.toString();
        }
        this.f59228h.L().i(dVar);
    }

    @Override // androidx.media2.session.o.a
    public t1<SessionPlayer.c> A() {
        return f(new q0());
    }

    @Override // androidx.media2.session.o.b
    public t1<SessionPlayer.c> A0(SessionPlayer.TrackInfo trackInfo) {
        return f(new h0(trackInfo));
    }

    @Override // androidx.media2.session.o.a
    public t1<SessionPlayer.c> B() {
        return f(new o0());
    }

    @Override // androidx.media2.session.o.c
    public int C() {
        return ((Integer) g(new z(), 0)).intValue();
    }

    @Override // androidx.media2.session.o.c
    public t1<SessionPlayer.c> D(int i10) {
        return f(new a0(i10));
    }

    @Override // androidx.media2.session.o.a
    public t1<SessionPlayer.c> F(long j10) {
        return f(new r0(j10));
    }

    @Override // androidx.media2.session.MediaSession.e
    @e.a({"WrongConstant"})
    public void F2(@NonNull SessionPlayer sessionPlayer) {
        MediaController.PlaybackInfo playbackInfoE = e(sessionPlayer, null);
        synchronized (this.f59221a) {
            try {
                SessionPlayer sessionPlayer2 = this.X;
                if (sessionPlayer2 == sessionPlayer) {
                    return;
                }
                this.X = sessionPlayer;
                MediaController.PlaybackInfo playbackInfo = this.f59239w;
                this.f59239w = playbackInfoE;
                if (sessionPlayer2 != null) {
                    sessionPlayer2.l(this.f59233m);
                }
                sessionPlayer.d(this.f59223c, this.f59233m);
                t(sessionPlayer2, playbackInfo, sessionPlayer, playbackInfoE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.o.a
    public t1<SessionPlayer.c> G(float f10) {
        return f(new g(f10));
    }

    @Override // androidx.media2.session.o.c
    public t1<SessionPlayer.c> G0(int i10) {
        if (i10 >= 0) {
            return f(new q(i10));
        }
        throw new IllegalArgumentException("index shouldn't be negative");
    }

    @Override // androidx.media2.session.o.b
    public List<SessionPlayer.TrackInfo> G1() {
        return (List) g(new f0(), null);
    }

    @Override // androidx.media2.session.MediaSession.e
    public void G7(@NonNull SessionCommand sessionCommand, @androidx.annotation.p0 Bundle bundle) {
        l(new m0(sessionCommand, bundle));
    }

    @Override // androidx.media2.session.o.c
    public t1<SessionPlayer.c> H1(int i10) {
        if (i10 >= 0) {
            return f(new l(i10));
        }
        throw new IllegalArgumentException("index shouldn't be negative");
    }

    @Override // androidx.media2.session.MediaSession.e
    @NonNull
    public SessionToken I0() {
        return this.f59231k;
    }

    @Override // androidx.media2.session.o.b
    public SessionPlayer.TrackInfo I1(int i10) {
        return (SessionPlayer.TrackInfo) g(new j0(i10), null);
    }

    @Override // androidx.media2.session.o.c
    public int J() {
        return ((Integer) g(new b0(), 0)).intValue();
    }

    @Override // androidx.media2.session.MediaSession.e
    @NonNull
    public SessionPlayer J5() {
        SessionPlayer sessionPlayer;
        synchronized (this.f59221a) {
            try {
                sessionPlayer = this.X;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sessionPlayer;
    }

    @Override // androidx.media2.session.o.c
    public t1<SessionPlayer.c> K(int i10) {
        return f(new c0(i10));
    }

    @Override // androidx.media2.session.o.b
    public t1<SessionPlayer.c> K0(SessionPlayer.TrackInfo trackInfo) {
        return f(new i0(trackInfo));
    }

    @Override // androidx.media2.session.MediaSession.e
    public PendingIntent M() {
        return this.f59235o;
    }

    @Override // androidx.media2.session.o.c
    public t1<SessionPlayer.c> N0() {
        return f(new m());
    }

    @Override // androidx.media2.session.MediaSession.e
    public t1<SessionResult> O5(@NonNull MediaSession.d dVar, @NonNull SessionCommand sessionCommand, @androidx.annotation.p0 Bundle bundle) {
        return h(dVar, new n0(sessionCommand, bundle));
    }

    @Override // androidx.media2.session.MediaSession.e
    public boolean P7(@NonNull MediaSession.d dVar) {
        if (dVar == null) {
            return false;
        }
        return this.f59228h.L().h(dVar) || this.f59229i.B0().h(dVar);
    }

    @Override // androidx.media2.session.MediaSession.e
    public void Q9(androidx.media2.session.b bVar, int i10, String str, int i11, int i12, @androidx.annotation.p0 Bundle bundle) {
        this.f59228h.p(bVar, i10, str, i11, i12, bundle);
    }

    @Override // androidx.media2.session.MediaSession.e
    public void R7(@NonNull MediaSession.d dVar, @NonNull SessionCommandGroup sessionCommandGroup) {
        if (!this.f59228h.L().h(dVar)) {
            this.f59229i.B0().k(dVar, sessionCommandGroup);
        } else {
            this.f59228h.L().k(dVar, sessionCommandGroup);
            j(dVar, new g0(sessionCommandGroup));
        }
    }

    @Override // androidx.media2.session.MediaSession.e
    @NonNull
    public List<MediaSession.d> Sc() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f59228h.L().b());
        arrayList.addAll(this.f59229i.B0().b());
        return arrayList;
    }

    @Override // androidx.media2.session.o.c
    public MediaMetadata V() {
        return (MediaMetadata) g(new o(), null);
    }

    @Override // androidx.media2.session.o.c
    public List<MediaItem> V0() {
        return (List) g(new h(), null);
    }

    @Override // androidx.media2.session.o.c
    public t1<SessionPlayer.c> Y0(@NonNull List<MediaItem> list, @androidx.annotation.p0 MediaMetadata mediaMetadata) {
        if (list != null) {
            return f(new i(list, mediaMetadata));
        }
        throw new NullPointerException("list shouldn't be null");
    }

    @Override // androidx.media2.session.MediaSession.e
    public IBinder Ya() {
        androidx.media.e eVar;
        synchronized (this.f59221a) {
            try {
                if (this.Y == null) {
                    this.Y = d(this.f59225e, this.f59231k, this.f59229i.cb().i());
                }
                eVar = this.Y;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar.onBind(new Intent(androidx.media.e.f52772k));
    }

    @Override // androidx.media2.session.o.c
    public MediaItem Z() {
        return (MediaItem) g(new C0553t(), null);
    }

    @Override // androidx.media2.session.o.c
    public t1<SessionPlayer.c> Z0(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("indices shouldn't be negative");
        }
        return f(new s(i10, i11));
    }

    @Override // androidx.media2.session.o.c
    public t1<SessionPlayer.c> a(int i10, @NonNull MediaItem mediaItem) {
        if (i10 < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        if (mediaItem != null) {
            return f(new p(i10, mediaItem));
        }
        throw new NullPointerException("item shouldn't be null");
    }

    @Override // androidx.media2.session.o.c
    public int a0() {
        return ((Integer) g(new w(), -1)).intValue();
    }

    @Override // androidx.media2.session.o.c
    public t1<SessionPlayer.c> a1(@androidx.annotation.p0 MediaMetadata mediaMetadata) {
        return f(new y(mediaMetadata));
    }

    @Override // androidx.media2.session.o.c
    public t1<SessionPlayer.c> b(int i10, @NonNull MediaItem mediaItem) {
        if (i10 < 0) {
            throw new IllegalArgumentException("index shouldn't be negative");
        }
        if (mediaItem != null) {
            return f(new r(i10, mediaItem));
        }
        throw new NullPointerException("item shouldn't be null");
    }

    @Override // androidx.media2.session.MediaSession.e
    public MediaController.PlaybackInfo b0() {
        MediaController.PlaybackInfo playbackInfo;
        synchronized (this.f59221a) {
            playbackInfo = this.f59239w;
        }
        return playbackInfo;
    }

    @Override // androidx.media2.session.o.c
    public t1<SessionPlayer.c> c(@NonNull MediaItem mediaItem) {
        if (mediaItem != null) {
            return f(new j(mediaItem));
        }
        throw new NullPointerException("item shouldn't be null");
    }

    @Override // androidx.media2.session.MediaSession.e
    @NonNull
    public MediaSessionCompat cb() {
        return this.f59229i.cb();
    }

    @Override // androidx.media2.session.MediaSession.e
    public t1<SessionResult> ce(@NonNull MediaSession.d dVar, @NonNull List<MediaSession.CommandButton> list) {
        return h(dVar, new v(list));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f59221a) {
            try {
                if (this.f59238v) {
                    return;
                }
                this.f59238v = true;
                if (f59220p2) {
                    getId();
                    Objects.toString(I0());
                }
                this.X.l(this.f59233m);
                this.f59236s.cancel();
                this.f59229i.close();
                BroadcastReceiver broadcastReceiver = this.f59237t;
                if (broadcastReceiver != null) {
                    this.f59225e.unregisterReceiver(broadcastReceiver);
                }
                this.f59224d.k(this.f59234n);
                l(new k());
                this.f59227g.removeCallbacksAndMessages(null);
                if (this.f59226f.isAlive()) {
                    androidx.media2.common.b.C0498b.a.a(this.f59226f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    androidx.media.e d(Context context, SessionToken sessionToken, MediaSessionCompat.Token token) {
        return new androidx.media2.session.y(context, this, token);
    }

    @NonNull
    MediaController.PlaybackInfo e(@NonNull SessionPlayer sessionPlayer, AudioAttributesCompat audioAttributesCompat) {
        if (audioAttributesCompat == null) {
            audioAttributesCompat = sessionPlayer.b();
        }
        if (sessionPlayer instanceof androidx.media2.session.d0) {
            androidx.media2.session.d0 d0Var = (androidx.media2.session.d0) sessionPlayer;
            return MediaController.PlaybackInfo.d(2, audioAttributesCompat, d0Var.r(), d0Var.o(), d0Var.q());
        }
        int iA = androidx.media2.session.a0.A(audioAttributesCompat);
        return MediaController.PlaybackInfo.d(1, audioAttributesCompat, androidx.media2.common.b.a.C0497a.a(this.f59232l) ? 0 : 2, this.f59232l.getStreamMaxVolume(iA), this.f59232l.getStreamVolume(iA));
    }

    @Override // androidx.media2.session.o.c
    public int e0() {
        return ((Integer) g(new x(), -1)).intValue();
    }

    @Override // androidx.media2.session.MediaSession.e
    public Context getContext() {
        return this.f59225e;
    }

    @Override // androidx.media2.session.o.a
    public long getCurrentPosition() {
        return ((Long) g(new b(), Long.MIN_VALUE)).longValue();
    }

    @Override // androidx.media2.session.o.a
    public long getDuration() {
        return ((Long) g(new c(), Long.MIN_VALUE)).longValue();
    }

    @Override // androidx.media2.session.MediaSession.e
    @NonNull
    public String getId() {
        return this.f59230j;
    }

    @Override // androidx.media2.session.MediaSession.e
    @NonNull
    public Uri getUri() {
        return this.f59222b;
    }

    @Override // androidx.media2.session.o.b
    public VideoSize h0() {
        return (VideoSize) g(new d0(), new VideoSize(0, 0));
    }

    @Override // androidx.media2.session.o.a
    public int i1() {
        return ((Integer) g(new e(), 0)).intValue();
    }

    @Override // androidx.media2.session.MediaSession.e
    public boolean isClosed() {
        boolean z10;
        synchronized (this.f59221a) {
            z10 = this.f59238v;
        }
        return z10;
    }

    void j(@NonNull MediaSession.d dVar, @NonNull w0 w0Var) {
        int iB;
        try {
            androidx.media2.session.e0 e0VarD = this.f59228h.L().d(dVar);
            if (e0VarD != null) {
                iB = e0VarD.b();
            } else {
                if (!P7(dVar)) {
                    if (f59220p2) {
                        Objects.toString(dVar);
                        return;
                    }
                    return;
                }
                iB = 0;
            }
            w0Var.a(dVar.c(), iB);
        } catch (DeadObjectException e10) {
            x(dVar, e10);
        } catch (RemoteException unused) {
            dVar.toString();
        }
    }

    @Override // androidx.media2.session.MediaSession.e
    @NonNull
    public MediaSession k() {
        return this.f59234n;
    }

    void l(@NonNull w0 w0Var) {
        List<MediaSession.d> listB = this.f59228h.L().b();
        for (int i10 = 0; i10 < listB.size(); i10++) {
            j(listB.get(i10), w0Var);
        }
        try {
            w0Var.a(this.f59229i.H0(), 0);
        } catch (RemoteException unused) {
        }
    }

    @Override // androidx.media2.session.o.c
    public int l0() {
        return ((Integer) g(new u(), -1)).intValue();
    }

    androidx.media.e m() {
        androidx.media.e eVar;
        synchronized (this.f59221a) {
            try {
                eVar = this.Y;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // androidx.media2.session.o.c
    public t1<SessionPlayer.c> n0() {
        return f(new n());
    }

    @Override // androidx.media2.session.o.a
    public t1<SessionPlayer.c> pause() {
        return f(new p0());
    }

    boolean q(@NonNull SessionPlayer sessionPlayer) {
        return (isClosed() || sessionPlayer.s0() == 0 || sessionPlayer.s0() == 3) ? false : true;
    }

    void r(MediaController.PlaybackInfo playbackInfo) {
        l(new l0(playbackInfo));
    }

    @Override // androidx.media2.session.MediaSession.e
    public Executor r2() {
        return this.f59223c;
    }

    @Override // androidx.media2.session.o.a
    public int s0() {
        return ((Integer) g(new a(), 3)).intValue();
    }

    @Override // androidx.media2.session.o.a
    public float t0() {
        return ((Float) g(new f(), Float.valueOf(1.0f))).floatValue();
    }

    @Override // androidx.media2.session.MediaSession.e
    public PlaybackStateCompat ta() {
        int iQ = androidx.media2.session.a0.q(s0(), i1());
        return new PlaybackStateCompat.e().k(iQ, getCurrentPosition(), t0(), SystemClock.elapsedRealtime()).d(3670015L).e(androidx.media2.session.a0.s(l0())).f(v()).c();
    }

    @Override // androidx.media2.session.MediaSession.e
    public MediaSession.f u() {
        return this.f59224d;
    }

    @Override // androidx.media2.session.o.a
    public long v() {
        return ((Long) g(new d(), Long.MIN_VALUE)).longValue();
    }

    @Override // androidx.media2.session.MediaSession.e
    public void v4(long j10) {
        this.f59229i.Q0(j10);
    }

    @Override // androidx.media2.session.o.b
    public t1<SessionPlayer.c> z0(Surface surface) {
        return f(new e0(surface));
    }
}
