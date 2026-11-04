package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public class b implements f {
    @Override // com.airbnb.lottie.network.f
    @NonNull
    public d a(@NonNull String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}
