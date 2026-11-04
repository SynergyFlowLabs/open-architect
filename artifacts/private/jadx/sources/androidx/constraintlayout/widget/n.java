package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f46813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f46814l;

    public n(Context context) {
        super(context);
    }

    public void L(androidx.constraintlayout.core.widgets.n nVar, int i10, int i11) {
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f46813k || this.f46814l) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f45787b; i10++) {
                    View viewById = constraintLayout.getViewById(this.f45786a[i10]);
                    if (viewById != null) {
                        if (this.f46813k) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.f46814l && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    protected void s(ConstraintLayout constraintLayout) {
        r(constraintLayout);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        q();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        q();
    }

    @Override // androidx.constraintlayout.widget.b
    protected void z(AttributeSet attributeSet) {
        super.z(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.H1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.O1) {
                    this.f46813k = true;
                } else if (index == j.c.f46418e2) {
                    this.f46814l = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public n(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
