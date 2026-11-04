package com.planner5d.library.spaces.entity;

import androidx.compose.runtime.internal.w0;
import com.squareup.moshi.h;
import com.squareup.moshi.internal.Util;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import io.sentry.protocol.g;
import java.io.IOException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p.a;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class SpaceAddressJsonAdapter extends h<SpaceAddress> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f230170c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m.b f230171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<String> f230172b;

    public SpaceAddressJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a(g.b.f306260a, "state", a.f340577q, "zipcode");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.f230171a = bVarA;
        h<String> hVarG = moshi.g(String.class, SetsKt.emptySet(), g.b.f306260a);
        Intrinsics.checkNotNullExpressionValue(hVarG, "adapter(...)");
        this.f230172b = hVarG;
    }

    @Override // com.squareup.moshi.h
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public SpaceAddress b(@NotNull m reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.m1();
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        String strB4 = null;
        while (reader.hasNext()) {
            int iM = reader.m(this.f230171a);
            if (iM == -1) {
                reader.t();
                reader.a9();
            } else if (iM == 0) {
                strB = this.f230172b.b(reader);
                if (strB == null) {
                    throw Util.B(g.b.f306260a, g.b.f306260a, reader);
                }
            } else if (iM == 1) {
                strB2 = this.f230172b.b(reader);
                if (strB2 == null) {
                    throw Util.B("state", "state", reader);
                }
            } else if (iM == 2) {
                strB3 = this.f230172b.b(reader);
                if (strB3 == null) {
                    throw Util.B(a.f340577q, a.f340577q, reader);
                }
            } else if (iM == 3 && (strB4 = this.f230172b.b(reader)) == null) {
                throw Util.B("zipcode", "zipcode", reader);
            }
        }
        reader.F1();
        if (strB == null) {
            throw Util.s(g.b.f306260a, g.b.f306260a, reader);
        }
        if (strB2 == null) {
            throw Util.s("state", "state", reader);
        }
        if (strB3 == null) {
            throw Util.s(a.f340577q, a.f340577q, reader);
        }
        if (strB4 != null) {
            return new SpaceAddress(strB, strB2, strB3, strB4);
        }
        throw Util.s("zipcode", "zipcode", reader);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m(@NotNull t writer, @Nullable SpaceAddress spaceAddress) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (spaceAddress == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o(g.b.f306260a);
        this.f230172b.m(writer, spaceAddress.a());
        writer.o("state");
        this.f230172b.m(writer, spaceAddress.b());
        writer.o(a.f340577q);
        this.f230172b.m(writer, spaceAddress.c());
        writer.o("zipcode");
        this.f230172b.m(writer, spaceAddress.d());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SpaceAddress");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
