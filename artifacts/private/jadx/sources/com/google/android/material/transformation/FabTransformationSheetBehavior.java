package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.i;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u1;
import com.google.android.material.animation.k;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private Map<View, Integer> f114477l;

    public FabTransformationSheetBehavior() {
    }

    private void q0(@NonNull View view, boolean z10) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f114477l = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z11) {
                    if (z10) {
                        this.f114477l.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        u1.Y1(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f114477l;
                        if (map != null && map.containsKey(childAt)) {
                            u1.Y1(childAt, this.f114477l.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z10) {
                return;
            }
            this.f114477l = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @i
    protected boolean R(@NonNull View view, @NonNull View view2, boolean z10, boolean z11) {
        q0(view2, z10);
        return super.R(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    protected FabTransformationBehavior.e o0(Context context, boolean z10) {
        int i10 = z10 ? r6.a.b.H : r6.a.b.G;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f114466a = com.google.android.material.animation.i.d(context, i10);
        eVar.f114467b = new k(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
