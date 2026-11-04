package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
final class e implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f97195f = "ConnectivityMonitor";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f97196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final c.a f97197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f97198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f97199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f97200e = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, Intent intent) {
            e eVar = e.this;
            boolean z10 = eVar.f97198c;
            eVar.f97198c = eVar.c(context);
            if (z10 != e.this.f97198c) {
                if (Log.isLoggable(e.f97195f, 3)) {
                    boolean z11 = e.this.f97198c;
                }
                e eVar2 = e.this;
                eVar2.f97197b.a(eVar2.f97198c);
            }
        }
    }

    e(@NonNull Context context, @NonNull c.a aVar) {
        this.f97196a = context.getApplicationContext();
        this.f97197b = aVar;
    }

    private void e() {
        if (this.f97199d) {
            return;
        }
        this.f97198c = c(this.f97196a);
        try {
            this.f97196a.registerReceiver(this.f97200e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f97199d = true;
        } catch (SecurityException unused) {
        }
    }

    private void f() {
        if (this.f97199d) {
            this.f97196a.unregisterReceiver(this.f97200e);
            this.f97199d = false;
        }
    }

    @Override // com.bumptech.glide.manager.i
    public void a() {
        f();
    }

    @Override // com.bumptech.glide.manager.i
    public void b() {
    }

    @e.a({"MissingPermission"})
    boolean c(@NonNull Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) com.bumptech.glide.util.k.d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            return true;
        }
    }

    @Override // com.bumptech.glide.manager.i
    public void m() {
        e();
    }
}
