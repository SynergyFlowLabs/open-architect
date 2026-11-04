package com.planner5d.library.activity.fragment.list.holders;

import android.content.Context;
import android.view.View;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.activity.fragment.list.n1;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.services.utility.f1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f134194g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.project.d0 f134195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b4 f134196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.p0 f134197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.config.j> f134198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f1 f134199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.spaces.documents.c f134200f;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134201a;

        static {
            int[] iArr = new int[com.planner5d.library.activity.fragment.list.h0.a.values().length];
            try {
                iArr[com.planner5d.library.activity.fragment.list.h0.a.Project.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.list.h0.a.Snapshot.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.list.h0.a.Document.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.list.h0.a.NewItem.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.list.h0.a.Folders.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.list.h0.a.Folder.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.list.h0.a.SortingAndAppearance.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.list.h0.a.AiRecognitionInProgress.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.list.h0.a.AiRecognitionFailed.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.list.h0.a.AddNew.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.list.h0.a.DocumentSynchronization.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f134201a = iArr;
        }
    }

    @ij.a
    public u(@NotNull com.planner5d.library.model.manager.project.d0 projectManager, @NotNull b4 snapshotManager, @NotNull com.planner5d.library.services.utility.p0 formatter, @NotNull fg.e<com.planner5d.library.model.manager.config.j> featureConfigManager, @NotNull f1 coroutineScope, @NotNull com.planner5d.library.model.manager.spaces.documents.c documentsManager) {
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(documentsManager, "documentsManager");
        this.f134195a = projectManager;
        this.f134196b = snapshotManager;
        this.f134197c = formatter;
        this.f134198d = featureConfigManager;
        this.f134199e = coroutineScope;
        this.f134200f = documentsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(n1 n1Var, View anchorView, Project project) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        if (n1Var != null) {
            n1Var.a(anchorView, project);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(n1 n1Var, View anchorView, gd.b bVar) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        if (n1Var != null) {
            n1Var.a(anchorView, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(n1 n1Var, View anchorView, com.planner5d.library.database.model.spaces.documents.a aVar) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        if (n1Var != null) {
            n1Var.a(anchorView, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(n1 n1Var, View anchorView, com.planner5d.library.model.g gVar) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        if (n1Var != null) {
            n1Var.a(anchorView, gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(n1 n1Var, View anchorView, Object obj) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        if (n1Var != null) {
            n1Var.a(anchorView, obj);
        }
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.list.holders.a<?> f(@NotNull Context context, @NotNull kotlinx.coroutines.s0 scope, @NotNull androidx.lifecycle.o0 lifecycleOwner, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull l1 viewModel, @Nullable final n1<Object> n1Var, @NotNull com.planner5d.library.activity.fragment.list.h0.a viewType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        switch (a.f134201a[viewType.ordinal()]) {
            case 1:
                return new n0(context, viewModel, bitmapTargetManager, scope, lifecycleOwner, this.f134195a, this.f134197c, new n1() { // from class: com.planner5d.library.activity.fragment.list.holders.p
                    @Override // com.planner5d.library.activity.fragment.list.n1
                    public final void a(View view, Object obj) {
                        u.g(n1Var, view, (Project) obj);
                    }
                });
            case 2:
                return new x0(context, viewModel, bitmapTargetManager, scope, lifecycleOwner, this.f134196b, this.f134197c, this.f134198d, this.f134199e, new n1() { // from class: com.planner5d.library.activity.fragment.list.holders.q
                    @Override // com.planner5d.library.activity.fragment.list.n1
                    public final void a(View view, Object obj) {
                        u.h(n1Var, view, (gd.b) obj);
                    }
                });
            case 3:
                return new k(context, viewModel, this.f134200f, lifecycleOwner, bitmapTargetManager, scope, this.f134197c, new n1() { // from class: com.planner5d.library.activity.fragment.list.holders.r
                    @Override // com.planner5d.library.activity.fragment.list.n1
                    public final void a(View view, Object obj) {
                        u.i(n1Var, view, (com.planner5d.library.database.model.spaces.documents.a) obj);
                    }
                });
            case 4:
                return new g0(context, viewModel);
            case 5:
                return new e0(context, viewModel);
            case 6:
                return new c0(context, viewModel, this.f134197c, lifecycleOwner, new n1() { // from class: com.planner5d.library.activity.fragment.list.holders.s
                    @Override // com.planner5d.library.activity.fragment.list.n1
                    public final void a(View view, Object obj) {
                        u.j(n1Var, view, (com.planner5d.library.model.g) obj);
                    }
                });
            case 7:
                return new a1(context, viewModel);
            case 8:
                return new r0(context, viewModel, this.f134197c);
            case 9:
                return new p0(context, viewModel, this.f134197c);
            case 10:
                return new c(context, viewModel, new n1() { // from class: com.planner5d.library.activity.fragment.list.holders.t
                    @Override // com.planner5d.library.activity.fragment.list.n1
                    public final void a(View view, Object obj) {
                        u.k(n1Var, view, obj);
                    }
                });
            case 11:
                return new n(context, viewModel, lifecycleOwner);
            default:
                return new o(context);
        }
    }
}
