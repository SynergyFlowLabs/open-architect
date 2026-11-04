package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ViewPager2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ViewPager2.m> f76224a = new ArrayList();

    @Override // androidx.viewpager2.widget.ViewPager2.m
    public void a(@NonNull View view, float f10) {
        Iterator<ViewPager2.m> it = this.f76224a.iterator();
        while (it.hasNext()) {
            it.next().a(view, f10);
        }
    }

    public void b(@NonNull ViewPager2.m mVar) {
        this.f76224a.add(mVar);
    }

    public void c(@NonNull ViewPager2.m mVar) {
        this.f76224a.remove(mVar);
    }
}
