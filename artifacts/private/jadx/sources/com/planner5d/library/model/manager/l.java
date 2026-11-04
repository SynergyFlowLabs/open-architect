package com.planner5d.library.model.manager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.activeandroid.ActiveAndroid;
import com.activeandroid.Cache;
import com.activeandroid.Configuration;
import com.activeandroid.Model;
import com.activeandroid.query.Select;
import com.planner5d.library.database.ApplicationDatabase;
import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.database.model.AutoStyleImage;
import com.planner5d.library.database.model.ProjectRevision;
import com.planner5d.library.database.model.RoomStyle;
import com.planner5d.library.database.model.catalog.Catalog;
import com.planner5d.library.database.model.catalog.CatalogCategoryLink;
import com.planner5d.library.database.model.catalog.CatalogItemLink;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.contest.ContestPrize;
import com.planner5d.library.database.model.contest.ContestWinner;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.ManagedFile;
import com.planner5d.library.model.ProjectToDemoProject;
import com.planner5d.library.model.SupportRequest;
import com.planner5d.library.model.ai.AiTaskEvent;
import com.planner5d.library.model.ai.CustomerSatisfactionIndex;
import com.planner5d.library.model.payments.Payment;
import com.planner5d.library.model.snapshot.Snapshot;
import com.planner5d.library.model.snapshot.SnapshotLocal;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class l implements x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f191848c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fg.e<ApplicationDatabase> f191849d;

    @ij.a
    public l(fg.e<ApplicationDatabase> eVar) {
        this.f191849d = eVar;
    }

    private void a(com.planner5d.library.database.m mVar, Class<? extends Model> cls, String str, String str2) {
        mVar.a(f(cls), str, str2);
    }

    @androidx.annotation.m1
    public static SQLiteDatabase c(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    return SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 16);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private Configuration.Builder d(Context context) {
        Configuration.Builder builder = new Configuration.Builder(context);
        builder.setDatabaseName("Planner5D.sqlite");
        builder.setDatabaseVersion(29);
        builder.setSqlParser(Configuration.SQL_PARSER_DELIMITED);
        builder.addModelClass(Folder.class);
        builder.addModelClass(Project.class);
        builder.addModelClass(ProjectRevision.class);
        builder.addModelClass(Snapshot.class);
        builder.addModelClass(SnapshotLocal.class);
        builder.addModelClass(SupportRequest.class);
        builder.addModelClass(LogRecord.class);
        builder.addModelClass(Payment.class);
        builder.addModelClass(ManagedFile.class);
        builder.addModelClass(ProjectToDemoProject.class);
        builder.addModelClass(Contest.class);
        builder.addModelClass(Catalog.class);
        builder.addModelClass(CatalogCategoryLink.class);
        builder.addModelClass(CatalogItemLink.class);
        builder.addModelClass(ContestWinner.class);
        builder.addModelClass(ContestPrize.class);
        builder.addModelClass(AiTaskEvent.class);
        builder.addModelClass(CustomerSatisfactionIndex.class);
        builder.addModelClass(RoomStyle.class);
        builder.addModelClass(AutoStyle.class);
        builder.addModelClass(AutoStyleImage.class);
        builder.addTypeSerializer(TranslatedStringTypeSerializer.class);
        return builder;
    }

    @e.a({"RestrictedApi"})
    @androidx.annotation.m1
    public void b() {
        SQLiteDatabase sQLiteDatabaseT = com.planner5d.library.application.b.t();
        ArrayList<String> arrayList = new ArrayList();
        Cursor cursorRawQuery = sQLiteDatabaseT.rawQuery("SELECT * FROM sqlite_master WHERE type='table'", null);
        while (cursorRawQuery.moveToNext()) {
            try {
                String string = cursorRawQuery.getString(1);
                if (!string.equals("android_metadata") && !string.startsWith("sqlite_") && !string.equals("room_master_table")) {
                    arrayList.add(string);
                }
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
        for (String str : arrayList) {
            sQLiteDatabaseT.execSQL("DELETE FROM " + str);
            sQLiteDatabaseT.execSQL("DELETE FROM sqlite_sequence WHERE name='" + str + "'");
        }
        ActiveAndroid.clearCache();
    }

    @androidx.annotation.m1
    public String f(Class<? extends Model> cls) {
        return Cache.getTableInfo(cls).getTableName();
    }

    @androidx.annotation.m1
    public void h() {
        if (this.f191848c) {
            return;
        }
        this.f191848c = true;
        com.planner5d.library.database.m mVarB = com.planner5d.library.database.m.b();
        a(mVarB, Payment.class, "state", "INTEGER");
        a(mVarB, Payment.class, "price", "INTEGER");
        a(mVarB, Payment.class, "price_currency", "TEXT");
        a(mVarB, Snapshot.class, "date_updated", "INTEGER");
        a(mVarB, Snapshot.class, "project_id", "INTEGER");
        a(mVarB, Snapshot.class, "uri_image", "TEXT");
        a(mVarB, SupportRequest.class, "notes", "TEXT");
        a(mVarB, SupportRequest.class, "attachment", "INTEGER");
        a(mVarB, Project.class, "uri_thumbnail", "TEXT");
        a(mVarB, Project.class, "contest_id", "INTEGER");
        a(mVarB, Project.class, "contest_status", "INTEGER");
        a(mVarB, Project.class, "project_id", "INTEGER");
        a(mVarB, Project.class, "ai_recognized", "BOOLEAN");
        a(mVarB, Contest.class, "date_voting_start", "INTEGER");
        a(mVarB, Contest.class, "catalog_id", "INTEGER");
        a(mVarB, Contest.class, "user_place", "INTEGER");
        a(mVarB, Contest.class, "user_rate", "INTEGER");
        a(mVarB, Contest.class, "rate_ratio", "INTEGER");
        a(mVarB, ContestWinner.class, "rate_ratio", "INTEGER");
        a(mVarB, Payment.class, "user_id", "INTEGER");
        a(mVarB, SnapshotLocal.class, "project_id", "INTEGER");
        a(mVarB, AutoStyle.class, "room_style_ids", "TEXT");
        mVarB.d(f(AutoStyle.class), "room_style");
        a(mVarB, AutoStyleImage.class, "room_style_id", "TEXT");
        mVarB.d(f(AutoStyleImage.class), "room_style");
        this.f191849d.get();
    }

    public boolean i() {
        return Cache.isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.m1
    public <T extends Model> T j(T t10, long j10) {
        t10.save();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(j10));
        ActiveAndroid.getDatabase().update(f(t10.getClass()), contentValues, "id = ?", new String[]{String.valueOf(t10.getId())});
        return (T) new Select().from(t10.getClass()).where("id = ?", Long.valueOf(j10)).executeSingle();
    }

    @androidx.annotation.m1
    public void k(Context context) {
        Configuration configurationCreate = d(context).create();
        for (int i10 = 0; i10 < 60; i10++) {
            try {
                ActiveAndroid.initialize(configurationCreate);
                return;
            } catch (SQLiteException unused) {
                com.planner5d.library.services.utility.o3.c(1000L);
            }
        }
    }
}
