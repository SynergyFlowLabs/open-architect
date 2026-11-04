package com.planner5d.library.model.manager.statistics.events;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface e4 {

    public enum a {
        rescaling_screen,
        saved_scale,
        start_scaling,
        choice_units,
        set_up_ruler,
        enter_ruler_lenght,
        back,
        close;


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216885j = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f216885j;
        }
    }

    public static final class b {
        public static /* synthetic */ void a(e4 e4Var, a aVar, c cVar, e eVar, Boolean bool, Boolean bool2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: settings");
            }
            if ((i10 & 4) != 0) {
                eVar = null;
            }
            if ((i10 & 8) != 0) {
                bool = null;
            }
            if ((i10 & 16) != 0) {
                bool2 = null;
            }
            e4Var.n0(aVar, cVar, eVar, bool, bool2);
        }

        public static /* synthetic */ void b(e4 e4Var, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackProjectCreate");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            e4Var.S(z10);
        }
    }

    public enum c {
        photo_gallery,
        camera,
        reupload,
        purchase_page;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216892g = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f216886a = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final c a(@Nullable Bundle bundle) {
                Serializable serializableS = new com.planner5d.library.services.utility.j(bundle).s(com.planner5d.library.services.r.method, c.photo_gallery);
                Intrinsics.checkNotNull(serializableS, "null cannot be cast to non-null type com.planner5d.library.model.manager.statistics.events.StatisticsEventUploadPlan.Method");
                return (c) serializableS;
            }

            private a() {
            }
        }

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f216892g;
        }
    }

    public enum d {
        method,
        action,
        type,
        step,
        rotate_plan,
        crop_plan,
        task_id,
        error_raw;


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216902j = kotlin.enums.c.c(k());

        static {
            int i10 = 2 ^ 2;
        }

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f216902j;
        }
    }

    public enum e {
        about_upload,
        crop_edit,
        add_scale;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216907e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f216907e;
        }
    }

    public enum f {
        uploading,
        recognition;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216911d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<f> l() {
            return f216911d;
        }
    }

    public enum g {
        yes,
        no;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216915d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<g> l() {
            return f216915d;
        }
    }

    void E0(@NotNull c cVar, @NotNull f fVar, long j10, @Nullable String str);

    void S(boolean z10);

    void Y(@NotNull c cVar);

    void h(@NotNull c cVar);

    @NotNull
    c m(@NotNull String str);

    void n0(@NotNull a aVar, @Nullable c cVar, @Nullable e eVar, @Nullable Boolean bool, @Nullable Boolean bool2);
}
