package com.badlogic.gdx.math;

/* JADX INFO: loaded from: classes3.dex */
public class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.badlogic.gdx.utils.b<h<T>.a> f94954a = new com.badlogic.gdx.utils.b<>(false, 10, a.class);

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f94955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f94956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f94957c;

        public a(T t10, float f10, float f11) {
            this.f94955a = t10;
            this.f94956b = f10;
            this.f94957c = f11;
        }
    }

    public void a(T t10) {
        this.f94954a.c(new a(t10, 0.0f, 0.0f));
    }

    public void b(T t10, float f10) {
        this.f94954a.c(new a(t10, 0.0f, f10));
    }

    public void c() {
        this.f94954a.clear();
    }

    public void d() {
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            com.badlogic.gdx.utils.b<h<T>.a> bVar = this.f94954a;
            if (i10 >= bVar.f95174b) {
                return;
            }
            h<T>.a[] aVarArr = bVar.f95173a;
            f10 += aVarArr[i10].f94957c;
            aVarArr[i10].f94956b = f10;
            i10++;
        }
    }

    public void e() {
        float f10 = 0.0f;
        int i10 = 0;
        float f11 = 0.0f;
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.b<h<T>.a> bVar = this.f94954a;
            if (i11 >= bVar.f95174b) {
                break;
            }
            f11 += bVar.f95173a[i11].f94957c;
            i11++;
        }
        while (true) {
            com.badlogic.gdx.utils.b<h<T>.a> bVar2 = this.f94954a;
            if (i10 >= bVar2.f95174b) {
                return;
            }
            h<T>.a[] aVarArr = bVar2.f95173a;
            f10 += aVarArr[i10].f94957c / f11;
            aVarArr[i10].f94956b = f10;
            i10++;
        }
    }

    public void f() {
        float f10 = 1.0f / this.f94954a.f95174b;
        int i10 = 0;
        while (true) {
            com.badlogic.gdx.utils.b<h<T>.a> bVar = this.f94954a;
            if (i10 >= bVar.f95174b) {
                return;
            }
            h<T>.a[] aVarArr = bVar.f95173a;
            aVarArr[i10].f94957c = f10;
            h<T>.a aVar = aVarArr[i10];
            i10++;
            aVar.f94956b = i10 * f10;
        }
    }

    public float g(int i10) {
        return this.f94954a.f95173a[i10].f94957c;
    }

    public T h(int i10) {
        return this.f94954a.f95173a[i10].f94955a;
    }

    public void i(int i10, float f10) {
        this.f94954a.f95173a[i10].f94957c = f10;
    }

    public void j(T t10, float f10) {
        for (h<T>.a aVar : this.f94954a) {
            if (aVar.f94955a == t10) {
                aVar.f94957c = f10;
                return;
            }
        }
    }

    public int k() {
        return this.f94954a.f95174b;
    }

    public T l() {
        return m(s.v());
    }

    public T m(float f10) {
        int i10 = this.f94954a.f95174b - 1;
        h<T>.a aVar = null;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = ((i10 - i11) / 2) + i11;
            h<T>.a aVar2 = this.f94954a.f95173a[i12];
            float f11 = aVar2.f94956b;
            if (f10 >= f11) {
                if (f10 <= f11) {
                    aVar = aVar2;
                    break;
                }
                i11 = i12 + 1;
            } else {
                i10 = i12 - 1;
            }
            aVar = aVar2;
        }
        return aVar.f94955a;
    }
}
