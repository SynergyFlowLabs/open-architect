package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f11938d = "CustomTabsSessionToken";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    final android.support.customtabs.a f11939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final PendingIntent f11940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final androidx.browser.customtabs.b f11941c;

    class a extends androidx.browser.customtabs.b {
        a() {
        }

        @Override // androidx.browser.customtabs.b
        public void a(@NonNull String str, @p0 Bundle bundle) {
            try {
                i.this.f11939a.fb(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.b
        @NonNull
        public Bundle b(@NonNull String str, @p0 Bundle bundle) {
            try {
                return i.this.f11939a.R2(str, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // androidx.browser.customtabs.b
        public void c(int i10, int i11, @NonNull Bundle bundle) {
            try {
                i.this.f11939a.o7(i10, i11, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.b
        public void d(@p0 Bundle bundle) {
            try {
                i.this.f11939a.af(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.b
        public void e(int i10, @p0 Bundle bundle) {
            try {
                i.this.f11939a.N7(i10, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.b
        public void f(@NonNull String str, @p0 Bundle bundle) {
            try {
                i.this.f11939a.l1(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.b
        public void g(int i10, @NonNull Uri uri, boolean z10, @p0 Bundle bundle) {
            try {
                i.this.f11939a.ef(i10, uri, z10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    static class b extends android.support.customtabs.a.b {
        b() {
        }

        @Override // android.support.customtabs.a
        public void N7(int i10, Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public Bundle R2(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.a
        public void af(Bundle bundle) {
        }

        @Override // android.support.customtabs.a.b, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.a
        public void ef(int i10, Uri uri, boolean z10, Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void fb(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void l1(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.a
        public void o7(int i10, int i11, Bundle bundle) {
        }
    }

    i(@p0 android.support.customtabs.a aVar, @p0 PendingIntent pendingIntent) {
        a aVar2;
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f11939a = aVar;
        this.f11940b = pendingIntent;
        if (aVar == null) {
            aVar2 = null;
            int i10 = 6 << 0;
        } else {
            aVar2 = new a();
        }
        this.f11941c = aVar2;
    }

    @NonNull
    public static i a() {
        return new i(new b(), null);
    }

    private IBinder d() {
        android.support.customtabs.a aVar = this.f11939a;
        if (aVar != null) {
            return aVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    @p0
    public static i f(@NonNull Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        IBinder iBinderA = androidx.core.app.l.a(extras, d.f11872d);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(d.f11874e);
        if (iBinderA == null && pendingIntent == null) {
            return null;
        }
        return new i(iBinderA != null ? android.support.customtabs.a.b.i(iBinderA) : null, pendingIntent);
    }

    @p0
    public androidx.browser.customtabs.b b() {
        return this.f11941c;
    }

    @p0
    IBinder c() {
        android.support.customtabs.a aVar = this.f11939a;
        if (aVar == null) {
            return null;
        }
        return aVar.asBinder();
    }

    @p0
    PendingIntent e() {
        return this.f11940b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        PendingIntent pendingIntentE = iVar.e();
        PendingIntent pendingIntent = this.f11940b;
        if ((pendingIntent == null) != (pendingIntentE == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(pendingIntentE) : d().equals(iVar.d());
    }

    @b1({b1.a.LIBRARY})
    public boolean g() {
        return this.f11939a != null;
    }

    @b1({b1.a.LIBRARY})
    public boolean h() {
        return this.f11940b != null;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f11940b;
        return pendingIntent != null ? pendingIntent.hashCode() : d().hashCode();
    }

    public boolean i(@NonNull h hVar) {
        return hVar.d().equals(this.f11939a);
    }
}
