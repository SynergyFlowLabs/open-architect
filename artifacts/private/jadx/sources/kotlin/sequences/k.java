package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class k<T> implements Sequence<IndexedValue<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f313042a;

    public static final class a implements Iterator<IndexedValue<? extends T>>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f313043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f313044b;

        a(k<T> kVar) {
            this.f313043a = ((k) kVar).f313042a.iterator();
        }

        public final int b() {
            return this.f313044b;
        }

        public final Iterator<T> c() {
            return this.f313043a;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public IndexedValue<T> next() {
            int i10 = this.f313044b;
            this.f313044b = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            return new IndexedValue<>(i10, this.f313043a.next());
        }

        public final void e(int i10) {
            this.f313044b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f313043a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f313042a = sequence;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<IndexedValue<T>> iterator() {
        return new a(this);
    }
}
