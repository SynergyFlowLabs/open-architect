package androidx.media2.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.view.u1;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import androidx.media2.session.MediaController;
import com.google.common.util.concurrent.t1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class VideoView extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f59562p0 = "VideoView";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    static final boolean f59563p1 = Log.isLoggable(f59562p0, 3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f59564v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f59565w = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f59566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    w f59567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    w f59568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    v f59569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    u f59570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    m f59571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    i f59572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    l f59573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    o.b f59574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f59575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f59576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Map<SessionPlayer.TrackInfo, r> f59577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    q f59578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    SessionPlayer.TrackInfo f59579o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    p f59580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final w.a f59581t;

    class a implements w.a {
        a() {
        }

        @Override // androidx.media2.widget.w.a
        public void a(@NonNull View view, int i10, int i11) {
            if (VideoView.f59563p1) {
                view.toString();
            }
            VideoView videoView = VideoView.this;
            if (view == videoView.f59568d && videoView.a()) {
                VideoView videoView2 = VideoView.this;
                videoView2.f59568d.d(videoView2.f59571g);
            }
        }

        @Override // androidx.media2.widget.w.a
        public void b(@NonNull w wVar) {
            if (wVar != VideoView.this.f59568d) {
                Objects.toString(wVar);
                return;
            }
            if (VideoView.f59563p1) {
                Objects.toString(wVar);
            }
            Object obj = VideoView.this.f59567c;
            if (wVar != obj) {
                ((View) obj).setVisibility(8);
                VideoView videoView = VideoView.this;
                videoView.f59567c = wVar;
                e eVar = videoView.f59566b;
                if (eVar != null) {
                    eVar.a(videoView, wVar.c());
                }
            }
        }

        @Override // androidx.media2.widget.w.a
        public void c(@NonNull View view) {
            if (VideoView.f59563p1) {
                view.toString();
            }
        }

        @Override // androidx.media2.widget.w.a
        public void d(@NonNull View view, int i10, int i11) {
            if (VideoView.f59563p1) {
                view.toString();
            }
        }
    }

    class b implements q.d {
        b() {
        }

        @Override // androidx.media2.widget.q.d
        public void a(r rVar) {
            SessionPlayer.TrackInfo key = null;
            if (rVar == null) {
                VideoView videoView = VideoView.this;
                videoView.f59579o = null;
                videoView.f59580s.setVisibility(8);
                return;
            }
            for (Map.Entry<SessionPlayer.TrackInfo, r> entry : VideoView.this.f59577m.entrySet()) {
                if (entry.getValue() == rVar) {
                    key = entry.getKey();
                    break;
                }
            }
            if (key != null) {
                VideoView videoView2 = VideoView.this;
                videoView2.f59579o = key;
                videoView2.f59580s.setVisibility(0);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t1 f59584a;

        c(t1 t1Var) {
            this.f59584a = t1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((androidx.media2.common.a) this.f59584a.get()).i();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    class d implements androidx.palette.graphics.b.d {
        d() {
        }

        @Override // androidx.palette.graphics.b.d
        public void a(androidx.palette.graphics.b bVar) {
            VideoView.this.f59573i.setBackgroundColor(bVar.p(0));
        }
    }

    public interface e {
        void a(@NonNull View view, int i10);
    }

    class f extends m.b {
        f() {
        }

        private boolean n(@NonNull m mVar) {
            if (mVar == VideoView.this.f59571g) {
                return false;
            }
            if (VideoView.f59563p1) {
                try {
                    new Throwable().getStackTrace()[1].getMethodName();
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            return true;
        }

        @Override // androidx.media2.widget.m.b
        void b(@NonNull m mVar) {
            boolean z10 = VideoView.f59563p1;
            if (!n(mVar) && VideoView.this.a()) {
                VideoView videoView = VideoView.this;
                videoView.f59568d.d(videoView.f59571g);
            }
        }

        @Override // androidx.media2.widget.m.b
        void c(@NonNull m mVar, @p0 MediaItem mediaItem) {
            if (VideoView.f59563p1) {
                Objects.toString(mediaItem);
            }
            if (n(mVar)) {
                return;
            }
            VideoView.this.p(mediaItem);
        }

        @Override // androidx.media2.widget.m.b
        void f(@NonNull m mVar, int i10) {
            boolean z10 = VideoView.f59563p1;
            n(mVar);
        }

        @Override // androidx.media2.widget.m.b
        void i(@NonNull m mVar, @NonNull MediaItem mediaItem, @NonNull SessionPlayer.TrackInfo trackInfo, @NonNull SubtitleData subtitleData) {
            r rVar;
            if (VideoView.f59563p1) {
                Objects.toString(trackInfo);
                mVar.p();
                subtitleData.g();
                subtitleData.g();
                mVar.p();
                subtitleData.f();
            }
            if (n(mVar) || !trackInfo.equals(VideoView.this.f59579o) || (rVar = VideoView.this.f59577m.get(trackInfo)) == null) {
                return;
            }
            rVar.k(subtitleData);
        }

        @Override // androidx.media2.widget.m.b
        void j(@NonNull m mVar, @NonNull SessionPlayer.TrackInfo trackInfo) {
            if (VideoView.f59563p1) {
                Objects.toString(trackInfo);
            }
            if (n(mVar) || VideoView.this.f59577m.get(trackInfo) == null) {
                return;
            }
            VideoView.this.f59578n.p(null);
        }

        @Override // androidx.media2.widget.m.b
        void k(@NonNull m mVar, @NonNull SessionPlayer.TrackInfo trackInfo) {
            r rVar;
            if (VideoView.f59563p1) {
                Objects.toString(trackInfo);
            }
            if (n(mVar) || (rVar = VideoView.this.f59577m.get(trackInfo)) == null) {
                return;
            }
            VideoView.this.f59578n.p(rVar);
        }

        @Override // androidx.media2.widget.m.b
        void l(@NonNull m mVar, @NonNull List<SessionPlayer.TrackInfo> list) {
            if (VideoView.f59563p1) {
                Objects.toString(list);
            }
            if (n(mVar)) {
                return;
            }
            VideoView.this.q(mVar, list);
            VideoView.this.p(mVar.n());
        }

        @Override // androidx.media2.widget.m.b
        void m(@NonNull m mVar, @NonNull VideoSize videoSize) {
            List<SessionPlayer.TrackInfo> listX;
            if (VideoView.f59563p1) {
                Objects.toString(videoSize);
            }
            if (n(mVar)) {
                return;
            }
            if (VideoView.this.f59575k == 0 && videoSize.d() > 0 && videoSize.f() > 0 && VideoView.this.l() && (listX = mVar.x()) != null) {
                VideoView.this.q(mVar, listX);
            }
            VideoView.this.f59569e.forceLayout();
            VideoView.this.f59570f.forceLayout();
            VideoView.this.requestLayout();
        }
    }

    public VideoView(@NonNull Context context) {
        this(context, null);
    }

    private Drawable g(@NonNull MediaMetadata mediaMetadata, Drawable drawable) {
        Bitmap bitmapK = (mediaMetadata == null || !mediaMetadata.j("android.media.metadata.ALBUM_ART")) ? null : mediaMetadata.k("android.media.metadata.ALBUM_ART");
        if (bitmapK != null) {
            androidx.palette.graphics.b.b(bitmapK).f(new d());
            return new BitmapDrawable(getResources(), bitmapK);
        }
        this.f59573i.setBackgroundColor(androidx.core.content.d.g(getContext(), n.c.f60025e));
        return drawable;
    }

    private String h(@NonNull MediaMetadata mediaMetadata, String str, String str2) {
        String strQ = mediaMetadata == null ? str2 : mediaMetadata.q(str);
        return strQ == null ? str2 : strQ;
    }

    private void j(Context context, @p0 AttributeSet attributeSet) {
        this.f59579o = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f59569e = new v(context);
        this.f59570f = new u(context);
        this.f59569e.a(this.f59581t);
        this.f59570f.a(this.f59581t);
        addView(this.f59569e);
        addView(this.f59570f);
        o.b bVar = new o.b();
        this.f59574j = bVar;
        bVar.f60170a = true;
        p pVar = new p(context);
        this.f59580s = pVar;
        pVar.setBackgroundColor(0);
        addView(this.f59580s, this.f59574j);
        q qVar = new q(context, null, new b());
        this.f59578n = qVar;
        qVar.m(new androidx.media2.widget.e(context));
        this.f59578n.m(new g(context));
        this.f59578n.q(this.f59580s);
        l lVar = new l(context);
        this.f59573i = lVar;
        lVar.setVisibility(8);
        addView(this.f59573i, this.f59574j);
        if (attributeSet == null || attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto", "enableControlView", true)) {
            i iVar = new i(context);
            this.f59572h = iVar;
            iVar.setAttachedToVideoView(true);
            addView(this.f59572h, this.f59574j);
        }
        int attributeIntValue = attributeSet == null ? 0 : attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "viewType", 0);
        if (attributeIntValue == 0) {
            this.f59569e.setVisibility(8);
            this.f59570f.setVisibility(0);
            this.f59567c = this.f59570f;
        } else if (attributeIntValue == 1) {
            this.f59569e.setVisibility(0);
            this.f59570f.setVisibility(8);
            this.f59567c = this.f59569e;
        }
        this.f59568d = this.f59567c;
    }

    @Override // androidx.media2.widget.k
    void b(boolean z10) {
        super.b(z10);
        m mVar = this.f59571g;
        if (mVar == null) {
            return;
        }
        if (z10) {
            this.f59568d.d(mVar);
        } else {
            if (mVar == null || mVar.z()) {
                return;
            }
            m();
        }
    }

    @Override // androidx.media2.widget.o, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.media2.widget.VideoView";
    }

    @p0
    public i getMediaControlView() {
        return this.f59572h;
    }

    public int getViewType() {
        return this.f59567c.c();
    }

    boolean i() {
        if (this.f59575k > 0) {
            return true;
        }
        VideoSize videoSizeY = this.f59571g.y();
        if (videoSizeY.d() <= 0 || videoSizeY.f() <= 0) {
            return false;
        }
        videoSizeY.f();
        videoSizeY.d();
        return true;
    }

    boolean k() {
        return !i() && this.f59576l > 0;
    }

    boolean l() {
        m mVar = this.f59571g;
        return (mVar == null || mVar.t() == 3 || this.f59571g.t() == 0) ? false : true;
    }

    void m() {
        try {
            this.f59571g.H(null).get(100L, TimeUnit.MILLISECONDS).i();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
        }
    }

    void n() {
        int i10 = 3 >> 0;
        t1<? extends androidx.media2.common.a> t1VarH = this.f59571g.H(null);
        t1VarH.m0(new c(t1VarH), androidx.core.content.d.o(getContext()));
    }

    public void o(@NonNull i iVar, long j10) {
        i iVar2 = this.f59572h;
        if (iVar2 != null) {
            removeView(iVar2);
            this.f59572h.setAttachedToVideoView(false);
        }
        addView(iVar, this.f59574j);
        iVar.setAttachedToVideoView(true);
        this.f59572h = iVar;
        iVar.setDelayedAnimationInterval(j10);
        m mVar = this.f59571g;
        if (mVar != null) {
            MediaController mediaController = mVar.f60004a;
            if (mediaController != null) {
                this.f59572h.setMediaControllerInternal(mediaController);
                return;
            }
            SessionPlayer sessionPlayer = mVar.f60005b;
            if (sessionPlayer != null) {
                this.f59572h.setPlayerInternal(sessionPlayer);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m mVar = this.f59571g;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m mVar = this.f59571g;
        if (mVar != null) {
            mVar.j();
        }
    }

    @Override // androidx.media2.widget.k, android.view.View
    @w0(24)
    public /* bridge */ /* synthetic */ void onVisibilityAggregated(boolean z10) {
        super.onVisibilityAggregated(z10);
    }

    void p(MediaItem mediaItem) {
        if (mediaItem == null || !k()) {
            this.f59573i.setVisibility(8);
            this.f59573i.c(null);
            this.f59573i.e(null);
            this.f59573i.d(null);
            return;
        }
        this.f59573i.setVisibility(0);
        MediaMetadata mediaMetadataM = mediaItem.m();
        Resources resources = getResources();
        Drawable drawableG = g(mediaMetadataM, androidx.core.content.d.l(getContext(), n.e.f60063g));
        String strH = h(mediaMetadataM, "android.media.metadata.TITLE", resources.getString(n.h.f60137w));
        String strH2 = h(mediaMetadataM, "android.media.metadata.ARTIST", resources.getString(n.h.f60136v));
        this.f59573i.c(drawableG);
        this.f59573i.e(strH);
        this.f59573i.d(strH2);
    }

    void q(m mVar, List<SessionPlayer.TrackInfo> list) {
        r rVarA;
        this.f59577m = new LinkedHashMap();
        this.f59575k = 0;
        this.f59576l = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            SessionPlayer.TrackInfo trackInfo = list.get(i10);
            int iM = list.get(i10).m();
            if (iM == 1) {
                this.f59575k++;
            } else if (iM == 2) {
                this.f59576l++;
            } else if (iM == 4 && (rVarA = this.f59578n.a(trackInfo.j())) != null) {
                this.f59577m.put(trackInfo, rVarA);
            }
        }
        this.f59579o = mVar.v(4);
    }

    public void setMediaController(@NonNull MediaController mediaController) {
        if (mediaController == null) {
            throw new NullPointerException("controller must not be null");
        }
        m mVar = this.f59571g;
        if (mVar != null) {
            mVar.j();
        }
        this.f59571g = new m(mediaController, androidx.core.content.d.o(getContext()), new f());
        if (u1.R0(this)) {
            this.f59571g.a();
        }
        if (a()) {
            this.f59568d.d(this.f59571g);
        } else {
            n();
        }
        i iVar = this.f59572h;
        if (iVar != null) {
            iVar.setMediaControllerInternal(mediaController);
        }
    }

    public void setOnViewTypeChangedListener(@p0 e eVar) {
        this.f59566b = eVar;
    }

    public void setPlayer(@NonNull SessionPlayer sessionPlayer) {
        if (sessionPlayer == null) {
            throw new NullPointerException("player must not be null");
        }
        m mVar = this.f59571g;
        if (mVar != null) {
            mVar.j();
        }
        this.f59571g = new m(sessionPlayer, androidx.core.content.d.o(getContext()), new f());
        if (u1.R0(this)) {
            this.f59571g.a();
        }
        if (a()) {
            this.f59568d.d(this.f59571g);
        } else {
            n();
        }
        i iVar = this.f59572h;
        if (iVar != null) {
            iVar.setPlayerInternal(sessionPlayer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, androidx.media2.widget.w] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public void setViewType(int i10) {
        ?? r10;
        if (i10 == this.f59568d.c()) {
            return;
        }
        if (i10 == 1) {
            r10 = this.f59569e;
        } else {
            if (i10 != 0) {
                throw new IllegalArgumentException("Unknown view type: " + i10);
            }
            r10 = this.f59570f;
        }
        this.f59568d = r10;
        if (a()) {
            r10.d(this.f59571g);
        }
        r10.setVisibility(0);
        requestLayout();
    }

    @Override // androidx.media2.widget.o, android.view.ViewGroup
    public /* bridge */ /* synthetic */ boolean shouldDelayChildPressedState() {
        return super.shouldDelayChildPressedState();
    }

    public VideoView(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoView(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f59581t = new a();
        j(context, attributeSet);
    }
}
