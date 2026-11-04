package androidx.media2.session;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class SessionCommandParcelizer {
    public static SessionCommand read(androidx.versionedparcelable.e eVar) {
        SessionCommand sessionCommand = new SessionCommand();
        sessionCommand.f58673q = eVar.M(sessionCommand.f58673q, 1);
        sessionCommand.f58674r = eVar.d0(sessionCommand.f58674r, 2);
        sessionCommand.f58675s = eVar.q(sessionCommand.f58675s, 3);
        return sessionCommand;
    }

    public static void write(SessionCommand sessionCommand, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        eVar.M0(sessionCommand.f58673q, 1);
        eVar.f1(sessionCommand.f58674r, 2);
        eVar.r0(sessionCommand.f58675s, 3);
    }
}
