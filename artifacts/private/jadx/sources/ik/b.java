package ik;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.t;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f287245a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f287246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f287247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f287248d = "https";

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f287246b = (int) timeUnit.toMillis(15L);
        f287247c = (int) timeUnit.toMillis(10L);
    }

    private b() {
    }

    @Override // ik.a
    @NonNull
    public HttpURLConnection a(@NonNull Uri uri) throws IOException {
        t.g(uri, "url must not be null");
        t.b("https".equals(uri.getScheme()), "only https connections are permitted");
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
        httpURLConnection.setConnectTimeout(f287246b);
        httpURLConnection.setReadTimeout(f287247c);
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }
}
