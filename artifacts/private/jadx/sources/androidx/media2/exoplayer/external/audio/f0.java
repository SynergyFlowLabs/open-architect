package androidx.media2.exoplayer.external.audio;

import androidx.annotation.b1;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class f0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f53338w = 65;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f53339x = 400;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f53340y = 4000;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f53341z = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f53344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f53345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f53346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f53347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f53348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f53349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f53350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f53351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f53352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f53353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53354m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f53355n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f53356o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f53357p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f53358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f53359r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f53360s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f53361t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f53362u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f53363v;

    public f0(int inputSampleRateHz, int channelCount, float speed, float pitch, int outputSampleRateHz) {
        this.f53342a = inputSampleRateHz;
        this.f53343b = channelCount;
        this.f53344c = speed;
        this.f53345d = pitch;
        this.f53346e = inputSampleRateHz / outputSampleRateHz;
        this.f53347f = inputSampleRateHz / 400;
        int i10 = inputSampleRateHz / 65;
        this.f53348g = i10;
        int i11 = i10 * 2;
        this.f53349h = i11;
        this.f53350i = new short[i11];
        this.f53351j = new short[i11 * channelCount];
        this.f53353l = new short[i11 * channelCount];
        this.f53355n = new short[i11 * channelCount];
    }

    private void a(float rate, int originalOutputFrameCount) {
        int i10;
        int i11;
        if (this.f53354m == originalOutputFrameCount) {
            return;
        }
        int i12 = this.f53342a;
        int i13 = (int) (i12 / rate);
        while (true) {
            if (i13 <= 16384 && i12 <= 16384) {
                break;
            }
            i13 /= 2;
            i12 /= 2;
        }
        n(originalOutputFrameCount);
        int i14 = 0;
        while (true) {
            int i15 = this.f53356o;
            if (i14 >= i15 - 1) {
                t(i15 - 1);
                return;
            }
            while (true) {
                i10 = this.f53357p;
                int i16 = (i10 + 1) * i13;
                i11 = this.f53358q;
                if (i16 <= i11 * i12) {
                    break;
                }
                this.f53353l = f(this.f53353l, this.f53354m, 1);
                int i17 = 0;
                while (true) {
                    int i18 = this.f53343b;
                    if (i17 < i18) {
                        this.f53353l[(this.f53354m * i18) + i17] = m(this.f53355n, (i18 * i14) + i17, i12, i13);
                        i17++;
                    }
                }
                this.f53358q++;
                this.f53354m++;
            }
            int i19 = i10 + 1;
            this.f53357p = i19;
            if (i19 == i12) {
                this.f53357p = 0;
                androidx.media2.exoplayer.external.util.a.i(i11 == i13);
                this.f53358q = 0;
            }
            i14++;
        }
    }

    private void b(float speed) {
        int iV;
        int i10 = this.f53352k;
        if (i10 < this.f53349h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f53359r > 0) {
                iV = c(i11);
            } else {
                int iG = g(this.f53351j, i11);
                iV = ((double) speed) > 1.0d ? iG + v(this.f53351j, i11, speed, iG) : l(this.f53351j, i11, speed, iG);
            }
            i11 += iV;
        } while (this.f53349h + i11 <= i10);
        u(i11);
    }

    private int c(int positionFrames) {
        int iMin = Math.min(this.f53349h, this.f53359r);
        d(this.f53351j, positionFrames, iMin);
        this.f53359r -= iMin;
        return iMin;
    }

    private void d(short[] samples, int positionFrames, int frameCount) {
        short[] sArrF = f(this.f53353l, this.f53354m, frameCount);
        this.f53353l = sArrF;
        int i10 = this.f53343b;
        System.arraycopy(samples, positionFrames * i10, sArrF, this.f53354m * i10, i10 * frameCount);
        this.f53354m += frameCount;
    }

    private void e(short[] samples, int position, int skip) {
        int i10 = this.f53349h / skip;
        int i11 = this.f53343b;
        int i12 = skip * i11;
        int i13 = position * i11;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                i15 += samples[(i14 * i12) + i13 + i16];
            }
            this.f53350i[i14] = (short) (i15 / i12);
        }
    }

    private short[] f(short[] buffer, int frameCount, int additionalFrameCount) {
        int length = buffer.length;
        int i10 = this.f53343b;
        int i11 = length / i10;
        return frameCount + additionalFrameCount <= i11 ? buffer : Arrays.copyOf(buffer, (((i11 * 3) / 2) + additionalFrameCount) * i10);
    }

    private int g(short[] samples, int position) {
        int iH;
        int i10 = this.f53342a;
        int i11 = i10 > f53340y ? i10 / f53340y : 1;
        if (this.f53343b == 1 && i11 == 1) {
            iH = h(samples, position, this.f53347f, this.f53348g);
        } else {
            e(samples, position, i11);
            int iH2 = h(this.f53350i, 0, this.f53347f / i11, this.f53348g / i11);
            if (i11 != 1) {
                int i12 = iH2 * i11;
                int i13 = i11 * 4;
                int i14 = i12 - i13;
                int i15 = i12 + i13;
                int i16 = this.f53347f;
                if (i14 < i16) {
                    i14 = i16;
                }
                int i17 = this.f53348g;
                if (i15 > i17) {
                    i15 = i17;
                }
                if (this.f53343b == 1) {
                    iH = h(samples, position, i14, i15);
                } else {
                    e(samples, position, 1);
                    iH = h(this.f53350i, 0, i14, i15);
                }
            } else {
                iH = iH2;
            }
        }
        int i18 = p(this.f53362u, this.f53363v) ? this.f53360s : iH;
        this.f53361t = this.f53362u;
        this.f53360s = iH;
        return i18;
    }

    private int h(short[] samples, int position, int minPeriod, int maxPeriod) {
        int i10 = position * this.f53343b;
        int i11 = 255;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (minPeriod <= maxPeriod) {
            int iAbs = 0;
            for (int i15 = 0; i15 < minPeriod; i15++) {
                iAbs += Math.abs(samples[i10 + i15] - samples[(i10 + minPeriod) + i15]);
            }
            if (iAbs * i13 < i12 * minPeriod) {
                i13 = minPeriod;
                i12 = iAbs;
            }
            if (iAbs * i11 > i14 * minPeriod) {
                i11 = minPeriod;
                i14 = iAbs;
            }
            minPeriod++;
        }
        this.f53362u = i12 / i13;
        this.f53363v = i14 / i11;
        return i13;
    }

    private int l(short[] samples, int position, float speed, int period) {
        int i10;
        if (speed < 0.5f) {
            i10 = (int) ((period * speed) / (1.0f - speed));
        } else {
            this.f53359r = (int) ((period * ((2.0f * speed) - 1.0f)) / (1.0f - speed));
            i10 = period;
        }
        int i11 = period + i10;
        short[] sArrF = f(this.f53353l, this.f53354m, i11);
        this.f53353l = sArrF;
        int i12 = this.f53343b;
        System.arraycopy(samples, position * i12, sArrF, this.f53354m * i12, i12 * period);
        o(i10, this.f53343b, this.f53353l, this.f53354m + period, samples, position + period, samples, position);
        this.f53354m += i11;
        return i10;
    }

    private short m(short[] in, int inPos, int oldSampleRate, int newSampleRate) {
        short s10 = in[inPos];
        short s11 = in[inPos + this.f53343b];
        int i10 = this.f53358q * oldSampleRate;
        int i11 = this.f53357p;
        int i12 = i11 * newSampleRate;
        int i13 = (i11 + 1) * newSampleRate;
        int i14 = i13 - i10;
        int i15 = i13 - i12;
        return (short) (((s10 * i14) + ((i15 - i14) * s11)) / i15);
    }

    private void n(int originalOutputFrameCount) {
        int i10 = this.f53354m - originalOutputFrameCount;
        short[] sArrF = f(this.f53355n, this.f53356o, i10);
        this.f53355n = sArrF;
        short[] sArr = this.f53353l;
        int i11 = this.f53343b;
        System.arraycopy(sArr, originalOutputFrameCount * i11, sArrF, this.f53356o * i11, i11 * i10);
        this.f53354m = originalOutputFrameCount;
        this.f53356o += i10;
    }

    private static void o(int frameCount, int channelCount, short[] out, int outPosition, short[] rampDown, int rampDownPosition, short[] rampUp, int rampUpPosition) {
        for (int i10 = 0; i10 < channelCount; i10++) {
            int i11 = (outPosition * channelCount) + i10;
            int i12 = (rampUpPosition * channelCount) + i10;
            int i13 = (rampDownPosition * channelCount) + i10;
            for (int i14 = 0; i14 < frameCount; i14++) {
                out[i11] = (short) (((rampDown[i13] * (frameCount - i14)) + (rampUp[i12] * i14)) / frameCount);
                i11 += channelCount;
                i13 += channelCount;
                i12 += channelCount;
            }
        }
    }

    private boolean p(int minDiff, int maxDiff) {
        return minDiff != 0 && this.f53360s != 0 && maxDiff <= minDiff * 3 && minDiff * 2 > this.f53361t * 3;
    }

    private void q() {
        int i10 = this.f53354m;
        float f10 = this.f53344c;
        float f11 = this.f53345d;
        float f12 = f10 / f11;
        float f13 = this.f53346e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f53351j, 0, this.f53352k);
            this.f53352k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    private void t(int frameCount) {
        if (frameCount == 0) {
            return;
        }
        short[] sArr = this.f53355n;
        int i10 = this.f53343b;
        System.arraycopy(sArr, frameCount * i10, sArr, 0, (this.f53356o - frameCount) * i10);
        this.f53356o -= frameCount;
    }

    private void u(int positionFrames) {
        int i10 = this.f53352k - positionFrames;
        short[] sArr = this.f53351j;
        int i11 = this.f53343b;
        System.arraycopy(sArr, positionFrames * i11, sArr, 0, i11 * i10);
        this.f53352k = i10;
    }

    private int v(short[] samples, int position, float speed, int period) {
        int i10;
        if (speed >= 2.0f) {
            i10 = (int) (period / (speed - 1.0f));
        } else {
            this.f53359r = (int) ((period * (2.0f - speed)) / (speed - 1.0f));
            i10 = period;
        }
        short[] sArrF = f(this.f53353l, this.f53354m, i10);
        this.f53353l = sArrF;
        o(i10, this.f53343b, sArrF, this.f53354m, samples, position, samples, position + period);
        this.f53354m += i10;
        return i10;
    }

    public void i() {
        this.f53352k = 0;
        this.f53354m = 0;
        this.f53356o = 0;
        this.f53357p = 0;
        this.f53358q = 0;
        this.f53359r = 0;
        this.f53360s = 0;
        this.f53361t = 0;
        this.f53362u = 0;
        this.f53363v = 0;
    }

    public void j(ShortBuffer buffer) {
        int iMin = Math.min(buffer.remaining() / this.f53343b, this.f53354m);
        int i10 = 3 >> 0;
        buffer.put(this.f53353l, 0, this.f53343b * iMin);
        int i11 = this.f53354m - iMin;
        this.f53354m = i11;
        short[] sArr = this.f53353l;
        int i12 = this.f53343b;
        System.arraycopy(sArr, iMin * i12, sArr, 0, i11 * i12);
    }

    public int k() {
        return this.f53354m * this.f53343b * 2;
    }

    public void r() {
        int i10;
        int i11 = this.f53352k;
        float f10 = this.f53344c;
        float f11 = this.f53345d;
        int i12 = this.f53354m + ((int) ((((i11 / (f10 / f11)) + this.f53356o) / (this.f53346e * f11)) + 0.5f));
        this.f53351j = f(this.f53351j, i11, (this.f53349h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f53349h;
            int i14 = this.f53343b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f53351j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f53352k += i10 * 2;
        q();
        if (this.f53354m > i12) {
            this.f53354m = i12;
        }
        this.f53352k = 0;
        this.f53359r = 0;
        this.f53356o = 0;
    }

    public void s(ShortBuffer buffer) {
        int iRemaining = buffer.remaining();
        int i10 = this.f53343b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f53351j, this.f53352k, i11);
        this.f53351j = sArrF;
        buffer.get(sArrF, this.f53352k * this.f53343b, ((i10 * i11) * 2) / 2);
        this.f53352k += i11;
        q();
    }
}
