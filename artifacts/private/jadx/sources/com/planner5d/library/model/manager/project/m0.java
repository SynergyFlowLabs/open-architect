package com.planner5d.library.model.manager.project;

import android.util.Pair;
import androidx.annotation.l1;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.activeandroid.ActiveAndroid;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Delete;
import com.activeandroid.query.From;
import com.activeandroid.query.Select;
import com.activeandroid.util.TransactionUtils;
import com.planner5d.library.database.model.ProjectRevision;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.g3;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.t2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nProjectRevisionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectRevisionManager.kt\ncom/planner5d/library/model/manager/project/ProjectRevisionManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,239:1\n11165#2:240\n11500#2,3:241\n*S KotlinDebug\n*F\n+ 1 ProjectRevisionManager.kt\ncom/planner5d/library/model/manager/project/ProjectRevisionManager\n*L\n212#1:240\n212#1:241,3\n*E\n"})
public final class m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f193241e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<d0> f193242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p0 f193243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g3 f193244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f193245d;

    @w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f193246d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f193247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f193248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f193249c;

        public a(int i10, int i11, long j10) {
            this.f193247a = i10;
            this.f193248b = i11;
            this.f193249c = j10;
        }

        public final int a() {
            return this.f193247a;
        }

        public final long b() {
            return this.f193249c;
        }

        public final int c() {
            return this.f193248b;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f193250a;

        static {
            int[] iArr = new int[d0.b.values().length];
            try {
                iArr[d0.b.LocalCopyRemote.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d0.b.Remote.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.b.Local.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f193250a = iArr;
        }
    }

    @ij.a
    public m0(@NotNull fg.e<d0> projectManager, @NotNull p0 formatter, @NotNull g3 systemTime, @NotNull a configuration) {
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(systemTime, "systemTime");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f193242a = projectManager;
        this.f193243b = formatter;
        this.f193244c = systemTime;
        this.f193245d = configuration;
    }

    private final String d() {
        ProjectRevision.b[] bVarArr = {ProjectRevision.b.PendingConflict, ProjectRevision.b.ResolvedConflict};
        ArrayList arrayList = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            arrayList.add(Integer.valueOf(bVarArr[i10].n()));
        }
        return t2.a("type", arrayList);
    }

    @m1
    private final ProjectRevision e(Project project) throws IllegalArgumentException {
        ProjectRevision projectRevision = new ProjectRevision();
        Long id2 = project.getId();
        if (id2 == null) {
            throw new IllegalArgumentException("Source project doesn't have any ID");
        }
        projectRevision.z(id2.longValue());
        projectRevision.y(project.m());
        projectRevision.x(project.data);
        projectRevision.A(ProjectRevision.a.Local.n());
        projectRevision.B(ProjectRevision.b.PendingConflict.n());
        return projectRevision;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(m0 m0Var, id.a aVar, ProjectRevision projectRevision) {
        Project projectY = m0Var.f193242a.get().Y(aVar, projectRevision.v());
        if (projectY != null) {
            m0Var.n(aVar, projectY, projectRevision);
            return Unit.f312394a;
        }
        throw new IllegalArgumentException("No source project with ID = " + projectRevision.v() + " found to create a copy");
    }

    public static /* synthetic */ ProjectRevision j(m0 m0Var, Project project, Date date, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            date = null;
        }
        return m0Var.i(project, date);
    }

    @m1
    private final void n(id.a aVar, Project project, ProjectRevision projectRevision) {
        Project project2 = new Project();
        project2.data = projectRevision.s();
        project2.folderId = project.folderId;
        project2.userId = com.planner5d.library.modules.user.user.x.a(aVar);
        project2.title = project.title + " (" + this.f193243b.o(projectRevision.p()) + ")";
        project2.F(true);
        project2.save();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(m0 m0Var, id.a aVar, ProjectRevision projectRevision, d0.b bVar, ProjectRevision projectRevision2) throws ErrorMessageException {
        Project projectY = m0Var.f193242a.get().Y(aVar, projectRevision.v());
        if (projectY == null || bVar == null) {
            throw new ErrorMessageException(com.planner5d.library.f.s.f169201ja, new String[0]);
        }
        int i10 = b.f193250a[bVar.ordinal()];
        if (i10 == 1) {
            m0Var.n(aVar, projectY, projectRevision2);
            projectY.F(true);
        } else if (i10 == 2) {
            projectY.data = projectRevision2.s();
            projectY.dateUpdated = projectRevision2.p();
            projectY.s();
        } else {
            if (i10 != 3) {
                throw new kotlin.k0();
            }
            projectY.F(true);
        }
        projectY.save();
        projectRevision2.B(ProjectRevision.b.ResolvedConflict.n());
        projectRevision2.save();
        m0Var.h(projectRevision2.v());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Project project, Project project2, m0 m0Var) {
        if (!Arrays.equals(project.data, project2.data) && m0Var.i(project, project2.dateUpdated) == null) {
            ProjectRevision projectRevision = new ProjectRevision();
            Long id2 = project.getId();
            if (id2 == null) {
                throw new IllegalArgumentException("Local project doesn't have any ID");
            }
            projectRevision.z(id2.longValue());
            projectRevision.x(project2.data);
            projectRevision.y(project2.dateUpdated);
            projectRevision.A(ProjectRevision.a.Remote.n());
            projectRevision.B(ProjectRevision.b.PendingConflict.n());
            projectRevision.save();
            new Delete().from(ProjectRevision.class).where("project_id = ? AND id != ? AND " + m0Var.d(), Long.valueOf(projectRevision.v()), projectRevision.getId()).execute();
            m0Var.h(projectRevision.v());
        }
        return Unit.f312394a;
    }

    @m1
    public final void f(@Nullable final id.a aVar, @NotNull final ProjectRevision revision) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(revision, "revision");
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.project.k0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m0.g(this.f193228a, aVar, revision);
            }
        });
    }

    @l1
    @m1
    public final void h(long j10) {
        new Delete().from(ProjectRevision.class).where("Id NOT IN (SELECT Id FROM projects_revisions WHERE project_id = ? ORDER BY date_created DESC LIMIT ?)", Long.valueOf(j10), Integer.valueOf(this.f193245d.a())).execute();
    }

    @l1
    @m1
    @Nullable
    public final ProjectRevision i(@NotNull Project project, @Nullable Date date) {
        Intrinsics.checkNotNullParameter(project, "project");
        From fromWhere = new Select().from(ProjectRevision.class).where("project_id = ? AND " + d(), project.getId());
        if (date != null) {
            fromWhere.where("date_created = ?", Long.valueOf(date.getTime()));
        }
        return (ProjectRevision) fromWhere.orderBy("date_created DESC").executeSingle();
    }

    @m1
    @NotNull
    public final List<ProjectRevision> k(@NotNull Project project, boolean z10) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(project, "project");
        From from = new Select(Table.DEFAULT_ID_NAME, "CAST(length(data) AS BLOB) AS data", "date_created", "project_id", "type", "source").from(ProjectRevision.class);
        Long id2 = project.getId();
        if (id2 == null) {
            throw new IllegalArgumentException("No ID is present in a provided project");
        }
        From fromOrderBy = from.where("project_id = ?", id2).orderBy("date_created DESC");
        a aVar = this.f193245d;
        List<ProjectRevision> listExecute = fromOrderBy.limit(z10 ? aVar.c() : aVar.a()).execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        return listExecute;
    }

    @m1
    @NotNull
    public final ProjectRevision l(@NotNull ProjectRevision revision) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(revision, "revision");
        From from = new Select().from(ProjectRevision.class);
        Long id2 = revision.getId();
        if (id2 == null) {
            throw new IllegalArgumentException("No ID is present in the provided revision");
        }
        ProjectRevision projectRevision = (ProjectRevision) from.where("id = ?", id2).executeSingle();
        if (projectRevision != null) {
            return projectRevision;
        }
        throw new IllegalArgumentException("No revision is found for the request one: " + revision);
    }

    @m1
    public final boolean m(@NotNull Project project) {
        Intrinsics.checkNotNullParameter(project, "project");
        return new Select().from(ProjectRevision.class).where("project_id = ? AND type = ?", project.getId(), Integer.valueOf(ProjectRevision.b.PendingConflict.n())).executeSingle() != null;
    }

    @m1
    @NotNull
    public final Pair<ProjectRevision, ProjectRevision> o(@Nullable id.a aVar, long j10) throws IllegalArgumentException {
        Project projectY = this.f193242a.get().Y(aVar, j10);
        if (projectY == null) {
            throw new IllegalArgumentException("No project found for ID = " + j10);
        }
        int i10 = 2 & 0;
        ProjectRevision projectRevisionJ = j(this, projectY, null, 2, null);
        if (projectRevisionJ != null) {
            return new Pair<>(e(projectY), projectRevisionJ);
        }
        throw new IllegalArgumentException("No conflict revision found for project: " + projectY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m1
    public final void p(@NotNull Project project) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(project, "project");
        Long id2 = project.getId();
        if (id2 == null) {
            throw new IllegalArgumentException("No ID present in the argument project");
        }
        long jCurrentTimeMillis = this.f193244c.currentTimeMillis();
        int i10 = 6 & 7;
        ActiveAndroid.execSQL("INSERT INTO projects_revisions (project_id, date_created, data, source, type) SELECT ?, ?, ?, ?, ? WHERE NOT EXISTS (SELECT * FROM projects_revisions WHERE project_id = ? AND date_created > ?)", new Serializable[]{id2, Long.valueOf(jCurrentTimeMillis), project.data, Integer.valueOf(ProjectRevision.a.Local.n()), Integer.valueOf(ProjectRevision.b.Periodic.n()), id2, Long.valueOf(jCurrentTimeMillis - this.f193245d.b())});
    }

    @m1
    public final void q(@Nullable final id.a aVar, @NotNull final ProjectRevision local, @NotNull final ProjectRevision remote, @Nullable final d0.b bVar) throws ErrorMessageException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(remote, "remote");
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.project.j0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m0.r(this.f193220a, aVar, local, bVar, remote);
            }
        });
    }

    @m1
    public final void s(@NotNull final Project local, @NotNull final Project remote) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(remote, "remote");
        TransactionUtils.executeAsTransaction(new Callable() { // from class: com.planner5d.library.model.manager.project.l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m0.t(local, remote, this);
            }
        });
        local.contestId = remote.contestId;
        local.contestStatus = remote.contestStatus;
        local.projectId = remote.projectId;
        local.folderId = remote.folderId;
        local.title = remote.title;
        local.aiRecognized = remote.aiRecognized;
    }
}
