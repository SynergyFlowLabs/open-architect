package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableKeys\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n329#2,6:1808\n339#2,3:1815\n342#2,9:1819\n555#2:1828\n556#2:1832\n558#2,2:1834\n560#2,4:1837\n564#2:1844\n565#2:1848\n566#2:1850\n567#2,4:1853\n573#2:1858\n574#2,8:1860\n1399#3:1794\n1270#3:1798\n1399#3:1814\n1270#3:1818\n1165#3,3:1829\n1179#3:1833\n1175#3:1836\n1372#3,3:1841\n1386#3,3:1845\n1312#3:1849\n1303#3:1851\n1297#3:1852\n1309#3:1857\n1393#3:1859\n1726#4,3:1868\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableKeys\n*L\n1652#1:1788,6\n1652#1:1795,3\n1652#1:1799,9\n1663#1:1808,6\n1663#1:1815,3\n1663#1:1819,9\n1673#1:1828\n1673#1:1832\n1673#1:1834,2\n1673#1:1837,4\n1673#1:1844\n1673#1:1848\n1673#1:1850\n1673#1:1853,4\n1673#1:1858\n1673#1:1860,8\n1652#1:1794\n1652#1:1798\n1663#1:1814\n1663#1:1818\n1673#1:1829,3\n1673#1:1833\n1673#1:1836\n1673#1:1841,3\n1673#1:1845,3\n1673#1:1849\n1673#1:1851\n1673#1:1852\n1673#1:1857\n1673#1:1859\n1682#1:1868,3\n*E\n"})
final class v1<K, V> implements Set<K>, qj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k2<K, V> f12479a;

    public static final class a implements Iterator<K>, qj.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<Integer> f12480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12481b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v1<K, V> f12482c;

        /* JADX INFO: renamed from: androidx.collection.v1$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.MutableKeys$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1622}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
        @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableKeys$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n1399#3:1794\n1270#3:1798\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableKeys$iterator$1$iterator$1\n*L\n1622#1:1788,6\n1622#1:1795,3\n1622#1:1799,9\n1622#1:1794\n1622#1:1798\n*E\n"})
        static final class C0051a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super Integer>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f12483a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f12484b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f12485c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f12486d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f12487e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            long f12488f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f12489g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private /* synthetic */ Object f12490h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ v1<K, V> f12491i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0051a(v1<K, V> v1Var, kotlin.coroutines.d<? super C0051a> dVar) {
                super(2, dVar);
                this.f12491i = v1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0051a c0051a = new C0051a(this.f12491i, dVar);
                c0051a.f12490h = obj;
                return c0051a;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0056  */
            /* JADX WARN: Code duplicated, block: B:21:0x009a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:22:0x009c  */
            /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0054 -> B:23:0x00a1). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0056 -> B:14:0x006a). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0077 -> B:20:0x0097). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0094 -> B:20:0x0097). Please report as a decompilation issue!!! */
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
                    r0 = r19
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f12489g
                    r3 = 0
                    r4 = 8
                    r5 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r5) goto L29
                    int r2 = r0.f12487e
                    int r6 = r0.f12486d
                    long r7 = r0.f12488f
                    int r9 = r0.f12485c
                    int r10 = r0.f12484b
                    java.lang.Object r11 = r0.f12483a
                    long[] r11 = (long[]) r11
                    java.lang.Object r12 = r0.f12490h
                    kotlin.sequences.n r12 = (kotlin.sequences.n) r12
                    kotlin.ResultKt.m(r20)
                    goto L97
                L29:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L31:
                    kotlin.ResultKt.m(r20)
                    java.lang.Object r2 = r0.f12490h
                    kotlin.sequences.n r2 = (kotlin.sequences.n) r2
                    androidx.collection.v1<K, V> r6 = r0.f12491i
                    androidx.collection.k2 r6 = androidx.collection.v1.c(r6)
                    long[] r6 = r6.f12130a
                    int r7 = r6.length
                    int r7 = r7 + (-2)
                    if (r7 < 0) goto La6
                    r8 = r3
                L46:
                    r9 = r6[r8]
                    long r11 = ~r9
                    r13 = 7
                    long r11 = r11 << r13
                    long r11 = r11 & r9
                    r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r11 = r11 & r13
                    int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                    if (r11 == 0) goto La1
                    int r11 = r8 - r7
                    int r11 = ~r11
                    int r11 = r11 >>> 31
                    int r11 = 8 - r11
                    r12 = r11
                    r11 = r6
                    r6 = r12
                    r12 = r2
                    r12 = r2
                    r2 = r3
                    r17 = r9
                    r10 = r7
                    r9 = r8
                    r9 = r8
                    r7 = r17
                L6a:
                    if (r2 >= r6) goto L9a
                    r13 = 255(0xff, double:1.26E-321)
                    r13 = 255(0xff, double:1.26E-321)
                    long r13 = r13 & r7
                    r15 = 128(0x80, double:6.3E-322)
                    r15 = 128(0x80, double:6.3E-322)
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 >= 0) goto L97
                    int r13 = r9 << 3
                    int r13 = r13 + r2
                    java.lang.Integer r13 = kotlin.coroutines.jvm.internal.b.f(r13)
                    r0.f12490h = r12
                    r0.f12483a = r11
                    r0.f12484b = r10
                    r0.f12485c = r9
                    r0.f12488f = r7
                    r0.f12486d = r6
                    r0.f12487e = r2
                    r0.f12489g = r5
                    java.lang.Object r13 = r12.b(r13, r0)
                    if (r13 != r1) goto L97
                    return r1
                L97:
                    long r7 = r7 >> r4
                    int r2 = r2 + r5
                    goto L6a
                L9a:
                    if (r6 != r4) goto La6
                    r8 = r9
                    r8 = r9
                    r7 = r10
                    r6 = r11
                    r2 = r12
                La1:
                    if (r8 == r7) goto La6
                    int r8 = r8 + 1
                    goto L46
                La6:
                    kotlin.Unit r0 = kotlin.Unit.f312394a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.collection.v1.a.C0051a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlin.sequences.n<? super Integer> nVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0051a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(v1<K, V> v1Var) {
            this.f12482c = v1Var;
            this.f12480a = kotlin.sequences.o.a(new C0051a(v1Var, null));
        }

        public final int b() {
            return this.f12481b;
        }

        public final Iterator<Integer> c() {
            return this.f12480a;
        }

        public final void d(int i10) {
            this.f12481b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12480a.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            this.f12481b = this.f12480a.next().intValue();
            return (K) ((v1) this.f12482c).f12479a.f12131b[this.f12481b];
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f12481b >= 0) {
                ((v1) this.f12482c).f12479a.o0(this.f12481b);
                this.f12481b = -1;
            }
        }
    }

    public v1(@NotNull k2<K, V> parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f12479a = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K k10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends K> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f12479a.K();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f12479a.g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f12479a.g((K) it.next())) {
                return false;
            }
        }
        return true;
    }

    public int i() {
        return this.f12479a.f12134e;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f12479a.x();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<K> iterator() {
        return new a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        boolean z10;
        int iNumberOfTrailingZeros;
        k2<K, V> k2Var = this.f12479a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = k2Var.f12133d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = k2Var.f12130a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * b3.f12151k) ^ j10;
            for (long j12 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                z10 = false;
                if (Intrinsics.areEqual(k2Var.f12131b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            z10 = false;
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (iNumberOfTrailingZeros < 0) {
            return z10;
        }
        this.f12479a.o0(iNumberOfTrailingZeros);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = this.f12479a.f12130a;
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
                        if (CollectionsKt.contains(elements, this.f12479a.f12131b[i13])) {
                            this.f12479a.o0(i13);
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

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = this.f12479a.f12130a;
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
                        if (!CollectionsKt.contains(elements, this.f12479a.f12131b[i13])) {
                            this.f12479a.o0(i13);
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

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.v.b(this, array);
    }
}
