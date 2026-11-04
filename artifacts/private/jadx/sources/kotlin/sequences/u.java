package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
public final class u<T> implements Sequence<T>, e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sequence<T> f313154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f313155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f313156c;

    public static final class a implements Iterator<T>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f313157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f313158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u<T> f313159c;

        a(u<T> uVar) {
            this.f313159c = uVar;
            this.f313157a = ((u) uVar).f313154a.iterator();
        }

        private final void b() {
            while (this.f313158b < ((u) this.f313159c).f313155b && this.f313157a.hasNext()) {
                this.f313157a.next();
                this.f313158b++;
            }
        }

        public final Iterator<T> c() {
            return this.f313157a;
        }

        public final int d() {
            return this.f313158b;
        }

        public final void e(int i10) {
            this.f313158b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f313158b < ((u) this.f313159c).f313156c && this.f313157a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            if (this.f313158b >= ((u) this.f313159c).f313156c) {
                throw new NoSuchElementException();
            }
            this.f313158b++;
            return this.f313157a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(@NotNull Sequence<? extends T> sequence, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f313154a = sequence;
        this.f313155b = i10;
        this.f313156c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    private final int f() {
        return this.f313156c - this.f313155b;
    }

    @Override // kotlin.sequences.e
    @NotNull
    public Sequence<T> a(int i10) {
        return i10 >= f() ? r.g() : new u(this.f313154a, this.f313155b + i10, this.f313156c);
    }

    @Override // kotlin.sequences.e
    @NotNull
    public Sequence<T> b(int i10) {
        if (i10 >= f()) {
            return this;
        }
        Sequence<T> sequence = this.f313154a;
        int i11 = this.f313155b;
        return new u(sequence, i11, i10 + i11);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
