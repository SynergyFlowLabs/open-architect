package androidx.media2.exoplayer.external.trackselection;

import android.os.SystemClock;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.source.TrackGroup;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final TrackGroup f57150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f57151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f57152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Format[] f57153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long[] f57154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f57155f;

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.trackselection.b$b, reason: collision with other inner class name */
    private static final class C0529b implements Comparator<Format> {
        private C0529b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Format a10, Format b10) {
            return b10.f53097e - a10.f53097e;
        }
    }

    public b(TrackGroup group, int... tracks) {
        int i10 = 0;
        androidx.media2.exoplayer.external.util.a.i(tracks.length > 0);
        this.f57150a = (TrackGroup) androidx.media2.exoplayer.external.util.a.g(group);
        int length = tracks.length;
        this.f57151b = length;
        this.f57153d = new Format[length];
        for (int i11 = 0; i11 < tracks.length; i11++) {
            this.f57153d[i11] = group.a(tracks[i11]);
        }
        Arrays.sort(this.f57153d, new C0529b());
        this.f57152c = new int[this.f57151b];
        while (true) {
            int i12 = this.f57151b;
            if (i10 >= i12) {
                this.f57154e = new long[i12];
                return;
            } else {
                this.f57152c[i10] = group.b(this.f57153d[i10]);
                i10++;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public final int b(int index) {
        return this.f57152c[index];
    }

    protected final boolean c(int index, long nowMs) {
        return this.f57154e[index] > nowMs;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public void d() {
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public void e() {
        l.a(this);
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f57150a == bVar.f57150a && Arrays.equals(this.f57152c, bVar.f57152c)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public final int f(int indexInTrackGroup) {
        for (int i10 = 0; i10 < this.f57151b; i10++) {
            if (this.f57152c[i10] == indexInTrackGroup) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public final TrackGroup g() {
        return this.f57150a;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public void h() {
    }

    public int hashCode() {
        if (this.f57155f == 0) {
            this.f57155f = (System.identityHashCode(this.f57150a) * 31) + Arrays.hashCode(this.f57152c);
        }
        return this.f57155f;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public int i(long playbackPositionUs, List<? extends androidx.media2.exoplayer.external.source.chunk.l> queue) {
        return queue.size();
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public final int j() {
        return this.f57152c[a()];
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public final Format k() {
        return this.f57153d[a()];
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public final Format l(int index) {
        return this.f57153d[index];
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public final int length() {
        return this.f57152c.length;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public void m(float playbackSpeed) {
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public void p(long j10, long j11, long j12, List list, androidx.media2.exoplayer.external.source.chunk.m[] mVarArr) {
        l.c(this, j10, j11, j12, list, mVarArr);
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public final boolean q(int index, long blacklistDurationMs) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zC = c(index, jElapsedRealtime);
        int i10 = 0;
        while (i10 < this.f57151b && !zC) {
            zC = (i10 == index || c(i10, jElapsedRealtime)) ? false : true;
            i10++;
        }
        if (!zC) {
            return false;
        }
        long[] jArr = this.f57154e;
        jArr[index] = Math.max(jArr[index], q0.a(jElapsedRealtime, blacklistDurationMs, Long.MAX_VALUE));
        return true;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public final int r(Format format) {
        for (int i10 = 0; i10 < this.f57151b; i10++) {
            if (this.f57153d[i10] == format) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.m
    public void s(long j10, long j11, long j12) {
        l.b(this, j10, j11, j12);
    }
}
