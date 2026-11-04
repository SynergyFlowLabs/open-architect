package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.d0;
import androidx.annotation.g1;
import androidx.annotation.l1;
import androidx.annotation.w0;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.p0;
import androidx.appcompat.widget.v1;
import androidx.collection.h3;
import androidx.core.view.f2;
import androidx.core.view.g0;
import androidx.core.view.g3;
import androidx.core.view.h0;
import androidx.core.view.h2;
import androidx.core.view.u1;
import androidx.lifecycle.c0;
import androidx.lifecycle.o0;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY})
class AppCompatDelegateImpl extends androidx.appcompat.app.h implements androidx.appcompat.view.menu.g.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final h3<String, Integer> f10185c4 = new h3<>();

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final boolean f10186d4 = false;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final int[] f10187e4 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final boolean f10188f4 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static boolean f10189g4 = false;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    static final String f10190h4 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    boolean A3;
    boolean B3;
    boolean C3;
    boolean D3;
    private boolean E3;
    private PanelFeatureState[] F3;
    private PanelFeatureState G3;
    Window H1;
    private boolean H3;
    private boolean I3;
    private boolean J3;
    boolean K3;
    private Configuration L3;
    private int M3;
    private int N3;
    private int O3;
    private boolean P3;
    private r Q3;
    private r R3;
    boolean S3;
    int T3;
    private final Runnable U3;
    private boolean V3;
    private Rect W3;
    private Rect X3;
    private androidx.appcompat.app.s Y3;
    private androidx.appcompat.app.u Z3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private OnBackInvokedDispatcher f10191a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private OnBackInvokedCallback f10192b4;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    final androidx.appcompat.app.e f10193g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    androidx.appcompat.app.a f10194h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    MenuInflater f10195i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private CharSequence f10196j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private k0 f10197k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private j f10198l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private u f10199m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    androidx.appcompat.view.b f10200n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    ActionBarContextView f10201o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    final Object f10202p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    final Context f10203p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private p f10204p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    PopupWindow f10205p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    Runnable f10206q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    f2 f10207r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private boolean f10208s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private boolean f10209t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    ViewGroup f10210u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private TextView f10211v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private View f10212w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private boolean f10213x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private boolean f10214y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    boolean f10215z3;

    protected static final class PanelFeatureState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10221f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f10222g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f10223h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f10224i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.g f10225j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.e f10226k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f10227l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f10228m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f10229n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f10230o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f10231p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f10232q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f10233r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f10234s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Bundle f10235t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Bundle f10236u;

        @e.a({"BanParcelableUsage"})
        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10237a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f10238b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Bundle f10239c;

            class a implements Parcelable.ClassLoaderCreator<SavedState> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }
            }

            SavedState() {
            }

            static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f10237a = parcel.readInt();
                boolean z10 = true;
                if (parcel.readInt() != 1) {
                    z10 = false;
                }
                savedState.f10238b = z10;
                if (z10) {
                    savedState.f10239c = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f10237a);
                parcel.writeInt(this.f10238b ? 1 : 0);
                if (this.f10238b) {
                    parcel.writeBundle(this.f10239c);
                }
            }
        }

        PanelFeatureState(int i10) {
            this.f10216a = i10;
        }

        void a() {
            Bundle bundle;
            androidx.appcompat.view.menu.g gVar = this.f10225j;
            if (gVar == null || (bundle = this.f10235t) == null) {
                return;
            }
            gVar.V(bundle);
            this.f10235t = null;
        }

        public void b() {
            androidx.appcompat.view.menu.g gVar = this.f10225j;
            if (gVar != null) {
                gVar.T(this.f10226k);
            }
            this.f10226k = null;
        }

        androidx.appcompat.view.menu.o c(androidx.appcompat.view.menu.n.a aVar) {
            if (this.f10225j == null) {
                return null;
            }
            if (this.f10226k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f10227l, i.a.j.f286259q);
                this.f10226k = eVar;
                eVar.j(aVar);
                this.f10225j.b(this.f10226k);
            }
            return this.f10226k.n(this.f10222g);
        }

        public boolean d() {
            if (this.f10223h == null) {
                return false;
            }
            if (this.f10224i == null && this.f10226k.a().getCount() <= 0) {
                return false;
            }
            return true;
        }

        void e(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.f10216a = savedState.f10237a;
            this.f10234s = savedState.f10238b;
            this.f10235t = savedState.f10239c;
            this.f10223h = null;
            this.f10222g = null;
        }

        Parcelable f() {
            SavedState savedState = new SavedState();
            savedState.f10237a = this.f10216a;
            savedState.f10238b = this.f10230o;
            if (this.f10225j != null) {
                Bundle bundle = new Bundle();
                savedState.f10239c = bundle;
                this.f10225j.X(bundle);
            }
            return savedState;
        }

        void g(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f10225j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.T(this.f10226k);
            }
            this.f10225j = gVar;
            if (gVar == null || (eVar = this.f10226k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void h(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(i.a.b.f285891c, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(i.a.b.f286010x2, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(i.a.l.P3, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f10227l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(i.a.m.S0);
            this.f10217b = typedArrayObtainStyledAttributes.getResourceId(i.a.m.B2, 0);
            this.f10221f = typedArrayObtainStyledAttributes.getResourceId(i.a.m.U0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f10240a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f10240a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th2) {
            String message;
            return (th2 instanceof Resources.NotFoundException) && (message = th2.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"));
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
            if (!a(th2)) {
                this.f10240a.uncaughtException(thread, th2);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th2.getMessage() + AppCompatDelegateImpl.f10190h4);
            notFoundException.initCause(th2.getCause());
            notFoundException.setStackTrace(th2.getStackTrace());
            this.f10240a.uncaughtException(thread, notFoundException);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.T3 & 1) != 0) {
                appCompatDelegateImpl.A0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.T3 & 4096) != 0) {
                appCompatDelegateImpl2.A0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.S3 = false;
            appCompatDelegateImpl3.T3 = 0;
        }
    }

    class c implements androidx.core.view.b1 {
        c() {
        }

        @Override // androidx.core.view.b1
        public g3 b(View view, g3 g3Var) {
            int iR = g3Var.r();
            int iX1 = AppCompatDelegateImpl.this.x1(g3Var, null);
            if (iR != iX1) {
                g3Var = g3Var.D(g3Var.p(), iX1, g3Var.q(), g3Var.o());
            }
            return u1.j1(view, g3Var);
        }
    }

    class d implements p0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.p0.a
        public void a(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.x1(null, rect);
        }
    }

    class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.y0();
        }
    }

    class f implements Runnable {

        class a extends h2 {
            a() {
            }

            @Override // androidx.core.view.h2, androidx.core.view.g2
            public void b(View view) {
                AppCompatDelegateImpl.this.f10201o3.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f10207r3.t(null);
                AppCompatDelegateImpl.this.f10207r3 = null;
            }

            @Override // androidx.core.view.h2, androidx.core.view.g2
            public void c(View view) {
                AppCompatDelegateImpl.this.f10201o3.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f10205p3.showAtLocation(appCompatDelegateImpl.f10201o3, 55, 0, 0);
            AppCompatDelegateImpl.this.B0();
            if (!AppCompatDelegateImpl.this.n1()) {
                AppCompatDelegateImpl.this.f10201o3.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f10201o3.setVisibility(0);
            } else {
                AppCompatDelegateImpl.this.f10201o3.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f10207r3 = u1.g(appCompatDelegateImpl2.f10201o3).b(1.0f);
                AppCompatDelegateImpl.this.f10207r3.t(new a());
            }
        }
    }

    class g extends h2 {
        g() {
        }

        @Override // androidx.core.view.h2, androidx.core.view.g2
        public void b(View view) {
            AppCompatDelegateImpl.this.f10201o3.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f10207r3.t(null);
            AppCompatDelegateImpl.this.f10207r3 = null;
        }

        @Override // androidx.core.view.h2, androidx.core.view.g2
        public void c(View view) {
            AppCompatDelegateImpl.this.f10201o3.setVisibility(0);
            if (AppCompatDelegateImpl.this.f10201o3.getParent() instanceof View) {
                u1.A1((View) AppCompatDelegateImpl.this.f10201o3.getParent());
            }
        }
    }

    private class h implements androidx.appcompat.app.b.InterfaceC0030b {
        h() {
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public Drawable a() {
            j1 j1VarF = j1.F(d(), null, new int[]{i.a.b.E1});
            Drawable drawableH = j1VarF.h(0);
            j1VarF.I();
            return drawableH;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public void b(Drawable drawable, int i10) {
            androidx.appcompat.app.a aVarC = AppCompatDelegateImpl.this.C();
            if (aVarC != null) {
                aVarC.k0(drawable);
                aVarC.h0(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public void c(int i10) {
            androidx.appcompat.app.a aVarC = AppCompatDelegateImpl.this.C();
            if (aVarC != null) {
                aVarC.h0(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public Context d() {
            return AppCompatDelegateImpl.this.G0();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0030b
        public boolean e() {
            androidx.appcompat.app.a aVarC = AppCompatDelegateImpl.this.C();
            return (aVarC == null || (aVarC.o() & 4) == 0) ? false : true;
        }
    }

    interface i {
        boolean a(int i10);

        @androidx.annotation.p0
        View onCreatePanelView(int i10);
    }

    private final class j implements androidx.appcompat.view.menu.n.a {
        j() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@NonNull androidx.appcompat.view.menu.g gVar, boolean z10) {
            AppCompatDelegateImpl.this.s0(gVar);
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@NonNull androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackP0 = AppCompatDelegateImpl.this.P0();
            if (callbackP0 != null) {
                callbackP0.onMenuOpened(108, gVar);
            }
            return true;
        }
    }

    class k implements androidx.appcompat.view.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.appcompat.view.b.a f10250a;

        class a extends h2 {
            a() {
            }

            @Override // androidx.core.view.h2, androidx.core.view.g2
            public void b(View view) {
                AppCompatDelegateImpl.this.f10201o3.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f10205p3;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f10201o3.getParent() instanceof View) {
                    u1.A1((View) AppCompatDelegateImpl.this.f10201o3.getParent());
                }
                AppCompatDelegateImpl.this.f10201o3.t();
                AppCompatDelegateImpl.this.f10207r3.t(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f10207r3 = null;
                u1.A1(appCompatDelegateImpl2.f10210u3);
            }
        }

        public k(androidx.appcompat.view.b.a aVar) {
            this.f10250a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean a(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f10250a.a(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f10250a.b(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            u1.A1(AppCompatDelegateImpl.this.f10210u3);
            return this.f10250a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public void d(androidx.appcompat.view.b bVar) {
            this.f10250a.d(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f10205p3 != null) {
                appCompatDelegateImpl.H1.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f10206q3);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f10201o3 != null) {
                appCompatDelegateImpl2.B0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f10207r3 = u1.g(appCompatDelegateImpl3.f10201o3).b(0.0f);
                AppCompatDelegateImpl.this.f10207r3.t(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            androidx.appcompat.app.e eVar = appCompatDelegateImpl4.f10193g3;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(appCompatDelegateImpl4.f10200n3);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f10200n3 = null;
            u1.A1(appCompatDelegateImpl5.f10210u3);
            AppCompatDelegateImpl.this.v1();
        }
    }

    @w0(21)
    static class l {
        private l() {
        }

        @androidx.annotation.u
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @androidx.annotation.u
        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @w0(24)
    static class m {
        private m() {
        }

        @androidx.annotation.u
        static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        @androidx.annotation.u
        static androidx.core.os.p b(Configuration configuration) {
            return androidx.core.os.p.c(configuration.getLocales().toLanguageTags());
        }

        @androidx.annotation.u
        public static void c(androidx.core.os.p pVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(pVar.m()));
        }

        @androidx.annotation.u
        static void d(Configuration configuration, androidx.core.os.p pVar) {
            configuration.setLocales(LocaleList.forLanguageTags(pVar.m()));
        }
    }

    @w0(26)
    static class n {
        private n() {
        }

        static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    @w0(33)
    static class o {
        private o() {
        }

        @androidx.annotation.u
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        @androidx.annotation.u
        static OnBackInvokedCallback b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.o
                public final void onBackInvoked() {
                    appCompatDelegateImpl.W0();
                }
            };
            androidx.appcompat.app.k.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        @androidx.annotation.u
        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.k.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.j.a(obj2));
        }
    }

    class p extends androidx.appcompat.view.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i f10253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f10255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f10256e;

        p(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f10255d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f10255d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f10254c = true;
                callback.onContentChanged();
                this.f10254c = false;
            } catch (Throwable th2) {
                this.f10254c = false;
                throw th2;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f10256e = true;
                callback.onPanelClosed(i10, menu);
                this.f10256e = false;
            } catch (Throwable th2) {
                this.f10256e = false;
                throw th2;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f10255d) {
                return a().dispatchKeyEvent(keyEvent);
            }
            return AppCompatDelegateImpl.this.z0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.Z0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(@androidx.annotation.p0 i iVar) {
            this.f10253b = iVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            androidx.appcompat.view.f.a aVar = new androidx.appcompat.view.f.a(AppCompatDelegateImpl.this.f10203p1, callback);
            androidx.appcompat.view.b bVarI0 = AppCompatDelegateImpl.this.i0(aVar);
            if (bVarI0 != null) {
                return aVar.e(bVarI0);
            }
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onContentChanged() {
            if (this.f10254c) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View viewOnCreatePanelView;
            i iVar = this.f10253b;
            return (iVar == null || (viewOnCreatePanelView = iVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            AppCompatDelegateImpl.this.c1(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f10256e) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                AppCompatDelegateImpl.this.d1(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i10 == 0 && gVar == null) {
                return false;
            }
            boolean zOnPreparePanel = true;
            if (gVar != null) {
                gVar.j0(true);
            }
            i iVar = this.f10253b;
            if (iVar == null || !iVar.a(i10)) {
                zOnPreparePanel = false;
            }
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            }
            if (gVar != null) {
                gVar.j0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        @w0(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.g gVar;
            PanelFeatureState panelFeatureStateM0 = AppCompatDelegateImpl.this.M0(0, true);
            if (panelFeatureStateM0 == null || (gVar = panelFeatureStateM0.f10225j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        @w0(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (AppCompatDelegateImpl.this.I() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    private class q extends r {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f10258c;

        q(Context context) {
            super();
            this.f10258c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.r
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.r
        public int c() {
            return l.a(this.f10258c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.r
        public void e() {
            AppCompatDelegateImpl.this.h();
        }
    }

    @l1
    @b1({b1.a.LIBRARY})
    abstract class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f10260a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                r.this.e();
            }
        }

        r() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f10260a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f10203p1.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f10260a = null;
            }
        }

        @androidx.annotation.p0
        abstract IntentFilter b();

        abstract int c();

        boolean d() {
            return this.f10260a != null;
        }

        abstract void e();

        void f() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB != null && intentFilterB.countActions() != 0) {
                if (this.f10260a == null) {
                    this.f10260a = new a();
                }
                AppCompatDelegateImpl.this.f10203p1.registerReceiver(this.f10260a, intentFilterB);
            }
        }
    }

    private class s extends r {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a0 f10263c;

        s(a0 a0Var) {
            super();
            this.f10263c = a0Var;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.r
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.r
        public int c() {
            return this.f10263c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.r
        public void e() {
            AppCompatDelegateImpl.this.h();
        }
    }

    private class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        private boolean c(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.z0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.u0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(j.a.b(getContext(), i10));
        }
    }

    private final class u implements androidx.appcompat.view.menu.n.a {
        u() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@NonNull androidx.appcompat.view.menu.g gVar, boolean z10) {
            androidx.appcompat.view.menu.g gVarG = gVar.G();
            boolean z11 = gVarG != gVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z11) {
                gVar = gVarG;
            }
            PanelFeatureState panelFeatureStateE0 = appCompatDelegateImpl.E0(gVar);
            if (panelFeatureStateE0 != null) {
                if (z11) {
                    AppCompatDelegateImpl.this.r0(panelFeatureStateE0.f10216a, panelFeatureStateE0, gVarG);
                    AppCompatDelegateImpl.this.v0(panelFeatureStateE0, true);
                    return;
                }
                AppCompatDelegateImpl.this.v0(panelFeatureStateE0, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@NonNull androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackP0;
            if (gVar == gVar.G()) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (appCompatDelegateImpl.f10215z3 && (callbackP0 = appCompatDelegateImpl.P0()) != null && !AppCompatDelegateImpl.this.K3) {
                    callbackP0.onMenuOpened(108, gVar);
                }
            }
            return true;
        }
    }

    AppCompatDelegateImpl(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    private void C0() {
        if (this.f10209t3) {
            return;
        }
        this.f10210u3 = x0();
        CharSequence charSequenceO0 = O0();
        if (!TextUtils.isEmpty(charSequenceO0)) {
            k0 k0Var = this.f10197k3;
            if (k0Var != null) {
                k0Var.setWindowTitle(charSequenceO0);
            } else if (g1() != null) {
                g1().A0(charSequenceO0);
            } else {
                TextView textView = this.f10211v3;
                if (textView != null) {
                    textView.setText(charSequenceO0);
                }
            }
        }
        n0();
        e1(this.f10210u3);
        this.f10209t3 = true;
        PanelFeatureState panelFeatureStateM0 = M0(0, false);
        if (this.K3) {
            return;
        }
        if (panelFeatureStateM0 == null || panelFeatureStateM0.f10225j == null) {
            U0(108);
        }
    }

    private void D0() {
        if (this.H1 == null) {
            Object obj = this.f10202p0;
            if (obj instanceof Activity) {
                o0(((Activity) obj).getWindow());
            }
        }
        if (this.H1 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @NonNull
    private static Configuration F0(@NonNull Configuration configuration, @androidx.annotation.p0 Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            m.a(configuration, configuration2, configuration3);
            int i14 = configuration.touchscreen;
            int i15 = configuration2.touchscreen;
            if (i14 != i15) {
                configuration3.touchscreen = i15;
            }
            int i16 = configuration.keyboard;
            int i17 = configuration2.keyboard;
            if (i16 != i17) {
                configuration3.keyboard = i17;
            }
            int i18 = configuration.keyboardHidden;
            int i19 = configuration2.keyboardHidden;
            if (i18 != i19) {
                configuration3.keyboardHidden = i19;
            }
            int i20 = configuration.navigation;
            int i21 = configuration2.navigation;
            if (i20 != i21) {
                configuration3.navigation = i21;
            }
            int i22 = configuration.navigationHidden;
            int i23 = configuration2.navigationHidden;
            if (i22 != i23) {
                configuration3.navigationHidden = i23;
            }
            int i24 = configuration.orientation;
            int i25 = configuration2.orientation;
            if (i24 != i25) {
                configuration3.orientation = i25;
            }
            int i26 = configuration.screenLayout & 15;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 15)) {
                configuration3.screenLayout |= i27 & 15;
            }
            int i28 = configuration.screenLayout & 192;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 192)) {
                configuration3.screenLayout |= i29 & 192;
            }
            int i30 = configuration.screenLayout & 48;
            int i31 = configuration2.screenLayout;
            if (i30 != (i31 & 48)) {
                configuration3.screenLayout |= i31 & 48;
            }
            int i32 = configuration.screenLayout & com.google.android.material.internal.p0.f112892a;
            int i33 = configuration2.screenLayout;
            if (i32 != (i33 & com.google.android.material.internal.p0.f112892a)) {
                configuration3.screenLayout |= i33 & com.google.android.material.internal.p0.f112892a;
            }
            n.a(configuration, configuration2, configuration3);
            int i34 = configuration.uiMode & 15;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 15)) {
                configuration3.uiMode |= i35 & 15;
            }
            int i36 = configuration.uiMode & 48;
            int i37 = configuration2.uiMode;
            if (i36 != (i37 & 48)) {
                configuration3.uiMode |= i37 & 48;
            }
            int i38 = configuration.screenWidthDp;
            int i39 = configuration2.screenWidthDp;
            if (i38 != i39) {
                configuration3.screenWidthDp = i39;
            }
            int i40 = configuration.screenHeightDp;
            int i41 = configuration2.screenHeightDp;
            if (i40 != i41) {
                configuration3.screenHeightDp = i41;
            }
            int i42 = configuration.smallestScreenWidthDp;
            int i43 = configuration2.smallestScreenWidthDp;
            if (i42 != i43) {
                configuration3.smallestScreenWidthDp = i43;
            }
            int i44 = configuration.densityDpi;
            int i45 = configuration2.densityDpi;
            if (i44 != i45) {
                configuration3.densityDpi = i45;
            }
        }
        return configuration3;
    }

    private int H0(Context context) {
        if (!this.P3 && (this.f10202p0 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f10202p0.getClass()), 269221888);
                if (activityInfo != null) {
                    this.O3 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.O3 = 0;
            }
        }
        this.P3 = true;
        return this.O3;
    }

    private r I0(@NonNull Context context) {
        if (this.R3 == null) {
            this.R3 = new q(context);
        }
        return this.R3;
    }

    private r K0(@NonNull Context context) {
        if (this.Q3 == null) {
            this.Q3 = new s(a0.a(context));
        }
        return this.Q3;
    }

    private void Q0() {
        C0();
        if (this.f10215z3 && this.f10194h3 == null) {
            Object obj = this.f10202p0;
            if (obj instanceof Activity) {
                this.f10194h3 = new b0((Activity) this.f10202p0, this.A3);
            } else if (obj instanceof Dialog) {
                this.f10194h3 = new b0((Dialog) this.f10202p0);
            }
            androidx.appcompat.app.a aVar = this.f10194h3;
            if (aVar != null) {
                aVar.W(this.V3);
            }
        }
    }

    private boolean R0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f10224i;
        if (view != null) {
            panelFeatureState.f10223h = view;
            return true;
        }
        if (panelFeatureState.f10225j == null) {
            return false;
        }
        if (this.f10199m3 == null) {
            this.f10199m3 = new u();
        }
        View view2 = (View) panelFeatureState.c(this.f10199m3);
        panelFeatureState.f10223h = view2;
        return view2 != null;
    }

    private boolean S0(PanelFeatureState panelFeatureState) {
        panelFeatureState.h(G0());
        panelFeatureState.f10222g = new t(panelFeatureState.f10227l);
        panelFeatureState.f10218c = 81;
        return true;
    }

    private boolean T0(PanelFeatureState panelFeatureState) {
        Resources.Theme themeNewTheme;
        Context context = this.f10203p1;
        int i10 = panelFeatureState.f10216a;
        if ((i10 == 0 || i10 == 108) && this.f10197k3 != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(i.a.b.f285933j, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(i.a.b.f285939k, typedValue, true);
            } else {
                theme.resolveAttribute(i.a.b.f285939k, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.Y(this);
        panelFeatureState.g(gVar);
        return true;
    }

    private void U0(int i10) {
        this.T3 = (1 << i10) | this.T3;
        if (this.S3) {
            return;
        }
        u1.u1(this.H1.getDecorView(), this.U3);
        this.S3 = true;
    }

    private boolean Y0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState panelFeatureStateM0 = M0(i10, true);
        if (panelFeatureStateM0.f10230o) {
            return false;
        }
        return i1(panelFeatureStateM0, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    private boolean b1(int i10, KeyEvent keyEvent) {
        boolean zI1;
        AudioManager audioManager;
        k0 k0Var;
        if (this.f10200n3 != null) {
            return false;
        }
        boolean zF = true;
        PanelFeatureState panelFeatureStateM0 = M0(i10, true);
        if (i10 != 0 || (k0Var = this.f10197k3) == null || !k0Var.a() || ViewConfiguration.get(this.f10203p1).hasPermanentMenuKey()) {
            boolean z10 = panelFeatureStateM0.f10230o;
            if (z10 || panelFeatureStateM0.f10229n) {
                v0(panelFeatureStateM0, true);
                zF = z10;
            } else if (panelFeatureStateM0.f10228m) {
                if (panelFeatureStateM0.f10233r) {
                    panelFeatureStateM0.f10228m = false;
                    zI1 = i1(panelFeatureStateM0, keyEvent);
                } else {
                    zI1 = true;
                }
                if (zI1) {
                    f1(panelFeatureStateM0, keyEvent);
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
        } else if (this.f10197k3.d()) {
            zF = this.f10197k3.f();
        } else if (this.K3 || !i1(panelFeatureStateM0, keyEvent)) {
            zF = false;
        } else {
            zF = this.f10197k3.c();
        }
        if (zF && (audioManager = (AudioManager) this.f10203p1.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return zF;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    private void f1(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.f10230o || this.K3) {
            return;
        }
        if (panelFeatureState.f10216a == 0 && (this.f10203p1.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackP0 = P0();
        if (callbackP0 != null && !callbackP0.onMenuOpened(panelFeatureState.f10216a, panelFeatureState.f10225j)) {
            v0(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f10203p1.getSystemService("window");
        if (windowManager != null && i1(panelFeatureState, keyEvent)) {
            ViewGroup viewGroup = panelFeatureState.f10222g;
            if (viewGroup != null && !panelFeatureState.f10232q) {
                View view = panelFeatureState.f10224i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                }
                panelFeatureState.f10229n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, panelFeatureState.f10219d, panelFeatureState.f10220e, 1002, 8519680, -3);
                layoutParams2.gravity = panelFeatureState.f10218c;
                layoutParams2.windowAnimations = panelFeatureState.f10221f;
                windowManager.addView(panelFeatureState.f10222g, layoutParams2);
                panelFeatureState.f10230o = true;
                if (panelFeatureState.f10216a == 0) {
                    v1();
                }
            }
            if (viewGroup == null) {
                if (!S0(panelFeatureState)) {
                    return;
                }
                if (panelFeatureState.f10222g == null) {
                    return;
                }
            } else if (panelFeatureState.f10232q && viewGroup.getChildCount() > 0) {
                panelFeatureState.f10222g.removeAllViews();
            }
            if (!R0(panelFeatureState) || !panelFeatureState.d()) {
                panelFeatureState.f10232q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = panelFeatureState.f10223h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            panelFeatureState.f10222g.setBackgroundResource(panelFeatureState.f10217b);
            ViewParent parent = panelFeatureState.f10223h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(panelFeatureState.f10223h);
            }
            panelFeatureState.f10222g.addView(panelFeatureState.f10223h, layoutParams3);
            if (!panelFeatureState.f10223h.hasFocus()) {
                panelFeatureState.f10223h.requestFocus();
            }
            i10 = -2;
            panelFeatureState.f10229n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i10, -2, panelFeatureState.f10219d, panelFeatureState.f10220e, 1002, 8519680, -3);
            layoutParams4.gravity = panelFeatureState.f10218c;
            layoutParams4.windowAnimations = panelFeatureState.f10221f;
            windowManager.addView(panelFeatureState.f10222g, layoutParams4);
            panelFeatureState.f10230o = true;
            if (panelFeatureState.f10216a == 0) {
                v1();
            }
        }
    }

    private boolean h1(PanelFeatureState panelFeatureState, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.g gVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f10228m || i1(panelFeatureState, keyEvent)) && (gVar = panelFeatureState.f10225j) != null) {
            zPerformShortcut = gVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f10197k3 == null) {
            v0(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    private boolean i1(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        if (this.K3) {
            return false;
        }
        if (panelFeatureState.f10228m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.G3;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            v0(panelFeatureState2, false);
        }
        Window.Callback callbackP0 = P0();
        if (callbackP0 != null) {
            panelFeatureState.f10224i = callbackP0.onCreatePanelView(panelFeatureState.f10216a);
        }
        int i10 = panelFeatureState.f10216a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (k0Var3 = this.f10197k3) != null) {
            k0Var3.h();
        }
        if (panelFeatureState.f10224i == null && (!z10 || !(g1() instanceof y))) {
            androidx.appcompat.view.menu.g gVar = panelFeatureState.f10225j;
            if (gVar == null || panelFeatureState.f10233r) {
                if (gVar == null && (!T0(panelFeatureState) || panelFeatureState.f10225j == null)) {
                    return false;
                }
                if (z10 && this.f10197k3 != null) {
                    if (this.f10198l3 == null) {
                        this.f10198l3 = new j();
                    }
                    this.f10197k3.g(panelFeatureState.f10225j, this.f10198l3);
                }
                panelFeatureState.f10225j.n0();
                if (!callbackP0.onCreatePanelMenu(panelFeatureState.f10216a, panelFeatureState.f10225j)) {
                    panelFeatureState.g(null);
                    if (z10 && (k0Var = this.f10197k3) != null) {
                        k0Var.g(null, this.f10198l3);
                    }
                    return false;
                }
                panelFeatureState.f10233r = false;
            }
            panelFeatureState.f10225j.n0();
            Bundle bundle = panelFeatureState.f10236u;
            if (bundle != null) {
                panelFeatureState.f10225j.U(bundle);
                panelFeatureState.f10236u = null;
            }
            if (!callbackP0.onPreparePanel(0, panelFeatureState.f10224i, panelFeatureState.f10225j)) {
                if (z10 && (k0Var2 = this.f10197k3) != null) {
                    k0Var2.g(null, this.f10198l3);
                }
                panelFeatureState.f10225j.m0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f10231p = z11;
            panelFeatureState.f10225j.setQwertyMode(z11);
            panelFeatureState.f10225j.m0();
        }
        panelFeatureState.f10228m = true;
        panelFeatureState.f10229n = false;
        this.G3 = panelFeatureState;
        return true;
    }

    private void j1(boolean z10) {
        k0 k0Var = this.f10197k3;
        if (k0Var == null || !k0Var.a() || (ViewConfiguration.get(this.f10203p1).hasPermanentMenuKey() && !this.f10197k3.j())) {
            PanelFeatureState panelFeatureStateM0 = M0(0, true);
            panelFeatureStateM0.f10232q = true;
            v0(panelFeatureStateM0, false);
            f1(panelFeatureStateM0, null);
            return;
        }
        Window.Callback callbackP0 = P0();
        if (this.f10197k3.d() && z10) {
            this.f10197k3.f();
            if (!this.K3) {
                callbackP0.onPanelClosed(108, M0(0, true).f10225j);
            }
        } else if (callbackP0 != null && !this.K3) {
            if (this.S3 && (this.T3 & 1) != 0) {
                this.H1.getDecorView().removeCallbacks(this.U3);
                this.U3.run();
            }
            PanelFeatureState panelFeatureStateM1 = M0(0, true);
            androidx.appcompat.view.menu.g gVar = panelFeatureStateM1.f10225j;
            if (gVar != null && !panelFeatureStateM1.f10233r && callbackP0.onPreparePanel(0, panelFeatureStateM1.f10224i, gVar)) {
                callbackP0.onMenuOpened(108, panelFeatureStateM1.f10225j);
                this.f10197k3.c();
            }
        }
    }

    private int k1(int i10) {
        if (i10 == 8) {
            return 108;
        }
        if (i10 == 9) {
            return 109;
        }
        return i10;
    }

    private boolean l0(boolean z10) {
        return m0(z10, true);
    }

    private boolean m0(boolean z10, boolean z11) {
        if (this.K3) {
            return false;
        }
        int iQ0 = q0();
        int iV0 = V0(this.f10203p1, iQ0);
        androidx.core.os.p pVarP0 = Build.VERSION.SDK_INT < 33 ? p0(this.f10203p1) : null;
        if (!z11 && pVarP0 != null) {
            pVarP0 = L0(this.f10203p1.getResources().getConfiguration());
        }
        boolean zU1 = u1(iV0, pVarP0, z10);
        if (iQ0 == 0) {
            K0(this.f10203p1).f();
        } else {
            r rVar = this.Q3;
            if (rVar != null) {
                rVar.a();
            }
        }
        if (iQ0 == 3) {
            I0(this.f10203p1).f();
            return zU1;
        }
        r rVar2 = this.R3;
        if (rVar2 != null) {
            rVar2.a();
        }
        return zU1;
    }

    private void n0() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f10210u3.findViewById(R.id.content);
        View decorView = this.H1.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f10203p1.obtainStyledAttributes(i.a.m.S0);
        typedArrayObtainStyledAttributes.getValue(i.a.m.f286597n3, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(i.a.m.f286605o3, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(i.a.m.f286580l3)) {
            typedArrayObtainStyledAttributes.getValue(i.a.m.f286580l3, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(i.a.m.f286589m3)) {
            typedArrayObtainStyledAttributes.getValue(i.a.m.f286589m3, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(i.a.m.f286562j3)) {
            typedArrayObtainStyledAttributes.getValue(i.a.m.f286562j3, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(i.a.m.f286571k3)) {
            typedArrayObtainStyledAttributes.getValue(i.a.m.f286571k3, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void o0(@NonNull Window window) {
        if (this.H1 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof p) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        p pVar = new p(callback);
        this.f10204p2 = pVar;
        window.setCallback(pVar);
        j1 j1VarF = j1.F(this.f10203p1, null, f10187e4);
        Drawable drawableI = j1VarF.i(0);
        if (drawableI != null) {
            window.setBackgroundDrawable(drawableI);
        }
        j1VarF.I();
        this.H1 = window;
        if (Build.VERSION.SDK_INT >= 33 && this.f10191a4 == null) {
            e0(null);
        }
    }

    private boolean o1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.H1.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int q0() {
        int i10 = this.M3;
        return i10 != -100 ? i10 : androidx.appcompat.app.h.v();
    }

    private void r1() {
        if (this.f10209t3) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @androidx.annotation.p0
    private androidx.appcompat.app.d s1() {
        for (Context baseContext = this.f10203p1; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void t0() {
        r rVar = this.Q3;
        if (rVar != null) {
            rVar.a();
        }
        r rVar2 = this.R3;
        if (rVar2 != null) {
            rVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t1(Configuration configuration) {
        Activity activity = (Activity) this.f10202p0;
        if (activity instanceof o0) {
            if (((o0) activity).getLifecycle().d().n(c0.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.J3 && !this.K3) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    private boolean u1(int i10, @androidx.annotation.p0 androidx.core.os.p pVar, boolean z10) {
        boolean z11;
        Configuration configurationW0 = w0(this.f10203p1, i10, pVar, null, false);
        int iH0 = H0(this.f10203p1);
        Configuration configuration = this.L3;
        if (configuration == null) {
            configuration = this.f10203p1.getResources().getConfiguration();
        }
        int i11 = configuration.uiMode & 48;
        int i12 = configurationW0.uiMode & 48;
        androidx.core.os.p pVarL0 = L0(configuration);
        int i13 = 6 << 0;
        androidx.core.os.p pVarL1 = pVar == null ? null : L0(configurationW0);
        int i14 = i11 != i12 ? 512 : 0;
        if (pVarL1 != null && !pVarL0.equals(pVarL1)) {
            i14 |= 8196;
        }
        boolean z12 = true;
        if (((~iH0) & i14) != 0 && z10 && this.I3 && (f10188f4 || this.J3)) {
            Object obj = this.f10202p0;
            if (!(obj instanceof Activity) || ((Activity) obj).isChild()) {
                z11 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i14 & 8192) != 0) {
                    ((Activity) this.f10202p0).getWindow().getDecorView().setLayoutDirection(configurationW0.getLayoutDirection());
                }
                androidx.core.app.b.K((Activity) this.f10202p0);
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11 || i14 == 0) {
            z12 = z11;
        } else {
            w1(i12, pVarL1, (i14 & iH0) == i14, null);
        }
        if (z12) {
            Object obj2 = this.f10202p0;
            if (obj2 instanceof androidx.appcompat.app.d) {
                if ((i14 & 512) != 0) {
                    ((androidx.appcompat.app.d) obj2).onNightModeChanged(i10);
                }
                if ((i14 & 4) != 0) {
                    ((androidx.appcompat.app.d) this.f10202p0).onLocalesChanged(pVar);
                }
            }
        }
        if (pVarL1 != null) {
            m1(L0(this.f10203p1.getResources().getConfiguration()));
        }
        return z12;
    }

    @NonNull
    private Configuration w0(@NonNull Context context, int i10, @androidx.annotation.p0 androidx.core.os.p pVar, @androidx.annotation.p0 Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (pVar != null) {
            l1(configuration2, pVar);
        }
        return configuration2;
    }

    private void w1(int i10, @androidx.annotation.p0 androidx.core.os.p pVar, boolean z10, @androidx.annotation.p0 Configuration configuration) {
        Resources resources = this.f10203p1.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (pVar != null) {
            l1(configuration2, pVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i11 = this.N3;
        if (i11 != 0) {
            this.f10203p1.setTheme(i11);
            this.f10203p1.getTheme().applyStyle(this.N3, true);
        }
        if (z10 && (this.f10202p0 instanceof Activity)) {
            t1(configuration2);
        }
    }

    private ViewGroup x0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f10203p1.obtainStyledAttributes(i.a.m.S0);
        if (!typedArrayObtainStyledAttributes.hasValue(i.a.m.f286535g3)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.a.m.f286613p3, false)) {
            T(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i.a.m.f286535g3, false)) {
            T(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.a.m.f286544h3, false)) {
            T(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.a.m.f286553i3, false)) {
            T(10);
        }
        this.C3 = typedArrayObtainStyledAttributes.getBoolean(i.a.m.T0, false);
        typedArrayObtainStyledAttributes.recycle();
        D0();
        this.H1.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f10203p1);
        if (this.D3) {
            viewGroup = this.B3 ? (ViewGroup) layoutInflaterFrom.inflate(i.a.j.f286265w, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(i.a.j.f286264v, (ViewGroup) null);
        } else if (this.C3) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(i.a.j.f286255m, (ViewGroup) null);
            this.A3 = false;
            this.f10215z3 = false;
        } else if (this.f10215z3) {
            TypedValue typedValue = new TypedValue();
            this.f10203p1.getTheme().resolveAttribute(i.a.b.f285933j, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f10203p1, typedValue.resourceId) : this.f10203p1).inflate(i.a.j.f286266x, (ViewGroup) null);
            k0 k0Var = (k0) viewGroup.findViewById(i.a.g.f286226x);
            this.f10197k3 = k0Var;
            k0Var.setWindowCallback(P0());
            if (this.A3) {
                this.f10197k3.p(109);
            }
            if (this.f10213x3) {
                this.f10197k3.p(2);
            }
            if (this.f10214y3) {
                this.f10197k3.p(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f10215z3 + ", windowActionBarOverlay: " + this.A3 + ", android:windowIsFloating: " + this.C3 + ", windowActionModeOverlay: " + this.B3 + ", windowNoTitle: " + this.D3 + " }");
        }
        u1.j2(viewGroup, new c());
        if (this.f10197k3 == null) {
            this.f10211v3 = (TextView) viewGroup.findViewById(i.a.g.f286217s0);
        }
        v1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(i.a.g.f286182b);
        ViewGroup viewGroup2 = (ViewGroup) this.H1.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.H1.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    private void y1(View view) {
        view.setBackgroundColor((u1.F0(view) & 8192) != 0 ? androidx.core.content.d.g(this.f10203p1, i.a.d.f286036g) : androidx.core.content.d.g(this.f10203p1, i.a.d.f286034f));
    }

    void A0(int i10) {
        PanelFeatureState panelFeatureStateM0;
        PanelFeatureState panelFeatureStateM1 = M0(i10, true);
        if (panelFeatureStateM1.f10225j != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateM1.f10225j.W(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateM1.f10236u = bundle;
            }
            panelFeatureStateM1.f10225j.n0();
            panelFeatureStateM1.f10225j.clear();
        }
        panelFeatureStateM1.f10233r = true;
        panelFeatureStateM1.f10232q = true;
        if ((i10 != 108 && i10 != 0) || this.f10197k3 == null || (panelFeatureStateM0 = M0(0, false)) == null) {
            return;
        }
        panelFeatureStateM0.f10228m = false;
        i1(panelFeatureStateM0, null);
    }

    void B0() {
        f2 f2Var = this.f10207r3;
        if (f2Var != null) {
            f2Var.d();
        }
    }

    @Override // androidx.appcompat.app.h
    public androidx.appcompat.app.a C() {
        Q0();
        return this.f10194h3;
    }

    @Override // androidx.appcompat.app.h
    public boolean D(int i10) {
        boolean z10;
        int iK1 = k1(i10);
        if (iK1 == 1) {
            z10 = this.D3;
        } else if (iK1 == 2) {
            z10 = this.f10213x3;
        } else if (iK1 == 5) {
            z10 = this.f10214y3;
        } else if (iK1 == 10) {
            z10 = this.B3;
        } else if (iK1 != 108) {
            z10 = iK1 != 109 ? false : this.A3;
        } else {
            z10 = this.f10215z3;
        }
        return z10 || this.H1.hasFeature(i10);
    }

    @Override // androidx.appcompat.app.h
    public void E() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f10203p1);
        if (layoutInflaterFrom.getFactory() == null) {
            h0.d(layoutInflaterFrom, this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    PanelFeatureState E0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.F3;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
            if (panelFeatureState != null && panelFeatureState.f10225j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.h
    public void F() {
        if (g1() != null && !C().C()) {
            U0(0);
        }
    }

    final Context G0() {
        androidx.appcompat.app.a aVarC = C();
        Context contextZ = aVarC != null ? aVarC.z() : null;
        return contextZ == null ? this.f10203p1 : contextZ;
    }

    @Override // androidx.appcompat.app.h
    public boolean I() {
        return this.f10208s3;
    }

    @Override // androidx.appcompat.app.h
    public void J(Configuration configuration) {
        androidx.appcompat.app.a aVarC;
        if (this.f10215z3 && this.f10209t3 && (aVarC = C()) != null) {
            aVarC.H(configuration);
        }
        androidx.appcompat.widget.n.b().g(this.f10203p1);
        this.L3 = new Configuration(this.f10203p1.getResources().getConfiguration());
        m0(false, false);
    }

    @NonNull
    @l1
    @b1({b1.a.LIBRARY})
    final r J0() {
        return K0(this.f10203p1);
    }

    @Override // androidx.appcompat.app.h
    public void K(Bundle bundle) {
        String strD;
        this.I3 = true;
        l0(false);
        D0();
        Object obj = this.f10202p0;
        if (obj instanceof Activity) {
            try {
                strD = androidx.core.app.s.d((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strD = null;
            }
            if (strD != null) {
                androidx.appcompat.app.a aVarG1 = g1();
                if (aVarG1 == null) {
                    this.V3 = true;
                } else {
                    aVarG1.W(true);
                }
            }
            androidx.appcompat.app.h.e(this);
        }
        this.L3 = new Configuration(this.f10203p1.getResources().getConfiguration());
        this.J3 = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    @Override // androidx.appcompat.app.h
    public void L() {
        if (this.f10202p0 instanceof Activity) {
            androidx.appcompat.app.h.R(this);
        }
        if (this.S3) {
            this.H1.getDecorView().removeCallbacks(this.U3);
        }
        this.K3 = true;
        if (this.M3 != -100) {
            Object obj = this.f10202p0;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f10185c4.put(this.f10202p0.getClass().getName(), Integer.valueOf(this.M3));
            } else {
                f10185c4.remove(this.f10202p0.getClass().getName());
            }
        } else {
            f10185c4.remove(this.f10202p0.getClass().getName());
        }
        androidx.appcompat.app.a aVar = this.f10194h3;
        if (aVar != null) {
            aVar.I();
        }
        t0();
    }

    androidx.core.os.p L0(Configuration configuration) {
        return m.b(configuration);
    }

    @Override // androidx.appcompat.app.h
    public void M(Bundle bundle) {
        C0();
    }

    protected PanelFeatureState M0(int i10, boolean z10) {
        PanelFeatureState[] panelFeatureStateArr = this.F3;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i10) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i10 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.F3 = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i10);
        panelFeatureStateArr[i10] = panelFeatureState2;
        return panelFeatureState2;
    }

    @Override // androidx.appcompat.app.h
    public void N() {
        androidx.appcompat.app.a aVarC = C();
        if (aVarC != null) {
            aVarC.t0(true);
        }
    }

    ViewGroup N0() {
        return this.f10210u3;
    }

    @Override // androidx.appcompat.app.h
    public void O(Bundle bundle) {
    }

    final CharSequence O0() {
        Object obj = this.f10202p0;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f10196j3;
    }

    @Override // androidx.appcompat.app.h
    public void P() {
        m0(true, false);
    }

    final Window.Callback P0() {
        return this.H1.getCallback();
    }

    @Override // androidx.appcompat.app.h
    public void Q() {
        androidx.appcompat.app.a aVarC = C();
        if (aVarC != null) {
            aVarC.t0(false);
        }
    }

    @Override // androidx.appcompat.app.h
    public boolean T(int i10) {
        int iK1 = k1(i10);
        if (this.D3 && iK1 == 108) {
            return false;
        }
        if (this.f10215z3 && iK1 == 1) {
            this.f10215z3 = false;
        }
        if (iK1 == 1) {
            r1();
            this.D3 = true;
            return true;
        }
        if (iK1 == 2) {
            r1();
            this.f10213x3 = true;
            return true;
        }
        if (iK1 == 5) {
            r1();
            this.f10214y3 = true;
            return true;
        }
        if (iK1 == 10) {
            r1();
            this.B3 = true;
            return true;
        }
        if (iK1 == 108) {
            r1();
            this.f10215z3 = true;
            return true;
        }
        if (iK1 != 109) {
            return this.H1.requestFeature(iK1);
        }
        r1();
        this.A3 = true;
        return true;
    }

    int V0(@NonNull Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return K0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return I0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    boolean W0() {
        boolean z10 = this.H3;
        this.H3 = false;
        PanelFeatureState panelFeatureStateM0 = M0(0, false);
        if (panelFeatureStateM0 != null && panelFeatureStateM0.f10230o) {
            if (!z10) {
                v0(panelFeatureStateM0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f10200n3;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarC = C();
        return aVarC != null && aVarC.l();
    }

    @Override // androidx.appcompat.app.h
    public void X(int i10) {
        C0();
        ViewGroup viewGroup = (ViewGroup) this.f10210u3.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f10203p1).inflate(i10, viewGroup);
        this.f10204p2.c(this.H1.getCallback());
    }

    boolean X0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.H3 = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            Y0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.h
    public void Y(View view) {
        C0();
        ViewGroup viewGroup = (ViewGroup) this.f10210u3.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f10204p2.c(this.H1.getCallback());
    }

    @Override // androidx.appcompat.app.h
    public void Z(View view, ViewGroup.LayoutParams layoutParams) {
        C0();
        ViewGroup viewGroup = (ViewGroup) this.f10210u3.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f10204p2.c(this.H1.getCallback());
    }

    boolean Z0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarC = C();
        if (aVarC != null && aVarC.J(i10, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.G3;
        if (panelFeatureState != null && h1(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.G3;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f10229n = true;
            }
            return true;
        }
        if (this.G3 == null) {
            PanelFeatureState panelFeatureStateM0 = M0(0, true);
            i1(panelFeatureStateM0, keyEvent);
            boolean zH1 = h1(panelFeatureStateM0, keyEvent.getKeyCode(), keyEvent, 1);
            panelFeatureStateM0.f10228m = false;
            if (zH1) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull MenuItem menuItem) {
        PanelFeatureState panelFeatureStateE0;
        Window.Callback callbackP0 = P0();
        if (callbackP0 == null || this.K3 || (panelFeatureStateE0 = E0(gVar.G())) == null) {
            return false;
        }
        return callbackP0.onMenuItemSelected(panelFeatureStateE0.f10216a, menuItem);
    }

    boolean a1(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                b1(0, keyEvent);
                return true;
            }
        } else if (W0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(@NonNull androidx.appcompat.view.menu.g gVar) {
        j1(true);
    }

    @Override // androidx.appcompat.app.h
    public void b0(boolean z10) {
        this.f10208s3 = z10;
    }

    void c1(int i10) {
        androidx.appcompat.app.a aVarC;
        if (i10 == 108 && (aVarC = C()) != null) {
            aVarC.m(true);
        }
    }

    @Override // androidx.appcompat.app.h
    public void d0(int i10) {
        if (this.M3 != i10) {
            this.M3 = i10;
            if (this.I3) {
                h();
            }
        }
    }

    void d1(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a aVarC = C();
            if (aVarC != null) {
                aVarC.m(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            PanelFeatureState panelFeatureStateM0 = M0(i10, true);
            if (panelFeatureStateM0.f10230o) {
                v0(panelFeatureStateM0, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // androidx.appcompat.app.h
    @w0(33)
    public void e0(@androidx.annotation.p0 OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.e0(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f10191a4;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f10192b4) != null) {
            o.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f10192b4 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f10202p0;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.f10191a4 = onBackInvokedDispatcher;
            } else {
                this.f10191a4 = o.a((Activity) this.f10202p0);
            }
        } else {
            this.f10191a4 = onBackInvokedDispatcher;
        }
        v1();
    }

    void e1(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.h
    public void f(View view, ViewGroup.LayoutParams layoutParams) {
        C0();
        ((ViewGroup) this.f10210u3.findViewById(R.id.content)).addView(view, layoutParams);
        this.f10204p2.c(this.H1.getCallback());
    }

    @Override // androidx.appcompat.app.h
    public void f0(Toolbar toolbar) {
        if (this.f10202p0 instanceof Activity) {
            androidx.appcompat.app.a aVarC = C();
            if (aVarC instanceof b0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f10195i3 = null;
            if (aVarC != null) {
                aVarC.I();
            }
            this.f10194h3 = null;
            if (toolbar != null) {
                y yVar = new y(toolbar, O0(), this.f10204p2);
                this.f10194h3 = yVar;
                this.f10204p2.e(yVar.f10398k);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f10204p2.e(null);
            }
            F();
        }
    }

    @Override // androidx.appcompat.app.h
    boolean g() {
        if (androidx.appcompat.app.h.G(this.f10203p1) && androidx.appcompat.app.h.A() != null && !androidx.appcompat.app.h.A().equals(androidx.appcompat.app.h.B())) {
            k(this.f10203p1);
        }
        return l0(true);
    }

    @Override // androidx.appcompat.app.h
    public void g0(@g1 int i10) {
        this.N3 = i10;
    }

    final androidx.appcompat.app.a g1() {
        return this.f10194h3;
    }

    @Override // androidx.appcompat.app.h
    public boolean h() {
        return l0(true);
    }

    @Override // androidx.appcompat.app.h
    public final void h0(CharSequence charSequence) {
        this.f10196j3 = charSequence;
        k0 k0Var = this.f10197k3;
        if (k0Var != null) {
            k0Var.setWindowTitle(charSequence);
            return;
        }
        if (g1() != null) {
            g1().A0(charSequence);
            return;
        }
        TextView textView = this.f10211v3;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.h
    public androidx.appcompat.view.b i0(@NonNull androidx.appcompat.view.b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f10200n3;
        if (bVar != null) {
            bVar.c();
        }
        k kVar = new k(aVar);
        androidx.appcompat.app.a aVarC = C();
        if (aVarC != null) {
            androidx.appcompat.view.b bVarC0 = aVarC.C0(kVar);
            this.f10200n3 = bVarC0;
            if (bVarC0 != null && (eVar = this.f10193g3) != null) {
                eVar.onSupportActionModeStarted(bVarC0);
            }
        }
        if (this.f10200n3 == null) {
            this.f10200n3 = q1(kVar);
        }
        v1();
        return this.f10200n3;
    }

    void l1(Configuration configuration, @NonNull androidx.core.os.p pVar) {
        m.d(configuration, pVar);
    }

    @Override // androidx.appcompat.app.h
    @NonNull
    @androidx.annotation.i
    public Context m(@NonNull Context context) {
        AppCompatDelegateImpl appCompatDelegateImpl;
        Context context2;
        this.I3 = true;
        int iV0 = V0(context, q0());
        if (androidx.appcompat.app.h.G(context)) {
            androidx.appcompat.app.h.k0(context);
        }
        androidx.core.os.p pVarP0 = p0(context);
        if (context instanceof ContextThemeWrapper) {
            appCompatDelegateImpl = this;
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(appCompatDelegateImpl.w0(context2, iV0, pVarP0, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            appCompatDelegateImpl = this;
            context2 = context;
        }
        if (context2 instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context2).a(appCompatDelegateImpl.w0(context2, iV0, pVarP0, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f10188f4) {
            return super.m(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationW0 = appCompatDelegateImpl.w0(context2, iV0, pVarP0, !configuration2.equals(configuration3) ? F0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context2, i.a.l.f286307b4);
        dVar.a(configurationW0);
        try {
            if (context2.getTheme() != null) {
                androidx.core.content.res.i.g.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.m(dVar);
    }

    void m1(androidx.core.os.p pVar) {
        m.c(pVar);
    }

    final boolean n1() {
        ViewGroup viewGroup;
        return this.f10209t3 && (viewGroup = this.f10210u3) != null && viewGroup.isLaidOut();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return r(view, str, context, attributeSet);
    }

    @androidx.annotation.p0
    androidx.core.os.p p0(@NonNull Context context) {
        androidx.core.os.p pVarA;
        if (Build.VERSION.SDK_INT >= 33 || (pVarA = androidx.appcompat.app.h.A()) == null) {
            return null;
        }
        androidx.core.os.p pVarL0 = L0(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.p pVarC = v.c(pVarA, pVarL0);
        return pVarC.j() ? pVarL0 : pVarC;
    }

    boolean p1() {
        if (this.f10191a4 == null) {
            return false;
        }
        PanelFeatureState panelFeatureStateM0 = M0(0, false);
        return (panelFeatureStateM0 != null && panelFeatureStateM0.f10230o) || this.f10200n3 != null;
    }

    androidx.appcompat.view.b q1(@NonNull androidx.appcompat.view.b.a aVar) {
        androidx.appcompat.view.b bVarOnWindowStartingSupportActionMode;
        Context dVar;
        androidx.appcompat.app.e eVar;
        B0();
        androidx.appcompat.view.b bVar = this.f10200n3;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof k)) {
            aVar = new k(aVar);
        }
        androidx.appcompat.app.e eVar2 = this.f10193g3;
        if (eVar2 == null || this.K3) {
            bVarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                bVarOnWindowStartingSupportActionMode = eVar2.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
                bVarOnWindowStartingSupportActionMode = null;
            }
        }
        if (bVarOnWindowStartingSupportActionMode != null) {
            this.f10200n3 = bVarOnWindowStartingSupportActionMode;
        } else {
            if (this.f10201o3 == null) {
                if (this.C3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f10203p1.getTheme();
                    theme.resolveAttribute(i.a.b.f285933j, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f10203p1.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f10203p1, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f10203p1;
                    }
                    this.f10201o3 = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, i.a.b.f286012y);
                    this.f10205p3 = popupWindow;
                    androidx.core.widget.p.d(popupWindow, 2);
                    this.f10205p3.setContentView(this.f10201o3);
                    this.f10205p3.setWidth(-1);
                    dVar.getTheme().resolveAttribute(i.a.b.f285897d, typedValue, true);
                    this.f10201o3.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f10205p3.setHeight(-2);
                    this.f10206q3 = new f();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f10210u3.findViewById(i.a.g.f286202l);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(G0()));
                        this.f10201o3 = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f10201o3 != null) {
                B0();
                this.f10201o3.t();
                androidx.appcompat.view.e eVar3 = new androidx.appcompat.view.e(this.f10201o3.getContext(), this.f10201o3, aVar, this.f10205p3 == null);
                if (aVar.a(eVar3, eVar3.e())) {
                    eVar3.k();
                    this.f10201o3.q(eVar3);
                    this.f10200n3 = eVar3;
                    if (n1()) {
                        this.f10201o3.setAlpha(0.0f);
                        f2 f2VarB = u1.g(this.f10201o3).b(1.0f);
                        this.f10207r3 = f2VarB;
                        f2VarB.t(new g());
                    } else {
                        this.f10201o3.setAlpha(1.0f);
                        this.f10201o3.setVisibility(0);
                        if (this.f10201o3.getParent() instanceof View) {
                            u1.A1((View) this.f10201o3.getParent());
                        }
                    }
                    if (this.f10205p3 != null) {
                        this.H1.getDecorView().post(this.f10206q3);
                    }
                } else {
                    this.f10200n3 = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.f10200n3;
        if (bVar2 != null && (eVar = this.f10193g3) != null) {
            eVar.onSupportActionModeStarted(bVar2);
        }
        v1();
        return this.f10200n3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.h
    public View r(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z10;
        if (this.Y3 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f10203p1.obtainStyledAttributes(i.a.m.S0);
            String string = typedArrayObtainStyledAttributes.getString(i.a.m.f286526f3);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.Y3 = new androidx.appcompat.app.s();
            } else {
                try {
                    this.Y3 = (androidx.appcompat.app.s) this.f10203p1.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.Y3 = new androidx.appcompat.app.s();
                }
            }
        }
        boolean z11 = f10186d4;
        boolean zO1 = false;
        if (z11) {
            if (this.Z3 == null) {
                this.Z3 = new androidx.appcompat.app.u();
            }
            if (this.Z3.a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zO1 = o1((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zO1 = true;
                }
                z10 = zO1;
            }
        } else {
            z10 = zO1;
        }
        return this.Y3.r(view, str, context, attributeSet, z10, z11, true, androidx.appcompat.widget.u1.d());
    }

    void r0(int i10, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i10 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.F3;
                if (i10 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i10];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f10225j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f10230o) && !this.K3) {
            this.f10204p2.d(this.H1.getCallback(), i10, menu);
        }
    }

    @Override // androidx.appcompat.app.h
    @androidx.annotation.p0
    public <T extends View> T s(@d0 int i10) {
        C0();
        return (T) this.H1.findViewById(i10);
    }

    void s0(@NonNull androidx.appcompat.view.menu.g gVar) {
        if (this.E3) {
            return;
        }
        this.E3 = true;
        this.f10197k3.r();
        Window.Callback callbackP0 = P0();
        if (callbackP0 != null && !this.K3) {
            callbackP0.onPanelClosed(108, gVar);
        }
        this.E3 = false;
    }

    @Override // androidx.appcompat.app.h
    public Context u() {
        return this.f10203p1;
    }

    void u0(int i10) {
        v0(M0(i10, true), true);
    }

    void v0(PanelFeatureState panelFeatureState, boolean z10) {
        ViewGroup viewGroup;
        k0 k0Var;
        if (z10 && panelFeatureState.f10216a == 0 && (k0Var = this.f10197k3) != null && k0Var.d()) {
            s0(panelFeatureState.f10225j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f10203p1.getSystemService("window");
        if (windowManager != null && panelFeatureState.f10230o && (viewGroup = panelFeatureState.f10222g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                r0(panelFeatureState.f10216a, panelFeatureState, null);
            }
        }
        panelFeatureState.f10228m = false;
        panelFeatureState.f10229n = false;
        panelFeatureState.f10230o = false;
        panelFeatureState.f10223h = null;
        panelFeatureState.f10232q = true;
        if (this.G3 == panelFeatureState) {
            this.G3 = null;
        }
        if (panelFeatureState.f10216a == 0) {
            v1();
        }
    }

    void v1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zP1 = p1();
            if (zP1 && this.f10192b4 == null) {
                this.f10192b4 = o.b(this.f10191a4, this);
            } else if (!zP1 && (onBackInvokedCallback = this.f10192b4) != null) {
                o.c(this.f10191a4, onBackInvokedCallback);
                this.f10192b4 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.h
    public final androidx.appcompat.app.b.InterfaceC0030b w() {
        return new h();
    }

    @Override // androidx.appcompat.app.h
    public int x() {
        return this.M3;
    }

    final int x1(@androidx.annotation.p0 g3 g3Var, @androidx.annotation.p0 Rect rect) {
        int iR;
        boolean z10;
        boolean z11;
        if (g3Var != null) {
            iR = g3Var.r();
        } else {
            iR = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f10201o3;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10201o3.getLayoutParams();
            boolean z12 = true;
            if (this.f10201o3.isShown()) {
                if (this.W3 == null) {
                    this.W3 = new Rect();
                    this.X3 = new Rect();
                }
                Rect rect2 = this.W3;
                Rect rect3 = this.X3;
                if (g3Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(g3Var.p(), g3Var.r(), g3Var.q(), g3Var.o());
                }
                v1.a(this.f10210u3, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                g3 g3VarR0 = u1.r0(this.f10210u3);
                int iP = g3VarR0 == null ? 0 : g3VarR0.p();
                int iQ = g3VarR0 == null ? 0 : g3VarR0.q();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.f10212w3 != null) {
                    View view = this.f10212w3;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iP || marginLayoutParams2.rightMargin != iQ) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iP;
                            marginLayoutParams2.rightMargin = iQ;
                            this.f10212w3.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f10203p1);
                    this.f10212w3 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iP;
                    layoutParams.rightMargin = iQ;
                    this.f10210u3.addView(this.f10212w3, -1, layoutParams);
                }
                View view3 = this.f10212w3;
                z12 = view3 != null;
                if (z12 && view3.getVisibility() != 0) {
                    y1(this.f10212w3);
                }
                if (!this.B3 && z12) {
                    iR = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f10201o3.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f10212w3;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return iR;
    }

    void y0() {
        androidx.appcompat.view.menu.g gVar;
        k0 k0Var = this.f10197k3;
        if (k0Var != null) {
            k0Var.r();
        }
        if (this.f10205p3 != null) {
            this.H1.getDecorView().removeCallbacks(this.f10206q3);
            if (this.f10205p3.isShowing()) {
                try {
                    this.f10205p3.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f10205p3 = null;
        }
        B0();
        PanelFeatureState panelFeatureStateM0 = M0(0, false);
        if (panelFeatureStateM0 == null || (gVar = panelFeatureStateM0.f10225j) == null) {
            return;
        }
        gVar.close();
    }

    @Override // androidx.appcompat.app.h
    public MenuInflater z() {
        if (this.f10195i3 == null) {
            Q0();
            androidx.appcompat.app.a aVar = this.f10194h3;
            this.f10195i3 = new androidx.appcompat.view.g(aVar != null ? aVar.z() : this.f10203p1);
        }
        return this.f10195i3;
    }

    boolean z0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f10202p0;
        if (((obj instanceof g0.a) || (obj instanceof androidx.appcompat.app.q)) && (decorView = this.H1.getDecorView()) != null && g0.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f10204p2.b(this.H1.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? X0(keyCode, keyEvent) : a1(keyCode, keyEvent);
    }

    AppCompatDelegateImpl(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.e eVar) {
        this(context, window, eVar, context);
    }

    AppCompatDelegateImpl(Context context, Activity activity, androidx.appcompat.app.e eVar) {
        this(context, null, eVar, activity);
    }

    private AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        h3<String, Integer> h3Var;
        Integer num;
        androidx.appcompat.app.d dVarS1;
        this.f10207r3 = null;
        this.f10208s3 = true;
        this.M3 = -100;
        this.U3 = new b();
        this.f10203p1 = context;
        this.f10193g3 = eVar;
        this.f10202p0 = obj;
        if (this.M3 == -100 && (obj instanceof Dialog) && (dVarS1 = s1()) != null) {
            this.M3 = dVarS1.getDelegate().x();
        }
        if (this.M3 == -100 && (num = (h3Var = f10185c4).get(obj.getClass().getName())) != null) {
            this.M3 = num.intValue();
            h3Var.remove(obj.getClass().getName());
        }
        if (window != null) {
            o0(window);
        }
        androidx.appcompat.widget.n.i();
    }
}
