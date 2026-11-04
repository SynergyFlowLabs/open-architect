package net.openid.appauth;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class s implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f333123a = "none";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f333124b = new s();

    private s() {
    }

    @Override // net.openid.appauth.l
    public Map<String, String> a(@NonNull String str) {
        return Collections.singletonMap("client_id", str);
    }

    @Override // net.openid.appauth.l
    public Map<String, String> b(@NonNull String str) {
        return null;
    }
}
