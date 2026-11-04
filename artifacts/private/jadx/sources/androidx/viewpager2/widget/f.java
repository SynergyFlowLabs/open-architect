package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class f extends ViewPager2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayoutManager f76234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewPager2.m f76235b;

    f(LinearLayoutManager linearLayoutManager) {
        this.f76234a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void a(int i10) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void b(int i10, float f10, int i11) {
        if (this.f76235b == null) {
            return;
        }
        float f11 = -f10;
        for (int i12 = 0; i12 < this.f76234a.V(); i12++) {
            View viewU = this.f76234a.U(i12);
            if (viewU == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i12), Integer.valueOf(this.f76234a.V())));
            }
            this.f76235b.a(viewU, (this.f76234a.w0(viewU) - i10) + f11);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void c(int i10) {
    }

    ViewPager2.m d() {
        return this.f76235b;
    }

    void e(@p0 ViewPager2.m mVar) {
        this.f76235b = mVar;
    }
}
