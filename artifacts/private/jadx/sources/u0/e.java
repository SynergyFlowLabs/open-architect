package u0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.annotation.v;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.vector.u;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,122:1\n75#2:123\n75#2:124\n75#2:125\n75#2:132\n1282#3,6:126\n*S KotlinDebug\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n*L\n58#1:123\n60#1:124\n61#1:125\n89#1:132\n72#1:126,6\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f381114a = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP";

    private static final t1 a(CharSequence charSequence, Resources resources, int i10) {
        try {
            return c.b(t1.f38233a, resources, i10);
        } catch (Exception e10) {
            throw new h("Error attempting to load resource: " + ((Object) charSequence), e10);
        }
    }

    @o
    private static final androidx.compose.ui.graphics.vector.d b(Resources.Theme theme, Resources resources, int i10, int i11, c0 c0Var, int i12) throws XmlPullParserException {
        if (m0.l0()) {
            m0.A0(21855625, i12, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:87)");
        }
        d dVar = (d) c0Var.W(AndroidCompositionLocals_androidKt.h());
        d.b bVar = new d.b(theme, i10);
        d.a aVarB = dVar.b(bVar);
        if (aVarB == null) {
            XmlResourceParser xml = resources.getXml(i10);
            if (!Intrinsics.areEqual(androidx.compose.ui.graphics.vector.compat.c.m(xml).getName(), "vector")) {
                throw new IllegalArgumentException(f381114a);
            }
            aVarB = j.a(theme, resources, xml, i11);
            dVar.d(bVar, aVarB);
        }
        androidx.compose.ui.graphics.vector.d dVarF = aVarB.f();
        if (m0.l0()) {
            m0.z0();
        }
        return dVarF;
    }

    @o
    @NotNull
    public static final androidx.compose.ui.graphics.painter.b c(@v int i10, @Nullable c0 c0Var, int i11) {
        androidx.compose.ui.graphics.painter.b bVarJ;
        if (m0.l0()) {
            m0.A0(473971343, i11, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        Resources resources = (Resources) c0Var.W(AndroidCompositionLocals_androidKt.k());
        TypedValue typedValueB = ((g) c0Var.W(AndroidCompositionLocals_androidKt.j())).b(resources, i10);
        CharSequence charSequence = typedValueB.string;
        boolean z10 = true;
        if (charSequence == null || !StringsKt.b3(charSequence, ".xml", false, 2, null)) {
            c0Var.E(-1771631096);
            Object theme = context.getTheme();
            boolean zD = c0Var.D(charSequence);
            if ((((i11 & 14) ^ 6) <= 4 || !c0Var.K(i10)) && (i11 & 6) != 4) {
                z10 = false;
            }
            boolean zD2 = c0Var.D(theme) | zD | z10;
            Object objI0 = c0Var.i0();
            if (zD2 || objI0 == c0.f35327a.a()) {
                objI0 = a(charSequence, resources, i10);
                c0Var.Y(objI0);
            }
            BitmapPainter bitmapPainter = new BitmapPainter((t1) objI0, 0L, 0L, 6, null);
            c0Var.A();
            bVarJ = bitmapPainter;
        } else {
            c0Var.E(-1771786530);
            bVarJ = u.j(b(context.getTheme(), resources, i10, typedValueB.changingConfigurations, c0Var, (i11 << 6) & 896), c0Var, 0);
            c0Var.A();
        }
        if (m0.l0()) {
            m0.z0();
        }
        return bVarJ;
    }
}
