package androidx.core.content.pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.t;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f47595a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f47596b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f47597c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f47598d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l1
    static final String f47599e = "com.android.launcher.action.INSTALL_SHORTCUT";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l1
    static final String f47600f = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f47601g = 96;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f47602h = 48;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f47603i = "android.intent.extra.shortcut.ID";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile g<?> f47604j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile List<d> f47605k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f47606l = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f47607m = "androidx.core.content.pm.shortcut_listener_impl";

    class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntentSender f47608a;

        a(IntentSender intentSender) {
            this.f47608a = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.f47608a.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    @w0(25)
    private static class b {
        private b() {
        }

        static String a(@NonNull List<ShortcutInfo> list) {
            int rank = -1;
            String id2 = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > rank) {
                    id2 = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    private k() {
    }

    @l1
    static void A(List<d> list) {
        f47605k = list;
    }

    @l1
    static void B(g<Void> gVar) {
        f47604j = gVar;
    }

    public static boolean C(@NonNull Context context, @NonNull List<e> list) {
        List<e> listW = w(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            c(context, listW);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<e> it = listW.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().H());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
            return false;
        }
        o(context).a(listW);
        Iterator<d> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().d(list);
        }
        return true;
    }

    public static boolean a(@NonNull Context context, @NonNull List<e> list) {
        List<e> listW = w(list, 1);
        if (Build.VERSION.SDK_INT <= 29) {
            c(context, listW);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<e> it = listW.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().H());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
            return false;
        }
        o(context).a(listW);
        Iterator<d> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().b(list);
        }
        return true;
    }

    @l1
    static boolean b(@NonNull Context context, @NonNull e eVar) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat = eVar.f47572i;
        if (iconCompat == null) {
            return false;
        }
        int i10 = iconCompat.f47754q;
        if (i10 != 6 && i10 != 4) {
            return true;
        }
        InputStream inputStreamE = iconCompat.E(context);
        if (inputStreamE != null && (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamE)) != null) {
            eVar.f47572i = i10 == 6 ? IconCompat.q(bitmapDecodeStream) : IconCompat.t(bitmapDecodeStream);
            return true;
        }
        return false;
    }

    @l1
    static void c(@NonNull Context context, @NonNull List<e> list) {
        for (e eVar : new ArrayList(list)) {
            if (!b(context, eVar)) {
                list.remove(eVar);
            }
        }
    }

    @NonNull
    public static Intent d(@NonNull Context context, @NonNull e eVar) {
        Intent intentCreateShortcutResultIntent = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(eVar.H());
        if (intentCreateShortcutResultIntent == null) {
            intentCreateShortcutResultIntent = new Intent();
        }
        return eVar.a(intentCreateShortcutResultIntent);
    }

    public static void e(@NonNull Context context, @NonNull List<String> list, @p0 CharSequence charSequence) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(list, charSequence);
        o(context).d(list);
        Iterator<d> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    public static void f(@NonNull Context context, @NonNull List<e> list) {
        List<e> listW = w(list, 1);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<e> it = listW.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f47565b);
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList);
        o(context).a(listW);
        Iterator<d> it2 = n(context).iterator();
        while (it2.hasNext()) {
            it2.next().b(list);
        }
    }

    @NonNull
    public static List<e> g(@NonNull Context context) {
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new e.b(context, it.next()).c());
        }
        return arrayList;
    }

    private static int h(@NonNull Context context, boolean z10) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int iMax = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (iMax * ((z10 ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    public static int i(@NonNull Context context) {
        t.l(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxHeight();
    }

    public static int j(@NonNull Context context) {
        t.l(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxWidth();
    }

    public static int k(@NonNull Context context) {
        t.l(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    @l1
    static List<d> l() {
        return f47605k;
    }

    private static String m(@NonNull List<e> list) {
        int iV = -1;
        String strK = null;
        for (e eVar : list) {
            if (eVar.v() > iV) {
                strK = eVar.k();
                iV = eVar.v();
            }
        }
        return strK;
    }

    private static List<d> n(Context context) {
        Bundle bundle;
        String string;
        if (f47605k == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(f47606l);
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString(f47607m)) != null) {
                    try {
                        arrayList.add((d) Class.forName(string, false, k.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f47605k == null) {
                f47605k = arrayList;
            }
        }
        return f47605k;
    }

    private static g<?> o(Context context) {
        if (f47604j == null) {
            try {
                f47604j = (g) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, k.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f47604j == null) {
                f47604j = new g.a();
            }
        }
        return f47604j;
    }

    @NonNull
    public static List<e> p(@NonNull Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return e.c(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i10));
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.addAll(shortcutManager.getManifestShortcuts());
        }
        if ((i10 & 2) != 0) {
            arrayList.addAll(shortcutManager.getDynamicShortcuts());
        }
        if ((i10 & 4) != 0) {
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
        }
        return e.c(context, arrayList);
    }

    public static boolean q(@NonNull Context context) {
        t.l(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRateLimitingActive();
    }

    public static boolean r(@NonNull Context context) {
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    public static boolean s(@NonNull Context context, @NonNull e eVar) {
        t.l(context);
        t.l(eVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 32 && eVar.E(1)) {
            Iterator<d> it = n(context).iterator();
            while (it.hasNext()) {
                it.next().b(Collections.singletonList(eVar));
            }
            return true;
        }
        int iK = k(context);
        if (iK == 0) {
            return false;
        }
        if (i10 <= 29) {
            b(context, eVar);
        }
        if (i10 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(eVar.H());
        } else {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= iK) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(b.a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(eVar.H()));
        }
        g<?> gVarO = o(context);
        try {
            List<e> listB = gVarO.b();
            if (listB.size() >= iK) {
                gVarO.d(Arrays.asList(m(listB)));
            }
            gVarO.a(Arrays.asList(eVar));
            Iterator<d> it2 = n(context).iterator();
            while (it2.hasNext()) {
                it2.next().b(Collections.singletonList(eVar));
            }
            x(context, eVar.k());
            return true;
        } catch (Exception unused) {
            Iterator<d> it3 = n(context).iterator();
            while (it3.hasNext()) {
                it3.next().b(Collections.singletonList(eVar));
            }
            x(context, eVar.k());
            return false;
        } catch (Throwable th2) {
            Iterator<d> it4 = n(context).iterator();
            while (it4.hasNext()) {
                it4.next().b(Collections.singletonList(eVar));
            }
            x(context, eVar.k());
            throw th2;
        }
    }

    public static void t(@NonNull Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        o(context).c();
        Iterator<d> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static void u(@NonNull Context context, @NonNull List<String> list) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        o(context).d(list);
        Iterator<d> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    public static void v(@NonNull Context context, @NonNull List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            u(context, list);
            return;
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(list);
        o(context).d(list);
        Iterator<d> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().c(list);
        }
    }

    @NonNull
    private static List<e> w(@NonNull List<e> list, int i10) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (e eVar : list) {
            if (eVar.E(i10)) {
                arrayList.remove(eVar);
            }
        }
        return arrayList;
    }

    public static void x(@NonNull Context context, @NonNull String str) {
        t.l(context);
        t.l(str);
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator<d> it = n(context).iterator();
        while (it.hasNext()) {
            it.next().e(Collections.singletonList(str));
        }
    }

    public static boolean y(@NonNull Context context, @NonNull e eVar, @p0 IntentSender intentSender) {
        if (Build.VERSION.SDK_INT > 32 || !eVar.E(1)) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(eVar.H(), intentSender);
        }
        return false;
    }

    public static boolean z(@NonNull Context context, @NonNull List<e> list) {
        t.l(context);
        t.l(list);
        int i10 = 6 ^ 1;
        List<e> listW = w(list, 1);
        ArrayList arrayList = new ArrayList(listW.size());
        Iterator<e> it = listW.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().H());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
            return false;
        }
        o(context).c();
        o(context).a(listW);
        for (d dVar : n(context)) {
            dVar.a();
            dVar.b(list);
        }
        return true;
    }
}
