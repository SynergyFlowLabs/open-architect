package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f46926a = "NotificationCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f46927b = "android.support.dataRemoteInputs";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f46928c = "android.support.allowGeneratedReplies";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f46929d = "icon";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f46930e = "title";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f46931f = "actionIntent";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f46932g = "extras";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f46933h = "remoteInputs";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f46934i = "dataOnlyRemoteInputs";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f46935j = "resultKey";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f46936k = "label";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f46937l = "choices";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f46938m = "allowFreeFormInput";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f46939n = "allowedDataTypes";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f46940o = "semanticAction";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f46941p = "showsUserInterface";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Field f46943r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f46944s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static Field f46946u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static Field f46947v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Field f46948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static Field f46949x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static boolean f46950y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f46942q = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f46945t = new Object();

    private a0() {
    }

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            Bundle bundle = list.get(i10);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i10, bundle);
            }
        }
        return sparseArray;
    }

    private static boolean b() {
        if (f46950y) {
            return false;
        }
        try {
            if (f46946u == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f46947v = cls.getDeclaredField(f46929d);
                f46948w = cls.getDeclaredField("title");
                f46949x = cls.getDeclaredField(f46931f);
                Field declaredField = Notification.class.getDeclaredField("actions");
                f46946u = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException unused) {
            f46950y = true;
        } catch (NoSuchFieldException unused2) {
            f46950y = true;
        }
        return true ^ f46950y;
    }

    private static l0 c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f46939n);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new l0(bundle.getString(f46935j), bundle.getCharSequence("label"), bundle.getCharSequenceArray(f46937l), bundle.getBoolean(f46938m), 0, bundle.getBundle("extras"), hashSet);
    }

    private static l0[] d(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        l0[] l0VarArr = new l0[bundleArr.length];
        for (int i10 = 0; i10 < bundleArr.length; i10++) {
            l0VarArr[i10] = c(bundleArr[i10]);
        }
        return l0VarArr;
    }

    public static w.b e(Notification notification, int i10) {
        SparseArray sparseParcelableArray;
        synchronized (f46945t) {
            try {
                try {
                    Object[] objArrH = h(notification);
                    if (objArrH != null) {
                        Object obj = objArrH[i10];
                        Bundle bundleK = k(notification);
                        return l(f46947v.getInt(obj), (CharSequence) f46948w.get(obj), (PendingIntent) f46949x.get(obj), (bundleK == null || (sparseParcelableArray = bundleK.getSparseParcelableArray(z.f47480e)) == null) ? null : (Bundle) sparseParcelableArray.get(i10));
                    }
                } catch (IllegalAccessException unused) {
                    f46950y = true;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int f(Notification notification) {
        int length;
        synchronized (f46945t) {
            try {
                Object[] objArrH = h(notification);
                length = objArrH != null ? objArrH.length : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return length;
    }

    static w.b g(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new w.b(bundle.getInt(f46929d), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable(f46931f), bundle.getBundle("extras"), d(i(bundle, f46933h)), d(i(bundle, f46934i)), bundle2 != null ? bundle2.getBoolean(f46928c, false) : false, bundle.getInt(f46940o), bundle.getBoolean(f46941p), false, false);
    }

    private static Object[] h(Notification notification) {
        synchronized (f46945t) {
            if (!b()) {
                return null;
            }
            try {
                return (Object[]) f46946u.get(notification);
            } catch (IllegalAccessException unused) {
                f46950y = true;
                return null;
            }
        }
    }

    private static Bundle[] i(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    static Bundle j(w.b bVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatF = bVar.f();
        bundle.putInt(f46929d, iconCompatF != null ? iconCompatF.A() : 0);
        bundle.putCharSequence("title", bVar.j());
        bundle.putParcelable(f46931f, bVar.a());
        Bundle bundle2 = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
        bundle2.putBoolean(f46928c, bVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray(f46933h, n(bVar.g()));
        bundle.putBoolean(f46941p, bVar.i());
        bundle.putInt(f46940o, bVar.h());
        return bundle;
    }

    public static Bundle k(Notification notification) {
        synchronized (f46942q) {
            try {
                if (f46944s) {
                    return null;
                }
                try {
                    if (f46943r == null) {
                        Field declaredField = Notification.class.getDeclaredField("extras");
                        if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                            f46944s = true;
                            return null;
                        }
                        declaredField.setAccessible(true);
                        f46943r = declaredField;
                    }
                    Bundle bundle = (Bundle) f46943r.get(notification);
                    if (bundle == null) {
                        bundle = new Bundle();
                        f46943r.set(notification, bundle);
                    }
                    return bundle;
                } catch (IllegalAccessException | NoSuchFieldException unused) {
                    f46944s = true;
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static w.b l(int i10, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        boolean z10;
        l0[] l0VarArr;
        l0[] l0VarArr2;
        if (bundle != null) {
            l0[] l0VarArrD = d(i(bundle, z.f47481f));
            l0[] l0VarArrD2 = d(i(bundle, f46927b));
            z10 = bundle.getBoolean(f46928c);
            l0VarArr = l0VarArrD;
            l0VarArr2 = l0VarArrD2;
        } else {
            z10 = false;
            l0VarArr = null;
            l0VarArr2 = null;
        }
        return new w.b(i10, charSequence, pendingIntent, bundle, l0VarArr, l0VarArr2, z10, 0, true, false, false);
    }

    private static Bundle m(l0 l0Var) {
        Bundle bundle = new Bundle();
        bundle.putString(f46935j, l0Var.o());
        bundle.putCharSequence("label", l0Var.n());
        bundle.putCharSequenceArray(f46937l, l0Var.h());
        bundle.putBoolean(f46938m, l0Var.f());
        bundle.putBundle("extras", l0Var.m());
        Set<String> setG = l0Var.g();
        if (setG != null && !setG.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setG.size());
            Iterator<String> it = setG.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList(f46939n, arrayList);
        }
        return bundle;
    }

    private static Bundle[] n(l0[] l0VarArr) {
        if (l0VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[l0VarArr.length];
        for (int i10 = 0; i10 < l0VarArr.length; i10++) {
            bundleArr[i10] = m(l0VarArr[i10]);
        }
        return bundleArr;
    }

    public static Bundle o(Notification.Builder builder, w.b bVar) {
        IconCompat iconCompatF = bVar.f();
        builder.addAction(iconCompatF != null ? iconCompatF.A() : 0, bVar.j(), bVar.a());
        Bundle bundle = new Bundle(bVar.d());
        if (bVar.g() != null) {
            bundle.putParcelableArray(z.f47481f, n(bVar.g()));
        }
        if (bVar.c() != null) {
            bundle.putParcelableArray(f46927b, n(bVar.c()));
        }
        bundle.putBoolean(f46928c, bVar.b());
        return bundle;
    }
}
