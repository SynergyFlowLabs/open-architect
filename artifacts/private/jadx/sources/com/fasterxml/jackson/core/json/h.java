package com.fasterxml.jackson.core.json;

import com.facebook.internal.z0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.q;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.l;

/* JADX INFO: loaded from: classes4.dex */
public class h extends com.fasterxml.jackson.core.base.b {

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    static final byte f102578s4 = 10;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private static final int[] f102579t4 = com.fasterxml.jackson.core.io.a.i();

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    protected static final int[] f102580u4 = com.fasterxml.jackson.core.io.a.g();

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    protected q f102581l4;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.sym.a f102582m4;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    protected int[] f102583n4;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    protected boolean f102584o4;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private int f102585p4;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    protected DataInput f102586q4;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    protected int f102587r4;

    public h(com.fasterxml.jackson.core.io.d dVar, int i10, DataInput dataInput, q qVar, com.fasterxml.jackson.core.sym.a aVar, int i11) {
        super(dVar, i10);
        this.f102583n4 = new int[16];
        this.f102581l4 = qVar;
        this.f102582m4 = aVar;
        this.f102586q4 = dataInput;
        this.f102587r4 = i11;
    }

    private void F6(int i10) throws com.fasterxml.jackson.core.j {
        F3("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
    }

    private final int K5(int i10) throws IOException {
        int unsignedByte = this.f102586q4.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            F6(unsignedByte & 255);
        }
        return ((i10 & 31) << 6) | (unsignedByte & 63);
    }

