package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"ViewConstructor"})
class p extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private ViewGroup f75735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f75736b;

    @androidx.annotation.w0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static float a(View view) {
            return view.getZ();
        }
    }

    p(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f75735a = viewGroup;
        viewGroup.setTag(a0.a.f75494b, this);
        this.f75735a.getOverlay().add(this);
        this.f75736b = true;
    }

    static p b(@NonNull ViewGroup viewGroup) {
        return (p) viewGroup.getTag(a0.a.f75494b);
    }

    private int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i10 = 0;
        while (i10 <= childCount) {
            int i11 = (i10 + childCount) / 2;
            d(((r) getChildAt(i11)).f75757c, arrayList2);
            if (f(arrayList, arrayList2)) {
                i10 = i11 + 1;
            } else {
                childCount = i11 - 1;
            }
            arrayList2.clear();
        }
        return i10;
    }

    private static void d(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (a.a(view) != a.a(view2)) {
            return a.a(view) > a.a(view2);
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(y0.a(viewGroup, i10));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                return true;
            }
        }
        return true;
    }

    private static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i10 = 1; i10 < iMin; i10++) {
            View view = arrayList.get(i10);
            View view2 = arrayList2.get(i10);
            if (view != view2) {
                return e(view, view2);
            }
        }
        return arrayList2.size() == iMin;
    }

    void a(r rVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        d(rVar.f75757c, arrayList);
        int iC = c(arrayList);
        if (iC < 0 || iC >= getChildCount()) {
            addView(rVar);
        } else {
            addView(rVar, iC);
        }
    }

    void g() {
        if (!this.f75736b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        this.f75735a.getOverlay().remove(this);
        this.f75735a.getOverlay().add(this);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f75736b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f75735a.setTag(a0.a.f75494b, null);
            this.f75735a.getOverlay().remove(this);
            this.f75736b = false;
        }
    }
}
