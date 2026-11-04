package com.planner5d.library.widget.editor.projectresources;

import com.planner5d.library.database.model.project.Project;

/* JADX INFO: loaded from: classes8.dex */
@ij.f
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static e f258056e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected ij.c<d> f258057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f258058b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f258059c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f258060d = new Object();

    @ij.a
    public e() {
        f258056e = this;
    }

    public static void a() {
        e eVar = f258056e;
        if (eVar != null) {
            eVar.b();
        }
    }

    private void b() {
        a aVar;
        synchronized (this.f258060d) {
            try {
                this.f258058b = 0L;
                d dVar = this.f258059c;
                if (dVar != null && (aVar = dVar.f258053a) != null) {
                    aVar.c();
                }
                this.f258059c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private d c(Project project) {
        d dVar;
        com.planner5d.library.widget.editor.projectresources.viewoptions.b.EnumC1743b enumC1743b = null;
        if (project == null) {
            return null;
        }
        synchronized (this.f258060d) {
            try {
                long jLongValue = project.getId() == null ? -1L : project.getId().longValue();
                if (this.f258059c == null || this.f258058b != jLongValue) {
                    d dVar2 = this.f258057a.get();
                    this.f258059c = dVar2;
                    com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar = dVar2.f258055c.f258069a;
                    if (project.contestId != null) {
                        enumC1743b = project.contestStatus == 8 ? com.planner5d.library.widget.editor.projectresources.viewoptions.b.EnumC1743b.submitted : com.planner5d.library.widget.editor.projectresources.viewoptions.b.EnumC1743b.draft;
                    }
                    bVar.f258084o = enumC1743b;
                    this.f258058b = jLongValue;
                }
                dVar = this.f258059c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public a d(Project project) {
        d dVarC = c(project);
        if (dVarC == null) {
            return null;
        }
        a aVar = dVarC.f258053a;
        Long l10 = project.projectId;
        aVar.n(l10 == null ? -1L : l10.longValue());
        return dVarC.f258053a;
    }

    public j e(Project project) {
        d dVarC = c(project);
        if (dVarC == null) {
            return null;
        }
        return dVarC.f258054b;
    }

    public com.planner5d.library.widget.editor.projectresources.viewoptions.a f(Project project) {
        d dVarC = c(project);
        if (dVarC == null) {
            return null;
        }
        return dVarC.f258055c;
    }
}
