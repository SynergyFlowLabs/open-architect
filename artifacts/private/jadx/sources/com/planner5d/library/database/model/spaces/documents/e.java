package com.planner5d.library.database.model.spaces.documents;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.room.b2;
import androidx.room.f2;
import androidx.room.v;
import androidx.room.w;
import androidx.room.x;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends com.planner5d.library.database.model.spaces.documents.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f154252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w<com.planner5d.library.database.model.spaces.documents.a> f154253b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w<com.planner5d.library.database.model.spaces.documents.c> f154255d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v<com.planner5d.library.database.model.spaces.documents.c> f154257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v<com.planner5d.library.database.model.spaces.documents.a> f154258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x<com.planner5d.library.database.model.spaces.documents.a> f154259h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.database.n f154254c = new com.planner5d.library.database.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.database.o f154256e = new com.planner5d.library.database.o();

    class a implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.c f154260a;

        a(final com.planner5d.library.database.model.spaces.documents.c val$folder) {
            this.f154260a = val$folder;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            e.this.f154252a.beginTransaction();
            try {
                e.this.f154257f.d(this.f154260a);
                e.this.f154252a.setTransactionSuccessful();
                return Unit.f312394a;
            } finally {
                e.this.f154252a.endTransaction();
            }
        }
    }

    class b implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f154262a;

        b(final com.planner5d.library.database.model.spaces.documents.a val$document) {
            this.f154262a = val$document;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            e.this.f154252a.beginTransaction();
            try {
                e.this.f154258g.d(this.f154262a);
                e.this.f154252a.setTransactionSuccessful();
                Unit unit = Unit.f312394a;
                b2 b2Var = e.this.f154252a;
                return unit;
            } finally {
                e.this.f154252a.endTransaction();
            }
        }
    }

    class c implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f154264a;

        c(final List val$documents) {
            this.f154264a = val$documents;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            e.this.f154252a.beginTransaction();
            try {
                e.this.f154259h.b(this.f154264a);
                e.this.f154252a.setTransactionSuccessful();
                Unit unit = Unit.f312394a;
                e.this.f154252a.endTransaction();
                return unit;
            } catch (Throwable th2) {
                e.this.f154252a.endTransaction();
                throw th2;
            }
        }
    }

    class d implements Callable<com.planner5d.library.database.model.spaces.documents.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f154266a;

        d(final f2 val$_statement) {
            this.f154266a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.planner5d.library.database.model.spaces.documents.a call() throws Exception {
            e.this.f154252a.beginTransaction();
            try {
                com.planner5d.library.database.model.spaces.documents.a aVar = null;
                Cursor cursorF = androidx.room.util.b.f(e.this.f154252a, this.f154266a, false, null);
                try {
                    int iE = androidx.room.util.a.e(cursorF, "hash");
                    int iE2 = androidx.room.util.a.e(cursorF, "space_hash");
                    int iE3 = androidx.room.util.a.e(cursorF, "name");
                    int iE4 = androidx.room.util.a.e(cursorF, "folder_hash");
                    int iE5 = androidx.room.util.a.e(cursorF, "date_created");
                    int iE6 = androidx.room.util.a.e(cursorF, "date_updated");
                    int iE7 = androidx.room.util.a.e(cursorF, "uri");
                    int iE8 = androidx.room.util.a.e(cursorF, s.f106625b);
                    int iE9 = androidx.room.util.a.e(cursorF, "remote");
                    if (cursorF.moveToFirst()) {
                        aVar = new com.planner5d.library.database.model.spaces.documents.a(cursorF.getString(iE), cursorF.isNull(iE2) ? null : cursorF.getString(iE2), cursorF.isNull(iE3) ? null : cursorF.getString(iE3), cursorF.isNull(iE4) ? null : cursorF.getString(iE4), e.this.f154254c.b(cursorF.isNull(iE5) ? null : Long.valueOf(cursorF.getLong(iE5))), e.this.f154254c.b(cursorF.isNull(iE6) ? null : Long.valueOf(cursorF.getLong(iE6))), cursorF.isNull(iE7) ? null : cursorF.getString(iE7), cursorF.getInt(iE8) != 0, cursorF.getInt(iE9) != 0);
                    }
                    e.this.f154252a.setTransactionSuccessful();
                    cursorF.close();
                    this.f154266a.release();
                    e.this.f154252a.endTransaction();
                    return aVar;
                } catch (Throwable th2) {
                    cursorF.close();
                    this.f154266a.release();
                    throw th2;
                }
            } catch (Throwable th3) {
                e.this.f154252a.endTransaction();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.database.model.spaces.documents.e$e, reason: collision with other inner class name */
    class CallableC1535e implements Callable<List<com.planner5d.library.database.model.spaces.documents.a>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f154268a;

        CallableC1535e(final f2 val$_statement) {
            this.f154268a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<com.planner5d.library.database.model.spaces.documents.a> call() throws Exception {
            e.this.f154252a.beginTransaction();
            try {
                Cursor cursorF = androidx.room.util.b.f(e.this.f154252a, this.f154268a, false, null);
                try {
                    int iE = androidx.room.util.a.e(cursorF, "hash");
                    int iE2 = androidx.room.util.a.e(cursorF, "space_hash");
                    int iE3 = androidx.room.util.a.e(cursorF, "name");
                    int iE4 = androidx.room.util.a.e(cursorF, "folder_hash");
                    int iE5 = androidx.room.util.a.e(cursorF, "date_created");
                    int iE6 = androidx.room.util.a.e(cursorF, "date_updated");
                    int iE7 = androidx.room.util.a.e(cursorF, "uri");
                    int iE8 = androidx.room.util.a.e(cursorF, s.f106625b);
                    int iE9 = androidx.room.util.a.e(cursorF, "remote");
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        arrayList.add(new com.planner5d.library.database.model.spaces.documents.a(cursorF.getString(iE), cursorF.isNull(iE2) ? null : cursorF.getString(iE2), cursorF.isNull(iE3) ? null : cursorF.getString(iE3), cursorF.isNull(iE4) ? null : cursorF.getString(iE4), e.this.f154254c.b(cursorF.isNull(iE5) ? null : Long.valueOf(cursorF.getLong(iE5))), e.this.f154254c.b(cursorF.isNull(iE6) ? null : Long.valueOf(cursorF.getLong(iE6))), cursorF.isNull(iE7) ? null : cursorF.getString(iE7), cursorF.getInt(iE8) != 0, cursorF.getInt(iE9) != 0));
                    }
                    e.this.f154252a.setTransactionSuccessful();
                    cursorF.close();
                    this.f154268a.release();
                    e.this.f154252a.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    this.f154268a.release();
                    throw th2;
                }
            } catch (Throwable th3) {
                e.this.f154252a.endTransaction();
                throw th3;
            }
        }
    }

    class f implements Callable<com.planner5d.library.database.model.spaces.documents.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f154270a;

        f(final f2 val$_statement) {
            this.f154270a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.planner5d.library.database.model.spaces.documents.c call() throws Exception {
            e.this.f154252a.beginTransaction();
            try {
                com.planner5d.library.database.model.spaces.documents.c cVar = null;
                Long lValueOf = null;
                Cursor cursorF = androidx.room.util.b.f(e.this.f154252a, this.f154270a, false, null);
                try {
                    int iE = androidx.room.util.a.e(cursorF, "hash");
                    int iE2 = androidx.room.util.a.e(cursorF, "parent_hash");
                    int iE3 = androidx.room.util.a.e(cursorF, "space_hash");
                    int iE4 = androidx.room.util.a.e(cursorF, "name");
                    int iE5 = androidx.room.util.a.e(cursorF, "tags");
                    int iE6 = androidx.room.util.a.e(cursorF, "date_created");
                    int iE7 = androidx.room.util.a.e(cursorF, "date_updated");
                    if (cursorF.moveToFirst()) {
                        String string = cursorF.getString(iE);
                        String string2 = cursorF.isNull(iE2) ? null : cursorF.getString(iE2);
                        String string3 = cursorF.isNull(iE3) ? null : cursorF.getString(iE3);
                        String string4 = cursorF.isNull(iE4) ? null : cursorF.getString(iE4);
                        List<String> listB = e.this.f154256e.b(cursorF.isNull(iE5) ? null : cursorF.getString(iE5));
                        Date dateB = e.this.f154254c.b(cursorF.isNull(iE6) ? null : Long.valueOf(cursorF.getLong(iE6)));
                        if (!cursorF.isNull(iE7)) {
                            lValueOf = Long.valueOf(cursorF.getLong(iE7));
                        }
                        cVar = new com.planner5d.library.database.model.spaces.documents.c(string, string2, string3, string4, listB, dateB, e.this.f154254c.b(lValueOf));
                    }
                    e.this.f154252a.setTransactionSuccessful();
                    cursorF.close();
                    this.f154270a.release();
                    e.this.f154252a.endTransaction();
                    return cVar;
                } catch (Throwable th2) {
                    cursorF.close();
                    this.f154270a.release();
                    throw th2;
                }
            } catch (Throwable th3) {
                e.this.f154252a.endTransaction();
                throw th3;
            }
        }
    }

    class g implements Callable<List<com.planner5d.library.database.model.spaces.documents.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f154272a;

        g(final f2 val$_statement) {
            this.f154272a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<com.planner5d.library.database.model.spaces.documents.c> call() throws Exception {
            e.this.f154252a.beginTransaction();
            try {
                Cursor cursorF = androidx.room.util.b.f(e.this.f154252a, this.f154272a, false, null);
                try {
                    int iE = androidx.room.util.a.e(cursorF, "hash");
                    int iE2 = androidx.room.util.a.e(cursorF, "parent_hash");
                    int iE3 = androidx.room.util.a.e(cursorF, "space_hash");
                    int iE4 = androidx.room.util.a.e(cursorF, "name");
                    int iE5 = androidx.room.util.a.e(cursorF, "tags");
                    int iE6 = androidx.room.util.a.e(cursorF, "date_created");
                    int iE7 = androidx.room.util.a.e(cursorF, "date_updated");
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        arrayList.add(new com.planner5d.library.database.model.spaces.documents.c(cursorF.getString(iE), cursorF.isNull(iE2) ? null : cursorF.getString(iE2), cursorF.isNull(iE3) ? null : cursorF.getString(iE3), cursorF.isNull(iE4) ? null : cursorF.getString(iE4), e.this.f154256e.b(cursorF.isNull(iE5) ? null : cursorF.getString(iE5)), e.this.f154254c.b(cursorF.isNull(iE6) ? null : Long.valueOf(cursorF.getLong(iE6))), e.this.f154254c.b(cursorF.isNull(iE7) ? null : Long.valueOf(cursorF.getLong(iE7)))));
                    }
                    e.this.f154252a.setTransactionSuccessful();
                    cursorF.close();
                    this.f154272a.release();
                    e.this.f154252a.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    this.f154272a.release();
                    throw th2;
                }
            } catch (Throwable th3) {
                e.this.f154252a.endTransaction();
                throw th3;
            }
        }
    }

    class h implements Callable<List<com.planner5d.library.database.model.spaces.documents.a>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f154274a;

        h(final f2 val$_statement) {
            this.f154274a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<com.planner5d.library.database.model.spaces.documents.a> call() throws Exception {
            e.this.f154252a.beginTransaction();
            try {
                Cursor cursorF = androidx.room.util.b.f(e.this.f154252a, this.f154274a, false, null);
                try {
                    int iE = androidx.room.util.a.e(cursorF, "hash");
                    int iE2 = androidx.room.util.a.e(cursorF, "space_hash");
                    int iE3 = androidx.room.util.a.e(cursorF, "name");
                    int iE4 = androidx.room.util.a.e(cursorF, "folder_hash");
                    int iE5 = androidx.room.util.a.e(cursorF, "date_created");
                    int iE6 = androidx.room.util.a.e(cursorF, "date_updated");
                    int iE7 = androidx.room.util.a.e(cursorF, "uri");
                    int iE8 = androidx.room.util.a.e(cursorF, s.f106625b);
                    int iE9 = androidx.room.util.a.e(cursorF, "remote");
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        arrayList.add(new com.planner5d.library.database.model.spaces.documents.a(cursorF.getString(iE), cursorF.isNull(iE2) ? null : cursorF.getString(iE2), cursorF.isNull(iE3) ? null : cursorF.getString(iE3), cursorF.isNull(iE4) ? null : cursorF.getString(iE4), e.this.f154254c.b(cursorF.isNull(iE5) ? null : Long.valueOf(cursorF.getLong(iE5))), e.this.f154254c.b(cursorF.isNull(iE6) ? null : Long.valueOf(cursorF.getLong(iE6))), cursorF.isNull(iE7) ? null : cursorF.getString(iE7), cursorF.getInt(iE8) != 0, cursorF.getInt(iE9) != 0));
                    }
                    e.this.f154252a.setTransactionSuccessful();
                    cursorF.close();
                    this.f154274a.release();
                    e.this.f154252a.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    this.f154274a.release();
                    throw th2;
                }
            } catch (Throwable th3) {
                e.this.f154252a.endTransaction();
                throw th3;
            }
        }
    }

    class i extends w<com.planner5d.library.database.model.spaces.documents.a> {
        i(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `document` (`hash`,`space_hash`,`name`,`folder_hash`,`date_created`,`date_updated`,`uri`,`local`,`remote`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull w3.i iVar, @NonNull com.planner5d.library.database.model.spaces.documents.a aVar) {
            iVar.H5(1, aVar.o());
            if (aVar.s() == null) {
                iVar.J7(2);
            } else {
                iVar.H5(2, aVar.s());
            }
            if (aVar.q() == null) {
                iVar.J7(3);
            } else {
                iVar.H5(3, aVar.q());
            }
            if (aVar.n() == null) {
                iVar.J7(4);
            } else {
                iVar.H5(4, aVar.n());
            }
            Long lA = e.this.f154254c.a(aVar.l());
            if (lA == null) {
                iVar.J7(5);
            } else {
                iVar.G6(5, lA.longValue());
            }
            Long lA2 = e.this.f154254c.a(aVar.m());
            if (lA2 == null) {
                iVar.J7(6);
            } else {
                iVar.G6(6, lA2.longValue());
            }
            if (aVar.t() == null) {
                iVar.J7(7);
            } else {
                iVar.H5(7, aVar.t());
            }
            iVar.G6(8, aVar.p() ? 1L : 0L);
            iVar.G6(9, aVar.r() ? 1L : 0L);
        }
    }

    class j extends w<com.planner5d.library.database.model.spaces.documents.c> {
        j(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `document_folder` (`hash`,`parent_hash`,`space_hash`,`name`,`tags`,`date_created`,`date_updated`) VALUES (?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final w3.i statement, @NonNull final com.planner5d.library.database.model.spaces.documents.c entity) {
            statement.H5(1, entity.p());
            if (entity.r() == null) {
                statement.J7(2);
            } else {
                statement.H5(2, entity.r());
            }
            if (entity.s() == null) {
                statement.J7(3);
            } else {
                statement.H5(3, entity.s());
            }
            if (entity.q() == null) {
                statement.J7(4);
            } else {
                statement.H5(4, entity.q());
            }
            String strA = e.this.f154256e.a(entity.t());
            if (strA == null) {
                statement.J7(5);
            } else {
                statement.H5(5, strA);
            }
            Long lA = e.this.f154254c.a(entity.n());
            if (lA == null) {
                statement.J7(6);
            } else {
                statement.G6(6, lA.longValue());
            }
            Long lA2 = e.this.f154254c.a(entity.o());
            if (lA2 == null) {
                statement.J7(7);
            } else {
                statement.G6(7, lA2.longValue());
            }
        }
    }

    class k extends v<com.planner5d.library.database.model.spaces.documents.c> {
        k(b2 database) {
            super(database);
        }

        @Override // androidx.room.v, androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "DELETE FROM `document_folder` WHERE `hash` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.v
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final w3.i statement, @NonNull final com.planner5d.library.database.model.spaces.documents.c entity) {
            statement.H5(1, entity.p());
        }
    }

    class l extends v<com.planner5d.library.database.model.spaces.documents.a> {
        l(b2 database) {
            super(database);
        }

        @Override // androidx.room.v, androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "DELETE FROM `document` WHERE `hash` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.v
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final w3.i statement, @NonNull final com.planner5d.library.database.model.spaces.documents.a entity) {
            statement.H5(1, entity.o());
        }
    }

    class m extends w<com.planner5d.library.database.model.spaces.documents.a> {
        m(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "INSERT INTO `document` (`hash`,`space_hash`,`name`,`folder_hash`,`date_created`,`date_updated`,`uri`,`local`,`remote`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull w3.i iVar, @NonNull com.planner5d.library.database.model.spaces.documents.a aVar) {
            iVar.H5(1, aVar.o());
            if (aVar.s() == null) {
                iVar.J7(2);
            } else {
                iVar.H5(2, aVar.s());
            }
            if (aVar.q() == null) {
                iVar.J7(3);
            } else {
                iVar.H5(3, aVar.q());
            }
            if (aVar.n() == null) {
                iVar.J7(4);
            } else {
                iVar.H5(4, aVar.n());
            }
            Long lA = e.this.f154254c.a(aVar.l());
            if (lA == null) {
                iVar.J7(5);
            } else {
                iVar.G6(5, lA.longValue());
            }
            Long lA2 = e.this.f154254c.a(aVar.m());
            if (lA2 == null) {
                iVar.J7(6);
            } else {
                iVar.G6(6, lA2.longValue());
            }
            if (aVar.t() == null) {
                iVar.J7(7);
            } else {
                iVar.H5(7, aVar.t());
            }
            iVar.G6(8, aVar.p() ? 1L : 0L);
            iVar.G6(9, aVar.r() ? 1L : 0L);
        }
    }

    class n extends v<com.planner5d.library.database.model.spaces.documents.a> {
        n(b2 database) {
            super(database);
        }

        @Override // androidx.room.v, androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "UPDATE `document` SET `hash` = ?,`space_hash` = ?,`name` = ?,`folder_hash` = ?,`date_created` = ?,`date_updated` = ?,`uri` = ?,`local` = ?,`remote` = ? WHERE `hash` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.v
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull w3.i iVar, @NonNull com.planner5d.library.database.model.spaces.documents.a aVar) {
            iVar.H5(1, aVar.o());
            if (aVar.s() == null) {
                iVar.J7(2);
            } else {
                iVar.H5(2, aVar.s());
            }
            if (aVar.q() == null) {
                iVar.J7(3);
            } else {
                iVar.H5(3, aVar.q());
            }
            if (aVar.n() == null) {
                iVar.J7(4);
            } else {
                iVar.H5(4, aVar.n());
            }
            Long lA = e.this.f154254c.a(aVar.l());
            if (lA == null) {
                iVar.J7(5);
            } else {
                iVar.G6(5, lA.longValue());
            }
            Long lA2 = e.this.f154254c.a(aVar.m());
            if (lA2 == null) {
                iVar.J7(6);
            } else {
                iVar.G6(6, lA2.longValue());
            }
            if (aVar.t() == null) {
                iVar.J7(7);
            } else {
                iVar.H5(7, aVar.t());
            }
            iVar.G6(8, aVar.p() ? 1L : 0L);
            iVar.G6(9, aVar.r() ? 1L : 0L);
            iVar.H5(10, aVar.o());
        }
    }

    class o implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.a f154282a;

        o(final com.planner5d.library.database.model.spaces.documents.a val$document) {
            this.f154282a = val$document;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            e.this.f154252a.beginTransaction();
            try {
                e.this.f154253b.insert(this.f154282a);
                e.this.f154252a.setTransactionSuccessful();
                Unit unit = Unit.f312394a;
                b2 b2Var = e.this.f154252a;
                return unit;
            } finally {
                e.this.f154252a.endTransaction();
            }
        }
    }

    class p implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.documents.c f154284a;

        p(final com.planner5d.library.database.model.spaces.documents.c val$folder) {
            this.f154284a = val$folder;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            e.this.f154252a.beginTransaction();
            try {
                e.this.f154255d.insert(this.f154284a);
                e.this.f154252a.setTransactionSuccessful();
                Unit unit = Unit.f312394a;
                e.this.f154252a.endTransaction();
                return unit;
            } catch (Throwable th2) {
                e.this.f154252a.endTransaction();
                throw th2;
            }
        }
    }

    class q implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f154286a;

        q(final List val$folders) {
            this.f154286a = val$folders;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            e.this.f154252a.beginTransaction();
            try {
                e.this.f154255d.insert((Iterable) this.f154286a);
                e.this.f154252a.setTransactionSuccessful();
                Unit unit = Unit.f312394a;
                b2 b2Var = e.this.f154252a;
                return unit;
            } finally {
                e.this.f154252a.endTransaction();
            }
        }
    }

    public e(@NonNull final b2 __db) {
        this.f154252a = __db;
        this.f154253b = new i(__db);
        this.f154255d = new j(__db);
        this.f154257f = new k(__db);
        this.f154258g = new l(__db);
        this.f154259h = new x<>(new m(__db), new n(__db));
    }

    @NonNull
    public static List<Class<?>> t() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.planner5d.library.database.model.spaces.documents.d
    public Object a(final com.planner5d.library.database.model.spaces.documents.a document, final kotlin.coroutines.d<? super Unit> $completion) {
        return androidx.room.j.c(this.f154252a, true, new b(document), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.documents.d
    public Object b(final com.planner5d.library.database.model.spaces.documents.c folder, final kotlin.coroutines.d<? super Unit> $completion) {
        return androidx.room.j.c(this.f154252a, true, new a(folder), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.documents.d
    public Object c(final String folderHash, final kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>> $completion) {
        f2 f2VarD = f2.d("SELECT * FROM document WHERE document.folder_hash = ?", 1);
        if (folderHash == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, folderHash);
        }
        return androidx.room.j.b(this.f154252a, true, androidx.room.util.b.a(), new h(f2VarD), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.documents.d
    public Object d(final String hash, final kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.a> $completion) {
        f2 f2VarD = f2.d("SELECT * FROM document WHERE document.hash = ?", 1);
        f2VarD.H5(1, hash);
        return androidx.room.j.b(this.f154252a, true, androidx.room.util.b.a(), new d(f2VarD), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.documents.d
    public Object e(final String hash, final kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.documents.c> $completion) {
        f2 f2VarD = f2.d("SELECT * FROM document_folder WHERE document_folder.hash = ?", 1);
        f2VarD.H5(1, hash);
        return androidx.room.j.b(this.f154252a, true, androidx.room.util.b.a(), new f(f2VarD), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.documents.d
    public Object f(final String spaceHash, final kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.c>> $completion) {
        f2 f2VarD = f2.d("SELECT * FROM document_folder WHERE document_folder.space_hash = ?", 1);
        f2VarD.H5(1, spaceHash);
        return androidx.room.j.b(this.f154252a, true, androidx.room.util.b.a(), new g(f2VarD), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.documents.d
    public Object g(final String spaceHash, final kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.documents.a>> $completion) {
        f2 f2VarD = f2.d("SELECT * FROM document WHERE document.space_hash = ?", 1);
        f2VarD.H5(1, spaceHash);
        return androidx.room.j.b(this.f154252a, true, androidx.room.util.b.a(), new CallableC1535e(f2VarD), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.documents.d
    public Object h(final com.planner5d.library.database.model.spaces.documents.a document, final kotlin.coroutines.d<? super Unit> $completion) {
        return androidx.room.j.c(this.f154252a, true, new o(document), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.documents.d
    public Object i(final com.planner5d.library.database.model.spaces.documents.c folder, final kotlin.coroutines.d<? super Unit> $completion) {
        return androidx.room.j.c(this.f154252a, true, new p(folder), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.documents.d
    public Object j(final List<com.planner5d.library.database.model.spaces.documents.c> folders, final kotlin.coroutines.d<? super Unit> $completion) {
        return androidx.room.j.c(this.f154252a, true, new q(folders), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.documents.d
    public Object k(final List<com.planner5d.library.database.model.spaces.documents.a> documents, final kotlin.coroutines.d<? super Unit> $completion) {
        return androidx.room.j.c(this.f154252a, true, new c(documents), $completion);
    }
}
