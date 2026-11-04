package com.planner5d.library.widget.editor.editaction;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f254752c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e[] f254753b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull e... editActions) {
        super(null);
        Intrinsics.checkNotNullParameter(editActions, "editActions");
        this.f254753b = editActions;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NotNull h provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        for (e eVar : this.f254753b) {
            eVar.a(provider);
        }
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void c(@NotNull h provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        boolean z10 = false;
        for (e eVar : this.f254753b) {
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                z10 |= bVar.f254737b;
                bVar.f254738c = true;
                bVar.f254739d = true;
            }
            eVar.c(provider);
        }
        if (z10 && provider.f254767e.D1()) {
            provider.f254769g.m().subscribe((Subscriber<? super com.planner5d.library.widget.editor.a.b>) new com.planner5d.library.services.rx.e());
        }
    }
}
