package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class j2<E> extends y2<E> implements Set<E>, qj.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i2<E> f12307b;

    public static final class a implements Iterator<E>, qj.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12308a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<E> f12309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j2<E> f12310c;

        /* JADX INFO: renamed from: androidx.collection.j2$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", i = {0, 0, 0}, l = {1489}, m = "invokeSuspend", n = {"$this$iterator", "nodes$iv", "previousNode$iv"}, s = {"L$0", "L$3", "I$0"})
        @SourceDebugExtension({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1\n+ 2 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 3 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1511:1\n255#2,6:1512\n261#2,4:1519\n1123#3:1518\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1\n*L\n1487#1:1512,6\n1487#1:1519,4\n1487#1:1518\n*E\n"})
        static final class C0048a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super E>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f12311a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f12312b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f12313c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f12314d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f12315e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f12316f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ j2<E> f12317g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ a f12318h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0048a(j2<E> j2Var, a aVar, kotlin.coroutines.d<? super C0048a> dVar) {
                super(2, dVar);
                this.f12317g = j2Var;
                this.f12318h = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0048a c0048a = new C0048a(this.f12317g, this.f12318h, dVar);
                c0048a.f12316f = obj;
                return c0048a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                j2<E> j2Var;
                int i10;
                a aVar;
                long[] jArr;
                kotlin.sequences.n nVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f12315e;
                if (i11 == 0) {
                    ResultKt.m(obj);
                    kotlin.sequences.n nVar2 = (kotlin.sequences.n) this.f12316f;
                    i2 i2Var = ((j2) this.f12317g).f12307b;
                    a aVar2 = this.f12318h;
                    j2Var = this.f12317g;
                    long[] jArr2 = i2Var.f12499c;
                    i10 = i2Var.f12501e;
                    aVar = aVar2;
                    jArr = jArr2;
                    nVar = nVar2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f12314d;
                    jArr = (long[]) this.f12313c;
                    j2Var = (j2) this.f12312b;
                    aVar = (a) this.f12311a;
                    nVar = (kotlin.sequences.n) this.f12316f;
                    ResultKt.m(obj);
                }
                while (i10 != Integer.MAX_VALUE) {
                    int i12 = (int) ((jArr[i10] >> 31) & g3.f12256c);
                    aVar.d(i10);
                    Object obj2 = ((j2) j2Var).f12307b.f12498b[i10];
                    this.f12316f = nVar;
                    this.f12311a = aVar;
                    this.f12312b = j2Var;
                    this.f12313c = jArr;
                    this.f12314d = i12;
                    this.f12315e = 1;
                    if (nVar.b(obj2, this) == objL) {
                        return objL;
                    }
                    i10 = i12;
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlin.sequences.n<? super E> nVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0048a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(j2<E> j2Var) {
            this.f12310c = j2Var;
            this.f12309b = kotlin.sequences.o.a(new C0048a(j2Var, this, null));
        }

        public final int b() {
            return this.f12308a;
        }

        public final Iterator<E> c() {
            return this.f12309b;
        }

        public final void d(int i10) {
            this.f12308a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12309b.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            return this.f12309b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f12308a != -1) {
                ((j2) this.f12310c).f12307b.A0(this.f12308a);
                this.f12308a = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(@NotNull i2<E> parent) {
        super(parent);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f12307b = parent;
    }

    @Override // androidx.collection.y2, java.util.Set, java.util.Collection
    public boolean add(E e10) {
        return this.f12307b.M(e10);
    }

    @Override // androidx.collection.y2, java.util.Set, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f12307b.Q(elements);
    }

    @Override // androidx.collection.y2, java.util.Set, java.util.Collection
    public void clear() {
        this.f12307b.V();
    }

    @Override // androidx.collection.y2, java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return new a(this);
    }

    @Override // androidx.collection.y2, java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f12307b.t0(obj);
    }

    @Override // androidx.collection.y2, java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f12307b.x0(elements);
    }

    @Override // androidx.collection.y2, java.util.Set, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f12307b.G0(elements);
    }
}
