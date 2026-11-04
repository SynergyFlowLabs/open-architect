package com.planner5d.library.application;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nApplicationConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicationConfiguration.kt\ncom/planner5d/library/application/ApplicationConfiguration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1863#2,2:80\n*S KotlinDebug\n*F\n+ 1 ApplicationConfiguration.kt\ncom/planner5d/library/application/ApplicationConfiguration\n*L\n63#1:80,2\n*E\n"})
public abstract class d implements com.planner5d.library.model.manager.q2, com.planner5d.library.model.manager.x2, com.planner5d.library.model.manager.v2, zc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f142484g = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f142485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f142486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f142487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<com.planner5d.library.model.manager.config.f, com.planner5d.library.model.manager.config.g> f142488f;

    public d(@NotNull b application, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f142485c = application;
        this.f142486d = i10;
        this.f142487e = str;
        EnumMap enumMap = new EnumMap(com.planner5d.library.model.manager.config.f.class);
        this.f142488f = enumMap;
        n();
        o();
        p(enumMap);
    }

    private final void n() {
        Iterator<com.planner5d.library.model.manager.config.f> it = com.planner5d.library.model.manager.config.f.l().iterator();
        while (it.hasNext()) {
            this.f142488f.put(it.next(), new com.planner5d.library.model.manager.config.g(false));
        }
    }

    private final void o() {
        String string = this.f142485c.getResources().getString(com.planner5d.library.f.s.f169132gd);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (string.length() > 0) {
            this.f142488f.put(com.planner5d.library.model.manager.config.f.AuthenticationSocialGoogle, new com.planner5d.library.model.manager.config.g(true));
        }
        if (this.f142485c.getResources().getBoolean(com.planner5d.library.f.e.f166218e)) {
            this.f142488f.put(com.planner5d.library.model.manager.config.f.Gallery, new com.planner5d.library.model.manager.config.g(true));
        }
        this.f142488f.put(com.planner5d.library.model.manager.config.f.LogsFirebase, new com.planner5d.library.model.manager.config.g(true));
        this.f142488f.put(com.planner5d.library.model.manager.config.f.LogsApi, new com.planner5d.library.model.manager.config.g(true));
    }

    @Override // com.planner5d.library.model.manager.v2
    @Nullable
    public String c() {
        return this.f142487e;
    }

    public boolean e() {
        return true;
    }

    public abstract boolean f();

    public boolean g() {
        return h();
    }

    public boolean h() {
        return true;
    }

    public abstract boolean i();

    public abstract boolean j();

    public final int k() {
        return this.f142486d;
    }

    @Nullable
    public final com.planner5d.library.model.manager.config.g l(@NotNull com.planner5d.library.model.manager.config.f feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return this.f142488f.get(feature);
    }

    @Nullable
    public Long m() {
        return null;
    }

    protected abstract void p(@NotNull Map<com.planner5d.library.model.manager.config.f, com.planner5d.library.model.manager.config.g> map);

    public boolean q() {
        return false;
    }

    public boolean r() {
        return true;
    }

    public boolean s() {
        return true;
    }

    public abstract boolean t();
}
