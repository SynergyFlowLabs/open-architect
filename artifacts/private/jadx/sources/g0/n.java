package g0;

import androidx.compose.runtime.internal.w0;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class n<E> extends a<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f275392g = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f275393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Object[] f275394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f275395f;

    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public n(@NotNull Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f275393d = i12;
        Object[] objArr2 = new Object[i12];
        this.f275394e = objArr2;
        ?? r10 = i10 == i11 ? 1 : 0;
        this.f275395f = r10;
        objArr2[0] = objArr;
        i(i10 - r10, 1);
    }

    private final E h() {
        int iD = d() & 31;
        Object obj = this.f275394e[this.f275393d - 1];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[iD];
    }

    private final void i(int i10, int i11) {
        int i12 = (this.f275393d - i11) * 5;
        while (i11 < this.f275393d) {
            Object[] objArr = this.f275394e;
            Object obj = objArr[i11 - 1];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[o.a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    private final void j(int i10) {
        int i11 = 0;
        while (o.a(d(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            i(d(), ((this.f275393d - 1) - (i11 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void k(@NotNull Object[] objArr, int i10, int i11, int i12) {
        f(i10);
        g(i11);
        this.f275393d = i12;
        if (this.f275394e.length < i12) {
            this.f275394e = new Object[i12];
        }
        this.f275394e[0] = objArr;
        ?? r10 = i10 == i11 ? 1 : 0;
        this.f275395f = r10;
        i(i10 - r10, 1);
    }

    @Override // g0.a, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eH = h();
        int i10 = 2 & 1;
        f(d() + 1);
        if (d() == e()) {
            this.f275395f = true;
            return eH;
        }
        j(0);
        return eH;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        f(d() - 1);
        if (this.f275395f) {
            this.f275395f = false;
            return h();
        }
        j(31);
        return h();
    }
}
