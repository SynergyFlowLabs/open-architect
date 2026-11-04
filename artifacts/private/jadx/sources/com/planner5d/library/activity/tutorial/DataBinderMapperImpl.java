package com.planner5d.library.activity.tutorial;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DataBinderMapperImpl extends androidx.databinding.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f137270a = new SparseIntArray(0);

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final SparseArray<String> f137271a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f137271a = sparseArray;
            sparseArray.put(0, "_all");
        }

        private a() {
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final HashMap<String, Integer> f137272a = new HashMap<>(0);

        private b() {
        }
    }

    @Override // androidx.databinding.k
    public List<androidx.databinding.k> a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.k
    public String b(int i10) {
        return a.f137271a.get(i10);
    }

    @Override // androidx.databinding.k
    public e0 c(androidx.databinding.l lVar, View view, int i10) {
        if (f137270a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.k
    public e0 d(androidx.databinding.l lVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f137270a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Integer num;
        if (str == null || (num = b.f137272a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
