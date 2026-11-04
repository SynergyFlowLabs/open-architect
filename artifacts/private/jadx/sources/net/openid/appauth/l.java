package net.openid.appauth;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface l {

    public static class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f333102a;

        public a(String str) {
            super("Unsupported client authentication method: " + str);
            this.f333102a = str;
        }

        public String a() {
            return this.f333102a;
        }
    }

    Map<String, String> a(@NonNull String str);

    Map<String, String> b(@NonNull String str);
}
