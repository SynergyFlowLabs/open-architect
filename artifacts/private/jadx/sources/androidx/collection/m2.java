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
final class m2<E> extends e3<E> implements Set<E>, qj.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l2<E> f12356b;

    public static final class a implements Iterator<E>, qj.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12357a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<E> f12358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m2<E> f12359c;

        /* JADX INFO: renamed from: androidx.collection.m2$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1188}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
        @SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableSetWrapper$iterator$1$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1210:1\n200#2,7:1211\n211#2,3:1219\n214#2,9:1223\n1399#3:1218\n1270#3:1222\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableSetWrapper$iterator$1$iterator$1\n*L\n1186#1:1211,7\n1186#1:1219,3\n1186#1:1223,9\n1186#1:1218\n1186#1:1222\n*E\n"})
        static final class C0049a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super E>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f12360a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f12361b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f12362c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f12363d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f12364e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f12365f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f12366g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            long f12367h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f12368i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private /* synthetic */ Object f12369j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ m2<E> f12370k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ a f12371l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0049a(m2<E> m2Var, a aVar, kotlin.coroutines.d<? super C0049a> dVar) {
                super(2, dVar);
                this.f12370k = m2Var;
                this.f12371l = aVar;
                int i10 = 1 << 2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0049a c0049a = new C0049a(this.f12370k, this.f12371l, dVar);
                c0049a.f12369j = obj;
                return c0049a;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0061  */
            /* JADX WARN: Code duplicated, block: B:21:0x00b2 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:22:0x00b4  */
            /* JADX WARN: Code duplicated, block: B:24:0x00bd  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005f -> B:23:0x00bb). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0061 -> B:14:0x0077). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0084 -> B:20:0x00af). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ac -> B:20:0x00af). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    r21 = this;
                    r0 = r21
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f12368i
                    r4 = 8
                    r5 = 1
                    if (r2 == 0) goto L38
                    if (r2 != r5) goto L2e
                    int r2 = r0.f12366g
                    int r6 = r0.f12365f
                    long r7 = r0.f12367h
                    int r9 = r0.f12364e
                    int r10 = r0.f12363d
                    java.lang.Object r11 = r0.f12362c
                    long[] r11 = (long[]) r11
                    java.lang.Object r12 = r0.f12361b
                    androidx.collection.m2 r12 = (androidx.collection.m2) r12
                    java.lang.Object r13 = r0.f12360a
                    androidx.collection.m2$a r13 = (androidx.collection.m2.a) r13
                    java.lang.Object r14 = r0.f12369j
                    kotlin.sequences.n r14 = (kotlin.sequences.n) r14
                    kotlin.ResultKt.m(r22)
                    goto Laf
                L2e:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "eese rv//f/m tt/nt he/ewr/nocoo/slrbui/ k oio ecila"
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L38:
                    kotlin.ResultKt.m(r22)
                    java.lang.Object r2 = r0.f12369j
                    kotlin.sequences.n r2 = (kotlin.sequences.n) r2
                    androidx.collection.m2<E> r6 = r0.f12370k
                    androidx.collection.l2 r6 = androidx.collection.m2.k(r6)
                    androidx.collection.m2$a r7 = r0.f12371l
                    androidx.collection.m2<E> r8 = r0.f12370k
                    long[] r6 = r6.f12170a
                    int r9 = r6.length
                    int r9 = r9 + (-2)
                    if (r9 < 0) goto Lc0
                    r10 = 0
                L51:
                    r11 = r6[r10]
                    long r13 = ~r11
                    r15 = 7
                    long r13 = r13 << r15
                    long r13 = r13 & r11
                    r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r13 = r13 & r15
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 == 0) goto Lbb
                    int r13 = r10 - r9
                    int r13 = ~r13
                    int r13 = r13 >>> 31
                    int r13 = 8 - r13
                    r14 = r10
                    r10 = r9
                    r9 = r14
                    r14 = r2
                    r2 = 0
                    r19 = r11
                    r11 = r6
                    r12 = r8
                    r12 = r8
                    r6 = r13
                    r13 = r7
                    r13 = r7
                    r7 = r19
                L77:
                    if (r2 >= r6) goto Lb2
                    r15 = 255(0xff, double:1.26E-321)
                    r15 = 255(0xff, double:1.26E-321)
                    long r15 = r15 & r7
                    r17 = 128(0x80, double:6.3E-322)
                    r17 = 128(0x80, double:6.3E-322)
                    int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                    if (r15 >= 0) goto Laf
                    int r15 = r9 << 3
                    int r15 = r15 + r2
                    r13.d(r15)
                    androidx.collection.l2 r3 = androidx.collection.m2.k(r12)
                    java.lang.Object[] r3 = r3.f12171b
                    r3 = r3[r15]
                    r0.f12369j = r14
                    r0.f12360a = r13
                    r0.f12361b = r12
                    r0.f12362c = r11
                    r0.f12363d = r10
                    r0.f12364e = r9
                    r0.f12367h = r7
                    r0.f12365f = r6
                    r0.f12366g = r2
                    r0.f12368i = r5
                    java.lang.Object r3 = r14.b(r3, r0)
                    if (r3 != r1) goto Laf
                    return r1
                Laf:
                    long r7 = r7 >> r4
                    int r2 = r2 + r5
                    goto L77
                Lb2:
                    if (r6 != r4) goto Lc0
                    r2 = r10
                    r10 = r9
                    r9 = r2
                    r6 = r11
                    r8 = r12
                    r7 = r13
                    r2 = r14
                Lbb:
                    if (r10 == r9) goto Lc0
                    int r10 = r10 + 1
                    goto L51
                Lc0:
                    kotlin.Unit r0 = kotlin.Unit.f312394a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.collection.m2.a.C0049a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlin.sequences.n<? super E> nVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0049a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(m2<E> m2Var) {
            this.f12359c = m2Var;
            this.f12358b = kotlin.sequences.o.a(new C0049a(m2Var, this, null));
        }

        public final int b() {
            return this.f12357a;
        }

        public final Iterator<E> c() {
            return this.f12358b;
        }

        public final void d(int i10) {
            this.f12357a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12358b.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            return this.f12358b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f12357a != -1) {
                ((m2) this.f12359c).f12356b.n0(this.f12357a);
                this.f12357a = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(@NotNull l2<E> parent) {
        super(parent);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f12356b = parent;
    }

    @Override // androidx.collection.e3, java.util.Set, java.util.Collection
    public boolean add(E e10) {
        return this.f12356b.C(e10);
    }

    @Override // androidx.collection.e3, java.util.Set, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f12356b.G(elements);
    }

    @Override // androidx.collection.e3, java.util.Set, java.util.Collection
    public void clear() {
        this.f12356b.L();
    }

    @Override // androidx.collection.e3, java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return new a(this);
    }

    @Override // androidx.collection.e3, java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f12356b.g0(obj);
    }

    @Override // androidx.collection.e3, java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f12356b.k0(elements);
    }

    @Override // androidx.collection.e3, java.util.Set, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f12356b.s0(elements);
    }
}
