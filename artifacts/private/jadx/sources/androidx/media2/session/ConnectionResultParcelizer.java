package androidx.media2.session;

import android.app.PendingIntent;
import androidx.annotation.b1;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.VideoSize;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public final class ConnectionResultParcelizer {
    public static ConnectionResult read(androidx.versionedparcelable.e eVar) {
        ConnectionResult connectionResult = new ConnectionResult();
        connectionResult.f58485q = eVar.M(connectionResult.f58485q, 0);
        connectionResult.f58487s = eVar.f0(connectionResult.f58487s, 1);
        connectionResult.C = eVar.M(connectionResult.C, 10);
        connectionResult.D = eVar.M(connectionResult.D, 11);
        connectionResult.E = (ParcelImplListSlice) eVar.W(connectionResult.E, 12);
        connectionResult.F = (SessionCommandGroup) eVar.h0(connectionResult.F, 13);
        connectionResult.G = eVar.M(connectionResult.G, 14);
        connectionResult.H = eVar.M(connectionResult.H, 15);
        connectionResult.I = eVar.M(connectionResult.I, 16);
        connectionResult.J = eVar.q(connectionResult.J, 17);
        connectionResult.K = (VideoSize) eVar.h0(connectionResult.K, 18);
        connectionResult.L = eVar.P(connectionResult.L, 19);
        connectionResult.f58488t = (PendingIntent) eVar.W(connectionResult.f58488t, 2);
        connectionResult.M = (SessionPlayer.TrackInfo) eVar.h0(connectionResult.M, 20);
        connectionResult.N = (SessionPlayer.TrackInfo) eVar.h0(connectionResult.N, 21);
        connectionResult.O = (SessionPlayer.TrackInfo) eVar.h0(connectionResult.O, 23);
        connectionResult.P = (SessionPlayer.TrackInfo) eVar.h0(connectionResult.P, 24);
        connectionResult.Q = (MediaMetadata) eVar.h0(connectionResult.Q, 25);
        connectionResult.R = eVar.M(connectionResult.R, 26);
        connectionResult.f58489u = eVar.M(connectionResult.f58489u, 3);
        connectionResult.f58491w = (MediaItem) eVar.h0(connectionResult.f58491w, 4);
        connectionResult.f58492x = eVar.R(connectionResult.f58492x, 5);
        connectionResult.f58493y = eVar.R(connectionResult.f58493y, 6);
        connectionResult.f58494z = eVar.H(connectionResult.f58494z, 7);
        connectionResult.A = eVar.R(connectionResult.A, 8);
        connectionResult.B = (MediaController.PlaybackInfo) eVar.h0(connectionResult.B, 9);
        connectionResult.d();
        return connectionResult;
    }

    public static void write(ConnectionResult connectionResult, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        connectionResult.f(eVar.i());
        eVar.M0(connectionResult.f58485q, 0);
        eVar.h1(connectionResult.f58487s, 1);
        eVar.M0(connectionResult.C, 10);
        eVar.M0(connectionResult.D, 11);
        eVar.X0(connectionResult.E, 12);
        eVar.m1(connectionResult.F, 13);
        eVar.M0(connectionResult.G, 14);
        eVar.M0(connectionResult.H, 15);
        eVar.M0(connectionResult.I, 16);
        eVar.r0(connectionResult.J, 17);
        eVar.m1(connectionResult.K, 18);
        eVar.P0(connectionResult.L, 19);
        eVar.X0(connectionResult.f58488t, 2);
        eVar.m1(connectionResult.M, 20);
        eVar.m1(connectionResult.N, 21);
        eVar.m1(connectionResult.O, 23);
        eVar.m1(connectionResult.P, 24);
        eVar.m1(connectionResult.Q, 25);
        eVar.M0(connectionResult.R, 26);
        eVar.M0(connectionResult.f58489u, 3);
        eVar.m1(connectionResult.f58491w, 4);
        eVar.R0(connectionResult.f58492x, 5);
        eVar.R0(connectionResult.f58493y, 6);
        eVar.I0(connectionResult.f58494z, 7);
        eVar.R0(connectionResult.A, 8);
        eVar.m1(connectionResult.B, 9);
    }
}
