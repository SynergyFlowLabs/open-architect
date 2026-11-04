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
public final class SpaceInfoResponseJsonAdapter extends h<SpaceInfoResponse> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f230191d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m.b f230192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<String> f230193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h<SpaceInfo> f230194c;

    public SpaceInfoResponseJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("status", "data");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.f230192a = bVarA;
        h<String> hVarG = moshi.g(String.class, SetsKt.emptySet(), "status");
        Intrinsics.checkNotNullExpressionValue(hVarG, "adapter(...)");
        this.f230193b = hVarG;
        h<SpaceInfo> hVarG2 = moshi.g(SpaceInfo.class, SetsKt.emptySet(), "data");
        Intrinsics.checkNotNullExpressionValue(hVarG2, "adapter(...)");
        this.f230194c = hVarG2;
    }

    @Override // com.squareup.moshi.h
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public SpaceInfoResponse b(@NotNull m reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.m1();
        String strB = null;
        SpaceInfo spaceInfoB = null;
        while (reader.hasNext()) {
            int iM = reader.m(this.f230192a);
            if (iM == -1) {
                reader.t();
                reader.a9();
            } else if (iM == 0) {
                strB = this.f230193b.b(reader);
                if (strB == null) {
                    throw Util.B("status", "status", reader);
                }
            } else if (iM == 1) {
                spaceInfoB = this.f230194c.b(reader);
            }
        }
        reader.F1();
        if (strB != null) {
            return new SpaceInfoResponse(strB, spaceInfoB);
        }
        throw Util.s("status", "status", reader);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m(@NotNull t writer, @Nullable SpaceInfoResponse spaceInfoResponse) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (spaceInfoResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("status");
        this.f230193b.m(writer, spaceInfoResponse.b());
        writer.o("data");
        this.f230194c.m(writer, spaceInfoResponse.a());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SpaceInfoResponse");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
