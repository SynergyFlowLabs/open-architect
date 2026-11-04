package com.planner5d.library.services.jsonparser;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.l1;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nJsonReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonReader.kt\ncom/planner5d/library/services/jsonparser/JsonReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JsonReader f224356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f224357b;

    /* synthetic */ class a extends g0 implements Function1<JsonReader, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f224358a = new a();

        a() {
            super(1, JsonReader.class, "nextBoolean", "nextBoolean()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(JsonReader p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return Boolean.valueOf(p10.nextBoolean());
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.services.jsonparser.b$b, reason: collision with other inner class name */
    /* synthetic */ class C1673b extends g0 implements Function1<JsonReader, Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1673b f224359a = new C1673b();

        C1673b() {
            super(1, JsonReader.class, "nextDouble", "nextDouble()D", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Double invoke(JsonReader p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return Double.valueOf(p10.nextDouble());
        }
    }

    /* synthetic */ class c extends g0 implements Function1<JsonReader, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f224360a = new c();

        c() {
            super(1, JsonReader.class, "nextInt", "nextInt()I", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(JsonReader p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return Integer.valueOf(p10.nextInt());
        }
    }

    public /* synthetic */ class d extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f224361a = new d();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1, JsonReader.class, "beginArray", "beginArray()V", 0);
            int i10 = 6 >> 1;
        }

        public final void X(JsonReader p10) throws IOException {
            Intrinsics.checkNotNullParameter(p10, "p0");
            p10.beginArray();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonReader jsonReader) throws IOException {
            X(jsonReader);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ class e extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f224362a = new e();

        public e() {
            super(1, JsonReader.class, "skipValue", "skipValue()V", 0);
        }

        public final void X(JsonReader p10) throws IOException {
            Intrinsics.checkNotNullParameter(p10, "p0");
            p10.skipValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonReader jsonReader) throws IOException {
            X(jsonReader);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ class f extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f224363a = new f();

        public f() {
            super(1, JsonReader.class, "endArray", "endArray()V", 0);
        }

        public final void X(JsonReader p10) throws IOException {
            Intrinsics.checkNotNullParameter(p10, "p0");
            p10.endArray();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonReader jsonReader) throws IOException {
            X(jsonReader);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ class g extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f224364a = new g();

        public g() {
            super(1, JsonReader.class, "beginObject", "beginObject()V", 0);
        }

        public final void X(JsonReader p10) throws IOException {
            Intrinsics.checkNotNullParameter(p10, "p0");
            p10.beginObject();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonReader jsonReader) throws IOException {
            X(jsonReader);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ class h extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f224365a = new h();

        public h() {
            super(1, JsonReader.class, "skipValue", "skipValue()V", 0);
        }

        public final void X(JsonReader p10) throws IOException {
            Intrinsics.checkNotNullParameter(p10, "p0");
            p10.skipValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonReader jsonReader) throws IOException {
            X(jsonReader);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ class i extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f224366a = new i();

        public i() {
            super(1, JsonReader.class, "endObject", "endObject()V", 0);
        }

        public final void X(JsonReader p10) throws IOException {
            Intrinsics.checkNotNullParameter(p10, "p0");
            p10.endObject();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonReader jsonReader) throws IOException {
            X(jsonReader);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ class j extends g0 implements Function1<JsonReader, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f224367a = new j();

        public j() {
            super(1, JsonReader.class, "nextName", "nextName()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final String invoke(JsonReader p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return p10.nextName();
        }
    }

    /* synthetic */ class k extends g0 implements Function1<JsonReader, Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f224368a = new k();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k() {
            super(1, JsonReader.class, "nextLong", "nextLong()J", 0);
            int i10 = 4 & 1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Long invoke(JsonReader p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return Long.valueOf(p10.nextLong());
        }
    }

    /* synthetic */ class l extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f224369a = new l();

        l() {
            super(1, JsonReader.class, "nextNull", "nextNull()V", 0);
        }

        public final void X(JsonReader p10) throws IOException {
            Intrinsics.checkNotNullParameter(p10, "p0");
            p10.nextNull();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonReader jsonReader) throws IOException {
            X(jsonReader);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class m extends g0 implements Function1<JsonReader, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f224370a = new m();

        m() {
            super(1, JsonReader.class, "nextString", "nextString()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final String invoke(JsonReader p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return p10.nextString();
        }
    }

    public b(@NotNull JsonReader androidJsonReader) {
        Intrinsics.checkNotNullParameter(androidJsonReader, "androidJsonReader");
        this.f224356a = androidJsonReader;
    }

    @l1
    public static /* synthetic */ void k() {
    }

    private final boolean l(JsonToken jsonToken) throws IOException {
        return this.f224356a.peek() == jsonToken;
    }

    @l1
    public final <T> T a(@NotNull Function1<? super JsonReader, ? extends T> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        T tInvoke = operation.invoke(this.f224356a);
        this.f224357b++;
        return tInvoke;
    }

    public final boolean b() throws IllegalStateException, IOException {
        return ((Boolean) a(a.f224358a)).booleanValue();
    }

    public final double c() throws IllegalStateException, IOException {
        return ((Number) a(C1673b.f224359a)).doubleValue();
    }

    public final int d() throws IllegalStateException, IOException, NumberFormatException {
        return ((Number) a(c.f224360a)).intValue();
    }

    public final void e(@NotNull Function1<? super Integer, Unit> processor) throws IOException {
        Intrinsics.checkNotNullParameter(processor, "processor");
        a(d.f224361a);
        int i10 = 0;
        while (true) {
            long j10 = j();
            JsonToken jsonTokenS = s();
            if (jsonTokenS == JsonToken.BOOLEAN || jsonTokenS == JsonToken.NUMBER || jsonTokenS == JsonToken.STRING || jsonTokenS == JsonToken.NULL || jsonTokenS == JsonToken.BEGIN_OBJECT || jsonTokenS == JsonToken.BEGIN_ARRAY) {
                processor.invoke(Integer.valueOf(i10));
                i10++;
            } else if (jsonTokenS == JsonToken.END_ARRAY) {
                a(f.f224363a);
                return;
            }
            if (j() == j10) {
                a(e.f224362a);
            }
        }
    }

    public final void f(@NotNull Function1<? super String, Unit> processor) throws IOException {
        Intrinsics.checkNotNullParameter(processor, "processor");
        a(g.f224364a);
        while (s() != JsonToken.END_OBJECT) {
            String str = (String) a(j.f224367a);
            long j10 = j();
            JsonToken jsonTokenS = s();
            if (jsonTokenS == JsonToken.BOOLEAN || jsonTokenS == JsonToken.NUMBER || jsonTokenS == JsonToken.STRING || jsonTokenS == JsonToken.NULL || jsonTokenS == JsonToken.BEGIN_OBJECT || jsonTokenS == JsonToken.BEGIN_ARRAY) {
                Intrinsics.checkNotNull(str);
                processor.invoke(str);
            }
            if (j() == j10) {
                a(h.f224365a);
            }
        }
        a(i.f224366a);
    }

    public final long g() throws IllegalStateException, IOException, NumberFormatException {
        return ((Number) a(k.f224368a)).longValue();
    }

    public final void h() throws IllegalStateException, IOException {
        a(l.f224369a);
    }

    @NotNull
    public final String i() throws IllegalStateException, IOException {
        Object objA = a(m.f224370a);
        Intrinsics.checkNotNullExpressionValue(objA, "consume(...)");
        return (String) objA;
    }

    public final long j() {
        return this.f224357b;
    }

    public final boolean m() throws IOException {
        return l(JsonToken.BOOLEAN);
    }

    public final boolean n() throws IOException {
        return l(JsonToken.BEGIN_ARRAY);
    }

    public final boolean o() throws IOException {
        return l(JsonToken.BEGIN_OBJECT);
    }

    public final boolean p() throws IOException {
        return l(JsonToken.NULL);
    }

    public final boolean q() throws IOException {
        return l(JsonToken.NUMBER);
    }

    public final boolean r() throws IOException {
        return l(JsonToken.STRING);
    }

    @l1
    @NotNull
    public final JsonToken s() throws IOException {
        JsonToken jsonTokenPeek = this.f224356a.peek();
        Intrinsics.checkNotNullExpressionValue(jsonTokenPeek, "peek(...)");
        return jsonTokenPeek;
    }
}
