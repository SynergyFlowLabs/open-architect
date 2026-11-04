package com.planner5d.planner5d;

import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.dgenerator.fragment.DesignGeneratorNavigationFragment;
import com.planner5d.library.project.fragment.navigation.AiDesignerNavigationFragment;
import com.planner5d.library.project.fragment.navigation.RoomTypeNavigationFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@fg.h
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f258958a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: com.planner5d.planner5d.i0$a$a, reason: collision with other inner class name */
        public static final class C1752a implements com.planner5d.library.model.a {
            C1752a() {
            }

            @Override // com.planner5d.library.model.a
            public Class<? extends FragmentController> a() {
                return AiDesignerNavigationFragment.class;
            }
        }

        public static final class b implements com.planner5d.library.activity.fragment.feed.b {
            b() {
            }

            @Override // com.planner5d.library.activity.fragment.feed.b
            public Class<? extends FragmentController> a() {
                return DesignGeneratorNavigationFragment.class;
            }
        }

        public static final class c implements com.planner5d.library.activity.fragment.smartwizard.a {
            c() {
            }

            @Override // com.planner5d.library.activity.fragment.smartwizard.a
            public Class<? extends FragmentController> a() {
                return RoomTypeNavigationFragment.class;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fg.i
        @NotNull
        public final com.planner5d.library.model.a a() {
            return new C1752a();
        }

        @fg.i
        @NotNull
        public final com.planner5d.library.activity.fragment.feed.b b() {
            return new b();
        }

        @fg.i
        @NotNull
        public final com.planner5d.library.activity.fragment.smartwizard.a c() {
            return new c();
        }

        private a() {
        }
    }
}
