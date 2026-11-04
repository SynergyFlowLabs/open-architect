package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.w0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public abstract class v<K, V, T> implements Iterator<T>, qj.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35669d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Object[] f35670a = u.f35659e.a().s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35672c;

    public final K b() {
        i0.a.a(f());
        return (K) this.f35670a[this.f35672c];
    }

    @NotNull
    public final u<? extends K, ? extends V> c() {
        i0.a.a(g());
        Object obj = this.f35670a[this.f35672c];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (u) obj;
    }

    @NotNull
    protected final Object[] d() {
        return this.f35670a;
    }

    protected final int e() {
        return this.f35672c;
    }

    public final boolean f() {
        return this.f35672c < this.f35671b;
    }

    public final boolean g() {
        i0.a.a(this.f35672c >= this.f35671b);
        return this.f35672c < this.f35670a.length;
    }

    public final void h() {
        i0.a.a(f());
        this.f35672c += 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return f();
    }

    public final void i() {
        i0.a.a(g());
        this.f35672c++;
    }

    public final void j(@NotNull Object[] objArr, int i10) {
        k(objArr, i10, 0);
    }

    public final void k(@NotNull Object[] objArr, int i10, int i11) {
        this.f35670a = objArr;
        this.f35671b = i10;
        this.f35672c = i11;
    }

    protected final void l(int i10) {
        this.f35672c = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
