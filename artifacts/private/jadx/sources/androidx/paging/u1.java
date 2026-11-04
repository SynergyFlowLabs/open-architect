package androidx.paging;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPagedStorage.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagedStorage.jvm.kt\nandroidx/paging/PagedStorage\n*L\n1#1,354:1\n149#1,15:355\n*S KotlinDebug\n*F\n+ 1 PagedStorage.jvm.kt\nandroidx/paging/PagedStorage\n*L\n170#1:355,15\n*E\n"})
public final class u1<T> extends AbstractList<T> implements r0.a<Object>, l2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<h2.b.c<?, T>> f72661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f72662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f72663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f72664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f72665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f72666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f72667g;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public interface a {
        void c(int i10, int i11, int i12);

        void i(int i10);

        void l(int i10, int i11);

        void m(int i10, int i11);

        void n(int i10, int i11, int i12);
    }

    public u1() {
        this.f72661a = new ArrayList();
        this.f72665e = true;
    }

    private final void A(int i10, h2.b.c<?, T> cVar, int i11, int i12, boolean z10) {
        this.f72662b = i10;
        this.f72661a.clear();
        this.f72661a.add(cVar);
        this.f72663c = i11;
        this.f72664d = i12;
        this.f72666f = cVar.t().size();
        this.f72665e = z10;
        this.f72667g = cVar.t().size() / 2;
    }

    public static /* synthetic */ void B(u1 u1Var, int i10, h2.b.c cVar, int i11, int i12, a aVar, boolean z10, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            z10 = true;
        }
        u1Var.w(i10, cVar, i11, i12, aVar, z10);
    }

    private final boolean C(int i10, int i11, int i12) {
        return c() > i10 && this.f72661a.size() > 2 && c() - this.f72661a.get(i12).t().size() >= i11;
    }

    public static /* synthetic */ void J(u1 u1Var, h2.b.c cVar, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        u1Var.G(cVar, aVar);
    }

    private final <V> V O(int i10, Function2<? super h2.b.c<?, T>, ? super Integer, ? extends V> function2) {
        int size = this.f72661a.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = this.f72661a.get(i11).t().size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return function2.invoke(this.f72661a.get(i11), Integer.valueOf(i10));
    }

    public static /* synthetic */ void n(u1 u1Var, h2.b.c cVar, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        u1Var.d(cVar, aVar);
    }

    public final boolean D(int i10, int i11) {
        return C(i10, i11, this.f72661a.size() - 1);
    }

    public final boolean F(int i10, int i11) {
        return C(i10, i11, 0);
    }

    public final void G(@NotNull h2.b.c<?, T> page, @Nullable a aVar) {
        Intrinsics.checkNotNullParameter(page, "page");
        int size = page.t().size();
        if (size == 0) {
            return;
        }
        this.f72661a.add(0, page);
        this.f72666f = c() + size;
        int iMin = Math.min(i(), size);
        int i10 = size - iMin;
        if (iMin != 0) {
            this.f72662b = i() - iMin;
        }
        this.f72664d -= i10;
        if (aVar != null) {
            aVar.c(i(), iMin, i10);
        }
    }

    public /* bridge */ Object K(int i10) {
        return super.remove(i10);
    }

    public final void L(int i10) {
        this.f72667g = kotlin.ranges.r.I(i10 - i(), 0, c() - 1);
    }

    public final boolean M(int i10, int i11, int i12) {
        return c() + i12 > i10 && this.f72661a.size() > 1 && c() >= i11;
    }

    @NotNull
    public final u1<T> N() {
        return new u1<>(this);
    }

    public final boolean P(boolean z10, int i10, int i11, @NotNull a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i12 = 0;
        while (D(i10, i11)) {
            List<h2.b.c<?, T>> list = this.f72661a;
            int size = list.remove(list.size() - 1).t().size();
            i12 += size;
            this.f72666f = c() - size;
        }
        this.f72667g = kotlin.ranges.r.B(this.f72667g, c() - 1);
        if (i12 > 0) {
            int i13 = i() + c();
            if (z10) {
                this.f72663c = k() + i12;
                callback.l(i13, i12);
            } else {
                callback.m(i13, i12);
            }
        }
        return i12 > 0;
    }

    public final boolean Q(boolean z10, int i10, int i11, @NotNull a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i12 = 0;
        while (F(i10, i11)) {
            int size = this.f72661a.remove(0).t().size();
            i12 += size;
            this.f72666f = c() - size;
        }
        this.f72667g = kotlin.ranges.r.u(this.f72667g - i12, 0);
        if (i12 > 0) {
            if (z10) {
                int i13 = i();
                this.f72662b = i() + i12;
                callback.l(i13, i12);
            } else {
                this.f72664d += i12;
                callback.m(i(), i12);
            }
        }
        return i12 > 0;
    }

    @Override // androidx.paging.l2
    public int c() {
        return this.f72666f;
    }

    public final void d(@NotNull h2.b.c<?, T> page, @Nullable a aVar) {
        Intrinsics.checkNotNullParameter(page, "page");
        int size = page.t().size();
        if (size == 0) {
            return;
        }
        this.f72661a.add(page);
        this.f72666f = c() + size;
        int iMin = Math.min(k(), size);
        int i10 = size - iMin;
        if (iMin != 0) {
            this.f72663c = k() - iMin;
        }
        if (aVar != null) {
            aVar.n((i() + c()) - size, iMin, i10);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    @Nullable
    public T get(int i10) {
        int i11 = i10 - i();
        if (i10 >= 0 && i10 < size()) {
            if (i11 >= 0 && i11 < c()) {
                return getItem(i11);
            }
            return null;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + size());
    }

    @Override // androidx.paging.l2
    @NotNull
    public T getItem(int i10) {
        int size = this.f72661a.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = this.f72661a.get(i11).t().size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return this.f72661a.get(i11).t().get(i10);
    }

    @Override // androidx.paging.l2
    public int getSize() {
        return i() + c() + k();
    }

    @Override // androidx.paging.l2
    public int i() {
        return this.f72662b;
    }

    @Override // androidx.paging.l2
    public int k() {
        return this.f72663c;
    }

    @Override // androidx.paging.r0.a
    @Nullable
    public Object l() {
        if (!this.f72665e || k() > 0) {
            return ((h2.b.c) CollectionsKt.last((List) this.f72661a)).w();
        }
        return null;
    }

    @Override // androidx.paging.r0.a
    @Nullable
    public Object m() {
        if (!this.f72665e || i() + this.f72664d > 0) {
            return ((h2.b.c) CollectionsKt.first((List) this.f72661a)).A();
        }
        return null;
    }

    @NotNull
    public final T p() {
        return (T) CollectionsKt.first(((h2.b.c) CollectionsKt.first((List) this.f72661a)).t());
    }

    public final int r() {
        return i() + this.f72667g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i10) {
        return (T) K(i10);
    }

    @NotNull
    public final T s() {
        return (T) CollectionsKt.last(((h2.b.c) CollectionsKt.last((List) this.f72661a)).t());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public final int t() {
        return i() + (c() / 2);
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        return "leading " + i() + ", dataCount " + c() + ", trailing " + k() + ' ' + CollectionsKt.joinToString$default(this.f72661a, " ", null, null, 0, null, null, 62, null);
    }

    public final int u() {
        return this.f72664d;
    }

    @Nullable
    public final j2<?, T> v(@NotNull q1.e config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.f72661a.isEmpty()) {
            return null;
        }
        List list = CollectionsKt.toList(this.f72661a);
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.paging.PagingSource.LoadResult.Page<kotlin.Any, T of androidx.paging.PagedStorage>>");
        return new j2<>(list, Integer.valueOf(r()), new w1(config.f72466a, config.f72467b, config.f72468c, config.f72469d, config.f72470e, 0, 32, null), i());
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public final void w(int i10, @NotNull h2.b.c<?, T> page, int i11, int i12, @NotNull a callback, boolean z10) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(callback, "callback");
        A(i10, page, i11, i12, z10);
        callback.i(size());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u1(int i10, @NotNull h2.b.c<?, T> page, int i11) {
        this();
        Intrinsics.checkNotNullParameter(page, "page");
        A(i10, page, i11, 0, true);
    }

    private u1(u1<T> u1Var) {
        ArrayList arrayList = new ArrayList();
        this.f72661a = arrayList;
        this.f72665e = true;
        arrayList.addAll(u1Var.f72661a);
        this.f72662b = u1Var.i();
        this.f72663c = u1Var.k();
        this.f72664d = u1Var.f72664d;
        this.f72665e = u1Var.f72665e;
        this.f72666f = u1Var.c();
        this.f72667g = u1Var.f72667g;
    }
}
