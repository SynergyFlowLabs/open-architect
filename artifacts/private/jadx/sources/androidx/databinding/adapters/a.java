package androidx.databinding.adapters;

import android.widget.AbsListView;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:listSelector", method = "setSelector", type = AbsListView.class), @androidx.databinding.g(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = AbsListView.class), @androidx.databinding.g(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = AbsListView.class), @androidx.databinding.g(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = AbsListView.class)})
@b1({b1.a.LIBRARY})
public class a {

    /* JADX INFO: renamed from: androidx.databinding.adapters.a$a, reason: collision with other inner class name */
    class C0423a implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f49263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f49264b;

        C0423a(c cVar, b bVar) {
            this.f49263a = cVar;
            this.f49264b = bVar;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            b bVar = this.f49264b;
            if (bVar != null) {
                bVar.onScroll(absListView, i10, i11, i12);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            c cVar = this.f49263a;
            if (cVar != null) {
                cVar.onScrollStateChanged(absListView, i10);
            }
        }
    }

    public interface b {
        void onScroll(AbsListView absListView, int i10, int i11, int i12);
    }

    public interface c {
        void onScrollStateChanged(AbsListView absListView, int i10);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    public static void a(AbsListView absListView, b bVar, c cVar) {
        absListView.setOnScrollListener(new C0423a(cVar, bVar));
    }
}
