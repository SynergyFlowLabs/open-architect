package kotlinx.io;

import com.google.common.util.concurrent.x2;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w f315803a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f315804b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final t f315805c = t.f315789h.b(new byte[0], 0, 0, null, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f315806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f315807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f315808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f315809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f315810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final AtomicReferenceArray<t> f315811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final AtomicReferenceArray<t> f315812j;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f315806d = iHighestOneBit;
        int iU = kotlin.ranges.r.u(iHighestOneBit / 2, 1);
        f315807e = iU;
        String str = Intrinsics.areEqual(System.getProperty("java.vm.name"), "Dalvik") ? com.facebook.appevents.p.f99189d0 : "4194304";
        f315808f = str;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", str);
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        Integer intOrNull = StringsKt.toIntOrNull(property);
        int iU2 = intOrNull != null ? kotlin.ranges.r.u(intOrNull.intValue(), 0) : 0;
        f315809g = iU2;
        f315810h = kotlin.ranges.r.u(iU2 / iU, 8192);
        f315811i = new AtomicReferenceArray<>(iHighestOneBit);
        f315812j = new AtomicReferenceArray<>(iU);
    }

    private w() {
    }

    private final int a(long j10) {
        return (int) (Thread.currentThread().getId() & j10);
    }

    private final int f() {
        return a(((long) f315806d) - 1);
    }

    private final int g() {
        return a(((long) f315807e) - 1);
    }

    @oj.n
    public static final void h(@NotNull t segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f() != null || segment.j() != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        u uVarC = segment.c();
        if (uVarC != null && uVarC.c()) {
            return;
        }
        AtomicReferenceArray<t> atomicReferenceArray = f315811i;
        int iF = f315803a.f();
        segment.z(0);
        segment.f315796e = true;
        while (true) {
            t tVar = atomicReferenceArray.get(iF);
            if (tVar != f315805c) {
                int iD = tVar != null ? tVar.d() : 0;
                if (iD >= f315804b) {
                    if (f315809g > 0) {
                        i(segment);
                        return;
                    }
                    return;
                } else {
                    segment.y(tVar);
                    segment.x(iD + 8192);
                    if (x2.a(atomicReferenceArray, iF, tVar, segment)) {
                        return;
                    }
                }
            }
        }
    }

    @oj.n
    private static final void i(t tVar) {
        tVar.z(0);
        tVar.f315796e = true;
        int iG = f315803a.g();
        AtomicReferenceArray<t> atomicReferenceArray = f315812j;
        int i10 = 0;
        while (true) {
            t tVar2 = atomicReferenceArray.get(iG);
            if (tVar2 != f315805c) {
                int iD = (tVar2 != null ? tVar2.d() : 0) + 8192;
                if (iD > f315810h) {
                    int i11 = f315807e;
                    if (i10 >= i11) {
                        return;
                    }
                    i10++;
                    iG = (iG + 1) & (i11 - 1);
                } else {
                    tVar.y(tVar2);
                    tVar.x(iD);
                    if (x2.a(atomicReferenceArray, iG, tVar2, tVar)) {
                        return;
                    }
                }
            }
        }
    }

    @oj.n
    @NotNull
    public static final t j() {
        t tVar;
        t andSet;
        AtomicReferenceArray<t> atomicReferenceArray = f315811i;
        int iF = f315803a.f();
        do {
            tVar = f315805c;
            andSet = atomicReferenceArray.getAndSet(iF, tVar);
        } while (Intrinsics.areEqual(andSet, tVar));
        if (andSet == null) {
            atomicReferenceArray.set(iF, null);
            return f315809g > 0 ? k() : t.f315789h.a();
        }
        atomicReferenceArray.set(iF, andSet.f());
        andSet.y(null);
        andSet.x(0);
        return andSet;
    }

    @oj.n
    private static final t k() {
        AtomicReferenceArray<t> atomicReferenceArray = f315812j;
        int iG = f315803a.g();
        int i10 = 0;
        while (true) {
            t tVar = f315805c;
            t andSet = atomicReferenceArray.getAndSet(iG, tVar);
            if (!Intrinsics.areEqual(andSet, tVar)) {
                if (andSet != null) {
                    atomicReferenceArray.set(iG, andSet.f());
                    andSet.y(null);
                    andSet.x(0);
                    return andSet;
                }
                atomicReferenceArray.set(iG, null);
                int i11 = f315807e;
                if (i10 >= i11) {
                    return t.f315789h.a();
                }
                iG = (iG + 1) & (i11 - 1);
                i10++;
            }
        }
    }

    @oj.n
    @NotNull
    public static final u l() {
        return new s();
    }

    public final int b() {
        t tVar = f315811i.get(f());
        if (tVar == null) {
            return 0;
        }
        return tVar.d();
    }

    public final int c() {
        return f315806d;
    }

    public final int d() {
        return f315804b;
    }

    public final int e() {
        return f315809g;
    }
}
