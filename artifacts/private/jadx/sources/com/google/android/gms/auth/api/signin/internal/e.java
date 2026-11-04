package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.common.logging.a f105673c = new com.google.android.gms.common.logging.a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f105674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f105675b = new a0((com.google.android.gms.common.api.l) null);

    public e(String str) {
        this.f105674a = com.google.android.gms.common.internal.w.l(str);
    }

    public static com.google.android.gms.common.api.p a(@p0 String str) {
        if (str == null) {
            return com.google.android.gms.common.api.q.c(new Status(4), null);
        }
        e eVar = new e(str);
        new Thread(eVar).start();
        return eVar.f105675b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f105888h;
        try {
            URL url = new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f105674a);
            int i10 = com.google.android.gms.internal.p000authapi.v.f107546a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f105886f;
            } else {
                f105673c.c("Unable to revoke access!", new Object[0]);
            }
            f105673c.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f105673c.c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f105673c.c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f105675b.o(status);
    }
}
