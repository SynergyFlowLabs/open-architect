package androidx.media2.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class u extends SurfaceView implements w, SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Surface f60257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    w.a f60258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f60259c;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u uVar = u.this;
            w.a aVar = uVar.f60258b;
            if (aVar != null) {
                aVar.b(uVar);
            }
        }
    }

    u(Context context) {
        super(context, null);
        this.f60257a = null;
        this.f60258b = null;
        getHolder().addCallback(this);
    }

    @Override // androidx.media2.widget.w
    public void a(w.a aVar) {
        this.f60258b = aVar;
    }

    @Override // androidx.media2.widget.w
    public boolean b() {
        Surface surface = this.f60257a;
        return surface != null && surface.isValid();
    }

    @Override // androidx.media2.widget.w
    public int c() {
        return 0;
    }

    @Override // androidx.media2.widget.w
    public boolean d(m mVar) {
        this.f60259c = mVar;
        if (mVar == null || !b()) {
            return false;
        }
        mVar.H(this.f60257a).m0(new a(), androidx.core.content.d.o(getContext()));
        return true;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        m mVar = this.f60259c;
        int iF = mVar != null ? mVar.y().f() : 0;
        m mVar2 = this.f60259c;
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

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        w.a aVar = this.f60258b;
        if (aVar != null) {
            aVar.d(this, i11, i12);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f60257a = surfaceHolder.getSurface();
        if (this.f60258b != null) {
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            this.f60258b.a(this, surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f60257a = null;
        w.a aVar = this.f60258b;
        if (aVar != null) {
            aVar.c(this);
        }
    }
}
