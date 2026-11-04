package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import io.sentry.z7;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class InstallReferrerClientImpl extends InstallReferrerClient {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f89355e = "InstallReferrerClient";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f89356f = 80837300;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f89357g = "com.android.vending";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f89358h = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f89359i = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f89360a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f89361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.finsky.externalreferrer.a f89362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ServiceConnection f89363d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    private final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InstallReferrerStateListener f89364a;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InstallReferrerCommons.logVerbose(InstallReferrerClientImpl.f89355e, "Install Referrer service connected.");
            InstallReferrerClientImpl.this.f89362c = com.google.android.finsky.externalreferrer.a.AbstractBinderC0959a.k(iBinder);
            int i10 = 6 >> 2;
            InstallReferrerClientImpl.this.f89360a = 2;
            this.f89364a.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn(InstallReferrerClientImpl.f89355e, "Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.f89362c = null;
            InstallReferrerClientImpl.this.f89360a = 0;
            this.f89364a.onInstallReferrerServiceDisconnected();
        }

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f89364a = installReferrerStateListener;
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.f89361b = context.getApplicationContext();
    }

    private boolean c() {
        try {
            return this.f89361b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= f89356f;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.f89360a = 3;
        if (this.f89363d != null) {
            InstallReferrerCommons.logVerbose(f89355e, "Unbinding from service.");
            this.f89361b.unbindService(this.f89363d);
            this.f89363d = null;
        }
        this.f89362c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString(z7.b.f307198c, this.f89361b.getPackageName());
        try {
            return new ReferrerDetails(this.f89362c.Y2(bundle));
        } catch (RemoteException e10) {
            InstallReferrerCommons.logWarn(f89355e, "RemoteException getting install referrer information");
            this.f89360a = 0;
            throw e10;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.f89360a != 2 || this.f89362c == null || this.f89363d == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose(f89355e, "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i10 = this.f89360a;
        if (i10 == 1) {
            InstallReferrerCommons.logWarn(f89355e, "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i10 == 3) {
            InstallReferrerCommons.logWarn(f89355e, "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose(f89355e, "Starting install referrer service setup.");
        Intent intent = new Intent(f89359i);
        intent.setComponent(new ComponentName("com.android.vending", f89358h));
        List<ResolveInfo> listQueryIntentServices = this.f89361b.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f89360a = 0;
            InstallReferrerCommons.logVerbose(f89355e, "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !c()) {
            InstallReferrerCommons.logWarn(f89355e, "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f89360a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        Intent intent2 = new Intent(intent);
        b bVar = new b(installReferrerStateListener);
        this.f89363d = bVar;
        try {
            if (this.f89361b.bindService(intent2, bVar, 1)) {
                InstallReferrerCommons.logVerbose(f89355e, "Service was bonded successfully.");
                return;
            }
            InstallReferrerCommons.logWarn(f89355e, "Connection to service is blocked.");
            this.f89360a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(1);
        } catch (SecurityException unused) {
            InstallReferrerCommons.logWarn(f89355e, "No permission to connect to service.");
            this.f89360a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(4);
        }
    }
}
