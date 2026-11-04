package com.planner5d.library.widget.editor.helper;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class f implements xa.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f256287c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n1 f256288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f256289b;

    public f(@NotNull n1 helperEditorAiChat) {
        Intrinsics.checkNotNullParameter(helperEditorAiChat, "helperEditorAiChat");
        this.f256288a = helperEditorAiChat;
    }

    @Override // xa.a
    public void a() {
        this.f256288a.j();
        this.f256288a.k();
    }

    @Override // xa.a
    public void b() {
        this.f256288a.g();
        Function0<Unit> function0 = this.f256289b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // xa.a
    public void c(@NotNull Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f256289b = function;
    }
}
