package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n1#1,274:1\n265#1,7:275\n265#1,7:282\n265#1,7:289\n265#1,7:296\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n142#1:275,7\n149#1:282,7\n229#1:289,7\n240#1:296,7\n*E\n"})
public class v extends u {
    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal A0(String str, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @e1(version = "1.2")
    @Nullable
    public static final BigDecimal B0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (o.f313377b.k(str)) {
                return new BigDecimal(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @e1(version = "1.2")
    @Nullable
    public static final BigDecimal C0(@NotNull String str, @NotNull MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        try {
            if (o.f313377b.k(str)) {
                return new BigDecimal(str, mathContext);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger D0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigInteger(str);
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger E0(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @e1(version = "1.2")
    @Nullable
    public static final BigInteger F0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return G0(str, 10);
    }

    @e1(version = "1.2")
    @Nullable
    public static final BigInteger G0(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i11 = str.charAt(0) == '-' ? 1 : 0; i11 < length; i11++) {
                if (CharsKt__CharJVMKt.a(str.charAt(i11), i10) < 0) {
                    return null;
                }
            }
        } else if (CharsKt__CharJVMKt.a(str.charAt(0), i10) < 0) {
            return null;
        }
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @e1(version = "1.4")
    @kotlin.internal.f
    private static final boolean H0(String str) {
        return Boolean.parseBoolean(str);
    }

    @kotlin.internal.f
    private static final byte I0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @kotlin.internal.f
    private static final byte J0(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @kotlin.internal.f
    private static final double K0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Double.parseDouble(str);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @Nullable
    public static Double L0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (o.f313377b.k(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @kotlin.internal.f
    private static final float M0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Float.parseFloat(str);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @Nullable
    public static Float N0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (o.f313377b.k(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @kotlin.internal.f
    private static final int O0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @kotlin.internal.f
    private static final int P0(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @kotlin.internal.f
    private static final long Q0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @kotlin.internal.f
    private static final long R0(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @kotlin.internal.f
    private static final short S0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str);
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @kotlin.internal.f
    private static final short T0(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @kotlin.internal.f
    private static final String U0(byte b10, int i10) {
        String string = Integer.toString(b10, CharsKt__CharJVMKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @kotlin.internal.f
    private static final String V0(int i10, int i11) {
        String string = Integer.toString(i10, CharsKt__CharJVMKt.checkRadix(i11));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @kotlin.internal.f
    private static final String W0(long j10, int i10) {
        String string = Long.toString(j10, CharsKt__CharJVMKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @kotlin.internal.f
    private static final String X0(short s10, int i10) {
        String string = Integer.toString(s10, CharsKt__CharJVMKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final <T> T y0(String str, Function1<? super String, ? extends T> function1) {
        try {
            if (o.f313377b.k(str)) {
                return function1.invoke(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal z0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigDecimal(str);
    }
}
