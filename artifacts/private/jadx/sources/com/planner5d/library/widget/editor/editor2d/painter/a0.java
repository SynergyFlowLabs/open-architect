package com.planner5d.library.widget.editor.editor2d.painter;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import com.planner5d.library.model.manager.k5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f255148d = new a0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f255149e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f255150a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b> f255151b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f255152c = true;

    class a extends com.planner5d.library.services.bitmaploader.target.j {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f255153h;

        a(b bVar) {
            this.f255153h = bVar;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        public void g(Throwable th2) {
            a0.this.h(this.f255153h, a0.f255149e);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.j
        protected void l(BitmapShader bitmapShader, int i10, int i11) {
            a0.this.h(this.f255153h, new c(bitmapShader, i10, i11, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.planner5d.library.model.y f255155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Subscriber<? super c>> f255156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.planner5d.library.services.bitmaploader.target.a f255157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f255158d;

        /* JADX INFO: Access modifiers changed from: private */
        public void h(Subscriber<? super c> subscriber) {
            this.f255156b.add(subscriber);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i() {
            com.planner5d.library.services.bitmaploader.target.a aVar = this.f255157c;
            if (aVar != null) {
                aVar.dispose();
            }
            k(a0.f255149e).j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            c cVar = this.f255158d;
            if (cVar != null) {
                Iterator<Subscriber<? super c>> it = this.f255156b.iterator();
                while (it.hasNext()) {
                    Subscriber<? super c> next = it.next();
                    it.remove();
                    if (cVar != a0.f255149e) {
                        next.onNext(new c(cVar, null));
                    }
                    next.onCompleted();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b k(c cVar) {
            this.f255158d = cVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(com.planner5d.library.services.bitmaploader.target.a aVar) {
            this.f255157c = aVar;
        }

        private b(com.planner5d.library.model.y yVar) {
            this.f255156b = new ArrayList();
            this.f255157c = null;
            this.f255158d = null;
            this.f255155a = yVar;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BitmapShader f255159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Matrix f255160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f255161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f255162d;

        public void a(Paint paint) {
            this.f255159a.setLocalMatrix(this.f255160b);
            paint.setShader(this.f255159a);
        }

        public c(c cVar, com.planner5d.library.model.y yVar) {
            this(cVar.f255159a, cVar.f255161c, cVar.f255162d, yVar);
        }

        private c(BitmapShader bitmapShader, int i10, int i11, com.planner5d.library.model.y yVar) {
            Float f10;
            Matrix matrix = new Matrix();
            this.f255160b = matrix;
            float f11 = yVar == null ? 1.0f : yVar.f();
            this.f255159a = bitmapShader;
            this.f255161c = i10;
            this.f255162d = i11;
            matrix.setScale((100.0f / i10) * f11, (100.0f / i11) * f11);
            if (yVar != null && (yVar.f222855g.floatValue() != 0.0f || yVar.f222854f.floatValue() != 0.0f)) {
                matrix.postTranslate(yVar.f222854f.floatValue(), yVar.f222855g.floatValue());
            }
            if (yVar == null || (f10 = yVar.f222853e) == null) {
                return;
            }
            matrix.postRotate(-f10.floatValue());
        }
    }

    static {
        Bitmap bitmapB = td.a.f380845a.b(1, 1, Bitmap.Config.ALPHA_8);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        int i10 = 5 | 1;
        f255149e = new c(new BitmapShader(bitmapB, tileMode, tileMode), 1, 1, null);
    }

    private a0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(b bVar, boolean z10, com.planner5d.library.model.p.b bVar2, Subscriber subscriber) {
        synchronized (this.f255150a) {
            try {
                if (!this.f255151b.contains(bVar)) {
                    subscriber.onCompleted();
                    return;
                }
                bVar.h(subscriber);
                bVar.j();
                if (z10) {
                    f(bVar, bVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void f(b bVar, com.planner5d.library.model.p.b bVar2) {
        bVar.l(new a(bVar));
        k5.B().v(bVar.f255155a.f222851c, com.planner5d.library.model.p.a.diffuse, bVar2, bVar.f255157c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(b bVar, c cVar) {
        synchronized (this.f255150a) {
            try {
                if (this.f255151b.contains(bVar)) {
                    bVar.k(cVar).j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        synchronized (this.f255150a) {
            try {
                Iterator<b> it = this.f255151b.iterator();
                while (it.hasNext()) {
                    it.next().i();
                }
                this.f255151b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Observable<c> g(com.planner5d.library.model.y yVar, final com.planner5d.library.model.p.b bVar) {
        final b bVar2;
        final boolean z10;
        if (!this.f255152c) {
            return Observable.just(f255149e);
        }
        synchronized (this.f255150a) {
            try {
                bVar2 = null;
                for (b bVar3 : this.f255151b) {
                    if (yVar != null && yVar.f222851c != null && bVar3.f255155a != null && yVar.f222851c.equals(bVar3.f255155a.f222851c)) {
                        bVar2 = bVar3;
                    }
                }
                z10 = bVar2 == null;
                if (z10) {
                    List<b> list = this.f255151b;
                    b bVar4 = new b(yVar);
                    list.add(bVar4);
                    bVar2 = bVar4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return com.planner5d.library.services.rx.i.d(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.editor2d.painter.z
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f255367a.e(bVar2, z10, bVar, (Subscriber) obj);
            }
        });
    }

    public void i(boolean z10) {
        this.f255152c = z10;
    }
}
