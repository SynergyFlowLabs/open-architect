package com.facebook;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@e.a({"ResourceType"})
public abstract class o extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f101716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f101717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private View.OnClickListener f101718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private View.OnClickListener f101719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f101720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f101721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f101722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private com.facebook.internal.h0 f101723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f101724i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected o(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11, @NotNull String analyticsButtonCreatedEventName, @NotNull String analyticsButtonTappedEventName) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsButtonCreatedEventName, "analyticsButtonCreatedEventName");
        Intrinsics.checkNotNullParameter(analyticsButtonTappedEventName, "analyticsButtonTappedEventName");
        i11 = i11 == 0 ? getDefaultStyleResource() : i11;
        c(context, attributeSet, i10, i11 == 0 ? l5.b.m.Y5 : i11);
        this.f101716a = analyticsButtonCreatedEventName;
        this.f101717b = analyticsButtonTappedEventName;
        setClickable(true);
        setFocusable(true);
    }

    private final void g(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (isInEditMode()) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.background}, i10, i11);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(androidx.core.content.d.g(context, l5.b.e.V));
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.b.c(th3, this);
        }
    }

    @e.a({"ResourceType"})
    private final void h(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.drawableLeft, R.attr.drawableTop, R.attr.drawableRight, R.attr.drawableBottom, R.attr.drawablePadding}, i10, i11);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
            try {
                setCompoundDrawablesWithIntrinsicBounds(typedArrayObtainStyledAttributes.getResourceId(0, 0), typedArrayObtainStyledAttributes.getResourceId(1, 0), typedArrayObtainStyledAttributes.getResourceId(2, 0), typedArrayObtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                typedArrayObtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.b.c(th3, this);
        }
    }

    private final void i(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom}, i10, i11);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
            try {
                setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void j(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.textColor}, i10, i11);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, colorResources, defStyleAttr, defStyleRes)");
            try {
                setTextColor(typedArrayObtainStyledAttributes.getColorStateList(0));
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.gravity}, i10, i11);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "context.theme.obtainStyledAttributes(attrs, gravityResources, defStyleAttr, defStyleRes)");
                try {
                    int i12 = typedArrayObtainStyledAttributes2.getInt(0, 17);
                    typedArrayObtainStyledAttributes2.recycle();
                    setGravity(i12);
                    TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.textSize, R.attr.textStyle, R.attr.text}, i10, i11);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes3, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
                    try {
                        setTextSize(0, typedArrayObtainStyledAttributes3.getDimensionPixelSize(0, 0));
                        setTypeface(Typeface.create(getTypeface(), 1));
                        String string = typedArrayObtainStyledAttributes3.getString(2);
                        typedArrayObtainStyledAttributes3.recycle();
                        setText(string);
                    } catch (Throwable th2) {
                        typedArrayObtainStyledAttributes3.recycle();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th3;
                }
            } catch (Throwable th4) {
                typedArrayObtainStyledAttributes.recycle();
                throw th4;
            }
        } catch (Throwable th5) {
            com.facebook.internal.instrument.crashshield.b.c(th5, this);
        }
    }

    private final void k() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            super.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o.l(this.f101713a, view);
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(o this$0, View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(o.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.e(this$0.getContext());
            View.OnClickListener onClickListener = this$0.f101719d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            View.OnClickListener onClickListener2 = this$0.f101718c;
            if (onClickListener2 == null) {
                return;
            }
            onClickListener2.onClick(view);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, o.class);
        }
    }

    protected void b(@Nullable View view) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.f101718c;
            if (onClickListener == null) {
                return;
            }
            onClickListener.onClick(view);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    protected void c(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            g(context, attributeSet, i10, i11);
            h(context, attributeSet, i10, i11);
            i(context, attributeSet, i10, i11);
            j(context, attributeSet, i10, i11);
            k();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    protected void d(@Nullable Context context) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            com.facebook.appevents.f0.f98865b.b(context, null).l(this.f101716a);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    protected void e(@Nullable Context context) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            com.facebook.appevents.f0.f98865b.b(context, null).l(this.f101717b);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    protected int f(@Nullable String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil(getPaint().measureText(str));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return 0;
        }
    }

    @NotNull
    protected Activity getActivity() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new u("Unable to get Activity.");
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @NotNull
    protected final String getAnalyticsButtonCreatedEventName() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return this.f101716a;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @NotNull
    protected final String getAnalyticsButtonTappedEventName() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return this.f101717b;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @Nullable
    public final androidx.activity.result.l getAndroidxActivityResultRegistryOwner() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            ComponentCallbacks2 activity = getActivity();
            if (activity instanceof androidx.activity.result.l) {
                return (androidx.activity.result.l) activity;
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return 0;
        }
        try {
            return this.f101720e ? this.f101721f : super.getCompoundPaddingLeft();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return 0;
        }
        try {
            return this.f101720e ? this.f101722g : super.getCompoundPaddingRight();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return 0;
        }
    }

    protected abstract int getDefaultRequestCode();

    protected int getDefaultStyleResource() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return 0;
        }
        try {
            return this.f101724i;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return 0;
        }
    }

    @Nullable
    public final Fragment getFragment() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            com.facebook.internal.h0 h0Var = this.f101723h;
            if (h0Var == null) {
                return null;
            }
            return h0Var.c();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @Nullable
    public final android.app.Fragment getNativeFragment() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            com.facebook.internal.h0 h0Var = this.f101723h;
            if (h0Var == null) {
                return null;
            }
            return h0Var.b();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    public int getRequestCode() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return 0;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                super.onAttachedToWindow();
                if (!isInEditMode()) {
                    d(getContext());
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int iMin = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - f(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.f101721f = compoundPaddingLeft - iMin;
                this.f101722g = compoundPaddingRight + iMin;
                this.f101720e = true;
            }
            super.onDraw(canvas);
            this.f101720e = false;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void setFragment(@NotNull android.app.Fragment fragment) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f101723h = new com.facebook.internal.h0(fragment);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    protected void setInternalOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            this.f101719d = onClickListener;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            this.f101718c = onClickListener;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void setFragment(@NotNull Fragment fragment) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f101723h = new com.facebook.internal.h0(fragment);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }
}
