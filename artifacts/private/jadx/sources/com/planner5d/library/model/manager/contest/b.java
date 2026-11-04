package com.planner5d.library.model.manager.contest;

import android.util.SparseIntArray;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.activeandroid.query.Select;
import com.planner5d.library.database.model.catalog.CatalogCategoryLink;
import com.planner5d.library.database.model.catalog.CatalogItemLink;
import com.planner5d.library.model.item.catalog.CatalogCategory;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.manager.builtin.c1;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.services.utility.k3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@m1
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nContestDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestDataManager.kt\ncom/planner5d/library/model/manager/contest/ContestDataManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,114:1\n1611#2,9:115\n1863#2:124\n1864#2:126\n1620#2:127\n1611#2,9:128\n1863#2:137\n1864#2:139\n1620#2:140\n1611#2,9:141\n1863#2:150\n1864#2:152\n1620#2:153\n1611#2,9:156\n1863#2:165\n1864#2:167\n1620#2:168\n1863#2,2:169\n1#3:125\n1#3:138\n1#3:151\n1#3:166\n37#4,2:154\n*S KotlinDebug\n*F\n+ 1 ContestDataManager.kt\ncom/planner5d/library/model/manager/contest/ContestDataManager\n*L\n36#1:115,9\n36#1:124\n36#1:126\n36#1:127\n44#1:128,9\n44#1:137\n44#1:139\n44#1:140\n74#1:141,9\n74#1:150\n74#1:152\n74#1:153\n98#1:156,9\n98#1:165\n98#1:167\n98#1:168\n101#1:169,2\n36#1:125\n44#1:138\n74#1:151\n98#1:166\n74#1:154,2\n*E\n"})
public final class b implements x1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f190969e = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f190970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<Long, a> f190971d;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<String> f190972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final SparseIntArray f190973b;

        public a(@NotNull List<String> itemIds, @NotNull SparseIntArray categoriesParentIds) {
            Intrinsics.checkNotNullParameter(itemIds, "itemIds");
            Intrinsics.checkNotNullParameter(categoriesParentIds, "categoriesParentIds");
            this.f190972a = itemIds;
            this.f190973b = categoriesParentIds;
        }

        @NotNull
        public final SparseIntArray a() {
            return this.f190973b;
        }

        @NotNull
        public final List<String> b() {
            return this.f190972a;
        }
    }

    @ij.a
    public b(@NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager) {
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        this.f190970c = builtInDataManager;
        this.f190971d = new LinkedHashMap();
    }

    @m1
    private final a b(long j10) {
        a aVar;
        synchronized (this.f190971d) {
            try {
                aVar = this.f190971d.get(Long.valueOf(j10));
                if (aVar == null) {
                    List listExecute = new Select().from(CatalogItemLink.class).where("catalog_id = ?", Long.valueOf(j10)).execute();
                    Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listExecute.iterator();
                    while (it.hasNext()) {
                        String strW = ((CatalogItemLink) it.next()).w();
                        if (strW != null) {
                            arrayList.add(strW);
                        }
                    }
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    List<CatalogCategoryLink> listExecute2 = new Select().from(CatalogCategoryLink.class).where("catalog_id = ?", Long.valueOf(j10)).execute();
                    Intrinsics.checkNotNullExpressionValue(listExecute2, "execute(...)");
                    for (CatalogCategoryLink catalogCategoryLink : listExecute2) {
                        Long lU = catalogCategoryLink.u();
                        if (lU != null) {
                            long jLongValue = lU.longValue();
                            Long lV = catalogCategoryLink.v();
                            if (lV != null) {
                                sparseIntArray.append((int) jLongValue, (int) lV.longValue());
                            }
                        }
                    }
                    a aVar2 = new a(arrayList, sparseIntArray);
                    this.f190971d.put(Long.valueOf(j10), aVar2);
                    aVar = aVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence h(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "'" + it + "'";
    }

    private final boolean k(List<CatalogItemLink> list, String str) {
        for (CatalogItemLink catalogItemLink : list) {
            if (Intrinsics.areEqual(catalogItemLink.w(), str)) {
                return catalogItemLink.v();
            }
        }
        return false;
    }

    @m1
    private final List<CatalogItem> m(List<CatalogItemLink> list, c1 c1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String strW = ((CatalogItemLink) it.next()).w();
            if (strW != null) {
                arrayList.add(strW);
            }
        }
        List<CatalogItem> listD = this.f190970c.D((String[]) arrayList.toArray(new String[0]), c1Var);
        for (CatalogItem catalogItem : listD) {
            catalogItem.setFree(k(list, catalogItem.f180761id));
        }
        Intrinsics.checkNotNull(listD);
        return listD;
    }

    @m1
    private final CatalogCategory n(CatalogCategoryLink catalogCategoryLink) {
        CatalogCategory catalogCategoryG;
        Long lV;
        com.planner5d.library.model.manager.builtin.i iVar = this.f190970c;
        Long lU = catalogCategoryLink.u();
        if (lU != null && (catalogCategoryG = iVar.G(lU.longValue())) != null && (lV = catalogCategoryLink.v()) != null) {
            long jLongValue = lV.longValue();
            String strI = this.f190970c.I((int) catalogCategoryG.getId());
            Intrinsics.checkNotNullExpressionValue(strI, "getCategoryTitle(...)");
            k3 k3Var = new k3(strI);
            com.planner5d.library.model.manager.builtin.i iVar2 = this.f190970c;
            Long lS = catalogCategoryLink.s();
            if (lS != null) {
                return new CatalogCategory(k3Var, iVar2.J(b(lS.longValue()).a(), (int) jLongValue), catalogCategoryG.getIcon(), catalogCategoryG.getId(), jLongValue);
            }
        }
        return null;
    }

    @m1
    @NotNull
    public final List<CatalogCategory> c(long j10, @NotNull long[] linkIds) {
        Intrinsics.checkNotNullParameter(linkIds, "linkIds");
        List<CatalogCategoryLink> listExecute = new Select().from(CatalogCategoryLink.class).where("catalog_id = ? AND category_id in (" + ArraysKt.joinToString$default(linkIds, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + ")", Long.valueOf(j10)).execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        ArrayList arrayList = new ArrayList();
        for (CatalogCategoryLink catalogCategoryLink : listExecute) {
            Intrinsics.checkNotNull(catalogCategoryLink);
            CatalogCategory catalogCategoryN = n(catalogCategoryLink);
            if (catalogCategoryN != null) {
                arrayList.add(catalogCategoryN);
            }
        }
        return arrayList;
    }

    @m1
    @NotNull
    public final List<CatalogItem> d(long j10, @NotNull CatalogCategory category, @NotNull c1 query) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(query, "query");
        List<CatalogItemLink> listExecute = new Select().from(CatalogItemLink.class).where("catalog_id = ? AND category_id = ?", Long.valueOf(j10), Long.valueOf(category.getId())).execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        return m(listExecute, query);
    }

    @m1
    @NotNull
    public final List<CatalogItem> f(long j10, @NotNull String[] linkIds, @NotNull c1 query) {
        Intrinsics.checkNotNullParameter(linkIds, "linkIds");
        Intrinsics.checkNotNullParameter(query, "query");
        List<CatalogItemLink> listExecute = new Select().from(CatalogItemLink.class).where("catalog_id = ? AND item_id in (" + ArraysKt.joinToString$default(linkIds, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.planner5d.library.model.manager.contest.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.h((String) obj);
            }
        }, 30, (Object) null) + ")", Long.valueOf(j10)).execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        return m(listExecute, query);
    }

    @m1
    @Nullable
    public final CatalogCategory i(long j10, long j11) {
        CatalogCategoryLink catalogCategoryLink = (CatalogCategoryLink) new Select().from(CatalogCategoryLink.class).where("catalog_id = ? AND category_id = ?", Long.valueOf(j10), Long.valueOf(j11)).executeSingle();
        if (catalogCategoryLink != null) {
            return n(catalogCategoryLink);
        }
        return null;
    }

    @m1
    @NotNull
    public final List<CatalogCategory> j(long j10, @Nullable CatalogCategory catalogCategory) {
        List<CatalogCategoryLink> listExecute = new Select().from(CatalogCategoryLink.class).where("catalog_id = ? AND parent_category_id = ?", Long.valueOf(j10), Long.valueOf(catalogCategory != null ? catalogCategory.getId() : 0L)).execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        ArrayList arrayList = new ArrayList();
        for (CatalogCategoryLink catalogCategoryLink : listExecute) {
            Intrinsics.checkNotNull(catalogCategoryLink);
            CatalogCategory catalogCategoryN = n(catalogCategoryLink);
            if (catalogCategoryN != null) {
                arrayList.add(catalogCategoryN);
            }
        }
        return arrayList;
    }

    @m1
    public final boolean l(long j10, @NotNull String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return b(j10).b().contains(itemId);
    }
}
