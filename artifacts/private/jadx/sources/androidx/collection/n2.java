package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableValues\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n329#2,6:1808\n339#2,3:1815\n342#2,9:1819\n329#2,6:1828\n339#2,3:1835\n342#2,9:1839\n1399#3:1794\n1270#3:1798\n1399#3:1814\n1270#3:1818\n1399#3:1834\n1270#3:1838\n1726#4,3:1848\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableValues\n*L\n1726#1:1788,6\n1726#1:1795,3\n1726#1:1799,9\n1737#1:1808,6\n1737#1:1815,3\n1737#1:1819,9\n1747#1:1828,6\n1747#1:1835,3\n1747#1:1839,9\n1726#1:1794\n1726#1:1798\n1737#1:1814\n1737#1:1818\n1747#1:1834\n1747#1:1838\n1757#1:1848,3\n*E\n"})
final class n2<K, V> implements Collection<V>, qj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k2<K, V> f12396a;

    public static final class a implements Iterator<V>, qj.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<Integer> f12397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12398b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n2<K, V> f12399c;

        /* JADX INFO: renamed from: androidx.collection.n2$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.MutableValues$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1696}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
        @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableValues$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n1399#3:1794\n1270#3:1798\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableValues$iterator$1$iterator$1\n*L\n1696#1:1788,6\n1696#1:1795,3\n1696#1:1799,9\n1696#1:1794\n1696#1:1798\n*E\n"})
        static final class C0050a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super Integer>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f12400a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f12401b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f12402c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f12403d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f12404e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            long f12405f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f12406g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private /* synthetic */ Object f12407h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ n2<K, V> f12408i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0050a(n2<K, V> n2Var, kotlin.coroutines.d<? super C0050a> dVar) {
                super(2, dVar);
                this.f12408i = n2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0050a c0050a = new C0050a(this.f12408i, dVar);
                c0050a.f12407h = obj;
                return c0050a;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0054  */
            /* JADX WARN: Code duplicated, block: B:21:0x0099 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:22:0x009b  */
            /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0052 -> B:23:0x009f). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:14:0x006b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:20:0x0096). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:20:0x0096). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                /*
                    r19 = this;
                    r0 = r19
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f12406g
                    r3 = 0
                    r4 = 8
                    r5 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r5) goto L27
                    int r2 = r0.f12404e
                    int r6 = r0.f12403d
                    long r7 = r0.f12405f
                    int r9 = r0.f12402c
                    int r10 = r0.f12401b
                    java.lang.Object r11 = r0.f12400a
                    long[] r11 = (long[]) r11
                    java.lang.Object r12 = r0.f12407h
                    kotlin.sequences.n r12 = (kotlin.sequences.n) r12
                    kotlin.ResultKt.m(r20)
                    goto L96
                L27:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L2f:
                    kotlin.ResultKt.m(r20)
                    java.lang.Object r2 = r0.f12407h
                    kotlin.sequences.n r2 = (kotlin.sequences.n) r2
                    androidx.collection.n2<K, V> r6 = r0.f12408i
                    androidx.collection.k2 r6 = androidx.collection.n2.c(r6)
                    long[] r6 = r6.f12130a
                    int r7 = r6.length
                    int r7 = r7 + (-2)
                    if (r7 < 0) goto La4
                    r8 = r3
                L44:
                    r9 = r6[r8]
                    long r11 = ~r9
                    r13 = 7
                    long r11 = r11 << r13
                    long r11 = r11 & r9
                    r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r11 = r11 & r13
                    int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                    if (r11 == 0) goto L9f
                    int r11 = r8 - r7
                    int r11 = ~r11
                    int r11 = r11 >>> 31
                    int r11 = 8 - r11
                    r12 = r11
                    r12 = r11
                    r11 = r6
                    r11 = r6
                    r6 = r12
                    r6 = r12
                    r12 = r2
                    r2 = r3
                    r17 = r9
                    r10 = r7
                    r10 = r7
                    r9 = r8
                    r9 = r8
                    r7 = r17
                L6b:
                    if (r2 >= r6) goto L99
                    r13 = 255(0xff, double:1.26E-321)
                    r13 = 255(0xff, double:1.26E-321)
                    long r13 = r13 & r7
                    r15 = 128(0x80, double:6.3E-322)
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 >= 0) goto L96
                    int r13 = r9 << 3
                    int r13 = r13 + r2
                    java.lang.Integer r13 = kotlin.coroutines.jvm.internal.b.f(r13)
                    r0.f12407h = r12
                    r0.f12400a = r11
                    r0.f12401b = r10
                    r0.f12402c = r9
                    r0.f12405f = r7
                    r0.f12403d = r6
                    r0.f12404e = r2
                    r0.f12406g = r5
                    java.lang.Object r13 = r12.b(r13, r0)
                    if (r13 != r1) goto L96
                    return r1
                L96:
                    long r7 = r7 >> r4
                    int r2 = r2 + r5
                    goto L6b
                L99:
                    if (r6 != r4) goto La4
                    r8 = r9
                    r7 = r10
                    r6 = r11
                    r2 = r12
                L9f:
                    if (r8 == r7) goto La4
                    int r8 = r8 + 1
                    goto L44
                La4:
                    kotlin.Unit r0 = kotlin.Unit.f312394a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.collection.n2.a.C0050a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlin.sequences.n<? super Integer> nVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0050a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(n2<K, V> n2Var) {
            this.f12399c = n2Var;
            this.f12397a = kotlin.sequences.o.a(new C0050a(n2Var, null));
        }

        public final int b() {
            return this.f12398b;
        }

        public final Iterator<Integer> c() {
            return this.f12397a;
        }

        public final void d(int i10) {
            this.f12398b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12397a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            this.f12398b = this.f12397a.next().intValue();
            return (V) ((n2) this.f12399c).f12396a.f12132c[this.f12398b];
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f12398b >= 0) {
                ((n2) this.f12399c).f12396a.o0(this.f12398b);
                this.f12398b = -1;
            }
        }
    }

    public n2(@NotNull k2<K, V> parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f12396a = parent;
    }

    @Override // java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(@NotNull Collection<? extends V> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        this.f12396a.K();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f12396a.h(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f12396a.h((V) it.next())) {
                return false;
            }
        }
        return true;
    }

    public int i() {
        return this.f12396a.f12134e;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f12396a.x();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        return new a(this);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005e A[LOOP:0: B:5:0x000d->B:18:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[SYNTHETIC] */
    @Override // java.util.Collection
    public boolean remove(Object obj) {
        long[] jArr = this.f12396a.f12130a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (Intrinsics.areEqual(this.f12396a.f12132c[i13], obj)) {
                                this.f12396a.o0(i13);
                                return true;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = this.f12396a.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (CollectionsKt.contains(elements, this.f12396a.f12132c[i13])) {
                            this.f12396a.o0(i13);
                            z10 = true;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return z10;
                }
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
        }
    }

    @Override // java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = this.f12396a.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (!CollectionsKt.contains(elements, this.f12396a.f12132c[i13])) {
                            this.f12396a.o0(i13);
                            z10 = true;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return z10;
                }
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.v.b(this, array);
    }
}
