package androidx.media3.extractor;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f67118a = 80000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f67119b = 768000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f67120c = 3062500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f67121d = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f67122e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f67123f = 256;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67124g = 1536;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f67125h = {1, 2, 3, 6};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f67126i = {m0.f67467a, AudioConstants.AUDIO_SAMPLE_RATE, 32000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f67127j = {24000, 22050, androidx.media3.extractor.a.f66991g};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f67128k = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f67129l = {32, 40, 48, 56, 64, 80, 96, com.planner5d.library.engine.input.f.b.B, 128, 160, 192, 224, 256, com.rabbitmq.client.a.f264844o, a5.S0, 448, 512, 576, 640};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f67130m = {69, 87, 104, 121, 139, 174, 208, com.planner5d.library.engine.input.f.b.M1, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: androidx.media3.extractor.b$b, reason: collision with other inner class name */
    public static final class C0602b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f67131h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f67132i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f67133j = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f67134k = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f67135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f67136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f67137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f67138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f67139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f67140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f67141g;

        /* JADX INFO: renamed from: androidx.media3.extractor.b$b$a */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private C0602b(@androidx.annotation.p0 String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f67135a = str;
            this.f67136b = i10;
            this.f67138d = i11;
            this.f67137c = i12;
            this.f67139e = i13;
            this.f67140f = i14;
            this.f67141g = i15;
        }
    }

    private b() {
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((k1.e0(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    private static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f67126i;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f67130m;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f67129l[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static androidx.media3.common.w d(androidx.media3.common.util.o0 o0Var, String str, String str2, @androidx.annotation.p0 DrmInitData drmInitData) {
        androidx.media3.common.util.n0 n0Var = new androidx.media3.common.util.n0();
        n0Var.n(o0Var);
        int i10 = f67126i[n0Var.h(2)];
        n0Var.s(8);
        int i11 = f67128k[n0Var.h(3)];
        if (n0Var.h(1) != 0) {
            i11++;
        }
        int i12 = f67129l[n0Var.h(5)] * 1000;
        n0Var.c();
        o0Var.a0(n0Var.d());
        return new androidx.media3.common.w.b().f0(str).u0("audio/ac3").R(i11).v0(i10).Y(drmInitData).j0(str2).Q(i12).p0(i12).N();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f67125h[((byteBuffer.get(byteBuffer.position() + 4) & org.msgpack.core.h.a.f339269e) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return f67124g;
    }

    public static C0602b f(androidx.media3.common.util.n0 n0Var) {
        int iC;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iE = n0Var.e();
        n0Var.s(40);
        boolean z10 = n0Var.h(5) > 10;
        n0Var.q(iE);
        int i19 = -1;
        if (z10) {
            n0Var.s(16);
            int iH = n0Var.h(2);
            if (iH == 0) {
                i19 = 0;
            } else if (iH == 1) {
                i19 = 1;
            } else if (iH == 2) {
                i19 = 2;
            }
            n0Var.s(3);
            iC = (n0Var.h(11) + 1) * 2;
            int iH2 = n0Var.h(2);
            if (iH2 == 3) {
                i10 = f67127j[n0Var.h(2)];
                i14 = 3;
                i15 = 6;
            } else {
                int iH3 = n0Var.h(2);
                int i20 = f67125h[iH3];
                i14 = iH3;
                i10 = f67126i[iH2];
                i15 = i20;
            }
            i12 = i15 * 256;
            int iA = a(iC, i10, i15);
            int iH4 = n0Var.h(3);
            boolean zG = n0Var.g();
            i11 = f67128k[iH4] + (zG ? 1 : 0);
            n0Var.s(10);
            if (n0Var.g()) {
                n0Var.s(8);
            }
            if (iH4 == 0) {
                n0Var.s(5);
                if (n0Var.g()) {
                    n0Var.s(8);
                }
            }
            if (i19 == 1 && n0Var.g()) {
                n0Var.s(16);
            }
            if (n0Var.g()) {
                if (iH4 > 2) {
                    n0Var.s(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    n0Var.s(6);
                }
                if ((iH4 & 4) != 0) {
                    n0Var.s(i17);
                }
                if (zG && n0Var.g()) {
                    n0Var.s(5);
                }
                if (i19 == 0) {
                    if (n0Var.g()) {
                        i18 = 6;
                        n0Var.s(6);
                    } else {
                        i18 = 6;
                    }
                    if (iH4 == 0 && n0Var.g()) {
                        n0Var.s(i18);
                    }
                    if (n0Var.g()) {
                        n0Var.s(i18);
                    }
                    int iH5 = n0Var.h(2);
                    if (iH5 == 1) {
                        n0Var.s(5);
                    } else if (iH5 == 2) {
                        n0Var.s(12);
                    } else if (iH5 == 3) {
                        int iH6 = n0Var.h(5);
                        if (n0Var.g()) {
                            n0Var.s(5);
                            if (n0Var.g()) {
                                n0Var.s(4);
                            }
                            if (n0Var.g()) {
                                n0Var.s(4);
                            }
                            if (n0Var.g()) {
                                n0Var.s(4);
                            }
                            if (n0Var.g()) {
                                n0Var.s(4);
                            }
                            if (n0Var.g()) {
                                n0Var.s(4);
                            }
                            if (n0Var.g()) {
                                n0Var.s(4);
                            }
                            if (n0Var.g()) {
                                n0Var.s(4);
                            }
                            if (n0Var.g()) {
                                if (n0Var.g()) {
                                    n0Var.s(4);
                                }
                                if (n0Var.g()) {
                                    n0Var.s(4);
                                }
                            }
                        }
                        if (n0Var.g()) {
                            n0Var.s(5);
                            if (n0Var.g()) {
                                n0Var.s(7);
                                if (n0Var.g()) {
                                    n0Var.s(8);
                                }
                            }
                        }
                        n0Var.s((iH6 + 2) * 8);
                        n0Var.c();
                    }
                    if (iH4 < 2) {
                        if (n0Var.g()) {
                            n0Var.s(14);
                        }
                        if (iH4 == 0 && n0Var.g()) {
                            n0Var.s(14);
                        }
                    }
                    if (n0Var.g()) {
                        if (i14 == 0) {
                            n0Var.s(5);
                        } else {
                            for (int i21 = 0; i21 < i15; i21++) {
                                if (n0Var.g()) {
                                    n0Var.s(5);
                                }
                            }
                        }
                    }
                }
            }
            if (n0Var.g()) {
                n0Var.s(5);
                if (iH4 == 2) {
                    n0Var.s(4);
                }
                if (iH4 >= 6) {
                    n0Var.s(2);
                }
                if (n0Var.g()) {
                    n0Var.s(8);
                }
                if (iH4 == 0 && n0Var.g()) {
                    n0Var.s(8);
                }
                if (iH2 < 3) {
                    n0Var.r();
                }
            }
            if (i19 == 0 && i14 != 3) {
                n0Var.r();
            }
            if (i19 == 2 && (i14 == 3 || n0Var.g())) {
                i16 = 6;
                n0Var.s(6);
            } else {
                i16 = 6;
            }
            str = (n0Var.g() && n0Var.h(i16) == 1 && n0Var.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = iA;
        } else {
            n0Var.s(32);
            int iH7 = n0Var.h(2);
            String str2 = iH7 == 3 ? null : "audio/ac3";
            int iH8 = n0Var.h(6);
            int i22 = f67129l[iH8 / 2] * 1000;
            iC = c(iH7, iH8);
            n0Var.s(8);
            int iH9 = n0Var.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                n0Var.s(2);
            }
            if ((iH9 & 4) != 0) {
                n0Var.s(2);
            }
            if (iH9 == 2) {
                n0Var.s(2);
            }
            int[] iArr = f67126i;
            i10 = iH7 < iArr.length ? iArr[iH7] : -1;
            i11 = f67128k[iH9] + (n0Var.g() ? 1 : 0);
            i12 = f67124g;
            str = str2;
            i13 = i22;
        }
        return new C0602b(str, i19, i11, i10, iC, i12, i13);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & org.msgpack.core.h.a.f339269e) >> 6, b10 & 63);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    public static androidx.media3.common.w h(androidx.media3.common.util.o0 o0Var, String str, String str2, @androidx.annotation.p0 DrmInitData drmInitData) {
        String str3;
        androidx.media3.common.util.n0 n0Var = new androidx.media3.common.util.n0();
        n0Var.n(o0Var);
        int iH = n0Var.h(13) * 1000;
        n0Var.s(3);
        int i10 = f67126i[n0Var.h(2)];
        n0Var.s(10);
        int i11 = f67128k[n0Var.h(3)];
        if (n0Var.h(1) != 0) {
            i11++;
        }
        n0Var.s(3);
        int iH2 = n0Var.h(4);
        n0Var.s(1);
        if (iH2 > 0) {
            n0Var.s(6);
            if (n0Var.h(1) != 0) {
                i11 += 2;
            }
            n0Var.s(1);
        }
        if (n0Var.b() > 7) {
            n0Var.s(7);
            if (n0Var.h(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        n0Var.c();
        o0Var.a0(n0Var.d());
        return new androidx.media3.common.w.b().f0(str).u0(str3).R(i11).v0(i10).Y(drmInitData).j0(str2).p0(iH).N();
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
