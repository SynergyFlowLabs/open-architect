package com.devtodev.analytics.internal.storage.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.devtodev.analytics.internal.logger.Logger;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSQLiteBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SQLiteBase.kt\ncom/devtodev/analytics/internal/storage/sqlite/SQLiteBase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1855#2,2:63\n1855#2,2:65\n1855#2,2:67\n1855#2,2:69\n1855#2,2:71\n*S KotlinDebug\n*F\n+ 1 SQLiteBase.kt\ncom/devtodev/analytics/internal/storage/sqlite/SQLiteBase\n*L\n28#1:63,2\n30#1:65,2\n32#1:67,2\n36#1:69,2\n38#1:71,2\n*E\n"})
public final class SQLiteBase extends SQLiteOpenHelper {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String DATABASE_NAME = "devtodev.db";
    public static final int DATABASE_VERSION = 7;

    @NotNull
    private final SQLiteContracts sqlContract;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQLiteBase(@NotNull Context context, @NotNull SQLiteContracts sqlContract) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 7);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqlContract, "sqlContract");
        int i10 = 6 & 7;
        this.sqlContract = sqlContract;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Logger logger = Logger.INSTANCE;
        Logger.debug$default(logger, "[Database Module] It's a clean launch of the SDK", null, 2, null);
        logger.debug("[Database Module] Successfully opened connection to database at " + db2.getPath(), null);
        Iterator<T> it = this.sqlContract.createTables$DTDAnalytics_androidRelease().iterator();
        while (it.hasNext()) {
            db2.execSQL((String) it.next());
        }
        Iterator<T> it2 = this.sqlContract.updateV3$DTDAnalytics_androidRelease(db2).iterator();
        while (it2.hasNext()) {
            db2.execSQL((String) it2.next());
        }
        Iterator<T> it3 = this.sqlContract.updateV4$DTDAnalytics_androidRelease().iterator();
        while (it3.hasNext()) {
            db2.execSQL((String) it3.next());
        }
        this.sqlContract.updateV5$DTDAnalytics_androidRelease(db2);
        Iterator<T> it4 = this.sqlContract.updateV6$DTDAnalytics_androidRelease(db2).iterator();
        while (it4.hasNext()) {
            db2.execSQL((String) it4.next());
        }
        Iterator<T> it5 = this.sqlContract.updateV7$DTDAnalytics_androidRelease().iterator();
        while (it5.hasNext()) {
            db2.execSQL((String) it5.next());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(@Nullable SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase db2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(db2, "db");
        onCreate(db2);
    }
}
