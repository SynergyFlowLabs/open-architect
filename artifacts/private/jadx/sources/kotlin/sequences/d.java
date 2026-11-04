package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
public final class d<T> implements Sequence<T>, e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f313008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f313009b;

    public static final class a implements Iterator<T>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f313010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f313011b;

        a(d<T> dVar) {
            this.f313010a = ((d) dVar).f313008a.iterator();
            this.f313011b = ((d) dVar).f313009b;
        }

        private final void b() {
            while (this.f313011b > 0 && this.f313010a.hasNext()) {
                this.f313010a.next();
                this.f313011b--;
            }
        }

        public final Iterator<T> c() {
            return this.f313010a;
        }

        public final int d() {
            return this.f313011b;
        }

        public final void e(int i10) {
            this.f313011b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f313010a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            return this.f313010a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f313008a = sequence;
        this.f313009b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // kotlin.sequences.e
    @NotNull
    public Sequence<T> a(int i10) {
        int i11 = this.f313009b + i10;
        return i11 < 0 ? new d(this, i10) : new d(this.f313008a, i11);
    }

    @Override // kotlin.sequences.e
    @NotNull
    public Sequence<T> b(int i10) {
        int i11 = this.f313009b;
        int i12 = i11 + i10;
        return i12 < 0 ? new v(this, i10) : new u(this.f313008a, i11, i12);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
