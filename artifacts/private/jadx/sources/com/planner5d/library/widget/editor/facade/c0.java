package com.planner5d.library.widget.editor.facade;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.LogRecord;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEditability;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.helper.ItemProjectPosition;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.s0;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.u0;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.widget.editor.editor2d.Editor2D;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nEditorUserInterfaceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorUserInterfaceManager.kt\ncom/planner5d/library/widget/editor/facade/EditorUserInterfaceManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class c0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f256078h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.projectresources.e f256079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f256080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final s0 f256081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b2 f256082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t1 f256083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final u0 f256084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.catalog.g f256085g;

    public static final class a extends com.planner5d.library.services.rx.e<com.planner5d.library.widget.editor.a.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber<com.planner5d.library.widget.editor.a.b> f256086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Subscriber<? super com.planner5d.library.widget.editor.a.b> f256087e;

        a(Subscriber<com.planner5d.library.widget.editor.a.b> subscriber, Subscriber<? super com.planner5d.library.widget.editor.a.b> subscriber2) {
            this.f256086d = subscriber;
            this.f256087e = subscriber2;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            this.f256086d.onError(th2);
            this.f256087e.onError(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(com.planner5d.library.widget.editor.a.b bVar) {
            this.f256086d.onNext(bVar);
            this.f256087e.onNext(bVar);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            this.f256086d.onCompleted();
            this.f256087e.onCompleted();
        }
    }

    @ij.a
    public c0(@NotNull com.planner5d.library.widget.editor.projectresources.e projectResources, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull s0 globalSettingsManager, @NotNull b2 messageManager, @NotNull t1 logRecordManager, @NotNull u0 hapticManager, @NotNull com.planner5d.library.widget.editor.catalog.g catalogLoader) {
        Intrinsics.checkNotNullParameter(projectResources, "projectResources");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(globalSettingsManager, "globalSettingsManager");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        Intrinsics.checkNotNullParameter(hapticManager, "hapticManager");
        Intrinsics.checkNotNullParameter(catalogLoader, "catalogLoader");
        this.f256079a = projectResources;
        this.f256080b = builtInDataManager;
        this.f256081c = globalSettingsManager;
        this.f256082d = messageManager;
        this.f256083e = logRecordManager;
        this.f256084f = hapticManager;
        this.f256085g = catalogLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogRecord q(String str, String str2, Throwable th2) {
        return new LogRecord(str, str2, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogRecord r(String str, String str2) {
        return new LogRecord(str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(boolean z10, ItemProject itemProject, ij.c cVar, com.planner5d.library.widget.editor.a aVar, Subscriber subscriber) {
        Observable<com.planner5d.library.widget.editor.a.b> observableY;
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        if (z10 || itemProject == null) {
            subscriber.onNext(new com.planner5d.library.widget.editor.a.b(0));
            subscriber.onCompleted();
            return;
        }
        Object obj = cVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        Subscriber subscriber2 = (Subscriber) obj;
        if (aVar == null || (observableY = aVar.y(itemProject)) == null) {
            return;
        }
        observableY.subscribe((Subscriber<? super com.planner5d.library.widget.editor.a.b>) new a(subscriber2, subscriber));
    }

    @NotNull
    public final PointF d(@Nullable ItemProject itemProject) {
        PointF pointF = ItemProjectPosition.getDefault(itemProject);
        Intrinsics.checkNotNullExpressionValue(pointF, "getDefault(...)");
        return pointF;
    }

    @Nullable
    public final ItemEditability e(@Nullable Project project) {
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVarH = h(project);
        if (bVarH != null) {
            return new ItemEditability(this.f256080b, bVarH);
        }
        return null;
    }

    @Nullable
    public final com.planner5d.library.widget.editor.projectresources.j f(@Nullable Project project) {
        return this.f256079a.e(project);
    }

    @NotNull
    public final com.planner5d.library.model.p.b g() {
        com.planner5d.library.model.p.b bVarC = this.f256081c.c();
        Intrinsics.checkNotNullExpressionValue(bVarC, "getTextureSize(...)");
        return bVarC;
    }

    @Nullable
    public final com.planner5d.library.widget.editor.projectresources.viewoptions.b h(@Nullable Project project) {
        com.planner5d.library.widget.editor.projectresources.viewoptions.a aVarF;
        if (project == null || (aVarF = this.f256079a.f(project)) == null) {
            return null;
        }
        return aVarF.f258069a;
    }

    public final void i(@Nullable Activity activity, @Nullable Runnable runnable) {
        if (activity != null) {
            activity.invalidateOptionsMenu();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final boolean j(@Nullable com.planner5d.library.widget.editor.a aVar) {
        return aVar instanceof Editor2D;
    }

    public final boolean k(@Nullable com.planner5d.library.widget.editor.a aVar) {
        return aVar instanceof com.planner5d.library.widget.editor.editor3d.l;
    }

    public final boolean l(@Nullable com.planner5d.library.widget.editor.a aVar) {
        return aVar instanceof com.planner5d.library.widget.editor.editor3dcardboard.l;
    }

    public final boolean m(@Nullable String str) {
        return str != null && this.f256085g.m(str);
    }

    public final boolean n(@Nullable com.planner5d.library.services.utility.j jVar, boolean z10) {
        return (jVar != null ? jVar.f(com.planner5d.library.services.r.projectReadOnly, false) : false) || z10;
    }

    public final void o(@Nullable final String str, @Nullable final String str2) {
        this.f256083e.v(new ij.c() { // from class: com.planner5d.library.widget.editor.facade.z
            @Override // ij.c
            public final Object get() {
                return c0.r(str, str2);
            }
        });
    }

    public final void p(@Nullable final String str, @Nullable final String str2, @Nullable final Throwable th2) {
        this.f256083e.v(new ij.c() { // from class: com.planner5d.library.widget.editor.facade.a0
            @Override // ij.c
            public final Object get() {
                return c0.q(str, str2, th2);
            }
        });
    }

    public final void s(@Nullable View view) {
        if (view != null) {
            this.f256084f.a(view);
        }
    }

    public final void t(@Nullable Project project, @Nullable com.planner5d.library.widget.editor.a aVar, @Nullable com.planner5d.library.widget.editor.helper.selector.a aVar2) {
        com.planner5d.library.widget.editor.projectresources.viewoptions.a aVarF = this.f256079a.f(project);
        if (aVarF == null || aVar == null) {
            return;
        }
        Item selectedItem = aVar.getSelectedItem();
        if (!aVarF.f258069a.f258070a && (((selectedItem instanceof ItemPr) || (selectedItem instanceof ItemNs)) && aVar2 != null)) {
            aVar2.d(null);
        }
        w(aVar);
        com.planner5d.library.widget.editor.editor3d.l lVar = aVar instanceof com.planner5d.library.widget.editor.editor3d.l ? (com.planner5d.library.widget.editor.editor3d.l) aVar : null;
        if (lVar != null) {
            lVar.v0();
        }
    }

    @NotNull
    public final Observable<com.planner5d.library.widget.editor.a.b> u(@Nullable final ItemProject itemProject, final boolean z10, @NotNull final ij.c<Subscriber<com.planner5d.library.widget.editor.a.b>> dataLoadingSubscriber, @Nullable final com.planner5d.library.widget.editor.a aVar) {
        Intrinsics.checkNotNullParameter(dataLoadingSubscriber, "dataLoadingSubscriber");
        Observable<com.planner5d.library.widget.editor.a.b> observableC = com.planner5d.library.services.rx.a.c("reload", Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.facade.b0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                c0.v(z10, itemProject, dataLoadingSubscriber, aVar, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224934d));
        Intrinsics.checkNotNullExpressionValue(observableC, "create(...)");
        return observableC;
    }

    public final void w(@Nullable com.planner5d.library.widget.editor.a aVar) {
        Editor2D editor2D = aVar instanceof Editor2D ? (Editor2D) aVar : null;
        if (editor2D != null) {
            editor2D.U();
        }
    }

    public final void x(@Nullable Project project) {
        com.planner5d.library.widget.editor.projectresources.viewoptions.a aVarF = this.f256079a.f(project);
        if (aVarF == null) {
            return;
        }
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar = aVarF.f258069a;
        if (bVar.f258070a) {
            return;
        }
        com.planner5d.library.services.l.f224378d.o(new com.planner5d.library.services.l.c(new com.planner5d.library.widget.editor.editaction.g0(new com.planner5d.library.widget.editor.projectresources.viewoptions.b.a(bVar).k(true).a()), new com.planner5d.library.widget.editor.editaction.g0(bVar)));
    }

    public final void y(@NotNull com.planner5d.library.widget.editor.projectresources.viewoptions.b viewOptions, @Nullable Project project) {
        Intrinsics.checkNotNullParameter(viewOptions, "viewOptions");
        com.planner5d.library.widget.editor.projectresources.viewoptions.a aVarF = this.f256079a.f(project);
        if (aVarF != null && !Intrinsics.areEqual(aVarF.f258069a, viewOptions)) {
            aVarF.f258069a = viewOptions;
        }
    }

    public final void z(@NotNull ErrorMessageException message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f256082d.r(message);
    }
}
