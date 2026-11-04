package okio.internal;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.i1;
import org.apache.commons.lang3.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utf8.kt\nokio/Utf8\n*L\n1#1,363:1\n131#1,2:369\n133#1,9:372\n68#2:364\n74#2:365\n74#2:367\n74#2:368\n68#2:396\n74#2:408\n1#3:366\n1#3:371\n212#4,7:381\n122#4:388\n219#4,5:389\n122#4:394\n226#4:395\n228#4:397\n397#4,2:398\n122#4:400\n400#4,6:401\n127#4:407\n406#4:409\n122#4:410\n407#4,13:411\n122#4:424\n422#4:425\n122#4:426\n425#4:427\n230#4,3:428\n440#4,3:431\n122#4:434\n443#4:435\n127#4:436\n446#4,10:437\n127#4:447\n456#4:448\n122#4:449\n457#4,4:450\n127#4:454\n461#4:455\n122#4:456\n462#4,14:457\n122#4:471\n477#4,2:472\n122#4:474\n481#4:475\n122#4:476\n484#4:477\n234#4,3:478\n500#4,3:481\n122#4:484\n503#4:485\n127#4:486\n506#4,2:487\n127#4:489\n510#4,10:490\n127#4:500\n520#4:501\n122#4:502\n521#4,4:503\n127#4:507\n525#4:508\n122#4:509\n526#4,4:510\n127#4:514\n530#4:515\n122#4:516\n531#4,15:517\n122#4:532\n547#4,2:533\n122#4:535\n550#4,2:536\n122#4:538\n554#4:539\n122#4:540\n557#4:541\n241#4:542\n122#4:543\n242#4,5:544\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n*L\n329#1:369,2\n329#1:372,9\n67#1:364\n68#1:365\n258#1:367\n259#1:368\n348#1:396\n348#1:408\n329#1:371\n348#1:381,7\n353#1:388\n348#1:389,5\n353#1:394\n348#1:395\n348#1:397\n348#1:398,2\n353#1:400\n348#1:401,6\n348#1:407\n348#1:409\n353#1:410\n348#1:411,13\n353#1:424\n348#1:425\n353#1:426\n348#1:427\n348#1:428,3\n348#1:431,3\n353#1:434\n348#1:435\n348#1:436\n348#1:437,10\n348#1:447\n348#1:448\n353#1:449\n348#1:450,4\n348#1:454\n348#1:455\n353#1:456\n348#1:457,14\n353#1:471\n348#1:472,2\n353#1:474\n348#1:475\n353#1:476\n348#1:477\n348#1:478,3\n348#1:481,3\n353#1:484\n348#1:485\n348#1:486\n348#1:487,2\n348#1:489\n348#1:490,10\n348#1:500\n348#1:501\n353#1:502\n348#1:503,4\n348#1:507\n348#1:508\n353#1:509\n348#1:510,4\n348#1:514\n348#1:515\n353#1:516\n348#1:517,15\n353#1:532\n348#1:533,2\n353#1:535\n348#1:536,2\n353#1:538\n348#1:539\n353#1:540\n348#1:541\n348#1:542\n353#1:543\n348#1:544,5\n*E\n"})
@oj.i(name = "-ByteString")
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final char[] f334927a = {org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338161k, org.locationtech.jts.geom.l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', ni.f.f333369f, 'e', 'f'};

    @NotNull
    public static final okio.o A(@NotNull okio.o oVar, int i10, int i11) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int iL = okio.i.l(oVar, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iL <= oVar.H().length) {
            if (iL - i10 >= 0) {
                return (i10 == 0 && iL == oVar.H().length) ? oVar : new okio.o(ArraysKt.copyOfRange(oVar.H(), i10, iL));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + oVar.H().length + ')').toString());
    }

    @NotNull
    public static final okio.o B(@NotNull okio.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        for (int i10 = 0; i10 < oVar.H().length; i10++) {
            byte b10 = oVar.H()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrH = oVar.H();
                byte[] bArrCopyOf = Arrays.copyOf(bArrH, bArrH.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new okio.o(bArrCopyOf);
            }
        }
        return oVar;
    }

    @NotNull
    public static final okio.o C(@NotNull okio.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        for (int i10 = 0; i10 < oVar.H().length; i10++) {
            byte b10 = oVar.H()[i10];
            if (b10 >= 97 && b10 <= 122) {
                byte[] bArrH = oVar.H();
                byte[] bArrCopyOf = Arrays.copyOf(bArrH, bArrH.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + org.msgpack.core.h.a.K);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i11] = (byte) (b11 + org.msgpack.core.h.a.K);
                    }
                }
                return new okio.o(bArrCopyOf);
            }
        }
        return oVar;
    }

    @NotNull
    public static final byte[] D(@NotNull okio.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        byte[] bArrH = oVar.H();
        byte[] bArrCopyOf = Arrays.copyOf(bArrH, bArrH.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @NotNull
    public static final okio.o E(@NotNull byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int iM = okio.i.m(bArr, i11);
        okio.i.e(bArr.length, i10, iM);
        return new okio.o(ArraysKt.copyOfRange(bArr, i10, iM + i10));
    }

    @NotNull
    public static final String F(@NotNull okio.o oVar) {
        okio.o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(oVar2, "<this>");
        if (oVar2.H().length == 0) {
            return "[size=0]";
        }
        int iC = c(oVar2.H(), 64);
        if (iC != -1) {
            String strG0 = oVar2.G0();
            String strSubstring = strG0.substring(0, iC);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strK2 = StringsKt.k2(StringsKt.k2(StringsKt.k2(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), z.f337565d, "\\r", false, 4, null);
            if (iC >= strG0.length()) {
                return "[text=" + strK2 + AbstractJsonLexerKt.END_LIST;
            }
            return "[size=" + oVar2.H().length + " text=" + strK2 + "…]";
        }
        if (oVar2.H().length <= 64) {
            return "[hex=" + oVar2.N() + AbstractJsonLexerKt.END_LIST;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(oVar2.H().length);
        sb2.append(" hex=");
        int iL = okio.i.l(oVar2, 64);
        if (iL > oVar2.H().length) {
            throw new IllegalArgumentException(("endIndex > length(" + oVar2.H().length + ')').toString());
        }
        if (iL < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iL != oVar2.H().length) {
            oVar2 = new okio.o(ArraysKt.copyOfRange(oVar2.H(), 0, iL));
        }
        sb2.append(oVar2.N());
        sb2.append("…]");
        return sb2.toString();
    }

    @NotNull
    public static final String G(@NotNull okio.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        String strM = oVar.M();
        if (strM != null) {
            return strM;
        }
        String strC = i1.c(oVar.a0());
        oVar.r0(strC);
        return strC;
    }

    public static final void H(@NotNull okio.o oVar, @NotNull okio.l buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.write(oVar.H(), i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int I(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - org.locationtech.jts.geom.l.f338160j;
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    @NotNull
    public static final char[] J() {
        return f334927a;
    }

    public static /* synthetic */ void K() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(byte[] bArr, int i10) {
        byte b10;
        int i11;
        int length = bArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                int i15 = i14 + 1;
                if (i14 == i10) {
                    break;
                }
                if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (127 <= b11 && b11 < 160))) || b11 == 65533) {
                    return -1;
                }
                i13 += b11 < 65536 ? 1 : 2;
                i12++;
                while (true) {
                    i14 = i15;
                    if (i12 >= length || (b10 = bArr[i12]) < 0) {
                        break;
                    }
                    i12++;
                    i15 = i14 + 1;
                    if (i14 == i10) {
                        return i13;
                    }
                    if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                        return -1;
                    }
                    i13 += b10 < 65536 ? 1 : 2;
                }
            } else if ((b11 >> 5) == -2) {
                int i16 = i12 + 1;
                if (length <= i16) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b12 = bArr[i16];
                if ((b12 & org.msgpack.core.h.a.f339269e) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i17 = (b11 << 6) ^ (b12 ^ 3968);
                if (i17 < 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i18 = i14 + 1;
                if (i14 == i10) {
                    break;
                }
                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                    return -1;
                }
                i13 += i17 < 65536 ? 1 : 2;
                Unit unit = Unit.f312394a;
                i12 += 2;
                i14 = i18;
            } else if ((b11 >> 4) == -2) {
                int i19 = i12 + 2;
                if (length <= i19) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b13 = bArr[i12 + 1];
                if ((b13 & org.msgpack.core.h.a.f339269e) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b14 = bArr[i19];
                if ((b14 & org.msgpack.core.h.a.f339269e) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i20 = (b11 << com.google.common.base.c.f116461n) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                if (i20 < 2048) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i20 && i20 < 57344) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                i11 = i14 + 1;
                if (i14 == i10) {
                    break;
                }
                if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 < 32) || (127 <= i20 && i20 < 160))) || i20 == 65533) {
                    return -1;
                }
                i13 += i20 < 65536 ? 1 : 2;
                Unit unit2 = Unit.f312394a;
                i12 += 3;
                i14 = i11;
            } else {
                if ((b11 >> 3) != -2) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i21 = i12 + 3;
                if (length <= i21) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b15 = bArr[i12 + 1];
                if ((b15 & org.msgpack.core.h.a.f339269e) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b16 = bArr[i12 + 2];
                if ((b16 & org.msgpack.core.h.a.f339269e) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                byte b17 = bArr[i21];
                if ((b17 & org.msgpack.core.h.a.f339269e) != 128) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                int i22 = (b11 << com.google.common.base.c.f116468u) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << com.google.common.base.c.f116461n));
                if (i22 > 1114111) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i22 && i22 < 57344) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                if (i22 < 65536) {
                    if (i14 == i10) {
                        break;
                    }
                    return -1;
                }
                i11 = i14 + 1;
                if (i14 == i10) {
                    break;
                }
                if ((i22 != 10 && i22 != 13 && ((i22 >= 0 && i22 < 32) || (127 <= i22 && i22 < 160))) || i22 == 65533) {
                    return -1;
                }
                i13 += i22 < 65536 ? 1 : 2;
                Unit unit3 = Unit.f312394a;
                i12 += 4;
                i14 = i11;
            }
        }
        return i13;
    }

    @NotNull
    public static final String d(@NotNull okio.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return okio.a.c(oVar.H(), null, 1, null);
    }

    @NotNull
    public static final String e(@NotNull okio.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return okio.a.b(oVar.H(), okio.a.f());
    }

    public static final int f(@NotNull okio.o oVar, @NotNull okio.o other) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iV0 = oVar.v0();
        int iV1 = other.v0();
        int iMin = Math.min(iV0, iV1);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iE = oVar.E(i10) & 255;
            int iE2 = other.E(i10) & 255;
            if (iE != iE2) {
                return iE < iE2 ? -1 : 1;
            }
        }
        if (iV0 == iV1) {
            return 0;
        }
        return iV0 < iV1 ? -1 : 1;
    }

    public static final void g(@NotNull okio.o oVar, int i10, @NotNull byte[] target, int i11, int i12) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        ArraysKt.copyInto(oVar.H(), target, i11, i10, i12 + i10);
    }

    @Nullable
    public static final okio.o h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArrA = okio.a.a(str);
        if (bArrA != null) {
            return new okio.o(bArrA);
        }
        return null;
    }

    @NotNull
    public static final okio.o i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((I(str.charAt(i11)) << 4) + I(str.charAt(i11 + 1)));
        }
        return new okio.o(bArr);
    }

    @NotNull
    public static final okio.o j(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        okio.o oVar = new okio.o(i1.a(str));
        oVar.r0(str);
        return oVar;
    }

    public static final boolean k(@NotNull okio.o oVar, @NotNull okio.o suffix) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return oVar.n0(oVar.v0() - suffix.v0(), suffix, 0, suffix.v0());
    }

    public static final boolean l(@NotNull okio.o oVar, @NotNull byte[] suffix) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return oVar.o0(oVar.v0() - suffix.length, suffix, 0, suffix.length);
    }

    public static final boolean m(@NotNull okio.o oVar, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (obj == oVar) {
            return true;
        }
        if (obj instanceof okio.o) {
            okio.o oVar2 = (okio.o) obj;
            if (oVar2.v0() == oVar.H().length && oVar2.o0(0, oVar.H(), 0, oVar.H().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte n(@NotNull okio.o oVar, int i10) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return oVar.H()[i10];
    }

    public static final int o(@NotNull okio.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return oVar.H().length;
    }

    public static final int p(@NotNull okio.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int I = oVar.I();
        if (I != 0) {
            return I;
        }
        int iHashCode = Arrays.hashCode(oVar.H());
        oVar.q0(iHashCode);
        return iHashCode;
    }

    @NotNull
    public static final String q(@NotNull okio.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        char[] cArr = new char[oVar.H().length * 2];
        int i10 = 0;
        for (byte b10 : oVar.H()) {
            int i11 = i10 + 1;
            cArr[i10] = J()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = J()[b10 & com.google.common.base.c.f116464q];
        }
        return StringsKt.w1(cArr);
    }

    public static final int r(@NotNull okio.o oVar, @NotNull byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = oVar.H().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax <= length) {
            while (!okio.i.d(oVar.H(), iMax, other, 0, other.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    @NotNull
    public static final byte[] s(@NotNull okio.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return oVar.H();
    }

    public static final int t(@NotNull okio.o oVar, @NotNull okio.o other, int i10) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return oVar.g0(other.a0(), i10);
    }

    public static final int u(@NotNull okio.o oVar, @NotNull byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(okio.i.l(oVar, i10), oVar.H().length - other.length); -1 < iMin; iMin--) {
            if (okio.i.d(oVar.H(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    @NotNull
    public static final okio.o v(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return new okio.o(bArrCopyOf);
    }

    public static final boolean w(@NotNull okio.o oVar, int i10, @NotNull okio.o other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return other.o0(i11, oVar.H(), i10, i12);
    }

    public static final boolean x(@NotNull okio.o oVar, int i10, @NotNull byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return i10 >= 0 && i10 <= oVar.H().length - i12 && i11 >= 0 && i11 <= other.length - i12 && okio.i.d(oVar.H(), i10, other, i11, i12);
    }

    public static final boolean y(@NotNull okio.o oVar, @NotNull okio.o prefix) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return oVar.n0(0, prefix, 0, prefix.v0());
    }

    public static final boolean z(@NotNull okio.o oVar, @NotNull byte[] prefix) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return oVar.o0(0, prefix, 0, prefix.length);
    }
}
