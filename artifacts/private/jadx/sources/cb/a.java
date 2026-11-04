package cb;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.m1;
import androidx.annotation.q;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.unit.d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u0.f;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nComposeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeUtils.kt\ncom/planner5d/library/compose/view/util/ComposeUtils\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n75#2:45\n75#2:47\n1#3:46\n*S KotlinDebug\n*F\n+ 1 ComposeUtils.kt\ncom/planner5d/library/compose/view/util/ComposeUtils\n*L\n27#1:45\n41#1:47\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f82538a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f82539b = 0;

    private a() {
    }

    @o
    public final long a(@q int i10, @Nullable c0 c0Var, int i11) {
        c0Var.E(817743985);
        if (m0.l0()) {
            m0.A0(817743985, i11, -1, "com.planner5d.library.compose.view.util.ComposeUtils.dimensionResourceSp (ComposeUtils.kt:34)");
        }
        long jB = b(f.b(i10, c0Var, i11 & 14), c0Var, i11 & com.planner5d.library.engine.input.f.b.B);
        if (m0.l0()) {
            m0.z0();
        }
        c0Var.A();
        return jB;
    }

    @o
    @p4
    @i(name = "getSp")
    public final long b(float f10, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            int i11 = 6 ^ (-1);
            m0.A0(622334624, i10, -1, "com.planner5d.library.compose.view.util.ComposeUtils.<get-sp> (ComposeUtils.kt:26)");
        }
        long jD0 = ((d) c0Var.W(q1.m())).d0(f10);
        if (m0.l0()) {
            m0.z0();
        }
        return jD0;
    }

    @o
    @m1
    @NotNull
    public final androidx.compose.ui.graphics.painter.b c(@NotNull String url, @Nullable c0 c0Var, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(url, "url");
        c0Var.E(1792276163);
        if (m0.l0()) {
            m0.A0(1792276163, i10, -1, "com.planner5d.library.compose.view.util.ComposeUtils.rememberUrlDrawablePainter (ComposeUtils.kt:40)");
        }
        c0Var.E(1522793184);
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(new URL(url));
        try {
            BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) c0Var.W(AndroidCompositionLocals_androidKt.k()), inputStreamOpenStream);
            kotlin.io.c.a(inputStreamOpenStream, null);
            c0Var.A();
            androidx.compose.ui.graphics.painter.b bVarG = com.google.accompanist.drawablepainter.c.g(bitmapDrawable, c0Var, 0);
            if (m0.l0()) {
                m0.z0();
            }
            c0Var.A();
            return bVarG;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(inputStreamOpenStream, th2);
                throw th3;
            }
        }
    }
}
