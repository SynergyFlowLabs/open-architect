package androidx.compose.ui.text.input;

import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n35#2,5:170\n1#3:175\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n101#1:170,5\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41900c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private y0 f41901a = new y0(androidx.compose.ui.text.l.u(), w3.f42333b.a(), (w3) null, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private n f41902b = new n(this.f41901a.j(), this.f41901a.l(), (DefaultConstructorMarker) null);

    private final String c(List<? extends j> list, final j jVar) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while applying EditCommand batch to buffer (length=" + this.f41902b.i() + ", composition=" + this.f41902b.e() + ", selection=" + ((Object) w3.q(this.f41902b.j())) + "):");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        CollectionsKt___CollectionsKt.joinTo(list, sb2, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1() { // from class: androidx.compose.ui.text.input.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.d(jVar, this, (j) obj);
            }
        });
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(j jVar, m mVar, j jVar2) {
        return (jVar == jVar2 ? " > " : "   ") + mVar.h(jVar2);
    }

    private final String h(j jVar) {
        if (jVar instanceof b) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CommitTextCommand(text.length=");
            b bVar = (b) jVar;
            sb2.append(bVar.d().length());
            sb2.append(", newCursorPosition=");
            sb2.append(bVar.c());
            sb2.append(')');
            return sb2.toString();
        }
        if (jVar instanceof u0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SetComposingTextCommand(text.length=");
            u0 u0Var = (u0) jVar;
            sb3.append(u0Var.d().length());
            sb3.append(", newCursorPosition=");
            sb3.append(u0Var.c());
            sb3.append(')');
            return sb3.toString();
        }
        if (jVar instanceof t0) {
            return ((t0) jVar).toString();
        }
        if (jVar instanceof h) {
            return ((h) jVar).toString();
        }
        if (jVar instanceof i) {
            return ((i) jVar).toString();
        }
        if (jVar instanceof v0) {
            return ((v0) jVar).toString();
        }
        if (jVar instanceof p) {
            return ((p) jVar).toString();
        }
        if (jVar instanceof a) {
            return ((a) jVar).toString();
        }
        if (jVar instanceof d0) {
            return ((d0) jVar).toString();
        }
        if (jVar instanceof g) {
            return ((g) jVar).toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown EditCommand: ");
        String strQ = kotlin.jvm.internal.j1.d(jVar.getClass()).Q();
        if (strQ == null) {
            strQ = "{anonymous EditCommand}";
        }
        sb4.append(strQ);
        return sb4.toString();
    }

    @NotNull
    public final y0 b(@NotNull List<? extends j> list) {
        j jVar = null;
        try {
            int size = list.size();
            int i10 = 0;
            j jVar2 = null;
            while (i10 < size) {
                try {
                    j jVar3 = list.get(i10);
                    try {
                        jVar3.a(this.f41902b);
                        i10++;
                        jVar2 = jVar3;
                    } catch (Exception e10) {
                        e = e10;
                        jVar = jVar3;
                        throw new RuntimeException(c(list, jVar), e);
                    }
                } catch (Exception e11) {
                    e = e11;
                    jVar = jVar2;
                }
            }
            androidx.compose.ui.text.f fVarU = this.f41902b.u();
            long j10 = this.f41902b.j();
            w3 w3VarB = w3.b(j10);
            w3VarB.r();
            w3 w3Var = w3.m(this.f41901a.l()) ? null : w3VarB;
            y0 y0Var = new y0(fVarU, w3Var != null ? w3Var.r() : x3.b(w3.k(j10), w3.l(j10)), this.f41902b.e(), (DefaultConstructorMarker) null);
            this.f41901a = y0Var;
            return y0Var;
        } catch (Exception e12) {
            e = e12;
        }
    }

    @NotNull
    public final n e() {
        return this.f41902b;
    }

    @NotNull
    public final y0 f() {
        return this.f41901a;
    }

    public final void g(@NotNull y0 y0Var, @Nullable g1 g1Var) {
        boolean zAreEqual = Intrinsics.areEqual(y0Var.k(), this.f41902b.e());
        boolean z10 = true;
        boolean z11 = false;
        if (!Intrinsics.areEqual(this.f41901a.j().m(), y0Var.j().m())) {
            this.f41902b = new n(y0Var.j(), y0Var.l(), (DefaultConstructorMarker) null);
        } else if (w3.g(this.f41901a.l(), y0Var.l())) {
            z10 = false;
        } else {
            this.f41902b.r(w3.l(y0Var.l()), w3.k(y0Var.l()));
            z11 = true;
            z10 = false;
        }
        if (y0Var.k() == null) {
            this.f41902b.b();
        } else if (!w3.h(y0Var.k().r())) {
            this.f41902b.p(w3.l(y0Var.k().r()), w3.k(y0Var.k().r()));
        }
        if (z10 || (!z11 && !zAreEqual)) {
            this.f41902b.b();
            y0Var = y0.h(y0Var, null, 0L, null, 3, null);
        }
        y0 y0Var2 = this.f41901a;
        this.f41901a = y0Var;
        if (g1Var != null) {
            g1Var.g(y0Var2, y0Var);
        }
    }

    @NotNull
    public final y0 i() {
        return this.f41901a;
    }
}
