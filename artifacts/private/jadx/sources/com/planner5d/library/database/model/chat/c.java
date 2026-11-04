package com.planner5d.library.database.model.chat;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.b2;
import androidx.room.f2;
import androidx.room.w;
import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import com.devtodev.core.data.metrics.MetricConsts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements com.planner5d.library.database.model.chat.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f154120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w<com.planner5d.library.database.model.chat.a> f154121b;

    class a extends w<com.planner5d.library.database.model.chat.a> {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `chat_messages` (`id`,`project_id`,`created_at`,`text`,`json`,`ai`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull w3.i iVar, @NonNull com.planner5d.library.database.model.chat.a aVar) {
            iVar.G6(1, aVar.c());
            iVar.G6(2, aVar.d());
            iVar.G6(3, aVar.b());
            iVar.H5(4, aVar.getText());
            if (aVar.getJson() == null) {
                iVar.J7(5);
            } else {
                iVar.H5(5, aVar.getJson());
            }
            Integer numValueOf = aVar.a() == null ? null : Integer.valueOf(aVar.a().booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                iVar.J7(6);
            } else {
                iVar.G6(6, numValueOf.intValue());
            }
        }
    }

    class b implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f154123a;

        b(final List val$chatMessages) {
            this.f154123a = val$chatMessages;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            c.this.f154120a.beginTransaction();
            try {
                c.this.f154121b.insert((Iterable) this.f154123a);
                c.this.f154120a.setTransactionSuccessful();
                Unit unit = Unit.f312394a;
                b2 b2Var = c.this.f154120a;
                return unit;
            } finally {
                c.this.f154120a.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.database.model.chat.c$c, reason: collision with other inner class name */
    class CallableC1532c implements Callable<List<com.planner5d.library.database.model.chat.a>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f154125a;

        CallableC1532c(final f2 val$_statement) {
            this.f154125a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<com.planner5d.library.database.model.chat.a> call() throws Exception {
            Boolean boolValueOf;
            Cursor cursorF = androidx.room.util.b.f(c.this.f154120a, this.f154125a, false, null);
            try {
                int iE = androidx.room.util.a.e(cursorF, "id");
                int iE2 = androidx.room.util.a.e(cursorF, "project_id");
                int iE3 = androidx.room.util.a.e(cursorF, "created_at");
                int iE4 = androidx.room.util.a.e(cursorF, "text");
                int iE5 = androidx.room.util.a.e(cursorF, PeopleCardEntry.json);
                int iE6 = androidx.room.util.a.e(cursorF, MetricConsts.ApplicationInfo);
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    int i10 = cursorF.getInt(iE);
                    long j10 = cursorF.getLong(iE2);
                    long j11 = cursorF.getLong(iE3);
                    String string = cursorF.getString(iE4);
                    String string2 = cursorF.isNull(iE5) ? null : cursorF.getString(iE5);
                    Integer numValueOf = cursorF.isNull(iE6) ? null : Integer.valueOf(cursorF.getInt(iE6));
                    if (numValueOf == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    arrayList.add(new com.planner5d.library.database.model.chat.a(i10, j10, j11, string, string2, boolValueOf));
                }
                return arrayList;
            } finally {
                cursorF.close();
                this.f154125a.release();
            }
        }
    }

    public c(@NonNull final b2 __db) {
        this.f154120a = __db;
        this.f154121b = new a(__db);
    }

    @NonNull
    public static List<Class<?>> e() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.planner5d.library.database.model.chat.b
    public Object a(final List<com.planner5d.library.database.model.chat.a> chatMessages, final kotlin.coroutines.d<? super Unit> $completion) {
        return androidx.room.j.c(this.f154120a, true, new b(chatMessages), $completion);
    }

    @Override // com.planner5d.library.database.model.chat.b
    public Object b(final long projectId, final kotlin.coroutines.d<? super List<com.planner5d.library.database.model.chat.a>> $completion) {
        f2 f2VarD = f2.d("SELECT * FROM chat_messages WHERE project_id = ? ORDER BY created_at", 1);
        f2VarD.G6(1, projectId);
        return androidx.room.j.b(this.f154120a, false, androidx.room.util.b.a(), new CallableC1532c(f2VarD), $completion);
    }
}
