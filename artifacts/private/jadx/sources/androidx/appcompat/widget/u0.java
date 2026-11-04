package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class u0 extends s0 implements t0 {
    private static final String A3 = "MenuPopupWindow";
    private static Method B3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private t0 f11606z3;

    @androidx.annotation.w0(23)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @androidx.annotation.u
        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    @androidx.annotation.w0(29)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public static class c extends n0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final int f11607s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final int f11608t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private t0 f11609v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private MenuItem f11610w;

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f11607s = 21;
                this.f11608t = 22;
            } else {
                this.f11607s = 22;
                this.f11608t = 21;
            }
        }

        @Override // androidx.appcompat.widget.n0
        public /* bridge */ /* synthetic */ int d(int i10, boolean z10) {
            return super.d(i10, z10);
        }

        @Override // androidx.appcompat.widget.n0
        public /* bridge */ /* synthetic */ int e(int i10, int i11, int i12, int i13, int i14) {
            return super.e(i10, i11, i12, i13, i14);
        }

        @Override // androidx.appcompat.widget.n0
        public /* bridge */ /* synthetic */ boolean f(MotionEvent motionEvent, int i10) {
            return super.f(motionEvent, i10);
        }

        @Override // androidx.appcompat.widget.n0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.n0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.n0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.n0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.n0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.f fVar;
            int headersCount;
            int iPointToPosition;
            int i10;
            if (this.f11609v != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    fVar = (androidx.appcompat.view.menu.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (androidx.appcompat.view.menu.f) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.j item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= fVar.getCount()) ? null : fVar.getItem(i10);
                MenuItem menuItem = this.f11610w;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.g gVarB = fVar.b();
                    if (menuItem != null) {
                        this.f11609v.j(gVarB, menuItem);
                    }
                    this.f11610w = item;
                    if (item != null) {
                        this.f11609v.e(gVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f11607s) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f11608t) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.f) adapter).b().f(false);
            return true;
        }

        @Override // androidx.appcompat.widget.n0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void p() {
            setSelection(-1);
        }

        public void setHoverListener(t0 t0Var) {
            this.f11609v = t0Var;
        }

        @Override // androidx.appcompat.widget.n0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    public u0(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.appcompat.widget.t0
    public void e(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull MenuItem menuItem) {
        t0 t0Var = this.f11606z3;
        if (t0Var != null) {
            t0Var.e(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.t0
    public void j(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull MenuItem menuItem) {
        t0 t0Var = this.f11606z3;
        if (t0Var != null) {
            t0Var.j(gVar, menuItem);
        }
    }

    public void p0(Object obj) {
        a.a(this.f11555l3, (Transition) obj);
    }

    public void q0(Object obj) {
        a.b(this.f11555l3, (Transition) obj);
    }

    public void r0(t0 t0Var) {
        this.f11606z3 = t0Var;
    }

    public void s0(boolean z10) {
        b.a(this.f11555l3, z10);
    }

    @Override // androidx.appcompat.widget.s0
    @NonNull
    n0 u(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
