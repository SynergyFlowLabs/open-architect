package androidx.media2.session;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class SessionCommandGroupParcelizer {
    public static SessionCommandGroup read(androidx.versionedparcelable.e eVar) {
        SessionCommandGroup sessionCommandGroup = new SessionCommandGroup();
        sessionCommandGroup.f58677q = eVar.Y(sessionCommandGroup.f58677q, 1);
        return sessionCommandGroup;
    }

    public static void write(SessionCommandGroup sessionCommandGroup, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        eVar.a1(sessionCommandGroup.f58677q, 1);
    }
}
