package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.internal.k0;
import com.facebook.internal.l0;
import com.facebook.internal.m0;
import com.facebook.internal.t0;
import com.facebook.login.h0;
import com.facebook.u;
import com.facebook.x0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends FrameLayout {

    @NotNull
    private static final String H1 = "ProfilePictureView_presetSize";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private static final String f101631g3 = "ProfilePictureView_bitmap";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private static final String f101632h3 = "ProfilePictureView_width";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private static final String f101633i3 = "ProfilePictureView_height";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private static final String f101634j3 = "ProfilePictureView_refresh";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a f101635l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f101636m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f101637n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f101638o = -2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private static final String f101639p0 = "ProfilePictureView_superState";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private static final String f101640p1 = "ProfilePictureView_profileId";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private static final String f101641p2 = "ProfilePictureView_isCropped";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f101642s = -3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f101643t = -4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f101644v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final boolean f101645w = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ImageView f101646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f101647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f101648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Bitmap f101649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private l0 f101650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Bitmap f101651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private x0 f101652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private String f101653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f101654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private b f101655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f101656k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return h.f101636m;
        }

        private a() {
        }
    }

    public interface b {
        void a(@NotNull u uVar);
    }

    public static final class c extends x0 {
        c() {
        }

        @Override // com.facebook.x0
        protected void c(@Nullable Profile profile, @Nullable Profile profile2) {
            h.this.setProfileId(profile2 == null ? null : profile2.f());
            h.this.k(true);
        }
    }

    static {
        String simpleName = h.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "ProfilePictureView::class.java.simpleName");
        f101636m = simpleName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f101646a = new ImageView(getContext());
        this.f101654i = true;
        this.f101656k = -1;
        f();
    }

    private final int d(boolean z10) {
        int i10;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return 0;
        }
        try {
            int i11 = this.f101656k;
            if (i11 == -1 && !z10) {
                return 0;
            }
            if (i11 == -4) {
                i10 = h0.f.S0;
            } else if (i11 == -3) {
                i10 = h0.f.T0;
            } else if (i11 == -2) {
                i10 = h0.f.U0;
            } else {
                if (i11 != -1) {
                    return 0;
                }
                i10 = h0.f.T0;
            }
            return getResources().getDimensionPixelSize(i10);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return 0;
        }
    }

    private final Uri e(String str) {
        Profile profileB = Profile.f98555h.b();
        return (profileB == null || !AccessToken.f98366l.m()) ? l0.f99974f.b(this.f101653h, this.f101648c, this.f101647b, str) : profileB.l(this.f101648c, this.f101647b);
    }

    private final void f() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            removeAllViews();
            this.f101646a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f101646a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.f101646a);
            this.f101652g = new c();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final boolean h() {
        return this.f101648c == 0 && this.f101647b == 0;
    }

    private final void i(AttributeSet attributeSet) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h0.n.f101390o9);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttributes(attrs, R.styleable.com_facebook_profile_picture_view)");
            setPresetSize(typedArrayObtainStyledAttributes.getInt(h0.n.f101412q9, -1));
            setCropped(typedArrayObtainStyledAttributes.getBoolean(h0.n.f101401p9, true));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void j(m0 m0Var) {
        if (com.facebook.internal.instrument.crashshield.b.e(this) || m0Var == null) {
            return;
        }
        try {
            if (Intrinsics.areEqual(m0Var.c(), this.f101650e)) {
                this.f101650e = null;
                Bitmap bitmapA = m0Var.a();
                Exception excB = m0Var.b();
                if (excB != null) {
                    b bVar = this.f101655j;
                    if (bVar != null) {
                        bVar.a(new u(Intrinsics.stringPlus("Error in downloading profile picture for profileId: ", this.f101653h), excB));
                        return;
                    } else {
                        t0.f100109e.b(com.facebook.t0.REQUESTS, 6, f101636m, excB.toString());
                        return;
                    }
                }
                if (bitmapA == null) {
                    return;
                }
                setImageBitmap(bitmapA);
                if (m0Var.d()) {
                    l(false);
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(boolean z10) {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                boolean zO = o();
                String str = this.f101653h;
                if (str != null && str.length() != 0 && !h()) {
                    if (!zO) {
                        if (z10) {
                        }
                    }
                    l(true);
                    return;
                }
                n();
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    private final void l(boolean z10) {
        AccessToken accessTokenI;
        String strT;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            AccessToken.d dVar = AccessToken.f98366l;
            String str = "";
            if (dVar.k() && (accessTokenI = dVar.i()) != null && (strT = accessTokenI.t()) != null) {
                str = strT;
            }
            Uri uriE = e(str);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            l0 l0VarA = new l0.a(context, uriE).f(z10).h(this).g(new l0.b() { // from class: com.facebook.login.widget.g
                @Override // com.facebook.internal.l0.b
                public final void a(m0 m0Var) {
                    h.m(this.f101630a, m0Var);
                }
            }).a();
            l0 l0Var = this.f101650e;
            if (l0Var != null) {
                k0 k0Var = k0.f99939a;
                k0.d(l0Var);
            }
            this.f101650e = l0VarA;
            k0 k0Var2 = k0.f99939a;
            k0.g(l0VarA);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(h this$0, m0 m0Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j(m0Var);
    }

    private final void n() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            l0 l0Var = this.f101650e;
            if (l0Var != null) {
                k0 k0Var = k0.f99939a;
                k0.d(l0Var);
            }
            Bitmap bitmap = this.f101651f;
            if (bitmap == null) {
                setImageBitmap(BitmapFactory.decodeResource(getResources(), this.f101654i ? h0.g.O0 : h0.g.N0));
            } else {
                o();
                setImageBitmap(Bitmap.createScaledBitmap(bitmap, this.f101648c, this.f101647b, false));
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final boolean o() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z10 = true;
            if (width >= 1 && height >= 1) {
                int iD = d(false);
                if (iD != 0) {
                    height = iD;
                    width = height;
                }
                if (width <= height) {
                    height = this.f101654i ? width : 0;
                } else {
                    width = this.f101654i ? height : 0;
                }
                if (width == this.f101648c && height == this.f101647b) {
                    z10 = false;
                }
                this.f101648c = width;
                this.f101647b = height;
                return z10;
            }
            return false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    private final void setImageBitmap(Bitmap bitmap) {
        if (com.facebook.internal.instrument.crashshield.b.e(this) || bitmap == null) {
            return;
        }
        try {
            this.f101649d = bitmap;
            this.f101646a.setImageBitmap(bitmap);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final boolean g() {
        return this.f101654i;
    }

    @Nullable
    public final b getOnErrorListener() {
        return this.f101655j;
    }

    public final int getPresetSize() {
        return this.f101656k;
    }

    @Nullable
    public final String getProfileId() {
        return this.f101653h;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        x0 x0Var = this.f101652g;
        if (x0Var == null) {
            return false;
        }
        return x0Var.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f101650e = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        boolean z10;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean z11 = true;
        if (View.MeasureSpec.getMode(i11) == 1073741824 || layoutParams.height != -2) {
            z10 = false;
        } else {
            size = d(true);
            i11 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z10 = true;
        }
        if (View.MeasureSpec.getMode(i10) == 1073741824 || layoutParams.width != -2) {
            z11 = z10;
        } else {
            size2 = d(true);
            i10 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (!z11) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(size2, size);
            measureChildren(i10, i11);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!Intrinsics.areEqual(state.getClass(), Bundle.class)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        super.onRestoreInstanceState(bundle.getParcelable(f101639p0));
        setProfileId(bundle.getString(f101640p1));
        setPresetSize(bundle.getInt(H1));
        setCropped(bundle.getBoolean(f101641p2));
        this.f101648c = bundle.getInt(f101632h3);
        this.f101647b = bundle.getInt(f101633i3);
        k(true);
    }

    @Override // android.view.View
    @NotNull
    protected Parcelable onSaveInstanceState() {
        boolean z10;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable(f101639p0, parcelableOnSaveInstanceState);
        bundle.putString(f101640p1, this.f101653h);
        bundle.putInt(H1, this.f101656k);
        bundle.putBoolean(f101641p2, this.f101654i);
        bundle.putInt(f101632h3, this.f101648c);
        bundle.putInt(f101633i3, this.f101647b);
        if (this.f101650e != null) {
            z10 = true;
            int i10 = 5 << 1;
        } else {
            z10 = false;
        }
        bundle.putBoolean(f101634j3, z10);
        return bundle;
    }

    public final void setCropped(boolean z10) {
        this.f101654i = z10;
        k(false);
    }

    public final void setDefaultProfilePicture(@Nullable Bitmap bitmap) {
        this.f101651f = bitmap;
    }

    public final void setOnErrorListener(@Nullable b bVar) {
        this.f101655j = bVar;
    }

    public final void setPresetSize(int i10) {
        if (i10 != -4 && i10 != -3 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException("Must use a predefined preset size");
        }
        this.f101656k = i10;
        requestLayout();
    }

    public final void setProfileId(@Nullable String str) {
        String str2 = this.f101653h;
        boolean z10 = true;
        if (str2 == null || str2.length() == 0 || !StringsKt.N1(this.f101653h, str, true)) {
            n();
        } else {
            z10 = false;
        }
        this.f101653h = str;
        k(z10);
    }

    public final void setShouldUpdateOnProfileChange(boolean z10) {
        if (z10) {
            x0 x0Var = this.f101652g;
            if (x0Var != null) {
                x0Var.d();
            }
        } else {
            x0 x0Var2 = this.f101652g;
            if (x0Var2 != null) {
                x0Var2.e();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f101646a = new ImageView(getContext());
        this.f101654i = true;
        this.f101656k = -1;
        f();
        i(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, @NotNull AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f101646a = new ImageView(getContext());
        this.f101654i = true;
        this.f101656k = -1;
        f();
        i(attrs);
    }
}
