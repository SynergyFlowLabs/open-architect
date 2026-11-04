package com.google.firebase.components;

import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.compose.animation.core.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class s implements h, i8.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final z8.b<Set<Object>> f120800i = new z8.b() { // from class: com.google.firebase.components.o
        @Override // z8.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<g<?>, z8.b<?>> f120801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<j0<?>, z8.b<?>> f120802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<j0<?>, c0<?>> f120803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<z8.b<ComponentRegistrar>> f120804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<String> f120805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z f120806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference<Boolean> f120807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m f120808h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f120809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<z8.b<ComponentRegistrar>> f120810b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<g<?>> f120811c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private m f120812d = m.f120792a;

        b(Executor executor) {
            this.f120809a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        @z7.a
        public b b(g<?> gVar) {
            this.f120811c.add(gVar);
            return this;
        }

        @z7.a
        public b c(final ComponentRegistrar componentRegistrar) {
            this.f120810b.add(new z8.b() { // from class: com.google.firebase.components.t
                @Override // z8.b
                public final Object get() {
                    return s.b.a(componentRegistrar);
                }
            });
            return this;
        }

        @z7.a
        public b d(Collection<z8.b<ComponentRegistrar>> collection) {
            this.f120810b.addAll(collection);
            return this;
        }

        public s e() {
            return new s(this.f120809a, this.f120810b, this.f120811c, this.f120812d);
        }

        @z7.a
        public b f(m mVar) {
            this.f120812d = mVar;
            return this;
        }
    }

    private static Iterable<z8.b<ComponentRegistrar>> A(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (final ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new z8.b() { // from class: com.google.firebase.components.n
                @Override // z8.b
                public final Object get() {
                    return s.n(componentRegistrar);
                }
            });
        }
        return arrayList;
    }

    public static /* synthetic */ Object l(s sVar, g gVar) {
        sVar.getClass();
        return gVar.k().a(new l0(gVar, sVar));
    }

    public static /* synthetic */ ComponentRegistrar n(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    public static b p(Executor executor) {
        return new b(executor);
    }

    private void q(List<g<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<z8.b<ComponentRegistrar>> it = this.f120804d.iterator();
                while (it.hasNext()) {
                    try {
                        ComponentRegistrar componentRegistrar = it.next().get();
                        if (componentRegistrar != null) {
                            list.addAll(this.f120808h.a(componentRegistrar));
                            it.remove();
                        }
                    } catch (a0 unused) {
                        it.remove();
                    }
                }
                Iterator<g<?>> it2 = list.iterator();
                while (it2.hasNext()) {
                    for (Object obj : it2.next().m().toArray()) {
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f120805e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f120805e.add(obj.toString());
                        }
                    }
                }
                if (this.f120801a.isEmpty()) {
                    u.a(list);
                } else {
                    ArrayList arrayList2 = new ArrayList(this.f120801a.keySet());
                    arrayList2.addAll(list);
                    u.a(arrayList2);
                }
                for (final g<?> gVar : list) {
                    this.f120801a.put(gVar, new b0(new z8.b() { // from class: com.google.firebase.components.p
                        @Override // z8.b
                        public final Object get() {
                            return s.l(this.f120794a, gVar);
                        }
                    }));
                }
                arrayList.addAll(y(list));
                arrayList.addAll(z());
                x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        w();
    }

    private void r(Map<g<?>, z8.b<?>> map, boolean z10) {
        for (Map.Entry<g<?>, z8.b<?>> entry : map.entrySet()) {
            g<?> key = entry.getKey();
            z8.b<?> value = entry.getValue();
            if (key.s() || (key.t() && z10)) {
                value.get();
            }
        }
        this.f120806f.f();
    }

    private static <T> List<T> v(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void w() {
        Boolean bool = this.f120807g.get();
        if (bool != null) {
            r(this.f120801a, bool.booleanValue());
        }
    }

    private void x() {
        for (g<?> gVar : this.f120801a.keySet()) {
            for (v vVar : gVar.j()) {
                if (vVar.h() && !this.f120803c.containsKey(vVar.d())) {
                    this.f120803c.put(vVar.d(), c0.b(Collections.EMPTY_SET));
                } else if (this.f120802b.containsKey(vVar.d())) {
                    continue;
                } else {
                    if (vVar.g()) {
                        throw new d0(String.format("Unsatisfied dependency for component %s: %s", gVar, vVar.d()));
                    }
                    if (!vVar.h()) {
                        this.f120802b.put(vVar.d(), h0.e());
                    }
                }
            }
        }
    }

    private List<Runnable> y(List<g<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (g<?> gVar : list) {
            if (gVar.v()) {
                final z8.b<?> bVar = this.f120801a.get(gVar);
                for (j0<? super Object> j0Var : gVar.m()) {
                    if (this.f120802b.containsKey(j0Var)) {
                        final h0 h0Var = (h0) this.f120802b.get(j0Var);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                h0Var.g(bVar);
                            }
                        });
                    } else {
                        this.f120802b.put(j0Var, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> z() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<g<?>, z8.b<?>> entry : this.f120801a.entrySet()) {
            g<?> key = entry.getKey();
            if (!key.v()) {
                z8.b<?> value = entry.getValue();
                for (j0<? super Object> j0Var : key.m()) {
                    if (!map.containsKey(j0Var)) {
                        map.put(j0Var, new HashSet());
                    }
                    ((Set) map.get(j0Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f120803c.containsKey(entry2.getKey())) {
                final c0<?> c0Var = this.f120803c.get(entry2.getKey());
                for (final z8.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            c0Var.a(bVar);
                        }
                    });
                }
            } else {
                this.f120803c.put((j0) entry2.getKey(), c0.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // i8.a
    public void b() {
        synchronized (this) {
            try {
                if (this.f120804d.isEmpty()) {
                    return;
                }
                q(new ArrayList());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.firebase.components.h
    public <T> z8.a<T> f(j0<T> j0Var) {
        z8.b<T> bVarG = g(j0Var);
        if (bVarG == null) {
            return h0.e();
        }
        return bVarG instanceof h0 ? (h0) bVarG : h0.f(bVarG);
    }

    @Override // com.google.firebase.components.h
    public synchronized <T> z8.b<T> g(j0<T> j0Var) {
        try {
            i0.c(j0Var, "Null interface requested.");
        } catch (Throwable th2) {
            throw th2;
        }
        return (z8.b) this.f120802b.get(j0Var);
    }

    @Override // com.google.firebase.components.h
    public synchronized <T> z8.b<Set<T>> i(j0<T> j0Var) {
        try {
            c0<?> c0Var = this.f120803c.get(j0Var);
            if (c0Var != null) {
                return c0Var;
            }
            return (z8.b<Set<T>>) f120800i;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    Collection<g<?>> s() {
        return this.f120801a.keySet();
    }

    @l1
    @b1({b1.a.TESTS})
    public void t() {
        Iterator<z8.b<?>> it = this.f120801a.values().iterator();
        while (it.hasNext()) {
            it.next().get();
        }
    }

    public void u(boolean z10) {
        HashMap map;
        if (z1.a(this.f120807g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f120801a);
            }
            r(map, z10);
        }
    }

    @Deprecated
    public s(Executor executor, Iterable<ComponentRegistrar> iterable, g<?>... gVarArr) {
        this(executor, A(iterable), Arrays.asList(gVarArr), m.f120792a);
    }

    private s(Executor executor, Iterable<z8.b<ComponentRegistrar>> iterable, Collection<g<?>> collection, m mVar) {
        this.f120801a = new HashMap();
        this.f120802b = new HashMap();
        this.f120803c = new HashMap();
        this.f120805e = new HashSet();
        this.f120807g = new AtomicReference<>();
        z zVar = new z(executor);
        this.f120806f = zVar;
        this.f120808h = mVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(g.y(zVar, z.class, m8.d.class, m8.c.class));
        int i10 = 1 << 0;
        arrayList.add(g.y(this, i8.a.class, new Class[0]));
        for (g<?> gVar : collection) {
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        this.f120804d = v(iterable);
        q(arrayList);
    }
}
