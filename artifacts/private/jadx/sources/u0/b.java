package u0;

import android.content.Context;
import androidx.annotation.b0;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.a1;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.m1;
import androidx.compose.ui.text.font.n1;
import androidx.compose.ui.text.font.y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFontResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,72:1\n75#2:73\n381#3,7:74\n*S KotlinDebug\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n*L\n53#1:73\n66#1:74,7\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f381104a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b0("cacheLock")
    @NotNull
    private static final Map<y, n1> f381105b = new LinkedHashMap();

    @l(level = n.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @b1(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @NotNull
    @o
    @p4
    public static final n1 a(@NotNull y yVar, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(-190831095, i10, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:51)");
        }
        n1 n1VarB = b((Context) c0Var.W(AndroidCompositionLocals_androidKt.g()), yVar);
        if (m0.l0()) {
            m0.z0();
        }
        return n1VarB;
    }

    @l(level = n.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @b1(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    private static final n1 b(Context context, y yVar) {
        n1 n1Var;
        if (!(yVar instanceof m1) && !(yVar instanceof a1)) {
            return m.d(context, yVar, null, 4, null);
        }
        synchronized (f381104a) {
            try {
                Map<y, n1> map = f381105b;
                n1 n1VarD = map.get(yVar);
                if (n1VarD == null) {
                    n1VarD = m.d(context, yVar, null, 4, null);
                    map.put(yVar, n1VarD);
                }
                n1Var = n1VarD;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n1Var;
    }
}
