package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final HttpURLConnection f88627a;

    public a(@NonNull HttpURLConnection httpURLConnection) {
        this.f88627a = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th2;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    @Override // com.airbnb.lottie.network.d
    @NonNull
    public InputStream Ia() throws IOException {
        return this.f88627a.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f88627a.disconnect();
    }

    @Override // com.airbnb.lottie.network.d
    @p0
    public String error() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f88627a.getURL() + ". Failed with " + this.f88627a.getResponseCode() + "\n" + a(this.f88627a);
        } catch (IOException e10) {
            com.airbnb.lottie.utils.d.f("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // com.airbnb.lottie.network.d
    public boolean isSuccessful() {
        try {
            if (this.f88627a.getResponseCode() / 100 == 2) {
                return true;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    @Override // com.airbnb.lottie.network.d
    @p0
    public String oa() {
        return this.f88627a.getContentType();
    }
}
