package com.google.vr.sdk.base;

import android.opengl.GLES20;
import com.google.vr.cardboard.UsedByNative;

/* JADX INFO: loaded from: classes5.dex */
@UsedByNative
public class Viewport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f127527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f127528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f127529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f127530d;

    public void a(int[] iArr, int i10) {
        if (i10 + 4 > iArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        iArr[i10] = this.f127527a;
        iArr[i10 + 1] = this.f127528b;
        iArr[i10 + 2] = this.f127529c;
        iArr[i10 + 3] = this.f127530d;
    }

    public void b() {
        GLES20.glScissor(this.f127527a, this.f127528b, this.f127529c, this.f127530d);
    }

    public void c() {
        GLES20.glViewport(this.f127527a, this.f127528b, this.f127529c, this.f127530d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Viewport)) {
            return false;
        }
        Viewport viewport = (Viewport) obj;
        return this.f127527a == viewport.f127527a && this.f127528b == viewport.f127528b && this.f127529c == viewport.f127529c && this.f127530d == viewport.f127530d;
    }

    public int hashCode() {
        return Integer.valueOf(this.f127530d).hashCode() ^ ((Integer.valueOf(this.f127527a).hashCode() ^ Integer.valueOf(this.f127528b).hashCode()) ^ Integer.valueOf(this.f127529c).hashCode());
    }

    @UsedByNative
    public void setViewport(int i10, int i11, int i12, int i13) {
        this.f127527a = i10;
        this.f127528b = i11;
        this.f127529c = i12;
        this.f127530d = i13;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n");
        int i10 = this.f127527a;
        StringBuilder sb3 = new StringBuilder(18);
        sb3.append("  x: ");
        sb3.append(i10);
        sb3.append(",\n");
        sb2.append(sb3.toString());
        int i11 = this.f127528b;
        StringBuilder sb4 = new StringBuilder(18);
        sb4.append("  y: ");
        sb4.append(i11);
        sb4.append(",\n");
        sb2.append(sb4.toString());
        int i12 = this.f127529c;
        StringBuilder sb5 = new StringBuilder(22);
        sb5.append("  width: ");
        sb5.append(i12);
        sb5.append(",\n");
        sb2.append(sb5.toString());
        int i13 = this.f127530d;
        StringBuilder sb6 = new StringBuilder(23);
        sb6.append("  height: ");
        sb6.append(i13);
        sb6.append(",\n");
        sb2.append(sb6.toString());
        sb2.append("}");
        return sb2.toString();
    }
}
