package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
public class k extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.support.customtabs.c.b f11943a = new a();

    class a extends android.support.customtabs.c.b {
        a() {
        }

        @Override // android.support.customtabs.c
        public void Ad(@NonNull android.support.customtabs.a aVar, @NonNull String str, @p0 Bundle bundle) throws RemoteException {
            aVar.l1(str, bundle);
        }

        @Override // android.support.customtabs.c
        public void h3(@NonNull android.support.customtabs.a aVar, @p0 Bundle bundle) throws RemoteException {
            aVar.af(bundle);
        }
    }

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@p0 Intent intent) {
        return this.f11943a;
    }
}
