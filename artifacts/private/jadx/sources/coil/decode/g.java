package coil.decode;

import androidx.annotation.t0;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f87161a = new g();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87162a;

        static {
            int[] iArr = new int[coil.size.h.values().length];
            try {
                iArr[coil.size.h.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[coil.size.h.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f87162a = iArr;
        }
    }

    private g() {
    }

    @oj.n
    public static final int a(@t0 int i10, @t0 int i11, @t0 int i12, @t0 int i13, @NotNull coil.size.h hVar) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(i10 / i12);
        int iHighestOneBit2 = Integer.highestOneBit(i11 / i13);
        int i14 = a.f87162a[hVar.ordinal()];
        if (i14 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i14 != 2) {
                throw new k0();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return kotlin.ranges.r.u(iMin, 1);
    }

    @oj.n
    public static final double b(@t0 double d10, @t0 double d11, @t0 double d12, @t0 double d13, @NotNull coil.size.h hVar) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = a.f87162a[hVar.ordinal()];
        if (i10 == 1) {
            return Math.max(d14, d15);
        }
        if (i10 == 2) {
            return Math.min(d14, d15);
        }
        throw new k0();
    }

    @oj.n
    public static final double c(@t0 int i10, @t0 int i11, @t0 int i12, @t0 int i13, @NotNull coil.size.h hVar) {
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int i14 = a.f87162a[hVar.ordinal()];
        if (i14 == 1) {
            return Math.max(d10, d11);
        }
        if (i14 == 2) {
            return Math.min(d10, d11);
        }
        throw new k0();
    }

    @oj.n
    public static final float d(@t0 float f10, @t0 float f11, @t0 float f12, @t0 float f13, @NotNull coil.size.h hVar) {
        float f14 = f12 / f10;
        float f15 = f13 / f11;
        int i10 = a.f87162a[hVar.ordinal()];
        int i11 = 3 ^ 1;
        if (i10 == 1) {
            return Math.max(f14, f15);
        }
        if (i10 == 2) {
            return Math.min(f14, f15);
        }
        throw new k0();
    }
}
