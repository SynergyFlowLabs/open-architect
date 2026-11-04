package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.d0;
import androidx.annotation.h;
import androidx.annotation.l1;
import androidx.core.view.accessibility.j;
import androidx.core.view.j0;
import androidx.core.view.u1;
import com.google.android.material.internal.g0;
import com.google.android.material.internal.p0;
import com.google.android.material.shape.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f111629k = "MButtonToggleGroup";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f111630l = r6.a.n.f361331nj;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c> f111631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f111632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashSet<d> f111633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Comparator<MaterialButton> f111634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer[] f111635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f111636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f111637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f111638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d0
    private final int f111639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Set<Integer> f111640j;

    class a implements Comparator<MaterialButton> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.m1(j.g.j(0, 1, MaterialButtonToggleGroup.this.k(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.android.material.shape.e f111643e = new com.google.android.material.shape.a(0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.google.android.material.shape.e f111644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.google.android.material.shape.e f111645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        com.google.android.material.shape.e f111646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        com.google.android.material.shape.e f111647d;

        c(com.google.android.material.shape.e eVar, com.google.android.material.shape.e eVar2, com.google.android.material.shape.e eVar3, com.google.android.material.shape.e eVar4) {
            this.f111644a = eVar;
            this.f111645b = eVar3;
            this.f111646c = eVar4;
            this.f111647d = eVar2;
        }

        public static c a(c cVar) {
            com.google.android.material.shape.e eVar = f111643e;
            return new c(eVar, cVar.f111647d, eVar, cVar.f111646c);
        }

        public static c b(c cVar, View view) {
            return p0.s(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            com.google.android.material.shape.e eVar = cVar.f111644a;
            com.google.android.material.shape.e eVar2 = cVar.f111647d;
            com.google.android.material.shape.e eVar3 = f111643e;
            return new c(eVar, eVar2, eVar3, eVar3);
        }

        public static c d(c cVar) {
            com.google.android.material.shape.e eVar = f111643e;
            return new c(eVar, eVar, cVar.f111645b, cVar.f111646c);
        }

        public static c e(c cVar, View view) {
            return p0.s(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            com.google.android.material.shape.e eVar = cVar.f111644a;
            com.google.android.material.shape.e eVar2 = f111643e;
            return new c(eVar, eVar2, cVar.f111645b, eVar2);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, @d0 int i10, boolean z10);
    }

    private class e implements MaterialButton.c {
        private e() {
        }

        @Override // com.google.android.material.button.MaterialButton.c
        public void a(@NonNull MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButtonJ = j(i10);
            int iMin = Math.min(materialButtonJ.getStrokeWidth(), j(i10 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonJ);
            if (getOrientation() == 0) {
                j0.g(layoutParamsD, 0);
                j0.h(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                j0.h(layoutParamsD, 0);
            }
            materialButtonJ.setLayoutParams(layoutParamsD);
        }
        r(firstVisibleChildIndex);
    }

    @NonNull
    private LinearLayout.LayoutParams d(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void f(@d0 int i10, boolean z10) {
        if (i10 == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.f111640j);
        if (!z10 || hashSet.contains(Integer.valueOf(i10))) {
            if (!z10 && hashSet.contains(Integer.valueOf(i10))) {
                if (!this.f111638h || hashSet.size() > 1) {
                    hashSet.remove(Integer.valueOf(i10));
                }
            }
        }
        if (this.f111637g && !hashSet.isEmpty()) {
            hashSet.clear();
        }
        hashSet.add(Integer.valueOf(i10));
        v(hashSet);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (m(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && m(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void i(@d0 int i10, boolean z10) {
        Iterator<d> it = this.f111633c.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10, z10);
        }
    }

    private MaterialButton j(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k(@androidx.annotation.p0 View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && m(i11)) {
                i10++;
            }
        }
        return -1;
    }

    @androidx.annotation.p0
    private c l(int i10, int i11, int i12) {
        c cVar = this.f111631a.get(i10);
        if (i11 == i12) {
            return cVar;
        }
        boolean z10 = getOrientation() == 0;
        if (i10 == i11) {
            return z10 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i10 == i12) {
            return z10 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    private boolean m(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void r(int i10) {
        if (getChildCount() != 0 && i10 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) j(i10).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
            } else {
                j0.g(layoutParams, 0);
                j0.h(layoutParams, 0);
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
            }
        }
    }

    private void s(@d0 int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f111636f = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f111636f = false;
        }
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(u1.D());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f111632b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private static void u(p.b bVar, @androidx.annotation.p0 c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.L(cVar.f111644a).y(cVar.f111647d).Q(cVar.f111645b).D(cVar.f111646c);
        }
    }

    private void v(Set<Integer> set) {
        Set<Integer> set2 = this.f111640j;
        this.f111640j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = j(i10).getId();
            s(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                i(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    private void w() {
        TreeMap treeMap = new TreeMap(this.f111634d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(j(i10), Integer.valueOf(i10));
        }
        this.f111635e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void y() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            j(i10).setA11yClassName((this.f111637g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i10, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            f(materialButton.getId(), materialButton.isChecked());
            p shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f111631a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
            materialButton.setEnabled(isEnabled());
            u1.G1(materialButton, new b());
        }
    }

    public void b(@NonNull d dVar) {
        this.f111633c.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NonNull Canvas canvas) {
        w();
        super.dispatchDraw(canvas);
    }

    public void e(@d0 int i10) {
        f(i10, true);
    }

    public void g() {
        v(new HashSet());
    }

    @d0
    public int getCheckedButtonId() {
        if (!this.f111637g || this.f111640j.isEmpty()) {
            return -1;
        }
        return this.f111640j.iterator().next().intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = j(i10).getId();
            if (this.f111640j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f111635e;
        return (numArr == null || i11 >= numArr.length) ? i11 : numArr[i11].intValue();
    }

    public void h() {
        this.f111633c.clear();
    }

    public boolean n() {
        return this.f111638h;
    }

    public boolean o() {
        return this.f111637g;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f111639i;
        if (i10 != -1) {
            v(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j.r2(accessibilityNodeInfo).l1(j.f.h(1, getVisibleButtonCount(), false, o() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        x();
        c();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f111631a.remove(iIndexOfChild);
        }
        x();
        c();
    }

    void p(@NonNull MaterialButton materialButton, boolean z10) {
        if (this.f111636f) {
            return;
        }
        f(materialButton.getId(), z10);
    }

    public void q(@NonNull d dVar) {
        this.f111633c.remove(dVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            j(i10).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f111638h = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f111637g != z10) {
            this.f111637g = z10;
            g();
        }
        y();
    }

    public void t(@d0 int i10) {
        f(i10, false);
    }

    @l1
    void x() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButtonJ = j(i10);
            if (materialButtonJ.getVisibility() != 8) {
                p.b bVarV = materialButtonJ.getShapeAppearanceModel().v();
                u(bVarV, l(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonJ.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359428nc);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        int i11 = f111630l;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f111631a = new ArrayList();
        this.f111632b = new e(this, null);
        this.f111633c = new LinkedHashSet<>();
        this.f111634d = new a();
        this.f111636f = false;
        this.f111640j = new HashSet();
        TypedArray typedArrayK = g0.k(getContext(), attributeSet, r6.a.o.Dm, i10, i11, new int[0]);
        setSingleSelection(typedArrayK.getBoolean(r6.a.o.Hm, false));
        this.f111639i = typedArrayK.getResourceId(r6.a.o.Fm, -1);
        this.f111638h = typedArrayK.getBoolean(r6.a.o.Gm, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayK.getBoolean(r6.a.o.Em, true));
        typedArrayK.recycle();
        u1.Y1(this, 1);
    }

    public void setSingleSelection(@h int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
