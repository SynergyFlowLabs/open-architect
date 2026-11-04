package com.planner5d.library.model.manager.performancetracing;

import com.devtodev.core.data.metrics.MetricConsts;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f193073a;

    public static final class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f193074b = new a();

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.performancetracing.c$a$a, reason: collision with other inner class name */
        public static final class C1605a extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C1605a f193075b = new C1605a();

            private C1605a() {
                super(a.f193074b, "load");
            }
        }

        private a() {
            super(MetricConsts.UserInfo);
        }
    }

    public c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f193073a = name;
    }

    @NotNull
    public final String a() {
        return this.f193073a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull c parent, @NotNull String name) {
        this(parent.f193073a + "." + name);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
