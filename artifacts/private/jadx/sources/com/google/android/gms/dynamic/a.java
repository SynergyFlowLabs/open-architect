package com.google.android.gms.dynamic;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.dynamic.e;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class a<T extends e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f107015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private Bundle f107016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList f107017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f107018d = new j(this);

    @g6.a
    public a() {
    }

    @g6.a
    public static void o(@NonNull FrameLayout frameLayout) {
        com.google.android.gms.common.f fVarX = com.google.android.gms.common.f.x();
        Context context = frameLayout.getContext();
        int iJ = fVarX.j(context);
        String strC = l0.c(context, iJ);
        String strB = l0.b(context, iJ);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strC);
        linearLayout.addView(textView);
        Intent intentE = fVarX.e(context, iJ, null);
        if (intentE != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strB);
            linearLayout.addView(button);
            button.setOnClickListener(new n(context, intentE));
        }
    }

    private final void t(int i10) {
        while (!this.f107017c.isEmpty() && ((q) this.f107017c.getLast()).c() >= i10) {
            this.f107017c.removeLast();
        }
    }

    private final void u(@p0 Bundle bundle, q qVar) {
        e eVar = this.f107015a;
        if (eVar != null) {
            qVar.a(eVar);
            return;
        }
        if (this.f107017c == null) {
            this.f107017c = new LinkedList();
        }
        this.f107017c.add(qVar);
        if (bundle != null) {
            Bundle bundle2 = this.f107016b;
            if (bundle2 == null) {
                this.f107016b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f107018d);
    }

    @g6.a
    protected abstract void a(@NonNull g<T> gVar);

    @NonNull
    @g6.a
    public T b() {
        return (T) this.f107015a;
    }

    @g6.a
    protected void c(@NonNull FrameLayout frameLayout) {
        o(frameLayout);
    }

    @g6.a
    public void d(@p0 Bundle bundle) {
        u(bundle, new l(this, bundle));
    }

    @NonNull
    @g6.a
    public View e(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        u(bundle, new m(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f107015a == null) {
            c(frameLayout);
        }
        return frameLayout;
    }

    @g6.a
    public void f() {
        e eVar = this.f107015a;
        if (eVar != null) {
            eVar.b();
        } else {
            t(1);
        }
    }

    @g6.a
    public void g() {
        e eVar = this.f107015a;
        if (eVar != null) {
            eVar.g();
        } else {
            t(2);
        }
    }

    @g6.a
    public void h(@NonNull Activity activity, @NonNull Bundle bundle, @p0 Bundle bundle2) {
        u(bundle2, new k(this, activity, bundle, bundle2));
    }

    @g6.a
    public void i() {
        e eVar = this.f107015a;
        if (eVar != null) {
            eVar.onLowMemory();
        }
    }

    @g6.a
    public void j() {
        e eVar = this.f107015a;
        if (eVar != null) {
            eVar.d();
        } else {
            t(5);
        }
    }

    @g6.a
    public void k() {
        u(null, new p(this));
    }

    @g6.a
    public void l(@NonNull Bundle bundle) {
        e eVar = this.f107015a;
        if (eVar != null) {
            eVar.f(bundle);
            return;
        }
        Bundle bundle2 = this.f107016b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @g6.a
    public void m() {
        u(null, new o(this));
    }

    @g6.a
    public void n() {
        e eVar = this.f107015a;
        if (eVar != null) {
            eVar.a();
        } else {
            t(4);
        }
    }
}
