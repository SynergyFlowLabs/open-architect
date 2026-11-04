package com.planner5d.library.model.manager.statistics.events;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface a4 {

    public enum a {
        open,
        back,
        next,
        complete,
        furniture_arranged,
        error,
        rearrange_furniture;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216693i = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f216693i;
        }
    }

    public static final class b {
        public static /* synthetic */ void a(a4 a4Var, f fVar, e eVar, c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: errorAction");
            }
            if ((i10 & 4) != 0) {
                cVar = c.other;
            }
            a4Var.w0(fVar, eVar, cVar);
        }

        public static /* synthetic */ void b(a4 a4Var, e eVar, a aVar, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigationChangeStyleAction");
            }
            if ((i10 & 4) != 0) {
                str = null;
            }
            a4Var.b1(eVar, aVar, str);
        }

        public static /* synthetic */ void c(a4 a4Var, e eVar, a aVar, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigationDimensionsAction");
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            if ((i10 & 8) != 0) {
                z11 = false;
            }
            a4Var.E(eVar, aVar, z10, z11);
        }

        public static /* synthetic */ void d(a4 a4Var, e eVar, a aVar, d dVar, boolean z10, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigationRoomShapeAction");
            }
            if ((i10 & 4) != 0) {
                dVar = d.no;
            }
            d dVar2 = dVar;
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            boolean z11 = z10;
            if ((i10 & 16) != 0) {
                str = null;
            }
            a4Var.l(eVar, aVar, dVar2, z11, str);
        }

        public static /* synthetic */ void e(a4 a4Var, e eVar, a aVar, Long l10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigationRoomTypeAction");
            }
            if ((i10 & 4) != 0) {
                l10 = null;
            }
            a4Var.d(eVar, aVar, l10);
        }
    }

    public enum c {
        no_result,
        other;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216697d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f216697d;
        }
    }

    public enum d {
        horizontal,
        vertical,
        both,
        no;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216703f = kotlin.enums.c.c(k());

        static {
            int i10 = 3 << 2;
        }

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f216703f;
        }
    }

    public enum e {
        welcome_screen,
        catalog;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216707d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f216707d;
        }
    }

    public enum f {
        room_wizard_type,
        room_wizard_shape,
        room_wizard_dimensions,
        room_wizard_style;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216713f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<f> l() {
            return f216713f;
        }
    }

    void E(@NotNull e eVar, @NotNull a aVar, boolean z10, boolean z11);

    void b0(@NotNull e eVar);

    void b1(@NotNull e eVar, @NotNull a aVar, @Nullable String str);

    void d(@NotNull e eVar, @NotNull a aVar, @Nullable Long l10);

    void e(@NotNull f fVar, @NotNull e eVar);

    void l(@NotNull e eVar, @NotNull a aVar, @NotNull d dVar, boolean z10, @Nullable String str);

    void o(@NotNull e eVar);

    void w0(@NotNull f fVar, @NotNull e eVar, @NotNull c cVar);
}
