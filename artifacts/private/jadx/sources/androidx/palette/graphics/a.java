package androidx.palette.graphics;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.p0;
import androidx.core.graphics.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f72831g = "ColorCutQuantizer";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f72832h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f72833i = -3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f72834j = -2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f72835k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f72836l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f72837m = 31;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Comparator<b> f72838n = new C0690a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f72839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f72840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<androidx.palette.graphics.b.e> f72841c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.palette.graphics.b.c[] f72843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f72844f = new float[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    final TimingLogger f72842d = null;

    /* JADX INFO: renamed from: androidx.palette.graphics.a$a, reason: collision with other inner class name */
    static class C0690a implements Comparator<b> {
        C0690a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f72845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f72846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f72847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f72848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f72849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f72850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f72851g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f72852h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f72853i;

        b(int i10, int i11) {
            this.f72845a = i10;
            this.f72846b = i11;
            c();
        }

        final boolean a() {
            return e() > 1;
        }

        final int b() {
            int iF = f();
            a aVar = a.this;
            int[] iArr = aVar.f72839a;
            int[] iArr2 = aVar.f72840b;
            a.e(iArr, iF, this.f72845a, this.f72846b);
            Arrays.sort(iArr, this.f72845a, this.f72846b + 1);
            a.e(iArr, iF, this.f72845a, this.f72846b);
            int i10 = this.f72847c / 2;
            int i11 = this.f72845a;
            int i12 = 0;
            int i13 = 6 >> 0;
            while (true) {
                int i14 = this.f72846b;
                if (i11 > i14) {
                    return this.f72845a;
                }
                i12 += iArr2[iArr[i11]];
                if (i12 >= i10) {
                    return Math.min(i14 - 1, i11);
                }
                i11++;
            }
        }

        final void c() {
            a aVar = a.this;
            int[] iArr = aVar.f72839a;
            int[] iArr2 = aVar.f72840b;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = 0;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = this.f72845a; i17 <= this.f72846b; i17++) {
                int i18 = iArr[i17];
                i14 += iArr2[i18];
                int iK = a.k(i18);
                int iJ = a.j(i18);
                int i19 = a.i(i18);
                if (iK > i11) {
                    i11 = iK;
                }
                if (iK < i10) {
                    i10 = iK;
                }
                if (iJ > i12) {
                    i12 = iJ;
                }
                if (iJ < i15) {
                    i15 = iJ;
                }
                if (i19 > i13) {
                    i13 = i19;
                }
                if (i19 < i16) {
                    i16 = i19;
                }
            }
            this.f72848d = i10;
            this.f72849e = i11;
            this.f72850f = i15;
            this.f72851g = i12;
            this.f72852h = i16;
            this.f72853i = i13;
            this.f72847c = i14;
        }

        final androidx.palette.graphics.b.e d() {
            a aVar = a.this;
            int[] iArr = aVar.f72839a;
            int[] iArr2 = aVar.f72840b;
            int iK = 0;
            int i10 = 0;
            int iJ = 0;
            int i11 = 0;
            for (int i12 = this.f72845a; i12 <= this.f72846b; i12++) {
                int i13 = iArr[i12];
                int i14 = iArr2[i13];
                i10 += i14;
                iK += a.k(i13) * i14;
                iJ += a.j(i13) * i14;
                i11 += i14 * a.i(i13);
            }
            float f10 = i10;
            return new androidx.palette.graphics.b.e(a.b(Math.round(iK / f10), Math.round(iJ / f10), Math.round(i11 / f10)), i10);
        }

        final int e() {
            return (this.f72846b + 1) - this.f72845a;
        }

        final int f() {
            int i10 = this.f72849e - this.f72848d;
            int i11 = this.f72851g - this.f72850f;
            int i12 = this.f72853i - this.f72852h;
            if (i10 < i11 || i10 < i12) {
                return (i11 < i10 || i11 < i12) ? -1 : -2;
            }
            return -3;
        }

        final int g() {
            return ((this.f72849e - this.f72848d) + 1) * ((this.f72851g - this.f72850f) + 1) * ((this.f72853i - this.f72852h) + 1);
        }

        final b h() {
            if (!a()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iB = b();
            b bVar = a.this.new b(iB + 1, this.f72846b);
            this.f72846b = iB;
            c();
            return bVar;
        }
    }

    a(int[] iArr, int i10, androidx.palette.graphics.b.c[] cVarArr) {
        this.f72843e = cVarArr;
        int[] iArr2 = new int[32768];
        this.f72840b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int iG = g(iArr[i11]);
            iArr[i11] = iG;
            iArr2[iG] = iArr2[iG] + 1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 32768; i13++) {
            if (iArr2[i13] > 0 && l(i13)) {
                iArr2[i13] = 0;
            }
            if (iArr2[i13] > 0) {
                i12++;
            }
        }
        int[] iArr3 = new int[i12];
        this.f72839a = iArr3;
        int i14 = 0;
        for (int i15 = 0; i15 < 32768; i15++) {
            if (iArr2[i15] > 0) {
                iArr3[i14] = i15;
                i14++;
            }
        }
        if (i12 > i10) {
            this.f72841c = h(i10);
            return;
        }
        this.f72841c = new ArrayList();
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = iArr3[i16];
            this.f72841c.add(new androidx.palette.graphics.b.e(a(i17), iArr2[i17]));
        }
    }

    private static int a(int i10) {
        return b(k(i10), j(i10), i(i10));
    }

    static int b(int i10, int i11, int i12) {
        return Color.rgb(f(i10, 5, 8), f(i11, 5, 8), f(i12, 5, 8));
    }

    private List<androidx.palette.graphics.b.e> c(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<b> it = collection.iterator();
        while (it.hasNext()) {
            androidx.palette.graphics.b.e eVarD = it.next().d();
            if (!n(eVarD)) {
                arrayList.add(eVarD);
            }
        }
        return arrayList;
    }

    static void e(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = i(i13) | (j(i13) << 10) | (k(i13) << 5);
                i11++;
            }
            return;
        }
        if (i10 != -1) {
            return;
        }
        while (i11 <= i12) {
            int i14 = iArr[i11];
            iArr[i11] = k(i14) | (i(i14) << 10) | (j(i14) << 5);
            i11++;
        }
    }

    private static int f(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    private static int g(int i10) {
        return f(Color.blue(i10), 8, 5) | (f(Color.red(i10), 8, 5) << 10) | (f(Color.green(i10), 8, 5) << 5);
    }

    private List<androidx.palette.graphics.b.e> h(int i10) {
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(i10, f72838n);
        priorityQueue.offer(new b(0, this.f72839a.length - 1));
        o(priorityQueue, i10);
        return c(priorityQueue);
    }

    static int i(int i10) {
        return i10 & 31;
    }

    static int j(int i10) {
        return (i10 >> 5) & 31;
    }

    static int k(int i10) {
        return (i10 >> 10) & 31;
    }

    private boolean l(int i10) {
        int iA = a(i10);
        h.q(iA, this.f72844f);
        return m(iA, this.f72844f);
    }

    private boolean m(int i10, float[] fArr) {
        androidx.palette.graphics.b.c[] cVarArr = this.f72843e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (!this.f72843e[i11].a(i10, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean n(androidx.palette.graphics.b.e eVar) {
        return m(eVar.e(), eVar.c());
    }

    private void o(PriorityQueue<b> priorityQueue, int i10) {
        b bVarPoll;
        while (priorityQueue.size() < i10 && (bVarPoll = priorityQueue.poll()) != null && bVarPoll.a()) {
            priorityQueue.offer(bVarPoll.h());
            priorityQueue.offer(bVarPoll);
        }
    }

    List<androidx.palette.graphics.b.e> d() {
        return this.f72841c;
    }
}
