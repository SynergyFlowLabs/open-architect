package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes5.dex */
@d6
@a4
@com.google.common.annotations.b
final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collector<Object, ?, l6<Object>> f118317a = Collector.of(new Supplier() { // from class: com.google.common.collect.j0
        @Override // java.util.function.Supplier
        public final Object get() {
            return l6.s();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.n0
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((l6.a) obj).a(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.o0
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((l6.a) obj).p((l6.a) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.p0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((l6.a) obj).e();
        }
    }, new Collector.Characteristics[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Collector<Object, ?, z6<Object>> f118318b = Collector.of(new Supplier() { // from class: com.google.common.collect.q0
        @Override // java.util.function.Supplier
        public final Object get() {
            return z6.s();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.r0
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((z6.a) obj).a(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.s0
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((z6.a) obj).p((z6.a) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.t0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((z6.a) obj).e();
        }
    }, new Collector.Characteristics[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.common.annotations.c
    private static final Collector<f9<Comparable<?>>, ?, y6<Comparable<?>>> f118319c = Collector.of(new Supplier() { // from class: com.google.common.collect.u0
        @Override // java.util.function.Supplier
        public final Object get() {
            return y6.w();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.v0
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((y6.d) obj).a((f9) obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.k0
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((y6.d) obj).e((y6.d) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.l0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((y6.d) obj).d();
        }
    }, new Collector.Characteristics[0]);

    /* JADX INFO: Access modifiers changed from: private */
    @d6
    static class b<K extends Enum<K>, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BinaryOperator<V> f118320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        private EnumMap<K, V> f118321b = null;

        b(BinaryOperator<V> mergeFunction) {
            this.f118320a = mergeFunction;
        }

        b<K, V> a(b<K, V> other) {
            if (this.f118321b == null) {
                return other;
            }
            EnumMap<K, V> enumMap = other.f118321b;
            if (enumMap == null) {
                return this;
            }
            enumMap.forEach(new BiConsumer() { // from class: com.google.common.collect.z2
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.f118413a.b((Enum) obj, obj2);
                }
            });
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(K key, V value) {
            EnumMap<K, V> enumMap = this.f118321b;
            if (enumMap == null) {
                this.f118321b = new EnumMap<>(Collections.singletonMap(key, value));
            } else {
                enumMap.merge(key, value, this.f118320a);
            }
        }

        n6<K, V> c() {
            EnumMap<K, V> enumMap = this.f118321b;
            return enumMap == null ? n6.q() : j6.H(enumMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @d6
    static final class c<E extends Enum<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Collector<Enum<?>, ?, z6<? extends Enum<?>>> f118322b = y2.K();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        private EnumSet<E> f118323a;

        private c() {
        }

        void a(E e10) {
            EnumSet<E> enumSet = this.f118323a;
            if (enumSet == null) {
                this.f118323a = EnumSet.of((Enum) e10);
            } else {
                enumSet.add(e10);
            }
        }

        c<E> b(c<E> other) {
            EnumSet<E> enumSet = this.f118323a;
            if (enumSet == null) {
                return other;
            }
            EnumSet<E> enumSet2 = other.f118323a;
            if (enumSet2 == null) {
                return this;
            }
            enumSet.addAll(enumSet2);
            return this;
        }

        z6<E> c() {
            EnumSet<E> enumSet = this.f118323a;
            if (enumSet == null) {
                return z6.G();
            }
            z6<E> z6VarR = k6.R(enumSet);
            this.f118323a = null;
            return z6VarR;
        }
    }

    private y2() {
    }

    public static /* synthetic */ b A(BinaryOperator binaryOperator) {
        return new b(binaryOperator);
    }

    public static /* synthetic */ k8 B(k8 k8Var, k8 k8Var2) {
        k8Var.R(k8Var2);
        return k8Var;
    }

    static <T, K, V> Collector<T, ?, m6<K, V>> D(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends Stream<? extends V>> valuesFunction) {
        com.google.common.base.j0.E(keyFunction);
        com.google.common.base.j0.E(valuesFunction);
        Function function = new Function() { // from class: com.google.common.collect.z0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return com.google.common.base.j0.E(keyFunction.apply(obj));
            }
        };
        Function function2 = new Function() { // from class: com.google.common.collect.a1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Stream) valuesFunction.apply(obj)).peek(new o1());
            }
        };
        final l8.j<Object, Object> jVarA = l8.f().a();
        Objects.requireNonNull(jVarA);
        return Collectors.collectingAndThen(F(function, function2, new Supplier() { // from class: com.google.common.collect.b1
            @Override // java.util.function.Supplier
            public final Object get() {
                return jVarA.a();
            }
        }), new Function() { // from class: com.google.common.collect.c1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return m6.O((w7) obj);
            }
        });
    }

    static <T, K, V> Collector<T, ?, a7<K, V>> E(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends Stream<? extends V>> valuesFunction) {
        com.google.common.base.j0.E(keyFunction);
        com.google.common.base.j0.E(valuesFunction);
        Function function = new Function() { // from class: com.google.common.collect.h1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return com.google.common.base.j0.E(keyFunction.apply(obj));
            }
        };
        Function function2 = new Function() { // from class: com.google.common.collect.j1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Stream) valuesFunction.apply(obj)).peek(new o1());
            }
        };
        final l8.l<Object, Object> lVarG = l8.f().g();
        Objects.requireNonNull(lVarG);
        return Collectors.collectingAndThen(F(function, function2, new Supplier() { // from class: com.google.common.collect.k1
            @Override // java.util.function.Supplier
            public final Object get() {
                return lVarG.a();
            }
        }), new Function() { // from class: com.google.common.collect.l1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return a7.O((y9) obj);
            }
        });
    }

    static <T, K, V, M extends k8<K, V>> Collector<T, ?, M> F(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends Stream<? extends V>> valueFunction, Supplier<M> multimapSupplier) {
        com.google.common.base.j0.E(keyFunction);
        com.google.common.base.j0.E(valueFunction);
        com.google.common.base.j0.E(multimapSupplier);
        return Collector.of(multimapSupplier, new BiConsumer() { // from class: com.google.common.collect.w0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                y2.t(keyFunction, valueFunction, (k8) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.y0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return y2.B((k8) obj, (k8) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, K, V> Collector<T, ?, f6<K, V>> G(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.j0.E(keyFunction);
        com.google.common.base.j0.E(valueFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.x2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new f6.a();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.c0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((f6.a) obj).i(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.d0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((f6.a) obj).e((f6.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.e0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((f6.a) obj).d();
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, K extends Enum<K>, V> Collector<T, ?, n6<K, V>> H(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.j0.E(keyFunction);
        com.google.common.base.j0.E(valueFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.p1
            @Override // java.util.function.Supplier
            public final Object get() {
                return y2.d();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.q1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((y2.b) obj).b((Enum) com.google.common.base.j0.V((Enum) keyFunction.apply(obj2), "Null key for input %s", obj2), com.google.common.base.j0.V(valueFunction.apply(obj2), "Null value for input %s", obj2));
            }
        }, new r1(), new s1(), Collector.Characteristics.UNORDERED);
    }

    static <T, K extends Enum<K>, V> Collector<T, ?, n6<K, V>> I(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction, final BinaryOperator<V> mergeFunction) {
        com.google.common.base.j0.E(keyFunction);
        com.google.common.base.j0.E(valueFunction);
        com.google.common.base.j0.E(mergeFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.r2
            @Override // java.util.function.Supplier
            public final Object get() {
                return y2.A(mergeFunction);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.s2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((y2.b) obj).b((Enum) com.google.common.base.j0.V((Enum) keyFunction.apply(obj2), "Null key for input %s", obj2), com.google.common.base.j0.V(valueFunction.apply(obj2), "Null value for input %s", obj2));
            }
        }, new r1(), new s1(), new Collector.Characteristics[0]);
    }

    static <E extends Enum<E>> Collector<E, ?, z6<E>> J() {
        return (Collector<E, ?, z6<E>>) c.f118322b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E extends Enum<E>> Collector<E, c<E>, z6<E>> K() {
        return Collector.of(new Supplier() { // from class: com.google.common.collect.f0
            @Override // java.util.function.Supplier
            public final Object get() {
                return y2.q();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.g0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((y2.c) obj).a((Enum) obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.h0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((y2.c) obj).b((y2.c) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.i0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((y2.c) obj).c();
            }
        }, Collector.Characteristics.UNORDERED);
    }

    static <E> Collector<E, ?, l6<E>> L() {
        return (Collector<E, ?, l6<E>>) f118317a;
    }

    static <T, K, V> Collector<T, ?, m6<K, V>> M(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.j0.F(keyFunction, "keyFunction");
        com.google.common.base.j0.F(valueFunction, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.c2
            @Override // java.util.function.Supplier
            public final Object get() {
                return m6.M();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.d2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((m6.a) obj).i(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.f2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((m6.a) obj).b((m6.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.g2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((m6.a) obj).a();
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, K, V> Collector<T, ?, n6<K, V>> N(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.j0.E(keyFunction);
        com.google.common.base.j0.E(valueFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.u1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new n6.b();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.v1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((n6.b) obj).i(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.w1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((n6.b) obj).e((n6.b) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.x1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((n6.b) obj).d();
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, K, V> Collector<T, ?, n6<K, V>> O(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        com.google.common.base.j0.E(keyFunction);
        com.google.common.base.j0.E(valueFunction);
        com.google.common.base.j0.E(mergeFunction);
        return Collectors.collectingAndThen(Collectors.toMap(keyFunction, valueFunction, mergeFunction, new Supplier() { // from class: com.google.common.collect.l2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        }), new Function() { // from class: com.google.common.collect.m2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return n6.g((LinkedHashMap) obj);
            }
        });
    }

    static <T, E> Collector<T, ?, t6<E>> P(final Function<? super T, ? extends E> elementFunction, final ToIntFunction<? super T> countFunction) {
        com.google.common.base.j0.E(elementFunction);
        com.google.common.base.j0.E(countFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.d1
            @Override // java.util.function.Supplier
            public final Object get() {
                return u7.r();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.e1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((q8) obj).H(com.google.common.base.j0.E(elementFunction.apply(obj2)), countFunction.applyAsInt(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.f1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return y2.m((q8) obj, (q8) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.g1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return t6.t(((q8) obj).entrySet());
            }
        }, new Collector.Characteristics[0]);
    }

    @com.google.common.annotations.c
    static <T, K extends Comparable<? super K>, V> Collector<T, ?, x6<K, V>> Q(final Function<? super T, f9<K>> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.j0.E(keyFunction);
        com.google.common.base.j0.E(valueFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.m0
            @Override // java.util.function.Supplier
            public final Object get() {
                return x6.n();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.x0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((x6.c) obj).c((f9) keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.i1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((x6.c) obj).b((x6.c) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.t1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((x6.c) obj).a();
            }
        }, new Collector.Characteristics[0]);
    }

    @com.google.common.annotations.c
    static <E extends Comparable<? super E>> Collector<f9<E>, ?, y6<E>> R() {
        return (Collector<f9<E>, ?, y6<E>>) f118319c;
    }

    static <E> Collector<E, ?, z6<E>> S() {
        return (Collector<E, ?, z6<E>>) f118318b;
    }

    static <T, K, V> Collector<T, ?, a7<K, V>> T(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.j0.F(keyFunction, "keyFunction");
        com.google.common.base.j0.F(valueFunction, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.h2
            @Override // java.util.function.Supplier
            public final Object get() {
                return a7.M();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.i2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((a7.a) obj).i(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.j2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((a7.a) obj).b((a7.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.k2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((a7.a) obj).a();
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, K, V> Collector<T, ?, c7<K, V>> U(final Comparator<? super K> comparator, final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction) {
        com.google.common.base.j0.E(comparator);
        com.google.common.base.j0.E(keyFunction);
        com.google.common.base.j0.E(valueFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.e2
            @Override // java.util.function.Supplier
            public final Object get() {
                return y2.b(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.p2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((c7.b) obj).i(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.v2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((c7.b) obj).q((c7.b) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.w2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((c7.b) obj).d();
            }
        }, Collector.Characteristics.UNORDERED);
    }

    static <T, K, V> Collector<T, ?, c7<K, V>> V(final Comparator<? super K> comparator, Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        com.google.common.base.j0.E(comparator);
        com.google.common.base.j0.E(keyFunction);
        com.google.common.base.j0.E(valueFunction);
        com.google.common.base.j0.E(mergeFunction);
        return Collectors.collectingAndThen(Collectors.toMap(keyFunction, valueFunction, mergeFunction, new Supplier() { // from class: com.google.common.collect.m1
            @Override // java.util.function.Supplier
            public final Object get() {
                return y2.p(comparator);
            }
        }), new Function() { // from class: com.google.common.collect.n1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return c7.S((TreeMap) obj);
            }
        });
    }

    static <E> Collector<E, ?, j7<E>> W(final Comparator<? super E> comparator) {
        com.google.common.base.j0.E(comparator);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.y1
            @Override // java.util.function.Supplier
            public final Object get() {
                return y2.g(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.z1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((j7.a) obj).a(obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.a2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((j7.a) obj).p((j7.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.b2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((j7.a) obj).e();
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, K, V, M extends k8<K, V>> Collector<T, ?, M> X(final Function<? super T, ? extends K> keyFunction, final Function<? super T, ? extends V> valueFunction, Supplier<M> multimapSupplier) {
        com.google.common.base.j0.E(keyFunction);
        com.google.common.base.j0.E(valueFunction);
        com.google.common.base.j0.E(multimapSupplier);
        return Collector.of(multimapSupplier, new BiConsumer() { // from class: com.google.common.collect.t2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((k8) obj).put(keyFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.u2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return y2.h((k8) obj, (k8) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    static <T, E, M extends q8<E>> Collector<T, ?, M> Y(final Function<? super T, E> elementFunction, final ToIntFunction<? super T> countFunction, Supplier<M> multisetSupplier) {
        com.google.common.base.j0.E(elementFunction);
        com.google.common.base.j0.E(countFunction);
        com.google.common.base.j0.E(multisetSupplier);
        return Collector.of(multisetSupplier, new BiConsumer() { // from class: com.google.common.collect.o2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((q8) obj).H(elementFunction.apply(obj2), countFunction.applyAsInt(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.q2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return y2.o((q8) obj, (q8) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    public static /* synthetic */ c7.b b(Comparator comparator) {
        return new c7.b(comparator);
    }

    public static /* synthetic */ b d() {
        return new b(new BinaryOperator() { // from class: com.google.common.collect.b0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return y2.y(obj, obj2);
            }
        });
    }

    public static /* synthetic */ j7.a g(Comparator comparator) {
        return new j7.a(comparator);
    }

    public static /* synthetic */ k8 h(k8 k8Var, k8 k8Var2) {
        k8Var.R(k8Var2);
        return k8Var;
    }

    public static /* synthetic */ q8 m(q8 q8Var, q8 q8Var2) {
        q8Var.addAll(q8Var2);
        return q8Var;
    }

    public static /* synthetic */ q8 o(q8 q8Var, q8 q8Var2) {
        q8Var.addAll(q8Var2);
        return q8Var;
    }

    public static /* synthetic */ TreeMap p(Comparator comparator) {
        return new TreeMap(comparator);
    }

    public static /* synthetic */ c q() {
        return new c();
    }

    public static /* synthetic */ void t(Function function, Function function2, k8 k8Var, Object obj) {
        final Collection collectionX = k8Var.x(function.apply(obj));
        Stream stream = (Stream) function2.apply(obj);
        Objects.requireNonNull(collectionX);
        stream.forEachOrdered(new Consumer() { // from class: com.google.common.collect.n2
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                collectionX.add(obj2);
            }
        });
    }

    public static /* synthetic */ Object y(Object obj, Object obj2) {
        throw new IllegalArgumentException("Multiple values for key: " + obj + ", " + obj2);
    }
}
