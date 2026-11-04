package com.planner5d.library.activity.fragment.dialog;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.ProjectRevision;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.widget.RadioButtonView;
import com.planner5d.library.widget.editor.helper.n3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class ProjectConflict extends ContentDialogV2<Boolean> {
    public static final int $stable = 8;

    @ij.a
    public p0 formatter;

    @ij.a
    public n3 helperProjectPersistence;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f131639o3 = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.c0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProjectConflict.h0(this.f132047a);
        }
    });

    @ij.a
    public com.planner5d.library.model.manager.project.m0 projectRevisionManager;

    @ij.a
    public com.planner5d.library.model.manager.synchronization.i synchronizationManager;

    @ij.a
    public com.planner5d.library.modules.user.user.t userAuthorization;

    /* JADX INFO: loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131640a;

        static {
            int[] iArr = new int[com.planner5d.library.model.manager.project.d0.b.values().length];
            try {
                iArr[com.planner5d.library.model.manager.project.d0.b.Local.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.model.manager.project.d0.b.Remote.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f131640a = iArr;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b extends com.planner5d.library.services.rx.e<Pair<ProjectRevision, ProjectRevision>> {
        b() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            ProjectConflict.this.sendResultOnce(Boolean.FALSE);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Pair<ProjectRevision, ProjectRevision> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            ProjectConflict projectConflict = ProjectConflict.this;
            Object first = value.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            Object second = value.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            projectConflict.c0((ProjectRevision) first, (ProjectRevision) second);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class c extends com.planner5d.library.services.rx.e<Void> {
        c() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            ProjectConflict.this.sendResultOnce(Boolean.FALSE);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            ProjectConflict.this.sendResultOnce(Boolean.TRUE);
        }
    }

    public ProjectConflict() {
        com.planner5d.library.application.b.f142455c.a().j2(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(ProjectConflict projectConflict, View view) {
        projectConflict.sendResultOnce(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(View view) {
    }

    private final id.a a0() {
        return (id.a) this.f131639o3.getValue();
    }

    private final String b0(Context context, ProjectRevision projectRevision) {
        return context.getString(com.planner5d.library.f.s.f168995an) + ": " + getFormatter$P5D_Library_release().f(projectRevision.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(final ProjectRevision projectRevision, final ProjectRevision projectRevision2) {
        final RadioGroup radioGroup;
        Context context;
        View view = getView();
        if (view == null || (radioGroup = (RadioGroup) view.findViewById(com.planner5d.library.f.j.Ip)) == null || (context = getContext()) == null) {
            return;
        }
        H().a().b();
        int childCount = radioGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = radioGroup.getChildAt(i10);
            if (childAt instanceof RadioButtonView) {
                com.planner5d.library.model.manager.project.d0.b bVar = com.planner5d.library.model.manager.project.d0.b.values()[i10];
                int i11 = a.f131640a[bVar.ordinal()];
                ((RadioButtonView) childAt).c(com.planner5d.library.services.textspan.b.d(context.getString(bVar.f193163a)), i11 != 1 ? i11 != 2 ? null : b0(context, projectRevision2) : b0(context, projectRevision));
            }
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.dialog.d0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i12) {
                ProjectConflict.d0(this.f132055a, radioGroup2, i12);
            }
        });
        K(ContentDialog.a.Save, Integer.valueOf(R.string.ok), new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ProjectConflict.e0(radioGroup, this, projectRevision, projectRevision2, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(ProjectConflict projectConflict, RadioGroup radioGroup, int i10) {
        projectConflict.M(ContentDialog.a.Save, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(RadioGroup radioGroup, ProjectConflict projectConflict, ProjectRevision projectRevision, ProjectRevision projectRevision2, View view) {
        int childCount = radioGroup.getChildCount();
        com.planner5d.library.model.manager.project.d0.b bVar = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = radioGroup.getChildAt(i10);
            if ((childAt instanceof RadioButtonView) && ((RadioButtonView) childAt).isChecked()) {
                bVar = com.planner5d.library.model.manager.project.d0.b.values()[i10];
            }
        }
        projectConflict.f0(projectRevision, projectRevision2, bVar);
    }

    private final void f0(final ProjectRevision projectRevision, final ProjectRevision projectRevision2, final com.planner5d.library.model.manager.project.d0.b bVar) {
        com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.activity.fragment.dialog.b0
            @Override // java.lang.Runnable
            public final void run() throws ErrorMessageException {
                ProjectConflict.g0(this.f132042a, projectRevision, projectRevision2, bVar);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).concatWith(getSynchronizationManager$P5D_Library_release().r(null)).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber<? super Void>) new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(ProjectConflict projectConflict, ProjectRevision projectRevision, ProjectRevision projectRevision2, com.planner5d.library.model.manager.project.d0.b bVar) throws ErrorMessageException {
        projectConflict.getProjectRevisionManager$P5D_Library_release().q(projectConflict.a0(), projectRevision, projectRevision2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final id.a h0(ProjectConflict projectConflict) {
        return projectConflict.getUserAuthorization$P5D_Library_release().a();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        View viewInflate = LayoutInflater.from(contextRequireContext).inflate(com.planner5d.library.f.m.T0, root, false);
        Q(com.planner5d.library.f.s.Yv, null);
        K(ContentDialog.a.Cancel, null, new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectConflict.Y(this.f132062a, view);
            }
        });
        ContentDialog.a aVar = ContentDialog.a.Save;
        K(aVar, Integer.valueOf(R.string.ok), new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectConflict.Z(view);
            }
        });
        M(aVar, false);
        ((TextView) viewInflate.findViewById(com.planner5d.library.f.j.Y9)).setText(com.planner5d.library.services.textspan.b.c(contextRequireContext, com.planner5d.library.f.s.W3, new Object[0]));
        H().a().a(com.planner5d.library.f.s.pn, true);
        getHelperProjectPersistence$P5D_Library_release().J(a0(), getArguments()).subscribe((Subscriber<? super Pair<ProjectRevision, ProjectRevision>>) new b());
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    @NotNull
    public final p0 getFormatter$P5D_Library_release() {
        p0 p0Var = this.formatter;
        if (p0Var != null) {
            return p0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formatter");
        return null;
    }

    @NotNull
    public final n3 getHelperProjectPersistence$P5D_Library_release() {
        n3 n3Var = this.helperProjectPersistence;
        if (n3Var != null) {
            return n3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperProjectPersistence");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.project.m0 getProjectRevisionManager$P5D_Library_release() {
        com.planner5d.library.model.manager.project.m0 m0Var = this.projectRevisionManager;
        if (m0Var != null) {
            return m0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("projectRevisionManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.synchronization.i getSynchronizationManager$P5D_Library_release() {
        com.planner5d.library.model.manager.synchronization.i iVar = this.synchronizationManager;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("synchronizationManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.modules.user.user.t getUserAuthorization$P5D_Library_release() {
        com.planner5d.library.modules.user.user.t tVar = this.userAuthorization;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAuthorization");
        return null;
    }

    public final void setFormatter$P5D_Library_release(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
        this.formatter = p0Var;
    }

    public final void setHelperProjectPersistence$P5D_Library_release(@NotNull n3 n3Var) {
        Intrinsics.checkNotNullParameter(n3Var, "<set-?>");
        this.helperProjectPersistence = n3Var;
    }

    public final void setProjectRevisionManager$P5D_Library_release(@NotNull com.planner5d.library.model.manager.project.m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "<set-?>");
        this.projectRevisionManager = m0Var;
    }

    public final void setSynchronizationManager$P5D_Library_release(@NotNull com.planner5d.library.model.manager.synchronization.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.synchronizationManager = iVar;
    }

    public final void setUserAuthorization$P5D_Library_release(@NotNull com.planner5d.library.modules.user.user.t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.userAuthorization = tVar;
    }
}
