package androidx.navigation.ui;

import android.view.Menu;
import androidx.navigation.e2;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    public static final class a implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f71325a = new a();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class b implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f71326a = new b();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class c implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f71327a = new c();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class d implements androidx.navigation.ui.d.b, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function0 f71328a;

        public d(Function0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f71328a = function;
        }

        @Override // androidx.navigation.ui.d.b
        public final /* synthetic */ boolean a() {
            return ((Boolean) this.f71328a.invoke()).booleanValue();
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f71328a;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.navigation.ui.d.b) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.ui.e$e, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes11.dex */
    public static final class C0632e implements androidx.navigation.ui.d.b, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function0 f71329a;

        public C0632e(Function0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f71329a = function;
        }

        @Override // androidx.navigation.ui.d.b
        public final /* synthetic */ boolean a() {
            return ((Boolean) this.f71329a.invoke()).booleanValue();
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f71329a;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.navigation.ui.d.b) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @NotNull
    public static final androidx.navigation.ui.d a(@NotNull Menu topLevelMenu, @Nullable androidx.customview.widget.c cVar, @NotNull Function0<Boolean> fallbackOnNavigateUpListener) {
        Intrinsics.checkNotNullParameter(topLevelMenu, "topLevelMenu");
        Intrinsics.checkNotNullParameter(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new androidx.navigation.ui.d.a(topLevelMenu).d(cVar).c(new d(fallbackOnNavigateUpListener)).a();
    }

    @NotNull
    public static final androidx.navigation.ui.d b(@NotNull e2 navGraph, @Nullable androidx.customview.widget.c cVar, @NotNull Function0<Boolean> fallbackOnNavigateUpListener) {
        Intrinsics.checkNotNullParameter(navGraph, "navGraph");
        Intrinsics.checkNotNullParameter(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new androidx.navigation.ui.d.a(navGraph).d(cVar).c(new d(fallbackOnNavigateUpListener)).a();
    }

    @NotNull
    public static final androidx.navigation.ui.d c(@NotNull Set<Integer> topLevelDestinationIds, @Nullable androidx.customview.widget.c cVar, @NotNull Function0<Boolean> fallbackOnNavigateUpListener) {
        Intrinsics.checkNotNullParameter(topLevelDestinationIds, "topLevelDestinationIds");
        Intrinsics.checkNotNullParameter(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new androidx.navigation.ui.d.a(topLevelDestinationIds).d(cVar).c(new d(fallbackOnNavigateUpListener)).a();
    }

    public static /* synthetic */ androidx.navigation.ui.d d(Menu topLevelMenu, androidx.customview.widget.c cVar, Function0 fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = b.f71326a;
        }
        Intrinsics.checkNotNullParameter(topLevelMenu, "topLevelMenu");
        Intrinsics.checkNotNullParameter(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new androidx.navigation.ui.d.a(topLevelMenu).d(cVar).c(new d(fallbackOnNavigateUpListener)).a();
    }

    public static /* synthetic */ androidx.navigation.ui.d e(e2 navGraph, androidx.customview.widget.c cVar, Function0 fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = a.f71325a;
        }
        Intrinsics.checkNotNullParameter(navGraph, "navGraph");
        Intrinsics.checkNotNullParameter(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new androidx.navigation.ui.d.a(navGraph).d(cVar).c(new d(fallbackOnNavigateUpListener)).a();
    }

    public static /* synthetic */ androidx.navigation.ui.d f(Set topLevelDestinationIds, androidx.customview.widget.c cVar, Function0 fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = c.f71327a;
        }
        Intrinsics.checkNotNullParameter(topLevelDestinationIds, "topLevelDestinationIds");
        Intrinsics.checkNotNullParameter(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new androidx.navigation.ui.d.a((Set<Integer>) topLevelDestinationIds).d(cVar).c(new d(fallbackOnNavigateUpListener)).a();
    }
}
