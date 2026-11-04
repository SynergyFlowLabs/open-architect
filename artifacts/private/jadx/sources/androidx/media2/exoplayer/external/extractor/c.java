package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f53987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f53988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f53989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f53990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f53991i;

    public c(int[] sizes, long[] offsets, long[] durationsUs, long[] timesUs) {
        this.f53987e = sizes;
        this.f53988f = offsets;
        this.f53989g = durationsUs;
        this.f53990h = timesUs;
        int length = sizes.length;
        this.f53986d = length;
        if (length > 0) {
            this.f53991i = durationsUs[length - 1] + timesUs[length - 1];
        } else {
            this.f53991i = 0L;
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public long Q1() {
        return this.f53991i;
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public q.a R1(long timeUs) {
        int iA = a(timeUs);
        r rVar = new r(this.f53990h[iA], this.f53988f[iA]);
        if (rVar.f54701a < timeUs && iA != this.f53986d - 1) {
            int i10 = iA + 1;
            return new q.a(rVar, new r(this.f53990h[i10], this.f53988f[i10]));
        }
        return new q.a(rVar);
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public boolean S1() {
        return true;
    }

    public int a(long timeUs) {
        return q0.h(this.f53990h, timeUs, true, true);
    }

    public String toString() {
        int i10 = this.f53986d;
        String string = Arrays.toString(this.f53987e);
        String string2 = Arrays.toString(this.f53988f);
        String string3 = Arrays.toString(this.f53990h);
        String string4 = Arrays.toString(this.f53989g);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 71 + String.valueOf(string2).length() + String.valueOf(string3).length() + String.valueOf(string4).length());
        sb2.append("ChunkIndex(length=");
        sb2.append(i10);
        sb2.append(", sizes=");
        sb2.append(string);
        sb2.append(", offsets=");
        sb2.append(string2);
        sb2.append(", timeUs=");
        sb2.append(string3);
        sb2.append(", durationsUs=");
        sb2.append(string4);
        sb2.append(")");
        return sb2.toString();
    }
}
