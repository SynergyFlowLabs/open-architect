package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class h<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f313019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f313020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<T, Boolean> f313021c;

    public static final class a implements Iterator<T>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f313022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f313023b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f313024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h<T> f313025d;

        a(h<T> hVar) {
            this.f313025d = hVar;
            this.f313022a = ((h) hVar).f313019a.iterator();
        }

        private final void b() {
            while (this.f313022a.hasNext()) {
                T next = this.f313022a.next();
                if (((Boolean) ((h) this.f313025d).f313021c.invoke(next)).booleanValue() == ((h) this.f313025d).f313020b) {
                    this.f313024c = next;
                    this.f313023b = 1;
                    return;
                }
            }
            this.f313023b = 0;
        }

        public final Iterator<T> c() {
            return this.f313022a;
        }

        public final T d() {
            return this.f313024c;
        }

        public final int e() {
            return this.f313023b;
        }

        public final void f(T t10) {
            this.f313024c = t10;
        }

        public final void g(int i10) {
            this.f313023b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f313023b == -1) {
                b();
            }
            return this.f313023b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f313023b == -1) {
                b();
            }
            if (this.f313023b == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f313024c;
            this.f313024c = null;
            this.f313023b = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull Sequence<? extends T> sequence, boolean z10, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f313019a = sequence;
        this.f313020b = z10;
        this.f313021c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }

    public /* synthetic */ h(Sequence sequence, boolean z10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sequence, (i10 & 2) != 0 ? true : z10, function1);
    }
}
