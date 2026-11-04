package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ActionBarContainer f11157a;

    @androidx.annotation.w0(21)
    private static class a {
        private a() {
        }

        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public b(ActionBarContainer actionBarContainer) {
        this.f11157a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f11157a;
        if (actionBarContainer.f10785h) {
            Drawable drawable = actionBarContainer.f10784g;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        } else {
            Drawable drawable2 = actionBarContainer.f10782e;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
            ActionBarContainer actionBarContainer2 = this.f11157a;
            Drawable drawable3 = actionBarContainer2.f10783f;
            if (drawable3 != null && actionBarContainer2.f10786i) {
                drawable3.draw(canvas);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.w0(21)
    public void getOutline(@NonNull Outline outline) {
        ActionBarContainer actionBarContainer = this.f11157a;
        if (actionBarContainer.f10785h) {
            if (actionBarContainer.f10784g != null) {
                a.a(actionBarContainer.f10782e, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f10782e;
            if (drawable != null) {
                a.a(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
