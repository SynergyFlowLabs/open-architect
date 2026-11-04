package androidx.media3.exoplayer.text;

import com.google.common.base.t;
import com.google.common.collect.a9;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a9<androidx.media3.extractor.text.d> f65614b = a9.z().D(new t() { // from class: androidx.media3.exoplayer.text.c
        @Override // com.google.common.base.t
        public final Object apply(Object obj) {
            return Long.valueOf(((androidx.media3.extractor.text.d) obj).f68445b);
        }
    }).e(a9.z().E().D(new t() { // from class: androidx.media3.exoplayer.text.d
        @Override // com.google.common.base.t
        public final Object apply(Object obj) {
            return Long.valueOf(((androidx.media3.extractor.text.d) obj).f68446c);
        }
    }));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<androidx.media3.extractor.text.d> f65615a = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.text.a
    public l6<androidx.media3.common.text.a> a(long j10) {
        if (!this.f65615a.isEmpty()) {
            if (j10 >= this.f65615a.get(0).f68445b) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f65615a.size(); i10++) {
                    androidx.media3.extractor.text.d dVar = this.f65615a.get(i10);
                    if (j10 >= dVar.f68445b && j10 < dVar.f68447d) {
                        arrayList.add(dVar);
                    }
                    if (j10 < dVar.f68445b) {
                        break;
                    }
                }
                l6 l6VarW = l6.W(f65614b, arrayList);
                l6.a aVarS = l6.s();
                for (int i11 = 0; i11 < l6VarW.size(); i11++) {
                    aVarS.c(((androidx.media3.extractor.text.d) l6VarW.get(i11)).f68444a);
                }
                return aVarS.e();
            }
        }
        return l6.F();
    }

    @Override // androidx.media3.exoplayer.text.a
    public long b(long j10) {
        long jMin = -9223372036854775807L;
        for (int i10 = 0; i10 < this.f65615a.size(); i10++) {
            long j11 = this.f65615a.get(i10).f68445b;
            long j12 = this.f65615a.get(i10).f68447d;
            if (j10 < j11) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j11);
                    break;
                }
                jMin = j11;
                break;
            }
            if (j10 < j12) {
                jMin = jMin == -9223372036854775807L ? j12 : Math.min(jMin, j12);
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.a
    public void c(long j10) {
        int i10 = 0;
        while (i10 < this.f65615a.size()) {
            long j11 = this.f65615a.get(i10).f68445b;
            if (j10 > j11 && j10 > this.f65615a.get(i10).f68447d) {
                this.f65615a.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }

    @Override // androidx.media3.exoplayer.text.a
    public void clear() {
        this.f65615a.clear();
    }

    @Override // androidx.media3.exoplayer.text.a
    public boolean d(androidx.media3.extractor.text.d dVar, long j10) {
        androidx.media3.common.util.a.a(dVar.f68445b != -9223372036854775807L);
        androidx.media3.common.util.a.a(dVar.f68446c != -9223372036854775807L);
        boolean z10 = dVar.f68445b <= j10 && j10 < dVar.f68447d;
        for (int size = this.f65615a.size() - 1; size >= 0; size--) {
            if (dVar.f68445b >= this.f65615a.get(size).f68445b) {
                this.f65615a.add(size + 1, dVar);
                return z10;
            }
        }
        this.f65615a.add(0, dVar);
        return z10;
    }

    @Override // androidx.media3.exoplayer.text.a
    public long e(long j10) {
        if (this.f65615a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < this.f65615a.get(0).f68445b) {
            return -9223372036854775807L;
        }
        long jMax = this.f65615a.get(0).f68445b;
        for (int i10 = 0; i10 < this.f65615a.size(); i10++) {
            long j11 = this.f65615a.get(i10).f68445b;
            long j12 = this.f65615a.get(i10).f68447d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }
}
