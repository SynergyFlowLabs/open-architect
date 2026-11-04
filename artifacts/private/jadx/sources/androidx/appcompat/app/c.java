package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f1;
import androidx.annotation.g1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
public class c extends q implements DialogInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f10336g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f10337h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AlertController f10338f;

    public static class a {
        private final AlertController.f P;
        private final int mTheme;

        public a(@NonNull Context context) {
            this(context, c.o(context, 0));
        }

        @NonNull
        public c create() {
            c cVar = new c(this.P.f10145a, this.mTheme);
            this.P.a(cVar.f10338f);
            cVar.setCancelable(this.P.f10162r);
            if (this.P.f10162r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.P.f10163s);
            cVar.setOnDismissListener(this.P.f10164t);
            DialogInterface.OnKeyListener onKeyListener = this.P.f10165u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        @NonNull
        public Context getContext() {
            return this.P.f10145a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10167w = listAdapter;
            fVar.f10168x = onClickListener;
            return this;
        }

        public a setCancelable(boolean z10) {
            this.P.f10162r = z10;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.P;
            fVar.K = cursor;
            fVar.L = str;
            fVar.f10168x = onClickListener;
            return this;
        }

        public a setCustomTitle(@p0 View view) {
            this.P.f10151g = view;
            return this;
        }

        public a setIcon(@androidx.annotation.v int i10) {
            this.P.f10147c = i10;
            return this;
        }

        public a setIconAttribute(@androidx.annotation.f int i10) {
            TypedValue typedValue = new TypedValue();
            this.P.f10145a.getTheme().resolveAttribute(i10, typedValue, true);
            this.P.f10147c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z10) {
            this.P.N = z10;
            return this;
        }

        public a setItems(@androidx.annotation.e int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10166v = fVar.f10145a.getResources().getTextArray(i10);
            this.P.f10168x = onClickListener;
            return this;
        }

        public a setMessage(@f1 int i10) {
            AlertController.f fVar = this.P;
            fVar.f10152h = fVar.f10145a.getText(i10);
            return this;
        }

        public a setMultiChoiceItems(@androidx.annotation.e int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10166v = fVar.f10145a.getResources().getTextArray(i10);
            AlertController.f fVar2 = this.P;
            fVar2.J = onMultiChoiceClickListener;
            fVar2.F = zArr;
            fVar2.G = true;
            return this;
        }

        public a setNegativeButton(@f1 int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10156l = fVar.f10145a.getText(i10);
            this.P.f10158n = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.P.f10157m = drawable;
            return this;
        }

        public a setNeutralButton(@f1 int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10159o = fVar.f10145a.getText(i10);
            this.P.f10161q = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.P.f10160p = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.f10163s = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.f10164t = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.O = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.f10165u = onKeyListener;
            return this;
        }

        public a setPositiveButton(@f1 int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10153i = fVar.f10145a.getText(i10);
            this.P.f10155k = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.P.f10154j = drawable;
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public a setRecycleOnMeasureEnabled(boolean z10) {
            this.P.Q = z10;
            return this;
        }

        public a setSingleChoiceItems(@androidx.annotation.e int i10, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10166v = fVar.f10145a.getResources().getTextArray(i10);
            AlertController.f fVar2 = this.P;
            fVar2.f10168x = onClickListener;
            fVar2.I = i11;
            fVar2.H = true;
            return this;
        }

        public a setTitle(@f1 int i10) {
            AlertController.f fVar = this.P;
            fVar.f10150f = fVar.f10145a.getText(i10);
            return this;
        }

        public a setView(int i10) {
            AlertController.f fVar = this.P;
            fVar.f10170z = null;
            fVar.f10169y = i10;
            fVar.E = false;
            return this;
        }

        public c show() {
            c cVarCreate = create();
            cVarCreate.show();
            return cVarCreate;
        }

        public a(@NonNull Context context, @g1 int i10) {
            this.P = new AlertController.f(new ContextThemeWrapper(context, c.o(context, i10)));
            this.mTheme = i10;
        }

        public a setIcon(@p0 Drawable drawable) {
            this.P.f10148d = drawable;
            return this;
        }

        public a setMessage(@p0 CharSequence charSequence) {
            this.P.f10152h = charSequence;
            return this;
        }

        public a setTitle(@p0 CharSequence charSequence) {
            this.P.f10150f = charSequence;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10166v = charSequenceArr;
            fVar.f10168x = onClickListener;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10156l = charSequence;
            fVar.f10158n = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10159o = charSequence;
            fVar.f10161q = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10153i = charSequence;
            fVar.f10155k = onClickListener;
            return this;
        }

        public a setView(View view) {
            AlertController.f fVar = this.P;
            fVar.f10170z = view;
            fVar.f10169y = 0;
            fVar.E = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10166v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.K = cursor;
            fVar.f10168x = onClickListener;
            fVar.I = i10;
            fVar.L = str;
            fVar.H = true;
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public a setView(View view, int i10, int i11, int i12, int i13) {
            AlertController.f fVar = this.P;
            fVar.f10170z = view;
            fVar.f10169y = 0;
            fVar.E = true;
            fVar.A = i10;
            fVar.B = i11;
            fVar.C = i12;
            fVar.D = i13;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.P;
            fVar.K = cursor;
            fVar.J = onMultiChoiceClickListener;
            fVar.M = str;
            fVar.L = str2;
            fVar.G = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10166v = charSequenceArr;
            fVar.f10168x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f10167w = listAdapter;
            fVar.f10168x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }
    }

    protected c(@NonNull Context context) {
        this(context, 0);
    }

    static int o(@NonNull Context context, @g1 int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.b.N, typedValue, true);
        return typedValue.resourceId;
    }

    public Button m(int i10) {
        return this.f10338f.c(i10);
    }

    public ListView n() {
        return this.f10338f.e();
    }

    @Override // androidx.appcompat.app.q, androidx.activity.t, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338f.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f10338f.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f10338f.i(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void p(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f10338f.l(i10, charSequence, onClickListener, null, null);
    }

    public void q(int i10, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f10338f.l(i10, charSequence, onClickListener, null, drawable);
    }

    public void r(int i10, CharSequence charSequence, Message message) {
        this.f10338f.l(i10, charSequence, null, message, null);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    void s(int i10) {
        this.f10338f.m(i10);
    }

    @Override // androidx.appcompat.app.q, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f10338f.s(charSequence);
    }

    public void t(View view) {
        this.f10338f.n(view);
    }

    public void u(int i10) {
        this.f10338f.o(i10);
    }

    public void v(Drawable drawable) {
        this.f10338f.p(drawable);
    }

    public void w(int i10) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i10, typedValue, true);
        this.f10338f.o(typedValue.resourceId);
    }

    public void x(CharSequence charSequence) {
        this.f10338f.q(charSequence);
    }

    public void y(View view) {
        this.f10338f.u(view);
    }

    public void z(View view, int i10, int i11, int i12, int i13) {
        this.f10338f.v(view, i10, i11, i12, i13);
    }

    protected c(@NonNull Context context, @g1 int i10) {
        super(context, o(context, i10));
        this.f10338f = new AlertController(getContext(), this, getWindow());
    }

    protected c(@NonNull Context context, boolean z10, @p0 DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z10);
        setOnCancelListener(onCancelListener);
    }
}
