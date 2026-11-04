package com.facebook.appevents.iap;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.b1;
import com.facebook.g0;
import com.planner5d.library.widget.preloader.shimmer.ShimmerTextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class i {
    private static final SharedPreferences A;
    private static final SharedPreferences B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f98934a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final HashMap<String, Method> f98935b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final HashMap<String, Class<?>> f98936c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f98937d = 604800;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f98938e = 43200;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f98939f = "subs";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f98940g = "inapp";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f98941h = 86400;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f98942i = 1200;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f98943j = 30;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f98944k = "com.android.vending.billing.IInAppBillingService$Stub";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f98945l = "com.android.vending.billing.IInAppBillingService";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f98946m = "asInterface";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f98947n = "getSkuDetails";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f98948o = "getPurchases";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final String f98949p = "getPurchaseHistory";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final String f98950q = "isBillingSupported";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final String f98951r = "ITEM_ID_LIST";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f98952s = "RESPONSE_CODE";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final String f98953t = "DETAILS_LIST";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final String f98954u = "INAPP_PURCHASE_DATA_LIST";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final String f98955v = "INAPP_CONTINUATION_TOKEN";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final String f98956w = "LAST_CLEARED_TIME";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f98957x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private static final String f98958y = "com.facebook.internal.SKU_DETAILS";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private static final String f98959z = "com.facebook.internal.PURCHASE";

    static {
        g0 g0Var = g0.f99617a;
        f98957x = g0.n().getPackageName();
        A = g0.n().getSharedPreferences(f98958y, 0);
        B = g0.n().getSharedPreferences(f98959z, 0);
    }

    private i() {
    }

    @n
    @Nullable
    public static final Object a(@NotNull Context context, @Nullable IBinder iBinder) {
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            return f98934a.n(context, f98944k, f98946m, null, new Object[]{iBinder});
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
            return null;
        }
    }

    @n
    public static final void b() {
        if (!com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences sharedPreferences = A;
                long j10 = sharedPreferences.getLong(f98956w, 0L);
                if (j10 == 0) {
                    sharedPreferences.edit().putLong(f98956w, jCurrentTimeMillis).apply();
                } else if (jCurrentTimeMillis - j10 > f98937d) {
                    sharedPreferences.edit().clear().putLong(f98956w, jCurrentTimeMillis).apply();
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
            }
        }
    }

    private final ArrayList<String> c(ArrayList<String> arrayList) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor editorEdit = B.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j10 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j10 / 1000) <= 86400 && !Intrinsics.areEqual(B.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList2;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final Class<?> d(Context context, String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> map = f98936c;
            Class<?> cls = map.get(str);
            if (cls != null) {
                return cls;
            }
            m mVar = m.f98989a;
            Class<?> clsB = m.b(context, str);
            if (clsB == null) {
                return clsB;
            }
            map.put(str, clsB);
            return clsB;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    private final Method e(Class<?> cls, String str) {
        Class[] clsArr;
        Method methodC;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            HashMap<String, Method> map = f98935b;
            Method method = map.get(str);
            if (method != null) {
                return method;
            }
            Class TYPE = Integer.TYPE;
            switch (str) {
                case "getPurchases":
                    Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                    break;
                case "isBillingSupported":
                    Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class};
                    break;
                case "asInterface":
                    clsArr = new Class[]{IBinder.class};
                    break;
                case "getPurchaseHistory":
                    Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, String.class, Bundle.class};
                    break;
                case "getSkuDetails":
                    Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, Bundle.class};
                    break;
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                m mVar = m.f98989a;
                methodC = m.c(cls, str, null);
            } else {
                m mVar2 = m.f98989a;
                methodC = m.c(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (methodC != null) {
                map.put(str, methodC);
            }
            return methodC;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    private final ArrayList<String> f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (o(context, obj, str)) {
                int i10 = 0;
                String string = null;
                boolean z10 = false;
                do {
                    Object objN = n(context, f98945l, f98949p, obj, new Object[]{6, f98957x, str, string, new Bundle()});
                    if (objN != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objN;
                        if (bundle.getInt(f98952s) != 0 || (stringArrayList = bundle.getStringArrayList(f98954u)) == null) {
                            string = null;
                        } else {
                            for (String str2 : stringArrayList) {
                                try {
                                    if (jCurrentTimeMillis - (new JSONObject(str2).getLong("purchaseTime") / 1000) > ShimmerTextView.f258575k) {
                                        z10 = true;
                                        break;
                                    }
                                    arrayList.add(str2);
                                    i10++;
                                } catch (JSONException unused) {
                                }
                            }
                            string = bundle.getString(f98955v);
                        }
                    } else {
                        string = null;
                    }
                    if (i10 >= 30 || string == null) {
                        break;
                    }
                } while (!z10);
            }
            return arrayList;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @n
    @NotNull
    public static final ArrayList<String> g(@NotNull Context context, @Nullable Object obj) {
        i iVar;
        Class<?> clsD;
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj != null && (clsD = (iVar = f98934a).d(context, f98945l)) != null && iVar.e(clsD, f98949p) != null) {
                return iVar.c(iVar.f(context, obj, "inapp"));
            }
            return arrayList;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    private final ArrayList<String> h(Context context, Object obj, String str) {
        i iVar;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj != null && o(context, obj, str)) {
                int size = 0;
                String string = null;
                while (true) {
                    iVar = this;
                    Context context2 = context;
                    Object obj2 = obj;
                    try {
                        Object objN = iVar.n(context2, f98945l, f98948o, obj2, new Object[]{3, f98957x, str, string});
                        if (objN == null) {
                            string = null;
                            if (size >= 30) {
                                break;
                            }
                            break;
                            break;
                        }
                        Bundle bundle = (Bundle) objN;
                        if (bundle.getInt(f98952s) == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList(f98954u);
                            if (stringArrayList == null) {
                                break;
                            }
                            size += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            string = bundle.getString(f98955v);
                        } else {
                            string = null;
                        }
                        if (size >= 30 || string == null) {
                            break;
                        }
                        this = iVar;
                        context = context2;
                        obj = obj2;
                    } catch (Throwable th2) {
                        th = th2;
                        com.facebook.internal.instrument.crashshield.b.c(th, iVar);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            iVar = this;
        }
    }

    @n
    @NotNull
    public static final ArrayList<String> i(@NotNull Context context, @Nullable Object obj) {
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            i iVar = f98934a;
            return iVar.c(iVar.h(context, obj, "inapp"));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
            return null;
        }
    }

    @n
    @NotNull
    public static final ArrayList<String> j(@NotNull Context context, @Nullable Object obj) {
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            i iVar = f98934a;
            return iVar.c(iVar.h(context, obj, "subs"));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
            return null;
        }
    }

    @n
    @NotNull
    public static final Map<String, String> k(@NotNull Context context, @NotNull ArrayList<String> skuList, @Nullable Object obj, boolean z10) {
        if (com.facebook.internal.instrument.crashshield.b.e(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(skuList, "skuList");
            Map<String, String> mapP = f98934a.p(skuList);
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str : skuList) {
                if (!mapP.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            mapP.putAll(f98934a.l(context, arrayList, obj, z10));
            return mapP;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, i.class);
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    private final Map<String, String> l(Context context, ArrayList<String> arrayList, Object obj, boolean z10) {
        i iVar;
        int size;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList(f98951r, arrayList);
                iVar = this;
                try {
                    Object objN = iVar.n(context, f98945l, f98947n, obj, new Object[]{3, f98957x, z10 ? "subs" : "inapp", bundle});
                    if (objN != null) {
                        Bundle bundle2 = (Bundle) objN;
                        if (bundle2.getInt(f98952s) == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList(f98953t);
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size() && (size = arrayList.size() - 1) >= 0) {
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10 + 1;
                                    String str = arrayList.get(i10);
                                    Intrinsics.checkNotNullExpressionValue(str, "skuList[i]");
                                    String str2 = stringArrayList.get(i10);
                                    Intrinsics.checkNotNullExpressionValue(str2, "skuDetailsList[i]");
                                    linkedHashMap.put(str, str2);
                                    if (i11 > size) {
                                        break;
                                    }
                                    i10 = i11;
                                }
                            }
                            iVar.q(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    com.facebook.internal.instrument.crashshield.b.c(th, iVar);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th3) {
            th = th3;
            iVar = this;
            com.facebook.internal.instrument.crashshield.b.c(th, iVar);
            return null;
        }
    }

    private final Object n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodE;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            Class<?> clsD = d(context, str);
            if (clsD == null || (methodE = e(clsD, str2)) == null) {
                return null;
            }
            m mVar = m.f98989a;
            return m.e(clsD, methodE, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final boolean o(Context context, Object obj, String str) {
        i iVar;
        if (!com.facebook.internal.instrument.crashshield.b.e(this) && obj != null) {
            try {
                iVar = this;
                try {
                    Object objN = iVar.n(context, f98945l, f98950q, obj, new Object[]{3, f98957x, str});
                    return objN != null && ((Integer) objN).intValue() == 0;
                } catch (Throwable th2) {
                    th = th2;
                    com.facebook.internal.instrument.crashshield.b.c(th, iVar);
                    return false;
                }
            } catch (Throwable th3) {
                th = th3;
                iVar = this;
            }
        }
        return false;
    }

    private final Map<String, String> p(ArrayList<String> arrayList) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String sku : arrayList) {
                String string = A.getString(sku, null);
                if (string != null) {
                    List listSplit$default = StringsKt.split$default(string, new String[]{";"}, false, 2, 2, null);
                    if (jCurrentTimeMillis - Long.parseLong((String) listSplit$default.get(0)) < 43200) {
                        Intrinsics.checkNotNullExpressionValue(sku, "sku");
                        linkedHashMap.put(sku, listSplit$default.get(1));
                    } else {
                        continue;
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    private final void q(Map<String, String> map) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = A.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                editorEdit.putString(entry.getKey(), jCurrentTimeMillis + ';' + entry.getValue());
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final boolean m(@NotNull String skuDetail) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(skuDetail, "skuDetail");
            try {
                String strOptString = new JSONObject(skuDetail).optString("freeTrialPeriod");
                return strOptString != null && strOptString.length() > 0;
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }
}
