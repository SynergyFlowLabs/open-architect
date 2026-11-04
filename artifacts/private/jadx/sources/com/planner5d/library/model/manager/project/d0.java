package com.planner5d.library.model.manager.project;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.m1;
import com.activeandroid.query.From;
import com.activeandroid.query.Select;
import com.activeandroid.util.SQLiteUtils;
import com.activeandroid.util.TransactionUtils;
import com.devtodev.core.data.consts.RequestParams;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemProjectScreenshot;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.o3;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.v1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes8.dex */
@ij.f
public class d0 implements x1, kb.b<Project>, com.planner5d.library.model.g.a<Project>, com.planner5d.library.contest.data.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.manager.synchronization.i> f193141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p0 f193142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.converter.json.to.o> f193143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.converter.json.from.q> f193144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.manager.c0> f193145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.model.manager.builtin.i f193146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final fg.e<t1> f193147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final kb.a<Project> f193148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final fg.e<com.planner5d.library.activity.helper.b0> f193149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final fg.e<com.planner5d.library.application.b> f193150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.manager.l> f193151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.planner5d.library.model.manager.project.c f193152n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final fg.e<com.planner5d.library.services.utility.w> f193153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final fg.e<m0> f193154p;

    class a extends com.planner5d.library.services.utility.w.c<Project> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.a f193155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f193156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f193157c;

        a(id.a aVar, Long l10, String str) {
            this.f193155a = aVar;
            this.f193156b = l10;
            this.f193157c = str;
        }

        @Override // com.planner5d.library.services.utility.w.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(Project project) {
            project.title = this.f193157c;
            d0.this.N0(this.f193155a, project).subscribe((Subscriber<? super Project>) new com.planner5d.library.services.rx.e());
        }

        @Override // com.planner5d.library.services.utility.w.c
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Project d() {
            return d0.this.Y(this.f193155a, this.f193156b.longValue());
        }
    }

    public enum b {
        Local(com.planner5d.library.f.s.X3),
        Remote(com.planner5d.library.f.s.Z3),
        LocalCopyRemote(com.planner5d.library.f.s.Y3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @f1
        public int f193163a;

        b(int i10) {
            this.f193163a = i10;
        }
    }

    public static class c extends JSONException {
        private c(String str) {
            super(str);
        }
    }

    public enum d {
        BY_TITLE,
        BY_DATE;

        static {
            int i10 = 7 << 0;
        }
    }

    @ij.a
    public d0(fg.e<com.planner5d.library.model.manager.synchronization.i> eVar, p0 p0Var, fg.e<com.planner5d.library.model.converter.json.to.o> eVar2, fg.e<com.planner5d.library.model.converter.json.from.q> eVar3, fg.e<com.planner5d.library.model.manager.c0> eVar4, com.planner5d.library.model.manager.builtin.i iVar, fg.e<t1> eVar5, fg.e<com.planner5d.library.activity.helper.b0> eVar6, fg.e<com.planner5d.library.application.b> eVar7, fg.e<com.planner5d.library.model.manager.l> eVar8, com.planner5d.library.model.manager.project.c cVar, fg.e<m0> eVar9, fg.e<com.planner5d.library.services.utility.w> eVar10) {
        this.f193141c = eVar;
        this.f193142d = p0Var;
        this.f193143e = eVar2;
        this.f193144f = eVar3;
        this.f193145g = eVar4;
        this.f193146h = iVar;
        this.f193147i = eVar5;
        this.f193149k = eVar6;
        this.f193150l = eVar7;
        this.f193151m = eVar8;
        this.f193152n = cVar;
        this.f193154p = eVar9;
        this.f193153o = eVar10;
        this.f193148j = new kb.a<>(p0Var, Project.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable A0(Folder folder, id.a aVar, Project project) {
        Long id2 = folder == null ? null : folder.getId();
        project.folderId = id2 == null ? 0L : id2.longValue();
        return N0(aVar, project);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object B0(id.a aVar, List list, long j10) throws Exception {
        List<Project> listW = W(aVar, list);
        if (listW == null) {
            return null;
        }
        for (Project project : listW) {
            project.folderId = j10;
            project.F(true);
            project.save();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void C0(boolean z10, long j10) throws Exception {
        List<Project> listExecute = new Select().from(Project.class).where("user_id = ?", 0L).execute();
        if (listExecute != null) {
            for (Project project : listExecute) {
                this.f193146h.p(project);
                if (project.modifiedLocally || !z10) {
                    project.F(true);
                    project.userId = j10;
                    project.save();
                } else {
                    O(project);
                }
            }
        }
        return null;
    }

    public static /* synthetic */ LogRecord D(JSONException jSONException, Long l10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("project_json_");
        sb2.append(jSONException instanceof c ? "oom" : "invalid");
        return new LogRecord(sb2.toString(), l10 == null ? AbstractJsonLexerKt.NULL : String.valueOf(l10), jSONException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable D0(id.a aVar, final Project project, Void r10) {
        return T(aVar, project.getId().longValue()).doOnNext(new Action1() { // from class: com.planner5d.library.model.manager.project.v
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                project.projectId = ((Project) obj).projectId;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(final Project project, final id.a aVar, Subscriber subscriber) {
        try {
            project.F(false);
            project.save();
            subscriber.onNext(project);
            subscriber.onCompleted();
            Observable<R> observableSwitchMap = this.f193141c.get().r(project).switchMap(new Func1() { // from class: com.planner5d.library.model.manager.project.g
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return this.f193185a.D0(aVar, project, (Void) obj);
                }
            });
            final v1.b bVar = com.planner5d.library.services.m0.f224430c;
            Objects.requireNonNull(bVar);
            observableSwitchMap.doOnTerminate(new Action0() { // from class: com.planner5d.library.model.manager.project.h
                @Override // rx.functions.Action0
                public final void call() {
                    bVar.t();
                }
            }).subscribe((Subscriber) new com.planner5d.library.services.rx.e());
        } catch (Throwable th2) {
            subscriber.onError(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(Project project, ItemProject itemProject, Subscriber subscriber) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.planner5d.library.services.r.projectName.f224891a, project.title);
            String str = project.uid;
            if (str != null) {
                jSONObject.put(com.planner5d.library.services.r.hash.f224891a, str);
            }
            jSONObject.put(com.planner5d.library.services.r.readOnly.f224891a, 0);
            jSONObject.put(com.planner5d.library.services.r.s.f224891a, 0);
            jSONObject.put(com.planner5d.library.services.r.data.f224891a, this.f193143e.get().h(itemProject, false));
            com.planner5d.library.activity.helper.b0 b0Var = this.f193149k.get();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("project_");
            Object id2 = project.uid;
            if (id2 == null) {
                id2 = project.getId();
            }
            sb2.append(id2);
            b0Var.m(sb2.toString(), "p5d", "application/javascript", jSONObject.toString().getBytes()).subscribe((Subscriber<? super String>) new com.planner5d.library.services.rx.e(subscriber));
        } catch (Exception unused) {
            subscriber.onError(new ErrorMessageException(com.planner5d.library.f.s.f169321oa, new String[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(ItemProject itemProject, Project project, id.a aVar, boolean z10, Subscriber subscriber) {
        try {
            byte[] bArrM0 = m0(itemProject);
            Project projectY = project.getId() == null ? project : Y(aVar, project.getId().longValue());
            if (projectY == null) {
                projectY = (Project) this.f193151m.get().j(new Project(project), project.getId().longValue());
                projectY.userId = com.planner5d.library.modules.user.user.x.a(aVar);
            }
            projectY.data = bArrM0;
            projectY.F(true);
            N0(aVar, projectY).delay(z10 ? 1L : 0L, TimeUnit.SECONDS).subscribe((Subscriber<? super Project>) new com.planner5d.library.services.rx.e(subscriber));
        } catch (JSONException e10) {
            final Long id2 = project.getId();
            this.f193147i.get().v(new ij.c() { // from class: com.planner5d.library.model.manager.project.o
                @Override // ij.c
                public final Object get() {
                    return d0.D(e10, id2);
                }
            });
            subscriber.onError(e10);
        }
    }

    private From M0(id.a aVar, Folder folder, d dVar, boolean z10) {
        From fromJ = this.f193145g.get().j(Project.class, folder, new Select("id", "deleted", "modified_locally", RequestParams.UID, "date_updated", "date_updated_locally", "folder", "modified_locally_data", "title", "contest_id", "contest_status", "uri_thumbnail", "project_id", "ai_recognized", "user_id").from(Project.class).where("user_id = " + com.planner5d.library.modules.user.user.x.a(aVar)).where("deleted != 1"));
        if (!z10) {
            fromJ.where("contest_id IS NULL");
        }
        return fromJ.orderBy(dVar == d.BY_DATE ? "(CASE WHEN modified_locally = 1 AND date_updated_locally IS NOT NULL THEN date_updated_locally ELSE date_updated END) DESC" : "title COLLATE NOCASE ASC");
    }

    @m1
    private long a0() {
        Project project = (Project) new Select().from(Project.class).orderBy("id DESC").limit(1).executeSingle();
        return (project == null ? 0L : project.getId().longValue()) + 1;
    }

    private Pair<Project, ItemProject> b0(JSONObject jSONObject) throws JSONException, IOException {
        if (jSONObject == null) {
            return null;
        }
        Project project = new Project();
        byte[] bytes = jSONObject.toString().getBytes();
        project.data = bytes;
        return new Pair<>(project, i0(bytes));
    }

    private ItemProject i0(@NonNull byte[] bArr) throws JSONException, IOException {
        return this.f193144f.get().b(this.f193142d.r(bArr), null);
    }

    private byte[] m0(ItemProject itemProject) throws JSONException {
        for (int i10 = 0; i10 < 20; i10++) {
            try {
                return this.f193143e.get().h(itemProject, false).toString().getBytes();
            } catch (OutOfMemoryError unused) {
                o3.c(500L);
            }
        }
        throw new c("Out of memory cannot convert project to JSON");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(byte[] bArr, Folder folder, String str, boolean z10, id.a aVar, Subscriber subscriber) {
        if (bArr == null) {
            subscriber.onError(new Exception("Project create error - empty data"));
            return;
        }
        Project project = new Project();
        project.data = bArr;
        project.folderId = (folder == null || folder.getId() == null) ? 0L : folder.getId().longValue();
        if (str == null) {
            str = this.f193150l.get().getString(com.planner5d.library.f.s.FF, String.valueOf(a0()));
        }
        project.title = str;
        project.F(true);
        if (z10) {
            N0(aVar, project).subscribe((Subscriber<? super Project>) new com.planner5d.library.services.rx.e(subscriber));
        } else {
            subscriber.onNext(project);
            subscriber.onCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void o0(long j10) throws Exception {
        com.planner5d.library.model.e[] eVarArrS = this.f193146h.S();
        for (int length = eVarArrS.length - 1; length >= 0; length--) {
            com.planner5d.library.model.e eVar = eVarArrS[length];
            Project project = new Project();
            project.title = eVar.c();
            project.data = eVar.a();
            project.dateUpdated = new Date();
            project.userId = j10;
            project.save();
            this.f193146h.D0(project, eVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable p0(id.a aVar, Folder folder, boolean z10, byte[] bArr) {
        return L(aVar, folder, z10, null, bArr);
    }

    public static /* synthetic */ Project q(Object[] objArr) {
        return (Project) new Select().from(Project.class).where("user_id = ? AND id = ? AND deleted != 1", objArr).executeSingle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q0(List list) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Project project = (Project) it.next();
            if (project.userId == 0) {
                this.f193146h.o(project);
                project.delete();
            } else {
                project.deleted = true;
                project.modifiedLocally = true;
                project.dateUpdatedLocally = new Date();
                project.save();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Project r0(Project project, Context context, id.a aVar) throws Throwable {
        Project project2 = new Project(project);
        project2.uid = null;
        project2.F(true);
        project2.title = context.getString(com.planner5d.library.f.s.f169100f5, project2.title);
        project2.contestId = null;
        project2.contestStatus = 0;
        project2.projectId = null;
        Project projectSingle = N0(aVar, project2).toBlocking().single();
        this.f193152n.c(context, project, projectSingle);
        return projectSingle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(id.a aVar, long j10, Subscriber subscriber) {
        subscriber.onNext(Y(aVar, j10));
        subscriber.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ItemProject v0(byte[] bArr) throws Exception {
        try {
            ItemProject itemProjectI0 = i0(bArr);
            if (itemProjectI0 != null) {
                return itemProjectI0;
            }
        } catch (Exception e10) {
            this.f193147i.get().u(new LogRecord("error_project_load_from_data", null, e10));
        }
        throw new ErrorMessageException(com.planner5d.library.f.s.D9, new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ItemProject w0(Project project) throws Exception {
        try {
            ItemProject itemProjectG0 = g0(project);
            if (itemProjectG0 != null) {
                return itemProjectG0;
            }
        } catch (Exception e10) {
            this.f193147i.get().u(new LogRecord("error_project_load", project.uid == null ? com.planner5d.library.model.payments.a.f222474i : project.uid, e10));
        }
        throw new ErrorMessageException(com.planner5d.library.f.s.D9, new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(ItemProject itemProject, Subscriber subscriber) {
        try {
            subscriber.onNext(m0(itemProject));
            subscriber.onCompleted();
        } catch (Throwable th2) {
            subscriber.onError(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(JSONObject jSONObject, Subscriber subscriber) {
        try {
            subscriber.onNext(b0(jSONObject));
            subscriber.onCompleted();
        } catch (IOException | JSONException unused) {
            subscriber.onError(new ErrorMessageException(com.planner5d.library.f.s.D9, new String[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(List list, Subscriber subscriber) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                Objects.toString(pair.second);
                map.put((String) pair.first, b0((JSONObject) pair.second));
            } catch (IOException | JSONException unused) {
                subscriber.onError(new ErrorMessageException(com.planner5d.library.f.s.D9, new String[0]));
                return;
            }
        }
        subscriber.onNext(map);
        subscriber.onCompleted();
    }

    public Observable<Pair<Project, ItemProject>> H0(final JSONObject jSONObject) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.project.j
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f193218a.y0(jSONObject, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    public Observable<Map<String, Pair<Project, ItemProject>>> I0(final List<Pair<String, JSONObject>> list) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.project.f
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f193170a.z0(list, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    public Observable<Project> J(id.a aVar, Project project, JSONObject jSONObject) throws JSONException, IOException {
        ItemProject itemProjectG0 = g0(project);
        ArrayList arrayList = new ArrayList(itemProjectG0.getScreenshots());
        Iterator<ItemProjectScreenshot> it = arrayList.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().getId());
        }
        ItemProjectScreenshot itemProjectScreenshotF = this.f193144f.get().f(jSONObject);
        itemProjectScreenshotF.setId(iMax + 1);
        arrayList.add(itemProjectScreenshotF);
        itemProjectG0.setScreenshots(arrayList);
        return Q0(aVar, project, itemProjectG0, false);
    }

    public Observable<Project> J0(final id.a aVar, long j10, final Folder folder) {
        return T(aVar, j10).flatMap(new Func1() { // from class: com.planner5d.library.model.manager.project.m
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f193238a.A0(folder, aVar, (Project) obj);
            }
        }).observeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    @m1
    public void K() {
        M(0L);
        com.planner5d.library.services.m0.f224430c.t();
    }

    public void K0(final id.a aVar, final List<Long> list, final long j10) {
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.project.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f193262a.B0(aVar, list, j10);
            }
        });
        this.f193141c.get().u();
        com.planner5d.library.services.m0.f224430c.t();
    }

    public Observable<Project> L(final id.a aVar, final Folder folder, final boolean z10, final String str, final byte[] bArr) {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.project.t
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f193276a.n0(bArr, folder, str, z10, aVar, (Subscriber) obj);
            }
        });
    }

    @m1
    public void L0(final long j10, final boolean z10) {
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.project.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f193282a.C0(z10, j10);
            }
        });
    }

    @m1
    public void M(final long j10) {
        try {
            if (!new Select().from(Project.class).where("user_id = ?", Long.valueOf(j10)).limit(1).execute().isEmpty()) {
                return;
            }
        } catch (SQLiteException e10) {
            this.f193147i.get().u(new LogRecord("error_projects_demo", "Could not select projects", e10));
        }
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.project.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f193125a.o0(j10);
            }
        });
    }

    public Observable<Project> N(final id.a aVar, final Folder folder, final boolean z10) {
        final com.planner5d.library.model.manager.builtin.i iVar = this.f193146h;
        Objects.requireNonNull(iVar);
        return com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.model.manager.project.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return iVar.a0();
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).flatMap(new Func1() { // from class: com.planner5d.library.model.manager.project.c0
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f193135a.p0(aVar, folder, z10, (byte[]) obj);
            }
        });
    }

    public Observable<Project> N0(final id.a aVar, final Project project) {
        project.userId = com.planner5d.library.modules.user.user.x.a(aVar);
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.project.q
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f193266a.E0(project, aVar, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224932b);
    }

    @m1
    public void O(Project project) {
        if (project.userId == 0) {
            this.f193146h.o(project);
            project.delete();
            return;
        }
        project.deleted = true;
        project.modifiedLocally = true;
        project.dateUpdatedLocally = new Date();
        project.save();
        com.planner5d.library.services.m0.f224430c.t();
        this.f193141c.get().u();
    }

    public Observable<File> O0(Context context, Project project, Bitmap bitmap) {
        return this.f193152n.j(context, project, bitmap);
    }

    public void P(final List<Project> list) {
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.project.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f193286a.q0(list);
            }
        });
        this.f193141c.get().u();
        com.planner5d.library.services.m0.f224430c.t();
    }

    public Observable<String> P0(@NonNull final Project project, @NonNull final ItemProject itemProject) {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.project.e
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f193167a.F0(project, itemProject, (Subscriber) obj);
            }
        });
    }

    public Observable<Project> Q(final id.a aVar, final Context context, long j10) {
        return T(aVar, j10).flatMap(new Func1() { // from class: com.planner5d.library.model.manager.project.k
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f193225a.s0(aVar, context, (Project) obj);
            }
        });
    }

    @m1
    public Observable<Project> Q0(final id.a aVar, final Project project, final ItemProject itemProject, final boolean z10) {
        if (project == null) {
            return Observable.error(new Exception("Project is null"));
        }
        if (itemProject == null) {
            return Observable.error(new Exception("ProjectItem is null"));
        }
        return com.planner5d.library.services.rx.a.c("setProjectData_" + project.getId(), Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.project.n
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f193251a.G0(itemProject, project, aVar, z10, (Subscriber) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public Observable<Project> s0(final id.a aVar, final Context context, final Project project) {
        return project == null ? Observable.error(new Exception("Cannot duplicate - no project supplied")) : this.f193153o.get().j(new com.planner5d.library.services.utility.w.a() { // from class: com.planner5d.library.model.manager.project.l
            @Override // com.planner5d.library.services.utility.w.a
            public final Object run() {
                return this.f193231a.r0(project, context, aVar);
            }
        });
    }

    @m1
    public void R0(String str, String str2, id.a aVar) {
        this.f193152n.l(str, str2, aVar);
    }

    @Override // kb.b
    @m1
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void d(@NonNull id.a aVar, @NonNull Project project, @NonNull JSONObject jSONObject) throws JSONException {
        Folder folderA;
        this.f193148j.d(project, jSONObject);
        project.title = jSONObject.getString(com.planner5d.library.services.r.projectName.f224891a);
        project.dateUpdated = this.f193142d.g(jSONObject.getString(com.planner5d.library.services.r.udate.f224891a));
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.data;
        project.data = jSONObject.has(rVar.f224891a) ? jSONObject.getString(rVar.f224891a).getBytes() : null;
        long j10 = jSONObject.getLong(com.planner5d.library.services.r.folder.f224891a);
        if (j10 > 0 && (folderA = this.f193145g.get().A(aVar, j10)) != null) {
            project.folderId = folderA.getId().longValue();
        }
        project.contestId = k1.v(jSONObject, com.planner5d.library.services.r.contestId);
        project.contestStatus = k1.m(jSONObject, com.planner5d.library.services.r.contestStatus, com.planner5d.library.database.model.project.a.Unknown.f154201a);
        project.projectId = k1.v(jSONObject, com.planner5d.library.services.r.id);
        project.aiRecognized = Boolean.valueOf(k1.a(jSONObject, com.planner5d.library.services.r.aiRecognized));
    }

    public void S0(id.a aVar, Long l10, String str) {
        this.f193153o.get().f(new a(aVar, l10, str));
    }

    public Observable<Project> T(final id.a aVar, final long j10) {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.project.i
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f193210a.t0(aVar, j10, (Subscriber) obj);
            }
        });
    }

    @Override // kb.b
    @m1
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public void c(@NotNull Project project, @NotNull Project project2) {
        this.f193154p.get().s(project, project2);
    }

    public Observable<List<Project>> U(final id.a aVar, final Folder folder, final d dVar, final boolean z10) {
        return this.f193153o.get().j(new com.planner5d.library.services.utility.w.a() { // from class: com.planner5d.library.model.manager.project.s
            @Override // com.planner5d.library.services.utility.w.a
            public final Object run() {
                return this.f193271a.u0(aVar, folder, dVar, z10);
            }
        });
    }

    @Override // kb.b
    @NonNull
    @m1
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public JSONObject w(@NonNull id.a aVar, @NonNull Project project) throws JSONException {
        JSONObject jSONObjectI = this.f193148j.i(project);
        jSONObjectI.put(com.planner5d.library.services.r.projectName.f224891a, project.title);
        if (project.modifiedLocallyData) {
            String str = com.planner5d.library.services.r.data.f224891a;
            byte[] bArr = project.data;
            jSONObjectI.put(str, bArr == null ? null : new String(bArr));
        }
        if (project.folderId > 0) {
            Folder folderY = this.f193145g.get().y(aVar, project.folderId);
            jSONObjectI.put(com.planner5d.library.services.r.folder.f224891a, folderY == null ? 0 : folderY.uid);
        }
        return jSONObjectI;
    }

    @NonNull
    @m1
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public List<Project> u0(id.a aVar, Folder folder, d dVar, boolean z10) {
        this.f193145g.get().m(Project.class);
        List<Project> listExecute = M0(aVar, folder, dVar, z10).execute();
        for (Project project : listExecute) {
            project.f154194a = this.f193154p.get().m(project);
        }
        return listExecute;
    }

    @Override // kb.b
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public void p(@NonNull Project project, @NonNull JSONObject jSONObject) throws JSONException {
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.id;
        if (jSONObject.has(rVar.f224891a)) {
            project.projectId = Long.valueOf(jSONObject.getLong(rVar.f224891a));
        }
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.aiRecognized;
        if (jSONObject.has(rVar2.f224891a)) {
            project.aiRecognized = Boolean.valueOf(jSONObject.getBoolean(rVar2.f224891a));
        }
    }

    public List<Project> W(id.a aVar, List<Long> list) {
        return new Select().from(Project.class).where("user_id = ? AND id IN (" + TextUtils.join(",", list) + ")", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar))).execute();
    }

    public void W0(JSONObject jSONObject) throws JSONException {
        this.f193144f.get().b(jSONObject, null);
    }

    @m1
    public List<Project> X(id.a aVar, List<String> list) {
        return new Select("id", RequestParams.UID, "title").from(Project.class).where("user_id = ? AND uid IN (" + TextUtils.join(",", list) + ")", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar))).execute();
    }

    @m1
    @Nullable
    public Project Y(id.a aVar, long j10) {
        final Object[] objArr = {Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar)), String.valueOf(j10)};
        Project project = (Project) new Select().from(Project.class).where("user_id = ? AND id = ? AND deleted != 1", objArr).executeSingle();
        if (project != null || (project = (Project) new Select("id").from(Project.class).where("user_id = ? AND id = ? AND deleted != 1", objArr).executeSingle()) == null) {
            return project;
        }
        try {
            return (Project) h3.d(new Callable() { // from class: com.planner5d.library.model.manager.project.x
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return d0.q(objArr);
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    @m1
    public Project Z(long j10) {
        return (Project) new Select("id", "deleted", "modified_locally", RequestParams.UID, "date_updated", "date_updated_locally", "folder", "modified_locally_data", "title", "user_id").from(Project.class).where("id = ?", Long.valueOf(j10)).executeSingle();
    }

    @Override // com.planner5d.library.model.g.a
    @m1
    @NotNull
    public com.planner5d.library.model.g<Project> a(@Nullable id.a aVar, @NotNull Folder folder, boolean z10) {
        From fromM0 = M0(aVar, folder, d.BY_DATE, z10);
        int iIntQuery = SQLiteUtils.intQuery(fromM0.toCountSql(), new String[0]);
        List listExecute = fromM0.limit(2).execute();
        if (listExecute == null) {
            listExecute = new LinkedList();
        }
        return new com.planner5d.library.model.g<>(folder, iIntQuery, listExecute);
    }

    @Override // com.planner5d.library.contest.data.k
    @m1
    public Project b(id.a aVar, @NotNull Contest contest) {
        return (Project) new Select().from(Project.class).where("user_id = ?", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar))).where("deleted = 0").where("contest_id = ?", contest.uid).executeSingle();
    }

    @m1
    public com.planner5d.library.services.bitmaploader.d.C1663d c0(Context context, @NonNull Project project, int i10, com.planner5d.library.services.bitmaploader.target.a aVar) {
        return this.f193152n.g(context, project, i10, aVar);
    }

    public com.planner5d.library.services.bitmaploader.d.C1663d d0(@NonNull Project project, int i10, com.planner5d.library.services.bitmaploader.target.a aVar) {
        return this.f193152n.i(project, i10, aVar);
    }

    public Observable<ItemProject> e0(@NonNull final Project project) {
        return com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.model.manager.project.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f193289a.w0(project);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    @Override // com.planner5d.library.contest.data.k
    @m1
    public Project f(long j10, @NotNull String str) {
        return (Project) new Select().from(Project.class).where("uid = ?", str).where("user_id = ?", Long.valueOf(j10)).executeSingle();
    }

    public Observable<ItemProject> f0(@NonNull final byte[] bArr) {
        return com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.model.manager.project.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f193269a.v0(bArr);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    public ItemProject g0(@NonNull Project project) throws JSONException, IOException {
        return i0(project.data);
    }

    @m1
    public ItemProject h0(id.a aVar, long j10) throws JSONException, IOException {
        return g0(Y(aVar, j10));
    }

    public String j0(Project project) {
        return com.planner5d.library.api.f.a().f142272j + this.f193150l.get().getString(com.planner5d.library.f.s.hu) + "/view?key=" + project.uid;
    }

    @Override // kb.b
    @NonNull
    @m1
    public List<Project> k(@NonNull id.a aVar) {
        List<T> listC = this.f193148j.c(aVar);
        LinkedList linkedList = new LinkedList();
        for (T t10 : listC) {
            if (!this.f193154p.get().m(t10)) {
                linkedList.add(t10);
            }
        }
        return linkedList;
    }

    @m1
    public byte[] k0() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
            try {
                List<Project> listExecute = new Select().from(Project.class).execute();
                if (listExecute != null) {
                    for (Project project : listExecute) {
                        zipOutputStream.putNextEntry(new ZipEntry(project.getId() + "_" + project.userId + ".p5d"));
                        zipOutputStream.write(project.data);
                    }
                }
                zipOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    zipOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Override // kb.b
    @m1
    public void l(@NonNull id.a aVar, @NonNull JSONObject jSONObject) {
        this.f193148j.g(aVar, jSONObject, this);
    }

    public Observable<byte[]> l0(final ItemProject itemProject) {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.project.z
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f193291a.x0(itemProject, (Subscriber) obj);
            }
        });
    }
}
