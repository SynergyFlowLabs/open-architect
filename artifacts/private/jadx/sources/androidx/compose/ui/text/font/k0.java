package androidx.compose.ui.text.font;

import androidx.compose.runtime.o2;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
@SourceDebugExtension({"SMAP\nFontFamily.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamily.kt\nandroidx/compose/ui/text/font/FontListFontFamily\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,252:1\n81#2,4:253\n*S KotlinDebug\n*F\n+ 1 FontFamily.kt\nandroidx/compose/ui/text/font/FontListFontFamily\n*L\n168#1:253,4\n*E\n"})
public final class k0 extends w implements List<x>, qj.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f41604k = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<x> f41605j;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(@NotNull List<? extends x> list) {
        super(null);
        this.f41605j = list;
        if (list.isEmpty()) {
            x0.a.g("At least one font should be passed to FontFamily");
        }
    }

    @Override // java.util.List
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public x get(int i10) {
        return this.f41605j.get(i10);
    }

    @NotNull
    public final List<x> B() {
        return this.f41605j;
    }

    public int C() {
        return this.f41605j.size();
    }

    public int D(@NotNull x xVar) {
        return this.f41605j.indexOf(xVar);
    }

    public int F(@NotNull x xVar) {
        return this.f41605j.lastIndexOf(xVar);
    }

    public x G(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public x J() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public x K() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public x L(int i10, x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends x> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof x) {
            return w((x) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        return this.f41605j.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.areEqual(this.f41605j, ((k0) obj).f41605j);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f41605j.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof x) {
            return D((x) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f41605j.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<x> iterator() {
        return this.f41605j.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof x) {
            return F((x) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<x> listIterator() {
        return this.f41605j.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ x remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<x> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void s(int i10, x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ x set(int i10, x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return C();
    }

    @Override // java.util.List
    public void sort(Comparator<? super x> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<x> subList(int i10, int i11) {
        return this.f41605j.subList(i10, i11);
    }

    public boolean t(x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @NotNull
    public String toString() {
        return "FontListFontFamily(fonts=" + this.f41605j + ')';
    }

    public void u(x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void v(x xVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean w(@NotNull x xVar) {
        return this.f41605j.contains(xVar);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends x> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<x> listIterator(int i10) {
        return this.f41605j.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }
}
