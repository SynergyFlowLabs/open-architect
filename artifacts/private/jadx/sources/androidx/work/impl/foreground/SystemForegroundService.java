package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.a1;
import androidx.annotation.b1;
import androidx.annotation.l0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.lifecycle.u0;
import androidx.work.v;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class SystemForegroundService extends u0 implements androidx.work.impl.foreground.b.InterfaceC0782b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f76835f = v.i("SystemFgService");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private static SystemForegroundService f76836g = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f76837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f76838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.work.impl.foreground.b f76839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    NotificationManager f76840e;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f76841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f76842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f76843c;

        a(final int val$notificationId, final Notification val$notification, final int val$notificationType) {
            this.f76841a = val$notificationId;
            this.f76842b = val$notification;
            this.f76843c = val$notificationType;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 31) {
                e.a(SystemForegroundService.this, this.f76841a, this.f76842b, this.f76843c);
            } else {
                d.a(SystemForegroundService.this, this.f76841a, this.f76842b, this.f76843c);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f76845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f76846b;

        b(final int val$notificationId, final Notification val$notification) {
            this.f76845a = val$notificationId;
            this.f76846b = val$notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f76840e.notify(this.f76845a, this.f76846b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f76848a;

        c(final int val$notificationId) {
            this.f76848a = val$notificationId;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f76840e.cancel(this.f76848a);
        }
    }

    @w0(29)
    static class d {
        private d() {
        }

        @u
        static void a(Service service, int id2, Notification notification, int foregroundServiceType) {
            service.startForeground(id2, notification, foregroundServiceType);
        }
    }

    @w0(31)
    static class e {
        private e() {
        }

        @u
        static void a(Service service, int id2, Notification notification, int foregroundServiceType) {
            try {
                service.startForeground(id2, notification, foregroundServiceType);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                v.e().m(SystemForegroundService.f76835f, "Unable to start foreground service", e10);
            } catch (SecurityException e11) {
                v.e().m(SystemForegroundService.f76835f, "Unable to start foreground service", e11);
            }
        }
    }

    @p0
    public static SystemForegroundService f() {
        return f76836g;
    }

    @l0
    private void g() {
        this.f76837b = new Handler(Looper.getMainLooper());
        this.f76840e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.b bVar = new androidx.work.impl.foreground.b(getApplicationContext());
        this.f76839d = bVar;
        bVar.o(this);
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0782b
    @a1("android.permission.POST_NOTIFICATIONS")
    public void a(final int notificationId, @NonNull final Notification notification) {
        this.f76837b.post(new b(notificationId, notification));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0782b
    public void c(final int notificationId, final int notificationType, @NonNull final Notification notification) {
        this.f76837b.post(new a(notificationId, notification, notificationType));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0782b
    public void d(final int notificationId) {
        this.f76837b.post(new c(notificationId));
    }

    @Override // androidx.lifecycle.u0, android.app.Service
    public void onCreate() {
        super.onCreate();
        f76836g = this;
        g();
    }

    @Override // androidx.lifecycle.u0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f76839d.m();
    }

    @Override // androidx.lifecycle.u0, android.app.Service
    public int onStartCommand(@p0 Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.f76838c) {
            v.e().f(f76835f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f76839d.m();
            g();
            this.f76838c = false;
        }
        if (intent != null) {
            this.f76839d.n(intent);
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0782b
    @l0
    public void stop() {
        this.f76838c = true;
        v.e().a(f76835f, "All commands completed.");
        stopForeground(true);
        f76836g = null;
        stopSelf();
    }
}
