package androidx.media2.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b {

    public static final class a {

        /* JADX INFO: renamed from: androidx.media2.common.b$a$a, reason: collision with other inner class name */
        @w0(21)
        public static final class C0497a {
            private C0497a() {
            }

            @u
            public static boolean a(@NonNull AudioManager audioManager) {
                return audioManager.isVolumeFixed();
            }
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.media2.common.b$b, reason: collision with other inner class name */
    public static final class C0498b {

        /* JADX INFO: renamed from: androidx.media2.common.b$b$a */
        @w0(18)
        public static final class a {
            private a() {
            }

            @u
            public static boolean a(@NonNull HandlerThread handlerThread) {
                return handlerThread.quitSafely();
            }
        }

        private C0498b() {
        }
    }

    public static final class c {

        @w0(26)
        public static final class a {
            private a() {
            }

            @u
            @p0
            public static PendingIntent a(@NonNull Context context, int i10, @NonNull Intent intent, int i11) {
                return PendingIntent.getForegroundService(context, i10, intent, i11);
            }
        }

        private c() {
        }
    }

    private b() {
    }
}
