package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f313012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<T, Boolean> f313013b;

    public static final class a implements Iterator<T>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f313014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f313015b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f313016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f<T> f313017d;

        a(f<T> fVar) {
            this.f313017d = fVar;
            this.f313014a = ((f) fVar).f313012a.iterator();
        }

        private final void b() {
            while (this.f313014a.hasNext()) {
                T next = this.f313014a.next();
                if (!((Boolean) ((f) this.f313017d).f313013b.invoke(next)).booleanValue()) {
                    this.f313016c = next;
                    this.f313015b = 1;
                    return;
                }
            }
            this.f313015b = 0;
        }

        public final int c() {
            return this.f313015b;
        }

        public final Iterator<T> d() {
            return this.f313014a;
        }

        public final T e() {
            return this.f313016c;
        }

        public final void f(int i10) {
            this.f313015b = i10;
        }

        public final void g(T t10) {
            this.f313016c = t10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f313015b == -1) {
                b();
            }
            return this.f313015b == 1 || this.f313014a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f313015b == -1) {
                b();
            }
            if (this.f313015b != 1) {
                return this.f313014a.next();
            }
            T t10 = this.f313016c;
            this.f313016c = null;
            this.f313015b = 0;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f313012a = sequence;
        this.f313013b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
