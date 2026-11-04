package com.planner5d.library.model.manager.statistics.events;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public enum f4 {
    ProjectLoad("project_loaded"),
    ProjectSwitchFrom2dTo3d("project_switched_from_2d_to_3d");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f216941a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f216940f = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f216936b = new a(null);

    @SourceDebugExtension({"SMAP\nStatisticsProcessName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsProcessName.kt\ncom/planner5d/library/model/manager/statistics/events/StatisticsProcessName$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n1#2:15\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @Nullable
        public final f4 a(@Nullable String str) {
            f4 next;
            Iterator<f4> it = f4.n().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.o(), str)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private a() {
        }
    }

    f4(String str) {
        this.f216941a = str;
    }

    @oj.n
    @Nullable
    public static final f4 l(@Nullable String str) {
        return f216936b.a(str);
    }

    @NotNull
    public static kotlin.enums.a<f4> n() {
        return f216940f;
    }

    @NotNull
    public final String o() {
        return this.f216941a;
    }
}
