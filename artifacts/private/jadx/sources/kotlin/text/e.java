package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class e implements Sequence<IntRange> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f313302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f313303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f313304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<CharSequence, Integer, Pair<Integer, Integer>> f313305d;

    public static final class a implements Iterator<IntRange>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f313306a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f313307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f313308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private IntRange f313309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f313310e;

        a() {
            int I = kotlin.ranges.r.I(e.this.f313303b, 0, e.this.f313302a.length());
            this.f313307b = I;
            this.f313308c = I;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:12:0x0039 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x00b1  */
        private final void b() {
            Pair pair;
            if (this.f313308c < 0) {
                this.f313306a = 0;
                this.f313309d = null;
                return;
            }
            if (e.this.f313304c > 0) {
                int i10 = this.f313310e + 1;
                this.f313310e = i10;
                if (i10 >= e.this.f313304c) {
                    this.f313309d = new IntRange(this.f313307b, StringsKt__StringsKt.i3(e.this.f313302a));
                    this.f313308c = -1;
                } else if (this.f313308c > e.this.f313302a.length() && (pair = (Pair) e.this.f313305d.invoke(e.this.f313302a, Integer.valueOf(this.f313308c))) != null) {
                    int iIntValue = ((Number) pair.component1()).intValue();
                    int iIntValue2 = ((Number) pair.component2()).intValue();
                    this.f313309d = kotlin.ranges.r.W1(this.f313307b, iIntValue);
                    int i11 = iIntValue + iIntValue2;
                    this.f313307b = i11;
                    this.f313308c = i11 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f313309d = new IntRange(this.f313307b, StringsKt__StringsKt.i3(e.this.f313302a));
                    this.f313308c = -1;
                }
            } else if (this.f313308c > e.this.f313302a.length()) {
                this.f313309d = new IntRange(this.f313307b, StringsKt__StringsKt.i3(e.this.f313302a));
                this.f313308c = -1;
            } else {
                int iIntValue3 = ((Number) pair.component1()).intValue();
                int iIntValue4 = ((Number) pair.component2()).intValue();
                this.f313309d = kotlin.ranges.r.W1(this.f313307b, iIntValue3);
                int i12 = iIntValue3 + iIntValue4;
                this.f313307b = i12;
                this.f313308c = i12 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f313306a = 1;
        }

        public final int c() {
            return this.f313310e;
        }

        public final int d() {
            return this.f313307b;
        }

        public final IntRange e() {
            return this.f313309d;
        }

        public final int f() {
            return this.f313308c;
        }

        public final int g() {
            return this.f313306a;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public IntRange next() {
            if (this.f313306a == -1) {
                b();
            }
            if (this.f313306a == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.f313309d;
            Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f313309d = null;
            this.f313306a = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f313306a == -1) {
                b();
            }
            return this.f313306a == 1;
        }

        public final void i(int i10) {
            this.f313310e = i10;
        }

        public final void j(int i10) {
            this.f313307b = i10;
        }

        public final void k(IntRange intRange) {
            this.f313309d = intRange;
        }

        public final void l(int i10) {
            this.f313308c = i10;
        }

        public final void m(int i10) {
            this.f313306a = i10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull CharSequence input, int i10, int i11, @NotNull Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f313302a = input;
        this.f313303b = i10;
        this.f313304c = i11;
        this.f313305d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<IntRange> iterator() {
        return new a();
    }
}
