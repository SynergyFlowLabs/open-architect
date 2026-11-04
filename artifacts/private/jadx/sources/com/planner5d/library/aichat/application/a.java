package com.planner5d.library.aichat.application;

import com.planner5d.library.aichat.view.fragment.ChatFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@r
@fg.d(modules = {com.planner5d.library.aichat.application.b.class, s.class})
public abstract class a extends com.planner5d.library.view.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C1505a f141896b = new C1505a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f141897c;

    /* JADX INFO: renamed from: com.planner5d.library.aichat.application.a$a, reason: collision with other inner class name */
    public static final class C1505a {
        public /* synthetic */ C1505a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a() {
            a aVar = a.f141897c;
            if (aVar != null) {
                return aVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
            return null;
        }

        public final void b(@NotNull a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            a.f141897c = aVar;
        }

        private C1505a() {
        }
    }

    @fg.d.b
    public interface b {
        @NotNull
        a a(@NotNull com.planner5d.library.aichat.application.b bVar);
    }

    @NotNull
    public abstract ya.a f();

    @NotNull
    public abstract va.b g();

    @NotNull
    public abstract ya.b h();

    @NotNull
    public abstract va.c i();

    public abstract void j(@NotNull com.planner5d.library.aichat.view.bottomsheet.q qVar);

    public abstract void k(@NotNull ChatFragment chatFragment);
}
