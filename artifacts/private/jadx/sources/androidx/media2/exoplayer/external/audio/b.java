package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media3.common.x0;
import androidx.media3.extractor.m0;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f53252a = 44096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f53253b = 44097;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f53254c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f53255d = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f53256e = {x0.H1, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.audio.b$b, reason: collision with other inner class name */
    public static final class C0503b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f53257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f53258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f53259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f53260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f53261e;

        private C0503b(int bitstreamVersion, int channelCount, int sampleRate, int frameSize, int sampleCount) {
            this.f53257a = bitstreamVersion;
            this.f53259c = channelCount;
            this.f53258b = sampleRate;
            this.f53260d = frameSize;
            this.f53261e = sampleCount;
        }
    }

    private b() {
    }

    public static void a(int size, androidx.media2.exoplayer.external.util.x buffer) {
        buffer.M(7);
        byte[] bArr = buffer.f57720a;
        bArr[0] = -84;
        bArr[1] = com.google.common.primitives.t.f119782a;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((size >> 16) & 255);
        bArr[5] = (byte) ((size >> 8) & 255);
        bArr[6] = (byte) (size & 255);
    }

    public static Format b(androidx.media2.exoplayer.external.util.x data, String trackId, String language, @p0 DrmInitData drmInitData) {
        data.R(1);
        return Format.s(trackId, "audio/ac4", null, -1, -1, 2, ((data.D() & 32) >> 5) == 1 ? m0.f67467a : AudioConstants.AUDIO_SAMPLE_RATE, null, drmInitData, 0, language);
    }

    public static int c(ByteBuffer buffer) {
        byte[] bArr = new byte[16];
        int iPosition = buffer.position();
        buffer.get(bArr);
        buffer.position(iPosition);
        return d(new androidx.media2.exoplayer.external.util.w(bArr)).f53261e;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    public static C0503b d(androidx.media2.exoplayer.external.util.w data) {
        int i10;
        int i11;
        int i12;
        int iH = data.h(16);
        int iH2 = data.h(16);
        if (iH2 == 65535) {
            iH2 = data.h(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i13 = iH2 + i10;
        if (iH == 44097) {
            i13 += 2;
        }
        int i14 = i13;
        int iH3 = data.h(2);
        if (iH3 == 3) {
            iH3 += f(data, 2);
        }
        int i15 = iH3;
        int iH4 = data.h(10);
        if (data.g() && data.h(3) > 0) {
            data.p(2);
        }
        boolean zG = data.g();
        int i16 = m0.f67467a;
        if (!zG) {
            i16 = 44100;
        }
        int iH5 = data.h(4);
        if (i16 != 44100 || iH5 != 13) {
            if (i16 == 48000) {
                int[] iArr = f53256e;
                if (iH5 < iArr.length) {
                    int i17 = iArr[iH5];
                    int i18 = iH4 % 5;
                    if (i18 == 1) {
                        if (iH5 != 3 || iH5 == 8) {
                            i11 = i17 + 1;
                        } else {
                            i12 = i17;
                        }
                    } else if (i18 != 2) {
                        if (i18 == 3) {
                            if (iH5 != 3) {
                            }
                            i11 = i17 + 1;
                        } else if (i18 == 4 && (iH5 == 3 || iH5 == 8 || iH5 == 11)) {
                            i11 = i17 + 1;
                        } else {
                            i12 = i17;
                        }
                    } else if (iH5 == 8 || iH5 == 11) {
                        i11 = i17 + 1;
                    } else {
                        i12 = i17;
                    }
                } else {
                    i11 = 0;
                }
            } else {
                i11 = 0;
            }
            return new C0503b(i15, 2, i16, i14, i12);
        }
        i11 = f53256e[iH5];
        i12 = i11;
        return new C0503b(i15, 2, i16, i14, i12);
    }

    public static int e(byte[] data, int syncword) {
        int i10 = 7;
        if (data.length < 7) {
            return -1;
        }
        int i11 = ((data[2] & 255) << 8) | (data[3] & 255);
        if (i11 == 65535) {
            i11 = ((data[4] & 255) << 16) | ((data[5] & 255) << 8) | (data[6] & 255);
        } else {
            i10 = 4;
        }
        if (syncword == 44097) {
            i10 += 2;
        }
        return i11 + i10;
    }

    private static int f(androidx.media2.exoplayer.external.util.w data, int bitsPerRead) {
        int i10 = 0;
        while (true) {
            int iH = i10 + data.h(bitsPerRead);
            if (!data.g()) {
                return iH;
            }
            i10 = (iH + 1) << bitsPerRead;
        }
    }
}
