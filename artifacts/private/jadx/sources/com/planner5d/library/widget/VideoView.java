package com.planner5d.library.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.planner5d.library.application.e6;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class VideoView extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f249545e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private MediaPlayer f249546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Surface f249547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f249548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f249549d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.VideoView$releaseAsync$1", f = "VideoView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f249550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaPlayer f249551b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MediaPlayer mediaPlayer, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f249551b = mediaPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f249551b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f249550a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f249551b.release();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void d(Throwable th2, String str) {
        getLogRecordManager().b(str, null, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.model.manager.u1 e(VideoView videoView) {
        return e6.a(videoView).k();
    }

    private final void f() {
        try {
            MediaPlayer mediaPlayer = this.f249546a;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
        } catch (IllegalStateException e10) {
            d(e10, "video_play");
        }
    }

    private final void g(MediaPlayer mediaPlayer) {
        kotlinx.coroutines.k.f(e6.a(this).g(), com.planner5d.library.services.utility.s.f229729a.d(), null, new a(mediaPlayer, null), 2, null);
    }

    private final com.planner5d.library.model.manager.u1 getLogRecordManager() {
        return (com.planner5d.library.model.manager.u1) this.f249549d.getValue();
    }

    private final void i() {
        if (this.f249547b == null) {
            return;
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f249546a = mediaPlayer;
        try {
            mediaPlayer.setSurface(this.f249547b);
            if (this.f249548c != 0) {
                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = getContext().getResources().openRawResourceFd(this.f249548c);
                if (assetFileDescriptorOpenRawResourceFd == null) {
                    throw new IOException("Missing video resource: " + this.f249548c);
                }
                try {
                    mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd);
                    Unit unit = Unit.f312394a;
                    kotlin.io.c.a(assetFileDescriptorOpenRawResourceFd, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(assetFileDescriptorOpenRawResourceFd, th2);
                        throw th3;
                    }
                }
            }
            mediaPlayer.prepareAsync();
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.planner5d.library.widget.u1
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    VideoView.j(this.f258860a, mediaPlayer2);
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.planner5d.library.widget.v1
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    VideoView.k(this.f258864a, mediaPlayer2);
                }
            });
        } catch (IOException e10) {
            d(e10, "video_start");
        } catch (IllegalStateException e11) {
            d(e11, "video_start_state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(VideoView videoView, MediaPlayer mediaPlayer) {
        videoView.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(VideoView videoView, MediaPlayer mediaPlayer) {
        videoView.f();
    }

    public final void h() {
        if (this.f249546a == null) {
            i();
        }
    }

    public final void l() {
        try {
            MediaPlayer mediaPlayer = this.f249546a;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
        } catch (IllegalStateException e10) {
            d(e10, "video_stop");
        }
        MediaPlayer mediaPlayer2 = this.f249546a;
        if (mediaPlayer2 != null) {
            g(mediaPlayer2);
        }
        this.f249546a = null;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, int i10, int i11) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        this.f249547b = new Surface(surfaceTexture);
        i();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surface, int i10, int i11) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    public final void setDataSource(@androidx.annotation.u0 int i10) {
        this.f249548c = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249549d = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.widget.t1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoView.e(this.f258777a);
            }
        });
        setSurfaceTextureListener(this);
    }
}
