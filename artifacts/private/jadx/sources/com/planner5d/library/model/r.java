package com.planner5d.library.model;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.compose.runtime.internal.w0;
import com.google.firebase.remoteconfig.d0;
import com.planner5d.library.services.utility.p0;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMaterialInfoParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialInfoParser.kt\ncom/planner5d/library/model/MaterialInfoParser\n+ 2 JsonReader.kt\ncom/planner5d/library/services/jsonparser/JsonReader\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n52#2,17:69\n52#2,17:86\n52#2,10:103\n52#2,10:113\n52#2,17:123\n63#2,6:140\n63#2,6:147\n1#3:146\n*S KotlinDebug\n*F\n+ 1 MaterialInfoParser.kt\ncom/planner5d/library/model/MaterialInfoParser\n*L\n16#1:69,17\n29#1:86,17\n41#1:103,10\n45#1:113,10\n49#1:123,17\n45#1:140,6\n41#1:147,6\n*E\n"})
public final class r extends com.planner5d.library.services.jsonparser.a<Map<String, ? extends com.planner5d.library.model.p>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f222752b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f222753a;

    public /* synthetic */ class a extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f222754a = new a();

        public a() {
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

    public /* synthetic */ class b extends g0 implements Function1<JsonReader, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f222755a = new b();

        public b() {
            super(1, JsonReader.class, "nextName", "nextName()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final String invoke(JsonReader p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return p10.nextName();
        }
    }

    public /* synthetic */ class c extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f222756a = new c();

        public c() {
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

    public /* synthetic */ class d extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f222757a = new d();

        public d() {
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

    public /* synthetic */ class e extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f222758a = new e();

        public e() {
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

    public /* synthetic */ class f extends g0 implements Function1<JsonReader, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f222759a = new f();

        public f() {
            super(1, JsonReader.class, "nextName", "nextName()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final String invoke(JsonReader p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return p10.nextName();
        }
    }

    public /* synthetic */ class g extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f222760a = new g();

        public g() {
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

    public /* synthetic */ class h extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f222761a = new h();

        public h() {
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

    public /* synthetic */ class i extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f222762a = new i();

        public i() {
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

    public /* synthetic */ class j extends g0 implements Function1<JsonReader, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f222763a = new j();

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

    public /* synthetic */ class k extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f222764a = new k();

        public k() {
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

    public /* synthetic */ class l extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f222765a = new l();

        public l() {
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

    public /* synthetic */ class m extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f222766a = new m();

        public m() {
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

    public /* synthetic */ class n extends g0 implements Function1<JsonReader, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f222767a = new n();

        public n() {
            super(1, JsonReader.class, "nextName", "nextName()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final String invoke(JsonReader p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return p10.nextName();
        }
    }

    public /* synthetic */ class o extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f222768a = new o();

        public o() {
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

    public /* synthetic */ class p extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f222769a = new p();

        public p() {
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

    public /* synthetic */ class q extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f222770a = new q();

        public q() {
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

    /* JADX INFO: renamed from: com.planner5d.library.model.r$r, reason: collision with other inner class name */
    public /* synthetic */ class C1639r extends g0 implements Function1<JsonReader, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1639r f222771a = new C1639r();

        public C1639r() {
            super(1, JsonReader.class, "nextName", "nextName()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final String invoke(JsonReader p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return p10.nextName();
        }
    }

    public /* synthetic */ class s extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f222772a = new s();

        public s() {
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

    public /* synthetic */ class t extends g0 implements Function1<JsonReader, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f222773a = new t();

        public t() {
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

    @ij.a
    public r(@NotNull p0 formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.f222753a = formatter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int g(com.planner5d.library.services.jsonparser.b bVar) throws IllegalStateException, IOException {
        bVar.a(e.f222758a);
        String strI = null;
        while (bVar.s() != JsonToken.END_OBJECT) {
            String str = (String) bVar.a(f.f222759a);
            long j10 = bVar.j();
            JsonToken jsonTokenS = bVar.s();
            if (jsonTokenS == JsonToken.BOOLEAN || jsonTokenS == JsonToken.NUMBER || jsonTokenS == JsonToken.STRING || jsonTokenS == JsonToken.NULL || jsonTokenS == JsonToken.BEGIN_OBJECT || jsonTokenS == JsonToken.BEGIN_ARRAY) {
                Intrinsics.checkNotNull(str);
                if (Intrinsics.areEqual(str, "color")) {
                    strI = bVar.i();
                }
            }
            if (bVar.j() == j10) {
                bVar.a(g.f222760a);
            }
        }
        bVar.a(h.f222761a);
        if (strI != null) {
            return this.f222753a.c(strI, 1.0d);
        }
        throw new IOException("No default color is present, aborting parsing");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(com.planner5d.library.services.jsonparser.b bVar, Map<String, com.planner5d.library.model.p> map, int i10) throws IllegalStateException, IOException {
        bVar.a(i.f222762a);
        while (bVar.s() != JsonToken.END_OBJECT) {
            String str = (String) bVar.a(j.f222763a);
            long j10 = bVar.j();
            JsonToken jsonTokenS = bVar.s();
            if (jsonTokenS == JsonToken.BOOLEAN || jsonTokenS == JsonToken.NUMBER || jsonTokenS == JsonToken.STRING || jsonTokenS == JsonToken.NULL || jsonTokenS == JsonToken.BEGIN_OBJECT || jsonTokenS == JsonToken.BEGIN_ARRAY) {
                Intrinsics.checkNotNull(str);
                bVar.a(m.f222766a);
                String strI = null;
                String strI2 = null;
                String strI3 = null;
                while (bVar.s() != JsonToken.END_OBJECT) {
                    String str2 = (String) bVar.a(n.f222767a);
                    long j11 = bVar.j();
                    JsonToken jsonTokenS2 = bVar.s();
                    if (jsonTokenS2 == JsonToken.BOOLEAN || jsonTokenS2 == JsonToken.NUMBER || jsonTokenS2 == JsonToken.STRING || jsonTokenS2 == JsonToken.NULL || jsonTokenS2 == JsonToken.BEGIN_OBJECT || jsonTokenS2 == JsonToken.BEGIN_ARRAY) {
                        Intrinsics.checkNotNull(str2);
                        if (Intrinsics.areEqual(str2, "color")) {
                            strI = bVar.i();
                        } else if (Intrinsics.areEqual(str2, "diffuse")) {
                            bVar.a(q.f222770a);
                            while (bVar.s() != JsonToken.END_OBJECT) {
                                String str3 = (String) bVar.a(C1639r.f222771a);
                                long j12 = bVar.j();
                                JsonToken jsonTokenS3 = bVar.s();
                                if (jsonTokenS3 == JsonToken.BOOLEAN || jsonTokenS3 == JsonToken.NUMBER || jsonTokenS3 == JsonToken.STRING || jsonTokenS3 == JsonToken.NULL || jsonTokenS3 == JsonToken.BEGIN_OBJECT || jsonTokenS3 == JsonToken.BEGIN_ARRAY) {
                                    Intrinsics.checkNotNull(str3);
                                    if (Intrinsics.areEqual(str3, "color")) {
                                        strI3 = bVar.i();
                                    } else if (Intrinsics.areEqual(str3, "image")) {
                                        strI2 = bVar.i();
                                    }
                                }
                                if (bVar.j() == j12) {
                                    bVar.a(s.f222772a);
                                }
                            }
                            bVar.a(t.f222773a);
                        }
                    }
                    if (bVar.j() == j11) {
                        bVar.a(o.f222768a);
                    }
                }
                bVar.a(p.f222769a);
                int iC = strI != null ? this.f222753a.c(strI, 1.0d) : i10;
                if (strI2 == null) {
                    throw new IOException("No diffuse image is present for " + str);
                }
                map.put(str, new com.planner5d.library.model.p(str, iC, strI2, strI3 != null ? this.f222753a.c(strI3, 1.0d) : i10));
            }
            if (bVar.j() == j10) {
                bVar.a(k.f222764a);
            }
        }
        bVar.a(l.f222765a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.services.jsonparser.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map<String, com.planner5d.library.model.p> a(@NotNull com.planner5d.library.services.jsonparser.b bVar) throws IllegalStateException, IOException, NumberFormatException {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bVar.a(a.f222754a);
        Integer numValueOf = null;
        int i10 = 6 ^ 0;
        while (bVar.s() != JsonToken.END_OBJECT) {
            String str = (String) bVar.a(b.f222755a);
            long j10 = bVar.j();
            JsonToken jsonTokenS = bVar.s();
            if (jsonTokenS == JsonToken.BOOLEAN || jsonTokenS == JsonToken.NUMBER || jsonTokenS == JsonToken.STRING || jsonTokenS == JsonToken.NULL || jsonTokenS == JsonToken.BEGIN_OBJECT || jsonTokenS == JsonToken.BEGIN_ARRAY) {
                Intrinsics.checkNotNull(str);
                if (Intrinsics.areEqual(str, d0.f124429l)) {
                    numValueOf = Integer.valueOf(g(bVar));
                } else if (Intrinsics.areEqual(str, "materials")) {
                    if (numValueOf == null) {
                        throw new IOException("No default color is present");
                    }
                    h(bVar, linkedHashMap, numValueOf.intValue());
                }
            }
            if (bVar.j() == j10) {
                bVar.a(c.f222756a);
            }
        }
        bVar.a(d.f222757a);
        return linkedHashMap;
    }
}
