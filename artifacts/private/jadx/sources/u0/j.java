package u0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.v;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nVectorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n75#2:143\n75#2:144\n1282#3,6:145\n1#4:151\n*S KotlinDebug\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n*L\n50#1:143\n51#1:144\n54#1:145,6\n*E\n"})
public final class j {
    @NotNull
    public static final d.a a(@Nullable Resources.Theme theme, @NotNull Resources resources, @NotNull XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        androidx.compose.ui.graphics.vector.compat.a aVar = new androidx.compose.ui.graphics.vector.compat.a(xmlResourceParser, 0, 2, null);
        androidx.compose.ui.graphics.vector.d.a aVarA = androidx.compose.ui.graphics.vector.compat.c.a(aVar, resources, theme, attributeSetAsAttributeSet);
        int i11 = 0;
        while (!androidx.compose.ui.graphics.vector.compat.c.f(xmlResourceParser)) {
            i11 = androidx.compose.ui.graphics.vector.compat.c.i(aVar, resources, attributeSetAsAttributeSet, theme, aVarA, i11);
            xmlResourceParser.next();
        }
        return new d.a(aVarA.f(), aVar.e() | i10);
    }

    public static /* synthetic */ d.a b(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10, int i11, Object obj) throws XmlPullParserException {
        if ((i11 & 1) != 0) {
            theme = null;
        }
        return a(theme, resources, xmlResourceParser, i10);
    }

    @o
    @NotNull
    public static final androidx.compose.ui.graphics.vector.d c(@NotNull androidx.compose.ui.graphics.vector.d.b bVar, @v int i10, @Nullable c0 c0Var, int i11) throws XmlPullParserException, IOException {
        if (m0.l0()) {
            m0.A0(44534090, i11, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:48)");
        }
        Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        Resources resources = (Resources) c0Var.W(AndroidCompositionLocals_androidKt.k());
        Resources.Theme theme = context.getTheme();
        boolean zD = ((((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.K(i10)) || (i11 & 48) == 32) | c0Var.D(resources) | c0Var.D(theme) | c0Var.D(resources.getConfiguration());
        Object objI0 = c0Var.i0();
        if (zD || objI0 == c0.f35327a.a()) {
            objI0 = d(bVar, theme, resources, i10);
            c0Var.Y(objI0);
        }
        androidx.compose.ui.graphics.vector.d dVar = (androidx.compose.ui.graphics.vector.d) objI0;
        if (m0.l0()) {
            m0.z0();
        }
        return dVar;
    }

    @NotNull
    public static final androidx.compose.ui.graphics.vector.d d(@NotNull androidx.compose.ui.graphics.vector.d.b bVar, @Nullable Resources.Theme theme, @NotNull Resources resources, int i10) throws XmlPullParserException, IOException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        XmlResourceParser xml = resources.getXml(i10);
        androidx.compose.ui.graphics.vector.compat.c.m(xml);
        Unit unit = Unit.f312394a;
        return a(theme, resources, xml, typedValue.changingConfigurations).f();
    }

    public static /* synthetic */ androidx.compose.ui.graphics.vector.d e(androidx.compose.ui.graphics.vector.d.b bVar, Resources.Theme theme, Resources resources, int i10, int i11, Object obj) throws XmlPullParserException {
        if ((i11 & 1) != 0) {
            theme = null;
        }
        return d(bVar, theme, resources, i10);
    }
}
