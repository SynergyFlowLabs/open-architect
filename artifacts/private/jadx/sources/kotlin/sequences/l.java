package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class l<T1, T2, V> implements Sequence<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T1> f313045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Sequence<T2> f313046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<T1, T2, V> f313047c;

    public static final class a implements Iterator<V>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T1> f313048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<T2> f313049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<T1, T2, V> f313050c;

        a(l<T1, T2, V> lVar) {
            this.f313050c = lVar;
            this.f313048a = ((l) lVar).f313045a.iterator();
            this.f313049b = ((l) lVar).f313046b.iterator();
        }

        public final Iterator<T1> b() {
            return this.f313048a;
        }

        public final Iterator<T2> c() {
            return this.f313049b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f313048a.hasNext() && this.f313049b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) ((l) this.f313050c).f313047c.invoke(this.f313048a.next(), this.f313049b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull Sequence<? extends T1> sequence1, @NotNull Sequence<? extends T2> sequence2, @NotNull Function2<? super T1, ? super T2, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sequence1, "sequence1");
        Intrinsics.checkNotNullParameter(sequence2, "sequence2");
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.f313045a = sequence1;
        this.f313046b = sequence2;
        this.f313047c = transform;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<V> iterator() {
        return new a(this);
    }
}
