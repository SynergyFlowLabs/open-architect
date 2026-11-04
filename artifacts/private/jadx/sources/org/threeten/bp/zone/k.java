package org.threeten.bp.zone;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList<k> f340559a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, k> f340560b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        j.a();
    }

    protected k() {
    }

    public static Set<String> a() {
        return Collections.unmodifiableSet(f340560b.keySet());
    }

    private static k b(String str) {
        ConcurrentMap<String, k> concurrentMap = f340560b;
        k kVar = concurrentMap.get(str);
        if (kVar != null) {
            return kVar;
        }
        if (concurrentMap.isEmpty()) {
            throw new i("No time-zone data files registered");
        }
        throw new i("Unknown time-zone ID: " + str);
    }

    public static g c(String str, boolean z10) {
        cn.d.j(str, "zoneId");
        return b(str).f(str, z10);
    }

    public static NavigableMap<String, g> d(String str) {
        cn.d.j(str, "zoneId");
        return b(str).g(str);
    }

    public static boolean i() {
        Iterator<k> it = f340559a.iterator();
        boolean zE = false;
        while (it.hasNext()) {
            zE |= it.next().e();
        }
        return zE;
    }

    public static void j(k kVar) {
        cn.d.j(kVar, "provider");
        k(kVar);
        f340559a.add(kVar);
    }

    private static void k(k kVar) {
        for (String str : kVar.h()) {
            cn.d.j(str, "zoneId");
            if (f340560b.putIfAbsent(str, kVar) != null) {
                throw new i("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + kVar);
            }
        }
    }

    protected boolean e() {
        return false;
    }

    protected abstract g f(String str, boolean z10);

    protected abstract NavigableMap<String, g> g(String str);

    protected abstract Set<String> h();
}
