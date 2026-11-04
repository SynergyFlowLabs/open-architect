package com.planner5d.library.feed.view;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e0;
import androidx.databinding.k;
import androidx.databinding.l;
import com.planner5d.library.feed.view.databinding.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DataBinderMapperImpl extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f175288a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f175289b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final SparseIntArray f175290c;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final SparseArray<String> f175291a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(2);
            f175291a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "model");
        }

        private a() {
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final HashMap<String, Integer> f175292a;

        static {
            HashMap<String, Integer> map = new HashMap<>(2);
            f175292a = map;
            map.put("layout/view_list_item_design_of_day_0", Integer.valueOf(c.l.f177940t2));
            map.put("layout/view_list_item_design_of_day_more_0", Integer.valueOf(c.l.f177944u2));
        }

        private b() {
        }
    }

    static {
        int i10 = 0 >> 2;
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        f175290c = sparseIntArray;
        sparseIntArray.put(c.l.f177940t2, 1);
        sparseIntArray.put(c.l.f177944u2, 2);
    }

    @Override // androidx.databinding.k
    public List<k> a() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.feed.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.k
    public String b(int i10) {
        return a.f175291a.get(i10);
    }

    @Override // androidx.databinding.k
    public e0 c(l lVar, View view, int i10) {
        int i11 = f175290c.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i11 == 1) {
            if ("layout/view_list_item_design_of_day_0".equals(tag)) {
                return new com.planner5d.library.feed.view.databinding.b(lVar, view);
            }
            throw new IllegalArgumentException("The tag for view_list_item_design_of_day is invalid. Received: " + tag);
        }
        if (i11 != 2) {
            return null;
        }
        if ("layout/view_list_item_design_of_day_more_0".equals(tag)) {
            return new d(lVar, view);
        }
        throw new IllegalArgumentException("The tag for view_list_item_design_of_day_more is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.k
    public e0 d(l lVar, View[] viewArr, int i10) {
        if (viewArr != null && viewArr.length != 0 && f175290c.get(i10) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Integer num;
        if (str != null && (num = b.f175292a.get(str)) != null) {
            return num.intValue();
        }
        return 0;
    }
}
