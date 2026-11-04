package com.planner5d.library.legal.application;

import com.planner5d.library.model.manager.h2;
import com.planner5d.library.model.manager.p5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@fg.d(modules = {f.class, r.class})
@q
public abstract class e extends com.planner5d.library.view.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f180321b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f180322c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final e a() {
            e eVar = e.f180322c;
            if (eVar != null) {
                return eVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            return null;
        }

        public final void c(@NotNull e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "<set-?>");
            e.f180322c = eVar;
        }

        private a() {
        }
    }

    @fg.d.b
    public interface b {
        @NotNull
        e a(@NotNull f fVar);
    }

    @NotNull
    public static final e g() {
        return f180321b.a();
    }

    public static final void k(@NotNull e eVar) {
        f180321b.c(eVar);
    }

    @NotNull
    public abstract com.planner5d.library.model.manager.h f();

    @NotNull
    public abstract h2 h();

    @NotNull
    public abstract com.planner5d.library.legal.model.manager.a i();

    @NotNull
    public abstract p5 j();
}
