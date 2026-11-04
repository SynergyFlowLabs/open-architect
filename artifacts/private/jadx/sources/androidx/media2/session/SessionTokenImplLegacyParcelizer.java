package androidx.media2.session;

import android.content.ComponentName;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class SessionTokenImplLegacyParcelizer {
    public static SessionTokenImplLegacy read(androidx.versionedparcelable.e eVar) {
        SessionTokenImplLegacy sessionTokenImplLegacy = new SessionTokenImplLegacy();
        sessionTokenImplLegacy.f58715r = eVar.q(sessionTokenImplLegacy.f58715r, 1);
        sessionTokenImplLegacy.f58716s = eVar.M(sessionTokenImplLegacy.f58716s, 2);
        sessionTokenImplLegacy.f58717t = eVar.M(sessionTokenImplLegacy.f58717t, 3);
        int i10 = 3 & 4;
        sessionTokenImplLegacy.f58718u = (ComponentName) eVar.W(sessionTokenImplLegacy.f58718u, 4);
        sessionTokenImplLegacy.f58719v = eVar.d0(sessionTokenImplLegacy.f58719v, 5);
        sessionTokenImplLegacy.f58720w = eVar.q(sessionTokenImplLegacy.f58720w, 6);
        sessionTokenImplLegacy.d();
        return sessionTokenImplLegacy;
    }

    public static void write(SessionTokenImplLegacy sessionTokenImplLegacy, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        sessionTokenImplLegacy.f(eVar.i());
        eVar.r0(sessionTokenImplLegacy.f58715r, 1);
        eVar.M0(sessionTokenImplLegacy.f58716s, 2);
        eVar.M0(sessionTokenImplLegacy.f58717t, 3);
        eVar.X0(sessionTokenImplLegacy.f58718u, 4);
        eVar.f1(sessionTokenImplLegacy.f58719v, 5);
        eVar.r0(sessionTokenImplLegacy.f58720w, 6);
    }
}
