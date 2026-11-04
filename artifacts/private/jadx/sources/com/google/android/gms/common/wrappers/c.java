package com.google.android.gms.common.wrappers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.core.util.p;
import com.google.android.gms.common.util.v;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final Context f106983a;

    public c(@NonNull Context context) {
        this.f106983a = context;
    }

    @g6.a
    public int a(@NonNull String str) {
        return this.f106983a.checkCallingOrSelfPermission(str);
    }

    @g6.a
    public int b(@NonNull String str, @NonNull String str2) {
        return this.f106983a.getPackageManager().checkPermission(str, str2);
    }

    @NonNull
    @g6.a
    public ApplicationInfo c(@NonNull String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f106983a.getPackageManager().getApplicationInfo(str, i10);
    }

    @NonNull
    @g6.a
    public CharSequence d(@NonNull String str) throws PackageManager.NameNotFoundException {
        Context context = this.f106983a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @NonNull
    @g6.a
    public p<CharSequence, Drawable> e(@NonNull String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f106983a.getPackageManager().getApplicationInfo(str, 0);
        return p.a(this.f106983a.getPackageManager().getApplicationLabel(applicationInfo), this.f106983a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @NonNull
    @g6.a
    public PackageInfo f(@NonNull String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f106983a.getPackageManager().getPackageInfo(str, i10);
    }

    @NonNull
    @g6.a
    public String[] g(int i10) {
        return this.f106983a.getPackageManager().getPackagesForUid(i10);
    }

    @g6.a
    public boolean h() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.a(this.f106983a);
        }
        if (!v.n() || (nameForUid = this.f106983a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f106983a.getPackageManager().isInstantApp(nameForUid);
    }

    @e.b(19)
    public final boolean i(int i10, @NonNull String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f106983a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
