package io.reactivex.internal.util;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f303490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object[] f303491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object[] f303492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile int f303493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f303494e;

    public n(int i10) {
        this.f303490a = i10;
    }

    public void a(Object obj) {
        if (this.f303493d == 0) {
            Object[] objArr = new Object[this.f303490a + 1];
            this.f303491b = objArr;
            this.f303492c = objArr;
            objArr[0] = obj;
            this.f303494e = 1;
            this.f303493d = 1;
            return;
        }
        int i10 = this.f303494e;
        int i11 = this.f303490a;
        if (i10 != i11) {
            this.f303492c[i10] = obj;
            this.f303494e = i10 + 1;
            this.f303493d++;
        } else {
            Object[] objArr2 = new Object[i11 + 1];
            objArr2[0] = obj;
            this.f303492c[i11] = objArr2;
            this.f303492c = objArr2;
            this.f303494e = 1;
            this.f303493d++;
        }
    }

    public Object[] b() {
        return this.f303491b;
    }

    public int c() {
        return this.f303493d;
    }

    public String toString() {
        int i10 = this.f303490a;
        int i11 = this.f303493d;
        ArrayList arrayList = new ArrayList(i11 + 1);
        Object[] objArrB = b();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            arrayList.add(objArrB[i13]);
            i12++;
            i13++;
            if (i13 == i10) {
                objArrB = (Object[]) objArrB[i10];
                i13 = 0;
            }
        }
        return arrayList.toString();
    }
}
