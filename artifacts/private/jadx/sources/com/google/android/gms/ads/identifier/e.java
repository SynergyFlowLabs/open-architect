package com.google.android.gms.ads.identifier;

import androidx.annotation.m1;
import com.google.android.gms.internal.ads_identifier.h;
import com.google.android.gms.internal.ads_identifier.k;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    @m1
    public static final void a(String str) {
        try {
            try {
                try {
                    k.b(263);
                    URL url = new URL(str);
                    int i10 = h.f107466a;
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    try {
                        if (httpURLConnection.getResponseCode() >= 200) {
                        }
                        httpURLConnection.disconnect();
                        k.a();
                    } catch (Throwable th2) {
                        httpURLConnection.disconnect();
                        throw th2;
                    }
                } catch (IOException | RuntimeException e10) {
                    e10.getMessage();
                    k.a();
                }
            } catch (IndexOutOfBoundsException e11) {
                e11.getMessage();
                k.a();
            }
        } catch (Throwable th3) {
            k.a();
            throw th3;
        }
    }
}
