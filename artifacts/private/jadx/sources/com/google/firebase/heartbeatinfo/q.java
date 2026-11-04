package com.google.firebase.heartbeatinfo;

import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.l1;
import com.google.android.gms.measurement.internal.ue;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q f122104b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f122106d = "FirebaseAppHeartBeat";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f122107e = "FirebaseHeartBeat";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f122110h = 30;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.datastorage.b f122111a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final androidx.datastore.preferences.core.f.a<Long> f122105c = androidx.datastore.preferences.core.i.f("fire-global");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final androidx.datastore.preferences.core.f.a<Long> f122108f = androidx.datastore.preferences.core.i.f("fire-count");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final androidx.datastore.preferences.core.f.a<String> f122109g = androidx.datastore.preferences.core.i.g("last-used-date");

    public q(Context context, String str) {
        this.f122111a = new com.google.firebase.datastorage.b(context, f122107e + str);
    }

    public static /* synthetic */ Unit a(long j10, androidx.datastore.preferences.core.c cVar) {
        cVar.o(f122105c, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ Unit b(q qVar, String str, String str2, androidx.datastore.preferences.core.f.a aVar, androidx.datastore.preferences.core.c cVar) {
        qVar.getClass();
        androidx.datastore.preferences.core.f.a<String> aVar2 = f122109g;
        if (((String) com.google.firebase.datastorage.c.a(cVar, aVar2, "")).equals(str)) {
            androidx.datastore.preferences.core.f.a<Set<String>> aVarK = qVar.k(cVar, str);
            if (aVarK == null || aVarK.a().equals(str2)) {
                return null;
            }
            qVar.s(cVar, aVar, str);
            return null;
        }
        androidx.datastore.preferences.core.f.a<Long> aVar3 = f122108f;
        long jLongValue = ((Long) com.google.firebase.datastorage.c.a(cVar, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = qVar.e(cVar);
        }
        HashSet hashSet = new HashSet((Collection) com.google.firebase.datastorage.c.a(cVar, aVar, new HashSet()));
        hashSet.add(str);
        cVar.o(aVar, hashSet);
        cVar.o(aVar3, Long.valueOf(jLongValue + 1));
        cVar.o(aVar2, str);
        return null;
    }

    public static /* synthetic */ Unit c(q qVar, androidx.datastore.preferences.core.c cVar) {
        qVar.getClass();
        long j10 = 0;
        for (Map.Entry<androidx.datastore.preferences.core.f.a<?>, Object> entry : cVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                androidx.datastore.preferences.core.f.a<?> key = entry.getKey();
                Set set = (Set) entry.getValue();
                String strH = qVar.h(System.currentTimeMillis());
                if (set.contains(strH)) {
                    cVar.o(key, ue.a(new Object[]{strH}));
                    j10++;
                } else {
                    cVar.n(key);
                }
            }
        }
        if (j10 == 0) {
            cVar.n(f122108f);
            return null;
        }
        cVar.o(f122108f, Long.valueOf(j10));
        return null;
    }

    public static /* synthetic */ Unit d(q qVar, String str, androidx.datastore.preferences.core.c cVar) {
        qVar.getClass();
        cVar.o(f122109g, str);
        qVar.n(cVar, str);
        return null;
    }

    private synchronized long e(androidx.datastore.preferences.core.c cVar) {
        long j10;
        try {
            long jLongValue = ((Long) com.google.firebase.datastorage.c.a(cVar, f122108f, 0L)).longValue();
            String strA = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry<androidx.datastore.preferences.core.f.a<?>, Object> entry : cVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            strA = entry.getKey().a();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            cVar.o(androidx.datastore.preferences.core.i.h(strA), hashSet2);
            j10 = jLongValue - 1;
            cVar.o(f122108f, Long.valueOf(j10));
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    private synchronized String h(long j10) {
        return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private synchronized androidx.datastore.preferences.core.f.a<Set<String>> k(androidx.datastore.preferences.core.c cVar, String str) {
        try {
            for (Map.Entry<androidx.datastore.preferences.core.f.a<?>, Object> entry : cVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Iterator it = ((Set) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (str.equals((String) it.next())) {
                            return androidx.datastore.preferences.core.i.h(entry.getKey().a());
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void n(androidx.datastore.preferences.core.c cVar, String str) {
        try {
            androidx.datastore.preferences.core.f.a<Set<String>> aVarK = k(cVar, str);
            if (aVarK == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) com.google.firebase.datastorage.c.a(cVar, aVarK, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                cVar.n(aVarK);
            } else {
                cVar.o(aVarK, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void s(androidx.datastore.preferences.core.c cVar, androidx.datastore.preferences.core.f.a<Set<String>> aVar, String str) {
        try {
            n(cVar, str);
            HashSet hashSet = new HashSet((Collection) com.google.firebase.datastorage.c.a(cVar, aVar, new HashSet()));
            hashSet.add(str);
            cVar.o(aVar, hashSet);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void f() {
        this.f122111a.f(new Function1() { // from class: com.google.firebase.heartbeatinfo.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.c(this.f122100a, (androidx.datastore.preferences.core.c) obj);
            }
        });
    }

    synchronized List<r> g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strH = h(System.currentTimeMillis());
            for (Map.Entry<androidx.datastore.preferences.core.f.a<?>, Object> entry : this.f122111a.g().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strH);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(r.a(entry.getKey().a(), new ArrayList(hashSet)));
                    }
                }
            }
            r(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @l1
    @b1({b1.a.TESTS})
    int i() {
        return ((Long) this.f122111a.k(f122108f, 0L)).intValue();
    }

    synchronized long j() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return ((Long) this.f122111a.k(f122105c, -1L)).longValue();
    }

    synchronized boolean l(long j10, long j11) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return h(j10).equals(h(j11));
    }

    synchronized void m() {
        try {
            final String strH = h(System.currentTimeMillis());
            this.f122111a.f(new Function1() { // from class: com.google.firebase.heartbeatinfo.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.d(this.f122101a, strH, (androidx.datastore.preferences.core.c) obj);
                }
            });
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized boolean o(long j10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return p(f122105c, j10);
    }

    synchronized boolean p(androidx.datastore.preferences.core.f.a<Long> aVar, long j10) {
        try {
            if (l(((Long) this.f122111a.k(aVar, -1L)).longValue(), j10)) {
                return false;
            }
            this.f122111a.l(aVar, Long.valueOf(j10));
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void q(long j10, final String str) {
        final String strH = h(j10);
        final androidx.datastore.preferences.core.f.a<Set<String>> aVarH = androidx.datastore.preferences.core.i.h(str);
        this.f122111a.f(new Function1() { // from class: com.google.firebase.heartbeatinfo.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.b(this.f122096a, strH, str, aVarH, (androidx.datastore.preferences.core.c) obj);
            }
        });
    }

    synchronized void r(final long j10) {
        try {
            this.f122111a.f(new Function1() { // from class: com.google.firebase.heartbeatinfo.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.a(j10, (androidx.datastore.preferences.core.c) obj);
                }
            });
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    @b1({b1.a.TESTS})
    q(com.google.firebase.datastorage.b bVar) {
        this.f122111a = bVar;
    }
}
