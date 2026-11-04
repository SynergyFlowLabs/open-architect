package kotlin.ranges;

import com.rabbitmq.client.k0;
import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.m2;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@m2(markerClass = {kotlin.u.class})
@e1(version = "1.5")
public final class z extends x implements g<y1>, q<y1> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f312967e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final z f312968f = new z(-1, 0, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final z a() {
            return z.f312968f;
        }

        private a() {
        }
    }

    public /* synthetic */ z(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    @kotlin.l(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    public static /* synthetic */ void v() {
    }

    public long A() {
        return l();
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean c(Comparable comparable) {
        return s(((y1) comparable).z0());
    }

    @Override // kotlin.ranges.x
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        if (isEmpty() && ((z) obj).isEmpty()) {
            return true;
        }
        z zVar = (z) obj;
        return l() == zVar.l() && m() == zVar.m();
    }

    @Override // kotlin.ranges.x
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) y1.n(l() ^ y1.n(l() >>> 32))) * 31) + ((int) y1.n(m() ^ y1.n(m() >>> 32)));
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ Comparable i() {
        return y1.c(w());
    }

    @Override // kotlin.ranges.x, kotlin.ranges.g
    public boolean isEmpty() {
        return Long.compareUnsigned(l(), m()) > 0;
    }

    @Override // kotlin.ranges.q
    public /* bridge */ /* synthetic */ Comparable k() {
        return y1.c(t());
    }

    public boolean s(long j10) {
        return Long.compareUnsigned(l(), j10) <= 0 && Long.compareUnsigned(j10, m()) <= 0;
    }

    public long t() {
        if (m() != -1) {
            return y1.n(m() + y1.n(((long) 1) & k0.f265952a));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // kotlin.ranges.x
    @NotNull
    public String toString() {
        return ((Object) y1.u0(l())) + ".." + ((Object) y1.u0(m()));
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ Comparable u() {
        return y1.c(A());
    }

    public long w() {
        return m();
    }

    private z(long j10, long j11) {
        super(j10, j11, 1L, null);
    }
}
