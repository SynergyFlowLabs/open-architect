package g0;

import androidx.compose.runtime.internal.w0;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public abstract class a<E> implements ListIterator<E>, qj.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f275353c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f275354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f275355b;

    public a(int i10, int i11) {
        this.f275354a = i10;
        this.f275355b = i11;
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void c() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int d() {
        return this.f275354a;
    }

    public final int e() {
        return this.f275355b;
    }

    public final void f(int i10) {
        this.f275354a = i10;
    }

    public final void g(int i10) {
        this.f275355b = i10;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f275354a < this.f275355b;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f275354a > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f275354a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f275354a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
