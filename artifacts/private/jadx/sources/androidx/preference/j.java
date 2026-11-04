package androidx.preference;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
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
@Deprecated
public abstract class j extends DialogFragment implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    protected static final String f73023i = "key";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f73024j = "PreferenceDialogFragment.title";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f73025k = "PreferenceDialogFragment.positiveText";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f73026l = "PreferenceDialogFragment.negativeText";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f73027m = "PreferenceDialogFragment.message";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f73028n = "PreferenceDialogFragment.layout";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f73029o = "PreferenceDialogFragment.icon";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DialogPreference f73030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f73031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f73032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f73033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f73034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @j0
    private int f73035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BitmapDrawable f73036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f73037h;

    @w0(30)
    private static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(@NonNull Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    @Deprecated
    public j() {
    }

    private void g(@NonNull Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(window);
        } else {
            window.setSoftInputMode(5);
        }
    }

    @Deprecated
    public DialogPreference a() {
        if (this.f73030a == null) {
            this.f73030a = (DialogPreference) ((DialogPreference.a) getTargetFragment()).e(getArguments().getString(f73023i));
        }
        return this.f73030a;
    }

    @b1({b1.a.LIBRARY})
    protected boolean b() {
        return false;
    }

    @Deprecated
    protected void c(@NonNull View view) {
        int i10;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f73034e;
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
    @Deprecated
    protected View d(@NonNull Context context) {
        int i10 = this.f73035f;
        if (i10 == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i10, (ViewGroup) null);
    }

    @Deprecated
    public abstract void e(boolean z10);

    @Deprecated
    protected void f(@NonNull AlertDialog.Builder builder) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    @Deprecated
    public void onClick(@NonNull DialogInterface dialogInterface, int i10) {
        this.f73037h = i10;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        String string = getArguments().getString(f73023i);
        if (bundle != null) {
            this.f73031b = bundle.getCharSequence(f73024j);
            this.f73032c = bundle.getCharSequence(f73025k);
            this.f73033d = bundle.getCharSequence(f73026l);
            this.f73034e = bundle.getCharSequence(f73027m);
            this.f73035f = bundle.getInt(f73028n, 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable(f73029o);
            if (bitmap != null) {
                this.f73036g = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.e(string);
        this.f73030a = dialogPreference;
        this.f73031b = dialogPreference.G1();
        this.f73032c = this.f73030a.I1();
        this.f73033d = this.f73030a.H1();
        this.f73034e = this.f73030a.F1();
        this.f73035f = this.f73030a.E1();
        Drawable drawableD1 = this.f73030a.D1();
        if (drawableD1 == null || (drawableD1 instanceof BitmapDrawable)) {
            this.f73036g = (BitmapDrawable) drawableD1;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableD1.getIntrinsicWidth(), drawableD1.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableD1.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableD1.draw(canvas);
        this.f73036g = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // android.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@p0 Bundle bundle) {
        Activity activity = getActivity();
        this.f73037h = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f73031b).setIcon(this.f73036g).setPositiveButton(this.f73032c, this).setNegativeButton(this.f73033d, this);
        View viewD = d(activity);
        if (viewD != null) {
            c(viewD);
            negativeButton.setView(viewD);
        } else {
            negativeButton.setMessage(this.f73034e);
        }
        f(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (b()) {
            g(alertDialogCreate);
        }
        return alertDialogCreate;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        e(this.f73037h == -1);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(f73024j, this.f73031b);
        bundle.putCharSequence(f73025k, this.f73032c);
        bundle.putCharSequence(f73026l, this.f73033d);
        bundle.putCharSequence(f73027m, this.f73034e);
        bundle.putInt(f73028n, this.f73035f);
        BitmapDrawable bitmapDrawable = this.f73036g;
        if (bitmapDrawable != null) {
            bundle.putParcelable(f73029o, bitmapDrawable.getBitmap());
        }
    }
}
