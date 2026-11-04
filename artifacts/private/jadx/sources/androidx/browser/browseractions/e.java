package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f11771b = "BrowserActions";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f11772c = "https://www.example.com";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f11773d = "androidx.browser.browseractions.APP_ID";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f11774e = "androidx.browser.browseractions.browser_action_open";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f11775f = "androidx.browser.browseractions.ICON_ID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f11776g = "androidx.browser.browseractions.ICON_URI";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f11777h = "androidx.browser.browseractions.TITLE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f11778i = "androidx.browser.browseractions.ACTION";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f11779j = "androidx.browser.browseractions.extra.TYPE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f11780k = "androidx.browser.browseractions.extra.MENU_ITEMS";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f11781l = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @e.a({"MinMaxConstant"})
    public static final int f11782m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f11783n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f11784o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f11785p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f11786q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f11787r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f11788s = 5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f11789t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f11790u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f11791v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f11792w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f11793x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f11794y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @p0
    private static a f11795z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Intent f11796a;

    @l1
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    interface a {
        void a();
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f11798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Uri f11799c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f11797a = new Intent(e.f11774e);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11800d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList<Bundle> f11801e = new ArrayList<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private PendingIntent f11802f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<Uri> f11803g = new ArrayList();

        public d(@NonNull Context context, @NonNull Uri uri) {
            this.f11798b = context;
            this.f11799c = uri;
        }

        @NonNull
        private Bundle b(@NonNull androidx.browser.browseractions.a aVar) {
            Bundle bundle = new Bundle();
            bundle.putString(e.f11777h, aVar.e());
            bundle.putParcelable(e.f11778i, aVar.a());
            if (aVar.b() != 0) {
                bundle.putInt(e.f11775f, aVar.b());
            }
            if (aVar.c() != null) {
                bundle.putParcelable(e.f11776g, aVar.c());
            }
            return bundle;
        }

        @NonNull
        public e a() {
            this.f11797a.setData(this.f11799c);
            this.f11797a.putExtra(e.f11779j, this.f11800d);
            this.f11797a.putParcelableArrayListExtra(e.f11780k, this.f11801e);
            this.f11797a.putExtra(e.f11773d, PendingIntent.getActivity(this.f11798b, 0, new Intent(), 67108864));
            PendingIntent pendingIntent = this.f11802f;
            if (pendingIntent != null) {
                this.f11797a.putExtra(e.f11781l, pendingIntent);
            }
            f.j(this.f11797a, this.f11803g, this.f11798b);
            return new e(this.f11797a);
        }

        @NonNull
        public d c(@NonNull ArrayList<androidx.browser.browseractions.a> arrayList) {
            if (arrayList.size() > 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (TextUtils.isEmpty(arrayList.get(i10).e()) || arrayList.get(i10).a() == null) {
                    throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                }
                this.f11801e.add(b(arrayList.get(i10)));
                if (arrayList.get(i10).c() != null) {
                    this.f11803g.add(arrayList.get(i10).c());
                }
            }
            return this;
        }

        @NonNull
        public d d(@NonNull androidx.browser.browseractions.a... aVarArr) {
            return c(new ArrayList<>(Arrays.asList(aVarArr)));
        }

        @NonNull
        public d e(@NonNull PendingIntent pendingIntent) {
            this.f11802f = pendingIntent;
            return this;
        }

        @NonNull
        public d f(int i10) {
            this.f11800d = i10;
            return this;
        }
    }

    e(@NonNull Intent intent) {
        this.f11796a = intent;
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    public static List<ResolveInfo> a(@NonNull Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(f11774e, Uri.parse(f11772c)), 131072);
    }

    @p0
    @Deprecated
    public static String b(@NonNull Intent intent) {
        return d(intent);
    }

    @p0
    public static String d(@NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(f11773d);
        if (pendingIntent != null) {
            return pendingIntent.getTargetPackage();
        }
        return null;
    }

    public static void e(@NonNull Context context, @NonNull Intent intent) {
        f(context, intent, a(context));
    }

    @l1
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    static void f(Context context, Intent intent, List<ResolveInfo> list) {
        if (list != null && list.size() != 0) {
            if (list.size() == 1) {
                intent.setPackage(list.get(0).activityInfo.packageName);
            } else {
                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(f11772c)), 65536);
                if (resolveInfoResolveActivity != null) {
                    String str = resolveInfoResolveActivity.activityInfo.packageName;
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (str.equals(list.get(i10).activityInfo.packageName)) {
                            intent.setPackage(str);
                            break;
                        }
                    }
                }
            }
            androidx.core.content.d.A(context, intent, null);
            return;
        }
        i(context, intent);
    }

    public static void g(@NonNull Context context, @NonNull Uri uri) {
        e(context, new d(context, uri).a().c());
    }

    public static void h(@NonNull Context context, @NonNull Uri uri, int i10, @NonNull ArrayList<androidx.browser.browseractions.a> arrayList, @NonNull PendingIntent pendingIntent) {
        e(context, new d(context, uri).f(i10).c(arrayList).e(pendingIntent).a().c());
    }

    private static void i(Context context, Intent intent) {
        Uri data = intent.getData();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(f11780k);
        j(context, data, parcelableArrayListExtra != null ? k(parcelableArrayListExtra) : null);
    }

    private static void j(Context context, Uri uri, List<androidx.browser.browseractions.a> list) {
        new androidx.browser.browseractions.d(context, uri, list).e();
        a aVar = f11795z;
        if (aVar != null) {
            aVar.a();
        }
    }

    @NonNull
    public static List<androidx.browser.browseractions.a> k(@NonNull ArrayList<Bundle> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Bundle bundle = arrayList.get(i10);
            String string = bundle.getString(f11777h);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f11778i);
            int i11 = bundle.getInt(f11775f);
            Uri uri = (Uri) bundle.getParcelable(f11776g);
            if (TextUtils.isEmpty(string) || pendingIntent == null) {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
            arrayList2.add(i11 != 0 ? new androidx.browser.browseractions.a(string, pendingIntent, i11) : new androidx.browser.browseractions.a(string, pendingIntent, uri));
        }
        return arrayList2;
    }

    @l1
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    static void l(a aVar) {
        f11795z = aVar;
    }

    @NonNull
    public Intent c() {
        return this.f11796a;
    }
}
