package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<View> f11129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LayoutInflater f11130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f11131e;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f11127a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f11130d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f11127a, viewGroup, false);
        int i10 = this.f11128b;
        if (i10 != -1) {
            viewInflate.setId(i10);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f11129c = new WeakReference<>(viewInflate);
        a aVar = this.f11131e;
        if (aVar != null) {
            aVar.a(this, viewInflate);
        }
        return viewInflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @e.a({"MissingSuperCall"})
    public void draw(@NonNull Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f11128b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f11130d;
    }

    public int getLayoutResource() {
        return this.f11127a;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f11128b = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f11130d = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f11127a = i10;
    }

    public void setOnInflateListener(a aVar) {
        this.f11131e = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f11129c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 != 0 && i10 != 4) {
            return;
        }
        a();
    }

    public ViewStubCompat(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11127a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.m.f286557i7, i10, 0);
        this.f11128b = typedArrayObtainStyledAttributes.getResourceId(i.a.m.f286584l7, -1);
        this.f11127a = typedArrayObtainStyledAttributes.getResourceId(i.a.m.f286575k7, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(i.a.m.f286566j7, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
