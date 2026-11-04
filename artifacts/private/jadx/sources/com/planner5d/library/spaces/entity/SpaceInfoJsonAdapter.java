package com.planner5d.library.spaces.entity;

import androidx.compose.runtime.internal.w0;
import com.squareup.moshi.a0;
import com.squareup.moshi.h;
import com.squareup.moshi.internal.Util;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.io.IOException;
import java.util.List;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class SpaceInfoJsonAdapter extends h<SpaceInfo> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f230181g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m.b f230182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<SpaceAddress> f230183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h<List<String>> f230184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h<Integer> f230185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final h<Long> f230186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final h<String> f230187f;

    public SpaceInfoJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("address", "heating", "bedrooms", "livingAreaValue", "price", "yearBuilt", "idea");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.f230182a = bVarA;
        h<SpaceAddress> hVarG = moshi.g(SpaceAddress.class, SetsKt.emptySet(), "address");
        Intrinsics.checkNotNullExpressionValue(hVarG, "adapter(...)");
        this.f230183b = hVarG;
        h<List<String>> hVarG2 = moshi.g(a0.m(List.class, String.class), SetsKt.emptySet(), "heating");
        Intrinsics.checkNotNullExpressionValue(hVarG2, "adapter(...)");
        this.f230184c = hVarG2;
        h<Integer> hVarG3 = moshi.g(Integer.class, SetsKt.emptySet(), "bedrooms");
        Intrinsics.checkNotNullExpressionValue(hVarG3, "adapter(...)");
        this.f230185d = hVarG3;
        h<Long> hVarG4 = moshi.g(Long.class, SetsKt.emptySet(), "price");
        Intrinsics.checkNotNullExpressionValue(hVarG4, "adapter(...)");
        this.f230186e = hVarG4;
        h<String> hVarG5 = moshi.g(String.class, SetsKt.emptySet(), "idea");
        Intrinsics.checkNotNullExpressionValue(hVarG5, "adapter(...)");
        this.f230187f = hVarG5;
    }

    @Override // com.squareup.moshi.h
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public SpaceInfo b(@NotNull m reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.m1();
        SpaceAddress spaceAddressB = null;
        List<String> listB = null;
        Integer numB = null;
        Integer numB2 = null;
        Long lB = null;
        Integer numB3 = null;
        String strB = null;
        while (reader.hasNext()) {
            switch (reader.m(this.f230182a)) {
                case -1:
                    reader.t();
                    reader.a9();
                    break;
                case 0:
                    spaceAddressB = this.f230183b.b(reader);
                    if (spaceAddressB == null) {
                        throw Util.B("address", "address", reader);
                    }
                    break;
                    break;
                case 1:
                    listB = this.f230184c.b(reader);
                    break;
                case 2:
                    numB = this.f230185d.b(reader);
                    break;
                case 3:
                    numB2 = this.f230185d.b(reader);
                    break;
                case 4:
                    lB = this.f230186e.b(reader);
                    break;
                case 5:
                    numB3 = this.f230185d.b(reader);
                    break;
                case 6:
                    strB = this.f230187f.b(reader);
                    break;
            }
        }
        reader.F1();
        if (spaceAddressB != null) {
            return new SpaceInfo(spaceAddressB, listB, numB, numB2, lB, numB3, strB);
        }
        throw Util.s("address", "address", reader);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m(@NotNull t writer, @Nullable SpaceInfo spaceInfo) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (spaceInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("address");
        this.f230183b.m(writer, spaceInfo.a());
        writer.o("heating");
        this.f230184c.m(writer, spaceInfo.c());
        writer.o("bedrooms");
        this.f230185d.m(writer, spaceInfo.b());
        writer.o("livingAreaValue");
        this.f230185d.m(writer, spaceInfo.e());
        writer.o("price");
        this.f230186e.m(writer, spaceInfo.f());
        writer.o("yearBuilt");
        this.f230185d.m(writer, spaceInfo.g());
        writer.o("idea");
        this.f230187f.m(writer, spaceInfo.d());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SpaceInfo");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
