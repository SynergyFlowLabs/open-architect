package androidx.media.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.annotation.b1;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.core.app.t;
import androidx.core.app.w;
import androidx.media.j;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: androidx.media.app.a$a, reason: collision with other inner class name */
    @w0(15)
    private static class C0491a {
        private C0491a() {
        }

        @u
        static void a(RemoteViews remoteViews, int viewId, CharSequence contentDescription) {
            remoteViews.setContentDescription(viewId, contentDescription);
        }
    }

    @w0(21)
    private static class b {
        private b() {
        }

        @u
        static Notification.MediaStyle a() {
            return new Notification.MediaStyle();
        }

        @u
        static Notification.MediaStyle b(Notification.MediaStyle style, int[] actionsToShowInCompact, MediaSessionCompat.Token token) {
            if (actionsToShowInCompact != null) {
                e(style, actionsToShowInCompact);
            }
            if (token != null) {
                c(style, (MediaSession.Token) token.g());
            }
            return style;
        }

        @u
        static void c(Notification.MediaStyle style, MediaSession.Token token) {
            style.setMediaSession(token);
        }

        @u
        static void d(Notification.Builder builder, Notification.MediaStyle style) {
            builder.setStyle(style);
        }

        @u
        static void e(Notification.MediaStyle style, int... actions) {
            style.setShowActionsInCompactView(actions);
        }
    }

    @w0(24)
    private static class c {
        private c() {
        }

        @u
        static Notification.DecoratedMediaCustomViewStyle a() {
            return new Notification.DecoratedMediaCustomViewStyle();
        }
    }

    public static class d extends e {
        private void K(RemoteViews views) {
            views.setInt(j.b.f52939o, "setBackgroundColor", this.f47450a.r() != 0 ? this.f47450a.r() : this.f47450a.f47355a.getResources().getColor(j.a.f52922a));
        }

        @Override // androidx.media.app.a.e
        int D(int actionCount) {
            return actionCount <= 3 ? j.d.f52950f : j.d.f52948d;
        }

        @Override // androidx.media.app.a.e
        int E() {
            return this.f47450a.s() != null ? j.d.f52953i : super.E();
        }

        @Override // androidx.media.app.a.e, androidx.core.app.w.y
        @b1({b1.a.LIBRARY})
        public void b(t builder) {
            b.d(builder.a(), b.b(c.a(), this.f52734e, this.f52735f));
        }

        @Override // androidx.media.app.a.e, androidx.core.app.w.y
        @b1({b1.a.LIBRARY})
        public RemoteViews v(t builder) {
            return null;
        }

        @Override // androidx.media.app.a.e, androidx.core.app.w.y
        @b1({b1.a.LIBRARY})
        public RemoteViews w(t builder) {
            return null;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY})
        public RemoteViews x(t builder) {
            return null;
        }
    }

    private a() {
    }

    public static class e extends w.y {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f52732i = 3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f52733j = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int[] f52734e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        MediaSessionCompat.Token f52735f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f52736g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f52737h;

        public e() {
        }

        private RemoteViews C(w.b action) {
            boolean z10 = action.a() == null;
            RemoteViews remoteViews = new RemoteViews(this.f47450a.f47355a.getPackageName(), j.d.f52945a);
            remoteViews.setImageViewResource(j.b.f52925a, action.e());
            if (!z10) {
                remoteViews.setOnClickPendingIntent(j.b.f52925a, action.a());
            }
            C0491a.a(remoteViews, j.b.f52925a, action.j());
            return remoteViews;
        }

        public static MediaSessionCompat.Token F(Notification notification) {
            Parcelable parcelable;
            Bundle bundleN = w.n(notification);
            if (bundleN == null || (parcelable = bundleN.getParcelable(w.f47206d0)) == null) {
                return null;
            }
            return MediaSessionCompat.Token.b(parcelable);
        }

        RemoteViews A() {
            int iMin = Math.min(this.f47450a.f47356b.size(), 5);
            RemoteViews remoteViewsC = c(false, D(iMin), false);
            remoteViewsC.removeAllViews(j.b.f52934j);
            if (iMin > 0) {
                for (int i10 = 0; i10 < iMin; i10++) {
                    remoteViewsC.addView(j.b.f52934j, C(this.f47450a.f47356b.get(i10)));
                }
            }
            if (!this.f52736g) {
                remoteViewsC.setViewVisibility(j.b.f52927c, 8);
                return remoteViewsC;
            }
            remoteViewsC.setViewVisibility(j.b.f52927c, 0);
            remoteViewsC.setInt(j.b.f52927c, "setAlpha", this.f47450a.f47355a.getResources().getInteger(j.c.f52944a));
            remoteViewsC.setOnClickPendingIntent(j.b.f52927c, this.f52737h);
            return remoteViewsC;
        }

        RemoteViews B() {
            int i10 = 2 | 1;
            RemoteViews remoteViewsC = c(false, E(), true);
            int size = this.f47450a.f47356b.size();
            int[] iArr = this.f52734e;
            int iMin = iArr == null ? 0 : Math.min(iArr.length, 3);
            remoteViewsC.removeAllViews(j.b.f52934j);
            if (iMin > 0) {
                for (int i11 = 0; i11 < iMin; i11++) {
                    if (i11 >= size) {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i11), Integer.valueOf(size - 1)));
                    }
                    remoteViewsC.addView(j.b.f52934j, C(this.f47450a.f47356b.get(this.f52734e[i11])));
                }
            }
            if (!this.f52736g) {
                remoteViewsC.setViewVisibility(j.b.f52929e, 0);
                remoteViewsC.setViewVisibility(j.b.f52927c, 8);
                return remoteViewsC;
            }
            remoteViewsC.setViewVisibility(j.b.f52929e, 8);
            remoteViewsC.setViewVisibility(j.b.f52927c, 0);
            remoteViewsC.setOnClickPendingIntent(j.b.f52927c, this.f52737h);
            remoteViewsC.setInt(j.b.f52927c, "setAlpha", this.f47450a.f47355a.getResources().getInteger(j.c.f52944a));
            return remoteViewsC;
        }

        int D(int actionCount) {
            return actionCount <= 3 ? j.d.f52949e : j.d.f52947c;
        }

        int E() {
            return j.d.f52952h;
        }

        public e G(PendingIntent pendingIntent) {
            this.f52737h = pendingIntent;
            return this;
        }

        public e H(MediaSessionCompat.Token token) {
            this.f52735f = token;
            return this;
        }

        public e I(int... actions) {
            this.f52734e = actions;
            return this;
        }

        public e J(boolean show) {
            return this;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY})
        public void b(t builder) {
            b.d(builder.a(), b.b(b.a(), this.f52734e, this.f52735f));
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY})
        public RemoteViews v(t builder) {
            return null;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY})
        public RemoteViews w(t builder) {
            return null;
        }

        public e(w.n builder) {
            z(builder);
        }
    }
}
