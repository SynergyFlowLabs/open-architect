package com.planner5d.library.dgenerator.data;

import com.planner5d.library.dgenerator.application.q;
import com.planner5d.library.model.manager.x1;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@q
public final class a implements x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList<Long> f160098c = new ArrayList<>();

    @ij.a
    public a() {
    }

    public final boolean a(long j10) {
        return this.f160098c.contains(Long.valueOf(j10));
    }

    public final boolean b(long j10) {
        return this.f160098c.remove(Long.valueOf(j10));
    }

    public final boolean c(long j10) {
        return this.f160098c.add(Long.valueOf(j10));
    }
}
