package com.planner5d.library;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e0;
import androidx.databinding.k;
import androidx.databinding.l;
import com.planner5d.library.databinding.a4;
import com.planner5d.library.databinding.b6;
import com.planner5d.library.databinding.d6;
import com.planner5d.library.databinding.e4;
import com.planner5d.library.databinding.f6;
import com.planner5d.library.databinding.h6;
import com.planner5d.library.databinding.k5;
import com.planner5d.library.databinding.l6;
import com.planner5d.library.databinding.m5;
import com.planner5d.library.databinding.n6;
import com.planner5d.library.databinding.p6;
import com.planner5d.library.databinding.r6;
import com.planner5d.library.databinding.t5;
import com.planner5d.library.databinding.v3;
import com.planner5d.library.databinding.v6;
import com.planner5d.library.databinding.w5;
import com.planner5d.library.databinding.x6;
import com.planner5d.library.databinding.y3;
import com.planner5d.library.databinding.z0;
import com.planner5d.library.databinding.z5;
import com.planner5d.library.databinding.z6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f131392a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f131393b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f131394c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f131395d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f131396e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f131397f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f131398g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f131399h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f131400i = 9;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f131401j = 10;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f131402k = 11;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f131403l = 12;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f131404m = 13;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f131405n = 14;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f131406o = 15;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f131407p = 16;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f131408q = 17;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f131409r = 18;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f131410s = 19;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f131411t = 20;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f131412u = 21;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final SparseIntArray f131413v;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final SparseArray<String> f131414a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(26);
            f131414a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "appearanceMode");
            sparseArray.put(2, "blocked");
            sparseArray.put(3, "contest");
            sparseArray.put(4, "data");
            sparseArray.put(5, "documentOnClickListener");
            int i10 = 7 & 6;
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
        static final HashMap<String, Integer> f131415a;

        static {
            HashMap<String, Integer> map = new HashMap<>(21);
            f131415a = map;
            map.put("layout/fragment_gallery_project_0", Integer.valueOf(f.m.Q1));
            map.put("layout/view_feed_list_blog_more_0", Integer.valueOf(f.m.W6));
            map.put("layout/view_feed_list_blog_post_0", Integer.valueOf(f.m.Y6));
            map.put("layout/view_feed_list_blog_video_0", Integer.valueOf(f.m.Z6));
            map.put("layout/view_feed_list_project_0", Integer.valueOf(f.m.f168656c7));
            map.put("layout/view_main_list_add_new_grid_0", Integer.valueOf(f.m.R7));
            map.put("layout/view_main_list_add_new_list_0", Integer.valueOf(f.m.S7));
            map.put("layout/view_main_list_contest_item_0", Integer.valueOf(f.m.Y7));
            map.put("layout/view_main_list_design_generator_0", Integer.valueOf(f.m.f168635a8));
            map.put("layout/view_main_list_document_grid_0", Integer.valueOf(f.m.f168657c8));
            map.put("layout/view_main_list_document_list_0", Integer.valueOf(f.m.f168668d8));
            map.put("layout/view_main_list_documents_folder_grid_0", Integer.valueOf(f.m.f168679e8));
            map.put("layout/view_main_list_documents_folder_list_0", Integer.valueOf(f.m.f168690f8));
            map.put("layout/view_main_list_documents_synchronization_0", Integer.valueOf(f.m.f168701g8));
            map.put("layout/view_main_list_folder_grid_0", Integer.valueOf(f.m.f168734j8));
            map.put("layout/view_main_list_folder_list_0", Integer.valueOf(f.m.f168745k8));
            map.put("layout/view_main_list_new_project_grid_0", Integer.valueOf(f.m.f168756l8));
            map.put("layout/view_main_list_new_project_list_0", Integer.valueOf(f.m.f168767m8));
            map.put("layout/view_main_list_project_grid_0", Integer.valueOf(f.m.f168800p8));
            map.put("layout/view_main_list_project_list_0", Integer.valueOf(f.m.f168811q8));
            map.put("layout/view_main_list_sorting_and_appearance_0", Integer.valueOf(f.m.f168822r8));
        }

        private b() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(21);
        f131413v = sparseIntArray;
        sparseIntArray.put(f.m.Q1, 1);
        sparseIntArray.put(f.m.W6, 2);
        sparseIntArray.put(f.m.Y6, 3);
        sparseIntArray.put(f.m.Z6, 4);
        sparseIntArray.put(f.m.f168656c7, 5);
        sparseIntArray.put(f.m.R7, 6);
        sparseIntArray.put(f.m.S7, 7);
        sparseIntArray.put(f.m.Y7, 8);
        sparseIntArray.put(f.m.f168635a8, 9);
        sparseIntArray.put(f.m.f168657c8, 10);
        sparseIntArray.put(f.m.f168668d8, 11);
        sparseIntArray.put(f.m.f168679e8, 12);
        sparseIntArray.put(f.m.f168690f8, 13);
        sparseIntArray.put(f.m.f168701g8, 14);
        sparseIntArray.put(f.m.f168734j8, 15);
        sparseIntArray.put(f.m.f168745k8, 16);
        sparseIntArray.put(f.m.f168756l8, 17);
        sparseIntArray.put(f.m.f168767m8, 18);
        sparseIntArray.put(f.m.f168800p8, 19);
        sparseIntArray.put(f.m.f168811q8, 20);
        sparseIntArray.put(f.m.f168822r8, 21);
    }

    @Override // androidx.databinding.k
    public List<k> a() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.contest.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.feed.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.feed.view.DataBinderMapperImpl());
        arrayList.add(new com.planner5d.library.widget.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.k
    public String b(int i10) {
        return a.f131414a.get(i10);
    }

    @Override // androidx.databinding.k
    public e0 c(l lVar, View view, int i10) {
        int i11 = f131413v.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i11) {
                case 1:
                    if ("layout/fragment_gallery_project_0".equals(tag)) {
                        return new z0(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_gallery_project is invalid. Received: " + tag);
                case 2:
                    if ("layout/view_feed_list_blog_more_0".equals(tag)) {
                        return new v3(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_feed_list_blog_more is invalid. Received: " + tag);
                case 3:
                    if ("layout/view_feed_list_blog_post_0".equals(tag)) {
                        return new y3(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_feed_list_blog_post is invalid. Received: " + tag);
                case 4:
                    if ("layout/view_feed_list_blog_video_0".equals(tag)) {
                        return new a4(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_feed_list_blog_video is invalid. Received: " + tag);
                case 5:
                    if ("layout/view_feed_list_project_0".equals(tag)) {
                        return new e4(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_feed_list_project is invalid. Received: " + tag);
                case 6:
                    if ("layout/view_main_list_add_new_grid_0".equals(tag)) {
                        return new k5(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_add_new_grid is invalid. Received: " + tag);
                case 7:
                    if ("layout/view_main_list_add_new_list_0".equals(tag)) {
                        return new m5(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_add_new_list is invalid. Received: " + tag);
                case 8:
                    if ("layout/view_main_list_contest_item_0".equals(tag)) {
                        return new t5(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_contest_item is invalid. Received: " + tag);
                case 9:
                    if ("layout/view_main_list_design_generator_0".equals(tag)) {
                        return new w5(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_design_generator is invalid. Received: " + tag);
                case 10:
                    if ("layout/view_main_list_document_grid_0".equals(tag)) {
                        return new z5(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_document_grid is invalid. Received: " + tag);
                case 11:
                    if ("layout/view_main_list_document_list_0".equals(tag)) {
                        return new b6(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_document_list is invalid. Received: " + tag);
                case 12:
                    if ("layout/view_main_list_documents_folder_grid_0".equals(tag)) {
                        return new d6(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_documents_folder_grid is invalid. Received: " + tag);
                case 13:
                    if ("layout/view_main_list_documents_folder_list_0".equals(tag)) {
                        return new f6(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_documents_folder_list is invalid. Received: " + tag);
                case 14:
                    if ("layout/view_main_list_documents_synchronization_0".equals(tag)) {
                        return new h6(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_documents_synchronization is invalid. Received: " + tag);
                case 15:
                    if ("layout/view_main_list_folder_grid_0".equals(tag)) {
                        return new l6(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_folder_grid is invalid. Received: " + tag);
                case 16:
                    if ("layout/view_main_list_folder_list_0".equals(tag)) {
                        return new n6(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_folder_list is invalid. Received: " + tag);
                case 17:
                    if ("layout/view_main_list_new_project_grid_0".equals(tag)) {
                        return new p6(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_new_project_grid is invalid. Received: " + tag);
                case 18:
                    if ("layout/view_main_list_new_project_list_0".equals(tag)) {
                        return new r6(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_new_project_list is invalid. Received: " + tag);
                case 19:
                    if ("layout/view_main_list_project_grid_0".equals(tag)) {
                        return new v6(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_project_grid is invalid. Received: " + tag);
                case 20:
                    if ("layout/view_main_list_project_list_0".equals(tag)) {
                        return new x6(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_project_list is invalid. Received: " + tag);
                case 21:
                    if ("layout/view_main_list_sorting_and_appearance_0".equals(tag)) {
                        return new z6(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_main_list_sorting_and_appearance is invalid. Received: " + tag);
            }
        }
        return null;
    }

    @Override // androidx.databinding.k
    public e0 d(l lVar, View[] viewArr, int i10) {
        if (viewArr != null && viewArr.length != 0 && f131413v.get(i10) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Integer num;
        if (str == null || (num = b.f131415a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
