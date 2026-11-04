package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
@com.google.common.annotations.a
@a4
@com.google.common.annotations.b
public abstract class mb<T> {

    class a extends mb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.t f117723a;

        a(final com.google.common.base.t val$nodeToChildrenFunction) {
            this.f117723a = val$nodeToChildrenFunction;
        }

        @Override // com.google.common.collect.mb
        public Iterable<T> b(T root) {
            return (Iterable) this.f117723a.apply(root);
        }
    }

    class b extends s4<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f117724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ mb f117725c;

        b(final mb this$0, final Object val$root) {
            this.f117724b = val$root;
            this.f117725c = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public nb<T> iterator() {
            return this.f117725c.e(this.f117724b);
        }
    }

    class c extends s4<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f117726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ mb f117727c;

        c(final mb this$0, final Object val$root) {
            this.f117726b = val$root;
            this.f117727c = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public nb<T> iterator() {
            return this.f117727c.c(this.f117726b);
        }
    }

    class d extends s4<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f117728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ mb f117729c;

        d(final mb this$0, final Object val$root) {
            this.f117728b = val$root;
            this.f117729c = this$0;
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public nb<T> iterator() {
            return new e(this.f117728b);
        }
    }

    private final class e extends nb<T> implements c9<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<T> f117730a;

        e(T root) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f117730a = arrayDeque;
            arrayDeque.add(root);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f117730a.isEmpty();
        }

        @Override // java.util.Iterator, com.google.common.collect.c9
        public T next() {
            T tRemove = this.f117730a.remove();
            o7.a(this.f117730a, mb.this.b(tRemove));
            return tRemove;
        }

        @Override // com.google.common.collect.c9
        public T peek() {
            return this.f117730a.element();
        }
    }

    private final class f extends com.google.common.collect.c<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayDeque<g<T>> f117732c;

        f(T root) {
            ArrayDeque<g<T>> arrayDeque = new ArrayDeque<>();
            this.f117732c = arrayDeque;
            arrayDeque.addLast(e(root));
        }

        private g<T> e(T t10) {
            return new g<>(t10, mb.this.b(t10).iterator());
        }

        @Override // com.google.common.collect.c
        @fj.a
        protected T b() {
            while (!this.f117732c.isEmpty()) {
                g<T> last = this.f117732c.getLast();
                if (!last.f117735b.hasNext()) {
                    this.f117732c.removeLast();
                    return last.f117734a;
                }
                this.f117732c.addLast(e(last.f117735b.next()));
            }
            return c();
        }
    }

    private static final class g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f117734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterator<T> f117735b;

        g(T t10, Iterator<T> it) {
            this.f117734a = (T) com.google.common.base.j0.E(t10);
            this.f117735b = (Iterator) com.google.common.base.j0.E(it);
        }
    }

    private final class h extends nb<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Deque<Iterator<T>> f117736a;

        h(T root) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f117736a = arrayDeque;
            arrayDeque.addLast(p7.X(com.google.common.base.j0.E(root)));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f117736a.isEmpty();
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
        @Override // java.util.Iterator
        public T next() {
            Iterator<T> last = this.f117736a.getLast();
            T t10 = (T) com.google.common.base.j0.E(last.next());
            if (!last.hasNext()) {
                this.f117736a.removeLast();
            }
            Iterator<T> it = mb.this.b(t10).iterator();
            if (it.hasNext()) {
                this.f117736a.addLast(it);
            }
            return t10;
        }
    }

    @Deprecated
    public static <T> mb<T> g(final com.google.common.base.t<T, ? extends Iterable<T>> nodeToChildrenFunction) {
        com.google.common.base.j0.E(nodeToChildrenFunction);
        return new a(nodeToChildrenFunction);
    }

    @Deprecated
    public final s4<T> a(final T root) {
        com.google.common.base.j0.E(root);
        return new d(this, root);
    }

    public abstract Iterable<T> b(T root);

    nb<T> c(T root) {
        return new f(root);
    }

    @Deprecated
    public final s4<T> d(final T root) {
        com.google.common.base.j0.E(root);
        return new c(this, root);
    }

    nb<T> e(T root) {
        return new h(root);
    }

    @Deprecated
    public final s4<T> f(final T root) {
        com.google.common.base.j0.E(root);
        return new b(this, root);
    }
}
