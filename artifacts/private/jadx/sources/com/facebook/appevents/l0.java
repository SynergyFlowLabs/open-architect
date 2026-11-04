package com.facebook.appevents;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Patterns;
import androidx.annotation.b1;
import com.devtodev.core.data.consts.RequestParams;
import com.facebook.internal.e1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f99124c = "com.facebook.appevents.UserDataStore.userData";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f99125d = "com.facebook.appevents.UserDataStore.internalUserData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static SharedPreferences f99126e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f99128g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f99129h = ",";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f99132k = "em";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f99133l = "fn";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f99134m = "ln";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f99135n = "ph";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f99136o = "db";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String f99137p = "ge";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final String f99138q = "ct";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final String f99139r = "st";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f99140s = "zp";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f99141t = "country";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l0 f99122a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f99123b = l0.class.getSimpleName();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f99127f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final ConcurrentHashMap<String, String> f99130i = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final ConcurrentHashMap<String, String> f99131j = new ConcurrentHashMap<>();

    private l0() {
    }

    @oj.n
    public static final void d() {
        if (com.facebook.internal.instrument.crashshield.b.e(l0.class)) {
            return;
        }
        try {
            f0.f98865b.e().execute(new Runnable() { // from class: com.facebook.appevents.k0
                @Override // java.lang.Runnable
                public final void run() {
                    l0.e();
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l0.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        if (com.facebook.internal.instrument.crashshield.b.e(l0.class)) {
            return;
        }
        try {
            if (!f99127f.get()) {
                f99122a.i();
            }
            f99130i.clear();
            SharedPreferences sharedPreferences = f99126e;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(f99124c, null).apply();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l0.class);
        }
    }

    @oj.n
    @NotNull
    public static final String f() {
        if (com.facebook.internal.instrument.crashshield.b.e(l0.class)) {
            return null;
        }
        try {
            if (!f99127f.get()) {
                f99122a.i();
            }
            HashMap map = new HashMap();
            map.putAll(f99130i);
            map.putAll(f99122a.g());
            e1 e1Var = e1.f99794a;
            return e1.i0(map);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l0.class);
            return null;
        }
    }

    private final Map<String, String> g() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            Set<String> setB = e5.d.f274661d.b();
            for (String str : f99131j.keySet()) {
                if (setB.contains(str)) {
                    map.put(str, f99131j.get(str));
                }
            }
            return map;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @oj.n
    @NotNull
    public static final String h() {
        if (com.facebook.internal.instrument.crashshield.b.e(l0.class)) {
            return null;
        }
        try {
            if (!f99127f.get()) {
                f99122a.i();
            }
            e1 e1Var = e1.f99794a;
            return e1.i0(f99130i);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l0.class);
            return null;
        }
    }

    private final synchronized void i() {
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                AtomicBoolean atomicBoolean = f99127f;
                if (atomicBoolean.get()) {
                    return;
                }
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.g0.n());
                Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
                f99126e = defaultSharedPreferences;
                if (defaultSharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                    throw null;
                }
                String string = defaultSharedPreferences.getString(f99124c, "");
                if (string == null) {
                    string = "";
                }
                SharedPreferences sharedPreferences = f99126e;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                    throw null;
                }
                String string2 = sharedPreferences.getString(f99125d, "");
                if (string2 == null) {
                    string2 = "";
                }
                ConcurrentHashMap<String, String> concurrentHashMap = f99130i;
                e1 e1Var = e1.f99794a;
                concurrentHashMap.putAll(e1.e0(string));
                f99131j.putAll(e1.e0(string2));
                atomicBoolean.set(true);
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @oj.n
    public static final void j() {
        if (com.facebook.internal.instrument.crashshield.b.e(l0.class)) {
            return;
        }
        try {
            if (f99127f.get()) {
                return;
            }
            f99122a.i();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l0.class);
        }
    }

    private final boolean k(String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            return new Regex("[A-Fa-f0-9]{64}").k(str);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    private final String l(String str, String str2) {
        String strSubstring;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            String string = str2.subSequence(i10, length + 1).toString();
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = string.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (Intrinsics.areEqual(f99132k, str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return "";
                }
            } else {
                if (Intrinsics.areEqual(f99135n, str)) {
                    return new Regex("[^0-9]").replace(lowerCase, "");
                }
                if (Intrinsics.areEqual(f99137p, str)) {
                    if (lowerCase.length() <= 0) {
                        strSubstring = "";
                    } else {
                        if (lowerCase == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        strSubstring = lowerCase.substring(0, 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    return (Intrinsics.areEqual(RequestParams.F, strSubstring) || Intrinsics.areEqual(androidx.media3.exoplayer.upstream.h.f66001o, strSubstring)) ? strSubstring : "";
                }
            }
            return lowerCase;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @oj.n
    public static final void m(@NotNull Map<String, String> ud2) {
        List<String> listO;
        if (com.facebook.internal.instrument.crashshield.b.e(l0.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(ud2, "ud");
            if (!f99127f.get()) {
                f99122a.i();
            }
            for (Map.Entry<String, String> entry : ud2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                e1 e1Var = e1.f99794a;
                l0 l0Var = f99122a;
                int i10 = 1;
                int length = value.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (i11 <= length) {
                    boolean z11 = Intrinsics.compare((int) value.charAt(!z10 ? i11 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i11++;
                    } else {
                        z10 = true;
                    }
                }
                String strG0 = e1.G0(l0Var.l(key, value.subSequence(i11, length + 1).toString()));
                ConcurrentHashMap<String, String> concurrentHashMap = f99131j;
                if (concurrentHashMap.containsKey(key)) {
                    String str = concurrentHashMap.get(key);
                    String[] strArr = null;
                    if (str != null && (listO = new Regex(f99129h).o(str, 0)) != null) {
                        Object[] array = listO.toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        strArr = (String[]) array;
                    }
                    if (strArr == null) {
                        strArr = new String[0];
                    }
                    Set setMutableSetOf = SetsKt.mutableSetOf(Arrays.copyOf(strArr, strArr.length));
                    if (setMutableSetOf.contains(strG0)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (strArr.length == 0) {
                        sb2.append(strG0);
                    } else if (strArr.length < 5) {
                        sb2.append(str);
                        sb2.append(f99129h);
                        sb2.append(strG0);
                    } else {
                        while (true) {
                            int i12 = i10 + 1;
                            sb2.append(strArr[i10]);
                            sb2.append(f99129h);
                            if (i12 >= 5) {
                                break;
                            } else {
                                i10 = i12;
                            }
                        }
                        sb2.append(strG0);
                        setMutableSetOf.remove(strArr[0]);
                    }
                    f99131j.put(key, sb2.toString());
                } else {
                    concurrentHashMap.put(key, strG0);
                }
            }
            l0 l0Var2 = f99122a;
            e1 e1Var2 = e1.f99794a;
            l0Var2.r(f99125d, e1.i0(f99131j));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l0.class);
        }
    }

    @oj.n
    public static final void n(@Nullable final Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.b.e(l0.class)) {
            return;
        }
        try {
            f0.f98865b.e().execute(new Runnable() { // from class: com.facebook.appevents.i0
                @Override // java.lang.Runnable
                public final void run() {
                    l0.p(bundle);
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l0.class);
        }
    }

    @oj.n
    public static final void o(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        if (com.facebook.internal.instrument.crashshield.b.e(l0.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString(f99132k, str);
            }
            if (str2 != null) {
                bundle.putString(f99133l, str2);
            }
            if (str3 != null) {
                bundle.putString(f99134m, str3);
            }
            if (str4 != null) {
                bundle.putString(f99135n, str4);
            }
            if (str5 != null) {
                bundle.putString(f99136o, str5);
            }
            if (str6 != null) {
                bundle.putString(f99137p, str6);
            }
            if (str7 != null) {
                bundle.putString(f99138q, str7);
            }
            if (str8 != null) {
                bundle.putString("st", str8);
            }
            if (str9 != null) {
                bundle.putString(f99140s, str9);
            }
            if (str10 != null) {
                bundle.putString("country", str10);
            }
            n(bundle);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l0.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.b.e(l0.class)) {
            return;
        }
        try {
            if (!f99127f.get()) {
                f99122a.i();
            }
            l0 l0Var = f99122a;
            l0Var.q(bundle);
            e1 e1Var = e1.f99794a;
            l0Var.r(f99124c, e1.i0(f99130i));
            l0Var.r(f99125d, e1.i0(f99131j));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l0.class);
        }
    }

    private final void q(Bundle bundle) {
        if (!com.facebook.internal.instrument.crashshield.b.e(this) && bundle != null) {
            try {
                for (String key : bundle.keySet()) {
                    Object obj = bundle.get(key);
                    if (obj != null) {
                        String string = obj.toString();
                        if (k(string)) {
                            ConcurrentHashMap<String, String> concurrentHashMap = f99130i;
                            if (string == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            String lowerCase = string.toLowerCase();
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                            concurrentHashMap.put(key, lowerCase);
                        } else {
                            e1 e1Var = e1.f99794a;
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            String strG0 = e1.G0(l(key, string));
                            if (strG0 != null) {
                                f99130i.put(key, strG0);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    private final void r(final String str, final String str2) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            com.facebook.g0.y().execute(new Runnable() { // from class: com.facebook.appevents.j0
                @Override // java.lang.Runnable
                public final void run() {
                    l0.s(str, str2);
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(String key, String value) {
        if (com.facebook.internal.instrument.crashshield.b.e(l0.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(key, "$key");
            Intrinsics.checkNotNullParameter(value, "$value");
            if (!f99127f.get()) {
                f99122a.i();
            }
            SharedPreferences sharedPreferences = f99126e;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(key, value).apply();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, l0.class);
        }
    }
}
