package androidx.media2.session;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class CommandButtonParcelizer {
    public static MediaSession.CommandButton read(androidx.versionedparcelable.e eVar) {
        MediaSession.CommandButton commandButton = new MediaSession.CommandButton();
        commandButton.f58626q = (SessionCommand) eVar.h0(commandButton.f58626q, 1);
        commandButton.f58627r = eVar.M(commandButton.f58627r, 2);
        commandButton.f58628s = eVar.w(commandButton.f58628s, 3);
        commandButton.f58629t = eVar.q(commandButton.f58629t, 4);
        commandButton.f58630u = eVar.m(commandButton.f58630u, 5);
        return commandButton;
    }

    public static void write(MediaSession.CommandButton commandButton, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        eVar.m1(commandButton.f58626q, 1);
        eVar.M0(commandButton.f58627r, 2);
        eVar.z0(commandButton.f58628s, 3);
        eVar.r0(commandButton.f58629t, 4);
        eVar.n0(commandButton.f58630u, 5);
    }
}
