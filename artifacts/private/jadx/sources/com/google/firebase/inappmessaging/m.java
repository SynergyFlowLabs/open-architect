package com.google.firebase.inappmessaging;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.firebase.inappmessaging.internal.m2;
import com.google.firebase.inappmessaging.internal.p2;
import com.google.firebase.inappmessaging.internal.v2;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@x8.a
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m2 f123026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.internal.q f123027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.internal.x f123028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.internal.w f123029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v2 f123030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.installations.k f123031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f123032g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FirebaseInAppMessagingDisplay f123033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d8.c
    private Executor f123034i;

    @ij.a
    @l1
    m(m2 m2Var, @w8.f v2 v2Var, com.google.firebase.inappmessaging.internal.q qVar, com.google.firebase.installations.k kVar, com.google.firebase.inappmessaging.internal.x xVar, com.google.firebase.inappmessaging.internal.w wVar, @d8.c Executor executor) {
        this.f123026a = m2Var;
        this.f123030e = v2Var;
        this.f123027b = qVar;
        this.f123031f = kVar;
        this.f123028c = xVar;
        this.f123029d = wVar;
        this.f123034i = executor;
        kVar.getId().k(executor, new com.google.android.gms.tasks.g() { // from class: com.google.firebase.inappmessaging.k
            @Override // com.google.android.gms.tasks.g
            public final void b(Object obj) {
                p2.c("Starting InAppMessaging runtime with Installation ID " + ((String) obj));
            }
        });
        m2Var.K().f6(new dj.g() { // from class: com.google.firebase.inappmessaging.l
            @Override // dj.g
            public final void accept(Object obj) {
                this.f123025a.y((com.google.firebase.inappmessaging.model.o) obj);
            }
        });
    }

    @NonNull
    public static m m() {
        return (m) com.google.firebase.h.p().l(m.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(com.google.firebase.inappmessaging.model.o oVar) {
        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = this.f123033h;
        if (firebaseInAppMessagingDisplay != null) {
            firebaseInAppMessagingDisplay.displayMessage(oVar.a(), this.f123028c.a(oVar.a(), oVar.b()));
        }
    }

    public void c(@NonNull o oVar) {
        this.f123029d.e(oVar);
    }

    public void d(@NonNull o oVar, @NonNull Executor executor) {
        this.f123029d.f(oVar, executor);
    }

    public void e(@NonNull q qVar) {
        this.f123029d.g(qVar);
    }

    public void f(@NonNull q qVar, @NonNull Executor executor) {
        this.f123029d.h(qVar, executor);
    }

    public void g(@NonNull s sVar) {
        this.f123029d.i(sVar);
    }

    public void h(@NonNull s sVar, @NonNull Executor executor) {
        this.f123029d.j(sVar, executor);
    }

    public void i(@NonNull t tVar) {
        this.f123029d.k(tVar);
    }

    public void j(@NonNull t tVar, @NonNull Executor executor) {
        this.f123029d.l(tVar, executor);
    }

    public boolean k() {
        return this.f123032g;
    }

    public void l() {
        p2.c("Removing display event component");
        this.f123033h = null;
    }

    public boolean n() {
        return this.f123027b.b();
    }

    public void o() {
        this.f123029d.r();
    }

    public void p(@NonNull o oVar) {
        this.f123029d.s(oVar);
    }

    public void q(@NonNull q qVar) {
        this.f123029d.t(qVar);
    }

    public void r(@NonNull s sVar) {
        this.f123029d.u(sVar);
    }

    public void s(@NonNull t tVar) {
        this.f123029d.v(tVar);
    }

    public void t(@p0 Boolean bool) {
        this.f123027b.f(bool);
    }

    public void u(boolean z10) {
        this.f123027b.g(z10);
    }

    public void v(@NonNull FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay) {
        p2.c("Setting display event component");
        this.f123033h = firebaseInAppMessagingDisplay;
    }

    public void w(@NonNull Boolean bool) {
        this.f123032g = bool.booleanValue();
    }

    public void x(@NonNull String str) {
        this.f123030e.c(str);
    }
}
