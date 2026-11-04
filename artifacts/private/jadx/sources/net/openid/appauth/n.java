package net.openid.appauth;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class n implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f333105b = "client_secret_post";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f333106c = "client_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f333107d = "client_secret";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private String f333108a;

    public n(@NonNull String str) {
        this.f333108a = (String) t.g(str, "clientSecret cannot be null");
    }

    @Override // net.openid.appauth.l
    public final Map<String, String> a(@NonNull String str) {
        HashMap map = new HashMap();
        map.put("client_id", str);
        map.put(f333107d, this.f333108a);
        return map;
    }

    @Override // net.openid.appauth.l
    public final Map<String, String> b(@NonNull String str) {
        return null;
    }
}
