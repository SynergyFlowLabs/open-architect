package androidx.media2.player;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.audio.b0;
import androidx.media2.exoplayer.external.drm.v;
import androidx.media2.exoplayer.external.t0;
import androidx.media2.exoplayer.external.w0;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"RestrictedApi"})
final class r implements w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f58423d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f58424e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f58425f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f58426g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f58427h = 5000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f58428i = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f58429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.audio.s f58430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f58431c;

    r(Context context, androidx.media2.exoplayer.external.audio.s sVar, s sVar2) {
        this.f58429a = context;
        this.f58430b = sVar;
        this.f58431c = sVar2;
    }

    @Override // androidx.media2.exoplayer.external.w0
    public t0[] a(Handler handler, androidx.media2.exoplayer.external.video.u uVar, androidx.media2.exoplayer.external.audio.r rVar, androidx.media2.exoplayer.external.text.k kVar, androidx.media2.exoplayer.external.metadata.e eVar, @p0 androidx.media2.exoplayer.external.drm.r<v> rVar2) {
        Context context = this.f58429a;
        androidx.media2.exoplayer.external.mediacodec.c cVar = androidx.media2.exoplayer.external.mediacodec.c.f55390a;
        return new t0[]{new androidx.media2.exoplayer.external.video.d(context, cVar, 5000L, rVar2, false, handler, uVar, 50), new b0(this.f58429a, cVar, rVar2, false, handler, rVar, this.f58430b), this.f58431c, new androidx.media2.exoplayer.external.metadata.f(eVar, handler.getLooper(), new i())};
    }
}
