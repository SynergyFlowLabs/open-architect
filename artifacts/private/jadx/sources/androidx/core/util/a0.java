package androidx.core.util;

import android.util.Range;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"ClassVerificationFailure"})
public final class a0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements kotlin.ranges.g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Range<T> f48365a;

        a(Range<T> range) {
            this.f48365a = range;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // kotlin.ranges.g
        public boolean c(Comparable comparable) {
            return kotlin.ranges.g.a.a(this, comparable);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.ranges.g
        public Comparable i() {
            return this.f48365a.getUpper();
        }

        @Override // kotlin.ranges.g
        public boolean isEmpty() {
            return kotlin.ranges.g.a.b(this);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.ranges.g
        public Comparable u() {
            return this.f48365a.getLower();
        }
    }

    @w0(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> a(@NotNull Range<T> range, @NotNull Range<T> range2) {
        return range.intersect(range2);
    }

    @w0(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> b(@NotNull Range<T> range, @NotNull Range<T> range2) {
        return range.extend(range2);
    }

    @w0(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> c(@NotNull Range<T> range, @NotNull T t10) {
        return range.extend(t10);
    }

    @w0(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> d(@NotNull T t10, @NotNull T t11) {
        return new Range<>(t10, t11);
    }

    @w0(21)
    @NotNull
    public static final <T extends Comparable<? super T>> kotlin.ranges.g<T> e(@NotNull Range<T> range) {
        return new a(range);
    }

    @w0(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> f(@NotNull kotlin.ranges.g<T> gVar) {
        return new Range<>(gVar.u(), gVar.i());
    }
}
