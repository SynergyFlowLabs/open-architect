package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d extends androidx.media3.extractor.metadata.scte35.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f67620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f67621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f67622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f67623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f67624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f67625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f67626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f67627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f67628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f67629m;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f67630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f67631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f67632c;

        private b(int i10, long j10, long j11) {
            this.f67630a = i10;
            this.f67631b = j10;
            this.f67632c = j11;
        }
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f67617a = j10;
        this.f67618b = z10;
        this.f67619c = z11;
        this.f67620d = z12;
        this.f67621e = z13;
        this.f67622f = j11;
        this.f67623g = j12;
        this.f67624h = Collections.unmodifiableList(list);
        this.f67625i = z14;
        this.f67626j = j13;
        this.f67627k = i10;
        this.f67628l = i11;
        this.f67629m = i12;
    }

    static d b(o0 o0Var, long j10, w0 w0Var) {
        List list;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int iL;
        int iL2;
        boolean z14;
        long jN = o0Var.N();
        boolean z15 = (o0Var.L() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jN2 = -9223372036854775807L;
        if (z15) {
            list = list2;
            j11 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            iL = 0;
            iL2 = 0;
        } else {
            int iL3 = o0Var.L();
            boolean z16 = (iL3 & 128) != 0;
            boolean z17 = (iL3 & 64) != 0;
            boolean z18 = (iL3 & 32) != 0;
            boolean z19 = (iL3 & 16) != 0;
            long jC = (!z17 || z19) ? -9223372036854775807L : g.c(o0Var, j10);
            if (!z17) {
                int iL4 = o0Var.L();
                ArrayList arrayList = new ArrayList(iL4);
                int i11 = 0;
                while (i11 < iL4) {
                    int iL5 = o0Var.L();
                    long jC2 = !z19 ? g.c(o0Var, j10) : -9223372036854775807L;
                    arrayList.add(new b(iL5, jC2, w0Var.b(jC2)));
                    i11++;
                    iL4 = iL4;
                }
                list2 = arrayList;
            }
            if (z18) {
                long jL = o0Var.L();
                boolean z20 = (128 & jL) != 0;
                jN2 = ((((jL & 1) << 32) | o0Var.N()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int iT = o0Var.T();
            long j12 = jC;
            j11 = jN2;
            jN2 = j12;
            iL = o0Var.L();
            iL2 = o0Var.L();
            i10 = iT;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new d(jN, z15, z10, z11, z12, jN2, w0Var.b(jN2), list, z13, j11, i10, iL, iL2);
    }

    @Override // androidx.media3.extractor.metadata.scte35.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f67622f + ", programSplicePlaybackPositionUs= " + this.f67623g + " }";
    }
}
