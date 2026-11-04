package androidx.databinding;

import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewStub f49379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f49380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f49381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewStub.OnInflateListener f49382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e0 f49383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ViewStub.OnInflateListener f49384f;

    class a implements ViewStub.OnInflateListener {
        a() {
        }

        @Override // android.view.ViewStub.OnInflateListener
        public void onInflate(ViewStub viewStub, View view) {
            h0.this.f49381c = view;
            h0 h0Var = h0.this;
            h0Var.f49380b = m.c(h0Var.f49383e.f49348l, view, viewStub.getLayoutResource());
            h0.this.f49379a = null;
            if (h0.this.f49382d != null) {
                h0.this.f49382d.onInflate(viewStub, view);
                h0.this.f49382d = null;
            }
            h0.this.f49383e.Z();
            h0.this.f49383e.v();
        }
    }

    public h0(@NonNull ViewStub viewStub) {
        a aVar = new a();
        this.f49384f = aVar;
        this.f49379a = viewStub;
        viewStub.setOnInflateListener(aVar);
    }

    @p0
    public e0 g() {
        return this.f49380b;
    }

    public View h() {
        return this.f49381c;
    }

    @p0
    public ViewStub i() {
        return this.f49379a;
    }

    public boolean j() {
        return this.f49381c != null;
    }

    public void k(@NonNull e0 e0Var) {
        this.f49383e = e0Var;
    }

    public void l(@p0 ViewStub.OnInflateListener onInflateListener) {
        if (this.f49379a != null) {
            this.f49382d = onInflateListener;
        }
    }
}
