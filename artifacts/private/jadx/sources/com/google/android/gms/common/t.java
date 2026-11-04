package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f106907e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f106908f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f106909g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f106910h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f106911i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f106912j = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f106913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f106914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f106915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private View.OnClickListener f106916d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public t(@NonNull Context context) {
        this(context, null);
    }

    private final void c(Context context) {
        View view = this.f106915c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f106915c = com.google.android.gms.common.internal.f1.c(context, this.f106913a, this.f106914b);
        } catch (com.google.android.gms.dynamic.h.a unused) {
            int i10 = this.f106913a;
            int i11 = this.f106914b;
            com.google.android.gms.common.internal.h0 h0Var = new com.google.android.gms.common.internal.h0(context, null);
            h0Var.a(context.getResources(), i10, i11);
            this.f106915c = h0Var;
        }
        addView(this.f106915c);
        this.f106915c.setEnabled(isEnabled());
        this.f106915c.setOnClickListener(this);
    }

    public void a(int i10, int i11) {
        this.f106913a = i10;
        this.f106914b = i11;
        c(getContext());
    }

    @Deprecated
    public void b(int i10, int i11, @NonNull Scope[] scopeArr) {
        a(i10, i11);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NonNull View view) {
        View.OnClickListener onClickListener = this.f106916d;
        if (onClickListener != null && view == this.f106915c) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i10) {
        a(this.f106913a, i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f106915c.setEnabled(z10);
    }

    @Override // android.view.View
    public void setOnClickListener(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        this.f106916d = onClickListener;
        View view = this.f106915c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@NonNull Scope[] scopeArr) {
        a(this.f106913a, this.f106914b);
    }

    public void setSize(int i10) {
        a(i10, this.f106914b);
    }

    public t(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public t(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f106916d = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, f6.a.f.f275087e, 0, 0);
        try {
            this.f106913a = typedArrayObtainStyledAttributes.getInt(f6.a.f.f275088f, 0);
            int i11 = 1 << 2;
            this.f106914b = typedArrayObtainStyledAttributes.getInt(f6.a.f.f275089g, 2);
            typedArrayObtainStyledAttributes.recycle();
            a(this.f106913a, this.f106914b);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
