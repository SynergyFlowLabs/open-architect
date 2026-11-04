package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class g extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f46111b = "Constraints";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    f f46112a;

    public g(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public f getConstraintSet() {
        if (this.f46112a == null) {
            this.f46112a = new f();
        }
        this.f46112a.J(this);
        return this.f46112a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
        super.setVisibility(8);
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c();
        super.setVisibility(8);
    }

    public static class a extends ConstraintLayout.b {
        public float V0;
        public boolean W0;
        public float X0;
        public float Y0;
        public float Z0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public float f46113a1;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        public float f46114b1;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        public float f46115c1;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public float f46116d1;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        public float f46117e1;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        public float f46118f1;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        public float f46119g1;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        public float f46120h1;

        public a(int i10, int i11) {
            super(i10, i11);
            this.V0 = 1.0f;
            int i12 = 7 ^ 0;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.f46113a1 = 0.0f;
            this.f46114b1 = 1.0f;
            this.f46115c1 = 1.0f;
            this.f46116d1 = 0.0f;
            this.f46117e1 = 0.0f;
            this.f46118f1 = 0.0f;
            this.f46119g1 = 0.0f;
            this.f46120h1 = 0.0f;
        }

        public a(a aVar) {
            super(aVar);
            this.V0 = 1.0f;
            this.W0 = false;
            int i10 = 4 ^ 0;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.f46113a1 = 0.0f;
            this.f46114b1 = 1.0f;
            this.f46115c1 = 1.0f;
            this.f46116d1 = 0.0f;
            this.f46117e1 = 0.0f;
            this.f46118f1 = 0.0f;
            this.f46119g1 = 0.0f;
            this.f46120h1 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.V0 = 1.0f;
            this.W0 = false;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.f46113a1 = 0.0f;
            this.f46114b1 = 1.0f;
            this.f46115c1 = 1.0f;
            this.f46116d1 = 0.0f;
            this.f46117e1 = 0.0f;
            this.f46118f1 = 0.0f;
            this.f46119g1 = 0.0f;
            this.f46120h1 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.f46456g6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46727w6) {
                    this.V0 = typedArrayObtainStyledAttributes.getFloat(index, this.V0);
                } else if (index == j.c.J6) {
                    this.X0 = typedArrayObtainStyledAttributes.getFloat(index, this.X0);
                    this.W0 = true;
                } else if (index == j.c.E6) {
                    this.Z0 = typedArrayObtainStyledAttributes.getFloat(index, this.Z0);
                } else if (index == j.c.F6) {
                    this.f46113a1 = typedArrayObtainStyledAttributes.getFloat(index, this.f46113a1);
                } else if (index == j.c.D6) {
                    this.Y0 = typedArrayObtainStyledAttributes.getFloat(index, this.Y0);
                } else if (index == j.c.B6) {
                    this.f46114b1 = typedArrayObtainStyledAttributes.getFloat(index, this.f46114b1);
                } else if (index == j.c.C6) {
                    this.f46115c1 = typedArrayObtainStyledAttributes.getFloat(index, this.f46115c1);
                } else if (index == j.c.f46744x6) {
                    this.f46116d1 = typedArrayObtainStyledAttributes.getFloat(index, this.f46116d1);
                } else if (index == j.c.f46761y6) {
                    this.f46117e1 = typedArrayObtainStyledAttributes.getFloat(index, this.f46117e1);
                } else if (index == j.c.f46778z6) {
                    this.f46118f1 = typedArrayObtainStyledAttributes.getFloat(index, this.f46118f1);
                } else if (index == j.c.A6) {
                    this.f46119g1 = typedArrayObtainStyledAttributes.getFloat(index, this.f46119g1);
                } else if (index == j.c.I6) {
                    this.f46120h1 = typedArrayObtainStyledAttributes.getFloat(index, this.f46120h1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
