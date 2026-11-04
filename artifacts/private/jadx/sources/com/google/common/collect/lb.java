package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
public class lb<C extends Comparable<?>> extends k<C> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    final NavigableMap<u3<C>, f9<C>> f117641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Set<f9<C>> f117642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Set<f9<C>> f117643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient i9<C> f117644d;

    final class b extends v4<f9<C>> implements Set<f9<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Collection<f9<C>> f117645a;

        b(Collection<f9<C>> delegate) {
            this.f117645a = delegate;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.v4, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0 */
        public Collection<f9<C>> i1() {
            return this.f117645a;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@fj.a Object o10) {
            return z9.g(this, o10);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return z9.k(this);
        }
    }

    private final class c extends lb<C> {
        c() {
            super(new d(lb.this.f117641a));
        }

        @Override // com.google.common.collect.lb, com.google.common.collect.k, com.google.common.collect.i9
        public void a(f9<C> rangeToRemove) {
            lb.this.o(rangeToRemove);
        }

        @Override // com.google.common.collect.lb, com.google.common.collect.k, com.google.common.collect.i9
        public boolean c(C value) {
            return !lb.this.c(value);
        }

        @Override // com.google.common.collect.lb, com.google.common.collect.i9
        public i9<C> d() {
            return lb.this;
        }

        @Override // com.google.common.collect.lb, com.google.common.collect.k, com.google.common.collect.i9
        public void o(f9<C> rangeToAdd) {
            lb.this.a(rangeToAdd);
        }
    }

    private static final class d<C extends Comparable<?>> extends j<u3<C>, f9<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NavigableMap<u3<C>, f9<C>> f117648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableMap<u3<C>, f9<C>> f117649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f9<u3<C>> f117650c;

        class a extends com.google.common.collect.c<Map.Entry<u3<C>, f9<C>>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            u3<C> f117651c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ u3 f117652d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c9 f117653e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f117654f;

            a(final d this$0, final u3 val$firstComplementRangeLowerBound, final c9 val$positiveItr) {
                this.f117652d = val$firstComplementRangeLowerBound;
                this.f117653e = val$positiveItr;
                this.f117654f = this$0;
                this.f117651c = val$firstComplementRangeLowerBound;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Map.Entry<u3<C>, f9<C>> b() {
                f9 f9VarK;
                if (!this.f117654f.f117650c.f117397b.w(this.f117651c) && this.f117651c != u3.k()) {
                    if (this.f117653e.hasNext()) {
                        f9 f9Var = (f9) this.f117653e.next();
                        f9VarK = f9.k(this.f117651c, f9Var.f117396a);
                        this.f117651c = f9Var.f117397b;
                    } else {
                        f9VarK = f9.k(this.f117651c, u3.k());
                        this.f117651c = u3.k();
                    }
                    return b8.O(f9VarK.f117396a, f9VarK);
                }
                return (Map.Entry) c();
            }
        }

        class b extends com.google.common.collect.c<Map.Entry<u3<C>, f9<C>>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            u3<C> f117655c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ u3 f117656d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c9 f117657e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f117658f;

            b(final d this$0, final u3 val$firstComplementRangeUpperBound, final c9 val$positiveItr) {
                this.f117656d = val$firstComplementRangeUpperBound;
                this.f117657e = val$positiveItr;
                this.f117658f = this$0;
                this.f117655c = val$firstComplementRangeUpperBound;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Map.Entry<u3<C>, f9<C>> b() {
                if (this.f117655c == u3.n()) {
                    return (Map.Entry) c();
                }
                if (this.f117657e.hasNext()) {
                    f9 f9Var = (f9) this.f117657e.next();
                    f9 f9VarK = f9.k(f9Var.f117397b, this.f117655c);
                    this.f117655c = f9Var.f117396a;
                    if (this.f117658f.f117650c.f117396a.w(f9VarK.f117396a)) {
                        return b8.O(f9VarK.f117396a, f9VarK);
                    }
                } else if (this.f117658f.f117650c.f117396a.w(u3.n())) {
                    f9 f9VarK2 = f9.k(u3.n(), this.f117655c);
                    this.f117655c = u3.n();
                    return b8.O(u3.n(), f9VarK2);
                }
                return (Map.Entry) c();
            }
        }

        d(NavigableMap<u3<C>, f9<C>> positiveRangesByLowerBound) {
            this(positiveRangesByLowerBound, f9.a());
        }

        private NavigableMap<u3<C>, f9<C>> g(f9<u3<C>> subWindow) {
            if (!this.f117650c.t(subWindow)) {
                return c7.h0();
            }
            return new d(this.f117648a, subWindow.s(this.f117650c));
        }

        @Override // com.google.common.collect.b8.a0
        Iterator<Map.Entry<u3<C>, f9<C>>> a() {
            Collection<f9<C>> collectionValues;
            u3 u3VarN;
            if (this.f117650c.q()) {
                collectionValues = this.f117649b.tailMap((u3) this.f117650c.y(), this.f117650c.x() == x.CLOSED).values();
            } else {
                collectionValues = this.f117649b.values();
            }
            c9 c9VarS = p7.S(collectionValues.iterator());
            if (this.f117650c.i(u3.n()) && (!c9VarS.hasNext() || ((f9) c9VarS.peek()).f117396a != u3.n())) {
                u3VarN = u3.n();
            } else {
                if (!c9VarS.hasNext()) {
                    return p7.t();
                }
                u3VarN = ((f9) c9VarS.next()).f117397b;
            }
            return new a(this, u3VarN, c9VarS);
        }

        @Override // com.google.common.collect.j
        Iterator<Map.Entry<u3<C>, f9<C>>> b() {
            u3<C> u3VarHigherKey;
            c9 c9VarS = p7.S(this.f117649b.headMap(this.f117650c.r() ? (u3) this.f117650c.J() : u3.k(), this.f117650c.r() && this.f117650c.I() == x.CLOSED).descendingMap().values().iterator());
            if (c9VarS.hasNext()) {
                u3VarHigherKey = ((f9) c9VarS.peek()).f117397b == u3.k() ? ((f9) c9VarS.next()).f117396a : this.f117648a.higherKey(((f9) c9VarS.peek()).f117397b);
            } else {
                if (!this.f117650c.i(u3.n()) || this.f117648a.containsKey(u3.n())) {
                    return p7.t();
                }
                u3VarHigherKey = this.f117648a.higherKey(u3.n());
            }
            return new b(this, (u3) com.google.common.base.b0.a(u3VarHigherKey, u3.k()), c9VarS);
        }

        @Override // java.util.SortedMap
        public Comparator<? super u3<C>> comparator() {
            return a9.z();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return get(key) != null;
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public f9<C> get(@fj.a Object key) {
            if (key instanceof u3) {
                try {
                    u3<C> u3Var = (u3) key;
                    Map.Entry<u3<C>, f9<C>> entryFirstEntry = tailMap(u3Var, true).firstEntry();
                    if (entryFirstEntry != null && entryFirstEntry.getKey().equals(u3Var)) {
                        return entryFirstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap<u3<C>, f9<C>> headMap(u3<C> toKey, boolean inclusive) {
            return g(f9.G(toKey, x.l(inclusive)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<u3<C>, f9<C>> subMap(u3<C> fromKey, boolean fromInclusive, u3<C> toKey, boolean toInclusive) {
            return g(f9.B(fromKey, x.l(fromInclusive), toKey, x.l(toInclusive)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<u3<C>, f9<C>> tailMap(u3<C> fromKey, boolean inclusive) {
            return g(f9.l(fromKey, x.l(inclusive)));
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return p7.Y(a());
        }

        private d(NavigableMap<u3<C>, f9<C>> positiveRangesByLowerBound, f9<u3<C>> window) {
            this.f117648a = positiveRangesByLowerBound;
            this.f117649b = new e(positiveRangesByLowerBound);
            this.f117650c = window;
        }
    }

    private final class f extends lb<C> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final f9<C> f117665e;

        /* JADX WARN: Illegal instructions before constructor call */
        f(f9<C> restriction) {
            super(new g(f9.a(), restriction, lb.this.f117641a));
            this.f117665e = restriction;
        }

        @Override // com.google.common.collect.lb, com.google.common.collect.k, com.google.common.collect.i9
        public void a(f9<C> rangeToRemove) {
            if (rangeToRemove.t(this.f117665e)) {
                lb.this.a(rangeToRemove.s(this.f117665e));
            }
        }

        @Override // com.google.common.collect.lb, com.google.common.collect.k, com.google.common.collect.i9
        public boolean c(C value) {
            return this.f117665e.i(value) && lb.this.c(value);
        }

        @Override // com.google.common.collect.lb, com.google.common.collect.k, com.google.common.collect.i9
        public void clear() {
            lb.this.a(this.f117665e);
        }

        @Override // com.google.common.collect.lb, com.google.common.collect.k, com.google.common.collect.i9
        @fj.a
        public f9<C> h(C value) {
            f9<C> f9VarH;
            if (this.f117665e.i(value) && (f9VarH = lb.this.h(value)) != null) {
                return f9VarH.s(this.f117665e);
            }
            return null;
        }

        @Override // com.google.common.collect.lb, com.google.common.collect.k, com.google.common.collect.i9
        public boolean i(f9<C> range) {
            f9 f9VarV;
            return (this.f117665e.u() || !this.f117665e.n(range) || (f9VarV = lb.this.v(range)) == null || f9VarV.s(this.f117665e).u()) ? false : true;
        }

        @Override // com.google.common.collect.lb, com.google.common.collect.i9
        public i9<C> k(f9<C> view) {
            if (view.n(this.f117665e)) {
                return this;
            }
            return view.t(this.f117665e) ? new f(this.f117665e.s(view)) : y6.E();
        }

        @Override // com.google.common.collect.lb, com.google.common.collect.k, com.google.common.collect.i9
        public void o(f9<C> rangeToAdd) {
            com.google.common.base.j0.y(this.f117665e.n(rangeToAdd), "Cannot add range %s to subRangeSet(%s)", rangeToAdd, this.f117665e);
            lb.this.o(rangeToAdd);
        }
    }

    private static final class g<C extends Comparable<?>> extends j<u3<C>, f9<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f9<u3<C>> f117667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f9<C> f117668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final NavigableMap<u3<C>, f9<C>> f117669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final NavigableMap<u3<C>, f9<C>> f117670d;

        class a extends com.google.common.collect.c<Map.Entry<u3<C>, f9<C>>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f117671c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ u3 f117672d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ g f117673e;

            a(final g this$0, final Iterator val$completeRangeItr, final u3 val$upperBoundOnLowerBounds) {
                this.f117671c = val$completeRangeItr;
                this.f117672d = val$upperBoundOnLowerBounds;
                this.f117673e = this$0;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Map.Entry<u3<C>, f9<C>> b() {
                if (!this.f117671c.hasNext()) {
                    return (Map.Entry) c();
                }
                f9 f9Var = (f9) this.f117671c.next();
                if (this.f117672d.w(f9Var.f117396a)) {
                    return (Map.Entry) c();
                }
                f9 f9VarS = f9Var.s(this.f117673e.f117668b);
                return b8.O(f9VarS.f117396a, f9VarS);
            }
        }

        class b extends com.google.common.collect.c<Map.Entry<u3<C>, f9<C>>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f117674c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ g f117675d;

            b(final g this$0, final Iterator val$completeRangeItr) {
                this.f117674c = val$completeRangeItr;
                this.f117675d = this$0;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Map.Entry<u3<C>, f9<C>> b() {
                if (!this.f117674c.hasNext()) {
                    return (Map.Entry) c();
                }
                f9 f9Var = (f9) this.f117674c.next();
                if (this.f117675d.f117668b.f117396a.compareTo(f9Var.f117397b) >= 0) {
                    return (Map.Entry) c();
                }
                f9 f9VarS = f9Var.s(this.f117675d.f117668b);
                return this.f117675d.f117667a.i(f9VarS.f117396a) ? b8.O(f9VarS.f117396a, f9VarS) : (Map.Entry) c();
            }
        }

        private NavigableMap<u3<C>, f9<C>> h(f9<u3<C>> window) {
            return !window.t(this.f117667a) ? c7.h0() : new g(this.f117667a.s(window), this.f117668b, this.f117669c);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.b8.a0
        Iterator<Map.Entry<u3<C>, f9<C>>> a() {
            Iterator<f9<C>> it;
            if (!this.f117668b.u() && !this.f117667a.f117397b.w(this.f117668b.f117396a)) {
                boolean z10 = false;
                if (this.f117667a.f117396a.w(this.f117668b.f117396a)) {
                    it = this.f117670d.tailMap(this.f117668b.f117396a, false).values().iterator();
                } else {
                    NavigableMap<u3<C>, f9<C>> navigableMap = this.f117669c;
                    u3<C> u3Var = (u3) this.f117667a.f117396a.t();
                    if (this.f117667a.x() == x.CLOSED) {
                        z10 = true;
                        boolean z11 = false | true;
                    }
                    it = navigableMap.tailMap(u3Var, z10).values().iterator();
                }
                return new a(this, it, (u3) a9.z().w(this.f117667a.f117397b, u3.o(this.f117668b.f117397b)));
            }
            return p7.t();
        }

        @Override // com.google.common.collect.j
        Iterator<Map.Entry<u3<C>, f9<C>>> b() {
            if (this.f117668b.u()) {
                return p7.t();
            }
            u3 u3Var = (u3) a9.z().w(this.f117667a.f117397b, u3.o(this.f117668b.f117397b));
            return new b(this, this.f117669c.headMap((u3) u3Var.t(), u3Var.D() == x.CLOSED).descendingMap().values().iterator());
        }

        @Override // java.util.SortedMap
        public Comparator<? super u3<C>> comparator() {
            return a9.z();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return get(key) != null;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public f9<C> get(@fj.a Object key) {
            if (key instanceof u3) {
                try {
                    u3<C> u3Var = (u3) key;
                    if (this.f117667a.i(u3Var) && u3Var.compareTo(this.f117668b.f117396a) >= 0 && u3Var.compareTo(this.f117668b.f117397b) < 0) {
                        if (u3Var.equals(this.f117668b.f117396a)) {
                            f9 f9Var = (f9) b8.S0(this.f117669c.floorEntry(u3Var));
                            if (f9Var != null && f9Var.f117397b.compareTo(this.f117668b.f117396a) > 0) {
                                return f9Var.s(this.f117668b);
                            }
                        } else {
                            f9<C> f9Var2 = this.f117669c.get(u3Var);
                            if (f9Var2 != null) {
                                return f9Var2.s(this.f117668b);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<u3<C>, f9<C>> headMap(u3<C> toKey, boolean inclusive) {
            return h(f9.G(toKey, x.l(inclusive)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<u3<C>, f9<C>> subMap(u3<C> fromKey, boolean fromInclusive, u3<C> toKey, boolean toInclusive) {
            return h(f9.B(fromKey, x.l(fromInclusive), toKey, x.l(toInclusive)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<u3<C>, f9<C>> tailMap(u3<C> fromKey, boolean inclusive) {
            return h(f9.l(fromKey, x.l(inclusive)));
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return p7.Y(a());
        }

        private g(f9<u3<C>> lowerBoundWindow, f9<C> restriction, NavigableMap<u3<C>, f9<C>> rangesByLowerBound) {
            this.f117667a = (f9) com.google.common.base.j0.E(lowerBoundWindow);
            this.f117668b = (f9) com.google.common.base.j0.E(restriction);
            this.f117669c = (NavigableMap) com.google.common.base.j0.E(rangesByLowerBound);
            this.f117670d = new e(rangesByLowerBound);
        }
    }

    public static <C extends Comparable<?>> lb<C> s() {
        return new lb<>(new TreeMap());
    }

    public static <C extends Comparable<?>> lb<C> t(i9<C> rangeSet) {
        lb<C> lbVarS = s();
        lbVarS.q(rangeSet);
        return lbVarS;
    }

    public static <C extends Comparable<?>> lb<C> u(Iterable<f9<C>> ranges) {
        lb<C> lbVarS = s();
        lbVarS.p(ranges);
        return lbVarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fj.a
    public f9<C> v(f9<C> range) {
        com.google.common.base.j0.E(range);
        Map.Entry<u3<C>, f9<C>> entryFloorEntry = this.f117641a.floorEntry(range.f117396a);
        if (entryFloorEntry == null || !entryFloorEntry.getValue().n(range)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    private void w(f9<C> range) {
        if (range.u()) {
            this.f117641a.remove(range.f117396a);
        } else {
            this.f117641a.put(range.f117396a, range);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public void a(f9<C> rangeToRemove) {
        com.google.common.base.j0.E(rangeToRemove);
        if (rangeToRemove.u()) {
            return;
        }
        Map.Entry<u3<C>, f9<C>> entryLowerEntry = this.f117641a.lowerEntry(rangeToRemove.f117396a);
        if (entryLowerEntry != null) {
            f9<C> value = entryLowerEntry.getValue();
            if (value.f117397b.compareTo(rangeToRemove.f117396a) >= 0) {
                if (rangeToRemove.r() && value.f117397b.compareTo(rangeToRemove.f117397b) >= 0) {
                    w(f9.k(rangeToRemove.f117397b, value.f117397b));
                }
                w(f9.k(value.f117396a, rangeToRemove.f117396a));
            }
        }
        Map.Entry<u3<C>, f9<C>> entryFloorEntry = this.f117641a.floorEntry(rangeToRemove.f117397b);
        if (entryFloorEntry != null) {
            f9<C> value2 = entryFloorEntry.getValue();
            if (rangeToRemove.r() && value2.f117397b.compareTo(rangeToRemove.f117397b) >= 0) {
                w(f9.k(rangeToRemove.f117397b, value2.f117397b));
            }
        }
        this.f117641a.subMap(rangeToRemove.f117396a, rangeToRemove.f117397b).clear();
    }

    @Override // com.google.common.collect.i9
    public f9<C> b() {
        Map.Entry<u3<C>, f9<C>> entryFirstEntry = this.f117641a.firstEntry();
        Map.Entry<u3<C>, f9<C>> entryLastEntry = this.f117641a.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return f9.k(entryFirstEntry.getValue().f117396a, entryLastEntry.getValue().f117397b);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ boolean c(Comparable value) {
        return super.c(value);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.i9
    public i9<C> d() {
        i9<C> i9Var = this.f117644d;
        if (i9Var != null) {
            return i9Var;
        }
        c cVar = new c();
        this.f117644d = cVar;
        return cVar;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public boolean e(f9<C> range) {
        com.google.common.base.j0.E(range);
        Map.Entry<u3<C>, f9<C>> entryCeilingEntry = this.f117641a.ceilingEntry(range.f117396a);
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().t(range) && !entryCeilingEntry.getValue().s(range).u()) {
            return true;
        }
        Map.Entry<u3<C>, f9<C>> entryLowerEntry = this.f117641a.lowerEntry(range.f117396a);
        return (entryLowerEntry == null || !entryLowerEntry.getValue().t(range) || entryLowerEntry.getValue().s(range).u()) ? false : true;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ boolean equals(@fj.a Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ void f(Iterable ranges) {
        super.f(ranges);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ boolean g(i9 other) {
        return super.g(other);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    @fj.a
    public f9<C> h(C value) {
        com.google.common.base.j0.E(value);
        Map.Entry<u3<C>, f9<C>> entryFloorEntry = this.f117641a.floorEntry(u3.o(value));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().i(value)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public boolean i(f9<C> range) {
        com.google.common.base.j0.E(range);
        Map.Entry<u3<C>, f9<C>> entryFloorEntry = this.f117641a.floorEntry(range.f117396a);
        return entryFloorEntry != null && entryFloorEntry.getValue().n(range);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ boolean j(Iterable ranges) {
        return super.j(ranges);
    }

    @Override // com.google.common.collect.i9
    public i9<C> k(f9<C> view) {
        return view.equals(f9.a()) ? this : new f(view);
    }

    @Override // com.google.common.collect.i9
    public Set<f9<C>> l() {
        Set<f9<C>> set = this.f117643c;
        if (set != null) {
            return set;
        }
        b bVar = new b(this.f117641a.descendingMap().values());
        this.f117643c = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.i9
    public Set<f9<C>> m() {
        Set<f9<C>> set = this.f117642b;
        if (set != null) {
            return set;
        }
        b bVar = new b(this.f117641a.values());
        this.f117642b = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ void n(i9 other) {
        super.n(other);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public void o(f9<C> f9Var) {
        com.google.common.base.j0.E(f9Var);
        if (f9Var.u()) {
            return;
        }
        u3<C> u3Var = f9Var.f117396a;
        u3<C> u3Var2 = f9Var.f117397b;
        Map.Entry<u3<C>, f9<C>> entryLowerEntry = this.f117641a.lowerEntry(u3Var);
        if (entryLowerEntry != null) {
            f9<C> value = entryLowerEntry.getValue();
            if (value.f117397b.compareTo(u3Var) >= 0) {
                if (value.f117397b.compareTo(u3Var2) >= 0) {
                    u3Var2 = value.f117397b;
                }
                u3Var = value.f117396a;
            }
        }
        Map.Entry<u3<C>, f9<C>> entryFloorEntry = this.f117641a.floorEntry(u3Var2);
        if (entryFloorEntry != null) {
            f9<C> value2 = entryFloorEntry.getValue();
            if (value2.f117397b.compareTo(u3Var2) >= 0) {
                u3Var2 = value2.f117397b;
            }
        }
        this.f117641a.subMap(u3Var, u3Var2).clear();
        w(f9.k(u3Var, u3Var2));
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ void p(Iterable ranges) {
        super.p(ranges);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.i9
    public /* bridge */ /* synthetic */ void q(i9 other) {
        super.q(other);
    }

    private lb(NavigableMap<u3<C>, f9<C>> rangesByLowerCut) {
        this.f117641a = rangesByLowerCut;
    }

    @com.google.common.annotations.e
    static final class e<C extends Comparable<?>> extends j<u3<C>, f9<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NavigableMap<u3<C>, f9<C>> f117659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f9<u3<C>> f117660b;

        class a extends com.google.common.collect.c<Map.Entry<u3<C>, f9<C>>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f117661c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f117662d;

            a(final e this$0, final Iterator val$backingItr) {
                this.f117661c = val$backingItr;
                this.f117662d = this$0;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Map.Entry<u3<C>, f9<C>> b() {
                if (!this.f117661c.hasNext()) {
                    return (Map.Entry) c();
                }
                f9 f9Var = (f9) this.f117661c.next();
                return this.f117662d.f117660b.f117397b.w(f9Var.f117397b) ? (Map.Entry) c() : b8.O(f9Var.f117397b, f9Var);
            }
        }

        class b extends com.google.common.collect.c<Map.Entry<u3<C>, f9<C>>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c9 f117663c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f117664d;

            b(final e this$0, final c9 val$backingItr) {
                this.f117663c = val$backingItr;
                this.f117664d = this$0;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.c
            @fj.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Map.Entry<u3<C>, f9<C>> b() {
                if (!this.f117663c.hasNext()) {
                    return (Map.Entry) c();
                }
                f9 f9Var = (f9) this.f117663c.next();
                return this.f117664d.f117660b.f117396a.w(f9Var.f117397b) ? b8.O(f9Var.f117397b, f9Var) : (Map.Entry) c();
            }
        }

        e(NavigableMap<u3<C>, f9<C>> rangesByLowerBound) {
            this.f117659a = rangesByLowerBound;
            this.f117660b = f9.a();
        }

        private NavigableMap<u3<C>, f9<C>> g(f9<u3<C>> window) {
            return window.t(this.f117660b) ? new e(this.f117659a, window.s(this.f117660b)) : c7.h0();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.b8.a0
        Iterator<Map.Entry<u3<C>, f9<C>>> a() {
            Map.Entry<u3<C>, f9<C>> entryLowerEntry;
            Iterator<f9<C>> it;
            if (this.f117660b.q() && (entryLowerEntry = this.f117659a.lowerEntry((u3) this.f117660b.y())) != null) {
                it = this.f117660b.f117396a.w(entryLowerEntry.getValue().f117397b) ? this.f117659a.tailMap(entryLowerEntry.getKey(), true).values().iterator() : this.f117659a.tailMap((u3) this.f117660b.y(), true).values().iterator();
            } else {
                it = this.f117659a.values().iterator();
            }
            return new a(this, it);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.j
        Iterator<Map.Entry<u3<C>, f9<C>>> b() {
            c9 c9VarS = p7.S((this.f117660b.r() ? this.f117659a.headMap((u3) this.f117660b.J(), false).descendingMap().values() : this.f117659a.descendingMap().values()).iterator());
            if (c9VarS.hasNext() && this.f117660b.f117397b.w(((f9) c9VarS.peek()).f117397b)) {
                c9VarS.next();
            }
            return new b(this, c9VarS);
        }

        @Override // java.util.SortedMap
        public Comparator<? super u3<C>> comparator() {
            return a9.z();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return get(key) != null;
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public f9<C> get(@fj.a Object key) {
            Map.Entry<u3<C>, f9<C>> entryLowerEntry;
            if (key instanceof u3) {
                try {
                    u3<C> u3Var = (u3) key;
                    if (this.f117660b.i(u3Var) && (entryLowerEntry = this.f117659a.lowerEntry(u3Var)) != null && entryLowerEntry.getValue().f117397b.equals(u3Var)) {
                        return entryLowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap<u3<C>, f9<C>> headMap(u3<C> toKey, boolean inclusive) {
            return g(f9.G(toKey, x.l(inclusive)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<u3<C>, f9<C>> subMap(u3<C> fromKey, boolean fromInclusive, u3<C> toKey, boolean toInclusive) {
            return g(f9.B(fromKey, x.l(fromInclusive), toKey, x.l(toInclusive)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<u3<C>, f9<C>> tailMap(u3<C> fromKey, boolean inclusive) {
            return g(f9.l(fromKey, x.l(inclusive)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            if (this.f117660b.equals(f9.a())) {
                return this.f117659a.isEmpty();
            }
            return !a().hasNext();
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f117660b.equals(f9.a()) ? this.f117659a.size() : p7.Y(a());
        }

        private e(NavigableMap<u3<C>, f9<C>> rangesByLowerBound, f9<u3<C>> upperBoundWindow) {
            this.f117659a = rangesByLowerBound;
            this.f117660b = upperBoundWindow;
        }
    }
}
