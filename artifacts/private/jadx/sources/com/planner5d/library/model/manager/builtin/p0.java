package com.planner5d.library.model.manager.builtin;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import androidx.annotation.m1;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.model.item.catalog.CatalogCategory;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.item.model2d.Model2D;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.t2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected fg.e<i> f181183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected ij.c<com.planner5d.library.model.converter.json.from.a> f181184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected fg.e<com.planner5d.library.model.converter.json.from.c0> f181185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    protected fg.e<com.planner5d.library.model.converter.json.from.f> f181186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    protected fg.e<t1> f181187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.services.utility.p0 f181188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ij.a
    protected u f181189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.converter.json.from.c f181190h;

    @ij.a
    public p0() {
    }

    public static /* synthetic */ LogRecord a(JSONException jSONException) {
        return new LogRecord("error_parsing_model2d", "data_from_room_wizard", jSONException);
    }

    public static /* synthetic */ LogRecord b(String str, JSONException jSONException) {
        return new LogRecord("error_parsing_model2d", str, jSONException);
    }

    @m1
    private CatalogItem c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("data");
        int columnIndex3 = cursor.getColumnIndex("data_catalog");
        int columnIndex4 = cursor.getColumnIndex("visible");
        int columnIndex5 = cursor.getColumnIndex("editable_materials");
        int columnIndex6 = cursor.getColumnIndex("editable_position");
        int columnIndex7 = cursor.getColumnIndex("editable_rotation");
        int columnIndex8 = cursor.getColumnIndex("editable_size");
        String string = columnIndex == -1 ? com.planner5d.library.model.payments.a.f222474i : cursor.getString(columnIndex);
        CatalogItem catalogItemC = this.f181189g.c(string);
        boolean z10 = false;
        if (catalogItemC != null && catalogItemC.isFree()) {
            z10 = true;
        }
        return new CatalogItem(string, z10, catalogItemC == null ? 0L : catalogItemC.categoryId, columnIndex2 == -1 ? null : cursor.getBlob(columnIndex2), this.f181190h.convert(s(columnIndex3 == -1 ? null : cursor.getBlob(columnIndex3))), columnIndex4 == -1 || cursor.getInt(columnIndex4) > 0, columnIndex5 == -1 || cursor.getInt(columnIndex5) > 0, columnIndex6 == -1 || cursor.getInt(columnIndex6) > 0, columnIndex7 == -1 || cursor.getInt(columnIndex7) > 0, columnIndex8 == -1 || cursor.getInt(columnIndex8) > 0);
    }

    private JSONObject q(CatalogItem catalogItem) {
        if (catalogItem == null) {
            return null;
        }
        byte[] bArr = catalogItem.dataItem;
        if (bArr != null) {
            return s(bArr);
        }
        throw new RuntimeException("Item data was not loaded");
    }

    private JSONObject s(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2 = null;
        if (bArr != null) {
            try {
                com.planner5d.library.services.utility.p0 p0Var = this.f181188f;
                gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                try {
                    JSONObject jSONObjectA = p0Var.a(gZIPInputStream);
                    try {
                        gZIPInputStream.close();
                    } catch (IOException unused) {
                    }
                    return jSONObjectA;
                } catch (IOException | OutOfMemoryError | JSONException unused2) {
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    gZIPInputStream2 = gZIPInputStream;
                    if (gZIPInputStream2 != null) {
                        try {
                            gZIPInputStream2.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException | OutOfMemoryError | JSONException unused5) {
                gZIPInputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    private Object t(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        if (bArr != null) {
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    Object objS = this.f181188f.s(byteArrayInputStream);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused) {
                    }
                    return objS;
                } catch (IOException | OutOfMemoryError | JSONException unused2) {
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream2 = byteArrayInputStream;
                    if (byteArrayInputStream2 != null) {
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException | OutOfMemoryError | JSONException unused5) {
                byteArrayInputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    @m1
    private Cursor u(SQLiteDatabase sQLiteDatabase, Boolean bool) {
        String str;
        String strName = i.b.catalogs_items.name();
        String[] strArr = {"id"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append("catalog_id = ?");
        if (bool == null) {
            str = "";
        } else {
            str = "AND free = " + (bool.booleanValue() ? 1 : 0);
        }
        sb2.append(str);
        return sQLiteDatabase.query(strName, strArr, sb2.toString(), new String[]{String.valueOf(this.f181189g.b())}, null, null, null, null);
    }

    @m1
    Item d(final String str, ItemFloor itemFloor, ProviderUid providerUid) {
        try {
            JSONObject jSONObjectQ = q(f(str, false));
            if (jSONObjectQ == null) {
                return null;
            }
            return this.f181186d.get().d(jSONObjectQ, providerUid, itemFloor, this.f181184b.get());
        } catch (JSONException e10) {
            this.f181187e.get().v(new ij.c() { // from class: com.planner5d.library.model.manager.builtin.o0
                @Override // ij.c
                public final Object get() {
                    return p0.b(str, e10);
                }
            });
            return null;
        }
    }

    @m1
    List<Item> e(byte[] bArr, ItemFloor itemFloor, ProviderUid providerUid) throws Throwable {
        try {
            Object objT = t(bArr);
            if (objT == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            com.planner5d.library.model.converter.json.from.a aVar = this.f181184b.get();
            if (objT instanceof JSONArray) {
                int i10 = 4 & 0;
                for (int i11 = 0; i11 < ((JSONArray) objT).length(); i11++) {
                    Object obj = ((JSONArray) objT).get(i11);
                    if (obj instanceof JSONObject) {
                        arrayList.add(this.f181186d.get().d((JSONObject) obj, providerUid, itemFloor, aVar));
                    }
                }
            } else if (objT instanceof JSONObject) {
                arrayList.add(this.f181186d.get().d((JSONObject) objT, providerUid, itemFloor, aVar));
            }
            return arrayList;
        } catch (JSONException e10) {
            this.f181187e.get().v(new ij.c() { // from class: com.planner5d.library.model.manager.builtin.n0
                @Override // ij.c
                public final Object get() {
                    return p0.a(e10);
                }
            });
            return null;
        }
    }

    @m1
    CatalogItem f(String str, boolean z10) {
        CatalogItem catalogItemC;
        CatalogItem catalogItemC2 = null;
        if (str == null) {
            return null;
        }
        if (z10 && (catalogItemC = this.f181189g.c(str)) != null) {
            return catalogItemC;
        }
        m mVarK = this.f181183a.get().K();
        try {
            if (mVarK.a() != null) {
                SQLiteDatabase sQLiteDatabaseA = mVarK.a();
                i.b bVar = i.b.catalogs_items;
                String str2 = t2.d(sQLiteDatabaseA, bVar.name(), "visible") ? ", CI.visible, CI.editable_materials, CI.editable_position, CI.editable_rotation, CI.editable_size " : "";
                try {
                    Cursor cursorRawQuery = mVarK.a().rawQuery("SELECT I.id, I.data, CI.metadata AS data_catalog " + str2 + "FROM " + i.b.items.name() + " I LEFT JOIN " + bVar.name() + " CI ON CI.catalog_id = ? AND CI.id = I.id WHERE I.id = ?", new String[]{String.valueOf(this.f181189g.b()), str});
                    try {
                        catalogItemC2 = cursorRawQuery.moveToNext() ? c(cursorRawQuery) : null;
                        cursorRawQuery.close();
                    } catch (Throwable th2) {
                        if (cursorRawQuery != null) {
                            try {
                                cursorRawQuery.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Exception unused) {
                }
            }
            mVarK.close();
            return catalogItemC2;
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

    @m1
    CatalogItem g() {
        m mVarK = this.f181183a.get().K();
        try {
            String string = null;
            if (mVarK.a() == null) {
                mVarK.close();
                return null;
            }
            Cursor cursorRawQuery = mVarK.a().rawQuery("SELECT id FROM " + i.b.catalogs_items.name() + " WHERE catalog_id = ? AND id LIKE 'room/%' LIMIT 1", new String[]{String.valueOf(this.f181189g.b())});
            try {
                int columnIndex = cursorRawQuery.getColumnIndex("id");
                if (columnIndex >= 0 && cursorRawQuery.moveToNext()) {
                    string = cursorRawQuery.getString(columnIndex);
                }
                cursorRawQuery.close();
                mVarK.close();
                return f(string, false);
            } catch (Throwable th2) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
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

    @m1
    Long h(String str) {
        return this.f181189g.d(str);
    }

    String i(CatalogItem catalogItem) {
        return k1.w(q(catalogItem), com.planner5d.library.services.r.className, null);
    }

    @m1
    List<String> j(SQLiteDatabase sQLiteDatabase, Boolean bool, org.apache.commons.collections4.l0<String> l0Var) {
        return com.planner5d.library.services.utility.e.g("id", u(sQLiteDatabase, bool), l0Var);
    }

    @m1
    String[] k(boolean z10, String[] strArr) {
        if (!z10) {
            return this.f181189g.g();
        }
        ArrayList arrayList = new ArrayList();
        m mVarK = this.f181183a.get().K();
        try {
            if (mVarK.a() != null) {
                Cursor cursorU = u(mVarK.a(), null);
                try {
                    ArrayList arrayList2 = new ArrayList();
                    Collections.addAll(arrayList2, strArr);
                    while (cursorU.moveToNext()) {
                        CatalogItem catalogItemC = c(cursorU);
                        if (catalogItemC.isFree() || arrayList2.contains(catalogItemC.f180761id)) {
                            arrayList.add(catalogItemC.f180761id);
                        }
                    }
                    cursorU.close();
                } catch (Throwable th2) {
                    if (cursorU != null) {
                        try {
                            cursorU.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            mVarK.close();
            return (String[]) arrayList.toArray(new String[0]);
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

    @m1
    List<CatalogItem> l(CatalogCategory catalogCategory, boolean z10, boolean z11, String[] strArr) {
        return n(this.f181189g.j(catalogCategory.getId()), z10, z11, strArr);
    }

    @m1
    List<CatalogItem> m(String[] strArr) {
        m mVarK = this.f181183a.get().K();
        try {
            if (mVarK.a() != null && strArr != null && strArr.length != 0) {
                StringBuilder sb2 = new StringBuilder();
                for (String str : strArr) {
                    if (sb2.length() > 0) {
                        sb2.append(AbstractJsonLexerKt.COMMA);
                    }
                    sb2.append('\"');
                    sb2.append(str);
                    sb2.append('\"');
                }
                ArrayList arrayList = new ArrayList();
                Cursor cursorRawQuery = mVarK.a().rawQuery("SELECT DISTINCT CI.id, I.data, CI.metadata AS data_catalog FROM " + i.b.catalogs_items.name() + " CI LEFT JOIN " + i.b.items.name() + " I ON CI.id = I.id WHERE CI.id IN (" + sb2.toString() + ") AND CI.catalog_id = ?", new String[]{String.valueOf(this.f181189g.b())});
                while (cursorRawQuery.moveToNext()) {
                    try {
                        arrayList.add(c(cursorRawQuery));
                    } catch (Throwable th2) {
                        if (cursorRawQuery != null) {
                            try {
                                cursorRawQuery.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                cursorRawQuery.close();
                this.f181189g.p(arrayList);
                mVarK.close();
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            mVarK.close();
            return arrayList2;
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

    @m1
    List<CatalogItem> n(String[] strArr, boolean z10, boolean z11, String[] strArr2) {
        List<CatalogItem> listM = m(strArr);
        Iterator<CatalogItem> it = listM.iterator();
        while (it.hasNext()) {
            CatalogItem next = it.next();
            if (z10 && (next.f180761id.startsWith("room/") || next.f180761id.startsWith("ground/") || next.f180761id.startsWith("action/"))) {
                it.remove();
            }
        }
        if (z11) {
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, strArr2);
            ArrayList arrayList2 = new ArrayList();
            for (CatalogItem catalogItem : listM) {
                if (arrayList.contains(catalogItem.f180761id) || catalogItem.isFree()) {
                    arrayList2.add(catalogItem);
                }
            }
            listM.removeAll(arrayList2);
            arrayList2.addAll(listM);
            listM.clear();
            listM.addAll(arrayList2);
        }
        return listM;
    }

    @m1
    Map<String, CatalogItem> o(String[] strArr) {
        HashMap map = new HashMap();
        for (CatalogItem catalogItem : m(strArr)) {
            map.put(catalogItem.f180761id, catalogItem);
        }
        return map;
    }

    Model2D p(CatalogItem catalogItem) {
        try {
            JSONObject jSONObjectQ = q(catalogItem);
            if (jSONObjectQ == null) {
                return null;
            }
            return this.f181185c.get().convert(new Pair<>(jSONObjectQ, catalogItem));
        } catch (JSONException unused) {
            return null;
        }
    }

    @m1
    boolean r(String str) {
        if (str != null && !str.isEmpty()) {
            for (String str2 : k(false, null)) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
