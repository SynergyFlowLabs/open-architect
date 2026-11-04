package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.s0;
import androidx.compose.ui.text.y3;
import androidx.compose.ui.text.z3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMinLinesConstrainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinLinesConstrainer.kt\nandroidx/compose/foundation/text/modifiers/MinLinesConstrainer\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,151:1\n26#2:152\n*S KotlinDebug\n*F\n+ 1 MinLinesConstrainer.kt\nandroidx/compose/foundation/text/modifiers/MinLinesConstrainer\n*L\n133#1:152\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f20564h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f20565i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private static d f20566j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.w f20567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y3 f20568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f20569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.font.y.b f20570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final y3 f20571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f20572f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f20573g = Float.NaN;

    @SourceDebugExtension({"SMAP\nMinLinesConstrainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinLinesConstrainer.kt\nandroidx/compose/foundation/text/modifiers/MinLinesConstrainer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final d a(@Nullable d dVar, @NotNull androidx.compose.ui.unit.w wVar, @NotNull y3 y3Var, @NotNull androidx.compose.ui.unit.d dVar2, @NotNull androidx.compose.ui.text.font.y.b bVar) {
            if (dVar != null && wVar == dVar.g() && Intrinsics.areEqual(z3.d(y3Var, wVar), dVar.f()) && dVar2.getDensity() == dVar.d().getDensity() && bVar == dVar.e()) {
                return dVar;
            }
            d dVar3 = d.f20566j;
            if (dVar3 != null && wVar == dVar3.g() && Intrinsics.areEqual(z3.d(y3Var, wVar), dVar3.f()) && dVar2.getDensity() == dVar3.d().getDensity() && bVar == dVar3.e()) {
                return dVar3;
            }
            d dVar4 = new d(wVar, z3.d(y3Var, wVar), androidx.compose.ui.unit.f.a(dVar2.getDensity(), dVar2.m0()), bVar);
            a aVar = d.f20564h;
            d.f20566j = dVar4;
            return dVar4;
        }

        private a() {
        }
    }

    public d(@NotNull androidx.compose.ui.unit.w wVar, @NotNull y3 y3Var, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar) {
        this.f20567a = wVar;
        this.f20568b = y3Var;
        this.f20569c = dVar;
        this.f20570d = bVar;
        this.f20571e = z3.d(y3Var, wVar);
    }

    public final long c(long j10, int i10) {
        float f10 = this.f20573g;
        float f11 = this.f20572f;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            String str = e.f20576b;
            y3 y3Var = this.f20571e;
            long jB = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);
            androidx.compose.ui.unit.d dVar = this.f20569c;
            androidx.compose.ui.text.font.y.b bVar = this.f20570d;
            androidx.compose.ui.text.style.v.a aVar = androidx.compose.ui.text.style.v.f42256b;
            float height = s0.i(str, y3Var, jB, dVar, bVar, (64 & 32) != 0 ? CollectionsKt.emptyList() : null, (64 & 64) != 0 ? CollectionsKt.emptyList() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & 256) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : aVar.a()).getHeight();
            float height2 = s0.i(e.f20577c, this.f20571e, androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null), this.f20569c, this.f20570d, (64 & 32) != 0 ? CollectionsKt.emptyList() : null, (64 & 64) != 0 ? CollectionsKt.emptyList() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & 256) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : aVar.a()).getHeight() - height;
            this.f20573g = height;
            this.f20572f = height2;
            f11 = height2;
            f10 = height;
        }
        return androidx.compose.ui.unit.c.a(androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.p(j10), i10 != 1 ? kotlin.ranges.r.B(kotlin.ranges.r.u(Math.round(f10 + (f11 * (i10 - 1))), 0), androidx.compose.ui.unit.b.o(j10)) : androidx.compose.ui.unit.b.q(j10), androidx.compose.ui.unit.b.o(j10));
    }

    @NotNull
    public final androidx.compose.ui.unit.d d() {
        return this.f20569c;
    }

    @NotNull
    public final androidx.compose.ui.text.font.y.b e() {
        return this.f20570d;
    }

    @NotNull
    public final y3 f() {
        return this.f20568b;
    }

    @NotNull
    public final androidx.compose.ui.unit.w g() {
        return this.f20567a;
    }
}
