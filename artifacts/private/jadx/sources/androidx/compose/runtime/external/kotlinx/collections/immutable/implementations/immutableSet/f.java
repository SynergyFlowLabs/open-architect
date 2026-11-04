package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class f<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35708c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Object[] f35709a = e.f35702d.a().n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35710b;

    public static /* synthetic */ void i(f fVar, Object[] objArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        fVar.h(objArr, i10);
    }

    public final E a() {
        i0.a.a(d());
        return (E) this.f35709a[this.f35710b];
    }

    @NotNull
    public final e<? extends E> b() {
        i0.a.a(e());
        Object obj = this.f35709a[this.f35710b];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (e) obj;
    }

    public final boolean c() {
        return this.f35710b < this.f35709a.length;
    }

    public final boolean d() {
        return c() && !(this.f35709a[this.f35710b] instanceof e);
    }

    public final boolean e() {
        return c() && (this.f35709a[this.f35710b] instanceof e);
    }

    public final void f() {
        i0.a.a(c());
        this.f35710b++;
    }

    public final E g() {
        i0.a.a(d());
        Object[] objArr = this.f35709a;
        int i10 = this.f35710b;
        this.f35710b = i10 + 1;
        return (E) objArr[i10];
    }

    public final void h(@NotNull Object[] objArr, int i10) {
        this.f35709a = objArr;
        this.f35710b = i10;
    }
}
