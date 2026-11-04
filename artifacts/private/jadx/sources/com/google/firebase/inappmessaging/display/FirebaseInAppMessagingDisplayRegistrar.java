package com.google.firebase.inappmessaging.display;

import android.app.Application;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.h;
import com.google.firebase.components.k;
import com.google.firebase.components.v;
import com.google.firebase.inappmessaging.m;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class FirebaseInAppMessagingDisplayRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiamd";

    /* JADX INFO: Access modifiers changed from: private */
    public c buildFirebaseInAppMessagingUI(h hVar) {
        com.google.firebase.h hVar2 = (com.google.firebase.h) hVar.a(com.google.firebase.h.class);
        m mVar = (m) hVar.a(m.class);
        Application application = (Application) hVar2.n();
        c cVarA = com.google.firebase.inappmessaging.display.internal.injection.components.b.a().d(com.google.firebase.inappmessaging.display.internal.injection.components.d.a().a(new com.google.firebase.inappmessaging.display.internal.injection.modules.a(application)).b()).c(new com.google.firebase.inappmessaging.display.internal.injection.modules.e(mVar)).a().a();
        application.registerActivityLifecycleCallbacks(cVarA);
        return cVarA;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<com.google.firebase.components.g<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.g.h(c.class).h(LIBRARY_NAME).b(v.m(com.google.firebase.h.class)).b(v.m(m.class)).f(new k() { // from class: com.google.firebase.inappmessaging.display.d
            @Override // com.google.firebase.components.k
            public final Object a(h hVar) {
                return this.f122171a.buildFirebaseInAppMessagingUI(hVar);
            }
        }).e().d(), com.google.firebase.platforminfo.h.b(LIBRARY_NAME, "21.0.2"));
    }
}
