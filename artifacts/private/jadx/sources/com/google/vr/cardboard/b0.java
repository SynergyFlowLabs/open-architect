package com.google.vr.cardboard;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a0 f126811a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f126812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f126813b;

        a(ContentProviderClient contentProviderClient, String str) {
            this.f126812a = contentProviderClient;
            this.f126813b = str;
        }

        public void a() {
            this.f126812a.close();
        }
    }

    public static a0 a(Context context) {
        a0 a0Var = f126811a;
        if (a0Var != null) {
            return a0Var;
        }
        a aVarD = d(context);
        return aVarD != null ? new e(aVarD.f126812a, aVarD.f126813b) : new o(context);
    }

    private static List<String> b(Context context) {
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("com.google.vr.vrcore.settings");
            return arrayList;
        }
        List<ResolveInfo> listQueryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("android.content.action.VR_SETTINGS_PROVIDER"), 0);
        if (listQueryIntentContentProviders == null || listQueryIntentContentProviders.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
        while (it.hasNext()) {
            ProviderInfo providerInfo = it.next().providerInfo;
            if (q.a(providerInfo.packageName)) {
                arrayList2.add(providerInfo.authority);
            }
        }
        return arrayList2;
    }

    public static boolean c(Context context) {
        a0 a0Var = f126811a;
        if (a0Var != null && (a0Var instanceof e)) {
            return true;
        }
        List<String> listB = b(context);
        return (listB == null || listB.isEmpty()) ? false : true;
    }

    public static a d(Context context) {
        List<String> listB = b(context);
        if (listB == null) {
            return null;
        }
        for (String str : listB) {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(str);
            if (contentProviderClientAcquireContentProviderClient != null) {
                return new a(contentProviderClientAcquireContentProviderClient, str);
            }
        }
        return null;
    }
}
