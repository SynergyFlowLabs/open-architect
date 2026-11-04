package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes2.dex */
public class k extends View implements l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f46791d;

    public k(Context context) {
        super(context);
        this.f46788a = -1;
        this.f46789b = false;
        this.f46790c = 0;
        this.f46791d = true;
        super.setVisibility(8);
        c(null);
    }

    private void b(int i10, int i11, MotionLayout motionLayout, int i12) {
        f fVarP0 = motionLayout.p0(i12);
        fVarP0.g1(i11, i10);
        motionLayout.a1(i12, fVarP0);
    }

    private void c(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.T3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.X3) {
                    this.f46788a = typedArrayObtainStyledAttributes.getResourceId(index, this.f46788a);
                } else if (index == j.c.U3) {
                    this.f46789b = typedArrayObtainStyledAttributes.getBoolean(index, this.f46789b);
                } else if (index == j.c.W3) {
                    this.f46790c = typedArrayObtainStyledAttributes.getResourceId(index, this.f46790c);
                } else if (index == j.c.V3) {
                    this.f46791d = typedArrayObtainStyledAttributes.getBoolean(index, this.f46791d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f46788a != -1) {
            ConstraintLayout.getSharedValues().a(this.f46788a, this);
        }
    }

    @Override // androidx.constraintlayout.widget.l.a
    public void a(int i10, int i11, int i12) {
        setGuidelineBegin(i11);
        int id2 = getId();
        if (id2 > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i13 = this.f46790c;
            if (i13 != 0) {
                currentState = i13;
            }
            int i14 = 0;
            if (!this.f46789b) {
                if (!this.f46791d) {
                    b(i11, id2, motionLayout, currentState);
                    return;
                }
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                while (i14 < constraintSetIds.length) {
                    b(i11, id2, motionLayout, constraintSetIds[i14]);
                    i14++;
                }
                return;
            }
            if (this.f46791d) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i14 < constraintSetIds2.length) {
                    int i15 = constraintSetIds2[i14];
                    if (i15 != currentState) {
                        b(i11, id2, motionLayout, i15);
                    }
                    i14++;
                }
            }
            f fVarB0 = motionLayout.b0(currentState);
            fVarB0.g1(id2, i11);
            motionLayout.b1(currentState, fVarB0, 1000);
        }
    }

    public boolean d() {
        return this.f46789b;
    }

    @Override // android.view.View
    @e.a({"MissingSuperCall"})
    public void draw(@NonNull Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f46790c;
    }

    public int getAttributeId() {
        return this.f46788a;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z10) {
        this.f46789b = z10;
    }

    public void setApplyToConstraintSetId(int i10) {
        this.f46790c = i10;
    }

    public void setAttributeId(int i10) {
        l sharedValues = ConstraintLayout.getSharedValues();
        int i11 = this.f46788a;
        if (i11 != -1) {
            sharedValues.e(i11, this);
        }
        this.f46788a = i10;
        if (i10 != -1) {
            sharedValues.a(i10, this);
        }
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f45673a = i10;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f45675b = i10;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f45677c = f10;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46788a = -1;
        this.f46789b = false;
        this.f46790c = 0;
        this.f46791d = true;
        super.setVisibility(8);
        c(attributeSet);
    }

    public k(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f46788a = -1;
        this.f46789b = false;
        this.f46790c = 0;
        this.f46791d = true;
        super.setVisibility(8);
        c(attributeSet);
    }

    public k(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f46788a = -1;
        this.f46789b = false;
        this.f46790c = 0;
        this.f46791d = true;
        super.setVisibility(8);
        c(attributeSet);
    }
}
