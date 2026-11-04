package com.planner5d.library.spaces.entity;

import androidx.compose.runtime.internal.w0;
import com.squareup.moshi.h;
import com.squareup.moshi.internal.Util;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class AddressSearchQueryJsonAdapter extends h<AddressSearchQuery> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f230140e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m.b f230141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<String> f230142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h<Double> f230143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private volatile Constructor<AddressSearchQuery> f230144d;

    public AddressSearchQueryJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("address", "latitude", "longitude");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.f230141a = bVarA;
        h<String> hVarG = moshi.g(String.class, SetsKt.emptySet(), "address");
        Intrinsics.checkNotNullExpressionValue(hVarG, "adapter(...)");
        this.f230142b = hVarG;
        h<Double> hVarG2 = moshi.g(Double.TYPE, SetsKt.emptySet(), "latitude");
        Intrinsics.checkNotNullExpressionValue(hVarG2, "adapter(...)");
        this.f230143c = hVarG2;
    }

    @Override // com.squareup.moshi.h
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AddressSearchQuery b(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Double dValueOf = Double.valueOf(0.0d);
        reader.m1();
        Double dB = dValueOf;
        String strB = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iM = reader.m(this.f230141a);
            if (iM == -1) {
                reader.t();
                reader.a9();
            } else if (iM == 0) {
                strB = this.f230142b.b(reader);
            } else if (iM == 1) {
                dValueOf = this.f230143c.b(reader);
                if (dValueOf == null) {
                    throw Util.B("latitude", "latitude", reader);
                }
                i10 &= -3;
            } else if (iM == 2) {
                dB = this.f230143c.b(reader);
                if (dB == null) {
                    throw Util.B("longitude", "longitude", reader);
                }
                i10 &= -5;
            } else {
                continue;
            }
        }
        reader.F1();
        if (i10 == -7) {
            return new AddressSearchQuery(strB, dValueOf.doubleValue(), dB.doubleValue());
        }
        Constructor<AddressSearchQuery> declaredConstructor = this.f230144d;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.f267160c;
            Class cls3 = Double.TYPE;
            declaredConstructor = AddressSearchQuery.class.getDeclaredConstructor(String.class, cls3, cls3, cls, cls2);
            this.f230144d = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        AddressSearchQuery addressSearchQueryNewInstance = declaredConstructor.newInstance(strB, dValueOf, dB, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(addressSearchQueryNewInstance, "newInstance(...)");
        return addressSearchQueryNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m(@NotNull t writer, @Nullable AddressSearchQuery addressSearchQuery) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (addressSearchQuery == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("address");
        this.f230142b.m(writer, addressSearchQuery.f());
        writer.o("latitude");
        this.f230143c.m(writer, Double.valueOf(addressSearchQuery.g()));
        writer.o("longitude");
        this.f230143c.m(writer, Double.valueOf(addressSearchQuery.h()));
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AddressSearchQuery");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
