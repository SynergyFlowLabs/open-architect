package com.badlogic.gdx.graphics.glutils;

import android.opengl.GLES20;
import com.badlogic.gdx.utils.t;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f94712a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final int[] f94713b = new int[1];

    private d() {
    }

    @n
    public static final void a(int i10) {
        int[] iArr = f94713b;
        iArr[0] = i10;
        GLES20.glDeleteFramebuffers(1, iArr, 0);
    }

    @n
    public static final void b(int i10) {
        int[] iArr = f94713b;
        iArr[0] = i10;
        GLES20.glDeleteRenderbuffers(1, iArr, 0);
    }

    @n
    public static final void c(int i10) {
        int[] iArr = f94713b;
        iArr[0] = i10;
        GLES20.glDeleteTextures(1, iArr, 0);
    }

    @n
    public static final void d(int i10, int i11) {
        if (i11 != 0) {
            int[] iArr = f94713b;
            iArr[0] = i11;
            GLES20.glBindBuffer(i10, 0);
            GLES20.glDeleteBuffers(1, iArr, 0);
        }
    }

    @n
    public static final int e() throws t {
        int[] iArr = f94713b;
        GLES20.glGenBuffers(1, iArr, 0);
        int i10 = iArr[0];
        if (i10 != 0) {
            return i10;
        }
        throw new t("Could not allocate buffer");
    }

    @n
    public static final int f() {
        int[] iArr = f94713b;
        GLES20.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    @n
    public static final int g() {
        int[] iArr = f94713b;
        GLES20.glGenRenderbuffers(1, iArr, 0);
        return iArr[0];
    }

    @n
    public static final int h() {
        int[] iArr = f94713b;
        GLES20.glGenTextures(1, iArr, 0);
        return iArr[0];
    }

    @n
    public static final int i(int i10, int i11) {
        int[] iArr = f94713b;
        GLES20.glGetShaderiv(i10, i11, iArr, 0);
        return iArr[0];
    }
}
