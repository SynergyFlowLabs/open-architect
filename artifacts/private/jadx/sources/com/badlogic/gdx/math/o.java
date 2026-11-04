package com.badlogic.gdx.math;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95003b;

    public o() {
    }

    public o a(int i10, int i11) {
        this.f95002a = i10;
        this.f95003b = i11;
        return this;
    }

    public o b(o oVar) {
        this.f95002a = oVar.f95002a;
        this.f95003b = oVar.f95003b;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            o oVar = (o) obj;
            if (this.f95002a == oVar.f95002a && this.f95003b == oVar.f95003b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f95002a + 53) * 53) + this.f95003b;
    }

    public o(int i10, int i11) {
        this.f95002a = i10;
        this.f95003b = i11;
    }

    public o(o oVar) {
        this.f95002a = oVar.f95002a;
        this.f95003b = oVar.f95003b;
    }
}
