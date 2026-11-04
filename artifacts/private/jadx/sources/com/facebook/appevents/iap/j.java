package com.facebook.appevents.iap;

import android.content.SharedPreferences;
import androidx.annotation.b1;
import androidx.annotation.l1;
import com.facebook.g0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SharedPreferences f98961b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f98964e = "purchaseTime";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f98965f = "com.facebook.internal.iap.PRODUCT_DETAILS";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f98966g = "LAST_CLEARED_TIME";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f98967h = "PURCHASE_DETAILS_SET";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f98968i = "LAST_QUERY_PURCHASE_HISTORY_TIME";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f98969j = 604800;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f98970k = 86400;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f98960a = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Set<String> f98962c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Map<String, Long> f98963d = new ConcurrentHashMap();

    private j() {
    }

    @n
    public static final boolean d() {
        if (com.facebook.internal.instrument.crashshield.b.e(j.class)) {
            return false;
        }
        try {
            f98960a.g();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f98961b;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
            long j10 = sharedPreferences.getLong(f98968i, 0L);
            if (j10 != 0 && jCurrentTimeMillis - j10 < f98970k) {
                return false;
            }
            SharedPreferences sharedPreferences2 = f98961b;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong(f98968i, jCurrentTimeMillis).apply();
                return true;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, j.class);
            return false;
        }
    }

    @n
    public static final void e(@NotNull Map<String, JSONObject> purchaseDetailsMap, @NotNull Map<String, ? extends JSONObject> skuDetailsMap) {
        if (com.facebook.internal.instrument.crashshield.b.e(j.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            j jVar = f98960a;
            jVar.g();
            jVar.f(jVar.c(jVar.a(purchaseDetailsMap), skuDetailsMap));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, j.class);
        }
    }

    private final void f(Map<String, String> map) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    com.facebook.appevents.internal.i iVar = com.facebook.appevents.internal.i.f99018a;
                    com.facebook.appevents.internal.i.f(key, value, false);
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void g() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            g0 g0Var = g0.f99617a;
            SharedPreferences sharedPreferences = g0.n().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = g0.n().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains(f98966g)) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = g0.n().getSharedPreferences(f98965f, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            f98961b = sharedPreferences3;
            Set<String> set = f98962c;
            if (sharedPreferences3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
            Set<String> stringSet = sharedPreferences3.getStringSet(f98967h, new HashSet());
            set.addAll(stringSet == null ? new HashSet<>() : stringSet);
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                List listSplit$default = StringsKt.split$default(it.next(), new String[]{";"}, false, 2, 2, null);
                f98963d.put((String) listSplit$default.get(0), Long.valueOf(Long.parseLong((String) listSplit$default.get(1))));
            }
            b();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @l1(otherwise = 2)
    @NotNull
    public final Map<String, JSONObject> a(@NotNull Map<String, JSONObject> purchaseDetailsMap) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : MapsKt.toMap(purchaseDetailsMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f98963d.containsKey(string)) {
                            purchaseDetailsMap.remove(str);
                        } else {
                            Set<String> set = f98962c;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((Object) string);
                            sb2.append(';');
                            sb2.append(jCurrentTimeMillis);
                            set.add(sb2.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = f98961b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet(f98967h, f98962c).apply();
                return new HashMap(purchaseDetailsMap);
            }
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @l1(otherwise = 2)
    public final void b() {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences sharedPreferences = f98961b;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                    throw null;
                }
                long j10 = sharedPreferences.getLong(f98966g, 0L);
                if (j10 == 0) {
                    SharedPreferences sharedPreferences2 = f98961b;
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putLong(f98966g, jCurrentTimeMillis).apply();
                        return;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                        throw null;
                    }
                }
                if (jCurrentTimeMillis - j10 > 604800) {
                    for (Map.Entry entry : MapsKt.toMap(f98963d).entrySet()) {
                        String str = (String) entry.getKey();
                        long jLongValue = ((Number) entry.getValue()).longValue();
                        if (jCurrentTimeMillis - jLongValue > 86400) {
                            f98962c.remove(str + ';' + jLongValue);
                            f98963d.remove(str);
                        }
                    }
                    SharedPreferences sharedPreferences3 = f98961b;
                    if (sharedPreferences3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                        throw null;
                    }
                    sharedPreferences3.edit().putStringSet(f98967h, f98962c).putLong(f98966g, jCurrentTimeMillis).apply();
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    @l1(otherwise = 2)
    @NotNull
    public final Map<String, String> c(@NotNull Map<String, ? extends JSONObject> purchaseDetailsMap, @NotNull Map<String, ? extends JSONObject> skuDetailsMap) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends JSONObject> entry : purchaseDetailsMap.entrySet()) {
                String key = entry.getKey();
                JSONObject value = entry.getValue();
                JSONObject jSONObject = skuDetailsMap.get(key);
                if (value != null && value.has(f98964e)) {
                    try {
                        if (jCurrentTimeMillis - (value.getLong(f98964e) / 1000) <= 86400 && jSONObject != null) {
                            String string = value.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "purchaseDetail.toString()");
                            String string2 = jSONObject.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "skuDetail.toString()");
                            linkedHashMap.put(string, string2);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }
}
