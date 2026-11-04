package ik;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes4.dex */
public interface a {
    @NonNull
    HttpURLConnection a(@NonNull Uri uri) throws IOException;
}
