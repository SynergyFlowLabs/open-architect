package androidx.media2.session;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.MediaParcelUtils;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class n extends androidx.media2.session.b.AbstractBinderC0546b {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final String f59068h3 = "MediaControllerStub";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final boolean f59069i3 = true;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final WeakReference<androidx.media2.session.k> f59070g3;

    class a implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59071a;

        a(ParcelImpl parcelImpl) {
            this.f59071a = parcelImpl;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            MediaController.PlaybackInfo playbackInfo = (MediaController.PlaybackInfo) MediaParcelUtils.a(this.f59071a);
            if (playbackInfo == null) {
                return;
            }
            kVar.j(playbackInfo);
        }
    }

    class b implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f59073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f59074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f59075c;

        b(long j10, long j11, long j12) {
            this.f59073a = j10;
            this.f59074b = j11;
            this.f59075c = j12;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            kVar.t(this.f59073a, this.f59074b, this.f59075c);
        }
    }

    class c implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59077a;

        c(ParcelImpl parcelImpl) {
            this.f59077a = parcelImpl;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            VideoSize videoSize = (VideoSize) MediaParcelUtils.a(this.f59077a);
            if (videoSize == null) {
                return;
            }
            kVar.N(videoSize);
        }
    }

    class d implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59081c;

        d(ParcelImpl parcelImpl, ParcelImpl parcelImpl2, ParcelImpl parcelImpl3) {
            this.f59079a = parcelImpl;
            this.f59080b = parcelImpl2;
            this.f59081c = parcelImpl3;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            SessionPlayer.TrackInfo trackInfo;
            SubtitleData subtitleData;
            MediaItem mediaItem = (MediaItem) MediaParcelUtils.a(this.f59079a);
            if (mediaItem == null || (trackInfo = (SessionPlayer.TrackInfo) MediaParcelUtils.a(this.f59080b)) == null || (subtitleData = (SubtitleData) MediaParcelUtils.a(this.f59081c)) == null) {
                return;
            }
            kVar.y(mediaItem, trackInfo, subtitleData);
        }
    }

    class e implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f59083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59084b;

        e(List list, int i10) {
            this.f59083a = list;
            this.f59084b = i10;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f59083a.size(); i10++) {
                MediaSession.CommandButton commandButton = (MediaSession.CommandButton) MediaParcelUtils.a((ParcelImpl) this.f59083a.get(i10));
                if (commandButton != null) {
                    arrayList.add(commandButton);
                }
            }
            kVar.Y(this.f59084b, arrayList);
        }
    }

    class f implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59086a;

        f(ParcelImpl parcelImpl) {
            this.f59086a = parcelImpl;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            SessionCommandGroup sessionCommandGroup = (SessionCommandGroup) MediaParcelUtils.a(this.f59086a);
            if (sessionCommandGroup == null) {
                return;
            }
            kVar.R(sessionCommandGroup);
        }
    }

    class g implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f59090c;

        g(ParcelImpl parcelImpl, int i10, Bundle bundle) {
            this.f59088a = parcelImpl;
            this.f59089b = i10;
            this.f59090c = bundle;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            SessionCommand sessionCommand = (SessionCommand) MediaParcelUtils.a(this.f59088a);
            if (sessionCommand == null) {
                return;
            }
            kVar.X(this.f59089b, sessionCommand, this.f59090c);
        }
    }

    class h implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f59092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f59097f;

        h(List list, ParcelImpl parcelImpl, ParcelImpl parcelImpl2, ParcelImpl parcelImpl3, ParcelImpl parcelImpl4, int i10) {
            this.f59092a = list;
            this.f59093b = parcelImpl;
            this.f59094c = parcelImpl2;
            this.f59095d = parcelImpl3;
            this.f59096e = parcelImpl4;
            this.f59097f = i10;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            kVar.I(this.f59097f, MediaParcelUtils.b(this.f59092a), (SessionPlayer.TrackInfo) MediaParcelUtils.a(this.f59093b), (SessionPlayer.TrackInfo) MediaParcelUtils.a(this.f59094c), (SessionPlayer.TrackInfo) MediaParcelUtils.a(this.f59095d), (SessionPlayer.TrackInfo) MediaParcelUtils.a(this.f59096e));
        }
    }

    class i implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59100b;

        i(ParcelImpl parcelImpl, int i10) {
            this.f59099a = parcelImpl;
            this.f59100b = i10;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            SessionPlayer.TrackInfo trackInfo = (SessionPlayer.TrackInfo) MediaParcelUtils.a(this.f59099a);
            if (trackInfo == null) {
                return;
            }
            kVar.H(this.f59100b, trackInfo);
        }
    }

    class j implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59103b;

        j(ParcelImpl parcelImpl, int i10) {
            this.f59102a = parcelImpl;
            this.f59103b = i10;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            SessionPlayer.TrackInfo trackInfo = (SessionPlayer.TrackInfo) MediaParcelUtils.a(this.f59102a);
            if (trackInfo == null) {
                return;
            }
            kVar.E(this.f59103b, trackInfo);
        }
    }

    class k implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f59108d;

        k(ParcelImpl parcelImpl, int i10, int i11, int i12) {
            this.f59105a = parcelImpl;
            this.f59106b = i10;
            this.f59107c = i11;
            this.f59108d = i12;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            kVar.g((MediaItem) MediaParcelUtils.a(this.f59105a), this.f59106b, this.f59107c, this.f59108d);
        }
    }

    class l implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59112c;

        l(String str, int i10, ParcelImpl parcelImpl) {
            this.f59110a = str;
            this.f59111b = i10;
            this.f59112c = parcelImpl;
        }

        @Override // androidx.media2.session.n.v
        public void a(androidx.media2.session.f fVar) {
            fVar.r0(this.f59110a, this.f59111b, (MediaLibraryService.LibraryParams) MediaParcelUtils.a(this.f59112c));
        }
    }

    class m implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59116c;

        m(String str, int i10, ParcelImpl parcelImpl) {
            this.f59114a = str;
            this.f59115b = i10;
            this.f59116c = parcelImpl;
        }

        @Override // androidx.media2.session.n.v
        public void a(androidx.media2.session.f fVar) {
            fVar.Hb(this.f59114a, this.f59115b, (MediaLibraryService.LibraryParams) MediaParcelUtils.a(this.f59116c));
        }
    }

    /* JADX INFO: renamed from: androidx.media2.session.n$n, reason: collision with other inner class name */
    class C0552n implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f59118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f59119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59120c;

        C0552n(long j10, long j11, int i10) {
            this.f59118a = j10;
            this.f59119b = j11;
            this.f59120c = i10;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            kVar.m(this.f59118a, this.f59119b, this.f59120c);
        }
    }

    class o implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f59122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f59123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f59124c;

        o(long j10, long j11, float f10) {
            this.f59122a = j10;
            this.f59123b = j11;
            this.f59124c = f10;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            kVar.l(this.f59122a, this.f59123b, this.f59124c);
        }
    }

    class p implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f59128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f59129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f59130e;

        p(ParcelImpl parcelImpl, int i10, long j10, long j11, long j12) {
            this.f59126a = parcelImpl;
            this.f59127b = i10;
            this.f59128c = j10;
            this.f59129d = j11;
            this.f59130e = j12;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            MediaItem mediaItem = (MediaItem) MediaParcelUtils.a(this.f59126a);
            if (mediaItem == null) {
                return;
            }
            kVar.f(mediaItem, this.f59127b, this.f59128c, this.f59129d, this.f59130e);
        }
    }

    class q implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImplListSlice f59132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f59135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f59136e;

        q(ParcelImplListSlice parcelImplListSlice, ParcelImpl parcelImpl, int i10, int i11, int i12) {
            this.f59132a = parcelImplListSlice;
            this.f59133b = parcelImpl;
            this.f59134c = i10;
            this.f59135d = i11;
            this.f59136e = i12;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            kVar.o(a0.d(this.f59132a), (MediaMetadata) MediaParcelUtils.a(this.f59133b), this.f59134c, this.f59135d, this.f59136e);
        }
    }

    class r implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelImpl f59138a;

        r(ParcelImpl parcelImpl) {
            this.f59138a = parcelImpl;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            kVar.q((MediaMetadata) MediaParcelUtils.a(this.f59138a));
        }
    }

    class s implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f59143d;

        s(int i10, int i11, int i12, int i13) {
            this.f59140a = i10;
            this.f59141b = i11;
            this.f59142c = i12;
            this.f59143d = i13;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            kVar.r(this.f59140a, this.f59141b, this.f59142c, this.f59143d);
        }
    }

    class t implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f59145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f59148d;

        t(int i10, int i11, int i12, int i13) {
            this.f59145a = i10;
            this.f59146b = i11;
            this.f59147c = i12;
            this.f59148d = i13;
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            kVar.x(this.f59145a, this.f59146b, this.f59147c, this.f59148d);
        }
    }

    class u implements w {
        u() {
        }

        @Override // androidx.media2.session.n.w
        public void a(androidx.media2.session.k kVar) {
            kVar.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @FunctionalInterface
    interface v {
        void a(androidx.media2.session.f fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @FunctionalInterface
    interface w {
        void a(androidx.media2.session.k kVar);
    }

    n(androidx.media2.session.k kVar) {
        this.f59070g3 = new WeakReference<>(kVar);
    }

    private void v(v vVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            androidx.media2.session.k kVar = this.f59070g3.get();
            if ((kVar instanceof androidx.media2.session.f) && kVar.isConnected()) {
                vVar.a((androidx.media2.session.f) kVar);
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                return;
            }
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        } catch (Throwable th2) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th2;
        }
    }

    private void w(w wVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            androidx.media2.session.k kVar = this.f59070g3.get();
            if (kVar != null && kVar.isConnected()) {
                wVar.a(kVar);
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                return;
            }
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        } catch (Throwable th2) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th2;
        }
    }

    @Override // androidx.media2.session.b
    public void Cd(final int i10, final ParcelImpl parcelImpl) {
        if (parcelImpl == null) {
            return;
        }
        w(new w() { // from class: androidx.media2.session.l
            @Override // androidx.media2.session.n.w
            public final void a(k kVar) {
                kVar.j0(i10, MediaParcelUtils.a(parcelImpl));
            }
        });
    }

    @Override // androidx.media2.session.b
    public void Ja(int i10, ParcelImpl parcelImpl) {
        if (parcelImpl == null) {
            return;
        }
        w(new i(parcelImpl, i10));
    }

    @Override // androidx.media2.session.b
    public void L8(int i10, List<ParcelImpl> list) {
        if (list == null) {
            return;
        }
        w(new e(list, i10));
    }

    @Override // androidx.media2.session.b
    public void M6(int i10, ParcelImpl parcelImpl) throws RuntimeException {
        if (parcelImpl == null) {
            return;
        }
        w(new r(parcelImpl));
    }

    @Override // androidx.media2.session.b
    public void Mb(int i10, int i11, int i12, int i13, int i14) {
        w(new s(i11, i12, i13, i14));
    }

    @Override // androidx.media2.session.b
    public void O8(int i10) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            androidx.media2.session.k kVar = this.f59070g3.get();
            if (kVar == null) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            } else {
                kVar.f58928a.close();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (Throwable th2) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th2;
        }
    }

    @Override // androidx.media2.session.b
    public void Q2(int i10, List<ParcelImpl> list, ParcelImpl parcelImpl, ParcelImpl parcelImpl2, ParcelImpl parcelImpl3, ParcelImpl parcelImpl4) {
        if (list == null) {
            return;
        }
        w(new h(list, parcelImpl, parcelImpl2, parcelImpl3, parcelImpl4, i10));
    }

    @Override // androidx.media2.session.b
    public void Td(int i10, long j10, long j11, int i11) {
        w(new C0552n(j10, j11, i11));
    }

    @Override // androidx.media2.session.b
    public void Ze(int i10, ParcelImpl parcelImpl) {
        if (parcelImpl == null) {
            O8(i10);
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            androidx.media2.session.k kVar = this.f59070g3.get();
            if (kVar == null) {
                return;
            }
            ConnectionResult connectionResult = (ConnectionResult) MediaParcelUtils.a(parcelImpl);
            kVar.T(connectionResult.H(), connectionResult.D(), connectionResult.j(), connectionResult.r(), connectionResult.m(), connectionResult.u(), connectionResult.v(), connectionResult.q(), connectionResult.k(), connectionResult.p(), connectionResult.x(), connectionResult.E(), a0.d(connectionResult.t()), connectionResult.C(), connectionResult.n(), connectionResult.w(), connectionResult.o(), connectionResult.F(), connectionResult.J(), connectionResult.G(), connectionResult.B(), connectionResult.y(), connectionResult.A(), connectionResult.z(), connectionResult.s(), connectionResult.l());
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media2.session.b
    public void c7(int i10, ParcelImpl parcelImpl) {
        if (parcelImpl == null) {
            return;
        }
        w(new f(parcelImpl));
    }

    @Override // androidx.media2.session.b
    public void d2(int i10, ParcelImpl parcelImpl, int i11, int i12, int i13) {
        if (parcelImpl == null) {
            return;
        }
        w(new k(parcelImpl, i11, i12, i13));
    }

    @Override // androidx.media2.session.b
    public void f8(int i10, ParcelImpl parcelImpl, int i11, long j10, long j11, long j12) {
        if (parcelImpl == null) {
            return;
        }
        w(new p(parcelImpl, i11, j10, j11, j12));
    }

    @Override // androidx.media2.session.b
    public void jf(int i10, int i11, int i12, int i13, int i14) {
        w(new t(i11, i12, i13, i14));
    }

    @Override // androidx.media2.session.b
    public void l3(int i10, ParcelImpl parcelImpl) {
        if (parcelImpl == null) {
            return;
        }
        w(new j(parcelImpl, i10));
    }

    @Override // androidx.media2.session.b
    public void ld(int i10, String str, int i11, ParcelImpl parcelImpl) {
        if (parcelImpl == null || TextUtils.isEmpty(str) || i11 < 0) {
            return;
        }
        v(new m(str, i11, parcelImpl));
    }

    @Override // androidx.media2.session.b
    public void n3(int i10, ParcelImpl parcelImpl) throws RuntimeException {
        if (parcelImpl == null) {
            return;
        }
        w(new a(parcelImpl));
    }

    @Override // androidx.media2.session.b
    public void o9(int i10, ParcelImpl parcelImpl, Bundle bundle) {
        if (parcelImpl == null) {
            return;
        }
        w(new g(parcelImpl, i10, bundle));
    }

    @Override // androidx.media2.session.b
    public void r3(int i10) {
        w(new u());
    }

    @Override // androidx.media2.session.b
    public void s4(int i10, String str, int i11, ParcelImpl parcelImpl) throws RuntimeException {
        if (parcelImpl != null && !TextUtils.isEmpty(str) && i11 >= 0) {
            v(new l(str, i11, parcelImpl));
        }
    }

    @Override // androidx.media2.session.b
    public void t4(int i10, long j10, long j11, long j12) {
        w(new b(j10, j11, j12));
    }

    @Override // androidx.media2.session.b
    public void td(int i10, ParcelImplListSlice parcelImplListSlice, ParcelImpl parcelImpl, int i11, int i12, int i13) {
        if (parcelImpl == null) {
            return;
        }
        w(new q(parcelImplListSlice, parcelImpl, i11, i12, i13));
    }

    public void u() {
        this.f59070g3.clear();
    }

    @Override // androidx.media2.session.b
    public void u2(int i10, ParcelImpl parcelImpl, ParcelImpl parcelImpl2, ParcelImpl parcelImpl3) {
        if (parcelImpl != null && parcelImpl2 != null && parcelImpl3 != null) {
            w(new d(parcelImpl, parcelImpl2, parcelImpl3));
        }
    }

    @Override // androidx.media2.session.b
    public void w4(int i10, ParcelImpl parcelImpl, ParcelImpl parcelImpl2) {
        if (parcelImpl2 == null) {
            return;
        }
        w(new c(parcelImpl2));
    }

    @Override // androidx.media2.session.b
    public void w9(int i10, long j10, long j11, float f10) {
        w(new o(j10, j11, f10));
    }

    @Override // androidx.media2.session.b
    public void xb(final int i10, final ParcelImpl parcelImpl) {
        if (parcelImpl == null) {
            return;
        }
        v(new v() { // from class: androidx.media2.session.m
            @Override // androidx.media2.session.n.v
            public final void a(f fVar) {
                fVar.j0(i10, MediaParcelUtils.a(parcelImpl));
            }
        });
    }
}
