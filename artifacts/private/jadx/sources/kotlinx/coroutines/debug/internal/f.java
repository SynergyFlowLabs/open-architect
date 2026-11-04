package kotlinx.coroutines.debug.internal;

import com.google.common.util.concurrent.x2;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.a0;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
public final class f<K, V> extends AbstractMutableMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f313930b = AtomicIntegerFieldUpdater.newUpdater(f.class, "_size$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f313931c = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final ReferenceQueue<K> f313932a;
    private volatile /* synthetic */ Object core$volatile;

    private final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f313933g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f313934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f313935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f313936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final /* synthetic */ AtomicReferenceArray f313937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final /* synthetic */ AtomicReferenceArray f313938e;
        private volatile /* synthetic */ int load$volatile;

        /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.f$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
        private final class C2272a<E> implements Iterator<E>, qj.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final Function2<K, V, E> f313940a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f313941b = -1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private K f313942c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private V f313943d;

            /* JADX WARN: Multi-variable type inference failed */
            public C2272a(Function2<? super K, ? super V, ? extends E> function2) {
                this.f313940a = function2;
                b();
            }

            private final void b() {
                K k10;
                while (true) {
                    int i10 = this.f313941b + 1;
                    this.f313941b = i10;
                    if (i10 >= ((a) a.this).f313934a) {
                        return;
                    }
                    q qVar = (q) a.this.f().get(this.f313941b);
                    if (qVar != null && (k10 = (K) qVar.get()) != null) {
                        this.f313942c = k10;
                        Object obj = (V) a.this.i().get(this.f313941b);
                        if (obj instanceof r) {
                            obj = (V) ((r) obj).f314003a;
                        }
                        if (obj != null) {
                            this.f313943d = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void remove() {
                g.e();
                throw new a0();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f313941b < ((a) a.this).f313934a;
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
            public E next() {
                if (this.f313941b >= ((a) a.this).f313934a) {
                    throw new NoSuchElementException();
                }
                Function2<K, V, E> function2 = this.f313940a;
                K k10 = this.f313942c;
                if (k10 == false) {
                    Intrinsics.throwUninitializedPropertyAccessException("key");
                    k10 = (K) Unit.f312394a;
                }
                V v10 = this.f313943d;
                if (v10 == false) {
                    Intrinsics.throwUninitializedPropertyAccessException("value");
                    v10 = (V) Unit.f312394a;
                }
                E e10 = (E) function2.invoke(k10, v10);
                b();
                return e10;
            }
        }

        public a(int i10) {
            this.f313934a = i10;
            this.f313935b = Integer.numberOfLeadingZeros(i10) + 1;
            this.f313936c = (i10 * 2) / 3;
            this.f313937d = new AtomicReferenceArray(i10);
            this.f313938e = new AtomicReferenceArray(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray f() {
            return this.f313937d;
        }

        private final /* synthetic */ int g() {
            return this.load$volatile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray i() {
            return this.f313938e;
        }

        private final int j(int i10) {
            return (i10 * (-1640531527)) >>> this.f313935b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object m(a aVar, Object obj, Object obj2, q qVar, int i10, Object obj3) {
            if ((i10 & 4) != 0) {
                qVar = null;
            }
            return aVar.l(obj, obj2, qVar);
        }

        private final void o(int i10) {
            Object obj;
            do {
                obj = i().get(i10);
                if (obj == null || (obj instanceof r)) {
                    return;
                }
            } while (!x2.a(i(), i10, obj, null));
            f.this.i();
        }

        private final /* synthetic */ void p(int i10) {
            this.load$volatile = i10;
        }

        private final /* synthetic */ void q(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, Function1<? super Integer, Integer> function1) {
            int i10;
            do {
                i10 = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i10, function1.invoke(Integer.valueOf(i10)).intValue()));
        }

        public final void d(@NotNull q<?> qVar) {
            int iJ = j(qVar.f314002a);
            while (true) {
                q<?> qVar2 = (q) f().get(iJ);
                if (qVar2 == null) {
                    return;
                }
                if (qVar2 == qVar) {
                    o(iJ);
                    return;
                } else {
                    if (iJ == 0) {
                        iJ = this.f313934a;
                    }
                    iJ--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final V e(@NotNull K k10) {
            int iJ = j(k10.hashCode());
            while (true) {
                q qVar = (q) f().get(iJ);
                if (qVar == null) {
                    return null;
                }
                T t10 = qVar.get();
                if (Intrinsics.areEqual(k10, t10)) {
                    V v10 = (V) i().get(iJ);
                    return v10 instanceof r ? (V) ((r) v10).f314003a : v10;
                }
                if (t10 == 0) {
                    o(iJ);
                }
                if (iJ == 0) {
                    iJ = this.f313934a;
                }
                iJ--;
            }
        }

        @NotNull
        public final <E> Iterator<E> k(@NotNull Function2<? super K, ? super V, ? extends E> function2) {
            return new C2272a(function2);
        }

        @Nullable
        public final Object l(@NotNull K k10, @Nullable V v10, @Nullable q<K> qVar) {
            int i10;
            Object obj;
            int iJ = j(k10.hashCode());
            boolean z10 = false;
            while (true) {
                q qVar2 = (q) f().get(iJ);
                if (qVar2 != null) {
                    T t10 = qVar2.get();
                    if (Intrinsics.areEqual(k10, t10)) {
                        if (!z10) {
                            break;
                        }
                        f313933g.decrementAndGet(this);
                        break;
                    }
                    if (t10 == 0) {
                        o(iJ);
                    }
                    if (iJ == 0) {
                        iJ = this.f313934a;
                    }
                    iJ--;
                } else if (v10 != null) {
                    if (!z10) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f313933g;
                        do {
                            i10 = atomicIntegerFieldUpdater.get(this);
                            if (i10 >= this.f313936c) {
                                return g.f313951c;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1));
                        z10 = true;
                    }
                    if (qVar == null) {
                        qVar = new q<>(k10, ((f) f.this).f313932a);
                    }
                    if (x2.a(f(), iJ, null, qVar)) {
                        break;
                    }
                } else {
                    return null;
                }
            }
            do {
                obj = i().get(iJ);
                if (obj instanceof r) {
                    return g.f313951c;
                }
            } while (!x2.a(i(), iJ, obj, v10));
            return obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final f<K, V>.a n() {
            Object obj;
            while (true) {
                f<K, V>.a aVar = (f<K, V>.a) f.this.new a(Integer.highestOneBit(kotlin.ranges.r.u(f.this.size(), 4)) * 4);
                int i10 = this.f313934a;
                for (int i11 = 0; i11 < i10; i11++) {
                    q qVar = (q) f().get(i11);
                    Object obj2 = qVar != null ? qVar.get() : null;
                    if (qVar != null && obj2 == null) {
                        o(i11);
                    }
                    do {
                        obj = i().get(i11);
                        if (obj instanceof r) {
                            obj = ((r) obj).f314003a;
                            break;
                        }
                    } while (!x2.a(i(), i11, obj, g.d(obj)));
                    if (obj2 == null || obj == null || aVar.l(obj2, obj, qVar) != g.f313951c) {
                    }
                }
                return aVar;
            }
        }
    }

    private static final class b<K, V> implements Map.Entry<K, V>, qj.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f313945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V f313946b;

        public b(K k10, V v10) {
            this.f313945a = k10;
            this.f313946b = v10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f313945a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f313946b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            g.e();
            throw new a0();
        }
    }

    private final class c<E> extends AbstractMutableSet<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function2<K, V, E> f313947a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super K, ? super V, ? extends E> function2) {
            this.f313947a = function2;
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e10) {
            g.e();
            throw new a0();
        }

        @Override // kotlin.collections.AbstractMutableSet
        public int getSize() {
            return f.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NotNull
        public Iterator<E> iterator() {
            return ((a) f.k().get(f.this)).k(this.f313947a);
        }
    }

    public f() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map.Entry c(Object obj, Object obj2) {
        return new b(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, Object obj2) {
        return obj;
    }

    private final void h(q<?> qVar) {
        ((a) f313931c.get(this)).d(qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        f313930b.decrementAndGet(this);
    }

    private final /* synthetic */ Object j() {
        return this.core$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater k() {
        return f313931c;
    }

    private final /* synthetic */ int l() {
        return this._size$volatile;
    }

    private final synchronized V n(K k10, V v10) {
        V v11;
        try {
            a aVarN = (a) f313931c.get(this);
            while (true) {
                K k11 = k10;
                V v12 = v10;
                v11 = (V) a.m(aVarN, k11, v12, null, 4, null);
                if (v11 == g.f313951c) {
                    aVarN = aVarN.n();
                    f313931c.set(this, aVarN);
                    k10 = k11;
                    v10 = v12;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return v11;
    }

    private final /* synthetic */ void p(Object obj) {
        this.core$volatile = obj;
    }

    private final /* synthetic */ void q(int i10) {
        this._size$volatile = i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((a) f313931c.get(this)).e(obj);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new c(new Function2() { // from class: kotlinx.coroutines.debug.internal.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return f.c(obj, obj2);
            }
        });
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<K> getKeys() {
        return new c(new Function2() { // from class: kotlinx.coroutines.debug.internal.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return f.d(obj, obj2);
            }
        });
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return f313930b.get(this);
    }

    public final void o() {
        if (this.f313932a == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true");
        }
        while (true) {
            try {
                Reference<? extends K> referenceRemove = this.f313932a.remove();
                Intrinsics.checkNotNull(referenceRemove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                h((q) referenceRemove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(@NotNull K k10, @NotNull V v10) {
        V vN = (V) a.m((a) f313931c.get(this), k10, v10, null, 4, null);
        if (vN == g.f313951c) {
            vN = n(k10, v10);
        }
        if (vN == null) {
            f313930b.incrementAndGet(this);
        }
        return vN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(@Nullable Object obj) {
        if (obj == 0) {
            return null;
        }
        V vN = (V) a.m((a) f313931c.get(this), obj, null, null, 4, null);
        if (vN == g.f313951c) {
            vN = n(obj, null);
        }
        if (vN != null) {
            f313930b.decrementAndGet(this);
        }
        return vN;
    }

    public /* synthetic */ f(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public f(boolean z10) {
        this.core$volatile = new a(16);
        this.f313932a = z10 ? new ReferenceQueue<>() : null;
    }
}
