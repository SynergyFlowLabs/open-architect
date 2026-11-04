package com.google.firebase.inappmessaging.display.internal.bindingwrappers;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.inappmessaging.display.internal.k;
import com.google.firebase.inappmessaging.display.internal.l;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.google.firebase.inappmessaging.model.i f122262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final k f122263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final LayoutInflater f122264c;

    protected c(k kVar, LayoutInflater layoutInflater, com.google.firebase.inappmessaging.model.i iVar) {
        this.f122263b = kVar;
        this.f122264c = layoutInflater;
        this.f122262a = iVar;
    }

    public static void i(Button button, String str) {
        try {
            Drawable drawableR = androidx.core.graphics.drawable.c.r(button.getBackground());
            androidx.core.graphics.drawable.c.n(drawableR, Color.parseColor(str));
            button.setBackground(drawableR);
        } catch (IllegalArgumentException e10) {
            l.e("Error parsing background color: " + e10.toString());
        }
    }

    public static void k(Button button, com.google.firebase.inappmessaging.model.d dVar) {
        String strB = dVar.c().b();
        i(button, dVar.b());
        button.setText(dVar.c().c());
        button.setTextColor(Color.parseColor(strB));
    }

    public boolean a() {
        return false;
    }

    @NonNull
    public k b() {
        return this.f122263b;
    }

    @NonNull
    public abstract View c();

    @p0
    public View.OnClickListener d() {
        return null;
    }

    @NonNull
    public abstract ImageView e();

    @NonNull
    public abstract ViewGroup f();

    @p0
    public abstract ViewTreeObserver.OnGlobalLayoutListener g(Map<com.google.firebase.inappmessaging.model.a, View.OnClickListener> map, View.OnClickListener onClickListener);

    protected void h(@p0 Button button, View.OnClickListener onClickListener) {
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    protected void j(@p0 View view, @p0 String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            view.setBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException e10) {
            l.e("Error parsing background color: " + e10.toString() + " color: " + str);
        }
    }
}
