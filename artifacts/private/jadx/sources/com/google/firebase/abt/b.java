package com.google.firebase.abt;

import android.text.TextUtils;
import androidx.annotation.l1;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l1
    static final String f120424g = "experimentId";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @l1
    static final String f120425h = "variantId";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l1
    static final String f120426i = "triggerEvent";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f120432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f120433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f120434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f120435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f120436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f120437f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @l1
    static final String f120427j = "experimentStartTime";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l1
    static final String f120429l = "timeToLiveMillis";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l1
    static final String f120428k = "triggerTimeoutMillis";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f120430m = {"experimentId", f120427j, f120429l, f120428k, "variantId"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @l1
    static final DateFormat f120431n = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f120432a = str;
        this.f120433b = str2;
        this.f120434c = str3;
        this.f120435d = date;
        this.f120436e = j10;
        this.f120437f = j11;
    }

    static b a(com.google.firebase.analytics.connector.a.c cVar) {
        String str = cVar.f120695d;
        if (str == null) {
            str = "";
        }
        return new b(cVar.f120693b, String.valueOf(cVar.f120694c), str, new Date(cVar.f120704m), cVar.f120696e, cVar.f120701j);
    }

    static b b(Map<String, String> map) throws a {
        l(map);
        try {
            return new b(map.get("experimentId"), map.get("variantId"), map.containsKey(f120426i) ? map.get(f120426i) : "", f120431n.parse(map.get(f120427j)), Long.parseLong(map.get(f120428k)), Long.parseLong(map.get(f120429l)));
        } catch (NumberFormatException e10) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new a("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    static void k(b bVar) throws a {
        l(bVar.j());
    }

    private static void l(Map<String, String> map) throws a {
        ArrayList arrayList = new ArrayList();
        for (String str : f120430m) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    String c() {
        return this.f120432a;
    }

    long d() {
        return this.f120435d.getTime();
    }

    long e() {
        return this.f120437f;
    }

    String f() {
        return this.f120434c;
    }

    long g() {
        return this.f120436e;
    }

    String h() {
        return this.f120433b;
    }

    com.google.firebase.analytics.connector.a.c i(String str) {
        com.google.firebase.analytics.connector.a.c cVar = new com.google.firebase.analytics.connector.a.c();
        cVar.f120692a = str;
        cVar.f120704m = d();
        cVar.f120693b = this.f120432a;
        cVar.f120694c = this.f120433b;
        cVar.f120695d = TextUtils.isEmpty(this.f120434c) ? null : this.f120434c;
        cVar.f120696e = this.f120436e;
        cVar.f120701j = this.f120437f;
        return cVar;
    }

    @l1
    Map<String, String> j() {
        HashMap map = new HashMap();
        map.put("experimentId", this.f120432a);
        map.put("variantId", this.f120433b);
        map.put(f120426i, this.f120434c);
        map.put(f120427j, f120431n.format(this.f120435d));
        map.put(f120428k, Long.toString(this.f120436e));
        map.put(f120429l, Long.toString(this.f120437f));
        return map;
    }
}
