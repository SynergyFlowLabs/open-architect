package com.google.vr.sdk.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public class f extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.vr.cardboard.m f127549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u9.a f127550b = new u9.a(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GvrView f127551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f127552d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.b();
        }
    }

    private boolean f(int i10) {
        if (this.f127552d) {
            return i10 == 24 || i10 == 25;
        }
        return false;
    }

    public GvrView a() {
        return this.f127551c;
    }

    public void b() {
    }

    public void c(GvrView gvrView) {
        d(gvrView, true);
    }

    public void d(GvrView gvrView, boolean z10) {
        GvrView gvrView2 = this.f127551c;
        if (gvrView2 == gvrView) {
            return;
        }
        if (gvrView2 != null) {
            gvrView2.setOnCardboardTriggerListener(null);
        }
        this.f127551c = gvrView;
        boolean z11 = false;
        boolean z12 = gvrView != null;
        if (com.google.vr.cardboard.a.j(this, z12, z10 ? 1 : 0) && z12) {
            z11 = true;
        }
        this.f127552d = z11;
        if (gvrView == null) {
            return;
        }
        gvrView.setOnCardboardTriggerListener(new a());
    }

    public void e(boolean z10) {
        this.f127550b.b(z10);
    }

    protected void g(g gVar) {
        GvrView gvrView = this.f127551c;
        if (gvrView != null) {
            gvrView.m(gVar);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f127551c.d();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        this.f127549a = new com.google.vr.cardboard.m(getWindow());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        GvrView gvrView = this.f127551c;
        if (gvrView != null) {
            gvrView.setOnCardboardTriggerListener(null);
            this.f127551c.l();
            this.f127551c = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return f(i10) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return f(i10) || super.onKeyUp(i10, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        GvrView gvrView = this.f127551c;
        if (gvrView != null) {
            gvrView.e();
        }
        this.f127550b.d();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        GvrView gvrView = this.f127551c;
        if (gvrView != null) {
            gvrView.f();
        }
        this.f127549a.a();
        this.f127550b.c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f127549a.b(z10);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        if (view instanceof GvrView) {
            c((GvrView) view);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof GvrView) {
            c((GvrView) view);
        }
        super.setContentView(view, layoutParams);
    }
}
