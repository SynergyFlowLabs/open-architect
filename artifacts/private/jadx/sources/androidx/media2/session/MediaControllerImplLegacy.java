package androidx.media2.session;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.Rating;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.VideoSize;
import com.google.common.util.concurrent.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class MediaControllerImplLegacy implements MediaController.g {

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f58531j3 = -1;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final long f58533l3 = 100;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    static final String f58534m3 = "android.media.session.command.ON_EXTRAS_CHANGED";

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    static final String f58535n3 = "android.media.session.command.ON_CAPTIONING_ENALBED_CHANGED";

    @androidx.annotation.b0("mLock")
    PlaybackStateCompat H1;

    @androidx.annotation.b0("mLock")
    MediaController.PlaybackInfo X;

    @androidx.annotation.b0("mLock")
    SessionCommandGroup Y;

    @androidx.annotation.b0("mLock")
    List<MediaSession.CommandButton> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f58536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final SessionToken f58537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final HandlerThread f58538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Handler f58539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Object f58540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    MediaController f58541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    MediaBrowserCompat f58542g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    boolean f58543g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    boolean f58544h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private g f58545h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    List<MediaItem> f58546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List<MediaSessionCompat.QueueItem> f58547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    MediaMetadata f58548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    int f58549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    int f58550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    int f58551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    MediaItem f58552o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    MediaControllerCompat f58553p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    f f58554p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    MediaMetadataCompat f58555p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    int f58556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f58557t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    int f58558v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    long f58559w;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final String f58530i3 = "MC2ImplLegacy";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    static final boolean f58532k3 = Log.isLoggable(f58530i3, 3);

    class a implements MediaController.f {
        a() {
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            eVar.f(MediaControllerImplLegacy.this.f58541f);
        }
    }

    class b implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SessionCommandGroup f58563a;

        b(SessionCommandGroup sessionCommandGroup) {
            this.f58563a = sessionCommandGroup;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            eVar.c(MediaControllerImplLegacy.this.f58541f, this.f58563a);
        }
    }

    class c implements MediaController.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f58565a;

        c(List list) {
            this.f58565a = list;
        }

        @Override // androidx.media2.session.MediaController.f
        public void a(@NonNull MediaController.e eVar) {
            eVar.o(MediaControllerImplLegacy.this.f58541f, this.f58565a);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (MediaControllerImplLegacy.this.f58540e) {
                MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                MediaControllerImplLegacy mediaControllerImplLegacy2 = MediaControllerImplLegacy.this;
                mediaControllerImplLegacy.f58542g = new MediaBrowserCompat(mediaControllerImplLegacy2.f58536a, mediaControllerImplLegacy2.f58537b.f5(), MediaControllerImplLegacy.this.new e(), null);
                MediaControllerImplLegacy.this.f58542g.a();
            }
        }
    }

    private class e extends MediaBrowserCompat.c {
        e() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void a() {
            MediaBrowserCompat mediaBrowserCompatNb = MediaControllerImplLegacy.this.nb();
            if (mediaBrowserCompatNb != null) {
                MediaControllerImplLegacy.this.b(mediaBrowserCompatNb.h());
            } else if (MediaControllerImplLegacy.f58532k3) {
                new IllegalStateException();
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void b() {
            MediaControllerImplLegacy.this.close();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void c() {
            MediaControllerImplLegacy.this.close();
        }
    }

    private final class f extends MediaControllerCompat.a {

        class a implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaItem f58570a;

            a(MediaItem mediaItem) {
                this.f58570a = mediaItem;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.d(MediaControllerImplLegacy.this.f58541f, this.f58570a);
            }
        }

        class b implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f58572a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MediaMetadata f58573b;

            b(List list, MediaMetadata mediaMetadata) {
                this.f58572a = list;
                this.f58573b = mediaMetadata;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.k(MediaControllerImplLegacy.this.f58541f, this.f58572a, this.f58573b);
            }
        }

        class c implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaMetadata f58575a;

            c(MediaMetadata mediaMetadata) {
                this.f58575a = mediaMetadata;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.l(MediaControllerImplLegacy.this.f58541f, this.f58575a);
            }
        }

        class d implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f58577a;

            d(Bundle bundle) {
                this.f58577a = bundle;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.e(MediaControllerImplLegacy.this.f58541f, new SessionCommand(MediaControllerImplLegacy.f58534m3, null), this.f58577a);
            }
        }

        class e implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaController.PlaybackInfo f58579a;

            e(MediaController.PlaybackInfo playbackInfo) {
                this.f58579a = playbackInfo;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.h(MediaControllerImplLegacy.this.f58541f, this.f58579a);
            }
        }

        /* JADX INFO: renamed from: androidx.media2.session.MediaControllerImplLegacy$f$f, reason: collision with other inner class name */
        class C0541f implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f58581a;

            C0541f(boolean z10) {
                this.f58581a = z10;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("androidx.media2.argument.CAPTIONING_ENABLED", this.f58581a);
                eVar.e(MediaControllerImplLegacy.this.f58541f, new SessionCommand(MediaControllerImplLegacy.f58535n3, null), bundle);
            }
        }

        class g implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f58583a;

            g(int i10) {
                this.f58583a = i10;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.m(MediaControllerImplLegacy.this.f58541f, this.f58583a);
            }
        }

        class h implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f58585a;

            h(int i10) {
                this.f58585a = i10;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.p(MediaControllerImplLegacy.this.f58541f, this.f58585a);
            }
        }

        class i implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f58587a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f58588b;

            i(String str, Bundle bundle) {
                this.f58587a = str;
                this.f58588b = bundle;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.e(MediaControllerImplLegacy.this.f58541f, new SessionCommand(this.f58587a, null), this.f58588b);
            }
        }

        class j implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaItem f58590a;

            j(MediaItem mediaItem) {
                this.f58590a = mediaItem;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.d(MediaControllerImplLegacy.this.f58541f, this.f58590a);
            }
        }

        class k implements MediaController.f {
            k() {
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.j(MediaControllerImplLegacy.this.f58541f, 0);
            }
        }

        class l implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PlaybackStateCompat f58593a;

            l(PlaybackStateCompat playbackStateCompat) {
                this.f58593a = playbackStateCompat;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.j(MediaControllerImplLegacy.this.f58541f, a0.r(this.f58593a));
            }
        }

        class m implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PlaybackStateCompat f58595a;

            m(PlaybackStateCompat playbackStateCompat) {
                this.f58595a = playbackStateCompat;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.i(MediaControllerImplLegacy.this.f58541f, this.f58595a.l());
            }
        }

        class n implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f58597a;

            n(long j10) {
                this.f58597a = j10;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.n(MediaControllerImplLegacy.this.f58541f, this.f58597a);
            }
        }

        class o implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SessionCommandGroup f58599a;

            o(SessionCommandGroup sessionCommandGroup) {
                this.f58599a = sessionCommandGroup;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.a(MediaControllerImplLegacy.this.f58541f, this.f58599a);
            }
        }

        class p implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f58601a;

            p(List list) {
                this.f58601a = list;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.o(MediaControllerImplLegacy.this.f58541f, this.f58601a);
            }
        }

        class q implements MediaController.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaItem f58603a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f58604b;

            q(MediaItem mediaItem, int i10) {
                this.f58603a = mediaItem;
                this.f58604b = i10;
            }

            @Override // androidx.media2.session.MediaController.f
            public void a(@NonNull MediaController.e eVar) {
                eVar.b(MediaControllerImplLegacy.this.f58541f, this.f58603a, this.f58604b);
            }
        }

        f() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void b(MediaControllerCompat.e eVar) {
            MediaController.PlaybackInfo playbackInfoG = a0.G(eVar);
            synchronized (MediaControllerImplLegacy.this.f58540e) {
                MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                if (!mediaControllerImplLegacy.f58544h && mediaControllerImplLegacy.f58543g3) {
                    mediaControllerImplLegacy.X = playbackInfoG;
                    mediaControllerImplLegacy.f58541f.g(new e(playbackInfoG));
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void c(boolean z10) {
            synchronized (MediaControllerImplLegacy.this.f58540e) {
                MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                if (!mediaControllerImplLegacy.f58544h && mediaControllerImplLegacy.f58543g3) {
                    mediaControllerImplLegacy.f58541f.h(new C0541f(z10));
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void d(Bundle bundle) {
            synchronized (MediaControllerImplLegacy.this.f58540e) {
                try {
                    MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                    if (!mediaControllerImplLegacy.f58544h && mediaControllerImplLegacy.f58543g3) {
                        mediaControllerImplLegacy.f58541f.h(new d(bundle));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void e(MediaMetadataCompat mediaMetadataCompat) {
            synchronized (MediaControllerImplLegacy.this.f58540e) {
                MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                if (!mediaControllerImplLegacy.f58544h && mediaControllerImplLegacy.f58543g3) {
                    MediaItem mediaItem = mediaControllerImplLegacy.f58552o;
                    mediaControllerImplLegacy.e(mediaMetadataCompat);
                    MediaControllerImplLegacy mediaControllerImplLegacy2 = MediaControllerImplLegacy.this;
                    MediaItem mediaItem2 = mediaControllerImplLegacy2.f58552o;
                    if (mediaItem != mediaItem2) {
                        mediaControllerImplLegacy2.f58541f.g(new a(mediaItem2));
                    }
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void f(PlaybackStateCompat playbackStateCompat) {
            synchronized (MediaControllerImplLegacy.this.f58540e) {
                try {
                    MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                    if (!mediaControllerImplLegacy.f58544h && mediaControllerImplLegacy.f58543g3) {
                        MediaItem mediaItem = mediaControllerImplLegacy.f58552o;
                        PlaybackStateCompat playbackStateCompat2 = mediaControllerImplLegacy.H1;
                        mediaControllerImplLegacy.H1 = playbackStateCompat;
                        mediaControllerImplLegacy.f58551n = a0.r(playbackStateCompat);
                        MediaControllerImplLegacy.this.f58559w = playbackStateCompat == null ? Long.MIN_VALUE : playbackStateCompat.e();
                        if (MediaControllerImplLegacy.this.f58547j != null && playbackStateCompat != null) {
                            for (int i10 = 0; i10 < MediaControllerImplLegacy.this.f58547j.size(); i10++) {
                                if (MediaControllerImplLegacy.this.f58547j.get(i10).e() == playbackStateCompat.c()) {
                                    MediaControllerImplLegacy mediaControllerImplLegacy2 = MediaControllerImplLegacy.this;
                                    mediaControllerImplLegacy2.f58557t = i10;
                                    mediaControllerImplLegacy2.f58552o = mediaControllerImplLegacy2.f58546i.get(i10);
                                }
                            }
                        }
                        MediaControllerImplLegacy mediaControllerImplLegacy3 = MediaControllerImplLegacy.this;
                        MediaItem mediaItem2 = mediaControllerImplLegacy3.f58552o;
                        List<MediaSession.CommandButton> list = mediaControllerImplLegacy3.Z;
                        mediaControllerImplLegacy3.Z = a0.f(playbackStateCompat);
                        MediaControllerImplLegacy mediaControllerImplLegacy4 = MediaControllerImplLegacy.this;
                        List<MediaSession.CommandButton> list2 = mediaControllerImplLegacy4.Z;
                        SessionCommandGroup sessionCommandGroup = mediaControllerImplLegacy4.Y;
                        mediaControllerImplLegacy4.Y = a0.x(mediaControllerImplLegacy4.f58553p0.f(), MediaControllerImplLegacy.this.H1);
                        MediaControllerImplLegacy mediaControllerImplLegacy5 = MediaControllerImplLegacy.this;
                        SessionCommandGroup sessionCommandGroup2 = mediaControllerImplLegacy5.Y;
                        if (mediaItem != mediaItem2) {
                            mediaControllerImplLegacy5.f58541f.g(new j(mediaItem2));
                        }
                        if (playbackStateCompat == null) {
                            if (playbackStateCompat2 != null) {
                                MediaControllerImplLegacy.this.f58541f.g(new k());
                                return;
                            }
                            return;
                        }
                        if (playbackStateCompat2 == null || playbackStateCompat2.o() != playbackStateCompat.o()) {
                            MediaControllerImplLegacy.this.f58541f.g(new l(playbackStateCompat));
                        }
                        if (playbackStateCompat2 == null || playbackStateCompat2.l() != playbackStateCompat.l()) {
                            MediaControllerImplLegacy.this.f58541f.g(new m(playbackStateCompat));
                        }
                        if (playbackStateCompat2 != null) {
                            long jF = playbackStateCompat.f(MediaControllerImplLegacy.this.f58541f.f58511g);
                            if (Math.abs(jF - playbackStateCompat2.f(MediaControllerImplLegacy.this.f58541f.f58511g)) > MediaControllerImplLegacy.f58533l3) {
                                MediaControllerImplLegacy.this.f58541f.g(new n(jF));
                            }
                        }
                        if (!sessionCommandGroup.equals(sessionCommandGroup2)) {
                            MediaControllerImplLegacy.this.f58541f.g(new o(sessionCommandGroup2));
                        }
                        if (list.size() != list2.size()) {
                            MediaControllerImplLegacy.this.f58541f.h(new p(list2));
                            break;
                        }
                        for (int i11 = 0; i11 < list2.size(); i11++) {
                            if (!androidx.core.util.o.a(list.get(i11).d(), list2.get(i11).d())) {
                                MediaControllerImplLegacy.this.f58541f.h(new p(list2));
                                break;
                            }
                        }
                        if (mediaItem2 == null) {
                            return;
                        }
                        int iF = a0.F(playbackStateCompat.o());
                        if (iF != (playbackStateCompat2 != null ? a0.F(playbackStateCompat2.o()) : 0)) {
                            MediaControllerImplLegacy.this.f58541f.g(new q(mediaItem2, iF));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void g(List<MediaSessionCompat.QueueItem> list) {
            synchronized (MediaControllerImplLegacy.this.f58540e) {
                try {
                    MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                    if (!mediaControllerImplLegacy.f58544h && mediaControllerImplLegacy.f58543g3) {
                        mediaControllerImplLegacy.f58547j = a0.E(list);
                        List<MediaSessionCompat.QueueItem> list2 = MediaControllerImplLegacy.this.f58547j;
                        if (list2 == null || list2.size() == 0) {
                            MediaControllerImplLegacy mediaControllerImplLegacy2 = MediaControllerImplLegacy.this;
                            mediaControllerImplLegacy2.f58547j = null;
                            mediaControllerImplLegacy2.f58546i = null;
                        } else {
                            MediaControllerImplLegacy mediaControllerImplLegacy3 = MediaControllerImplLegacy.this;
                            mediaControllerImplLegacy3.f58546i = a0.e(mediaControllerImplLegacy3.f58547j);
                        }
                        MediaControllerImplLegacy mediaControllerImplLegacy4 = MediaControllerImplLegacy.this;
                        mediaControllerImplLegacy4.f58541f.g(new b(mediaControllerImplLegacy4.f58546i, mediaControllerImplLegacy4.f58548k));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void h(CharSequence charSequence) {
            synchronized (MediaControllerImplLegacy.this.f58540e) {
                try {
                    MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                    if (!mediaControllerImplLegacy.f58544h && mediaControllerImplLegacy.f58543g3) {
                        mediaControllerImplLegacy.f58548k = a0.o(charSequence);
                        MediaControllerImplLegacy mediaControllerImplLegacy2 = MediaControllerImplLegacy.this;
                        mediaControllerImplLegacy2.f58541f.g(new c(mediaControllerImplLegacy2.f58548k));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void i(int i10) {
            synchronized (MediaControllerImplLegacy.this.f58540e) {
                try {
                    MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                    if (!mediaControllerImplLegacy.f58544h && mediaControllerImplLegacy.f58543g3) {
                        mediaControllerImplLegacy.f58549l = i10;
                        mediaControllerImplLegacy.f58541f.g(new g(i10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void j() {
            MediaControllerImplLegacy.this.close();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void k(String str, Bundle bundle) {
            synchronized (MediaControllerImplLegacy.this.f58540e) {
                try {
                    MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                    if (!mediaControllerImplLegacy.f58544h && mediaControllerImplLegacy.f58543g3) {
                        mediaControllerImplLegacy.f58541f.h(new i(str, bundle));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void l() {
            MediaControllerImplLegacy mediaControllerImplLegacy;
            boolean z10;
            PlaybackStateCompat playbackStateCompatL;
            int iU;
            int iP;
            boolean zW;
            synchronized (MediaControllerImplLegacy.this.f58540e) {
                mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                z10 = mediaControllerImplLegacy.f58543g3;
            }
            if (!z10) {
                mediaControllerImplLegacy.d();
                return;
            }
            synchronized (mediaControllerImplLegacy.f58540e) {
                try {
                    playbackStateCompatL = MediaControllerImplLegacy.this.f58553p0.l();
                    iU = MediaControllerImplLegacy.this.f58553p0.u();
                    iP = MediaControllerImplLegacy.this.f58553p0.p();
                    zW = MediaControllerImplLegacy.this.f58553p0.w();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f(playbackStateCompatL);
            m(iU);
            i(iP);
            c(zW);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void m(int i10) {
            synchronized (MediaControllerImplLegacy.this.f58540e) {
                try {
                    MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                    if (!mediaControllerImplLegacy.f58544h && mediaControllerImplLegacy.f58543g3) {
                        mediaControllerImplLegacy.f58550m = i10;
                        mediaControllerImplLegacy.f58541f.g(new h(i10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f58607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f58608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.concurrent.futures.e<SessionResult> f58609d;

        g(@NonNull String str, @NonNull String str2, @p0 Bundle bundle, @NonNull androidx.concurrent.futures.e<SessionResult> eVar) {
            this.f58606a = str;
            this.f58607b = str2;
            this.f58608c = bundle;
            this.f58609d = eVar;
        }
    }

    MediaControllerImplLegacy(@NonNull Context context, @NonNull MediaController mediaController, @NonNull SessionToken sessionToken) {
        Object obj = new Object();
        this.f58540e = obj;
        this.f58558v = -1;
        this.f58536a = context;
        this.f58541f = mediaController;
        HandlerThread handlerThread = new HandlerThread("MediaController_Thread");
        this.f58538c = handlerThread;
        handlerThread.start();
        this.f58539d = new Handler(handlerThread.getLooper());
        this.f58537b = sessionToken;
        if (sessionToken.c() != 0) {
            a();
            return;
        }
        synchronized (obj) {
            try {
                this.f58542g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b((MediaSessionCompat.Token) sessionToken.e5());
    }

    private void a() {
        this.f58539d.post(new d());
    }

    private t1<SessionResult> c(int i10) {
        androidx.concurrent.futures.e<SessionResult> eVarN = androidx.concurrent.futures.e.N();
        f(eVarN, i10);
        return eVarN;
    }

    private void f(androidx.concurrent.futures.e<SessionResult> eVar, int i10) {
        MediaItem mediaItem;
        synchronized (this.f58540e) {
            try {
                mediaItem = this.f58552o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        eVar.E(new SessionResult(i10, null, mediaItem));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> A() {
        byte b10;
        synchronized (this.f58540e) {
            try {
                if (!this.f58543g3) {
                    new IllegalStateException();
                    return c(-100);
                }
                g gVar = this.f58545h3;
                if (gVar == null) {
                    this.f58553p0.v().g();
                } else {
                    String str = gVar.f58606a;
                    int iHashCode = str.hashCode();
                    if (iHashCode != 3355) {
                        if (iHashCode != 116076) {
                            if (iHashCode == 107944136 && str.equals("query")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                        } else if (str.equals("uri")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                    } else if (str.equals("id")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        MediaControllerCompat.f fVarV = this.f58553p0.v();
                        g gVar2 = this.f58545h3;
                        fVarV.h(gVar2.f58607b, gVar2.f58608c);
                    } else if (b10 == 1) {
                        MediaControllerCompat.f fVarV2 = this.f58553p0.v();
                        g gVar3 = this.f58545h3;
                        fVarV2.i(gVar3.f58607b, gVar3.f58608c);
                    } else {
                        if (b10 != 2) {
                            this.f58545h3 = null;
                            return c(-2);
                        }
                        this.f58553p0.v().j(Uri.parse(this.f58545h3.f58607b), this.f58545h3.f58608c);
                    }
                    f(this.f58545h3.f58609d, 0);
                    this.f58545h3 = null;
                }
                return c(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    @NonNull
    public t1<SessionResult> A0(@NonNull SessionPlayer.TrackInfo trackInfo) {
        return c(-6);
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> A1(int i10, int i11) {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    this.f58553p0.c(i10, i11);
                    return c(0);
                }
                new IllegalStateException();
                return c(-100);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    @p0
    public SessionToken A3() {
        SessionToken sessionToken;
        synchronized (this.f58540e) {
            try {
                sessionToken = this.f58543g3 ? this.f58537b : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sessionToken;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> B() {
        byte b10;
        synchronized (this.f58540e) {
            try {
                if (!this.f58543g3) {
                    new IllegalStateException();
                    return c(-100);
                }
                g gVar = this.f58545h3;
                if (gVar == null) {
                    this.f58553p0.v().c();
                } else {
                    String str = gVar.f58606a;
                    int iHashCode = str.hashCode();
                    if (iHashCode != 3355) {
                        if (iHashCode != 116076) {
                            if (iHashCode == 107944136 && str.equals("query")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                        } else if (str.equals("uri")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                    } else if (str.equals("id")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        MediaControllerCompat.f fVarV = this.f58553p0.v();
                        g gVar2 = this.f58545h3;
                        fVarV.d(gVar2.f58607b, gVar2.f58608c);
                    } else if (b10 == 1) {
                        MediaControllerCompat.f fVarV2 = this.f58553p0.v();
                        g gVar3 = this.f58545h3;
                        fVarV2.e(gVar3.f58607b, gVar3.f58608c);
                    } else {
                        if (b10 != 2) {
                            this.f58545h3 = null;
                            return c(-2);
                        }
                        this.f58553p0.v().f(Uri.parse(this.f58545h3.f58607b), this.f58545h3.f58608c);
                    }
                    f(this.f58545h3.f58609d, 0);
                    this.f58545h3 = null;
                }
                return c(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public int C() {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    return this.f58549l;
                }
                new IllegalStateException();
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> D(int i10) {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    this.f58553p0.v().s(i10);
                    return c(0);
                }
                new IllegalStateException();
                return c(-100);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> D1() {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    this.f58553p0.v().a();
                    return c(0);
                }
                new IllegalStateException();
                return c(-100);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> F(long j10) {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    this.f58553p0.v().l(j10);
                    return c(0);
                }
                new IllegalStateException();
                return c(-100);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> G(float f10) {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    this.f58553p0.v().p(f10);
                    return c(0);
                }
                new IllegalStateException();
                return c(-100);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> G0(int i10) {
        synchronized (this.f58540e) {
            try {
                if (!this.f58543g3) {
                    new IllegalStateException();
                    return c(-100);
                }
                List<MediaSessionCompat.QueueItem> list = this.f58547j;
                if (list != null && i10 >= 0 && i10 < list.size()) {
                    this.f58553p0.A(this.f58547j.get(i10).c());
                    return c(0);
                }
                return c(-3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    @NonNull
    public List<SessionPlayer.TrackInfo> G1() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> H1(int i10) {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    this.f58558v = i10;
                    this.f58553p0.v().w(this.f58547j.get(i10).e());
                    return c(0);
                }
                new IllegalStateException();
                return c(-100);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    @p0
    public SessionPlayer.TrackInfo I1(int i10) {
        return null;
    }

    @Override // androidx.media2.session.MediaController.g
    public int J() {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    return this.f58550m;
                }
                new IllegalStateException();
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> K(int i10) {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    this.f58553p0.v().t(i10);
                    return c(0);
                }
                new IllegalStateException();
                return c(-100);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    @NonNull
    public t1<SessionResult> K0(@NonNull SessionPlayer.TrackInfo trackInfo) {
        return c(-6);
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> K6(int i10, @NonNull String str) {
        synchronized (this.f58540e) {
            try {
                if (!this.f58543g3) {
                    new IllegalStateException();
                    return c(-100);
                }
                List<MediaSessionCompat.QueueItem> list = this.f58547j;
                if (list != null && i10 >= 0 && i10 < list.size()) {
                    this.f58553p0.A(this.f58547j.get(i10).c());
                    this.f58553p0.b(a0.y(str), i10);
                    return c(0);
                }
                return c(-3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> Kc() {
        return c(-6);
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> L0(int i10, int i11) {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    this.f58553p0.E(i10, i11);
                    return c(0);
                }
                new IllegalStateException();
                return c(-100);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    @p0
    public PendingIntent M() {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    return this.f58553p0.r();
                }
                new IllegalStateException();
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> M8(@NonNull SessionCommand sessionCommand, @p0 Bundle bundle) {
        synchronized (this.f58540e) {
            try {
                if (!this.f58543g3) {
                    new IllegalStateException();
                    return c(-100);
                }
                if (this.Y.g(sessionCommand)) {
                    this.f58553p0.v().n(sessionCommand.f(), bundle);
                    return c(0);
                }
                final androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
                this.f58553p0.C(sessionCommand.f(), bundle, new ResultReceiver(this.f58539d) { // from class: androidx.media2.session.MediaControllerImplLegacy.2
                    @Override // android.os.ResultReceiver
                    protected void onReceiveResult(int i10, Bundle bundle2) {
                        eVarN.E(new SessionResult(i10, bundle2));
                    }
                });
                return eVarN;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> N0() {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    this.f58553p0.v().v();
                    return c(0);
                }
                new IllegalStateException();
                return c(-100);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> P() {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    this.f58553p0.v().k();
                    return c(0);
                }
                new IllegalStateException();
                return c(-100);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    @p0
    public MediaMetadata V() {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    return this.f58548k;
                }
                new IllegalStateException();
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    @p0
    public List<MediaItem> V0() {
        synchronized (this.f58540e) {
            try {
                ArrayList arrayList = null;
                if (!this.f58543g3) {
                    new IllegalStateException();
                    return null;
                }
                List<MediaItem> list = this.f58546i;
                if (list != null && list.size() != 0) {
                    arrayList = new ArrayList(this.f58546i);
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> Y0(@NonNull List<String> list, @p0 MediaMetadata mediaMetadata) {
        return c(-6);
    }

    @Override // androidx.media2.session.MediaController.g
    public MediaItem Z() {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    return this.f58552o;
                }
                new IllegalStateException();
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> Z0(int i10, int i11) {
        return c(-6);
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> Zb(@NonNull String str) {
        return c(-6);
    }

    @Override // androidx.media2.session.MediaController.g
    public int a0() {
        return -1;
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> a1(@p0 MediaMetadata mediaMetadata) {
        return c(-6);
    }

    void b(MediaSessionCompat.Token token) {
        boolean zX;
        MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.f58536a, token);
        synchronized (this.f58540e) {
            try {
                this.f58553p0 = mediaControllerCompat;
                this.f58554p1 = new f();
                zX = this.f58553p0.x();
                this.f58553p0.z(this.f58554p1, this.f58539d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zX) {
            return;
        }
        d();
    }

    @Override // androidx.media2.session.MediaController.g
    @p0
    public MediaController.PlaybackInfo b0() {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    return this.X;
                }
                new IllegalStateException();
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f58532k3) {
            Objects.toString(this.f58537b);
        }
        synchronized (this.f58540e) {
            try {
                if (this.f58544h) {
                    return;
                }
                this.f58539d.removeCallbacksAndMessages(null);
                androidx.media2.common.b.C0498b.a.a(this.f58538c);
                this.f58544h = true;
                MediaBrowserCompat mediaBrowserCompat = this.f58542g;
                if (mediaBrowserCompat != null) {
                    mediaBrowserCompat.b();
                    this.f58542g = null;
                }
                MediaControllerCompat mediaControllerCompat = this.f58553p0;
                if (mediaControllerCompat != null) {
                    mediaControllerCompat.F(this.f58554p1);
                    this.f58553p0 = null;
                }
                this.f58543g3 = false;
                this.f58541f.g(new a());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void d() {
        if (f58532k3) {
            Objects.toString(this.f58537b);
        }
        synchronized (this.f58540e) {
            try {
                if (!this.f58544h && !this.f58543g3) {
                    this.H1 = this.f58553p0.l();
                    this.Y = a0.x(this.f58553p0.f(), this.H1);
                    this.f58551n = a0.r(this.H1);
                    PlaybackStateCompat playbackStateCompat = this.H1;
                    this.f58559w = playbackStateCompat == null ? Long.MIN_VALUE : playbackStateCompat.e();
                    List<MediaSession.CommandButton> listF = a0.f(this.H1);
                    this.Z = listF;
                    SessionCommandGroup sessionCommandGroup = this.Y;
                    this.X = a0.G(this.f58553p0.k());
                    this.f58549l = this.f58553p0.p();
                    this.f58550m = this.f58553p0.u();
                    List<MediaSessionCompat.QueueItem> listE = a0.E(this.f58553p0.m());
                    this.f58547j = listE;
                    if (listE == null || listE.size() == 0) {
                        this.f58547j = null;
                        this.f58546i = null;
                    } else {
                        this.f58546i = a0.e(this.f58547j);
                    }
                    this.f58548k = a0.o(this.f58553p0.n());
                    e(this.f58553p0.i());
                    this.f58543g3 = true;
                    this.f58541f.g(new b(sessionCommandGroup));
                    if (!listF.isEmpty()) {
                        this.f58541f.h(new c(listF));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void e(MediaMetadataCompat mediaMetadataCompat) {
        this.f58555p2 = mediaMetadataCompat;
        int iO = this.f58553p0.o();
        if (mediaMetadataCompat == null) {
            this.f58557t = -1;
            this.f58552o = null;
            return;
        }
        if (this.f58547j == null) {
            this.f58557t = -1;
            this.f58552o = a0.k(mediaMetadataCompat, iO);
            return;
        }
        PlaybackStateCompat playbackStateCompat = this.H1;
        if (playbackStateCompat != null) {
            long jC = playbackStateCompat.c();
            for (int i10 = 0; i10 < this.f58547j.size(); i10++) {
                if (this.f58547j.get(i10).e() == jC) {
                    this.f58552o = a0.k(mediaMetadataCompat, iO);
                    this.f58557t = i10;
                    return;
                }
            }
        }
        String strJ = mediaMetadataCompat.j("android.media.metadata.MEDIA_ID");
        if (strJ == null) {
            this.f58557t = -1;
            this.f58552o = a0.k(mediaMetadataCompat, iO);
            return;
        }
        int i11 = this.f58558v;
        if (i11 >= 0 && i11 < this.f58547j.size() && TextUtils.equals(strJ, this.f58547j.get(this.f58558v).c().h())) {
            this.f58552o = a0.k(mediaMetadataCompat, iO);
            this.f58557t = this.f58558v;
            this.f58558v = -1;
            return;
        }
        for (int i12 = 0; i12 < this.f58547j.size(); i12++) {
            if (TextUtils.equals(strJ, this.f58547j.get(i12).c().h())) {
                this.f58557t = i12;
                this.f58552o = a0.k(mediaMetadataCompat, iO);
                return;
            }
        }
        this.f58557t = -1;
        this.f58552o = a0.k(this.f58555p2, iO);
    }

    @Override // androidx.media2.session.MediaController.g
    public int e0() {
        return -1;
    }

    @Override // androidx.media2.session.MediaController.g
    @NonNull
    public Context getContext() {
        return this.f58536a;
    }

    @Override // androidx.media2.session.MediaController.g
    public long getCurrentPosition() {
        synchronized (this.f58540e) {
            try {
                if (!this.f58543g3) {
                    new IllegalStateException();
                    return Long.MIN_VALUE;
                }
                PlaybackStateCompat playbackStateCompat = this.H1;
                if (playbackStateCompat == null) {
                    return Long.MIN_VALUE;
                }
                return playbackStateCompat.f(this.f58541f.f58511g);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public long getDuration() {
        synchronized (this.f58540e) {
            try {
                if (!this.f58543g3) {
                    new IllegalStateException();
                    return Long.MIN_VALUE;
                }
                MediaMetadataCompat mediaMetadataCompat = this.f58555p2;
                if (mediaMetadataCompat == null || !mediaMetadataCompat.a("android.media.metadata.DURATION")) {
                    return Long.MIN_VALUE;
                }
                return this.f58555p2.g("android.media.metadata.DURATION");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    @NonNull
    public VideoSize h0() {
        return new VideoSize(0, 0);
    }

    @Override // androidx.media2.session.MediaController.g
    public int i1() {
        synchronized (this.f58540e) {
            try {
                int iF = 0;
                if (!this.f58543g3) {
                    new IllegalStateException();
                    return 0;
                }
                PlaybackStateCompat playbackStateCompat = this.H1;
                if (playbackStateCompat != null) {
                    iF = a0.F(playbackStateCompat.o());
                }
                return iF;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public boolean isConnected() {
        boolean z10;
        synchronized (this.f58540e) {
            z10 = this.f58543g3;
        }
        return z10;
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> k9(int i10, @NonNull String str) {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    this.f58553p0.b(a0.y(str), i10);
                    return c(0);
                }
                new IllegalStateException();
                return c(-100);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public int l0() {
        return this.f58557t;
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> m3() {
        return c(-6);
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> n0() {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    this.f58553p0.v().u();
                    return c(0);
                }
                new IllegalStateException();
                return c(-100);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    @p0
    public MediaBrowserCompat nb() {
        MediaBrowserCompat mediaBrowserCompat;
        synchronized (this.f58540e) {
            try {
                mediaBrowserCompat = this.f58542g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaBrowserCompat;
    }

    @Override // androidx.media2.session.MediaController.g
    public SessionCommandGroup p6() {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    return this.Y;
                }
                new IllegalStateException();
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> pause() {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    this.f58553p0.v().b();
                    return c(0);
                }
                new IllegalStateException();
                return c(-100);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> q5(@NonNull Uri uri, @p0 Bundle bundle) {
        synchronized (this.f58540e) {
            try {
                if (!this.f58543g3) {
                    new IllegalStateException();
                    return c(-100);
                }
                g gVar = this.f58545h3;
                if (gVar != null) {
                    f(gVar.f58609d, 1);
                    this.f58545h3 = null;
                }
                androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
                if (uri.toString().startsWith(h.f58915h) && uri.getQueryParameterNames().size() == 1) {
                    String next = uri.getQueryParameterNames().iterator().next();
                    if (TextUtils.equals(next, "id") || TextUtils.equals(next, "query") || TextUtils.equals(next, "uri")) {
                        this.f58545h3 = new g(next, uri.getQueryParameter(next), bundle, eVarN);
                    }
                }
                if (this.f58545h3 == null) {
                    this.f58545h3 = new g("uri", uri.toString(), bundle, eVarN);
                }
                return eVarN;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public int s0() {
        synchronized (this.f58540e) {
            try {
                if (this.f58543g3) {
                    return this.f58551n;
                }
                new IllegalStateException();
                return 3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public float t0() {
        synchronized (this.f58540e) {
            try {
                float fL = 0.0f;
                if (!this.f58543g3) {
                    new IllegalStateException();
                    return 0.0f;
                }
                PlaybackStateCompat playbackStateCompat = this.H1;
                if (playbackStateCompat != null) {
                    fL = playbackStateCompat.l();
                }
                return fL;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public long v() {
        synchronized (this.f58540e) {
            try {
                long jE = Long.MIN_VALUE;
                if (!this.f58543g3) {
                    new IllegalStateException();
                    return Long.MIN_VALUE;
                }
                PlaybackStateCompat playbackStateCompat = this.H1;
                if (playbackStateCompat != null) {
                    jE = playbackStateCompat.e();
                }
                return jE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> xc(@NonNull String str, @NonNull Rating rating) {
        synchronized (this.f58540e) {
            try {
                if (!this.f58543g3) {
                    new IllegalStateException();
                    return c(-100);
                }
                MediaItem mediaItem = this.f58552o;
                if (mediaItem != null && str.equals(mediaItem.l())) {
                    this.f58553p0.v().q(a0.v(rating));
                }
                return c(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.MediaController.g
    public t1<SessionResult> z0(@p0 Surface surface) {
        return c(-6);
    }
}
