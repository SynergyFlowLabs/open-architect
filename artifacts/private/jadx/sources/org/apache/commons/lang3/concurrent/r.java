package org.apache.commons.lang3.concurrent;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public class r extends d<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, d<?>> f337122d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, d<?>> f337123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, Object> f337124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<String, j> f337125c;

        private d<?> a(String str) {
            d<?> dVar = this.f337123a.get(str);
            if (dVar != null) {
                return dVar;
            }
            throw new NoSuchElementException("No child initializer with name " + str);
        }

        public j b(String str) {
            a(str);
            return this.f337125c.get(str);
        }

        public d<?> c(String str) {
            return a(str);
        }

        public Object d(String str) {
            a(str);
            return this.f337124b.get(str);
        }

        public Set<String> e() {
            return Collections.unmodifiableSet(this.f337123a.keySet());
        }

        public boolean f(String str) {
            a(str);
            return this.f337125c.containsKey(str);
        }

        public boolean g() {
            return this.f337125c.isEmpty();
        }

        private b(Map<String, d<?>> map, Map<String, Object> map2, Map<String, j> map3) {
            this.f337123a = map;
            this.f337124b = map2;
            this.f337125c = map3;
        }
    }

    public r() {
        this.f337122d = new HashMap();
    }

    @Override // org.apache.commons.lang3.concurrent.d
    protected int f() {
        Iterator<d<?>> it = this.f337122d.values().iterator();
        int iF = 1;
        while (it.hasNext()) {
            iF += it.next().f();
        }
        return iF;
    }

    public void k(String str, d<?> dVar) {
        c0.v(str != null, "Name of child initializer must not be null!", new Object[0]);
        c0.v(dVar != null, "Child initializer must not be null!", new Object[0]);
        synchronized (this) {
            try {
                if (h()) {
                    throw new IllegalStateException("addInitializer() must not be called after start()!");
                }
                this.f337122d.put(str, dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.lang3.concurrent.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b g() throws Exception {
        HashMap map;
        synchronized (this) {
            try {
                map = new HashMap(this.f337122d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ExecutorService executorServiceC = c();
        for (d dVar : map.values()) {
            if (dVar.d() == null) {
                dVar.i(executorServiceC);
            }
            dVar.j();
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            try {
                map2.put(entry.getKey(), ((d) entry.getValue()).get());
            } catch (j e10) {
                map3.put(entry.getKey(), e10);
            }
        }
        return new b(map, map2, map3);
    }

    public r(ExecutorService executorService) {
        super(executorService);
        this.f337122d = new HashMap();
    }
}
