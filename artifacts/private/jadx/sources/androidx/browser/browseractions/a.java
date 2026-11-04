package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.v;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final PendingIntent f11742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @v
    private int f11743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Uri f11744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private Runnable f11745e;

    public a(@NonNull String str, @NonNull PendingIntent pendingIntent, @v int i10) {
        this.f11741a = str;
        this.f11742b = pendingIntent;
        this.f11743c = i10;
    }

    @NonNull
    public PendingIntent a() {
        PendingIntent pendingIntent = this.f11742b;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public int b() {
        return this.f11743c;
    }

    @b1({b1.a.LIBRARY})
    @p0
    public Uri c() {
        return this.f11744d;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    Runnable d() {
        return this.f11745e;
    }

    @NonNull
    public String e() {
        return this.f11741a;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public a(@NonNull String str, @NonNull PendingIntent pendingIntent, @NonNull Uri uri) {
        this.f11741a = str;
        this.f11742b = pendingIntent;
        this.f11744d = uri;
    }

    a(@NonNull String str, @NonNull Runnable runnable) {
        this.f11741a = str;
        this.f11742b = null;
        this.f11745e = runnable;
    }

    public a(@NonNull String str, @NonNull PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }
}
