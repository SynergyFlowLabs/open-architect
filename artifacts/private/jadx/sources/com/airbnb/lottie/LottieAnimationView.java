package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f87884n = "LottieAnimationView";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final y0<Throwable> f87885o = new y0() { // from class: com.airbnb.lottie.i
        @Override // com.airbnb.lottie.y0
        public final void onResult(Object obj) {
            LottieAnimationView.e((Throwable) obj);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0<k> f87886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y0<Throwable> f87887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private y0<Throwable> f87888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.v
    private int f87889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w0 f87890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f87891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.u0
    private int f87892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f87893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f87894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f87895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set<b> f87896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set<a1> f87897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private e1<k> f87898m;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f87899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f87900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f87901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f87902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f87903e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f87904f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f87905g;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f87899a);
            parcel.writeFloat(this.f87901c);
            parcel.writeInt(this.f87902d ? 1 : 0);
            parcel.writeString(this.f87903e);
            parcel.writeInt(this.f87904f);
            parcel.writeInt(this.f87905g);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f87899a = parcel.readString();
            this.f87901c = parcel.readFloat();
            this.f87902d = parcel.readInt() == 1;
            this.f87903e = parcel.readString();
            this.f87904f = parcel.readInt();
            this.f87905g = parcel.readInt();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends com.airbnb.lottie.value.j<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.l f87906d;

        a(com.airbnb.lottie.value.l lVar) {
            this.f87906d = lVar;
        }

        @Override // com.airbnb.lottie.value.j
        public T a(com.airbnb.lottie.value.b<T> bVar) {
            return (T) this.f87906d.a(bVar);
        }
    }

    private enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    private static class c implements y0<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f87915a;

        public c(LottieAnimationView lottieAnimationView) {
            this.f87915a = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.y0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            LottieAnimationView lottieAnimationView = this.f87915a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f87889d != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.f87889d);
            }
            (lottieAnimationView.f87888c == null ? LottieAnimationView.f87885o : lottieAnimationView.f87888c).onResult(th2);
        }
    }

    private static class d implements y0<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f87916a;

        public d(LottieAnimationView lottieAnimationView) {
            this.f87916a = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.y0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(k kVar) {
            LottieAnimationView lottieAnimationView = this.f87916a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(kVar);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f87886a = new d(this);
        this.f87887b = new c(this);
        this.f87889d = 0;
        this.f87890e = new w0();
        this.f87893h = false;
        this.f87894i = false;
        this.f87895j = true;
        this.f87896k = new HashSet();
        this.f87897l = new HashSet();
        z(null, i1.a.f88237a);
    }

    private void T() {
        boolean zA = A();
        setImageDrawable(null);
        setImageDrawable(this.f87890e);
        if (zA) {
            this.f87890e.F0();
        }
    }

    private void X(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, boolean z10) {
        if (z10) {
            this.f87896k.add(b.SET_PROGRESS);
        }
        this.f87890e.h1(f10);
    }

    public static /* synthetic */ c1 d(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.f87895j ? c0.w(lottieAnimationView.getContext(), str) : c0.x(lottieAnimationView.getContext(), str, null);
    }

    public static /* synthetic */ void e(Throwable th2) {
        if (!com.airbnb.lottie.utils.j.k(th2)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        com.airbnb.lottie.utils.d.f("Unable to load composition.", th2);
    }

    public static /* synthetic */ c1 f(LottieAnimationView lottieAnimationView, int i10) {
        return lottieAnimationView.f87895j ? c0.M(lottieAnimationView.getContext(), i10) : c0.N(lottieAnimationView.getContext(), i10, null);
    }

    private void q() {
        e1<k> e1Var = this.f87898m;
        if (e1Var != null) {
            e1Var.k(this.f87886a);
            this.f87898m.j(this.f87887b);
        }
    }

    private void r() {
        this.f87890e.C();
    }

    private void setCompositionTask(e1<k> e1Var) {
        c1<k> c1VarE = e1Var.e();
        w0 w0Var = this.f87890e;
        if (c1VarE != null && w0Var == getDrawable() && w0Var.T() == c1VarE.b()) {
            return;
        }
        this.f87896k.add(b.SET_ANIMATION);
        r();
        q();
        this.f87898m = e1Var.d(this.f87886a).c(this.f87887b);
    }

    private e1<k> v(final String str) {
        if (isInEditMode()) {
            return new e1<>(new Callable() { // from class: com.airbnb.lottie.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.d(this.f88225a, str);
                }
            }, true);
        }
        return this.f87895j ? c0.u(getContext(), str) : c0.v(getContext(), str, null);
    }

    private e1<k> w(@androidx.annotation.u0 final int i10) {
        if (isInEditMode()) {
            return new e1<>(new Callable() { // from class: com.airbnb.lottie.j
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.f(this.f88289a, i10);
                }
            }, true);
        }
        return this.f87895j ? c0.K(getContext(), i10) : c0.L(getContext(), i10, null);
    }

    private void z(@androidx.annotation.p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i1.c.f88267a, i10, 0);
        this.f87895j = typedArrayObtainStyledAttributes.getBoolean(i1.c.f88270d, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i1.c.f88282p);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i1.c.f88277k);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i1.c.f88287u);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i1.c.f88282p, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(i1.c.f88277k);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i1.c.f88287u)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(i1.c.f88276j, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(i1.c.f88269c, false)) {
            this.f87894i = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i1.c.f88280n, false)) {
            this.f87890e.j1(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(i1.c.f88285s)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i1.c.f88285s, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(i1.c.f88284r)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i1.c.f88284r, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(i1.c.f88286t)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i1.c.f88286t, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(i1.c.f88272f)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(i1.c.f88272f, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(i1.c.f88271e)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(i1.c.f88271e, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(i1.c.f88274h)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(i1.c.f88274h));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(i1.c.f88279m));
        X(typedArrayObtainStyledAttributes.getFloat(i1.c.f88281o, 0.0f), typedArrayObtainStyledAttributes.hasValue(i1.c.f88281o));
        u(typedArrayObtainStyledAttributes.getBoolean(i1.c.f88275i, false));
        if (typedArrayObtainStyledAttributes.hasValue(i1.c.f88273g)) {
            n(new com.airbnb.lottie.model.e("**"), b1.K, new com.airbnb.lottie.value.j(new k1(j.a.a(getContext(), typedArrayObtainStyledAttributes.getResourceId(i1.c.f88273g, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(i1.c.f88283q)) {
            int i11 = i1.c.f88283q;
            j1 j1Var = j1.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i11, j1Var.ordinal());
            if (iOrdinal >= j1.values().length) {
                iOrdinal = j1Var.ordinal();
            }
            setRenderMode(j1.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(i1.c.f88268b)) {
            int i12 = i1.c.f88268b;
            com.airbnb.lottie.a aVar = com.airbnb.lottie.a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i12, aVar.ordinal());
            if (iOrdinal2 >= j1.values().length) {
                iOrdinal2 = aVar.ordinal();
            }
            setAsyncUpdates(com.airbnb.lottie.a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(i1.c.f88278l, false));
        if (typedArrayObtainStyledAttributes.hasValue(i1.c.f88288v)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(i1.c.f88288v, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f87890e.n1(Boolean.valueOf(com.airbnb.lottie.utils.j.f(getContext()) != 0.0f));
    }

    public boolean A() {
        return this.f87890e.q0();
    }

    public boolean B() {
        return this.f87890e.u0();
    }

    @Deprecated
    public void C(boolean z10) {
        this.f87890e.j1(z10 ? -1 : 0);
    }

    @androidx.annotation.l0
    public void D() {
        this.f87894i = false;
        this.f87890e.w0();
    }

    @androidx.annotation.l0
    public void E() {
        this.f87896k.add(b.PLAY_OPTION);
        this.f87890e.x0();
    }

    public void F() {
        this.f87890e.y0();
    }

    public void G() {
        this.f87897l.clear();
    }

    public void H() {
        this.f87890e.z0();
    }

    public void I(Animator.AnimatorListener animatorListener) {
        this.f87890e.A0(animatorListener);
    }

    @androidx.annotation.w0(api = 19)
    public void J(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f87890e.B0(animatorPauseListener);
    }

    public boolean K(@NonNull a1 a1Var) {
        return this.f87897l.remove(a1Var);
    }

    public void L(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f87890e.C0(animatorUpdateListener);
    }

    public List<com.airbnb.lottie.model.e> M(com.airbnb.lottie.model.e eVar) {
        return this.f87890e.E0(eVar);
    }

    @androidx.annotation.l0
    public void N() {
        this.f87896k.add(b.PLAY_OPTION);
        this.f87890e.F0();
    }

    public void O() {
        this.f87890e.G0();
    }

    public void P(InputStream inputStream, @androidx.annotation.p0 String str) {
        setCompositionTask(c0.z(inputStream, str));
    }

    public void Q(ZipInputStream zipInputStream, @androidx.annotation.p0 String str) {
        setCompositionTask(c0.U(zipInputStream, str));
    }

    public void R(String str, @androidx.annotation.p0 String str2) {
        P(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void S(String str, @androidx.annotation.p0 String str2) {
        setCompositionTask(c0.P(getContext(), str, str2));
    }

    public void U(int i10, int i11) {
        this.f87890e.Y0(i10, i11);
    }

    public void V(String str, String str2, boolean z10) {
        this.f87890e.a1(str, str2, z10);
    }

    public void W(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f11) {
        this.f87890e.b1(f10, f11);
    }

    @androidx.annotation.p0
    public Bitmap Y(String str, @androidx.annotation.p0 Bitmap bitmap) {
        return this.f87890e.r1(str, bitmap);
    }

    public com.airbnb.lottie.a getAsyncUpdates() {
        return this.f87890e.O();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f87890e.P();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f87890e.R();
    }

    public boolean getClipToCompositionBounds() {
        return this.f87890e.S();
    }

    @androidx.annotation.p0
    public k getComposition() {
        Drawable drawable = getDrawable();
        w0 w0Var = this.f87890e;
        if (drawable == w0Var) {
            return w0Var.T();
        }
        return null;
    }

    public long getDuration() {
        k composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f87890e.W();
    }

    @androidx.annotation.p0
    public String getImageAssetsFolder() {
        return this.f87890e.Z();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f87890e.b0();
    }

    public float getMaxFrame() {
        return this.f87890e.d0();
    }

    public float getMinFrame() {
        return this.f87890e.e0();
    }

    @androidx.annotation.p0
    public h1 getPerformanceTracker() {
        return this.f87890e.f0();
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f87890e.g0();
    }

    public j1 getRenderMode() {
        return this.f87890e.h0();
    }

    public int getRepeatCount() {
        return this.f87890e.i0();
    }

    public int getRepeatMode() {
        return this.f87890e.j0();
    }

    public float getSpeed() {
        return this.f87890e.k0();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof w0) && ((w0) drawable).h0() == j1.SOFTWARE) {
            this.f87890e.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        w0 w0Var = this.f87890e;
        if (drawable2 == w0Var) {
            super.invalidateDrawable(w0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void j(Animator.AnimatorListener animatorListener) {
        this.f87890e.u(animatorListener);
    }

    @androidx.annotation.w0(api = 19)
    public void k(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f87890e.v(animatorPauseListener);
    }

    public void l(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f87890e.w(animatorUpdateListener);
    }

    public boolean m(@NonNull a1 a1Var) {
        k composition = getComposition();
        if (composition != null) {
            a1Var.a(composition);
        }
        return this.f87897l.add(a1Var);
    }

    public <T> void n(com.airbnb.lottie.model.e eVar, T t10, com.airbnb.lottie.value.j<T> jVar) {
        this.f87890e.x(eVar, t10, jVar);
    }

    public <T> void o(com.airbnb.lottie.model.e eVar, T t10, com.airbnb.lottie.value.l<T> lVar) {
        this.f87890e.x(eVar, t10, new a(lVar));
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f87894i) {
            return;
        }
        this.f87890e.x0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f87891f = savedState.f87899a;
        Set<b> set = this.f87896k;
        b bVar = b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.f87891f)) {
            setAnimation(this.f87891f);
        }
        this.f87892g = savedState.f87900b;
        if (!this.f87896k.contains(bVar) && (i10 = this.f87892g) != 0) {
            setAnimation(i10);
        }
        if (!this.f87896k.contains(b.SET_PROGRESS)) {
            X(savedState.f87901c, false);
        }
        if (!this.f87896k.contains(b.PLAY_OPTION) && savedState.f87902d) {
            E();
        }
        if (!this.f87896k.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f87903e);
        }
        if (!this.f87896k.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f87904f);
        }
        if (this.f87896k.contains(b.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f87905g);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f87899a = this.f87891f;
        savedState.f87900b = this.f87892g;
        savedState.f87901c = this.f87890e.g0();
        savedState.f87902d = this.f87890e.r0();
        savedState.f87903e = this.f87890e.Z();
        savedState.f87904f = this.f87890e.j0();
        savedState.f87905g = this.f87890e.i0();
        return savedState;
    }

    @androidx.annotation.l0
    public void p() {
        this.f87894i = false;
        this.f87896k.add(b.PLAY_OPTION);
        this.f87890e.B();
    }

    public <T> void s(com.airbnb.lottie.model.e eVar, T t10) {
        this.f87890e.x(eVar, t10, null);
    }

    public void setAnimation(@androidx.annotation.u0 int i10) {
        this.f87892g = i10;
        this.f87891f = null;
        setCompositionTask(w(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        R(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f87895j ? c0.O(getContext(), str) : c0.P(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f87890e.I0(z10);
    }

    public void setAsyncUpdates(com.airbnb.lottie.a aVar) {
        this.f87890e.J0(aVar);
    }

    public void setCacheComposition(boolean z10) {
        this.f87895j = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f87890e.K0(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f87890e.L0(z10);
    }

    public void setComposition(@NonNull k kVar) {
        if (f.f88209a) {
            Objects.toString(kVar);
        }
        this.f87890e.setCallback(this);
        this.f87893h = true;
        boolean zM0 = this.f87890e.M0(kVar);
        if (this.f87894i) {
            this.f87890e.x0();
        }
        this.f87893h = false;
        if (getDrawable() != this.f87890e || zM0) {
            if (!zM0) {
                T();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<a1> it = this.f87897l.iterator();
            while (it.hasNext()) {
                it.next().a(kVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f87890e.N0(str);
    }

    public void setFailureListener(@androidx.annotation.p0 y0<Throwable> y0Var) {
        this.f87888c = y0Var;
    }

    public void setFallbackResource(@androidx.annotation.v int i10) {
        this.f87889d = i10;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.c cVar) {
        this.f87890e.O0(cVar);
    }

    public void setFontMap(@androidx.annotation.p0 Map<String, Typeface> map) {
        this.f87890e.P0(map);
    }

    public void setFrame(int i10) {
        this.f87890e.Q0(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f87890e.R0(z10);
    }

    public void setImageAssetDelegate(com.airbnb.lottie.d dVar) {
        this.f87890e.S0(dVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f87890e.T0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f87892g = 0;
        this.f87891f = null;
        q();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f87892g = 0;
        this.f87891f = null;
        q();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f87892g = 0;
        this.f87891f = null;
        q();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f87890e.U0(z10);
    }

    public void setMaxFrame(int i10) {
        this.f87890e.V0(i10);
    }

    public void setMaxProgress(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        this.f87890e.X0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f87890e.Z0(str);
    }

    public void setMinFrame(int i10) {
        this.f87890e.c1(i10);
    }

    public void setMinProgress(float f10) {
        this.f87890e.e1(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f87890e.f1(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f87890e.g1(z10);
    }

    public void setProgress(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        X(f10, true);
    }

    public void setRenderMode(j1 j1Var) {
        this.f87890e.i1(j1Var);
    }

    public void setRepeatCount(int i10) {
        this.f87896k.add(b.SET_REPEAT_COUNT);
        this.f87890e.j1(i10);
    }

    public void setRepeatMode(int i10) {
        this.f87896k.add(b.SET_REPEAT_MODE);
        this.f87890e.k1(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f87890e.l1(z10);
    }

    public void setSpeed(float f10) {
        this.f87890e.m1(f10);
    }

    public void setTextDelegate(l1 l1Var) {
        this.f87890e.o1(l1Var);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f87890e.p1(z10);
    }

    @Deprecated
    public void t() {
        this.f87890e.G();
    }

    public void u(boolean z10) {
        this.f87890e.J(z10);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        w0 w0Var;
        if (!this.f87893h && drawable == (w0Var = this.f87890e) && w0Var.q0()) {
            D();
        } else if (!this.f87893h && (drawable instanceof w0)) {
            w0 w0Var2 = (w0) drawable;
            if (w0Var2.q0()) {
                w0Var2.w0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public boolean x() {
        return this.f87890e.n0();
    }

    public boolean y() {
        return this.f87890e.o0();
    }

    public void setMaxFrame(String str) {
        this.f87890e.W0(str);
    }

    public void setMinFrame(String str) {
        this.f87890e.d1(str);
    }

    public void setAnimation(String str) {
        this.f87891f = str;
        this.f87892g = 0;
        setCompositionTask(v(str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f87886a = new d(this);
        this.f87887b = new c(this);
        this.f87889d = 0;
        this.f87890e = new w0();
        this.f87893h = false;
        this.f87894i = false;
        this.f87895j = true;
        this.f87896k = new HashSet();
        this.f87897l = new HashSet();
        z(attributeSet, i1.a.f88237a);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f87886a = new d(this);
        this.f87887b = new c(this);
        this.f87889d = 0;
        this.f87890e = new w0();
        this.f87893h = false;
        this.f87894i = false;
        this.f87895j = true;
        this.f87896k = new HashSet();
        this.f87897l = new HashSet();
        z(attributeSet, i10);
    }
}
