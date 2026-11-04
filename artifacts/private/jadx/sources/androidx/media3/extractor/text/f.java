package androidx.media3.extractor.text;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z;
import com.google.common.collect.a9;
import com.google.common.collect.l6;
import com.google.common.collect.o7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class f implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f68520c = "CuesWithTimingSubtitle";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a9<d> f68521d = a9.z().D(new com.google.common.base.t() { // from class: androidx.media3.extractor.text.e
        @Override // com.google.common.base.t
        public final Object apply(Object obj) {
            return Long.valueOf(f.d(((d) obj).f68445b));
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l6<l6<androidx.media3.common.text.a>> f68522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f68523b;

    /* JADX WARN: Code duplicated, block: B:24:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    public f(List<d> list) {
        if (list.size() == 1) {
            d dVar = (d) o7.z(list);
            long jD = d(dVar.f68445b);
            if (dVar.f68446c == -9223372036854775807L) {
                this.f68522a = l6.G(dVar.f68444a);
                this.f68523b = new long[]{jD};
                return;
            } else {
                this.f68522a = l6.J(dVar.f68444a, l6.F());
                this.f68523b = new long[]{jD, dVar.f68446c + jD};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f68523b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        l6 l6VarW = l6.W(f68521d, list);
        int i10 = 0;
        for (int i11 = 0; i11 < l6VarW.size(); i11++) {
            d dVar2 = (d) l6VarW.get(i11);
            long jD2 = d(dVar2.f68445b);
            long j10 = dVar2.f68446c + jD2;
            if (i10 != 0) {
                int i12 = i10 - 1;
                long j11 = this.f68523b[i12];
                if (j11 < jD2) {
                    this.f68523b[i10] = jD2;
                    arrayList.add(dVar2.f68444a);
                    i10++;
                } else if (j11 == jD2 && ((l6) arrayList.get(i12)).isEmpty()) {
                    arrayList.set(i12, dVar2.f68444a);
                } else {
                    z.n(f68520c, "Truncating unsupported overlapping cues.");
                    this.f68523b[i12] = jD2;
                    arrayList.set(i12, dVar2.f68444a);
                }
            } else {
                this.f68523b[i10] = jD2;
                arrayList.add(dVar2.f68444a);
                i10++;
            }
            if (dVar2.f68446c != -9223372036854775807L) {
                this.f68523b[i10] = j10;
                arrayList.add(l6.F());
                i10++;
            }
        }
        this.f68522a = l6.w(arrayList);
    }

    private static long d(long j10) {
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        return j10;
    }

    @Override // androidx.media3.extractor.text.j
    public long b(int i10) {
        androidx.media3.common.util.a.a(i10 < this.f68522a.size());
        return this.f68523b[i10];
    }

    @Override // androidx.media3.extractor.text.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public l6<androidx.media3.common.text.a> n(long j10) {
        int iN = k1.n(this.f68523b, j10, true, false);
        return iN == -1 ? l6.F() : this.f68522a.get(iN);
    }

    @Override // androidx.media3.extractor.text.j
    public int k() {
        return this.f68522a.size();
    }

    @Override // androidx.media3.extractor.text.j
    public int l(long j10) {
        int iJ = k1.j(this.f68523b, j10, false, false);
        if (iJ < this.f68522a.size()) {
            return iJ;
        }
        return -1;
    }
}
