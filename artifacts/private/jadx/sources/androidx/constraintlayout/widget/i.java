package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class i extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f46122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46123c;

    public i(Context context) {
        super(context);
        this.f46121a = -1;
        this.f46122b = null;
        this.f46123c = 4;
        a(null);
    }

    private void a(AttributeSet attributeSet) {
        super.setVisibility(this.f46123c);
        this.f46121a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.Y3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.Z3) {
                    this.f46121a = typedArrayObtainStyledAttributes.getResourceId(index, this.f46121a);
                } else if (index == j.c.f46352a4) {
                    this.f46123c = typedArrayObtainStyledAttributes.getInt(index, this.f46123c);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f46122b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f46122b.getLayoutParams();
        bVar2.f45716v0.c2(0);
        androidx.constraintlayout.core.widgets.e.b bVarH = bVar.f45716v0.H();
        androidx.constraintlayout.core.widgets.e.b bVar3 = androidx.constraintlayout.core.widgets.e.b.FIXED;
        if (bVarH != bVar3) {
            bVar.f45716v0.d2(bVar2.f45716v0.m0());
        }
        if (bVar.f45716v0.j0() != bVar3) {
            bVar.f45716v0.z1(bVar2.f45716v0.D());
        }
        bVar2.f45716v0.c2(8);
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.f46121a == -1 && !isInEditMode()) {
            setVisibility(this.f46123c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f46121a);
        this.f46122b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).f45692j0 = true;
            this.f46122b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f46122b;
    }

    public int getEmptyVisibility() {
        return this.f46123c;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            boolean z10 = true | true;
            paint.getTextBounds(com.planner5d.library.model.payments.a.f222474i, 0, 1, rect);
            canvas.drawText(com.planner5d.library.model.payments.a.f222474i, ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f46121a == i10) {
            return;
        }
        View view = this.f46122b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f46122b.getLayoutParams()).f45692j0 = false;
            this.f46122b = null;
        }
        this.f46121a = i10;
        if (i10 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f46123c = i10;
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46121a = -1;
        this.f46122b = null;
        this.f46123c = 4;
        a(attributeSet);
    }

    public i(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f46121a = -1;
        this.f46122b = null;
        this.f46123c = 4;
        a(attributeSet);
    }

    public i(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f46121a = -1;
        this.f46122b = null;
        this.f46123c = 4;
        a(attributeSet);
    }
}
