package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.d0;
import androidx.annotation.j0;
import androidx.annotation.p0;
import androidx.core.view.g0;

/* JADX INFO: loaded from: classes.dex */
public class q extends androidx.activity.t implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f10370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g0.a f10371e;

    public q(@NonNull Context context) {
        this(context, 0);
    }

    private static int j(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.b.Z0, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.t, android.app.Dialog
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        f();
        h().f(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        h().L();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return g0.e(this.f10371e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @p0
    public <T extends View> T findViewById(@d0 int i10) {
        return (T) h().s(i10);
    }

    @NonNull
    public h h() {
        if (this.f10370d == null) {
            this.f10370d = h.o(this, this);
        }
        return this.f10370d;
    }

    public a i() {
        return h().C();
    }

    @Override // android.app.Dialog
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        h().F();
    }

    boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean l(int i10) {
        return h().T(i10);
    }

    @Override // androidx.activity.t, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        h().E();
        super.onCreate(bundle);
        h().K(bundle);
    }

    @Override // androidx.activity.t, android.app.Dialog
    protected void onStop() {
        super.onStop();
        h().Q();
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    @p0
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    @Override // androidx.activity.t, android.app.Dialog
    public void setContentView(@j0 int i10) {
        f();
        h().X(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        h().h0(charSequence);
    }

    public q(@NonNull Context context, int i10) {
        super(context, j(context, i10));
        this.f10371e = new g0.a() { // from class: androidx.appcompat.app.p
            @Override // androidx.core.view.g0.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f10369a.k(keyEvent);
            }
        };
        h hVarH = h();
        hVarH.g0(j(context, i10));
        hVarH.K(null);
    }

    @Override // androidx.activity.t, android.app.Dialog
    public void setContentView(@NonNull View view) {
        f();
        h().Y(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        h().h0(getContext().getString(i10));
    }

    @Override // androidx.activity.t, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        f();
        h().Z(view, layoutParams);
    }

    protected q(@NonNull Context context, boolean z10, @p0 DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.f10371e = new g0.a() { // from class: androidx.appcompat.app.p
            @Override // androidx.core.view.g0.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f10369a.k(keyEvent);
            }
        };
        setCancelable(z10);
        setOnCancelListener(onCancelListener);
    }
}
