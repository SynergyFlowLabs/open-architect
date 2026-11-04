package okio;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x0 f335136a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f335137b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final w0 f335138c = new w0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f335139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final AtomicReference<w0>[] f335140e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f335139d = iHighestOneBit;
        AtomicReference<w0>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f335140e = atomicReferenceArr;
    }

    private x0() {
    }

    private final AtomicReference<w0> a() {
        return f335140e[(int) (Thread.currentThread().getId() & (((long) f335139d) - 1))];
    }

    @oj.n
    public static final void d(@NotNull w0 segment) {
        AtomicReference<w0> atomicReferenceA;
        w0 w0Var;
        w0 andSet;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f335133f != null || segment.f335134g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f335131d || (andSet = (atomicReferenceA = f335136a.a()).getAndSet((w0Var = f335138c))) == w0Var) {
            return;
        }
        int i10 = andSet != null ? andSet.f335130c : 0;
        if (i10 >= f335137b) {
            atomicReferenceA.set(andSet);
            return;
        }
        segment.f335133f = andSet;
        segment.f335129b = 0;
        segment.f335130c = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    @oj.n
    @NotNull
    public static final w0 e() {
        AtomicReference<w0> atomicReferenceA = f335136a.a();
        w0 w0Var = f335138c;
        w0 andSet = atomicReferenceA.getAndSet(w0Var);
        if (andSet == w0Var) {
            return new w0();
        }
        if (andSet == null) {
            atomicReferenceA.set(null);
            return new w0();
        }
        atomicReferenceA.set(andSet.f335133f);
        andSet.f335133f = null;
        andSet.f335130c = 0;
        return andSet;
    }

    public final int b() {
        w0 w0Var = a().get();
        if (w0Var == null) {
            return 0;
        }
        return w0Var.f335130c;
    }

    public final int c() {
        return f335137b;
    }
}
