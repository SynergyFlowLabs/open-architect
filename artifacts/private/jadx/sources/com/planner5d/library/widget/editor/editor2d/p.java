package com.planner5d.library.widget.editor.editor2d;

import android.graphics.Point;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<List<T>> f255145a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Point f255146b = new Point();

    public void a(T t10, int i10) {
        if (t10 != null) {
            c(i10).add(t10);
        }
    }

    public List<T> b() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = this.f255146b.x; i10 <= this.f255146b.y; i10++) {
            arrayList.addAll(c(i10));
        }
        return arrayList;
    }

    List<T> c(int i10) {
        if (this.f255145a.get(i10) == null) {
            Point point = this.f255146b;
            point.set(Math.min(i10, point.x), Math.max(i10, this.f255146b.y));
            this.f255145a.put(i10, new ArrayList());
        }
        return this.f255145a.get(i10);
    }

    List<List<T>> d() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = this.f255146b.y; i10 >= this.f255146b.x; i10--) {
            arrayList.add(c(i10));
        }
        return arrayList;
    }

    void e(List<T> list) {
        for (int i10 = this.f255146b.x; i10 <= this.f255146b.y; i10++) {
            c(i10).removeAll(list);
        }
    }
}
