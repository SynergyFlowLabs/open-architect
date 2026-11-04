package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n1726#2,3:1788\n329#3,6:1791\n339#3,3:1798\n342#3,9:1802\n329#3,6:1811\n339#3,3:1818\n342#3,9:1822\n555#3:1831\n556#3:1835\n558#3,2:1837\n560#3,4:1840\n564#3:1847\n565#3:1851\n566#3:1853\n567#3,4:1856\n573#3:1861\n574#3,8:1863\n1399#4:1797\n1270#4:1801\n1399#4:1817\n1270#4:1821\n1165#4,3:1832\n1179#4:1836\n1175#4:1839\n1372#4,3:1844\n1386#4,3:1848\n1312#4:1852\n1303#4:1854\n1297#4:1855\n1309#4:1860\n1393#4:1862\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries\n*L\n1558#1:1788,3\n1574#1:1791,6\n1574#1:1798,3\n1574#1:1802,9\n1592#1:1811,6\n1592#1:1818,3\n1592#1:1822,9\n1605#1:1831\n1605#1:1835\n1605#1:1837,2\n1605#1:1840,4\n1605#1:1847\n1605#1:1851\n1605#1:1853\n1605#1:1856,4\n1605#1:1861\n1605#1:1863,8\n1574#1:1797\n1574#1:1801\n1592#1:1817\n1592#1:1821\n1605#1:1832,3\n1605#1:1836\n1605#1:1839\n1605#1:1844,3\n1605#1:1848,3\n1605#1:1852\n1605#1:1854\n1605#1:1855\n1605#1:1860\n1605#1:1862\n*E\n"})
final class i1<K, V> implements Set<Map.Entry<K, V>>, qj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k2<K, V> f12279a;

    public static final class a implements Iterator<Map.Entry<K, V>>, qj.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterator<? extends Map.Entry<K, V>> f12280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12281b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1<K, V> f12282c;

        /* JADX INFO: renamed from: androidx.collection.i1$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.MutableEntries$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1538}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
        @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries$iterator$1$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n1399#3:1794\n1270#3:1798\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries$iterator$1$1\n*L\n1536#1:1788,6\n1536#1:1795,3\n1536#1:1799,9\n1536#1:1794\n1536#1:1798\n*E\n"})
        static final class C0047a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super Map.Entry<K, V>>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f12283a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f12284b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f12285c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f12286d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f12287e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f12288f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f12289g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            long f12290h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f12291i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private /* synthetic */ Object f12292j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ i1<K, V> f12293k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ a f12294l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0047a(i1<K, V> i1Var, a aVar, kotlin.coroutines.d<? super C0047a> dVar) {
                super(2, dVar);
                this.f12293k = i1Var;
                this.f12294l = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0047a c0047a = new C0047a(this.f12293k, this.f12294l, dVar);
                c0047a.f12292j = obj;
                return c0047a;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x005f  */
            /* JADX WARN: Code duplicated, block: B:25:0x00d4  */
            /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0076). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007f -> B:20:0x00ba). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b7 -> B:21:0x00bd). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d4 -> B:26:0x00d5). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    Method dump skipped, instruction units count: 223
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.collection.i1.a.C0047a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlin.sequences.n<? super Map.Entry<K, V>> nVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0047a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(i1<K, V> i1Var) {
            this.f12282c = i1Var;
            this.f12280a = kotlin.sequences.o.a(new C0047a(i1Var, this, null));
        }

        public final int b() {
            return this.f12281b;
        }

        public final Iterator<Map.Entry<K, V>> c() {
            return this.f12280a;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return this.f12280a.next();
        }

        public final void e(int i10) {
            this.f12281b = i10;
        }

        public final void f(Iterator<? extends Map.Entry<K, V>> it) {
            Intrinsics.checkNotNullParameter(it, "<set-?>");
            this.f12280a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12280a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f12281b != -1) {
                ((i1) this.f12282c).f12279a.o0(this.f12281b);
                this.f12281b = -1;
            }
        }
    }

    public i1(@NotNull k2<K, V> parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f12279a = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends Map.Entry<K, V>> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f12279a.K();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (kotlin.jvm.internal.r1.I(obj)) {
            return i((Map.Entry) obj);
        }
        return false;
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
            Map.Entry entry = (Map.Entry) it.next();
            if (!Intrinsics.areEqual(this.f12279a.p((K) entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(@NotNull Map.Entry<K, V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    public boolean i(@NotNull Map.Entry<K, V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return Intrinsics.areEqual(this.f12279a.p(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f12279a.x();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new a(this);
    }

    public int k() {
        return this.f12279a.f12134e;
    }

    public boolean l(@NotNull Map.Entry<K, V> element) {
        int iNumberOfTrailingZeros;
        Intrinsics.checkNotNullParameter(element, "element");
        k2<K, V> k2Var = this.f12279a;
        K key = element.getKey();
        int iHashCode = (key != null ? key.hashCode() : 0) * b3.f12150j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = k2Var.f12133d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = k2Var.f12130a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            int i17 = i13;
            long j10 = (((-i16) >> 63) & (jArr[i15 + 1] << (64 - i16))) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * b3.f12151k) ^ j10;
            long j12 = -9187201950435737472L;
            long j13 = (~j11) & (j11 - b3.f12151k) & (-9187201950435737472L);
            while (j13 != 0) {
                iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j13) >> 3)) & i12;
                long j14 = j12;
                if (Intrinsics.areEqual(k2Var.f12131b[iNumberOfTrailingZeros], key)) {
                    break loop0;
                }
                j13 &= j13 - 1;
                j12 = j14;
            }
            if ((j10 & ((~j10) << 6) & j12) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i17 + i14) & i12;
        }
        if (iNumberOfTrailingZeros < 0 || !Intrinsics.areEqual(this.f12279a.f12132c[iNumberOfTrailingZeros], element.getValue())) {
            return false;
        }
        this.f12279a.o0(iNumberOfTrailingZeros);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (kotlin.jvm.internal.r1.I(obj)) {
            return l((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = this.f12279a.f12130a;
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
                    if ((255 & j10) >= 128) {
                        break;
                        break;
                    }
                    int i13 = (i10 << 3) + i12;
                    Iterator<? extends Object> it = elements.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (Intrinsics.areEqual(entry.getKey(), this.f12279a.f12131b[i13]) && Intrinsics.areEqual(entry.getValue(), this.f12279a.f12132c[i13])) {
                            this.f12279a.o0(i13);
                            z10 = true;
                            break;
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
        long[] jArr = this.f12279a.f12130a;
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
                        Iterator<? extends Object> it = elements.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                this.f12279a.o0(i13);
                                z10 = true;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (Intrinsics.areEqual(entry.getKey(), this.f12279a.f12131b[i13]) && Intrinsics.areEqual(entry.getValue(), this.f12279a.f12132c[i13])) {
                                break;
                            }
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
        return k();
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
