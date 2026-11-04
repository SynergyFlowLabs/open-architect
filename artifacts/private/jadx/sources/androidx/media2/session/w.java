package androidx.media2.session;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f59438b = "androidx.media2.session.MediaSessionService";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f59439a = b();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f59440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Notification f59441b;

        public a(int i10, @NonNull Notification notification) {
            if (notification == null) {
                throw new NullPointerException("notification shouldn't be null");
            }
            this.f59440a = i10;
            this.f59441b = notification;
        }

        @NonNull
        public Notification a() {
            return this.f59441b;
        }

        public int b() {
            return this.f59440a;
        }
    }

    interface b {
        IBinder a(Intent intent);

        void b();

        void c(MediaSession mediaSession);

        List<MediaSession> d();

        void e(MediaSession mediaSession);

        a f(MediaSession mediaSession);

        int g(Intent intent, int i10, int i11);

        void h(w wVar);
    }

    public final void a(@NonNull MediaSession mediaSession) {
        if (mediaSession == null) {
            throw new NullPointerException("session shouldn't be null");
        }
        if (mediaSession.isClosed()) {
            throw new IllegalArgumentException("session is already closed");
        }
        this.f59439a.c(mediaSession);
    }

    b b() {
        return new x();
    }

    @NonNull
    public final List<MediaSession> c() {
        return this.f59439a.d();
    }

    @p0
    public abstract MediaSession d(@NonNull MediaSession.d dVar);

    @p0
    public a e(@NonNull MediaSession mediaSession) {
        if (mediaSession != null) {
            return this.f59439a.f(mediaSession);
        }
        throw new NullPointerException("session shouldn't be null");
    }

    public final void f(@NonNull MediaSession mediaSession) {
        if (mediaSession == null) {
            throw new NullPointerException("session shouldn't be null");
        }
        this.f59439a.e(mediaSession);
    }

    @Override // android.app.Service
    @androidx.annotation.i
    @p0
    public IBinder onBind(@NonNull Intent intent) {
        return this.f59439a.a(intent);
    }

    @Override // android.app.Service
    @androidx.annotation.i
    public void onCreate() {
        super.onCreate();
        this.f59439a.h(this);
    }

    @Override // android.app.Service
    @androidx.annotation.i
    public void onDestroy() {
        super.onDestroy();
        this.f59439a.b();
    }

    @Override // android.app.Service
    @androidx.annotation.i
    public int onStartCommand(Intent intent, int i10, int i11) {
        return this.f59439a.g(intent, i10, i11);
    }
}
