package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.o;
import androidx.compose.ui.semantics.u;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.util.d;
import androidx.core.view.accessibility.j;
import com.rabbitmq.client.k0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import n0.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCollectionInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,158:1\n35#2,5:159\n35#2,5:164\n368#2,7:169\n375#2,3:186\n399#2,6:189\n65#3:176\n69#3:179\n71#3:195\n65#3:196\n73#3:199\n69#3:200\n60#4:177\n70#4:180\n53#4,3:183\n60#4:197\n70#4:201\n22#5:178\n22#5:181\n22#5:198\n30#6:182\n*S KotlinDebug\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n*L\n43#1:159,5\n87#1:164,5\n124#1:169,7\n124#1:186,3\n133#1:189,6\n126#1:176\n127#1:179\n130#1:195\n130#1:196\n130#1:199\n130#1:200\n126#1:177\n127#1:180\n125#1:183,3\n130#1:197\n130#1:201\n126#1:178\n127#1:181\n130#1:198\n125#1:182\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: androidx.compose.ui.platform.accessibility.a$a, reason: collision with other inner class name */
    static final class C0314a extends l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0314a f40285a = new C0314a();

        C0314a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class b extends l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40286a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List<u> list) {
        List listEmptyList;
        long jB;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            u uVar = list.get(0);
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i10 = 0;
            while (i10 < lastIndex) {
                i10++;
                u uVar2 = list.get(i10);
                u uVar3 = uVar2;
                u uVar4 = uVar;
                arrayList.add(g.d(g.g((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (uVar4.m().o() >> 32)) - Float.intBitsToFloat((int) (uVar3.m().o() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (uVar4.m().o() & k0.f265952a)) - Float.intBitsToFloat((int) (uVar3.m().o() & k0.f265952a))))) & k0.f265952a))));
                uVar = uVar2;
            }
            listEmptyList = arrayList;
        }
        if (listEmptyList.size() == 1) {
            jB = ((g) CollectionsKt.first(listEmptyList)).B();
        } else {
            if (listEmptyList.isEmpty()) {
                d.H("Empty collection can't be reduced.");
            }
            Object objFirst = CollectionsKt.first((List<? extends Object>) listEmptyList);
            int lastIndex2 = CollectionsKt.getLastIndex(listEmptyList);
            if (1 <= lastIndex2) {
                int i11 = 1;
                while (true) {
                    objFirst = g.d(g.w(((g) objFirst).B(), ((g) listEmptyList.get(i11)).B()));
                    if (i11 == lastIndex2) {
                        break;
                    }
                    i11++;
                }
            }
            jB = ((g) objFirst).B();
        }
        return Float.intBitsToFloat((int) (k0.f265952a & jB)) < Float.intBitsToFloat((int) (jB >> 32));
    }

    public static final boolean b(@NotNull u uVar) {
        SemanticsConfiguration semanticsConfigurationR = uVar.r();
        z zVar = z.f41190a;
        return (o.a(semanticsConfigurationR, zVar.a()) == null && o.a(uVar.r(), zVar.G()) == null) ? false : true;
    }

    private static final boolean c(androidx.compose.ui.semantics.b bVar) {
        return bVar.b() < 0 || bVar.a() < 0;
    }

    public static final void d(@NotNull u uVar, @NotNull j jVar) {
        SemanticsConfiguration semanticsConfigurationR = uVar.r();
        z zVar = z.f41190a;
        androidx.compose.ui.semantics.b bVar = (androidx.compose.ui.semantics.b) o.a(semanticsConfigurationR, zVar.a());
        if (bVar != null) {
            jVar.l1(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (o.a(uVar.r(), zVar.G()) != null) {
            List<u> listB = uVar.B();
            int size = listB.size();
            for (int i10 = 0; i10 < size; i10++) {
                u uVar2 = listB.get(i10);
                if (uVar2.r().i(z.f41190a.H())) {
                    arrayList.add(uVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zA = a(arrayList);
        jVar.l1(j.f.h(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
    }

    public static final void e(@NotNull u uVar, @NotNull j jVar) {
        SemanticsConfiguration semanticsConfigurationR = uVar.r();
        z zVar = z.f41190a;
        c cVar = (c) o.a(semanticsConfigurationR, zVar.b());
        if (cVar != null) {
            jVar.m1(g(cVar, uVar));
        }
        u uVarX = uVar.x();
        if (uVarX == null || o.a(uVarX.r(), zVar.G()) == null) {
            return;
        }
        androidx.compose.ui.semantics.b bVar = (androidx.compose.ui.semantics.b) o.a(uVarX.r(), zVar.a());
        if ((bVar == null || !c(bVar)) && uVar.r().i(zVar.H())) {
            ArrayList arrayList = new ArrayList();
            List<u> listB = uVarX.B();
            int size = listB.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                u uVar2 = listB.get(i11);
                if (uVar2.r().i(z.f41190a.H())) {
                    arrayList.add(uVar2);
                    if (uVar2.u().K0() < uVar.u().K0()) {
                        i10++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zA = a(arrayList);
            j.g gVarJ = j.g.j(zA ? 0 : i10, 1, zA ? i10 : 0, 1, false, ((Boolean) uVar.r().p(z.f41190a.H(), C0314a.f40285a)).booleanValue());
            if (gVarJ != null) {
                jVar.m1(gVarJ);
            }
        }
    }

    private static final j.f f(androidx.compose.ui.semantics.b bVar) {
        return j.f.h(bVar.b(), bVar.a(), false, 0);
    }

    private static final j.g g(c cVar, u uVar) {
        boolean z10 = true & false;
        return j.g.j(cVar.c(), cVar.d(), cVar.a(), cVar.b(), false, ((Boolean) uVar.r().p(z.f41190a.H(), b.f40286a)).booleanValue());
    }
}
