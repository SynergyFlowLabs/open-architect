package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.annotation.t0;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class b extends ViewPager2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final List<ViewPager2.j> f76223a;

    b(int i10) {
        this.f76223a = new ArrayList(i10);
    }

    private void f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void a(int i10) {
        try {
            Iterator<ViewPager2.j> it = this.f76223a.iterator();
            while (it.hasNext()) {
                it.next().a(i10);
            }
        } catch (ConcurrentModificationException e10) {
            f(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void b(int i10, float f10, @t0 int i11) {
        try {
            Iterator<ViewPager2.j> it = this.f76223a.iterator();
            while (it.hasNext()) {
                it.next().b(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            f(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void c(int i10) {
        try {
            Iterator<ViewPager2.j> it = this.f76223a.iterator();
            while (it.hasNext()) {
                it.next().c(i10);
            }
        } catch (ConcurrentModificationException e10) {
            f(e10);
        }
    }

    void d(ViewPager2.j jVar) {
        this.f76223a.add(jVar);
    }

    void e(ViewPager2.j jVar) {
        this.f76223a.remove(jVar);
    }
}
