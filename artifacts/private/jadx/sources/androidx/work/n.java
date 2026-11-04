package androidx.work;

import android.app.Notification;
import androidx.annotation.NonNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f77410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f77411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Notification f77412c;

    public n(int notificationId, @NonNull Notification notification) {
        this(notificationId, notification, 0);
    }

    public int a() {
        return this.f77411b;
    }

    @NonNull
    public Notification b() {
        return this.f77412c;
    }

    public int c() {
        return this.f77410a;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 != null && n.class == o10.getClass()) {
            n nVar = (n) o10;
            if (this.f77410a == nVar.f77410a && this.f77411b == nVar.f77411b) {
                return this.f77412c.equals(nVar.f77412c);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f77410a * 31) + this.f77411b) * 31) + this.f77412c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f77410a + ", mForegroundServiceType=" + this.f77411b + ", mNotification=" + this.f77412c + AbstractJsonLexerKt.END_OBJ;
    }

    public n(int notificationId, @NonNull Notification notification, int foregroundServiceType) {
        this.f77410a = notificationId;
        this.f77412c = notification;
        this.f77411b = foregroundServiceType;
    }
}
