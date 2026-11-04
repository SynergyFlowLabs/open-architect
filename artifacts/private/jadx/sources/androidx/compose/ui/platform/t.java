package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3354:1\n65#2,10:3355\n26#3:3365\n1#4:3366\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n*L\n3238#1:3355,10\n3245#1:3365\n*E\n"})
public final class t {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40884a;

        static {
            int[] iArr = new int[v0.a.values().length];
            try {
                iArr[v0.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v0.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v0.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40884a = iArr;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.l0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40885a = new b();

        b() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001e  */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.node.l0 l0Var) {
            boolean z10;
            SemanticsConfiguration semanticsConfigurationQ0 = l0Var.q0();
            if (semanticsConfigurationQ0 != null) {
                z10 = semanticsConfigurationQ0.v() && semanticsConfigurationQ0.i(androidx.compose.ui.semantics.z.f41190a.g());
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.semantics.u, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.collection.j0<androidx.compose.ui.semantics.w> f40886a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.collection.j0<androidx.compose.ui.semantics.w> j0Var) {
            super(1);
            this.f40886a = j0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.semantics.u uVar) {
            return Boolean.valueOf(this.f40886a.e(uVar.s()));
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.semantics.u, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Resources f40887a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Resources resources) {
            super(1);
            this.f40887a = resources;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.semantics.u uVar) {
            return Boolean.valueOf(t.w(uVar, this.f40887a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(androidx.compose.ui.semantics.a<?> aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.semantics.a)) {
            return false;
        }
        androidx.compose.ui.semantics.a aVar2 = (androidx.compose.ui.semantics.a) obj;
        if (!Intrinsics.areEqual(aVar.b(), aVar2.b())) {
            return false;
        }
        if (aVar.a() != null || aVar2.a() == null) {
            return aVar.a() == null || aVar2.a() != null;
        }
        return false;
    }

    private static final String m(androidx.compose.ui.semantics.u uVar, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        SemanticsConfiguration semanticsConfigurationR = uVar.b().r();
        androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
        Collection collection2 = (Collection) androidx.compose.ui.semantics.o.a(semanticsConfigurationR, zVar.d());
        if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) androidx.compose.ui.semantics.o.a(semanticsConfigurationR, zVar.L())) == null || collection.isEmpty()) && ((charSequence = (CharSequence) androidx.compose.ui.semantics.o.a(semanticsConfigurationR, zVar.g())) == null || charSequence.length() == 0))) {
            return resources.getString(androidx.compose.ui.d0.c.f37163o);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(androidx.compose.ui.semantics.u uVar) {
        return !uVar.r().i(androidx.compose.ui.semantics.z.f41190a.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(androidx.compose.ui.semantics.u uVar) {
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
        if (semanticsConfigurationF.i(zVar.g()) && !Intrinsics.areEqual(androidx.compose.ui.semantics.o.a(uVar.F(), zVar.i()), Boolean.TRUE)) {
            return true;
        }
        androidx.compose.ui.node.l0 l0VarP = p(uVar.u(), b.f40885a);
        if (l0VarP != null) {
            SemanticsConfiguration semanticsConfigurationQ0 = l0VarP.q0();
            if (!(semanticsConfigurationQ0 != null ? Intrinsics.areEqual(androidx.compose.ui.semantics.o.a(semanticsConfigurationQ0, zVar.i()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.node.l0 p(androidx.compose.ui.node.l0 l0Var, Function1<? super androidx.compose.ui.node.l0, Boolean> function1) {
        for (androidx.compose.ui.node.l0 l0VarJ0 = l0Var.J0(); l0VarJ0 != null; l0VarJ0 = l0VarJ0.J0()) {
            if (function1.invoke(l0VarJ0).booleanValue()) {
                return l0VarJ0;
            }
        }
        return null;
    }

    public static final boolean q() {
        return androidx.compose.ui.contentcapture.n.G.a();
    }

    @androidx.compose.ui.o
    @kotlin.l(level = kotlin.n.WARNING, message = "Use ContentCapture.isEnabled instead", replaceWith = @kotlin.b1(expression = "!ContentCaptureManager.isEnabled", imports = {"androidx.compose.ui.contentcapture.ContentCaptureManager.Companion.isEnabled"}))
    public static /* synthetic */ void r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(androidx.compose.ui.semantics.u uVar) {
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
        v0.a aVar = (v0.a) androidx.compose.ui.semantics.o.a(semanticsConfigurationF, zVar.O());
        androidx.compose.ui.semantics.j jVar = (androidx.compose.ui.semantics.j) androidx.compose.ui.semantics.o.a(uVar.F(), zVar.F());
        boolean z10 = aVar != null;
        if (((Boolean) androidx.compose.ui.semantics.o.a(uVar.F(), zVar.H())) != null) {
            if (!(jVar != null ? androidx.compose.ui.semantics.j.m(jVar.p(), androidx.compose.ui.semantics.j.f41124b.h()) : false)) {
                return true;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(androidx.compose.ui.semantics.u uVar, Resources resources) {
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
        Object objA = androidx.compose.ui.semantics.o.a(semanticsConfigurationF, zVar.J());
        v0.a aVar = (v0.a) androidx.compose.ui.semantics.o.a(uVar.F(), zVar.O());
        androidx.compose.ui.semantics.j jVar = (androidx.compose.ui.semantics.j) androidx.compose.ui.semantics.o.a(uVar.F(), zVar.F());
        int I = 0;
        if (aVar != null) {
            int i10 = a.f40884a[aVar.ordinal()];
            if (i10 == 1) {
                if ((jVar == null ? false : androidx.compose.ui.semantics.j.m(jVar.p(), androidx.compose.ui.semantics.j.f41124b.g())) && objA == null) {
                    objA = resources.getString(androidx.compose.ui.d0.c.f37165q);
                }
            } else if (i10 == 2) {
                if ((jVar == null ? false : androidx.compose.ui.semantics.j.m(jVar.p(), androidx.compose.ui.semantics.j.f41124b.g())) && objA == null) {
                    objA = resources.getString(androidx.compose.ui.d0.c.f37164p);
                }
            } else {
                if (i10 != 3) {
                    throw new kotlin.k0();
                }
                if (objA == null) {
                    objA = resources.getString(androidx.compose.ui.d0.c.f37156h);
                }
            }
        }
        Boolean bool = (Boolean) androidx.compose.ui.semantics.o.a(uVar.F(), zVar.H());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(jVar == null ? false : androidx.compose.ui.semantics.j.m(jVar.p(), androidx.compose.ui.semantics.j.f41124b.h())) && objA == null) {
                objA = zBooleanValue ? resources.getString(androidx.compose.ui.d0.c.f37161m) : resources.getString(androidx.compose.ui.d0.c.f37158j);
            }
        }
        androidx.compose.ui.semantics.i iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.o.a(uVar.F(), zVar.E());
        if (iVar != null) {
            if (iVar != androidx.compose.ui.semantics.i.f41108d.a()) {
                if (objA == null) {
                    kotlin.ranges.f<Float> fVarC = iVar.c();
                    float fB = ((fVarC.i().floatValue() - fVarC.u().floatValue()) > 0.0f ? 1 : ((fVarC.i().floatValue() - fVarC.u().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (iVar.b() - fVarC.u().floatValue()) / (fVarC.i().floatValue() - fVarC.u().floatValue());
                    if (fB < 0.0f) {
                        fB = 0.0f;
                    }
                    if (fB > 1.0f) {
                        fB = 1.0f;
                    }
                    if (!(fB == 0.0f)) {
                        I = (fB == 1.0f ? 1 : 0) != 0 ? 100 : kotlin.ranges.r.I(Math.round(fB * 100), 1, 99);
                    }
                    objA = resources.getString(androidx.compose.ui.d0.c.f37168t, Integer.valueOf(I));
                }
            } else if (objA == null) {
                objA = resources.getString(androidx.compose.ui.d0.c.f37155g);
            }
        }
        if (uVar.F().i(zVar.g())) {
            objA = m(uVar, resources);
        }
        return (String) objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.f u(androidx.compose.ui.semantics.u uVar) {
        SemanticsConfiguration semanticsConfigurationF = uVar.F();
        androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.z.f41190a;
        androidx.compose.ui.text.f fVar = (androidx.compose.ui.text.f) androidx.compose.ui.semantics.o.a(semanticsConfigurationF, zVar.g());
        List list = (List) androidx.compose.ui.semantics.o.a(uVar.F(), zVar.L());
        return fVar == null ? list != null ? (androidx.compose.ui.text.f) CollectionsKt.firstOrNull(list) : null : fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(androidx.compose.ui.semantics.u uVar) {
        return uVar.t().getLayoutDirection() == androidx.compose.ui.unit.w.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(androidx.compose.ui.semantics.u uVar, Resources resources) {
        List list = (List) androidx.compose.ui.semantics.o.a(uVar.F(), androidx.compose.ui.semantics.z.f41190a.d());
        return !androidx.compose.ui.semantics.y.i(uVar) && (uVar.F().v() || (uVar.K() && ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) != null || u(uVar) != null || t(uVar, resources) != null || s(uVar))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(androidx.compose.ui.semantics.u uVar, SemanticsConfiguration semanticsConfiguration) {
        Iterator<Map.Entry<? extends androidx.compose.ui.semantics.d0<?>, ? extends Object>> it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!uVar.r().i(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final void y(boolean z10) {
        androidx.compose.ui.contentcapture.n.G.c(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(androidx.collection.j0<androidx.compose.ui.semantics.w> j0Var, androidx.collection.q1 q1Var, androidx.collection.q1 q1Var2, Resources resources) {
        q1Var.P();
        q1Var2.P();
        androidx.compose.ui.semantics.w wVarN = j0Var.n(-1);
        androidx.compose.ui.semantics.u uVarB = wVarN != null ? wVarN.b() : null;
        Intrinsics.checkNotNull(uVarB);
        List<androidx.compose.ui.semantics.u> listG = androidx.compose.ui.semantics.i0.g(uVarB, new c(j0Var), new d(resources), CollectionsKt.listOf(uVarB));
        int lastIndex = CollectionsKt.getLastIndex(listG);
        int i10 = 1;
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int iS = listG.get(i10 - 1).s();
            int iS2 = listG.get(i10).s();
            q1Var.k0(iS, iS2);
            q1Var2.k0(iS2, iS);
            if (i10 == lastIndex) {
                return;
            } else {
                i10++;
            }
        }
    }
}
