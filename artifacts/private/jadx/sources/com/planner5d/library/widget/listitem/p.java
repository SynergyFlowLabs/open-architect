package com.planner5d.library.widget.listitem;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.j0;
import androidx.annotation.l0;
import androidx.annotation.m1;
import androidx.core.view.c2;
import com.planner5d.library.widget.d1;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import rx.Subscriber;

/* JADX INFO: loaded from: classes8.dex */
public abstract class p extends FrameLayout implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.planner5d.library.services.bitmaploader.target.h f258285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.d.C1663d f258286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.a f258287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImageView f258288d;

    class a extends com.planner5d.library.widget.bitmaptarget.c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f258289n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f258290o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ImageView imageView, com.planner5d.library.widget.drawable.h.b bVar, boolean z10, int i10) {
            super(imageView, bVar);
            this.f258289n = z10;
            this.f258290o = i10;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        @l0
        public void g(Throwable th2) {
            if (this.f258289n) {
                p.this.l(this, this.f258290o);
            }
        }
    }

    class b extends com.planner5d.library.services.rx.e<com.planner5d.library.services.bitmaploader.d.C1663d> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.bitmaploader.target.a f258292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.bitmaploader.target.a f258293e;

        b(com.planner5d.library.services.bitmaploader.target.a aVar, com.planner5d.library.services.bitmaploader.target.a aVar2) {
            this.f258292d = aVar;
            this.f258293e = aVar2;
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(com.planner5d.library.services.bitmaploader.d.C1663d c1663d) {
            if (p.this.f258287c != this.f258292d) {
                c1663d.a();
                p.this.f258285a.d(this.f258293e);
            } else {
                p.this.f258287c = this.f258293e;
                p.this.f258286b = c1663d;
            }
        }
    }

    protected p(Context context, @j0 int i10, com.planner5d.library.services.bitmaploader.target.h hVar) {
        super(context);
        this.f258286b = null;
        this.f258287c = null;
        View.inflate(context, i10, this);
        this.f258288d = (ImageView) findViewById(com.planner5d.library.f.j.Jd);
        this.f258285a = hVar;
    }

    private com.planner5d.library.services.bitmaploader.target.a h(boolean z10, int i10) {
        return new a(this.f258288d, com.planner5d.library.widget.drawable.h.b.Shimmer, z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit k(View view) {
        o(view.getWidth(), view.getHeight());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @l0
    public void l(com.planner5d.library.services.bitmaploader.target.a aVar, final int i10) {
        this.f258285a.d(aVar);
        final com.planner5d.library.services.bitmaploader.target.a aVarC = this.f258285a.c(h(false, i10));
        final Context context = getContext();
        com.planner5d.library.services.rx.i.f(new Callable() { // from class: com.planner5d.library.widget.listitem.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f258281a.j(context, aVarC, i10);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).subscribe((Subscriber) new b(aVar, aVarC));
    }

    private void o(int i10, int i11) {
        n(Math.max(i10, i11));
    }

    public void a() {
        com.planner5d.library.services.bitmaploader.d.C1663d c1663d = this.f258286b;
        if (c1663d != null) {
            c1663d.a();
            this.f258286b = null;
        }
        com.planner5d.library.services.bitmaploader.target.a aVar = this.f258287c;
        if (aVar != null) {
            this.f258285a.d(aVar);
            this.f258288d.setImageDrawable(null);
            this.f258287c = null;
        }
    }

    protected boolean i() {
        return false;
    }

    protected final void m() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            c2.d(this, new Function1() { // from class: com.planner5d.library.widget.listitem.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f258280a.k((View) obj);
                }
            });
        } else {
            o(width, height);
        }
    }

    protected final void n(int i10) {
        com.planner5d.library.services.bitmaploader.d.C1663d c1663d = this.f258286b;
        if (c1663d != null) {
            c1663d.a();
            this.f258286b = null;
        }
        this.f258285a.d(this.f258287c);
        if (this.f258285a.b()) {
            return;
        }
        com.planner5d.library.services.bitmaploader.target.a aVarC = this.f258285a.c(h(i(), i10));
        this.f258287c = aVarC;
        com.planner5d.library.services.bitmaploader.d.C1663d c1663dQ = q(aVarC, i10);
        if (c1663dQ != null) {
            this.f258286b = c1663dQ;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @m1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.bitmaploader.d.C1663d j(Context context, com.planner5d.library.services.bitmaploader.target.a aVar, int i10) {
        return null;
    }

    protected abstract com.planner5d.library.services.bitmaploader.d.C1663d q(com.planner5d.library.services.bitmaploader.target.a aVar, int i10);
}
