package com.planner5d.library.services.serialization;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import kotlin.enums.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p1;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nBasicTypesCheckedSerialization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTypesCheckedSerialization.kt\ncom/planner5d/library/services/serialization/BasicTypesCheckedSerialization\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f224952a = new a();

    /* JADX INFO: renamed from: com.planner5d.library.services.serialization.a$a, reason: collision with other inner class name */
    private enum EnumC1682a {
        BYTE((byte) 1),
        SHORT((byte) 2),
        INT((byte) 3),
        LONG((byte) 4),
        FLOAT((byte) 5),
        DOUBLE((byte) 6),
        BOOLEAN((byte) 7),
        CHAR((byte) 8),
        STRING((byte) 9);


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f224963l = c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte f224964a;

        EnumC1682a(byte b10) {
            this.f224964a = b10;
        }

        @NotNull
        public static kotlin.enums.a<EnumC1682a> n() {
            return f224963l;
        }

        public final byte l() {
            return this.f224964a;
        }
    }

    private a() {
    }

    private final ByteBuffer e(byte[] bArr, EnumC1682a enumC1682a) throws p1, BufferUnderflowException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (byteBufferWrap.get() != enumC1682a.l()) {
            throw new p1();
        }
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "apply(...)");
        return byteBufferWrap;
    }

    private final byte[] j(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public final boolean a(@NotNull byte[] source) throws p1, BufferUnderflowException {
        Intrinsics.checkNotNullParameter(source, "source");
        byte b10 = e(source, EnumC1682a.BOOLEAN).get();
        if (b10 == 0) {
            return false;
        }
        if (b10 == 1) {
            return true;
        }
        throw new p1();
    }

    public final int b(@NotNull byte[] source) throws p1, BufferUnderflowException {
        Intrinsics.checkNotNullParameter(source, "source");
        return e(source, EnumC1682a.INT).getInt();
    }

    public final long c(@NotNull byte[] source) throws p1, BufferUnderflowException {
        Intrinsics.checkNotNullParameter(source, "source");
        return e(source, EnumC1682a.LONG).getLong();
    }

    @NotNull
    public final String d(@NotNull byte[] source) throws p1, BufferUnderflowException {
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferE = e(source, EnumC1682a.STRING);
        byte[] bArr = new byte[byteBufferE.remaining()];
        byteBufferE.get(bArr);
        return new String(bArr, Charsets.UTF_8);
    }

    @NotNull
    public final byte[] f(int i10) {
        ByteBuffer byteBufferPutInt = ByteBuffer.allocate(5).put(EnumC1682a.INT.l()).putInt(i10);
        Intrinsics.checkNotNullExpressionValue(byteBufferPutInt, "putInt(...)");
        return j(byteBufferPutInt);
    }

    @NotNull
    public final byte[] g(long j10) {
        ByteBuffer byteBufferPutLong = ByteBuffer.allocate(9).put(EnumC1682a.LONG.l()).putLong(j10);
        Intrinsics.checkNotNullExpressionValue(byteBufferPutLong, "putLong(...)");
        return j(byteBufferPutLong);
    }

    @NotNull
    public final byte[] h(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] bytes = source.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        ByteBuffer byteBufferPut = ByteBuffer.allocate(bytes.length + 1).put(EnumC1682a.STRING.l()).put(bytes);
        Intrinsics.checkNotNullExpressionValue(byteBufferPut, "put(...)");
        return j(byteBufferPut);
    }

    @NotNull
    public final byte[] i(boolean z10) {
        ByteBuffer byteBufferPut = ByteBuffer.allocate(2).put(EnumC1682a.BOOLEAN.l()).put(z10 ? (byte) 1 : (byte) 0);
        Intrinsics.checkNotNullExpressionValue(byteBufferPut, "put(...)");
        return j(byteBufferPut);
    }
}
