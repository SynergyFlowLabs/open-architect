package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.p;
import com.google.firebase.remoteconfig.d0;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z8.a<k9.a> f121256a;

    public l(z8.a<k9.a> aVar) {
        this.f121256a = aVar;
    }

    public static /* synthetic */ void a(e eVar, z8.b bVar) {
        ((k9.a) bVar.get()).a(d0.f124433p, eVar);
        g.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void b(p pVar) {
        if (pVar == null) {
            g.f().m("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final e eVar = new e(pVar);
            this.f121256a.a(new z8.a.InterfaceC2541a() { // from class: com.google.firebase.crashlytics.internal.k
                @Override // z8.a.InterfaceC2541a
                public final void a(z8.b bVar) {
                    l.a(eVar, bVar);
                }
            });
        }
    }
}
