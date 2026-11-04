package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i<T, R, E> implements Sequence<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f313026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<T, R> f313027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<R, Iterator<E>> f313028c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f313029a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f313030b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f313031c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f313032d = 2;

        private a() {
        }
    }

    public static final class b implements Iterator<E>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f313033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator<? extends E> f313034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f313035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i<T, R, E> f313036d;

        b(i<T, R, E> iVar) {
            this.f313036d = iVar;
            this.f313033a = ((i) iVar).f313026a.iterator();
        }

        private final boolean b() {
            Iterator<? extends E> it = this.f313034b;
            if (it != null && it.hasNext()) {
                this.f313035c = 1;
                return true;
            }
            while (this.f313033a.hasNext()) {
                Iterator<? extends E> it2 = (Iterator) ((i) this.f313036d).f313028c.invoke(((i) this.f313036d).f313027b.invoke(this.f313033a.next()));
                if (it2.hasNext()) {
                    this.f313034b = it2;
                    this.f313035c = 1;
                    return true;
                }
            }
            this.f313035c = 2;
            int i10 = 2 << 0;
            this.f313034b = null;
            return false;
        }

        public final Iterator<E> c() {
            return this.f313034b;
        }

        public final Iterator<T> d() {
            return this.f313033a;
        }

        public final int e() {
            return this.f313035c;
        }

        public final void f(Iterator<? extends E> it) {
            this.f313034b = it;
        }

        public final void g(int i10) {
            this.f313035c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f313035c;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return b();
        }

        @Override // java.util.Iterator
        public E next() {
            int i10 = this.f313035c;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !b()) {
                throw new NoSuchElementException();
            }
            this.f313035c = 0;
            Iterator<? extends E> it = this.f313034b;
            Intrinsics.checkNotNull(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer, @NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f313026a = sequence;
        this.f313027b = transformer;
        this.f313028c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<E> iterator() {
        return new b(this);
    }
}
