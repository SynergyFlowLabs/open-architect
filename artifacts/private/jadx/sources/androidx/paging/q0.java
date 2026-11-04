package androidx.paging;

import java.util.List;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class q0<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f72439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f72440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<T> f72441c;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11, @NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f72439a = i10;
        this.f72440b = i11;
        this.f72441c = items;
    }

    @NotNull
    public final List<T> c() {
        return this.f72441c;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @Nullable
    public T get(int i10) {
        if (i10 >= 0 && i10 < this.f72439a) {
            return null;
        }
        int i11 = this.f72439a;
        if (i10 < this.f72441c.size() + i11 && i11 <= i10) {
            return this.f72441c.get(i10 - this.f72439a);
        }
        int size = this.f72439a + this.f72441c.size();
        if (i10 < size() && size <= i10) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + i10 + " in ItemSnapshotList of size " + size());
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f72439a + this.f72441c.size() + this.f72440b;
    }

    public final int i() {
        return this.f72440b;
    }

    public final int k() {
        return this.f72439a;
    }
}
