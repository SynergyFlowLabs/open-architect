package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.common.i4;
import androidx.media3.common.n4;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.common.collect.l6;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerView extends FrameLayout implements androidx.media3.common.c {
    private static final int A3 = 0;
    private static final int B3 = 1;
    private static final int C3 = 2;
    private static final int D3 = 3;
    private static final int E3 = 4;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f69683s3 = 0;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f69684t3 = 1;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f69685u3 = 2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f69686v3 = 0;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f69687w3 = 1;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f69688x3 = 0;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f69689y3 = 1;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f69690z3 = 2;

    @androidx.annotation.p0
    private o.m H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f69691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final AspectRatioFrameLayout f69692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f69693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f69694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f69695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private final i f69696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f69697g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private int f69698g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f69699h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private int f69700h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private final SubtitleView f69701i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @androidx.annotation.p0
    private Drawable f69702i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f69703j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private int f69704j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f69705k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private boolean f69706k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private final o f69707l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.common.q<? super androidx.media3.common.x0> f69708l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private final FrameLayout f69709m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @androidx.annotation.p0
    private CharSequence f69710m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private final FrameLayout f69711n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private int f69712n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Handler f69713o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private boolean f69714o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f69715p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @androidx.annotation.p0
    private e f69716p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @androidx.annotation.p0
    private f f69717p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f69718p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f69719q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private boolean f69720r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.p0
    private final Class<?> f69721s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.p0
    private final Method f69722t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.p0
    private final Object f69723v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.common.z0 f69724w;

    @androidx.annotation.w0(34)
    private static class b {
        private b() {
        }

        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    @androidx.media3.common.util.b1
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    private final class d implements androidx.media3.common.z0.g, View.OnClickListener, o.m, o.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z3.b f69725a = new z3.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f69726b;

        public d() {
        }

        @Override // androidx.media3.common.z0.g
        public void E(androidx.media3.common.text.d dVar) {
            if (PlayerView.this.f69701i != null) {
                PlayerView.this.f69701i.setCues(dVar.f61412a);
            }
        }

        @Override // androidx.media3.ui.o.d
        public void L(boolean z10) {
            if (PlayerView.this.f69717p2 != null) {
                PlayerView.this.f69717p2.a(z10);
            }
        }

        @Override // androidx.media3.common.z0.g
        public void X(i4 i4Var) {
            androidx.media3.common.z0 z0Var = (androidx.media3.common.z0) androidx.media3.common.util.a.g(PlayerView.this.f69724w);
            z3 z3VarC0 = z0Var.P0(17) ? z0Var.c0() : z3.f61958a;
            if (z3VarC0.w()) {
                this.f69726b = null;
            } else if (!z0Var.P0(30) || z0Var.M0().d()) {
                Object obj = this.f69726b;
                if (obj != null) {
                    int iF = z3VarC0.f(obj);
                    if (iF != -1) {
                        if (z0Var.l0() == z3VarC0.j(iF, this.f69725a).f61969c) {
                            return;
                        }
                    }
                    this.f69726b = null;
                }
            } else {
                this.f69726b = z3VarC0.k(z0Var.O(), this.f69725a, true).f61968b;
            }
            PlayerView.this.g0(false);
        }

        @Override // androidx.media3.common.z0.g
        public void a(n4 n4Var) {
            if (!n4Var.equals(n4.f60993h) && PlayerView.this.f69724w != null && PlayerView.this.f69724w.H() != 1) {
                PlayerView.this.b0();
            }
        }

        @Override // androidx.media3.common.z0.g
        public void a0(boolean z10, int i10) {
            PlayerView.this.c0();
            PlayerView.this.e0();
        }

        @Override // androidx.media3.common.z0.g
        public void d0(androidx.media3.common.z0.k kVar, androidx.media3.common.z0.k kVar2, int i10) {
            if (PlayerView.this.L() && PlayerView.this.f69718p3) {
                PlayerView.this.G();
            }
        }

        @Override // androidx.media3.common.z0.g
        public void h0(int i10) {
            PlayerView.this.c0();
            PlayerView.this.f0();
            PlayerView.this.e0();
        }

        @Override // androidx.media3.ui.o.m
        public void l(int i10) {
            PlayerView.this.d0();
            if (PlayerView.this.f69716p1 != null) {
                PlayerView.this.f69716p1.a(i10);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.a0();
        }

        @Override // androidx.media3.common.z0.g
        public void v() {
            if (PlayerView.this.f69693c != null) {
                PlayerView.this.f69693c.setVisibility(4);
                if (PlayerView.this.C()) {
                    PlayerView.this.H();
                } else {
                    PlayerView.this.E();
                }
            }
        }

        @Override // androidx.media3.common.z0.g
        public void z(int i10, int i11) {
            if (androidx.media3.common.util.k1.f61540a == 34 && (PlayerView.this.f69694d instanceof SurfaceView) && PlayerView.this.f69720r3) {
                i iVar = (i) androidx.media3.common.util.a.g(PlayerView.this.f69696f);
                Handler handler = PlayerView.this.f69713o;
                SurfaceView surfaceView = (SurfaceView) PlayerView.this.f69694d;
                final PlayerView playerView = PlayerView.this;
                iVar.d(handler, surfaceView, new Runnable() { // from class: androidx.media3.ui.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        playerView.invalidate();
                    }
                });
            }
        }
    }

    public interface e {
        void a(int i10);
    }

    public interface f {
        void a(boolean z10);
    }

    @androidx.media3.common.util.b1
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    @androidx.media3.common.util.b1
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(34)
    static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        SurfaceSyncGroup f69728a;

        private i() {
        }

        public static /* synthetic */ void a(i iVar, SurfaceView surfaceView, Runnable runnable) {
            iVar.getClass();
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroupA = s0.a("exo-sync-b-334901521");
            iVar.f69728a = surfaceSyncGroupA;
            androidx.media3.common.util.a.i(surfaceSyncGroupA.add(rootSurfaceControl, new Runnable() { // from class: androidx.media3.ui.u0
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.i.b();
                }
            }));
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
        }

        public static /* synthetic */ void b() {
        }

        public void c() {
            SurfaceSyncGroup surfaceSyncGroup = this.f69728a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f69728a = null;
            }
        }

        public void d(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: androidx.media3.ui.t0
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.i.a(this.f70103a, surfaceView, runnable);
                }
            });
        }
    }

    public PlayerView(Context context) {
        this(context, null);
    }

    @androidx.annotation.w0(23)
    private static void A(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(androidx.media3.common.util.k1.r0(context, resources, v0.e.f70211a));
        imageView.setBackgroundColor(resources.getColor(v0.c.f70166f, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        androidx.media3.common.z0 z0Var = this.f69724w;
        return z0Var != null && this.f69723v != null && z0Var.P0(30) && z0Var.M0().e(4);
    }

    private boolean D() {
        androidx.media3.common.z0 z0Var = this.f69724w;
        return z0Var != null && z0Var.P0(30) && z0Var.M0().e(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        H();
        ImageView imageView = this.f69697g;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    private void F() {
        ImageView imageView = this.f69699h;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f69699h.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        ImageView imageView = this.f69697g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    @e.a({"InlinedApi"})
    private boolean J(int i10) {
        if (i10 != 19 && i10 != 270 && i10 != 22 && i10 != 271 && i10 != 20 && i10 != 269 && i10 != 21 && i10 != 268 && i10 != 23) {
            return false;
        }
        return true;
    }

    private boolean K() {
        ImageView imageView = this.f69697g;
        if (imageView == null) {
            return false;
        }
        Drawable drawable = imageView.getDrawable();
        return (drawable == null || drawable.getAlpha() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        androidx.media3.common.z0 z0Var = this.f69724w;
        return z0Var != null && z0Var.P0(16) && this.f69724w.x() && this.f69724w.J();
    }

    private void M(boolean z10) {
        if ((!L() || !this.f69718p3) && j0()) {
            boolean z11 = this.f69707l.d0() && this.f69707l.getShowTimeoutMs() <= 0;
            boolean zV = V();
            if (z10 || z11 || zV) {
                X(zV);
            }
        }
    }

    private void O(final Bitmap bitmap) {
        this.f69713o.post(new Runnable() { // from class: androidx.media3.ui.l0
            @Override // java.lang.Runnable
            public final void run() {
                PlayerView.a(this.f70010a, bitmap);
            }
        });
    }

    private boolean R(@androidx.annotation.p0 androidx.media3.common.z0 z0Var) {
        if (z0Var == null || !z0Var.P0(18)) {
            return false;
        }
        byte[] bArr = z0Var.u2().f61093k;
        if (bArr == null) {
            return false;
        }
        return S(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private boolean S(@androidx.annotation.p0 Drawable drawable) {
        if (this.f69699h != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f69698g3 == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                N(this.f69692b, width);
                this.f69699h.setScaleType(scaleType);
                this.f69699h.setImageDrawable(drawable);
                this.f69699h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void U(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private boolean V() {
        androidx.media3.common.z0 z0Var = this.f69724w;
        if (z0Var == null) {
            return true;
        }
        int iH = z0Var.H();
        return this.f69714o3 && !(this.f69724w.P0(17) && this.f69724w.c0().w()) && (iH == 1 || iH == 4 || !((androidx.media3.common.z0) androidx.media3.common.util.a.g(this.f69724w)).J());
    }

    private void X(boolean z10) {
        if (j0()) {
            this.f69707l.setShowTimeoutMs(z10 ? 0 : this.f69712n3);
            this.f69707l.o0();
        }
    }

    private void Y() {
        ImageView imageView = this.f69697g;
        if (imageView != null) {
            imageView.setVisibility(0);
            h0();
        }
    }

    @androidx.media3.common.util.b1
    public static void Z(androidx.media3.common.z0 z0Var, @androidx.annotation.p0 PlayerView playerView, @androidx.annotation.p0 PlayerView playerView2) {
        if (playerView == playerView2) {
            return;
        }
        if (playerView2 != null) {
            playerView2.setPlayer(z0Var);
        }
        if (playerView != null) {
            playerView.setPlayer(null);
        }
    }

    public static /* synthetic */ void a(PlayerView playerView, Bitmap bitmap) {
        playerView.getClass();
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        if (playerView.D()) {
            return;
        }
        playerView.Y();
        playerView.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        if (!j0() || this.f69724w == null) {
            return;
        }
        if (!this.f69707l.d0()) {
            M(true);
        } else if (this.f69719q3) {
            this.f69707l.Y();
        }
    }

    public static /* synthetic */ Object b(PlayerView playerView, Object obj, Method method, Object[] objArr) {
        playerView.getClass();
        if (method.getName().equals("onImageAvailable")) {
            playerView.O((Bitmap) objArr[1]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        androidx.media3.common.z0 z0Var = this.f69724w;
        n4 n4VarH0 = z0Var != null ? z0Var.h0() : n4.f60993h;
        int i10 = n4VarH0.f60997a;
        int i11 = n4VarH0.f60998b;
        N(this.f69692b, this.f69695e ? 0.0f : (i11 == 0 || i10 == 0) ? 0.0f : (i10 * n4VarH0.f61000d) / i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public void c0() {
        boolean z10;
        if (this.f69703j != null) {
            androidx.media3.common.z0 z0Var = this.f69724w;
            int i10 = 0;
            if (z0Var == null || z0Var.H() != 2) {
                z10 = false;
            } else {
                int i11 = this.f69704j3;
                z10 = true;
                if (i11 != 2 && (i11 != 1 || !this.f69724w.J())) {
                    z10 = false;
                }
            }
            View view = this.f69703j;
            if (!z10) {
                i10 = 8;
            }
            view.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        o oVar = this.f69707l;
        if (oVar == null || !this.f69715p0) {
            setContentDescription(null);
        } else if (oVar.d0()) {
            setContentDescription(this.f69719q3 ? getResources().getString(v0.k.f70370g) : null);
        } else {
            setContentDescription(getResources().getString(v0.k.f70384u));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        if (L() && this.f69718p3) {
            G();
        } else {
            M(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        androidx.media3.common.q<? super androidx.media3.common.x0> qVar;
        TextView textView = this.f69705k;
        if (textView != null) {
            CharSequence charSequence = this.f69710m3;
            int i10 = 1 >> 0;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f69705k.setVisibility(0);
                return;
            }
            androidx.media3.common.z0 z0Var = this.f69724w;
            androidx.media3.common.x0 x0VarA = z0Var != null ? z0Var.a() : null;
            if (x0VarA == null || (qVar = this.f69708l3) == null) {
                this.f69705k.setVisibility(8);
            } else {
                this.f69705k.setText((CharSequence) qVar.a(x0VarA).second);
                this.f69705k.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(boolean z10) {
        androidx.media3.common.z0 z0Var = this.f69724w;
        boolean z11 = false;
        boolean z12 = (z0Var == null || !z0Var.P0(30) || z0Var.M0().d()) ? false : true;
        if (!this.f69706k3 && (!z12 || z10)) {
            F();
            y();
            E();
        }
        if (z12) {
            boolean zD = D();
            boolean zC = C();
            if (!zD && !zC) {
                y();
                E();
            }
            View view = this.f69693c;
            if (view != null && view.getVisibility() == 4 && K()) {
                z11 = true;
            }
            if (zC && !zD && z11) {
                y();
                Y();
            } else if (zD && !zC && z11) {
                E();
            }
            if (zD || zC || !i0() || (!R(z0Var) && !S(this.f69702i3))) {
                F();
            }
        }
    }

    private void h0() {
        Drawable drawable;
        ImageView imageView = this.f69697g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f69700h3 == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.f69697g.getVisibility() == 0) {
            N(this.f69692b, width);
        }
        this.f69697g.setScaleType(scaleType);
    }

    private boolean i0() {
        if (this.f69698g3 == 0) {
            return false;
        }
        androidx.media3.common.util.a.k(this.f69699h);
        return true;
    }

    @il.e(expression = {"controller"}, result = true)
    private boolean j0() {
        if (!this.f69715p0) {
            return false;
        }
        androidx.media3.common.util.a.k(this.f69707l);
        return true;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f69697g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        h0();
    }

    private void setImageOutput(androidx.media3.common.z0 z0Var) {
        Class<?> cls = this.f69721s;
        if (cls == null || !cls.isAssignableFrom(z0Var.getClass())) {
            return;
        }
        try {
            ((Method) androidx.media3.common.util.a.g(this.f69722t)).invoke(z0Var, androidx.media3.common.util.a.g(this.f69723v));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void x(androidx.media3.common.z0 z0Var) {
        Class<?> cls = this.f69721s;
        if (cls == null || !cls.isAssignableFrom(z0Var.getClass())) {
            return;
        }
        try {
            ((Method) androidx.media3.common.util.a.g(this.f69722t)).invoke(z0Var, null);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void y() {
        View view = this.f69693c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void z(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(androidx.media3.common.util.k1.r0(context, resources, v0.e.f70211a));
        imageView.setBackgroundColor(resources.getColor(v0.c.f70166f));
    }

    @androidx.media3.common.util.b1
    public boolean B(KeyEvent keyEvent) {
        return j0() && this.f69707l.U(keyEvent);
    }

    @androidx.media3.common.util.b1
    public void G() {
        o oVar = this.f69707l;
        if (oVar != null) {
            oVar.Y();
        }
    }

    @androidx.media3.common.util.b1
    public boolean I() {
        o oVar = this.f69707l;
        return oVar != null && oVar.d0();
    }

    @androidx.media3.common.util.b1
    protected void N(@androidx.annotation.p0 AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public void P() {
        View view = this.f69694d;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void Q() {
        View view = this.f69694d;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @androidx.media3.common.util.b1
    public void T(@androidx.annotation.p0 long[] jArr, @androidx.annotation.p0 boolean[] zArr) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69707l.n0(jArr, zArr);
    }

    @androidx.media3.common.util.b1
    public void W() {
        X(V());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        i iVar;
        super.dispatchDraw(canvas);
        if (androidx.media3.common.util.k1.f61540a == 34 && (iVar = this.f69696f) != null && this.f69720r3) {
            iVar.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        androidx.media3.common.z0 z0Var = this.f69724w;
        if (z0Var != null && z0Var.P0(16) && this.f69724w.x()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zJ = J(keyEvent.getKeyCode());
        if (zJ && j0() && !this.f69707l.d0()) {
            M(true);
            return true;
        }
        if (B(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            M(true);
            return true;
        }
        if (zJ && j0()) {
            M(true);
        }
        return false;
    }

    @Override // androidx.media3.common.c
    public List<androidx.media3.common.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f69711n;
        if (frameLayout != null) {
            arrayList.add(new androidx.media3.common.a.C0564a(frameLayout, 4).b("Transparent overlay does not impact viewability").a());
        }
        o oVar = this.f69707l;
        if (oVar != null) {
            arrayList.add(new androidx.media3.common.a.C0564a(oVar, 1).a());
        }
        return l6.w(arrayList);
    }

    @Override // androidx.media3.common.c
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) androidx.media3.common.util.a.l(this.f69709m, "exo_ad_overlay must be present for ad playback");
    }

    @androidx.media3.common.util.b1
    public int getArtworkDisplayMode() {
        return this.f69698g3;
    }

    @androidx.media3.common.util.b1
    public boolean getControllerAutoShow() {
        return this.f69714o3;
    }

    @androidx.media3.common.util.b1
    public boolean getControllerHideOnTouch() {
        return this.f69719q3;
    }

    @androidx.media3.common.util.b1
    public int getControllerShowTimeoutMs() {
        return this.f69712n3;
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public Drawable getDefaultArtwork() {
        return this.f69702i3;
    }

    @androidx.media3.common.util.b1
    public int getImageDisplayMode() {
        return this.f69700h3;
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public FrameLayout getOverlayFrameLayout() {
        return this.f69711n;
    }

    @androidx.annotation.p0
    public androidx.media3.common.z0 getPlayer() {
        return this.f69724w;
    }

    @androidx.media3.common.util.b1
    public int getResizeMode() {
        androidx.media3.common.util.a.k(this.f69692b);
        return this.f69692b.getResizeMode();
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public SubtitleView getSubtitleView() {
        return this.f69701i;
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public boolean getUseArtwork() {
        return this.f69698g3 != 0;
    }

    public boolean getUseController() {
        return this.f69715p0;
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public View getVideoSurfaceView() {
        return this.f69694d;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!j0() || this.f69724w == null) {
            return false;
        }
        M(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        a0();
        return super.performClick();
    }

    @androidx.media3.common.util.b1
    public void setArtworkDisplayMode(int i10) {
        androidx.media3.common.util.a.i(i10 == 0 || this.f69699h != null);
        if (this.f69698g3 != i10) {
            this.f69698g3 = i10;
            g0(false);
        }
    }

    @androidx.media3.common.util.b1
    public void setAspectRatioListener(@androidx.annotation.p0 AspectRatioFrameLayout.b bVar) {
        androidx.media3.common.util.a.k(this.f69692b);
        this.f69692b.setAspectRatioListener(bVar);
    }

    @androidx.media3.common.util.b1
    public void setControllerAnimationEnabled(boolean z10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69707l.setAnimationEnabled(z10);
    }

    @androidx.media3.common.util.b1
    public void setControllerAutoShow(boolean z10) {
        this.f69714o3 = z10;
    }

    @androidx.media3.common.util.b1
    public void setControllerHideDuringAds(boolean z10) {
        this.f69718p3 = z10;
    }

    @androidx.media3.common.util.b1
    public void setControllerHideOnTouch(boolean z10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69719q3 = z10;
        d0();
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@androidx.annotation.p0 o.d dVar) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69717p2 = null;
        this.f69707l.setOnFullScreenModeChangedListener(dVar);
    }

    @androidx.media3.common.util.b1
    public void setControllerShowTimeoutMs(int i10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69712n3 = i10;
        if (this.f69707l.d0()) {
            W();
        }
    }

    public void setControllerVisibilityListener(@androidx.annotation.p0 e eVar) {
        this.f69716p1 = eVar;
        if (eVar != null) {
            setControllerVisibilityListener((o.m) null);
        }
    }

    @androidx.media3.common.util.b1
    public void setCustomErrorMessage(@androidx.annotation.p0 CharSequence charSequence) {
        androidx.media3.common.util.a.i(this.f69705k != null);
        this.f69710m3 = charSequence;
        f0();
    }

    @androidx.media3.common.util.b1
    public void setDefaultArtwork(@androidx.annotation.p0 Drawable drawable) {
        if (this.f69702i3 != drawable) {
            this.f69702i3 = drawable;
            g0(false);
        }
    }

    @androidx.media3.common.util.b1
    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.f69720r3 = z10;
    }

    public void setErrorMessageProvider(@androidx.annotation.p0 androidx.media3.common.q<? super androidx.media3.common.x0> qVar) {
        if (this.f69708l3 != qVar) {
            this.f69708l3 = qVar;
            f0();
        }
    }

    public void setFullscreenButtonClickListener(@androidx.annotation.p0 f fVar) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69717p2 = fVar;
        this.f69707l.setOnFullScreenModeChangedListener(this.f69691a);
    }

    @androidx.media3.common.util.b1
    public void setFullscreenButtonState(boolean z10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69707l.u0(z10);
    }

    @androidx.media3.common.util.b1
    public void setImageDisplayMode(int i10) {
        androidx.media3.common.util.a.i(this.f69697g != null);
        if (this.f69700h3 != i10) {
            this.f69700h3 = i10;
            h0();
        }
    }

    @androidx.media3.common.util.b1
    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f69706k3 != z10) {
            this.f69706k3 = z10;
            g0(false);
        }
    }

    public void setPlayer(@androidx.annotation.p0 androidx.media3.common.z0 z0Var) {
        androidx.media3.common.util.a.i(Looper.myLooper() == Looper.getMainLooper());
        androidx.media3.common.util.a.a(z0Var == null || z0Var.d0() == Looper.getMainLooper());
        androidx.media3.common.z0 z0Var2 = this.f69724w;
        if (z0Var2 == z0Var) {
            return;
        }
        if (z0Var2 != null) {
            z0Var2.Q1(this.f69691a);
            if (z0Var2.P0(27)) {
                View view = this.f69694d;
                if (view instanceof TextureView) {
                    z0Var2.p((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    z0Var2.r0((SurfaceView) view);
                }
            }
            x(z0Var2);
        }
        SubtitleView subtitleView = this.f69701i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f69724w = z0Var;
        if (j0()) {
            this.f69707l.setPlayer(z0Var);
        }
        c0();
        f0();
        g0(true);
        if (z0Var == null) {
            G();
            return;
        }
        if (z0Var.P0(27)) {
            View view2 = this.f69694d;
            if (view2 instanceof TextureView) {
                z0Var.f0((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                z0Var.j((SurfaceView) view2);
            }
            if (!z0Var.P0(30) || z0Var.M0().f(2)) {
                b0();
            }
        }
        if (this.f69701i != null && z0Var.P0(28)) {
            this.f69701i.setCues(z0Var.P1().f61412a);
        }
        z0Var.U1(this.f69691a);
        setImageOutput(z0Var);
        M(false);
    }

    @androidx.media3.common.util.b1
    public void setRepeatToggleModes(int i10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69707l.setRepeatToggleModes(i10);
    }

    @androidx.media3.common.util.b1
    public void setResizeMode(int i10) {
        androidx.media3.common.util.a.k(this.f69692b);
        this.f69692b.setResizeMode(i10);
    }

    @androidx.media3.common.util.b1
    public void setShowBuffering(int i10) {
        if (this.f69704j3 != i10) {
            this.f69704j3 = i10;
            c0();
        }
    }

    @androidx.media3.common.util.b1
    public void setShowFastForwardButton(boolean z10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69707l.setShowFastForwardButton(z10);
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69707l.setShowMultiWindowTimeBar(z10);
    }

    @androidx.media3.common.util.b1
    public void setShowNextButton(boolean z10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69707l.setShowNextButton(z10);
    }

    @androidx.media3.common.util.b1
    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69707l.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    @androidx.media3.common.util.b1
    public void setShowPreviousButton(boolean z10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69707l.setShowPreviousButton(z10);
    }

    @androidx.media3.common.util.b1
    public void setShowRewindButton(boolean z10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69707l.setShowRewindButton(z10);
    }

    @androidx.media3.common.util.b1
    public void setShowShuffleButton(boolean z10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69707l.setShowShuffleButton(z10);
    }

    @androidx.media3.common.util.b1
    public void setShowSubtitleButton(boolean z10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69707l.setShowSubtitleButton(z10);
    }

    @androidx.media3.common.util.b1
    public void setShowVrButton(boolean z10) {
        androidx.media3.common.util.a.k(this.f69707l);
        this.f69707l.setShowVrButton(z10);
    }

    @androidx.media3.common.util.b1
    public void setShutterBackgroundColor(@androidx.annotation.l int i10) {
        View view = this.f69693c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        androidx.media3.common.util.a.i((z10 && this.f69707l == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f69715p0 == z10) {
            return;
        }
        this.f69715p0 = z10;
        if (j0()) {
            this.f69707l.setPlayer(this.f69724w);
        } else {
            o oVar = this.f69707l;
            if (oVar != null) {
                oVar.Y();
                int i10 = 4 >> 0;
                this.f69707l.setPlayer(null);
            }
        }
        d0();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f69694d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public PlayerView(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z14;
        boolean z15;
        a aVar;
        boolean z16;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i20;
        super(context, attributeSet, i10);
        d dVar = new d();
        this.f69691a = dVar;
        this.f69713o = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f69692b = null;
            this.f69693c = null;
            this.f69694d = null;
            this.f69695e = false;
            this.f69696f = null;
            this.f69697g = null;
            this.f69699h = null;
            this.f69701i = null;
            this.f69703j = null;
            this.f69705k = null;
            this.f69707l = null;
            this.f69709m = null;
            this.f69711n = null;
            this.f69721s = null;
            this.f69722t = null;
            this.f69723v = null;
            ImageView imageView = new ImageView(context);
            if (androidx.media3.common.util.k1.f61540a >= 23) {
                A(context, getResources(), imageView);
            } else {
                z(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i21 = v0.i.f70351g;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, v0.m.f70518z1, i10, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(v0.m.f70483q2);
                int color = typedArrayObtainStyledAttributes.getColor(v0.m.f70483q2, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(v0.m.W1, i21);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(v0.m.f70511x2, true);
                int i22 = typedArrayObtainStyledAttributes.getInt(v0.m.D1, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(v0.m.J1, 0);
                int i23 = typedArrayObtainStyledAttributes.getInt(v0.m.P1, 0);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(v0.m.f70515y2, true);
                int i24 = typedArrayObtainStyledAttributes.getInt(v0.m.f70495t2, 1);
                int i25 = typedArrayObtainStyledAttributes.getInt(v0.m.f70427c2, 0);
                i11 = typedArrayObtainStyledAttributes.getInt(v0.m.f70467m2, 5000);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(v0.m.O1, true);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(v0.m.E1, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(v0.m.f70455j2, 0);
                this.f69706k3 = typedArrayObtainStyledAttributes.getBoolean(v0.m.Q1, this.f69706k3);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(v0.m.N1, true);
                typedArrayObtainStyledAttributes.recycle();
                i14 = resourceId2;
                z11 = z19;
                z14 = zHasValue;
                i15 = i25;
                z13 = z21;
                i12 = resourceId;
                z10 = z18;
                z12 = z20;
                z15 = z17;
                i17 = i23;
                i19 = i22;
                i18 = color;
                i16 = i24;
                i13 = integer;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            i12 = i21;
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 1;
            i17 = 0;
            i18 = 0;
            i19 = 1;
            z14 = false;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(v0.g.f70268b0);
        this.f69692b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            U(aspectRatioFrameLayout, i15);
        }
        View viewFindViewById = findViewById(v0.g.J0);
        this.f69693c = viewFindViewById;
        if (viewFindViewById != null && z14) {
            viewFindViewById.setBackgroundColor(i18);
        }
        if (aspectRatioFrameLayout != null && i16 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i16 == 2) {
                this.f69694d = new TextureView(context);
            } else {
                if (i16 == 3) {
                    try {
                        this.f69694d = (View) Class.forName("androidx.media3.exoplayer.video.spherical.l").getConstructor(Context.class).newInstance(context);
                        z16 = true;
                    } catch (Exception e10) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                    }
                } else if (i16 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (androidx.media3.common.util.k1.f61540a >= 34) {
                        b.a(surfaceView);
                    }
                    this.f69694d = surfaceView;
                } else {
                    try {
                        this.f69694d = (View) Class.forName("androidx.media3.exoplayer.video.u").getConstructor(Context.class).newInstance(context);
                    } catch (Exception e11) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                }
                this.f69694d.setLayoutParams(layoutParams);
                this.f69694d.setOnClickListener(dVar);
                this.f69694d.setClickable(false);
                aspectRatioFrameLayout.addView(this.f69694d, 0);
                aVar = null;
            }
            z16 = false;
            this.f69694d.setLayoutParams(layoutParams);
            this.f69694d.setOnClickListener(dVar);
            this.f69694d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f69694d, 0);
            aVar = null;
        } else {
            aVar = null;
            this.f69694d = null;
            z16 = false;
        }
        this.f69695e = z16;
        this.f69696f = androidx.media3.common.util.k1.f61540a == 34 ? new i() : null;
        this.f69709m = (FrameLayout) findViewById(v0.g.T);
        this.f69711n = (FrameLayout) findViewById(v0.g.f70325u0);
        this.f69697g = (ImageView) findViewById(v0.g.f70304n0);
        this.f69700h3 = i17;
        try {
            cls = ExoPlayer.class;
            Class<?> cls2 = Class.forName("androidx.media3.exoplayer.image.ImageOutput");
            method = cls.getMethod("setImageOutput", cls2);
            objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: androidx.media3.ui.k0
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    return PlayerView.b(this.f69997a, obj, method2, objArr);
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f69721s = cls;
        this.f69722t = method;
        this.f69723v = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(v0.g.U);
        this.f69699h = imageView2;
        this.f69698g3 = (!z15 || i19 == 0 || imageView2 == null) ? 0 : i19;
        if (i14 != 0) {
            this.f69702i3 = androidx.core.content.d.l(getContext(), i14);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(v0.g.M0);
        this.f69701i = subtitleView;
        if (subtitleView != null) {
            subtitleView.e();
            subtitleView.f();
        }
        View viewFindViewById2 = findViewById(v0.g.Y);
        this.f69703j = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f69704j3 = i13;
        TextView textView = (TextView) findViewById(v0.g.f70283g0);
        this.f69705k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        o oVar = (o) findViewById(v0.g.f70271c0);
        View viewFindViewById3 = findViewById(v0.g.f70274d0);
        if (oVar != null) {
            this.f69707l = oVar;
            i20 = 0;
        } else if (viewFindViewById3 != null) {
            i20 = 0;
            o oVar2 = new o(context, null, 0, attributeSet);
            this.f69707l = oVar2;
            oVar2.setId(v0.g.f70271c0);
            oVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(oVar2, iIndexOfChild);
        } else {
            i20 = 0;
            this.f69707l = null;
        }
        o oVar3 = this.f69707l;
        this.f69712n3 = oVar3 != null ? i11 : i20;
        this.f69719q3 = z11;
        this.f69714o3 = z12;
        this.f69718p3 = z13;
        this.f69715p0 = (!z10 || oVar3 == null) ? i20 : 1;
        if (oVar3 != null) {
            oVar3.Z();
            this.f69707l.S(this.f69691a);
        }
        if (z10) {
            setClickable(true);
        }
        d0();
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public void setControllerVisibilityListener(@androidx.annotation.p0 o.m mVar) {
        androidx.media3.common.util.a.k(this.f69707l);
        o.m mVar2 = this.H1;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f69707l.k0(mVar2);
        }
        this.H1 = mVar;
        if (mVar != null) {
            this.f69707l.S(mVar);
            setControllerVisibilityListener((e) null);
        }
    }
}
