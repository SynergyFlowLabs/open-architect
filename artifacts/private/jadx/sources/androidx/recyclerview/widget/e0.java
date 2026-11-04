package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 extends RecyclerView.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final float f74202d = 100.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RecyclerView f74203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Scroller f74204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecyclerView.u f74205c = new a();

    class a extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f74206a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f74206a) {
                this.f74206a = false;
                e0.this.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f74206a = true;
        }
    }

    class b extends s {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.RecyclerView.b0
        protected void p(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
            e0 e0Var = e0.this;
            RecyclerView recyclerView = e0Var.f74203a;
            if (recyclerView != null) {
                int[] iArrC = e0Var.c(recyclerView.getLayoutManager(), view);
                int i10 = iArrC[0];
                int i11 = iArrC[1];
                int iX = x(Math.max(Math.abs(i10), Math.abs(i11)));
                if (iX > 0) {
                    aVar.l(i10, i11, iX, this.f74553j);
                }
            }
        }

        @Override // androidx.recyclerview.widget.s
        protected float w(DisplayMetrics displayMetrics) {
            return e0.f74202d / displayMetrics.densityDpi;
        }
    }

    private void g() {
        this.f74203a.C1(this.f74205c);
        this.f74203a.setOnFlingListener(null);
    }

    private void j() throws IllegalStateException {
        if (this.f74203a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f74203a.r(this.f74205c);
        this.f74203a.setOnFlingListener(this);
    }

    private boolean k(@NonNull RecyclerView.p pVar, int i10, int i11) {
        RecyclerView.b0 b0VarE;
        int i12;
        if (!(pVar instanceof RecyclerView.b0.b) || (b0VarE = e(pVar)) == null || (i12 = i(pVar, i10, i11)) == -1) {
            return false;
        }
        b0VarE.q(i12);
        pVar.k2(b0VarE);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i10, int i11) {
        RecyclerView.p layoutManager = this.f74203a.getLayoutManager();
        if (layoutManager == null || this.f74203a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f74203a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && k(layoutManager, i10, i11);
    }

    public void b(@p0 RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f74203a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            g();
        }
        this.f74203a = recyclerView;
        if (recyclerView != null) {
            j();
            this.f74204b = new Scroller(this.f74203a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    @p0
    public abstract int[] c(@NonNull RecyclerView.p pVar, @NonNull View view);

    @e.a({"UnknownNullness"})
    public int[] d(int i10, int i11) {
        this.f74204b.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f74204b.getFinalX(), this.f74204b.getFinalY()};
    }

    @p0
    protected RecyclerView.b0 e(@NonNull RecyclerView.p pVar) {
        return f(pVar);
    }

    @p0
    @Deprecated
    protected s f(@NonNull RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.b0.b) {
            return new b(this.f74203a.getContext());
        }
        return null;
    }

    @e.a({"UnknownNullness"})
    @p0
    public abstract View h(RecyclerView.p pVar);

    @e.a({"UnknownNullness"})
    public abstract int i(RecyclerView.p pVar, int i10, int i11);

    void l() {
        RecyclerView.p layoutManager;
        View viewH;
        int[] iArrC;
        int i10;
        RecyclerView recyclerView = this.f74203a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (viewH = h(layoutManager)) != null && ((i10 = (iArrC = c(layoutManager, viewH))[0]) != 0 || iArrC[1] != 0)) {
            this.f74203a.R1(i10, iArrC[1]);
        }
    }
}
