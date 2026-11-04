package androidx.compose.ui.focus;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    @NotNull
    public static final n0.j a(@NotNull View view, @NotNull View view2) {
        m.a aVar = m.f37432a;
        view.getLocationInWindow(aVar.a());
        int i10 = aVar.a()[0];
        int i11 = aVar.a()[1];
        view2.getLocationInWindow(aVar.a());
        float f10 = i10 - aVar.a()[0];
        float f11 = i11 - aVar.a()[1];
        return new n0.j(f10, f11, view.getWidth() + f10, view.getHeight() + f11);
    }

    public static final boolean b(@NotNull View view, @Nullable Integer num, @Nullable Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            int i10 = 2 ^ 1;
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    @Nullable
    public static final Integer c(int i10) {
        f.a aVar = f.f37408b;
        if (f.l(i10, aVar.h())) {
            return 33;
        }
        if (f.l(i10, aVar.a())) {
            return 130;
        }
        if (f.l(i10, aVar.d())) {
            return 17;
        }
        if (f.l(i10, aVar.g())) {
            return 66;
        }
        if (f.l(i10, aVar.e())) {
            return 2;
        }
        return f.l(i10, aVar.f()) ? 1 : null;
    }

    @Nullable
    public static final f d(int i10) {
        if (i10 == 1) {
            return f.i(f.f37408b.f());
        }
        if (i10 == 2) {
            return f.i(f.f37408b.e());
        }
        if (i10 == 17) {
            return f.i(f.f37408b.d());
        }
        if (i10 == 33) {
            return f.i(f.f37408b.h());
        }
        if (i10 == 66) {
            return f.i(f.f37408b.g());
        }
        if (i10 != 130) {
            return null;
        }
        return f.i(f.f37408b.a());
    }

    @Nullable
    public static final f e(@NotNull KeyEvent keyEvent) {
        long jA = androidx.compose.ui.input.key.e.a(keyEvent);
        androidx.compose.ui.input.key.b.a aVar = androidx.compose.ui.input.key.b.f38761b;
        if (androidx.compose.ui.input.key.b.E4(jA, aVar.a2())) {
            return f.i(f.f37408b.f());
        }
        if (androidx.compose.ui.input.key.b.E4(jA, aVar.Y1())) {
            return f.i(f.f37408b.e());
        }
        if (androidx.compose.ui.input.key.b.E4(jA, aVar.y3())) {
            return f.i(androidx.compose.ui.input.key.e.g(keyEvent) ? f.f37408b.f() : f.f37408b.e());
        }
        if (androidx.compose.ui.input.key.b.E4(jA, aVar.v0())) {
            return f.i(f.f37408b.g());
        }
        if (androidx.compose.ui.input.key.b.E4(jA, aVar.u0())) {
            return f.i(f.f37408b.d());
        }
        if (!androidx.compose.ui.input.key.b.E4(jA, aVar.w0()) && !androidx.compose.ui.input.key.b.E4(jA, aVar.D2())) {
            if (androidx.compose.ui.input.key.b.E4(jA, aVar.r0()) || androidx.compose.ui.input.key.b.E4(jA, aVar.C2())) {
                return f.i(f.f37408b.a());
            }
            if (androidx.compose.ui.input.key.b.E4(jA, aVar.q0()) || androidx.compose.ui.input.key.b.E4(jA, aVar.E0()) || androidx.compose.ui.input.key.b.E4(jA, aVar.s2())) {
                return f.i(f.f37408b.b());
            }
            if (androidx.compose.ui.input.key.b.E4(jA, aVar.l()) || androidx.compose.ui.input.key.b.E4(jA, aVar.H0())) {
                return f.i(f.f37408b.c());
            }
            return null;
        }
        return f.i(f.f37408b.h());
    }

    @Nullable
    public static final androidx.compose.ui.unit.w f(int i10) {
        if (i10 == 0) {
            return androidx.compose.ui.unit.w.Ltr;
        }
        if (i10 != 1) {
            return null;
        }
        return androidx.compose.ui.unit.w.Rtl;
    }
}
