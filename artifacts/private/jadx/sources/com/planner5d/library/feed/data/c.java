package com.planner5d.library.feed.data;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.room.b2;
import androidx.room.c2;
import androidx.room.f2;
import androidx.room.j;
import androidx.room.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import w3.i;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements com.planner5d.library.feed.data.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f175263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w<jc.a> f175264b;

    class a extends w<jc.a> {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        @NonNull
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `blog_posts` (`id`,`category_id`,`title`,`image_uri`,`thumbnail_image_uri`,`announcement`,`content_uri`,`video_uri`,`public_uri`,`ghost_uri`,`created_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final i statement, @NonNull final jc.a entity) {
            statement.G6(1, entity.f());
            if (entity.b() == null) {
                statement.J7(2);
            } else {
                statement.G6(2, entity.b().intValue());
            }
            if (entity.j() == null) {
                statement.J7(3);
            } else {
                statement.H5(3, entity.j());
            }
            if (entity.g() == null) {
                statement.J7(4);
            } else {
                statement.H5(4, entity.g());
            }
            if (entity.i() == null) {
                statement.J7(5);
            } else {
                statement.H5(5, entity.i());
            }
            if (entity.a() == null) {
                statement.J7(6);
            } else {
                statement.H5(6, entity.a());
            }
            if (entity.c() == null) {
                statement.J7(7);
            } else {
                statement.H5(7, entity.c());
            }
            if (entity.k() == null) {
                statement.J7(8);
            } else {
                statement.H5(8, entity.k());
            }
            if (entity.h() == null) {
                statement.J7(9);
            } else {
                statement.H5(9, entity.h());
            }
            if (entity.e() == null) {
                statement.J7(10);
            } else {
                statement.H5(10, entity.e());
            }
            if (entity.d() == null) {
                statement.J7(11);
            } else {
                statement.H5(11, entity.d());
            }
        }
    }

    class b implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f175266a;

        b(final List val$blogPosts) {
            this.f175266a = val$blogPosts;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            c.this.f175263a.beginTransaction();
            try {
                c.this.f175264b.insert((Iterable) this.f175266a);
                c.this.f175263a.setTransactionSuccessful();
                Unit unit = Unit.f312394a;
                c.this.f175263a.endTransaction();
                return unit;
            } catch (Throwable th2) {
                c.this.f175263a.endTransaction();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.feed.data.c$c, reason: collision with other inner class name */
    class CallableC1554c implements Callable<List<jc.a>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f175268a;

        CallableC1554c(final f2 val$_statement) {
            this.f175268a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<jc.a> call() throws Exception {
            Cursor cursorF = androidx.room.util.b.f(c.this.f175263a, this.f175268a, false, null);
            try {
                int iE = androidx.room.util.a.e(cursorF, "id");
                int iE2 = androidx.room.util.a.e(cursorF, "category_id");
                int iE3 = androidx.room.util.a.e(cursorF, "title");
                int iE4 = androidx.room.util.a.e(cursorF, "image_uri");
                int iE5 = androidx.room.util.a.e(cursorF, "thumbnail_image_uri");
                int iE6 = androidx.room.util.a.e(cursorF, "announcement");
                int iE7 = androidx.room.util.a.e(cursorF, "content_uri");
                int iE8 = androidx.room.util.a.e(cursorF, "video_uri");
                int iE9 = androidx.room.util.a.e(cursorF, "public_uri");
                int iE10 = androidx.room.util.a.e(cursorF, "ghost_uri");
                int iE11 = androidx.room.util.a.e(cursorF, "created_at");
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    arrayList.add(new jc.a(cursorF.getInt(iE), cursorF.isNull(iE2) ? null : Integer.valueOf(cursorF.getInt(iE2)), cursorF.isNull(iE3) ? null : cursorF.getString(iE3), cursorF.isNull(iE4) ? null : cursorF.getString(iE4), cursorF.isNull(iE5) ? null : cursorF.getString(iE5), cursorF.isNull(iE6) ? null : cursorF.getString(iE6), cursorF.isNull(iE7) ? null : cursorF.getString(iE7), cursorF.isNull(iE8) ? null : cursorF.getString(iE8), cursorF.isNull(iE9) ? null : cursorF.getString(iE9), cursorF.isNull(iE10) ? null : cursorF.getString(iE10), cursorF.isNull(iE11) ? null : cursorF.getString(iE11)));
                }
                return arrayList;
            } finally {
                cursorF.close();
                this.f175268a.release();
            }
        }
    }

    class d implements Callable<jc.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f175270a;

        d(final f2 val$_statement) {
            this.f175270a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public jc.a call() throws Exception {
            jc.a aVar = null;
            Cursor cursorF = androidx.room.util.b.f(c.this.f175263a, this.f175270a, false, null);
            try {
                int iE = androidx.room.util.a.e(cursorF, "id");
                int iE2 = androidx.room.util.a.e(cursorF, "category_id");
                int iE3 = androidx.room.util.a.e(cursorF, "title");
                int iE4 = androidx.room.util.a.e(cursorF, "image_uri");
                int iE5 = androidx.room.util.a.e(cursorF, "thumbnail_image_uri");
                int iE6 = androidx.room.util.a.e(cursorF, "announcement");
                int iE7 = androidx.room.util.a.e(cursorF, "content_uri");
                int iE8 = androidx.room.util.a.e(cursorF, "video_uri");
                int iE9 = androidx.room.util.a.e(cursorF, "public_uri");
                int iE10 = androidx.room.util.a.e(cursorF, "ghost_uri");
                int iE11 = androidx.room.util.a.e(cursorF, "created_at");
                if (cursorF.moveToFirst()) {
                    aVar = new jc.a(cursorF.getInt(iE), cursorF.isNull(iE2) ? null : Integer.valueOf(cursorF.getInt(iE2)), cursorF.isNull(iE3) ? null : cursorF.getString(iE3), cursorF.isNull(iE4) ? null : cursorF.getString(iE4), cursorF.isNull(iE5) ? null : cursorF.getString(iE5), cursorF.isNull(iE6) ? null : cursorF.getString(iE6), cursorF.isNull(iE7) ? null : cursorF.getString(iE7), cursorF.isNull(iE8) ? null : cursorF.getString(iE8), cursorF.isNull(iE9) ? null : cursorF.getString(iE9), cursorF.isNull(iE10) ? null : cursorF.getString(iE10), cursorF.isNull(iE11) ? null : cursorF.getString(iE11));
                }
                return aVar;
            } finally {
                cursorF.close();
                this.f175270a.release();
            }
        }
    }

    class e implements Callable<jc.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f175272a;

        e(final f2 val$_statement) {
            this.f175272a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public jc.a call() throws Exception {
            jc.a aVar = null;
            Cursor cursorF = androidx.room.util.b.f(c.this.f175263a, this.f175272a, false, null);
            try {
                int iE = androidx.room.util.a.e(cursorF, "id");
                int iE2 = androidx.room.util.a.e(cursorF, "category_id");
                int iE3 = androidx.room.util.a.e(cursorF, "title");
                int iE4 = androidx.room.util.a.e(cursorF, "image_uri");
                int iE5 = androidx.room.util.a.e(cursorF, "thumbnail_image_uri");
                int iE6 = androidx.room.util.a.e(cursorF, "announcement");
                int iE7 = androidx.room.util.a.e(cursorF, "content_uri");
                int iE8 = androidx.room.util.a.e(cursorF, "video_uri");
                int iE9 = androidx.room.util.a.e(cursorF, "public_uri");
                int iE10 = androidx.room.util.a.e(cursorF, "ghost_uri");
                int iE11 = androidx.room.util.a.e(cursorF, "created_at");
                if (cursorF.moveToFirst()) {
                    aVar = new jc.a(cursorF.getInt(iE), cursorF.isNull(iE2) ? null : Integer.valueOf(cursorF.getInt(iE2)), cursorF.isNull(iE3) ? null : cursorF.getString(iE3), cursorF.isNull(iE4) ? null : cursorF.getString(iE4), cursorF.isNull(iE5) ? null : cursorF.getString(iE5), cursorF.isNull(iE6) ? null : cursorF.getString(iE6), cursorF.isNull(iE7) ? null : cursorF.getString(iE7), cursorF.isNull(iE8) ? null : cursorF.getString(iE8), cursorF.isNull(iE9) ? null : cursorF.getString(iE9), cursorF.isNull(iE10) ? null : cursorF.getString(iE10), cursorF.isNull(iE11) ? null : cursorF.getString(iE11));
                }
                return aVar;
            } finally {
                cursorF.close();
                this.f175272a.release();
            }
        }
    }

    class f implements Callable<List<Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f175274a;

        f(final f2 val$_statement) {
            this.f175274a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Integer> call() throws Exception {
            Cursor cursorF = androidx.room.util.b.f(c.this.f175263a, this.f175274a, false, null);
            try {
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    arrayList.add(Integer.valueOf(cursorF.getInt(0)));
                }
                cursorF.close();
                this.f175274a.release();
                return arrayList;
            } catch (Throwable th2) {
                cursorF.close();
                this.f175274a.release();
                throw th2;
            }
        }
    }

    class g implements Callable<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f175276a;

        g(final List val$ids) {
            this.f175276a = val$ids;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            StringBuilder sbD = androidx.room.util.f.d();
            sbD.append("DELETE FROM blog_posts WHERE id IN (");
            androidx.room.util.f.a(sbD, this.f175276a.size());
            sbD.append(")");
            i iVarCompileStatement = c.this.f175263a.compileStatement(sbD.toString());
            Iterator it = this.f175276a.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                iVarCompileStatement.G6(i10, ((Integer) it.next()).intValue());
                i10++;
            }
            c.this.f175263a.beginTransaction();
            try {
                iVarCompileStatement.j2();
                c.this.f175263a.setTransactionSuccessful();
                Unit unit = Unit.f312394a;
                b2 b2Var = c.this.f175263a;
                return unit;
            } finally {
                c.this.f175263a.endTransaction();
            }
        }
    }

    public c(@NonNull final b2 __db) {
        this.f175263a = __db;
        this.f175264b = new a(__db);
    }

    @NonNull
    public static List<Class<?>> k() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object l(List list, kotlin.coroutines.d dVar) {
        return com.planner5d.library.feed.data.a.C1552a.a(this, list, dVar);
    }

    @Override // com.planner5d.library.feed.data.a
    public Object a(final List<jc.a> blogPosts, final kotlin.coroutines.d<? super Unit> $completion) {
        return j.c(this.f175263a, true, new b(blogPosts), $completion);
    }

    @Override // com.planner5d.library.feed.data.a
    public Object b(final kotlin.coroutines.d<? super List<jc.a>> $completion) {
        int i10 = 6 | 0;
        f2 f2VarD = f2.d("SELECT * FROM blog_posts ORDER BY created_at DESC", 0);
        return j.b(this.f175263a, false, androidx.room.util.b.a(), new CallableC1554c(f2VarD), $completion);
    }

    @Override // com.planner5d.library.feed.data.a
    public Object c(final String text, final kotlin.coroutines.d<? super jc.a> $completion) {
        f2 f2VarD = f2.d("SELECT * FROM blog_posts WHERE content_uri LIKE '%' || ? || '%' ORDER BY created_at DESC LIMIT 1", 1);
        f2VarD.H5(1, text);
        return j.b(this.f175263a, false, androidx.room.util.b.a(), new d(f2VarD), $completion);
    }

    @Override // com.planner5d.library.feed.data.a
    public Object d(final String text, final kotlin.coroutines.d<? super jc.a> $completion) {
        f2 f2VarD = f2.d("SELECT * FROM blog_posts WHERE ghost_uri LIKE '%' || ? || '%' ORDER BY created_at DESC LIMIT 1", 1);
        f2VarD.H5(1, text);
        return j.b(this.f175263a, false, androidx.room.util.b.a(), new e(f2VarD), $completion);
    }

    @Override // com.planner5d.library.feed.data.a
    public Object e(final kotlin.coroutines.d<? super List<Integer>> $completion) {
        f2 f2VarD = f2.d("SELECT id FROM blog_posts", 0);
        return j.b(this.f175263a, false, androidx.room.util.b.a(), new f(f2VarD), $completion);
    }

    @Override // com.planner5d.library.feed.data.a
    public Object f(final List<jc.a> blogPosts, final kotlin.coroutines.d<? super Unit> $completion) {
        return c2.g(this.f175263a, new Function1() { // from class: com.planner5d.library.feed.data.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f175261a.l(blogPosts, (kotlin.coroutines.d) obj);
            }
        }, $completion);
    }

    @Override // com.planner5d.library.feed.data.a
    public Object g(final List<Integer> ids, final kotlin.coroutines.d<? super Unit> $completion) {
        return j.c(this.f175263a, true, new g(ids), $completion);
    }
}
