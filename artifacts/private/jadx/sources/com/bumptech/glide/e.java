package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class e<T> implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f96022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f96023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f96024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a<T> f96025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b<T> f96026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f96027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f96028g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f96030i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f96029h = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f96031j = true;

    public interface a<U> {
        @NonNull
        List<U> a(int i10);

        @p0
        k<?> b(@NonNull U u10);
    }

    public interface b<T> {
        @p0
        int[] a(@NonNull T t10, int i10, int i11);
    }

    private static final class c implements p<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f96032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f96033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private com.bumptech.glide.request.d f96034c;

        c() {
        }

        @Override // com.bumptech.glide.manager.i
        public void a() {
        }

        @Override // com.bumptech.glide.manager.i
        public void b() {
        }

        @Override // com.bumptech.glide.request.target.p
        public void d(@NonNull o oVar) {
        }

        @Override // com.bumptech.glide.request.target.p
        @p0
        public com.bumptech.glide.request.d getRequest() {
            return this.f96034c;
        }

        @Override // com.bumptech.glide.request.target.p
        public void h(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void i(@NonNull Object obj, @p0 com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }

        @Override // com.bumptech.glide.manager.i
        public void m() {
        }

        @Override // com.bumptech.glide.request.target.p
        public void n(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void p(@p0 com.bumptech.glide.request.d dVar) {
            this.f96034c = dVar;
        }

        @Override // com.bumptech.glide.request.target.p
        public void q(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void s(@NonNull o oVar) {
            oVar.d(this.f96033b, this.f96032a);
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Queue<c> f96035a;

        d(int i10) {
            this.f96035a = com.bumptech.glide.util.m.f(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f96035a.offer(new c());
            }
        }

        public c a(int i10, int i11) {
            c cVarPoll = this.f96035a.poll();
            this.f96035a.offer(cVarPoll);
            cVarPoll.f96033b = i10;
            cVarPoll.f96032a = i11;
            return cVarPoll;
        }
    }

    public e(@NonNull l lVar, @NonNull a<T> aVar, @NonNull b<T> bVar, int i10) {
        this.f96024c = lVar;
        this.f96025d = aVar;
        this.f96026e = bVar;
        this.f96022a = i10;
        this.f96023b = new d(i10 + 1);
    }

    private void a() {
        for (int i10 = 0; i10 < this.f96023b.f96035a.size(); i10++) {
            this.f96024c.B(this.f96023b.a(0, 0));
        }
    }

    private void b(int i10, int i11) {
        int iMin;
        int iMax;
        if (i10 < i11) {
            iMax = Math.max(this.f96027f, i10);
            iMin = i11;
        } else {
            iMin = Math.min(this.f96028g, i10);
            iMax = i11;
        }
        int iMin2 = Math.min(this.f96030i, iMin);
        int iMin3 = Math.min(this.f96030i, Math.max(0, iMax));
        if (i10 < i11) {
            for (int i12 = iMin3; i12 < iMin2; i12++) {
                d(this.f96025d.a(i12), i12, true);
            }
        } else {
            for (int i13 = iMin2 - 1; i13 >= iMin3; i13--) {
                d(this.f96025d.a(i13), i13, false);
            }
        }
        this.f96028g = iMin3;
        this.f96027f = iMin2;
    }

    private void c(int i10, boolean z10) {
        if (this.f96031j != z10) {
            this.f96031j = z10;
            a();
        }
        b(i10, (z10 ? this.f96022a : -this.f96022a) + i10);
    }

    private void d(List<T> list, int i10, boolean z10) {
        int size = list.size();
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e(list.get(i11), i10, i11);
            }
            return;
        }
        for (int i12 = size - 1; i12 >= 0; i12--) {
            e(list.get(i12), i10, i12);
        }
    }

    private void e(@p0 T t10, int i10, int i11) {
        int[] iArrA;
        k<?> kVarB;
        if (t10 == null || (iArrA = this.f96026e.a(t10, i10, i11)) == null || (kVarB = this.f96025d.b(t10)) == null) {
            return;
        }
        kVarB.i1(this.f96023b.a(iArrA[0], iArrA[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        this.f96030i = i12;
        int i13 = this.f96029h;
        if (i10 > i13) {
            c(i11 + i10, true);
        } else if (i10 < i13) {
            c(i10, false);
        }
        this.f96029h = i10;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
