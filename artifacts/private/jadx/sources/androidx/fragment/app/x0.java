package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.u1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"UnknownNullness"})
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public abstract class x0 {

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f52042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f52043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f52044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f52045e;

        a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f52041a = i10;
            this.f52042b = arrayList;
            this.f52043c = arrayList2;
            this.f52044d = arrayList3;
            this.f52045e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f52041a; i10++) {
                u1.C2((View) this.f52042b.get(i10), (String) this.f52043c.get(i10));
                u1.C2((View) this.f52044d.get(i10), (String) this.f52045e.get(i10));
            }
        }
    }

    protected static void f(List<View> list, View view) {
        int size = list.size();
        if (!i(list, view, size)) {
            if (u1.A0(view) != null) {
                list.add(view);
            }
            for (int i10 = size; i10 < list.size(); i10++) {
                View view2 = list.get(i10);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (!i(list, childAt, size) && u1.A0(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean i(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    void A(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String strA0 = u1.A0(view2);
            arrayList4.add(strA0);
            if (strA0 != null) {
                u1.C2(view2, null);
                String str = map.get(strA0);
                for (int i11 = 0; i11 < size; i11++) {
                    if (str.equals(arrayList3.get(i11))) {
                        u1.C2(arrayList2.get(i11), strA0);
                        break;
                    }
                }
            }
        }
        androidx.core.view.e1.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void B(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract void C(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 ArrayList<View> arrayList, @androidx.annotation.p0 ArrayList<View> arrayList2);

    public abstract Object D(@androidx.annotation.p0 Object obj);

    public abstract void a(@NonNull Object obj, @NonNull View view);

    public abstract void b(@NonNull Object obj, @NonNull ArrayList<View> arrayList);

    public void c(@NonNull Object obj) {
    }

    public void d(@NonNull Object obj, @NonNull Runnable runnable) {
    }

    public abstract void e(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 Object obj);

    public abstract boolean g(@NonNull Object obj);

    public abstract Object h(@androidx.annotation.p0 Object obj);

    @androidx.annotation.p0
    public Object j(@NonNull ViewGroup viewGroup, @NonNull Object obj) {
        return null;
    }

    protected void k(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public boolean m() {
        FragmentManager.b1(4);
        return false;
    }

    public boolean n(@NonNull Object obj) {
        return false;
    }

    public abstract Object o(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 Object obj3);

    public abstract Object p(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 Object obj3);

    ArrayList<String> q(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(u1.A0(view));
            u1.C2(view, null);
        }
        return arrayList2;
    }

    public abstract void r(@NonNull Object obj, @NonNull View view);

    public abstract void s(@NonNull Object obj, @e.a({"UnknownNullness"}) ArrayList<View> arrayList, @e.a({"UnknownNullness"}) ArrayList<View> arrayList2);

    public abstract void t(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract void u(@NonNull Object obj, @androidx.annotation.p0 Object obj2, @androidx.annotation.p0 ArrayList<View> arrayList, @androidx.annotation.p0 Object obj3, @androidx.annotation.p0 ArrayList<View> arrayList2, @androidx.annotation.p0 Object obj4, @androidx.annotation.p0 ArrayList<View> arrayList3);

    public void v(@NonNull Object obj, float f10) {
    }

    public abstract void w(@NonNull Object obj, @NonNull Rect rect);

    public abstract void x(@NonNull Object obj, @androidx.annotation.p0 View view);

    public void y(@NonNull Fragment fragment, @NonNull Object obj, @NonNull androidx.core.os.f fVar, @NonNull Runnable runnable) {
        z(fragment, obj, fVar, null, runnable);
    }

    public void z(@NonNull Fragment fragment, @NonNull Object obj, @NonNull androidx.core.os.f fVar, @androidx.annotation.p0 Runnable runnable, @NonNull Runnable runnable2) {
        runnable2.run();
    }
}
