package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<d> f74332a = new a();

    class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f74335a - dVar2.f74335a;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract boolean b(int i10, int i11);

        @p0
        public Object c(int i10, int i11) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f74333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f74334b;

        c(int i10) {
            int[] iArr = new int[i10];
            this.f74333a = iArr;
            this.f74334b = iArr.length / 2;
        }

        int[] a() {
            return this.f74333a;
        }

        public void b(int i10) {
            Arrays.fill(this.f74333a, i10);
        }

        int c(int i10) {
            return this.f74333a[i10 + this.f74334b];
        }

        void d(int i10, int i11) {
            this.f74333a[i10 + this.f74334b] = i11;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f74335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f74336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f74337c;

        d(int i10, int i11, int i12) {
            this.f74335a = i10;
            this.f74336b = i11;
            this.f74337c = i12;
        }

        int a() {
            return this.f74335a + this.f74337c;
        }

        int b() {
            return this.f74336b + this.f74337c;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f74338h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f74339i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f74340j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f74341k = 4;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f74342l = 8;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f74343m = 12;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f74344n = 4;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f74345o = 15;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d> f74346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f74347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f74348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f74349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f74350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f74351f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f74352g;

        e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z10) {
            this.f74346a = list;
            this.f74347b = iArr;
            this.f74348c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f74349d = bVar;
            this.f74350e = bVar.e();
            this.f74351f = bVar.d();
            this.f74352g = z10;
            a();
            g();
        }

        private void a() {
            d dVar = this.f74346a.isEmpty() ? null : this.f74346a.get(0);
            if (dVar == null || dVar.f74335a != 0 || dVar.f74336b != 0) {
                this.f74346a.add(0, new d(0, 0, 0));
            }
            this.f74346a.add(new d(this.f74350e, this.f74351f, 0));
        }

        private void f(int i10) {
            int size = this.f74346a.size();
            int iB = 0;
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = this.f74346a.get(i11);
                while (iB < dVar.f74336b) {
                    if (this.f74348c[iB] == 0 && this.f74349d.b(i10, iB)) {
                        int i12 = this.f74349d.a(i10, iB) ? 8 : 4;
                        this.f74347b[i10] = (iB << 4) | i12;
                        this.f74348c[iB] = (i10 << 4) | i12;
                        return;
                    }
                    iB++;
                }
                iB = dVar.b();
            }
        }

        private void g() {
            for (d dVar : this.f74346a) {
                for (int i10 = 0; i10 < dVar.f74337c; i10++) {
                    int i11 = dVar.f74335a + i10;
                    int i12 = dVar.f74336b + i10;
                    int i13 = this.f74349d.a(i11, i12) ? 1 : 2;
                    this.f74347b[i11] = (i12 << 4) | i13;
                    this.f74348c[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f74352g) {
                h();
            }
        }

        private void h() {
            int iA = 0;
            for (d dVar : this.f74346a) {
                while (iA < dVar.f74335a) {
                    if (this.f74347b[iA] == 0) {
                        f(iA);
                    }
                    iA++;
                }
                iA = dVar.a();
            }
        }

        @p0
        private static g i(Collection<g> collection, int i10, boolean z10) {
            g next;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f74353a == i10 && next.f74355c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next2 = it.next();
                if (z10) {
                    next2.f74354b--;
                } else {
                    next2.f74354b++;
                }
            }
            return next;
        }

        public int b(@androidx.annotation.g0(from = 0) int i10) {
            if (i10 >= 0 && i10 < this.f74351f) {
                int i11 = this.f74348c[i10];
                if ((i11 & 15) == 0) {
                    return -1;
                }
                return i11 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i10 + ", new list size = " + this.f74351f);
        }

        public int c(@androidx.annotation.g0(from = 0) int i10) {
            if (i10 >= 0 && i10 < this.f74350e) {
                int i11 = this.f74347b[i10];
                if ((i11 & 15) == 0) {
                    return -1;
                }
                return i11 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i10 + ", old list size = " + this.f74350e);
        }

        public void d(@NonNull v vVar) {
            int i10;
            androidx.recyclerview.widget.f fVar = vVar instanceof androidx.recyclerview.widget.f ? (androidx.recyclerview.widget.f) vVar : new androidx.recyclerview.widget.f(vVar);
            int i11 = this.f74350e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f74350e;
            int i13 = this.f74351f;
            for (int size = this.f74346a.size() - 1; size >= 0; size--) {
                d dVar = this.f74346a.get(size);
                int iA = dVar.a();
                int iB = dVar.b();
                while (true) {
                    if (i12 <= iA) {
                        break;
                    }
                    i12--;
                    int i14 = this.f74347b[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        g gVarI = i(arrayDeque, i15, false);
                        if (gVarI != null) {
                            int i16 = (i11 - gVarI.f74354b) - 1;
                            fVar.d(i12, i16);
                            if ((i14 & 4) != 0) {
                                fVar.a(i16, 1, this.f74349d.c(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new g(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        fVar.c(i12, 1);
                        i11--;
                    }
                }
                while (i13 > iB) {
                    i13--;
                    int i17 = this.f74348c[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        g gVarI2 = i(arrayDeque, i18, true);
                        if (gVarI2 == null) {
                            arrayDeque.add(new g(i13, i11 - i12, false));
                        } else {
                            fVar.d((i11 - gVarI2.f74354b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                fVar.a(i12, 1, this.f74349d.c(i18, i13));
                            }
                        }
                    } else {
                        fVar.b(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar.f74335a;
                int i20 = dVar.f74336b;
                for (i10 = 0; i10 < dVar.f74337c; i10++) {
                    if ((this.f74347b[i19] & 15) == 2) {
                        fVar.a(i19, 1, this.f74349d.c(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar.f74335a;
                i13 = dVar.f74336b;
            }
            fVar.e();
        }

        public void e(@NonNull RecyclerView.h hVar) {
            d(new androidx.recyclerview.widget.b(hVar));
        }
    }

    public static abstract class f<T> {
        public abstract boolean a(@NonNull T t10, @NonNull T t11);

        public abstract boolean b(@NonNull T t10, @NonNull T t11);

        @p0
        public Object c(@NonNull T t10, @NonNull T t11) {
            return null;
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f74353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f74354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f74355c;

        g(int i10, int i11, boolean z10) {
            this.f74353a = i10;
            this.f74354b = i11;
            this.f74355c = z10;
        }
    }

    static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f74356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f74357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f74358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f74359d;

        public h() {
        }

        int a() {
            return this.f74359d - this.f74358c;
        }

        int b() {
            return this.f74357b - this.f74356a;
        }

        public h(int i10, int i11, int i12, int i13) {
            this.f74356a = i10;
            this.f74357b = i11;
            this.f74358c = i12;
            this.f74359d = i13;
        }
    }

    static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f74360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f74361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f74362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f74363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74364e;

        i() {
        }

        int a() {
            return Math.min(this.f74362c - this.f74360a, this.f74363d - this.f74361b);
        }

        boolean b() {
            return this.f74363d - this.f74361b != this.f74362c - this.f74360a;
        }

        boolean c() {
            return this.f74363d - this.f74361b > this.f74362c - this.f74360a;
        }

        @NonNull
        d d() {
            if (!b()) {
                int i10 = this.f74360a;
                return new d(i10, this.f74361b, this.f74362c - i10);
            }
            if (this.f74364e) {
                return new d(this.f74360a, this.f74361b, a());
            }
            return c() ? new d(this.f74360a, this.f74361b + 1, a()) : new d(this.f74360a + 1, this.f74361b, a());
        }
    }

    private k() {
    }

    @p0
    private static i a(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int iC;
        int i11;
        int i12;
        boolean z10 = (hVar.b() - hVar.a()) % 2 == 0;
        int iB = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar2.c(i14 + 1) < cVar2.c(i14 - 1))) {
                iC = cVar2.c(i14 + 1);
                i11 = iC;
            } else {
                iC = cVar2.c(i14 - 1);
                i11 = iC - 1;
            }
            int i15 = hVar.f74359d - ((hVar.f74357b - i11) - i14);
            int i16 = (i10 == 0 || i11 != iC) ? i15 : i15 + 1;
            while (i11 > hVar.f74356a && i15 > hVar.f74358c && bVar.b(i11 - 1, i15 - 1)) {
                i11--;
                i15--;
            }
            cVar2.d(i14, i11);
            if (z10 && (i12 = iB - i14) >= i13 && i12 <= i10 && cVar.c(i12) >= i11) {
                i iVar = new i();
                iVar.f74360a = i11;
                iVar.f74361b = i15;
                iVar.f74362c = iC;
                iVar.f74363d = i16;
                iVar.f74364e = true;
                return iVar;
            }
        }
        return null;
    }

    @NonNull
    public static e b(@NonNull b bVar) {
        return c(bVar, true);
    }

    @NonNull
    public static e c(@NonNull b bVar, boolean z10) {
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 6 << 0;
        arrayList2.add(new h(0, iE, 0, iD));
        int i11 = ((((iE + iD) + 1) / 2) * 2) + 1;
        c cVar = new c(i11);
        c cVar2 = new c(i11);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            i iVarE = e(hVar, bVar, cVar, cVar2);
            if (iVarE != null) {
                if (iVarE.a() > 0) {
                    arrayList.add(iVarE.d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f74356a = hVar.f74356a;
                hVar2.f74358c = hVar.f74358c;
                hVar2.f74357b = iVarE.f74360a;
                hVar2.f74359d = iVarE.f74361b;
                arrayList2.add(hVar2);
                hVar.f74357b = hVar.f74357b;
                hVar.f74359d = hVar.f74359d;
                hVar.f74356a = iVarE.f74362c;
                hVar.f74358c = iVarE.f74363d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f74332a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z10);
    }

    @p0
    private static i d(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int iC;
        int i11;
        int i12;
        boolean z10 = Math.abs(hVar.b() - hVar.a()) % 2 == 1;
        int iB = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar.c(i14 + 1) > cVar.c(i14 - 1))) {
                iC = cVar.c(i14 + 1);
                i11 = iC;
            } else {
                iC = cVar.c(i14 - 1);
                i11 = iC + 1;
            }
            int i15 = (hVar.f74358c + (i11 - hVar.f74356a)) - i14;
            int i16 = (i10 == 0 || i11 != iC) ? i15 : i15 - 1;
            while (i11 < hVar.f74357b && i15 < hVar.f74359d && bVar.b(i11, i15)) {
                i11++;
                i15++;
            }
            cVar.d(i14, i11);
            if (z10 && (i12 = iB - i14) >= i13 + 1 && i12 <= i10 - 1 && cVar2.c(i12) <= i11) {
                i iVar = new i();
                iVar.f74360a = iC;
                iVar.f74361b = i16;
                iVar.f74362c = i11;
                iVar.f74363d = i15;
                iVar.f74364e = false;
                return iVar;
            }
        }
        return null;
    }

    @p0
    private static i e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int iB = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.d(1, hVar.f74356a);
            cVar2.d(1, hVar.f74357b);
            for (int i10 = 0; i10 < iB; i10++) {
                i iVarD = d(hVar, bVar, cVar, cVar2, i10);
                if (iVarD != null) {
                    return iVarD;
                }
                i iVarA = a(hVar, bVar, cVar, cVar2, i10);
                if (iVarA != null) {
                    return iVarA;
                }
            }
        }
        return null;
    }
}
