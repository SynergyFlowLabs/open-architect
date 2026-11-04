package androidx.media2.session;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class ConnectionRequestParcelizer {
    public static ConnectionRequest read(androidx.versionedparcelable.e eVar) {
        ConnectionRequest connectionRequest = new ConnectionRequest();
        connectionRequest.f58481q = eVar.M(connectionRequest.f58481q, 0);
        connectionRequest.f58482r = eVar.d0(connectionRequest.f58482r, 1);
        connectionRequest.f58483s = eVar.M(connectionRequest.f58483s, 2);
        connectionRequest.f58484t = eVar.q(connectionRequest.f58484t, 3);
        return connectionRequest;
    }

    public static void write(ConnectionRequest connectionRequest, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        eVar.M0(connectionRequest.f58481q, 0);
        eVar.f1(connectionRequest.f58482r, 1);
        eVar.M0(connectionRequest.f58483s, 2);
        eVar.r0(connectionRequest.f58484t, 3);
    }
}
