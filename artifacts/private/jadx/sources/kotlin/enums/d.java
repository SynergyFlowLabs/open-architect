package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = "1.8")
final class d<T extends Enum<T>> extends AbstractList<T> implements a<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final T[] f312496a;

    public d(@NotNull T[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f312496a = entries;
    }

    private final Object writeReplace() {
        return new e(this.f312496a);
    }

    public boolean c(@NotNull T element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (((Enum) ArraysKt.getOrNull(this.f312496a, element.ordinal())) != element) {
            return false;
        }
        int i10 = 5 << 1;
        return true;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return c((Enum) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T get(int i10) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, this.f312496a.length);
        return this.f312496a[i10];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f312496a.length;
    }

    public int i(@NotNull T element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) ArraysKt.getOrNull(this.f312496a, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return i((Enum) obj);
        }
        return -1;
    }

    public int k(@NotNull T element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return k((Enum) obj);
        }
        return -1;
    }
}
