package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.j0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends androidx.fragment.app.m implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    protected static final String f73038l3 = "key";

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final String f73039m3 = "PreferenceDialogFragment.title";

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final String f73040n3 = "PreferenceDialogFragment.positiveText";

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final String f73041o3 = "PreferenceDialogFragment.negativeText";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final String f73042p3 = "PreferenceDialogFragment.message";

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final String f73043q3 = "PreferenceDialogFragment.layout";

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final String f73044r3 = "PreferenceDialogFragment.icon";
    private CharSequence H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private CharSequence f73045g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private CharSequence f73046h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @j0
    private int f73047i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private BitmapDrawable f73048j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f73049k3;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private DialogPreference f73050p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private CharSequence f73051p2;

    @w0(30)
    private static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(@NonNull Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    private void G(@NonNull Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(window);
        } else {
            H();
        }
    }

    public DialogPreference A() {
        if (this.f73050p1 == null) {
            this.f73050p1 = (DialogPreference) ((DialogPreference.a) getTargetFragment()).e(requireArguments().getString(f73038l3));
        }
        return this.f73050p1;
    }

    @b1({b1.a.LIBRARY})
    protected boolean B() {
        return false;
    }

    protected void C(@NonNull View view) {
        int i10;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f73046h3;
            if (TextUtils.isEmpty(charSequence)) {
                i10 = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i10 = 0;
            }
            if (viewFindViewById.getVisibility() != i10) {
                viewFindViewById.setVisibility(i10);
            }
        }
    }

    @p0
    protected View D(@NonNull Context context) {
        int i10 = this.f73047i3;
        if (i10 == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i10, (ViewGroup) null);
    }

    public abstract void E(boolean z10);

    protected void F(@NonNull androidx.appcompat.app.c.a aVar) {
    }

    @b1({b1.a.LIBRARY})
    protected void H() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(@NonNull DialogInterface dialogInterface, int i10) {
        this.f73049k3 = i10;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        androidx.activity.result.b targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        String string = requireArguments().getString(f73038l3);
        if (bundle != null) {
            this.H1 = bundle.getCharSequence(f73039m3);
            this.f73051p2 = bundle.getCharSequence(f73040n3);
            this.f73045g3 = bundle.getCharSequence(f73041o3);
            this.f73046h3 = bundle.getCharSequence(f73042p3);
            this.f73047i3 = bundle.getInt(f73043q3, 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable(f73044r3);
            if (bitmap != null) {
                this.f73048j3 = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.e(string);
        this.f73050p1 = dialogPreference;
        this.H1 = dialogPreference.G1();
        this.f73051p2 = this.f73050p1.I1();
        this.f73045g3 = this.f73050p1.H1();
        this.f73046h3 = this.f73050p1.F1();
        this.f73047i3 = this.f73050p1.E1();
        Drawable drawableD1 = this.f73050p1.D1();
        if (drawableD1 == null || (drawableD1 instanceof BitmapDrawable)) {
            this.f73048j3 = (BitmapDrawable) drawableD1;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableD1.getIntrinsicWidth(), drawableD1.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableD1.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableD1.draw(canvas);
        this.f73048j3 = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // androidx.fragment.app.m
    @NonNull
    public Dialog onCreateDialog(@p0 Bundle bundle) {
        this.f73049k3 = -2;
        androidx.appcompat.app.c.a negativeButton = new androidx.appcompat.app.c.a(requireContext()).setTitle(this.H1).setIcon(this.f73048j3).setPositiveButton(this.f73051p2, this).setNegativeButton(this.f73045g3, this);
        View viewD = D(requireContext());
        if (viewD != null) {
            C(viewD);
            negativeButton.setView(viewD);
        } else {
            negativeButton.setMessage(this.f73046h3);
        }
        F(negativeButton);
        androidx.appcompat.app.c cVarCreate = negativeButton.create();
        if (B()) {
            G(cVarCreate);
        }
        return cVarCreate;
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        E(this.f73049k3 == -1);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(f73039m3, this.H1);
        bundle.putCharSequence(f73040n3, this.f73051p2);
        bundle.putCharSequence(f73041o3, this.f73045g3);
        bundle.putCharSequence(f73042p3, this.f73046h3);
        bundle.putInt(f73043q3, this.f73047i3);
        BitmapDrawable bitmapDrawable = this.f73048j3;
        if (bitmapDrawable != null) {
            bundle.putParcelable(f73044r3, bitmapDrawable.getBitmap());
        }
    }
}
