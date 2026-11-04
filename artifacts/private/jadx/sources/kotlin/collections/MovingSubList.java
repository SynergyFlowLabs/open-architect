package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class MovingSubList<E> extends AbstractList<E> implements RandomAccess {
    private int _size;
    private int fromIndex;

    @NotNull
    private final List<E> list;

    /* JADX WARN: Multi-variable type inference failed */
    public MovingSubList(@NotNull List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int i10) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, this._size);
        return this.list.get(this.fromIndex + i10);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this._size;
    }

    public final void move(int i10, int i11) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, this.list.size());
        this.fromIndex = i10;
        this._size = i11 - i10;
    }
}
