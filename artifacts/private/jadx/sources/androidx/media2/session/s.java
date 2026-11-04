package androidx.media2.session;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.media2.common.MediaMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class s extends MediaSession.f.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f59207i = 1001;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f59208j = "default_channel_id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f59209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.core.app.c0 f59210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Intent f59212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.core.app.w.b f59213e = d(b0.a.f58773c, b0.b.f58778c, 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.core.app.w.b f59214f = d(b0.a.f58772b, b0.b.f58777b, 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.core.app.w.b f59215g = d(b0.a.f58775e, b0.b.f58780e, 16);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.core.app.w.b f59216h = d(b0.a.f58774d, b0.b.f58779d, 32);

    s(w wVar) {
        this.f59209a = wVar;
        this.f59212d = new Intent(wVar, wVar.getClass());
        this.f59210b = androidx.core.app.c0.q(wVar);
        this.f59211c = wVar.getResources().getString(b0.b.f58776a);
    }

    private androidx.core.app.w.b d(int i10, int i11, long j10) {
        return new androidx.core.app.w.b(i10, this.f59209a.getResources().getText(i11), e(j10));
    }

    private PendingIntent e(long j10) {
        int iP = PlaybackStateCompat.p(j10);
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        w wVar = this.f59209a;
        intent.setComponent(new ComponentName(wVar, wVar.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, iP));
        return (j10 == 2 || j10 == 1) ? PendingIntent.getService(this.f59209a, iP, intent, 67108864) : androidx.media2.common.b.c.a.a(this.f59209a, iP, intent, 67108864);
    }

    private void f() {
        if (this.f59210b.v(f59208j) != null) {
            return;
        }
        this.f59210b.g(new androidx.core.app.u.d(f59208j, 2).h(this.f59211c).a());
    }

    private int g() {
        int i10 = this.f59209a.getApplicationInfo().icon;
        return i10 != 0 ? i10 : b0.a.f58771a;
    }

    static boolean h(int i10) {
        return i10 == 1 || i10 == 0 || i10 == 3;
    }

    private void j() {
        List<MediaSession> listC = this.f59209a.c();
        for (int i10 = 0; i10 < listC.size(); i10++) {
            if (!h(listC.get(i10).J5().s0())) {
                return;
            }
        }
        this.f59209a.stopForeground(false);
    }

    @Override // androidx.media2.session.MediaSession.f.a
    public void a(MediaSession mediaSession) {
        w.a aVarE = this.f59209a.e(mediaSession);
        if (aVarE == null) {
            return;
        }
        int iB = aVarE.b();
        Notification notificationA = aVarE.a();
        notificationA.extras.putParcelable(androidx.core.app.w.f47206d0, (android.media.session.MediaSession.Token) mediaSession.cb().i().g());
        this.f59210b.F(iB, notificationA);
    }

    @Override // androidx.media2.session.MediaSession.f.a
    public void b(MediaSession mediaSession, int i10) {
        w.a aVarE = this.f59209a.e(mediaSession);
        if (aVarE == null) {
            return;
        }
        int iB = aVarE.b();
        Notification notificationA = aVarE.a();
        notificationA.extras.putParcelable(androidx.core.app.w.f47206d0, (android.media.session.MediaSession.Token) mediaSession.cb().i().g());
        if (h(i10)) {
            j();
            this.f59210b.F(iB, notificationA);
        } else {
            androidx.core.content.d.B(this.f59209a, this.f59212d);
            this.f59209a.startForeground(iB, notificationA);
        }
    }

    @Override // androidx.media2.session.MediaSession.f.a
    public void c(MediaSession mediaSession) {
        this.f59209a.f(mediaSession);
        j();
    }

    public w.a i(MediaSession mediaSession) {
        MediaMetadata mediaMetadataM;
        f();
        androidx.core.app.w.n nVar = new androidx.core.app.w.n(this.f59209a, f59208j);
        nVar.b(this.f59215g);
        if (mediaSession.J5().s0() == 2) {
            nVar.b(this.f59214f);
        } else {
            nVar.b(this.f59213e);
        }
        nVar.b(this.f59216h);
        if (mediaSession.J5().Z() != null && (mediaMetadataM = mediaSession.J5().Z().m()) != null) {
            CharSequence charSequenceR = mediaMetadataM.r("android.media.metadata.DISPLAY_TITLE");
            if (charSequenceR == null) {
                charSequenceR = mediaMetadataM.r("android.media.metadata.TITLE");
            }
            nVar.O(charSequenceR).N(mediaMetadataM.r("android.media.metadata.ARTIST")).b0(mediaMetadataM.k("android.media.metadata.ALBUM_ART"));
        }
        return new w.a(1001, nVar.M(mediaSession.b().M()).T(e(1L)).j0(true).t0(g()).z0(new androidx.media.app.a.e().G(e(1L)).H(mediaSession.cb().i()).I(1)).G0(1).i0(false).h());
    }
}
