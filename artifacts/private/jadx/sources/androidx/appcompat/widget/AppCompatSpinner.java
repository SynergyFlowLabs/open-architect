package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements androidx.core.view.p1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e.a({"ResourceType"})
    @androidx.annotation.h1
    private static final int[] f10942i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f10943j = 15;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f10944k = "AppCompatSpinner";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f10945l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f10946m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f10947n = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.widget.f f10948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f10949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q0 f10950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f10951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f10952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f10953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f10954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f10955h;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f10956a;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f10956a ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f10956a = parcel.readByte() != 0;
        }
    }

    class a extends q0 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ f f10957j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f10957j = fVar;
        }

        @Override // androidx.appcompat.widget.q0
        public androidx.appcompat.view.menu.q b() {
            return this.f10957j;
        }

        @Override // androidx.appcompat.widget.q0
        public boolean c() {
            if (!AppCompatSpinner.this.getInternalPopup().d()) {
                AppCompatSpinner.this.b();
            }
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().d()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    @androidx.annotation.w0(23)
    private static final class c {
        private c() {
        }

        @androidx.annotation.u
        static void a(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter, @androidx.annotation.p0 Resources.Theme theme) {
            if (!androidx.core.util.o.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    @androidx.annotation.l1
    class d implements g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.l1
        androidx.appcompat.app.c f10960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f10961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f10962c;

        d() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void b(Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public Drawable c() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public boolean d() {
            androidx.appcompat.app.c cVar = this.f10960a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f10960a;
            if (cVar != null) {
                cVar.dismiss();
                this.f10960a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void f(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void g(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void h(int i10, int i11) {
            if (this.f10961b == null) {
                return;
            }
            androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f10962c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.c cVarCreate = aVar.setSingleChoiceItems(this.f10961b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f10960a = cVarCreate;
            ListView listViewN = cVarCreate.n();
            listViewN.setTextDirection(i10);
            listViewN.setTextAlignment(i11);
            this.f10960a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public int i() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public int l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void m(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public CharSequence n() {
            return this.f10962c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void o(CharSequence charSequence) {
            this.f10962c = charSequence;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i10, this.f10961b.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public int p() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void q(ListAdapter listAdapter) {
            this.f10961b = listAdapter;
        }
    }

    private static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f10964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f10965b;

        public e(@androidx.annotation.p0 SpinnerAdapter spinnerAdapter, @androidx.annotation.p0 Resources.Theme theme) {
            this.f10964a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f10965b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof f1) {
                    f1 f1Var = (f1) spinnerAdapter;
                    if (f1Var.getDropDownViewTheme() == null) {
                        f1Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f10965b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f10964a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f10964a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f10964a;
            if (spinnerAdapter != null) {
                return spinnerAdapter.getItem(i10);
            }
            int i11 = 6 << 0;
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f10964a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f10964a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f10965b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f10964a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f10964a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @androidx.annotation.l1
    class f extends s0 implements g {
        ListAdapter A3;
        private final Rect B3;
        private int C3;

        /* JADX INFO: renamed from: z3, reason: collision with root package name */
        private CharSequence f10966z3;

        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f10967a;

            a(AppCompatSpinner appCompatSpinner) {
                this.f10967a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    AppCompatSpinner.this.performItemClick(view, i10, fVar.A3.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.r0(AppCompatSpinner.this)) {
                    f.this.dismiss();
                } else {
                    f.this.q0();
                    f.super.a();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f10970a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f10970a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f10970a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.B3 = new Rect();
            S(AppCompatSpinner.this);
            d0(true);
            j0(0);
            f0(new a(AppCompatSpinner.this));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void g(int i10) {
            this.C3 = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void h(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zD = d();
            q0();
            a0(2);
            super.a();
            ListView listViewK = k();
            listViewK.setChoiceMode(1);
            listViewK.setTextDirection(i10);
            listViewK.setTextAlignment(i11);
            l0(AppCompatSpinner.this.getSelectedItemPosition());
            if (!zD && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                e0(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public CharSequence n() {
            return this.f10966z3;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void o(CharSequence charSequence) {
            this.f10966z3 = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public int p() {
            return this.C3;
        }

        @Override // androidx.appcompat.widget.s0, androidx.appcompat.widget.AppCompatSpinner.g
        public void q(ListAdapter listAdapter) {
            super.q(listAdapter);
            this.A3 = listAdapter;
        }

        void q0() {
            int i10;
            Drawable drawableC = c();
            if (drawableC != null) {
                drawableC.getPadding(AppCompatSpinner.this.f10955h);
                i10 = v1.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f10955h.right : -AppCompatSpinner.this.f10955h.left;
            } else {
                Rect rect = AppCompatSpinner.this.f10955h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i11 = appCompatSpinner.f10954g;
            if (i11 == -2) {
                int iA = appCompatSpinner.a((SpinnerAdapter) this.A3, c());
                int i12 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f10955h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                U(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                U((width - paddingLeft) - paddingRight);
            } else {
                U(i11);
            }
            m(v1.b(AppCompatSpinner.this) ? i10 + (((width - paddingRight) - H()) - p()) : i10 + paddingLeft + p());
        }

        boolean r0(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.B3);
        }
    }

    @androidx.annotation.l1
    interface g {
        void b(Drawable drawable);

        Drawable c();

        boolean d();

        void dismiss();

        void f(int i10);

        void g(int i10);

        void h(int i10, int i11);

        int i();

        int l();

        void m(int i10);

        CharSequence n();

        void o(CharSequence charSequence);

        int p();

        void q(ListAdapter listAdapter);
    }

    public AppCompatSpinner(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f10955h);
        Rect rect = this.f10955h;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f10953f.h(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.f fVar = this.f10948a;
        if (fVar != null) {
            fVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f10953f;
        return gVar != null ? gVar.l() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f10953f;
        return gVar != null ? gVar.i() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f10953f != null ? this.f10954g : super.getDropDownWidth();
    }

    @androidx.annotation.l1
    final g getInternalPopup() {
        return this.f10953f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f10953f;
        return gVar != null ? gVar.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f10949b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f10953f;
        return gVar != null ? gVar.n() : super.getPrompt();
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.f fVar = this.f10948a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.f fVar = this.f10948a;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f10953f;
        if (gVar != null && gVar.d()) {
            this.f10953f.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f10953f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f10956a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        g gVar = this.f10953f;
        savedState.f10956a = gVar != null && gVar.d();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        q0 q0Var = this.f10950c;
        if (q0Var == null || !q0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f10953f;
        if (gVar == null) {
            return super.performClick();
        }
        if (!gVar.d()) {
            b();
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.f fVar = this.f10948a;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.f fVar = this.f10948a;
        if (fVar != null) {
            fVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        g gVar = this.f10953f;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            gVar.g(i10);
            this.f10953f.m(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        g gVar = this.f10953f;
        if (gVar != null) {
            gVar.f(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f10953f != null) {
            this.f10954g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f10953f;
        if (gVar != null) {
            gVar.b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@androidx.annotation.v int i10) {
        setPopupBackgroundDrawable(j.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f10953f;
        if (gVar != null) {
            gVar.o(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        androidx.appcompat.widget.f fVar = this.f10948a;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.p1
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        androidx.appcompat.widget.f fVar = this.f10948a;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    public AppCompatSpinner(@NonNull Context context, int i10) {
        this(context, null, i.a.b.Y2, i10);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f10952e) {
            this.f10951d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f10953f != null) {
            Context context = this.f10949b;
            if (context == null) {
                context = getContext();
            }
            this.f10953f.q(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, i.a.b.Y2);
    }

    public AppCompatSpinner(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public AppCompatSpinner(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ec  */
    public AppCompatSpinner(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, int i11, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrY;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i10);
        this.f10955h = new Rect();
        e1.a(this, getContext());
        j1 j1VarG = j1.G(context, attributeSet, i.a.m.F5, i10, 0);
        this.f10948a = new androidx.appcompat.widget.f(this);
        if (theme != null) {
            this.f10949b = new androidx.appcompat.view.d(context, theme);
        } else {
            int iU = j1VarG.u(i.a.m.K5, 0);
            if (iU != 0) {
                this.f10949b = new androidx.appcompat.view.d(context, iU);
            } else {
                this.f10949b = context;
            }
        }
        TypedArray typedArray = null;
        if (i11 == -1) {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10942i, i10, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception unused) {
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i11 != 0) {
                        d dVar = new d();
                        this.f10953f = dVar;
                        dVar.o(j1VarG.w(i.a.m.I5));
                    } else if (i11 == 1) {
                        f fVar = new f(this.f10949b, attributeSet, i10);
                        j1 j1VarG2 = j1.G(this.f10949b, attributeSet, i.a.m.F5, i10, 0);
                        this.f10954g = j1VarG2.q(i.a.m.J5, -2);
                        fVar.b(j1VarG2.h(i.a.m.H5));
                        fVar.o(j1VarG.w(i.a.m.I5));
                        j1VarG2.I();
                        this.f10953f = fVar;
                        this.f10950c = new a(this, fVar);
                    }
                    charSequenceArrY = j1VarG.y(i.a.m.G5);
                    if (charSequenceArrY != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrY);
                        arrayAdapter.setDropDownViewResource(i.a.j.F);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    j1VarG.I();
                    this.f10952e = true;
                    spinnerAdapter = this.f10951d;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f10951d = null;
                    }
                    this.f10948a.e(attributeSet, i10);
                } catch (Throwable th2) {
                    th = th2;
                    typedArray = typedArrayObtainStyledAttributes;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                typedArrayObtainStyledAttributes = null;
            } catch (Throwable th3) {
                th = th3;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (i11 != 0) {
            d dVar2 = new d();
            this.f10953f = dVar2;
            dVar2.o(j1VarG.w(i.a.m.I5));
        } else if (i11 == 1) {
            f fVar2 = new f(this.f10949b, attributeSet, i10);
            j1 j1VarG3 = j1.G(this.f10949b, attributeSet, i.a.m.F5, i10, 0);
            this.f10954g = j1VarG3.q(i.a.m.J5, -2);
            fVar2.b(j1VarG3.h(i.a.m.H5));
            fVar2.o(j1VarG.w(i.a.m.I5));
            j1VarG3.I();
            this.f10953f = fVar2;
            this.f10950c = new a(this, fVar2);
        }
        charSequenceArrY = j1VarG.y(i.a.m.G5);
        if (charSequenceArrY != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrY);
            arrayAdapter2.setDropDownViewResource(i.a.j.F);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        j1VarG.I();
        this.f10952e = true;
        spinnerAdapter = this.f10951d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f10951d = null;
        }
        this.f10948a.e(attributeSet, i10);
    }
}
