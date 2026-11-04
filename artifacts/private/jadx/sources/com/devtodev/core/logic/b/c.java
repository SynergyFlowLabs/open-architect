package com.devtodev.core.logic.b;

import android.content.Context;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.devtodev.core.data.consts.ReferralProperty;
import com.devtodev.core.utils.log.CoreLog;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InstallReferrerClient f98278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f98279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f98280c = false;

    class a implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.devtodev.core.logic.b.a f98281a;

        a(com.devtodev.core.logic.b.a aVar) {
            this.f98281a = aVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            c.this.f98280c = false;
            this.f98281a.onInstallReferrerServiceDisconnected();
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i10) {
            if (i10 == 0) {
                c.this.f98280c = true;
            } else if (i10 == 1 || i10 == 2) {
                c.this.f98280c = false;
            }
            com.devtodev.core.logic.b.a aVar = this.f98281a;
            if (aVar != null) {
                aVar.a(c.this.f98280c);
            }
        }
    }

    public c(Context context, b bVar) {
        this.f98278a = InstallReferrerClient.newBuilder(context).build();
        this.f98279b = bVar;
    }

    public HashMap<ReferralProperty, String> b() throws RemoteException {
        HashMap<ReferralProperty, String> map = new HashMap<>();
        InstallReferrerClient installReferrerClient = this.f98278a;
        if (installReferrerClient == null || !this.f98280c) {
            if (this.f98280c) {
                CoreLog.e("DevToDev", "Referrer client was not built");
                return map;
            }
            CoreLog.e("DevToDev", "Referrer client is not connected");
            return map;
        }
        try {
            map.putAll(this.f98279b.a(URLDecoder.decode(installReferrerClient.getInstallReferrer().getInstallReferrer(), "UTF-8")));
            return map;
        } catch (UnsupportedEncodingException unused) {
            CoreLog.e("DevToDev", "Could not decode a parameter into UTF-8");
            return map;
        }
    }

    public void a(com.devtodev.core.logic.b.a aVar) {
        InstallReferrerClient installReferrerClient = this.f98278a;
        if (installReferrerClient == null || this.f98280c) {
            return;
        }
        try {
            installReferrerClient.startConnection(new a(aVar));
        } catch (Exception e10) {
            CoreLog.e("DevToDev", e10.toString());
        }
    }

    public void a() {
        InstallReferrerClient installReferrerClient = this.f98278a;
        if (installReferrerClient != null && this.f98280c) {
            installReferrerClient.endConnection();
        }
        CoreLog.d("DevToDev", "Referrer client end connection");
    }
}
