package com.planner5d.library.spaces.entity;

import androidx.compose.runtime.internal.w0;
import com.squareup.moshi.h;
import com.squareup.moshi.internal.Util;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import io.sentry.protocol.k;
import java.io.IOException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class AddressSearchResultJsonAdapter extends h<AddressSearchResult> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f230149d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m.b f230150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<String> f230151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h<String> f230152c;

    public AddressSearchResultJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a(k.b.f306365a, "mainText", "secondaryText");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.f230150a = bVarA;
        h<String> hVarG = moshi.g(String.class, SetsKt.emptySet(), k.b.f306365a);
        Intrinsics.checkNotNullExpressionValue(hVarG, "adapter(...)");
        this.f230151b = hVarG;
        h<String> hVarG2 = moshi.g(String.class, SetsKt.emptySet(), "mainText");
        Intrinsics.checkNotNullExpressionValue(hVarG2, "adapter(...)");
        this.f230152c = hVarG2;
    }

    @Override // com.squareup.moshi.h
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AddressSearchResult b(@NotNull m reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.m1();
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        while (reader.hasNext()) {
            int iM = reader.m(this.f230150a);
            if (iM == -1) {
                reader.t();
                reader.a9();
            } else if (iM == 0) {
                strB = this.f230151b.b(reader);
                if (strB == null) {
                    throw Util.B(k.b.f306365a, k.b.f306365a, reader);
                }
            } else if (iM == 1) {
                strB2 = this.f230152c.b(reader);
            } else if (iM == 2) {
                strB3 = this.f230152c.b(reader);
            }
        }
        reader.F1();
        if (strB != null) {
            return new AddressSearchResult(strB, strB2, strB3);
        }
        throw Util.s(k.b.f306365a, k.b.f306365a, reader);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m(@NotNull t writer, @Nullable AddressSearchResult addressSearchResult) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (addressSearchResult == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o(k.b.f306365a);
        this.f230151b.m(writer, addressSearchResult.f());
        writer.o("mainText");
        this.f230152c.m(writer, addressSearchResult.g());
        writer.o("secondaryText");
        this.f230152c.m(writer, addressSearchResult.h());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AddressSearchResult");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
