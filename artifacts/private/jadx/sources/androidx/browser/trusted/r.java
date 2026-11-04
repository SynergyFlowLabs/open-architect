package androidx.browser.trusted;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f12012c = "android.support.customtabs.trusted.PLATFORM_TAG";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f12013d = "android.support.customtabs.trusted.PLATFORM_ID";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f12014e = "android.support.customtabs.trusted.NOTIFICATION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f12015f = "android.support.customtabs.trusted.CHANNEL_NAME";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f12016g = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f12017h = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.support.customtabs.trusted.b f12018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f12019b;

    class a extends android.support.customtabs.trusted.a.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f12020b;

        a(l lVar) {
            this.f12020b = lVar;
        }

        @Override // android.support.customtabs.trusted.a
        public void Ye(String str, Bundle bundle) throws RemoteException {
            this.f12020b.a(str, bundle);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable[] f12021a;

        b(Parcelable[] parcelableArr) {
            this.f12021a = parcelableArr;
        }

        public static b a(Bundle bundle) {
            r.c(bundle, r.f12016g);
            return new b(bundle.getParcelableArray(r.f12016g));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(r.f12016g, this.f12021a);
            return bundle;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12023b;

        c(String str, int i10) {
            this.f12022a = str;
            this.f12023b = i10;
        }

        public static c a(Bundle bundle) {
            r.c(bundle, r.f12012c);
            r.c(bundle, r.f12013d);
            return new c(bundle.getString(r.f12012c), bundle.getInt(r.f12013d));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(r.f12012c, this.f12022a);
            bundle.putInt(r.f12013d, this.f12023b);
            return bundle;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12024a;

        d(String str) {
            this.f12024a = str;
        }

        public static d a(Bundle bundle) {
            r.c(bundle, r.f12015f);
            return new d(bundle.getString(r.f12015f));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(r.f12015f, this.f12024a);
            return bundle;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Notification f12027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f12028d;

        e(String str, int i10, Notification notification, String str2) {
            this.f12025a = str;
            this.f12026b = i10;
            this.f12027c = notification;
            this.f12028d = str2;
        }

        public static e a(Bundle bundle) {
            r.c(bundle, r.f12012c);
            r.c(bundle, r.f12013d);
            r.c(bundle, r.f12014e);
            r.c(bundle, r.f12015f);
            return new e(bundle.getString(r.f12012c), bundle.getInt(r.f12013d), (Notification) bundle.getParcelable(r.f12014e), bundle.getString(r.f12015f));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(r.f12012c, this.f12025a);
            bundle.putInt(r.f12013d, this.f12026b);
            bundle.putParcelable(r.f12014e, this.f12027c);
            bundle.putString(r.f12015f, this.f12028d);
            return bundle;
        }
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f12029a;

        f(boolean z10) {
            this.f12029a = z10;
        }

        public static f a(Bundle bundle) {
            r.c(bundle, r.f12017h);
            return new f(bundle.getBoolean(r.f12017h));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(r.f12017h, this.f12029a);
            return bundle;
        }
    }

    r(@NonNull android.support.customtabs.trusted.b bVar, @NonNull ComponentName componentName) {
        this.f12018a = bVar;
        this.f12019b = componentName;
    }

    static void c(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }

    @p0
    private static android.support.customtabs.trusted.a j(@p0 l lVar) {
        if (lVar != null) {
            return new a(lVar);
        }
        int i10 = 4 ^ 0;
        return null;
    }

    public boolean a(@NonNull String str) throws RemoteException {
        return f.a(this.f12018a.Od(new d(str).b())).f12029a;
    }

    public void b(@NonNull String str, int i10) throws RemoteException {
        this.f12018a.be(new c(str, i10).b());
    }

    @NonNull
    @w0(23)
    @b1({b1.a.LIBRARY})
    public Parcelable[] d() throws RemoteException {
        return b.a(this.f12018a.Ac()).f12021a;
    }

    @NonNull
    public ComponentName e() {
        return this.f12019b;
    }

    @p0
    public Bitmap f() throws RemoteException {
        return (Bitmap) this.f12018a.Oa().getParcelable(q.f12005f);
    }

    public int g() throws RemoteException {
        return this.f12018a.Id();
    }

    public boolean h(@NonNull String str, int i10, @NonNull Notification notification, @NonNull String str2) throws RemoteException {
        return f.a(this.f12018a.j4(new e(str, i10, notification, str2).b())).f12029a;
    }

    @p0
    public Bundle i(@NonNull String str, @NonNull Bundle bundle, @p0 l lVar) throws RemoteException {
        android.support.customtabs.trusted.a aVarJ = j(lVar);
        return this.f12018a.Y9(str, bundle, aVarJ == null ? null : aVarJ.asBinder());
    }
}
