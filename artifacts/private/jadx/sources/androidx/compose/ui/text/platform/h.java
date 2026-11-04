package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n7;
import androidx.compose.ui.text.android.g0;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.u1;
import androidx.compose.ui.text.q0;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.y3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidParagraphIntrinsics.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraphIntrinsics.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphIntrinsics\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,205:1\n118#2:206\n35#2,5:207\n119#2:212\n*S KotlinDebug\n*F\n+ 1 AndroidParagraphIntrinsics.android.kt\nandroidx/compose/ui/text/platform/AndroidParagraphIntrinsics\n*L\n111#1:206\n111#1:207,5\n111#1:212\n*E\n"})
public final class h implements q0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f42077m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f42078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y3 f42079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a>> f42080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<androidx.compose.ui.text.f.e<v0>> f42081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.font.y.b f42082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f42083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final o f42084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final CharSequence f42085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final g0 f42086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private d0 f42087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f42088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f42089l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.List<? extends androidx.compose.ui.text.f$e<? extends androidx.compose.ui.text.f$a>>, java.util.List<androidx.compose.ui.text.f$e<? extends androidx.compose.ui.text.f$a>>] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List<androidx.compose.ui.text.f$e<? extends androidx.compose.ui.text.f$a>>] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public h(@NotNull String str, @NotNull y3 y3Var, @NotNull List<? extends androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a>> list, @NotNull List<androidx.compose.ui.text.f.e<v0>> list2, @NotNull androidx.compose.ui.text.font.y.b bVar, @NotNull androidx.compose.ui.unit.d dVar) {
        Object obj;
        ?? arrayList;
        this.f42078a = str;
        this.f42079b = y3Var;
        this.f42080c = list;
        this.f42081d = list2;
        this.f42082e = bVar;
        this.f42083f = dVar;
        o oVar = new o(1, dVar.getDensity());
        this.f42084g = oVar;
        this.f42088k = !i.c(y3Var) ? false : x.f42116a.a().getValue().booleanValue();
        this.f42089l = i.d(y3Var.V(), y3Var.K());
        pj.o oVar2 = new pj.o() { // from class: androidx.compose.ui.text.platform.g
            @Override // pj.o
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                return h.c(this.f42076a, (androidx.compose.ui.text.font.y) obj2, (androidx.compose.ui.text.font.v0) obj3, (androidx.compose.ui.text.font.q0) obj4, (r0) obj5);
            }
        };
        z0.e.f(oVar, y3Var.Y());
        c3 c3VarO0 = y3Var.o0();
        int size = ((Collection) list).size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (((androidx.compose.ui.text.f.e) obj).h() instanceof c3) {
                break;
            } else {
                i10++;
            }
        }
        c3 c3VarA = z0.e.a(oVar, c3VarO0, oVar2, dVar, obj != null);
        if (c3VarA != null) {
            int size2 = this.f42080c.size() + 1;
            arrayList = new ArrayList(size2);
            int i11 = 0;
            while (i11 < size2) {
                arrayList.add(i11 == 0 ? new androidx.compose.ui.text.f.e<>(c3VarA, 0, this.f42078a.length()) : this.f42080c.get(i11 - 1));
                i11++;
            }
        } else {
            arrayList = this.f42080c;
        }
        CharSequence charSequenceA = f.a(this.f42078a, this.f42084g.getTextSize(), this.f42079b, arrayList, this.f42081d, this.f42083f, oVar2, this.f42088k);
        this.f42085h = charSequenceA;
        this.f42086i = new g0(charSequenceA, this.f42084g, this.f42089l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(h hVar, androidx.compose.ui.text.font.y yVar, androidx.compose.ui.text.font.v0 v0Var, androidx.compose.ui.text.font.q0 q0Var, r0 r0Var) {
        n7<Object> n7VarB = hVar.f42082e.b(yVar, v0Var, q0Var.j(), r0Var.m());
        if (n7VarB instanceof u1.b) {
            Object value = ((u1.b) n7VarB).getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) value;
        }
        d0 d0Var = new d0(n7VarB, hVar.f42087j);
        hVar.f42087j = d0Var;
        return d0Var.b();
    }

    @Override // androidx.compose.ui.text.q0
    public boolean a() {
        d0 d0Var = this.f42087j;
        if (d0Var != null ? d0Var.c() : false) {
            return true;
        }
        return !this.f42088k && i.c(this.f42079b) && x.f42116a.a().getValue().booleanValue();
    }

    @NotNull
    public final List<androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a>> d() {
        return this.f42080c;
    }

    @NotNull
    public final CharSequence e() {
        return this.f42085h;
    }

    @Override // androidx.compose.ui.text.q0
    public float f() {
        return this.f42086i.j();
    }

    @NotNull
    public final androidx.compose.ui.unit.d g() {
        return this.f42083f;
    }

    @NotNull
    public final androidx.compose.ui.text.font.y.b h() {
        return this.f42082e;
    }

    @Override // androidx.compose.ui.text.q0
    public float i() {
        return this.f42086i.i();
    }

    @NotNull
    public final g0 j() {
        return this.f42086i;
    }

    @NotNull
    public final List<androidx.compose.ui.text.f.e<v0>> k() {
        return this.f42081d;
    }

    @NotNull
    public final y3 l() {
        return this.f42079b;
    }

    @NotNull
    public final String m() {
        return this.f42078a;
    }

    public final int n() {
        return this.f42089l;
    }

    @NotNull
    public final o o() {
        return this.f42084g;
    }
}
