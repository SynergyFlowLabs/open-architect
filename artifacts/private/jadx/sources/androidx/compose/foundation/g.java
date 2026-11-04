package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidExternalSurface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,456:1\n54#2:457\n59#2:459\n54#2:461\n59#2:463\n85#3:458\n90#3:460\n85#3:462\n90#3:464\n*S KotlinDebug\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState\n*L\n330#1:457\n331#1:459\n350#1:461\n351#1:463\n330#1:458\n331#1:460\n350#1:462\n351#1:464\n*E\n"})
final class g extends y implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f14259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Matrix f14260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Surface f14261h;

    public g(@NotNull kotlinx.coroutines.s0 s0Var) {
        super(s0Var);
        this.f14259f = androidx.compose.ui.unit.u.f42720b.a();
        this.f14260g = new Matrix();
    }

    @NotNull
    public final Matrix j() {
        return this.f14260g;
    }

    public final long k() {
        return this.f14259f;
    }

    public final void l(long j10) {
        this.f14259f = j10;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, int i10, int i11) {
        if (!androidx.compose.ui.unit.u.h(this.f14259f, androidx.compose.ui.unit.u.f42720b.a())) {
            long j10 = this.f14259f;
            int i12 = (int) (j10 >> 32);
            i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
            surfaceTexture.setDefaultBufferSize(i12, i11);
            i10 = i12;
        }
        Surface surface = new Surface(surfaceTexture);
        this.f14261h = surface;
        g(surface, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surfaceTexture) {
        Surface surface = this.f14261h;
        Intrinsics.checkNotNull(surface);
        h(surface);
        this.f14261h = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surfaceTexture, int i10, int i11) {
        if (!androidx.compose.ui.unit.u.h(this.f14259f, androidx.compose.ui.unit.u.f42720b.a())) {
            long j10 = this.f14259f;
            int i12 = (int) (j10 >> 32);
            i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
            surfaceTexture.setDefaultBufferSize(i12, i11);
            i10 = i12;
        }
        Surface surface = this.f14261h;
        Intrinsics.checkNotNull(surface);
        f(surface, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surfaceTexture) {
    }
}
