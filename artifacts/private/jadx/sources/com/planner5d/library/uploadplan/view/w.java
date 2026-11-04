package com.planner5d.library.uploadplan.view;

import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.statistics.events.e4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class w extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e4 f231180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private e4.c f231181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c1<a> f231182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<a> f231183d;

    public enum a {
        Measurement;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f231186c = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f231186c;
        }
    }

    @ij.a
    public w(@NotNull e4 events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.f231180a = events;
        this.f231181b = e4.c.photo_gallery;
        int i10 = 5 >> 0;
        c1<a> c1Var = new c1<>(null);
        this.f231182c = c1Var;
        this.f231183d = c1Var;
    }

    @NotNull
    public final e4.c U() {
        return this.f231181b;
    }

    @NotNull
    public final androidx.lifecycle.w0<a> V() {
        return this.f231183d;
    }

    public final void W(@NotNull e4.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f231181b = cVar;
    }

    public final void X() {
        e4.b.a(this.f231180a, e4.a.start_scaling, this.f231181b, null, null, null, 28, null);
    }
}
