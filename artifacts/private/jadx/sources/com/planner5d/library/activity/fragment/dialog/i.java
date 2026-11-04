package com.planner5d.library.activity.fragment.dialog;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f132070d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c<Integer> f132071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f132072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f132073c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c<Integer> f132074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final c<Boolean> f132075b;

        public a(@NotNull c<Integer> colors, @NotNull c<Boolean> lightModes) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            Intrinsics.checkNotNullParameter(lightModes, "lightModes");
            this.f132074a = colors;
            this.f132075b = lightModes;
        }

        @NotNull
        public final c<Integer> a() {
            return this.f132074a;
        }

        @NotNull
        public final c<Boolean> b() {
            return this.f132075b;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final i a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int color = context.getColor(com.planner5d.library.view.d.e.f245616cm);
            a aVar = new a(new c(Integer.valueOf(color), Integer.valueOf(color)), new c(Boolean.TRUE, Boolean.FALSE));
            return new i(new c(Integer.MIN_VALUE, 2), aVar, aVar);
        }

        private b() {
        }
    }

    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f132076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f132077b;

        public c(T t10, T t11) {
            this.f132076a = t10;
            this.f132077b = t11;
        }

        public final T a() {
            return this.f132077b;
        }

        public final T b() {
            return this.f132076a;
        }
    }

    public i(@NotNull c<Integer> flags, @NotNull a statusBarOptions, @NotNull a navBarOptions) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(statusBarOptions, "statusBarOptions");
        Intrinsics.checkNotNullParameter(navBarOptions, "navBarOptions");
        this.f132071a = flags;
        this.f132072b = statusBarOptions;
        this.f132073c = navBarOptions;
    }

    @NotNull
    public final c<Integer> a() {
        return this.f132071a;
    }

    @NotNull
    public final a b() {
        return this.f132073c;
    }

    @NotNull
    public final a c() {
        return this.f132072b;
    }
}
