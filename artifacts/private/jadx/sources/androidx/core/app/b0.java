package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 extends Service {

    private class a extends android.support.v4.app.a.b {
        a() {
        }

        @Override // android.support.v4.app.a
        public void A8(String str, int i10, String str2, Notification notification) throws RemoteException {
            b0.this.c(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                b0.this.d(str, i10, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.a
        public void P3(String str, int i10, String str2) throws RemoteException {
            b0.this.c(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                b0.this.a(str, i10, str2);
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th2;
            }
        }

        @Override // android.support.v4.app.a
        public void Vc(String str) {
            b0.this.c(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                b0.this.b(str);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public abstract void a(String str, int i10, String str2);

    public abstract void b(String str);

    void c(int i10, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i10)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i10 + " is not authorized for package " + str);
    }

    public abstract void d(String str, int i10, String str2, Notification notification);

    @Override // android.app.Service
    @androidx.annotation.p(api = 19, message = "SDKs past 19 have no need for side channeling.")
    public IBinder onBind(Intent intent) {
        intent.getAction().equals(c0.f46962g);
        return null;
    }
}
