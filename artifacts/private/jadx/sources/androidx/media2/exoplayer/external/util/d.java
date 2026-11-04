package androidx.media2.exoplayer.external.util;

import android.util.Pair;
import androidx.annotation.b1;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f57514b = 15;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f57516d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f57518f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f57519g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f57520h = 22;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f57521i = 29;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f57522j = 31;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f57513a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f57515c = {96000, 88200, 64000, androidx.media3.extractor.m0.f67467a, AudioConstants.AUDIO_SAMPLE_RATE, 32000, 24000, 22050, androidx.media3.extractor.a.f66991g, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f57517e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private d() {
    }

    public static byte[] a(int audioObjectType, int sampleRateIndex, int channelConfig) {
        int i10 = (6 ^ 2) >> 1;
        return new byte[]{(byte) (((audioObjectType << 3) & com.planner5d.library.engine.input.f.b.R1) | ((sampleRateIndex >> 1) & 7)), (byte) (((sampleRateIndex << 7) & 128) | ((channelConfig << 3) & 120))};
    }

    public static byte[] b(int sampleRate, int numChannels) {
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f57515c;
            if (i12 >= iArr.length) {
                break;
            }
            if (sampleRate == iArr[i12]) {
                i11 = i12;
            }
            i12++;
        }
        int i13 = -1;
        while (true) {
            int[] iArr2 = f57517e;
            if (i10 >= iArr2.length) {
                break;
            }
            if (numChannels == iArr2[i10]) {
                i13 = i10;
            }
            i10++;
        }
        if (sampleRate != -1 && i13 != -1) {
            return a(2, i11, i13);
        }
        StringBuilder sb2 = new StringBuilder(67);
        sb2.append("Invalid sample rate or number of channels: ");
        sb2.append(sampleRate);
        sb2.append(", ");
        sb2.append(numChannels);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static String c(int profileIdc, int constraintsFlagsAndReservedZero2Bits, int levelIdc) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(profileIdc), Integer.valueOf(constraintsFlagsAndReservedZero2Bits), Integer.valueOf(levelIdc));
    }

    public static byte[] d(byte[] data, int offset, int length) {
        byte[] bArr = f57513a;
        byte[] bArr2 = new byte[bArr.length + length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(data, offset, bArr2, bArr.length, length);
        return bArr2;
    }

    private static int e(byte[] data, int index) {
        int length = data.length - f57513a.length;
        while (index <= length) {
            if (h(data, index)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    private static int f(w bitArray) {
        int iH = bitArray.h(5);
        return iH == 31 ? bitArray.h(6) + 32 : iH;
    }

    private static int g(w bitArray) {
        int iH = bitArray.h(4);
        if (iH == 15) {
            return bitArray.h(24);
        }
        a.a(iH < 13);
        return f57515c[iH];
    }

    private static boolean h(byte[] data, int index) {
        if (data.length - index <= f57513a.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = f57513a;
            if (i10 >= bArr.length) {
                return true;
            }
            if (data[index + i10] != bArr[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static Pair<Integer, Integer> i(w bitArray, boolean forceReadToEnd) throws androidx.media2.exoplayer.external.k0 {
        int iF = f(bitArray);
        int iG = g(bitArray);
        int iH = bitArray.h(4);
        if (iF == 5 || iF == 29) {
            iG = g(bitArray);
            iF = f(bitArray);
            if (iF == 22) {
                iH = bitArray.h(4);
            }
        }
        if (forceReadToEnd) {
            if (iF != 1 && iF != 2 && iF != 3 && iF != 4 && iF != 6 && iF != 7 && iF != 17) {
                switch (iF) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder(42);
                        sb2.append("Unsupported audio object type: ");
                        sb2.append(iF);
                        throw new androidx.media2.exoplayer.external.k0(sb2.toString());
                }
            }
            k(bitArray, iF, iH);
            switch (iF) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = bitArray.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        StringBuilder sb3 = new StringBuilder(33);
                        sb3.append("Unsupported epConfig: ");
                        sb3.append(iH2);
                        throw new androidx.media2.exoplayer.external.k0(sb3.toString());
                    }
                    break;
            }
        }
        int i10 = f57517e[iH];
        a.a(i10 != -1);
        return Pair.create(Integer.valueOf(iG), Integer.valueOf(i10));
    }

    public static Pair<Integer, Integer> j(byte[] audioSpecificConfig) throws androidx.media2.exoplayer.external.k0 {
        return i(new w(audioSpecificConfig), false);
    }

    private static void k(w bitArray, int audioObjectType, int channelConfiguration) {
        bitArray.p(1);
        if (bitArray.g()) {
            bitArray.p(14);
        }
        boolean zG = bitArray.g();
        if (channelConfiguration == 0) {
            throw new UnsupportedOperationException();
        }
        if (audioObjectType == 6 || audioObjectType == 20) {
            bitArray.p(3);
        }
        if (zG) {
            if (audioObjectType == 22) {
                bitArray.p(16);
            }
            if (audioObjectType == 17 || audioObjectType == 19 || audioObjectType == 20 || audioObjectType == 23) {
                bitArray.p(3);
            }
            bitArray.p(1);
        }
    }

    @androidx.annotation.p0
    public static byte[][] l(byte[] data) {
        if (!h(data, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iE = 0;
        do {
            arrayList.add(Integer.valueOf(iE));
            iE = e(data, iE + f57513a.length);
        } while (iE != -1);
        byte[][] bArr = new byte[arrayList.size()][];
        int i10 = 0;
        while (i10 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i10)).intValue();
            int iIntValue2 = (i10 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i10 + 1)).intValue() : data.length) - iIntValue;
            byte[] bArr2 = new byte[iIntValue2];
            System.arraycopy(data, iIntValue, bArr2, 0, iIntValue2);
            bArr[i10] = bArr2;
            i10++;
        }
        return bArr;
    }
}
