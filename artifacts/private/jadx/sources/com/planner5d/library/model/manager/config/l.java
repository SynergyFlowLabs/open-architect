package com.planner5d.library.model.manager.config;

import com.planner5d.library.services.utility.k3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f181598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Class<? extends com.planner5d.library.model.manager.config.source.d> f181599b;

    public static final class a {
        @ij.a
        public a() {
        }

        private final k3 b(Boolean bool) {
            if (bool == null) {
                return new k3(com.planner5d.library.model.payments.a.f222474i);
            }
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                return new k3(com.planner5d.library.model.manager.config.source.k.q.f188937k7, new Object[0]);
            }
            if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                return new k3(com.planner5d.library.model.manager.config.source.k.q.f188718b6, new Object[0]);
            }
            throw new k0();
        }

        @NotNull
        public final k3 a(@NotNull l target) {
            String string;
            Intrinsics.checkNotNullParameter(target, "target");
            int i10 = com.planner5d.library.model.manager.config.source.k.q.Nr;
            k3 k3VarB = b(target.a().b());
            Integer numC = target.a().c();
            if (numC == null || (string = numC.toString()) == null) {
                string = com.planner5d.library.model.payments.a.f222474i;
            }
            return new k3(i10, k3VarB, string, target.b().getSimpleName());
        }
    }

    public l(@NotNull g featureConfig, @NotNull Class<? extends com.planner5d.library.model.manager.config.source.d> source) {
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f181598a = featureConfig;
        this.f181599b = source;
    }

    @NotNull
    public final g a() {
        return this.f181598a;
    }

    @NotNull
    public final Class<? extends com.planner5d.library.model.manager.config.source.d> b() {
        return this.f181599b;
    }
}
