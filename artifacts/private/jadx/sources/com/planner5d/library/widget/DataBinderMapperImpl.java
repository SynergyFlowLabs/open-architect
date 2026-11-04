package com.planner5d.library.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DataBinderMapperImpl extends androidx.databinding.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f249442a = new SparseIntArray(0);

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final SparseArray<String> f249443a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f249443a = sparseArray;
            sparseArray.put(0, "_all");
        }

        private a() {
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final HashMap<String, Integer> f249444a = new HashMap<>(0);

        private b() {
        }
    }

    @Override // androidx.databinding.k
    public List<androidx.databinding.k> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.k
    public String b(int i10) {
        return a.f249443a.get(i10);
    }

    @Override // androidx.databinding.k
    public androidx.databinding.e0 c(androidx.databinding.l lVar, View view, int i10) {
        if (f249442a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.k
    public androidx.databinding.e0 d(androidx.databinding.l lVar, View[] viewArr, int i10) {
        if (viewArr != null && viewArr.length != 0 && f249442a.get(i10) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Integer num;
        if (str == null || (num = b.f249444a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
