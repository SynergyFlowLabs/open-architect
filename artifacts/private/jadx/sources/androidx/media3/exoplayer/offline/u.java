package androidx.media3.exoplayer.offline;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.f1;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.l0;
import androidx.media3.exoplayer.scheduler.Requirements;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class u extends Service {
    public static final int H1 = 0;
    public static final String X = "download_request";
    public static final String Y = "content_id";
    public static final String Z = "stop_reason";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final String f64556g3 = "DownloadService";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final HashMap<Class<? extends u>, b> f64557h3 = new HashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f64558k = "androidx.media3.exoplayer.downloadService.action.INIT";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f64559l = "androidx.media3.exoplayer.downloadService.action.RESTART";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f64560m = "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f64561n = "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f64562o = "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f64563p0 = "requirements";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f64564p1 = "foreground";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final long f64565p2 = 1000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f64566s = "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f64567t = "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f64568v = "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f64569w = "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final c f64570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final String f64571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @f1
    private final int f64572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @f1
    private final int f64573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f64574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f64575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f64576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f64577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f64578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f64579j;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements q.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f64580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f64581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f64582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private final androidx.media3.exoplayer.scheduler.e f64583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Class<? extends u> f64584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private u f64585f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Requirements f64586g;

        @il.m({"scheduler"})
        private void k() {
            Requirements requirements = new Requirements(0);
            if (n(requirements)) {
                this.f64583d.cancel();
                this.f64586g = requirements;
            }
        }

        private void m() {
            if (this.f64582c) {
                try {
                    k1.o2(this.f64580a, u.t(this.f64580a, this.f64584e, u.f64559l));
                    return;
                } catch (IllegalStateException unused) {
                    androidx.media3.common.util.z.n(u.f64556g3, "Failed to restart (foreground launch restriction)");
                    return;
                }
            }
            try {
                this.f64580a.startService(u.t(this.f64580a, this.f64584e, u.f64558k));
            } catch (IllegalStateException unused2) {
                androidx.media3.common.util.z.n(u.f64556g3, "Failed to restart (process is idle)");
            }
        }

        private boolean n(Requirements requirements) {
            return !Objects.equals(this.f64586g, requirements);
        }

        private boolean o() {
            u uVar = this.f64585f;
            return uVar == null || uVar.x();
        }

        @Override // androidx.media3.exoplayer.offline.q.d
        public void a(q qVar, boolean z10) {
            if (z10 || qVar.i() || !o()) {
                return;
            }
            List<d> listG = qVar.g();
            for (int i10 = 0; i10 < listG.size(); i10++) {
                if (listG.get(i10).f64422b == 0) {
                    m();
                    return;
                }
            }
        }

        @Override // androidx.media3.exoplayer.offline.q.d
        public void b(q qVar, d dVar) {
            u uVar = this.f64585f;
            if (uVar != null) {
                uVar.A();
            }
        }

        @Override // androidx.media3.exoplayer.offline.q.d
        public void d(q qVar, Requirements requirements, int i10) {
            p();
        }

        @Override // androidx.media3.exoplayer.offline.q.d
        public void e(q qVar, d dVar, @p0 Exception exc) {
            u uVar = this.f64585f;
            if (uVar != null) {
                uVar.z(dVar);
            }
            if (o() && u.y(dVar.f64422b)) {
                androidx.media3.common.util.z.n(u.f64556g3, "DownloadService wasn't running. Restarting.");
                m();
            }
        }

        @Override // androidx.media3.exoplayer.offline.q.d
        public final void f(q qVar) {
            u uVar = this.f64585f;
            if (uVar != null) {
                uVar.C();
            }
        }

        @Override // androidx.media3.exoplayer.offline.q.d
        public void g(q qVar) {
            u uVar = this.f64585f;
            if (uVar != null) {
                uVar.B(qVar.g());
            }
        }

        public void j(final u uVar) {
            androidx.media3.common.util.a.i(this.f64585f == null);
            this.f64585f = uVar;
            if (this.f64581b.p()) {
                k1.J().postAtFrontOfQueue(new Runnable() { // from class: androidx.media3.exoplayer.offline.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        uVar.B(this.f64593a.f64581b.g());
                    }
                });
            }
        }

        public void l(u uVar) {
            androidx.media3.common.util.a.i(this.f64585f == uVar);
            this.f64585f = null;
        }

        public boolean p() {
            boolean zQ = this.f64581b.q();
            if (this.f64583d == null) {
                return !zQ;
            }
            if (!zQ) {
                k();
                return true;
            }
            Requirements requirementsM = this.f64581b.m();
            if (!this.f64583d.b(requirementsM).equals(requirementsM)) {
                k();
                return false;
            }
            if (!n(requirementsM)) {
                return true;
            }
            if (this.f64583d.a(requirementsM, this.f64580a.getPackageName(), u.f64559l)) {
                this.f64586g = requirementsM;
                return true;
            }
            androidx.media3.common.util.z.n(u.f64556g3, "Failed to schedule restart");
            k();
            return false;
        }

        private b(Context context, q qVar, boolean z10, @p0 androidx.media3.exoplayer.scheduler.e eVar, Class<? extends u> cls) {
            this.f64580a = context;
            this.f64581b = qVar;
            this.f64582c = z10;
            this.f64583d = eVar;
            this.f64584e = cls;
            qVar.e(this);
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f64587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f64588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f64589c = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f64590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f64591e;

        public c(int i10, long j10) {
            this.f64587a = i10;
            this.f64588b = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @e.a({"InlinedApi"})
        public void f() {
            q qVar = ((b) androidx.media3.common.util.a.g(u.this.f64574e)).f64581b;
            Notification notificationS = u.this.s(qVar.g(), qVar.l());
            if (this.f64591e) {
                ((NotificationManager) u.this.getSystemService("notification")).notify(this.f64587a, notificationS);
            } else {
                k1.e2(u.this, this.f64587a, notificationS, 1, "dataSync");
                this.f64591e = true;
            }
            if (this.f64590d) {
                this.f64589c.removeCallbacksAndMessages(null);
                this.f64589c.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.offline.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f64595a.f();
                    }
                }, this.f64588b);
            }
        }

        public void b() {
            if (this.f64591e) {
                f();
            }
        }

        public void c() {
            if (!this.f64591e) {
                f();
            }
        }

        public void d() {
            this.f64590d = true;
            f();
        }

        public void e() {
            this.f64590d = false;
            this.f64589c.removeCallbacksAndMessages(null);
        }
    }

    protected u(int i10) {
        this(i10, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        c cVar = this.f64570a;
        if (cVar != null) {
            cVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(List<d> list) {
        if (this.f64570a != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (y(list.get(i10).f64422b)) {
                    this.f64570a.d();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        c cVar = this.f64570a;
        if (cVar != null) {
            cVar.e();
        }
        if (((b) androidx.media3.common.util.a.g(this.f64574e)).p()) {
            if (k1.f61540a >= 28 || !this.f64577h) {
                this.f64578i |= stopSelfResult(this.f64575f);
            } else {
                stopSelf();
                this.f64578i = true;
            }
        }
    }

    public static void D(Context context, Class<? extends u> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        N(context, i(context, cls, downloadRequest, i10, z10), z10);
    }

    public static void E(Context context, Class<? extends u> cls, DownloadRequest downloadRequest, boolean z10) {
        N(context, j(context, cls, downloadRequest, z10), z10);
    }

    public static void F(Context context, Class<? extends u> cls, boolean z10) {
        N(context, k(context, cls, z10), z10);
    }

    public static void G(Context context, Class<? extends u> cls, boolean z10) {
        N(context, l(context, cls, z10), z10);
    }

    public static void H(Context context, Class<? extends u> cls, String str, boolean z10) {
        N(context, m(context, cls, str, z10), z10);
    }

    public static void I(Context context, Class<? extends u> cls, boolean z10) {
        N(context, n(context, cls, z10), z10);
    }

    public static void J(Context context, Class<? extends u> cls, Requirements requirements, boolean z10) {
        N(context, o(context, cls, requirements, z10), z10);
    }

    public static void K(Context context, Class<? extends u> cls, @p0 String str, int i10, boolean z10) {
        N(context, p(context, cls, str, i10, z10), z10);
    }

    public static void L(Context context, Class<? extends u> cls) {
        context.startService(t(context, cls, f64558k));
    }

    public static void M(Context context, Class<? extends u> cls) {
        k1.o2(context, u(context, cls, f64558k, true));
    }

    private static void N(Context context, Intent intent, boolean z10) {
        if (z10) {
            k1.o2(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent i(Context context, Class<? extends u> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        return u(context, cls, f64560m, z10).putExtra(X, downloadRequest).putExtra(Z, i10);
    }

    public static Intent j(Context context, Class<? extends u> cls, DownloadRequest downloadRequest, boolean z10) {
        return i(context, cls, downloadRequest, 0, z10);
    }

    public static Intent k(Context context, Class<? extends u> cls, boolean z10) {
        return u(context, cls, f64567t, z10);
    }

    public static Intent l(Context context, Class<? extends u> cls, boolean z10) {
        return u(context, cls, f64562o, z10);
    }

    public static Intent m(Context context, Class<? extends u> cls, String str, boolean z10) {
        return u(context, cls, f64561n, z10).putExtra(Y, str);
    }

    public static Intent n(Context context, Class<? extends u> cls, boolean z10) {
        return u(context, cls, f64566s, z10);
    }

    public static Intent o(Context context, Class<? extends u> cls, Requirements requirements, boolean z10) {
        return u(context, cls, f64569w, z10).putExtra(f64563p0, requirements);
    }

    public static Intent p(Context context, Class<? extends u> cls, @p0 String str, int i10, boolean z10) {
        return u(context, cls, f64568v, z10).putExtra(Y, str).putExtra(Z, i10);
    }

    public static void q() {
        f64557h3.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent t(Context context, Class<? extends u> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    private static Intent u(Context context, Class<? extends u> cls, String str, boolean z10) {
        return t(context, cls, str).putExtra(f64564p1, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x() {
        return this.f64578i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean y(int i10) {
        if (i10 != 2 && i10 != 5 && i10 != 7) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(d dVar) {
        if (this.f64570a != null) {
            if (y(dVar.f64422b)) {
                this.f64570a.d();
                return;
            }
            this.f64570a.b();
        }
    }

    @Override // android.app.Service
    @p0
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.f64571b;
        if (str != null) {
            l0.a(this, str, this.f64572c, this.f64573d, 2);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends u>, b> map = f64557h3;
        b bVar = map.get(cls);
        if (bVar == null) {
            boolean z10 = this.f64570a != null;
            androidx.media3.exoplayer.scheduler.e eVarV = (z10 && (k1.f61540a < 31)) ? v() : null;
            q qVarR = r();
            qVarR.C();
            b bVar2 = new b(getApplicationContext(), qVarR, z10, eVarV, cls);
            map.put((Class<? extends u>) cls, bVar2);
            bVar = bVar2;
        }
        this.f64574e = bVar;
        bVar.j(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f64579j = true;
        ((b) androidx.media3.common.util.a.g(this.f64574e)).l(this);
        c cVar = this.f64570a;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@p0 Intent intent, int i10, int i11) {
        String action;
        String stringExtra;
        c cVar;
        this.f64575f = i11;
        this.f64577h = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra(Y);
            this.f64576g |= intent.getBooleanExtra(f64564p1, false) || f64559l.equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = f64558k;
        }
        q qVar = ((b) androidx.media3.common.util.a.g(this.f64574e)).f64581b;
        switch (action) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) androidx.media3.common.util.a.g(intent)).hasExtra(Z)) {
                    androidx.media3.common.util.z.d(f64556g3, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    qVar.H(stringExtra, intent.getIntExtra(Z, 0));
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    qVar.A(stringExtra);
                    break;
                } else {
                    androidx.media3.common.util.z.d(f64556g3, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                qVar.C();
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                qVar.z();
                break;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                DownloadRequest downloadRequest = (DownloadRequest) ((Intent) androidx.media3.common.util.a.g(intent)).getParcelableExtra(X);
                if (downloadRequest != null) {
                    qVar.d(downloadRequest, intent.getIntExtra(Z, 0));
                    break;
                } else {
                    androidx.media3.common.util.z.d(f64556g3, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                Requirements requirements = (Requirements) ((Intent) androidx.media3.common.util.a.g(intent)).getParcelableExtra(f64563p0);
                if (requirements != null) {
                    qVar.G(requirements);
                    break;
                } else {
                    androidx.media3.common.util.z.d(f64556g3, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                qVar.x();
                break;
            default:
                androidx.media3.common.util.z.d(f64556g3, "Ignored unrecognized action: " + action);
                break;
        }
        if (k1.f61540a >= 26 && this.f64576g && (cVar = this.f64570a) != null) {
            cVar.c();
        }
        this.f64578i = false;
        if (qVar.o()) {
            C();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.f64577h = true;
    }

    protected abstract q r();

    protected abstract Notification s(List<d> list, int i10);

    @p0
    protected abstract androidx.media3.exoplayer.scheduler.e v();

    protected final void w() {
        c cVar = this.f64570a;
        if (cVar == null || this.f64579j) {
            return;
        }
        cVar.b();
    }

    protected u(int i10, long j10) {
        this(i10, j10, null, 0, 0);
    }

    protected u(int i10, long j10, @p0 String str, @f1 int i11, @f1 int i12) {
        if (i10 == 0) {
            this.f64570a = null;
            this.f64571b = null;
            this.f64572c = 0;
            this.f64573d = 0;
            return;
        }
        this.f64570a = new c(i10, j10);
        this.f64571b = str;
        this.f64572c = i11;
        this.f64573d = i12;
    }
}
