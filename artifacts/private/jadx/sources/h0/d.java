package h0;

import androidx.compose.runtime.internal.w0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public class d<E> implements Iterator<E>, qj.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f280079d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Object f280080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<E, a> f280081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f280082c;

    public d(@Nullable Object obj, @NotNull Map<E, a> map) {
        this.f280080a = obj;
        this.f280081b = map;
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final int c() {
        return this.f280082c;
    }

    @NotNull
    public final Map<E, a> d() {
        return this.f280081b;
    }

    public final void e(int i10) {
        this.f280082c = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f280082c < this.f280081b.size();
    }

    @Override // java.util.Iterator
    public E next() {
        b();
        E e10 = (E) this.f280080a;
        this.f280082c++;
        a aVar = this.f280081b.get(e10);
        if (aVar != null) {
            this.f280080a = aVar.c();
            return e10;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
