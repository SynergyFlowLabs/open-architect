package com.devtodev.analytics.internal.storage;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.storage.sqlite.RemoverPattern;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import com.devtodev.analytics.internal.storage.sqlite.SelectRecords;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Repository.kt\ncom/devtodev/analytics/internal/storage/Repository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1855#2:71\n1856#2:73\n766#2:74\n857#2,2:75\n1#3:72\n*S KotlinDebug\n*F\n+ 1 Repository.kt\ncom/devtodev/analytics/internal/storage/Repository\n*L\n23#1:71\n23#1:73\n65#1:74\n65#1:75,2\n*E\n"})
public class Repository implements IRepository {

    @NotNull
    private ArrayList<DbModel> cache;

    @NotNull
    private final IDatabase dataBase;

    @NotNull
    private final String tableName;

    public Repository(@NotNull String tableName, @NotNull IDatabase dataBase) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(dataBase, "dataBase");
        this.tableName = tableName;
        this.dataBase = dataBase;
        this.cache = new ArrayList<>();
    }

    private final void cacheUpdateByModel(List<? extends DbModel> list) {
        Object obj;
        for (DbModel dbModel : list) {
            ArrayList arrayList = new ArrayList(this.cache);
            int size = arrayList.size();
            int i10 = 0;
            do {
                if (i10 >= size) {
                    obj = null;
                    break;
                } else {
                    obj = arrayList.get(i10);
                    i10++;
                }
            } while (((DbModel) obj).getIdKey() != dbModel.getIdKey());
            r1.a(this.cache).remove((DbModel) obj);
        }
    }

    private final void cacheUpdateExceptModel(List<? extends DbModel> list) {
        for (DbModel dbModel : list) {
            ArrayList<DbModel> arrayList = this.cache;
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                DbModel dbModel2 = arrayList.get(i10);
                i10++;
                if (dbModel2.getIdKey() == dbModel.getIdKey()) {
                    arrayList2.add(dbModel2);
                }
            }
            this.cache.clear();
            this.cache.addAll(arrayList2);
        }
    }

    @Override // com.devtodev.analytics.internal.storage.IRepository
    @NotNull
    public Integer delete(@NotNull List<? extends DbModel> dbModels, @NotNull List<EventParam> whereValues, @NotNull RemoverPattern removerPattern) {
        Intrinsics.checkNotNullParameter(dbModels, "dbModels");
        Intrinsics.checkNotNullParameter(whereValues, "whereValues");
        Intrinsics.checkNotNullParameter(removerPattern, "removerPattern");
        if (removerPattern == RemoverPattern.EXCEPT_ONE) {
            cacheUpdateExceptModel(dbModels);
        } else {
            cacheUpdateByModel(dbModels);
        }
        return Integer.valueOf(this.dataBase.delete(this.tableName, whereValues, removerPattern));
    }

    @Override // com.devtodev.analytics.internal.storage.IRepository
    public void deleteAll() {
        this.cache.clear();
        this.dataBase.delete(this.tableName, CollectionsKt.emptyList(), RemoverPattern.JEST_ONE);
    }

    @Override // com.devtodev.analytics.internal.storage.IRepository
    @NotNull
    public List<DbModel> getAll(@NotNull List<SelectParameter> selectParameter) {
        Intrinsics.checkNotNullParameter(selectParameter, "selectParameter");
        if (this.cache.size() == 0) {
            Iterator<T> it = this.dataBase.select(this.tableName, selectParameter, CollectionsKt.emptyList()).iterator();
            while (it.hasNext()) {
                this.cache.add(((SelectRecords) it.next()).modelCast(this.tableName));
            }
        }
        return this.cache;
    }

    @NotNull
    public final ArrayList<DbModel> getCache$DTDAnalytics_androidRelease() {
        return this.cache;
    }

    @Override // com.devtodev.analytics.internal.storage.IRepository
    public void insert(@NotNull DbModel dbModel) {
        Intrinsics.checkNotNullParameter(dbModel, "dbModel");
        if (this.cache.size() == 0) {
            getAll(dbModel.getModelColumnsTypes());
        }
        dbModel.updateKey(this.dataBase.insert(this.tableName, dbModel.toList()));
        this.cache.add(dbModel);
    }

    public final void setCache$DTDAnalytics_androidRelease(@NotNull ArrayList<DbModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.cache = arrayList;
    }

    @Override // com.devtodev.analytics.internal.storage.IRepository
    @Nullable
    public Integer update(@NotNull List<EventParam> whereValues, @NotNull DbModel db2) {
        Intrinsics.checkNotNullParameter(whereValues, "whereValues");
        Intrinsics.checkNotNullParameter(db2, "db");
        Integer numUpdate = this.dataBase.update(this.tableName, whereValues, db2.toList());
        int iIndexOf = this.cache.indexOf(db2);
        if (iIndexOf == -1) {
            return -1;
        }
        db2.updateData(db2.toList());
        this.cache.set(iIndexOf, db2);
        return numUpdate;
    }
}
