package com.planner5d.library.database.model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.b2;
import androidx.room.c2;
import androidx.room.f2;
import androidx.room.m2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends com.planner5d.library.database.model.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f154154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m2 f154155b;

    class a extends m2 {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        public String createQuery() {
            return "INSERT OR IGNORE INTO favorite_marks (user_id, favorite_type, item_id) VALUES (?, ?, ?)";
        }
    }

    class b implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f154157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f154158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f154159c;

        b(final long val$userId, final int val$typeCode, final String val$itemId) {
            this.f154157a = val$userId;
            this.f154158b = val$typeCode;
            this.f154159c = val$itemId;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            w3.i iVarAcquire = e.this.f154155b.acquire();
            iVarAcquire.G6(1, this.f154157a);
            int i10 = 2 | 2;
            iVarAcquire.G6(2, this.f154158b);
            iVarAcquire.H5(3, this.f154159c);
            try {
                e.this.f154154a.beginTransaction();
                try {
                    iVarAcquire.Yb();
                    e.this.f154154a.setTransactionSuccessful();
                    Unit unit = Unit.f312394a;
                    e.this.f154154a.endTransaction();
                    e.this.f154155b.release(iVarAcquire);
                    return unit;
                } catch (Throwable th2) {
                    e.this.f154154a.endTransaction();
                    throw th2;
                }
            } catch (Throwable th3) {
                e.this.f154155b.release(iVarAcquire);
                throw th3;
            }
        }
    }

    class c implements Callable<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f154161a;

        c(final f2 val$_statement) {
            this.f154161a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            Boolean boolValueOf;
            Cursor cursorF = androidx.room.util.b.f(e.this.f154154a, this.f154161a, false, null);
            try {
                if (cursorF.moveToFirst()) {
                    boolValueOf = Boolean.valueOf(cursorF.getInt(0) != 0);
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                cursorF.close();
                return boolValueOf;
            } finally {
                cursorF.close();
                this.f154161a.release();
            }
        }
    }

    class d implements Callable<List<com.planner5d.library.database.model.b>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f154163a;

        d(final f2 val$_statement) {
            this.f154163a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<com.planner5d.library.database.model.b> call() throws Exception {
            Cursor cursorF = androidx.room.util.b.f(e.this.f154154a, this.f154163a, false, null);
            try {
                int iE = androidx.room.util.a.e(cursorF, "user_id");
                int iE2 = androidx.room.util.a.e(cursorF, "favorite_type");
                int iE3 = androidx.room.util.a.e(cursorF, FirebaseAnalytics.d.f120673q);
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    arrayList.add(new com.planner5d.library.database.model.b(cursorF.getLong(iE), cursorF.getInt(iE2), cursorF.getString(iE3)));
                }
                cursorF.close();
                this.f154163a.release();
                return arrayList;
            } catch (Throwable th2) {
                cursorF.close();
                this.f154163a.release();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.database.model.e$e, reason: collision with other inner class name */
    class CallableC1533e implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f154165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f154166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f154167c;

        CallableC1533e(final Set val$itemIdsToBeFavorite, final long val$userId, final int val$typeCode) {
            this.f154165a = val$itemIdsToBeFavorite;
            this.f154166b = val$userId;
            this.f154167c = val$typeCode;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            StringBuilder sbD = androidx.room.util.f.d();
            sbD.append("DELETE FROM favorite_marks WHERE user_id = ");
            sbD.append(com.planner5d.library.model.payments.a.f222474i);
            sbD.append(" AND favorite_type = ");
            sbD.append(com.planner5d.library.model.payments.a.f222474i);
            sbD.append(" AND item_id NOT IN (");
            androidx.room.util.f.a(sbD, this.f154165a.size());
            sbD.append(")");
            w3.i iVarCompileStatement = e.this.f154154a.compileStatement(sbD.toString());
            iVarCompileStatement.G6(1, this.f154166b);
            iVarCompileStatement.G6(2, this.f154167c);
            Iterator it = this.f154165a.iterator();
            int i10 = 3;
            while (it.hasNext()) {
                iVarCompileStatement.H5(i10, (String) it.next());
                i10++;
            }
            e.this.f154154a.beginTransaction();
            try {
                iVarCompileStatement.j2();
                e.this.f154154a.setTransactionSuccessful();
                Unit unit = Unit.f312394a;
                e.this.f154154a.endTransaction();
                return unit;
            } catch (Throwable th2) {
                e.this.f154154a.endTransaction();
                throw th2;
            }
        }
    }

    public e(@NonNull final b2 __db) {
        this.f154154a = __db;
        this.f154155b = new a(__db);
    }

    @NonNull
    public static List<Class<?>> m() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(id.a aVar, f fVar, Set set, kotlin.coroutines.d dVar) {
        return super.a(aVar, fVar, set, dVar);
    }

    @Override // com.planner5d.library.database.model.c, com.planner5d.library.database.model.h
    public Object a(final id.a user, final f type, final Set<String> itemIdsToBeFavorite, final kotlin.coroutines.d<? super Unit> $completion) {
        return c2.g(this.f154154a, new Function1() { // from class: com.planner5d.library.database.model.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f154150a.n(user, type, itemIdsToBeFavorite, (kotlin.coroutines.d) obj);
            }
        }, $completion);
    }

    @Override // com.planner5d.library.database.model.c
    public Object c(final kotlin.coroutines.d<? super List<com.planner5d.library.database.model.b>> $completion) {
        f2 f2VarD = f2.d("SELECT * FROM favorite_marks", 0);
        return androidx.room.j.b(this.f154154a, false, androidx.room.util.b.a(), new d(f2VarD), $completion);
    }

    @Override // com.planner5d.library.database.model.c
    protected Object d(final long userId, final int typeCode, final String itemId, final kotlin.coroutines.d<? super Boolean> $completion) {
        f2 f2VarD = f2.d("SELECT EXISTS (SELECT 1 FROM favorite_marks WHERE user_id = ? AND favorite_type = ? AND item_id = ?)", 3);
        f2VarD.G6(1, userId);
        f2VarD.G6(2, typeCode);
        f2VarD.H5(3, itemId);
        return androidx.room.j.b(this.f154154a, false, androidx.room.util.b.a(), new c(f2VarD), $completion);
    }

    @Override // com.planner5d.library.database.model.c
    protected Object e(final long userId, final int typeCode, final String itemId, final kotlin.coroutines.d<? super Unit> $completion) {
        return androidx.room.j.c(this.f154154a, true, new b(userId, typeCode, itemId), $completion);
    }

    @Override // com.planner5d.library.database.model.c
    protected Object g(final long userId, final int typeCode, final Set<String> itemIdsToBeFavorite, final kotlin.coroutines.d<? super Unit> $completion) {
        return androidx.room.j.c(this.f154154a, true, new CallableC1533e(itemIdsToBeFavorite, userId, typeCode), $completion);
    }
}
