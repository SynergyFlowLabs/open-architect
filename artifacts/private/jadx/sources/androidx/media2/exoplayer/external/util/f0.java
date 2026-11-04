package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class f0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<b> f57532h = d0.f57523a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<b> f57533i = e0.f57530a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f57534j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f57535k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f57536l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f57537m = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f57538a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f57542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f57543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f57544g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f57540c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f57539b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f57541d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f57545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f57546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f57547c;

        private b() {
        }
    }

    public f0(int maxWeight) {
        this.f57538a = maxWeight;
    }

    private void b() {
        if (this.f57541d != 1) {
            Collections.sort(this.f57539b, f57532h);
            this.f57541d = 1;
        }
    }

    private void c() {
        if (this.f57541d != 0) {
            Collections.sort(this.f57539b, f57533i);
            this.f57541d = 0;
        }
    }

    static final /* synthetic */ int e(b bVar, b bVar2) {
        return bVar.f57545a - bVar2.f57545a;
    }

    public void a(int weight, float value) {
        b bVar;
        b();
        int i10 = this.f57544g;
        if (i10 > 0) {
            b[] bVarArr = this.f57540c;
            int i11 = i10 - 1;
            this.f57544g = i11;
            bVar = bVarArr[i11];
        } else {
            bVar = new b();
        }
        int i12 = this.f57542e;
        this.f57542e = i12 + 1;
        bVar.f57545a = i12;
        bVar.f57546b = weight;
        bVar.f57547c = value;
        this.f57539b.add(bVar);
        this.f57543f += weight;
        while (true) {
            int i13 = this.f57543f;
            int i14 = this.f57538a;
            if (i13 <= i14) {
                return;
            }
            int i15 = i13 - i14;
            b bVar2 = this.f57539b.get(0);
            int i16 = bVar2.f57546b;
            if (i16 <= i15) {
                this.f57543f -= i16;
                this.f57539b.remove(0);
                int i17 = this.f57544g;
                if (i17 < 5) {
                    b[] bVarArr2 = this.f57540c;
                    this.f57544g = i17 + 1;
                    bVarArr2[i17] = bVar2;
                }
            } else {
                bVar2.f57546b = i16 - i15;
                this.f57543f -= i15;
            }
        }
    }

    public float d(float percentile) {
        c();
        float f10 = percentile * this.f57543f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f57539b.size(); i11++) {
            b bVar = this.f57539b.get(i11);
            i10 += bVar.f57546b;
            if (i10 >= f10) {
                return bVar.f57547c;
            }
        }
        if (this.f57539b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f57539b;
        return arrayList.get(arrayList.size() - 1).f57547c;
    }

    public void g() {
        this.f57539b.clear();
        this.f57541d = -1;
        this.f57542e = 0;
        this.f57543f = 0;
    }
}
