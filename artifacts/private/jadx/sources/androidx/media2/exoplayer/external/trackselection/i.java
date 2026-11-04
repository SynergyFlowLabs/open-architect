package androidx.media2.exoplayer.external.trackselection;

import android.util.Pair;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.source.TrackGroup;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import androidx.media2.exoplayer.external.source.z;
import androidx.media2.exoplayer.external.u0;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.v0;
import androidx.media2.exoplayer.external.z0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class i extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private a f57202c;

    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f57203h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f57204i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f57205j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f57206k = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public final int f57207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f57208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f57209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TrackGroupArray[] f57210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f57211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[][][] f57212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final TrackGroupArray f57213g;

        /* JADX INFO: renamed from: androidx.media2.exoplayer.external.trackselection.i$a$a, reason: collision with other inner class name */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @interface InterfaceC0530a {
        }

        a(int[] rendererTrackTypes, TrackGroupArray[] rendererTrackGroups, int[] rendererMixedMimeTypeAdaptiveSupports, int[][][] rendererFormatSupports, TrackGroupArray unmappedTrackGroups) {
            this.f57209c = rendererTrackTypes;
            this.f57210d = rendererTrackGroups;
            this.f57212f = rendererFormatSupports;
            this.f57211e = rendererMixedMimeTypeAdaptiveSupports;
            this.f57213g = unmappedTrackGroups;
            int length = rendererTrackTypes.length;
            this.f57208b = length;
            this.f57207a = length;
        }

        public int a(int rendererIndex, int groupIndex, boolean includeCapabilitiesExceededTracks) {
            int i10 = this.f57210d[rendererIndex].a(groupIndex).f55653a;
            int[] iArr = new int[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                int iH = h(rendererIndex, groupIndex, i12);
                if (iH == 4 || (includeCapabilitiesExceededTracks && iH == 3)) {
                    iArr[i11] = i12;
                    i11++;
                }
            }
            return b(rendererIndex, groupIndex, Arrays.copyOf(iArr, i11));
        }

        public int b(int rendererIndex, int groupIndex, int[] trackIndices) {
            int i10 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i11 = 0;
            while (i10 < trackIndices.length) {
                String str2 = this.f57210d[rendererIndex].a(groupIndex).a(trackIndices[i10]).f53103i;
                int i12 = i11 + 1;
                if (i11 == 0) {
                    str = str2;
                } else {
                    z10 |= !q0.b(str, str2);
                }
                iMin = Math.min(iMin, this.f57212f[rendererIndex][groupIndex][i10] & 24);
                i10++;
                i11 = i12;
            }
            return z10 ? Math.min(iMin, this.f57211e[rendererIndex]) : iMin;
        }

        public int c() {
            return this.f57208b;
        }

        public int d(int rendererIndex) {
            int i10;
            int iMax = 0;
            for (int[] iArr : this.f57212f[rendererIndex]) {
                for (int i11 : iArr) {
                    int i12 = i11 & 7;
                    if (i12 == 3) {
                        i10 = 2;
                    } else {
                        if (i12 == 4) {
                            return 3;
                        }
                        i10 = 1;
                    }
                    iMax = Math.max(iMax, i10);
                }
            }
            return iMax;
        }

        public int e(int rendererIndex) {
            return this.f57209c[rendererIndex];
        }

        @Deprecated
        public int f(int rendererIndex, int groupIndex, int trackIndex) {
            return h(rendererIndex, groupIndex, trackIndex);
        }

        public TrackGroupArray g(int rendererIndex) {
            return this.f57210d[rendererIndex];
        }

        public int h(int rendererIndex, int groupIndex, int trackIndex) {
            return this.f57212f[rendererIndex][groupIndex][trackIndex] & 7;
        }

        @Deprecated
        public int i(int trackType) {
            return j(trackType);
        }

        public int j(int trackType) {
            int iMax = 0;
            for (int i10 = 0; i10 < this.f57208b; i10++) {
                if (this.f57209c[i10] == trackType) {
                    iMax = Math.max(iMax, d(i10));
                }
            }
            return iMax;
        }

        @Deprecated
        public TrackGroupArray k() {
            return l();
        }

        public TrackGroupArray l() {
            return this.f57213g;
        }
    }

    private static int f(u0[] rendererCapabilities, TrackGroup group) throws androidx.media2.exoplayer.external.i {
        int length = rendererCapabilities.length;
        int i10 = 0;
        for (int i11 = 0; i11 < rendererCapabilities.length; i11++) {
            u0 u0Var = rendererCapabilities[i11];
            for (int i12 = 0; i12 < group.f55653a; i12++) {
                int iB = u0Var.b(group.a(i12)) & 7;
                if (iB > i10) {
                    if (iB == 4) {
                        return i11;
                    }
                    length = i11;
                    i10 = iB;
                }
            }
        }
        return length;
    }

    private static int[] h(u0 rendererCapabilities, TrackGroup group) throws androidx.media2.exoplayer.external.i {
        int[] iArr = new int[group.f55653a];
        for (int i10 = 0; i10 < group.f55653a; i10++) {
            iArr[i10] = rendererCapabilities.b(group.a(i10));
        }
        return iArr;
    }

    private static int[] i(u0[] rendererCapabilities) throws androidx.media2.exoplayer.external.i {
        int length = rendererCapabilities.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = rendererCapabilities[i10].l();
        }
        return iArr;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.r
    public final void d(Object info) {
        this.f57202c = (a) info;
    }

    @Override // androidx.media2.exoplayer.external.trackselection.r
    public final s e(u0[] rendererCapabilities, TrackGroupArray trackGroups, z.a periodId, z0 timeline) throws androidx.media2.exoplayer.external.i {
        int[] iArr = new int[rendererCapabilities.length + 1];
        int length = rendererCapabilities.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr2 = new int[rendererCapabilities.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = trackGroups.f55657a;
            trackGroupArr[i10] = new TrackGroup[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrI = i(rendererCapabilities);
        for (int i12 = 0; i12 < trackGroups.f55657a; i12++) {
            TrackGroup trackGroupA = trackGroups.a(i12);
            int iF = f(rendererCapabilities, trackGroupA);
            int[] iArrH = iF == rendererCapabilities.length ? new int[trackGroupA.f55653a] : h(rendererCapabilities[iF], trackGroupA);
            int i13 = iArr[iF];
            trackGroupArr[iF][i13] = trackGroupA;
            iArr2[iF][i13] = iArrH;
            iArr[iF] = i13 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilities.length];
        int[] iArr3 = new int[rendererCapabilities.length];
        for (int i14 = 0; i14 < rendererCapabilities.length; i14++) {
            int i15 = iArr[i14];
            trackGroupArrayArr[i14] = new TrackGroupArray((TrackGroup[]) q0.A0(trackGroupArr[i14], i15));
            iArr2[i14] = (int[][]) q0.A0(iArr2[i14], i15);
            iArr3[i14] = rendererCapabilities[i14].f();
        }
        a aVar = new a(iArr3, trackGroupArrayArr, iArrI, iArr2, new TrackGroupArray((TrackGroup[]) q0.A0(trackGroupArr[rendererCapabilities.length], iArr[rendererCapabilities.length])));
        Pair<v0[], m[]> pairJ = j(aVar, iArr2, iArrI);
        return new s((v0[]) pairJ.first, (m[]) pairJ.second, aVar);
    }

    @p0
    public final a g() {
        return this.f57202c;
    }

    protected abstract Pair<v0[], m[]> j(a mappedTrackInfo, int[][][] rendererFormatSupports, int[] rendererMixedMimeTypeAdaptationSupport) throws androidx.media2.exoplayer.external.i;
}
