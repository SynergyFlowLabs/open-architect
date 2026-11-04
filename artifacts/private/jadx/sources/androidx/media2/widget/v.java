package androidx.media2.widget;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class v extends TextureView implements w, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Surface f60261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    w.a f60262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f60263c;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v vVar = v.this;
            w.a aVar = vVar.f60262b;
            if (aVar != null) {
                aVar.b(vVar);
            }
        }
    }

    v(Context context) {
        super(context, null);
        setSurfaceTextureListener(this);
    }

    @Override // androidx.media2.widget.w
    public void a(w.a aVar) {
        this.f60262b = aVar;
    }

    @Override // androidx.media2.widget.w
    public boolean b() {
        Surface surface = this.f60261a;
        return surface != null && surface.isValid();
    }

    @Override // androidx.media2.widget.w
    public int c() {
        return 1;
    }

    @Override // androidx.media2.widget.w
    public boolean d(m mVar) {
        this.f60263c = mVar;
        if (mVar == null || !b()) {
            return false;
        }
        mVar.H(this.f60261a).m0(new a(), androidx.core.content.d.o(getContext()));
        return true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        m mVar = this.f60263c;
        int iF = mVar != null ? mVar.y().f() : 0;
        m mVar2 = this.f60263c;
        int iD = mVar2 != null ? mVar2.y().d() : 0;
        if (iF == 0 || iD == 0) {
            setMeasuredDimension(View.getDefaultSize(iF, i10), View.getDefaultSize(iD, i11));
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824 && mode2 == 1073741824) {
            int i13 = iF * size2;
            int i14 = size * iD;
            if (i13 < i14) {
                size = i13 / iD;
            } else if (i13 > i14) {
                size2 = i14 / iF;
            }
        } else if (mode == 1073741824) {
            int i15 = (iD * size) / iF;
            size2 = (mode2 != Integer.MIN_VALUE || i15 <= size2) ? i15 : size2 | 16777216;
        } else if (mode2 == 1073741824) {
            int i16 = (iF * size2) / iD;
            size = (mode != Integer.MIN_VALUE || i16 <= size) ? i16 : size | 16777216;
        } else {
            if (mode2 != Integer.MIN_VALUE || iD <= size2) {
                i12 = iF;
                size2 = iD;
            } else {
                i12 = (size2 * iF) / iD;
            }
            if (mode != Integer.MIN_VALUE || i12 <= size) {
                size = i12;
            } else {
                size2 = (iD * size) / iF;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f60261a = new Surface(surfaceTexture);
        w.a aVar = this.f60262b;
        if (aVar != null) {
            aVar.a(this, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        w.a aVar = this.f60262b;
        if (aVar != null) {
            aVar.c(this);
        }
        this.f60261a = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        w.a aVar = this.f60262b;
        if (aVar != null) {
            aVar.d(this, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
