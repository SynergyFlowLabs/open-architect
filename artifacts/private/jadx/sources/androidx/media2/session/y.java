package androidx.media2.session;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class y extends androidx.media.e {
    private final MediaSession.e X;
    private final a<androidx.media.f.b> Y;
    final androidx.media.f Z;

    y(Context context, MediaSession.e eVar, MediaSessionCompat.Token token) {
        c(context);
        onCreate();
        x(token);
        this.Z = androidx.media.f.b(context);
        this.X = eVar;
        this.Y = new a<>(eVar);
    }

    @Override // androidx.media.e
    public androidx.media.e.C0493e l(String str, int i10, Bundle bundle) {
        androidx.media.f.b bVarE = e();
        MediaSession.d dVarY = y(bVarE);
        SessionCommandGroup sessionCommandGroupB = this.X.u().b(this.X.k(), dVarY);
        if (sessionCommandGroupB == null) {
            return null;
        }
        this.Y.a(bVarE, dVarY, sessionCommandGroupB);
        return a0.f58740c;
    }

    @Override // androidx.media.e
    public void m(String str, androidx.media.e.m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.j(null);
    }

    MediaSession.d y(androidx.media.f.b bVar) {
        return new MediaSession.d(bVar, -1, this.Z.c(bVar), null, null);
    }

    a<androidx.media.f.b> z() {
        return this.Y;
    }
}
