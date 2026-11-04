package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.internal.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.play.core.appupdate.internal.s f114887e = new com.google.android.play.core.appupdate.internal.s("AppUpdateService");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Intent f114888f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l1
    @p0
    com.google.android.play.core.appupdate.internal.d0 f114889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f114890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f114891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f114892d;

    w(Context context, y yVar) {
        this.f114890b = context.getPackageName();
        this.f114891c = context;
        this.f114892d = yVar;
        if (com.google.android.play.core.appupdate.internal.c.a(context)) {
            boolean z10 = false | false;
            this.f114889a = new com.google.android.play.core.appupdate.internal.d0(f0.a(context), f114887e, "AppUpdateService", f114888f, q.f114875a, null);
        }
    }

    static /* bridge */ /* synthetic */ Bundle b(w wVar, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        bundle.putAll(i());
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(wVar.f114891c.getPackageManager().getPackageInfo(wVar.f114891c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f114887e.b("The current version of the app could not be retrieved", new Object[0]);
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    static /* bridge */ /* synthetic */ a f(w wVar, Bundle bundle, String str) {
        int i10 = bundle.getInt("version.code", -1);
        int i11 = bundle.getInt("update.availability");
        int i12 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        int i13 = bundle.getInt("in.app.update.priority", 0);
        long j10 = bundle.getLong("bytes.downloaded");
        long j11 = bundle.getLong("total.bytes.to.download");
        long j12 = bundle.getLong("additional.size.required");
        long jA = wVar.f114892d.a();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap map = new HashMap();
        map.put("blocking.destructive.intent", k(bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        map.put("nonblocking.destructive.intent", k(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        map.put("blocking.intent", k(bundle.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        map.put("nonblocking.intent", k(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return a.m(str, i10, i11, i12, numValueOf, i13, j10, j11, j12, jA, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle i() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map mapA = com.google.android.play.core.appupdate.internal.o.a("app_update");
        bundle2.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
        if (mapA.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
        }
        if (mapA.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    private static Task j() {
        f114887e.b("onError(%d)", -9);
        return com.google.android.gms.tasks.n.f(new com.google.android.play.core.install.a(-9));
    }

    private static HashSet k(@p0 ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    public final Task d(String str) {
        if (this.f114889a == null) {
            return j();
        }
        f114887e.d("completeUpdate(%s)", str);
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.f114889a.s(new s(this, lVar, lVar, str), lVar);
        return lVar.a();
    }

    public final Task e(String str) {
        if (this.f114889a == null) {
            return j();
        }
        f114887e.d("requestUpdateInfo(%s)", str);
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.f114889a.s(new r(this, lVar, str, lVar), lVar);
        return lVar.a();
    }
}
