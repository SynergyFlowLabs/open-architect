package kotlin.ranges;

import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class j implements Iterable<Integer>, qj.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f312927d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f312928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f312929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f312930c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final j a(int i10, int i11, int i12) {
            return new j(i10, i11, i12);
        }

        private a() {
        }
    }

    public j(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f312928a = i10;
        this.f312929b = kotlin.internal.n.c(i10, i11, i12);
        this.f312930c = i12;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (isEmpty() && ((j) obj).isEmpty()) {
            return true;
        }
        j jVar = (j) obj;
        return this.f312928a == jVar.f312928a && this.f312929b == jVar.f312929b && this.f312930c == jVar.f312930c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f312928a * 31) + this.f312929b) * 31) + this.f312930c;
    }

    public boolean isEmpty() {
        if (this.f312930c > 0) {
            return this.f312928a > this.f312929b;
        }
        return this.f312928a < this.f312929b;
    }

    public final int l() {
        return this.f312928a;
    }

    public final int m() {
        return this.f312929b;
    }

    public final int n() {
        return this.f312930c;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public IntIterator iterator() {
        return new k(this.f312928a, this.f312929b, this.f312930c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f312930c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f312928a);
            sb2.append("..");
            sb2.append(this.f312929b);
            sb2.append(" step ");
            i10 = this.f312930c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f312928a);
            sb2.append(" downTo ");
            sb2.append(this.f312929b);
            sb2.append(" step ");
            i10 = -this.f312930c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
