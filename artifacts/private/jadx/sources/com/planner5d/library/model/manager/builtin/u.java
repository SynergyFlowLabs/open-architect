package com.planner5d.library.model.manager.builtin;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.LongSparseArray;
import androidx.annotation.m1;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.services.utility.t2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected fg.e<i> f181221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected fg.e<n1> f181222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected fg.e<com.planner5d.library.application.b> f181223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    protected r f181224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f181225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f181226f = new Object();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, CatalogItem> f181227a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, Long> f181228b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, Integer> f181229c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private LongSparseArray<String[]> f181230d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private y.b f181231e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<Integer> f181232f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.planner5d.library.model.o[] f181233g = null;

        a() {
        }
    }

    @ij.a
    u(fg.e<i> eVar, com.planner5d.library.application.d dVar) {
        this.f181221a = eVar;
        this.f181225e = dVar.k();
    }

    public static /* synthetic */ int a(Map map, CatalogItem catalogItem, CatalogItem catalogItem2) {
        Integer num = (Integer) map.get(catalogItem.f180761id);
        Integer num2 = (Integer) map.get(catalogItem2.f180761id);
        if (num != null && num2 != null) {
            return num.intValue() - num2.intValue();
        }
        if (num == null && num2 == null) {
            return 0;
        }
        return num == null ? 1 : -1;
    }

    @m1
    private Collection<String> e() {
        return m().f181227a.keySet();
    }

    @m1
    private a m() {
        a aVarF;
        synchronized (this.f181226f) {
            aVarF = this.f181224d.f();
            if (aVarF.f181227a == null) {
                m mVarK = this.f181221a.get().K();
                try {
                    HashMap map = new HashMap();
                    LongSparseArray longSparseArray = new LongSparseArray();
                    aVarF.f181229c = new HashMap();
                    aVarF.f181228b = new HashMap();
                    SQLiteDatabase sQLiteDatabaseA = mVarK.a();
                    if (sQLiteDatabaseA != null) {
                        i.b bVar = i.b.catalogs_items;
                        String[] strArr = t2.d(sQLiteDatabaseA, bVar.name(), "visible") ? new String[]{"id", "free", "category_id", "visible", "editable_materials", "editable_position", "editable_rotation", "editable_size"} : new String[]{"id", "free", "category_id"};
                        Cursor cursorQuery = sQLiteDatabaseA.query(bVar.name(), strArr, "catalog_id = ?", new String[]{String.valueOf(this.f181225e)}, null, null, null);
                        while (cursorQuery.moveToNext()) {
                            try {
                                CatalogItem catalogItem = strArr.length > 3 ? new CatalogItem(cursorQuery.getString(0), cursorQuery.getInt(1) == 1, cursorQuery.getLong(2), null, null, cursorQuery.getInt(3) == 1, cursorQuery.getInt(4) == 1, cursorQuery.getInt(5) == 1, cursorQuery.getInt(6) == 1, cursorQuery.getInt(7) == 1) : new CatalogItem(cursorQuery.getString(0), cursorQuery.getInt(1) == 1, cursorQuery.getLong(2), null, null, true, true, true, true, true);
                                map.put(catalogItem.f180761id, catalogItem);
                                if (longSparseArray.indexOfKey(catalogItem.categoryId) < 0) {
                                    longSparseArray.put(catalogItem.categoryId, new LinkedList());
                                }
                                ((List) longSparseArray.get(catalogItem.categoryId)).add(catalogItem.f180761id);
                                aVarF.f181228b.put(catalogItem.f180761id, Long.valueOf(catalogItem.categoryId));
                                aVarF.f181229c.put(catalogItem.f180761id, Integer.valueOf(aVarF.f181229c.size()));
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
                        cursorQuery.close();
                    }
                    aVarF.f181230d = new LongSparseArray();
                    for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                        long jKeyAt = longSparseArray.keyAt(i10);
                        aVarF.f181230d.put(jKeyAt, (String[]) ((List) longSparseArray.get(jKeyAt)).toArray(new String[0]));
                    }
                    aVarF.f181227a = map;
                    mVarK.close();
                } catch (Throwable th4) {
                    if (mVarK == null) {
                        throw th4;
                    }
                    try {
                        mVarK.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            }
        }
        return aVarF;
    }

    @m1
    private a n() {
        a aVarF;
        synchronized (this.f181226f) {
            try {
                aVarF = this.f181224d.f();
                if (aVarF.f181233g == null) {
                    m mVarK = this.f181221a.get().K();
                    try {
                        if (mVarK.a() != null) {
                            try {
                                Cursor cursorQuery = mVarK.a().query(i.b.languages.name(), null, null, null, null, null, null);
                                try {
                                    aVarF.f181233g = new com.planner5d.library.model.o[cursorQuery.getCount()];
                                    int columnIndex = cursorQuery.getColumnIndex("id");
                                    int columnIndex2 = cursorQuery.getColumnIndex("title");
                                    int columnIndex3 = cursorQuery.getColumnIndex("language_id");
                                    if (columnIndex >= 0 && columnIndex3 >= 0 && columnIndex2 >= 0) {
                                        int i10 = 0;
                                        while (cursorQuery.moveToNext()) {
                                            int i11 = i10 + 1;
                                            aVarF.f181233g[i10] = new com.planner5d.library.model.o(cursorQuery.getInt(columnIndex3), cursorQuery.getString(columnIndex), cursorQuery.getString(columnIndex2));
                                            i10 = i11;
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
                            } catch (Throwable unused) {
                                aVarF.f181233g = new com.planner5d.library.model.o[0];
                            }
                        }
                        mVarK.close();
                    } catch (Throwable th4) {
                        if (mVarK == null) {
                            throw th4;
                        }
                        try {
                            mVarK.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        return aVarF;
    }

    @m1
    private a o() {
        a aVarF;
        synchronized (this.f181226f) {
            try {
                aVarF = this.f181224d.f();
                if (aVarF.f181232f == null) {
                    m mVarK = this.f181221a.get().K();
                    try {
                        ArrayList arrayList = new ArrayList();
                        if (mVarK.a() != null) {
                            Cursor cursorQuery = mVarK.a().query(i.b.catalogs_room_types.name(), new String[]{"id"}, "catalog_id = ?", new String[]{String.valueOf(this.f181225e)}, null, null, null);
                            while (cursorQuery.moveToNext()) {
                                try {
                                    arrayList.add(Integer.valueOf(cursorQuery.getInt(0)));
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
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                        }
                        aVarF.f181232f = arrayList;
                        mVarK.close();
                    } catch (Throwable th4) {
                        if (mVarK != null) {
                            try {
                                mVarK.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        return aVarF;
    }

    int b() {
        return this.f181225e;
    }

    @m1
    CatalogItem c(String str) {
        return (CatalogItem) m().f181227a.get(str);
    }

    @m1
    Long d(String str) {
        Map map = m().f181228b;
        if (map.containsKey(str)) {
            return (Long) map.get(str);
        }
        return null;
    }

    @m1
    List<String> f(List<String> list) {
        Collection<String> collectionE = e();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!collectionE.contains(it.next())) {
                it.remove();
            }
        }
        return list;
    }

    @m1
    String[] g() {
        return (String[]) e().toArray(new String[0]);
    }

    @m1
    List<Integer> h() {
        List<Integer> list = o().f181232f;
        return list == null ? new ArrayList() : list;
    }

    @m1
    void i(List<String> list, List<String> list2) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String[] strArrJ = j(Long.valueOf(it.next()).longValue());
            if (strArrJ != null && strArrJ.length > 0) {
                Collections.addAll(list2, strArrJ);
            }
        }
    }

    @m1
    String[] j(long j10) {
        return (String[]) m().f181230d.get(j10);
    }

    @m1
    com.planner5d.library.model.o k(String str) {
        for (com.planner5d.library.model.o oVar : n().f181233g) {
            if (oVar.b().equals(str)) {
                return oVar;
            }
        }
        return null;
    }

    @m1
    y.b l(y yVar) {
        y.b bVar;
        synchronized (this.f181226f) {
            try {
                a aVarF = this.f181224d.f();
                if (aVarF.f181231e == null) {
                    aVarF.f181231e = yVar.b();
                }
                bVar = aVarF.f181231e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @m1
    void p(List<CatalogItem> list) {
        final Map map = m().f181229c;
        Collections.sort(list, new Comparator() { // from class: com.planner5d.library.model.manager.builtin.t
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return u.a(map, (CatalogItem) obj, (CatalogItem) obj2);
            }
        });
    }
}
