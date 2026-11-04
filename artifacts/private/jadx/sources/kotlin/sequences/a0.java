package kotlin.sequences;

import java.util.Iterator;
import kotlin.e1;
import kotlin.e2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m2;
import kotlin.q1;
import kotlin.u1;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
class a0 {
    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @oj.i(name = "sumOfUByte")
    public static final int a(@NotNull Sequence<q1> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<q1> it = sequence.iterator();
        int iN = 0;
        int i10 = 6 | 0;
        while (it.hasNext()) {
            iN = u1.n(iN + u1.n(it.next().x0() & 255));
        }
        return iN;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @oj.i(name = "sumOfUInt")
    public static final int b(@NotNull Sequence<u1> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<u1> it = sequence.iterator();
        int iN = 0;
        while (it.hasNext()) {
            iN = u1.n(iN + it.next().z0());
        }
        return iN;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @oj.i(name = "sumOfULong")
    public static final long c(@NotNull Sequence<y1> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<y1> it = sequence.iterator();
        long jN = 0;
        while (it.hasNext()) {
            jN = y1.n(jN + it.next().z0());
        }
        return jN;
    }

    @m2(markerClass = {kotlin.u.class})
    @e1(version = "1.5")
    @oj.i(name = "sumOfUShort")
    public static final int d(@NotNull Sequence<e2> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<e2> it = sequence.iterator();
        int iN = 0;
        while (it.hasNext()) {
            iN = u1.n(iN + u1.n(it.next().x0() & e2.f312492d));
        }
        return iN;
    }
}
