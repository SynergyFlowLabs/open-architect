package androidx.compose.ui.node;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,407:1\n100#1:408\n113#1,10:409\n113#1,10:419\n113#1,10:429\n113#1,10:439\n113#1,10:449\n100#1:459\n113#1,10:460\n100#1:470\n113#1,10:471\n1863#2,2:481\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n92#1:408\n92#1:409,10\n100#1:419,10\n131#1:429,10\n144#1:439,10\n156#1:449,10\n176#1:459\n176#1:460,10\n194#1:470\n194#1:471,10\n246#1:481,2\n*E\n"})
public final class w implements List<androidx.compose.ui.a0.d>, qj.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f40040d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private androidx.collection.g2<Object> f40041a = new androidx.collection.g2<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.collection.y1 f40042b = new androidx.collection.y1(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40043c = -1;

    @SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,407:1\n1863#2,2:408\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n*L\n320#1:408,2\n*E\n"})
    private final class b implements List<androidx.compose.ui.a0.d>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f40048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f40049b;

        public b(int i10, int i11) {
            this.f40048a = i10;
            this.f40049b = i11;
        }

        public androidx.compose.ui.a0.d A() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public androidx.compose.ui.a0.d B(int i10, androidx.compose.ui.a0.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i10, androidx.compose.ui.a0.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends androidx.compose.ui.a0.d> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void c(int i10, androidx.compose.ui.a0.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof androidx.compose.ui.a0.d) {
                return l((androidx.compose.ui.a0.d) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((androidx.compose.ui.a0.d) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean d(androidx.compose.ui.a0.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void i(androidx.compose.ui.a0.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof androidx.compose.ui.a0.d) {
                return t((androidx.compose.ui.a0.d) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<androidx.compose.ui.a0.d> iterator() {
            w wVar = w.this;
            int i10 = this.f40048a;
            return wVar.new a(i10, i10, this.f40049b);
        }

        public void k(androidx.compose.ui.a0.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean l(@NotNull androidx.compose.ui.a0.d dVar) {
            return indexOf(dVar) != -1;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof androidx.compose.ui.a0.d) {
                return u((androidx.compose.ui.a0.d) obj);
            }
            return -1;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<androidx.compose.ui.a0.d> listIterator() {
            w wVar = w.this;
            int i10 = this.f40048a;
            return wVar.new a(i10, i10, this.f40049b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        @NotNull
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.a0.d get(int i10) {
            E eY = w.this.f40041a.y(i10 + this.f40048a);
            Intrinsics.checkNotNull(eY, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.a0.d) eY;
        }

        public final int n() {
            return this.f40049b;
        }

        public final int p() {
            return this.f40048a;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0.d remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<androidx.compose.ui.a0.d> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int s() {
            return this.f40049b - this.f40048a;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0.d set(int i10, androidx.compose.ui.a0.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return s();
        }

        @Override // java.util.List
        public void sort(Comparator<? super androidx.compose.ui.a0.d> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @NotNull
        public List<androidx.compose.ui.a0.d> subList(int i10, int i11) {
            w wVar = w.this;
            int i12 = this.f40048a;
            return wVar.new b(i10 + i12, i12 + i11);
        }

        public int t(@NotNull androidx.compose.ui.a0.d dVar) {
            int i10 = this.f40048a;
            int i11 = this.f40049b;
            if (i10 <= i11) {
                while (!Intrinsics.areEqual(w.this.f40041a.y(i10), dVar)) {
                    if (i10 != i11) {
                        i10++;
                    }
                }
                return i10 - this.f40048a;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.v.a(this);
        }

        public int u(@NotNull androidx.compose.ui.a0.d dVar) {
            int i10 = this.f40049b;
            int i11 = this.f40048a;
            if (i11 > i10) {
                return -1;
            }
            while (!Intrinsics.areEqual(w.this.f40041a.y(i10), dVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f40048a;
        }

        public androidx.compose.ui.a0.d v(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public androidx.compose.ui.a0.d w() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends androidx.compose.ui.a0.d> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<androidx.compose.ui.a0.d> listIterator(int i10) {
            w wVar = w.this;
            int i11 = this.f40048a;
            return wVar.new a(i10 + i11, i11, this.f40049b);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.v.b(this, tArr);
        }
    }

    private final void P(int i10) {
        this.f40041a.J0(i10);
        this.f40042b.s0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(int i10, int i11) {
        if (i10 >= i11) {
            return;
        }
        this.f40041a.L0(i10, i11);
        this.f40042b.t0(i10, i11);
    }

    private final long v() {
        long jB = x.b(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i10 = this.f40043c + 1;
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (i10 <= lastIndex) {
            while (true) {
                long jC = r.c(this.f40042b.w(i10));
                if (r.b(jC, jB) < 0) {
                    jB = jC;
                }
                if ((r.f(jB) < 0.0f && r.j(jB)) || i10 == lastIndex) {
                    break;
                    break;
                }
                i10++;
            }
        }
        return jB;
    }

    public int A() {
        return this.f40041a.C();
    }

    public final boolean B() {
        long jV = v();
        return r.f(jV) < 0.0f && r.j(jV) && !r.i(jV);
    }

    public final void C(@NotNull androidx.compose.ui.a0.d dVar, boolean z10, @NotNull Function0<Unit> function0) {
        int i10 = this.f40043c;
        Q(this.f40043c + 1, size());
        this.f40043c++;
        this.f40041a.a0(dVar);
        this.f40042b.b0(x.a(-1.0f, z10, false));
        function0.invoke();
        this.f40043c = i10;
    }

    public final void D(@NotNull androidx.compose.ui.a0.d dVar, boolean z10, @NotNull Function0<Unit> function0) {
        if (this.f40043c == CollectionsKt.getLastIndex(this)) {
            int i10 = this.f40043c;
            Q(this.f40043c + 1, size());
            this.f40043c++;
            this.f40041a.a0(dVar);
            this.f40042b.b0(x.a(0.0f, z10, true));
            function0.invoke();
            this.f40043c = i10;
            return;
        }
        long jV = v();
        int i11 = this.f40043c;
        if (!r.i(jV)) {
            if (r.f(jV) > 0.0f) {
                int i12 = this.f40043c;
                Q(this.f40043c + 1, size());
                this.f40043c++;
                this.f40041a.a0(dVar);
                this.f40042b.b0(x.a(0.0f, z10, true));
                function0.invoke();
                this.f40043c = i12;
                return;
            }
            return;
        }
        this.f40043c = CollectionsKt.getLastIndex(this);
        int i13 = this.f40043c;
        Q(this.f40043c + 1, size());
        this.f40043c++;
        this.f40041a.a0(dVar);
        this.f40042b.b0(x.a(0.0f, z10, true));
        function0.invoke();
        this.f40043c = i13;
        if (r.f(v()) < 0.0f) {
            Q(i11 + 1, this.f40043c + 1);
        }
        this.f40043c = i11;
    }

    public final void F(@NotNull androidx.compose.ui.a0.d dVar, float f10, boolean z10, @NotNull Function0<Unit> function0) {
        int i10 = this.f40043c;
        Q(this.f40043c + 1, size());
        this.f40043c++;
        this.f40041a.a0(dVar);
        this.f40042b.b0(x.a(f10, z10, false));
        function0.invoke();
        this.f40043c = i10;
    }

    public final void G(@NotNull androidx.compose.ui.a0.d dVar, float f10, boolean z10, boolean z11, @NotNull Function0<Unit> function0) {
        int i10 = this.f40043c;
        Q(this.f40043c + 1, size());
        this.f40043c++;
        this.f40041a.a0(dVar);
        this.f40042b.b0(x.a(f10, z10, z11));
        function0.invoke();
        this.f40043c = i10;
    }

    public int J(@NotNull androidx.compose.ui.a0.d dVar) {
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (!Intrinsics.areEqual(this.f40041a.y(i10), dVar)) {
                if (i10 != lastIndex) {
                    i10++;
                }
            }
            return i10;
        }
        return -1;
    }

    public final boolean K(float f10, boolean z10) {
        if (this.f40043c == CollectionsKt.getLastIndex(this)) {
            return true;
        }
        return r.b(v(), x.b(f10, z10, false, 4, null)) > 0;
    }

    public int L(@NotNull androidx.compose.ui.a0.d dVar) {
        for (int lastIndex = CollectionsKt.getLastIndex(this); -1 < lastIndex; lastIndex--) {
            if (Intrinsics.areEqual(this.f40041a.y(lastIndex), dVar)) {
                return lastIndex;
            }
        }
        return -1;
    }

    public androidx.compose.ui.a0.d M(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public androidx.compose.ui.a0.d N() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public androidx.compose.ui.a0.d O() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public androidx.compose.ui.a0.d R(int i10, androidx.compose.ui.a0.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void T(@NotNull Function0<Unit> function0) {
        int i10 = this.f40043c;
        function0.invoke();
        this.f40043c = i10;
    }

    public final void Y(@NotNull androidx.compose.ui.a0.d dVar, float f10, boolean z10, @NotNull Function0<Unit> function0) {
        if (this.f40043c == CollectionsKt.getLastIndex(this)) {
            int i10 = this.f40043c;
            Q(this.f40043c + 1, size());
            this.f40043c++;
            this.f40041a.a0(dVar);
            this.f40042b.b0(x.a(f10, z10, false));
            function0.invoke();
            this.f40043c = i10;
            if (this.f40043c + 1 == CollectionsKt.getLastIndex(this) || r.i(v())) {
                P(this.f40043c + 1);
                return;
            }
            return;
        }
        long jV = v();
        int i11 = this.f40043c;
        this.f40043c = CollectionsKt.getLastIndex(this);
        int i12 = this.f40043c;
        Q(this.f40043c + 1, size());
        this.f40043c++;
        this.f40041a.a0(dVar);
        this.f40042b.b0(x.a(f10, z10, false));
        function0.invoke();
        this.f40043c = i12;
        long jV2 = v();
        if (this.f40043c + 1 >= CollectionsKt.getLastIndex(this) || r.b(jV, jV2) <= 0) {
            Q(this.f40043c + 1, size());
        } else {
            Q(i11 + 1, r.i(jV2) ? this.f40043c + 2 : this.f40043c + 1);
        }
        this.f40043c = i11;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, androidx.compose.ui.a0.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends androidx.compose.ui.a0.d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void c() {
        this.f40043c = size() - 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f40043c = -1;
        this.f40041a.l0();
        this.f40042b.g0();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof androidx.compose.ui.a0.d) {
            return u((androidx.compose.ui.a0.d) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((androidx.compose.ui.a0.d) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof androidx.compose.ui.a0.d) {
            return J((androidx.compose.ui.a0.d) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f40041a.H();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<androidx.compose.ui.a0.d> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof androidx.compose.ui.a0.d) {
            return L((androidx.compose.ui.a0.d) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<androidx.compose.ui.a0.d> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    public void n(int i10, androidx.compose.ui.a0.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean p(androidx.compose.ui.a0.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ androidx.compose.ui.a0.d remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<androidx.compose.ui.a0.d> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void s(androidx.compose.ui.a0.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ androidx.compose.ui.a0.d set(int i10, androidx.compose.ui.a0.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return A();
    }

    @Override // java.util.List
    public void sort(Comparator<? super androidx.compose.ui.a0.d> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<androidx.compose.ui.a0.d> subList(int i10, int i11) {
        return new b(i10, i11);
    }

    public void t(androidx.compose.ui.a0.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    public boolean u(@NotNull androidx.compose.ui.a0.d dVar) {
        return indexOf(dVar) != -1;
    }

    @Override // java.util.List
    @NotNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.a0.d get(int i10) {
        Object objY = this.f40041a.y(i10);
        Intrinsics.checkNotNull(objY, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (androidx.compose.ui.a0.d) objY;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends androidx.compose.ui.a0.d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<androidx.compose.ui.a0.d> listIterator(int i10) {
        return new a(this, i10, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }

    private final class a implements ListIterator<androidx.compose.ui.a0.d>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f40044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f40045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f40046c;

        public a(int i10, int i11, int i12) {
            this.f40044a = i10;
            this.f40045b = i11;
            this.f40046c = i12;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(androidx.compose.ui.a0.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void b(androidx.compose.ui.a0.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int c() {
            return this.f40044a;
        }

        public final int d() {
            return this.f40046c;
        }

        public final int e() {
            return this.f40045b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator, java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.a0.d next() {
            androidx.collection.g2 g2Var = w.this.f40041a;
            int i10 = this.f40044a;
            this.f40044a = i10 + 1;
            E eY = g2Var.y(i10);
            Intrinsics.checkNotNull(eY, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.a0.d) eY;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.a0.d previous() {
            androidx.collection.g2 g2Var = w.this.f40041a;
            int i10 = this.f40044a - 1;
            this.f40044a = i10;
            E eY = g2Var.y(i10);
            Intrinsics.checkNotNull(eY, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.a0.d) eY;
        }

        public void h(androidx.compose.ui.a0.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f40044a < this.f40046c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f40044a > this.f40045b;
        }

        public final void i(int i10) {
            this.f40044a = i10;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f40044a - this.f40045b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f40044a - this.f40045b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(androidx.compose.ui.a0.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(w wVar, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? wVar.size() : i12);
        }
    }
}
