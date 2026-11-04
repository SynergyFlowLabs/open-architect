package com.google.common.graph;

import com.google.common.collect.l6;
import com.google.common.collect.nb;
import com.google.common.collect.p7;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
@g0
final class b0<N, V> implements o0<N, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f118562e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<N, Object> f118563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private final List<f<N>> f118564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f118565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f118566d;

    class a extends AbstractSet<N> {

        /* JADX INFO: renamed from: com.google.common.graph.b0$a$a, reason: collision with other inner class name */
        class C1081a extends com.google.common.collect.c<N> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f118568c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Set f118569d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f118570e;

            C1081a(final a this$1, final Iterator val$nodeConnections, final Set val$seenNodes) {
                this.f118568c = val$nodeConnections;
                this.f118569d = val$seenNodes;
                this.f118570e = this$1;
            }

            @Override // com.google.common.collect.c
            @fj.a
            protected N b() {
                while (this.f118568c.hasNext()) {
                    f fVar = (f) this.f118568c.next();
                    if (this.f118569d.add(fVar.f118585a)) {
                        return fVar.f118585a;
                    }
                }
                return c();
            }
        }

        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public nb<N> iterator() {
            return new C1081a(this, b0.this.f118564b.iterator(), new HashSet());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object obj) {
            return b0.this.f118563a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.f118563a.size();
        }
    }

    class b extends AbstractSet<N> {

        class a extends com.google.common.collect.c<N> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f118572c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f118573d;

            a(final b this$1, final Iterator val$entries) {
                this.f118572c = val$entries;
                this.f118573d = this$1;
            }

            @Override // com.google.common.collect.c
            @fj.a
            protected N b() {
                while (this.f118572c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f118572c.next();
                    if (b0.s(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return c();
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.b0$b$b, reason: collision with other inner class name */
        class C1082b extends com.google.common.collect.c<N> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f118574c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f118575d;

            C1082b(final b this$1, final Iterator val$nodeConnections) {
                this.f118574c = val$nodeConnections;
                this.f118575d = this$1;
            }

            @Override // com.google.common.collect.c
            @fj.a
            protected N b() {
                while (this.f118574c.hasNext()) {
                    f fVar = (f) this.f118574c.next();
                    if (fVar instanceof f.a) {
                        return fVar.f118585a;
                    }
                }
                return c();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public nb<N> iterator() {
            return b0.this.f118564b == null ? new a(this, b0.this.f118563a.entrySet().iterator()) : new C1082b(this, b0.this.f118564b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object obj) {
            return b0.s(b0.this.f118563a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.f118565c;
        }
    }

    class c extends AbstractSet<N> {

        class a extends com.google.common.collect.c<N> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f118577c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f118578d;

            a(final c this$1, final Iterator val$entries) {
                this.f118577c = val$entries;
                this.f118578d = this$1;
            }

            @Override // com.google.common.collect.c
            @fj.a
            protected N b() {
                while (this.f118577c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f118577c.next();
                    if (b0.t(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return c();
            }
        }

        class b extends com.google.common.collect.c<N> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f118579c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f118580d;

            b(final c this$1, final Iterator val$nodeConnections) {
                this.f118579c = val$nodeConnections;
                this.f118580d = this$1;
            }

            @Override // com.google.common.collect.c
            @fj.a
            protected N b() {
                while (this.f118579c.hasNext()) {
                    f fVar = (f) this.f118579c.next();
                    if (fVar instanceof f.b) {
                        return fVar.f118585a;
                    }
                }
                return c();
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public nb<N> iterator() {
            return b0.this.f118564b == null ? new a(this, b0.this.f118563a.entrySet().iterator()) : new b(this, b0.this.f118564b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object obj) {
            return b0.t(b0.this.f118563a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.f118566d;
        }
    }

    class d extends com.google.common.collect.c<h0<N>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f118581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f118582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b0 f118583e;

        d(final b0 this$0, final Iterator val$resultWithDoubleSelfLoop, final AtomicBoolean val$alreadySeenSelfLoop) {
            this.f118581c = val$resultWithDoubleSelfLoop;
            this.f118582d = val$alreadySeenSelfLoop;
            this.f118583e = this$0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c
        @fj.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public h0<N> b() {
            while (this.f118581c.hasNext()) {
                h0<N> h0Var = (h0) this.f118581c.next();
                if (!h0Var.l().equals(h0Var.m()) || !this.f118582d.getAndSet(true)) {
                    return h0Var;
                }
            }
            return c();
        }
    }

    static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f118584a;

        static {
            int[] iArr = new int[f0.a.values().length];
            f118584a = iArr;
            try {
                iArr[f0.a.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f118584a[f0.a.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class f<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final N f118585a;

        static final class a<N> extends f<N> {
            a(N node) {
                super(node);
            }

            public boolean equals(@fj.a Object that) {
                if (that instanceof a) {
                    return this.f118585a.equals(((a) that).f118585a);
                }
                return false;
            }

            public int hashCode() {
                return a.class.hashCode() + this.f118585a.hashCode();
            }
        }

        static final class b<N> extends f<N> {
            b(N node) {
                super(node);
            }

            public boolean equals(@fj.a Object that) {
                if (that instanceof b) {
                    return this.f118585a.equals(((b) that).f118585a);
                }
                return false;
            }

            public int hashCode() {
                return b.class.hashCode() + this.f118585a.hashCode();
            }
        }

        f(N n10) {
            this.f118585a = (N) com.google.common.base.j0.E(n10);
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f118586a;

        g(Object successorValue) {
            this.f118586a = successorValue;
        }
    }

    private b0(Map<N, Object> adjacentNodeValues, @fj.a List<f<N>> orderedNodeConnections, int predecessorCount, int successorCount) {
        this.f118563a = (Map) com.google.common.base.j0.E(adjacentNodeValues);
        this.f118564b = orderedNodeConnections;
        this.f118565c = q0.d(predecessorCount);
        this.f118566d = q0.d(successorCount);
        com.google.common.base.j0.g0(predecessorCount <= adjacentNodeValues.size() && successorCount <= adjacentNodeValues.size());
    }

    public static /* synthetic */ h0 k(Object obj, f fVar) {
        return fVar instanceof f.b ? h0.r(obj, fVar.f118585a) : h0.r(fVar.f118585a, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(@fj.a Object value) {
        return value == f118562e || (value instanceof g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(@fj.a Object value) {
        return (value == f118562e || value == null) ? false : true;
    }

    static <N, V> b0<N, V> u(f0<N> incidentEdgeOrder) {
        ArrayList arrayList;
        int i10 = e.f118584a[incidentEdgeOrder.h().ordinal()];
        if (i10 == 1) {
            arrayList = null;
        } else {
            if (i10 != 2) {
                throw new AssertionError(incidentEdgeOrder.h());
            }
            arrayList = new ArrayList();
        }
        return new b0<>(new HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <N, V> b0<N, V> v(N thisNode, Iterable<h0<N>> incidentEdges, com.google.common.base.t<N, V> successorNodeToValueFn) {
        com.google.common.base.j0.E(thisNode);
        com.google.common.base.j0.E(successorNodeToValueFn);
        HashMap map = new HashMap();
        l6.a aVarS = l6.s();
        int i10 = 0;
        int i11 = 0;
        for (h0<N> h0Var : incidentEdges) {
            if (h0Var.l().equals(thisNode) && h0Var.m().equals(thisNode)) {
                map.put(thisNode, new g(successorNodeToValueFn.apply(thisNode)));
                aVarS.a(new f.a(thisNode));
                aVarS.a(new f.b(thisNode));
                i10++;
            } else if (h0Var.m().equals(thisNode)) {
                N nL = h0Var.l();
                Object objPut = map.put(nL, f118562e);
                if (objPut != null) {
                    map.put(nL, new g(objPut));
                }
                aVarS.a(new f.a(nL));
                i10++;
            } else {
                com.google.common.base.j0.d(h0Var.l().equals(thisNode));
                N nM = h0Var.m();
                V vApply = successorNodeToValueFn.apply(nM);
                Object objPut2 = map.put(nM, vApply);
                if (objPut2 != null) {
                    com.google.common.base.j0.d(objPut2 == f118562e);
                    map.put(nM, new g(vApply));
                }
                aVarS.a(new f.b(nM));
            }
            i11++;
        }
        return new b0<>(map, aVarS.e(), i10, i11);
    }

    @Override // com.google.common.graph.o0
    public Set<N> a() {
        return this.f118564b == null ? Collections.unmodifiableSet(this.f118563a.keySet()) : new a();
    }

    @Override // com.google.common.graph.o0
    public Set<N> b() {
        return new c();
    }

    @Override // com.google.common.graph.o0
    public Set<N> c() {
        return new b();
    }

    @Override // com.google.common.graph.o0
    public void d(N node, V unused) {
        Map<N, Object> map = this.f118563a;
        Object obj = f118562e;
        Object objPut = map.put(node, obj);
        if (objPut != null) {
            if (objPut instanceof g) {
                this.f118563a.put(node, objPut);
                return;
            } else if (objPut == obj) {
                return;
            } else {
                this.f118563a.put(node, new g(objPut));
            }
        }
        int i10 = this.f118565c + 1;
        this.f118565c = i10;
        q0.f(i10);
        List<f<N>> list = this.f118564b;
        if (list != null) {
            list.add(new f.a(node));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.o0
    @fj.a
    public V e(N n10) {
        com.google.common.base.j0.E(n10);
        V v10 = (V) this.f118563a.get(n10);
        if (v10 == f118562e) {
            return null;
        }
        return v10 instanceof g ? (V) ((g) v10).f118586a : v10;
    }

    @Override // com.google.common.graph.o0
    @fj.a
    public V f(Object obj) {
        Object obj2;
        com.google.common.base.j0.E(obj);
        Object obj3 = (V) this.f118563a.get(obj);
        if (obj3 == null || obj3 == (obj2 = f118562e)) {
            obj3 = (V) null;
        } else if (obj3 instanceof g) {
            this.f118563a.put(obj, obj2);
            obj3 = (V) ((g) obj3).f118586a;
        } else {
            this.f118563a.remove(obj);
        }
        if (obj3 != null) {
            int i10 = this.f118566d - 1;
            this.f118566d = i10;
            q0.d(i10);
            List<f<N>> list = this.f118564b;
            if (list != null) {
                list.remove(new f.b(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return (V) obj3;
    }

    @Override // com.google.common.graph.o0
    public void g(N node) {
        com.google.common.base.j0.E(node);
        Object obj = this.f118563a.get(node);
        if (obj == f118562e) {
            this.f118563a.remove(node);
        } else if (!(obj instanceof g)) {
            return;
        } else {
            this.f118563a.put(node, ((g) obj).f118586a);
        }
        int i10 = this.f118565c - 1;
        this.f118565c = i10;
        q0.d(i10);
        List<f<N>> list = this.f118564b;
        if (list != null) {
            list.remove(new f.a(node));
        }
    }

    @Override // com.google.common.graph.o0
    public Iterator<h0<N>> h(final N thisNode) {
        com.google.common.base.j0.E(thisNode);
        List<f<N>> list = this.f118564b;
        return new d(this, list == null ? p7.i(p7.b0(c().iterator(), new com.google.common.base.t() { // from class: com.google.common.graph.y
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return h0.r(obj, thisNode);
            }
        }), p7.b0(b().iterator(), new com.google.common.base.t() { // from class: com.google.common.graph.z
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return h0.r(thisNode, obj);
            }
        })) : p7.b0(list.iterator(), new com.google.common.base.t() { // from class: com.google.common.graph.a0
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return b0.k(thisNode, (b0.f) obj);
            }
        }), new AtomicBoolean(false));
    }

    @Override // com.google.common.graph.o0
    @fj.a
    public V i(N n10, V v10) {
        Object obj = (V) this.f118563a.put(n10, v10);
        if (obj == null) {
            obj = (V) null;
        } else if (obj instanceof g) {
            this.f118563a.put(n10, new g(v10));
            obj = (V) ((g) obj).f118586a;
        } else if (obj == f118562e) {
            this.f118563a.put(n10, new g(v10));
            obj = (V) null;
        }
        if (obj == null) {
            int i10 = this.f118566d + 1;
            this.f118566d = i10;
            q0.f(i10);
            List<f<N>> list = this.f118564b;
            if (list != null) {
                list.add(new f.b(n10));
            }
        }
        if (obj == null) {
            return null;
        }
        return (V) obj;
    }
}
