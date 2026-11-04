package androidx.compose.runtime.snapshots;

import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
abstract class e0<K, V, E> implements Set<E>, qj.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l0<K, V> f36473a;

    public e0(@NotNull l0<K, V> l0Var) {
        this.f36473a = l0Var;
    }

    @NotNull
    public final l0<K, V> c() {
        return this.f36473a;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f36473a.clear();
    }

    public int i() {
        return this.f36473a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f36473a.isEmpty();
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
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }
}
