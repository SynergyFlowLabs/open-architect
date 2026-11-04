package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class x<T, R> implements Sequence<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f313170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<Integer, T, R> f313171b;

    public static final class a implements Iterator<R>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f313172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f313173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x<T, R> f313174c;

        a(x<T, R> xVar) {
            this.f313174c = xVar;
            this.f313172a = ((x) xVar).f313170a.iterator();
        }

        public final int b() {
            return this.f313173b;
        }

        public final Iterator<T> c() {
            return this.f313172a;
        }

        public final void d(int i10) {
            this.f313173b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f313172a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            Function2 function2 = ((x) this.f313174c).f313171b;
            int i10 = this.f313173b;
            this.f313173b = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            return (R) function2.invoke(Integer.valueOf(i10), this.f313172a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends R> transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f313170a = sequence;
        this.f313171b = transformer;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<R> iterator() {
        return new a(this);
    }
}
