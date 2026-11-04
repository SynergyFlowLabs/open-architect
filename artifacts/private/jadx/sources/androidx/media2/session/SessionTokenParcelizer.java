package androidx.media2.session;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class SessionTokenParcelizer {
    public static SessionToken read(androidx.versionedparcelable.e eVar) {
        SessionToken sessionToken = new SessionToken();
        sessionToken.f58693q = (SessionToken.SessionTokenImpl) eVar.h0(sessionToken.f58693q, 1);
        return sessionToken;
    }

    public static void write(SessionToken sessionToken, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        eVar.m1(sessionToken.f58693q, 1);
    }
}
