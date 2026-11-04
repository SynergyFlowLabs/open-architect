package com.planner5d.library.widget.editor.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.planner5d.library.database.model.ProjectRevision;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func0;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes8.dex */
public class n3 implements o3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f256612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f256613k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final u3 f256614l = new u3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.model.manager.project.d0 f256615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.model.manager.project.m0 f256616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.model.manager.project.h0 f256617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.modules.user.user.t f256618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.modules.user.user.t0 f256619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.model.manager.b2 f256620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.application.d f256621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f256622h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.planner5d.library.model.manager.statistics.c<x3.d> f256623i = new com.planner5d.library.model.manager.statistics.c<>();

    class a extends com.planner5d.library.services.rx.e<Project> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber f256624d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ id.a f256625e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ s3 f256626f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ byte[] f256627g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f256628h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f256629i;

        a(Subscriber subscriber, id.a aVar, s3 s3Var, byte[] bArr, String str, String str2) {
            this.f256624d = subscriber;
            this.f256625e = aVar;
            this.f256626f = s3Var;
            this.f256627g = bArr;
            this.f256628h = str;
            this.f256629i = str2;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            this.f256624d.onError(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onNext(final Project project) {
            if (project != null) {
                Observable<ItemProject> observableE0 = n3.this.f256615a.e0(project);
                final s3 s3Var = this.f256626f;
                observableE0.map(new Func1() { // from class: com.planner5d.library.widget.editor.helper.m3
                    @Override // rx.functions.Func1
                    public final Object call(Object obj) {
                        return n3.f256614l.g(s3Var, new t3(project, (ItemProject) obj));
                    }
                }).subscribe((Subscriber<? super R>) new com.planner5d.library.services.rx.e(this.f256624d));
                return;
            }
            n3.this.O(this.f256624d, this.f256625e, this.f256626f, this.f256627g, this.f256628h + "_" + this.f256629i);
        }
    }

    class b extends com.planner5d.library.services.rx.e<Project> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f256631d;

        b(Activity activity) {
            this.f256631d = activity;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            n3.this.N(this.f256631d, th2);
            onCompleted();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            n3.this.t(-1);
        }
    }

    class c extends com.planner5d.library.services.rx.e<Project> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber f256633d;

        c(Subscriber subscriber) {
            this.f256633d = subscriber;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            n3.this.t(-1);
            this.f256633d.onError(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Project project) {
            if (project == null || project.getId() == null) {
                return;
            }
            this.f256633d.onNext(project.getId());
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            n3.this.t(-1);
            this.f256633d.onCompleted();
        }
    }

    class d extends com.planner5d.library.services.rx.e<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber f256635d;

        d(Subscriber subscriber) {
            this.f256635d = subscriber;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            n3.this.f256620f.c(th2);
            this.f256635d.onError(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(String str) {
            n3.this.f256620f.b(com.planner5d.library.f.s.cw, str);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            this.f256635d.onCompleted();
        }
    }

    @ij.a
    public n3(com.planner5d.library.model.manager.project.d0 d0Var, com.planner5d.library.model.manager.project.m0 m0Var, com.planner5d.library.model.manager.project.h0 h0Var, com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.modules.user.user.t0 t0Var, com.planner5d.library.model.manager.b2 b2Var, com.planner5d.library.application.d dVar) {
        this.f256615a = d0Var;
        this.f256616b = m0Var;
        this.f256617c = h0Var;
        this.f256618d = tVar;
        this.f256619e = t0Var;
        this.f256620f = b2Var;
        this.f256621g = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(s3 s3Var, Subscriber subscriber, byte[] bArr, id.a aVar, String str, Subscriber subscriber2) {
        Object obj;
        try {
            Long lB = s3Var.b();
            Project projectZ = lB == null ? null : this.f256615a.Z(lB.longValue());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Project not loaded #");
            sb2.append(lB);
            sb2.append(":");
            sb2.append(bArr == null ? 0 : 1);
            sb2.append(":");
            sb2.append(com.planner5d.library.modules.user.user.x.a(aVar));
            sb2.append(".");
            sb2.append(this.f256618d.e());
            sb2.append(":");
            if (projectZ == null) {
                obj = 0;
            } else {
                obj = projectZ.deleted + "." + projectZ.userId;
            }
            sb2.append(obj);
            sb2.append(":");
            sb2.append(str);
            subscriber.onError(new Exception(sb2.toString()));
        } catch (Throwable th2) {
            subscriber.onError(th2);
        }
        subscriber2.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable B(Project project, ItemProject itemProject, boolean z10) {
        return this.f256615a.Q0(this.f256618d.a(), project, itemProject, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(Subscriber subscriber) {
        t3 t3VarC = f256614l.c();
        Project projectB = t3VarC == null ? null : t3VarC.b();
        ItemProject itemProjectA = t3VarC != null ? t3VarC.a() : null;
        if (projectB != null && itemProjectA != null) {
            t(1);
            this.f256615a.Q0(this.f256618d.a(), projectB, itemProjectA, false).subscribe((Subscriber<? super Project>) new c(subscriber));
            return;
        }
        subscriber.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Project project, ItemProject itemProject, Subscriber subscriber) {
        this.f256615a.P0(project, itemProject).subscribe((Subscriber<? super String>) new d(subscriber));
    }

    private Observable<t3> G(s3 s3Var, String str) {
        return H(s3Var, null, null, str + "_loadId");
    }

    private Observable<t3> H(final s3 s3Var, String str, byte[] bArr, final String str2) {
        final byte[] bArr2;
        Observable<Project> observableT;
        String str3;
        final Observable<Project> observable;
        Observable<Project> observableN;
        t3 t3VarI = f256614l.i(s3Var);
        if (t3VarI != null) {
            return Observable.just(t3VarI).observeOn(com.planner5d.library.services.rx.c.f224934d);
        }
        final id.a aVarA = this.f256618d.a();
        if (s3Var.b() == null) {
            if (bArr == null) {
                final String strF = s3Var.f();
                if (strF != null) {
                    observableN = com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.widget.editor.helper.g3
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f256377a.v(strF);
                        }
                    });
                    str3 = "uri";
                } else {
                    observableN = this.f256615a.N(aVarA, null, false);
                    str3 = "createNew";
                }
                observable = observableN;
                bArr2 = bArr;
            } else {
                bArr2 = bArr;
                observableT = this.f256615a.L(aVarA, null, false, str, bArr2);
                str3 = "create";
            }
            final String str4 = str3;
            return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.helper.h3
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.f256420a.w(observable, aVarA, s3Var, bArr2, str2, str4, (Subscriber) obj);
                }
            });
        }
        bArr2 = bArr;
        observableT = this.f256615a.T(aVarA, s3Var.b().longValue());
        str3 = "id";
        observable = observableT;
        final String str5 = str3;
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.helper.h3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f256420a.w(observable, aVarA, s3Var, bArr2, str2, str5, (Subscriber) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(Activity activity, Throwable th2) {
        if (activity != null) {
            try {
                Toast.makeText(activity, ErrorMessageException.getError((Context) activity, new ErrorMessageException(com.planner5d.library.f.s.Ha, ((th2 instanceof com.planner5d.library.model.manager.project.d0.c) || (th2 instanceof OutOfMemoryError)) ? activity.getString(com.planner5d.library.f.s.R9) : "")), 1).show();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(final Subscriber<? super t3> subscriber, final id.a aVar, final s3 s3Var, final byte[] bArr, final String str) {
        com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.helper.k3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f256511a.A(s3Var, subscriber, bArr, aVar, str, (Subscriber) obj);
            }
        }).subscribe((Subscriber) new com.planner5d.library.services.rx.e());
    }

    private boolean r() {
        return !this.f256622h && (this.f256621g.a() || this.f256619e.c());
    }

    public static void s() {
        f256614l.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(int i10) {
        synchronized (f256613k) {
            try {
                f256612j += i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Project v(String str) throws Exception {
        return this.f256617c.d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0012, code lost:
    
        com.planner5d.library.services.utility.o3.c(1000);
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void w(rx.Observable r11, id.a r12, com.planner5d.library.widget.editor.helper.s3 r13, byte[] r14, java.lang.String r15, java.lang.String r16, rx.Subscriber r17) {
        /*
            r10 = this;
            r0 = 0
        L1:
            r1 = 10
            if (r0 >= r1) goto L1c
            java.lang.Object r1 = com.planner5d.library.widget.editor.helper.n3.f256613k
            monitor-enter(r1)
            int r2 = com.planner5d.library.widget.editor.helper.n3.f256612j     // Catch: java.lang.Throwable -> Le
            if (r2 > 0) goto L11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            goto L1c
        Le:
            r0 = move-exception
            r10 = r0
            goto L1a
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            r1 = 1000(0x3e8, double:4.94E-321)
            com.planner5d.library.services.utility.o3.c(r1)
            int r0 = r0 + 1
            goto L1
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r10
        L1c:
            com.planner5d.library.widget.editor.helper.n3$a r2 = new com.planner5d.library.widget.editor.helper.n3$a
            r3 = r10
            r5 = r12
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r9 = r16
            r4 = r17
            r4 = r17
            r2.<init>(r4, r5, r6, r7, r8, r9)
            r11.subscribe(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.helper.n3.w(rx.Observable, id.a, com.planner5d.library.widget.editor.helper.s3, byte[], java.lang.String, java.lang.String, rx.Subscriber):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable x(t3 t3Var) {
        return Q(t3Var.b(), t3Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Pair y(Bundle bundle, id.a aVar) throws Exception {
        s3 s3VarA = s3.a(bundle);
        if (s3VarA.b() != null) {
            return this.f256616b.o(aVar, s3VarA.b().longValue());
        }
        throw new ErrorMessageException(com.planner5d.library.f.s.f169201ja, new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Bundle bundle, Subscriber subscriber) {
        Project projectY;
        s3 s3VarA = s3.a(bundle);
        if (s3VarA.b() == null || (projectY = this.f256615a.Y(this.f256618d.a(), s3VarA.b().longValue())) == null || !this.f256616b.m(projectY)) {
            subscriber.onCompleted();
        } else {
            subscriber.onError(new ErrorMessageException(com.planner5d.library.f.s.f169201ja, new String[0]));
        }
    }

    public Observable<t3> E(Bundle bundle) {
        s3 s3VarA = s3.a(bundle);
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        if (!f256614l.e(s3VarA)) {
            int i10 = 5 | 0;
            com.planner5d.library.model.manager.statistics.events.b2.f216725b.c((x3.d) this.f256623i.a(bundle, x3.d.unknown), jVar.f(com.planner5d.library.services.r.created, false), s3VarA.c());
        }
        return H(s3VarA, jVar.t(com.planner5d.library.services.r.projectTitle, com.planner5d.library.model.payments.a.f222474i), jVar.j(com.planner5d.library.services.r.projectData, null), "bundle");
    }

    public Observable<t3> F(Project project) {
        return G(new s3(project), "model");
    }

    public Observable<t3> I(String str) {
        return G(new s3(str, (String) null, (Long) null, (Long) null), "id");
    }

    public Observable<Pair<ProjectRevision, ProjectRevision>> J(final id.a aVar, final Bundle bundle) {
        return com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.widget.editor.helper.i3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f256437a.y(bundle, aVar);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    public Observable<Pair<Project, ItemProject>> K(JSONObject jSONObject) {
        return this.f256615a.H0(jSONObject);
    }

    public Observable<Map<String, Pair<Project, ItemProject>>> L(List<Pair<String, JSONObject>> list) {
        return this.f256615a.I0(list);
    }

    public Observable<t3> M(final Bundle bundle) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.helper.f3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f256305a.z(bundle, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).concatWith(E(bundle));
    }

    public void P(Activity activity, final Project project, final ItemProject itemProject, final boolean z10) {
        f256614l.h(new t3(project, itemProject));
        if (r()) {
            t(1);
            Observable.defer(new Func0() { // from class: com.planner5d.library.widget.editor.helper.e3
                @Override // rx.functions.Func0, java.util.concurrent.Callable
                public final Object call() {
                    return this.f256283a.B(project, itemProject, z10);
                }
            }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber) new b(activity));
        }
    }

    public Observable<String> Q(final Project project, final ItemProject itemProject) {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.helper.j3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f256465a.D(project, itemProject, (Subscriber) obj);
            }
        });
    }

    public void R(id.a aVar, String str, String str2) {
        if (str != null) {
            this.f256615a.S0(aVar, Long.valueOf(str), str2);
            return;
        }
        t3 t3VarC = f256614l.c();
        Project projectB = t3VarC == null ? null : t3VarC.b();
        if (projectB != null) {
            projectB.title = str2;
        }
    }

    void S(boolean z10) {
        this.f256622h = z10;
    }

    @Override // com.planner5d.library.widget.editor.helper.o3
    @NonNull
    public Observable<String> a(@androidx.annotation.p0 Long l10) {
        return I(l10 == null ? null : String.valueOf(l10)).flatMap(new Func1() { // from class: com.planner5d.library.widget.editor.helper.l3
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f256528a.x((t3) obj);
            }
        });
    }

    @Override // com.planner5d.library.widget.editor.helper.o3
    @NonNull
    public Observable<Long> b() {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.helper.d3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f256220a.C((Subscriber) obj);
            }
        });
    }

    public boolean u() {
        return f256614l.c() == null;
    }
}
