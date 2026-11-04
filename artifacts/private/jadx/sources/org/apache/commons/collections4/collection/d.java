package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import org.apache.commons.collections4.e0;
import org.apache.commons.collections4.functors.h0;
import org.apache.commons.collections4.l0;
import org.apache.commons.collections4.list.i;

/* JADX INFO: loaded from: classes14.dex */
public class d<E> extends org.apache.commons.collections4.collection.a<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f335606d = -5259182142076705162L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final l0<? super E> f335607c;

    public static class a<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l0<? super E> f335608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<E> f335609b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<E> f335610c = new ArrayList();

        public a(l0<? super E> l0Var) {
            if (l0Var == null) {
                throw new NullPointerException("Predicate must not be null");
            }
            this.f335608a = l0Var;
        }

        public a<E> a(E e10) {
            if (this.f335608a.a(e10)) {
                this.f335609b.add(e10);
                return this;
            }
            this.f335610c.add(e10);
            return this;
        }

        public a<E> b(Collection<? extends E> collection) {
            if (collection != null) {
                Iterator<? extends E> it = collection.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            return this;
        }

        public org.apache.commons.collections4.c<E> c() {
            return d(new org.apache.commons.collections4.bag.f());
        }

        public org.apache.commons.collections4.c<E> d(org.apache.commons.collections4.c<E> cVar) {
            if (cVar == null) {
                throw new NullPointerException("Bag must not be null.");
            }
            org.apache.commons.collections4.bag.g gVarP = org.apache.commons.collections4.bag.g.p(cVar, this.f335608a);
            gVarP.addAll(this.f335609b);
            return gVarP;
        }

        public List<E> e() {
            return f(new ArrayList());
        }

        public List<E> f(List<E> list) {
            if (list == null) {
                throw new NullPointerException("List must not be null.");
            }
            i iVarS = i.s(list, this.f335608a);
            iVarS.addAll(this.f335609b);
            return iVarS;
        }

        public e0<E> g() {
            return h(new org.apache.commons.collections4.multiset.d());
        }

        public e0<E> h(e0<E> e0Var) {
            if (e0Var == null) {
                throw new NullPointerException("MultiSet must not be null.");
            }
            org.apache.commons.collections4.multiset.e eVarP = org.apache.commons.collections4.multiset.e.p(e0Var, this.f335608a);
            eVarP.addAll(this.f335609b);
            return eVarP;
        }

        public Queue<E> i() {
            return j(new LinkedList());
        }

        public Queue<E> j(Queue<E> queue) {
            if (queue == null) {
                throw new NullPointerException("queue must not be null");
            }
            org.apache.commons.collections4.queue.c cVarP = org.apache.commons.collections4.queue.c.p(queue, this.f335608a);
            cVarP.addAll(this.f335609b);
            return cVarP;
        }

        public Set<E> k() {
            return l(new HashSet());
        }

        public Set<E> l(Set<E> set) {
            if (set == null) {
                throw new NullPointerException("Set must not be null.");
            }
            org.apache.commons.collections4.set.i iVarP = org.apache.commons.collections4.set.i.p(set, this.f335608a);
            iVarP.addAll(this.f335609b);
            return iVarP;
        }

        public Collection<E> m() {
            return Collections.unmodifiableCollection(this.f335610c);
        }
    }

    protected d(Collection<E> collection, l0<? super E> l0Var) {
        super(collection);
        if (l0Var == null) {
            throw new NullPointerException("Predicate must not be null.");
        }
        this.f335607c = l0Var;
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            m(it.next());
        }
    }

    public static <E> a<E> i(l0<? super E> l0Var) {
        return new a<>(l0Var);
    }

    public static <E> a<E> k() {
        return new a<>(h0.c());
    }

    public static <T> d<T> l(Collection<T> collection, l0<? super T> l0Var) {
        return new d<>(collection, l0Var);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean add(E e10) {
        m(e10);
        return c().add(e10);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            m(it.next());
        }
        return c().addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(E e10) {
        if (this.f335607c.a(e10)) {
            return;
        }
        throw new IllegalArgumentException("Cannot add Object '" + e10 + "' - Predicate '" + this.f335607c + "' rejected it");
    }
}
