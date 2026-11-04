package kotlin.text;

import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class StringsKt__StringNumberConversionsKt extends v {
    @NotNull
    public static final Void Y0(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @Nullable
    public static final Byte Z0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return a1(str, 10);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @Nullable
    public static final Byte a1(@NotNull String str, int i10) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer numB1 = b1(str, i10);
        if (numB1 != null && (iIntValue = numB1.intValue()) >= -128 && iIntValue <= 127) {
            return Byte.valueOf((byte) iIntValue);
        }
        return null;
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @Nullable
    public static Integer b1(@NotNull String str, int i10) {
        boolean z10;
        int i11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int iCompare = Intrinsics.compare((int) cCharAt, 48);
        int i13 = androidx.media3.common.j.f60676f;
        if (iCompare < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i13 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i11 = 0;
        }
        int i14 = -59652323;
        while (i11 < length) {
            int iA = CharsKt__CharJVMKt.a(str.charAt(i11), i10);
            if (iA < 0) {
                return null;
            }
            if (i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / i10))) {
                return null;
            }
            int i15 = i12 * i10;
            if (i15 < i13 + iA) {
                return null;
            }
            i12 = i15 - iA;
            i11++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @Nullable
    public static Long c1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return d1(str, 10);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @Nullable
    public static final Long d1(@NotNull String str, int i10) {
        boolean z10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        Long l10 = null;
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i11 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i11 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i11 < length) {
            int iA = CharsKt__CharJVMKt.a(str.charAt(i11), i10);
            if (iA < 0) {
                return l10;
            }
            if (j11 < j12) {
                if (j12 != -256204778801521550L) {
                    return l10;
                }
                j12 = j10 / ((long) i10);
                if (j11 < j12) {
                    return l10;
                }
            }
            Long l11 = l10;
            int i12 = i11;
            long j13 = j11 * ((long) i10);
            long j14 = iA;
            if (j13 < j10 + j14) {
                return l11;
            }
            j11 = j13 - j14;
            i11 = i12 + 1;
            l10 = l11;
        }
        return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @Nullable
    public static final Short e1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f1(str, 10);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @Nullable
    public static final Short f1(@NotNull String str, int i10) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer numB1 = b1(str, i10);
        if (numB1 != null && (iIntValue = numB1.intValue()) >= -32768 && iIntValue <= 32767) {
            return Short.valueOf((short) iIntValue);
        }
        return null;
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @Nullable
    public static Integer toIntOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return b1(str, 10);
    }
}
