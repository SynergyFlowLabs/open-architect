package org.locationtech.jts.util;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f339152a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f339153b;

    public k() {
        ArrayList arrayList = new ArrayList();
        this.f339153b = arrayList;
        arrayList.add(null);
    }

    private void e(int i10) {
        Object obj = this.f339153b.get(i10);
        while (true) {
            int i11 = i10 * 2;
            int i12 = this.f339152a;
            if (i11 <= i12) {
                if (i11 != i12) {
                    int i13 = i11 + 1;
                    if (((Comparable) this.f339153b.get(i13)).compareTo(this.f339153b.get(i11)) < 0) {
                        i11 = i13;
                    }
                }
                if (((Comparable) this.f339153b.get(i11)).compareTo(obj) >= 0) {
                    break;
                }
                ArrayList arrayList = this.f339153b;
                arrayList.set(i10, arrayList.get(i11));
                i10 = i11;
            } else {
                break;
            }
        }
        this.f339153b.set(i10, obj);
    }

    public void a(Comparable comparable) {
        this.f339153b.add(null);
        int i10 = this.f339152a + 1;
        this.f339152a = i10;
        this.f339153b.set(0, comparable);
        while (true) {
            int i11 = i10 / 2;
            if (comparable.compareTo(this.f339153b.get(i11)) >= 0) {
                this.f339153b.set(i10, comparable);
                return;
            } else {
                ArrayList arrayList = this.f339153b;
                arrayList.set(i10, arrayList.get(i11));
                i10 = i11;
            }
        }
    }

    public void b() {
        this.f339152a = 0;
        this.f339153b.clear();
    }

    public boolean c() {
        return this.f339152a == 0;
    }

    public Object d() {
        if (c()) {
            return null;
        }
        Object obj = this.f339153b.get(1);
        ArrayList arrayList = this.f339153b;
        arrayList.set(1, arrayList.get(this.f339152a));
        this.f339152a--;
        e(1);
        return obj;
    }

    public int f() {
        return this.f339152a;
    }
}
