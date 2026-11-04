package com.planner5d.library.spaces.entity;

import androidx.compose.runtime.internal.w0;
import com.squareup.moshi.h;
import com.squareup.moshi.internal.Util;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.io.IOException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class ProjectInfoResponseJsonAdapter extends h<ProjectInfoResponse> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f230161d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m.b f230162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<String> f230163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h<ProjectInfo> f230164c;

    public ProjectInfoResponseJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("status", "data");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.f230162a = bVarA;
        h<String> hVarG = moshi.g(String.class, SetsKt.emptySet(), "status");
        Intrinsics.checkNotNullExpressionValue(hVarG, "adapter(...)");
        this.f230163b = hVarG;
        h<ProjectInfo> hVarG2 = moshi.g(ProjectInfo.class, SetsKt.emptySet(), "data");
        Intrinsics.checkNotNullExpressionValue(hVarG2, "adapter(...)");
        this.f230164c = hVarG2;
    }

    @Override // com.squareup.moshi.h
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ProjectInfoResponse b(@NotNull m reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.m1();
        String strB = null;
        ProjectInfo projectInfoB = null;
        while (reader.hasNext()) {
            int iM = reader.m(this.f230162a);
            if (iM == -1) {
                reader.t();
                reader.a9();
            } else if (iM == 0) {
                strB = this.f230163b.b(reader);
                if (strB == null) {
                    throw Util.B("status", "status", reader);
                }
            } else if (iM == 1) {
                projectInfoB = this.f230164c.b(reader);
            }
        }
        reader.F1();
        if (strB != null) {
            return new ProjectInfoResponse(strB, projectInfoB);
        }
        throw Util.s("status", "status", reader);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m(@NotNull t writer, @Nullable ProjectInfoResponse projectInfoResponse) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (projectInfoResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("status");
        this.f230163b.m(writer, projectInfoResponse.b());
        writer.o("data");
        this.f230164c.m(writer, projectInfoResponse.a());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ProjectInfoResponse");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
