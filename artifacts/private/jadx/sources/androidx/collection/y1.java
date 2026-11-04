package androidx.collection;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n+ 2 LongList.kt\nandroidx/collection/LongList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,972:1\n557#1:974\n364#2:973\n70#2:975\n237#2,6:978\n70#2:984\n70#2:985\n70#2:992\n13337#3,2:976\n1675#3,6:986\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n*L\n693#1:974\n629#1:973\n751#1:975\n764#1:978,6\n778#1:984\n824#1:985\n841#1:992\n759#1:976,2\n826#1:986,6\n*E\n"})
public final class y1 extends s0 {
    public y1() {
        this(0, 1, null);
    }

    public static /* synthetic */ void A0(y1 y1Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = y1Var.f12447b;
        }
        y1Var.z0(i10);
    }

    public final void a0(@androidx.annotation.g0(from = 0) int i10, long j10) {
        if (i10 < 0 || i10 > this.f12447b) {
            t.f.e("Index must be between 0 and size");
        }
        h0(this.f12447b + 1);
        long[] jArr = this.f12446a;
        int i11 = this.f12447b;
        if (i10 != i11) {
            ArraysKt.copyInto(jArr, jArr, i10 + 1, i10, i11);
        }
        jArr[i10] = j10;
        this.f12447b++;
    }

    public final boolean b0(long j10) {
        h0(this.f12447b + 1);
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        jArr[i10] = j10;
        this.f12447b = i10 + 1;
        return true;
    }

    public final boolean c0(@androidx.annotation.g0(from = 0) int i10, @NotNull s0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f12447b) {
            t.f.e("");
        }
        int i11 = elements.f12447b;
        if (i11 == 0) {
            return false;
        }
        h0(this.f12447b + i11);
        long[] jArr = this.f12446a;
        int i12 = this.f12447b;
        if (i10 != i12) {
            ArraysKt.copyInto(jArr, jArr, elements.f12447b + i10, i10, i12);
        }
        ArraysKt.copyInto(elements.f12446a, jArr, i10, 0, elements.f12447b);
        this.f12447b += elements.f12447b;
        return true;
    }

    public final boolean d0(@androidx.annotation.g0(from = 0) int i10, @NotNull long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f12447b) {
            t.f.e("");
        }
        if (elements.length == 0) {
            return false;
        }
        h0(this.f12447b + elements.length);
        long[] jArr = this.f12446a;
        int i11 = this.f12447b;
        if (i10 != i11) {
            ArraysKt.copyInto(jArr, jArr, elements.length + i10, i10, i11);
        }
        ArraysKt.copyInto$default(elements, jArr, i10, 0, 0, 12, (Object) null);
        this.f12447b += elements.length;
        return true;
    }

    public final boolean e0(@NotNull s0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return c0(this.f12447b, elements);
    }

    public final boolean f0(@NotNull long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0(this.f12447b, elements);
    }

    public final void g0() {
        this.f12447b = 0;
    }

    public final void h0(int i10) {
        long[] jArr = this.f12446a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f12446a = jArrCopyOf;
        }
    }

    public final int i0() {
        return this.f12446a.length;
    }

    public final void j0(long j10) {
        p0(j10);
    }

    public final void k0(@NotNull s0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = elements.f12446a;
        int i10 = elements.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            p0(jArr[i11]);
        }
    }

    public final void l0(@NotNull long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (long j10 : elements) {
            p0(j10);
        }
    }

    public final void m0(long j10) {
        b0(j10);
    }

    public final void n0(@NotNull s0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        c0(this.f12447b, elements);
    }

    public final void o0(@NotNull long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d0(this.f12447b, elements);
    }

    public final boolean p0(long j10) {
        int iC = C(j10);
        if (iC < 0) {
            return false;
        }
        s0(iC);
        return true;
    }

    public final boolean q0(@NotNull s0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12447b;
        int i11 = elements.f12447b - 1;
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
        return i10 != this.f12447b;
    }

    public final boolean r0(@NotNull long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12447b;
        for (long j10 : elements) {
            p0(j10);
        }
        return i10 != this.f12447b;
    }

    public final long s0(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12447b) {
            t.f.e("Index must be between 0 and size");
        }
        long[] jArr = this.f12446a;
        long j10 = jArr[i10];
        int i11 = this.f12447b;
        if (i10 != i11 - 1) {
            ArraysKt.copyInto(jArr, jArr, i10, i10 + 1, i11);
        }
        this.f12447b--;
        return j10;
    }

    public final void t0(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f12447b) || i11 < 0 || i11 > i12) {
            t.f.e("Index must be between 0 and size");
        }
        if (i11 < i10) {
            t.f.c("The end index must be < start index");
        }
        if (i11 != i10) {
            int i13 = this.f12447b;
            if (i11 < i13) {
                long[] jArr = this.f12446a;
                ArraysKt.copyInto(jArr, jArr, i10, i11, i13);
            }
            this.f12447b -= i11 - i10;
        }
    }

    public final boolean u0(@NotNull s0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12447b;
        long[] jArr = this.f12446a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.g(jArr[i11])) {
                s0(i11);
            }
        }
        return i10 != this.f12447b;
    }

    public final boolean v0(@NotNull long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f12447b;
        long[] jArr = this.f12446a;
        int i11 = i10 - 1;
        while (true) {
            int i12 = -1;
            if (-1 >= i11) {
                break;
            }
            long j10 = jArr[i11];
            int length = elements.length;
            for (int i13 = 0; i13 < length; i13++) {
                if (elements[i13] == j10) {
                    i12 = i13;
                    break;
                }
            }
            if (i12 < 0) {
                s0(i11);
            }
            i11--;
        }
        return i10 != this.f12447b;
    }

    public final long w0(@androidx.annotation.g0(from = 0) int i10, long j10) {
        if (i10 < 0 || i10 >= this.f12447b) {
            t.f.e("Index must be between 0 and size");
        }
        long[] jArr = this.f12446a;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    public final void x0() {
        int i10 = this.f12447b;
        if (i10 == 0) {
            return;
        }
        ArraysKt.sort(this.f12446a, 0, i10);
    }

    public final void y0() {
        int i10 = this.f12447b;
        if (i10 == 0) {
            return;
        }
        ArraysKt.sortDescending(this.f12446a, 0, i10);
    }

    public final void z0(int i10) {
        int iMax = Math.max(i10, this.f12447b);
        long[] jArr = this.f12446a;
        if (jArr.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f12446a = jArrCopyOf;
        }
    }

    public y1(int i10) {
        super(i10, null);
    }

    public /* synthetic */ y1(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }
}
