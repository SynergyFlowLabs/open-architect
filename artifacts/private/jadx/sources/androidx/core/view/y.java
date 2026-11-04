package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DisplayCutout f49027a;

    @androidx.annotation.w0(28)
    static class a {
        private a() {
        }

        static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    @androidx.annotation.w0(29)
    static class b {
        private b() {
        }

        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    @androidx.annotation.w0(30)
    static class c {
        private c() {
        }

        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    @androidx.annotation.w0(31)
    static class d {
        private d() {
        }

        @androidx.annotation.p0
        static Path a(DisplayCutout displayCutout) {
            return displayCutout.getCutoutPath();
        }
    }

    @androidx.annotation.w0(33)
    static class e {
        private e() {
        }

        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2, Path path) {
            return new DisplayCutout.Builder().setSafeInsets(insets).setBoundingRectLeft(rect).setBoundingRectTop(rect2).setBoundingRectRight(rect3).setBoundingRectBottom(rect4).setWaterfallInsets(insets2).setCutoutPath(path).build();
        }
    }

    public y(@androidx.annotation.p0 Rect rect, @androidx.annotation.p0 List<Rect> list) {
        this(a.a(rect, list));
    }

    private static DisplayCutout a(@NonNull androidx.core.graphics.j jVar, @androidx.annotation.p0 Rect rect, @androidx.annotation.p0 Rect rect2, @androidx.annotation.p0 Rect rect3, @androidx.annotation.p0 Rect rect4, @NonNull androidx.core.graphics.j jVar2, @androidx.annotation.p0 Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return e.a(jVar.h(), rect, rect2, rect3, rect4, jVar2.h(), path);
        }
        return i10 >= 30 ? c.a(jVar.h(), rect, rect2, rect3, rect4, jVar2.h()) : b.a(jVar.h(), rect, rect2, rect3, rect4);
    }

    static y j(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new y(displayCutout);
    }

    @NonNull
    public List<Rect> b() {
        return a.b(this.f49027a);
    }

    @androidx.annotation.p0
    public Path c() {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.a(this.f49027a);
        }
        return null;
    }

    public int d() {
        return a.c(this.f49027a);
    }

    public int e() {
        return a.d(this.f49027a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        return androidx.core.util.o.a(this.f49027a, ((y) obj).f49027a);
    }

    public int f() {
        return a.e(this.f49027a);
    }

    public int g() {
        return a.f(this.f49027a);
    }

    @NonNull
    public androidx.core.graphics.j h() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.j.g(c.b(this.f49027a)) : androidx.core.graphics.j.f47822e;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f49027a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @androidx.annotation.w0(28)
    DisplayCutout i() {
        return this.f49027a;
    }

    @NonNull
    public String toString() {
        return "DisplayCutoutCompat{" + this.f49027a + "}";
    }

    public y(@NonNull androidx.core.graphics.j jVar, @androidx.annotation.p0 Rect rect, @androidx.annotation.p0 Rect rect2, @androidx.annotation.p0 Rect rect3, @androidx.annotation.p0 Rect rect4, @NonNull androidx.core.graphics.j jVar2) {
        this(a(jVar, rect, rect2, rect3, rect4, jVar2, null));
    }

    public y(@NonNull androidx.core.graphics.j jVar, @androidx.annotation.p0 Rect rect, @androidx.annotation.p0 Rect rect2, @androidx.annotation.p0 Rect rect3, @androidx.annotation.p0 Rect rect4, @NonNull androidx.core.graphics.j jVar2, @androidx.annotation.p0 Path path) {
        this(a(jVar, rect, rect2, rect3, rect4, jVar2, path));
    }

    private y(DisplayCutout displayCutout) {
        this.f49027a = displayCutout;
    }
}
