package com.planner5d.library.model.manager.builtin;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.planner5d.library.model.item.catalog.CatalogCategory;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.services.utility.k3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected fg.e<i> f181271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected u f181272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.application.b f181273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    protected n1 f181274d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f181275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, String> f181276b;

        /* JADX INFO: Access modifiers changed from: private */
        public String c(String str) {
            if (this.f181276b.containsKey(str)) {
                return this.f181276b.get(str);
            }
            return null;
        }

        private a(int i10, Map<String, String> map) {
            this.f181275a = i10;
            this.f181276b = map;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseIntArray f181277a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<String> f181278b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<String> f181279c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f181280d = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseIntArray f181281e = new SparseIntArray();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final SparseArray<a> f181282f = new SparseArray<>();

        b() {
        }
    }

    @ij.a
    public y() {
    }

    public static /* synthetic */ int a(SparseIntArray sparseIntArray, CatalogCategory catalogCategory, CatalogCategory catalogCategory2) {
        return sparseIntArray.get((int) catalogCategory.getId()) - sparseIntArray.get((int) catalogCategory2.getId());
    }

    @m1
    private String g(long j10) {
        return (String) m().f181278b.get((int) j10);
    }

    @m1
    private int h(int i10) {
        a aVar = (a) m().f181282f.get(i10);
        if (aVar == null) {
            return 0;
        }
        return aVar.f181275a;
    }

    @m1
    private String i() {
        return m().f181280d;
    }

    @m1
    private void j(String str, List<CatalogCategory> list) {
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split(",")) {
                int iIntValue = Integer.valueOf(str2).intValue();
                long j10 = iIntValue;
                list.add(new CatalogCategory(new k3(l(iIntValue)), this.f181271a.get().J(m().f181277a, (int) k(j10)), h(iIntValue), j10, k(j10)));
            }
            p(list);
        }
    }

    @m1
    private long k(long j10) {
        return m().f181277a.get((int) j10);
    }

    @m1
    private b m() {
        return this.f181272b.l(this);
    }

    @m1
    private void n(m mVar, b bVar) {
        int i10;
        SparseArray sparseArray = new SparseArray();
        Cursor cursorQuery = mVar.a().query(i.b.catalogs_categories.name(), new String[]{"id", io.sentry.protocol.j.b.f306359i}, "catalog_id = ?", new String[]{String.valueOf(this.f181272b.b())}, null, null, null);
        while (true) {
            try {
                if (!cursorQuery.moveToNext()) {
                    break;
                }
                int i11 = cursorQuery.getInt(0);
                int i12 = cursorQuery.getInt(1);
                bVar.f181277a.put(i11, i12);
                if (sparseArray.get(i12) == null) {
                    sparseArray.put(i12, new ArrayList());
                }
                ((List) sparseArray.get(i12)).add(Integer.valueOf(i11));
                bVar.f181279c.add(String.valueOf(i11));
                bVar.f181281e.put(i11, bVar.f181281e.size());
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        cursorQuery.close();
        bVar.f181280d = TextUtils.join(",", bVar.f181279c);
        for (i10 = 0; i10 < sparseArray.size(); i10++) {
            bVar.f181278b.put(sparseArray.keyAt(i10), TextUtils.join(",", (Iterable) sparseArray.valueAt(i10)));
        }
    }

    @m1
    private void o(m mVar, b bVar) {
        Cursor cursorQuery = mVar.a().query(i.b.categories.name(), null, null, null, null, null, null);
        try {
            int columnIndex = cursorQuery.getColumnIndex("id");
            int columnIndex2 = cursorQuery.getColumnIndex("icon");
            if (columnIndex >= 0 && columnIndex2 >= 0) {
                while (cursorQuery.moveToNext()) {
                    bVar.f181282f.put(cursorQuery.getInt(columnIndex), new a(cursorQuery.getInt(columnIndex2), this.f181274d.o("title", this.f181273c, cursorQuery)));
                }
            }
            cursorQuery.close();
        } catch (Throwable th2) {
            if (cursorQuery == null) {
                throw th2;
            }
            try {
                cursorQuery.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @m1
    private void p(List<CatalogCategory> list) {
        final SparseIntArray sparseIntArray = m().f181281e;
        Collections.sort(list, new Comparator() { // from class: com.planner5d.library.model.manager.builtin.x
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return y.a(sparseIntArray, (CatalogCategory) obj, (CatalogCategory) obj2);
            }
        });
    }

    @m1
    b b() {
        b bVar = new b();
        m mVarK = this.f181271a.get().K();
        try {
            if (mVarK.a() != null) {
                n(mVarK, bVar);
                o(mVarK, bVar);
            }
            mVarK.close();
            return bVar;
        } catch (Throwable th2) {
            if (mVarK != null) {
                try {
                    mVarK.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @m1
    List<Long> c(List<Long> list) {
        List list2 = m().f181279c;
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            if (!list2.contains(String.valueOf(it.next()))) {
                it.remove();
            }
        }
        return list;
    }

    @m1
    List<CatalogCategory> d(@NonNull long[] jArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Collections.addAll(arrayList2, i().split(","));
        ArrayList arrayList3 = new ArrayList();
        for (long j10 : jArr) {
            String strValueOf = String.valueOf(j10);
            if (arrayList2.contains(strValueOf)) {
                arrayList3.add(strValueOf);
            }
        }
        j(TextUtils.join(",", arrayList3), arrayList);
        return arrayList;
    }

    @m1
    CatalogCategory e(long j10) {
        List<CatalogCategory> listD = d(new long[]{j10});
        if (listD.isEmpty()) {
            return null;
        }
        return listD.get(0);
    }

    @m1
    List<CatalogCategory> f(long j10) {
        LinkedList linkedList = new LinkedList();
        j(g(j10), linkedList);
        return linkedList;
    }

    @m1
    public String l(int i10) {
        a aVar = (a) m().f181282f.get(i10);
        if (aVar == null) {
            return null;
        }
        return aVar.c(this.f181274d.a(this.f181273c));
    }
}
