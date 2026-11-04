package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class q1<T> implements Iterator<T>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<T, Iterator<T>> f48908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Iterator<T>> f48909b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private Iterator<? extends T> f48910c;

    /* JADX WARN: Multi-variable type inference failed */
    public q1(@NotNull Iterator<? extends T> it, @NotNull Function1<? super T, ? extends Iterator<? extends T>> function1) {
        this.f48908a = function1;
        this.f48910c = it;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void b(T t10) {
        Iterator<T> itInvoke = this.f48908a.invoke(t10);
        if (itInvoke != null && itInvoke.hasNext()) {
            this.f48909b.add((Iterator<T>) this.f48910c);
            this.f48910c = itInvoke;
        } else {
            while (!this.f48910c.hasNext() && !this.f48909b.isEmpty()) {
                this.f48910c = (Iterator) CollectionsKt.last((List) this.f48909b);
                CollectionsKt.removeLast(this.f48909b);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f48910c.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.f48910c.next();
        b(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
