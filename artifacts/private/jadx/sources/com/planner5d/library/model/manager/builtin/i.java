package com.planner5d.library.model.manager.builtin;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.activeandroid.Configuration;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterialSet;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.ProviderUid;
import com.planner5d.library.model.item.builder.ItemBuilder;
import com.planner5d.library.model.item.catalog.CatalogCategory;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.item.catalog.CatalogItemMetadata;
import com.planner5d.library.model.item.model2d.Model2D;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.services.utility.h3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class i implements l, x1 {
    public static final String C = "database.sqlite";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected n1 f181000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.config.p f181001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    protected p0 f181002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ij.a
    protected y f181003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ij.a
    protected u f181004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @ij.a
    protected r f181005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.application.b f181006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ij.a
    protected fg.e<ItemBuilder> f181007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ij.a
    protected fg.e<com.planner5d.library.model.converter.json.to.o> f181008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ij.a
    protected fg.e<p> f181009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @ij.a
    protected fg.e<v0> f181010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @ij.a
    protected fg.e<com.planner5d.library.model.manager.managedfiles.a0> f181011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @ij.a
    protected fg.e<com.planner5d.library.modules.user.user.t0> f181012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @ij.a
    protected fg.e<l0> f181013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @ij.a
    protected fg.e<t1> f181014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @ij.a
    protected g0 f181015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.services.z f181016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @ij.a
    protected le.f f181017t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f181018u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Object f181019v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List<m> f181020w = new LinkedList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private SQLiteDatabase f181021x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private File f181022y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private SQLiteDatabase f181023z = null;
    private boolean A = false;
    private final AtomicBoolean B = new AtomicBoolean(false);

    public enum a {
        BuiltIn,
        Active
    }

    public enum b {
        items,
        categories,
        catalogs_items,
        catalogs_categories,
        catalogs_room_types,
        files,
        textures,
        texture_types,
        room_types,
        demo_projects,
        tags,
        search_index,
        search_index_ids,
        search_index_words,
        languages,
        version
    }

    @ij.a
    public i() {
    }

    @m1
    private List<String> A(SQLiteDatabase sQLiteDatabase, Boolean bool, final org.apache.commons.collections4.l0<String> l0Var) {
        return this.f181002e.j(sQLiteDatabase, bool, new org.apache.commons.collections4.l0() { // from class: com.planner5d.library.model.manager.builtin.g
            @Override // org.apache.commons.collections4.l0
            public final boolean a(Object obj) {
                return i.f(l0Var, (String) obj);
            }
        });
    }

    @m1
    private m L(com.planner5d.library.model.d dVar) {
        m mVarK = K();
        if (!dVar.f180677a.equals(P(mVarK.a()))) {
            m mVarM = M(a.BuiltIn);
            if (dVar.f180677a.equals(P(mVarM.a()))) {
                mVarK.close();
                return mVarM;
            }
            mVarM.close();
        }
        return mVarK;
    }

    @m1
    private m M(a aVar) {
        while (true) {
            synchronized (this.f181018u) {
                try {
                    if (this.B.get()) {
                        if (aVar == a.BuiltIn) {
                            if (this.f181023z == null) {
                                this.f181023z = com.planner5d.library.model.manager.l.c(N(false));
                            }
                            return new m(this.f181023z, this);
                        }
                        if (!this.A && this.f181021x != null) {
                            m mVar = new m(this.f181021x, this);
                            this.f181020w.add(mVar);
                            return mVar;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Thread.yield();
        }
    }

    @fj.g
    @m1
    private InputStream O(@fj.g String str) throws IOException {
        try {
            try {
                return this.f181006i.getAssets().open(str);
            } catch (Throwable th2) {
                throw new IOException("Could not download the initial database: " + th2, th2);
            }
        } catch (IOException unused) {
            return new FileInputStream(this.f181015r.h());
        }
    }

    @m1
    private String P(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            Cursor cursorQuery = sQLiteDatabase.query(b.version.name(), new String[]{"version"}, null, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    String string = cursorQuery.moveToNext() ? cursorQuery.getString(0) : null;
                    cursorQuery.close();
                    return string;
                } catch (Throwable th2) {
                    try {
                        cursorQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return null;
    }

    public static /* synthetic */ int c(com.planner5d.library.model.n nVar, com.planner5d.library.model.n nVar2) {
        String str = nVar.f222432a.metadata.category;
        if (str == null) {
            return -1;
        }
        return str.compareTo(nVar2.f222432a.metadata.category);
    }

    public static /* synthetic */ boolean f(org.apache.commons.collections4.l0 l0Var, String str) {
        return Item.isIdForItemNs(str) && (l0Var == null || l0Var.a(str));
    }

    public static /* synthetic */ int i(Integer num, Integer num2) {
        return num.intValue() - num2.intValue();
    }

    private void l() {
        while (true) {
            Thread.yield();
            synchronized (this.f181018u) {
                try {
                    if (!this.A) {
                        if (this.f181020w.isEmpty()) {
                            break;
                        }
                        Iterator<m> it = this.f181020w.iterator();
                        while (it.hasNext()) {
                            if (it.next().a() == null) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        SQLiteDatabase sQLiteDatabase = this.f181021x;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.f181022y = null;
            this.f181021x = null;
        }
        this.A = true;
    }

    @m1
    private void o0() throws Throwable {
        FileOutputStream fileOutputStream;
        if (this.f181001d == null) {
            return;
        }
        int iJ = h3.j(this.f181006i);
        File fileN = N(false);
        com.planner5d.library.model.manager.config.p pVar = this.f181001d;
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.databaseVersion;
        if (pVar.l(rVar, -1) != iJ && fileN.exists() && !fileN.delete()) {
            throw new RuntimeException("Could not install database");
        }
        if (fileN.exists()) {
            return;
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamO = O(fileN.getName());
            try {
                fileOutputStream = new FileOutputStream(fileN);
                try {
                    org.apache.commons.io.p.v(inputStreamO, fileOutputStream);
                    this.f181001d.g(rVar, iJ);
                    org.apache.commons.io.p.r(inputStreamO, fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamO;
                    org.apache.commons.io.p.r(inputStream, fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private <T> T q(Callable<T> callable) throws Throwable {
        try {
            l();
            T tCall = callable.call();
            synchronized (this.f181018u) {
                this.A = false;
            }
            A0().subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
            return tCall;
        } catch (Throwable th2) {
            synchronized (this.f181018u) {
                this.A = false;
                A0().subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
                throw th2;
            }
        }
    }

    @m1
    private boolean t0(com.planner5d.library.model.d dVar) {
        String str;
        if (dVar == null) {
            str = null;
        } else {
            try {
                str = dVar.f180678b;
            } catch (Throwable unused) {
            }
        }
        return str != null && str.equals(com.planner5d.library.services.utility.e0.d(N(true)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(String[] strArr, Subscriber subscriber) {
        CatalogItem catalogItem;
        CatalogItemMetadata catalogItemMetadata;
        com.planner5d.library.model.n nVar;
        String strG;
        ArrayList<com.planner5d.library.model.n> arrayList = new ArrayList();
        if (strArr.length > 0) {
            String[] strArr2 = new String[strArr.length / 2];
            for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                strArr2[i10 / 2] = strArr[i10];
            }
            Map<String, CatalogItem> mapO = this.f181002e.o(strArr2);
            for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                String str = strArr[i11];
                if (mapO.containsKey(str) && (catalogItemMetadata = (catalogItem = mapO.get(str)).metadata) != null && (strG = (nVar = new com.planner5d.library.model.n(catalogItem, catalogItemMetadata.materialSets.get(strArr[i11 + 1]))).g()) != null && !strG.isEmpty()) {
                    arrayList.add(nVar);
                }
            }
            Collections.sort(arrayList, new Comparator() { // from class: com.planner5d.library.model.manager.builtin.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return i.c((com.planner5d.library.model.n) obj, (com.planner5d.library.model.n) obj2);
                }
            });
            HashMap map = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String strG2 = ((com.planner5d.library.model.n) it.next()).g();
                int iIntValue = 1;
                if (map.containsKey(strG2)) {
                    iIntValue = 1 + ((Integer) map.get(strG2)).intValue();
                }
                map.put(strG2, Integer.valueOf(iIntValue));
            }
            ArrayList arrayList2 = new ArrayList();
            for (com.planner5d.library.model.n nVar2 : arrayList) {
                String strG3 = nVar2.g();
                if (map.containsKey(strG3)) {
                    arrayList2.add(new com.planner5d.library.model.n(nVar2, ((Integer) map.get(strG3)).intValue()));
                    map.remove(strG3);
                }
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
        }
        subscriber.onNext(arrayList.toArray(new com.planner5d.library.model.n[0]));
        subscriber.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean v0(com.planner5d.library.model.d dVar) throws Exception {
        return Boolean.valueOf(t0(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void w0() throws Exception {
        File fileN;
        SQLiteDatabase sQLiteDatabaseC;
        l();
        try {
            synchronized (this.f181019v) {
                try {
                    if (!this.B.get()) {
                        o0();
                        this.B.set(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (t0(this.f181009l.get().b())) {
                fileN = N(true);
                sQLiteDatabaseC = com.planner5d.library.model.manager.l.c(fileN);
            } else {
                fileN = null;
                sQLiteDatabaseC = null;
            }
            if (sQLiteDatabaseC == null && (sQLiteDatabaseC = com.planner5d.library.model.manager.l.c((fileN = N(false)))) == null) {
                synchronized (this.f181018u) {
                    this.A = false;
                }
                this.f181014q.get().u(new LogRecord("reconnect_db_failed", "No connection"));
                throw new RuntimeException("Could not connect to database");
            }
            synchronized (this.f181018u) {
                this.f181022y = fileN;
                this.f181021x = sQLiteDatabaseC;
                this.f181005h.a();
                this.A = false;
            }
            return null;
        } catch (IOException e10) {
            synchronized (this.f181018u) {
                try {
                    this.A = false;
                    this.f181014q.get().u(new LogRecord("reconnect_db_failed", null, e10));
                    throw e10;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object x0(File file) throws Exception {
        File fileN = N(true);
        if (fileN.isFile() && !fileN.delete()) {
            throw new IOException("Cannot delete file: " + fileN.getAbsolutePath());
        }
        if (file.renameTo(fileN)) {
            return null;
        }
        throw new IOException("Cannot rename to file: " + fileN.getAbsolutePath());
    }

    @m1
    private Map<Integer, com.planner5d.library.model.v> y0() {
        String strA = this.f181000c.a(this.f181006i);
        Map<Integer, com.planner5d.library.model.v> mapB = this.f181005h.b(strA);
        if (mapB != null) {
            return mapB;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m mVarK = K();
        try {
            if (mVarK.a() != null) {
                Cursor cursorQuery = mVarK.a().query(b.room_types.name(), null, null, null, null, null, null, null);
                try {
                    int columnIndex = cursorQuery.getColumnIndex("id");
                    int iC = this.f181000c.c("title", this.f181006i, cursorQuery);
                    if (columnIndex >= 0 && iC >= 0) {
                        while (cursorQuery.moveToNext()) {
                            com.planner5d.library.model.v vVar = new com.planner5d.library.model.v(cursorQuery.getInt(columnIndex), cursorQuery.getString(iC));
                            linkedHashMap.put(Integer.valueOf(vVar.a()), vVar);
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
            this.f181005h.g(strA, linkedHashMap);
            mVarK.close();
            return linkedHashMap;
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

    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    @m1
    private Map<String, com.planner5d.library.model.y> z0() {
        boolean z10;
        Integer num;
        Map<String, com.planner5d.library.model.y> mapD = this.f181005h.d();
        if (mapD != null) {
            return mapD;
        }
        m mVarK = K();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedList linkedList = new LinkedList();
            if (mVarK.a() != null) {
                Cursor cursorQuery = mVarK.a().query(b.textures.name(), null, null, null, null, null, null, null);
                try {
                    int columnIndex = cursorQuery.getColumnIndex("id");
                    int columnIndex2 = cursorQuery.getColumnIndex("scale");
                    int columnIndex3 = cursorQuery.getColumnIndex("type_id");
                    int columnIndex4 = cursorQuery.getColumnIndex(Configuration.SQL_PARSER_LEGACY);
                    if (columnIndex >= 0 && columnIndex3 >= 0) {
                        while (cursorQuery.moveToNext()) {
                            String string = cursorQuery.getString(columnIndex);
                            com.planner5d.library.model.p pVarD = this.f181010m.get().d(string);
                            int iIntValue = (pVarD == null || (num = pVarD.f222440b) == null) ? -1 : num.intValue();
                            float f10 = columnIndex2 == -1 ? 1.0f : cursorQuery.getFloat(columnIndex2);
                            String string2 = cursorQuery.getString(columnIndex3);
                            if (columnIndex4 != -1) {
                                z10 = cursorQuery.getInt(columnIndex4) == 1;
                            }
                            com.planner5d.library.model.y yVar = new com.planner5d.library.model.y(string, iIntValue, f10, string2, z10);
                            linkedHashMap.put(yVar.f222851c, yVar);
                            linkedList.add(yVar.f222851c);
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
            this.f181005h.h(linkedHashMap, linkedList);
            mVarK.close();
            return linkedHashMap;
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

    Observable<Void> A0() {
        return com.planner5d.library.services.rx.i.g(new Callable() { // from class: com.planner5d.library.model.manager.builtin.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f180990a.w0();
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    @m1
    public List<String> B(com.planner5d.library.model.d dVar, id.a aVar) {
        m mVarL = L(dVar);
        try {
            List<String> listZ = z(mVarL.a(), aVar);
            mVarL.close();
            return listZ;
        } catch (Throwable th2) {
            if (mVarL != null) {
                try {
                    mVarL.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    void B0(m mVar) {
        synchronized (this.f181018u) {
            try {
                this.f181020w.remove(mVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @m1
    public List<CatalogItem> C(CatalogCategory catalogCategory, c1 c1Var) {
        return this.f181002e.l(catalogCategory, c1Var.f180956a, c1Var.f180957b, c1Var.f180958c);
    }

    @m1
    public Cursor C0(SQLiteDatabase sQLiteDatabase) {
        int i10 = 7 & 0;
        return sQLiteDatabase.query(b.files.name(), new String[]{"path", "hash", "size"}, null, null, null, null, null, null);
    }

    @m1
    public List<CatalogItem> D(String[] strArr, c1 c1Var) {
        return this.f181002e.n(strArr, c1Var.f180956a, c1Var.f180957b, c1Var.f180958c);
    }

    @m1
    public void D0(Project project, com.planner5d.library.model.e eVar) {
        this.f181013p.get().r(project, eVar);
    }

    @m1
    public List<com.planner5d.library.model.v> E() {
        List<com.planner5d.library.model.v> listC0 = c0();
        try {
            Iterator<com.planner5d.library.model.v> it = listC0.iterator();
            List<Integer> listH = this.f181004g.h();
            while (it.hasNext()) {
                if (!listH.contains(Integer.valueOf(it.next().a()))) {
                    it.remove();
                }
            }
        } catch (Throwable unused) {
        }
        return listC0;
    }

    @m1
    void E0(final File file) throws IOException {
        try {
            q(new Callable() { // from class: com.planner5d.library.model.manager.builtin.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f180959a.x0(file);
                }
            });
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }

    @m1
    public void F(List<String> list, List<String> list2) {
        this.f181004g.i(list, list2);
    }

    @m1
    public CatalogCategory G(long j10) {
        return this.f181003f.e(j10);
    }

    @m1
    public List<CatalogCategory> H(CatalogCategory catalogCategory) {
        return this.f181003f.f(catalogCategory == null ? 0L : catalogCategory.getId());
    }

    @m1
    public String I(int i10) {
        return this.f181003f.l(i10);
    }

    @m1
    public String J(SparseIntArray sparseIntArray, int i10) {
        String str = "";
        if (i10 == 0) {
            return "";
        }
        int i11 = sparseIntArray.get(i10);
        StringBuilder sb2 = new StringBuilder();
        if (i11 != 0) {
            str = J(sparseIntArray, i11) + " - ";
        }
        sb2.append(str);
        sb2.append(I(i10));
        return sb2.toString();
    }

    @m1
    m K() {
        return M(a.Active);
    }

    public File N(boolean z10) {
        return z10 ? com.planner5d.library.services.w.f229889a.a(this.f181006i, C) : this.f181016s.a(C);
    }

    @m1
    public String Q(a aVar) {
        m mVarM = M(aVar);
        try {
            String strP = P(mVarM.a());
            mVarM.close();
            return strP;
        } catch (Throwable th2) {
            if (mVarM != null) {
                try {
                    mVarM.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public File R(Project project) {
        return this.f181013p.get().i(project);
    }

    @m1
    public com.planner5d.library.model.e[] S() {
        return this.f181013p.get().p(true);
    }

    @m1
    String T(String str, a aVar) {
        m mVarM = M(aVar);
        try {
            SQLiteDatabase sQLiteDatabaseA = mVarM.a();
            if (sQLiteDatabaseA == null) {
                mVarM.close();
                return null;
            }
            Cursor cursorQuery = sQLiteDatabaseA.query(b.files.name(), new String[]{"hash"}, "path = ?", new String[]{str}, null, null, null);
            try {
                String string = cursorQuery.moveToNext() ? cursorQuery.getString(0) : null;
                cursorQuery.close();
                mVarM.close();
                return string;
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
        } catch (Throwable th4) {
            if (mVarM == null) {
                throw th4;
            }
            try {
                mVarM.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @m1
    public boolean U(com.planner5d.library.model.y yVar) {
        String str;
        if (yVar == null || (str = yVar.f222851c) == null) {
            return false;
        }
        if (V(str)) {
            return true;
        }
        z0();
        return this.f181005h.e().contains(yVar.f222851c);
    }

    public boolean V(String str) {
        return str != null && str.startsWith("ut/");
    }

    @m1
    public Long W(String str) {
        return this.f181002e.h(str);
    }

    public String X(CatalogItem catalogItem) {
        return this.f181002e.i(catalogItem);
    }

    @m1
    public com.planner5d.library.model.o Y(String str) {
        return this.f181004g.k(str);
    }

    public Model2D Z(CatalogItem catalogItem) {
        return this.f181002e.p(catalogItem);
    }

    @m1
    public byte[] a0() {
        try {
            ItemProject itemProject = new ItemProject(new JSONObject());
            oa.b bVar = new oa.b(itemProject);
            ItemFloor itemFloor = new ItemFloor(bVar.createUid());
            itemFloor.title = "1";
            CatalogItem catalogItemG = this.f181002e.g();
            itemProject.setFloor(itemFloor, 0);
            if (catalogItemG != null) {
                Item itemCreateItemFromUri = this.f181007j.get().createItemFromUri(ItemBuilder.createItemUri(catalogItemG), itemFloor, bVar);
                itemFloor.addItem(itemCreateItemFromUri, null);
                if (itemCreateItemFromUri instanceof ItemWalls) {
                    ItemLayout layout = itemCreateItemFromUri.getLayout(new ItemLayout());
                    layout.setPosition(3750.0f, 3750.0f);
                    itemCreateItemFromUri.setLayout(layout);
                }
            }
            return this.f181008k.get().h(itemProject, false).toString().getBytes();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.planner5d.library.model.manager.builtin.l
    @NonNull
    @m1
    public String[] b(boolean z10, @androidx.annotation.p0 String[] strArr) {
        return this.f181002e.k(z10, strArr);
    }

    @m1
    public com.planner5d.library.model.v b0(int i10) {
        return y0().get(Integer.valueOf(i10));
    }

    @m1
    public List<com.planner5d.library.model.v> c0() {
        Map<Integer, com.planner5d.library.model.v> mapY0 = y0();
        ArrayList arrayList = new ArrayList(mapY0.keySet());
        Collections.sort(arrayList, new Comparator() { // from class: com.planner5d.library.model.manager.builtin.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return i.i((Integer) obj, (Integer) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(mapY0.get((Integer) it.next()));
        }
        return arrayList2;
    }

    @m1
    public com.planner5d.library.model.x d0(long j10) {
        com.planner5d.library.model.x[] xVarArrG0 = g0(String.valueOf(j10));
        if (xVarArrG0.length > 0) {
            return xVarArrG0[0];
        }
        return null;
    }

    @m1
    public com.planner5d.library.model.x[] e0() {
        com.planner5d.library.model.x[] xVarArr;
        String strA = this.f181000c.a(this.f181006i);
        Map<String, com.planner5d.library.model.x[]> mapC = this.f181005h.c();
        if (!mapC.containsKey(strA)) {
            m mVarK = K();
            try {
                if (mVarK.a() == null) {
                    xVarArr = new com.planner5d.library.model.x[0];
                } else {
                    Cursor cursorQuery = mVarK.a().query(b.tags.name(), null, null, null, null, null, null, null);
                    try {
                        com.planner5d.library.model.x[] xVarArr2 = new com.planner5d.library.model.x[cursorQuery.getCount()];
                        int columnIndex = cursorQuery.getColumnIndex("id");
                        int iC = this.f181000c.c("title", this.f181006i, cursorQuery);
                        if (columnIndex >= 0 && iC >= 0) {
                            while (cursorQuery.moveToNext()) {
                                xVarArr2[cursorQuery.getPosition()] = new com.planner5d.library.model.x(cursorQuery.getLong(columnIndex), cursorQuery.getString(iC));
                            }
                        }
                        cursorQuery.close();
                        mapC.put(strA, xVarArr2);
                        xVarArr = xVarArr2;
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
                if (xVarArr.length == 0) {
                    mVarK.close();
                    return xVarArr;
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
        return mapC.get(strA);
    }

    @m1
    public com.planner5d.library.model.x[] f0(long[] jArr) {
        com.planner5d.library.model.x[] xVarArr = new com.planner5d.library.model.x[jArr.length];
        if (jArr.length != 0) {
            com.planner5d.library.model.x[] xVarArrE0 = e0();
            if (xVarArrE0.length != 0) {
                for (int i10 = 0; i10 < jArr.length; i10++) {
                    for (com.planner5d.library.model.x xVar : xVarArrE0) {
                        if (xVar.f222847a == jArr[i10]) {
                            xVarArr[i10] = xVar;
                            break;
                        }
                    }
                }
            }
        }
        return xVarArr;
    }

    @m1
    public com.planner5d.library.model.x[] g0(String... strArr) {
        if (strArr.length == 0) {
            return new com.planner5d.library.model.x[0];
        }
        long[] jArr = new long[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            jArr[i10] = Long.parseLong(strArr[i10]);
        }
        return f0(jArr);
    }

    @m1
    public com.planner5d.library.model.y h0(String str) {
        Map<String, com.planner5d.library.model.y> mapZ0 = z0();
        com.planner5d.library.model.y yVar = mapZ0.get(str);
        if (yVar != null) {
            return yVar;
        }
        com.planner5d.library.model.y yVar2 = new com.planner5d.library.model.y(str);
        mapZ0.put(str, yVar2);
        return yVar2;
    }

    @m1
    public com.planner5d.library.model.z[] i0(boolean z10) {
        com.planner5d.library.model.z[] zVarArr;
        m mVarK = K();
        try {
            SQLiteDatabase sQLiteDatabaseA = mVarK.a();
            int i10 = 0;
            if (sQLiteDatabaseA == null) {
                zVarArr = new com.planner5d.library.model.z[0];
            } else {
                Cursor cursorQuery = sQLiteDatabaseA.query(b.texture_types.name(), null, z10 ? null : "id != 1", null, null, null, null, null);
                try {
                    com.planner5d.library.model.z[] zVarArr2 = new com.planner5d.library.model.z[cursorQuery.getCount()];
                    int columnIndex = cursorQuery.getColumnIndex("id");
                    int iC = this.f181000c.c("title", this.f181006i, cursorQuery);
                    if (columnIndex >= 0 && iC >= 0) {
                        while (cursorQuery.moveToNext()) {
                            int i11 = i10 + 1;
                            zVarArr2[i10] = new com.planner5d.library.model.z(cursorQuery.getString(columnIndex), org.apache.commons.lang3.z.i(cursorQuery.getString(iC)));
                            i10 = i11;
                        }
                    }
                    cursorQuery.close();
                    zVarArr = zVarArr2;
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
            mVarK.close();
            return zVarArr;
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

    @m1
    public com.planner5d.library.model.y[] j0(com.planner5d.library.model.z zVar, boolean z10) {
        Map<String, com.planner5d.library.model.y> mapZ0 = z0();
        List<String> listE = this.f181005h.e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(mapZ0.keySet());
        String str = zVar.f222860a;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.planner5d.library.model.y yVar = mapZ0.get((String) it.next());
            if (str.equals(yVar.f222850b) && (!z10 || listE.contains(yVar.f222851c))) {
                arrayList.add(yVar);
            }
        }
        return (com.planner5d.library.model.y[]) arrayList.toArray(new com.planner5d.library.model.y[0]);
    }

    public Observable<com.planner5d.library.model.n[]> k0(final String[] strArr) {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.builtin.a
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f180935a.u0(strArr, (Subscriber) obj);
            }
        });
    }

    @m1
    boolean l0(String str) {
        return T(str, a.BuiltIn) != null;
    }

    @m1
    public Item m(String str, ItemFloor itemFloor, ProviderUid providerUid) {
        return this.f181002e.d(str, itemFloor, providerUid);
    }

    @m1
    public boolean m0(Item item) {
        CatalogItemMetadata catalogItemMetadata;
        String str;
        if (item instanceof ItemNs) {
            ItemNs itemNs = (ItemNs) item;
            ItemMaterialSet materialSet = itemNs.getMaterialSet();
            int i10 = 4 ^ 1;
            CatalogItem catalogItemF = this.f181002e.f(itemNs.getModelId(), true);
            if (catalogItemF != null && (catalogItemMetadata = catalogItemF.metadata) != null && (str = catalogItemMetadata.title) != null && !str.isEmpty() && materialSet != null) {
                return true;
            }
        }
        return false;
    }

    @m1
    public List<Item> n(byte[] bArr, ItemFloor itemFloor, ProviderUid providerUid) {
        return this.f181002e.e(bArr, itemFloor, providerUid);
    }

    public Observable<Void> n0() {
        return this.B.get() ? Observable.empty() : A0();
    }

    @m1
    public void o(Project project) {
        this.f181013p.get().f(project);
    }

    @m1
    public void p(Project project) {
        this.f181013p.get().g(project);
    }

    @m1
    public void p0() {
        this.f181015r.q();
        com.planner5d.library.model.d dVarA = this.f181009l.get().a();
        if (dVarA != null) {
            this.f181017t.a(dVarA);
        }
    }

    @m1
    boolean q0() {
        m mVarK = K();
        try {
            boolean zEquals = N(false).equals(this.f181022y);
            if (mVarK != null) {
                mVarK.close();
            }
            return zEquals;
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

    @Override // com.planner5d.library.model.manager.builtin.l
    @m1
    @androidx.annotation.p0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public CatalogItem a(String str) {
        return this.f181002e.f(str, true);
    }

    @m1
    public boolean r0(String str) {
        return this.f181002e.r(str);
    }

    @m1
    boolean s0(final com.planner5d.library.model.d dVar) {
        try {
            return ((Boolean) q(new Callable() { // from class: com.planner5d.library.model.manager.builtin.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f180951a.v0(dVar);
                }
            })).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @m1
    public List<CatalogCategory> t(long[] jArr) {
        return this.f181003f.d(jArr);
    }

    @m1
    public List<Long> u(List<Long> list) {
        return this.f181003f.c(list);
    }

    int v() {
        return this.f181004g.b();
    }

    @m1
    public CatalogItem w(String str) {
        return this.f181002e.f(str, false);
    }

    @m1
    public List<String> x(SQLiteDatabase sQLiteDatabase) {
        int i10 = 2 ^ 0;
        return this.f181002e.j(sQLiteDatabase, null, null);
    }

    @m1
    public List<String> y(List<String> list) {
        return this.f181004g.f(list);
    }

    @m1
    public List<String> z(SQLiteDatabase sQLiteDatabase, id.a aVar) {
        org.apache.commons.collections4.l0<String> l0Var;
        int i10 = 1 >> 0;
        if (this.f181012o.get().F(aVar)) {
            l0Var = null;
        } else {
            final LinkedList linkedList = new LinkedList(A(sQLiteDatabase, Boolean.TRUE, null));
            Collections.addAll(linkedList, this.f181012o.get().T());
            l0Var = new org.apache.commons.collections4.l0() { // from class: com.planner5d.library.model.manager.builtin.e
                @Override // org.apache.commons.collections4.l0
                public final boolean a(Object obj) {
                    return linkedList.contains((String) obj);
                }
            };
        }
        return A(sQLiteDatabase, null, l0Var);
    }
}
