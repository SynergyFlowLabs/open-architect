package com.planner5d.library.help.application;

import android.app.Application;
import com.planner5d.library.model.manager.a5;
import com.planner5d.library.model.manager.b5;
import com.planner5d.library.model.manager.h1;
import com.planner5d.library.model.manager.i1;
import com.planner5d.library.model.manager.s4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@fg.h
public final class c {

    @SourceDebugExtension({"SMAP\nHelpBridgingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpBridgingModule.kt\ncom/planner5d/library/help/application/HelpBridgingModule$provideIntercomManagerService$1\n*L\n1#1,57:1\n32#1:58\n32#1:59\n32#1:60\n32#1:61\n*S KotlinDebug\n*F\n+ 1 HelpBridgingModule.kt\ncom/planner5d/library/help/application/HelpBridgingModule$provideIntercomManagerService$1\n*L\n34#1:58\n35#1:59\n36#1:60\n37#1:61\n*E\n"})
    public static final class a implements i1 {
        a() {
        }

        private final h1 e() {
            return h.f179982b.a().m();
        }

        @Override // com.planner5d.library.model.manager.i1
        public void a() {
            h.f179982b.a().m().a();
        }

        @Override // com.planner5d.library.model.manager.i1
        public void b(id.a aVar) {
            h.f179982b.a().m().b(aVar);
        }

        @Override // com.planner5d.library.model.manager.i1
        public void c(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            h.f179982b.a().m().c(application);
        }

        @Override // com.planner5d.library.model.manager.i1
        public void d(int i10) {
            h.f179982b.a().m().d(i10);
        }
    }

    public static final class b implements s4 {
        b() {
        }

        @Override // com.planner5d.library.model.manager.s4
        public void a(androidx.fragment.app.s fragmentActivity) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
            h.f179982b.a().s().a(fragmentActivity);
        }
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.services.p a(@NotNull com.planner5d.library.activity.fragment.dialog.s dialogFactory) {
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        return dialogFactory;
    }

    @fg.i
    @ij.f
    @NotNull
    public final i1 b() {
        return new a();
    }

    @fg.i
    @ij.f
    @NotNull
    public final s4 c() {
        return new b();
    }

    @fg.i
    @ij.f
    @NotNull
    public final b5 d(@NotNull a5 surveyManager) {
        Intrinsics.checkNotNullParameter(surveyManager, "surveyManager");
        return surveyManager;
    }
}
