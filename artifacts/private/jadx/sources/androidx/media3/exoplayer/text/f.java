package androidx.media3.exoplayer.text;

import com.google.common.collect.l6;
import com.google.common.collect.o7;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<androidx.media3.extractor.text.d> f65616a = new ArrayList<>();

    private int f(long j10) {
        for (int i10 = 0; i10 < this.f65616a.size(); i10++) {
            if (j10 < this.f65616a.get(i10).f68445b) {
                return i10;
            }
        }
        return this.f65616a.size();
    }

    @Override // androidx.media3.exoplayer.text.a
    public l6<androidx.media3.common.text.a> a(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return l6.F();
        }
        androidx.media3.extractor.text.d dVar = this.f65616a.get(iF - 1);
        long j11 = dVar.f68447d;
        return (j11 == -9223372036854775807L || j10 < j11) ? dVar.f68444a : l6.F();
    }

    @Override // androidx.media3.exoplayer.text.a
    public long b(long j10) {
        if (this.f65616a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < this.f65616a.get(0).f68445b) {
            return this.f65616a.get(0).f68445b;
        }
        for (int i10 = 1; i10 < this.f65616a.size(); i10++) {
            androidx.media3.extractor.text.d dVar = this.f65616a.get(i10);
            if (j10 < dVar.f68445b) {
                long j11 = this.f65616a.get(i10 - 1).f68447d;
                return (j11 == -9223372036854775807L || j11 <= j10 || j11 >= dVar.f68445b) ? dVar.f68445b : j11;
            }
        }
        long j12 = ((androidx.media3.extractor.text.d) o7.w(this.f65616a)).f68447d;
        if (j12 == -9223372036854775807L || j10 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    @Override // androidx.media3.exoplayer.text.a
    public void c(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return;
        }
        long j11 = this.f65616a.get(iF - 1).f68447d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            iF--;
        }
        this.f65616a.subList(0, iF).clear();
    }

    @Override // androidx.media3.exoplayer.text.a
    public void clear() {
        this.f65616a.clear();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // androidx.media3.exoplayer.text.a
    public boolean d(androidx.media3.extractor.text.d dVar, long j10) {
        boolean z10;
        androidx.media3.common.util.a.a(dVar.f68445b != -9223372036854775807L);
        if (dVar.f68445b <= j10) {
            long j11 = dVar.f68447d;
            if (j11 == -9223372036854775807L || j10 < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        for (int size = this.f65616a.size() - 1; size >= 0; size--) {
            if (dVar.f68445b >= this.f65616a.get(size).f68445b) {
                this.f65616a.add(size + 1, dVar);
                return z10;
            }
            if (this.f65616a.get(size).f68445b <= j10) {
                z10 = false;
            }
        }
        this.f65616a.add(0, dVar);
        return z10;
    }

    @Override // androidx.media3.exoplayer.text.a
    public long e(long j10) {
        if (this.f65616a.isEmpty() || j10 < this.f65616a.get(0).f68445b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < this.f65616a.size(); i10++) {
            long j11 = this.f65616a.get(i10).f68445b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                androidx.media3.extractor.text.d dVar = this.f65616a.get(i10 - 1);
                long j12 = dVar.f68447d;
                return (j12 == -9223372036854775807L || j12 > j10) ? dVar.f68445b : j12;
            }
        }
        androidx.media3.extractor.text.d dVar2 = (androidx.media3.extractor.text.d) o7.w(this.f65616a);
        long j13 = dVar2.f68447d;
        if (j13 != -9223372036854775807L && j10 >= j13) {
            return j13;
        }
        return dVar2.f68445b;
    }
}
