package com.facebook.appevents.cloudbridge;

import com.facebook.appevents.p;
import com.facebook.g0;
import com.facebook.internal.e1;
import com.facebook.internal.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f98633a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f98634b = "AppEventsConversionsAPITransformer";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Map<com.facebook.appevents.cloudbridge.b, c> f98635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Map<m, b> f98636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Map<String, j> f98637e;

    public enum a {
        OPTIONS(g0.I),
        COUNTRY(g0.J),
        STATE(g0.K);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0899a f98638b = new C0899a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f98643a;

        /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.e$a$a, reason: collision with other inner class name */
        public static final class C0899a {
            public /* synthetic */ C0899a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final a a(@NotNull String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                for (a aVar : a.valuesCustom()) {
                    if (Intrinsics.areEqual(aVar.l(), rawValue)) {
                        return aVar;
                    }
                }
                return null;
            }

            private C0899a() {
            }
        }

        static {
            int i10 = 2 << 2;
        }

        a(String str) {
            this.f98643a = str;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }

        @NotNull
        public final String l() {
            return this.f98643a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private k f98644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private i f98645b;

        public b(@Nullable k kVar, @NotNull i field) {
            Intrinsics.checkNotNullParameter(field, "field");
            this.f98644a = kVar;
            this.f98645b = field;
        }

        public static /* synthetic */ b d(b bVar, k kVar, i iVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                kVar = bVar.f98644a;
            }
            if ((i10 & 2) != 0) {
                iVar = bVar.f98645b;
            }
            return bVar.c(kVar, iVar);
        }

        @Nullable
        public final k a() {
            return this.f98644a;
        }

        @NotNull
        public final i b() {
            return this.f98645b;
        }

        @NotNull
        public final b c(@Nullable k kVar, @NotNull i field) {
            Intrinsics.checkNotNullParameter(field, "field");
            return new b(kVar, field);
        }

        @NotNull
        public final i e() {
            return this.f98645b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f98644a == bVar.f98644a && this.f98645b == bVar.f98645b;
        }

        @Nullable
        public final k f() {
            return this.f98644a;
        }

        public final void g(@NotNull i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "<set-?>");
            this.f98645b = iVar;
        }

        public final void h(@Nullable k kVar) {
            this.f98644a = kVar;
        }

        public int hashCode() {
            k kVar = this.f98644a;
            return ((kVar == null ? 0 : kVar.hashCode()) * 31) + this.f98645b.hashCode();
        }

        @NotNull
        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f98644a + ", field=" + this.f98645b + ')';
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private k f98646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private l f98647b;

        public c(@NotNull k section, @Nullable l lVar) {
            Intrinsics.checkNotNullParameter(section, "section");
            this.f98646a = section;
            this.f98647b = lVar;
        }

        public static /* synthetic */ c d(c cVar, k kVar, l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                kVar = cVar.f98646a;
            }
            if ((i10 & 2) != 0) {
                lVar = cVar.f98647b;
            }
            return cVar.c(kVar, lVar);
        }

        @NotNull
        public final k a() {
            return this.f98646a;
        }

        @Nullable
        public final l b() {
            return this.f98647b;
        }

        @NotNull
        public final c c(@NotNull k section, @Nullable l lVar) {
            Intrinsics.checkNotNullParameter(section, "section");
            return new c(section, lVar);
        }

        @Nullable
        public final l e() {
            return this.f98647b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f98646a == cVar.f98646a && this.f98647b == cVar.f98647b;
        }

        @NotNull
        public final k f() {
            return this.f98646a;
        }

        public final void g(@Nullable l lVar) {
            this.f98647b = lVar;
        }

        public final void h(@NotNull k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.f98646a = kVar;
        }

        public int hashCode() {
            int iHashCode = this.f98646a.hashCode() * 31;
            l lVar = this.f98647b;
            return iHashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "SectionFieldMapping(section=" + this.f98646a + ", field=" + this.f98647b + ')';
        }
    }

    public enum d {
        ARRAY,
        BOOL,
        INT;


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f98648a = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final d a(@NotNull String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                if (!Intrinsics.areEqual(rawValue, com.facebook.appevents.cloudbridge.b.EXT_INFO.l()) && !Intrinsics.areEqual(rawValue, com.facebook.appevents.cloudbridge.b.URL_SCHEMES.l()) && !Intrinsics.areEqual(rawValue, m.CONTENT_IDS.l()) && !Intrinsics.areEqual(rawValue, m.CONTENTS.l()) && !Intrinsics.areEqual(rawValue, a.OPTIONS.l())) {
                    if (!Intrinsics.areEqual(rawValue, com.facebook.appevents.cloudbridge.b.ADV_TE.l()) && !Intrinsics.areEqual(rawValue, com.facebook.appevents.cloudbridge.b.APP_TE.l())) {
                        if (Intrinsics.areEqual(rawValue, m.EVENT_TIME.l())) {
                            return d.INT;
                        }
                        return null;
                    }
                    return d.BOOL;
                }
                return d.ARRAY;
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] dVarArrValuesCustom = values();
            return (d[]) Arrays.copyOf(dVarArrValuesCustom, dVarArrValuesCustom.length);
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.e$e, reason: collision with other inner class name */
    public /* synthetic */ class C0900e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f98654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f98655c;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.ARRAY.ordinal()] = 1;
            iArr[d.BOOL.ordinal()] = 2;
            iArr[d.INT.ordinal()] = 3;
            f98653a = iArr;
            int[] iArr2 = new int[k.valuesCustom().length];
            iArr2[k.APP_DATA.ordinal()] = 1;
            iArr2[k.USER_DATA.ordinal()] = 2;
            f98654b = iArr2;
            int[] iArr3 = new int[com.facebook.appevents.cloudbridge.a.valuesCustom().length];
            iArr3[com.facebook.appevents.cloudbridge.a.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[com.facebook.appevents.cloudbridge.a.CUSTOM.ordinal()] = 2;
            f98655c = iArr3;
        }
    }

    static {
        com.facebook.appevents.cloudbridge.b bVar = com.facebook.appevents.cloudbridge.b.ANON_ID;
        k kVar = k.USER_DATA;
        Pair pair = TuplesKt.to(bVar, new c(kVar, l.ANON_ID));
        Pair pair2 = TuplesKt.to(com.facebook.appevents.cloudbridge.b.APP_USER_ID, new c(kVar, l.FB_LOGIN_ID));
        Pair pair3 = TuplesKt.to(com.facebook.appevents.cloudbridge.b.ADVERTISER_ID, new c(kVar, l.MAD_ID));
        Pair pair4 = TuplesKt.to(com.facebook.appevents.cloudbridge.b.PAGE_ID, new c(kVar, l.PAGE_ID));
        Pair pair5 = TuplesKt.to(com.facebook.appevents.cloudbridge.b.PAGE_SCOPED_USER_ID, new c(kVar, l.PAGE_SCOPED_USER_ID));
        com.facebook.appevents.cloudbridge.b bVar2 = com.facebook.appevents.cloudbridge.b.ADV_TE;
        k kVar2 = k.APP_DATA;
        f98635c = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, TuplesKt.to(bVar2, new c(kVar2, l.ADV_TE)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.APP_TE, new c(kVar2, l.APP_TE)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.CONSIDER_VIEWS, new c(kVar2, l.CONSIDER_VIEWS)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.DEVICE_TOKEN, new c(kVar2, l.DEVICE_TOKEN)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.EXT_INFO, new c(kVar2, l.EXT_INFO)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.INCLUDE_DWELL_DATA, new c(kVar2, l.INCLUDE_DWELL_DATA)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.INCLUDE_VIDEO_DATA, new c(kVar2, l.INCLUDE_VIDEO_DATA)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.INSTALL_REFERRER, new c(kVar2, l.INSTALL_REFERRER)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.INSTALLER_PACKAGE, new c(kVar2, l.INSTALLER_PACKAGE)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.RECEIPT_DATA, new c(kVar2, l.RECEIPT_DATA)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.URL_SCHEMES, new c(kVar2, l.URL_SCHEMES)), TuplesKt.to(com.facebook.appevents.cloudbridge.b.USER_DATA, new c(kVar, null)));
        Pair pair6 = TuplesKt.to(m.EVENT_TIME, new b(null, i.EVENT_TIME));
        Pair pair7 = TuplesKt.to(m.EVENT_NAME, new b(null, i.EVENT_NAME));
        m mVar = m.VALUE_TO_SUM;
        k kVar3 = k.CUSTOM_DATA;
        f98636d = MapsKt.mapOf(pair6, pair7, TuplesKt.to(mVar, new b(kVar3, i.VALUE_TO_SUM)), TuplesKt.to(m.CONTENT_IDS, new b(kVar3, i.CONTENT_IDS)), TuplesKt.to(m.CONTENTS, new b(kVar3, i.CONTENTS)), TuplesKt.to(m.CONTENT_TYPE, new b(kVar3, i.CONTENT_TYPE)), TuplesKt.to(m.CURRENCY, new b(kVar3, i.CURRENCY)), TuplesKt.to(m.DESCRIPTION, new b(kVar3, i.DESCRIPTION)), TuplesKt.to(m.LEVEL, new b(kVar3, i.LEVEL)), TuplesKt.to(m.MAX_RATING_VALUE, new b(kVar3, i.MAX_RATING_VALUE)), TuplesKt.to(m.NUM_ITEMS, new b(kVar3, i.NUM_ITEMS)), TuplesKt.to(m.PAYMENT_INFO_AVAILABLE, new b(kVar3, i.PAYMENT_INFO_AVAILABLE)), TuplesKt.to(m.REGISTRATION_METHOD, new b(kVar3, i.REGISTRATION_METHOD)), TuplesKt.to(m.SEARCH_STRING, new b(kVar3, i.SEARCH_STRING)), TuplesKt.to(m.SUCCESS, new b(kVar3, i.SUCCESS)), TuplesKt.to(m.ORDER_ID, new b(kVar3, i.ORDER_ID)), TuplesKt.to(m.AD_TYPE, new b(kVar3, i.AD_TYPE)));
        f98637e = MapsKt.mapOf(TuplesKt.to(p.f99216r, j.UNLOCKED_ACHIEVEMENT), TuplesKt.to(p.f99184b, j.ACTIVATED_APP), TuplesKt.to(p.f99210o, j.ADDED_PAYMENT_INFO), TuplesKt.to(p.f99204l, j.ADDED_TO_CART), TuplesKt.to(p.f99206m, j.ADDED_TO_WISHLIST), TuplesKt.to(p.f99192f, j.COMPLETED_REGISTRATION), TuplesKt.to(p.f99194g, j.VIEWED_CONTENT), TuplesKt.to(p.f99208n, j.INITIATED_CHECKOUT), TuplesKt.to(p.f99214q, j.ACHIEVED_LEVEL), TuplesKt.to(p.f99212p, j.PURCHASED), TuplesKt.to(p.f99198i, j.RATED), TuplesKt.to(p.f99196h, j.SEARCHED), TuplesKt.to(p.f99218s, j.SPENT_CREDITS), TuplesKt.to(p.f99200j, j.COMPLETED_TUTORIAL));
    }

    private e() {
    }

    private final List<Map<String, Object>> b(Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    private final List<Map<String, Object>> c(Map<String, ? extends Object> map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(i.EVENT_NAME.l(), n.MOBILE_APP_INSTALL.l());
        linkedHashMap.put(i.EVENT_TIME.l(), obj);
        return CollectionsKt.listOf(linkedHashMap);
    }

    private final com.facebook.appevents.cloudbridge.a f(Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3, ArrayList<Map<String, Object>> arrayList, Map<String, Object> map4) {
        Object obj = map.get(n.EVENT.l());
        com.facebook.appevents.cloudbridge.a.C0898a c0898a = com.facebook.appevents.cloudbridge.a.f98605a;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        com.facebook.appevents.cloudbridge.a aVarA = c0898a.a((String) obj);
        if (aVarA != com.facebook.appevents.cloudbridge.a.OTHER) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                com.facebook.appevents.cloudbridge.b bVarA = com.facebook.appevents.cloudbridge.b.f98610b.a(key);
                if (bVarA != null) {
                    f98633a.g(map2, map3, bVarA, value);
                } else {
                    boolean zAreEqual = Intrinsics.areEqual(key, k.CUSTOM_EVENTS.l());
                    boolean z10 = value instanceof String;
                    if (aVarA == com.facebook.appevents.cloudbridge.a.CUSTOM && zAreEqual && z10) {
                        ArrayList<Map<String, Object>> arrayListK = k((String) value);
                        if (arrayListK != null) {
                            arrayList.addAll(arrayListK);
                        }
                    } else if (a.f98638b.a(key) != null) {
                        map4.put(key, value);
                    }
                }
            }
        }
        return aVarA;
    }

    private final void h(Map<String, Object> map, com.facebook.appevents.cloudbridge.b bVar, Object obj) {
        c cVar = f98635c.get(bVar);
        l lVarE = cVar == null ? null : cVar.e();
        if (lVarE == null) {
            return;
        }
        map.put(lVarE.l(), obj);
    }

    private final void i(Map<String, Object> map, com.facebook.appevents.cloudbridge.b bVar, Object obj) {
        if (bVar == com.facebook.appevents.cloudbridge.b.USER_DATA) {
            try {
                e1 e1Var = e1.f99794a;
                map.putAll(e1.n(new JSONObject((String) obj)));
                return;
            } catch (JSONException e10) {
                t0.f100109e.e(com.facebook.t0.APP_EVENTS, f98634b, "\n transformEvents JSONException: \n%s\n%s", obj, e10);
                return;
            }
        }
        c cVar = f98635c.get(bVar);
        l lVarE = cVar == null ? null : cVar.e();
        if (lVarE == null) {
            return;
        }
        map.put(lVarE.l(), obj);
    }

    private final String j(String str) {
        Map<String, j> map = f98637e;
        if (!map.containsKey(str)) {
            return str;
        }
        j jVar = map.get(str);
        return jVar == null ? "" : jVar.l();
    }

    @oj.n
    @Nullable
    public static final ArrayList<Map<String, Object>> k(@NotNull String appEvents) {
        Intrinsics.checkNotNullParameter(appEvents, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            e1 e1Var = e1.f99794a;
            for (String str : e1.m(new JSONArray(appEvents))) {
                e1 e1Var2 = e1.f99794a;
                arrayList.add(e1.n(new JSONObject(str)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str2 : map.keySet()) {
                    m mVarA = m.f98734b.a(str2);
                    b bVar = f98636d.get(mVarA);
                    if (mVarA != null && bVar != null) {
                        k kVarF = bVar.f();
                        if (kVarF == null) {
                            try {
                                String strL = bVar.e().l();
                                if (mVarA == m.EVENT_NAME && ((String) map.get(str2)) != null) {
                                    e eVar = f98633a;
                                    Object obj = map.get(str2);
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    linkedHashMap2.put(strL, eVar.j((String) obj));
                                } else if (mVarA == m.EVENT_TIME && ((Integer) map.get(str2)) != null) {
                                    Object obj2 = map.get(str2);
                                    if (obj2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    Object objL = l(str2, obj2);
                                    if (objL == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    linkedHashMap2.put(strL, objL);
                                }
                            } catch (ClassCastException e10) {
                                t0.f100109e.e(com.facebook.t0.APP_EVENTS, f98634b, "\n transformEvents ClassCastException: \n %s ", kotlin.p.i(e10));
                            }
                        } else if (kVarF == k.CUSTOM_DATA) {
                            String strL2 = bVar.e().l();
                            Object obj3 = map.get(str2);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            Object objL2 = l(str2, obj3);
                            if (objL2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            linkedHashMap.put(strL2, objL2);
                        } else {
                            continue;
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(k.CUSTOM_DATA.l(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e11) {
            t0.f100109e.e(com.facebook.t0.APP_EVENTS, f98634b, "\n transformEvents JSONException: \n%s\n%s", appEvents, e11);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    @oj.n
    @Nullable
    public static final Object l(@NotNull String field, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        d dVarA = d.f98648a.a(field);
        String str = value instanceof String ? (String) value : null;
        if (dVarA != null && str != null) {
            int i10 = C0900e.f98653a[dVarA.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return StringsKt.toIntOrNull(value.toString());
                    }
                    throw new k0();
                }
                Integer intOrNull = StringsKt.toIntOrNull(str.toString());
                if (intOrNull != null) {
                    return Boolean.valueOf(intOrNull.intValue() != 0);
                }
                return null;
            }
            try {
                e1 e1Var = e1.f99794a;
                List<String> listM = e1.m(new JSONArray(str));
                ArrayList arrayList = new ArrayList();
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    ?? M = (String) it.next();
                    try {
                        try {
                            e1 e1Var2 = e1.f99794a;
                            M = e1.n(new JSONObject((String) M));
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        e1 e1Var3 = e1.f99794a;
                        M = e1.m(new JSONArray((String) M));
                    }
                    arrayList.add(M);
                }
                return arrayList;
            } catch (JSONException e10) {
                t0.f100109e.e(com.facebook.t0.APP_EVENTS, f98634b, "\n transformEvents JSONException: \n%s\n%s", value, e10);
                return Unit.f312394a;
            }
        }
        return value;
    }

    @Nullable
    public final List<Map<String, Object>> a(@NotNull com.facebook.appevents.cloudbridge.a eventType, @NotNull Map<String, Object> userData, @NotNull Map<String, Object> appData, @NotNull Map<String, Object> restOfData, @NotNull List<? extends Map<String, ? extends Object>> customEvents, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        Intrinsics.checkNotNullParameter(customEvents, "customEvents");
        Map<String, Object> mapD = d(userData, appData, restOfData);
        int i10 = C0900e.f98655c[eventType.ordinal()];
        if (i10 == 1) {
            return c(mapD, obj);
        }
        if (i10 != 2) {
            return null;
        }
        return b(mapD, customEvents);
    }

    @NotNull
    public final Map<String, Object> d(@NotNull Map<String, ? extends Object> userData, @NotNull Map<String, ? extends Object> appData, @NotNull Map<String, ? extends Object> restOfData) {
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(n.ACTION_SOURCE.l(), n.APP.l());
        linkedHashMap.put(k.USER_DATA.l(), userData);
        linkedHashMap.put(k.APP_DATA.l(), appData);
        linkedHashMap.putAll(restOfData);
        return linkedHashMap;
    }

    @Nullable
    public final List<Map<String, Object>> e(@NotNull Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        com.facebook.appevents.cloudbridge.a aVarF = f(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (aVarF == com.facebook.appevents.cloudbridge.a.OTHER) {
            return null;
        }
        return a(aVarF, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(n.INSTALL_EVENT_TIME.l()));
    }

    public final void g(@NotNull Map<String, Object> userData, @NotNull Map<String, Object> appData, @NotNull com.facebook.appevents.cloudbridge.b field, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        c cVar = f98635c.get(field);
        if (cVar == null) {
            return;
        }
        int i10 = C0900e.f98654b[cVar.f().ordinal()];
        if (i10 == 1) {
            h(appData, field, value);
        } else {
            if (i10 != 2) {
                return;
            }
            i(userData, field, value);
        }
    }
}
