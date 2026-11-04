package androidx.media2.exoplayer.external.drm;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class o {
    public static <T extends t> void a(@p0 p<T> previousSession, @p0 p<T> newSession) {
        if (previousSession == newSession) {
            return;
        }
        if (newSession != null) {
            newSession.Y();
        }
        if (previousSession != null) {
            previousSession.X();
        }
    }
}
