package kotlin.text;

import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1#2:350\n*E\n"})
public class c extends CharsKt__CharJVMKt {
    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    public static final char C(int i10) {
        if (i10 >= 0 && i10 < 10) {
            return (char) (i10 + 48);
        }
        throw new IllegalArgumentException("Int " + i10 + " is not a decimal digit");
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    public static final char D(int i10, int i11) {
        if (2 > i11 || i11 >= 37) {
            throw new IllegalArgumentException("Invalid radix: " + i11 + ". Valid radix values are in range 2..36");
        }
        if (i10 >= 0 && i10 < i11) {
            return (char) (i10 < 10 ? i10 + 48 : ((char) (i10 + 65)) - '\n');
        }
        throw new IllegalArgumentException("Digit " + i10 + " does not represent a valid digit in radix " + i11);
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    public static int E(char c10) {
        int iA = CharsKt__CharJVMKt.a(c10, 10);
        if (iA >= 0) {
            return iA;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    public static final int F(char c10, int i10) {
        Integer numH = H(c10, i10);
        if (numH != null) {
            return numH.intValue();
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a digit in the given radix=" + i10);
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @Nullable
    public static final Integer G(char c10) {
        Integer numValueOf = Integer.valueOf(CharsKt__CharJVMKt.a(c10, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    @m2(markerClass = {kotlin.s.class})
    @e1(version = "1.5")
    @Nullable
    public static final Integer H(char c10, int i10) {
        CharsKt__CharJVMKt.checkRadix(i10);
        Integer numValueOf = Integer.valueOf(CharsKt__CharJVMKt.a(c10, i10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean I(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean J(char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return I(c10, c11, z10);
    }

    public static boolean K(char c10) {
        return 55296 <= c10 && c10 < 57344;
    }

    @kotlin.internal.f
    private static final String L(char c10, String other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return c10 + other;
    }

    @e1(version = "1.5")
    @NotNull
    public static String M(char c10) {
        return e0.a(c10);
    }
}
