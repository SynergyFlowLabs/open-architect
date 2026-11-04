package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<InterfaceC1443a> f131154a = null;

    /* JADX INFO: renamed from: com.nineoldandroids.animation.a$a, reason: collision with other inner class name */
    public interface InterfaceC1443a {
        void a(a aVar);

        void b(a aVar);

        void d(a aVar);

        void e(a aVar);
    }

    public void a(InterfaceC1443a interfaceC1443a) {
        if (this.f131154a == null) {
            this.f131154a = new ArrayList<>();
        }
        this.f131154a.add(interfaceC1443a);
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            ArrayList<InterfaceC1443a> arrayList = this.f131154a;
            if (arrayList != null) {
                aVar.f131154a = new ArrayList<>();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    aVar.f131154a.add(arrayList.get(i10));
                }
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public void c() {
    }

    public void cancel() {
    }

    public abstract long d();

    public ArrayList<InterfaceC1443a> e() {
        return this.f131154a;
    }

    public abstract long f();

    public abstract boolean g();

    public boolean h() {
        return g();
    }

    public void i() {
        ArrayList<InterfaceC1443a> arrayList = this.f131154a;
        if (arrayList != null) {
            arrayList.clear();
            this.f131154a = null;
        }
    }

    public void j(InterfaceC1443a interfaceC1443a) {
        ArrayList<InterfaceC1443a> arrayList = this.f131154a;
        if (arrayList != null) {
            arrayList.remove(interfaceC1443a);
            if (this.f131154a.size() == 0) {
                this.f131154a = null;
            }
        }
    }

    public abstract a k(long j10);

    public abstract void l(Interpolator interpolator);

    public abstract void n(long j10);

    public void o(Object obj) {
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }
}
