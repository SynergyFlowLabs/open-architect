package io.noties.markwon.image.destination;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes8.dex */
public class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f297641a;

    public c(@NonNull String str) {
        this.f297641a = e(str);
    }

    @NonNull
    public static c c(@NonNull String str) {
        return new c(str);
    }

    public static c d(@NonNull URL url) {
        return new c(url);
    }

    @p0
    private static URL e(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // io.noties.markwon.image.destination.a
    @NonNull
    public String b(@NonNull String str) {
        if (this.f297641a != null) {
            try {
                return new URL(this.f297641a, str).toString();
            } catch (MalformedURLException e10) {
                e10.printStackTrace();
            }
        }
        return str;
    }

    public c(@NonNull URL url) {
        this.f297641a = url;
    }
}
