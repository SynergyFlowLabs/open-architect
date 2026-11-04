package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends com.google.android.play.core.appupdate.internal.r {
    public i(Context context) {
        super(new com.google.android.play.core.appupdate.internal.s("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override // com.google.android.play.core.appupdate.internal.r
    protected final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f114846a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f114846a.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f114846a.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        InstallState installStateG = InstallState.g(intent, this.f114846a);
        this.f114846a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", installStateG);
        d(installStateG);
    }
}
