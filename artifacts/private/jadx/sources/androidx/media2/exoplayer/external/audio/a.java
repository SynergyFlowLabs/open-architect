package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media3.exoplayer.a5;
import androidx.media3.extractor.m0;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f53230a = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f53231b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f53232c = 256;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f53233d = 1536;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f53234e = {1, 2, 3, 6};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f53235f = {m0.f67467a, AudioConstants.AUDIO_SAMPLE_RATE, 32000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f53236g = {24000, 22050, androidx.media3.extractor.a.f66991g};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f53237h = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f53238i = {32, 40, 48, 56, 64, 80, 96, com.planner5d.library.engine.input.f.b.B, 128, 160, 192, 224, 256, com.rabbitmq.client.a.f264844o, a5.S0, 448, 512, 576, 640};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f53239j = {69, 87, 104, 121, 139, 174, 208, com.planner5d.library.engine.input.f.b.M1, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f53240g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f53241h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f53242i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f53243j = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public final String f53244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f53245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f53246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f53247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f53248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f53249f;

        /* JADX INFO: renamed from: androidx.media2.exoplayer.external.audio.a$b$a, reason: collision with other inner class name */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0502a {
        }

        private b(@p0 String mimeType, int streamType, int channelCount, int sampleRate, int frameSize, int sampleCount) {
            this.f53244a = mimeType;
            this.f53245b = streamType;
            this.f53247d = channelCount;
            this.f53246c = sampleRate;
            this.f53248e = frameSize;
            this.f53249f = sampleCount;
        }
    }

    private a() {
    }

    public static int a(ByteBuffer buffer) {
        int iPosition = buffer.position();
        int iLimit = buffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((buffer.getInt(i10 + 4) & (-16777217)) == -1167101192) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    public static int b() {
        return f53233d;
    }

    private static int c(int fscod, int frmsizecod) {
        int i10 = frmsizecod / 2;
        if (fscod < 0) {
            return -1;
        }
        int[] iArr = f53235f;
        if (fscod >= iArr.length || frmsizecod < 0) {
            return -1;
        }
        int[] iArr2 = f53239j;
        if (i10 >= iArr2.length) {
            return -1;
        }
        int i11 = iArr[fscod];
        if (i11 == 44100) {
            return (iArr2[i10] + (frmsizecod % 2)) * 2;
        }
        int i12 = f53238i[i10];
        return i11 == 32000 ? i12 * 6 : i12 * 4;
    }

    public static Format d(androidx.media2.exoplayer.external.util.x data, String trackId, String language, @p0 DrmInitData drmInitData) {
        int i10 = f53235f[(data.D() & 192) >> 6];
        int iD = data.D();
        int i11 = f53237h[(iD & 56) >> 3];
        if ((iD & 4) != 0) {
            i11++;
        }
        return Format.s(trackId, "audio/ac3", null, -1, -1, i11, i10, null, drmInitData, 0, language);
    }

    public static b e(androidx.media2.exoplayer.external.util.w wVar) {
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int iH;
        int i14;
        int i15;
        int iE = wVar.e();
        wVar.p(40);
        boolean z10 = wVar.h(5) == 16;
        wVar.n(iE);
        int i16 = -1;
        if (z10) {
            wVar.p(16);
            int iH2 = wVar.h(2);
            if (iH2 == 0) {
                i16 = 0;
            } else if (iH2 == 1) {
                i16 = 1;
            } else if (iH2 == 2) {
                i16 = 2;
            }
            wVar.p(3);
            int iH3 = (wVar.h(11) + 1) * 2;
            int iH4 = wVar.h(2);
            if (iH4 == 3) {
                i14 = 6;
                i10 = f53236g[wVar.h(2)];
                iH = 3;
            } else {
                iH = wVar.h(2);
                i14 = f53234e[iH];
                i10 = f53235f[iH4];
            }
            i12 = i14 * 256;
            int iH5 = wVar.h(3);
            boolean zG = wVar.g();
            i11 = f53237h[iH5] + (zG ? 1 : 0);
            wVar.p(10);
            if (wVar.g()) {
                wVar.p(8);
            }
            if (iH5 == 0) {
                wVar.p(5);
                if (wVar.g()) {
                    wVar.p(8);
                }
            }
            if (i16 == 1 && wVar.g()) {
                wVar.p(16);
            }
            if (wVar.g()) {
                if (iH5 > 2) {
                    wVar.p(2);
                }
                if ((iH5 & 1) != 0 && iH5 > 2) {
                    wVar.p(6);
                }
                if ((iH5 & 4) != 0) {
                    wVar.p(6);
                }
                if (zG && wVar.g()) {
                    wVar.p(5);
                }
                if (i16 == 0) {
                    if (wVar.g()) {
                        wVar.p(6);
                    }
                    if (iH5 == 0 && wVar.g()) {
                        wVar.p(6);
                    }
                    if (wVar.g()) {
                        wVar.p(6);
                    }
                    int iH6 = wVar.h(2);
                    if (iH6 == 1) {
                        wVar.p(5);
                    } else if (iH6 == 2) {
                        wVar.p(12);
                    } else if (iH6 == 3) {
                        int iH7 = wVar.h(5);
                        if (wVar.g()) {
                            wVar.p(5);
                            if (wVar.g()) {
                                wVar.p(4);
                            }
                            if (wVar.g()) {
                                wVar.p(4);
                            }
                            if (wVar.g()) {
                                wVar.p(4);
                            }
                            if (wVar.g()) {
                                wVar.p(4);
                            }
                            if (wVar.g()) {
                                wVar.p(4);
                            }
                            if (wVar.g()) {
                                wVar.p(4);
                            }
                            if (wVar.g()) {
                                wVar.p(4);
                            }
                            if (wVar.g()) {
                                if (wVar.g()) {
                                    wVar.p(4);
                                }
                                if (wVar.g()) {
                                    wVar.p(4);
                                }
                            }
                        }
                        if (wVar.g()) {
                            wVar.p(5);
                            if (wVar.g()) {
                                wVar.p(7);
                                if (wVar.g()) {
                                    wVar.p(8);
                                }
                            }
                        }
                        wVar.p((iH7 + 2) * 8);
                        wVar.c();
                    }
                    if (iH5 < 2) {
                        if (wVar.g()) {
                            wVar.p(14);
                        }
                        if (iH5 == 0 && wVar.g()) {
                            wVar.p(14);
                        }
                    }
                    if (wVar.g()) {
                        if (iH == 0) {
                            wVar.p(5);
                        } else {
                            for (int i17 = 0; i17 < i14; i17++) {
                                if (wVar.g()) {
                                    wVar.p(5);
                                }
                            }
                        }
                    }
                }
            }
            if (wVar.g()) {
                wVar.p(5);
                if (iH5 == 2) {
                    wVar.p(4);
                }
                if (iH5 >= 6) {
                    wVar.p(2);
                }
                if (wVar.g()) {
                    wVar.p(8);
                }
                if (iH5 == 0 && wVar.g()) {
                    wVar.p(8);
                }
                i15 = 3;
                if (iH4 < 3) {
                    wVar.o();
                }
            } else {
                i15 = 3;
            }
            if (i16 == 0 && iH != i15) {
                wVar.o();
            }
            if (i16 == 2 && (iH == i15 || wVar.g())) {
                wVar.p(6);
            }
            str = (wVar.g() && wVar.h(6) == 1 && wVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = iH3;
        } else {
            wVar.p(32);
            int iH8 = wVar.h(2);
            String str2 = iH8 == 3 ? null : "audio/ac3";
            int iC = c(iH8, wVar.h(6));
            wVar.p(8);
            int iH9 = wVar.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                wVar.p(2);
            }
            if ((iH9 & 4) != 0) {
                wVar.p(2);
            }
            if (iH9 == 2) {
                wVar.p(2);
            }
            int[] iArr = f53235f;
            i10 = iH8 < iArr.length ? iArr[iH8] : -1;
            i11 = f53237h[iH9] + (wVar.g() ? 1 : 0);
            i12 = f53233d;
            str = str2;
            i13 = iC;
        }
        return new b(str, i16, i11, i10, i13, i12);
    }

    public static int f(byte[] data) {
        if (data.length < 6) {
            return -1;
        }
        if (((data[5] & 255) >> 3) == 16) {
            return (((data[3] & 255) | ((data[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = data[4];
        return c((b10 & org.msgpack.core.h.a.f339269e) >> 6, b10 & 63);
    }

    public static Format g(androidx.media2.exoplayer.external.util.x data, String trackId, String language, @p0 DrmInitData drmInitData) {
        data.R(2);
        int i10 = f53235f[(data.D() & 192) >> 6];
        int iD = data.D();
        int i11 = f53237h[(iD & 14) >> 1];
        if ((iD & 1) != 0) {
            i11++;
        }
        if (((data.D() & 30) >> 1) > 0 && (2 & data.D()) != 0) {
            i11 += 2;
        }
        return Format.s(trackId, (data.a() <= 0 || (data.D() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", null, -1, -1, i11, i10, null, drmInitData, 0, language);
    }

    public static int h(ByteBuffer buffer) {
        return (((buffer.get(buffer.position() + 4) & org.msgpack.core.h.a.f339269e) >> 6) != 3 ? f53234e[(buffer.get(buffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static int i(ByteBuffer buffer, int offset) {
        boolean z10;
        if ((buffer.get(buffer.position() + offset + 7) & 255) == 187) {
            z10 = true;
            int i10 = 5 ^ 1;
        } else {
            z10 = false;
        }
        return 40 << ((buffer.get((buffer.position() + offset) + (z10 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] syncframe) {
        int i10 = 7 | 0;
        if (syncframe[4] == -8 && syncframe[5] == 114 && syncframe[6] == 111) {
            byte b10 = syncframe[7];
            if ((b10 & 254) == 186) {
                return 40 << ((syncframe[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
