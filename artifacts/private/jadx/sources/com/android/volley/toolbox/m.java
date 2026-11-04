package com.android.volley.toolbox;

import androidx.annotation.b1;
import androidx.annotation.p0;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    public static final String f89583a = "Content-Type";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f89584b = "ISO-8859-1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f89585c = "EEE, dd MMM yyyy HH:mm:ss zzz";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f89586d = "EEE, dd MMM yyyy HH:mm:ss 'GMT'";

    static List<com.android.volley.k> a(List<com.android.volley.k> list, com.android.volley.f.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<com.android.volley.k> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<com.android.volley.k> list2 = aVar.f89440h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.android.volley.k kVar : aVar.f89440h) {
                    if (!treeSet.contains(kVar.a())) {
                        arrayList.add(kVar);
                    }
                }
            }
        } else if (!aVar.f89439g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f89439g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.android.volley.k(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    static String b(long j10) {
        return d(f89586d).format(new Date(j10));
    }

    static Map<String, String> c(com.android.volley.f.a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        String str = aVar.f89434b;
        if (str != null) {
            map.put(com.google.common.net.d.A, str);
        }
        long j10 = aVar.f89436d;
        if (j10 > 0) {
            map.put(com.google.common.net.d.f119556z, b(j10));
        }
        return map;
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(org.apache.commons.lang3.time.m.f337525a));
        return simpleDateFormat;
    }

    @p0
    public static com.android.volley.f.a e(com.android.volley.o oVar) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = oVar.f89472c;
        if (map == null) {
            return null;
        }
        String str = map.get(com.google.common.net.d.f119483d);
        long jH = str != null ? h(str) : 0L;
        String str2 = map.get(com.google.common.net.d.f119471a);
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z10 = false;
            j11 = 0;
            j12 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals(io.ktor.client.utils.d.f295392f) || strTrim.equals(io.ktor.client.utils.d.f295393g)) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j12 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals(io.ktor.client.utils.d.f295395i) || strTrim.equals(io.ktor.client.utils.d.f295398l)) {
                    z10 = true;
                }
                i10++;
            }
            j10 = 0;
            i10 = 1;
        } else {
            j10 = 0;
            z10 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = map.get(com.google.common.net.d.f119530q0);
        long jH2 = str3 != null ? h(str3) : j10;
        String str4 = map.get(com.google.common.net.d.f119533r0);
        long jH3 = str4 != null ? h(str4) : j10;
        String str5 = map.get(com.google.common.net.d.f119527p0);
        if (i10 != 0) {
            long j15 = jCurrentTimeMillis + (j11 * 1000);
            j14 = z10 ? j15 : (j12 * 1000) + j15;
            j13 = j15;
        } else {
            j13 = (jH <= j10 || jH2 < jH) ? j10 : jCurrentTimeMillis + (jH2 - jH);
            j14 = j13;
        }
        com.android.volley.f.a aVar = new com.android.volley.f.a();
        aVar.f89433a = oVar.f89471b;
        aVar.f89434b = str5;
        aVar.f89438f = j13;
        aVar.f89437e = j14;
        aVar.f89435c = jH;
        aVar.f89436d = jH3;
        aVar.f89439g = map;
        aVar.f89440h = oVar.f89473d;
        return aVar;
    }

    public static String f(@p0 Map<String, String> map) {
        return g(map, "ISO-8859-1");
    }

    public static String g(@p0 Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals(hi.c.C1916c.f285814c)) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    public static long h(String str) {
        try {
            return d(f89585c).parse(str).getTime();
        } catch (ParseException e10) {
            if (com.facebook.appevents.p.f99189d0.equals(str) || CreateTicketViewModelKt.EmailId.equals(str)) {
                com.android.volley.b0.f("Unable to parse dateStr: %s, falling back to 0", str);
            } else {
                com.android.volley.b0.d(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            }
            return 0L;
        }
    }

    static List<com.android.volley.k> i(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new com.android.volley.k(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    static Map<String, String> j(List<com.android.volley.k> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (com.android.volley.k kVar : list) {
            treeMap.put(kVar.a(), kVar.b());
        }
        return treeMap;
    }
}
