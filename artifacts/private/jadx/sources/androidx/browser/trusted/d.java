package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes.dex */
@w0(23)
@b1({b1.a.LIBRARY})
public class d {
    private d() {
    }

    @NonNull
    static Parcelable[] a(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
