package com.planner5d.library.model.manager;

import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.activeandroid.Cache;
import com.activeandroid.Model;
import com.activeandroid.query.Delete;
import com.activeandroid.query.From;
import com.activeandroid.query.Select;
import com.activeandroid.query.Update;
import com.activeandroid.util.TransactionUtils;
import com.devtodev.analytics.internal.storage.sqlite.ProjectEntry;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.snapshot.Snapshot;
import com.planner5d.library.model.snapshot.SnapshotLocal;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class c0 implements x1, kb.b<Folder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.manager.synchronization.i> f181303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.services.utility.p0 f181304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kb.a<Folder> f181305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final fg.e<com.planner5d.library.application.b> f181306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.services.utility.w f181307g;

    public enum a {
        BY_TITLE,
        BY_DATE
    }

    @ij.a
    public c0(fg.e<com.planner5d.library.application.b> eVar, com.planner5d.library.services.utility.p0 p0Var, fg.e<com.planner5d.library.model.manager.synchronization.i> eVar2, com.planner5d.library.services.utility.w wVar) {
        this.f181306f = eVar;
        this.f181304d = p0Var;
        this.f181303c = eVar2;
        this.f181307g = wVar;
        this.f181305e = new kb.a<>(p0Var, Folder.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public List<Folder> I(id.a aVar, a aVar2, int i10, int... iArr) {
        LinkedList linkedList = new LinkedList();
        for (int i11 : iArr) {
            if (F(aVar, i10, i11)) {
                linkedList.add(J(i11));
            }
        }
        List listExecute = new Select().from(Folder.class).where("user_id = ? AND type = ? AND deleted != 1", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar)), Integer.valueOf(i10)).orderBy(aVar2 == a.BY_DATE ? "(CASE WHEN modified_locally = 1 AND date_updated_locally IS NOT NULL THEN date_updated_locally ELSE date_updated END) DESC" : "title COLLATE NOCASE ASC").execute();
        if (listExecute != null) {
            linkedList.addAll(listExecute);
        }
        return linkedList;
    }

    @androidx.annotation.m1
    private boolean F(id.a aVar, int i10, int i11) {
        if (i11 == Folder.f180532e) {
            return F(aVar, i10, i10 == Folder.f180529b ? Folder.f180533f : Folder.f180535h) || new Select().from(Folder.class).where("user_id = ? AND type = ? AND deleted != 1", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar)), Integer.valueOf(i10)).exists();
        }
        if (Folder.x(i10) == Folder.f180529b) {
            return G(aVar, i11, Project.class);
        }
        return G(aVar, i11, Snapshot.class) || G(aVar, i11, SnapshotLocal.class);
    }

    @androidx.annotation.m1
    private boolean G(id.a aVar, int i10, Class<? extends Model> cls) {
        From fromWhere = new Select().from(cls).where("user_id = ?", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar)));
        if (i10 == Folder.f180533f) {
            return fromWhere.exists();
        }
        if (i10 == Folder.f180535h) {
            return fromWhere.where("folder > 0").exists();
        }
        if (i10 != Folder.f180534g && i10 != Folder.f180536i) {
            return false;
        }
        return j(cls, J(i10), fromWhere).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object H(List list, id.a aVar) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v(aVar, (Folder) it.next());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Folder K(id.a aVar, com.planner5d.library.services.utility.j jVar) throws Exception {
        return y(aVar, jVar.d(com.planner5d.library.services.r.id, 0L));
    }

    public static /* synthetic */ Object h(List list, long j10) {
        Date date = new Date();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Folder folder = (Folder) it.next();
            folder.parentId = j10;
            folder.modifiedLocally = true;
            folder.dateUpdatedLocally = date;
            folder.save();
        }
        return null;
    }

    @androidx.annotation.m1
    private void n(Class<? extends Model> cls, List<Long> list) {
        if (list.isEmpty()) {
            return;
        }
        new Update(cls).set("folder = 0").where("folder IN (" + org.apache.commons.lang3.z.K0(list, ",") + ")").execute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Folder J(int i10) {
        int i11;
        Folder folder = new Folder();
        folder.type = i10;
        if (i10 == Folder.f180533f) {
            i11 = com.planner5d.library.f.s.f169468uc;
        } else if (i10 == Folder.f180535h) {
            i11 = com.planner5d.library.f.s.f169492vc;
        } else if (i10 == Folder.f180532e) {
            i11 = com.planner5d.library.f.s.f169444tc;
        } else {
            i11 = (i10 == Folder.f180534g || i10 == Folder.f180536i) ? com.planner5d.library.f.s.f169516wc : 0;
        }
        folder.title = i11 == 0 ? com.planner5d.library.model.payments.a.f222474i : this.f181306f.get().getString(i11);
        return folder;
    }

    @androidx.annotation.m1
    private void v(@androidx.annotation.p0 id.a aVar, Folder folder) {
        Long id2 = folder.getId();
        List<Long> listSingletonList = Collections.singletonList(id2);
        folder.deleted = true;
        folder.dateUpdatedLocally = new Date();
        folder.modifiedLocally = true;
        folder.save();
        n(Project.class, listSingletonList);
        n(Snapshot.class, listSingletonList);
        n(SnapshotLocal.class, listSingletonList);
        List<Folder> listB = B(aVar, id2.longValue());
        if (listB == null || listB.isEmpty()) {
            return;
        }
        Iterator<Folder> it = listB.iterator();
        while (it.hasNext()) {
            v(aVar, it.next());
        }
    }

    @androidx.annotation.m1
    public Folder A(id.a aVar, long j10) {
        return (Folder) new Select().from(Folder.class).where("user_id = ? AND uid = ?", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar)), Long.valueOf(j10)).executeSingle();
    }

    @androidx.annotation.m1
    public List<Folder> B(id.a aVar, long j10) {
        return new Select().from(Folder.class).where("user_id = ? AND parent_id = ?", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar)), Long.valueOf(j10)).execute();
    }

    public Observable<List<Folder>> C(final id.a aVar, final a aVar2, final int i10, final int... iArr) {
        return com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.model.manager.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f222416a.I(aVar, aVar2, i10, iArr);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    public Observable<Folder> E(final id.a aVar, Bundle bundle) {
        if (bundle == null) {
            return Observable.just(null);
        }
        final com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        final int iC = jVar.c(com.planner5d.library.services.r.type, 0);
        return Folder.y(iC) ? this.f181307g.j(new com.planner5d.library.services.utility.w.a() { // from class: com.planner5d.library.model.manager.a0
            @Override // com.planner5d.library.services.utility.w.a
            public final Object run() {
                return this.f180778a.J(iC);
            }
        }) : com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.model.manager.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f180877a.K(aVar, jVar);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    public void L(final List<Folder> list, final long j10) {
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c0.h(list, j10);
            }
        });
        this.f181303c.get().u();
        com.planner5d.library.services.m0.f224429b.t();
    }

    @androidx.annotation.m1
    public void M(id.a aVar, Folder folder) {
        folder.dateUpdatedLocally = new Date();
        folder.modifiedLocally = true;
        folder.dateUpdatedLocally = new Date();
        folder.userId = com.planner5d.library.modules.user.user.x.a(aVar);
        folder.save();
        if (Folder.x(folder.type) == Folder.f180530c) {
            m(Snapshot.class);
            m(SnapshotLocal.class);
        } else {
            m(Project.class);
        }
        com.planner5d.library.services.m0.f224429b.t();
        this.f181303c.get().r(folder).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
    }

    public void N(int i10, com.planner5d.library.model.manager.statistics.events.r3.a aVar, com.planner5d.library.model.manager.statistics.events.p3.b bVar) {
        com.planner5d.library.model.manager.statistics.events.j1.f216988b.H(i10 == Folder.f180530c ? com.planner5d.library.model.manager.statistics.events.r3.b.snapshots : com.planner5d.library.model.manager.statistics.events.r3.b.projects, aVar, bVar);
    }

    @Override // kb.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void c(@NotNull Folder folder, @NotNull Folder folder2) {
        folder.title = folder2.title;
        folder.dateUpdated = folder2.dateUpdated;
        folder.dateUpdatedLocally = null;
    }

    @Override // kb.b
    @NonNull
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public JSONObject w(@NonNull id.a aVar, @NonNull Folder folder) throws JSONException {
        JSONObject jSONObjectI = this.f181305e.i(folder);
        jSONObjectI.put(com.planner5d.library.services.r.folderName.f224891a, folder.title);
        jSONObjectI.put(com.planner5d.library.services.r.type.f224891a, folder.type == Folder.f180530c ? "snapshots" : ProjectEntry.tableName);
        return jSONObjectI;
    }

    @Override // kb.b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void p(@NonNull Folder folder, @NonNull JSONObject jSONObject) {
    }

    public From j(Class<? extends Model> cls, Folder folder, From from) {
        if (folder == null) {
            from.where("folder <= 0");
            return from;
        }
        int i10 = folder.type;
        if (i10 != Folder.f180533f && i10 != Folder.f180535h) {
            if (i10 != Folder.f180534g && i10 != Folder.f180536i) {
                from.where("folder = " + folder.getId());
                return from;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            long timeInMillis2 = calendar.getTimeInMillis();
            LinkedList linkedList = new LinkedList();
            String str = cls == SnapshotLocal.class ? "date_created" : "date_updated";
            linkedList.add("(" + str + " >= " + timeInMillis + " AND " + str + " <= " + timeInMillis2 + ")");
            if (cls == Project.class) {
                linkedList.add("(date_updated_locally >= " + timeInMillis + " AND date_updated_locally <= " + timeInMillis2 + ")");
            }
            from.where("(" + org.apache.commons.lang3.z.K0(linkedList, " OR ") + ")");
        }
        return from;
    }

    @Override // kb.b
    @NonNull
    @androidx.annotation.m1
    public List<Folder> k(@NonNull id.a aVar) {
        return this.f181305e.c(aVar);
    }

    @Override // kb.b
    @androidx.annotation.m1
    public void l(@NonNull id.a aVar, @NonNull JSONObject jSONObject) {
        this.f181305e.g(aVar, jSONObject, this);
    }

    @androidx.annotation.m1
    public void m(Class<? extends Model> cls) {
        LinkedList linkedList = new LinkedList();
        Cursor cursorRawQuery = Cache.openDatabase().rawQuery(new Select("folder").from(cls).as("M").leftJoin(Folder.class).as("F").on("F.id = M.folder AND F.deleted != 1").where("M.folder > 0").where("F.id IS NULL").toSql(), new String[0]);
        while (cursorRawQuery.moveToNext()) {
            try {
                linkedList.add(Long.valueOf(cursorRawQuery.getLong(0)));
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
        n(cls, linkedList);
    }

    @androidx.annotation.m1
    public void o() {
        new Delete().from(Folder.class).where("user_id = ?", 0L).execute();
        com.planner5d.library.services.m0.f224429b.t();
    }

    @androidx.annotation.m1
    public void r(id.a aVar, String str, int i10, long j10) {
        Folder folder = new Folder();
        folder.type = i10;
        folder.title = str;
        folder.dateUpdated = new Date();
        folder.dateUpdatedLocally = new Date();
        folder.userId = com.planner5d.library.modules.user.user.x.a(aVar);
        folder.parentId = j10;
        M(aVar, folder);
    }

    @androidx.annotation.m1
    public void t(@androidx.annotation.p0 id.a aVar, Folder folder) {
        int i10 = folder.type;
        com.planner5d.library.model.manager.statistics.events.r3.a aVar2 = com.planner5d.library.model.manager.statistics.events.r3.a.remove;
        N(i10, aVar2, com.planner5d.library.model.manager.statistics.events.p3.b.submit);
        v(aVar, folder);
        com.planner5d.library.services.m0.f224429b.t();
        this.f181303c.get().u();
        N(folder.type, aVar2, com.planner5d.library.model.manager.statistics.events.p3.b.success);
    }

    public void u(@androidx.annotation.p0 final id.a aVar, final List<Folder> list) {
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f222395a.H(list, aVar);
            }
        });
        this.f181303c.get().u();
        com.planner5d.library.services.m0.f224429b.t();
    }

    @Override // kb.b
    @androidx.annotation.m1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(@NonNull id.a aVar, @NonNull Folder folder, @NonNull JSONObject jSONObject) throws JSONException {
        int i10;
        this.f181305e.d(folder, jSONObject);
        String string = jSONObject.getString(com.planner5d.library.services.r.type.f224891a);
        string.getClass();
        if (string.equals(ProjectEntry.tableName)) {
            i10 = Folder.f180529b;
        } else {
            i10 = !string.equals("snapshots") ? Folder.f180528a : Folder.f180530c;
        }
        folder.userId = aVar.f287075a;
        folder.title = jSONObject.getString(com.planner5d.library.services.r.folderName.f224891a);
        folder.dateUpdated = this.f181304d.g(jSONObject.getString(com.planner5d.library.services.r.udate.f224891a));
        folder.type = i10;
        long j10 = jSONObject.getLong(com.planner5d.library.services.r.pid.f224891a);
        if (j10 > 0) {
            Folder folder2 = (Folder) new Select().from(Folder.class).where("user_id = ? AND uid = ?", Long.valueOf(aVar.f287075a), Long.valueOf(j10)).executeSingle();
            if (folder2 == null) {
                throw new JSONException("Parent model not found");
            }
            folder.parentId = folder2.getId().longValue();
        }
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public Folder y(id.a aVar, long j10) {
        return (Folder) new Select().from(Folder.class).where("user_id = ? AND id = ?", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar)), Long.valueOf(j10)).executeSingle();
    }

    public List<Folder> z(id.a aVar, List<Long> list) {
        return new Select().from(Folder.class).where("user_id = ? AND id IN (" + TextUtils.join(",", list) + ")", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar))).execute();
    }
}
