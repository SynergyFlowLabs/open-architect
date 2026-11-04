package com.planner5d.library.contest;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e0;
import androidx.databinding.k;
import androidx.databinding.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DataBinderMapperImpl extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f148364a = new SparseIntArray(0);

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final SparseArray<String> f148365a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f148365a = sparseArray;
            sparseArray.put(0, "_all");
        }

        private a() {
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final HashMap<String, Integer> f148366a = new HashMap<>(0);

        private b() {
        }
    }

    @Override // androidx.databinding.k
    public List<k> a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.k
    public String b(int i10) {
        return a.f148365a.get(i10);
    }

    @Override // androidx.databinding.k
    public e0 c(l lVar, View view, int i10) {
        if (f148364a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.k
    public e0 d(l lVar, View[] viewArr, int i10) {
        if (viewArr != null && viewArr.length != 0 && f148364a.get(i10) > 0) {
            int i11 = 7 << 0;
            if (viewArr[0].getTag() == null) {
                throw new RuntimeException("view must have a tag");
            }
        }
        return null;
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Integer num;
        if (str == null || (num = b.f148366a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
