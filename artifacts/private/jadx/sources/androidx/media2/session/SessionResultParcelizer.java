package androidx.media2.session;

import androidx.annotation.b1;
import androidx.media2.common.MediaItem;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class SessionResultParcelizer {
    public static SessionResult read(androidx.versionedparcelable.e eVar) {
        SessionResult sessionResult = new SessionResult();
        sessionResult.f58680q = eVar.M(sessionResult.f58680q, 1);
        sessionResult.f58681r = eVar.R(sessionResult.f58681r, 2);
        sessionResult.f58682s = eVar.q(sessionResult.f58682s, 3);
        sessionResult.f58684u = (MediaItem) eVar.h0(sessionResult.f58684u, 4);
        sessionResult.d();
        return sessionResult;
    }

    public static void write(SessionResult sessionResult, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        sessionResult.f(eVar.i());
        eVar.M0(sessionResult.f58680q, 1);
        eVar.R0(sessionResult.f58681r, 2);
        eVar.r0(sessionResult.f58682s, 3);
        eVar.m1(sessionResult.f58684u, 4);
    }
}
