package androidx.media2.exoplayer.external.util;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import androidx.annotation.b1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f57603a = "GlUtil";

    private m() {
    }

    private static void a(int type, String source, int program) {
        int iGlCreateShader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(iGlCreateShader, source);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strGlGetShaderInfoLog).length() + 10 + String.valueOf(source).length());
            sb2.append(strGlGetShaderInfoLog);
            sb2.append(", source: ");
            sb2.append(source);
            h(sb2.toString());
        }
        GLES20.glAttachShader(program, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        b();
    }

    public static void b() {
        int i10 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            String strValueOf = String.valueOf(GLU.gluErrorString(i10));
            p.d(f57603a, strValueOf.length() != 0 ? "glError ".concat(strValueOf) : new String("glError "));
            i10 = iGlGetError;
        }
    }

    public static int c(String vertexCode, String fragmentCode) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        b();
        a(35633, vertexCode, iGlCreateProgram);
        a(35632, fragmentCode, iGlCreateProgram);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String strValueOf = String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram));
            h(strValueOf.length() != 0 ? "Unable to link shader program: \n".concat(strValueOf) : new String("Unable to link shader program: \n"));
        }
        b();
        return iGlCreateProgram;
    }

    public static int d(String[] vertexCode, String[] fragmentCode) {
        return c(TextUtils.join("\n", vertexCode), TextUtils.join("\n", fragmentCode));
    }

    public static FloatBuffer e(int capacity) {
        return ByteBuffer.allocateDirect(capacity * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer f(float[] data) {
        return (FloatBuffer) e(data.length).put(data).flip();
    }

    public static int g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, androidx.media3.common.j.I3);
        GLES20.glTexParameteri(36197, androidx.work.h.f76563d, androidx.media3.common.j.I3);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b();
        return iArr[0];
    }

    private static void h(String errorMsg) {
        p.d(f57603a, errorMsg);
    }
}
