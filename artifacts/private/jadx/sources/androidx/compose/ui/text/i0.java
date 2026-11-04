package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,157:1\n1280#2:158\n1282#2:164\n1281#2,3:165\n151#3,2:159\n35#3,3:161\n39#3:168\n153#3:169\n103#3:170\n35#3,5:171\n104#3:176\n169#3,12:177\n169#3,12:189\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n*L\n98#1:158\n98#1:164\n98#1:165,3\n98#1:159,2\n98#1:161,3\n98#1:168\n98#1:169\n125#1:170\n125#1:171,5\n125#1:176\n79#1:177,12\n85#1:189,12\n*E\n"})
public final class i0 implements q0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f41787f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f41788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<f.e<v0>> f41789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f41790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f41791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<p0> f41792e;

    public i0(@NotNull f fVar, @NotNull y3 y3Var, @NotNull List<f.e<v0>> list, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar) {
        this.f41788a = fVar;
        this.f41789b = list;
        kotlin.j0 j0Var = kotlin.j0.NONE;
        this.f41790c = kotlin.g0.b(j0Var, new Function0() { // from class: androidx.compose.ui.text.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(i0.k(this.f41782a));
            }
        });
        this.f41791d = kotlin.g0.b(j0Var, new Function0() { // from class: androidx.compose.ui.text.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(i0.j(this.f41784a));
            }
        });
        t0 t0VarN0 = y3Var.n0();
        List<f.e<t0>> listB = l.B(fVar, t0VarN0);
        ArrayList arrayList = new ArrayList(listB.size());
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            f.e<t0> eVar = listB.get(i10);
            f fVarC = l.C(fVar, eVar.i(), eVar.g());
            t0 t0VarL = l(eVar.h(), t0VarN0);
            String strM = fVarC.m();
            y3 y3VarC0 = y3Var.c0(t0VarL);
            List<f.e<? extends f.a>> listD = fVarC.d();
            if (listD == null) {
                listD = CollectionsKt.emptyList();
            }
            arrayList.add(new p0(r0.a(strM, y3VarC0, listD, dVar, bVar, j0.b(h(), eVar.i(), eVar.g())), eVar.i(), eVar.g()));
        }
        this.f41792e = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(i0 i0Var) {
        p0 p0Var;
        q0 q0VarG;
        List<p0> list = i0Var.f41792e;
        if (list.isEmpty()) {
            p0Var = null;
        } else {
            p0 p0Var2 = list.get(0);
            float fI = p0Var2.g().i();
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    p0 p0Var3 = list.get(i10);
                    float fI2 = p0Var3.g().i();
                    if (Float.compare(fI, fI2) < 0) {
                        p0Var2 = p0Var3;
                        fI = fI2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            p0Var = p0Var2;
        }
        p0 p0Var4 = p0Var;
        if (p0Var4 == null || (q0VarG = p0Var4.g()) == null) {
            return 0.0f;
        }
        return q0VarG.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(i0 i0Var) {
        p0 p0Var;
        q0 q0VarG;
        List<p0> list = i0Var.f41792e;
        if (list.isEmpty()) {
            p0Var = null;
        } else {
            p0 p0Var2 = list.get(0);
            float f10 = p0Var2.g().f();
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    p0 p0Var3 = list.get(i10);
                    float f11 = p0Var3.g().f();
                    if (Float.compare(f10, f11) < 0) {
                        p0Var2 = p0Var3;
                        f10 = f11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            p0Var = p0Var2;
        }
        p0 p0Var4 = p0Var;
        if (p0Var4 == null || (q0VarG = p0Var4.g()) == null) {
            return 0.0f;
        }
        return q0VarG.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t0 l(t0 t0Var, t0 t0Var2) {
        return !androidx.compose.ui.text.style.l.j(t0Var.y(), androidx.compose.ui.text.style.l.f42221b.f()) ? t0Var : t0.j(t0Var, 0, t0Var2.y(), 0L, null, null, null, 0, 0, null, 509, null);
    }

    @Override // androidx.compose.ui.text.q0
    public boolean a() {
        List<p0> list = this.f41792e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).g().a()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final f e() {
        return this.f41788a;
    }

    @Override // androidx.compose.ui.text.q0
    public float f() {
        return ((Number) this.f41790c.getValue()).floatValue();
    }

    @NotNull
    public final List<p0> g() {
        return this.f41792e;
    }

    @NotNull
    public final List<f.e<v0>> h() {
        return this.f41789b;
    }

    @Override // androidx.compose.ui.text.q0
    public float i() {
        return ((Number) this.f41791d.getValue()).floatValue();
    }

    @kotlin.l(message = "Font.ResourceLoader is deprecated, call with fontFamilyResolver", replaceWith = @kotlin.b1(expression = "MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver)", imports = {}))
    public i0(@NotNull f fVar, @NotNull y3 y3Var, @NotNull List<f.e<v0>> list, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.x.b bVar) {
        this(fVar, y3Var, list, dVar, androidx.compose.ui.text.font.s.a(bVar));
    }
}
