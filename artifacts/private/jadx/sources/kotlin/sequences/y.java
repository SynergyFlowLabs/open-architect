package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class y<T, R> implements Sequence<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f313175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<T, R> f313176b;

    public static final class a implements Iterator<R>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f313177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y<T, R> f313178b;

        a(y<T, R> yVar) {
            this.f313178b = yVar;
            this.f313177a = ((y) yVar).f313175a.iterator();
        }

        public final Iterator<T> b() {
            return this.f313177a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f313177a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((y) this.f313178b).f313176b.invoke(this.f313177a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f313175a = sequence;
        this.f313176b = transformer;
    }

    @NotNull
    public final <E> Sequence<E> e(@NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new i(this.f313175a, this.f313176b, iterator);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<R> iterator() {
        return new a(this);
    }
}
