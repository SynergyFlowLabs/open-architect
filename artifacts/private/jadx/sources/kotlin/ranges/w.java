package kotlin.ranges;

import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.m2;
import kotlin.u1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@m2(markerClass = {kotlin.u.class})
@e1(version = "1.5")
public final class w extends u implements g<u1>, q<u1> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f312957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final w f312958f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final w a() {
            return w.f312958f;
        }

        private a() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f312957e = new a(defaultConstructorMarker);
        f312958f = new w(-1, 0, defaultConstructorMarker);
    }

    public /* synthetic */ w(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    @kotlin.l(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    public static /* synthetic */ void v() {
    }

    public int A() {
        return l();
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean c(Comparable comparable) {
        return s(((u1) comparable).z0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (m() == r4.m()) goto L12;
     */
    @Override // kotlin.ranges.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof kotlin.ranges.w
            if (r0 == 0) goto L2f
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L13
            r0 = r4
            kotlin.ranges.w r0 = (kotlin.ranges.w) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2c
        L13:
            int r0 = r3.l()
            r2 = 6
            kotlin.ranges.w r4 = (kotlin.ranges.w) r4
            r2 = 4
            int r1 = r4.l()
            if (r0 != r1) goto L2f
            int r3 = r3.m()
            int r4 = r4.m()
            r2 = 1
            if (r3 != r4) goto L2f
        L2c:
            r3 = 6
            r3 = 1
            return r3
        L2f:
            r2 = 7
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.w.equals(java.lang.Object):boolean");
    }

    @Override // kotlin.ranges.u
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (l() * 31) + m();
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ Comparable i() {
        return u1.c(w());
    }

    @Override // kotlin.ranges.u, kotlin.ranges.g
    public boolean isEmpty() {
        return Integer.compareUnsigned(l(), m()) > 0;
    }

    @Override // kotlin.ranges.q
    public /* bridge */ /* synthetic */ Comparable k() {
        return u1.c(t());
    }

    public boolean s(int i10) {
        return Integer.compareUnsigned(l(), i10) <= 0 && Integer.compareUnsigned(i10, m()) <= 0;
    }

    public int t() {
        if (m() != -1) {
            return u1.n(m() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // kotlin.ranges.u
    @NotNull
    public String toString() {
        return ((Object) u1.u0(l())) + ".." + ((Object) u1.u0(m()));
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ Comparable u() {
        return u1.c(A());
    }

    public int w() {
        return m();
    }

    private w(int i10, int i11) {
        super(i10, i11, 1, null);
    }
}
