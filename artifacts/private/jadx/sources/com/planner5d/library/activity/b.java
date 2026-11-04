package com.planner5d.library.activity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.vr.cardboard.m;
import com.google.vr.sdk.base.GvrView;

/* JADX INFO: loaded from: classes5.dex */
public class b extends androidx.appcompat.app.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f131473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u9.a f131474b = new u9.a(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GvrView f131475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f131476d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.F();
        }
    }

    private boolean J(int i10) {
        if (this.f131476d) {
            return i10 == 24 || i10 == 25;
        }
        return false;
    }

    public GvrView E() {
        return this.f131475c;
    }

    public void F() {
    }

    public void G(GvrView gvrView) {
        H(gvrView, true);
    }

    public void H(GvrView gvrView, boolean z10) {
        GvrView gvrView2 = this.f131475c;
        if (gvrView2 != gvrView) {
            if (gvrView2 != null) {
                gvrView2.setOnCardboardTriggerListener(null);
            }
            this.f131475c = gvrView;
            boolean z11 = false;
            boolean z12 = gvrView != null;
            if (com.google.vr.cardboard.a.j(this, z12, z10 ? 1 : 0) && z12) {
                z11 = true;
            }
            this.f131476d = z11;
            if (gvrView != null) {
                gvrView.setOnCardboardTriggerListener(new a());
            }
        }
    }

    public void I(boolean z10) {
        this.f131474b.b(z10);
    }

    protected void K(com.google.vr.sdk.base.g gVar) {
        GvrView gvrView = this.f131475c;
        if (gvrView != null) {
            gvrView.m(gVar);
        }
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        GvrView gvrView = this.f131475c;
        if (gvrView != null) {
            gvrView.d();
        }
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        this.f131473a = new m(getWindow());
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() {
        GvrView gvrView = this.f131475c;
        if (gvrView != null) {
            gvrView.setOnCardboardTriggerListener(null);
            this.f131475c.l();
            this.f131475c = null;
        }
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.d, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return J(i10) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return J(i10) || super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onPause() {
        super.onPause();
        GvrView gvrView = this.f131475c;
        if (gvrView != null) {
            gvrView.e();
        }
        this.f131474b.d();
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onResume() {
        super.onResume();
        GvrView gvrView = this.f131475c;
        if (gvrView != null) {
            gvrView.f();
        }
        this.f131473a.a();
        this.f131474b.c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f131473a.b(z10);
    }

    @Override // androidx.appcompat.app.d, androidx.activity.l, android.app.Activity
    public void setContentView(View view) {
        if (view instanceof GvrView) {
            G((GvrView) view);
        }
        super.setContentView(view);
    }

    @Override // androidx.appcompat.app.d, androidx.activity.l, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof GvrView) {
            G((GvrView) view);
        }
        super.setContentView(view, layoutParams);
    }
}
