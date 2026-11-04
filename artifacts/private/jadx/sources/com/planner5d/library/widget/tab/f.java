package com.planner5d.library.widget.tab;

import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import com.planner5d.library.model.manager.statistics.events.r3;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f258800c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<a> f258801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f258802b;

    public f(@NotNull List<a> tabs, int i10) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f258801a = tabs;
        this.f258802b = i10;
    }

    public final int a() {
        return this.f258802b;
    }

    @NotNull
    public final List<a> b() {
        return this.f258801a;
    }

    @w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f258803e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final r3.d f258804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f258805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Function0<Fragment> f258806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final Function0<Unit> f258807d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull r3.d tabId, @f1 int i10, @NotNull Function0<? extends Fragment> fragmentFactory, @Nullable Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(tabId, "tabId");
            Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
            this.f258804a = tabId;
            this.f258805b = i10;
            this.f258806c = fragmentFactory;
            this.f258807d = function0;
        }

        @NotNull
        public final Function0<Fragment> a() {
            return this.f258806c;
        }

        @Nullable
        public final Function0<Unit> b() {
            return this.f258807d;
        }

        @NotNull
        public final r3.d c() {
            return this.f258804a;
        }

        public final int d() {
            return this.f258805b;
        }

        public /* synthetic */ a(r3.d dVar, int i10, Function0 function0, Function0 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, i10, function0, (i11 & 8) != 0 ? null : function1);
        }
    }
}
