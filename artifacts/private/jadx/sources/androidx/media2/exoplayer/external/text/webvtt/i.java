package androidx.media2.exoplayer.external.text.webvtt;

import android.text.SpannableStringBuilder;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class i implements androidx.media2.exoplayer.external.text.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e> f57033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f57034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f57035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f57036d;

    public i(List<e> cues) {
        this.f57033a = cues;
        int size = cues.size();
        this.f57034b = size;
        this.f57035c = new long[size * 2];
        int i10 = 7 ^ 0;
        for (int i11 = 0; i11 < this.f57034b; i11++) {
            e eVar = cues.get(i11);
            int i12 = i11 * 2;
            long[] jArr = this.f57035c;
            jArr[i12] = eVar.f56977p2;
            jArr[i12 + 1] = eVar.f56976g3;
        }
        long[] jArr2 = this.f57035c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f57036d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public long b(int index) {
        androidx.media2.exoplayer.external.util.a.a(index >= 0);
        androidx.media2.exoplayer.external.util.a.a(index < this.f57036d.length);
        return this.f57036d[index];
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public int k() {
        return this.f57036d.length;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public int l(long timeUs) {
        int iE = q0.e(this.f57036d, timeUs, false, false);
        if (iE < this.f57036d.length) {
            return iE;
        }
        return -1;
    }

    @Override // androidx.media2.exoplayer.external.text.e
    public List<androidx.media2.exoplayer.external.text.b> n(long timeUs) {
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 7 ^ 0;
        ArrayList arrayList = null;
        e eVar = null;
        for (int i11 = 0; i11 < this.f57034b; i11++) {
            long[] jArr = this.f57035c;
            int i12 = i11 * 2;
            if (jArr[i12] <= timeUs && timeUs < jArr[i12 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                e eVar2 = this.f57033a.get(i11);
                if (!eVar2.k()) {
                    arrayList.add(eVar2);
                } else if (eVar == null) {
                    eVar = eVar2;
                } else if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(eVar.f56544a).append((CharSequence) "\n").append(eVar2.f56544a);
                } else {
                    spannableStringBuilder.append((CharSequence) "\n").append(eVar2.f56544a);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new e(spannableStringBuilder));
        } else if (eVar != null) {
            arrayList.add(eVar);
        }
        return arrayList != null ? arrayList : Collections.EMPTY_LIST;
    }
}
