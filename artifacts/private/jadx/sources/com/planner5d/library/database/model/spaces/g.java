package com.planner5d.library.database.model.spaces;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.room.b2;
import androidx.room.c2;
import androidx.room.f2;
import androidx.room.j;
import androidx.room.w;
import com.planner5d.library.database.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import w3.i;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends com.planner5d.library.database.model.spaces.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f154291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w<com.planner5d.library.database.model.spaces.a> f154292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f154293c = new n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w<com.planner5d.library.database.model.spaces.b> f154294d;

    class a extends w<com.planner5d.library.database.model.spaces.a> {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `space` (`id`,`user_id`,`created`,`title`,`address`,`price_amount`,`price_currency`,`cover`,`hash`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final i statement, @NonNull final com.planner5d.library.database.model.spaces.a entity) {
            statement.G6(1, entity.p());
            statement.G6(2, entity.t());
            Long lA = g.this.f154293c.a(entity.n());
            if (lA == null) {
                statement.J7(3);
            } else {
                statement.G6(3, lA.longValue());
            }
            if (entity.s() == null) {
                statement.J7(4);
            } else {
                statement.H5(4, entity.s());
            }
            if (entity.l() == null) {
                statement.J7(5);
            } else {
                statement.H5(5, entity.l());
            }
            if (entity.q() == null) {
                statement.J7(6);
            } else {
                statement.G6(6, entity.q().intValue());
            }
            if (entity.r() == null) {
                statement.J7(7);
            } else {
                statement.H5(7, entity.r());
            }
            if (entity.m() == null) {
                statement.J7(8);
            } else {
                statement.H5(8, entity.m());
            }
            statement.H5(9, entity.o());
        }
    }

    class b extends w<com.planner5d.library.database.model.spaces.b> {
        b(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `space_attributes` (`id`,`space_id`,`area`,`build_date`,`total_bedrooms`,`total_bathrooms`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final i statement, @NonNull final com.planner5d.library.database.model.spaces.b entity) {
            statement.G6(1, entity.k());
            statement.G6(2, entity.l());
            if (entity.i() == null) {
                statement.J7(3);
            } else {
                statement.H5(3, entity.i());
            }
            if (entity.j() == null) {
                statement.J7(4);
            } else {
                statement.H5(4, entity.j());
            }
            if (entity.n() == null) {
                statement.J7(5);
            } else {
                statement.H5(5, entity.n());
            }
            if (entity.m() == null) {
                statement.J7(6);
            } else {
                statement.H5(6, entity.m());
            }
        }
    }

    class c implements Callable<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.a f154297a;

        c(final com.planner5d.library.database.model.spaces.a val$space) {
            this.f154297a = val$space;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            g.this.f154291a.beginTransaction();
            try {
                Long lValueOf = Long.valueOf(g.this.f154292b.insertAndReturnId(this.f154297a));
                g.this.f154291a.setTransactionSuccessful();
                g.this.f154291a.endTransaction();
                return lValueOf;
            } catch (Throwable th2) {
                g.this.f154291a.endTransaction();
                throw th2;
            }
        }
    }

    class d implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.database.model.spaces.b f154299a;

        d(final com.planner5d.library.database.model.spaces.b val$attributes) {
            this.f154299a = val$attributes;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            g.this.f154291a.beginTransaction();
            try {
                g.this.f154294d.insert(this.f154299a);
                g.this.f154291a.setTransactionSuccessful();
                Unit unit = Unit.f312394a;
                g.this.f154291a.endTransaction();
                return unit;
            } catch (Throwable th2) {
                g.this.f154291a.endTransaction();
                throw th2;
            }
        }
    }

    class e implements Callable<com.planner5d.library.database.model.spaces.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f154301a;

        e(final f2 val$_statement) {
            this.f154301a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.planner5d.library.database.model.spaces.c call() throws Exception {
            g.this.f154291a.beginTransaction();
            try {
                com.planner5d.library.database.model.spaces.c cVar = null;
                Cursor cursorF = androidx.room.util.b.f(g.this.f154291a, this.f154301a, true, null);
                try {
                    int iE = androidx.room.util.a.e(cursorF, "id");
                    int iE2 = androidx.room.util.a.e(cursorF, "user_id");
                    int iE3 = androidx.room.util.a.e(cursorF, "created");
                    int iE4 = androidx.room.util.a.e(cursorF, "title");
                    int iE5 = androidx.room.util.a.e(cursorF, "address");
                    int iE6 = androidx.room.util.a.e(cursorF, "price_amount");
                    int iE7 = androidx.room.util.a.e(cursorF, "price_currency");
                    int iE8 = androidx.room.util.a.e(cursorF, "cover");
                    int iE9 = androidx.room.util.a.e(cursorF, "hash");
                    HashMap map = new HashMap();
                    while (cursorF.moveToNext()) {
                        map.put(Long.valueOf(cursorF.getLong(iE)), null);
                    }
                    cursorF.moveToPosition(-1);
                    g.this.o(map);
                    if (cursorF.moveToFirst()) {
                        cVar = new com.planner5d.library.database.model.spaces.c(new com.planner5d.library.database.model.spaces.a(cursorF.getLong(iE), cursorF.getLong(iE2), g.this.f154293c.b(cursorF.isNull(iE3) ? null : Long.valueOf(cursorF.getLong(iE3))), cursorF.isNull(iE4) ? null : cursorF.getString(iE4), cursorF.isNull(iE5) ? null : cursorF.getString(iE5), cursorF.isNull(iE6) ? null : Integer.valueOf(cursorF.getInt(iE6)), cursorF.isNull(iE7) ? null : cursorF.getString(iE7), cursorF.isNull(iE8) ? null : cursorF.getString(iE8), cursorF.getString(iE9)), (com.planner5d.library.database.model.spaces.b) map.get(Long.valueOf(cursorF.getLong(iE))));
                    }
                    g.this.f154291a.setTransactionSuccessful();
                    cursorF.close();
                    this.f154301a.release();
                    g.this.f154291a.endTransaction();
                    return cVar;
                } catch (Throwable th2) {
                    cursorF.close();
                    this.f154301a.release();
                    throw th2;
                }
            } catch (Throwable th3) {
                g.this.f154291a.endTransaction();
                throw th3;
            }
        }
    }

    class f implements Callable<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f154303a;

        f(final f2 val$_statement) {
            this.f154303a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            Cursor cursorF = androidx.room.util.b.f(g.this.f154291a, this.f154303a, false, null);
            try {
                Long lValueOf = Long.valueOf(cursorF.moveToFirst() ? cursorF.getLong(0) : 0L);
                cursorF.close();
                f2 f2Var = this.f154303a;
                return lValueOf;
            } finally {
                cursorF.close();
                this.f154303a.release();
            }
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.database.model.spaces.g$g, reason: collision with other inner class name */
    class CallableC1536g implements Callable<List<com.planner5d.library.database.model.spaces.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f154305a;

        CallableC1536g(final f2 val$_statement) {
            this.f154305a = val$_statement;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<com.planner5d.library.database.model.spaces.c> call() throws Exception {
            g.this.f154291a.beginTransaction();
            try {
                String str = null;
                Cursor cursorF = androidx.room.util.b.f(g.this.f154291a, this.f154305a, true, null);
                try {
                    int iE = androidx.room.util.a.e(cursorF, "id");
                    int iE2 = androidx.room.util.a.e(cursorF, "user_id");
                    int iE3 = androidx.room.util.a.e(cursorF, "created");
                    int iE4 = androidx.room.util.a.e(cursorF, "title");
                    int iE5 = androidx.room.util.a.e(cursorF, "address");
                    int iE6 = androidx.room.util.a.e(cursorF, "price_amount");
                    int iE7 = androidx.room.util.a.e(cursorF, "price_currency");
                    int iE8 = androidx.room.util.a.e(cursorF, "cover");
                    int iE9 = androidx.room.util.a.e(cursorF, "hash");
                    HashMap map = new HashMap();
                    while (cursorF.moveToNext()) {
                        map.put(Long.valueOf(cursorF.getLong(iE)), null);
                    }
                    cursorF.moveToPosition(-1);
                    g.this.o(map);
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        arrayList.add(new com.planner5d.library.database.model.spaces.c(new com.planner5d.library.database.model.spaces.a(cursorF.getLong(iE), cursorF.getLong(iE2), g.this.f154293c.b(cursorF.isNull(iE3) ? str : Long.valueOf(cursorF.getLong(iE3))), cursorF.isNull(iE4) ? str : cursorF.getString(iE4), cursorF.isNull(iE5) ? str : cursorF.getString(iE5), cursorF.isNull(iE6) ? str : Integer.valueOf(cursorF.getInt(iE6)), cursorF.isNull(iE7) ? str : cursorF.getString(iE7), cursorF.isNull(iE8) ? str : cursorF.getString(iE8), cursorF.getString(iE9)), (com.planner5d.library.database.model.spaces.b) map.get(Long.valueOf(cursorF.getLong(iE)))));
                        str = null;
                    }
                    g.this.f154291a.setTransactionSuccessful();
                    cursorF.close();
                    this.f154305a.release();
                    g.this.f154291a.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    this.f154305a.release();
                    throw th2;
                }
            } catch (Throwable th3) {
                g.this.f154291a.endTransaction();
                throw th3;
            }
        }
    }

    public g(@NonNull final b2 __db) {
        this.f154291a = __db;
        this.f154292b = new a(__db);
        this.f154294d = new b(__db);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(@NonNull final HashMap<Long, com.planner5d.library.database.model.spaces.b> _map) {
        Set<Long> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            androidx.room.util.e.b(_map, false, new Function1() { // from class: com.planner5d.library.database.model.spaces.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f154290a.r((HashMap) obj);
                }
            });
            return;
        }
        StringBuilder sbD = androidx.room.util.f.d();
        sbD.append("SELECT `id`,`space_id`,`area`,`build_date`,`total_bedrooms`,`total_bathrooms` FROM `space_attributes` WHERE `space_id` IN (");
        int size = setKeySet.size();
        androidx.room.util.f.a(sbD, size);
        sbD.append(")");
        f2 f2VarD = f2.d(sbD.toString(), size);
        Iterator<Long> it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            f2VarD.G6(i10, it.next().longValue());
            i10++;
        }
        Cursor cursorF = androidx.room.util.b.f(this.f154291a, f2VarD, false, null);
        try {
            int iD = androidx.room.util.a.d(cursorF, "space_id");
            if (iD == -1) {
                return;
            }
            while (cursorF.moveToNext()) {
                long j10 = cursorF.getLong(iD);
                if (_map.containsKey(Long.valueOf(j10))) {
                    _map.put(Long.valueOf(j10), new com.planner5d.library.database.model.spaces.b(cursorF.getLong(0), cursorF.getLong(1), cursorF.isNull(2) ? null : cursorF.getString(2), cursorF.isNull(3) ? null : cursorF.getString(3), cursorF.isNull(4) ? null : cursorF.getString(4), cursorF.isNull(5) ? null : cursorF.getString(5)));
                }
            }
        } finally {
            cursorF.close();
        }
    }

    @NonNull
    public static List<Class<?>> q() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit r(HashMap map) {
        o(map);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(com.planner5d.library.database.model.spaces.c cVar, kotlin.coroutines.d dVar) {
        return super.f(cVar, dVar);
    }

    @Override // com.planner5d.library.database.model.spaces.d
    public Object a(final long userId, final kotlin.coroutines.d<? super List<com.planner5d.library.database.model.spaces.c>> $completion) {
        f2 f2VarD = f2.d("SELECT * FROM space WHERE user_id = ?", 1);
        f2VarD.G6(1, userId);
        return j.b(this.f154291a, true, androidx.room.util.b.a(), new CallableC1536g(f2VarD), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.d
    public Object b(final String hash, final kotlin.coroutines.d<? super com.planner5d.library.database.model.spaces.c> $completion) {
        f2 f2VarD = f2.d("SELECT * FROM space WHERE space.hash = ?", 1);
        f2VarD.H5(1, hash);
        return j.b(this.f154291a, true, androidx.room.util.b.a(), new e(f2VarD), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.d
    protected Object c(final long rowId, final kotlin.coroutines.d<? super Long> $completion) {
        f2 f2VarD = f2.d("SELECT id FROM space WHERE rowid = ?", 1);
        f2VarD.G6(1, rowId);
        return j.b(this.f154291a, false, androidx.room.util.b.a(), new f(f2VarD), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.d
    protected Object d(final com.planner5d.library.database.model.spaces.b attributes, final kotlin.coroutines.d<? super Unit> $completion) {
        return j.c(this.f154291a, true, new d(attributes), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.d
    protected Object e(final com.planner5d.library.database.model.spaces.a space, final kotlin.coroutines.d<? super Long> $completion) {
        return j.c(this.f154291a, true, new c(space), $completion);
    }

    @Override // com.planner5d.library.database.model.spaces.d
    public Object f(final com.planner5d.library.database.model.spaces.c data, final kotlin.coroutines.d<? super Unit> $completion) {
        return c2.g(this.f154291a, new Function1() { // from class: com.planner5d.library.database.model.spaces.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f154288a.s(data, (kotlin.coroutines.d) obj);
            }
        }, $completion);
    }
}
