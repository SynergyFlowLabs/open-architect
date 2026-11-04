package androidx.media2.exoplayer.external.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.b1;
import androidx.annotation.f1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"InlinedApi"})
@b1({b1.a.LIBRARY_GROUP})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f57710a = -1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f57711b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f57712c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f57713d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f57714e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f57715f = 4;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private v() {
    }

    @Deprecated
    public static void a(Context context, String id2, @f1 int nameResourceId, int importance) {
        b(context, id2, nameResourceId, 0, importance);
    }

    public static void b(Context context, String id2, @f1 int nameResourceId, @f1 int descriptionResourceId, int importance) {
        if (q0.f57626a >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel(id2, context.getString(nameResourceId), importance);
            if (descriptionResourceId != 0) {
                notificationChannel.setDescription(context.getString(descriptionResourceId));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static void c(Context context, int id2, @androidx.annotation.p0 Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notification != null) {
            notificationManager.notify(id2, notification);
        } else {
            notificationManager.cancel(id2);
        }
    }
}
