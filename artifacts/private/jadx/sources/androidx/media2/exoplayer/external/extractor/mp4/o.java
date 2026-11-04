package androidx.media2.exoplayer.external.extractor.mp4;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f54550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f54552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f54553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f54555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f54556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f54557h;

    public o(l track, long[] offsets, int[] sizes, int maximumSize, long[] timestampsUs, int[] flags, long durationUs) {
        int i10 = 4 ^ 1;
        androidx.media2.exoplayer.external.util.a.a(sizes.length == timestampsUs.length);
        androidx.media2.exoplayer.external.util.a.a(offsets.length == timestampsUs.length);
        androidx.media2.exoplayer.external.util.a.a(flags.length == timestampsUs.length);
        this.f54550a = track;
        this.f54552c = offsets;
        this.f54553d = sizes;
        this.f54554e = maximumSize;
        this.f54555f = timestampsUs;
        this.f54556g = flags;
        this.f54557h = durationUs;
        this.f54551b = offsets.length;
        if (flags.length > 0) {
            int length = flags.length - 1;
            flags[length] = flags[length] | 536870912;
        }
    }

    public int a(long timeUs) {
        for (int iH = q0.h(this.f54555f, timeUs, true, false); iH >= 0; iH--) {
            if ((this.f54556g[iH] & 1) != 0) {
                return iH;
            }
        }
        return -1;
    }

    public int b(long timeUs) {
        for (int iE = q0.e(this.f54555f, timeUs, true, false); iE < this.f54555f.length; iE++) {
            if ((this.f54556g[iE] & 1) != 0) {
                return iE;
            }
        }
        return -1;
    }
}
