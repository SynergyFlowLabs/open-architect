package a1;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.compose.ui.graphics.m3;
import androidx.compose.ui.text.platform.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,52:1\n85#2:53\n117#2,2:54\n141#3:56\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n*L\n37#1:53\n37#1:54,2\n40#1:56\n*E\n"})
public final class g extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f423e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m3 f424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n3 f426c = d7.g(n.c(n.f332724b.a()), null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n7<Shader> f427d = w6.e(new Function0() { // from class: a1.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return g.f(this.f422a);
        }
    });

    public g(@NotNull m3 m3Var, float f10) {
        this.f424a = m3Var;
        this.f425b = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader f(g gVar) {
        if (gVar.d() == n0.d.f332689d || n.v(gVar.d())) {
            return null;
        }
        return gVar.f424a.c(gVar.d());
    }

    public final float b() {
        return this.f425b;
    }

    @NotNull
    public final m3 c() {
        return this.f424a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d() {
        return ((n) this.f426c.getValue()).y();
    }

    public final void e(long j10) {
        this.f426c.setValue(n.c(j10));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        p.a(textPaint, this.f425b);
        textPaint.setShader(this.f427d.getValue());
    }
}
