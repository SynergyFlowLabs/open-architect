package com.planner5d.library.model.manager.builtin;

import android.content.Context;
import androidx.annotation.m1;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.i3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.services.filedownloader.c f180973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.api.requests.c f180974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f180975c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fg.e<p> f180979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final fg.e<i> f180980h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v0 f180984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f180985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.manager.managedfiles.a0> f180986n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c2 f180988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final fg.e<com.planner5d.library.modules.user.user.t> f180989q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f180976d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f180977e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f180978f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f180981i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @gj.a("lockUpdateFutures")
    private final List<Future<Void>> f180982j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final CompositeSubscription f180983k = new CompositeSubscription();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Long f180987o = null;

    @ij.a
    g0(com.planner5d.library.application.b bVar, com.planner5d.library.services.filedownloader.c cVar, com.planner5d.library.api.requests.c cVar2, fg.e<p> eVar, fg.e<i> eVar2, v0 v0Var, fg.e<com.planner5d.library.model.manager.managedfiles.a0> eVar3, c2 c2Var, fg.e<com.planner5d.library.modules.user.user.t> eVar4) {
        int i10 = 1 << 0;
        this.f180979g = eVar;
        this.f180980h = eVar2;
        this.f180973a = cVar;
        this.f180974b = cVar2;
        this.f180985m = bVar;
        this.f180975c = bVar.getPackageName();
        this.f180984l = v0Var;
        this.f180986n = eVar3;
        this.f180988p = c2Var;
        this.f180989q = eVar4;
    }

    @fj.g
    @m1
    private File e() throws Throwable {
        File fileJ = j();
        if (fileJ.isDirectory() || fileJ.mkdirs()) {
            return i3.f225278a.a("temp", "database", fileJ);
        }
        throw new IOException("Cannot create directory: " + fileJ.getAbsolutePath());
    }

    private void f(@fj.g com.planner5d.library.model.d dVar, @fj.g String str, @fj.g File file) throws Throwable {
        g(this.f180979g.get().d(dVar, i.C), str, file);
    }

    private void g(@fj.g com.planner5d.library.services.download.g[] gVarArr, @fj.g String str, @fj.g File file) throws Throwable {
        if (this.f180973a.g(gVarArr, file, str, TimeUnit.MINUTES.toMillis(10L)) != null) {
            return;
        }
        throw new IOException("Download failed: database.sqlite, hash - " + str);
    }

    private File j() {
        return new File(com.planner5d.library.services.e.f224295d.a(this.f180985m).e(), "temp");
    }

    @fj.g
    @m1
    private JSONObject k() throws IOException {
        return l(this.f180980h.get().Q(i.a.Active));
    }

    @fj.g
    private JSONObject l(final String str) throws IOException {
        com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) this.f180974b.j(this.f180989q.get().a(), new Function2() { // from class: com.planner5d.library.model.manager.builtin.d0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return this.f180961a.m(str, (com.planner5d.library.api.b) obj, (id.a) obj2);
            }
        });
        if (cVar.h()) {
            throw new IOException("Obtaining update info failed");
        }
        return cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.planner5d.library.api.c m(String str, com.planner5d.library.api.b bVar, id.a aVar) {
        return bVar.s0(aVar, com.planner5d.library.api.f.a().f142269g, this.f180975c, h3.j(this.f180985m), h3.c(), h3.a(), h3.n(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(boolean z10, Subscriber subscriber) {
        Throwable th2;
        if (z10) {
            while (true) {
                synchronized (this.f180976d) {
                    try {
                        if (!this.f180981i) {
                            break;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                Thread.yield();
            }
            this.f180981i = true;
        } else {
            synchronized (this.f180976d) {
                try {
                    if (this.f180981i) {
                        subscriber.onCompleted();
                        return;
                    }
                    this.f180981i = true;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        try {
            t(new wd.a(subscriber));
            synchronized (this.f180976d) {
                try {
                    this.f180981i = false;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            th2 = null;
        } catch (Throwable th6) {
            try {
                if (th6 instanceof wd.b) {
                    synchronized (this.f180976d) {
                        try {
                            this.f180981i = false;
                            return;
                        } finally {
                        }
                    }
                } else {
                    synchronized (this.f180976d) {
                        try {
                            this.f180981i = false;
                            th2 = th6;
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                }
            } catch (Throwable th8) {
                synchronized (this.f180976d) {
                    this.f180981i = false;
                    throw th8;
                }
            }
        }
        if (th2 == null) {
            subscriber.onCompleted();
        } else {
            subscriber.onError(th2);
        }
    }

    @m1
    private void o(com.planner5d.library.model.d dVar, File file, boolean z10) throws Throwable {
        this.f180986n.get().k(dVar, file);
        if (z10) {
            this.f180980h.get().E0(file);
        }
        this.f180979g.get().k(dVar);
        this.f180986n.get().n();
    }

    private Observable<Void> p(final boolean z10) {
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.builtin.c0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f180953a.n(z10, (Subscriber) obj);
            }
        });
    }

    @m1
    private void t(@fj.g wd.c cVar) throws Throwable {
        try {
            JSONObject jSONObjectK = k();
            JSONObject jSONObject = jSONObjectK.getJSONObject(com.planner5d.library.services.r.items.f224891a);
            try {
                this.f180984l.p(jSONObjectK.getJSONObject(com.planner5d.library.services.r.materials.f224891a));
            } catch (Throwable unused) {
            }
            cVar.b();
            this.f180984l.r();
            cVar.b();
            String string = jSONObject.getString(com.planner5d.library.services.r.version.f224891a);
            String strQ = this.f180980h.get().Q(i.a.Active);
            if (strQ == null) {
                throw new IOException("Current database version is empty");
            }
            String string2 = jSONObject.getString(com.planner5d.library.services.r.hash.f224891a);
            String strQ2 = this.f180980h.get().Q(i.a.BuiltIn);
            com.planner5d.library.model.d dVar = new com.planner5d.library.model.d(jSONObject);
            this.f180979g.get().l(dVar);
            cVar.b();
            if (string.equals(strQ2)) {
                com.planner5d.library.model.d dVarB = this.f180979g.get().b();
                if (dVarB == null || dVarB.f180677a.equalsIgnoreCase(string)) {
                    return;
                }
                o(this.f180979g.get().a(), this.f180980h.get().N(false), false);
                return;
            }
            com.planner5d.library.model.d dVarB2 = this.f180979g.get().b();
            if (!strQ.equals(string) || !this.f180980h.get().s0(dVarB2)) {
                cVar.b();
                File fileE = e();
                f(dVar, string2, fileE);
                o(new com.planner5d.library.model.d(string, dVar.f180679c, string2), fileE, true);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No need to download database #");
            sb2.append(string);
            sb2.append(" (");
            sb2.append(this.f180980h.get().q0() ? "built-in" : "downloaded");
            sb2.append(")");
            throw new IOException(sb2.toString());
        } catch (Throwable th2) {
            this.f180984l.c();
            throw th2;
        }
    }

    public void d() {
        synchronized (this.f180978f) {
            this.f180982j.forEach(new Consumer() { // from class: com.planner5d.library.model.manager.builtin.e0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((Future) obj).cancel(false);
                }
            });
            this.f180982j.removeIf(new f0());
        }
        this.f180983k.clear();
    }

    @fj.g
    @m1
    public File h() throws Throwable {
        com.planner5d.library.model.d dVar = new com.planner5d.library.model.d(l(null).getJSONObject(com.planner5d.library.services.r.items.f224891a));
        File fileE = e();
        com.planner5d.library.services.download.g[] gVarArrC = com.planner5d.library.services.download.o.f224287a.c(dVar, i.C);
        if (gVarArrC == null) {
            try {
                gVarArrC = new com.planner5d.library.services.download.g[0];
            } catch (Throwable th2) {
                fileE.delete();
                throw th2;
            }
        }
        g(gVarArrC, dVar.f180678b, fileE);
        return fileE;
    }

    void i() {
        com.planner5d.library.services.rx.i.j(p(false), new com.planner5d.library.services.rx.e(), this.f180983k);
    }

    public void q() {
        com.planner5d.library.services.rx.i.j(p(true), new com.planner5d.library.services.rx.e(), this.f180983k);
    }

    @m1
    public void r() throws Throwable {
        Future<Void> future = p(true).toBlocking().toFuture();
        synchronized (this.f180978f) {
            try {
                this.f180982j.removeIf(new f0());
                this.f180982j.add(future);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        future.get();
    }

    @m1
    public void s(boolean z10) {
        Long l10;
        if (this.f180988p.d(this.f180985m)) {
            synchronized (this.f180977e) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (z10 || (l10 = this.f180987o) == null || jCurrentTimeMillis - l10.longValue() >= 300000) {
                    try {
                        JSONObject jSONObjectK = k();
                        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.items;
                        if (jSONObjectK.has(rVar.f224891a)) {
                            this.f180979g.get().l(new com.planner5d.library.model.d(jSONObjectK.getJSONObject(rVar.f224891a)));
                        }
                        this.f180987o = Long.valueOf(jCurrentTimeMillis);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