    private final int L5(int i10) throws IOException {
        int i11 = i10 & 15;
        int unsignedByte = this.f102586q4.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            F6(unsignedByte & 255);
        }
        int i12 = (i11 << 6) | (unsignedByte & 63);
        int unsignedByte2 = this.f102586q4.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            F6(unsignedByte2 & 255);
        }
        return (i12 << 6) | (unsignedByte2 & 63);
    }

    private final void L6() throws IOException {
        int[] iArrF = com.fasterxml.jackson.core.io.a.f();
        int unsignedByte = this.f102586q4.readUnsignedByte();
        while (true) {
            int i10 = iArrF[unsignedByte];
            if (i10 != 0) {
                if (i10 == 2) {
                    T6();
                } else if (i10 == 3) {
                    V6();
                } else if (i10 == 4) {
                    W6();
                } else if (i10 == 10 || i10 == 13) {
                    this.P3++;
                } else if (i10 != 42) {
                    D6(unsignedByte);
                } else {
                    unsignedByte = this.f102586q4.readUnsignedByte();
                    if (unsignedByte == 47) {
                        return;
                    }
                }
            }
            unsignedByte = this.f102586q4.readUnsignedByte();
        }
    }

    private final int M6() throws IOException {
        int unsignedByte = this.f102587r4;
        if (unsignedByte < 0) {
            unsignedByte = this.f102586q4.readUnsignedByte();
        } else {
            this.f102587r4 = -1;
        }
        if (unsignedByte == 58) {
            int unsignedByte2 = this.f102586q4.readUnsignedByte();
            if (unsignedByte2 > 32) {
                return (unsignedByte2 == 47 || unsignedByte2 == 35) ? N6(unsignedByte2, true) : unsignedByte2;
            }
            if ((unsignedByte2 != 32 && unsignedByte2 != 9) || (unsignedByte2 = this.f102586q4.readUnsignedByte()) <= 32) {
                return N6(unsignedByte2, true);
            }
            if (unsignedByte2 != 47 && unsignedByte2 != 35) {
                return unsignedByte2;
            }
            return N6(unsignedByte2, true);
        }
        if (unsignedByte == 32 || unsignedByte == 9) {
            unsignedByte = this.f102586q4.readUnsignedByte();
        }
        if (unsignedByte != 58) {
            return N6(unsignedByte, false);
        }
        int unsignedByte3 = this.f102586q4.readUnsignedByte();
        if (unsignedByte3 > 32) {
            if (unsignedByte3 != 47 && unsignedByte3 != 35) {
                return unsignedByte3;
            }
            return N6(unsignedByte3, true);
        }
        if ((unsignedByte3 == 32 || unsignedByte3 == 9) && (unsignedByte3 = this.f102586q4.readUnsignedByte()) > 32) {
            return (unsignedByte3 == 47 || unsignedByte3 == 35) ? N6(unsignedByte3, true) : unsignedByte3;
        }
        return N6(unsignedByte3, true);
    }

    private final int N5(int i10) throws IOException {
        int unsignedByte = this.f102586q4.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            F6(unsignedByte & 255);
        }
        int i11 = ((i10 & 7) << 6) | (unsignedByte & 63);
        int unsignedByte2 = this.f102586q4.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            F6(unsignedByte2 & 255);
        }
        int i12 = (i11 << 6) | (unsignedByte2 & 63);
        int unsignedByte3 = this.f102586q4.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            F6(unsignedByte3 & 255);
        }
        return ((i12 << 6) | (unsignedByte3 & 63)) - 65536;
    }

    private final int N6(int i10, boolean z10) throws IOException {
        while (true) {
            if (i10 > 32) {
                if (i10 == 47) {
                    P6();
                } else if (i10 != 35 || !c7()) {
                    if (z10) {
                        return i10;
                    }
                    if (i10 != 58) {
                        V3(i10, "was expecting a colon to separate field name and value");
                    }
                    z10 = true;
                }
            } else if (i10 == 13 || i10 == 10) {
                this.P3++;
            }
            i10 = this.f102586q4.readUnsignedByte();
        }
    }

    private final void P6() throws IOException {
        if (!p2(JsonParser.a.ALLOW_COMMENTS)) {
            V3(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int unsignedByte = this.f102586q4.readUnsignedByte();
        if (unsignedByte == 47) {
            R6();
        } else if (unsignedByte == 42) {
            L6();
        } else {
            V3(unsignedByte, "was expecting either '*' or '/' for a comment");
        }
    }

    private String Q5() throws IOException {
        char[] cArrN = this.W3.n();
        int[] iArr = f102579t4;
        int length = cArrN.length;
        int i10 = 0;
        while (true) {
            int unsignedByte = this.f102586q4.readUnsignedByte();
            if (iArr[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    return this.W3.H(i10);
                }
                R5(cArrN, i10, unsignedByte);
                return this.W3.l();
            }
            int i11 = i10 + 1;
            cArrN[i10] = (char) unsignedByte;
            if (i11 >= length) {
                R5(cArrN, i11, this.f102586q4.readUnsignedByte());
                return this.W3.l();
            }
            i10 = i11;
        }
    }

    private final void R5(char[] cArr, int i10, int i11) throws IOException {
        int[] iArr = f102579t4;
        int length = cArr.length;
        while (true) {
            int i12 = iArr[i11];
            int i13 = 0;
            if (i12 == 0) {
                if (i10 >= length) {
                    cArr = this.W3.s();
                    length = cArr.length;
                    i10 = 0;
                }
                cArr[i10] = (char) i11;
                i11 = this.f102586q4.readUnsignedByte();
                i10++;
            } else {
                if (i11 == 34) {
                    this.W3.I(i10);
                    return;
                }
                if (i12 == 1) {
                    i11 = w4();
                } else if (i12 == 2) {
                    i11 = K5(i11);
                } else if (i12 == 3) {
                    i11 = L5(i11);
                } else if (i12 == 4) {
                    int iN5 = N5(i11);
                    int i14 = i10 + 1;
                    cArr[i10] = (char) ((iN5 >> 10) | com.fasterxml.jackson.core.base.a.f102232g);
                    if (i14 >= cArr.length) {
                        cArr = this.W3.s();
                        length = cArr.length;
                        i10 = 0;
                    } else {
                        i10 = i14;
                    }
                    i11 = (iN5 & 1023) | 56320;
                } else if (i11 < 32) {
                    f4(i11, "string value");
                } else {
                    D6(i11);
                }
                if (i10 >= cArr.length) {
                    cArr = this.W3.s();
                    length = cArr.length;
                } else {
                    i13 = i10;
                }
                i10 = i13 + 1;
                cArr[i13] = (char) i11;
                i11 = this.f102586q4.readUnsignedByte();
            }
        }
    }

    private final void R6() throws IOException {
        int[] iArrF = com.fasterxml.jackson.core.io.a.f();
        while (true) {
            int unsignedByte = this.f102586q4.readUnsignedByte();
            int i10 = iArrF[unsignedByte];
            if (i10 != 0) {
                if (i10 == 2) {
                    T6();
                } else if (i10 == 3) {
                    V6();
                } else if (i10 == 4) {
                    W6();
                } else if (i10 == 10 || i10 == 13) {
                    break;
                } else if (i10 != 42 && i10 < 0) {
                    D6(unsignedByte);
                }
            }
        }
        this.P3++;
    }

    private static int[] T5(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : Arrays.copyOf(iArr, iArr.length + i10);
    }

    private final void T6() throws IOException {
        int unsignedByte = this.f102586q4.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            F6(unsignedByte & 255);
        }
    }

    private final void V6() throws IOException {
        int unsignedByte = this.f102586q4.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            F6(unsignedByte & 255);
        }
        int unsignedByte2 = this.f102586q4.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            F6(unsignedByte2 & 255);
        }
    }

    private final void W6() throws IOException {
        int unsignedByte = this.f102586q4.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            F6(unsignedByte & 255);
        }
        int unsignedByte2 = this.f102586q4.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            F6(unsignedByte2 & 255);
        }
        int unsignedByte3 = this.f102586q4.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            F6(unsignedByte3 & 255);
        }
    }

    private final int X6() throws IOException {
        int unsignedByte = this.f102587r4;
        if (unsignedByte < 0) {
            unsignedByte = this.f102586q4.readUnsignedByte();
        } else {
            this.f102587r4 = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this.P3++;
            }
            unsignedByte = this.f102586q4.readUnsignedByte();
        }
        if (unsignedByte != 47 && unsignedByte != 35) {
            return unsignedByte;
        }
        return Y6(unsignedByte);
    }

    private final int Y6(int i10) throws IOException {
        while (true) {
            if (i10 > 32) {
                if (i10 == 47) {
                    P6();
                } else if (i10 != 35 || !c7()) {
                    break;
                }
            } else if (i10 == 13 || i10 == 10) {
                this.P3++;
            }
            i10 = this.f102586q4.readUnsignedByte();
        }
        return i10;
    }

    private final int Z5() throws IOException {
        int unsignedByte = this.f102586q4.readUnsignedByte();
        if (unsignedByte >= 48 && unsignedByte <= 57) {
            if (!p2(JsonParser.a.ALLOW_NUMERIC_LEADING_ZEROS)) {
                h4("Leading zeroes not allowed");
            }
            while (unsignedByte == 48) {
                unsignedByte = this.f102586q4.readUnsignedByte();
            }
        }
        return unsignedByte;
    }

    private final int Z6() throws IOException {
        int unsignedByte = this.f102587r4;
        if (unsignedByte < 0) {
            try {
                unsignedByte = this.f102586q4.readUnsignedByte();
            } catch (EOFException unused) {
                return C4();
            }
        } else {
            this.f102587r4 = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this.P3++;
            }
            try {
                unsignedByte = this.f102586q4.readUnsignedByte();
            } catch (EOFException unused2) {
                return C4();
            }
        }
        return (unsignedByte == 47 || unsignedByte == 35) ? Y6(unsignedByte) : unsignedByte;
    }

    private final boolean c7() throws IOException {
        if (!p2(JsonParser.a.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        R6();
        return true;
    }

    private final void d7() throws IOException {
        int i10 = this.f102587r4;
        if (i10 > 32) {
            T3(i10);
            return;
        }
        this.f102587r4 = -1;
        if (i10 == 13 || i10 == 10) {
            this.P3++;
        }
    }

    private final n g6() {
        this.Y3 = false;
        n nVar = this.V3;
        this.V3 = null;
        if (nVar == n.START_ARRAY) {
            this.U3 = this.U3.t(this.S3, this.T3);
        } else if (nVar == n.START_OBJECT) {
            this.U3 = this.U3.u(this.S3, this.T3);
        }
        this.f102294g = nVar;
        return nVar;
    }

    private final n i6(int i10) throws IOException {
        if (i10 == 34) {
            this.f102584o4 = true;
            n nVar = n.VALUE_STRING;
            this.f102294g = nVar;
            return nVar;
        }
        if (i10 == 45) {
            n nVarX6 = x6();
            this.f102294g = nVarX6;
            return nVarX6;
        }
        if (i10 == 91) {
            this.U3 = this.U3.t(this.S3, this.T3);
            n nVar2 = n.START_ARRAY;
            this.f102294g = nVar2;
            return nVar2;
        }
        if (i10 == 102) {
            e6("false", 1);
            n nVar3 = n.VALUE_FALSE;
            this.f102294g = nVar3;
            return nVar3;
        }
        if (i10 == 110) {
            e6(AbstractJsonLexerKt.NULL, 1);
            n nVar4 = n.VALUE_NULL;
            this.f102294g = nVar4;
            return nVar4;
        }
        if (i10 == 116) {
            e6(z0.P, 1);
            n nVar5 = n.VALUE_TRUE;
            this.f102294g = nVar5;
            return nVar5;
        }
        if (i10 == 123) {
            this.U3 = this.U3.u(this.S3, this.T3);
            n nVar6 = n.START_OBJECT;
            this.f102294g = nVar6;
            return nVar6;
        }
        switch (i10) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
            case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                n nVarY6 = y6(i10);
                this.f102294g = nVarY6;
                return nVarY6;
            default:
                n nVarC6 = c6(i10);
                this.f102294g = nVarC6;
                return nVarC6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5  */
    private final String i7(int[] iArr, int i10, int i11) throws com.fasterxml.jackson.core.j {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = ((i10 << 2) - 4) + i11;
        int i18 = 3;
        if (i11 < 4) {
            int i19 = i10 - 1;
            i12 = iArr[i19];
            iArr[i19] = i12 << ((4 - i11) << 3);
        } else {
            i12 = 0;
        }
        char[] cArrN = this.W3.n();
        int i20 = 0;
        int i21 = 0;
        while (i20 < i17) {
            int i22 = iArr[i20 >> 2] >> ((3 - (i20 & 3)) << i18);
            int i23 = i22 & 255;
            int i24 = i20 + 1;
            if (i23 > 127) {
                i13 = i18;
                if ((i22 & 224) == 192) {
                    i14 = i22 & 31;
                    i15 = 1;
                } else if ((i22 & 240) == 224) {
                    i14 = i22 & 15;
                    i15 = 2;
                } else if ((i22 & com.planner5d.library.engine.input.f.b.R1) == 240) {
                    i14 = i22 & 7;
                    i15 = i13;
                } else {
                    E6(i23);
                    i14 = 1;
                    i15 = 1;
                }
                if (i24 + i15 > i17) {
                    N3(" in field name", n.FIELD_NAME);
                }
                int i25 = iArr[i24 >> 2] >> ((3 - (i24 & 3)) << 3);
                i24 = i20 + 2;
                if ((i25 & 192) != 128) {
                    F6(i25);
                }
                int i26 = (i14 << 6) | (i25 & 63);
                if (i15 > 1) {
                    int i27 = iArr[i24 >> 2] >> ((3 - (i24 & 3)) << 3);
                    i24 = i20 + 3;
                    if ((i27 & 192) != 128) {
                        F6(i27);
                    }
                    int i28 = (i27 & 63) | (i26 << 6);
                    i16 = 2;
                    if (i15 > 2) {
                        int i29 = iArr[i24 >> 2] >> ((3 - (i24 & 3)) << 3);
                        i24 = i20 + 4;
                        if ((i29 & 192) != 128) {
                            F6(i29 & 255);
                        }
                        i23 = (i28 << 6) | (i29 & 63);
                    } else {
                        i23 = i28;
                    }
                    if (i15 > i16) {
                        int i30 = i23 - 65536;
                        if (i21 >= cArrN.length) {
                            cArrN = this.W3.q();
                        }
                        cArrN[i21] = (char) ((i30 >> 10) + com.fasterxml.jackson.core.base.a.f102232g);
                        i23 = (i30 & 1023) | 56320;
                        i21++;
                    }
                } else {
                    i23 = i26;
                }
                i16 = 2;
                if (i15 > i16) {
                    int i31 = i23 - 65536;
                    if (i21 >= cArrN.length) {
                        cArrN = this.W3.q();
                    }
                    cArrN[i21] = (char) ((i31 >> 10) + com.fasterxml.jackson.core.base.a.f102232g);
                    i23 = (i31 & 1023) | 56320;
                    i21++;
                }
            } else {
                i13 = i18;
            }
            i20 = i24;
            if (i21 >= cArrN.length) {
                cArrN = this.W3.q();
            }
            cArrN[i21] = (char) i23;
            i21++;
            i18 = i13;
        }
        String str = new String(cArrN, 0, i21);
        if (i11 < 4) {
            iArr[i10 - 1] = i12;
        }
        return this.f102582m4.y(str, iArr, i10);
    }

    private final String l7(int i10, int i11) throws com.fasterxml.jackson.core.j {
        int iT7 = t7(i10, i11);
        String strG = this.f102582m4.G(iT7);
        if (strG != null) {
            return strG;
        }
        int[] iArr = this.f102583n4;
        iArr[0] = iT7;
        return i7(iArr, 1, i11);
    }

    private final String m7(int i10, int i11, int i12) throws com.fasterxml.jackson.core.j {
        int iT7 = t7(i11, i12);
        String strH = this.f102582m4.H(i10, iT7);
        if (strH != null) {
            return strH;
        }
        int[] iArr = this.f102583n4;
        iArr[0] = i10;
        iArr[1] = iT7;
        return i7(iArr, 2, i12);
    }

    private final String o7(int i10, int i11, int i12, int i13) throws com.fasterxml.jackson.core.j {
        int iT7 = t7(i12, i13);
        String strI = this.f102582m4.I(i10, i11, iT7);
        if (strI != null) {
            return strI;
        }
        int[] iArr = this.f102583n4;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = t7(iT7, i13);
        int i14 = 1 << 3;
        return i7(iArr, 3, i13);
    }

    private final n q6(char[] cArr, int i10, int i11, boolean z10, int i12) throws IOException {
        int i13;
        int unsignedByte;
        int i14 = 0;
        if (i11 == 46) {
            cArr[i10] = (char) i11;
            i10++;
            int i15 = 0;
            while (true) {
                unsignedByte = this.f102586q4.readUnsignedByte();
                if (unsignedByte < 48 || unsignedByte > 57) {
                    break;
                    break;
                }
                i15++;
                if (i10 >= cArr.length) {
                    cArr = this.W3.s();
                    i10 = 0;
                }
                cArr[i10] = (char) unsignedByte;
                i10++;
            }
            if (i15 == 0) {
                n4(unsignedByte, "Decimal point not followed by a digit");
            }
            i13 = i15;
            i11 = unsignedByte;
        } else {
            i13 = 0;
        }
        if (i11 == 101 || i11 == 69) {
            if (i10 >= cArr.length) {
                cArr = this.W3.s();
                i10 = 0;
            }
            int i16 = i10 + 1;
            cArr[i10] = (char) i11;
            int unsignedByte2 = this.f102586q4.readUnsignedByte();
            if (unsignedByte2 == 45 || unsignedByte2 == 43) {
                if (i16 >= cArr.length) {
                    cArr = this.W3.s();
                    i16 = 0;
                }
                cArr[i16] = (char) unsignedByte2;
                unsignedByte2 = this.f102586q4.readUnsignedByte();
                i16++;
            }
            i11 = unsignedByte2;
            i10 = i16;
            int i17 = 0;
            while (i11 <= 57 && i11 >= 48) {
                i17++;
                if (i10 >= cArr.length) {
                    cArr = this.W3.s();
                    i10 = 0;
                }
                cArr[i10] = (char) i11;
                i11 = this.f102586q4.readUnsignedByte();
                i10++;
            }
            if (i17 == 0) {
                n4(i11, "Exponent indicator not followed by a digit");
            }
            i14 = i17;
        }
        this.f102587r4 = i11;
        if (this.U3.m()) {
            d7();
        }
        this.W3.I(i10);
        return v5(z10, i12, i13, i14);
    }

    private final String r6(int i10, int i11, int i12) throws IOException {
        int[] iArr = this.f102583n4;
        iArr[0] = this.f102585p4;
        iArr[1] = i11;
        iArr[2] = i12;
        int[] iArr2 = f102580u4;
        int i13 = i10;
        int i14 = 3;
        while (true) {
            int unsignedByte = this.f102586q4.readUnsignedByte();
            if (iArr2[unsignedByte] != 0) {
                return unsignedByte == 34 ? s7(this.f102583n4, i14, i13, 1) : v7(this.f102583n4, i14, i13, unsignedByte, 1);
            }
            int i15 = (i13 << 8) | unsignedByte;
            int unsignedByte2 = this.f102586q4.readUnsignedByte();
            if (iArr2[unsignedByte2] != 0) {
                return unsignedByte2 == 34 ? s7(this.f102583n4, i14, i15, 2) : v7(this.f102583n4, i14, i15, unsignedByte2, 2);
            }
            int i16 = (i15 << 8) | unsignedByte2;
            int unsignedByte3 = this.f102586q4.readUnsignedByte();
            if (iArr2[unsignedByte3] != 0) {
                return unsignedByte3 == 34 ? s7(this.f102583n4, i14, i16, 3) : v7(this.f102583n4, i14, i16, unsignedByte3, 3);
            }
            int i17 = (i16 << 8) | unsignedByte3;
            int unsignedByte4 = this.f102586q4.readUnsignedByte();
            if (iArr2[unsignedByte4] != 0) {
                return unsignedByte4 == 34 ? s7(this.f102583n4, i14, i17, 4) : v7(this.f102583n4, i14, i17, unsignedByte4, 4);
            }
            int[] iArr3 = this.f102583n4;
            if (i14 >= iArr3.length) {
                this.f102583n4 = T5(iArr3, i14);
            }
            this.f102583n4[i14] = i17;
            i14++;
            i13 = unsignedByte4;
        }
    }

    private final String s6(int i10) throws IOException {
        int[] iArr = f102580u4;
        int unsignedByte = this.f102586q4.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            return unsignedByte == 34 ? m7(this.f102585p4, i10, 1) : x7(this.f102585p4, i10, unsignedByte, 1);
        }
        int i11 = (i10 << 8) | unsignedByte;
        int unsignedByte2 = this.f102586q4.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            return unsignedByte2 == 34 ? m7(this.f102585p4, i11, 2) : x7(this.f102585p4, i11, unsignedByte2, 2);
        }
        int i12 = (i11 << 8) | unsignedByte2;
        int unsignedByte3 = this.f102586q4.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            return unsignedByte3 == 34 ? m7(this.f102585p4, i12, 3) : x7(this.f102585p4, i12, unsignedByte3, 3);
        }
        int i13 = (i12 << 8) | unsignedByte3;
        int unsignedByte4 = this.f102586q4.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            return unsignedByte4 == 34 ? m7(this.f102585p4, i13, 4) : x7(this.f102585p4, i13, unsignedByte4, 4);
        }
        return v6(unsignedByte4, i13);
    }

    private final String s7(int[] iArr, int i10, int i11, int i12) throws com.fasterxml.jackson.core.j {
        if (i10 >= iArr.length) {
            iArr = T5(iArr, iArr.length);
            this.f102583n4 = iArr;
        }
        int i13 = i10 + 1;
        iArr[i10] = t7(i11, i12);
        String strJ = this.f102582m4.J(iArr, i13);
        return strJ == null ? i7(iArr, i13, i12) : strJ;
    }

    private static final int t7(int i10, int i11) {
        return i11 == 4 ? i10 : i10 | ((-1) << (i11 << 3));
    }

    private final String v6(int i10, int i11) throws IOException {
        int[] iArr = f102580u4;
        int unsignedByte = this.f102586q4.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            return unsignedByte == 34 ? o7(this.f102585p4, i11, i10, 1) : y7(this.f102585p4, i11, i10, unsignedByte, 1);
        }
        int i12 = (i10 << 8) | unsignedByte;
        int unsignedByte2 = this.f102586q4.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            return unsignedByte2 == 34 ? o7(this.f102585p4, i11, i12, 2) : y7(this.f102585p4, i11, i12, unsignedByte2, 2);
        }
        int i13 = (i12 << 8) | unsignedByte2;
        int unsignedByte3 = this.f102586q4.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            return unsignedByte3 == 34 ? o7(this.f102585p4, i11, i13, 3) : y7(this.f102585p4, i11, i13, unsignedByte3, 3);
        }
        int i14 = (i13 << 8) | unsignedByte3;
        int unsignedByte4 = this.f102586q4.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            return unsignedByte4 == 34 ? o7(this.f102585p4, i11, i14, 4) : y7(this.f102585p4, i11, i14, unsignedByte4, 4);
        }
        return r6(unsignedByte4, i11, i14);
    }

    private final String w7(int i10, int i11, int i12) throws IOException {
        return v7(this.f102583n4, 0, i10, i11, i12);
    }

    private final String x7(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = this.f102583n4;
        iArr[0] = i10;
        return v7(iArr, 1, i11, i12, i13);
    }

    private final void y5(String str, int i10, int i11) throws IOException {
        char cF5 = (char) F5(i11);
        if (Character.isJavaIdentifierPart(cF5)) {
            H6(cF5, str.substring(0, i10));
        }
    }

    private final String y7(int i10, int i11, int i12, int i13, int i14) throws IOException {
        int[] iArr = this.f102583n4;
        iArr[0] = i10;
        iArr[1] = i11;
        return v7(iArr, 2, i12, i13, i14);
    }

    private void z5(int i10) throws com.fasterxml.jackson.core.j {
        if (i10 == 93) {
            if (!this.U3.k()) {
                R4(i10, AbstractJsonLexerKt.END_OBJ);
            }
            this.U3 = this.U3.s();
            this.f102294g = n.END_ARRAY;
        }
        if (i10 == 125) {
            if (!this.U3.l()) {
                R4(i10, AbstractJsonLexerKt.END_LIST);
            }
            this.U3 = this.U3.s();
            this.f102294g = n.END_OBJECT;
        }
    }

    protected final byte[] A5(com.fasterxml.jackson.core.a aVar) throws IOException {
        com.fasterxml.jackson.core.util.c cVarE4 = E4();
        while (true) {
            int unsignedByte = this.f102586q4.readUnsignedByte();
            if (unsignedByte > 32) {
                int iG = aVar.g(unsignedByte);
                if (iG < 0) {
                    if (unsignedByte == 34) {
                        return cVarE4.q();
                    }
                    iG = t4(aVar, unsignedByte, 0);
                    if (iG < 0) {
                        continue;
                    }
                }
                int unsignedByte2 = this.f102586q4.readUnsignedByte();
                int iG2 = aVar.g(unsignedByte2);
                if (iG2 < 0) {
                    iG2 = t4(aVar, unsignedByte2, 1);
                }
                int i10 = (iG << 6) | iG2;
                int unsignedByte3 = this.f102586q4.readUnsignedByte();
                int iG3 = aVar.g(unsignedByte3);
                if (iG3 < 0) {
                    if (iG3 != -2) {
                        if (unsignedByte3 == 34 && !aVar.u()) {
                            cVarE4.b(i10 >> 4);
                            return cVarE4.q();
                        }
                        iG3 = t4(aVar, unsignedByte3, 2);
                    }
                    if (iG3 == -2) {
                        int unsignedByte4 = this.f102586q4.readUnsignedByte();
                        if (!aVar.w(unsignedByte4)) {
                            throw r5(aVar, unsignedByte4, 3, "expected padding character '" + aVar.t() + "'");
                        }
                        cVarE4.b(i10 >> 4);
                    }
                }
                int i11 = (i10 << 6) | iG3;
                int unsignedByte5 = this.f102586q4.readUnsignedByte();
                int iG4 = aVar.g(unsignedByte5);
                if (iG4 < 0) {
                    if (iG4 != -2) {
                        if (unsignedByte5 == 34 && !aVar.u()) {
                            cVarE4.e(i11 >> 2);
                            return cVarE4.q();
                        }
                        iG4 = t4(aVar, unsignedByte5, 3);
                    }
                    if (iG4 == -2) {
                        cVarE4.e(i11 >> 2);
                    }
                }
                cVarE4.d((i11 << 6) | iG4);
            }
        }
    }

    protected int A6(com.fasterxml.jackson.core.a aVar, OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length - 3;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int unsignedByte = this.f102586q4.readUnsignedByte();
            if (unsignedByte > 32) {
                int iG = aVar.g(unsignedByte);
                if (iG < 0) {
                    if (unsignedByte == 34) {
                        break;
                    }
                    iG = t4(aVar, unsignedByte, 0);
                    if (iG < 0) {
                        continue;
                    }
                }
                if (i10 > length) {
                    i11 += i10;
                    outputStream.write(bArr, 0, i10);
                    i10 = 0;
                }
                int unsignedByte2 = this.f102586q4.readUnsignedByte();
                int iG2 = aVar.g(unsignedByte2);
                if (iG2 < 0) {
                    iG2 = t4(aVar, unsignedByte2, 1);
                }
                int i12 = (iG << 6) | iG2;
                int unsignedByte3 = this.f102586q4.readUnsignedByte();
                int iG3 = aVar.g(unsignedByte3);
                if (iG3 < 0) {
                    if (iG3 != -2) {
                        if (unsignedByte3 == 34 && !aVar.u()) {
                            bArr[i10] = (byte) (i12 >> 4);
                            i10++;
                            break;
                        }
                        iG3 = t4(aVar, unsignedByte3, 2);
                    }
                    if (iG3 == -2) {
                        int unsignedByte4 = this.f102586q4.readUnsignedByte();
                        if (!aVar.w(unsignedByte4)) {
                            throw r5(aVar, unsignedByte4, 3, "expected padding character '" + aVar.t() + "'");
                        }
                        bArr[i10] = (byte) (i12 >> 4);
                        i10++;
                    }
                }
                int i13 = (i12 << 6) | iG3;
                int unsignedByte5 = this.f102586q4.readUnsignedByte();
                int iG4 = aVar.g(unsignedByte5);
                if (iG4 < 0) {
                    if (iG4 != -2) {
                        if (unsignedByte5 == 34 && !aVar.u()) {
                            int i14 = i10 + 1;
                            bArr[i10] = (byte) (i13 >> 10);
                            i10 += 2;
                            bArr[i14] = (byte) (i13 >> 2);
                            break;
                        }
                        iG4 = t4(aVar, unsignedByte5, 3);
                    }
                    if (iG4 == -2) {
                        int i15 = i10 + 1;
                        bArr[i10] = (byte) (i13 >> 10);
                        i10 += 2;
                        bArr[i15] = (byte) (i13 >> 2);
                    }
                }
                int i16 = (i13 << 6) | iG4;
                bArr[i10] = (byte) (i16 >> 16);
                int i17 = i10 + 2;
                bArr[i10 + 1] = (byte) (i16 >> 8);
                i10 += 3;
                bArr[i17] = (byte) i16;
            }
        }
        this.f102584o4 = false;
        if (i10 <= 0) {
            return i11;
        }
        int i18 = i11 + i10;
        outputStream.write(bArr, 0, i10);
        return i18;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long B2(long j10) throws IOException {
        if (this.f102294g == n.FIELD_NAME) {
            this.Y3 = false;
            n nVar = this.V3;
            this.V3 = null;
            this.f102294g = nVar;
            if (nVar == n.VALUE_NUMBER_INT) {
                return Q0();
            }
            if (nVar == n.START_ARRAY) {
                this.U3 = this.U3.t(this.S3, this.T3);
                return j10;
            }
            if (nVar == n.START_OBJECT) {
                this.U3 = this.U3.u(this.S3, this.T3);
                return j10;
            }
        } else if (E2() == n.VALUE_NUMBER_INT) {
            return Q0();
        }
        return j10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String D2() throws IOException {
        if (this.f102294g != n.FIELD_NAME) {
            if (E2() == n.VALUE_STRING) {
                return j1();
            }
            return null;
        }
        this.Y3 = false;
        n nVar = this.V3;
        this.V3 = null;
        this.f102294g = nVar;
        if (nVar == n.VALUE_STRING) {
            if (!this.f102584o4) {
                return this.W3.l();
            }
            this.f102584o4 = false;
            return Q5();
        }
        if (nVar == n.START_ARRAY) {
            this.U3 = this.U3.t(this.S3, this.T3);
        } else if (nVar == n.START_OBJECT) {
            this.U3 = this.U3.u(this.S3, this.T3);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected void D4() throws IOException {
        char[] cArrN = this.W3.n();
        int[] iArr = f102579t4;
        int length = cArrN.length;
        int i10 = 0;
        while (true) {
            int unsignedByte = this.f102586q4.readUnsignedByte();
            if (iArr[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    this.W3.I(i10);
                    return;
                } else {
                    R5(cArrN, i10, unsignedByte);
                    return;
                }
            }
            int i11 = i10 + 1;
            cArrN[i10] = (char) unsignedByte;
            if (i11 >= length) {
                R5(cArrN, i11, this.f102586q4.readUnsignedByte());
                return;
            }
            i10 = i11;
        }
    }

    protected void D6(int i10) throws com.fasterxml.jackson.core.j {
        if (i10 < 32) {
            b4(i10);
        }
        E6(i10);
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public n E2() throws IOException {
        n nVarX6;
        if (this.L3) {
            return null;
        }
        n nVar = this.f102294g;
        n nVar2 = n.FIELD_NAME;
        if (nVar == nVar2) {
            return g6();
        }
        this.f102250b4 = 0;
        if (this.f102584o4) {
            S6();
        }
        int iZ6 = Z6();
        if (iZ6 < 0) {
            close();
            this.f102294g = null;
            return null;
        }
        this.f102249a4 = null;
        this.S3 = this.P3;
        if (iZ6 == 93 || iZ6 == 125) {
            z5(iZ6);
            return this.f102294g;
        }
        if (this.U3.x()) {
            if (iZ6 != 44) {
                V3(iZ6, "was expecting comma to separate " + this.U3.q() + " entries");
            }
            iZ6 = X6();
            if (JsonParser.a.ALLOW_TRAILING_COMMA.n(this.f102189a) && (iZ6 == 93 || iZ6 == 125)) {
                z5(iZ6);
                return this.f102294g;
            }
        }
        if (!this.U3.l()) {
            return i6(iZ6);
        }
        this.U3.B(w6(iZ6));
        this.f102294g = nVar2;
        int iM6 = M6();
        if (iM6 == 34) {
            this.f102584o4 = true;
            this.V3 = n.VALUE_STRING;
            return this.f102294g;
        }
        if (iM6 == 45) {
            nVarX6 = x6();
        } else if (iM6 == 91) {
            nVarX6 = n.START_ARRAY;
        } else if (iM6 == 102) {
            e6("false", 1);
            nVarX6 = n.VALUE_FALSE;
        } else if (iM6 == 110) {
            e6(AbstractJsonLexerKt.NULL, 1);
            nVarX6 = n.VALUE_NULL;
        } else if (iM6 == 116) {
            e6(z0.P, 1);
            nVarX6 = n.VALUE_TRUE;
        } else if (iM6 != 123) {
            switch (iM6) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    nVarX6 = y6(iM6);
                    break;
                default:
                    nVarX6 = c6(iM6);
                    break;
            }
        } else {
            nVarX6 = n.START_OBJECT;
        }
        this.V3 = nVarX6;
        return this.f102294g;
    }

    protected void E6(int i10) throws com.fasterxml.jackson.core.j {
        F3("Invalid UTF-8 start byte 0x" + Integer.toHexString(i10));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    protected int F5(int i10) throws IOException {
        char c10;
        int unsignedByte;
        int unsignedByte2;
        int unsignedByte3;
        int i11 = i10 & 255;
        if (i11 > 127) {
            if ((i10 & 224) == 192) {
                i11 = i10 & 31;
            } else {
                if ((i10 & 240) == 224) {
                    i11 = i10 & 15;
                    c10 = 2;
                } else if ((i10 & com.planner5d.library.engine.input.f.b.R1) == 240) {
                    i11 = i10 & 7;
                    c10 = 3;
                } else {
                    E6(i10 & 255);
                }
                unsignedByte = this.f102586q4.readUnsignedByte();
                if ((unsignedByte & 192) != 128) {
                    F6(unsignedByte & 255);
                }
                i11 = (i11 << 6) | (unsignedByte & 63);
                if (c10 > 1) {
                    unsignedByte2 = this.f102586q4.readUnsignedByte();
                    if ((unsignedByte2 & 192) != 128) {
                        F6(unsignedByte2 & 255);
                    }
                    i11 = (i11 << 6) | (unsignedByte2 & 63);
                    if (c10 > 2) {
                        unsignedByte3 = this.f102586q4.readUnsignedByte();
                        if ((unsignedByte3 & 192) != 128) {
                            F6(unsignedByte3 & 255);
                        }
                        return (i11 << 6) | (unsignedByte3 & 63);
                    }
                }
            }
            c10 = 1;
            unsignedByte = this.f102586q4.readUnsignedByte();
            if ((unsignedByte & 192) != 128) {
                F6(unsignedByte & 255);
            }
            i11 = (i11 << 6) | (unsignedByte & 63);
            if (c10 > 1) {
                unsignedByte2 = this.f102586q4.readUnsignedByte();
                if ((unsignedByte2 & 192) != 128) {
                    F6(unsignedByte2 & 255);
                }
                i11 = (i11 << 6) | (unsignedByte2 & 63);
                if (c10 > 2) {
                    unsignedByte3 = this.f102586q4.readUnsignedByte();
                    if ((unsignedByte3 & 192) != 128) {
                        F6(unsignedByte3 & 255);
                    }
                    return (i11 << 6) | (unsignedByte3 & 63);
                }
            }
        }
        return i11;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void H() throws IOException {
        if (this.f102584o4) {
            this.f102584o4 = false;
            D4();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object H0() {
        return this.f102586q4;
    }

    protected void H6(int i10, String str) throws IOException {
        I6(i10, str, "'null', 'true', 'false' or NaN");
    }

    protected void I6(int i10, String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            char cF5 = (char) F5(i10);
            if (!Character.isJavaIdentifierPart(cF5)) {
                F3("Unrecognized token '" + sb2.toString() + "': was expecting " + str2);
                return;
            }
            sb2.append(cF5);
            i10 = this.f102586q4.readUnsignedByte();
        }
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public int O1() throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_NUMBER_INT && nVar != n.VALUE_NUMBER_FLOAT) {
            return super.T1(0);
        }
        int i10 = this.f102250b4;
        if ((i10 & 1) == 0) {
            if (i10 == 0) {
                return I4();
            }
            if ((i10 & 1) == 0) {
                X4();
            }
        }
        return this.f102251c4;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int O2(com.fasterxml.jackson.core.a aVar, OutputStream outputStream) throws IOException {
        if (!this.f102584o4 || this.f102294g != n.VALUE_STRING) {
            byte[] bArrR = R(aVar);
            outputStream.write(bArrR);
            return bArrR.length;
        }
        byte[] bArrD = this.K3.d();
        try {
            int iA6 = A6(aVar, outputStream, bArrD);
            com.fasterxml.jackson.core.io.d dVar = this.K3;
            return iA6;
        } finally {
            this.K3.r(bArrD);
        }
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected void Q4() throws IOException {
        super.Q4();
        this.f102582m4.R();
    }

    @Override // com.fasterxml.jackson.core.base.b, com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public byte[] R(com.fasterxml.jackson.core.a aVar) throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_STRING && (nVar != n.VALUE_EMBEDDED_OBJECT || this.f102249a4 == null)) {
            F3("Current token (" + this.f102294g + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f102584o4) {
            try {
                this.f102249a4 = A5(aVar);
                this.f102584o4 = false;
            } catch (IllegalArgumentException e10) {
                throw f("Failed to decode VALUE_STRING as base64 (" + aVar + "): " + e10.getMessage());
            }
        } else if (this.f102249a4 == null) {
            com.fasterxml.jackson.core.util.c cVarE4 = E4();
            w3(j1(), cVarE4, aVar);
            this.f102249a4 = cVarE4.q();
        }
        return this.f102249a4;
    }

    protected final String S5(n nVar) {
        if (nVar == null) {
            return null;
        }
        int iO = nVar.o();
        if (iO != 5) {
            return (iO == 6 || iO == 7 || iO == 8) ? this.W3.l() : nVar.n();
        }
        return this.U3.b();
    }

    protected void S6() throws IOException {
        this.f102584o4 = false;
        int[] iArr = f102579t4;
        while (true) {
            int unsignedByte = this.f102586q4.readUnsignedByte();
            int i10 = iArr[unsignedByte];
            if (i10 != 0) {
                if (unsignedByte == 34) {
                    return;
                }
                if (i10 == 1) {
                    w4();
                } else if (i10 == 2) {
                    T6();
                } else if (i10 == 3) {
                    V6();
                } else if (i10 == 4) {
                    W6();
                } else if (unsignedByte < 32) {
                    f4(unsignedByte, "string value");
                } else {
                    D6(unsignedByte);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public int T1(int i10) throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_NUMBER_INT && nVar != n.VALUE_NUMBER_FLOAT) {
            return super.T1(i10);
        }
        int i11 = this.f102250b4;
        if ((i11 & 1) == 0) {
            if (i11 == 0) {
                return I4();
            }
            if ((i11 & 1) == 0) {
                X4();
            }
        }
        return this.f102251c4;
    }

    protected n W5() throws IOException {
        int i10;
        char[] cArrN = this.W3.n();
        int[] iArr = f102579t4;
        int i11 = 0;
        while (true) {
            int length = cArrN.length;
            if (i11 >= cArrN.length) {
                cArrN = this.W3.s();
                length = cArrN.length;
                i11 = 0;
            }
            do {
                int unsignedByte = this.f102586q4.readUnsignedByte();
                if (unsignedByte == 39) {
                    this.W3.I(i11);
                    return n.VALUE_STRING;
                }
                int i12 = iArr[unsignedByte];
                if (i12 != 0) {
                    if (i12 == 1) {
                        unsignedByte = w4();
                    } else if (i12 == 2) {
                        unsignedByte = K5(unsignedByte);
                    } else if (i12 == 3) {
                        unsignedByte = L5(unsignedByte);
                    } else if (i12 != 4) {
                        if (unsignedByte < 32) {
                            f4(unsignedByte, "string value");
                        }
                        D6(unsignedByte);
                    } else {
                        int iN5 = N5(unsignedByte);
                        int i13 = i11 + 1;
                        cArrN[i11] = (char) ((iN5 >> 10) | com.fasterxml.jackson.core.base.a.f102232g);
                        if (i13 >= cArrN.length) {
                            cArrN = this.W3.s();
                            i11 = 0;
                        } else {
                            i11 = i13;
                        }
                        unsignedByte = 56320 | (iN5 & 1023);
                    }
                    if (i11 >= cArrN.length) {
                        cArrN = this.W3.s();
                        i11 = 0;
                    }
                    cArrN[i11] = (char) unsignedByte;
                    i11++;
                    break;
                }
                i10 = i11 + 1;
                cArrN[i11] = (char) unsignedByte;
                i11 = i10;
            } while (i10 < length);
        }
    }

    protected n X5(int i10, boolean z10) throws IOException {
        String str;
        while (i10 == 73) {
            i10 = this.f102586q4.readUnsignedByte();
            if (i10 != 78) {
                if (i10 != 110) {
                    break;
                }
                str = z10 ? "-Infinity" : "+Infinity";
            } else {
                str = z10 ? "-INF" : "+INF";
            }
            e6(str, 3);
            if (p2(JsonParser.a.ALLOW_NON_NUMERIC_NUMBERS)) {
                return t5(str, z10 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            F3("Non-standard token '" + str + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        }
        n4(i10, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public q Y() {
        return this.f102581l4;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int Y2(OutputStream outputStream) throws IOException {
        return 0;
    }

    protected String b6(int i10) throws IOException {
        if (i10 == 39 && p2(JsonParser.a.ALLOW_SINGLE_QUOTES)) {
            return o6();
        }
        if (!p2(JsonParser.a.ALLOW_UNQUOTED_FIELD_NAMES)) {
            V3((char) F5(i10), "was expecting double-quote to start field name");
        }
        int[] iArrJ = com.fasterxml.jackson.core.io.a.j();
        if (iArrJ[i10] != 0) {
            V3(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrT5 = this.f102583n4;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        do {
            if (i11 < 4) {
                i11++;
                i10 |= i13 << 8;
            } else {
                if (i12 >= iArrT5.length) {
                    iArrT5 = T5(iArrT5, iArrT5.length);
                    this.f102583n4 = iArrT5;
                }
                iArrT5[i12] = i13;
                i12++;
                i11 = 1;
            }
            i13 = i10;
            i10 = this.f102586q4.readUnsignedByte();
        } while (iArrJ[i10] == 0);
        this.f102587r4 = i10;
        if (i11 > 0) {
            if (i12 >= iArrT5.length) {
                iArrT5 = T5(iArrT5, iArrT5.length);
                this.f102583n4 = iArrT5;
            }
            iArrT5[i12] = i13;
            i12++;
        }
        String strJ = this.f102582m4.J(iArrT5, i12);
        return strJ == null ? i7(iArrT5, i12, i11) : strJ;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        if (r5 != 44) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r4.U3.k() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (p2(com.fasterxml.jackson.core.JsonParser.a.ALLOW_MISSING_VALUES) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r4.f102587r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        return com.fasterxml.jackson.core.n.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.n c6(int r5) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.h.c6(int):com.fasterxml.jackson.core.n");
    }

    @Override // com.fasterxml.jackson.core.base.b, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.i d0() {
        return new com.fasterxml.jackson.core.i(H4(), -1L, -1L, this.P3, -1);
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public String d2() throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_STRING) {
            return nVar == n.FIELD_NAME ? f0() : super.e2(null);
        }
        if (!this.f102584o4) {
            return this.W3.l();
        }
        this.f102584o4 = false;
        return Q5();
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public String e2(String str) throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_STRING) {
            return nVar == n.FIELD_NAME ? f0() : super.e2(str);
        }
        if (!this.f102584o4) {
            return this.W3.l();
        }
        this.f102584o4 = false;
        return Q5();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void e3(q qVar) {
        this.f102581l4 = qVar;
    }

    protected final void e6(String str, int i10) throws IOException {
        int length = str.length();
        do {
            int unsignedByte = this.f102586q4.readUnsignedByte();
            if (unsignedByte != str.charAt(i10)) {
                H6(unsignedByte, str.substring(0, i10));
            }
            i10++;
        } while (i10 < length);
        int unsignedByte2 = this.f102586q4.readUnsignedByte();
        if (unsignedByte2 >= 48 && unsignedByte2 != 93 && unsignedByte2 != 125) {
            y5(str, i10, unsignedByte2);
        }
        this.f102587r4 = unsignedByte2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int h1(Writer writer) throws IOException {
        n nVar = this.f102294g;
        if (nVar == n.VALUE_STRING) {
            if (this.f102584o4) {
                this.f102584o4 = false;
                D4();
            }
            return this.W3.m(writer);
        }
        if (nVar == n.FIELD_NAME) {
            String strB = this.U3.b();
            writer.write(strB);
            return strB.length();
        }
        if (nVar == null) {
            return 0;
        }
        if (nVar.q()) {
            return this.W3.m(writer);
        }
        char[] cArrL = nVar.l();
        writer.write(cArrL);
        return cArrL.length;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public String j1() throws IOException {
        n nVar = this.f102294g;
        if (nVar != n.VALUE_STRING) {
            return S5(nVar);
        }
        if (!this.f102584o4) {
            return this.W3.l();
        }
        this.f102584o4 = false;
        return Q5();
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public char[] l1() throws IOException {
        n nVar = this.f102294g;
        if (nVar == null) {
            return null;
        }
        int iO = nVar.o();
        if (iO != 5) {
            if (iO != 6) {
                if (iO != 7 && iO != 8) {
                    return this.f102294g.l();
                }
            } else if (this.f102584o4) {
                this.f102584o4 = false;
                D4();
            }
            return this.W3.w();
        }
        if (!this.Y3) {
            String strB = this.U3.b();
            int length = strB.length();
            char[] cArr = this.X3;
            if (cArr == null) {
                this.X3 = this.K3.g(length);
            } else if (cArr.length < length) {
                this.X3 = new char[length];
            }
            strB.getChars(0, length, this.X3, 0);
            this.Y3 = true;
        }
        return this.X3;
    }

    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    public int o1() throws IOException {
        n nVar = this.f102294g;
        if (nVar == n.VALUE_STRING) {
            if (this.f102584o4) {
                this.f102584o4 = false;
                D4();
            }
            return this.W3.J();
        }
        if (nVar == n.FIELD_NAME) {
            return this.U3.b().length();
        }
        if (nVar != null) {
            return nVar.q() ? this.W3.J() : this.f102294g.l().length;
        }
        return 0;
    }

    protected String o6() throws IOException {
        int unsignedByte = this.f102586q4.readUnsignedByte();
        if (unsignedByte == 39) {
            return "";
        }
        int[] iArrT5 = this.f102583n4;
        int[] iArr = f102580u4;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (unsignedByte != 39) {
            if (unsignedByte != 34 && iArr[unsignedByte] != 0) {
                if (unsignedByte != 92) {
                    f4(unsignedByte, "name");
                } else {
                    unsignedByte = w4();
                }
                if (unsignedByte > 127) {
                    if (i10 >= 4) {
                        if (i11 >= iArrT5.length) {
                            iArrT5 = T5(iArrT5, iArrT5.length);
                            this.f102583n4 = iArrT5;
                        }
                        iArrT5[i11] = i12;
                        i12 = 0;
                        i11++;
                        i10 = 0;
                    }
                    if (unsignedByte < 2048) {
                        i12 = (i12 << 8) | (unsignedByte >> 6) | 192;
                        i10++;
                    } else {
                        int i13 = (i12 << 8) | (unsignedByte >> 12) | 224;
                        int i14 = i10 + 1;
                        if (i14 >= 4) {
                            if (i11 >= iArrT5.length) {
                                iArrT5 = T5(iArrT5, iArrT5.length);
                                this.f102583n4 = iArrT5;
                            }
                            iArrT5[i11] = i13;
                            i13 = 0;
                            i11++;
                            i14 = 0;
                        }
                        i12 = (i13 << 8) | ((unsignedByte >> 6) & 63) | 128;
                        i10 = i14 + 1;
                    }
                    unsignedByte = (unsignedByte & 63) | 128;
                }
            }
            if (i10 < 4) {
                i10++;
                unsignedByte |= i12 << 8;
            } else {
                if (i11 >= iArrT5.length) {
                    iArrT5 = T5(iArrT5, iArrT5.length);
                    this.f102583n4 = iArrT5;
                }
                iArrT5[i11] = i12;
                i11++;
                i10 = 1;
            }
            i12 = unsignedByte;
            unsignedByte = this.f102586q4.readUnsignedByte();
        }
        if (i10 > 0) {
            if (i11 >= iArrT5.length) {
                iArrT5 = T5(iArrT5, iArrT5.length);
                this.f102583n4 = iArrT5;
            }
            iArrT5[i11] = t7(i12, i10);
            i11++;
        }
        String strJ = this.f102582m4.J(iArrT5, i11);
        return strJ == null ? i7(iArrT5, i11, i10) : strJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.base.c, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int p1() throws java.io.IOException {
        /*
            r4 = this;
            com.fasterxml.jackson.core.n r0 = r4.f102294g
            r1 = 0
            if (r0 == 0) goto L29
            r3 = 2
            int r0 = r0.o()
            r2 = 6
            if (r0 == r2) goto L17
            r3 = 0
            r2 = 7
            if (r0 == r2) goto L21
            r2 = 8
            r3 = 5
            if (r0 == r2) goto L21
            goto L29
        L17:
            boolean r0 = r4.f102584o4
            if (r0 == 0) goto L21
            r3 = 3
            r4.f102584o4 = r1
            r4.D4()
        L21:
            r3 = 3
            com.fasterxml.jackson.core.util.n r4 = r4.W3
            int r4 = r4.x()
            return r4
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.h.p1():int");
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected void r4() throws IOException {
    }

    @Override // com.fasterxml.jackson.core.base.b, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.i s1() {
        return new com.fasterxml.jackson.core.i(H4(), -1L, -1L, this.S3, -1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Boolean u2() throws IOException {
        if (this.f102294g != n.FIELD_NAME) {
            n nVarE2 = E2();
            if (nVarE2 == n.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (nVarE2 == n.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            return null;
        }
        this.Y3 = false;
        n nVar = this.V3;
        this.V3 = null;
        this.f102294g = nVar;
        if (nVar == n.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (nVar == n.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        if (nVar == n.START_ARRAY) {
            this.U3 = this.U3.t(this.S3, this.T3);
        } else if (nVar == n.START_OBJECT) {
            this.U3 = this.U3.u(this.S3, this.T3);
        }
        return null;
    }

    protected final String v7(int[] iArr, int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr2 = f102580u4;
        while (true) {
            if (iArr2[i12] != 0) {
                if (i12 == 34) {
                    break;
                }
                if (i12 != 92) {
                    f4(i12, "name");
                } else {
                    i12 = w4();
                }
                if (i12 > 127) {
                    int i14 = 0;
                    if (i13 >= 4) {
                        if (i10 >= iArr.length) {
                            iArr = T5(iArr, iArr.length);
                            this.f102583n4 = iArr;
                        }
                        iArr[i10] = i11;
                        i10++;
                        i11 = 0;
                        i13 = 0;
                    }
                    if (i12 < 2048) {
                        i11 = (i11 << 8) | (i12 >> 6) | 192;
                        i13++;
                    } else {
                        int i15 = (i11 << 8) | (i12 >> 12) | 224;
                        int i16 = i13 + 1;
                        if (i16 >= 4) {
                            if (i10 >= iArr.length) {
                                iArr = T5(iArr, iArr.length);
                                this.f102583n4 = iArr;
                            }
                            iArr[i10] = i15;
                            i10++;
                            i16 = 0;
                        } else {
                            i14 = i15;
                        }
                        i11 = (i14 << 8) | ((i12 >> 6) & 63) | 128;
                        i13 = i16 + 1;
                    }
                    i12 = (i12 & 63) | 128;
                }
            }
            if (i13 < 4) {
                i13++;
                i11 = (i11 << 8) | i12;
            } else {
                if (i10 >= iArr.length) {
                    iArr = T5(iArr, iArr.length);
                    this.f102583n4 = iArr;
                }
                iArr[i10] = i11;
                i11 = i12;
                i10++;
                i13 = 1;
            }
            i12 = this.f102586q4.readUnsignedByte();
        }
        if (i13 > 0) {
            if (i10 >= iArr.length) {
                iArr = T5(iArr, iArr.length);
                this.f102583n4 = iArr;
            }
            iArr[i10] = t7(i11, i13);
            i10++;
        }
        String strJ = this.f102582m4.J(iArr, i10);
        return strJ == null ? i7(iArr, i10, i13) : strJ;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String w2() throws IOException {
        n nVarX6;
        this.f102250b4 = 0;
        n nVar = this.f102294g;
        n nVar2 = n.FIELD_NAME;
        if (nVar == nVar2) {
            g6();
            return null;
        }
        if (this.f102584o4) {
            S6();
        }
        int iX6 = X6();
        this.f102249a4 = null;
        this.S3 = this.P3;
        if (iX6 == 93 || iX6 == 125) {
            z5(iX6);
            return null;
        }
        if (this.U3.x()) {
            if (iX6 != 44) {
                V3(iX6, "was expecting comma to separate " + this.U3.q() + " entries");
            }
            iX6 = X6();
            if (JsonParser.a.ALLOW_TRAILING_COMMA.n(this.f102189a) && (iX6 == 93 || iX6 == 125)) {
                z5(iX6);
                return null;
            }
        }
        if (!this.U3.l()) {
            i6(iX6);
            return null;
        }
        String strW6 = w6(iX6);
        this.U3.B(strW6);
        this.f102294g = nVar2;
        int iM6 = M6();
        if (iM6 == 34) {
            this.f102584o4 = true;
            this.V3 = n.VALUE_STRING;
            return strW6;
        }
        if (iM6 == 45) {
            nVarX6 = x6();
        } else if (iM6 == 91) {
            nVarX6 = n.START_ARRAY;
        } else if (iM6 == 102) {
            e6("false", 1);
            nVarX6 = n.VALUE_FALSE;
        } else if (iM6 == 110) {
            e6(AbstractJsonLexerKt.NULL, 1);
            nVarX6 = n.VALUE_NULL;
        } else if (iM6 == 116) {
            e6(z0.P, 1);
            nVarX6 = n.VALUE_TRUE;
        } else if (iM6 != 123) {
            switch (iM6) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    nVarX6 = y6(iM6);
                    break;
                default:
                    nVarX6 = c6(iM6);
                    break;
            }
        } else {
            nVarX6 = n.START_OBJECT;
        }
        this.V3 = nVarX6;
        return strW6;
    }

    @Override // com.fasterxml.jackson.core.base.b
    protected char w4() throws IOException {
        int unsignedByte = this.f102586q4.readUnsignedByte();
        if (unsignedByte == 34 || unsignedByte == 47 || unsignedByte == 92) {
            return (char) unsignedByte;
        }
        if (unsignedByte == 98) {
            return '\b';
        }
        if (unsignedByte == 102) {
            return '\f';
        }
        if (unsignedByte == 110) {
            return '\n';
        }
        if (unsignedByte == 114) {
            return org.apache.commons.lang3.k.f337188d;
        }
        if (unsignedByte == 116) {
            return '\t';
        }
        if (unsignedByte != 117) {
            return C3((char) F5(unsignedByte));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int unsignedByte2 = this.f102586q4.readUnsignedByte();
            int iB = com.fasterxml.jackson.core.io.a.b(unsignedByte2);
            if (iB < 0) {
                V3(unsignedByte2, "expected a hex-digit for character escape sequence");
            }
            i10 = (i10 << 4) | iB;
        }
        return (char) i10;
    }

    protected final String w6(int i10) throws IOException {
        if (i10 != 34) {
            return b6(i10);
        }
        int[] iArr = f102580u4;
        int unsignedByte = this.f102586q4.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            return unsignedByte == 34 ? "" : w7(0, unsignedByte, 0);
        }
        int unsignedByte2 = this.f102586q4.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            return unsignedByte2 == 34 ? l7(unsignedByte, 1) : w7(unsignedByte, unsignedByte2, 1);
        }
        int i11 = (unsignedByte << 8) | unsignedByte2;
        int unsignedByte3 = this.f102586q4.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            return unsignedByte3 == 34 ? l7(i11, 2) : w7(i11, unsignedByte3, 2);
        }
        int i12 = (i11 << 8) | unsignedByte3;
        int unsignedByte4 = this.f102586q4.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            return unsignedByte4 == 34 ? l7(i12, 3) : w7(i12, unsignedByte4, 3);
        }
        int i13 = (i12 << 8) | unsignedByte4;
        int unsignedByte5 = this.f102586q4.readUnsignedByte();
        if (iArr[unsignedByte5] != 0) {
            return unsignedByte5 == 34 ? l7(i13, 4) : w7(i13, unsignedByte5, 4);
        }
        this.f102585p4 = i13;
        return s6(unsignedByte5);
    }

    protected n x6() throws IOException {
        int unsignedByte;
        char[] cArrN = this.W3.n();
        cArrN[0] = l.f335457d;
        int unsignedByte2 = this.f102586q4.readUnsignedByte();
        cArrN[1] = (char) unsignedByte2;
        if (unsignedByte2 <= 48) {
            if (unsignedByte2 != 48) {
                return X5(unsignedByte2, true);
            }
            unsignedByte = Z5();
        } else {
            if (unsignedByte2 > 57) {
                return X5(unsignedByte2, true);
            }
            unsignedByte = this.f102586q4.readUnsignedByte();
        }
        int i10 = 2;
        int i11 = 1;
        while (unsignedByte <= 57 && unsignedByte >= 48) {
            i11++;
            cArrN[i10] = (char) unsignedByte;
            unsignedByte = this.f102586q4.readUnsignedByte();
            i10++;
        }
        if (unsignedByte == 46 || unsignedByte == 101 || unsignedByte == 69) {
            return q6(cArrN, i10, unsignedByte, true, i11);
        }
        this.W3.I(i10);
        this.f102587r4 = unsignedByte;
        if (this.U3.m()) {
            d7();
        }
        return x5(true, i11);
    }

    protected n y6(int i10) throws IOException {
        int unsignedByte;
        char[] cArrN = this.W3.n();
        int i11 = 1;
        if (i10 == 48) {
            unsignedByte = Z5();
            if (unsignedByte > 57 || unsignedByte < 48) {
                cArrN[0] = org.locationtech.jts.geom.l.f338160j;
            } else {
                i11 = 0;
            }
        } else {
            cArrN[0] = (char) i10;
            unsignedByte = this.f102586q4.readUnsignedByte();
        }
        int i12 = i11;
        while (unsignedByte <= 57 && unsignedByte >= 48) {
            i12++;
            cArrN[i11] = (char) unsignedByte;
            unsignedByte = this.f102586q4.readUnsignedByte();
            i11++;
        }
        if (unsignedByte == 46 || unsignedByte == 101 || unsignedByte == 69) {
            return q6(cArrN, i11, unsignedByte, false, i12);
        }
        this.W3.I(i11);
        if (this.U3.m()) {
            d7();
        } else {
            this.f102587r4 = unsignedByte;
        }
        return x5(false, i12);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int z2(int i10) throws IOException {
        if (this.f102294g == n.FIELD_NAME) {
            this.Y3 = false;
            n nVar = this.V3;
            this.V3 = null;
            this.f102294g = nVar;
            if (nVar == n.VALUE_NUMBER_INT) {
                return M0();
            }
            if (nVar == n.START_ARRAY) {
                this.U3 = this.U3.t(this.S3, this.T3);
                return i10;
            }
            if (nVar == n.START_OBJECT) {
                this.U3 = this.U3.u(this.S3, this.T3);
                return i10;
            }
        } else if (E2() == n.VALUE_NUMBER_INT) {
            return M0();
        }
        return i10;
    }
}
