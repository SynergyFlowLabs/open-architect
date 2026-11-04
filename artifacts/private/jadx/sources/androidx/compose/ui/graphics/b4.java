package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/TransformShader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n1#2:236\n*E\n"})
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Matrix f37540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Shader f37541b;

    private final Matrix b() {
        Matrix matrix = this.f37540a;
        if (matrix != null) {
            return matrix;
        }
        Matrix matrix2 = new Matrix();
        this.f37540a = matrix2;
        return matrix2;
    }

    @Nullable
    public final Shader a() {
        return this.f37541b;
    }

    public final void c(@Nullable Shader shader) {
        Matrix matrix = this.f37540a;
        if (matrix != null && shader != null) {
            shader.setLocalMatrix(matrix);
        }
        this.f37541b = shader;
    }

    public final void d(@Nullable float[] fArr) {
        Matrix matrix;
        if (fArr == null) {
            matrix = null;
            this.f37540a = null;
        } else {
            Matrix matrixB = b();
            k.a(matrixB, fArr);
            matrix = matrixB;
        }
        Shader shader = this.f37541b;
        if (shader != null) {
            shader.setLocalMatrix(matrix);
        }
    }
}
