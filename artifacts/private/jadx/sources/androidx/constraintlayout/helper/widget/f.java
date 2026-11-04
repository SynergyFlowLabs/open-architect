package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.p;
import androidx.constraintlayout.widget.j;

/* JADX INFO: loaded from: classes2.dex */
public class f extends p {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f44935g3 = -1;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f44936h3 = 0;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f44937i3 = 1;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final int f44938j3 = 2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f44939k3 = 3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final int f44940l3 = -1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final String f44941p2 = "FadeMove";
    private int H1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f44942o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f44943p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f44944p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f44945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f44946t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f44947v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f44948w;

    public f(Context context) {
        super(context);
        this.f44942o = 0.1f;
        this.f44945s = 49;
        this.f44946t = 50;
        this.f44947v = 0;
        this.f44948w = 0;
        this.f44943p0 = true;
        this.f44944p1 = -1;
        this.H1 = -1;
    }

    private void M(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Uc);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.Yc) {
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f44945s);
                    this.f44945s = i11;
                    this.f44945s = Math.max(Math.min(i11, 99), 0);
                } else if (index == j.c.Wc) {
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f44946t);
                    this.f44946t = i12;
                    this.f44946t = Math.max(Math.min(i12, 99), 0);
                } else if (index == j.c.f46361ad) {
                    this.f44947v = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f44947v);
                } else if (index == j.c.f46378bd) {
                    this.f44948w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f44948w);
                } else if (index == j.c.Vc) {
                    this.f44942o = typedArrayObtainStyledAttributes.getFloat(index, this.f44942o);
                } else if (index == j.c.Xc) {
                    this.H1 = typedArrayObtainStyledAttributes.getInt(index, this.H1);
                } else if (index == j.c.Zc) {
                    this.f44943p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f44943p0);
                } else if (index == j.c.f46395cd) {
                    this.f44944p1 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44944p1);
                }
            }
            int i13 = this.f44945s;
            int i14 = this.f44946t;
            if (i13 == i14) {
                if (i13 > 0) {
                    this.f44945s = i13 - 1;
                } else {
                    this.f44946t = i14 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0148  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d5  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016c, code lost:
    
        if (r14 == 0.0f) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0184, code lost:
    
        if (r14 == 0.0f) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0197, code lost:
    
        if (r15 == 0.0f) goto L59;
     */
    @Override // androidx.constraintlayout.motion.widget.p, androidx.constraintlayout.motion.widget.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(androidx.constraintlayout.motion.widget.MotionLayout r23, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.o> r24) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.f.b(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.p, androidx.constraintlayout.motion.widget.q
    public boolean f() {
        return true;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44942o = 0.1f;
        this.f44945s = 49;
        this.f44946t = 50;
        this.f44947v = 0;
        this.f44948w = 0;
        this.f44943p0 = true;
        this.f44944p1 = -1;
        this.H1 = -1;
        M(context, attributeSet);
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f44942o = 0.1f;
        this.f44945s = 49;
        this.f44946t = 50;
        this.f44947v = 0;
        this.f44948w = 0;
        this.f44943p0 = true;
        this.f44944p1 = -1;
        this.H1 = -1;
        M(context, attributeSet);
    }
}
