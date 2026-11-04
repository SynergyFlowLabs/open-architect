package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f11840d = "CustomTabsClient";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.support.customtabs.b f11841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f11842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f11843c;

    class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f11844b;

        a(Context context) {
            this.f11844b = context;
        }

        @Override // androidx.browser.customtabs.g
        public final void b(@NonNull ComponentName componentName, @NonNull c cVar) {
            cVar.n(0L);
            this.f11844b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    class b extends android.support.customtabs.a.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f11845h = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f11846i;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f11848a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f11849b;

            a(int i10, Bundle bundle) {
                this.f11848a = i10;
                this.f11849b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f11846i.e(this.f11848a, this.f11849b);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$b$b, reason: collision with other inner class name */
        class RunnableC0041b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f11851a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f11852b;

            RunnableC0041b(String str, Bundle bundle) {
                this.f11851a = str;
                this.f11852b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f11846i.a(this.f11851a, this.f11852b);
            }
        }

        /* JADX INFO: renamed from: androidx.browser.customtabs.c$b$c, reason: collision with other inner class name */
        class RunnableC0042c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f11854a;

            RunnableC0042c(Bundle bundle) {
                this.f11854a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f11846i.d(this.f11854a);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f11856a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f11857b;

            d(String str, Bundle bundle) {
                this.f11856a = str;
                this.f11857b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f11846i.f(this.f11856a, this.f11857b);
            }
        }

        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f11859a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f11860b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f11861c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f11862d;

            e(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f11859a = i10;
                this.f11860b = uri;
                this.f11861c = z10;
                this.f11862d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f11846i.g(this.f11859a, this.f11860b, this.f11861c, this.f11862d);
            }
        }

        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f11864a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f11865b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f11866c;

            f(int i10, int i11, Bundle bundle) {
                this.f11864a = i10;
                this.f11865b = i11;
                this.f11866c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f11846i.c(this.f11864a, this.f11865b, this.f11866c);
            }
        }

        b(androidx.browser.customtabs.b bVar) {
            this.f11846i = bVar;
        }

        @Override // android.support.customtabs.a
        public void N7(int i10, Bundle bundle) {
            if (this.f11846i == null) {
                return;
            }
            this.f11845h.post(new a(i10, bundle));
        }

        @Override // android.support.customtabs.a
        public Bundle R2(@NonNull String str, @p0 Bundle bundle) throws RemoteException {
            androidx.browser.customtabs.b bVar = this.f11846i;
            if (bVar == null) {
                return null;
            }
            return bVar.b(str, bundle);
        }

        @Override // android.support.customtabs.a
        public void af(Bundle bundle) throws RemoteException {
            if (this.f11846i == null) {
                return;
            }
            this.f11845h.post(new RunnableC0042c(bundle));
        }

        @Override // android.support.customtabs.a
        public void ef(int i10, Uri uri, boolean z10, @p0 Bundle bundle) throws RemoteException {
            if (this.f11846i == null) {
                return;
            }
            this.f11845h.post(new e(i10, uri, z10, bundle));
        }

        @Override // android.support.customtabs.a
        public void fb(String str, Bundle bundle) throws RemoteException {
            if (this.f11846i == null) {
                return;
            }
            this.f11845h.post(new RunnableC0041b(str, bundle));
        }

        @Override // android.support.customtabs.a
        public void l1(String str, Bundle bundle) throws RemoteException {
            if (this.f11846i == null) {
                return;
            }
            this.f11845h.post(new d(str, bundle));
        }

        @Override // android.support.customtabs.a
        public void o7(int i10, int i11, @p0 Bundle bundle) throws RemoteException {
            if (this.f11846i == null) {
                return;
            }
            this.f11845h.post(new f(i10, i11, bundle));
        }
    }

    c(android.support.customtabs.b bVar, ComponentName componentName, Context context) {
        this.f11841a = bVar;
        this.f11842b = componentName;
        this.f11843c = context;
    }

    public static boolean b(@NonNull Context context, @p0 String str, @NonNull g gVar) {
        gVar.c(context.getApplicationContext());
        Intent intent = new Intent(f.f11910c);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, gVar, 33);
    }

    public static boolean c(@NonNull Context context, @p0 String str, @NonNull g gVar) {
        gVar.c(context.getApplicationContext());
        Intent intent = new Intent(f.f11910c);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, gVar, 1);
    }

    public static boolean d(@NonNull Context context, @NonNull String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return b(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    private android.support.customtabs.a.b e(@p0 androidx.browser.customtabs.b bVar) {
        return new b(bVar);
    }

    private static PendingIntent f(Context context, int i10) {
        return PendingIntent.getActivity(context, i10, new Intent(), 67108864);
    }

    @p0
    public static String h(@NonNull Context context, @p0 List<String> list) {
        return i(context, list, false);
    }

    @p0
    public static String i(@NonNull Context context, @p0 List<String> list, boolean z10) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(f.f11910c);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    public static h.b j(@NonNull Context context, @p0 androidx.browser.customtabs.b bVar, int i10) {
        return new h.b(bVar, f(context, i10));
    }

    @p0
    private h m(@p0 androidx.browser.customtabs.b bVar, @p0 PendingIntent pendingIntent) {
        boolean zY7;
        android.support.customtabs.a.b bVarE = e(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(d.f11874e, pendingIntent);
                zY7 = this.f11841a.ab(bVarE, bundle);
            } else {
                zY7 = this.f11841a.y7(bVarE);
            }
            if (zY7) {
                return new h(this.f11841a, bVarE, this.f11842b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    @b1({b1.a.LIBRARY})
    @p0
    public h a(@NonNull h.b bVar) {
        return m(bVar.a(), bVar.b());
    }

    @p0
    public Bundle g(@NonNull String str, @p0 Bundle bundle) {
        try {
            return this.f11841a.N9(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @p0
    public h k(@p0 androidx.browser.customtabs.b bVar) {
        return m(bVar, null);
    }

    @p0
    public h l(@p0 androidx.browser.customtabs.b bVar, int i10) {
        return m(bVar, f(this.f11843c, i10));
    }

    public boolean n(long j10) {
        try {
            return this.f11841a.S6(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
