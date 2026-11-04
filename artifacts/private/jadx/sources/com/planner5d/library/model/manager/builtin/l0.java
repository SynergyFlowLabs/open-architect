package com.planner5d.library.model.manager.builtin;

import android.app.Application;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.m1;
import com.activeandroid.query.Select;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.ProjectToDemoProject;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.services.utility.e2;
import com.planner5d.library.services.utility.f2;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nHelperDemoProjects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperDemoProjects.kt\ncom/planner5d/library/model/manager/builtin/HelperDemoProjects\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n37#2,2:187\n37#2,2:190\n1#3:189\n*S KotlinDebug\n*F\n+ 1 HelperDemoProjects.kt\ncom/planner5d/library/model/manager/builtin/HelperDemoProjects\n*L\n183#1:187,2\n162#1:190,2\n*E\n"})
public final class l0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f181087h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f181088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f181089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final i f181090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n1 f181091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.l f181092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f2 f181093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Map<Long, com.planner5d.library.model.e> f181094g;

    @ij.a
    public l0(@NotNull Application application, @NotNull com.planner5d.library.application.d configuration, @NotNull i builtInDataManager, @NotNull n1 languageManager, @NotNull com.planner5d.library.model.manager.l databaseManager, @NotNull f2 nullReporter) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        Intrinsics.checkNotNullParameter(nullReporter, "nullReporter");
        this.f181088a = application;
        this.f181089b = configuration;
        this.f181090c = builtInDataManager;
        this.f181091d = languageManager;
        this.f181092e = databaseManager;
        this.f181093f = nullReporter;
        this.f181094g = new LinkedHashMap();
    }

    @m1
    private final void d(final File file, final com.planner5d.library.model.e eVar) {
        if (file != null && (!file.isFile() || file.delete())) {
            this.f181090c.K().b(new Function1() { // from class: com.planner5d.library.model.manager.builtin.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l0.e(eVar, file, (SQLiteDatabase) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(com.planner5d.library.model.e eVar, File file, SQLiteDatabase it) throws IOException {
        Intrinsics.checkNotNullParameter(it, "it");
        Cursor cursorQuery = it.query("demo_projects", null, "id = ?", new String[]{String.valueOf(eVar.b())}, null, null, null, null);
        try {
            if (cursorQuery.moveToNext()) {
                try {
                    Integer numValueOf = Integer.valueOf(cursorQuery.getColumnIndex("image"));
                    if (numValueOf.intValue() < 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(cursorQuery.getBlob(numValueOf.intValue()));
                        try {
                            org.apache.commons.io.k.w(new GZIPInputStream(byteArrayInputStream), file);
                            Unit unit = Unit.f312394a;
                            kotlin.io.c.a(byteArrayInputStream, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                kotlin.io.c.a(byteArrayInputStream, th2);
                                throw th3;
                            }
                        }
                    }
                } catch (IOException e10) {
                    timber.log.b.f381052a.e(e10);
                }
            }
            Unit unit2 = Unit.f312394a;
            kotlin.io.c.a(cursorQuery, null);
            return unit2;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                kotlin.io.c.a(cursorQuery, th4);
                throw th5;
            }
        }
    }

    @m1
    private final File j(com.planner5d.library.model.e eVar) {
        File fileK = k();
        if (eVar != null && fileK != null) {
            File file = new File(fileK, "demo_" + eVar.b());
            if (!file.isFile()) {
                d(file, eVar);
            }
            if (file.isFile()) {
                return file;
            }
        }
        return null;
    }

    @m1
    private final File k() {
        File fileA = com.planner5d.library.services.w.f229889a.a(this.f181088a, "images_demo_projects");
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return fileA;
        }
        return null;
    }

    @m1
    private final File l(Project project) {
        File fileK = k();
        if (project != null && fileK != null) {
            File file = new File(fileK, String.valueOf(project.getId()));
            if (file.isFile()) {
                return file;
            }
        }
        return null;
    }

    @m1
    private final com.planner5d.library.model.e m(Project project) {
        Long id2 = project.getId();
        if (id2 == null) {
            return null;
        }
        if (!this.f181094g.containsKey(id2)) {
            this.f181094g.put(id2, n(project));
        }
        return this.f181094g.get(id2);
    }

    @m1
    private final com.planner5d.library.model.e n(Project project) {
        ProjectToDemoProject projectToDemoProject = (ProjectToDemoProject) new Select().from(ProjectToDemoProject.class).where("project_id = ?", project.getId()).executeSingle();
        if (projectToDemoProject == null) {
            return null;
        }
        int i10 = 4 << 0;
        return (com.planner5d.library.model.e) ArraysKt.firstOrNull(o(Long.valueOf(projectToDemoProject.demoProjectId), false));
    }

    @m1
    private final com.planner5d.library.model.e[] o(final Long l10, final boolean z10) {
        final ArrayList arrayList = new ArrayList();
        this.f181090c.K().b(new Function1() { // from class: com.planner5d.library.model.manager.builtin.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l0.q(this.f181044a, z10, l10, arrayList, (SQLiteDatabase) obj);
            }
        });
        return (com.planner5d.library.model.e[]) arrayList.toArray(new com.planner5d.library.model.e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(l0 l0Var, boolean z10, Long l10, List list, SQLiteDatabase it) throws IOException {
        Intrinsics.checkNotNullParameter(it, "it");
        List listMutableListOf = CollectionsKt.mutableListOf("catalog_id = ?");
        if (com.planner5d.library.database.m.f154036c.e().e("demo_projects", "room_type_id")) {
            listMutableListOf.add("room_type_id IS NULL");
        }
        List listMutableListOf2 = CollectionsKt.mutableListOf(String.valueOf(l0Var.f181089b.k()));
        List listMutableListOf3 = CollectionsKt.mutableListOf("id", l0Var.f181091d.f("title", l0Var.f181088a));
        if (z10) {
            listMutableListOf3.add("data");
        }
        if (l10 != null) {
            listMutableListOf.add("id = ?");
            listMutableListOf2.add(l10.toString());
        }
        Cursor cursorQuery = it.query("demo_projects", (String[]) listMutableListOf3.toArray(new String[0]), CollectionsKt.joinToString$default(listMutableListOf, " AND ", null, null, 0, null, null, 62, null), (String[]) listMutableListOf2.toArray(new String[0]), null, null, null, null);
        while (true) {
            try {
                if (!cursorQuery.moveToNext()) {
                    Unit unit = Unit.f312394a;
                    kotlin.io.c.a(cursorQuery, null);
                    return unit;
                }
                try {
                    long j10 = cursorQuery.getLong(0);
                    String string = cursorQuery.getString(1);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    try {
                        list.add(new com.planner5d.library.model.e(j10, string, z10 ? org.apache.commons.io.p.o0(new GZIPInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2)))) : null));
                    } catch (IOException e10) {
                        e = e10;
                        timber.log.b.f381052a.e(e);
                    }
                } catch (IOException e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(cursorQuery, th2);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(com.planner5d.library.model.e eVar, long j10) {
        ProjectToDemoProject projectToDemoProject = new ProjectToDemoProject();
        projectToDemoProject.demoProjectId = eVar.b();
        projectToDemoProject.projectId = j10;
        projectToDemoProject.save();
    }

    @m1
    public final void f(@NotNull Project model) {
        Intrinsics.checkNotNullParameter(model, "model");
        try {
            ProjectToDemoProject projectToDemoProject = (ProjectToDemoProject) new Select().from(ProjectToDemoProject.class).where("project_id = ?", model.getId()).executeSingle();
            if (projectToDemoProject != null) {
                projectToDemoProject.delete();
            }
        } catch (Throwable th2) {
            timber.log.b.f381052a.e(th2);
        }
    }

    @m1
    public final void g(@Nullable Project project) {
        org.apache.commons.io.k.C(l(project));
    }

    @m1
    @NotNull
    public final com.planner5d.library.model.e[] h(boolean z10) {
        return o(null, z10);
    }

    @m1
    @Nullable
    public final File i(@Nullable Project project) {
        if (project == null) {
            return null;
        }
        File fileL = l(project);
        return (fileL == null || !fileL.isFile()) ? j(m(project)) : fileL;
    }

    @m1
    @NotNull
    public final com.planner5d.library.model.e[] p(boolean z10) {
        return o(null, z10);
    }

    @m1
    public final void r(@NotNull Project model, @NotNull final com.planner5d.library.model.e modelDemo) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelDemo, "modelDemo");
        this.f181093f.a(model.getId(), new e2() { // from class: com.planner5d.library.model.manager.builtin.k0
            @Override // com.planner5d.library.services.utility.e2
            public final void apply(Object obj) {
                l0.s(modelDemo, ((Long) obj).longValue());
            }
        });
    }
}
