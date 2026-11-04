package net.openid.appauth.browser;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f332831e = 92821;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f332832f = "SHA-512";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f332833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f332834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f332835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f332836d;

    public c(@NonNull PackageInfo packageInfo, boolean z10) {
        this(packageInfo.packageName, c(packageInfo.signatures), packageInfo.versionName, z10);
    }

    @NonNull
    public static String b(@NonNull Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }

    @NonNull
    public static Set<String> c(@NonNull Signature[] signatureArr) {
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            hashSet.add(b(signature));
        }
        return hashSet;
    }

    @NonNull
    public c a(boolean z10) {
        return new c(this.f332833a, this.f332834b, this.f332835c, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            c cVar = (c) obj;
            if (this.f332833a.equals(cVar.f332833a) && this.f332835c.equals(cVar.f332835c) && this.f332836d == cVar.f332836d && this.f332834b.equals(cVar.f332834b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f332833a.hashCode() * f332831e) + this.f332835c.hashCode()) * f332831e) + (this.f332836d.booleanValue() ? 1 : 0);
        Iterator<String> it = this.f332834b.iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * f332831e) + it.next().hashCode();
        }
        return iHashCode;
    }

    public c(@NonNull String str, @NonNull Set<String> set, @NonNull String str2, boolean z10) {
        this.f332833a = str;
        this.f332834b = set;
        this.f332835c = str2;
        this.f332836d = Boolean.valueOf(z10);
    }
}
