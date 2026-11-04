package com.planner5d.library.model.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.activeandroid.query.Delete;
import com.activeandroid.query.From;
import com.activeandroid.query.Select;
import com.activeandroid.util.TransactionUtils;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.compareplans.ComparePlansFragment;
import com.planner5d.library.database.model.SynchronizedModel;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemProjectScreenshot;
import com.planner5d.library.model.snapshot.Snapshot;
import com.planner5d.library.model.snapshot.SnapshotLocal;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
@Deprecated(since = "Move these methods to SnapshotManagerKotlin, rename SnapshotManagerKotlin to SnapshotManager")
public class b4 implements x1, kb.b<Snapshot> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f180898w = 75.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f180899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y0 f180900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.manager.project.d0> f180901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.services.utility.p0 f180902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.model.converter.json.to.o f180903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final kb.a<Snapshot> f180904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.manager.synchronization.i> f180905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.planner5d.library.application.d f180906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final fg.e<com.planner5d.library.activity.helper.b0> f180907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final fg.e<com.planner5d.library.modules.user.user.t> f180908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.planner5d.library.application.b f180909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fg.e<b2> f180910n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.planner5d.library.api.requests.c f180911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ErrorMessageParser f180912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.planner5d.library.activity.fragment.x f180913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.manager.config.j> f180914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final fg.e<d4> f180915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.planner5d.library.services.utility.c2 f180916t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile boolean f180917u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Object f180918v = new Object();

    class a extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Subscriber f180919h;

        a(Subscriber subscriber) {
            this.f180919h = subscriber;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        public void g(Throwable th2) {
            this.f180919h.onError(new Exception("Could not save image"));
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        public void h(Bitmap bitmap) {
            this.f180919h.onNext(this);
            this.f180919h.onCompleted();
        }
    }

    class b extends com.planner5d.library.services.bitmaploader.target.a {
        b() {
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        public void h(Bitmap bitmap) {
        }
    }

    class c extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber f180922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Project f180923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ id.a f180924f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Bitmap f180925g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ vd.a f180926h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f180927i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ gd.a f180928j;

        c(Subscriber subscriber, Project project, id.a aVar, Bitmap bitmap, vd.a aVar2, boolean z10, gd.a aVar3) {
            this.f180922d = subscriber;
            this.f180923e = project;
            this.f180924f = aVar;
            this.f180925g = bitmap;
            this.f180926h = aVar2;
            this.f180927i = z10;
            this.f180928j = aVar3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(id.a aVar, Project project, Bitmap bitmap, vd.a aVar2, boolean z10, Subscriber subscriber, gd.a aVar3) {
            b4.this.L(aVar, project, bitmap, aVar2, z10, subscriber, aVar3);
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            this.f180922d.onError(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r11) {
            final Project project = this.f180923e;
            if (project.uid == null) {
                this.f180922d.onError(new ErrorMessageException(com.planner5d.library.f.s.I9, "#MU"));
                return;
            }
            final id.a aVar = this.f180924f;
            final Bitmap bitmap = this.f180925g;
            final vd.a aVar2 = this.f180926h;
            final boolean z10 = this.f180927i;
            final Subscriber subscriber = this.f180922d;
            final gd.a aVar3 = this.f180928j;
            com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.model.manager.c4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181408a.e(aVar, project, bitmap, aVar2, z10, subscriber, aVar3);
                }
            }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
        }
    }

    class d extends com.planner5d.library.services.rx.e<id.a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.modules.user.user.t0 f180930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ vd.b f180931e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Subscriber f180932f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ id.a f180933g;

        d(com.planner5d.library.modules.user.user.t0 t0Var, vd.b bVar, Subscriber subscriber, id.a aVar) {
            this.f180930d = t0Var;
            this.f180931e = bVar;
            this.f180932f = subscriber;
            this.f180933g = aVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            throw new RuntimeException(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(id.a aVar) {
            if (b4.I(this.f180930d, aVar, this.f180931e)) {
                this.f180932f.onNext(null);
            } else {
                if (this.f180933g == null || b4.this.f180906j.b() != com.planner5d.library.model.payments.paymentmethod.e.a.None) {
                    b4.this.m0(this.f180931e == vd.b.PRO4K);
                } else {
                    ((b2) b4.this.f180910n.get()).r(new ErrorMessageException(com.planner5d.library.f.s.f169538xa, new String[0]));
                }
            }
            this.f180932f.onCompleted();
        }
    }

    @ij.a
    public b4(c0 c0Var, y0 y0Var, fg.e<com.planner5d.library.model.manager.project.d0> eVar, com.planner5d.library.services.utility.p0 p0Var, com.planner5d.library.model.converter.json.to.o oVar, fg.e<com.planner5d.library.model.manager.synchronization.i> eVar2, fg.e<com.planner5d.library.activity.helper.b0> eVar3, com.planner5d.library.application.b bVar, com.planner5d.library.application.d dVar, fg.e<com.planner5d.library.modules.user.user.t> eVar4, fg.e<b2> eVar5, com.planner5d.library.api.requests.c cVar, ErrorMessageParser errorMessageParser, com.planner5d.library.activity.fragment.x xVar, fg.e<com.planner5d.library.model.manager.config.j> eVar6, fg.e<d4> eVar7, com.planner5d.library.services.utility.c2 c2Var) {
        this.f180905i = eVar2;
        this.f180899c = c0Var;
        this.f180900d = y0Var;
        this.f180901e = eVar;
        this.f180902f = p0Var;
        this.f180903g = oVar;
        this.f180907k = eVar3;
        this.f180909m = bVar;
        this.f180906j = dVar;
        this.f180908l = eVar4;
        this.f180910n = eVar5;
        this.f180911o = cVar;
        this.f180912p = errorMessageParser;
        this.f180913q = xVar;
        this.f180914r = eVar6;
        this.f180915s = eVar7;
        this.f180916t = c2Var;
        this.f180904h = new kb.a<>(p0Var, Snapshot.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(final vd.b bVar, id.a aVar, final Snapshot snapshot, Subscriber subscriber) {
        try {
            final JSONObject jSONObject = new JSONObject();
            vd.b bVar2 = vd.b.PRO4K;
            if (bVar == bVar2) {
                jSONObject.put(com.planner5d.library.services.r.width.f224891a, bVar2.f385731b);
                jSONObject.put(com.planner5d.library.services.r.height.f224891a, bVar2.f385732c);
            }
            com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) this.f180911o.j(aVar, new Function2() { // from class: com.planner5d.library.model.manager.e3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return this.f191297a.B0(snapshot, bVar, jSONObject, (com.planner5d.library.api.b) obj, (id.a) obj2);
                }
            });
            if (!cVar.h() && cVar.a().getInt(com.planner5d.library.services.r.access.f224891a) == 1) {
                P0(aVar, new String[]{snapshot.uid});
                subscriber.onNext((Snapshot) S(aVar, snapshot));
                subscriber.onCompleted();
                this.f180915s.get().j();
                return;
            }
            subscriber.onError(new ErrorMessageException(com.planner5d.library.f.s.U9, new String[0]));
        } catch (com.planner5d.library.api.e | JSONException e10) {
            subscriber.onError(this.f180912p.parse(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.planner5d.library.api.c B0(Snapshot snapshot, vd.b bVar, JSONObject jSONObject, com.planner5d.library.api.b bVar2, id.a aVar) {
        return bVar2.y0(aVar, snapshot.taskId, l0(bVar), com.planner5d.library.api.f.a().f142267e, this.f180909m.getPackageName(), com.planner5d.library.services.utility.h3.j(this.f180909m), jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(id.a aVar, Subscriber subscriber) {
        synchronized (this.f180918v) {
            try {
                this.f180917u = true;
                try {
                    try {
                        O(aVar);
                        V0(aVar);
                        P(aVar);
                        this.f180917u = false;
                        e = null;
                    } catch (com.planner5d.library.api.e | JSONException e10) {
                        e = e10;
                        this.f180917u = false;
                    }
                } catch (Throwable th2) {
                    this.f180917u = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        com.planner5d.library.services.m0.f224431d.t();
        if (e != null) {
            subscriber.onError(e);
        } else {
            subscriber.onNext(null);
            subscriber.onCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean I(com.planner5d.library.modules.user.user.t0 t0Var, id.a aVar, vd.b bVar) {
        if (!bVar.equals(vd.b.DRAFT) && !bVar.equals(vd.b.HD)) {
            if (bVar.equals(vd.b.PRO4K)) {
                return aVar != null && aVar.g();
            }
            return bVar.equals(vd.b.NO_RENDER);
        }
        return t0Var.M(aVar);
    }

    @NonNull
    @androidx.annotation.m1
    private JSONObject I0(Project project, Bitmap bitmap, vd.a aVar, gd.a aVar2) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ItemProject itemProjectG0 = this.f180901e.get().g0(project);
        int iE0 = e0(itemProjectG0.getScreenshots());
        td.a.f380845a.o(bitmap, 640, 480, td.a.b.CenterFit).compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        jSONObject2.put(com.planner5d.library.services.r.project.f224891a, this.f180903g.h(itemProjectG0, true));
        jSONObject2.put(com.planner5d.library.services.r.camera.f224891a, jSONObject3);
        com.planner5d.library.math.m mVarA = aVar.a();
        com.planner5d.library.math.m mVarB = aVar.b();
        jSONObject3.put(com.planner5d.library.services.r.from.f224891a, new JSONArray((Collection) Arrays.asList(Float.valueOf(mVarA.f180482a), Float.valueOf(mVarA.f180483b), Float.valueOf(mVarA.f180484c))));
        jSONObject3.put(com.planner5d.library.services.r.to.f224891a, new JSONArray((Collection) Arrays.asList(Float.valueOf(mVarB.f180482a), Float.valueOf(mVarB.f180483b), Float.valueOf(mVarB.f180484c))));
        jSONObject3.put(com.planner5d.library.services.r.nearclip.f224891a, aVar.f385724c);
        jSONObject.put(com.planner5d.library.services.r.data.f224891a, "data:image/png;base64," + new String(Base64.encode(byteArrayOutputStream.toByteArray(), 0)));
        jSONObject2.put(com.planner5d.library.services.r.night.f224891a, aVar2.f275443b);
        jSONObject2.put(com.planner5d.library.services.r.lightCeiling.f224891a, aVar2.f275444c);
        jSONObject.put(com.planner5d.library.services.r.renderData.f224891a, jSONObject2.toString());
        jSONObject.put(com.planner5d.library.services.r.number.f224891a, iE0);
        return jSONObject;
    }

    @androidx.annotation.m1
    private <T extends SynchronizedModel> From J0(Class<T> cls, Long l10) {
        String str;
        From from = new Select().from(cls);
        StringBuilder sb2 = new StringBuilder();
        if (l10 == null) {
            str = "";
        } else {
            str = "user_id = " + l10 + " AND ";
        }
        sb2.append(str);
        sb2.append("deleted != 1");
        return from.where(sb2.toString()).orderBy("date_created DESC");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable<String> K0(final com.planner5d.library.services.bitmaploader.target.a aVar) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.v3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f222353a.y0(aVar, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c);
    }

    @androidx.annotation.m1
    private void O(final id.a aVar) throws IllegalStateException, JSONException, com.planner5d.library.api.e {
        if (aVar != null) {
            com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) this.f180911o.j(aVar, new Function2() { // from class: com.planner5d.library.model.manager.r3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((com.planner5d.library.api.b) obj).P((id.a) obj2, aVar.f287075a);
                }
            });
            if (!cVar.h()) {
                JSONArray jSONArray = cVar.a().getJSONArray(com.planner5d.library.services.r.items.f224891a);
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add("'" + jSONArray.getJSONObject(i10).getString(com.planner5d.library.services.r.id.f224891a) + "'");
                }
                if (!arrayList.isEmpty()) {
                    new Delete().from(Snapshot.class).where("user_id = ? AND uid IN (" + TextUtils.join(",", arrayList) + ")", Long.valueOf(aVar.f287075a)).execute();
                }
            }
            for (final Snapshot snapshot : new Select().from(Snapshot.class).where("user_id = ? AND deleted = 1", Long.valueOf(aVar.f287075a)).execute()) {
                if (!((com.planner5d.library.api.c) this.f180911o.j(aVar, new Function2() { // from class: com.planner5d.library.model.manager.s3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((com.planner5d.library.api.b) obj).u0((id.a) obj2, Long.parseLong(snapshot.uid));
                    }
                })).h()) {
                    snapshot.delete();
                }
            }
        }
    }

    @androidx.annotation.m1
    private void P(final id.a aVar) throws IllegalStateException, JSONException, com.planner5d.library.api.e {
        if (aVar == null) {
            return;
        }
        final int i10 = 1;
        Long lValueOf = null;
        while (true) {
            if (lValueOf != null && i10 > lValueOf.longValue()) {
                return;
            }
            com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) this.f180911o.j(aVar, new Function2() { // from class: com.planner5d.library.model.manager.l3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((com.planner5d.library.api.b) obj).c0((id.a) obj2, aVar.f287075a, i10);
                }
            });
            if (lValueOf == null) {
                lValueOf = Long.valueOf(cVar.a().getLong(com.planner5d.library.services.r.pages.f224891a));
            }
            this.f180904h.f(aVar, cVar.a().getJSONArray(com.planner5d.library.services.r.items.f224891a), this);
            i10++;
        }
    }

    @androidx.annotation.m1
    private void P0(final id.a aVar, final String[] strArr) throws IllegalStateException, JSONException, com.planner5d.library.api.e {
        if (aVar != null) {
            com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) this.f180911o.j(aVar, new Function2() { // from class: com.planner5d.library.model.manager.u3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((com.planner5d.library.api.b) obj).E0((id.a) obj2, aVar.f287075a, TextUtils.join("|", strArr));
                }
            });
            if (cVar.h()) {
                return;
            }
            this.f180904h.f(aVar, cVar.a().getJSONArray(com.planner5d.library.services.r.items.f224891a), this);
        }
    }

    private void S0(id.a aVar, Bitmap bitmap, vd.a aVar2, boolean z10, gd.a aVar3, Subscriber<? super Snapshot> subscriber, Project project) {
        this.f180905i.get().r(project).subscribe((Subscriber<? super Void>) new c(subscriber, project, aVar, bitmap, aVar2, z10, aVar3));
    }

    @androidx.annotation.m1
    private void V0(id.a aVar) throws IllegalStateException, JSONException, com.planner5d.library.api.e {
        Folder folderY;
        if (aVar == null) {
            return;
        }
        for (final Snapshot snapshot : new Select().from(Snapshot.class).where("user_id = ? AND folder_changed = 1 AND deleted != 1 AND uid IS NOT NULL", Long.valueOf(aVar.f287075a)).execute()) {
            long j10 = snapshot.folderId;
            if (j10 > 0) {
                folderY = this.f180899c.y(aVar, j10);
                if (folderY == null || folderY.uid == null) {
                }
            } else {
                folderY = null;
            }
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.planner5d.library.services.r.folder.f224891a, folderY == null ? com.facebook.appevents.p.f99189d0 : folderY.uid);
            if (!((com.planner5d.library.api.c) this.f180911o.j(aVar, new Function2() { // from class: com.planner5d.library.model.manager.q3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((com.planner5d.library.api.b) obj).p0((id.a) obj2, Long.parseLong(snapshot.uid), jSONObject);
                }
            })).h()) {
                snapshot.folderChanged = false;
                snapshot.save();
            }
        }
    }

    @androidx.annotation.m1
    private List<Snapshot> Y(id.a aVar) {
        return new Select().from(Snapshot.class).where("user_id = ? AND deleted != 1 AND status IN (2, 3)", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar))).execute();
    }

    @androidx.annotation.m1
    private <T extends SynchronizedModel> List<T> Z(Class<T> cls, Long l10, Folder folder) {
        this.f180899c.m(cls);
        return this.f180899c.j(cls, folder, J0(cls, l10)).execute();
    }

    @androidx.annotation.m1
    private List<Snapshot> a0(id.a aVar, Folder folder) {
        List<Snapshot> listZ = Z(Snapshot.class, Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar)), folder);
        ArrayList arrayList = new ArrayList();
        for (Snapshot snapshot : listZ) {
            String str = snapshot.projectUid;
            if (str != null && !arrayList.contains(str)) {
                arrayList.add(snapshot.projectUid);
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.set(i10, "'" + ((String) arrayList.get(i10)) + "'");
        }
        List<Project> listX = this.f180901e.get().X(aVar, arrayList);
        HashMap map = new HashMap();
        for (Project project : listX) {
            map.put(project.uid, project);
        }
        for (Snapshot snapshot2 : listZ) {
            if (map.containsKey(snapshot2.projectUid)) {
                snapshot2.f222810a = (Project) map.get(snapshot2.projectUid);
            }
        }
        return listZ;
    }

    @androidx.annotation.m1
    private List<Snapshot> b0(Long l10) {
        this.f180899c.m(Snapshot.class);
        return J0(Snapshot.class, l10).execute();
    }

    @androidx.annotation.m1
    private List<SnapshotLocal> c0(Folder folder) {
        return Z(SnapshotLocal.class, null, folder);
    }

    @androidx.annotation.m1
    private File d0(Context context) {
        return com.planner5d.library.services.w.f229889a.a(context, "snapshots_local");
    }

    private int e0(List<ItemProjectScreenshot> list) {
        Iterator<ItemProjectScreenshot> it = list.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(it.next().getId(), iMax);
        }
        return iMax + 1;
    }

    private int k0(String str) {
        str.getClass();
        switch (str) {
            case "inprogress":
                return 3;
            case "stored":
                return 1;
            case "finished":
                return 4;
            case "error":
                return 5;
            case "ready":
                return 2;
            default:
                return 0;
        }
    }

    private int l0(vd.b bVar) {
        return bVar.equals(vd.b.DRAFT) ? 0 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(id.a aVar, long j10, Bitmap bitmap, vd.a aVar2, boolean z10, gd.a aVar3, Subscriber subscriber) {
        Project projectY = this.f180901e.get().Y(aVar, j10);
        if (projectY == null || projectY.uid == null) {
            S0(aVar, bitmap, aVar2, z10, aVar3, subscriber, projectY);
        } else {
            L(aVar, projectY, bitmap, aVar2, z10, subscriber, aVar3);
        }
    }

    public static /* synthetic */ int r(gd.b bVar, gd.b bVar2) {
        return (int) Math.min(Math.max((bVar2.p() != null ? bVar2.p().getTime() : 0L) - (bVar.p() == null ? 0L : bVar.p().getTime()), -1L), 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(gd.b bVar, Context context, id.a aVar, final Subscriber subscriber) {
        if (bVar instanceof Snapshot) {
            Snapshot snapshot = (Snapshot) bVar;
            snapshot.deleted = true;
            snapshot.save();
        } else if (bVar instanceof SnapshotLocal) {
            SnapshotLocal snapshotLocal = (SnapshotLocal) bVar;
            File fileJ0 = j0(context, snapshotLocal);
            snapshotLocal.delete();
            if (fileJ0 != null && fileJ0.isFile()) {
                fileJ0.delete();
            }
        }
        Observable<Void> observableR0 = R0(aVar);
        Objects.requireNonNull(subscriber);
        observableR0.doOnTerminate(new Action0() { // from class: com.planner5d.library.model.manager.p3
            @Override // rx.functions.Action0
            public final void call() {
                subscriber.onCompleted();
            }
        }).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s0(id.a aVar, List list, Map map) throws Exception {
        File file;
        for (SynchronizedModel synchronizedModel : T(aVar, list)) {
            if (synchronizedModel instanceof Snapshot) {
                synchronizedModel.deleted = true;
                synchronizedModel.save();
            } else if (synchronizedModel instanceof SnapshotLocal) {
                synchronizedModel.delete();
                if (!map.isEmpty() && map.containsKey(synchronizedModel.getId()) && (file = (File) map.get(synchronizedModel.getId())) != null && file.isFile()) {
                    file.delete();
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List t0(id.a aVar) throws Exception {
        List<Snapshot> listY = Y(aVar);
        String[] strArr = new String[listY.size()];
        for (int i10 = 0; i10 < listY.size(); i10++) {
            strArr[i10] = listY.get(i10).uid;
        }
        try {
            P0(aVar, strArr);
        } catch (com.planner5d.library.api.e | JSONException unused) {
        }
        return Y(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(com.planner5d.library.modules.user.user.t0 t0Var, id.a aVar, vd.b bVar, Subscriber subscriber) {
        if (this.f180906j.t()) {
            subscriber.onError(new Exception("On server snapshots are disabled on this app"));
            return;
        }
        if (I(t0Var, aVar, bVar)) {
            subscriber.onNext(null);
            subscriber.onCompleted();
        } else {
            Boolean bool = Boolean.TRUE;
            Objects.requireNonNull(t0Var);
            com.planner5d.library.services.utility.c0.u(aVar, bool, new com.planner5d.library.activity.helper.e1(t0Var)).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber) new d(t0Var, bVar, subscriber, aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(String str, id.a aVar, Snapshot snapshot, Subscriber subscriber) {
        try {
            final JSONObject jSONObjectPut = new JSONObject().put(com.planner5d.library.services.r.screenshotId.f224891a, Long.parseLong(str));
            Long lV = com.planner5d.library.services.utility.k1.v(((com.planner5d.library.api.c) this.f180911o.j(aVar, new Function2() { // from class: com.planner5d.library.model.manager.n3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((com.planner5d.library.api.b) obj).x0((id.a) obj2, jSONObjectPut);
                }
            })).a(), com.planner5d.library.services.r.id);
            if (lV != null) {
                P0(aVar, new String[]{lV.toString()});
            }
            subscriber.onNext((Snapshot) S(aVar, snapshot));
            subscriber.onCompleted();
            com.planner5d.library.model.manager.statistics.events.u2.D1(com.planner5d.library.model.manager.statistics.events.b4.a.ai_render_improvement_started, null, snapshot.projectId, null, snapshot);
            this.f180915s.get().j();
        } catch (com.planner5d.library.api.e | NumberFormatException | JSONException e10) {
            subscriber.onError(this.f180912p.parse(e10, Integer.valueOf(com.planner5d.library.f.s.Z8)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gd.b w0(id.a aVar, long j10, String str, Folder folder) throws Exception {
        SynchronizedModel synchronizedModelR = R(aVar, j10, Snapshot.class.getName().equals(str) ? Snapshot.class : SnapshotLocal.class);
        Long id2 = folder == null ? null : folder.getId();
        ((gd.b) synchronizedModelR).f(id2 == null ? 0L : id2.longValue());
        synchronizedModelR.save();
        R0(aVar).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
        return (gd.b) synchronizedModelR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Object x0(id.a aVar, List list, List list2, long j10) throws Exception {
        for (SynchronizedModel synchronizedModel : V(aVar, list, list2)) {
            ((gd.b) synchronizedModel).f(j10);
            synchronizedModel.save();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(com.planner5d.library.services.bitmaploader.target.a aVar, Subscriber subscriber) {
        Bitmap bitmapC = aVar.c();
        if (bitmapC == null) {
            subscriber.onError(new ErrorMessageException(com.planner5d.library.f.s.Va, new String[0]));
            aVar.dispose();
            return;
        }
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapC.compress(Bitmap.CompressFormat.PNG, 96, byteArrayOutputStream);
                long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                this.f180907k.get().m("snapshot_" + seconds, "png", androidx.media3.common.s0.X0, byteArrayOutputStream.toByteArray()).subscribe((Subscriber<? super String>) new com.planner5d.library.services.rx.e(subscriber));
                aVar.dispose();
            } catch (Throwable unused) {
                subscriber.onError(new ErrorMessageException(com.planner5d.library.f.s.Va, new String[0]));
            }
        } finally {
            aVar.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(Context context, gd.b bVar, Subscriber subscriber) {
        D0(context, bVar, 0, new a(subscriber), null);
    }

    @androidx.annotation.m1
    public com.planner5d.library.services.bitmaploader.d.C1663d D0(Context context, gd.b bVar, int i10, com.planner5d.library.services.bitmaploader.target.a aVar, com.planner5d.library.services.bitmaploader.background.postprocess.a aVar2) {
        return E0(h0(context, bVar), i10, aVar, aVar2);
    }

    @androidx.annotation.p0
    public com.planner5d.library.services.bitmaploader.d.C1663d E0(@androidx.annotation.p0 com.planner5d.library.services.bitmaploader.d.c cVar, int i10, com.planner5d.library.services.bitmaploader.target.a aVar, com.planner5d.library.services.bitmaploader.background.postprocess.a aVar2) {
        if (cVar != null) {
            return this.f180900d.a(cVar.d(), cVar.c(), i10, i10, aVar, 1L, aVar2);
        }
        aVar.j(null, null);
        return null;
    }

    public Observable<gd.b> F0(final id.a aVar, final long j10, final String str, final Folder folder) {
        return com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.model.manager.t3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f222238a.w0(aVar, j10, str, folder);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    public Observable<gd.b> G0(id.a aVar, gd.b bVar, Folder folder) {
        return F0(aVar, bVar.getId().longValue(), bVar.getClass().getName(), folder);
    }

    public void H0(final id.a aVar, final List<Long> list, final List<Long> list2, final long j10) {
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.h3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f191497a.x0(aVar, list, list2, j10);
            }
        });
        this.f180905i.get().u();
        com.planner5d.library.services.m0.f224431d.t();
    }

    public boolean J() {
        return this.f180906j.g() && !this.f180906j.t();
    }

    public Observable<Snapshot> K(final id.a aVar, final long j10, final Bitmap bitmap, final vd.a aVar2, final boolean z10, final gd.a aVar3) {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.m3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f191883a.q0(aVar, j10, bitmap, aVar2, z10, aVar3, (Subscriber) obj);
            }
        });
    }

    @androidx.annotation.m1
    public void L(id.a aVar, final Project project, Bitmap bitmap, vd.a aVar2, boolean z10, Subscriber<? super Snapshot> subscriber, gd.a aVar3) {
        try {
            final JSONObject jSONObjectI0 = I0(project, bitmap, aVar2, aVar3);
            com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) this.f180911o.j(aVar, new Function2() { // from class: com.planner5d.library.model.manager.z3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((com.planner5d.library.api.b) obj).D((id.a) obj2, project.uid, jSONObjectI0);
                }
            });
            if (cVar.h()) {
                subscriber.onError(new ErrorMessageException(com.planner5d.library.f.s.I9, "#CS " + cVar.f()));
                return;
            }
            JSONObject jSONObjectA = cVar.a();
            String string = jSONObjectA.getString(com.planner5d.library.services.r.id.f224891a);
            P0(aVar, new String[]{string});
            this.f180901e.get().J(aVar, project, jSONObjectA).toBlocking().firstOrDefault(null);
            Snapshot snapshot = (Snapshot) new Select().from(Snapshot.class).where("user_id = ? AND uid = ?", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar)), string).executeSingle();
            if (snapshot == null) {
                subscriber.onError(new ErrorMessageException(com.planner5d.library.f.s.Qa, new String[0]));
            } else if (z10) {
                N0(aVar, snapshot, aVar3.f275442a).subscribe(subscriber);
            } else {
                subscriber.onNext(snapshot);
                subscriber.onCompleted();
            }
        } catch (com.planner5d.library.api.e e10) {
            subscriber.onError(new ErrorMessageException(com.planner5d.library.f.s.I9, "#CI " + e10.getMessage()));
        } catch (IOException | IllegalStateException | JSONException unused) {
            subscriber.onError(new ErrorMessageException(com.planner5d.library.f.s.Qa, new String[0]));
        }
    }

    public Observable<String> L0(final Context context, final gd.b bVar) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.x3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f222387a.z0(context, bVar, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).flatMap(new Func1() { // from class: com.planner5d.library.model.manager.y3
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f222402a.K0((com.planner5d.library.services.bitmaploader.target.a) obj);
            }
        }).observeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    public Observable<Void> M(final Context context, final id.a aVar, final gd.b bVar) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.a4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f180784a.r0(bVar, context, aVar, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    public Observable<String> M0(Bitmap bitmap) {
        b bVar = new b();
        bVar.j(bitmap, null);
        return K0(bVar);
    }

    public void N(Context context, final id.a aVar, final List<gd.b> list) {
        final HashMap map = new HashMap();
        for (gd.b bVar : list) {
            if (bVar instanceof SnapshotLocal) {
                map.put(bVar.getId(), j0(context, (SnapshotLocal) bVar));
            }
        }
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.o3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f192224a.s0(aVar, list, map);
            }
        });
        this.f180905i.get().u();
        com.planner5d.library.services.m0.f224431d.t();
    }

    public Observable<Snapshot> N0(final id.a aVar, final Snapshot snapshot, final vd.b bVar) {
        int i10 = snapshot.status;
        if (i10 == 0 || i10 == 3 || i10 == 2) {
            return Observable.error(new ErrorMessageException(com.planner5d.library.f.s.Ua, new String[0]));
        }
        return (i10 != 4 || (snapshot.draft && bVar != vd.b.DRAFT)) ? Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.k3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f191807a.A0(bVar, aVar, snapshot, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d) : Observable.error(new ErrorMessageException(com.planner5d.library.f.s.Ta, new String[0]));
    }

    @androidx.annotation.m1
    public void O0(@NonNull Snapshot snapshot) {
        this.f180905i.get().r(snapshot).toBlocking().firstOrDefault(null);
    }

    @Override // kb.b
    @androidx.annotation.m1
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void d(@NonNull id.a aVar, Snapshot snapshot, JSONObject jSONObject) throws JSONException {
        Folder folderA = this.f180899c.A(aVar, jSONObject.getLong(com.planner5d.library.services.r.folder.f224891a));
        snapshot.uid = jSONObject.getString(snapshot.v());
        snapshot.folderId = folderA == null ? 0L : folderA.getId().longValue();
        Integer num = 1;
        snapshot.draft = num.equals(com.planner5d.library.services.utility.k1.p(jSONObject, com.planner5d.library.services.r.draft));
        snapshot.number = jSONObject.getInt(com.planner5d.library.services.r.number.f224891a);
        snapshot.projectUid = jSONObject.getString(com.planner5d.library.services.r.hash.f224891a);
        snapshot.width = com.planner5d.library.services.utility.k1.m(jSONObject, com.planner5d.library.services.r.width, 0);
        snapshot.taskId = jSONObject.getLong(com.planner5d.library.services.r.taskId.f224891a);
        snapshot.status = k0(jSONObject.getString(com.planner5d.library.services.r.status.f224891a));
        snapshot.type = gd.c.n(jSONObject.getString(com.planner5d.library.services.r.type.f224891a)).o();
        snapshot.dateCreated = this.f180902f.g(jSONObject.getString(com.planner5d.library.services.r.cdate.f224891a));
        snapshot.dateUpdated = this.f180902f.g(jSONObject.getString(com.planner5d.library.services.r.udate.f224891a));
        snapshot.uriImage = jSONObject.getString(com.planner5d.library.services.r.snapshotImageUrl.f224891a);
        snapshot.f222811b = jSONObject.optInt(com.planner5d.library.services.r.progress.f224891a);
        snapshot.userId = aVar.f287075a;
    }

    @Override // kb.b
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public void c(@NonNull Snapshot snapshot, @NonNull Snapshot snapshot2) {
        snapshot.dateUpdated = snapshot2.dateUpdated;
        snapshot.draft = snapshot2.draft;
        snapshot.uriImage = snapshot2.uriImage;
        snapshot.status = snapshot2.status;
        snapshot.type = snapshot2.type;
        snapshot.taskId = snapshot2.taskId;
    }

    @androidx.annotation.m1
    protected SynchronizedModel R(id.a aVar, long j10, Class<? extends SynchronizedModel> cls) {
        return (SynchronizedModel) new Select().from(cls).where("user_id = ? AND id = ?", Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar)), Long.valueOf(j10)).executeSingle();
    }

    public Observable<Void> R0(final id.a aVar) {
        return aVar == null ? Observable.just(null).observeOn(com.planner5d.library.services.rx.c.f224934d) : Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.g3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f191462a.C0(aVar, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    @androidx.annotation.m1
    protected SynchronizedModel S(id.a aVar, gd.b bVar) {
        return R(aVar, bVar.getId().longValue(), bVar instanceof Snapshot ? Snapshot.class : SnapshotLocal.class);
    }

    protected List<SynchronizedModel> T(id.a aVar, List<gd.b> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (gd.b bVar : list) {
            if (bVar instanceof Snapshot) {
                arrayList.add(bVar.getId());
            } else if (bVar instanceof SnapshotLocal) {
                arrayList2.add(bVar.getId());
            }
        }
        return V(aVar, arrayList, arrayList2);
    }

    @Override // kb.b
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public JSONObject w(id.a aVar, Snapshot snapshot) throws JSONException {
        throw new JSONException("Snapshots cannot be converted to JSON");
    }

    protected List<SynchronizedModel> U(id.a aVar, List<Long> list, Class<? extends SynchronizedModel> cls) {
        return new Select().from(cls).where("user_id = ? AND id IN (" + TextUtils.join(",", list) + ")", Long.valueOf(aVar.f287075a)).execute();
    }

    @Override // kb.b
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public void p(@NonNull Snapshot snapshot, @NonNull JSONObject jSONObject) {
    }

    protected List<SynchronizedModel> V(id.a aVar, List<Long> list, List<Long> list2) {
        List<SynchronizedModel> listU;
        List<SynchronizedModel> listU2;
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty() && (listU2 = U(aVar, list, Snapshot.class)) != null && !listU2.isEmpty()) {
            arrayList.addAll(listU2);
        }
        if (list2 != null && !list2.isEmpty() && (listU = U(aVar, list2, SnapshotLocal.class)) != null && !listU.isEmpty()) {
            arrayList.addAll(listU);
        }
        return arrayList;
    }

    @androidx.annotation.m1
    public List<gd.b> W(id.a aVar, Folder folder) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a0(aVar, folder));
        arrayList.addAll(c0(folder));
        arrayList.sort(new Comparator() { // from class: com.planner5d.library.model.manager.w3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b4.r((gd.b) obj, (gd.b) obj2);
            }
        });
        return arrayList;
    }

    public Observable<List<Snapshot>> X(final id.a aVar) {
        return com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.model.manager.j3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f191793a.t0(aVar);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public Snapshot f0(long j10) {
        return (Snapshot) R(this.f180908l.get().a(), j10, Snapshot.class);
    }

    @androidx.annotation.m1
    public List<String> g0(Project project, id.a aVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            String coverId = this.f180901e.get().g0(project).getCoverId();
            if (coverId != null && !coverId.isEmpty()) {
                arrayList.add(coverId);
            }
        } catch (IOException | JSONException unused) {
        }
        List<Snapshot> listB0 = b0(Long.valueOf(com.planner5d.library.modules.user.user.x.a(aVar)));
        if (!listB0.isEmpty() && project.uid != null) {
            for (Snapshot snapshot : listB0) {
                if (snapshot.getId() != null && (str = snapshot.projectUid) != null && str.contains(project.uid)) {
                    arrayList.add(snapshot.getId().toString());
                }
            }
        }
        return arrayList;
    }

    @androidx.annotation.m1
    @androidx.annotation.p0
    public com.planner5d.library.services.bitmaploader.d.c h0(@androidx.annotation.p0 Context context, @androidx.annotation.p0 gd.b bVar) {
        if (bVar == null) {
            return null;
        }
        boolean z10 = bVar instanceof Snapshot;
        if (z10 && ((Snapshot) bVar).projectUid == null) {
            return null;
        }
        return z10 ? new com.planner5d.library.services.bitmaploader.d.c(0, ((Snapshot) bVar).x()) : new com.planner5d.library.services.bitmaploader.d.c(1, j0(context, (SnapshotLocal) bVar).getAbsolutePath());
    }

    @androidx.annotation.m1
    public File i0(Context context, int i10) {
        SnapshotLocal snapshotLocal = (SnapshotLocal) R(this.f180908l.get().a(), i10, SnapshotLocal.class);
        if (snapshotLocal == null) {
            return null;
        }
        return j0(context, snapshotLocal);
    }

    @androidx.annotation.m1
    public File j0(Context context, SnapshotLocal snapshotLocal) {
        return new File(d0(context), snapshotLocal.filename);
    }

    @Override // kb.b
    @NonNull
    public List<Snapshot> k(id.a aVar) {
        return new ArrayList();
    }

    @Override // kb.b
    @androidx.annotation.m1
    public void l(id.a aVar, JSONObject jSONObject) {
        this.f180904h.g(aVar, jSONObject, this);
    }

    public void m0(boolean z10) {
        com.planner5d.library.model.manager.statistics.events.l2 l2Var = com.planner5d.library.model.manager.statistics.events.l2.f217094b;
        com.planner5d.library.model.manager.statistics.events.y3.c cVar = com.planner5d.library.model.manager.statistics.events.y3.c.snapshot;
        l2Var.u(cVar, null);
        if (this.f180914r.get().a(com.planner5d.library.model.manager.config.f.ProAndroid) && z10) {
            this.f180913q.f(new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ComparePlansFragment.class, new com.planner5d.library.services.utility.i().m(com.planner5d.library.services.r.commercial, true).m(com.planner5d.library.services.r.newNavigation, false).m(com.planner5d.library.services.r.snapshots, true).t(com.planner5d.library.services.r.source, com.planner5d.library.model.manager.statistics.events.y3.c.snapshots).a()).n(com.planner5d.library.f.s.ky), true);
        } else {
            com.planner5d.library.services.b0.f223959b.o(new com.planner5d.library.services.b0.a(this.f180906j.a() ? fd.k.RENDERS : fd.k.CATALOG, null, com.planner5d.library.model.manager.config.purchaseplacement.b.a.snapshots, cVar));
        }
    }

    public Observable<Void> n0(final com.planner5d.library.modules.user.user.t0 t0Var, final id.a aVar, final vd.b bVar) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.i3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f191566a.u0(t0Var, aVar, bVar, (Subscriber) obj);
            }
        });
    }

    @NonNull
    public Observable<Snapshot> o0(@androidx.annotation.p0 final id.a aVar, long j10) {
        final Snapshot snapshot = (Snapshot) R(aVar, j10, Snapshot.class);
        final String strA = snapshot == null ? null : snapshot.a();
        if (snapshot == null || !snapshot.l() || strA == null) {
            return Observable.error(new ErrorMessageException(com.planner5d.library.f.s.Z8, new String[0]));
        }
        return !this.f180916t.d(this.f180909m) ? Observable.error(ErrorMessageException.createNetworkException()) : Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.f3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f191344a.v0(strA, aVar, snapshot, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    public boolean p0() {
        return this.f180917u;
    }
}
