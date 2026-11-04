package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.lifecycle.n2;
import androidx.lifecycle.p2;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class m extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private static final String X = "android:cancelable";
    private static final String Y = "android:showsDialog";
    private static final String Z = "android:backStackId";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f51909p0 = "android:dialogShowing";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f51910t = "android:savedDialogState";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f51911v = "android:style";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f51912w = "android:theme";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f51913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f51914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DialogInterface.OnCancelListener f51915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DialogInterface.OnDismissListener f51916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f51919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f51920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f51922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.lifecycle.d1<androidx.lifecycle.o0> f51923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private Dialog f51924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f51925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f51926n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f51927o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f51928s;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.f51916d.onDismiss(m.this.f51924l);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(@androidx.annotation.p0 DialogInterface dialogInterface) {
            if (m.this.f51924l != null) {
                m mVar = m.this;
                mVar.onCancel(mVar.f51924l);
            }
        }
    }

    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(@androidx.annotation.p0 DialogInterface dialogInterface) {
            if (m.this.f51924l != null) {
                m mVar = m.this;
                mVar.onDismiss(mVar.f51924l);
            }
        }
    }

    class d implements androidx.lifecycle.d1<androidx.lifecycle.o0> {
        d() {
        }

        @Override // androidx.lifecycle.d1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void c(androidx.lifecycle.o0 o0Var) {
            if (o0Var == null || !m.this.f51920h) {
                return;
            }
            View viewRequireView = m.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (m.this.f51924l != null) {
                if (FragmentManager.b1(3)) {
                    toString();
                    Objects.toString(m.this.f51924l);
                }
                m.this.f51924l.setContentView(viewRequireView);
            }
        }
    }

    class e extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f51933a;

        e(u uVar) {
            this.f51933a = uVar;
        }

        @Override // androidx.fragment.app.u
        @androidx.annotation.p0
        public View c(int i10) {
            return this.f51933a.d() ? this.f51933a.c(i10) : m.this.x(i10);
        }

        @Override // androidx.fragment.app.u
        public boolean d() {
            return this.f51933a.d() || m.this.y();
        }
    }

    public m() {
        this.f51914b = new a();
        this.f51915c = new b();
        this.f51916d = new c();
        this.f51917e = 0;
        this.f51918f = 0;
        this.f51919g = true;
        this.f51920h = true;
        this.f51921i = -1;
        this.f51923k = new d();
        this.f51928s = false;
    }

    private void w(boolean z10, boolean z11, boolean z12) {
        if (this.f51926n) {
            return;
        }
        this.f51926n = true;
        this.f51927o = false;
        Dialog dialog = this.f51924l;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f51924l.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f51913a.getLooper()) {
                    onDismiss(this.f51924l);
                } else {
                    this.f51913a.post(this.f51914b);
                }
            }
        }
        this.f51925m = true;
        if (this.f51921i >= 0) {
            if (z12) {
                getParentFragmentManager().w1(this.f51921i, 1);
            } else {
                getParentFragmentManager().t1(this.f51921i, 1, z10);
            }
            this.f51921i = -1;
            return;
        }
        t0 t0VarW = getParentFragmentManager().w();
        t0VarW.N(true);
        t0VarW.x(this);
        if (z12) {
            t0VarW.o();
        } else if (z10) {
            t0VarW.n();
        } else {
            t0VarW.m();
        }
    }

    private void z(@androidx.annotation.p0 Bundle bundle) {
        if (this.f51920h && !this.f51928s) {
            try {
                this.f51922j = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.f51924l = dialogOnCreateDialog;
                if (this.f51920h) {
                    setupDialog(dialogOnCreateDialog, this.f51917e);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f51924l.setOwnerActivity((Activity) context);
                    }
                    this.f51924l.setCancelable(this.f51919g);
                    this.f51924l.setOnCancelListener(this.f51915c);
                    this.f51924l.setOnDismissListener(this.f51916d);
                    this.f51928s = true;
                } else {
                    this.f51924l = null;
                }
                this.f51922j = false;
            } catch (Throwable th2) {
                this.f51922j = false;
                throw th2;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    u createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        w(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        w(true, false, false);
    }

    @androidx.annotation.l0
    public void dismissNow() {
        w(false, false, true);
    }

    @androidx.annotation.p0
    public Dialog getDialog() {
        return this.f51924l;
    }

    public boolean getShowsDialog() {
        return this.f51920h;
    }

    @androidx.annotation.g1
    public int getTheme() {
        return this.f51918f;
    }

    public boolean isCancelable() {
        return this.f51919g;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    @Deprecated
    public void onActivityCreated(@androidx.annotation.p0 Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().l(this.f51923k);
        if (this.f51927o) {
            return;
        }
        this.f51926n = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onCreate(@androidx.annotation.p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f51913a = new Handler();
        this.f51920h = this.mContainerId == 0;
        if (bundle != null) {
            this.f51917e = bundle.getInt(f51911v, 0);
            this.f51918f = bundle.getInt(f51912w, 0);
            this.f51919g = bundle.getBoolean(X, true);
            this.f51920h = bundle.getBoolean(Y, this.f51920h);
            int i10 = 1 & (-1);
            this.f51921i = bundle.getInt(Z, -1);
        }
    }

    @NonNull
    @androidx.annotation.l0
    public Dialog onCreateDialog(@androidx.annotation.p0 Bundle bundle) {
        if (FragmentManager.b1(3)) {
            toString();
        }
        return new androidx.activity.t(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f51924l;
        if (dialog != null) {
            this.f51925m = true;
            dialog.setOnDismissListener(null);
            this.f51924l.dismiss();
            if (!this.f51926n) {
                onDismiss(this.f51924l);
            }
            this.f51924l = null;
            this.f51928s = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onDetach() {
        super.onDetach();
        if (!this.f51927o && !this.f51926n) {
            this.f51926n = true;
        }
        getViewLifecycleOwnerLiveData().p(this.f51923k);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    @androidx.annotation.i
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        if (!this.f51925m) {
            if (FragmentManager.b1(3)) {
                toString();
            }
            w(true, true, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public LayoutInflater onGetLayoutInflater(@androidx.annotation.p0 Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f51920h && !this.f51922j) {
            z(bundle);
            if (FragmentManager.b1(2)) {
                toString();
            }
            Dialog dialog = this.f51924l;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.b1(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getting layout inflater for DialogFragment ");
            sb2.append(this);
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f51924l;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(f51909p0, false);
            bundle.putBundle(f51910t, bundleOnSaveInstanceState);
        }
        int i10 = this.f51917e;
        if (i10 != 0) {
            bundle.putInt(f51911v, i10);
        }
        int i11 = this.f51918f;
        if (i11 != 0) {
            bundle.putInt(f51912w, i11);
        }
        boolean z10 = this.f51919g;
        if (!z10) {
            bundle.putBoolean(X, z10);
        }
        boolean z11 = this.f51920h;
        if (!z11) {
            bundle.putBoolean(Y, z11);
        }
        int i12 = this.f51921i;
        if (i12 != -1) {
            bundle.putInt(Z, i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f51924l;
        if (dialog != null) {
            this.f51925m = false;
            dialog.show();
            View decorView = this.f51924l.getWindow().getDecorView();
            n2.b(decorView, this);
            p2.b(decorView, this);
            androidx.savedstate.r.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f51924l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.l0
    public void onViewStateRestored(@androidx.annotation.p0 Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f51924l == null || bundle == null || (bundle2 = bundle.getBundle(f51910t)) == null) {
            return;
        }
        this.f51924l.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    void performCreateView(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, @androidx.annotation.p0 Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.f51924l != null && bundle != null && (bundle2 = bundle.getBundle(f51910t)) != null) {
            this.f51924l.onRestoreInstanceState(bundle2);
        }
    }

    @NonNull
    public final androidx.activity.t requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof androidx.activity.t) {
            return (androidx.activity.t) dialogRequireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + dialogRequireDialog);
    }

    @NonNull
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z10) {
        this.f51919g = z10;
        Dialog dialog = this.f51924l;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public void setShowsDialog(boolean z10) {
        this.f51920h = z10;
    }

    public void setStyle(int i10, @androidx.annotation.g1 int i11) {
        if (FragmentManager.b1(2)) {
            toString();
        }
        this.f51917e = i10;
        if (i10 == 2 || i10 == 3) {
            this.f51918f = R.style.Theme.Panel;
        }
        if (i11 != 0) {
            this.f51918f = i11;
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@NonNull Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(@NonNull FragmentManager fragmentManager, @androidx.annotation.p0 String str) {
        this.f51926n = false;
        this.f51927o = true;
        t0 t0VarW = fragmentManager.w();
        t0VarW.N(true);
        t0VarW.g(this, str);
        t0VarW.m();
    }

    public void showNow(@NonNull FragmentManager fragmentManager, @androidx.annotation.p0 String str) {
        this.f51926n = false;
        this.f51927o = true;
        t0 t0VarW = fragmentManager.w();
        t0VarW.N(true);
        t0VarW.g(this, str);
        t0VarW.o();
    }

    @androidx.annotation.p0
    View x(int i10) {
        Dialog dialog = this.f51924l;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    boolean y() {
        return this.f51928s;
    }

    public int show(@NonNull t0 t0Var, @androidx.annotation.p0 String str) {
        this.f51926n = false;
        this.f51927o = true;
        t0Var.g(this, str);
        this.f51925m = false;
        int iM = t0Var.m();
        this.f51921i = iM;
        return iM;
    }

    public m(@androidx.annotation.j0 int i10) {
        super(i10);
        this.f51914b = new a();
        this.f51915c = new b();
        this.f51916d = new c();
        this.f51917e = 0;
        this.f51918f = 0;
        this.f51919g = true;
        this.f51920h = true;
        this.f51921i = -1;
        this.f51923k = new d();
        this.f51928s = false;
    }
}
