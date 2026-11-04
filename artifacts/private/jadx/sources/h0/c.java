package h0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f;
import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class c<E> extends AbstractMutableSet<E> implements i.a<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f280074e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private b<E> f280075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Object f280076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Object f280077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f<E, a> f280078d;

    public c(@NotNull b<E> bVar) {
        this.f280075a = bVar;
        this.f280076b = bVar.i();
        this.f280077c = this.f280075a.l();
        this.f280078d = this.f280075a.k().c();
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        if (this.f280078d.containsKey(e10)) {
            int i10 = 7 << 0;
            return false;
        }
        if (isEmpty()) {
            this.f280076b = e10;
            this.f280077c = e10;
            this.f280078d.put(e10, new a());
            return true;
        }
        a aVar = this.f280078d.get(this.f280077c);
        Intrinsics.checkNotNull(aVar);
        this.f280078d.put((E) this.f280077c, aVar.e(e10));
        this.f280078d.put(e10, new a(this.f280077c));
        this.f280077c = e10;
        return true;
    }

    @Nullable
    public final Object c() {
        return this.f280076b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f280078d.clear();
        i0.c cVar = i0.c.f286699a;
        this.f280076b = cVar;
        this.f280077c = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f280078d.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.f280078d.size();
    }

    @NotNull
    public final f<E, a> i() {
        return this.f280078d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new e(this);
    }

    public final void k(@Nullable Object obj) {
        this.f280076b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        a aVarRemove = this.f280078d.remove(obj);
        if (aVarRemove == null) {
            return false;
        }
        if (aVarRemove.b()) {
            a aVar = this.f280078d.get(aVarRemove.d());
            Intrinsics.checkNotNull(aVar);
            this.f280078d.put((E) aVarRemove.d(), aVar.e(aVarRemove.c()));
        } else {
            this.f280076b = aVarRemove.c();
        }
        if (!aVarRemove.a()) {
            this.f280077c = aVarRemove.d();
            return true;
        }
        a aVar2 = this.f280078d.get(aVarRemove.c());
        Intrinsics.checkNotNull(aVar2);
        this.f280078d.put((E) aVarRemove.c(), aVar2.f(aVarRemove.d()));
        return true;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f.a
    @NotNull
    public i<E> build() {
        b<E> bVar;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, a> dVarBuild2 = this.f280078d.build2();
        if (dVarBuild2 == this.f280075a.k()) {
            i0.a.a(this.f280076b == this.f280075a.i());
            i0.a.a(this.f280077c == this.f280075a.l());
            bVar = this.f280075a;
        } else {
            bVar = new b<>(this.f280076b, this.f280077c, dVarBuild2);
        }
        this.f280075a = bVar;
        return bVar;
    }
}
