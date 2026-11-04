package com.google.android.filament.android;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f104699i = "UiHelper";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f104700j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f104701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f104702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f104703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0955c f104704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f104705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f104706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f104707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f104708h;

    public enum a {
        CHECK,
        DONT_CHECK
    }

    private interface b {
        void c(int i10, int i11);

        void detach();
    }

    /* JADX INFO: renamed from: com.google.android.filament.android.c$c, reason: collision with other inner class name */
    public interface InterfaceC0955c {
        void a(Surface surface);

        void b(int i10, int i11);

        void c();
    }

    private class d implements b, SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SurfaceHolder f104712a;

        d(SurfaceHolder surfaceHolder) {
            this.f104712a = surfaceHolder;
            surfaceHolder.addCallback(this);
            if (c.this.f104701a > 0 && c.this.f104702b > 0) {
                surfaceHolder.setFixedSize(c.this.f104701a, c.this.f104702b);
            }
            Surface surface = surfaceHolder.getSurface();
            if (surface != null && surface.isValid()) {
                surfaceCreated(surfaceHolder);
                surfaceChanged(surfaceHolder, 1, surfaceHolder.getSurfaceFrame().width(), surfaceHolder.getSurfaceFrame().height());
            }
        }

        @Override // com.google.android.filament.android.c.b
        public void c(int i10, int i11) {
            this.f104712a.setFixedSize(i10, i11);
        }

        @Override // com.google.android.filament.android.c.b
        public void detach() {
            this.f104712a.removeCallback(this);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            if (c.this.f104704d != null) {
                c.this.f104704d.b(i11, i12);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
            c.this.j(surfaceHolder.getSurface());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            c.this.k();
        }
    }

    private class e implements b, SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final SurfaceView f104714a;

        e(SurfaceView surfaceView) {
            this.f104714a = surfaceView;
            SurfaceHolder holder = surfaceView.getHolder();
            holder.addCallback(this);
            if (c.this.f104701a > 0 && c.this.f104702b > 0) {
                holder.setFixedSize(c.this.f104701a, c.this.f104702b);
            }
            Surface surface = holder.getSurface();
            if (surface == null || !surface.isValid()) {
                return;
            }
            surfaceCreated(holder);
            surfaceChanged(holder, 1, holder.getSurfaceFrame().width(), holder.getSurfaceFrame().height());
        }

        @Override // com.google.android.filament.android.c.b
        public void c(int i10, int i11) {
            this.f104714a.getHolder().setFixedSize(i10, i11);
        }

        @Override // com.google.android.filament.android.c.b
        public void detach() {
            this.f104714a.getHolder().removeCallback(this);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            if (c.this.f104704d != null) {
                c.this.f104704d.b(i11, i12);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
            c.this.j(surfaceHolder.getSurface());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            c.this.k();
        }
    }

    private class f implements b, TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextureView f104716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Surface f104717b;

        f(TextureView textureView) {
            SurfaceTexture surfaceTexture;
            this.f104716a = textureView;
            textureView.setSurfaceTextureListener(this);
            if (!textureView.isAvailable() || (surfaceTexture = textureView.getSurfaceTexture()) == null) {
                return;
            }
            onSurfaceTextureAvailable(surfaceTexture, c.this.f104701a, c.this.f104702b);
        }

        private Surface a() {
            return this.f104717b;
        }

        private void b(@p0 Surface surface) {
            Surface surface2;
            if (surface == null && (surface2 = this.f104717b) != null) {
                surface2.release();
            }
            this.f104717b = surface;
        }

        @Override // com.google.android.filament.android.c.b
        public void c(int i10, int i11) {
            SurfaceTexture surfaceTexture = this.f104716a.getSurfaceTexture();
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i10, i11);
            }
            if (c.this.f104704d != null) {
                c.this.f104704d.b(i10, i11);
            }
        }

        @Override // com.google.android.filament.android.c.b
        public void detach() {
            this.f104716a.setSurfaceTextureListener(null);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i10, int i11) {
            if (c.this.f104701a > 0 && c.this.f104702b > 0) {
                surfaceTexture.setDefaultBufferSize(c.this.f104701a, c.this.f104702b);
            }
            Surface surface = new Surface(surfaceTexture);
            b(surface);
            c.this.j(surface);
            if (c.this.f104704d != null) {
                c.this.f104704d.b(i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
            b(null);
            c.this.k();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i10, int i11) {
            if (c.this.f104704d != null) {
                if (c.this.f104701a <= 0 || c.this.f104702b <= 0) {
                    c.this.f104704d.b(i10, i11);
                } else {
                    surfaceTexture.setDefaultBufferSize(c.this.f104701a, c.this.f104702b);
                    c.this.f104704d.b(c.this.f104701a, c.this.f104702b);
                }
                Surface surfaceA = a();
                if (surfaceA != null) {
                    c.this.f104704d.a(surfaceA);
                }
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
        }
    }

    public c() {
        this(a.CHECK);
    }

    private boolean f(@NonNull Object obj) {
        Object obj2 = this.f104703c;
        if (obj2 != null) {
            if (obj2 == obj) {
                return false;
            }
            b bVar = this.f104706f;
            if (bVar != null) {
                bVar.detach();
                this.f104706f = null;
            }
            k();
        }
        this.f104703c = obj;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(@NonNull Surface surface) {
        InterfaceC0955c interfaceC0955c = this.f104704d;
        if (interfaceC0955c != null) {
            interfaceC0955c.a(surface);
        }
        this.f104705e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        InterfaceC0955c interfaceC0955c = this.f104704d;
        if (interfaceC0955c != null) {
            interfaceC0955c.c();
        }
        this.f104705e = false;
    }

    public void g(@NonNull SurfaceHolder surfaceHolder) {
        if (f(surfaceHolder)) {
            surfaceHolder.setFormat(r() ? -1 : -3);
            this.f104706f = new d(surfaceHolder);
        }
    }

    public void h(@NonNull SurfaceView surfaceView) {
        if (f(surfaceView)) {
            boolean z10 = !r();
            if (q()) {
                surfaceView.setZOrderMediaOverlay(z10);
            } else {
                surfaceView.setZOrderOnTop(z10);
            }
            surfaceView.getHolder().setFormat(r() ? -1 : -3);
            this.f104706f = new e(surfaceView);
        }
    }

    public void i(@NonNull TextureView textureView) {
        if (f(textureView)) {
            textureView.setOpaque(r());
            this.f104706f = new f(textureView);
        }
    }

    public void l() {
        b bVar = this.f104706f;
        if (bVar != null) {
            bVar.detach();
        }
        k();
        this.f104703c = null;
        this.f104706f = null;
    }

    public int m() {
        return this.f104702b;
    }

    public int n() {
        return this.f104701a;
    }

    @p0
    public InterfaceC0955c o() {
        return this.f104704d;
    }

    public long p() {
        return r() ? 0L : 1L;
    }

    public boolean q() {
        return this.f104708h;
    }

    public boolean r() {
        return this.f104707g;
    }

    public boolean s() {
        return this.f104705e;
    }

    public void t(int i10, int i11) {
        this.f104701a = i10;
        this.f104702b = i11;
        b bVar = this.f104706f;
        if (bVar != null) {
            bVar.c(i10, i11);
        }
    }

    public void u(boolean z10) {
        this.f104708h = z10;
    }

    public void v(boolean z10) {
        this.f104707g = z10;
    }

    public void w(@p0 InterfaceC0955c interfaceC0955c) {
        this.f104704d = interfaceC0955c;
    }

    public c(a aVar) {
        this.f104707g = true;
        this.f104708h = false;
    }
}
