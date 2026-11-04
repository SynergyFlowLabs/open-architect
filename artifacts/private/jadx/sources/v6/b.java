package v6;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.e;
import androidx.annotation.f;
import androidx.annotation.f1;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.appcompat.view.d;
import androidx.core.view.u1;
import com.google.android.material.color.u;
import com.google.android.material.shape.k;

/* JADX INFO: loaded from: classes4.dex */
public class b extends androidx.appcompat.app.c.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @f
    private static final int f381342c = r6.a.c.P;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @g1
    private static final int f381343d = r6.a.n.O4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @f
    private static final int f381344e = r6.a.c.f359291hc;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private Drawable f381345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Rect f381346b;

    public b(@NonNull Context context) {
        this(context, 0);
    }

    private static Context a(@NonNull Context context) {
        int iC = c(context);
        Context contextC = a7.a.c(context, null, f381342c, f381343d);
        return iC == 0 ? contextC : new d(contextC, iC);
    }

    private static int c(@NonNull Context context) {
        TypedValue typedValueA = com.google.android.material.resources.b.a(context, f381344e);
        if (typedValueA == null) {
            return 0;
        }
        return typedValueA.data;
    }

    private static int d(@NonNull Context context, int i10) {
        return i10 == 0 ? c(context) : i10;
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b setNeutralButton(@f1 int i10, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNeutralButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public b setNeutralButton(@p0 CharSequence charSequence, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public b setNeutralButtonIcon(@p0 Drawable drawable) {
        return (b) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b setOnCancelListener(@p0 DialogInterface.OnCancelListener onCancelListener) {
        return (b) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b setOnDismissListener(@p0 DialogInterface.OnDismissListener onDismissListener) {
        return (b) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b setOnItemSelectedListener(@p0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (b) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b setOnKeyListener(@p0 DialogInterface.OnKeyListener onKeyListener) {
        return (b) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b setPositiveButton(@f1 int i10, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public b setPositiveButton(@p0 CharSequence charSequence, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public b setPositiveButtonIcon(@p0 Drawable drawable) {
        return (b) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public b setSingleChoiceItems(@e int i10, int i11, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setSingleChoiceItems(i10, i11, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public b setSingleChoiceItems(@p0 Cursor cursor, int i10, @NonNull String str, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setSingleChoiceItems(cursor, i10, str, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public b setSingleChoiceItems(@p0 ListAdapter listAdapter, int i10, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setSingleChoiceItems(listAdapter, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public b setSingleChoiceItems(@p0 CharSequence[] charSequenceArr, int i10, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setSingleChoiceItems(charSequenceArr, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public b setTitle(@f1 int i10) {
        return (b) super.setTitle(i10);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public b setTitle(@p0 CharSequence charSequence) {
        return (b) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public b setView(int i10) {
        return (b) super.setView(i10);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public b setView(@p0 View view) {
        return (b) super.setView(view);
    }

    @p0
    public Drawable b() {
        return this.f381345a;
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    public androidx.appcompat.app.c create() {
        androidx.appcompat.app.c cVarCreate = super.create();
        Window window = cVarCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f381345a;
        if (drawable instanceof k) {
            ((k) drawable).o0(u1.T(decorView));
        }
        window.setBackgroundDrawable(c.b(this.f381345a, this.f381346b));
        decorView.setOnTouchListener(new a(cVarCreate, this.f381346b));
        return cVarCreate;
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b setAdapter(@p0 ListAdapter listAdapter, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setAdapter(listAdapter, onClickListener);
    }

    @NonNull
    @z7.a
    public b f(@p0 Drawable drawable) {
        this.f381345a = drawable;
        return this;
    }

    @NonNull
    @z7.a
    public b g(@t0 int i10) {
        this.f381346b.bottom = i10;
        return this;
    }

    @NonNull
    @z7.a
    public b h(@t0 int i10) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f381346b.left = i10;
            return this;
        }
        this.f381346b.right = i10;
        return this;
    }

    @NonNull
    @z7.a
    public b i(@t0 int i10) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f381346b.right = i10;
            return this;
        }
        this.f381346b.left = i10;
        return this;
    }

    @NonNull
    @z7.a
    public b j(@t0 int i10) {
        this.f381346b.top = i10;
        return this;
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b setCancelable(boolean z10) {
        return (b) super.setCancelable(z10);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b setCursor(@p0 Cursor cursor, @p0 DialogInterface.OnClickListener onClickListener, @NonNull String str) {
        return (b) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b setCustomTitle(@p0 View view) {
        return (b) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public b setIcon(@v int i10) {
        return (b) super.setIcon(i10);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b setIcon(@p0 Drawable drawable) {
        return (b) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public b setIconAttribute(@f int i10) {
        return (b) super.setIconAttribute(i10);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public b setItems(@e int i10, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setItems(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public b setItems(@p0 CharSequence[] charSequenceArr, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public b setMessage(@f1 int i10) {
        return (b) super.setMessage(i10);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public b setMessage(@p0 CharSequence charSequence) {
        return (b) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public b setMultiChoiceItems(@e int i10, @p0 boolean[] zArr, @p0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.setMultiChoiceItems(i10, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public b setMultiChoiceItems(@p0 Cursor cursor, @NonNull String str, @NonNull String str2, @p0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public b setMultiChoiceItems(@p0 CharSequence[] charSequenceArr, @p0 boolean[] zArr, @p0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public b setNegativeButton(@f1 int i10, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public b setNegativeButton(@p0 CharSequence charSequence, @p0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    @NonNull
    @z7.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b setNegativeButtonIcon(@p0 Drawable drawable) {
        return (b) super.setNegativeButtonIcon(drawable);
    }

    public b(@NonNull Context context, int i10) {
        super(a(context), d(context, i10));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i11 = f381342c;
        int i12 = f381343d;
        this.f381346b = c.a(context2, i11, i12);
        int iC = u.c(context2, r6.a.c.f359214e4, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, r6.a.o.Ll, i11, i12);
        int color = typedArrayObtainStyledAttributes.getColor(r6.a.o.Ql, iC);
        typedArrayObtainStyledAttributes.recycle();
        k kVar = new k(context2, null, i11, i12);
        kVar.a0(context2);
        kVar.p0(ColorStateList.valueOf(color));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
        if (typedValue.type == 5) {
            int i13 = 4 << 0;
            if (dimension >= 0.0f) {
                kVar.l0(dimension);
            }
        }
        this.f381345a = kVar;
    }
}
