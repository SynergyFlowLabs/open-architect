package android.support.v4.app;

import androidx.annotation.b1;
import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.e;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY})
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(e eVar) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(eVar);
    }

    public static void write(RemoteActionCompat remoteActionCompat, e eVar) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, eVar);
    }
}
