package jk;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final boolean a(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            int i11 = 7 << 1;
            if (Intrinsics.compare((int) cCharAt, 31) > 0 && Intrinsics.compare((int) cCharAt, 127) < 0) {
                int i12 = 0 ^ (-1);
                if (StringsKt.q3(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    private static final boolean b(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = str.charAt(i14);
                if (Intrinsics.compare((int) cCharAt, 48) < 0 || Intrinsics.compare((int) cCharAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[LOOP:1: B:30:0x0074->B:33:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0086 A[EDGE_INSN: B:54:0x0086->B:34:0x0086 BREAK  A[LOOP:1: B:30:0x0074->B:33:0x0080], SYNTHETIC] */
    private static final InetAddress c(String str, int i10, int i11) {
        int i12;
        int i13;
        int iR;
        byte[] bArr = new byte[16];
        int i14 = i10;
        int i15 = 0;
        int i16 = -1;
        int i17 = -1;
        while (i14 < i11) {
            if (i15 == 16) {
                return null;
            }
            int i18 = i14 + 2;
            if (i18 <= i11 && StringsKt.t2(str, "::", i14, false, 4, null)) {
                if (i16 != -1) {
                    return null;
                }
                i15 += 2;
                if (i18 == i11) {
                    i16 = i15;
                    break;
                }
                i16 = i15;
                i17 = i18;
                i12 = 0;
                i14 = i17;
                while (i14 < i11) {
                    iR = f.R(str.charAt(i14));
                    if (iR != -1) {
                        break;
                        break;
                    }
                    i12 = (i12 << 4) + iR;
                    i14++;
                }
                i13 = i14 - i17;
                if (i13 != 0) {
                }
                return null;
            }
            if (i15 != 0) {
                if (!StringsKt.t2(str, ":", i14, false, 4, null)) {
                    if (!StringsKt.t2(str, ".", i14, false, 4, null) || !b(str, i17, i11, bArr, i15 - 2)) {
                        return null;
                    }
                    i15 += 2;
                    break;
                }
                i14++;
            }
            i17 = i14;
            i12 = 0;
            i14 = i17;
            while (i14 < i11) {
                iR = f.R(str.charAt(i14));
                if (iR != -1) {
                    break;
                }
                i12 = (i12 << 4) + iR;
                i14++;
            }
            i13 = i14 - i17;
            if (i13 != 0 || i13 > 4) {
                return null;
            }
            int i19 = i15 + 1;
            bArr[i15] = (byte) ((i12 >>> 8) & 255);
            i15 += 2;
            bArr[i19] = (byte) (i12 & 255);
        }
        if (i15 != 16) {
            if (i16 == -1) {
                return null;
            }
            int i20 = i15 - i16;
            System.arraycopy(bArr, i16, bArr, 16 - i20, i20);
            Arrays.fill(bArr, i16, (16 - i15) + i16, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    private static final String d(byte[] bArr) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        l lVar = new l();
        while (i11 < bArr.length) {
            if (i11 == i10) {
                lVar.writeByte(58);
                i11 += i13;
                if (i11 == 16) {
                    lVar.writeByte(58);
                }
            } else {
                if (i11 > 0) {
                    lVar.writeByte(58);
                }
                lVar.q7((f.d(bArr[i11], 255) << 8) | f.d(bArr[i11 + 1], 255));
                i11 += 2;
            }
        }
        return lVar.O7();
    }

    @Nullable
    public static final String e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!StringsKt.V2(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0 || a(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressC = (StringsKt.u2(str, "[", false, 2, null) && StringsKt.M1(str, "]", false, 2, null)) ? c(str, 1, str.length() - 1) : c(str, 0, str.length());
        if (inetAddressC == null) {
            return null;
        }
        byte[] address = inetAddressC.getAddress();
        if (address.length == 16) {
            Intrinsics.checkNotNullExpressionValue(address, "address");
            return d(address);
        }
        if (address.length == 4) {
            return inetAddressC.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
