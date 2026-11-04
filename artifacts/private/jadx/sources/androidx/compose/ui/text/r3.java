package androidx.compose.ui.text;

import androidx.compose.runtime.k7;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nTextMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurer.kt\nandroidx/compose/ui/text/TextMeasurer\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,455:1\n30#2:456\n80#3:457\n*S KotlinDebug\n*F\n+ 1 TextMeasurer.kt\nandroidx/compose/ui/text/TextMeasurer\n*L\n178#1:456\n178#1:457\n*E\n"})
public final class r3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f42131f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f42132g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.font.y.b f42133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f42134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.w f42135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final n3 f42137e;

    @SourceDebugExtension({"SMAP\nTextMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurer.kt\nandroidx/compose/ui/text/TextMeasurer$Companion\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,455:1\n30#2:456\n80#3:457\n*S KotlinDebug\n*F\n+ 1 TextMeasurer.kt\nandroidx/compose/ui/text/TextMeasurer$Companion\n*L\n343#1:456\n343#1:457\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final p3 b(o3 o3Var) {
            i0 i0Var = new i0(o3Var.n(), z3.d(o3Var.m(), o3Var.f()), o3Var.i(), o3Var.d(), o3Var.e());
            int iR = androidx.compose.ui.unit.b.r(o3Var.c());
            int iP = ((o3Var.l() || t3.b(o3Var.h())) && androidx.compose.ui.unit.b.j(o3Var.c())) ? androidx.compose.ui.unit.b.p(o3Var.c()) : Integer.MAX_VALUE;
            int iG = (o3Var.l() || !t3.b(o3Var.h())) ? o3Var.g() : 1;
            if (iR != iP) {
                iP = kotlin.ranges.r.I(s0.o(i0Var.i()), iR, iP);
            }
            f0 f0Var = new f0(i0Var, androidx.compose.ui.unit.b.f42658b.b(0, iP, 0, androidx.compose.ui.unit.b.o(o3Var.c())), iG, o3Var.h(), (DefaultConstructorMarker) null);
            int i10 = 1 << 0;
            return new p3(o3Var, f0Var, androidx.compose.ui.unit.c.f(o3Var.c(), androidx.compose.ui.unit.u.e((((long) ((int) Math.ceil(f0Var.L()))) << 32) | (((long) ((int) Math.ceil(f0Var.k()))) & com.rabbitmq.client.k0.f265952a))), null);
        }

        private a() {
        }
    }

    public r3(@NotNull androidx.compose.ui.text.font.y.b bVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar, int i10) {
        this.f42133a = bVar;
        this.f42134b = dVar;
        this.f42135c = wVar;
        this.f42136d = i10;
        this.f42137e = i10 > 0 ? new n3(i10) : null;
    }

    public static /* synthetic */ p3 b(r3 r3Var, String str, y3 y3Var, int i10, boolean z10, int i11, long j10, androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            y3Var = y3.f42348d.a();
        }
        y3 y3Var2 = y3Var;
        if ((i12 & 4) != 0) {
            i10 = androidx.compose.ui.text.style.v.f42256b.a();
        }
        return r3Var.a(str, y3Var2, i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? Integer.MAX_VALUE : i11, (i12 & 32) != 0 ? androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null) : j10, (i12 & 64) != 0 ? r3Var.f42135c : wVar, (i12 & 128) != 0 ? r3Var.f42134b : dVar, (i12 & 256) != 0 ? r3Var.f42133a : bVar, (i12 & 512) != 0 ? false : z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p3 d(r3 r3Var, f fVar, y3 y3Var, int i10, boolean z10, int i11, List list, long j10, androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            y3Var = y3.f42348d.a();
        }
        return r3Var.c(fVar, y3Var, (i12 & 4) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? Integer.MAX_VALUE : i11, (i12 & 32) != 0 ? CollectionsKt.emptyList() : list, (i12 & 64) != 0 ? androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null) : j10, (i12 & 128) != 0 ? r3Var.f42135c : wVar, (i12 & 256) != 0 ? r3Var.f42134b : dVar, (i12 & 512) != 0 ? r3Var.f42133a : bVar, (i12 & 1024) != 0 ? false : z11);
    }

    @k7
    @NotNull
    public final p3 a(@NotNull String str, @NotNull y3 y3Var, int i10, boolean z10, int i11, long j10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar, boolean z11) {
        return d(this, new f(str, null, 2, null), y3Var, i10, z10, i11, null, j10, wVar, dVar, bVar, z11, 32, null);
    }

    @k7
    @NotNull
    public final p3 c(@NotNull f fVar, @NotNull y3 y3Var, int i10, boolean z10, int i11, @NotNull List<f.e<v0>> list, long j10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar, boolean z11) {
        n3 n3Var;
        o3 o3Var = new o3(fVar, y3Var, list, i11, z10, i10, dVar, wVar, bVar, j10, (DefaultConstructorMarker) null);
        p3 p3VarA = (z11 || (n3Var = this.f42137e) == null) ? null : n3Var.a(o3Var);
        if (p3VarA != null) {
            return p3VarA.a(o3Var, androidx.compose.ui.unit.c.f(j10, androidx.compose.ui.unit.u.e((((long) s0.o(p3VarA.x().L())) << 32) | (((long) s0.o(p3VarA.x().k())) & com.rabbitmq.client.k0.f265952a))));
        }
        p3 p3VarB = f42131f.b(o3Var);
        n3 n3Var2 = this.f42137e;
        if (n3Var2 != null) {
            n3Var2.b(o3Var, p3VarB);
        }
        return p3VarB;
    }

    public /* synthetic */ r3(androidx.compose.ui.text.font.y.b bVar, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, dVar, wVar, (i11 & 8) != 0 ? 8 : i10);
    }
}
