package kotlin.ranges;

import com.rabbitmq.client.k0;
import java.util.NoSuchElementException;
import kotlin.e1;
import kotlin.e2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m2;
import kotlin.q1;
import kotlin.u1;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class b0 {
    @e1(version = "1.7")
    public static final int A(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        if (!uVar.isEmpty()) {
            return uVar.l();
        }
        throw new NoSuchElementException("Progression " + uVar + " is empty.");
    }

    @e1(version = "1.7")
    public static final long B(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        if (!xVar.isEmpty()) {
            return xVar.l();
        }
        throw new NoSuchElementException("Progression " + xVar + " is empty.");
    }

    @e1(version = "1.7")
    @Nullable
    public static final u1 C(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        if (uVar.isEmpty()) {
            return null;
        }
        return u1.c(uVar.l());
    }

    @e1(version = "1.7")
    @Nullable
    public static final y1 D(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        if (xVar.isEmpty()) {
            return null;
        }
        return y1.c(xVar.l());
    }

    @e1(version = "1.7")
    public static final int E(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        if (!uVar.isEmpty()) {
            return uVar.m();
        }
        throw new NoSuchElementException("Progression " + uVar + " is empty.");
    }

    @e1(version = "1.7")
    public static final long F(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        if (!xVar.isEmpty()) {
            return xVar.m();
        }
        throw new NoSuchElementException("Progression " + xVar + " is empty.");
    }

    @e1(version = "1.7")
    @Nullable
    public static final u1 G(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        if (uVar.isEmpty()) {
            return null;
        }
        return u1.c(uVar.m());
    }

    @e1(version = "1.7")
    @Nullable
    public static final y1 H(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        if (xVar.isEmpty()) {
            return null;
        }
        return y1.c(xVar.m());
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final int I(w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return J(wVar, kotlin.random.f.f312895a);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final int J(@NotNull w wVar, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return kotlin.random.h.h(random, wVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final long K(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return L(zVar, kotlin.random.f.f312895a);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final long L(@NotNull z zVar, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return kotlin.random.h.l(random, zVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @m2(markerClass = {kotlin.s.class, kotlin.u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final u1 M(w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return N(wVar, kotlin.random.f.f312895a);
    }

    @m2(markerClass = {kotlin.s.class, kotlin.u.class})
    @e1(version = "1.5")
    @Nullable
    public static final u1 N(@NotNull w wVar, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (wVar.isEmpty()) {
            return null;
        }
        return u1.c(kotlin.random.h.h(random, wVar));
    }

    @m2(markerClass = {kotlin.s.class, kotlin.u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final y1 O(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return P(zVar, kotlin.random.f.f312895a);
    }

    @m2(markerClass = {kotlin.s.class, kotlin.u.class})
    @e1(version = "1.5")
    @Nullable
    public static final y1 P(@NotNull z zVar, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (zVar.isEmpty()) {
            return null;
        }
        return y1.c(kotlin.random.h.l(random, zVar));
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final u Q(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return u.f312949d.a(uVar.m(), uVar.l(), -uVar.n());
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final x R(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return x.f312959d.a(xVar.m(), xVar.l(), -xVar.n());
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final u S(@NotNull u uVar, int i10) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        s.a(i10 > 0, Integer.valueOf(i10));
        u.a aVar = u.f312949d;
        int iL = uVar.l();
        int iM = uVar.m();
        if (uVar.n() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iL, iM, i10);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final x T(@NotNull x xVar, long j10) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        s.a(j10 > 0, Long.valueOf(j10));
        x.a aVar = x.f312959d;
        long jL = xVar.l();
        long jM = xVar.m();
        if (xVar.n() <= 0) {
            j10 = -j10;
        }
        return aVar.a(jL, jM, j10);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final w U(short s10, short s11) {
        int i10 = s11 & e2.f312492d;
        return Intrinsics.compare(i10, 0) <= 0 ? w.f312957e.a() : new w(u1.n(s10 & e2.f312492d), u1.n(u1.n(i10) - 1), null);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static w V(int i10, int i11) {
        return Integer.compareUnsigned(i11, 0) <= 0 ? w.f312957e.a() : new w(i10, u1.n(i11 - 1), null);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final w W(byte b10, byte b11) {
        int i10 = b11 & 255;
        return Intrinsics.compare(i10, 0) <= 0 ? w.f312957e.a() : new w(u1.n(b10 & 255), u1.n(u1.n(i10) - 1), null);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static z X(long j10, long j11) {
        return Long.compareUnsigned(j11, 0L) <= 0 ? z.f312967e.a() : new z(j10, y1.n(j11 - y1.n(((long) 1) & k0.f265952a)), null);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final short a(short s10, short s11) {
        return Intrinsics.compare(s10 & e2.f312492d, 65535 & s11) < 0 ? s11 : s10;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final int b(int i10, int i11) {
        return Integer.compareUnsigned(i10, i11) < 0 ? i11 : i10;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final byte c(byte b10, byte b11) {
        return Intrinsics.compare(b10 & 255, b11 & 255) < 0 ? b11 : b10;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final long d(long j10, long j11) {
        return Long.compareUnsigned(j10, j11) < 0 ? j11 : j10;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final short e(short s10, short s11) {
        return Intrinsics.compare(s10 & e2.f312492d, 65535 & s11) > 0 ? s11 : s10;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final int f(int i10, int i11) {
        return Integer.compareUnsigned(i10, i11) > 0 ? i11 : i10;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final byte g(byte b10, byte b11) {
        return Intrinsics.compare(b10 & 255, b11 & 255) > 0 ? b11 : b10;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final long h(long j10, long j11) {
        return Long.compareUnsigned(j10, j11) > 0 ? j11 : j10;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final long i(long j10, @NotNull g<y1> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof f) {
            return ((y1) t.N(y1.c(j10), (f) range)).z0();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        if (Long.compareUnsigned(j10, ((y1) range.u()).z0()) < 0) {
            return ((y1) range.u()).z0();
        }
        if (Long.compareUnsigned(j10, ((y1) range.i()).z0()) > 0) {
            j10 = ((y1) range.i()).z0();
        }
        return j10;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final short j(short s10, short s11, short s12) {
        int i10 = s11 & e2.f312492d;
        int i11 = s12 & e2.f312492d;
        if (Intrinsics.compare(i10, i11) <= 0) {
            int i12 = 65535 & s10;
            if (Intrinsics.compare(i12, i10) < 0) {
                return s11;
            }
            return Intrinsics.compare(i12, i11) > 0 ? s12 : s10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) e2.s0(s12)) + " is less than minimum " + ((Object) e2.s0(s11)) + '.');
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final int k(int i10, int i11, int i12) {
        if (Integer.compareUnsigned(i11, i12) <= 0) {
            if (Integer.compareUnsigned(i10, i11) < 0) {
                return i11;
            }
            return Integer.compareUnsigned(i10, i12) > 0 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) u1.u0(i12)) + " is less than minimum " + ((Object) u1.u0(i11)) + '.');
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final byte l(byte b10, byte b11, byte b12) {
        int i10 = b11 & 255;
        int i11 = b12 & 255;
        if (Intrinsics.compare(i10, i11) <= 0) {
            int i12 = b10 & 255;
            if (Intrinsics.compare(i12, i10) < 0) {
                return b11;
            }
            return Intrinsics.compare(i12, i11) > 0 ? b12 : b10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) q1.s0(b12)) + " is less than minimum " + ((Object) q1.s0(b11)) + '.');
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final long m(long j10, long j11, long j12) {
        if (Long.compareUnsigned(j11, j12) <= 0) {
            if (Long.compareUnsigned(j10, j11) < 0) {
                return j11;
            }
            return Long.compareUnsigned(j10, j12) > 0 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) y1.u0(j12)) + " is less than minimum " + ((Object) y1.u0(j11)) + '.');
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final int n(int i10, @NotNull g<u1> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof f) {
            return ((u1) t.N(u1.c(i10), (f) range)).z0();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        if (Integer.compareUnsigned(i10, ((u1) range.u()).z0()) < 0) {
            return ((u1) range.u()).z0();
        }
        if (Integer.compareUnsigned(i10, ((u1) range.i()).z0()) > 0) {
            i10 = ((u1) range.i()).z0();
        }
        return i10;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final boolean o(@NotNull w contains, byte b10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.s(u1.n(b10 & 255));
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final boolean p(z contains, y1 y1Var) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return y1Var != null && contains.s(y1Var.z0());
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final boolean q(@NotNull z contains, int i10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.s(y1.n(((long) i10) & k0.f265952a));
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final boolean r(@NotNull z contains, byte b10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.s(y1.n(((long) b10) & 255));
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final boolean s(@NotNull w contains, short s10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.s(u1.n(s10 & e2.f312492d));
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @kotlin.internal.f
    private static final boolean t(w contains, u1 u1Var) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return u1Var != null && contains.s(u1Var.z0());
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final boolean u(@NotNull w contains, long j10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return y1.n(j10 >>> 32) == 0 && contains.s(u1.n((int) j10));
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    public static final boolean v(@NotNull z contains, short s10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.s(y1.n(((long) s10) & okhttp3.internal.ws.g.f334653t));
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final u w(short s10, short s11) {
        return u.f312949d.a(u1.n(s10 & e2.f312492d), u1.n(s11 & e2.f312492d), -1);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final u x(int i10, int i11) {
        return u.f312949d.a(i10, i11, -1);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final u y(byte b10, byte b11) {
        return u.f312949d.a(u1.n(b10 & 255), u1.n(b11 & 255), -1);
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @NotNull
    public static final x z(long j10, long j11) {
        return x.f312959d.a(j10, j11, -1L);
    }
}
