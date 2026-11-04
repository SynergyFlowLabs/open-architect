package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
public final class v<T> implements Sequence<T>, e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f313160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f313161b;

    public static final class a implements Iterator<T>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f313162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<T> f313163b;

        a(v<T> vVar) {
            this.f313162a = ((v) vVar).f313161b;
            this.f313163b = ((v) vVar).f313160a.iterator();
        }

        public final Iterator<T> b() {
            return this.f313163b;
        }

        public final int c() {
            return this.f313162a;
        }

        public final void d(int i10) {
            this.f313162a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f313162a > 0 && this.f313163b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i10 = this.f313162a;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f313162a = i10 - 1;
            return this.f313163b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f313160a = sequence;
        this.f313161b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // kotlin.sequences.e
    @NotNull
    public Sequence<T> a(int i10) {
        int i11 = this.f313161b;
        return i10 >= i11 ? r.g() : new u(this.f313160a, i10, i11);
    }

    @Override // kotlin.sequences.e
    @NotNull
    public Sequence<T> b(int i10) {
        return i10 >= this.f313161b ? this : new v(this.f313160a, i10);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
