package com.planner5d.library.services;

import android.os.Bundle;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.services.utility.v1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b0 f223958a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final v1.a<a> f223959b = v1.l(v1.f229769a, null, 1, null);

    private b0() {
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final fd.k f223960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f223961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.manager.config.purchaseplacement.b.a f223962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final y3.c f223963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f223964e;

        private a(fd.k kVar, String str, com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, y3.c cVar, boolean z10) {
            this.f223960a = kVar;
            this.f223961b = str;
            this.f223962c = aVar;
            this.f223963d = cVar;
            this.f223964e = z10;
        }

        @Nullable
        public final String a() {
            return this.f223961b;
        }

        @NotNull
        public final com.planner5d.library.model.manager.config.purchaseplacement.b.a b() {
            return this.f223962c;
        }

        @NotNull
        public final y3.c c() {
            return this.f223963d;
        }

        @Nullable
        public final fd.k d() {
            return this.f223960a;
        }

        @NotNull
        public final Bundle e() {
            com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
            r rVar = r.type;
            fd.k kVar = this.f223960a;
            return iVar.j(rVar, kVar != null ? kVar.name() : null).j(r.productId, this.f223961b).m(r.saveToFile, this.f223964e).t(r.placementName, this.f223962c).t(r.source, this.f223963d).a();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull fd.k type, @Nullable String str, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placementName, @NotNull y3.c source) {
            this(type, str, placementName, source, false);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(source, "source");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull fd.k type, @Nullable String str, boolean z10, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placementName, @NotNull y3.c source) {
            this(type, str, placementName, source, z10);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(source, "source");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Bundle bundle) {
            this(new com.planner5d.library.services.utility.j(bundle));
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private a(com.planner5d.library.services.utility.j jVar) {
            fd.k kVarA = fd.k.f275178b.a(jVar.t(r.type, null));
            String strT = jVar.t(r.productId, null);
            Serializable serializableS = jVar.s(r.placementName, com.planner5d.library.model.manager.config.purchaseplacement.b.a.unknown);
            Intrinsics.checkNotNull(serializableS, "null cannot be cast to non-null type com.planner5d.library.model.manager.config.purchaseplacement.PurchasePlacement.Name");
            this(kVarA, strT, (com.planner5d.library.model.manager.config.purchaseplacement.b.a) serializableS, (y3.c) new com.planner5d.library.model.manager.statistics.c().a(jVar.e(), y3.c.profile), jVar.f(r.saveToFile, false));
        }
    }
}
