package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.node.x1;
import androidx.compose.ui.platform.s;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.n;
import androidx.compose.ui.semantics.o;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.text.o3;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.y3;
import io.sentry.android.replay.util.k;
import io.sentry.android.replay.util.p;
import io.sentry.android.replay.util.r;
import io.sentry.android.replay.x;
import io.sentry.n8;
import io.sentry.p8;
import io.sentry.y7;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@e.b(26)
@SourceDebugExtension({"SMAP\nComposeViewHierarchyNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ComposeViewHierarchyNode\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,310:1\n652#2:311\n*S KotlinDebug\n*F\n+ 1 ComposeViewHierarchyNode.kt\nio/sentry/android/replay/viewhierarchy/ComposeViewHierarchyNode\n*L\n187#1:311\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f305070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private static WeakReference<g0> f305071d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f305068a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final f0 f305069b = kotlin.g0.c(C2219a.f305073a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f305072e = 8;

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.a$a, reason: collision with other inner class name */
    static final class C2219a extends l0 implements Function0<Method> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2219a f305073a = new C2219a();

        C2219a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Method invoke() {
            try {
                Method declaredMethod = androidx.compose.ui.node.l0.class.getDeclaredMethod("q0", null);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    private a() {
    }

    private final b a(androidx.compose.ui.node.l0 l0Var, b bVar, int i10, boolean z10, n8 n8Var) {
        o3 o3VarL;
        y3 y3VarM;
        o3 o3VarL2;
        y3 y3VarM2;
        androidx.compose.ui.semantics.a aVar;
        Function1 function1;
        if (!l0Var.J() || !l0Var.I()) {
            return null;
        }
        if (z10) {
            f305071d = new WeakReference<>(h0.d(l0Var.n()));
        }
        g0 g0VarN = l0Var.n();
        WeakReference<g0> weakReference = f305071d;
        Rect rectA = k.a(g0VarN, weakReference != null ? weakReference.get() : null);
        try {
            SemanticsConfiguration semanticsConfigurationF = f(l0Var);
            boolean z11 = !l0Var.F0().z5() && (semanticsConfigurationF == null || !semanticsConfigurationF.i(z.f41190a.p())) && rectA.height() > 0 && rectA.width() > 0;
            boolean z12 = (semanticsConfigurationF != null && semanticsConfigurationF.i(n.f41142a.B())) || (semanticsConfigurationF != null && semanticsConfigurationF.i(z.f41190a.g()));
            if ((semanticsConfigurationF != null && semanticsConfigurationF.i(z.f41190a.L())) || z12) {
                boolean z13 = z11 && g(semanticsConfigurationF, false, n8Var);
                if (bVar != null) {
                    bVar.q(true);
                }
                ArrayList arrayList = new ArrayList();
                if (semanticsConfigurationF != null && (aVar = (androidx.compose.ui.semantics.a) o.a(semanticsConfigurationF, n.f41142a.i())) != null && (function1 = (Function1) aVar.a()) != null) {
                }
                p pVarH = k.h(l0Var);
                q0 q0VarA = pVarH.a();
                boolean zB = pVarH.b();
                p3 p3Var = (p3) CollectionsKt.firstOrNull((List) arrayList);
                q0 q0VarN = (p3Var == null || (o3VarL2 = p3Var.l()) == null || (y3VarM2 = o3VarL2.m()) == null) ? null : q0.n(y3VarM2.t());
                if (q0VarN == null || q0VarN.M() != q0.f38131b.u()) {
                    q0VarA = q0VarN;
                }
                androidx.compose.ui.unit.z zVarC = (p3Var == null || (o3VarL = p3Var.l()) == null || (y3VarM = o3VarL.m()) == null) ? null : androidx.compose.ui.unit.z.c(y3VarM.x());
                return new b.e((p3Var == null || z12 || (zVarC != null ? androidx.compose.ui.unit.z.j(zVarC.w(), androidx.compose.ui.unit.z.f42728b.b()) : false)) ? null : new io.sentry.android.replay.util.b(p3Var, zB), q0VarA != null ? Integer.valueOf(r.j(s0.t(q0VarA.M()))) : null, 0, 0, rectA.left, rectA.top, l0Var.getWidth(), l0Var.getHeight(), bVar != null ? bVar.e() : 0.0f, i10, bVar, z13, true, z11, rectA, 12, null);
            }
            androidx.compose.ui.graphics.painter.b bVarG = k.g(l0Var);
            if (bVarG == null) {
                boolean z14 = false;
                if (z11 && g(semanticsConfigurationF, false, n8Var)) {
                    z14 = true;
                }
                return new b.C2220b(rectA.left, rectA.top, l0Var.getWidth(), l0Var.getHeight(), bVar != null ? bVar.e() : 0.0f, i10, bVar, z14, false, z11, rectA);
            }
            boolean z15 = z11 && g(semanticsConfigurationF, true, n8Var);
            if (bVar != null) {
                bVar.q(true);
            }
            float f10 = rectA.left;
            float f11 = rectA.top;
            int width = l0Var.getWidth();
            boolean z16 = false;
            int height = l0Var.getHeight();
            float fE = bVar != null ? bVar.e() : 0.0f;
            if (z15 && k.i(bVarG)) {
                z16 = true;
            }
            return new b.c(f10, f11, width, height, fE, i10, bVar, z16, true, z11, rectA);
        } catch (Throwable th2) {
            if (!f305070c) {
                f305070c = true;
                n8Var.getLogger().b(y7.ERROR, th2, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.8.0.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
            }
            return new b.C2220b(rectA.left, rectA.top, l0Var.getWidth(), l0Var.getHeight(), bVar != null ? bVar.e() : 0.0f, i10, bVar, true, false, !l0Var.F0().z5() && rectA.height() > 0 && rectA.width() > 0, rectA);
        }
    }

    private final Method c() {
        return (Method) f305069b.getValue();
    }

    private final String d(boolean z10, SemanticsConfiguration semanticsConfiguration) {
        if (z10) {
            return p8.f306016p;
        }
        if (semanticsConfiguration == null) {
            return s.S;
        }
        z zVar = z.f41190a;
        return (semanticsConfiguration.i(zVar.L()) || semanticsConfiguration.i(n.f41142a.B()) || semanticsConfiguration.i(zVar.g())) ? "android.widget.TextView" : s.S;
    }

    private static /* synthetic */ void e() {
    }

    @oj.n
    @Nullable
    public static final SemanticsConfiguration f(@NotNull androidx.compose.ui.node.l0 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        Method methodC = f305068a.c();
        return methodC != null ? (SemanticsConfiguration) methodC.invoke(node, null) : node.getCollapsedSemantics$ui_release();
    }

    private final boolean g(SemanticsConfiguration semanticsConfiguration, boolean z10, n8 n8Var) {
        String str = semanticsConfiguration != null ? (String) o.a(semanticsConfiguration, x.f305111a.a()) : null;
        if (Intrinsics.areEqual(str, "unmask")) {
            return false;
        }
        if (Intrinsics.areEqual(str, "mask")) {
            return true;
        }
        String strD = d(z10, semanticsConfiguration);
        if (n8Var.getSessionReplay().m().contains(strD)) {
            return false;
        }
        return n8Var.getSessionReplay().e().contains(strD);
    }

    private final void h(androidx.compose.ui.node.l0 l0Var, b bVar, boolean z10, n8 n8Var) {
        List<androidx.compose.ui.node.l0> listZ = l0Var.Z();
        if (listZ.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(listZ.size());
        int size = listZ.size();
        int i10 = 0;
        while (i10 < size) {
            androidx.compose.ui.node.l0 l0Var2 = listZ.get(i10);
            a aVar = this;
            b bVar2 = bVar;
            boolean z11 = z10;
            n8 n8Var2 = n8Var;
            b bVarA = aVar.a(l0Var2, bVar2, i10, z11, n8Var2);
            if (bVarA != null) {
                arrayList.add(bVarA);
                aVar.h(l0Var2, bVarA, false, n8Var2);
            }
            i10++;
            this = aVar;
            bVar = bVar2;
            z10 = z11;
            n8Var = n8Var2;
        }
        bVar.p(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(@NotNull View view, @Nullable b bVar, @NotNull n8 options) {
        androidx.compose.ui.node.l0 root;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (!StringsKt.V2(name, "AndroidComposeView", false, 2, null) || bVar == null) {
            return false;
        }
        try {
            x1 x1Var = view instanceof x1 ? (x1) view : null;
            if (x1Var != null && (root = x1Var.getRoot()) != null) {
                h(root, bVar, true, options);
                return true;
            }
            return false;
        } catch (Throwable th2) {
            options.getLogger().b(y7.ERROR, th2, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
            return false;
        }
    }
}
