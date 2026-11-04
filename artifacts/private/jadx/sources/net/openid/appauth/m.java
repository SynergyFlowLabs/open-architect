package net.openid.appauth;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class m implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f333103b = "client_secret_basic";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private String f333104a;

    public m(@NonNull String str) {
        this.f333104a = (String) t.g(str, "mClientSecret cannot be null");
    }

    @Override // net.openid.appauth.l
    public final Map<String, String> a(@NonNull String str) {
        return null;
    }

    @Override // net.openid.appauth.l
    public final Map<String, String> b(@NonNull String str) {
        return Collections.singletonMap("Authorization", "Basic " + Base64.encodeToString((net.openid.appauth.internal.b.e(str) + ":" + net.openid.appauth.internal.b.e(this.f333104a)).getBytes(), 2));
    }
}
