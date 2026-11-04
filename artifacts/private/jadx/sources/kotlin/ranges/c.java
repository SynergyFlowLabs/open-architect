package kotlin.ranges;

import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends kotlin.ranges.a implements g<Character>, q<Character> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f312917e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final c f312918f = new c(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a() {
            return c.f312918f;
        }

        private a() {
        }
    }

    public c(char c10, char c11) {
        super(c10, c11, 1);
    }

    @kotlin.l(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.9")
    public static /* synthetic */ void w() {
    }

    @Override // kotlin.ranges.g
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Character i() {
        return Character.valueOf(m());
    }

    @Override // kotlin.ranges.g
    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Character u() {
        return Character.valueOf(l());
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean c(Comparable comparable) {
        return t(((Character) comparable).charValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (m() == r4.m()) goto L12;
     */
    @Override // kotlin.ranges.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof kotlin.ranges.c
            if (r0 == 0) goto L33
            r2 = 6
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L17
            r0 = r4
            r2 = 3
            kotlin.ranges.c r0 = (kotlin.ranges.c) r0
            r2 = 1
            boolean r0 = r0.isEmpty()
            r2 = 6
            if (r0 != 0) goto L30
        L17:
            char r0 = r3.l()
            r2 = 3
            kotlin.ranges.c r4 = (kotlin.ranges.c) r4
            char r1 = r4.l()
            r2 = 1
            if (r0 != r1) goto L33
            char r3 = r3.m()
            char r4 = r4.m()
            r2 = 4
            if (r3 != r4) goto L33
        L30:
            r2 = 2
            r3 = 1
            return r3
        L33:
            r3 = 0
            r2 = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.c.equals(java.lang.Object):boolean");
    }

    @Override // kotlin.ranges.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (l() * 31) + m();
    }

    @Override // kotlin.ranges.a, kotlin.ranges.g
    public boolean isEmpty() {
        return Intrinsics.compare((int) l(), (int) m()) > 0;
    }

    public boolean t(char c10) {
        return Intrinsics.compare((int) l(), (int) c10) <= 0 && Intrinsics.compare((int) c10, (int) m()) <= 0;
    }

    @Override // kotlin.ranges.a
    @NotNull
    public String toString() {
        return l() + ".." + m();
    }

    @Override // kotlin.ranges.q
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Character k() {
        if (m() != 65535) {
            return Character.valueOf((char) (m() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }
}
