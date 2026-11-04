package com.planner5d.library.uploadplan.application;

import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.dialog.Dialog;
import com.planner5d.library.activity.fragment.projects.z0;
import com.planner5d.library.project.fragment.navigation.RoomTypeNavigationFragment;
import com.planner5d.library.uploadplan.view.UploadPlanCreateFragment;
import com.planner5d.library.uploadplan.view.UploadPlanUploadFragment;
import com.planner5d.library.uploadplan.view.dialog.RecognitionFailedDialog;
import com.planner5d.library.uploadplan.view.dialog.RecognitionInProgressDialog;
import com.planner5d.library.uploadplan.view.dialog.RecognitionRateDialog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@fg.h
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f230715a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: com.planner5d.library.uploadplan.application.c$a$a, reason: collision with other inner class name */
        public static final class C1706a implements z0 {
            C1706a() {
            }

            @Override // com.planner5d.library.activity.fragment.projects.z0
            public Class<? extends Dialog<Boolean>> a() {
                return RecognitionFailedDialog.class;
            }

            @Override // com.planner5d.library.activity.fragment.projects.z0
            public Class<? extends FragmentController> b() {
                return RoomTypeNavigationFragment.class;
            }

            @Override // com.planner5d.library.activity.fragment.projects.z0
            public Class<? extends FragmentController> c() {
                return UploadPlanCreateFragment.class;
            }

            @Override // com.planner5d.library.activity.fragment.projects.z0
            public Class<? extends Dialog<Boolean>> d() {
                return RecognitionInProgressDialog.class;
            }

            @Override // com.planner5d.library.activity.fragment.projects.z0
            public Class<? extends Dialog<Boolean>> e() {
                return RecognitionRateDialog.class;
            }

            @Override // com.planner5d.library.activity.fragment.projects.z0
            public Class<? extends FragmentController> f() {
                return UploadPlanUploadFragment.class;
            }

            @Override // com.planner5d.library.activity.fragment.projects.z0
            public int g() {
                return he.b.m.N9;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fg.i
        @NotNull
        public final com.planner5d.library.activity.fragment.projects.g a(@NotNull com.planner5d.library.uploadplan.interactor.n interactor) {
            Intrinsics.checkNotNullParameter(interactor, "interactor");
            return interactor;
        }

        @fg.i
        @NotNull
        public final z0 b() {
            return new C1706a();
        }

        private a() {
        }
    }
}
