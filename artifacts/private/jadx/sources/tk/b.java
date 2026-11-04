package tk;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class b implements a<Boolean>, Serializable, Comparable<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f381061b = -4830728138360036487L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f381062a;

    public b() {
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && this.f381062a == ((b) obj).k();
    }

    public int hashCode() {
        return (this.f381062a ? Boolean.TRUE : Boolean.FALSE).hashCode();
    }

    public boolean k() {
        return this.f381062a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        return org.apache.commons.lang3.e.c(this.f381062a, bVar.f381062a);
    }

    @Override // tk.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Boolean getValue() {
        return Boolean.valueOf(this.f381062a);
    }

    public boolean o() {
        return !this.f381062a;
    }

    public boolean p() {
        return this.f381062a;
    }

    public void q() {
        this.f381062a = false;
    }

    public void r() {
        this.f381062a = true;
    }

    @Override // tk.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void setValue(Boolean bool) {
        this.f381062a = bool.booleanValue();
    }

    public void t(boolean z10) {
        this.f381062a = z10;
    }

    public String toString() {
        return String.valueOf(this.f381062a);
    }

    public Boolean v() {
        return Boolean.valueOf(k());
    }

    public b(boolean z10) {
        this.f381062a = z10;
    }

    public b(Boolean bool) {
        this.f381062a = bool.booleanValue();
    }
}
