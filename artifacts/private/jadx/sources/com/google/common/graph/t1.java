package com.google.common.graph;

import com.google.common.collect.nb;
import com.google.common.collect.z6;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@z7.f("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
@g0
@com.google.common.annotations.a
public abstract class t1<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s1<N> f118708a;

    class a extends t1<N> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s1 f118709b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s1 successorFunction, final s1 val$graph) {
            super(successorFunction, null);
            this.f118709b = val$graph;
        }

        @Override // com.google.common.graph.t1
        g<N> i() {
            return g.b(this.f118709b);
        }
    }

    class b extends t1<N> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s1 f118710b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s1 successorFunction, final s1 val$tree) {
            super(successorFunction, null);
            this.f118710b = val$tree;
        }

        @Override // com.google.common.graph.t1
        g<N> i() {
            return g.c(this.f118710b);
        }
    }

    class c implements Iterable<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z6 f118711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t1 f118712b;

        c(final t1 this$0, final z6 val$validated) {
            this.f118711a = val$validated;
            this.f118712b = this$0;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return this.f118712b.i().a(this.f118711a.iterator());
        }
    }

    class d implements Iterable<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z6 f118713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t1 f118714b;

        d(final t1 this$0, final z6 val$validated) {
            this.f118713a = val$validated;
            this.f118714b = this$0;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return this.f118714b.i().e(this.f118713a.iterator());
        }
    }

    class e implements Iterable<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z6 f118715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t1 f118716b;

        e(final t1 this$0, final z6 val$validated) {
            this.f118715a = val$validated;
            this.f118716b = this$0;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return this.f118716b.i().d(this.f118715a.iterator());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f118717a = new a("FRONT", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f118718b = new b("BACK", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ f[] f118719c = k();

        final enum a extends f {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.graph.t1.f
            <T> void l(Deque<T> deque, T value) {
                deque.addFirst(value);
            }
        }

        final enum b extends f {
            b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.graph.t1.f
            <T> void l(Deque<T> deque, T value) {
                deque.addLast(value);
            }
        }

        private f(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ f[] k() {
            return new f[]{f118717a, f118718b};
        }

        public static f valueOf(String name) {
            return (f) Enum.valueOf(f.class, name);
        }

        public static f[] values() {
            return (f[]) f118719c.clone();
        }

        abstract <T> void l(Deque<T> deque, T value);

        /* synthetic */ f(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    private static abstract class g<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final s1<N> f118720a;

        class a extends g<N> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Set f118721b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s1 successorFunction, final Set val$visited) {
                super(successorFunction);
                this.f118721b = val$visited;
            }

            @Override // com.google.common.graph.t1.g
            @fj.a
            N g(Deque<Iterator<? extends N>> horizon) {
                Iterator<? extends N> first = horizon.getFirst();
                while (first.hasNext()) {
                    N next = first.next();
                    Objects.requireNonNull(next);
                    if (this.f118721b.add(next)) {
                        return next;
                    }
                }
                horizon.removeFirst();
                return null;
            }
        }

        class b extends g<N> {
            b(s1 successorFunction) {
                super(successorFunction);
            }

            @Override // com.google.common.graph.t1.g
            @fj.a
            N g(Deque<Iterator<? extends N>> deque) {
                Iterator<? extends N> first = deque.getFirst();
                if (first.hasNext()) {
                    return (N) com.google.common.base.j0.E(first.next());
                }
                deque.removeFirst();
                return null;
            }
        }

        class c extends com.google.common.collect.c<N> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Deque f118722c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f f118723d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ g f118724e;

            c(final g this$0, final Deque val$horizon, final f val$order) {
                this.f118722c = val$horizon;
                this.f118723d = val$order;
                this.f118724e = this$0;
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
            @Override // com.google.common.collect.c
            @fj.a
            protected N b() {
                do {
                    N n10 = (N) this.f118724e.g(this.f118722c);
                    if (n10 != null) {
                        Iterator<? extends N> it = this.f118724e.f118720a.a(n10).iterator();
                        if (it.hasNext()) {
                            this.f118723d.l(this.f118722c, it);
                        }
                        return n10;
                    }
                } while (!this.f118722c.isEmpty());
                return c();
            }
        }

        class d extends com.google.common.collect.c<N> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Deque f118725c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Deque f118726d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ g f118727e;

            d(final g this$0, final Deque val$horizon, final Deque val$ancestorStack) {
                this.f118725c = val$horizon;
                this.f118726d = val$ancestorStack;
                this.f118727e = this$0;
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
            @Override // com.google.common.collect.c
            @fj.a
            protected N b() {
                while (true) {
                    N n10 = (N) this.f118727e.g(this.f118725c);
                    if (n10 == null) {
                        return !this.f118726d.isEmpty() ? (N) this.f118726d.pop() : c();
                    }
                    Iterator<? extends N> it = this.f118727e.f118720a.a(n10).iterator();
                    if (!it.hasNext()) {
                        return n10;
                    }
                    this.f118725c.addFirst(it);
                    this.f118726d.push(n10);
                }
            }
        }

        g(s1<N> successorFunction) {
            this.f118720a = successorFunction;
        }

        static <N> g<N> b(s1<N> graph) {
            return new a(graph, new HashSet());
        }

        static <N> g<N> c(s1<N> tree) {
            return new b(tree);
        }

        private Iterator<N> f(Iterator<? extends N> startNodes, f order) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(startNodes);
            return new c(this, arrayDeque, order);
        }

        final Iterator<N> a(Iterator<? extends N> startNodes) {
            return f(startNodes, f.f118718b);
        }

        final Iterator<N> d(Iterator<? extends N> startNodes) {
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(startNodes);
            return new d(this, arrayDeque2, arrayDeque);
        }

        final Iterator<N> e(Iterator<? extends N> startNodes) {
            return f(startNodes, f.f118717a);
        }

        @fj.a
        abstract N g(Deque<Iterator<? extends N>> horizon);
    }

    /* synthetic */ t1(s1 s1Var, a aVar) {
        this(s1Var);
    }

    public static <N> t1<N> g(s1<N> graph) {
        return new a(graph, graph);
    }

    public static <N> t1<N> h(s1<N> tree) {
        if (tree instanceof x) {
            com.google.common.base.j0.e(((x) tree).c(), "Undirected graphs can never be trees.");
        }
        if (tree instanceof i1) {
            com.google.common.base.j0.e(((i1) tree).c(), "Undirected networks can never be trees.");
        }
        return new b(tree, tree);
    }

    private z6<N> j(Iterable<? extends N> startNodes) {
        z6<N> z6VarW = z6.w(startNodes);
        nb<N> it = z6VarW.iterator();
        while (it.hasNext()) {
            this.f118708a.a(it.next());
        }
        return z6VarW;
    }

    public final Iterable<N> a(Iterable<? extends N> startNodes) {
        return new c(this, j(startNodes));
    }

    public final Iterable<N> b(N startNode) {
        return a(z6.J(startNode));
    }

    public final Iterable<N> c(Iterable<? extends N> startNodes) {
        return new e(this, j(startNodes));
    }

    public final Iterable<N> d(N startNode) {
        return c(z6.J(startNode));
    }

    public final Iterable<N> e(Iterable<? extends N> startNodes) {
        return new d(this, j(startNodes));
    }

    public final Iterable<N> f(N startNode) {
        return e(z6.J(startNode));
    }

    abstract g<N> i();

    private t1(s1<N> successorFunction) {
        this.f118708a = (s1) com.google.common.base.j0.E(successorFunction);
    }
}
