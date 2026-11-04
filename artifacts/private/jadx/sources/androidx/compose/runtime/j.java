package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,4061:1\n3601#1,5:4065\n3606#1,27:4071\n3601#1,5:4098\n3606#1,27:4104\n3911#2:4062\n3911#2:4063\n3911#2:4064\n3681#2:4070\n3681#2:4103\n3681#2:4131\n3681#2:4132\n3681#2:4133\n3911#2:4134\n3911#2:4135\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n*L\n3591#1:4065,5\n3591#1:4071,27\n3593#1:4098,5\n3593#1:4104,27\n3568#1:4062\n3574#1:4063\n3588#1:4064\n3591#1:4070\n3593#1:4103\n3605#1:4131\n3611#1:4132\n3628#1:4133\n3645#1:4134\n3656#1:4135\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36162d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private long[] f36165c = y5.f36813a;

    private final int c(int i10, Function1<? super Long, Long> function1) {
        int iNumberOfTrailingZeros;
        if (i10 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros((function1.invoke(Long.valueOf(this.f36163a)).longValue() >>> i10) << i10)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i10 < 128) {
            int i11 = i10 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros((function1.invoke(Long.valueOf(this.f36164b)).longValue() >>> i11) << i11);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i10, 128);
        int i12 = (iMax / 64) - 2;
        long[] jArr = this.f36165c;
        int length = jArr.length;
        for (int i13 = i12; i13 < length; i13++) {
            long jLongValue = function1.invoke(Long.valueOf(jArr[i13])).longValue();
            if (i13 == i12) {
                int i14 = iMax % 64;
                jLongValue = (jLongValue >>> i14) << i14;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(jLongValue);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i13 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final boolean a(int i10) {
        int i11;
        if (i10 < 64) {
            return ((1 << i10) & this.f36163a) != 0;
        }
        if (i10 < 128) {
            return ((1 << (i10 - 64)) & this.f36164b) != 0;
        }
        long[] jArr = this.f36165c;
        int length = jArr.length;
        if (length != 0 && (i11 = (i10 / 64) - 2) < length) {
            return ((1 << (i10 % 64)) & jArr[i11]) != 0;
        }
        return false;
    }

    public final int b() {
        return (this.f36165c.length + 2) * 64;
    }

    public final int d(int i10) {
        int iNumberOfTrailingZeros;
        if (i10 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.f36163a) >>> i10) << i10)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i10 < 128) {
            int i11 = i10 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.f36164b) >>> i11) << i11);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i10, 128);
        int i12 = (iMax / 64) - 2;
        long[] jArr = this.f36165c;
        int length = jArr.length;
        for (int i13 = i12; i13 < length; i13++) {
            long j10 = ~jArr[i13];
            if (i13 == i12) {
                int i14 = iMax % 64;
                j10 = (j10 >>> i14) << i14;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j10);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i13 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i10) {
        int iNumberOfTrailingZeros;
        if (i10 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros((this.f36163a >>> i10) << i10)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i10 < 128) {
            int i11 = i10 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros((this.f36164b >>> i11) << i11);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i10, 128);
        int i12 = (iMax / 64) - 2;
        long[] jArr = this.f36165c;
        int length = jArr.length;
        for (int i13 = i12; i13 < length; i13++) {
            long j10 = jArr[i13];
            if (i13 == i12) {
                int i14 = iMax % 64;
                j10 = (j10 >>> i14) << i14;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j10);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i13 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final void f(int i10, boolean z10) {
        if (i10 < 64) {
            this.f36163a = ((z10 ? 1L : 0L) << i10) | ((~(1 << i10)) & this.f36163a);
            return;
        }
        if (i10 < 128) {
            this.f36164b = ((z10 ? 1L : 0L) << i10) | ((~(1 << (i10 - 64))) & this.f36164b);
            return;
        }
        int i11 = i10 / 64;
        int i12 = i11 - 2;
        int i13 = i10 % 64;
        long j10 = 1 << i13;
        long[] jArrCopyOf = this.f36165c;
        if (i12 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11 - 1);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f36165c = jArrCopyOf;
        }
        jArrCopyOf[i12] = ((z10 ? 1L : 0L) << i13) | ((~j10) & jArrCopyOf[i12]);
    }

    public final void g(int i10, int i11) {
        long j10 = i10 < i11 ? -1L : 0L;
        this.f36163a = (((((long) (i10 < 64 ? 1 : 0)) * j10) >>> (64 - (Math.min(64, i11) - i10))) << i10) | this.f36163a;
        if (i11 > 64) {
            int iMax = Math.max(i10, 64);
            this.f36164b = (((j10 * ((long) (iMax < 128 ? 1 : 0))) >>> (128 - (Math.min(128, i11) - iMax))) << iMax) | this.f36164b;
            if (i11 > 128) {
                for (int iMax2 = Math.max(iMax, 128); iMax2 < i11; iMax2++) {
                    f(iMax2, true);
                }
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BitVector [");
        int iB = b();
        boolean z10 = true;
        for (int i10 = 0; i10 < iB; i10++) {
            if (a(i10)) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(i10);
                z10 = false;
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
