package we;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.builtin.i;
import com.planner5d.library.model.manager.statistics.events.o3;
import com.planner5d.library.services.l;
import com.planner5d.library.widget.editor.editaction.z;
import com.planner5d.library.widget.editor.facade.h;
import com.planner5d.library.widget.editor.facade.k0;
import com.planner5d.library.widget.editor.helper.n3;
import com.planner5d.library.widget.editor.helper.s2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class d implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f390572h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.widget.editor.projectresources.e f390573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final i f390574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final s2 f390575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final n3 f390576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final k0 f390577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final h f390578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.e f390579g;

    public d(@Nullable com.planner5d.library.widget.editor.projectresources.e eVar, @Nullable i iVar, @Nullable s2 s2Var, @Nullable n3 n3Var, @NotNull k0 stateReader, @NotNull h facade, @NotNull com.planner5d.library.widget.editor.facade.e contextProvider) {
        Intrinsics.checkNotNullParameter(stateReader, "stateReader");
        Intrinsics.checkNotNullParameter(facade, "facade");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f390573a = eVar;
        this.f390574b = iVar;
        this.f390575c = s2Var;
        this.f390576d = n3Var;
        this.f390577e = stateReader;
        this.f390578f = facade;
        this.f390579g = contextProvider;
    }

    @Override // we.c
    public void A(@Nullable com.planner5d.library.widget.editor.editaction.e eVar, @Nullable com.planner5d.library.widget.editor.editaction.e eVar2, boolean z10) {
        com.planner5d.library.widget.editor.projectresources.a aVarA6 = a6();
        if (aVarA6 != null) {
            aVarA6.a(eVar, eVar2);
            z(eVar, z10);
        }
    }

    @Override // we.c
    public boolean H(@Nullable com.planner5d.library.widget.editor.projectresources.a aVar) {
        if (aVar != null) {
            return aVar.f();
        }
        return false;
    }

    @Override // we.c
    @Nullable
    public com.planner5d.library.widget.editor.projectresources.a a6() {
        com.planner5d.library.widget.editor.projectresources.e eVar = this.f390573a;
        if (eVar != null) {
            return eVar.d(this.f390577e.getModel());
        }
        return null;
    }

    @Override // we.c
    public void b(boolean z10) {
        if (this.f390577e.E()) {
            return;
        }
        s2 s2Var = this.f390575c;
        if (s2Var != null) {
            s2.b(s2Var, z10 ? o3.a.undo : o3.a.redo, null, 2, null);
        }
        com.planner5d.library.widget.editor.projectresources.a aVarA6 = a6();
        if (aVarA6 == null || !z(aVarA6.k(z10), true)) {
            return;
        }
        this.f390578f.v().o();
    }

    @Override // we.c
    public boolean e(@Nullable com.planner5d.library.widget.editor.projectresources.a aVar) {
        if (aVar != null) {
            return aVar.e();
        }
        return false;
    }

    @Override // we.c
    public void l(@NotNull l.c event) {
        com.planner5d.library.widget.editor.projectresources.a aVarA6;
        Intrinsics.checkNotNullParameter(event, "event");
        timber.log.b.f381052a.a("history event: EditorHistoryAdd", new Object[0]);
        if (event.b() instanceof z) {
            z(event.b(), true);
            return;
        }
        l.c cVarC = event.c();
        if (cVarC != null && (aVarA6 = a6()) != null) {
            aVarA6.m(cVarC.b(), cVarC.a());
        }
        A(event.b(), event.a(), true);
    }

    @Override // we.c
    public void q(boolean z10) {
        n3 n3Var = this.f390576d;
        if (n3Var != null) {
            n3Var.P(this.f390579g.a(), this.f390577e.getModel(), this.f390577e.getItem(), z10);
        }
    }

    @Override // we.c
    public boolean y(@Nullable com.planner5d.library.widget.editor.editaction.e eVar, boolean z10, boolean z11) {
        if (eVar != null && this.f390574b != null) {
            com.planner5d.library.widget.editor.a aVarB = this.f390577e.b();
            if (aVarB != null) {
                aVarB.f(eVar, new com.planner5d.library.widget.editor.editaction.h(this.f390577e.getItem(), this.f390574b, this.f390578f.G(), this.f390578f.C(), this.f390578f.F(), this.f390578f.w()));
            }
            if (z10) {
                this.f390578f.F().r();
            }
        }
        if (z11) {
            q(true);
        }
        return eVar != null;
    }

    @Override // we.c
    public boolean z(@Nullable com.planner5d.library.widget.editor.editaction.e eVar, boolean z10) {
        return y(eVar, z10, true);
    }
}
