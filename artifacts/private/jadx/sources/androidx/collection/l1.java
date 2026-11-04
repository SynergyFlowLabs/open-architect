package androidx.collection;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n+ 2 FloatList.kt\nandroidx/collection/FloatList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,976:1\n559#1:978\n365#2:977\n70#2:979\n237#2,6:982\n70#2:988\n70#2:989\n70#2:996\n13344#3,2:980\n1687#3,6:990\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n695#1:978\n631#1:977\n755#1:979\n768#1:982,6\n782#1:988\n828#1:989\n845#1:996\n763#1:980,2\n830#1:990,6\n*E\n"})
public final class l1 extends r {
    public l1() {
        this(0, 1, null);
    }

    public static /* synthetic */ void A0(l1 l1Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = l1Var.f12442b;
        }
        l1Var.z0(i10);
    }

    public final void a0(@androidx.annotation.g0(from = 0) int i10, float f10) {
        if (i10 < 0 || i10 > this.f12442b) {
            t.f.e("Index must be between 0 and size");
        }
        h0(this.f12442b + 1);
        float[] fArr = this.f12441a;
        int i11 = this.f12442b;
        if (i10 != i11) {
            ArraysKt.copyInto(fArr, fArr, i10 + 1, i10, i11);
        }
        fArr[i10] = f10;
        this.f12442b++;
    }

    public final boolean b0(float f10) {
        h0(this.f12442b + 1);
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        fArr[i10] = f10;
        this.f12442b = i10 + 1;
        return true;
    }

    public final boolean c0(@androidx.annotation.g0(from = 0) int i10, @NotNull r elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f12442b) {
            t.f.e("");
        }
        int i11 = elements.f12442b;
        if (i11 == 0) {
            return false;
        }
        h0(this.f12442b + i11);
        float[] fArr = this.f12441a;
        int i12 = this.f12442b;
        if (i10 != i12) {
            ArraysKt.copyInto(fArr, fArr, elements.f12442b + i10, i10, i12);
        }
        ArraysKt.copyInto(elements.f12441a, fArr, i10, 0, elements.f12442b);
        this.f12442b += elements.f12442b;
        return true;
    }

    public final boolean d0(@androidx.annotation.g0(from = 0) int i10, @NotNull float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f12442b) {
            t.f.e("");
        }
        if (elements.length == 0) {
            return false;
        }
        h0(this.f12442b + elements.length);
        float[] fArr = this.f12441a;
        int i11 = this.f12442b;
        if (i10 != i11) {
            ArraysKt.copyInto(fArr, fArr, elements.length + i10, i10, i11);
        }
        ArraysKt.copyInto$default(elements, fArr, i10, 0, 0, 12, (Object) null);
        this.f12442b += elements.length;
        return true;
    }

    public final boolean e0(@NotNull r elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return c0(this.f12442b, elements);
    }

    public final boolean f0(@NotNull float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0(this.f12442b, elements);
    }

    public final void g0() {
        this.f12442b = 0;
    }

    public final void h0(int i10) {
        float[] fArr = this.f12441a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i10, (fArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.f12441a = fArrCopyOf;
        }
    }

    public final int i0() {
        return this.f12441a.length;
    }

    public final void j0(float f10) {
        p0(f10);
    }

    public final void k0(@NotNull r elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        float[] fArr = elements.f12441a;
        int i10 = elements.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            p0(fArr[i11]);
        }
    }

    public final void l0(@NotNull float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (float f10 : elements) {
            p0(f10);
        }
    }

    public final void m0(float f10) {
        b0(f10);
    }

    public final void n0(@NotNull r elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        c0(this.f12442b, elements);
    }

    public final void o0(@NotNull float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d0(this.f12442b, elements);
    }

    public final boolean p0(float f10) {
        int iC = C(f10);
        if (iC < 0) {
            return false;
        }
        s0(iC);
        return true;
    }

    public final boolean q0(@NotNull r elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12442b;
        int i11 = elements.f12442b - 1;
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
        return i10 != this.f12442b;
    }

    public final boolean r0(@NotNull float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12442b;
        for (float f10 : elements) {
            p0(f10);
        }
        return i10 != this.f12442b;
    }

    public final float s0(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12442b) {
            t.f.e("Index must be between 0 and size");
        }
        float[] fArr = this.f12441a;
        float f10 = fArr[i10];
        int i11 = this.f12442b;
        if (i10 != i11 - 1) {
            ArraysKt.copyInto(fArr, fArr, i10, i10 + 1, i11);
        }
        this.f12442b--;
        return f10;
    }

    public final void t0(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f12442b) || i11 < 0 || i11 > i12) {
            t.f.e("Index must be between 0 and size");
        }
        if (i11 < i10) {
            t.f.c("The end index must be < start index");
        }
        if (i11 != i10) {
            int i13 = this.f12442b;
            if (i11 < i13) {
                float[] fArr = this.f12441a;
                ArraysKt.copyInto(fArr, fArr, i10, i11, i13);
            }
            this.f12442b -= i11 - i10;
        }
    }

    public final boolean u0(@NotNull r elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12442b;
        float[] fArr = this.f12441a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.g(fArr[i11])) {
                s0(i11);
            }
        }
        return i10 != this.f12442b;
    }

    public final boolean v0(@NotNull float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12442b;
        float[] fArr = this.f12441a;
        int i11 = i10 - 1;
        while (true) {
            int i12 = -1;
            if (-1 >= i11) {
                break;
            }
            float f10 = fArr[i11];
            int length = elements.length;
            for (int i13 = 0; i13 < length; i13++) {
                if (elements[i13] == f10) {
                    i12 = i13;
                    break;
                }
            }
            if (i12 < 0) {
                s0(i11);
            }
            i11--;
        }
        return i10 != this.f12442b;
    }

    public final float w0(@androidx.annotation.g0(from = 0) int i10, float f10) {
        if (i10 < 0 || i10 >= this.f12442b) {
            t.f.e("Index must be between 0 and size");
        }
        float[] fArr = this.f12441a;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    public final void x0() {
        int i10 = this.f12442b;
        if (i10 == 0) {
            return;
        }
        ArraysKt.sort(this.f12441a, 0, i10);
    }

    public final void y0() {
        int i10 = this.f12442b;
        if (i10 == 0) {
            return;
        }
        ArraysKt.sortDescending(this.f12441a, 0, i10);
    }

    public final void z0(int i10) {
        int iMax = Math.max(i10, this.f12442b);
        float[] fArr = this.f12441a;
        if (fArr.length > iMax) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, iMax);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.f12441a = fArrCopyOf;
        }
    }

    public l1(int i10) {
        super(i10, null);
    }

    public /* synthetic */ l1(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }
}
