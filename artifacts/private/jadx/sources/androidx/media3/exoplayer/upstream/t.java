package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.b1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<b> f66159h = new Comparator() { // from class: androidx.media3.exoplayer.upstream.r
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return t.b((t.b) obj, (t.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<b> f66160i = new Comparator() { // from class: androidx.media3.exoplayer.upstream.s
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((t.b) obj).f66174c, ((t.b) obj2).f66174c);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f66161j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f66162k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f66163l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f66164m = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f66165a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f66170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f66171g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f66167c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f66166b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66168d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f66172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f66173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f66174c;

        private b() {
        }
    }

    public t(int i10) {
        this.f66165a = i10;
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f66172a - bVar2.f66172a;
    }

    private void d() {
        if (this.f66168d != 1) {
            Collections.sort(this.f66166b, f66159h);
            this.f66168d = 1;
        }
    }

    private void e() {
        if (this.f66168d != 0) {
            Collections.sort(this.f66166b, f66160i);
            this.f66168d = 0;
        }
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f66171g;
        if (i11 > 0) {
            b[] bVarArr = this.f66167c;
            int i12 = i11 - 1;
            this.f66171g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f66169e;
        this.f66169e = i13 + 1;
        bVar.f66172a = i13;
        bVar.f66173b = i10;
        bVar.f66174c = f10;
        this.f66166b.add(bVar);
        this.f66170f += i10;
        while (true) {
            int i14 = this.f66170f;
            int i15 = this.f66165a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = this.f66166b.get(0);
            int i17 = bVar2.f66173b;
            if (i17 <= i16) {
                this.f66170f -= i17;
                this.f66166b.remove(0);
                int i18 = this.f66171g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f66167c;
                    this.f66171g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f66173b = i17 - i16;
                this.f66170f -= i16;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f66170f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f66166b.size(); i11++) {
            b bVar = this.f66166b.get(i11);
            i10 += bVar.f66173b;
            if (i10 >= f11) {
                return bVar.f66174c;
            }
        }
        if (this.f66166b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f66166b;
        return arrayList.get(arrayList.size() - 1).f66174c;
    }

    public void g() {
        this.f66166b.clear();
        this.f66168d = -1;
        this.f66169e = 0;
        this.f66170f = 0;
    }
}
