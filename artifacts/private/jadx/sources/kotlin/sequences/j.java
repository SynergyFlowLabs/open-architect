package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class j<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<T> f313037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<T, T> f313038b;

    public static final class a implements Iterator<T>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T f313039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f313040b = -2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<T> f313041c;

        a(j<T> jVar) {
            this.f313041c = jVar;
        }

        private final void b() {
            T t10;
            if (this.f313040b == -2) {
                t10 = (T) ((j) this.f313041c).f313037a.invoke();
            } else {
                Function1 function1 = ((j) this.f313041c).f313038b;
                T t11 = this.f313039a;
                Intrinsics.checkNotNull(t11);
                t10 = (T) function1.invoke(t11);
            }
            this.f313039a = t10;
            this.f313040b = t10 == null ? 0 : 1;
        }

        public final T c() {
            return this.f313039a;
        }

        public final int d() {
            return this.f313040b;
        }

        public final void e(T t10) {
            this.f313039a = t10;
        }

        public final void f(int i10) {
            this.f313040b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f313040b < 0) {
                b();
            }
            return this.f313040b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f313040b < 0) {
                b();
            }
            if (this.f313040b == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f313039a;
            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f313040b = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull Function0<? extends T> getInitialValue, @NotNull Function1<? super T, ? extends T> getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f313037a = getInitialValue;
        this.f313038b = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
