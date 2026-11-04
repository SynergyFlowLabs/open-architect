package com.badlogic.gdx.utils;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.e2;

/* JADX INFO: loaded from: classes3.dex */
public class j1 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f95606a = true;

    @Override // com.badlogic.gdx.utils.f
    public c0 a(InputStream inputStream) throws Throwable {
        DataInputStream dataInputStream = null;
        try {
            try {
                DataInputStream dataInputStream2 = new DataInputStream(inputStream);
                try {
                    c0 c0VarC = c(dataInputStream2);
                    e1.a(dataInputStream2);
                    return c0VarC;
                } catch (IOException e10) {
                    e = e10;
                    throw new y0(e);
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    e1.a(dataInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    @Override // com.badlogic.gdx.utils.f
    public c0 b(com.badlogic.gdx.files.a aVar) {
        try {
            return a(aVar.C(8192));
        } catch (Exception e10) {
            throw new y0("Error parsing file: " + aVar, e10);
        }
    }

    public c0 c(DataInputStream dataInputStream) throws IOException {
        try {
            c0 c0VarD = d(dataInputStream, dataInputStream.readByte());
            e1.a(dataInputStream);
            return c0VarD;
        } catch (Throwable th2) {
            e1.a(dataInputStream);
            throw th2;
        }
    }

    protected c0 d(DataInputStream dataInputStream, byte b10) throws IOException {
        if (b10 == 91) {
            return e(dataInputStream);
        }
        if (b10 == 123) {
            return g(dataInputStream);
        }
        if (b10 == 90) {
            return new c0(c0.d.nullValue);
        }
        if (b10 == 84) {
            return new c0(true);
        }
        if (b10 == 70) {
            return new c0(false);
        }
        if (b10 != 66 && b10 != 85) {
            if (b10 == 105) {
                return new c0(this.f95606a ? dataInputStream.readShort() : dataInputStream.readByte());
            }
            if (b10 == 73) {
                return new c0(this.f95606a ? dataInputStream.readInt() : dataInputStream.readShort());
            }
            if (b10 == 108) {
                return new c0(dataInputStream.readInt());
            }
            if (b10 == 76) {
                return new c0(dataInputStream.readLong());
            }
            if (b10 == 100) {
                return new c0(dataInputStream.readFloat());
            }
            if (b10 == 68) {
                return new c0(dataInputStream.readDouble());
            }
            if (b10 == 115 || b10 == 83) {
                return new c0(j(dataInputStream, b10));
            }
            if (b10 != 97 && b10 != 65) {
                throw new t("Unrecognized data type");
            }
            return f(dataInputStream, b10);
        }
        return new c0(m(dataInputStream));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:19:0x005b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    protected com.badlogic.gdx.utils.c0 e(java.io.DataInputStream r14) throws java.io.IOException {
        /*
            r13 = this;
            r12 = 7
            com.badlogic.gdx.utils.c0 r0 = new com.badlogic.gdx.utils.c0
            com.badlogic.gdx.utils.c0$d r1 = com.badlogic.gdx.utils.c0.d.array
            r0.<init>(r1)
            byte r1 = r14.readByte()
            r12 = 5
            r2 = 36
            r12 = 7
            r3 = 0
            if (r1 != r2) goto L23
            byte r1 = r14.readByte()
            r12 = 7
            byte r2 = r14.readByte()
            r12 = 1
            r11 = r2
            r11 = r2
            r2 = r1
            r12 = 1
            r1 = r11
            goto L26
        L23:
            r12 = 3
            r2 = r3
            r2 = r3
        L26:
            r4 = 35
            r5 = -1
            r5 = -1
            r12 = 7
            r7 = 0
            r7 = 0
            r12 = 5
            if (r1 != r4) goto L53
            long r5 = r13.i(r14, r3, r5)
            r12 = 2
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L4a
            if (r1 != 0) goto L40
            goto L99
        L40:
            if (r2 != 0) goto L48
            byte r1 = r14.readByte()
            r12 = 1
            goto L53
        L48:
            r1 = r2
            goto L53
        L4a:
            com.badlogic.gdx.utils.t r13 = new com.badlogic.gdx.utils.t
            r12 = 5
            java.lang.String r14 = "Unrecognized data type"
            r13.<init>(r14)
            throw r13
        L53:
            r12 = 1
            r3 = 0
            r9 = r7
        L56:
            r12 = 7
            int r4 = r14.available()
            if (r4 <= 0) goto L99
            r12 = 7
            r4 = 93
            if (r1 == r4) goto L99
            r12 = 3
            com.badlogic.gdx.utils.c0 r1 = r13.d(r14, r1)
            r12 = 1
            r4 = 1
            if (r3 == 0) goto L78
            r1.f95236h = r3
            r3.f95235g = r1
            r12 = 7
            int r3 = r0.f95237i
            r12 = 1
            int r3 = r3 + r4
            r0.f95237i = r3
            r12 = 7
            goto L7d
        L78:
            r0.f95234f = r1
            r12 = 2
            r0.f95237i = r4
        L7d:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L8c
            r3 = 1
            r3 = 1
            long r9 = r9 + r3
            r12 = 3
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 < 0) goto L8c
            goto L99
        L8c:
            if (r2 != 0) goto L94
            byte r3 = r14.readByte()
            r12 = 6
            goto L95
        L94:
            r3 = r2
        L95:
            r11 = r3
            r3 = r1
            r1 = r11
            goto L56
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.j1.e(java.io.DataInputStream):com.badlogic.gdx.utils.c0");
    }

    protected c0 f(DataInputStream dataInputStream, byte b10) throws IOException {
        byte b11 = dataInputStream.readByte();
        long jN = b10 == 65 ? n(dataInputStream) : m(dataInputStream);
        c0 c0Var = new c0(c0.d.array);
        c0 c0Var2 = null;
        long j10 = 0;
        while (j10 < jN) {
            c0 c0VarD = d(dataInputStream, b11);
            if (c0Var2 != null) {
                c0Var2.f95235g = c0VarD;
                c0Var.f95237i++;
            } else {
                c0Var.f95234f = c0VarD;
                c0Var.f95237i = 1;
            }
            j10++;
            c0Var2 = c0VarD;
        }
        return c0Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:17:0x004b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    protected com.badlogic.gdx.utils.c0 g(java.io.DataInputStream r15) throws java.io.IOException {
        /*
            r14 = this;
            com.badlogic.gdx.utils.c0 r0 = new com.badlogic.gdx.utils.c0
            r13 = 1
            com.badlogic.gdx.utils.c0$d r1 = com.badlogic.gdx.utils.c0.d.object
            r0.<init>(r1)
            byte r1 = r15.readByte()
            r2 = 36
            r13 = 2
            r3 = 0
            if (r1 != r2) goto L20
            byte r1 = r15.readByte()
            byte r2 = r15.readByte()
            r12 = r2
            r12 = r2
            r2 = r1
            r2 = r1
            r1 = r12
            goto L21
        L20:
            r2 = r3
        L21:
            r4 = 35
            r5 = -1
            r7 = 0
            r7 = 0
            if (r1 != r4) goto L45
            long r5 = r14.i(r15, r3, r5)
            r13 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L3d
            if (r1 != 0) goto L37
            goto L8c
        L37:
            byte r1 = r15.readByte()
            r13 = 7
            goto L45
        L3d:
            com.badlogic.gdx.utils.t r14 = new com.badlogic.gdx.utils.t
            java.lang.String r15 = "Unrecognized data type"
            r14.<init>(r15)
            throw r14
        L45:
            r3 = 0
            r9 = r7
        L47:
            int r4 = r15.available()
            if (r4 <= 0) goto L8c
            r4 = 125(0x7d, float:1.75E-43)
            if (r1 == r4) goto L8c
            r4 = 1
            java.lang.String r1 = r14.k(r15, r4, r1)
            if (r2 != 0) goto L5d
            byte r11 = r15.readByte()
            goto L5e
        L5d:
            r11 = r2
        L5e:
            com.badlogic.gdx.utils.c0 r11 = r14.d(r15, r11)
            r11.d1(r1)
            if (r3 == 0) goto L73
            r11.f95236h = r3
            r3.f95235g = r11
            r13 = 4
            int r1 = r0.f95237i
            int r1 = r1 + r4
            r0.f95237i = r1
            r13 = 4
            goto L78
        L73:
            r0.f95234f = r11
            r13 = 0
            r0.f95237i = r4
        L78:
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L84
            r3 = 1
            long r9 = r9 + r3
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L84
            goto L8c
        L84:
            r13 = 0
            byte r1 = r15.readByte()
            r3 = r11
            r13 = 2
            goto L47
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.j1.g(java.io.DataInputStream):com.badlogic.gdx.utils.c0");
    }

    protected long h(DataInputStream dataInputStream, byte b10, boolean z10, long j10) throws IOException {
        if (b10 == 105) {
            return m(dataInputStream);
        }
        if (b10 == 73) {
            return o(dataInputStream);
        }
        if (b10 == 108) {
            return n(dataInputStream);
        }
        if (b10 == 76) {
            return dataInputStream.readLong();
        }
        if (!z10) {
            return j10;
        }
        return ((long) (dataInputStream.readByte() & 255)) | (((long) (b10 & 255)) << 24) | (((long) (dataInputStream.readByte() & 255)) << 16) | (((long) (dataInputStream.readByte() & 255)) << 8);
    }

    protected long i(DataInputStream dataInputStream, boolean z10, long j10) throws IOException {
        return h(dataInputStream, dataInputStream.readByte(), z10, j10);
    }

    protected String j(DataInputStream dataInputStream, byte b10) throws IOException {
        return k(dataInputStream, false, b10);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    protected String k(DataInputStream dataInputStream, boolean z10, byte b10) throws IOException {
        j1 j1Var;
        DataInputStream dataInputStream2;
        long jH = -1;
        if (b10 == 83) {
            jH = i(dataInputStream, true, -1L);
        } else {
            if (b10 != 115) {
                if (z10) {
                    j1Var = this;
                    dataInputStream2 = dataInputStream;
                    jH = j1Var.h(dataInputStream2, b10, false, -1L);
                }
                if (jH >= 0) {
                    return jH > 0 ? j1Var.l(dataInputStream2, jH) : "";
                }
                throw new t("Unrecognized data type, string expected");
            }
            jH = m(dataInputStream);
        }
        j1Var = this;
        dataInputStream2 = dataInputStream;
        if (jH >= 0) {
            if (jH > 0) {
            }
        }
        throw new t("Unrecognized data type, string expected");
    }

    protected String l(DataInputStream dataInputStream, long j10) throws IOException {
        byte[] bArr = new byte[(int) j10];
        dataInputStream.readFully(bArr);
        return new String(bArr, "UTF-8");
    }

    protected short m(DataInputStream dataInputStream) throws IOException {
        return (short) (dataInputStream.readByte() & 255);
    }

    protected long n(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readInt();
    }

    protected int o(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readShort() & e2.f312492d;
    }
}
