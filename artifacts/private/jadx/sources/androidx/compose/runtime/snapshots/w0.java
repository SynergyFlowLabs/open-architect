package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,511:1\n1#2:512\n*E\n"})
public final class w0<T> implements ListIterator<T>, qj.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36614e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SnapshotStateList<T> f36615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36617c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36618d;

    public w0(@NotNull SnapshotStateList<T> snapshotStateList, int i10) {
        this.f36615a = snapshotStateList;
        this.f36616b = i10 - 1;
        this.f36618d = k0.l(snapshotStateList);
    }

    private final void c() {
        if (k0.l(this.f36615a) != this.f36618d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(T t10) {
        c();
        this.f36615a.add(this.f36616b + 1, t10);
        this.f36617c = -1;
        this.f36616b++;
        this.f36618d = k0.l(this.f36615a);
    }

    @NotNull
    public final SnapshotStateList<T> b() {
        return this.f36615a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f36616b < this.f36615a.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f36616b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        c();
        int i10 = this.f36616b + 1;
        this.f36617c = i10;
        k0.t(i10, this.f36615a.size());
        T t10 = this.f36615a.get(i10);
        this.f36616b = i10;
        return t10;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f36616b + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        c();
        k0.t(this.f36616b, this.f36615a.size());
        int i10 = this.f36616b;
        this.f36617c = i10;
        T t10 = this.f36615a.get(i10);
        this.f36616b--;
        return t10;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f36616b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        c();
        this.f36615a.remove(this.f36617c);
        this.f36616b--;
        this.f36617c = -1;
        this.f36618d = k0.l(this.f36615a);
    }

    @Override // java.util.ListIterator
    public void set(T t10) {
        c();
        int i10 = this.f36617c;
        if (i10 < 0) {
            k0.m();
            throw new kotlin.a0();
        }
        this.f36615a.set(i10, t10);
        this.f36618d = k0.l(this.f36615a);
    }
}
