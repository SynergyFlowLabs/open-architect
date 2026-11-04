package androidx.browser.trusted;

import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f11974b = "Token";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final j f11975a;

    private h(@NonNull j jVar) {
        this.f11975a = jVar;
    }

    @p0
    public static h a(@NonNull String str, @NonNull PackageManager packageManager) {
        List<byte[]> listB = f.b(str, packageManager);
        if (listB == null) {
            return null;
        }
        try {
            return new h(j.c(str, listB));
        } catch (IOException unused) {
            return null;
        }
    }

    @NonNull
    public static h b(@NonNull byte[] bArr) {
        return new h(j.e(bArr));
    }

    public boolean c(@NonNull String str, @NonNull PackageManager packageManager) {
        return f.d(str, packageManager, this.f11975a);
    }

    @NonNull
    public byte[] d() {
        return this.f11975a.j();
    }
}
