package androidx.media3.common.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
@e.a({"InlinedApi"})
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f61567a = -1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f61568b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f61569c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f61570d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f61571e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f61572f = 4;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private l0() {
    }

    public static void a(Context context, String str, @androidx.annotation.f1 int i10, @androidx.annotation.f1 int i11, int i12) {
        if (k1.f61540a >= 26) {
            NotificationManager notificationManager = (NotificationManager) androidx.media3.common.util.a.g((NotificationManager) context.getSystemService("notification"));
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i10), i12);
            if (i11 != 0) {
                notificationChannel.setDescription(context.getString(i11));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static void b(Context context, int i10, @androidx.annotation.p0 Notification notification) {
        NotificationManager notificationManager = (NotificationManager) androidx.media3.common.util.a.g((NotificationManager) context.getSystemService("notification"));
        if (notification != null) {
            notificationManager.notify(i10, notification);
        } else {
            notificationManager.cancel(i10);
        }
    }
}
