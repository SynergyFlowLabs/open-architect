package androidx.collection;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDoubleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleList.kt\nandroidx/collection/MutableDoubleList\n+ 2 DoubleList.kt\nandroidx/collection/DoubleList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,983:1\n562#1:985\n367#2:984\n72#2:986\n239#2,6:989\n72#2:995\n72#2:996\n72#2:1003\n13351#3,2:987\n1699#3,6:997\n*S KotlinDebug\n*F\n+ 1 DoubleList.kt\nandroidx/collection/MutableDoubleList\n*L\n698#1:985\n634#1:984\n758#1:986\n771#1:989,6\n785#1:995\n831#1:996\n848#1:1003\n766#1:987,2\n833#1:997,6\n*E\n"})
public final class h1 extends i {
    public h1() {
        this(0, 1, null);
    }

    public static /* synthetic */ void A0(h1 h1Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = h1Var.f12277b;
        }
        h1Var.z0(i10);
    }

    public final void a0(@androidx.annotation.g0(from = 0) int i10, double d10) {
        if (i10 < 0 || i10 > this.f12277b) {
            t.f.e("Index must be between 0 and size");
        }
        h0(this.f12277b + 1);
        double[] dArr = this.f12276a;
        int i11 = this.f12277b;
        if (i10 != i11) {
            ArraysKt.copyInto(dArr, dArr, i10 + 1, i10, i11);
        }
        dArr[i10] = d10;
        this.f12277b++;
    }

    public final boolean b0(double d10) {
        h0(this.f12277b + 1);
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        dArr[i10] = d10;
        this.f12277b = i10 + 1;
        return true;
    }

    public final boolean c0(@androidx.annotation.g0(from = 0) int i10, @NotNull i elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f12277b) {
            t.f.e("");
        }
        int i11 = elements.f12277b;
        if (i11 == 0) {
            return false;
        }
        h0(this.f12277b + i11);
        double[] dArr = this.f12276a;
        int i12 = this.f12277b;
        if (i10 != i12) {
            ArraysKt.copyInto(dArr, dArr, elements.f12277b + i10, i10, i12);
        }
        ArraysKt.copyInto(elements.f12276a, dArr, i10, 0, elements.f12277b);
        this.f12277b += elements.f12277b;
        return true;
    }

    public final boolean d0(@androidx.annotation.g0(from = 0) int i10, @NotNull double[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f12277b) {
            t.f.e("");
        }
        if (elements.length == 0) {
            return false;
        }
        h0(this.f12277b + elements.length);
        double[] dArr = this.f12276a;
        int i11 = this.f12277b;
        if (i10 != i11) {
            ArraysKt.copyInto(dArr, dArr, elements.length + i10, i10, i11);
        }
        ArraysKt.copyInto$default(elements, dArr, i10, 0, 0, 12, (Object) null);
        this.f12277b += elements.length;
        return true;
    }

    public final boolean e0(@NotNull i elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return c0(this.f12277b, elements);
    }

    public final boolean f0(@NotNull double[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0(this.f12277b, elements);
    }

    public final void g0() {
        this.f12277b = 0;
    }

    public final void h0(int i10) {
        double[] dArr = this.f12276a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, Math.max(i10, (dArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
            this.f12276a = dArrCopyOf;
        }
    }

    public final int i0() {
        return this.f12276a.length;
    }

    public final void j0(double d10) {
        p0(d10);
    }

    public final void k0(@NotNull i elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        double[] dArr = elements.f12276a;
        int i10 = elements.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            p0(dArr[i11]);
        }
    }

    public final void l0(@NotNull double[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (double d10 : elements) {
            p0(d10);
        }
    }

    public final void m0(double d10) {
        b0(d10);
    }

    public final void n0(@NotNull i elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        c0(this.f12277b, elements);
    }

    public final void o0(@NotNull double[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d0(this.f12277b, elements);
    }

    public final boolean p0(double d10) {
        int iC = C(d10);
        if (iC < 0) {
            return false;
        }
        s0(iC);
        return true;
    }

    public final boolean q0(@NotNull i elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12277b;
        int i11 = elements.f12277b - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                p0(elements.w(i12));
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return i10 != this.f12277b;
    }

    public final boolean r0(@NotNull double[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12277b;
        for (double d10 : elements) {
            p0(d10);
        }
        return i10 != this.f12277b;
    }

    public final double s0(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12277b) {
            t.f.e("Index must be between 0 and size");
        }
        double[] dArr = this.f12276a;
        double d10 = dArr[i10];
        int i11 = this.f12277b;
        if (i10 != i11 - 1) {
            ArraysKt.copyInto(dArr, dArr, i10, i10 + 1, i11);
        }
        this.f12277b--;
        return d10;
    }

    public final void t0(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f12277b) || i11 < 0 || i11 > i12) {
            t.f.e("Index must be between 0 and size");
        }
        if (i11 < i10) {
            t.f.c("The end index must be < start index");
        }
        if (i11 != i10) {
            int i13 = this.f12277b;
            if (i11 < i13) {
                double[] dArr = this.f12276a;
                ArraysKt.copyInto(dArr, dArr, i10, i11, i13);
            }
            this.f12277b -= i11 - i10;
        }
    }

    public final boolean u0(@NotNull i elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12277b;
        double[] dArr = this.f12276a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.g(dArr[i11])) {
                s0(i11);
            }
        }
        return i10 != this.f12277b;
    }

    public final boolean v0(@NotNull double[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12277b;
        double[] dArr = this.f12276a;
        int i11 = i10 - 1;
        while (true) {
            int i12 = -1;
            if (-1 >= i11) {
                break;
            }
            double d10 = dArr[i11];
            int length = elements.length;
            for (int i13 = 0; i13 < length; i13++) {
                if (elements[i13] == d10) {
                    i12 = i13;
                    break;
                }
            }
            if (i12 < 0) {
                s0(i11);
            }
            i11--;
        }
        return i10 != this.f12277b;
    }

    public final double w0(@androidx.annotation.g0(from = 0) int i10, double d10) {
        if (i10 < 0 || i10 >= this.f12277b) {
            t.f.e("Index must be between 0 and size");
        }
        double[] dArr = this.f12276a;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    public final void x0() {
        int i10 = this.f12277b;
        if (i10 == 0) {
            return;
        }
        ArraysKt.sort(this.f12276a, 0, i10);
    }

    public final void y0() {
        int i10 = this.f12277b;
        if (i10 == 0) {
            return;
        }
        ArraysKt.sortDescending(this.f12276a, 0, i10);
    }

    public final void z0(int i10) {
        int iMax = Math.max(i10, this.f12277b);
        double[] dArr = this.f12276a;
        if (dArr.length > iMax) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, iMax);
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
            this.f12276a = dArrCopyOf;
        }
    }

    public h1(int i10) {
        super(i10, null);
    }

    public /* synthetic */ h1(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }
}
