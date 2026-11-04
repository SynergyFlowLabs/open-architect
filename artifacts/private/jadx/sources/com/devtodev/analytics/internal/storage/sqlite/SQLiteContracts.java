package com.devtodev.analytics.internal.storage.sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteContracts implements BaseColumns {

    @NotNull
    public static final SQLiteContracts INSTANCE = new SQLiteContracts();

    @NotNull
    private static final String createDevToDevUuidEntry = "CREATE TABLE IF NOT EXISTS devToDevUuid (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, \nuuid TEXT\n);";

    @NotNull
    private static final String createPeopleCardEntry = "CREATE TABLE IF NOT EXISTS peopleCards (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\nuserId INTEGER CONSTRAINT peopleCardEntry_users_id_fk REFERENCES  users(_id),\njson TEXT DEFAULT '[]',\nupdated INTEGER DEFAULT 0 NOT NULL,\ncleared INTEGER DEFAULT 0 NOT NULL,\nchangedKeys TEXT\n);";

    @NotNull
    private static final String createSdkToolsTable = "CREATE TABLE IF NOT EXISTS sdkTools (\n_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, \nmetadata TEXT DEFAULT '[]');";

    @NotNull
    private static final String createSubscriptionTable = "CREATE TABLE IF NOT EXISTS subscriptions (\n_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, \nprojectId INTEGER NOT NULL CONSTRAINT identifiers_projects_id_fk REFERENCES projects (_id),\nalreadySendRestoreEvent INTEGER DEFAULT 0 NOT NULL \n);";

    @NotNull
    private static final String createTableAbTestExperiments = "CREATE TABLE IF NOT EXISTS abTestExperiments (\n_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, \nprojectId INTEGER NOT NULL CONSTRAINT abtest_experiments_state_id_fk REFERENCES projects (_id),\nexperimentId INTEGER,\ncreationDate INTEGER, \nupdateDate INTEGER, \ncompletionDate INTEGER, \nisTesting INTEGER DEFAULT 0 NOT NULL, \nparameters TEXT, \nconditions TEXT \n);";

    @NotNull
    private static final String createTableAbTestExperimentsState = "CREATE TABLE IF NOT EXISTS abTestExperimentsState (\n_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, \nuserId INTEGER CONSTRAINT experimentsStateEntry_users_id_fk REFERENCES users(_id) ,\nexperimentId INTEGER CONSTRAINT experimentsStateEntry_exp_id_fk REFERENCES abTestExperiments(_id) ,\nrunAbility TEXT, \ninvolvement TEXT \n);";

    @NotNull
    private static final String createTableAbTestsProject = "CREATE TABLE IF NOT EXISTS abTestProject (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\nprojectId INTEGER NOT NULL CONSTRAINT abTests_id_fk REFERENCES projects (_id),\nversion INTEGER NOT NULL,\nuserProperties TEXT\n);";

    @NotNull
    private static final String createTableAutoPurchasesMarks = "CREATE TABLE IF NOT EXISTS autoPurchasesMarks (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\nprojectId INTEGER CONSTRAINT autoPurchasesMarks_projects_id_fk REFERENCES projects(_id),\norderId TEXT\n);";

    @NotNull
    private static final String createTableCurrencyAccrualResources = "CREATE TABLE IF NOT EXISTS currencyAccrualResources (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\nuserId INTEGER CONSTRAINT currencyAccrualResources_users_id_fk REFERENCES users(_id),\ntype INTEGER NOT NULL,\nname TEXT,\namount INTEGER NOT NULL,\nsource TEXT,\ntimestamp INTEGER NOT NULL\n);";

    @NotNull
    private static final String createTableDeviceIdentifiers = "CREATE TABLE IF NOT EXISTS deviceIdentifiers (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, \nprojectId INTEGER NOT NULL CONSTRAINT identifiers_projects_id_fk REFERENCES projects (_id),\ndeviceIdentifier TEXT,\npreviousDeviceIdentifier TEXT,\ndevtodevId INTEGER,\ncrossPlatformDevtodevId INTEGER,\nuuid TEXT\n);";

    @NotNull
    private static final String createTableEvents = "CREATE TABLE IF NOT EXISTS events (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\nuserId INTEGER CONSTRAINT events_users_id_fk REFERENCES users(_id),\ncode TEXT,\neventJson TEXT\n);";

    @NotNull
    private static final String createTableLevelResources = "CREATE TABLE IF NOT EXISTS levelResource (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\nuserId INTEGER CONSTRAINT levelResource_users_id_fk REFERENCES users(_id),\ntype INTEGER NOT NULL,\nname TEXT,\namount INTEGER NOT NULL\n);";

    @NotNull
    private static final String createTableMessagingCategory = "CREATE TABLE IF NOT EXISTS messagingCategory (\n_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, \nidentifier TEXT,\nbuttons TEXT);";

    @NotNull
    private static final String createTablePaymentMarks = "CREATE TABLE IF NOT EXISTS paymentMarks (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\nprojectId INTEGER CONSTRAINT realPaymentMarks_projects_id_fk REFERENCES projects(_id),\norderId TEXT\n);";

    @NotNull
    private static final String createTableProjects = "CREATE TABLE IF NOT EXISTS projects (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\napplicationKey TEXT NOT NULL UNIQUE,\nactiveUserId INTEGER,\ntrackingAvailable INTEGER,\napplicationBundle TEXT,\napplicationVersion TEXT,\napplicationBuildVersion TEXT,\nconfiguration TEXT DEFAULT '{}' NOT NULL,\nisReferralSent TEXT,\nsavedTime INTEGER,\ncategoriesVersion INTEGER,\nisMigrated INTEGER DEFAULT 0 NOT NULL\n);";

    @NotNull
    private static final String createTableReports = "CREATE TABLE IF NOT EXISTS reports (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\nuserId INTEGER CONSTRAINT reports_users_id_fk REFERENCES users(_id),\npackagesJson TEXT,\nuuid TEXT DEFAULT '{}' NOT NULL\n);";

    @NotNull
    private static final String createTableTutorialMarks = "CREATE TABLE IF NOT EXISTS tutorialMarkEntry (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\nuserId INTEGER CONSTRAINT tutorialMarkEntry_users_id_fk REFERENCES users(_id),\nstep INTEGER\n);";

    @NotNull
    private static final String updateIdentifiersTable = "ALTER TABLE deviceIdentifiers ADD COLUMN devtodevIdTimestamp INTEGER";

    @NotNull
    private static final String updateIdentifiersTableAddIsValidField = "ALTER TABLE deviceIdentifiers ADD COLUMN isValid INTEGER DEFAULT 1";

    private SQLiteContracts() {
    }

    private final String createUserTable(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\nprojectId INTEGER NOT NULL CONSTRAINT users_projects_id_fk REFERENCES projects (_id),\nlevel INTEGER DEFAULT 1 NOT NULL,\nsessionId INTEGER,\nuserId TEXT,\npreviousUserId TEXT,\nlastForegroundTime INTEGER,\nlastBackgroundTime INTEGER,\nisDefaultUser INTEGER,\nisResourceAggregationEnable INTEGER \n);";
    }

    @NotNull
    public final List<String> createTables$DTDAnalytics_androidRelease() {
        return CollectionsKt.listOf((Object[]) new String[]{createTableProjects, createUserTable(UserEntry.tableName), createTableEvents, createTableReports, createTableLevelResources, createTableCurrencyAccrualResources, createTableDeviceIdentifiers, createDevToDevUuidEntry, createTablePaymentMarks, createTableTutorialMarks, createPeopleCardEntry, createTableMessagingCategory, createSdkToolsTable, createSubscriptionTable});
    }

    @NotNull
    public final List<String> updateV3$DTDAnalytics_androidRelease(@NotNull SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Cursor cursorRawQuery = db2.rawQuery("SELECT * FROM deviceIdentifiers", null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQuery, "db.rawQuery(\"SELECT * FR…sEntry.tableName}\", null)");
        String[] names = cursorRawQuery.getColumnNames();
        cursorRawQuery.close();
        Intrinsics.checkNotNullExpressionValue(names, "names");
        return !o.f0(ArraysKt.asSequence(names), IdentifiersEntry.devtodevIdTimestamp) ? CollectionsKt.listOf(updateIdentifiersTable) : CollectionsKt.emptyList();
    }

    @NotNull
    public final List<String> updateV4$DTDAnalytics_androidRelease() {
        return CollectionsKt.listOf((Object[]) new String[]{createTableAbTestsProject, createTableAbTestExperiments, createTableAbTestExperimentsState});
    }

    public final void updateV5$DTDAnalytics_androidRelease(@NotNull SQLiteDatabase db2) {
        String string;
        Intrinsics.checkNotNullParameter(db2, "db");
        Cursor cursorRawQuery = db2.rawQuery("PRAGMA INDEX_LIST('users')", null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQuery, "db.rawQuery(\"PRAGMA INDE…ntry.tableName}')\", null)");
        if (cursorRawQuery.moveToFirst()) {
            do {
                string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("name"));
                Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(name)");
            } while (cursorRawQuery.moveToNext());
        } else {
            string = "";
        }
        cursorRawQuery.close();
        if (string.length() > 0) {
            db2.execSQL(createUserTable(UserEntryTemp.tableName));
            db2.execSQL("INSERT INTO usersTemp SELECT * FROM users");
            db2.execSQL("DROP TABLE IF EXISTS users");
            db2.execSQL("ALTER TABLE usersTemp RENAME TO users");
        }
    }

    @NotNull
    public final List<String> updateV6$DTDAnalytics_androidRelease(@NotNull SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Cursor cursorRawQuery = db2.rawQuery("SELECT * FROM deviceIdentifiers", null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQuery, "db.rawQuery(\"SELECT * FR…sEntry.tableName}\", null)");
        String[] names = cursorRawQuery.getColumnNames();
        cursorRawQuery.close();
        Intrinsics.checkNotNullExpressionValue(names, "names");
        return !o.f0(ArraysKt.asSequence(names), IdentifiersEntry.isValid) ? CollectionsKt.listOf(updateIdentifiersTableAddIsValidField) : CollectionsKt.emptyList();
    }

    @NotNull
    public final List<String> updateV7$DTDAnalytics_androidRelease() {
        return CollectionsKt.listOf(createTableAutoPurchasesMarks);
    }
}
