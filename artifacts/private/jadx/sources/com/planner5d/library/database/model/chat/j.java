package com.planner5d.library.database.model.chat;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.b2;
import androidx.room.f2;
import androidx.room.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f154143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w<h> f154144b;

    class a extends w<h> {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `project_conversations` (`user_id`,`project_id`,`conversation_id`) VALUES (?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final w3.i statement, @NonNull final h entity) {
            statement.G6(1, entity.c());
            statement.G6(2, entity.b());
            statement.H5(3, entity.a());
        }
    }

    class b implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f154146a;

        b(final h val$projectConversation) {
            this.f154146a = val$projectConversation;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            j.this.f154143a.beginTransaction();
            try {
                j.this.f154144b.insert(this.f154146a);
                j.this.f154143a.setTransactionSuccessful();
                return Unit.f312394a;
            } finally {
                j.this.f154143a.endTransaction();
            }
        }
    }

    class c implements Callable<List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f154148a;

        c(final f2 val$_statement) {
            this.f154148a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> call() throws Exception {
            Cursor cursorF = androidx.room.util.b.f(j.this.f154143a, this.f154148a, false, null);
            try {
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    arrayList.add(cursorF.getString(0));
                }
                cursorF.close();
                this.f154148a.release();
                return arrayList;
            } catch (Throwable th2) {
                cursorF.close();
                this.f154148a.release();
                throw th2;
            }
        }
    }

    public j(@NonNull final b2 __db) {
        this.f154143a = __db;
        this.f154144b = new a(__db);
    }

    @NonNull
    public static List<Class<?>> e() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.planner5d.library.database.model.chat.i
    public Object a(final h projectConversation, final kotlin.coroutines.d<? super Unit> $completion) {
        return androidx.room.j.c(this.f154143a, true, new b(projectConversation), $completion);
    }

    @Override // com.planner5d.library.database.model.chat.i
    public Object b(final long userId, final long projectId, final kotlin.coroutines.d<? super List<String>> $completion) {
        f2 f2VarD = f2.d("SELECT conversation_id FROM project_conversations WHERE user_id = ? AND project_id = ?", 2);
        f2VarD.G6(1, userId);
        f2VarD.G6(2, projectId);
        return androidx.room.j.b(this.f154143a, false, androidx.room.util.b.a(), new c(f2VarD), $completion);
    }
}
