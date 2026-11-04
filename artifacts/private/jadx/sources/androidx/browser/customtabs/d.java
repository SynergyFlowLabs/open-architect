package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    private static final int D = 2;
    public static final String E = "androidx.browser.customtabs.extra.SHARE_STATE";

    @Deprecated
    public static final String F = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String G = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String H = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String I = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String J = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String K = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String L = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";
    public static final String M = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final String N = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX";
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    private static final int R = 2;
    public static final String S = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR";
    public static final String T = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP";
    public static final int U = 0;
    public static final int V = 1;
    public static final int W = 2;
    private static final int X = 2;
    public static final String Y = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION";
    public static final String Z = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f11868a0 = "android.support.customtabs.customaction.ID";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f11869b0 = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f11870c = "android.support.customtabs.extra.user_opt_out";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f11871c0 = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f11872d = "android.support.customtabs.extra.SESSION";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f11873d0 = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f11874e = "android.support.customtabs.extra.SESSION_ID";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String f11875e0 = "Accept-Language";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f11876f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f11877g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f11878h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f11879i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f11880j = "androidx.browser.customtabs.extra.COLOR_SCHEME";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f11881k = "android.support.customtabs.extra.TOOLBAR_COLOR";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f11882l = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f11883m = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f11884n = "android.support.customtabs.extra.TITLE_VISIBILITY";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f11885o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f11886p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f11887q = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f11888r = "android.support.customtabs.extra.TOOLBAR_ITEMS";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f11889s = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f11890t = "android.support.customtabs.customaction.ICON";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f11891u = "android.support.customtabs.customaction.DESCRIPTION";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f11892v = "android.support.customtabs.customaction.PENDING_INTENT";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f11893w = "android.support.customtabs.extra.TINT_ACTION_BUTTON";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f11894x = "android.support.customtabs.extra.MENU_ITEMS";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f11895y = "android.support.customtabs.customaction.MENU_ITEM_TITLE";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f11896z = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Intent f11897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final Bundle f11898b;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface a {
    }

    @w0(api = 24)
    private static class b {
        private b() {
        }

        @u
        @p0
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.d$d, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface InterfaceC0043d {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface f {
    }

    d(@NonNull Intent intent, @p0 Bundle bundle) {
        this.f11897a = intent;
        this.f11898b = bundle;
    }

    public static int a(@NonNull Intent intent) {
        return intent.getIntExtra(S, 0);
    }

    public static int b(@NonNull Intent intent) {
        return intent.getIntExtra(Y, 0);
    }

    @NonNull
    public static androidx.browser.customtabs.a c(@NonNull Intent intent, int i10) {
        Bundle bundle;
        if (i10 < 0 || i10 > 2 || i10 == 0) {
            throw new IllegalArgumentException("Invalid colorScheme: " + i10);
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return androidx.browser.customtabs.a.a(null);
        }
        androidx.browser.customtabs.a aVarA = androidx.browser.customtabs.a.a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray(L);
        return (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i10)) == null) ? aVarA : androidx.browser.customtabs.a.a(bundle).c(aVarA);
    }

    @r(unit = 1)
    public static int d(@NonNull Intent intent) {
        return intent.getIntExtra(N, 0);
    }

    public static int e() {
        return 5;
    }

    @r(unit = 0)
    public static int f(@NonNull Intent intent) {
        return intent.getIntExtra(T, 16);
    }

    @NonNull
    public static Intent h(@p0 Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(f11870c, true);
        return intent;
    }

    public static boolean i(@NonNull Intent intent) {
        return intent.getBooleanExtra(f11870c, false) && (intent.getFlags() & 268435456) != 0;
    }

    public void g(@NonNull Context context, @NonNull Uri uri) {
        this.f11897a.setData(uri);
        androidx.core.content.d.A(context, this.f11897a, this.f11898b);
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private ArrayList<Bundle> f11901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private Bundle f11902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private ArrayList<Bundle> f11903e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private SparseArray<Bundle> f11904f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private Bundle f11905g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f11899a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.browser.customtabs.a.C0040a f11900b = new androidx.browser.customtabs.a.C0040a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f11906h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f11907i = true;

        public c() {
        }

        @w0(api = 24)
        private void l() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f11899a.hasExtra("com.android.browser.headers") ? this.f11899a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f11899a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void y(@p0 IBinder iBinder, @p0 PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            androidx.core.app.l.b(bundle, d.f11872d, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(d.f11874e, pendingIntent);
            }
            this.f11899a.putExtras(bundle);
        }

        @NonNull
        public c A(boolean z10) {
            this.f11899a.putExtra(d.f11884n, z10 ? 1 : 0);
            return this;
        }

        @NonNull
        public c B(@NonNull Context context, @androidx.annotation.a int i10, @androidx.annotation.a int i11) {
            this.f11902d = androidx.core.app.e.d(context, i10, i11).n();
            return this;
        }

        @NonNull
        @Deprecated
        public c C(@androidx.annotation.l int i10) {
            this.f11900b.e(i10);
            return this;
        }

        @NonNull
        public c D(@r(unit = 0) int i10) {
            if (i10 < 0 || i10 > 16) {
                throw new IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
            }
            this.f11899a.putExtra(d.T, i10);
            return this;
        }

        @NonNull
        public c E(boolean z10) {
            this.f11899a.putExtra(d.f11882l, z10);
            return this;
        }

        @NonNull
        @Deprecated
        public c a() {
            z(1);
            return this;
        }

        @NonNull
        public c b(@NonNull String str, @NonNull PendingIntent pendingIntent) {
            if (this.f11901c == null) {
                this.f11901c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString(d.f11895y, str);
            bundle.putParcelable(d.f11892v, pendingIntent);
            this.f11901c.add(bundle);
            return this;
        }

        @NonNull
        @Deprecated
        public c c(int i10, @NonNull Bitmap bitmap, @NonNull String str, @NonNull PendingIntent pendingIntent) throws IllegalStateException {
            if (this.f11903e == null) {
                this.f11903e = new ArrayList<>();
            }
            if (this.f11903e.size() >= 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            Bundle bundle = new Bundle();
            bundle.putInt(d.f11868a0, i10);
            bundle.putParcelable(d.f11890t, bitmap);
            bundle.putString(d.f11891u, str);
            bundle.putParcelable(d.f11892v, pendingIntent);
            this.f11903e.add(bundle);
            return this;
        }

        @NonNull
        public d d() {
            if (!this.f11899a.hasExtra(d.f11872d)) {
                y(null, null);
            }
            ArrayList<Bundle> arrayList = this.f11901c;
            if (arrayList != null) {
                this.f11899a.putParcelableArrayListExtra(d.f11894x, arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f11903e;
            if (arrayList2 != null) {
                this.f11899a.putParcelableArrayListExtra(d.f11888r, arrayList2);
            }
            this.f11899a.putExtra(d.K, this.f11907i);
            this.f11899a.putExtras(this.f11900b.a().b());
            Bundle bundle = this.f11905g;
            if (bundle != null) {
                this.f11899a.putExtras(bundle);
            }
            if (this.f11904f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray(d.L, this.f11904f);
                this.f11899a.putExtras(bundle2);
            }
            this.f11899a.putExtra(d.E, this.f11906h);
            l();
            return new d(this.f11899a, this.f11902d);
        }

        @NonNull
        @Deprecated
        public c e() {
            this.f11899a.putExtra(d.f11882l, true);
            return this;
        }

        @NonNull
        public c f(@NonNull Bitmap bitmap, @NonNull String str, @NonNull PendingIntent pendingIntent) {
            return g(bitmap, str, pendingIntent, false);
        }

        @NonNull
        public c g(@NonNull Bitmap bitmap, @NonNull String str, @NonNull PendingIntent pendingIntent, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putInt(d.f11868a0, 0);
            bundle.putParcelable(d.f11890t, bitmap);
            bundle.putString(d.f11891u, str);
            bundle.putParcelable(d.f11892v, pendingIntent);
            this.f11899a.putExtra(d.f11887q, bundle);
            this.f11899a.putExtra(d.f11893w, z10);
            return this;
        }

        @NonNull
        public c h(@NonNull Bitmap bitmap) {
            this.f11899a.putExtra(d.f11883m, bitmap);
            return this;
        }

        @NonNull
        public c i(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f11899a.putExtra(d.Y, i10);
            return this;
        }

        @NonNull
        public c j(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            this.f11899a.putExtra(d.f11880j, i10);
            return this;
        }

        @NonNull
        public c k(int i10, @NonNull androidx.browser.customtabs.a aVar) {
            if (i10 < 0 || i10 > 2 || i10 == 0) {
                throw new IllegalArgumentException("Invalid colorScheme: " + i10);
            }
            if (this.f11904f == null) {
                this.f11904f = new SparseArray<>();
            }
            this.f11904f.put(i10, aVar.b());
            return this;
        }

        @NonNull
        public c m(@NonNull androidx.browser.customtabs.a aVar) {
            this.f11905g = aVar.b();
            return this;
        }

        @NonNull
        @Deprecated
        public c n(boolean z10) {
            if (z10) {
                z(1);
                return this;
            }
            z(2);
            return this;
        }

        @NonNull
        public c o(@NonNull Context context, @androidx.annotation.a int i10, @androidx.annotation.a int i11) {
            this.f11899a.putExtra(d.f11896z, androidx.core.app.e.d(context, i10, i11).n());
            return this;
        }

        @NonNull
        public c p(@r(unit = 1) int i10) {
            return q(i10, 0);
        }

        @NonNull
        public c q(@r(unit = 1) int i10, int i11) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f11899a.putExtra(d.N, i10);
            this.f11899a.putExtra(d.S, i11);
            return this;
        }

        @NonNull
        public c r(boolean z10) {
            this.f11907i = z10;
            return this;
        }

        @NonNull
        @Deprecated
        public c s(@androidx.annotation.l int i10) {
            this.f11900b.b(i10);
            return this;
        }

        @NonNull
        @Deprecated
        public c t(@androidx.annotation.l int i10) {
            this.f11900b.c(i10);
            return this;
        }

        @NonNull
        @b1({b1.a.LIBRARY})
        public c u(@NonNull h.b bVar) {
            y(null, bVar.b());
            return this;
        }

        @NonNull
        @Deprecated
        public c v(@androidx.annotation.l int i10) {
            this.f11900b.d(i10);
            return this;
        }

        @NonNull
        public c w(@NonNull RemoteViews remoteViews, @p0 int[] iArr, @p0 PendingIntent pendingIntent) {
            this.f11899a.putExtra(d.G, remoteViews);
            this.f11899a.putExtra(d.H, iArr);
            this.f11899a.putExtra(d.I, pendingIntent);
            return this;
        }

        @NonNull
        public c x(@NonNull h hVar) {
            this.f11899a.setPackage(hVar.e().getPackageName());
            y(hVar.d(), hVar.f());
            return this;
        }

        @NonNull
        public c z(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f11906h = i10;
            if (i10 == 1) {
                this.f11899a.putExtra(d.F, true);
                return this;
            }
            if (i10 == 2) {
                this.f11899a.putExtra(d.F, false);
                return this;
            }
            this.f11899a.removeExtra(d.F);
            return this;
        }

        public c(@p0 h hVar) {
            if (hVar != null) {
                x(hVar);
            }
        }
    }
}
