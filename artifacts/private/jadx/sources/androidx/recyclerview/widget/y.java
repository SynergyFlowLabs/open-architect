package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f74605a;

    interface a {
        androidx.recyclerview.widget.a.b a(int i10, int i11, int i12, Object obj);

        void b(androidx.recyclerview.widget.a.b bVar);
    }

    y(a aVar) {
        this.f74605a = aVar;
    }

    private int a(List<androidx.recyclerview.widget.a.b> list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f74130a != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<androidx.recyclerview.widget.a.b> list, int i10, androidx.recyclerview.widget.a.b bVar, int i11, androidx.recyclerview.widget.a.b bVar2) {
        int i12 = bVar.f74133d;
        int i13 = bVar2.f74131b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f74131b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f74131b = i15 + bVar2.f74133d;
        }
        int i16 = bVar2.f74131b;
        if (i16 <= i12) {
            bVar.f74133d = i12 + bVar2.f74133d;
        }
        bVar2.f74131b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    private void d(List<androidx.recyclerview.widget.a.b> list, int i10, int i11) {
        androidx.recyclerview.widget.a.b bVar = list.get(i10);
        androidx.recyclerview.widget.a.b bVar2 = list.get(i11);
        int i12 = bVar2.f74130a;
        if (i12 == 1) {
            c(list, i10, bVar, i11, bVar2);
            return;
        }
        if (i12 == 2) {
            e(list, i10, bVar, i11, bVar2);
            return;
        }
        int i13 = 4 | 4;
        if (i12 != 4) {
            return;
        }
        f(list, i10, bVar, i11, bVar2);
    }

    void b(List<androidx.recyclerview.widget.a.b> list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    void e(List<androidx.recyclerview.widget.a.b> list, int i10, androidx.recyclerview.widget.a.b bVar, int i11, androidx.recyclerview.widget.a.b bVar2) {
        boolean z10;
        int i12 = bVar.f74131b;
        int i13 = bVar.f74133d;
        boolean z11 = false;
        if (i12 < i13) {
            if (bVar2.f74131b == i12 && bVar2.f74133d == i13 - i12) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
        } else if (bVar2.f74131b == i13 + 1 && bVar2.f74133d == i12 - i13) {
            z10 = true;
            z11 = true;
        } else {
            z10 = true;
        }
        int i14 = bVar2.f74131b;
        if (i13 >= i14) {
            int i15 = bVar2.f74133d;
            if (i13 < i14 + i15) {
                bVar2.f74133d = i15 - 1;
                bVar.f74130a = 2;
                bVar.f74133d = 1;
                if (bVar2.f74133d == 0) {
                    list.remove(i11);
                    this.f74605a.b(bVar2);
                    return;
                }
            }
        }
        bVar2.f74131b = i14 - 1;
        int i16 = bVar.f74131b;
        int i17 = bVar2.f74131b;
        androidx.recyclerview.widget.a.b bVarA = null;
        if (i16 <= i17) {
            bVar2.f74131b = i17 + 1;
        } else {
            int i18 = bVar2.f74133d;
            if (i16 < i17 + i18) {
                bVarA = this.f74605a.a(2, i16 + 1, (i17 + i18) - i16, null);
                bVar2.f74133d = bVar.f74131b - bVar2.f74131b;
            }
        }
        if (z11) {
            list.set(i10, bVar2);
            list.remove(i11);
            this.f74605a.b(bVar);
            return;
        }
        if (z10) {
            if (bVarA != null) {
                int i19 = bVar.f74131b;
                if (i19 > bVarA.f74131b) {
                    bVar.f74131b = i19 - bVarA.f74133d;
                }
                int i20 = bVar.f74133d;
                if (i20 > bVarA.f74131b) {
                    bVar.f74133d = i20 - bVarA.f74133d;
                }
            }
            int i21 = bVar.f74131b;
            if (i21 > bVar2.f74131b) {
                bVar.f74131b = i21 - bVar2.f74133d;
            }
            int i22 = bVar.f74133d;
            if (i22 > bVar2.f74131b) {
                bVar.f74133d = i22 - bVar2.f74133d;
            }
        } else {
            if (bVarA != null) {
                int i23 = bVar.f74131b;
                if (i23 >= bVarA.f74131b) {
                    bVar.f74131b = i23 - bVarA.f74133d;
                }
                int i24 = bVar.f74133d;
                if (i24 >= bVarA.f74131b) {
                    bVar.f74133d = i24 - bVarA.f74133d;
                }
            }
            int i25 = bVar.f74131b;
            if (i25 >= bVar2.f74131b) {
                bVar.f74131b = i25 - bVar2.f74133d;
            }
            int i26 = bVar.f74133d;
            if (i26 >= bVar2.f74131b) {
                bVar.f74133d = i26 - bVar2.f74133d;
            }
        }
        list.set(i10, bVar2);
        if (bVar.f74131b != bVar.f74133d) {
            list.set(i11, bVar);
        } else {
            list.remove(i11);
        }
        if (bVarA != null) {
            list.add(i10, bVarA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    void f(List<androidx.recyclerview.widget.a.b> list, int i10, androidx.recyclerview.widget.a.b bVar, int i11, androidx.recyclerview.widget.a.b bVar2) {
        androidx.recyclerview.widget.a.b bVarA;
        int i12;
        int i13;
        int i14;
        int i15 = bVar.f74133d;
        int i16 = bVar2.f74131b;
        int i17 = 7 << 1;
        androidx.recyclerview.widget.a.b bVarA2 = null;
        if (i15 >= i16) {
            int i18 = bVar2.f74133d;
            if (i15 < i16 + i18) {
                bVar2.f74133d = i18 - 1;
                bVarA = this.f74605a.a(4, bVar.f74131b, 1, bVar2.f74132c);
            }
            i12 = bVar.f74131b;
            i13 = bVar2.f74131b;
            if (i12 <= i13) {
                bVar2.f74131b = i13 + 1;
            } else {
                i14 = bVar2.f74133d;
                if (i12 < i13 + i14) {
                    int i19 = (i13 + i14) - i12;
                    bVarA2 = this.f74605a.a(4, i12 + 1, i19, bVar2.f74132c);
                    bVar2.f74133d -= i19;
                }
            }
            list.set(i11, bVar);
            if (bVar2.f74133d > 0) {
                list.set(i10, bVar2);
            } else {
                list.remove(i10);
                this.f74605a.b(bVar2);
            }
            if (bVarA != null) {
                list.add(i10, bVarA);
            }
            if (bVarA2 != null) {
                list.add(i10, bVarA2);
            }
        }
        bVar2.f74131b = i16 - 1;
        bVarA = null;
        i12 = bVar.f74131b;
        i13 = bVar2.f74131b;
        if (i12 <= i13) {
            bVar2.f74131b = i13 + 1;
        } else {
            i14 = bVar2.f74133d;
            if (i12 < i13 + i14) {
                int i110 = (i13 + i14) - i12;
                bVarA2 = this.f74605a.a(4, i12 + 1, i110, bVar2.f74132c);
                bVar2.f74133d -= i110;
            }
        }
        list.set(i11, bVar);
        if (bVar2.f74133d > 0) {
            list.set(i10, bVar2);
        } else {
            list.remove(i10);
            this.f74605a.b(bVar2);
        }
        if (bVarA != null) {
            list.add(i10, bVarA);
        }
        if (bVarA2 != null) {
            list.add(i10, bVarA2);
        }
    }
}
