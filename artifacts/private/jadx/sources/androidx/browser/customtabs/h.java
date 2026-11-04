package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f11930f = "CustomTabsSession";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11931a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.support.customtabs.b f11932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.support.customtabs.a f11933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ComponentName f11934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final PendingIntent f11935e;

    static class a extends android.support.customtabs.b.AbstractBinderC0006b {
        a() {
        }

        @Override // android.support.customtabs.b
        public boolean K5(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public Bundle N9(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.b
        public boolean S6(long j10) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean Xa(android.support.customtabs.a aVar, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean ab(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean f2(android.support.customtabs.a aVar, int i10, Uri uri, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean o4(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean s2(android.support.customtabs.a aVar, Uri uri, int i10, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public int s7(android.support.customtabs.a aVar, String str, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.b
        public boolean y7(android.support.customtabs.a aVar) throws RemoteException {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean ze(android.support.customtabs.a aVar, Uri uri) throws RemoteException {
            return false;
        }
    }

    @b1({b1.a.LIBRARY})
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final androidx.browser.customtabs.b f11936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final PendingIntent f11937b;

        b(@p0 androidx.browser.customtabs.b bVar, @p0 PendingIntent pendingIntent) {
            this.f11936a = bVar;
            this.f11937b = pendingIntent;
        }

        @p0
        androidx.browser.customtabs.b a() {
            return this.f11936a;
        }

        @p0
        PendingIntent b() {
            return this.f11937b;
        }
    }

    h(android.support.customtabs.b bVar, android.support.customtabs.a aVar, ComponentName componentName, @p0 PendingIntent pendingIntent) {
        this.f11932b = bVar;
        this.f11933c = aVar;
        this.f11934d = componentName;
        this.f11935e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f11935e;
        if (pendingIntent != null) {
            bundle.putParcelable(d.f11874e, pendingIntent);
        }
    }

    private Bundle b(@p0 Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    @NonNull
    @l1
    public static h c(@NonNull ComponentName componentName) {
        return new h(new a(), new i.b(), componentName, null);
    }

    IBinder d() {
        return this.f11933c.asBinder();
    }

    ComponentName e() {
        return this.f11934d;
    }

    @p0
    PendingIntent f() {
        return this.f11935e;
    }

    public boolean g(@p0 Uri uri, @p0 Bundle bundle, @p0 List<Bundle> list) {
        try {
            return this.f11932b.K5(this.f11933c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int h(@NonNull String str, @p0 Bundle bundle) {
        int iS7;
        Bundle bundleB = b(bundle);
        synchronized (this.f11931a) {
            try {
                try {
                    iS7 = this.f11932b.s7(this.f11933c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iS7;
    }

    public boolean i(@NonNull Uri uri, int i10, @p0 Bundle bundle) {
        try {
            return this.f11932b.s2(this.f11933c, uri, i10, b(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean j(@NonNull Uri uri) {
        try {
            if (this.f11935e == null) {
                return this.f11932b.ze(this.f11933c, uri);
            }
            int i10 = 1 << 0;
            return this.f11932b.Xa(this.f11933c, uri, b(null));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean k(@NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(d.f11890t, bitmap);
        bundle.putString(d.f11891u, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(d.f11887q, bundle);
        a(bundle);
        try {
            return this.f11932b.o4(this.f11933c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean l(@p0 RemoteViews remoteViews, @p0 int[] iArr, @p0 PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(d.G, remoteViews);
        bundle.putIntArray(d.H, iArr);
        bundle.putParcelable(d.I, pendingIntent);
        a(bundle);
        try {
            return this.f11932b.o4(this.f11933c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean m(int i10, @NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(d.f11868a0, i10);
        bundle.putParcelable(d.f11890t, bitmap);
        bundle.putString(d.f11891u, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(d.f11887q, bundle);
        a(bundle2);
        try {
            return this.f11932b.o4(this.f11933c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean n(int i10, @NonNull Uri uri, @p0 Bundle bundle) {
        if (i10 >= 1 && i10 <= 2) {
            try {
                return this.f11932b.f2(this.f11933c, i10, uri, b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
