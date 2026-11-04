package com.planner5d.library.userimporteddata;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public enum d {
    DAE("dae"),
    JSON_2D("2d_json"),
    JSON_3D("3d_json"),
    P3D("p3d");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f231266a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f231265h = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f231259b = new a(null);

    @SourceDebugExtension({"SMAP\nModelFileFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelFileFormat.kt\ncom/planner5d/library/userimporteddata/ModelFileFormat$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final d a(@NotNull String code) {
            d next;
            Intrinsics.checkNotNullParameter(code, "code");
            Iterator<d> it = d.n().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.l(), code)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private a() {
        }
    }

    d(String str) {
        this.f231266a = str;
    }

    @NotNull
    public static kotlin.enums.a<d> n() {
        return f231265h;
    }

    @NotNull
    public final String l() {
        return this.f231266a;
    }
}
