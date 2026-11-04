package com.planner5d.library.database.model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.b2;
import androidx.room.f2;
import androidx.room.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f154191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w<k> f154192b;

    class a extends w<k> {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `user_model_metadata` (`hash`,`format`,`uri`,`file_integrity_hash`,`last_update_unix_millis`) VALUES (?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final w3.i statement, @NonNull final k entity) {
            statement.H5(1, entity.c());
            statement.H5(2, entity.b());
            statement.H5(3, entity.e());
            statement.H5(4, entity.a());
            statement.G6(5, entity.d());
        }
    }

    public m(@NonNull final b2 __db) {
        this.f154191a = __db;
        this.f154192b = new a(__db);
    }

    @NonNull
    public static List<Class<?>> c() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.planner5d.library.database.model.l
    public List<k> a(final String modelHash) {
        f2 f2VarD = f2.d("SELECT * FROM user_model_metadata WHERE hash = ?", 1);
        f2VarD.H5(1, modelHash);
        this.f154191a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f154191a, f2VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "hash");
            int iE2 = androidx.room.util.a.e(cursorF, "format");
            int iE3 = androidx.room.util.a.e(cursorF, "uri");
            int iE4 = androidx.room.util.a.e(cursorF, "file_integrity_hash");
            int iE5 = androidx.room.util.a.e(cursorF, "last_update_unix_millis");
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(new k(cursorF.getString(iE), cursorF.getString(iE2), cursorF.getString(iE3), cursorF.getString(iE4), cursorF.getLong(iE5)));
            }
            cursorF.close();
            f2VarD.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorF.close();
            f2VarD.release();
            throw th2;
        }
    }

    @Override // com.planner5d.library.database.model.l
    public void b(final List<k> metadataEntities) {
        this.f154191a.assertNotSuspendingTransaction();
        this.f154191a.beginTransaction();
        try {
            this.f154192b.insert(metadataEntities);
            this.f154191a.setTransactionSuccessful();
        } finally {
            this.f154191a.endTransaction();
        }
    }
}
