package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static l sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.b> mConstraintHelpers;
    protected androidx.constraintlayout.widget.c mConstraintLayoutSpec;
    private f mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected androidx.constraintlayout.core.widgets.f mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    c mMeasurer;
    private androidx.constraintlayout.core.f mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<d> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<androidx.constraintlayout.core.widgets.e> mTempMapIdToWidget;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45669a;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.widgets.e.b.values().length];
            f45669a = iArr;
            try {
                iArr[androidx.constraintlayout.core.widgets.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45669a[androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45669a[androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45669a[androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0360b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f45757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f45758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f45759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f45760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f45762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f45763g;

        c(ConstraintLayout constraintLayout) {
            this.f45757a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            return View.MeasureSpec.getMode(i11) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i12 == View.MeasureSpec.getSize(i11);
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0360b
        public final void a() {
            int childCount = this.f45757a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f45757a.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).b(this.f45757a);
                }
            }
            int size = this.f45757a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f45757a.mConstraintHelpers.get(i11)).G(this.f45757a);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:111:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:112:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:114:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:115:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:122:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:128:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:134:0x01fb  */
        /* JADX WARN: Code duplicated, block: B:139:0x0206  */
        /* JADX WARN: Code duplicated, block: B:142:0x020b  */
        /* JADX WARN: Code duplicated, block: B:154:0x0232  */
        /* JADX WARN: Code duplicated, block: B:156:0x0236  */
        /* JADX WARN: Code duplicated, block: B:159:0x0246  */
        /* JADX WARN: Code duplicated, block: B:162:0x025c  */
        /* JADX WARN: Code duplicated, block: B:164:0x0263  */
        /* JADX WARN: Code duplicated, block: B:167:0x0269  */
        /* JADX WARN: Code duplicated, block: B:170:0x0271  */
        /* JADX WARN: Code duplicated, block: B:172:0x0278  */
        /* JADX WARN: Code duplicated, block: B:175:0x027e  */
        /* JADX WARN: Code duplicated, block: B:178:0x0291  */
        /* JADX WARN: Code duplicated, block: B:180:0x0295 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:182:0x029e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:183:0x02a0 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:186:0x02aa A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:189:0x02af  */
        /* JADX WARN: Code duplicated, block: B:191:0x02b3  */
        /* JADX WARN: Code duplicated, block: B:192:0x02b8  */
        /* JADX WARN: Code duplicated, block: B:194:0x02bc  */
        /* JADX WARN: Code duplicated, block: B:195:0x02c1  */
        /* JADX WARN: Code duplicated, block: B:198:0x02da  */
        /* JADX WARN: Code duplicated, block: B:199:0x02dc  */
        /* JADX WARN: Code duplicated, block: B:206:0x02e8  */
        /* JADX WARN: Code duplicated, block: B:209:0x02ef  */
        /* JADX WARN: Code duplicated, block: B:218:0x030e  */
        /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:55:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:61:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:62:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:70:0x0104  */
        /* JADX WARN: Code duplicated, block: B:72:0x010e  */
        /* JADX WARN: Code duplicated, block: B:73:0x0110  */
        /* JADX WARN: Code duplicated, block: B:76:0x0117 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:83:0x0127  */
        /* JADX WARN: Code duplicated, block: B:84:0x0132  */
        /* JADX WARN: Code duplicated, block: B:85:0x0141  */
        /* JADX WARN: Code duplicated, block: B:86:0x014b  */
        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0360b
        @e.a({"WrongCall"})
        public final void b(androidx.constraintlayout.core.widgets.e eVar, androidx.constraintlayout.core.widgets.analyzer.b.a aVar) {
            long jNanoTime;
            int iMakeMeasureSpec;
            int childMeasureSpec;
            int i10;
            int iMakeMeasureSpec2;
            androidx.constraintlayout.core.widgets.f fVar;
            androidx.constraintlayout.core.widgets.e.b bVar;
            boolean z10;
            boolean z11;
            androidx.constraintlayout.core.widgets.e.b bVar2;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            b bVar3;
            int i11;
            int measuredWidth;
            int measuredHeight;
            int baseline;
            int i12;
            int measuredWidth2;
            int i13;
            int i14;
            int i15;
            int measuredHeight2;
            int i16;
            int i17;
            int iMakeMeasureSpec3;
            int iMakeMeasureSpec4;
            int i18;
            boolean z16;
            boolean z17;
            boolean z18;
            int i19;
            boolean z19;
            if (eVar == null) {
                return;
            }
            if (eVar.l0() == 8 && !eVar.C0()) {
                aVar.f44533e = 0;
                aVar.f44534f = 0;
                aVar.f44535g = 0;
                return;
            }
            if (eVar.U() == null) {
                return;
            }
            if (ConstraintLayout.this.mMetrics != null) {
                ConstraintLayout.this.mMetrics.N++;
                jNanoTime = System.nanoTime();
            } else {
                jNanoTime = 0;
            }
            androidx.constraintlayout.core.widgets.e.b bVar4 = aVar.f44529a;
            androidx.constraintlayout.core.widgets.e.b bVar5 = aVar.f44530b;
            int i20 = aVar.f44531c;
            int i21 = aVar.f44532d;
            int i22 = this.f45758b + this.f45759c;
            int i23 = this.f45760d;
            View view = (View) eVar.w();
            int[] iArr = a.f45669a;
            int i24 = iArr[bVar4.ordinal()];
            if (i24 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
            } else if (i24 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f45762f, i23, -2);
            } else {
                if (i24 != 3) {
                    if (i24 != 4) {
                        childMeasureSpec = 0;
                    } else {
                        childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f45762f, i23, -2);
                        boolean z20 = eVar.f44746w == 1;
                        int i25 = aVar.f44538j;
                        if (i25 == androidx.constraintlayout.core.widgets.analyzer.b.a.f44527l || i25 == androidx.constraintlayout.core.widgets.analyzer.b.a.f44528m) {
                            boolean z21 = view.getMeasuredHeight() == eVar.D();
                            if (aVar.f44538j == androidx.constraintlayout.core.widgets.analyzer.b.a.f44528m || !z20 || ((z20 && z21) || (view instanceof i) || eVar.G0())) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.m0(), 1073741824);
                            }
                        }
                    }
                    i10 = iArr[bVar5.ordinal()];
                    if (i10 != 1) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                    } else if (i10 != 2) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f45763g, i22, -2);
                    } else if (i10 != 3) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f45763g, i22 + eVar.k0(), -1);
                    } else if (i10 != 4) {
                        iMakeMeasureSpec2 = 0;
                    } else {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f45763g, i22, -2);
                        if (eVar.f44748x == 1) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        i19 = aVar.f44538j;
                        if (i19 != androidx.constraintlayout.core.widgets.analyzer.b.a.f44527l || i19 == androidx.constraintlayout.core.widgets.analyzer.b.a.f44528m) {
                            if (view.getMeasuredWidth() == eVar.m0()) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (aVar.f44538j != androidx.constraintlayout.core.widgets.analyzer.b.a.f44528m || !z18 || ((z18 && z19) || (view instanceof i) || eVar.H0())) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.D(), 1073741824);
                            }
                        }
                    }
                    fVar = (androidx.constraintlayout.core.widgets.f) eVar.U();
                    if (fVar == null && androidx.constraintlayout.core.widgets.k.b(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == eVar.m0() && view.getMeasuredWidth() < fVar.m0() && view.getMeasuredHeight() == eVar.D() && view.getMeasuredHeight() < fVar.D() && view.getBaseline() == eVar.t() && !eVar.F0() && d(eVar.J(), childMeasureSpec, eVar.m0()) && d(eVar.K(), iMakeMeasureSpec2, eVar.D())) {
                        aVar.f44533e = eVar.m0();
                        aVar.f44534f = eVar.D();
                        aVar.f44535g = eVar.t();
                        return;
                    }
                    bVar = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (bVar5 == bVar) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar2 = androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT;
                    if (bVar5 != bVar2 || bVar5 == androidx.constraintlayout.core.widgets.e.b.FIXED) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (bVar4 != bVar2 || bVar4 == androidx.constraintlayout.core.widgets.e.b.FIXED) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z10 || eVar.f44713f0 <= 0.0f) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (z11 || eVar.f44713f0 <= 0.0f) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (view == null) {
                        return;
                    }
                    bVar3 = (b) view.getLayoutParams();
                    i11 = aVar.f44538j;
                    boolean z22 = z13;
                    if (i11 == androidx.constraintlayout.core.widgets.analyzer.b.a.f44527l && i11 != androidx.constraintlayout.core.widgets.analyzer.b.a.f44528m && z10 && eVar.f44746w == 0 && z11 && eVar.f44748x == 0) {
                        measuredHeight2 = 0;
                        i18 = -1;
                        baseline = 0;
                        measuredWidth2 = 0;
                    } else {
                        if ((view instanceof n) || !(eVar instanceof androidx.constraintlayout.core.widgets.n)) {
                            view.measure(childMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            ((n) view).L((androidx.constraintlayout.core.widgets.n) eVar, childMeasureSpec, iMakeMeasureSpec2);
                        }
                        eVar.K1(childMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i12 = eVar.f44752z;
                        if (i12 > 0) {
                            measuredWidth2 = Math.max(i12, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        i13 = iMakeMeasureSpec2;
                        i14 = eVar.A;
                        if (i14 > 0) {
                            measuredWidth2 = Math.min(i14, measuredWidth2);
                        }
                        i15 = eVar.C;
                        if (i15 > 0) {
                            measuredHeight2 = Math.max(i15, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i16 = childMeasureSpec;
                        i17 = eVar.D;
                        if (i17 > 0) {
                            measuredHeight2 = Math.min(i17, measuredHeight2);
                        }
                        if (!androidx.constraintlayout.core.widgets.k.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                            if (!z14 && z12) {
                                measuredWidth2 = (int) ((measuredHeight2 * eVar.f44713f0) + 0.5f);
                            } else if (z15 && z22) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f44713f0) + 0.5f);
                            }
                        }
                        if (measuredWidth == measuredWidth2 || measuredHeight != measuredHeight2) {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            } else {
                                iMakeMeasureSpec3 = i16;
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            } else {
                                iMakeMeasureSpec4 = i13;
                            }
                            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                            eVar.K1(iMakeMeasureSpec3, iMakeMeasureSpec4);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                        i18 = -1;
                    }
                    if (baseline != i18) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (measuredWidth2 == aVar.f44531c || measuredHeight2 != aVar.f44532d) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    aVar.f44537i = z17;
                    if (bVar3.f45686g0) {
                        z16 = true;
                    }
                    if (z16 && baseline != -1 && eVar.t() != baseline) {
                        aVar.f44537i = true;
                    }
                    aVar.f44533e = measuredWidth2;
                    aVar.f44534f = measuredHeight2;
                    aVar.f44536h = z16;
                    aVar.f44535g = baseline;
                    if (ConstraintLayout.this.mMetrics != null) {
                        long jNanoTime2 = System.nanoTime();
                        ConstraintLayout.this.mMetrics.f43375a += jNanoTime2 - jNanoTime;
                    }
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f45762f, i23 + eVar.I(), -1);
            }
            childMeasureSpec = iMakeMeasureSpec;
            i10 = iArr[bVar5.ordinal()];
            if (i10 != 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
            } else if (i10 != 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f45763g, i22, -2);
            } else if (i10 != 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f45763g, i22 + eVar.k0(), -1);
            } else if (i10 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f45763g, i22, -2);
                if (eVar.f44748x == 1) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                i19 = aVar.f44538j;
                if (i19 != androidx.constraintlayout.core.widgets.analyzer.b.a.f44527l) {
                    if (view.getMeasuredWidth() == eVar.m0()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (aVar.f44538j != androidx.constraintlayout.core.widgets.analyzer.b.a.f44528m) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.D(), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.D(), 1073741824);
                    }
                } else {
                    if (view.getMeasuredWidth() == eVar.m0()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (aVar.f44538j != androidx.constraintlayout.core.widgets.analyzer.b.a.f44528m) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.D(), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.D(), 1073741824);
                    }
                }
            }
            fVar = (androidx.constraintlayout.core.widgets.f) eVar.U();
            if (fVar == null) {
            }
            bVar = androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bVar5 == bVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            bVar2 = androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT;
            if (bVar5 != bVar2) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (bVar4 != bVar2) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (z10) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (view == null) {
                return;
            }
            bVar3 = (b) view.getLayoutParams();
            i11 = aVar.f44538j;
            boolean z23 = z13;
            if (i11 == androidx.constraintlayout.core.widgets.analyzer.b.a.f44527l) {
                if (view instanceof n) {
                    view.measure(childMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(childMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.K1(childMeasureSpec, iMakeMeasureSpec2);
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i12 = eVar.f44752z;
                if (i12 > 0) {
                    measuredWidth2 = Math.max(i12, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i13 = iMakeMeasureSpec2;
                i14 = eVar.A;
                if (i14 > 0) {
                    measuredWidth2 = Math.min(i14, measuredWidth2);
                }
                i15 = eVar.C;
                if (i15 > 0) {
                    measuredHeight2 = Math.max(i15, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i16 = childMeasureSpec;
                i17 = eVar.D;
                if (i17 > 0) {
                    measuredHeight2 = Math.min(i17, measuredHeight2);
                }
                if (!androidx.constraintlayout.core.widgets.k.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (!z14) {
                        if (z15) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f44713f0) + 0.5f);
                        }
                    } else if (z15) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f44713f0) + 0.5f);
                    }
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = i16;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = i13;
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    eVar.K1(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = i16;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = i13;
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    eVar.K1(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i18 = -1;
            } else {
                if (view instanceof n) {
                    view.measure(childMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(childMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.K1(childMeasureSpec, iMakeMeasureSpec2);
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i12 = eVar.f44752z;
                if (i12 > 0) {
                    measuredWidth2 = Math.max(i12, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i13 = iMakeMeasureSpec2;
                i14 = eVar.A;
                if (i14 > 0) {
                    measuredWidth2 = Math.min(i14, measuredWidth2);
                }
                i15 = eVar.C;
                if (i15 > 0) {
                    measuredHeight2 = Math.max(i15, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i16 = childMeasureSpec;
                i17 = eVar.D;
                if (i17 > 0) {
                    measuredHeight2 = Math.min(i17, measuredHeight2);
                }
                if (!androidx.constraintlayout.core.widgets.k.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (!z14) {
                        if (z15) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f44713f0) + 0.5f);
                        }
                    } else if (z15) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f44713f0) + 0.5f);
                    }
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = i16;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = i13;
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    eVar.K1(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = i16;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = i13;
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    eVar.K1(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i18 = -1;
            }
            if (baseline != i18) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (measuredWidth2 == aVar.f44531c) {
                z17 = true;
            } else {
                z17 = true;
            }
            aVar.f44537i = z17;
            if (bVar3.f45686g0) {
                z16 = true;
            }
            if (z16) {
                aVar.f44537i = true;
            }
            aVar.f44533e = measuredWidth2;
            aVar.f44534f = measuredHeight2;
            aVar.f44536h = z16;
            aVar.f44535g = baseline;
            if (ConstraintLayout.this.mMetrics != null) {
                long jNanoTime3 = System.nanoTime();
                ConstraintLayout.this.mMetrics.f43375a += jNanoTime3 - jNanoTime;
            }
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f45758b = i12;
            this.f45759c = i13;
            this.f45760d = i14;
            this.f45761e = i15;
            this.f45762f = i10;
            this.f45763g = i11;
        }
    }

    public interface d {
        boolean a(int i10, int i11, int i12, View view, b bVar);
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        n(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static l getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new l();
        }
        return sSharedValues;
    }

    private androidx.constraintlayout.core.widgets.e k(int i10) {
        if (i10 == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f45716v0;
    }

    private void n(AttributeSet attributeSet, int i10, int i11) {
        this.mLayoutWidget.i1(this);
        this.mLayoutWidget.V2(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.H1, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == j.c.Y1) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == j.c.Z1) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == j.c.W1) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == j.c.X1) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == j.c.R3) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == j.c.M2) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == j.c.f46621q2) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        f fVar = new f();
                        this.mConstraintSet = fVar;
                        fVar.y0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.W2(this.mOptimizationLevel);
    }

    private void p() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        int i10 = 4 << 0;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void r() {
        ConstraintLayout constraintLayout;
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            androidx.constraintlayout.core.widgets.e viewWidget = getViewWidget(getChildAt(i10));
            if (viewWidget != null) {
                viewWidget.R0();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    k(childAt.getId()).k1(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof g)) {
                    this.mConstraintSet = ((g) childAt2).getConstraintSet();
                }
            }
        }
        f fVar = this.mConstraintSet;
        if (fVar != null) {
            fVar.t(this, true);
        }
        this.mLayoutWidget.q2();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.mConstraintHelpers.get(i13).J(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof i) {
                ((i) childAt3).c(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        int i16 = 0;
        while (i16 < childCount) {
            View childAt5 = this.getChildAt(i16);
            androidx.constraintlayout.core.widgets.e viewWidget2 = this.getViewWidget(childAt5);
            if (viewWidget2 == null) {
                constraintLayout = this;
            } else {
                b bVar = (b) childAt5.getLayoutParams();
                this.mLayoutWidget.a(viewWidget2);
                constraintLayout = this;
                constraintLayout.applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, bVar, this.mTempMapIdToWidget);
            }
            i16++;
            this = constraintLayout;
        }
    }

    private void u(androidx.constraintlayout.core.widgets.e eVar, b bVar, SparseArray<androidx.constraintlayout.core.widgets.e> sparseArray, int i10, androidx.constraintlayout.core.widgets.d.a aVar) {
        View view = this.mChildrenByIds.get(i10);
        androidx.constraintlayout.core.widgets.e eVar2 = sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f45686g0 = true;
        androidx.constraintlayout.core.widgets.d.a aVar2 = androidx.constraintlayout.core.widgets.d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f45686g0 = true;
            bVar2.f45716v0.y1(true);
        }
        eVar.r(aVar2).b(eVar2.r(aVar), bVar.D, bVar.C, true);
        eVar.y1(true);
        eVar.r(androidx.constraintlayout.core.widgets.d.a.TOP).x();
        eVar.r(androidx.constraintlayout.core.widgets.d.a.BOTTOM).x();
    }

    private boolean v() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            r();
        }
        return z10;
    }

    public void addValueModifier(d dVar) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:75:0x0186  */
    /* JADX WARN: Code duplicated, block: B:78:0x018f  */
    public void applyConstraintsFromLayoutParams(boolean z10, View view, androidx.constraintlayout.core.widgets.e eVar, b bVar, SparseArray<androidx.constraintlayout.core.widgets.e> sparseArray) {
        androidx.constraintlayout.core.widgets.e eVar2;
        androidx.constraintlayout.core.widgets.e eVar3;
        androidx.constraintlayout.core.widgets.e eVar4;
        androidx.constraintlayout.core.widgets.e eVar5;
        b bVar2;
        androidx.constraintlayout.core.widgets.e eVar6;
        float f10;
        int i10;
        bVar.e();
        bVar.f45718w0 = false;
        eVar.c2(view.getVisibility());
        if (bVar.f45692j0) {
            eVar.I1(true);
            eVar.c2(8);
        }
        eVar.i1(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).D(eVar, this.mLayoutWidget.P2());
        }
        if (bVar.f45688h0) {
            androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) eVar;
            int i11 = bVar.f45710s0;
            int i12 = bVar.f45712t0;
            float f11 = bVar.f45714u0;
            if (f11 != -1.0f) {
                hVar.A2(f11);
                return;
            } else if (i11 != -1) {
                hVar.y2(i11);
                return;
            } else {
                if (i12 != -1) {
                    hVar.z2(i12);
                    return;
                }
                return;
            }
        }
        int i13 = bVar.f45696l0;
        int i14 = bVar.f45698m0;
        int i15 = bVar.f45700n0;
        int i16 = bVar.f45702o0;
        int i17 = bVar.f45704p0;
        int i18 = bVar.f45706q0;
        float f12 = bVar.f45708r0;
        int i19 = bVar.f45703p;
        if (i19 != -1) {
            androidx.constraintlayout.core.widgets.e eVar7 = sparseArray.get(i19);
            if (eVar7 != null) {
                eVar.m(eVar7, bVar.f45707r, bVar.f45705q);
            }
            eVar6 = eVar;
            bVar2 = bVar;
        } else {
            if (i13 != -1) {
                androidx.constraintlayout.core.widgets.e eVar8 = sparseArray.get(i13);
                if (eVar8 != null) {
                    androidx.constraintlayout.core.widgets.d.a aVar = androidx.constraintlayout.core.widgets.d.a.LEFT;
                    eVar.v0(aVar, eVar8, aVar, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
                }
            } else if (i14 != -1 && (eVar2 = sparseArray.get(i14)) != null) {
                eVar.v0(androidx.constraintlayout.core.widgets.d.a.LEFT, eVar2, androidx.constraintlayout.core.widgets.d.a.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
            }
            if (i15 != -1) {
                androidx.constraintlayout.core.widgets.e eVar9 = sparseArray.get(i15);
                if (eVar9 != null) {
                    eVar.v0(androidx.constraintlayout.core.widgets.d.a.RIGHT, eVar9, androidx.constraintlayout.core.widgets.d.a.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
                }
            } else if (i16 != -1 && (eVar3 = sparseArray.get(i16)) != null) {
                androidx.constraintlayout.core.widgets.d.a aVar2 = androidx.constraintlayout.core.widgets.d.a.RIGHT;
                eVar.v0(aVar2, eVar3, aVar2, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
            }
            int i20 = bVar.f45689i;
            if (i20 != -1) {
                androidx.constraintlayout.core.widgets.e eVar10 = sparseArray.get(i20);
                if (eVar10 != null) {
                    androidx.constraintlayout.core.widgets.d.a aVar3 = androidx.constraintlayout.core.widgets.d.a.TOP;
                    eVar.v0(aVar3, eVar10, aVar3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f45719x);
                }
            } else {
                int i21 = bVar.f45691j;
                if (i21 != -1 && (eVar4 = sparseArray.get(i21)) != null) {
                    eVar.v0(androidx.constraintlayout.core.widgets.d.a.TOP, eVar4, androidx.constraintlayout.core.widgets.d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f45719x);
                }
            }
            int i22 = bVar.f45693k;
            if (i22 != -1) {
                androidx.constraintlayout.core.widgets.e eVar11 = sparseArray.get(i22);
                if (eVar11 != null) {
                    eVar.v0(androidx.constraintlayout.core.widgets.d.a.BOTTOM, eVar11, androidx.constraintlayout.core.widgets.d.a.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f45721z);
                }
            } else {
                int i23 = bVar.f45695l;
                if (i23 != -1 && (eVar5 = sparseArray.get(i23)) != null) {
                    androidx.constraintlayout.core.widgets.d.a aVar4 = androidx.constraintlayout.core.widgets.d.a.BOTTOM;
                    eVar.v0(aVar4, eVar5, aVar4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f45721z);
                }
            }
            int i24 = bVar.f45697m;
            if (i24 != -1) {
                bVar2 = bVar;
                u(eVar, bVar2, sparseArray, i24, androidx.constraintlayout.core.widgets.d.a.BASELINE);
            } else {
                bVar2 = bVar;
                int i25 = bVar2.f45699n;
                if (i25 != -1) {
                    u(eVar, bVar2, sparseArray, i25, androidx.constraintlayout.core.widgets.d.a.TOP);
                } else {
                    int i26 = bVar2.f45701o;
                    if (i26 != -1) {
                        u(eVar, bVar2, sparseArray, i26, androidx.constraintlayout.core.widgets.d.a.BOTTOM);
                        eVar6 = eVar;
                    }
                    if (f12 >= 0.0f) {
                        eVar6.B1(f12);
                    }
                    f10 = bVar2.H;
                    if (f10 >= 0.0f) {
                        eVar6.W1(f10);
                    }
                }
            }
            eVar6 = eVar;
            if (f12 >= 0.0f) {
                eVar6.B1(f12);
            }
            f10 = bVar2.H;
            if (f10 >= 0.0f) {
                eVar6.W1(f10);
            }
        }
        if (z10 && ((i10 = bVar2.X) != -1 || bVar2.Y != -1)) {
            eVar6.S1(i10, bVar2.Y);
        }
        if (bVar2.f45682e0) {
            eVar6.E1(androidx.constraintlayout.core.widgets.e.b.FIXED);
            eVar6.d2(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                eVar6.E1(androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
            if (bVar2.f45674a0) {
                eVar6.E1(androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.E1(androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT);
            }
            eVar6.r(androidx.constraintlayout.core.widgets.d.a.LEFT).f44663g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            eVar6.r(androidx.constraintlayout.core.widgets.d.a.RIGHT).f44663g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
        } else {
            eVar6.E1(androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT);
            eVar6.d2(0);
        }
        if (bVar2.f45684f0) {
            eVar6.Z1(androidx.constraintlayout.core.widgets.e.b.FIXED);
            eVar6.z1(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                eVar6.Z1(androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
            if (bVar2.f45676b0) {
                eVar6.Z1(androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.Z1(androidx.constraintlayout.core.widgets.e.b.MATCH_PARENT);
            }
            eVar6.r(androidx.constraintlayout.core.widgets.d.a.TOP).f44663g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            eVar6.r(androidx.constraintlayout.core.widgets.d.a.BOTTOM).f44663g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        } else {
            eVar6.Z1(androidx.constraintlayout.core.widgets.e.b.MATCH_CONSTRAINT);
            eVar6.z1(0);
        }
        eVar6.o1(bVar2.I);
        eVar6.G1(bVar2.L);
        eVar6.b2(bVar2.M);
        eVar6.C1(bVar2.N);
        eVar6.X1(bVar2.O);
        eVar6.f2(bVar2.f45680d0);
        eVar6.F1(bVar2.P, bVar2.R, bVar2.T, bVar2.V);
        eVar6.a2(bVar2.Q, bVar2.S, bVar2.U, bVar2.W);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.mConstraintHelpers.get(i10).H(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(l1.a.f316127c);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + i17;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    protected boolean dynamicUpdateConstraints(int i10, int i11) {
        boolean zA = false;
        if (this.mModifiers == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        for (d dVar : this.mModifiers) {
            Iterator<androidx.constraintlayout.core.widgets.e> it = this.mLayoutWidget.m2().iterator();
            while (it.hasNext()) {
                View view = (View) it.next().w();
                zA |= dVar.a(size, size2, view.getId(), view, (b) view.getLayoutParams());
            }
        }
        return zA;
    }

    public void fillMetrics(androidx.constraintlayout.core.f fVar) {
        this.mMetrics = fVar;
        this.mLayoutWidget.F2(fVar);
    }

    @Override // android.view.View
    public void forceLayout() {
        p();
        super.forceLayout();
    }

    public Object getDesignInformation(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.I2();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.f44730o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.f44730o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.f44730o = "parent";
            }
        }
        if (this.mLayoutWidget.y() == null) {
            androidx.constraintlayout.core.widgets.f fVar = this.mLayoutWidget;
            fVar.k1(fVar.f44730o);
            this.mLayoutWidget.y();
        }
        for (androidx.constraintlayout.core.widgets.e eVar : this.mLayoutWidget.m2()) {
            View view = (View) eVar.w();
            if (view != null) {
                if (eVar.f44730o == null && (id2 = view.getId()) != -1) {
                    eVar.f44730o = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar.y() == null) {
                    eVar.k1(eVar.f44730o);
                    eVar.y();
                }
            }
        }
        this.mLayoutWidget.b0(sb2);
        return sb2.toString();
    }

    public View getViewById(int i10) {
        return this.mChildrenByIds.get(i10);
    }

    public final androidx.constraintlayout.core.widgets.e getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f45716v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f45716v0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i10) {
        if (i10 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i10);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        androidx.constraintlayout.core.f fVar = this.mMetrics;
        if (fVar != null) {
            fVar.M++;
        }
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            androidx.constraintlayout.core.widgets.e eVar = bVar.f45716v0;
            if ((childAt.getVisibility() != 8 || bVar.f45688h0 || bVar.f45690i0 || bVar.f45694k0 || zIsInEditMode) && !bVar.f45692j0) {
                int iO0 = eVar.o0();
                int iP0 = eVar.p0();
                int iM0 = eVar.m0() + iO0;
                int iD = eVar.D() + iP0;
                childAt.layout(iO0, iP0, iM0, iD);
                if ((childAt instanceof i) && (content = ((i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iO0, iP0, iM0, iD);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.mConstraintHelpers.get(i15).F(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        long jNanoTime;
        if (this.mMetrics != null) {
            jNanoTime = System.nanoTime();
            this.mMetrics.P = getChildCount();
            this.mMetrics.Q++;
        } else {
            jNanoTime = 0;
        }
        boolean zDynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i10, i11);
        this.mDirtyHierarchy = zDynamicUpdateConstraints;
        if (!zDynamicUpdateConstraints) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (getChildAt(i12).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = i10;
        this.mOnMeasureHeightMeasureSpec = i11;
        this.mLayoutWidget.Z2(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (v()) {
                this.mLayoutWidget.b3();
            }
        }
        this.mLayoutWidget.F2(this.mMetrics);
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i10, i11);
        resolveMeasuredDimension(i10, i11, this.mLayoutWidget.m0(), this.mLayoutWidget.D(), this.mLayoutWidget.Q2(), this.mLayoutWidget.O2());
        androidx.constraintlayout.core.f fVar = this.mMetrics;
        if (fVar != null) {
            fVar.O += System.nanoTime() - jNanoTime;
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        androidx.constraintlayout.core.widgets.e viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof androidx.constraintlayout.core.widgets.h)) {
            b bVar = (b) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.h hVar = new androidx.constraintlayout.core.widgets.h();
            bVar.f45716v0 = hVar;
            bVar.f45688h0 = true;
            hVar.D2(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.K();
            ((b) view.getLayoutParams()).f45690i0 = true;
            if (!this.mConstraintHelpers.contains(bVar2)) {
                this.mConstraintHelpers.add(bVar2);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.p2(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    protected void parseLayoutDescription(int i10) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i10);
    }

    void removeValueModifier(d dVar) {
        if (dVar == null) {
            return;
        }
        this.mModifiers.remove(dVar);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        p();
        super.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resolveMeasuredDimension(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.mMeasurer;
        int i14 = cVar.f45761e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f45760d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resolveSystem(androidx.constraintlayout.core.widgets.f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (isRtl()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            setSelfDimensionBehaviour(fVar, mode, i15, mode2, i16);
            fVar.R2(i10, mode, i15, mode2, i16, this.mLastMeasureWidth, this.mLastMeasureHeight, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i17 = size - paddingWidth;
        int i18 = size2 - i14;
        setSelfDimensionBehaviour(fVar, mode, i17, mode2, i18);
        fVar.R2(i10, mode, i17, mode2, i18, this.mLastMeasureWidth, this.mLastMeasureHeight, i13, iMax);
    }

    public void setConstraintSet(f fVar) {
        this.mConstraintSet = fVar;
    }

    public void setDesignInformation(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(strSubstring, num);
        }
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.mChildrenByIds.remove(getId());
        super.setId(i10);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(h hVar) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.d(hVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.mOptimizationLevel = i10;
        this.mLayoutWidget.W2(i10);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047 A[PHI: r2
      0x0047: PHI (r2v4 androidx.constraintlayout.core.widgets.e$b) = (r2v3 androidx.constraintlayout.core.widgets.e$b), (r2v0 androidx.constraintlayout.core.widgets.e$b) binds: [B:21:0x0055, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    protected void setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.f fVar, int i10, int i11, int i12, int i13) {
        androidx.constraintlayout.core.widgets.e.b bVar;
        c cVar = this.mMeasurer;
        int i14 = cVar.f45761e;
        int i15 = cVar.f45760d;
        androidx.constraintlayout.core.widgets.e.b bVar2 = androidx.constraintlayout.core.widgets.e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.mMinWidth);
            }
        } else if (i10 == 0) {
            bVar = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
            i11 = childCount == 0 ? Math.max(0, this.mMinWidth) : 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
        } else {
            i11 = Math.min(this.mMaxWidth - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.mMinHeight);
            }
        } else if (i12 == 0) {
            bVar2 = androidx.constraintlayout.core.widgets.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.mMinHeight);
            } else {
                i13 = 0;
            }
        } else if (i12 != 1073741824) {
            i13 = 0;
        } else {
            i13 = Math.min(this.mMaxHeight - i14, i13);
        }
        if (i11 != fVar.m0() || i13 != fVar.D()) {
            fVar.N2();
        }
        fVar.g2(0);
        fVar.h2(0);
        fVar.N1(this.mMaxWidth - i15);
        fVar.M1(this.mMaxHeight - i14);
        fVar.Q1(0);
        fVar.P1(0);
        fVar.E1(bVar);
        fVar.d2(i11);
        fVar.Z1(bVar2);
        fVar.z1(i13);
        fVar.Q1(this.mMinWidth - i15);
        fVar.P1(this.mMinHeight - i14);
    }

    public void setState(int i10, int i11, int i12) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.e(i10, i11, i12);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        n(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        n(attributeSet, i10, 0);
    }

    @e.b(21)
    public ConstraintLayout(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        n(attributeSet, i10, i11);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public static final int A0 = Integer.MIN_VALUE;
        public static final int B0 = 0;
        public static final int C0 = 1;
        public static final int D0 = 1;
        public static final int E0 = 2;
        public static final int F0 = 3;
        public static final int G0 = 4;
        public static final int H0 = 5;
        public static final int I0 = 6;
        public static final int J0 = 7;
        public static final int K0 = 8;
        public static final int L0 = 1;
        public static final int M0 = 0;
        public static final int N0 = 2;
        public static final int O0 = 0;
        public static final int P0 = 1;
        public static final int Q0 = 2;
        public static final int R0 = 0;
        public static final int S0 = 1;
        public static final int T0 = 2;
        public static final int U0 = 3;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final int f45670x0 = 0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final int f45671y0 = 0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public static final int f45672z0 = -1;
        public int A;
        public int B;
        public int C;
        public int D;
        boolean E;
        boolean F;
        public float G;
        public float H;
        public String I;
        float J;
        int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45673a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f45674a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45675b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f45676b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f45677c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public String f45678c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f45679d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f45680d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45681e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        boolean f45682e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f45683f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        boolean f45684f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f45685g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        boolean f45686g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f45687h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        boolean f45688h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f45689i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        boolean f45690i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f45691j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        boolean f45692j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f45693k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        boolean f45694k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f45695l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f45696l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f45697m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        int f45698m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f45699n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        int f45700n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f45701o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        int f45702o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f45703p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        int f45704p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f45705q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        int f45706q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f45707r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        float f45708r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f45709s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        int f45710s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f45711t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        int f45712t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f45713u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        float f45714u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f45715v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        androidx.constraintlayout.core.widgets.e f45716v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f45717w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f45718w0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f45719x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f45720y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f45721z;

        private static class a {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 31;
            public static final int G = 32;
            public static final int H = 33;
            public static final int I = 34;
            public static final int J = 35;
            public static final int K = 36;
            public static final int L = 37;
            public static final int M = 38;
            public static final int N = 39;
            public static final int O = 40;
            public static final int P = 41;
            public static final int Q = 42;
            public static final int R = 43;
            public static final int S = 44;
            public static final int T = 45;
            public static final int U = 46;
            public static final int V = 47;
            public static final int W = 48;
            public static final int X = 49;
            public static final int Y = 50;
            public static final int Z = 51;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int f45722a = 0;

            /* JADX INFO: renamed from: a0, reason: collision with root package name */
            public static final int f45723a0 = 52;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f45724b = 1;

            /* JADX INFO: renamed from: b0, reason: collision with root package name */
            public static final int f45725b0 = 53;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f45726c = 2;

            /* JADX INFO: renamed from: c0, reason: collision with root package name */
            public static final int f45727c0 = 54;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f45728d = 3;

            /* JADX INFO: renamed from: d0, reason: collision with root package name */
            public static final int f45729d0 = 55;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f45730e = 4;

            /* JADX INFO: renamed from: e0, reason: collision with root package name */
            public static final int f45731e0 = 64;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f45732f = 5;

            /* JADX INFO: renamed from: f0, reason: collision with root package name */
            public static final int f45733f0 = 65;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f45734g = 6;

            /* JADX INFO: renamed from: g0, reason: collision with root package name */
            public static final int f45735g0 = 66;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f45736h = 7;

            /* JADX INFO: renamed from: h0, reason: collision with root package name */
            public static final int f45737h0 = 67;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f45738i = 8;

            /* JADX INFO: renamed from: i0, reason: collision with root package name */
            public static final SparseIntArray f45739i0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f45740j = 9;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f45741k = 10;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f45742l = 11;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f45743m = 12;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final int f45744n = 13;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final int f45745o = 14;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static final int f45746p = 15;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final int f45747q = 16;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final int f45748r = 17;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final int f45749s = 18;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final int f45750t = 19;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public static final int f45751u = 20;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final int f45752v = 21;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public static final int f45753w = 22;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static final int f45754x = 23;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public static final int f45755y = 24;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public static final int f45756z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f45739i0 = sparseIntArray;
                sparseIntArray.append(j.c.C3, 64);
                sparseIntArray.append(j.c.f46436f3, 65);
                sparseIntArray.append(j.c.f46588o3, 8);
                sparseIntArray.append(j.c.f46605p3, 9);
                sparseIntArray.append(j.c.f46639r3, 10);
                sparseIntArray.append(j.c.f46656s3, 11);
                sparseIntArray.append(j.c.f46758y3, 12);
                sparseIntArray.append(j.c.f46741x3, 13);
                sparseIntArray.append(j.c.V2, 14);
                sparseIntArray.append(j.c.U2, 15);
                sparseIntArray.append(j.c.Q2, 16);
                sparseIntArray.append(j.c.S2, 52);
                sparseIntArray.append(j.c.R2, 53);
                sparseIntArray.append(j.c.W2, 2);
                sparseIntArray.append(j.c.Y2, 3);
                sparseIntArray.append(j.c.X2, 4);
                sparseIntArray.append(j.c.H3, 49);
                sparseIntArray.append(j.c.I3, 50);
                sparseIntArray.append(j.c.f46385c3, 5);
                sparseIntArray.append(j.c.f46402d3, 6);
                int i10 = 5 ^ 7;
                sparseIntArray.append(j.c.f46419e3, 7);
                sparseIntArray.append(j.c.L2, 67);
                sparseIntArray.append(j.c.I1, 1);
                sparseIntArray.append(j.c.f46673t3, 17);
                sparseIntArray.append(j.c.f46690u3, 18);
                sparseIntArray.append(j.c.f46368b3, 19);
                sparseIntArray.append(j.c.f46351a3, 20);
                sparseIntArray.append(j.c.M3, 21);
                sparseIntArray.append(j.c.P3, 22);
                sparseIntArray.append(j.c.N3, 23);
                sparseIntArray.append(j.c.K3, 24);
                sparseIntArray.append(j.c.O3, 25);
                sparseIntArray.append(j.c.L3, 26);
                sparseIntArray.append(j.c.J3, 55);
                sparseIntArray.append(j.c.Q3, 54);
                sparseIntArray.append(j.c.f46520k3, 29);
                sparseIntArray.append(j.c.f46775z3, 30);
                sparseIntArray.append(j.c.Z2, 44);
                sparseIntArray.append(j.c.f46554m3, 45);
                sparseIntArray.append(j.c.B3, 46);
                sparseIntArray.append(j.c.f46537l3, 47);
                sparseIntArray.append(j.c.A3, 48);
                sparseIntArray.append(j.c.O2, 27);
                sparseIntArray.append(j.c.N2, 28);
                sparseIntArray.append(j.c.D3, 31);
                sparseIntArray.append(j.c.f46453g3, 32);
                sparseIntArray.append(j.c.F3, 33);
                sparseIntArray.append(j.c.E3, 34);
                sparseIntArray.append(j.c.G3, 35);
                sparseIntArray.append(j.c.f46487i3, 36);
                sparseIntArray.append(j.c.f46470h3, 37);
                sparseIntArray.append(j.c.f46503j3, 38);
                sparseIntArray.append(j.c.f46571n3, 39);
                sparseIntArray.append(j.c.f46724w3, 40);
                sparseIntArray.append(j.c.f46622q3, 41);
                sparseIntArray.append(j.c.T2, 42);
                sparseIntArray.append(j.c.P2, 43);
                sparseIntArray.append(j.c.f46707v3, 51);
                sparseIntArray.append(j.c.S3, 66);
            }

            private a() {
            }
        }

        @e.a({"ClassVerificationFailure"})
        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f45673a = -1;
            this.f45675b = -1;
            this.f45677c = -1.0f;
            this.f45679d = true;
            this.f45681e = -1;
            this.f45683f = -1;
            this.f45685g = -1;
            this.f45687h = -1;
            this.f45689i = -1;
            this.f45691j = -1;
            this.f45693k = -1;
            this.f45695l = -1;
            this.f45697m = -1;
            this.f45699n = -1;
            this.f45701o = -1;
            this.f45703p = -1;
            this.f45705q = 0;
            int i10 = 2 | 0;
            this.f45707r = 0.0f;
            this.f45709s = -1;
            this.f45711t = -1;
            this.f45713u = -1;
            this.f45715v = -1;
            this.f45717w = Integer.MIN_VALUE;
            this.f45719x = Integer.MIN_VALUE;
            this.f45720y = Integer.MIN_VALUE;
            this.f45721z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f45674a0 = false;
            this.f45676b0 = false;
            this.f45678c0 = null;
            this.f45680d0 = 0;
            this.f45682e0 = true;
            this.f45684f0 = true;
            this.f45686g0 = false;
            this.f45688h0 = false;
            this.f45690i0 = false;
            this.f45692j0 = false;
            this.f45694k0 = false;
            this.f45696l0 = -1;
            this.f45698m0 = -1;
            this.f45700n0 = -1;
            this.f45702o0 = -1;
            this.f45704p0 = Integer.MIN_VALUE;
            this.f45706q0 = Integer.MIN_VALUE;
            this.f45708r0 = 0.5f;
            this.f45716v0 = new androidx.constraintlayout.core.widgets.e();
            this.f45718w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f45673a = bVar.f45673a;
                this.f45675b = bVar.f45675b;
                this.f45677c = bVar.f45677c;
                this.f45679d = bVar.f45679d;
                this.f45681e = bVar.f45681e;
                this.f45683f = bVar.f45683f;
                this.f45685g = bVar.f45685g;
                this.f45687h = bVar.f45687h;
                this.f45689i = bVar.f45689i;
                this.f45691j = bVar.f45691j;
                this.f45693k = bVar.f45693k;
                this.f45695l = bVar.f45695l;
                this.f45697m = bVar.f45697m;
                this.f45699n = bVar.f45699n;
                this.f45701o = bVar.f45701o;
                this.f45703p = bVar.f45703p;
                this.f45705q = bVar.f45705q;
                this.f45707r = bVar.f45707r;
                this.f45709s = bVar.f45709s;
                this.f45711t = bVar.f45711t;
                this.f45713u = bVar.f45713u;
                this.f45715v = bVar.f45715v;
                this.f45717w = bVar.f45717w;
                this.f45719x = bVar.f45719x;
                this.f45720y = bVar.f45720y;
                this.f45721z = bVar.f45721z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                this.J = bVar.J;
                this.K = bVar.K;
                this.L = bVar.L;
                this.M = bVar.M;
                this.N = bVar.N;
                this.O = bVar.O;
                this.f45674a0 = bVar.f45674a0;
                this.f45676b0 = bVar.f45676b0;
                this.P = bVar.P;
                this.Q = bVar.Q;
                this.R = bVar.R;
                this.T = bVar.T;
                this.S = bVar.S;
                this.U = bVar.U;
                this.V = bVar.V;
                this.W = bVar.W;
                this.X = bVar.X;
                this.Y = bVar.Y;
                this.Z = bVar.Z;
                this.f45682e0 = bVar.f45682e0;
                this.f45684f0 = bVar.f45684f0;
                this.f45686g0 = bVar.f45686g0;
                this.f45688h0 = bVar.f45688h0;
                this.f45696l0 = bVar.f45696l0;
                this.f45698m0 = bVar.f45698m0;
                this.f45700n0 = bVar.f45700n0;
                this.f45702o0 = bVar.f45702o0;
                this.f45704p0 = bVar.f45704p0;
                this.f45706q0 = bVar.f45706q0;
                this.f45708r0 = bVar.f45708r0;
                this.f45678c0 = bVar.f45678c0;
                this.f45680d0 = bVar.f45680d0;
                this.f45716v0 = bVar.f45716v0;
                this.E = bVar.E;
                this.F = bVar.F;
            }
        }

        public String a() {
            return this.f45678c0;
        }

        public androidx.constraintlayout.core.widgets.e b() {
            return this.f45716v0;
        }

        public void c() {
            androidx.constraintlayout.core.widgets.e eVar = this.f45716v0;
            if (eVar != null) {
                eVar.R0();
            }
        }

        public void d(String str) {
            this.f45716v0.k1(str);
        }

        public void e() {
            this.f45688h0 = false;
            this.f45682e0 = true;
            this.f45684f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            int i11 = 1 & (-2);
            if (i10 == -2 && this.f45674a0) {
                this.f45682e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i12 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i12 == -2 && this.f45676b0) {
                this.f45684f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f45682e0 = false;
                if (i10 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f45674a0 = true;
                }
            }
            if (i12 == 0 || i12 == -1) {
                this.f45684f0 = false;
                if (i12 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f45676b0 = true;
                }
            }
            if (this.f45677c == -1.0f && this.f45673a == -1 && this.f45675b == -1) {
                return;
            }
            this.f45688h0 = true;
            this.f45682e0 = true;
            this.f45684f0 = true;
            if (!(this.f45716v0 instanceof androidx.constraintlayout.core.widgets.h)) {
                this.f45716v0 = new androidx.constraintlayout.core.widgets.h();
            }
            ((androidx.constraintlayout.core.widgets.h) this.f45716v0).D2(this.Z);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0054  */
        /* JADX WARN: Code duplicated, block: B:20:0x005e  */
        /* JADX WARN: Code duplicated, block: B:23:0x0066  */
        /* JADX WARN: Code duplicated, block: B:26:0x006c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0073  */
        /* JADX WARN: Code duplicated, block: B:38:0x008a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0095 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0097  */
        /* JADX WARN: Code duplicated, block: B:41:0x009e  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z10 = false;
            boolean z11 = 1 == getLayoutDirection();
            this.f45700n0 = -1;
            this.f45702o0 = -1;
            this.f45696l0 = -1;
            this.f45698m0 = -1;
            this.f45704p0 = this.f45717w;
            this.f45706q0 = this.f45720y;
            float f10 = this.G;
            this.f45708r0 = f10;
            int i17 = this.f45673a;
            this.f45710s0 = i17;
            int i18 = this.f45675b;
            this.f45712t0 = i18;
            float f11 = this.f45677c;
            this.f45714u0 = f11;
            if (z11) {
                int i19 = this.f45709s;
                if (i19 != -1) {
                    this.f45700n0 = i19;
                } else {
                    int i20 = this.f45711t;
                    if (i20 != -1) {
                        this.f45702o0 = i20;
                    } else {
                        i11 = this.f45713u;
                        if (i11 != -1) {
                            this.f45698m0 = i11;
                            z10 = true;
                        }
                        i12 = this.f45715v;
                        if (i12 != -1) {
                            this.f45696l0 = i12;
                            z10 = true;
                        }
                        i13 = this.A;
                        if (i13 != Integer.MIN_VALUE) {
                            this.f45706q0 = i13;
                        }
                        i14 = this.B;
                        if (i14 != Integer.MIN_VALUE) {
                            this.f45704p0 = i14;
                        }
                        if (z10) {
                            this.f45708r0 = 1.0f - f10;
                        }
                        if (this.f45688h0 && this.Z == 1 && this.f45679d) {
                            if (f11 != -1.0f) {
                                this.f45714u0 = 1.0f - f11;
                                this.f45710s0 = -1;
                                this.f45712t0 = -1;
                            } else if (i17 != -1) {
                                this.f45712t0 = i17;
                                this.f45710s0 = -1;
                                this.f45714u0 = -1.0f;
                            } else if (i18 != -1) {
                                this.f45710s0 = i18;
                                this.f45712t0 = -1;
                                this.f45714u0 = -1.0f;
                            }
                        }
                    }
                }
                z10 = true;
                i11 = this.f45713u;
                if (i11 != -1) {
                    this.f45698m0 = i11;
                    z10 = true;
                }
                i12 = this.f45715v;
                if (i12 != -1) {
                    this.f45696l0 = i12;
                    z10 = true;
                }
                i13 = this.A;
                if (i13 != Integer.MIN_VALUE) {
                    this.f45706q0 = i13;
                }
                i14 = this.B;
                if (i14 != Integer.MIN_VALUE) {
                    this.f45704p0 = i14;
                }
                if (z10) {
                    this.f45708r0 = 1.0f - f10;
                }
                if (this.f45688h0) {
                    if (f11 != -1.0f) {
                        this.f45714u0 = 1.0f - f11;
                        this.f45710s0 = -1;
                        this.f45712t0 = -1;
                    } else if (i17 != -1) {
                        this.f45712t0 = i17;
                        this.f45710s0 = -1;
                        this.f45714u0 = -1.0f;
                    } else if (i18 != -1) {
                        this.f45710s0 = i18;
                        this.f45712t0 = -1;
                        this.f45714u0 = -1.0f;
                    }
                }
            } else {
                int i21 = this.f45709s;
                if (i21 != -1) {
                    this.f45698m0 = i21;
                }
                int i22 = this.f45711t;
                if (i22 != -1) {
                    this.f45696l0 = i22;
                }
                int i23 = this.f45713u;
                if (i23 != -1) {
                    this.f45700n0 = i23;
                }
                int i24 = this.f45715v;
                if (i24 != -1) {
                    this.f45702o0 = i24;
                }
                int i25 = this.A;
                if (i25 != Integer.MIN_VALUE) {
                    this.f45704p0 = i25;
                }
                int i26 = this.B;
                if (i26 != Integer.MIN_VALUE) {
                    this.f45706q0 = i26;
                }
            }
            if (this.f45713u == -1 && this.f45715v == -1 && this.f45711t == -1 && this.f45709s == -1) {
                int i27 = this.f45685g;
                if (i27 != -1) {
                    this.f45700n0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f45687h;
                    if (i28 != -1) {
                        this.f45702o0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f45681e;
                if (i29 != -1) {
                    this.f45696l0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                int i30 = this.f45683f;
                if (i30 != -1) {
                    this.f45698m0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f45673a = -1;
            this.f45675b = -1;
            this.f45677c = -1.0f;
            this.f45679d = true;
            this.f45681e = -1;
            this.f45683f = -1;
            this.f45685g = -1;
            this.f45687h = -1;
            this.f45689i = -1;
            this.f45691j = -1;
            this.f45693k = -1;
            this.f45695l = -1;
            this.f45697m = -1;
            this.f45699n = -1;
            this.f45701o = -1;
            this.f45703p = -1;
            this.f45705q = 0;
            int i10 = 0 << 0;
            this.f45707r = 0.0f;
            this.f45709s = -1;
            this.f45711t = -1;
            this.f45713u = -1;
            this.f45715v = -1;
            this.f45717w = Integer.MIN_VALUE;
            this.f45719x = Integer.MIN_VALUE;
            this.f45720y = Integer.MIN_VALUE;
            this.f45721z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f45674a0 = false;
            this.f45676b0 = false;
            this.f45678c0 = null;
            this.f45680d0 = 0;
            this.f45682e0 = true;
            this.f45684f0 = true;
            this.f45686g0 = false;
            this.f45688h0 = false;
            this.f45690i0 = false;
            this.f45692j0 = false;
            this.f45694k0 = false;
            this.f45696l0 = -1;
            this.f45698m0 = -1;
            this.f45700n0 = -1;
            this.f45702o0 = -1;
            this.f45704p0 = Integer.MIN_VALUE;
            this.f45706q0 = Integer.MIN_VALUE;
            this.f45708r0 = 0.5f;
            this.f45716v0 = new androidx.constraintlayout.core.widgets.e();
            this.f45718w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.H1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = a.f45739i0.get(index);
                switch (i12) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f45703p);
                        this.f45703p = resourceId;
                        if (resourceId == -1) {
                            this.f45703p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f45705q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f45705q);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f45707r) % 360.0f;
                        this.f45707r = f10;
                        if (f10 < 0.0f) {
                            this.f45707r = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f45673a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f45673a);
                        break;
                    case 6:
                        this.f45675b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f45675b);
                        break;
                    case 7:
                        this.f45677c = typedArrayObtainStyledAttributes.getFloat(index, this.f45677c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45681e);
                        this.f45681e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f45681e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45683f);
                        this.f45683f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f45683f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45685g);
                        this.f45685g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f45685g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45687h);
                        this.f45687h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f45687h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45689i);
                        this.f45689i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f45689i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45691j);
                        this.f45691j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f45691j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45693k);
                        this.f45693k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f45693k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45695l);
                        this.f45695l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f45695l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45697m);
                        this.f45697m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f45697m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45709s);
                        this.f45709s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f45709s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45711t);
                        this.f45711t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f45711t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45713u);
                        this.f45713u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f45713u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45715v);
                        this.f45715v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f45715v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f45717w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f45717w);
                        break;
                    case 22:
                        this.f45719x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f45719x);
                        break;
                    case 23:
                        this.f45720y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f45720y);
                        break;
                    case 24:
                        this.f45721z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f45721z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.f45674a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f45674a0);
                        break;
                    case 28:
                        this.f45676b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f45676b0);
                        break;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        this.P = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.Q = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                f.F0(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f45678c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45699n);
                                this.f45699n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f45699n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45701o);
                                this.f45701o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f45701o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i12) {
                                    case 64:
                                        f.D0(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        f.D0(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f45680d0 = typedArrayObtainStyledAttributes.getInt(index, this.f45680d0);
                                        break;
                                    case 67:
                                        this.f45679d = typedArrayObtainStyledAttributes.getBoolean(index, this.f45679d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            e();
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f45673a = -1;
            this.f45675b = -1;
            this.f45677c = -1.0f;
            this.f45679d = true;
            this.f45681e = -1;
            this.f45683f = -1;
            this.f45685g = -1;
            this.f45687h = -1;
            this.f45689i = -1;
            this.f45691j = -1;
            this.f45693k = -1;
            this.f45695l = -1;
            this.f45697m = -1;
            this.f45699n = -1;
            this.f45701o = -1;
            this.f45703p = -1;
            this.f45705q = 0;
            this.f45707r = 0.0f;
            this.f45709s = -1;
            this.f45711t = -1;
            this.f45713u = -1;
            this.f45715v = -1;
            this.f45717w = Integer.MIN_VALUE;
            this.f45719x = Integer.MIN_VALUE;
            this.f45720y = Integer.MIN_VALUE;
            this.f45721z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f45674a0 = false;
            this.f45676b0 = false;
            this.f45678c0 = null;
            this.f45680d0 = 0;
            this.f45682e0 = true;
            this.f45684f0 = true;
            this.f45686g0 = false;
            this.f45688h0 = false;
            this.f45690i0 = false;
            this.f45692j0 = false;
            this.f45694k0 = false;
            this.f45696l0 = -1;
            this.f45698m0 = -1;
            this.f45700n0 = -1;
            this.f45702o0 = -1;
            this.f45704p0 = Integer.MIN_VALUE;
            this.f45706q0 = Integer.MIN_VALUE;
            this.f45708r0 = 0.5f;
            this.f45716v0 = new androidx.constraintlayout.core.widgets.e();
            this.f45718w0 = false;
        }
    }
}
