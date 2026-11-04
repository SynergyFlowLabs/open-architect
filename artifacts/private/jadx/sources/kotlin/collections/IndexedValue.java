package kotlin.collections;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class IndexedValue<T> {
    private final int index;
    private final T value;

    public IndexedValue(int i10, T t10) {
        this.index = i10;
        this.value = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexedValue copy$default(IndexedValue indexedValue, int i10, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = indexedValue.index;
        }
        if ((i11 & 2) != 0) {
            obj = indexedValue.value;
        }
        return indexedValue.copy(i10, obj);
    }

    public final int component1() {
        return this.index;
    }

    public final T component2() {
        return this.value;
    }

    @NotNull
    public final IndexedValue<T> copy(int i10, T t10) {
        return new IndexedValue<>(i10, t10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.index == indexedValue.index && Intrinsics.areEqual(this.value, indexedValue.value);
    }

    public final int getIndex() {
        return this.index;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        T t10 = this.value;
        return iHashCode + (t10 == null ? 0 : t10.hashCode());
    }

    @NotNull
    public String toString() {
        return "IndexedValue(index=" + this.index + ", value=" + this.value + ')';
    }
}
