package androidx.collection;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,968:1\n556#1:970\n363#2:969\n70#2:971\n237#2,6:974\n70#2:980\n70#2:981\n70#2:988\n13330#3,2:972\n1663#3,6:982\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n692#1:970\n628#1:969\n749#1:971\n762#1:974,6\n776#1:980\n822#1:981\n839#1:988\n757#1:972,2\n824#1:982,6\n*E\n"})
public final class r1 extends f0 {
    public r1() {
        this(0, 1, null);
    }

    public static /* synthetic */ void A0(r1 r1Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = r1Var.f12216b;
        }
        r1Var.z0(i10);
    }

    public final void a0(@androidx.annotation.g0(from = 0) int i10, int i11) {
        if (i10 < 0 || i10 > this.f12216b) {
            t.f.e("Index must be between 0 and size");
        }
        h0(this.f12216b + 1);
        int[] iArr = this.f12215a;
        int i12 = this.f12216b;
        if (i10 != i12) {
            ArraysKt.copyInto(iArr, iArr, i10 + 1, i10, i12);
        }
        iArr[i10] = i11;
        this.f12216b++;
    }

    public final boolean b0(int i10) {
        h0(this.f12216b + 1);
        int[] iArr = this.f12215a;
        int i11 = this.f12216b;
        iArr[i11] = i10;
        this.f12216b = i11 + 1;
        return true;
    }

    public final boolean c0(@androidx.annotation.g0(from = 0) int i10, @NotNull f0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f12216b) {
            t.f.e("");
        }
        int i11 = elements.f12216b;
        if (i11 == 0) {
            return false;
        }
        h0(this.f12216b + i11);
        int[] iArr = this.f12215a;
        int i12 = this.f12216b;
        if (i10 != i12) {
            ArraysKt.copyInto(iArr, iArr, elements.f12216b + i10, i10, i12);
        }
        ArraysKt.copyInto(elements.f12215a, iArr, i10, 0, elements.f12216b);
        this.f12216b += elements.f12216b;
        return true;
    }

    public final boolean d0(@androidx.annotation.g0(from = 0) int i10, @NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f12216b) {
            t.f.e("");
        }
        if (elements.length == 0) {
            return false;
        }
        h0(this.f12216b + elements.length);
        int[] iArr = this.f12215a;
        int i11 = this.f12216b;
        if (i10 != i11) {
            ArraysKt.copyInto(iArr, iArr, elements.length + i10, i10, i11);
        }
        ArraysKt.copyInto$default(elements, iArr, i10, 0, 0, 12, (Object) null);
        this.f12216b += elements.length;
        boolean z10 = !false;
        return true;
    }

    public final boolean e0(@NotNull f0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return c0(this.f12216b, elements);
    }

    public final boolean f0(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0(this.f12216b, elements);
    }

    public final void g0() {
        this.f12216b = 0;
    }

    public final void h0(int i10) {
        int[] iArr = this.f12215a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f12215a = iArrCopyOf;
        }
    }

    public final int i0() {
        return this.f12215a.length;
    }

    public final void j0(int i10) {
        p0(i10);
    }

    public final void k0(@NotNull f0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.f12215a;
        int i10 = elements.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            p0(iArr[i11]);
        }
    }

    public final void l0(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (int i10 : elements) {
            p0(i10);
        }
    }

    public final void m0(int i10) {
        b0(i10);
    }

    public final void n0(@NotNull f0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        c0(this.f12216b, elements);
    }

    public final void o0(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d0(this.f12216b, elements);
    }

    public final boolean p0(int i10) {
        int iC = C(i10);
        if (iC < 0) {
            return false;
        }
        s0(iC);
        return true;
    }

    public final boolean q0(@NotNull f0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12216b;
        int i11 = elements.f12216b - 1;
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
        return i10 != this.f12216b;
    }

    public final boolean r0(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12216b;
        for (int i11 : elements) {
            p0(i11);
        }
        return i10 != this.f12216b;
    }

    public final int s0(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12216b) {
            t.f.e("Index must be between 0 and size");
        }
        int[] iArr = this.f12215a;
        int i11 = iArr[i10];
        int i12 = this.f12216b;
        if (i10 != i12 - 1) {
            ArraysKt.copyInto(iArr, iArr, i10, i10 + 1, i12);
        }
        this.f12216b--;
        return i11;
    }

    public final void t0(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f12216b) || i11 < 0 || i11 > i12) {
            t.f.e("Index must be between 0 and size");
        }
        if (i11 < i10) {
            t.f.c("The end index must be < start index");
        }
        if (i11 != i10) {
            int i13 = this.f12216b;
            if (i11 < i13) {
                int[] iArr = this.f12215a;
                ArraysKt.copyInto(iArr, iArr, i10, i11, i13);
            }
            this.f12216b -= i11 - i10;
        }
    }

    public final boolean u0(@NotNull f0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12216b;
        int[] iArr = this.f12215a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.g(iArr[i11])) {
                s0(i11);
            }
        }
        return i10 != this.f12216b;
    }

    public final boolean v0(@NotNull int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12216b;
        int[] iArr = this.f12215a;
        int i11 = i10 - 1;
        while (true) {
            int i12 = -1;
            if (-1 >= i11) {
                break;
            }
            int i13 = iArr[i11];
            int length = elements.length;
            for (int i14 = 0; i14 < length; i14++) {
                if (elements[i14] == i13) {
                    i12 = i14;
                    break;
                }
            }
            if (i12 < 0) {
                s0(i11);
            }
            i11--;
        }
        return i10 != this.f12216b;
    }

    public final int w0(@androidx.annotation.g0(from = 0) int i10, int i11) {
        if (i10 < 0 || i10 >= this.f12216b) {
            t.f.e("Index must be between 0 and size");
        }
        int[] iArr = this.f12215a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    public final void x0() {
        int i10 = this.f12216b;
        if (i10 == 0) {
            return;
        }
        ArraysKt.sort(this.f12215a, 0, i10);
    }

    public final void y0() {
        int i10 = this.f12216b;
        if (i10 == 0) {
            return;
        }
        ArraysKt.sortDescending(this.f12215a, 0, i10);
    }

    public final void z0(int i10) {
        int iMax = Math.max(i10, this.f12216b);
        int[] iArr = this.f12215a;
        if (iArr.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f12215a = iArrCopyOf;
        }
    }

    public r1(int i10) {
        super(i10, null);
    }

    public /* synthetic */ r1(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }
}
