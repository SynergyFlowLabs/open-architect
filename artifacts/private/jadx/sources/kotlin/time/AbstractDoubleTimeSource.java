package kotlin.time;

import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@j
@kotlin.l(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@e1(version = "1.3")
public abstract class AbstractDoubleTimeSource implements p.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f313394b;

    private static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f313395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final AbstractDoubleTimeSource f313396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f313397c;

        public /* synthetic */ a(double d10, AbstractDoubleTimeSource abstractDoubleTimeSource, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(d10, abstractDoubleTimeSource, j10);
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        public b G(long j10) {
            return b.a.d(this, j10);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: M1 */
        public int compareTo(@NotNull b bVar) {
            return b.a.a(this, bVar);
        }

        @Override // kotlin.time.b
        public long Q(@NotNull b other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof a) {
                a aVar = (a) other;
                if (Intrinsics.areEqual(this.f313396b, aVar.f313396b)) {
                    if (c.D(this.f313397c, aVar.f313397c) && c.w0(this.f313397c)) {
                        return c.f313406b.W();
                    }
                    long jZ0 = c.z0(this.f313397c, aVar.f313397c);
                    long jL0 = e.l0(this.f313395a - aVar.f313395a, this.f313396b.b());
                    return c.D(jL0, c.R0(jZ0)) ? c.f313406b.W() : c.A0(jL0, jZ0);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.b
        public boolean equals(@Nullable Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(this.f313396b, ((a) obj).f313396b) && c.D(Q((b) obj), c.f313406b.W());
        }

        @Override // kotlin.time.b
        public int hashCode() {
            return c.s0(c.A0(e.l0(this.f313395a, this.f313396b.b()), this.f313397c));
        }

        @Override // kotlin.time.TimeMark
        public long k() {
            return c.z0(e.l0(this.f313396b.c() - this.f313395a, this.f313396b.b()), this.f313397c);
        }

        @Override // kotlin.time.TimeMark
        public boolean l() {
            return b.a.b(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean n() {
            return b.a.c(this);
        }

        @NotNull
        public String toString() {
            return "DoubleTimeMark(" + this.f313395a + i.h(this.f313396b.b()) + " + " + ((Object) c.N0(this.f313397c)) + ", " + this.f313396b + ')';
        }

        private a(double d10, AbstractDoubleTimeSource timeSource, long j10) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.f313395a = d10;
            this.f313396b = timeSource;
            this.f313397c = j10;
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        public b C(long j10) {
            return new a(this.f313395a, this.f313396b, c.A0(this.f313397c, j10), null);
        }
    }

    public AbstractDoubleTimeSource(@NotNull f unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f313394b = unit;
    }

    @NotNull
    protected final f b() {
        return this.f313394b;
    }

    protected abstract double c();

    @Override // kotlin.time.p
    @NotNull
    public b a() {
        return new a(c(), this, c.f313406b.W(), null);
    }
}
