package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.a1;
import androidx.annotation.b1;
import androidx.annotation.l0;
import androidx.annotation.p0;
import androidx.core.app.c0;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends Service {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e.a({"ActionValue", "ServiceName"})
    public static final String f12003d = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f12004e = "android.support.customtabs.trusted.SMALL_ICON";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f12005f = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f12006g = "androidx.browser.trusted.SUCCESS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f12007h = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NotificationManager f12008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f12009b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.support.customtabs.trusted.b.AbstractBinderC0010b f12010c = new a();

    class a extends android.support.customtabs.trusted.b.AbstractBinderC0010b {
        a() {
        }

        private void k() {
            q qVar = q.this;
            if (qVar.f12009b == -1) {
                String[] packagesForUid = qVar.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                h hVarA = q.this.c().a();
                PackageManager packageManager = q.this.getPackageManager();
                if (hVarA != null) {
                    for (String str : packagesForUid) {
                        if (hVarA.c(str, packageManager)) {
                            q.this.f12009b = Binder.getCallingUid();
                            break;
                        }
                    }
                }
            }
            if (q.this.f12009b != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle Ac() {
            k();
            return new r.b(q.this.g()).b();
        }

        @Override // android.support.customtabs.trusted.b
        public int Id() {
            k();
            return q.this.i();
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle Oa() {
            k();
            return q.this.h();
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle Od(Bundle bundle) {
            k();
            return new r.f(q.this.d(r.d.a(bundle).f12024a)).b();
        }

        @Override // android.support.customtabs.trusted.b
        public Bundle Y9(String str, Bundle bundle, IBinder iBinder) {
            k();
            return q.this.f(str, bundle, m.a(iBinder));
        }

        @Override // android.support.customtabs.trusted.b
        public void be(Bundle bundle) {
            k();
            r.c cVarA = r.c.a(bundle);
            q.this.e(cVarA.f12022a, cVarA.f12023b);
        }

        @Override // android.support.customtabs.trusted.b
        @a1("android.permission.POST_NOTIFICATIONS")
        public Bundle j4(Bundle bundle) {
            k();
            r.e eVarA = r.e.a(bundle);
            return new r.f(q.this.j(eVarA.f12025a, eVarA.f12026b, eVarA.f12027c, eVarA.f12028d)).b();
        }
    }

    private static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    private void b() {
        if (this.f12008a == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    @NonNull
    @androidx.annotation.g
    public abstract k c();

    @androidx.annotation.g
    public boolean d(@NonNull String str) {
        b();
        if (c0.q(this).a()) {
            return e.b(this.f12008a, a(str));
        }
        boolean z10 = false | false;
        return false;
    }

    @androidx.annotation.g
    public void e(@NonNull String str, int i10) {
        b();
        this.f12008a.cancel(str, i10);
    }

    @androidx.annotation.g
    @p0
    public Bundle f(@NonNull String str, @NonNull Bundle bundle, @p0 m mVar) {
        return null;
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    @androidx.annotation.g
    public Parcelable[] g() {
        b();
        return d.a(this.f12008a);
    }

    @NonNull
    @androidx.annotation.g
    public Bundle h() {
        int i10 = i();
        Bundle bundle = new Bundle();
        if (i10 == -1) {
            return bundle;
        }
        bundle.putParcelable(f12005f, BitmapFactory.decodeResource(getResources(), i10));
        return bundle;
    }

    @androidx.annotation.g
    public int i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(f12004e, -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @a1("android.permission.POST_NOTIFICATIONS")
    @androidx.annotation.g
    public boolean j(@NonNull String str, int i10, @NonNull Notification notification, @NonNull String str2) {
        b();
        if (!c0.q(this).a()) {
            return false;
        }
        String strA = a(str2);
        Notification notificationA = e.a(this, this.f12008a, notification, strA, str2);
        if (!e.b(this.f12008a, strA)) {
            return false;
        }
        this.f12008a.notify(str, i10, notificationA);
        return true;
    }

    @Override // android.app.Service
    @l0
    @p0
    public final IBinder onBind(@p0 Intent intent) {
        return this.f12010c;
    }

    @Override // android.app.Service
    @androidx.annotation.i
    @l0
    public void onCreate() {
        super.onCreate();
        this.f12008a = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    @l0
    public final boolean onUnbind(@p0 Intent intent) {
        this.f12009b = -1;
        return super.onUnbind(intent);
    }
}
