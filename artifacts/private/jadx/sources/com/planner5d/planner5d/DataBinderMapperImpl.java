package com.planner5d.planner5d;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class DataBinderMapperImpl extends androidx.databinding.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f258904a = new SparseIntArray(0);

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final SparseArray<String> f258905a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(26);
            f258905a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "appearanceMode");
            sparseArray.put(2, "blocked");
            sparseArray.put(3, "contest");
            sparseArray.put(4, "data");
            sparseArray.put(5, "documentOnClickListener");
            sparseArray.put(6, "documentOnLongClickListener");
            sparseArray.put(7, "isAi");
            sparseArray.put(8, "isNew");
            sparseArray.put(9, "isProjectSubmitted");
            sparseArray.put(10, "isSelected");
            sparseArray.put(11, "isSelectionModeOn");
            sparseArray.put(12, "languageManager");
            sparseArray.put(13, "menuOnClickListener");
            sparseArray.put(14, "model");
            sparseArray.put(15, "onAppearanceClickListener");
            sparseArray.put(16, "onClickListener");
            sparseArray.put(17, "onFeedHome");
            sparseArray.put(18, "onSortClickListener");
            sparseArray.put(19, "participatesInContest");
            sparseArray.put(20, "projectOnClickListener");
            sparseArray.put(21, "projectOnLongClickListener");
            sparseArray.put(22, "sortOrder");
            sparseArray.put(23, "summaryValue");
            sparseArray.put(24, "titleValue");
            sparseArray.put(25, "viewModel");
        }

        private a() {
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final HashMap<String, Integer> f258906a = new HashMap<>(0);

        private b() {
        }
    }

    @Override // androidx.databinding.k
    public List<androidx.databinding.k> a() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.activity.tutorial.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.contest.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.feed.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.feed.view.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.k
    public String b(int i10) {
        return a.f258905a.get(i10);
    }

    @Override // androidx.databinding.k
    public androidx.databinding.e0 c(androidx.databinding.l lVar, View view, int i10) {
        if (f258904a.get(i10) > 0 && view.getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.k
    public androidx.databinding.e0 d(androidx.databinding.l lVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f258904a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Integer num;
        if (str == null || (num = b.f258906a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
