package androidx.compose.ui.graphics;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPathSvg.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathSvg.kt\nandroidx/compose/ui/graphics/PathSvgKt\n+ 2 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n1#1,128:1\n57#2,6:129\n*S KotlinDebug\n*F\n+ 1 PathSvg.kt\nandroidx/compose/ui/graphics/PathSvgKt\n*L\n64#1:129,6\n*E\n"})
public final class x2 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38687a;

        static {
            int[] iArr = new int[v2.a.values().length];
            try {
                iArr[v2.a.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v2.a.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v2.a.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v2.a.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[v2.a.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[v2.a.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[v2.a.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f38687a = iArr;
        }
    }

    public static final void a(@NotNull k2 k2Var, @NotNull String str) {
        new androidx.compose.ui.graphics.vector.j().c(str).h(k2Var);
    }

    private static final String b(v2.a aVar, v2.a aVar2) {
        if (aVar == aVar2) {
            return " ";
        }
        int i10 = a.f38687a[aVar.ordinal()];
        if (i10 == 1) {
            return "M";
        }
        if (i10 == 2) {
            return "L";
        }
        if (i10 == 3) {
            return "Q";
        }
        if (i10 != 5) {
            return i10 != 6 ? "" : org.locationtech.jts.io.gml2.a.f338505w;
        }
        return "C";
    }

    @NotNull
    public static final String c(@NotNull k2 k2Var, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        n0.j bounds = k2Var.getBounds();
        if (z10) {
            sb2.append("<svg xmlns=\"http://www.w3.org/2000/svg\" ");
            sb2.append("viewBox=\"" + bounds.t() + ' ' + bounds.B() + ' ' + (bounds.x() - bounds.t()) + ' ' + (bounds.j() - bounds.B()) + "\">");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        }
        q2 it = k2Var.iterator();
        float[] fArr = new float[8];
        v2.a aVar = v2.a.Done;
        if (it.hasNext()) {
            if (z10) {
                if (m2.f(k2Var.x(), m2.f38048b.a())) {
                    sb2.append("  <path fill-rule=\"evenodd\" d=\"");
                } else {
                    sb2.append("  <path d=\"");
                }
            }
            while (it.hasNext()) {
                v2.a aVarW = q2.W(it, fArr, 0, 2, null);
                switch (a.f38687a[aVarW.ordinal()]) {
                    case 1:
                        sb2.append(b(v2.a.Move, aVar) + fArr[0] + ' ' + fArr[1]);
                        aVar = aVarW;
                        break;
                    case 2:
                        sb2.append(b(v2.a.Line, aVar) + fArr[2] + ' ' + fArr[3]);
                        aVar = aVarW;
                        break;
                    case 3:
                        sb2.append(b(v2.a.Quadratic, aVar));
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(fArr[2]);
                        sb3.append(' ');
                        sb3.append(fArr[3]);
                        sb3.append(' ');
                        sb3.append(fArr[4]);
                        sb3.append(' ');
                        sb3.append(fArr[5]);
                        sb2.append(sb3.toString());
                        aVar = aVarW;
                        break;
                    case 4:
                    case 7:
                        break;
                    case 5:
                        sb2.append(b(v2.a.Cubic, aVar));
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(fArr[2]);
                        sb4.append(' ');
                        sb4.append(fArr[3]);
                        sb4.append(' ');
                        sb2.append(sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(fArr[4]);
                        sb5.append(' ');
                        sb5.append(fArr[5]);
                        sb5.append(' ');
                        sb2.append(sb5.toString());
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(fArr[6]);
                        sb6.append(' ');
                        sb6.append(fArr[7]);
                        sb2.append(sb6.toString());
                        aVar = aVarW;
                        break;
                    case 6:
                        sb2.append(b(v2.a.Close, aVar));
                        aVar = aVarW;
                        break;
                    default:
                        throw new kotlin.k0();
                }
            }
            if (z10) {
                sb2.append("\"/>");
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                sb2.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        if (z10) {
            sb2.append("</svg>");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String d(k2 k2Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(k2Var, z10);
    }
}
