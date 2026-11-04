package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.n;
import com.fasterxml.jackson.core.q;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte f102487i = -17;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte f102488j = -69;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte f102489k = -65;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.fasterxml.jackson.core.io.d f102490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f102491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f102492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f102493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f102494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f102495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f102496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f102497h;

    public a(com.fasterxml.jackson.core.io.d dVar, InputStream inputStream) {
        this.f102496g = true;
        this.f102490a = dVar;
        this.f102491b = inputStream;
        this.f102492c = dVar.h();
        this.f102493d = 0;
        this.f102494e = 0;
        this.f102495f = true;
    }

    private boolean a(int i10) {
        if ((65280 & i10) == 0) {
            this.f102496g = true;
        } else {
            if ((i10 & 255) != 0) {
                return false;
            }
            this.f102496g = false;
        }
        this.f102497h = 2;
        return true;
    }

    private boolean b(int i10) throws IOException {
        if ((i10 >> 8) == 0) {
            this.f102496g = true;
        } else if ((16777215 & i10) == 0) {
            this.f102496g = false;
        } else if (((-16711681) & i10) == 0) {
            i("3412");
        } else {
            if ((i10 & (-65281)) != 0) {
                return false;
            }
            i("2143");
        }
        this.f102497h = 4;
        return true;
    }

    private boolean g(int i10) throws IOException {
        int i11 = 2 ^ 0;
        if (i10 == -16842752) {
            i("3412");
        } else {
            if (i10 == -131072) {
                this.f102493d += 4;
                this.f102497h = 4;
                this.f102496g = false;
                return true;
            }
            if (i10 == 65279) {
                this.f102496g = true;
                this.f102493d += 4;
                this.f102497h = 4;
                return true;
            }
            if (i10 == 65534) {
                i("2143");
            }
        }
        int i12 = i10 >>> 16;
        if (i12 == 65279) {
            this.f102493d += 2;
            this.f102497h = 2;
            this.f102496g = true;
            return true;
        }
        if (i12 == 65534) {
            this.f102493d += 2;
            this.f102497h = 2;
            this.f102496g = false;
            return true;
        }
        if ((i10 >>> 8) != 15711167) {
            return false;
        }
        this.f102493d += 3;
        this.f102497h = 1;
        this.f102496g = true;
        return true;
    }

    public static com.fasterxml.jackson.core.format.d h(com.fasterxml.jackson.core.format.c cVar) throws IOException {
        if (!cVar.a()) {
            return com.fasterxml.jackson.core.format.d.INCONCLUSIVE;
        }
        byte bNextByte = cVar.nextByte();
        if (bNextByte == -17) {
            if (!cVar.a()) {
                return com.fasterxml.jackson.core.format.d.INCONCLUSIVE;
            }
            if (cVar.nextByte() != -69) {
                return com.fasterxml.jackson.core.format.d.NO_MATCH;
            }
            if (!cVar.a()) {
                return com.fasterxml.jackson.core.format.d.INCONCLUSIVE;
            }
            if (cVar.nextByte() != -65) {
                return com.fasterxml.jackson.core.format.d.NO_MATCH;
            }
            if (!cVar.a()) {
                return com.fasterxml.jackson.core.format.d.INCONCLUSIVE;
            }
            bNextByte = cVar.nextByte();
        }
        int iK = k(cVar, bNextByte);
        if (iK < 0) {
            return com.fasterxml.jackson.core.format.d.INCONCLUSIVE;
        }
        if (iK == 123) {
            int iJ = j(cVar);
            if (iJ < 0) {
                return com.fasterxml.jackson.core.format.d.INCONCLUSIVE;
            }
            if (iJ != 34 && iJ != 125) {
                return com.fasterxml.jackson.core.format.d.NO_MATCH;
            }
            return com.fasterxml.jackson.core.format.d.SOLID_MATCH;
        }
        if (iK == 91) {
            int iJ2 = j(cVar);
            if (iJ2 < 0) {
                return com.fasterxml.jackson.core.format.d.INCONCLUSIVE;
            }
            if (iJ2 != 93 && iJ2 != 91) {
                return com.fasterxml.jackson.core.format.d.SOLID_MATCH;
            }
            return com.fasterxml.jackson.core.format.d.SOLID_MATCH;
        }
        com.fasterxml.jackson.core.format.d dVar = com.fasterxml.jackson.core.format.d.WEAK_MATCH;
        if (iK != 34 && (iK > 57 || iK < 48)) {
            if (iK != 45) {
                if (iK == 110) {
                    return m(cVar, "ull", dVar);
                }
                if (iK == 116) {
                    return m(cVar, "rue", dVar);
                }
                return iK == 102 ? m(cVar, "alse", dVar) : com.fasterxml.jackson.core.format.d.NO_MATCH;
            }
            int iJ3 = j(cVar);
            if (iJ3 < 0) {
                return com.fasterxml.jackson.core.format.d.INCONCLUSIVE;
            }
            if (iJ3 > 57 || iJ3 < 48) {
                return com.fasterxml.jackson.core.format.d.NO_MATCH;
            }
        }
        return dVar;
    }

    private void i(String str) throws IOException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    private static int j(com.fasterxml.jackson.core.format.c cVar) throws IOException {
        if (cVar.a()) {
            return k(cVar, cVar.nextByte());
        }
        return -1;
    }

    private static int k(com.fasterxml.jackson.core.format.c cVar, byte b10) throws IOException {
        while (true) {
            int i10 = b10 & 255;
            if (i10 != 32 && i10 != 13 && i10 != 10 && i10 != 9) {
                return i10;
            }
            if (!cVar.a()) {
                return -1;
            }
            b10 = cVar.nextByte();
        }
    }

    public static int l(DataInput dataInput) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte != 239) {
            return unsignedByte;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        if (unsignedByte2 != 187) {
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        if (unsignedByte3 == 191) {
            return dataInput.readUnsignedByte();
        }
        throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
    }

    private static com.fasterxml.jackson.core.format.d m(com.fasterxml.jackson.core.format.c cVar, String str, com.fasterxml.jackson.core.format.d dVar) throws IOException {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!cVar.a()) {
                return com.fasterxml.jackson.core.format.d.INCONCLUSIVE;
            }
            if (cVar.nextByte() != str.charAt(i10)) {
                return com.fasterxml.jackson.core.format.d.NO_MATCH;
            }
        }
        return dVar;
    }

    public JsonParser c(int i10, q qVar, com.fasterxml.jackson.core.sym.a aVar, com.fasterxml.jackson.core.sym.b bVar, int i11) throws IOException {
        if (e() != com.fasterxml.jackson.core.e.UTF8 || !com.fasterxml.jackson.core.f.a.CANONICALIZE_FIELD_NAMES.n(i11)) {
            return new g(this.f102490a, i10, d(), qVar, bVar.s(i11));
        }
        return new j(this.f102490a, i10, this.f102491b, qVar, aVar.L(i11), this.f102492c, this.f102493d, this.f102494e, this.f102495f);
    }

    public Reader d() throws IOException {
        com.fasterxml.jackson.core.e eVarO = this.f102490a.o();
        int iK = eVarO.k();
        if (iK != 8 && iK != 16) {
            if (iK != 32) {
                throw new RuntimeException("Internal error");
            }
            com.fasterxml.jackson.core.io.d dVar = this.f102490a;
            return new n(dVar, this.f102491b, this.f102492c, this.f102493d, this.f102494e, dVar.o().n());
        }
        InputStream hVar = this.f102491b;
        if (hVar == null) {
            hVar = new ByteArrayInputStream(this.f102492c, this.f102493d, this.f102494e);
        } else if (this.f102493d < this.f102494e) {
            hVar = new com.fasterxml.jackson.core.io.h(this.f102490a, hVar, this.f102492c, this.f102493d, this.f102494e);
        }
        return new InputStreamReader(hVar, eVarO.l());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    public com.fasterxml.jackson.core.e e() throws IOException {
        int i10;
        com.fasterxml.jackson.core.e eVar;
        if (f(4)) {
            byte[] bArr = this.f102492c;
            int i11 = this.f102493d;
            int i12 = (bArr[i11 + 3] & 255) | (bArr[i11] << com.google.common.base.c.B) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
            if (g(i12) || b(i12) || a(i12 >>> 16)) {
                i10 = this.f102497h;
                if (i10 != 1) {
                    eVar = com.fasterxml.jackson.core.e.UTF8;
                } else if (i10 != 2) {
                    if (i10 == 4) {
                        throw new RuntimeException("Internal error");
                    }
                    if (this.f102496g) {
                        eVar = com.fasterxml.jackson.core.e.UTF32_BE;
                    } else {
                        eVar = com.fasterxml.jackson.core.e.UTF32_LE;
                    }
                } else if (this.f102496g) {
                    eVar = com.fasterxml.jackson.core.e.UTF16_BE;
                } else {
                    eVar = com.fasterxml.jackson.core.e.UTF16_LE;
                }
            } else {
                eVar = com.fasterxml.jackson.core.e.UTF8;
            }
        } else {
            if (f(2)) {
                byte[] bArr2 = this.f102492c;
                int i13 = this.f102493d;
                if (a((bArr2[i13 + 1] & 255) | ((bArr2[i13] & 255) << 8))) {
                    i10 = this.f102497h;
                    if (i10 != 1) {
                        eVar = com.fasterxml.jackson.core.e.UTF8;
                    } else if (i10 != 2) {
                        if (i10 == 4) {
                            throw new RuntimeException("Internal error");
                        }
                        if (this.f102496g) {
                            eVar = com.fasterxml.jackson.core.e.UTF32_BE;
                        } else {
                            eVar = com.fasterxml.jackson.core.e.UTF32_LE;
                        }
                    } else if (this.f102496g) {
                        eVar = com.fasterxml.jackson.core.e.UTF16_BE;
                    } else {
                        eVar = com.fasterxml.jackson.core.e.UTF16_LE;
                    }
                }
            }
            eVar = com.fasterxml.jackson.core.e.UTF8;
        }
        this.f102490a.x(eVar);
        return eVar;
    }

    protected boolean f(int i10) throws IOException {
        int i11;
        int i12 = this.f102494e - this.f102493d;
        while (i12 < i10) {
            InputStream inputStream = this.f102491b;
            if (inputStream == null) {
                i11 = -1;
            } else {
                byte[] bArr = this.f102492c;
                int i13 = this.f102494e;
                i11 = inputStream.read(bArr, i13, bArr.length - i13);
            }
            if (i11 < 1) {
                return false;
            }
            this.f102494e += i11;
            i12 += i11;
        }
        return true;
    }

    public a(com.fasterxml.jackson.core.io.d dVar, byte[] bArr, int i10, int i11) {
        this.f102496g = true;
        this.f102490a = dVar;
        this.f102491b = null;
        this.f102492c = bArr;
        this.f102493d = i10;
        this.f102494e = i10 + i11;
        this.f102495f = false;
    }
}
