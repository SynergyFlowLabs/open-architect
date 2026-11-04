package com.facebook.internal;

import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f100023g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f100024h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f100025i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f100026j = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f100027k = 17;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f100028l = 102;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f100029m = 190;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f100030n = 412;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f100031o = 341;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f100032p = 458;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f100033q = 493;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final String f100034r = "recovery_message";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f100035s = "name";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f100036t = "other";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f100037u = "transient";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f100038v = "login_recoverable";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private static p f100039w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Map<Integer, Set<Integer>> f100040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Map<Integer, Set<Integer>> f100041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Map<Integer, Set<Integer>> f100042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f100043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f100044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f100045f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public static /* synthetic */ void c() {
        }

        private final p d() {
            int i10 = 4 ^ 0;
            return new p(null, MapsKt.hashMapOf(TuplesKt.to(2, null), TuplesKt.to(4, null), TuplesKt.to(9, null), TuplesKt.to(17, null), TuplesKt.to(Integer.valueOf(p.f100031o), null)), MapsKt.hashMapOf(TuplesKt.to(102, null), TuplesKt.to(Integer.valueOf(p.f100029m), null), TuplesKt.to(412, null)), null, null, null);
        }

        private final Map<Integer, Set<Integer>> e(JSONObject jSONObject) {
            int iOptInt;
            HashSet hashSet;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
            int i10 = 1 >> 0;
            if (jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                    if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = jSONArrayOptJSONArray2.length();
                            if (length2 > 0) {
                                int i13 = 0;
                                while (true) {
                                    int i14 = i13 + 1;
                                    int iOptInt2 = jSONArrayOptJSONArray2.optInt(i13);
                                    if (iOptInt2 != 0) {
                                        hashSet.add(Integer.valueOf(iOptInt2));
                                    }
                                    if (i14 >= length2) {
                                        break;
                                    }
                                    i13 = i14;
                                }
                            }
                        }
                        map.put(Integer.valueOf(iOptInt), hashSet);
                    }
                    if (i12 >= length) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return map;
        }

        @oj.n
        @Nullable
        public final p a(@Nullable JSONArray jSONArray) {
            Map<Integer, Set<Integer>> map;
            Map<Integer, Set<Integer>> map2;
            Map<Integer, Set<Integer>> map3;
            String str;
            String str2;
            String str3;
            String strOptString;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                Map<Integer, Set<Integer>> mapE = null;
                Map<Integer, Set<Integer>> mapE2 = null;
                Map<Integer, Set<Integer>> mapE3 = null;
                String strOptString2 = null;
                String strOptString3 = null;
                String strOptString4 = null;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("name")) != null) {
                        if (StringsKt.N1(strOptString, "other", true)) {
                            strOptString2 = jSONObjectOptJSONObject.optString(p.f100034r, null);
                            mapE = e(jSONObjectOptJSONObject);
                        } else if (StringsKt.N1(strOptString, p.f100037u, true)) {
                            strOptString3 = jSONObjectOptJSONObject.optString(p.f100034r, null);
                            mapE2 = e(jSONObjectOptJSONObject);
                        } else if (StringsKt.N1(strOptString, p.f100038v, true)) {
                            strOptString4 = jSONObjectOptJSONObject.optString(p.f100034r, null);
                            mapE3 = e(jSONObjectOptJSONObject);
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
                map = mapE;
                map2 = mapE2;
                map3 = mapE3;
                str = strOptString2;
                str2 = strOptString3;
                str3 = strOptString4;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            return new p(map, map2, map3, str, str2, str3);
        }

        @NotNull
        public final synchronized p b() {
            p pVar;
            try {
                if (p.f100039w == null) {
                    p.f100039w = d();
                }
                pVar = p.f100039w;
                if (pVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return pVar;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100046a;

        static {
            int[] iArr = new int[FacebookRequestError.a.valuesCustom().length];
            iArr[FacebookRequestError.a.OTHER.ordinal()] = 1;
            iArr[FacebookRequestError.a.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[FacebookRequestError.a.TRANSIENT.ordinal()] = 3;
            f100046a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(@Nullable Map<Integer, ? extends Set<Integer>> map, @Nullable Map<Integer, ? extends Set<Integer>> map2, @Nullable Map<Integer, ? extends Set<Integer>> map3, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f100040a = map;
        this.f100041b = map2;
        this.f100042c = map3;
        this.f100043d = str;
        this.f100044e = str2;
        this.f100045f = str3;
    }

    @oj.n
    @Nullable
    public static final p d(@Nullable JSONArray jSONArray) {
        return f100023g.a(jSONArray);
    }

    @NotNull
    public static final synchronized p e() {
        return f100023g.b();
    }

    @NotNull
    public final FacebookRequestError.a c(int i10, int i11, boolean z10) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z10) {
            return FacebookRequestError.a.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.f100040a;
        if (map != null && map.containsKey(Integer.valueOf(i10)) && ((set3 = this.f100040a.get(Integer.valueOf(i10))) == null || set3.contains(Integer.valueOf(i11)))) {
            return FacebookRequestError.a.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.f100042c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i10)) && ((set2 = this.f100042c.get(Integer.valueOf(i10))) == null || set2.contains(Integer.valueOf(i11)))) {
            return FacebookRequestError.a.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.f100041b;
        return (map3 != null && map3.containsKey(Integer.valueOf(i10)) && ((set = this.f100041b.get(Integer.valueOf(i10))) == null || set.contains(Integer.valueOf(i11)))) ? FacebookRequestError.a.TRANSIENT : FacebookRequestError.a.OTHER;
    }

    @Nullable
    public final Map<Integer, Set<Integer>> f() {
        return this.f100042c;
    }

    @Nullable
    public final Map<Integer, Set<Integer>> g() {
        return this.f100040a;
    }

    @Nullable
    public final String h(@Nullable FacebookRequestError.a aVar) {
        int i10 = aVar == null ? -1 : b.f100046a[aVar.ordinal()];
        if (i10 == 1) {
            return this.f100043d;
        }
        if (i10 == 2) {
            return this.f100045f;
        }
        if (i10 == 3) {
            return this.f100044e;
        }
        int i11 = 3 & 0;
        return null;
    }

    @Nullable
    public final Map<Integer, Set<Integer>> i() {
        return this.f100041b;
    }
}
