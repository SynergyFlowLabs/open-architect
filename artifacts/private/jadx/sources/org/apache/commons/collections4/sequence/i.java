package org.apache.commons.collections4.sequence;

import java.util.List;
import org.apache.commons.collections4.m;

/* JADX INFO: loaded from: classes14.dex */
public class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<T> f336275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<T> f336276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m<? super T> f336277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f336278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f336279e;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f336280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f336281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f336282c;

        public a(int i10, int i11, int i12) {
            this.f336280a = i10;
            this.f336281b = i11;
            this.f336282c = i12;
        }

        public int a() {
            return this.f336282c;
        }

        public int b() {
            return this.f336281b;
        }

        public int c() {
            return this.f336280a;
        }
    }

    public i(List<T> list, List<T> list2) {
        this(list, list2, org.apache.commons.collections4.functors.m.c());
    }

    private void a(int i10, int i11, int i12, int i13, d<T> dVar) {
        a aVarC = c(i10, i11, i12, i13);
        if (aVarC != null && ((aVarC.c() != i11 || aVarC.a() != i11 - i13) && (aVarC.b() != i10 || aVarC.a() != i10 - i12))) {
            a(i10, aVarC.c(), i12, aVarC.c() - aVarC.a(), dVar);
            for (int iC = aVarC.c(); iC < aVarC.b(); iC++) {
                dVar.c(new f<>(this.f336275a.get(iC)));
            }
            a(aVarC.b(), i11, aVarC.b() - aVarC.a(), i13, dVar);
            return;
        }
        int i14 = i10;
        int i15 = i12;
        while (true) {
            if (i14 >= i11 && i15 >= i13) {
                return;
            }
            if (i14 < i11 && i15 < i13 && this.f336277c.b(this.f336275a.get(i14), this.f336276b.get(i15))) {
                dVar.c(new f<>(this.f336275a.get(i14)));
                i14++;
            } else if (i11 - i10 > i13 - i12) {
                dVar.a(new b<>(this.f336275a.get(i14)));
                i14++;
            } else {
                dVar.b(new e<>(this.f336276b.get(i15)));
            }
            i15++;
        }
    }

    private a b(int i10, int i11, int i12, int i13) {
        int i14 = i10;
        while (true) {
            int i15 = i14 - i11;
            if (i15 >= i13 || i14 >= i12 || !this.f336277c.b(this.f336275a.get(i14), this.f336276b.get(i15))) {
                break;
            }
            i14++;
        }
        return new a(i10, i14, i11);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    private a c(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i10;
        int i17 = i11 - i16;
        int i18 = i13 - i12;
        if (i17 == 0 || i18 == 0) {
            return null;
        }
        int i19 = i17 - i18;
        int i20 = i18 + i17;
        if (i20 % 2 != 0) {
            i20++;
        }
        int i21 = i20 / 2;
        int i22 = i21 + 1;
        this.f336278d[i22] = i16;
        this.f336279e[i22] = i11 + 1;
        int i23 = 0;
        while (i23 <= i21) {
            int i24 = -i23;
            for (int i25 = i24; i25 <= i23; i25 += 2) {
                int i26 = i25 + i21;
                if (i25 == i24) {
                    int[] iArr = this.f336278d;
                    iArr[i26] = iArr[i26 + 1];
                } else {
                    if (i25 != i23) {
                        int[] iArr2 = this.f336278d;
                        if (iArr2[i26 - 1] < iArr2[i26 + 1]) {
                            int[] iArr3 = this.f336278d;
                            iArr3[i26] = iArr3[i26 + 1];
                        }
                    }
                    int[] iArr4 = this.f336278d;
                    iArr4[i26] = iArr4[i26 - 1] + 1;
                }
                int i27 = this.f336278d[i26];
                for (int i28 = ((i27 - i16) + i12) - i25; i27 < i11 && i28 < i13 && this.f336277c.b(this.f336275a.get(i27), this.f336276b.get(i28)); i28++) {
                    i27++;
                    this.f336278d[i26] = i27;
                }
                if (i19 % 2 != 0 && i19 - i23 <= i25 && i25 <= i19 + i23 && (i15 = this.f336279e[i26 - i19]) <= this.f336278d[i26]) {
                    return b(i15, (i25 + i16) - i12, i11, i13);
                }
            }
            int i29 = i19 - i23;
            int i30 = i29;
            while (true) {
                int i31 = i19 + i23;
                if (i30 <= i31) {
                    int i32 = (i30 + i21) - i19;
                    if (i30 == i29) {
                        int[] iArr5 = this.f336279e;
                        iArr5[i32] = iArr5[i32 + 1] - 1;
                    } else {
                        if (i30 != i31) {
                            int[] iArr6 = this.f336279e;
                            if (iArr6[i32 + 1] <= iArr6[i32 - 1]) {
                                int[] iArr7 = this.f336279e;
                                iArr7[i32] = iArr7[i32 + 1] - 1;
                            }
                        }
                        int[] iArr8 = this.f336279e;
                        iArr8[i32] = iArr8[i32 - 1];
                    }
                    int i33 = this.f336279e[i32] - 1;
                    int i34 = ((i33 - i16) + i12) - i30;
                    while (i33 >= i16 && i34 >= i12 && this.f336277c.b(this.f336275a.get(i33), this.f336276b.get(i34))) {
                        this.f336279e[i32] = i33;
                        i34--;
                        i16 = i10;
                        i33--;
                    }
                    if (i19 % 2 == 0 && i24 <= i30 && i30 <= i23 && (i14 = this.f336279e[i32]) <= this.f336278d[i32 + i19]) {
                        return b(i14, (i30 + i10) - i12, i11, i13);
                    }
                    i30 += 2;
                    i16 = i10;
                }
            }
            i23++;
            i16 = i10;
        }
        throw new RuntimeException("Internal Error");
    }

    public d<T> d() {
        d<T> dVar = new d<>();
        a(0, this.f336275a.size(), 0, this.f336276b.size(), dVar);
        return dVar;
    }

    public i(List<T> list, List<T> list2, m<? super T> mVar) {
        this.f336275a = list;
        this.f336276b = list2;
        this.f336277c = mVar;
        int size = list.size() + list2.size() + 2;
        this.f336278d = new int[size];
        this.f336279e = new int[size];
    }
}
