package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class w<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f313164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<T, Boolean> f313165b;

    public static final class a implements Iterator<T>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f313166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f313167b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f313168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w<T> f313169d;

        a(w<T> wVar) {
            this.f313169d = wVar;
            this.f313166a = ((w) wVar).f313164a.iterator();
        }

        private final void b() {
            if (this.f313166a.hasNext()) {
                T next = this.f313166a.next();
                if (((Boolean) ((w) this.f313169d).f313165b.invoke(next)).booleanValue()) {
                    this.f313167b = 1;
                    this.f313168c = next;
                    return;
                }
            }
            this.f313167b = 0;
        }

        public final Iterator<T> c() {
            return this.f313166a;
        }

        public final T d() {
            return this.f313168c;
        }

        public final int e() {
            return this.f313167b;
        }

        public final void f(T t10) {
            this.f313168c = t10;
        }

        public final void g(int i10) {
            this.f313167b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f313167b == -1) {
                b();
            }
            return this.f313167b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f313167b == -1) {
                b();
            }
            if (this.f313167b == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f313168c;
            this.f313168c = null;
            this.f313167b = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f313164a = sequence;
        this.f313165b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
