package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@w0(28)
class h extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    MediaSessionManager f52910h;

    h(Context context) {
        super(context);
        this.f52910h = (MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.g, androidx.media.i, androidx.media.f.a
    public boolean a(f.c userInfo) {
        return super.a(userInfo);
    }

    @w0(28)
    static final class a extends i.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final MediaSessionManager.RemoteUserInfo f52911d;

        a(String packageName, int pid, int uid) {
            super(packageName, pid, uid);
            this.f52911d = new MediaSessionManager.RemoteUserInfo(packageName, pid, uid);
        }

        static String c(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            return remoteUserInfo.getPackageName();
        }

        a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
            this.f52911d = remoteUserInfo;
        }
    }
}
