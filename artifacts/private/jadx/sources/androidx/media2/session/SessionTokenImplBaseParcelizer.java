package androidx.media2.session;

import android.content.ComponentName;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class SessionTokenImplBaseParcelizer {
    public static SessionTokenImplBase read(androidx.versionedparcelable.e eVar) {
        SessionTokenImplBase sessionTokenImplBase = new SessionTokenImplBase();
        sessionTokenImplBase.f58707q = eVar.M(sessionTokenImplBase.f58707q, 1);
        sessionTokenImplBase.f58708r = eVar.M(sessionTokenImplBase.f58708r, 2);
        sessionTokenImplBase.f58709s = eVar.d0(sessionTokenImplBase.f58709s, 3);
        sessionTokenImplBase.f58710t = eVar.d0(sessionTokenImplBase.f58710t, 4);
        sessionTokenImplBase.f58711u = eVar.f0(sessionTokenImplBase.f58711u, 5);
        sessionTokenImplBase.f58712v = (ComponentName) eVar.W(sessionTokenImplBase.f58712v, 6);
        sessionTokenImplBase.f58713w = eVar.q(sessionTokenImplBase.f58713w, 7);
        return sessionTokenImplBase;
    }

    public static void write(SessionTokenImplBase sessionTokenImplBase, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        eVar.M0(sessionTokenImplBase.f58707q, 1);
        eVar.M0(sessionTokenImplBase.f58708r, 2);
        eVar.f1(sessionTokenImplBase.f58709s, 3);
        eVar.f1(sessionTokenImplBase.f58710t, 4);
        eVar.h1(sessionTokenImplBase.f58711u, 5);
        eVar.X0(sessionTokenImplBase.f58712v, 6);
        eVar.r0(sessionTokenImplBase.f58713w, 7);
    }
}
