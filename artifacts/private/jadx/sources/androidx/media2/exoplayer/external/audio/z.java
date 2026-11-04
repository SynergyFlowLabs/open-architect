package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import androidx.media3.exoplayer.a5;
import androidx.media3.extractor.m0;
import com.google.android.material.internal.p0;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f53574a = 2147385345;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f53575b = 536864768;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f53576c = -25230976;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f53577d = -14745368;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte f53578e = 127;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte f53579f = 31;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f53580g = -2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte f53581h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f53582i = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f53583j = {-1, 8000, androidx.media3.extractor.a.f66991g, 32000, -1, -1, 11025, 22050, AudioConstants.AUDIO_SAMPLE_RATE, -1, -1, 12000, 24000, m0.f67467a, -1, -1};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f53584k = {64, com.planner5d.library.engine.input.f.b.B, 128, 192, 224, 256, a5.S0, 448, 512, 640, p0.f112892a, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    private z() {
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006f  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int a(byte[] data) {
        int i10;
        byte b10;
        int i11;
        int i12;
        byte b11;
        boolean z10 = false;
        byte b12 = data[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i12 = ((data[7] & 3) << 12) | ((data[6] & 255) << 4);
                b11 = data[9];
            } else if (b12 != 31) {
                i10 = ((data[5] & 3) << 12) | ((data[6] & 255) << 4);
                b10 = data[7];
            } else {
                i12 = ((data[6] & 3) << 12) | ((data[7] & 255) << 4);
                b11 = data[8];
            }
            i11 = (((b11 & 60) >> 2) | i12) + 1;
            z10 = true;
            if (z10) {
                return (i11 * 16) / 14;
            }
            return i11;
        }
        i10 = ((data[4] & 3) << 12) | ((data[7] & 255) << 4);
        b10 = data[6];
        i11 = (((b10 & 240) >> 4) | i10) + 1;
        if (z10) {
            return (i11 * 16) / 14;
        }
        return i11;
    }

    private static androidx.media2.exoplayer.external.util.w b(byte[] frameHeader) {
        if (frameHeader[0] == 127) {
            return new androidx.media2.exoplayer.external.util.w(frameHeader);
        }
        byte[] bArrCopyOf = Arrays.copyOf(frameHeader, frameHeader.length);
        if (c(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b10 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b10;
            }
        }
        androidx.media2.exoplayer.external.util.w wVar = new androidx.media2.exoplayer.external.util.w(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            androidx.media2.exoplayer.external.util.w wVar2 = new androidx.media2.exoplayer.external.util.w(bArrCopyOf);
            while (wVar2.b() >= 16) {
                wVar2.p(2);
                wVar.f(wVar2.h(14), 14);
            }
        }
        wVar.l(bArrCopyOf);
        return wVar;
    }

    private static boolean c(byte[] frameHeader) {
        byte b10 = frameHeader[0];
        return b10 == -2 || b10 == -1;
    }

    public static boolean d(int word) {
        return word == f53574a || word == f53576c || word == f53575b || word == f53577d;
    }

    public static int e(ByteBuffer buffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        int iPosition = buffer.position();
        byte b12 = buffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (buffer.get(iPosition + 4) & 7) << 4;
                b11 = buffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (buffer.get(iPosition + 4) & 1) << 6;
                b10 = buffer.get(iPosition + 5);
            } else {
                i10 = (buffer.get(iPosition + 5) & 7) << 4;
                b11 = buffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (buffer.get(iPosition + 5) & 1) << 6;
        b10 = buffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static int f(byte[] data) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = data[0];
        int i12 = 0 ^ (-2);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (data[4] & 7) << 4;
                b11 = data[7];
            } else if (b12 != 31) {
                i10 = (data[4] & 1) << 6;
                b10 = data[5];
            } else {
                i10 = (data[5] & 7) << 4;
                b11 = data[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (data[5] & 1) << 6;
        b10 = data[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static Format g(byte[] frame, String trackId, @androidx.annotation.p0 String language, @androidx.annotation.p0 DrmInitData drmInitData) {
        androidx.media2.exoplayer.external.util.w wVarB = b(frame);
        wVarB.p(60);
        int i10 = f53582i[wVarB.h(6)];
        int i11 = f53583j[wVarB.h(4)];
        int iH = wVarB.h(5);
        int[] iArr = f53584k;
        int i12 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        wVarB.p(10);
        return Format.s(trackId, "audio/vnd.dts", null, i12, -1, i10 + (wVarB.h(2) > 0 ? 1 : 0), i11, null, drmInitData, 0, language);
    }
}
