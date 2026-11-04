package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/Keys\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1787:1\n1726#2,3:1788\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/Keys\n*L\n1434#1:1788,3\n*E\n"})
final class n0<K, V> implements Set<K>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a3<K, V> f12384a;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.Keys$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {1431}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/Keys$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n365#2,3:1788\n329#2,6:1791\n339#2,3:1798\n342#2,9:1802\n368#2:1811\n1399#3:1797\n1270#3:1801\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/Keys$iterator$1\n*L\n1431#1:1788,3\n1431#1:1791,6\n1431#1:1798,3\n1431#1:1802,9\n1431#1:1811\n1431#1:1797\n1431#1:1801\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super K>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f12385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f12386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f12388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f12389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f12390f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f12391g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f12392h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f12393i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ n0<K, V> f12394j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n0<K, V> n0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f12394j = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f12394j, dVar);
            aVar.f12393i = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x005a  */
        /* JADX WARN: Code duplicated, block: B:21:0x009c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x009e  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:23:0x00a5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:14:0x006e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0079 -> B:20:0x0099). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0096 -> B:20:0x0099). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f12392h
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L33
                if (r2 != r5) goto L2b
                int r2 = r0.f12390f
                int r6 = r0.f12389e
                long r7 = r0.f12391g
                int r9 = r0.f12388d
                int r10 = r0.f12387c
                java.lang.Object r11 = r0.f12386b
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f12385a
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.f12393i
                kotlin.sequences.n r13 = (kotlin.sequences.n) r13
                kotlin.ResultKt.m(r21)
                goto L99
            L2b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L33:
                kotlin.ResultKt.m(r21)
                java.lang.Object r2 = r0.f12393i
                kotlin.sequences.n r2 = (kotlin.sequences.n) r2
                androidx.collection.n0<K, V> r6 = r0.f12394j
                androidx.collection.a3 r6 = androidx.collection.n0.c(r6)
                java.lang.Object[] r7 = r6.f12131b
                long[] r6 = r6.f12130a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto Laa
                r9 = r3
            L4a:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto La5
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r11 = r6
                r10 = r8
                r10 = r8
                r6 = r12
                r6 = r12
                r12 = r7
                r7 = r18
            L6e:
                if (r2 >= r6) goto L9c
                r14 = 255(0xff, double:1.26E-321)
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L99
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f12393i = r13
                r0.f12385a = r12
                r0.f12386b = r11
                r0.f12387c = r10
                r0.f12388d = r9
                r0.f12391g = r7
                r0.f12389e = r6
                r0.f12390f = r2
                r0.f12392h = r5
                java.lang.Object r14 = r13.b(r14, r0)
                if (r14 != r1) goto L99
                return r1
            L99:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L6e
            L9c:
                if (r6 != r4) goto Laa
                r8 = r10
                r8 = r10
                r6 = r11
                r6 = r11
                r7 = r12
                r7 = r12
                r2 = r13
            La5:
                if (r9 == r8) goto Laa
                int r9 = r9 + 1
                goto L4a
            Laa:
                kotlin.Unit r0 = kotlin.Unit.f312394a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.n0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super K> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public n0(@NotNull a3<K, V> parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f12384a = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K k10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends K> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f12384a.g(obj);
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
            if (!this.f12384a.g((K) it.next())) {
                return false;
            }
        }
        return true;
    }

    public int i() {
        return this.f12384a.f12134e;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f12384a.x();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<K> iterator() {
        return kotlin.sequences.o.a(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
