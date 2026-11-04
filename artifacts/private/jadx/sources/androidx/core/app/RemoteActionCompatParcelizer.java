package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.b1;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.e eVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f46919q = (IconCompat) eVar.h0(remoteActionCompat.f46919q, 1);
        remoteActionCompat.f46920r = eVar.w(remoteActionCompat.f46920r, 2);
        remoteActionCompat.f46921s = eVar.w(remoteActionCompat.f46921s, 3);
        remoteActionCompat.f46922t = (PendingIntent) eVar.W(remoteActionCompat.f46922t, 4);
        remoteActionCompat.f46923u = eVar.m(remoteActionCompat.f46923u, 5);
        remoteActionCompat.f46924v = eVar.m(remoteActionCompat.f46924v, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.e eVar) {
        eVar.j0(false, false);
        eVar.m1(remoteActionCompat.f46919q, 1);
        eVar.z0(remoteActionCompat.f46920r, 2);
        eVar.z0(remoteActionCompat.f46921s, 3);
        eVar.X0(remoteActionCompat.f46922t, 4);
        eVar.n0(remoteActionCompat.f46923u, 5);
        eVar.n0(remoteActionCompat.f46924v, 6);
    }
}
