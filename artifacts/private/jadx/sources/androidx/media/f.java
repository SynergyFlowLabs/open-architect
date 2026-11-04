package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f52901b = "MediaSessionManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final boolean f52902c = Log.isLoggable(f52901b, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f52903d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile f f52904e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f52905a;

    interface a {
        boolean a(c userInfo);

        Context getContext();
    }

    interface c {
        int a();

        int b();

        String getPackageName();
    }

    private f(Context context) {
        this.f52905a = new h(context);
    }

    @NonNull
    public static f b(@NonNull Context context) {
        f fVar;
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        synchronized (f52903d) {
            try {
                if (f52904e == null) {
                    f52904e = new f(context.getApplicationContext());
                }
                fVar = f52904e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    Context a() {
        return this.f52905a.getContext();
    }

    public boolean c(@NonNull b userInfo) {
        if (userInfo != null) {
            return this.f52905a.a(userInfo.f52909a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f52906b = "android.media.session.MediaController";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public static final int f52907c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public static final int f52908d = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f52909a;

        public b(@NonNull String packageName, int pid, int uid) {
            if (packageName == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(packageName)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            this.f52909a = new h.a(packageName, pid, uid);
        }

        @NonNull
        public String a() {
            return this.f52909a.getPackageName();
        }

        public int b() {
            return this.f52909a.b();
        }

        public int c() {
            return this.f52909a.a();
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f52909a.equals(((b) obj).f52909a);
            }
            return false;
        }

        public int hashCode() {
            return this.f52909a.hashCode();
        }

        @w0(28)
        @b1({b1.a.LIBRARY})
        public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String strC = h.a.c(remoteUserInfo);
            if (strC == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (!TextUtils.isEmpty(strC)) {
                this.f52909a = new h.a(remoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }
}
