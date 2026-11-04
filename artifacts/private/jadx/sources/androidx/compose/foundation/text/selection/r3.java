package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.y6;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,413:1\n1#2:414\n75#3,7:415\n75#3,7:422\n61#4:429\n70#5:430\n53#5,3:433\n22#6:431\n30#7:432\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n*L\n392#1:415,7\n395#1:422,7\n409#1:429\n409#1:430\n410#1:433,3\n409#1:431\n410#1:432\n*E\n"})
public final class r3 extends j<r3> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f21356m = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.y0 f21357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final y6 f21358l;

    public /* synthetic */ r3(androidx.compose.ui.text.input.y0 y0Var, androidx.compose.ui.text.input.m0 m0Var, y6 y6Var, v4 v4Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(y0Var, (i10 & 2) != 0 ? androidx.compose.ui.text.input.m0.f41903a.a() : m0Var, y6Var, (i10 & 8) != 0 ? new v4() : v4Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    private final int k0(y6 y6Var, int i10) {
        n0.j jVarA;
        androidx.compose.ui.layout.g0 g0VarC = y6Var.c();
        if (g0VarC != null) {
            androidx.compose.ui.layout.g0 g0VarB = y6Var.b();
            jVarA = g0VarB != null ? androidx.compose.ui.layout.g0.W(g0VarB, g0VarC, false, 2, null) : null;
            if (jVarA == null) {
                jVarA = n0.j.f332705e.a();
            }
        } else {
            jVarA = n0.j.f332705e.a();
        }
        n0.j jVarE = y6Var.i().e(s().b(androidx.compose.ui.text.w3.i(this.f21357k.l())));
        return s().a(y6Var.i().y(n0.g.g((((long) Float.floatToRawIntBits(jVarE.t())) << 32) | (((long) Float.floatToRawIntBits(jVarE.B() + (Float.intBitsToFloat((int) (jVarA.z() & com.rabbitmq.client.k0.f265952a)) * i10))) & com.rabbitmq.client.k0.f265952a))));
    }

    @Nullable
    public final List<androidx.compose.ui.text.input.j> g0(@NotNull Function1<? super r3, ? extends androidx.compose.ui.text.input.j> function1) {
        if (!androidx.compose.ui.text.w3.h(A())) {
            return CollectionsKt.listOf((Object[]) new androidx.compose.ui.text.input.j[]{new androidx.compose.ui.text.input.b("", 0), new androidx.compose.ui.text.input.v0(androidx.compose.ui.text.w3.l(A()), androidx.compose.ui.text.w3.l(A()))});
        }
        androidx.compose.ui.text.input.j jVarInvoke = function1.invoke(this);
        if (jVarInvoke != null) {
            return CollectionsKt.listOf(jVarInvoke);
        }
        return null;
    }

    @NotNull
    public final androidx.compose.ui.text.input.y0 h0() {
        return this.f21357k;
    }

    @Nullable
    public final y6 i0() {
        return this.f21358l;
    }

    @NotNull
    public final androidx.compose.ui.text.input.y0 j0() {
        return androidx.compose.ui.text.input.y0.h(this.f21357k, g(), A(), null, 4, null);
    }

    @NotNull
    public final r3 l0() {
        y6 y6Var;
        if (C().length() > 0 && (y6Var = this.f21358l) != null) {
            a0(k0(y6Var, 1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final r3 m0() {
        y6 y6Var;
        if (C().length() > 0 && (y6Var = this.f21358l) != null) {
            int i10 = 6 ^ (-1);
            a0(k0(y6Var, -1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public r3(@NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.ui.text.input.m0 m0Var, @Nullable y6 y6Var, @NotNull v4 v4Var) {
        super(y0Var.j(), y0Var.l(), y6Var != null ? y6Var.i() : null, m0Var, v4Var, null);
        this.f21357k = y0Var;
        this.f21358l = y6Var;
    }
}
