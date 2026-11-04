package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class b<E> extends AbstractMutableSet<E> implements i.a<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f35687f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private a<E> f35688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private i0.f f35689b = new i0.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private e<E> f35690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35692e;

    public b(@NotNull a<E> aVar) {
        this.f35688a = aVar;
        this.f35690c = this.f35688a.i();
        this.f35692e = this.f35688a.size();
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int size = size();
        this.f35690c = this.f35690c.u(e10 != null ? e10.hashCode() : 0, e10, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        a<E> aVarBuild = collection instanceof a ? (a) collection : null;
        if (aVarBuild == null) {
            b bVar = collection instanceof b ? (b) collection : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.addAll(collection);
        }
        i0.b bVar2 = new i0.b(0, 1, null);
        int size = size();
        e<E> eVarV = this.f35690c.v(aVarBuild.i(), 0, bVar2, this);
        int size2 = (collection.size() + size) - bVar2.d();
        if (size != size2) {
            this.f35690c = eVarV;
            m(size2);
        }
        return size != size();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.i.a, androidx.compose.runtime.external.kotlinx.collections.immutable.f.a
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a<E> build() {
        a<E> aVar;
        if (this.f35690c == this.f35688a.i()) {
            aVar = this.f35688a;
        } else {
            this.f35689b = new i0.f();
            aVar = new a<>(this.f35690c, size());
        }
        this.f35688a = aVar;
        return aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        e<E> eVarA = e.f35702d.a();
        Intrinsics.checkNotNull(eVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.f35690c = eVarA;
        m(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f35690c.i(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<?> collection) {
        if (collection instanceof a) {
            return this.f35690c.j(((a) collection).i(), 0);
        }
        return collection instanceof b ? this.f35690c.j(((b) collection).f35690c, 0) : super.containsAll(collection);
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.f35692e;
    }

    public final int i() {
        return this.f35691d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new d(this);
    }

    @NotNull
    public final e<E> k() {
        return this.f35690c;
    }

    @NotNull
    public final i0.f l() {
        return this.f35689b;
    }

    public void m(int i10) {
        this.f35692e = i10;
        this.f35691d++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int size = size();
        this.f35690c = this.f35690c.E(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<?> collection) {
        a<E> aVarBuild = collection instanceof a ? (a) collection : null;
        if (aVarBuild == null) {
            b bVar = collection instanceof b ? (b) collection : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.removeAll(collection);
        }
        i0.b bVar2 = new i0.b(0, 1, null);
        int size = size();
        Object objF = this.f35690c.F(aVarBuild.i(), 0, bVar2, this);
        int iD = size - bVar2.d();
        if (iD == 0) {
            clear();
        } else if (iD != size) {
            Intrinsics.checkNotNull(objF, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f35690c = (e) objF;
            m(iD);
        }
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<?> collection) {
        a<E> aVarBuild = collection instanceof a ? (a) collection : null;
        if (aVarBuild == null) {
            b bVar = collection instanceof b ? (b) collection : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.retainAll(collection);
        }
        i0.b bVar2 = new i0.b(0, 1, null);
        int size = size();
        Object objH = this.f35690c.H(aVarBuild.i(), 0, bVar2, this);
        int iD = bVar2.d();
        if (iD == 0) {
            clear();
        } else if (iD != size) {
            Intrinsics.checkNotNull(objH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f35690c = (e) objH;
            m(iD);
        }
        return size != size();
    }
}
