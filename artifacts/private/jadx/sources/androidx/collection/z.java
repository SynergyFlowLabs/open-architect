package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIndexBasedArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n*L\n1#1,51:1\n45#2,5:52\n*S KotlinDebug\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n*L\n44#1:52,5\n*E\n"})
public abstract class z<T> implements Iterator<T>, qj.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12528c;

    public z(int i10) {
        this.f12526a = i10;
    }

    protected abstract T b(int i10);

    protected abstract void c(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f12527b < this.f12526a;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tB = b(this.f12527b);
        this.f12527b++;
        this.f12528c = true;
        return tB;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f12528c) {
            t.f.d("Call next() before removing an element.");
        }
        int i10 = this.f12527b - 1;
        this.f12527b = i10;
        c(i10);
        this.f12526a--;
        this.f12528c = false;
    }
}
