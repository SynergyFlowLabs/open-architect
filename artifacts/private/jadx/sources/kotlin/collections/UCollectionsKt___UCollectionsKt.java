package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.e1;
import kotlin.e2;
import kotlin.f2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m2;
import kotlin.q1;
import kotlin.r1;
import kotlin.u;
import kotlin.u1;
import kotlin.v1;
import kotlin.y1;
import kotlin.z1;
import oj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class UCollectionsKt___UCollectionsKt {
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @i(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Iterable<q1> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<q1> it = iterable.iterator();
        int iN = 0;
        while (it.hasNext()) {
            iN = u1.n(iN + u1.n(it.next().x0() & 255));
        }
        return iN;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @i(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Iterable<u1> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<u1> it = iterable.iterator();
        int iN = 0;
        while (it.hasNext()) {
            iN = u1.n(iN + it.next().z0());
        }
        return iN;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @i(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Iterable<y1> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<y1> it = iterable.iterator();
        long jN = 0;
        while (it.hasNext()) {
            jN = y1.n(jN + it.next().z0());
        }
        return jN;
    }

    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @i(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Iterable<e2> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<e2> it = iterable.iterator();
        int iN = 0;
        while (it.hasNext()) {
            iN = u1.n(iN + u1.n(it.next().x0() & e2.f312492d));
        }
        return iN;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    public static byte[] toUByteArray(@NotNull Collection<q1> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArrI = r1.i(collection.size());
        Iterator<q1> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            r1.D(bArrI, i10, it.next().x0());
            i10++;
        }
        return bArrI;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    public static int[] toUIntArray(@NotNull Collection<u1> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArrI = v1.i(collection.size());
        Iterator<u1> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            v1.D(iArrI, i10, it.next().z0());
            i10++;
        }
        return iArrI;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    public static long[] toULongArray(@NotNull Collection<y1> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArrI = z1.i(collection.size());
        Iterator<y1> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            z1.D(jArrI, i10, it.next().z0());
            i10++;
        }
        return jArrI;
    }

    @e1(version = "1.3")
    @u
    @NotNull
    public static final short[] toUShortArray(@NotNull Collection<e2> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] sArrI = f2.i(collection.size());
        Iterator<e2> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            f2.D(sArrI, i10, it.next().x0());
            i10++;
        }
        return sArrI;
    }
}
