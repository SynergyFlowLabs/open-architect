package com.nineoldandroids.animation;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f131209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Class f131210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f131211c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f131212d = false;

    static class c extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f131215e;

        c(float f10, Object obj) {
            this.f131209a = f10;
            this.f131215e = obj;
            boolean z10 = obj != null;
            this.f131212d = z10;
            this.f131210b = z10 ? obj.getClass() : Object.class;
        }

        @Override // com.nineoldandroids.animation.j
        public Object e() {
            return this.f131215e;
        }

        @Override // com.nineoldandroids.animation.j
        public void p(Object obj) {
            this.f131215e = obj;
            this.f131212d = obj != null;
        }

        @Override // com.nineoldandroids.animation.j
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public c clone() {
            c cVar = new c(b(), this.f131215e);
            cVar.o(c());
            return cVar;
        }
    }

    public static j g(float f10) {
        return new a(f10);
    }

    public static j h(float f10, float f11) {
        return new a(f10, f11);
    }

    public static j i(float f10) {
        return new b(f10);
    }

    public static j j(float f10, int i10) {
        return new b(f10, i10);
    }

    public static j k(float f10) {
        return new c(f10, null);
    }

    public static j l(float f10, Object obj) {
        return new c(f10, obj);
    }

    @Override // 
    /* JADX INFO: renamed from: a */
    public abstract j clone();

    public float b() {
        return this.f131209a;
    }

    public Interpolator c() {
        return this.f131211c;
    }

    public Class d() {
        return this.f131210b;
    }

    public abstract Object e();

    public boolean f() {
        return this.f131212d;
    }

    public void n(float f10) {
        this.f131209a = f10;
    }

    public void o(Interpolator interpolator) {
        this.f131211c = interpolator;
    }

    public abstract void p(Object obj);

    static class a extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f131213e;

        a(float f10, float f11) {
            this.f131209a = f10;
            this.f131213e = f11;
            this.f131210b = Float.TYPE;
            this.f131212d = true;
        }

        @Override // com.nineoldandroids.animation.j
        public Object e() {
            return Float.valueOf(this.f131213e);
        }

        @Override // com.nineoldandroids.animation.j
        public void p(Object obj) {
            if (obj != null && obj.getClass() == Float.class) {
                this.f131213e = ((Float) obj).floatValue();
                this.f131212d = true;
            }
        }

        @Override // com.nineoldandroids.animation.j
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a(b(), this.f131213e);
            aVar.o(c());
            return aVar;
        }

        public float r() {
            return this.f131213e;
        }

        a(float f10) {
            this.f131209a = f10;
            this.f131210b = Float.TYPE;
        }
    }

    static class b extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131214e;

        b(float f10, int i10) {
            this.f131209a = f10;
            this.f131214e = i10;
            this.f131210b = Integer.TYPE;
            this.f131212d = true;
        }

        @Override // com.nineoldandroids.animation.j
        public Object e() {
            return Integer.valueOf(this.f131214e);
        }

        @Override // com.nineoldandroids.animation.j
        public void p(Object obj) {
            if (obj == null || obj.getClass() != Integer.class) {
                return;
            }
            this.f131214e = ((Integer) obj).intValue();
            this.f131212d = true;
        }

        @Override // com.nineoldandroids.animation.j
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            b bVar = new b(b(), this.f131214e);
            bVar.o(c());
            return bVar;
        }

        public int r() {
            return this.f131214e;
        }

        b(float f10) {
            this.f131209a = f10;
            this.f131210b = Integer.TYPE;
        }
    }
}
