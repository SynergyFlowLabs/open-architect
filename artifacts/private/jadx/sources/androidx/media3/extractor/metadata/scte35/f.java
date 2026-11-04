package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class f extends androidx.media3.extractor.metadata.scte35.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f67633a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f67634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f67635b;

        private b(int i10, long j10) {
            this.f67634a = i10;
            this.f67635b = j10;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f67636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f67637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f67638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f67639d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f67640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f67641f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f67642g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f67643h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f67644i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f67645j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f67646k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f67636a = j10;
            this.f67637b = z10;
            this.f67638c = z11;
            this.f67639d = z12;
            this.f67641f = Collections.unmodifiableList(list);
            this.f67640e = j11;
            this.f67642g = z13;
            this.f67643h = j12;
            this.f67644i = i10;
            this.f67645j = i11;
            this.f67646k = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(o0 o0Var) {
            ArrayList arrayList;
            boolean z10;
            boolean z11;
            long j10;
            boolean z12;
            long j11;
            int i10;
            int i11;
            int iL;
            boolean z13;
            long jN;
            long jN2 = o0Var.N();
            boolean z14 = true;
            if ((o0Var.L() & 128) == 0) {
                z14 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                z11 = false;
                j10 = -9223372036854775807L;
                z12 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iL = 0;
            } else {
                int iL2 = o0Var.L();
                boolean z15 = (iL2 & 128) != 0;
                boolean z16 = (iL2 & 64) != 0 ? z14 : false;
                boolean z17 = (iL2 & 32) != 0 ? z14 : false;
                long jN3 = z16 ? o0Var.N() : -9223372036854775807L;
                if (!z16) {
                    int iL3 = o0Var.L();
                    ArrayList arrayList3 = new ArrayList(iL3);
                    int i12 = 0;
                    while (i12 < iL3) {
                        arrayList3.add(new b(o0Var.L(), o0Var.N()));
                        i12++;
                        iL3 = iL3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long jL = o0Var.L();
                    boolean z18 = (128 & jL) != 0;
                    jN = ((((jL & 1) << 32) | o0Var.N()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    jN = -9223372036854775807L;
                }
                int iT = o0Var.T();
                int iL4 = o0Var.L();
                boolean z19 = z15;
                z12 = z13;
                z10 = z19;
                iL = o0Var.L();
                long j12 = jN3;
                i10 = iT;
                i11 = iL4;
                long j13 = jN;
                arrayList = arrayList2;
                z11 = z16;
                j10 = j12;
                j11 = j13;
            }
            return new c(jN2, z14, z10, z11, arrayList, j10, z12, j11, i10, i11, iL);
        }
    }

    private f(List<c> list) {
        this.f67633a = Collections.unmodifiableList(list);
    }

    static f b(o0 o0Var) {
        int iL = o0Var.L();
        ArrayList arrayList = new ArrayList(iL);
        boolean z10 = false | false;
        for (int i10 = 0; i10 < iL; i10++) {
            arrayList.add(c.b(o0Var));
        }
        return new f(arrayList);
    }
}
