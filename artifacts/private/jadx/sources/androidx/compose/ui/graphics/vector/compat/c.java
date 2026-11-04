package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.graphics.m2;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.graphics.s3;
import androidx.compose.ui.graphics.u3;
import androidx.compose.ui.graphics.v3;
import androidx.compose.ui.graphics.vector.d;
import androidx.compose.ui.graphics.vector.j;
import androidx.compose.ui.graphics.vector.s;
import androidx.compose.ui.unit.h;
import androidx.core.content.res.n;
import com.planner5d.library.engine.input.f;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nXmlVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,693:1\n1#2:694\n123#3:695\n123#3:696\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n*L\n234#1:695\n235#1:696\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f38354a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f38355b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38356c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38357d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38358e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f38359f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f38360g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f38361h = "clip-path";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f38362i = "group";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f38363j = "path";

    @NotNull
    public static final d.a a(@NotNull a aVar, @NotNull Resources resources, @Nullable Resources.Theme theme, @NotNull AttributeSet attributeSet) throws XmlPullParserException {
        long jU;
        int iZ;
        ColorStateList colorStateListJ;
        b bVar = b.f38328a;
        TypedArray typedArrayP = aVar.p(resources, theme, attributeSet, bVar.H());
        boolean zI = aVar.i(typedArrayP, "autoMirrored", bVar.b(), false);
        float fL = aVar.l(typedArrayP, "viewportWidth", bVar.J(), 0.0f);
        float fL2 = aVar.l(typedArrayP, "viewportHeight", bVar.I(), 0.0f);
        if (fL <= 0.0f) {
            throw new XmlPullParserException(typedArrayP.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fL2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayP.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float f10 = aVar.f(typedArrayP, bVar.K(), 0.0f);
        float f11 = aVar.f(typedArrayP, bVar.o(), 0.0f);
        if (typedArrayP.hasValue(bVar.F())) {
            TypedValue typedValue = new TypedValue();
            typedArrayP.getValue(bVar.F(), typedValue);
            jU = (typedValue.type == 2 || (colorStateListJ = aVar.j(typedArrayP, theme, "tint", bVar.F())) == null) ? q0.f38131b.u() : s0.b(colorStateListJ.getDefaultColor());
        } else {
            jU = q0.f38131b.u();
        }
        long j10 = jU;
        int iH = aVar.h(typedArrayP, bVar.G(), -1);
        if (iH == -1) {
            iZ = d0.f37693b.z();
        } else if (iH == 3) {
            iZ = d0.f37693b.B();
        } else if (iH == 5) {
            iZ = d0.f37693b.z();
        } else if (iH != 9) {
            switch (iH) {
                case 14:
                    iZ = d0.f37693b.q();
                    break;
                case 15:
                    iZ = d0.f37693b.v();
                    break;
                case 16:
                    iZ = d0.f37693b.t();
                    break;
                default:
                    iZ = d0.f37693b.z();
                    break;
            }
        } else {
            iZ = d0.f37693b.y();
        }
        int i10 = iZ;
        float fR = h.r(f10 / resources.getDisplayMetrics().density);
        float fR2 = h.r(f11 / resources.getDisplayMetrics().density);
        typedArrayP.recycle();
        return new d.a(null, fR, fR2, fL, fL2, j10, i10, zI, 1, null);
    }

    private static final int b(int i10, int i11) {
        if (i10 == 0) {
            return u3.f38256b.a();
        }
        if (i10 != 1) {
            return i10 != 2 ? i11 : u3.f38256b.c();
        }
        return u3.f38256b.b();
    }

    static /* synthetic */ int c(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = u3.f38256b.a();
        }
        return b(i10, i11);
    }

    private static final int d(int i10, int i11) {
        if (i10 == 0) {
            return v3.f38275b.b();
        }
        if (i10 != 1) {
            return i10 != 2 ? i11 : v3.f38275b.a();
        }
        return v3.f38275b.c();
    }

    static /* synthetic */ int e(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = v3.f38275b.b();
        }
        return d(i10, i11);
    }

    public static final boolean f(@NotNull XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    private static final i0 g(androidx.core.content.res.d dVar) {
        if (!dVar.l()) {
            return null;
        }
        Shader shaderF = dVar.f();
        return shaderF != null ? j0.a(shaderF) : new s3(s0.b(dVar.e()), null);
    }

    public static final void h(@NotNull a aVar, @NotNull Resources resources, @Nullable Resources.Theme theme, @NotNull AttributeSet attributeSet, @NotNull d.a aVar2) {
        b bVar = b.f38328a;
        TypedArray typedArrayP = aVar.p(resources, theme, attributeSet, bVar.c());
        String strN = aVar.n(typedArrayP, bVar.d());
        if (strN == null) {
            strN = "";
        }
        String str = strN;
        String strN2 = aVar.n(typedArrayP, bVar.e());
        List listH = strN2 == null ? s.h() : j.e(aVar.f38327c, strN2, null, 2, null);
        typedArrayP.recycle();
        d.a.b(aVar2, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, listH, f.b.X1, null);
    }

    public static final int i(@NotNull a aVar, @NotNull Resources resources, @NotNull AttributeSet attributeSet, @Nullable Resources.Theme theme, @NotNull d.a aVar2, int i10) throws XmlPullParserException {
        int eventType = aVar.o().getEventType();
        if (eventType == 2) {
            String name = aVar.o().getName();
            if (name != null) {
                int iHashCode = name.hashCode();
                if (iHashCode != -1649314686) {
                    if (iHashCode == 3433509) {
                        if (name.equals(f38363j)) {
                            l(aVar, resources, theme, attributeSet, aVar2);
                            return i10;
                        }
                    } else if (iHashCode == 98629247 && name.equals("group")) {
                        k(aVar, resources, theme, attributeSet, aVar2);
                        return i10;
                    }
                } else if (name.equals(f38361h)) {
                    h(aVar, resources, theme, attributeSet, aVar2);
                    i10++;
                }
            }
        } else if (eventType == 3 && Intrinsics.areEqual("group", aVar.o().getName())) {
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                aVar2.g();
            }
            return 0;
        }
        return i10;
    }

    public static /* synthetic */ int j(a aVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, d.a aVar2, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            theme = null;
        }
        return i(aVar, resources, attributeSet, theme, aVar2, i10);
    }

    public static final void k(@NotNull a aVar, @NotNull Resources resources, @Nullable Resources.Theme theme, @NotNull AttributeSet attributeSet, @NotNull d.a aVar2) {
        b bVar = b.f38328a;
        TypedArray typedArrayP = aVar.p(resources, theme, attributeSet, bVar.f());
        float fL = aVar.l(typedArrayP, androidx.constraintlayout.motion.widget.f.f45124i, bVar.j(), 0.0f);
        float fG = aVar.g(typedArrayP, bVar.h(), 0.0f);
        float fG2 = aVar.g(typedArrayP, bVar.i(), 0.0f);
        float fL2 = aVar.l(typedArrayP, "scaleX", bVar.k(), 1.0f);
        float fL3 = aVar.l(typedArrayP, "scaleY", bVar.l(), 1.0f);
        float fL4 = aVar.l(typedArrayP, "translateX", bVar.m(), 0.0f);
        float fL5 = aVar.l(typedArrayP, "translateY", bVar.n(), 0.0f);
        String strN = aVar.n(typedArrayP, bVar.g());
        if (strN == null) {
            strN = "";
        }
        typedArrayP.recycle();
        aVar2.a(strN, fL, fG, fG2, fL2, fL3, fL4, fL5, s.h());
    }

    public static final void l(@NotNull a aVar, @NotNull Resources resources, @Nullable Resources.Theme theme, @NotNull AttributeSet attributeSet, @NotNull d.a aVar2) throws IllegalArgumentException {
        b bVar = b.f38328a;
        TypedArray typedArrayP = aVar.p(resources, theme, attributeSet, bVar.q());
        if (!n.r(aVar.o(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strN = aVar.n(typedArrayP, bVar.t());
        if (strN == null) {
            strN = "";
        }
        String str = strN;
        String strN2 = aVar.n(typedArrayP, bVar.u());
        List<? extends androidx.compose.ui.graphics.vector.h> listH = strN2 == null ? s.h() : j.e(aVar.f38327c, strN2, null, 2, null);
        androidx.core.content.res.d dVarK = aVar.k(typedArrayP, theme, "fillColor", bVar.s(), 0);
        float fL = aVar.l(typedArrayP, "fillAlpha", bVar.r(), 1.0f);
        int iB = b(aVar.m(typedArrayP, "strokeLineCap", bVar.x(), -1), u3.f38256b.a());
        int iD = d(aVar.m(typedArrayP, "strokeLineJoin", bVar.y(), -1), v3.f38275b.a());
        float fL2 = aVar.l(typedArrayP, "strokeMiterLimit", bVar.z(), 1.0f);
        androidx.core.content.res.d dVarK2 = aVar.k(typedArrayP, theme, "strokeColor", bVar.w(), 0);
        float fL3 = aVar.l(typedArrayP, "strokeAlpha", bVar.v(), 1.0f);
        float fL4 = aVar.l(typedArrayP, "strokeWidth", bVar.A(), 1.0f);
        float fL5 = aVar.l(typedArrayP, "trimPathEnd", bVar.B(), 1.0f);
        float fL6 = aVar.l(typedArrayP, "trimPathOffset", bVar.D(), 0.0f);
        float fL7 = aVar.l(typedArrayP, "trimPathStart", bVar.E(), 0.0f);
        int iM = aVar.m(typedArrayP, "fillType", bVar.C(), f38360g);
        typedArrayP.recycle();
        aVar2.c(listH, iM == 0 ? m2.f38048b.b() : m2.f38048b.a(), str, g(dVarK), fL, g(dVarK2), fL3, fL4, iB, iD, fL2, fL7, fL5, fL6);
    }

    @NotNull
    public static final XmlPullParser m(@NotNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
