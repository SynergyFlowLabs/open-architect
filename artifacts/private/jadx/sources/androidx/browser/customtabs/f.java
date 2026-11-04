package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.collection.h3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f11910c = "android.support.customtabs.action.CustomTabsService";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f11911d = "androidx.browser.customtabs.category.NavBarColorCustomization";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f11912e = "androidx.browser.customtabs.category.ColorSchemeCustomization";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f11913f = "androidx.browser.trusted.category.TrustedWebActivities";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f11914g = "androidx.browser.trusted.category.WebShareTargetV2";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f11915h = "androidx.browser.trusted.category.ImmersiveMode";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f11916i = "android.support.customtabs.otherurls.URL";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f11917j = "androidx.browser.customtabs.SUCCESS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f11918k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f11919l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f11920m = -2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f11921n = -3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f11922o = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f11923s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f11924t = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final h3<IBinder, IBinder.DeathRecipient> f11925a = new h3<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.support.customtabs.b.AbstractBinderC0006b f11926b = new a();

    class a extends android.support.customtabs.b.AbstractBinderC0006b {
        a() {
        }

        @p0
        private PendingIntent n(@p0 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(androidx.browser.customtabs.d.f11874e);
            bundle.remove(androidx.browser.customtabs.d.f11874e);
            return pendingIntent;
        }

        private boolean p(@NonNull android.support.customtabs.a aVar, @p0 PendingIntent pendingIntent) {
            final i iVar = new i(aVar, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.e
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        f.this.a(iVar);
                    }
                };
                synchronized (f.this.f11925a) {
                    aVar.asBinder().linkToDeath(deathRecipient, 0);
                    f.this.f11925a.put(aVar.asBinder(), deathRecipient);
                }
                return f.this.d(iVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.customtabs.b
        public boolean K5(@p0 android.support.customtabs.a aVar, @p0 Uri uri, @p0 Bundle bundle, @p0 List<Bundle> list) {
            return f.this.c(new i(aVar, n(bundle)), uri, bundle, list);
        }

        @Override // android.support.customtabs.b
        public Bundle N9(@NonNull String str, @p0 Bundle bundle) {
            return f.this.b(str, bundle);
        }

        @Override // android.support.customtabs.b
        public boolean S6(long j10) {
            return f.this.j(j10);
        }

        @Override // android.support.customtabs.b
        public boolean Xa(@NonNull android.support.customtabs.a aVar, @NonNull Uri uri, @NonNull Bundle bundle) {
            return f.this.g(new i(aVar, n(bundle)), uri);
        }

        @Override // android.support.customtabs.b
        public boolean ab(@NonNull android.support.customtabs.a aVar, @p0 Bundle bundle) {
            return p(aVar, n(bundle));
        }

        @Override // android.support.customtabs.b
        public boolean f2(@NonNull android.support.customtabs.a aVar, int i10, @NonNull Uri uri, @p0 Bundle bundle) {
            return f.this.i(new i(aVar, n(bundle)), i10, uri, bundle);
        }

        @Override // android.support.customtabs.b
        public boolean o4(@NonNull android.support.customtabs.a aVar, @p0 Bundle bundle) {
            return f.this.h(new i(aVar, n(bundle)), bundle);
        }

        @Override // android.support.customtabs.b
        public boolean s2(@NonNull android.support.customtabs.a aVar, @NonNull Uri uri, int i10, @p0 Bundle bundle) {
            return f.this.f(new i(aVar, n(bundle)), uri, i10, bundle);
        }

        @Override // android.support.customtabs.b
        public int s7(@NonNull android.support.customtabs.a aVar, @NonNull String str, @p0 Bundle bundle) {
            return f.this.e(new i(aVar, n(bundle)), str, bundle);
        }

        @Override // android.support.customtabs.b
        public boolean y7(@NonNull android.support.customtabs.a aVar) {
            return p(aVar, null);
        }

        @Override // android.support.customtabs.b
        public boolean ze(@NonNull android.support.customtabs.a aVar, @NonNull Uri uri) {
            return f.this.g(new i(aVar, null), uri);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(@NonNull i iVar) {
        try {
            synchronized (this.f11925a) {
                try {
                    IBinder iBinderC = iVar.c();
                    if (iBinderC == null) {
                        return false;
                    }
                    iBinderC.unlinkToDeath(this.f11925a.get(iBinderC), 0);
                    this.f11925a.remove(iBinderC);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    @p0
    protected abstract Bundle b(@NonNull String str, @p0 Bundle bundle);

    protected abstract boolean c(@NonNull i iVar, @p0 Uri uri, @p0 Bundle bundle, @p0 List<Bundle> list);

    protected abstract boolean d(@NonNull i iVar);

    protected abstract int e(@NonNull i iVar, @NonNull String str, @p0 Bundle bundle);

    protected abstract boolean f(@NonNull i iVar, @NonNull Uri uri, int i10, @p0 Bundle bundle);

    protected abstract boolean g(@NonNull i iVar, @NonNull Uri uri);

    protected abstract boolean h(@NonNull i iVar, @p0 Bundle bundle);

    protected abstract boolean i(@NonNull i iVar, int i10, @NonNull Uri uri, @p0 Bundle bundle);

    protected abstract boolean j(long j10);

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@p0 Intent intent) {
        return this.f11926b;
    }
}
