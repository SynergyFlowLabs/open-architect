package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
class u {

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g<?> f120814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<b> f120815b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<b> f120816c = new HashSet();

        b(g<?> gVar) {
            this.f120814a = gVar;
        }

        void a(b bVar) {
            this.f120815b.add(bVar);
        }

        void b(b bVar) {
            this.f120816c.add(bVar);
        }

        g<?> c() {
            return this.f120814a;
        }

        Set<b> d() {
            return this.f120815b;
        }

        boolean e() {
            return this.f120815b.isEmpty();
        }

        boolean f() {
            return this.f120816c.isEmpty();
        }

        void g(b bVar) {
            this.f120816c.remove(bVar);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j0<?> f120817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f120818b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f120817a.equals(this.f120817a) && cVar.f120818b == this.f120818b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Boolean.valueOf(this.f120818b).hashCode() ^ ((this.f120817a.hashCode() ^ 1000003) * 1000003);
        }

        private c(j0<?> j0Var, boolean z10) {
            this.f120817a = j0Var;
            this.f120818b = z10;
        }
    }

    u() {
    }

    static void a(List<g<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i10++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new w(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<g<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<g<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (v vVar : bVar.c().j()) {
                            if (vVar.f() && (set = (Set) map.get(new c(vVar.d(), vVar.h()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            g<?> next = it.next();
            b bVar3 = new b(next);
            for (j0<? super Object> j0Var : next.m()) {
                c cVar = new c(j0Var, !next.v());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f120818b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", j0Var));
                }
                set2.add(bVar3);
            }
        }
    }
}
