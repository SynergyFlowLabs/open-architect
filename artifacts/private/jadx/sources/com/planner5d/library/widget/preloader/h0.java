package com.planner5d.library.widget.preloader;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.p0;
import com.android.tools.r8.RecordTag;
import com.planner5d.library.activity.helper.s0;
import com.planner5d.library.model.manager.builtin.u0;
import com.planner5d.library.widget.a1;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.preloader.shimmer.ShimmerView;
import java.util.Objects;
import rx.Observable;

/* JADX INFO: loaded from: classes8.dex */
public class h0 implements a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f258546c = Color.argb(okhttp3.internal.ws.g.f334652s, 255, 255, 255);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f258547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final View f258548b;

    public static final class a extends RecordTag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.l
        @p0
        private final Integer f258549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.l
        @p0
        private final Integer f258550b;

        public a(@androidx.annotation.l @p0 Integer scrimColor, @androidx.annotation.l @p0 Integer backgroundColor) {
            this.f258549a = scrimColor;
            this.f258550b = backgroundColor;
        }

        private /* synthetic */ boolean a(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (Objects.equals(this.f258549a, aVar.f258549a) && Objects.equals(this.f258550b, aVar.f258550b)) {
                    return true;
                }
            }
            return false;
        }

        private /* synthetic */ Object[] b() {
            return new Object[]{this.f258549a, this.f258550b};
        }

        @androidx.annotation.l
        @p0
        public Integer e() {
            return this.f258550b;
        }

        public final boolean equals(Object obj) {
            return a(obj);
        }

        @androidx.annotation.l
        @p0
        public Integer f() {
            return this.f258549a;
        }

        public final int hashCode() {
            return u0.a(this.f258549a, this.f258550b);
        }

        public final String toString() {
            return s0.a(b(), a.class, "a;b");
        }
    }

    h0(View view) {
        this.f258548b = view;
        if (!(view instanceof PreloaderCoverView) && !(view instanceof PreloaderBoxView) && !(view instanceof PreloaderBoxV2View) && !(view instanceof ShimmerView) && !(view instanceof PreloaderSimpleV2View) && !(view instanceof PreloaderShimmerV2View) && !(view instanceof PreloaderDialogView) && !(view instanceof PreloaderAnimationView)) {
            view = view == null ? null : view.findViewById(c1.i.E6);
        }
        if (view instanceof PreloaderBoxView) {
            this.f258547a = new e((PreloaderBoxView) view);
            return;
        }
        if (view instanceof PreloaderCoverView) {
            this.f258547a = new f((PreloaderCoverView) view);
            return;
        }
        if (view instanceof PreloaderBoxV2View) {
            this.f258547a = new d((PreloaderBoxV2View) view);
            return;
        }
        if (view instanceof g0) {
            this.f258547a = new j((g0) view);
            return;
        }
        if (view instanceof ShimmerView) {
            this.f258547a = new com.planner5d.library.widget.preloader.shimmer.a((ShimmerView) view);
            return;
        }
        if (view instanceof PreloaderShimmerV2View) {
            this.f258547a = new h((PreloaderShimmerV2View) view);
            return;
        }
        if (view instanceof PreloaderSimpleV2View) {
            this.f258547a = new i((PreloaderSimpleV2View) view);
            return;
        }
        if (view instanceof PreloaderDialogView) {
            this.f258547a = new g((PreloaderDialogView) view);
        } else if (view instanceof PreloaderAnimationView) {
            this.f258547a = new c((PreloaderAnimationView) view);
        } else {
            this.f258547a = new b();
        }
    }

    private String d(@f1 int i10) {
        Context contextB = this.f258547a.b();
        return contextB == null ? com.planner5d.library.model.payments.a.f222474i : contextB.getString(i10);
    }

    @Override // com.planner5d.library.widget.a1
    public void a(@f1 int i10, boolean z10) {
        p(d(i10), z10);
    }

    @Override // com.planner5d.library.widget.a1
    public void b() {
        this.f258547a.d();
    }

    @NonNull
    public a c() {
        return new a(this.f258547a.c(), this.f258547a.a());
    }

    public View e() {
        return this.f258548b;
    }

    public void f(@NonNull a aVar) {
        l(aVar.f258549a);
        g(aVar.f258550b);
    }

    public h0 g(@androidx.annotation.l Integer num) {
        this.f258547a.e(num);
        return this;
    }

    public h0 h(@androidx.annotation.l Integer num) {
        this.f258547a.f(num);
        return this;
    }

    public h0 i(int i10) {
        this.f258547a.g(i10);
        return this;
    }

    public h0 j(boolean z10) {
        this.f258547a.h(z10);
        return this;
    }

    public h0 k(int i10, int i11, int i12, int i13) {
        this.f258547a.i(i10, i11, i12, i13);
        return this;
    }

    public h0 l(Integer num) {
        this.f258547a.j(num);
        return this;
    }

    public void m() {
        this.f258547a.k();
    }

    public void n(@f1 int i10, @f1 int i11, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this.f258547a.l(i10, i11, onClickListener, onClickListener2);
    }

    public void o(String str, Integer num) {
        this.f258547a.m(str, num, true, true);
    }

    public void p(String str, boolean z10) {
        this.f258547a.m(str, z10 ? 1 : null, false, true);
    }

    public void q(String str) {
        this.f258547a.m(str, null, false, false);
    }

    public Observable<Void> r(@f1 int i10, boolean z10) {
        return t(d(i10), z10);
    }

    public Observable<Void> s(com.planner5d.library.model.u uVar, boolean z10) {
        Context contextB = this.f258547a.b();
        return t(contextB == null ? com.planner5d.library.model.payments.a.f222474i : uVar.c().c(contextB), z10);
    }

    public Observable<Void> t(CharSequence charSequence, boolean z10) {
        return this.f258547a.n(20L, charSequence, z10);
    }

    public void u(boolean z10) {
        if (z10) {
            this.f258547a.k();
        } else {
            this.f258547a.d();
        }
    }
}
