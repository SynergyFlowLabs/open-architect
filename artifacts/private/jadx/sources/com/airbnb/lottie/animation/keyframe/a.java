package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<K, A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d<K> f88083c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    protected com.airbnb.lottie.value.j<A> f88085e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<b> f88081a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f88082b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f88084d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private A f88086f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f88087g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f88088h = -1.0f;

    public interface b {
        void d();
    }

    private static final class c<T> implements d<T> {
        private c() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a<T> a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float b() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean d(float f10) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    private interface d<T> {
        com.airbnb.lottie.value.a<T> a();

        @x(from = 0.0d, to = 1.0d)
        float b();

        boolean c(float f10);

        boolean d(float f10);

        @x(from = 0.0d, to = 1.0d)
        float e();

        boolean isEmpty();
    }

    private static final class e<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends com.airbnb.lottie.value.a<T>> f88089a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.airbnb.lottie.value.a<T> f88091c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f88092d = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private com.airbnb.lottie.value.a<T> f88090b = f(0.0f);

        e(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f88089a = list;
        }

        private com.airbnb.lottie.value.a<T> f(float f10) {
            List<? extends com.airbnb.lottie.value.a<T>> list = this.f88089a;
            com.airbnb.lottie.value.a<T> aVar = list.get(list.size() - 1);
            if (f10 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f88089a.size() - 2; size >= 1; size--) {
                com.airbnb.lottie.value.a<T> aVar2 = this.f88089a.get(size);
                if (this.f88090b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return this.f88089a.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        @NonNull
        public com.airbnb.lottie.value.a<T> a() {
            return this.f88090b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float b() {
            return this.f88089a.get(0).f();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f10) {
            com.airbnb.lottie.value.a<T> aVar = this.f88091c;
            com.airbnb.lottie.value.a<T> aVar2 = this.f88090b;
            if (aVar == aVar2 && this.f88092d == f10) {
                return true;
            }
            this.f88091c = aVar2;
            this.f88092d = f10;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean d(float f10) {
            if (this.f88090b.a(f10)) {
                return !this.f88090b.i();
            }
            this.f88090b = f(f10);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            List<? extends com.airbnb.lottie.value.a<T>> list = this.f88089a;
            return list.get(list.size() - 1).c();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    private static final class f<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final com.airbnb.lottie.value.a<T> f88093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f88094b = -1.0f;

        f(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f88093a = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a<T> a() {
            return this.f88093a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float b() {
            return this.f88093a.f();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f10) {
            if (this.f88094b == f10) {
                return true;
            }
            this.f88094b = f10;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean d(float f10) {
            return !this.f88093a.i();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return this.f88093a.c();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    a(List<? extends com.airbnb.lottie.value.a<K>> list) {
        this.f88083c = p(list);
    }

    @x(from = 0.0d, to = 1.0d)
    @e.a({com.google.common.net.d.I})
    private float g() {
        if (this.f88087g == -1.0f) {
            this.f88087g = this.f88083c.b();
        }
        return this.f88087g;
    }

    private static <T> d<T> p(List<? extends com.airbnb.lottie.value.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        return list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f88081a.add(bVar);
    }

    protected com.airbnb.lottie.value.a<K> b() {
        com.airbnb.lottie.f.b("BaseKeyframeAnimation#getCurrentKeyframe");
        com.airbnb.lottie.value.a<K> aVarA = this.f88083c.a();
        com.airbnb.lottie.f.c("BaseKeyframeAnimation#getCurrentKeyframe");
        return aVarA;
    }

    @x(from = 0.0d, to = 1.0d)
    @e.a({com.google.common.net.d.I})
    float c() {
        if (this.f88088h == -1.0f) {
            this.f88088h = this.f88083c.e();
        }
        return this.f88088h;
    }

    protected float d() {
        com.airbnb.lottie.value.a<K> aVarB = b();
        if (aVarB != null && !aVarB.i()) {
            return aVarB.f88871d.getInterpolation(e());
        }
        return 0.0f;
    }

    float e() {
        if (this.f88082b) {
            return 0.0f;
        }
        com.airbnb.lottie.value.a<K> aVarB = b();
        if (aVarB.i()) {
            return 0.0f;
        }
        return (this.f88084d - aVarB.f()) / (aVarB.c() - aVarB.f());
    }

    public float f() {
        return this.f88084d;
    }

    public A h() {
        float fE = e();
        if (this.f88085e == null && this.f88083c.c(fE)) {
            return this.f88086f;
        }
        com.airbnb.lottie.value.a<K> aVarB = b();
        Interpolator interpolator = aVarB.f88872e;
        A aI = (interpolator == null || aVarB.f88873f == null) ? i(aVarB, d()) : j(aVarB, fE, interpolator.getInterpolation(fE), aVarB.f88873f.getInterpolation(fE));
        this.f88086f = aI;
        return aI;
    }

    abstract A i(com.airbnb.lottie.value.a<K> aVar, float f10);

    protected A j(com.airbnb.lottie.value.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f88085e != null;
    }

    public void l() {
        com.airbnb.lottie.f.b("BaseKeyframeAnimation#notifyListeners");
        for (int i10 = 0; i10 < this.f88081a.size(); i10++) {
            this.f88081a.get(i10).d();
        }
        com.airbnb.lottie.f.c("BaseKeyframeAnimation#notifyListeners");
    }

    public void m() {
        this.f88082b = true;
    }

    public void n(@x(from = 0.0d, to = 1.0d) float f10) {
        com.airbnb.lottie.f.b("BaseKeyframeAnimation#setProgress");
        if (this.f88083c.isEmpty()) {
            com.airbnb.lottie.f.c("BaseKeyframeAnimation#setProgress");
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f88084d) {
            com.airbnb.lottie.f.c("BaseKeyframeAnimation#setProgress");
            return;
        }
        this.f88084d = f10;
        if (this.f88083c.d(f10)) {
            l();
        }
        com.airbnb.lottie.f.c("BaseKeyframeAnimation#setProgress");
    }

    public void o(@p0 com.airbnb.lottie.value.j<A> jVar) {
        com.airbnb.lottie.value.j<A> jVar2 = this.f88085e;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f88085e = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
