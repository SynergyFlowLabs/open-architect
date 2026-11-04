package com.planner5d.library.widget.editor.helper;

import android.os.Bundle;
import android.util.Pair;
import com.planner5d.library.activity.fragment.dialog.ProjectConflict;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.statistics.events.f4;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import rx.Subscriber;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class j2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f256445g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f256446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f256447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n3 f256448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final s2 f256449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final b f256450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final sd.e f256451f;

    public interface a {
        void D(@NotNull g1.j jVar, @Nullable Bundle bundle, @NotNull t3 t3Var, @NotNull com.planner5d.library.model.manager.statistics.f0 f0Var);

        void I(@Nullable Throwable th2, boolean z10);
    }

    public interface b {
        void H(@NotNull Pair<Project, ItemProject> pair, @NotNull g1.j jVar);

        void u(@NotNull Map<String, ? extends Pair<Project, ItemProject>> map, @NotNull g1.j jVar);
    }

    public static final class c extends com.planner5d.library.services.rx.e<t3> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Bundle f256453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bundle f256454f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g1.j f256455g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.statistics.f0 f256456h;

        c(Bundle bundle, Bundle bundle2, g1.j jVar, com.planner5d.library.model.manager.statistics.f0 f0Var) {
            this.f256453e = bundle;
            this.f256454f = bundle2;
            this.f256455g = jVar;
            this.f256456h = f0Var;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            if (ErrorMessageException.isWithCode(th2, com.planner5d.library.f.s.f169201ja)) {
                j2.this.k(this.f256453e, this.f256454f, this.f256455g, this.f256456h);
            } else {
                j2.this.f256446a.I(th2, true);
            }
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(t3 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            s2 s2Var = j2.this.f256449d;
            if (s2Var != null) {
                s2Var.B(value);
            }
            j2.this.f256451f.a(sd.d.BeforeEditorLoaded);
            j2.this.f256446a.D(this.f256455g, this.f256454f, value, this.f256456h);
        }
    }

    public static final class d extends com.planner5d.library.services.rx.e<t3> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g1.j f256458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bundle f256459f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.statistics.f0 f256460g;

        d(g1.j jVar, Bundle bundle, com.planner5d.library.model.manager.statistics.f0 f0Var) {
            this.f256458e = jVar;
            this.f256459f = bundle;
            this.f256460g = f0Var;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            j2.this.f256446a.I(th2, true);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(t3 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            s2 s2Var = j2.this.f256449d;
            if (s2Var != null) {
                s2Var.B(value);
            }
            j2.this.f256451f.a(sd.d.BeforeEditorLoaded);
            j2.this.f256446a.D(this.f256458e, this.f256459f, value, this.f256460g);
        }
    }

    public static final class e extends com.planner5d.library.services.rx.e<Pair<Project, ItemProject>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g1.j f256462e;

        e(g1.j jVar) {
            this.f256462e = jVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            j2.this.f256446a.I(th2, true);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Pair<Project, ItemProject> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            j2.this.f256450e.H(value, this.f256462e);
        }
    }

    public static final class f extends com.planner5d.library.services.rx.e<Map<String, ? extends Pair<Project, ItemProject>>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g1.j f256464e;

        f(g1.j jVar) {
            this.f256464e = jVar;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            j2.this.f256446a.I(th2, true);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Map<String, ? extends Pair<Project, ItemProject>> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            j2.this.f256450e.u(value, this.f256464e);
        }
    }

    public j2(@NotNull a loadListener, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull n3 helperProjectPersistence, @Nullable s2 s2Var, @Nullable b bVar, @NotNull sd.e firebaseInAppMessageTrigger) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(helperProjectPersistence, "helperProjectPersistence");
        Intrinsics.checkNotNullParameter(firebaseInAppMessageTrigger, "firebaseInAppMessageTrigger");
        this.f256446a = loadListener;
        this.f256447b = dialogLauncher;
        this.f256448c = helperProjectPersistence;
        this.f256449d = s2Var;
        this.f256450e = bVar;
        this.f256451f = firebaseInAppMessageTrigger;
    }

    private final void h(Bundle bundle, Bundle bundle2, g1.j jVar, com.planner5d.library.model.manager.statistics.f0 f0Var) {
        this.f256448c.E(bundle).subscribe((Subscriber<? super t3>) new d(jVar, bundle2, f0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(final Bundle bundle, final Bundle bundle2, final g1.j jVar, final com.planner5d.library.model.manager.statistics.f0 f0Var) {
        this.f256447b.c(ProjectConflict.class).h(bundle).m(new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.widget.editor.helper.i2
            @Override // com.planner5d.library.activity.fragment.dialog.u
            public final void a(Object obj) {
                j2.l(this.f256432a, bundle, bundle2, jVar, f0Var, (Boolean) obj);
            }
        }).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(j2 j2Var, Bundle bundle, Bundle bundle2, g1.j jVar, com.planner5d.library.model.manager.statistics.f0 f0Var, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            j2Var.h(bundle, bundle2, jVar, f0Var);
        } else {
            j2Var.f256446a.I(new ErrorMessageException(com.planner5d.library.f.s.f169201ja, new String[0]), false);
        }
    }

    public final void g(@NotNull Bundle arguments, @Nullable Bundle bundle, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f256448c.M(arguments).subscribe((Subscriber<? super t3>) new c(arguments, bundle, listener, com.planner5d.library.model.manager.statistics.f0.f217768d.b(f4.ProjectLoad)));
    }

    public final void i(@NotNull JSONObject data, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f256450e == null) {
            return;
        }
        this.f256448c.K(data).subscribe((Subscriber<? super Pair<Project, ItemProject>>) new e(listener));
    }

    public final void j(@NotNull List<? extends Pair<String, JSONObject>> projects, @NotNull g1.j listener) {
        Intrinsics.checkNotNullParameter(projects, "projects");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f256450e == null) {
            return;
        }
        this.f256448c.L(projects).subscribe((Subscriber<? super Map<String, Pair<Project, ItemProject>>>) new f(listener));
    }
}
