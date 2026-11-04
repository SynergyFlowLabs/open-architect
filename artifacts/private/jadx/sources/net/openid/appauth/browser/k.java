package net.openid.appauth.browser;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f332864c = new k(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i f332865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f332866b;

    public k(@p0 i iVar, @p0 i iVar2) {
        this.f332865a = iVar;
        this.f332866b = iVar2;
    }

    public static k a(String str) {
        return b(i.d(str));
    }

    public static k b(i iVar) {
        return new k(iVar, null);
    }

    public static k c(String str) {
        return d(i.d(str));
    }

    public static k d(i iVar) {
        return new k(null, iVar);
    }

    public static k e(String str, String str2) {
        return new k(i.d(str), i.d(str2));
    }

    public boolean f(@NonNull String str) {
        return g(i.d(str));
    }

    public boolean g(@NonNull i iVar) {
        i iVar2 = this.f332865a;
        if (iVar2 != null && iVar2.compareTo(iVar) > 0) {
            return false;
        }
        i iVar3 = this.f332866b;
        return iVar3 == null || iVar3.compareTo(iVar) >= 0;
    }

    public String toString() {
        if (this.f332865a == null) {
            if (this.f332866b == null) {
                return "any version";
            }
            return this.f332866b.toString() + " or lower";
        }
        if (this.f332866b == null) {
            return this.f332865a.toString() + " or higher";
        }
        return "between " + this.f332865a + " and " + this.f332866b;
    }
}
