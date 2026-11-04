package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f105775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f105776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f105777c = 0;

    public e0(Context context) {
        this.f105775a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoF;
        try {
            if (this.f105776b == 0) {
                try {
                    packageInfoF = com.google.android.gms.common.wrappers.d.a(this.f105775a).f("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e10) {
                    "Failed to find package ".concat(e10.toString());
                    packageInfoF = null;
                }
                if (packageInfoF != null) {
                    this.f105776b = packageInfoF.versionCode;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f105776b;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0001, B:8:0x0008, B:13:0x0026, B:15:0x002d, B:17:0x0042, B:27:0x006b, B:22:0x004d, B:24:0x0064, B:30:0x006f, B:34:0x007a), top: B:40:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    public final synchronized int b() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        try {
            int i10 = this.f105777c;
            if (i10 != 0) {
                return i10;
            }
            Context context = this.f105775a;
            PackageManager packageManager = context.getPackageManager();
            if (com.google.android.gms.common.wrappers.d.a(context).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                return 0;
            }
            int i11 = 1;
            if (com.google.android.gms.common.util.v.n()) {
                Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                intent.setPackage("com.google.android.gms");
                listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                if (listQueryBroadcastReceivers != null) {
                }
                if (true != com.google.android.gms.common.util.v.n()) {
                    i11 = 2;
                }
                this.f105777c = i11;
                return i11;
            }
            Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                intent3.setPackage("com.google.android.gms");
                listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                    if (true != com.google.android.gms.common.util.v.n()) {
                        i11 = 2;
                    }
                    this.f105777c = i11;
                    return i11;
                }
                i11 = 2;
            }
            this.f105777c = i11;
            return i11;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
