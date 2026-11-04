package com.devtodev.analytics.internal.storage;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.IDeleteByUserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ResourceRepository extends Repository implements IResourceRepository {

    @NotNull
    private final IDatabase dataBase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceRepository(@NotNull String tableName, @NotNull IDatabase dataBase) {
        super(tableName, dataBase);
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(dataBase, "dataBase");
        this.dataBase = dataBase;
    }

    @Override // com.devtodev.analytics.internal.storage.IResourceRepository
    public int deleteByUser(@NotNull String tableName, @NotNull String columnName, @NotNull List<Long> whereValues) throws Exception {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(columnName, "columnName");
        Intrinsics.checkNotNullParameter(whereValues, "whereValues");
        ArrayList arrayList = new ArrayList(getCache$DTDAnalytics_androidRelease());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Object obj2 = (DbModel) obj;
            if (!(obj2 instanceof IDeleteByUserId)) {
                throw new Exception(tableName + " does not implement IResourceRepository interface");
            }
            if (whereValues.contains(Long.valueOf(((IDeleteByUserId) obj2).getUserId()))) {
                getCache$DTDAnalytics_androidRelease().remove(obj2);
            }
        }
        return this.dataBase.deleteByUser(tableName, columnName, whereValues);
    }
}
