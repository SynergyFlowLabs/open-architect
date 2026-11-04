package kotlin.ranges;

import kotlin.collections.CharIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class a implements Iterable<Character>, qj.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C2262a f312909d = new C2262a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f312910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f312911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f312912c;

    /* JADX INFO: renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    public static final class C2262a {
        public /* synthetic */ C2262a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a(char c10, char c11, int i10) {
            return new a(c10, c11, i10);
        }

        private C2262a() {
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f312910a = c10;
        this.f312911b = (char) kotlin.internal.n.c(c10, c11, i10);
        this.f312912c = i10;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (!isEmpty() || !((a) obj).isEmpty()) {
            a aVar = (a) obj;
            if (this.f312910a != aVar.f312910a || this.f312911b != aVar.f312911b || this.f312912c != aVar.f312912c) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f312910a * 31) + this.f312911b) * 31) + this.f312912c;
    }

    public boolean isEmpty() {
        if (this.f312912c > 0) {
            return Intrinsics.compare((int) this.f312910a, (int) this.f312911b) > 0;
        }
        return Intrinsics.compare((int) this.f312910a, (int) this.f312911b) < 0;
    }

    public final char l() {
        return this.f312910a;
    }

    public final char m() {
        return this.f312911b;
    }

    public final int n() {
        return this.f312912c;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public CharIterator iterator() {
        return new b(this.f312910a, this.f312911b, this.f312912c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f312912c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f312910a);
            sb2.append("..");
            sb2.append(this.f312911b);
            sb2.append(" step ");
            i10 = this.f312912c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f312910a);
            sb2.append(" downTo ");
            sb2.append(this.f312911b);
            sb2.append(" step ");
            i10 = -this.f312912c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
