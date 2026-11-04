package com.planner5d.library.spaces.entity;

import androidx.compose.runtime.internal.w0;
import com.squareup.moshi.h;
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
public final class ProjectInfoJsonAdapter extends h<ProjectInfo> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f230155c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m.b f230156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<String> f230157b;

    public ProjectInfoJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("background_image");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.f230156a = bVarA;
        h<String> hVarG = moshi.g(String.class, SetsKt.emptySet(), "backgroundImage");
        Intrinsics.checkNotNullExpressionValue(hVarG, "adapter(...)");
        this.f230157b = hVarG;
    }

    @Override // com.squareup.moshi.h
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ProjectInfo b(@NotNull m reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.m1();
        String strB = null;
        while (reader.hasNext()) {
            int iM = reader.m(this.f230156a);
            if (iM == -1) {
                reader.t();
                reader.a9();
            } else if (iM == 0) {
                strB = this.f230157b.b(reader);
            }
        }
        reader.F1();
        return new ProjectInfo(strB);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m(@NotNull t writer, @Nullable ProjectInfo projectInfo) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (projectInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("background_image");
        this.f230157b.m(writer, projectInfo.a());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ProjectInfo");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
