package com.planner5d.library.widget.editor.helper;

import android.os.Bundle;
import com.planner5d.library.database.model.project.Project;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class s3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f256737f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f256738g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Long f256739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f256740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f256741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Long f256742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Long f256743e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final s3 a(@NotNull Bundle arguments) {
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(arguments);
            String strT = jVar.t(com.planner5d.library.services.r.projectUri, null);
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.projectId;
            Long lValueOf = jVar.a(rVar) ? Long.valueOf(jVar.d(rVar, 0L)) : null;
            if (strT != null && strT.length() != 0) {
                return new s3(strT);
            }
            String strT2 = jVar.t(com.planner5d.library.services.r.id, null);
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.projectRevisionId;
            return new s3(strT2, (String) null, lValueOf, jVar.a(rVar2) ? Long.valueOf(jVar.d(rVar2, 0L)) : null);
        }

        private a() {
        }
    }

    public s3(@NotNull String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f256739a = null;
        this.f256740b = null;
        this.f256742d = null;
        this.f256743e = null;
        this.f256741c = uri;
    }

    @oj.n
    @NotNull
    public static final s3 a(@NotNull Bundle bundle) {
        return f256737f.a(bundle);
    }

    @Nullable
    public final Long b() {
        return this.f256739a;
    }

    @Nullable
    public final Long c() {
        return this.f256742d;
    }

    @Nullable
    public final Long d() {
        return this.f256743e;
    }

    @Nullable
    public final String e() {
        return this.f256740b;
    }

    @Nullable
    public final String f() {
        return this.f256741c;
    }

    public s3(@Nullable String str, @Nullable String str2, @Nullable Long l10, @Nullable Long l11) {
        Long lValueOf;
        if (str == null || str.length() <= 0) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                lValueOf = null;
            }
        }
        this.f256739a = lValueOf;
        this.f256740b = str2;
        this.f256742d = l10;
        this.f256743e = l11;
        this.f256741c = null;
    }

    public s3(@Nullable Long l10, @Nullable String str, @Nullable Long l11, @Nullable Long l12) {
        this.f256739a = l10;
        this.f256740b = str;
        this.f256742d = l11;
        this.f256743e = l12;
        this.f256741c = null;
    }

    public s3(@Nullable Project project) {
        this(project != null ? project.getId() : null, project != null ? project.uid : null, project != null ? project.projectId : null, (Long) null);
    }
}
