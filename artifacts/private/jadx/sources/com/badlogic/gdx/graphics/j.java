package com.badlogic.gdx.graphics;

import com.badlogic.gdx.utils.e1;
import com.badlogic.gdx.utils.t;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f94782a = 32000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final byte[] f94783b = new byte[32000];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final byte[] f94784c = new byte[32000];

        private a() {
        }

        /* JADX WARN: Not initialized variable reg: 1, insn: 0x0065: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:16:0x0065 */
        public static i a(com.badlogic.gdx.files.a aVar) throws Throwable {
            Exception e10;
            Closeable closeable;
            Closeable closeable2 = null;
            try {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new InflaterInputStream(new BufferedInputStream(aVar.D())));
                    try {
                        i iVar = new i(dataInputStream.readInt(), dataInputStream.readInt(), i.c.l(dataInputStream.readInt()));
                        ByteBuffer byteBufferU = iVar.u();
                        byteBufferU.position(0);
                        byteBufferU.limit(byteBufferU.capacity());
                        synchronized (f94784c) {
                            while (true) {
                                try {
                                    byte[] bArr = f94784c;
                                    int i10 = dataInputStream.read(bArr);
                                    if (i10 > 0) {
                                        byteBufferU.put(bArr, 0, i10);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        byteBufferU.position(0);
                        byteBufferU.limit(byteBufferU.capacity());
                        e1.a(dataInputStream);
                        return iVar;
                    } catch (Exception e11) {
                        e10 = e11;
                        throw new t("Couldn't read Pixmap from file '" + aVar + "'", e10);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    closeable2 = closeable;
                    e1.a(closeable2);
                    throw th;
                }
            } catch (Exception e12) {
                e10 = e12;
            } catch (Throwable th4) {
                th = th4;
                e1.a(closeable2);
                throw th;
            }
        }

        public static void b(com.badlogic.gdx.files.a aVar, i iVar) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                try {
                    DataOutputStream dataOutputStream2 = new DataOutputStream(new DeflaterOutputStream(aVar.N(false)));
                    try {
                        dataOutputStream2.writeInt(iVar.v());
                        dataOutputStream2.writeInt(iVar.s());
                        dataOutputStream2.writeInt(i.c.n(iVar.o()));
                        ByteBuffer byteBufferU = iVar.u();
                        byteBufferU.position(0);
                        byteBufferU.limit(byteBufferU.capacity());
                        int iCapacity = byteBufferU.capacity() % 32000;
                        int iCapacity2 = byteBufferU.capacity() / 32000;
                        synchronized (f94783b) {
                            for (int i10 = 0; i10 < iCapacity2; i10++) {
                                try {
                                    byte[] bArr = f94783b;
                                    byteBufferU.get(bArr);
                                    dataOutputStream2.write(bArr);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            byte[] bArr2 = f94783b;
                            byteBufferU.get(bArr2, 0, iCapacity);
                            dataOutputStream2.write(bArr2, 0, iCapacity);
                        }
                        byteBufferU.position(0);
                        byteBufferU.limit(byteBufferU.capacity());
                        e1.a(dataOutputStream2);
                    } catch (Exception e10) {
                        e = e10;
                        dataOutputStream = dataOutputStream2;
                        throw new t("Couldn't write Pixmap to file '" + aVar + "'", e);
                    } catch (Throwable th3) {
                        th = th3;
                        dataOutputStream = dataOutputStream2;
                        e1.a(dataOutputStream);
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static class b implements gc.e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final byte[] f94785i = {-119, 80, 78, 71, com.google.common.base.c.f116462o, 10, com.google.common.base.c.D, 10};

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f94786j = 1229472850;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f94787k = 1229209940;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f94788l = 1229278788;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final byte f94789m = 6;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final byte f94790n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final byte f94791o = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final byte f94792s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final byte f94793t = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f94794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final DeflaterOutputStream f94795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Deflater f94796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.badlogic.gdx.utils.j f94797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.badlogic.gdx.utils.j f94798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.badlogic.gdx.utils.j f94799f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f94800g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f94801h;

        static class a extends DataOutputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ByteArrayOutputStream f94802a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final CRC32 f94803b;

            a(int i10) {
                this(new ByteArrayOutputStream(i10), new CRC32());
            }

            public void a(DataOutputStream dataOutputStream) throws IOException {
                flush();
                dataOutputStream.writeInt(this.f94802a.size() - 4);
                this.f94802a.writeTo(dataOutputStream);
                dataOutputStream.writeInt((int) this.f94803b.getValue());
                this.f94802a.reset();
                this.f94803b.reset();
            }

            private a(ByteArrayOutputStream byteArrayOutputStream, CRC32 crc32) {
                super(new CheckedOutputStream(byteArrayOutputStream, crc32));
                this.f94802a = byteArrayOutputStream;
                this.f94803b = crc32;
            }
        }

        public b() {
            this(16384);
        }

        public void a(int i10) {
            this.f94796c.setLevel(i10);
        }

        public void b(boolean z10) {
            this.f94800g = z10;
        }

        @Override // gc.e
        public void dispose() {
            this.f94796c.end();
        }

        public void e(com.badlogic.gdx.files.a aVar, i iVar) throws IOException {
            OutputStream outputStreamN = aVar.N(false);
            try {
                f(outputStreamN, iVar);
            } finally {
                e1.a(outputStreamN);
            }
        }

        public void f(OutputStream outputStream, i iVar) throws IOException {
            byte[] bArrH;
            byte[] bArrH2;
            byte[] bArrH3;
            int i10;
            int i11;
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.write(f94785i);
            this.f94794a.writeInt(f94786j);
            this.f94794a.writeInt(iVar.v());
            this.f94794a.writeInt(iVar.s());
            this.f94794a.writeByte(8);
            this.f94794a.writeByte(6);
            int i12 = 0;
            this.f94794a.writeByte(0);
            this.f94794a.writeByte(0);
            this.f94794a.writeByte(0);
            this.f94794a.a(dataOutputStream);
            this.f94794a.writeInt(f94787k);
            this.f94796c.reset();
            int i13 = 4;
            int iV = iVar.v() * 4;
            com.badlogic.gdx.utils.j jVar = this.f94797d;
            if (jVar == null) {
                com.badlogic.gdx.utils.j jVar2 = new com.badlogic.gdx.utils.j(iV);
                this.f94797d = jVar2;
                bArrH = jVar2.f95576a;
                com.badlogic.gdx.utils.j jVar3 = new com.badlogic.gdx.utils.j(iV);
                this.f94798e = jVar3;
                bArrH2 = jVar3.f95576a;
                com.badlogic.gdx.utils.j jVar4 = new com.badlogic.gdx.utils.j(iV);
                this.f94799f = jVar4;
                bArrH3 = jVar4.f95576a;
            } else {
                bArrH = jVar.h(iV);
                bArrH2 = this.f94798e.h(iV);
                bArrH3 = this.f94799f.h(iV);
                int i14 = this.f94801h;
                for (int i15 = 0; i15 < i14; i15++) {
                    bArrH3[i15] = 0;
                }
            }
            this.f94801h = iV;
            ByteBuffer byteBufferU = iVar.u();
            int iPosition = byteBufferU.position();
            int i16 = 1;
            boolean z10 = iVar.o() == i.c.RGBA8888;
            int iS = iVar.s();
            int i17 = 0;
            while (i17 < iS) {
                int i18 = this.f94800g ? (iS - i17) - i16 : i17;
                if (z10) {
                    byteBufferU.position(i18 * iV);
                    byteBufferU.get(bArrH2, i12, iV);
                    i10 = i12;
                    i11 = i13;
                } else {
                    int i19 = i12;
                    i10 = i19;
                    int i20 = i10;
                    while (i20 < iVar.v()) {
                        int i21 = i13;
                        int iT = iVar.t(i20, i18);
                        bArrH2[i19] = (byte) ((iT >> 24) & 255);
                        bArrH2[i19 + 1] = (byte) ((iT >> 16) & 255);
                        int i22 = i19 + 3;
                        bArrH2[i19 + 2] = (byte) ((iT >> 8) & 255);
                        i19 += 4;
                        bArrH2[i22] = (byte) (iT & 255);
                        i20++;
                        i13 = i21;
                    }
                    i11 = i13;
                }
                bArrH[i10] = (byte) (bArrH2[i10] - bArrH3[i10]);
                bArrH[i16] = (byte) (bArrH2[i16] - bArrH3[i16]);
                bArrH[2] = (byte) (bArrH2[2] - bArrH3[2]);
                bArrH[3] = (byte) (bArrH2[3] - bArrH3[3]);
                int i23 = i11;
                while (i23 < iV) {
                    int i24 = i23 - 4;
                    int i25 = bArrH2[i24] & 255;
                    int i26 = bArrH3[i23] & 255;
                    int i27 = bArrH3[i24] & 255;
                    int i28 = (i25 + i26) - i27;
                    int i29 = i23;
                    int i30 = i28 - i25;
                    if (i30 < 0) {
                        i30 = -i30;
                    }
                    int i31 = i28 - i26;
                    if (i31 < 0) {
                        i31 = -i31;
                    }
                    int i32 = i28 - i27;
                    if (i32 < 0) {
                        i32 = -i32;
                    }
                    if (i30 > i31 || i30 > i32) {
                        i25 = i31 <= i32 ? i26 : i27;
                    }
                    bArrH[i29] = (byte) (bArrH2[i29] - i25);
                    i23 = i29 + 1;
                }
                int i33 = i11;
                this.f94795b.write(i33);
                int i34 = i10;
                this.f94795b.write(bArrH, i34, iV);
                i17++;
                i13 = i33;
                i12 = i34;
                byte[] bArr = bArrH3;
                bArrH3 = bArrH2;
                bArrH2 = bArr;
                i16 = i16;
            }
            byteBufferU.position(iPosition);
            this.f94795b.finish();
            this.f94794a.a(dataOutputStream);
            this.f94794a.writeInt(f94788l);
            this.f94794a.a(dataOutputStream);
            outputStream.flush();
        }

        public b(int i10) {
            this.f94800g = true;
            a aVar = new a(i10);
            this.f94794a = aVar;
            Deflater deflater = new Deflater();
            this.f94796c = deflater;
            this.f94795b = new DeflaterOutputStream(aVar, deflater);
        }
    }

    public static i a(com.badlogic.gdx.files.a aVar) {
        return a.a(aVar);
    }

    public static void b(com.badlogic.gdx.files.a aVar, i iVar) throws Throwable {
        a.b(aVar, iVar);
    }

    public static void c(com.badlogic.gdx.files.a aVar, i iVar) {
        try {
            b bVar = new b((int) (iVar.v() * iVar.s() * 1.5f));
            try {
                bVar.b(false);
                bVar.e(aVar, iVar);
                bVar.dispose();
            } catch (Throwable th2) {
                bVar.dispose();
                throw th2;
            }
        } catch (IOException e10) {
            throw new t("Error writing PNG: " + aVar, e10);
        }
    }
}
